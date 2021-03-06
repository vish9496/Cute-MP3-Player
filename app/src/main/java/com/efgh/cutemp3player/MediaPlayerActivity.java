package com.efgh.cutemp3player;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.TimeUtils;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.media.audiofx.Visualizer;

import android.os.Handler;
import android.widget.TextView;

import java.io.File;
import java.util.concurrent.TimeUnit;


public class MediaPlayerActivity extends AppCompatActivity {


    private String lastPressed = "";

    private Handler myHandler = new Handler();

    private SeekBar seekBar;


    private VisualizerView mVisualizerView;
    private Visualizer mVisualizer;

    private double finalTime = 0;
    private double currentTime = 0;

    private int oneTimeOnly = 0;

    private ImageButton playPauseButton;
    private TextView durationTextView;
    private ImageView albumArtImageView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);


        durationTextView = (TextView)findViewById(R.id.durationText);
        playPauseButton = (ImageButton)findViewById(R.id.playButton);

        mVisualizerView = (VisualizerView)findViewById(R.id.myvisualizerview);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        playPauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playButton(v);
            }
        });




        seekBar.setClickable(true);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {

                try {
                    currentTime = progress;

                    long currTime = TimeUnit.MILLISECONDS.toSeconds((int) currentTime);
                    long duration = TimeUnit.MILLISECONDS.toSeconds(GlobalVariables.mPlayer.getDuration());

                    if (currTime == duration) {
                        playPauseButton.setImageResource(R.drawable.play);

                        GlobalVariables.mPlayer.seekTo(0);//TODO: here is the place you will be modifying for repeat-once/always
                        GlobalVariables.mPlayer.pause();

                    }
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                }

                //   Log.i("Log", "progress:" + progress + ",currentTime:" + currentTime);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


                try {
                    if (GlobalVariables.mPlayer.isPlaying()) {
                        //  mPlayer.pause();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


                try {
                    GlobalVariables.mPlayer.seekTo((int) currentTime);
                    //     mPlayer.start();
                    Log.d("Log", "currentTime:" + currentTime);
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                }
            }

        });


        initAudio();




    }

    private void initAudio()
    {


        try {
            Bundle extras = getIntent().getExtras();
            Log.i("logtest","from inside mediaplayeractivity, value of extras:"+extras);
            String mp3Path = extras.getString("SongPath");

            if(GlobalVariables.mPlayer!=null)
            {
                if(GlobalVariables.mPlayer.isPlaying())
                {
                    GlobalVariables.mPlayer.stop();

                }
                GlobalVariables.mPlayer = null;
            }

            GlobalVariables.mPlayer = MediaPlayer.create(getApplicationContext(),Uri.parse(mp3Path));
            GlobalVariables.mPlayer.start();


            MetaData metaData = new MetaData();
            Log.i("log", "metaData:" + metaData);
            /*Bitmap albumArt = metaData.getAlbumArtBitmap();
            albumArtImageView = (ImageView)findViewById(R.id.albumArtImageView);
            if(albumArt == null)
            {
                Log.i("log", "albumart is null, setting default albumart:" + metaData);

                albumArtImageView.setImageResource(R.drawable.cover);

            }
            else
            {
                Log.i("log", "albumart exists, setting associated albumart:" + metaData);
                albumArtImageView.setImageBitmap(metaData.getAlbumArtBitmap());
                //holder.albumArtImageView.setImageBitmap(metaData.getAlbumArtBitmap());
            }*/

            playPauseButton.setImageResource(R.drawable.pause);//since song is playing show pause button image
            myHandler.postDelayed(UpdateSongTime, 100);// use a Runnable Thread instance to run code every 100ms


            GlobalVariables.mPlayer
                    .setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            mVisualizer.setEnabled(false);
                        }
                    });
            finalTime = GlobalVariables.mPlayer.getDuration();

            seekBar.setMax((int) finalTime);


            setVolumeControlStream(AudioManager.STREAM_MUSIC);


            setupVisualizerFxAndUI();
            // Make sure the visualizer is enabled only when you actually want to
            // receive data, and
            // when it makes sense to receive data.

            mVisualizer.setEnabled(true);


            // When the stream ends, we don't need to collect any more data. We
            // don't do this in
            // setupVisualizerFxAndUI because we likely want to have more,
            // non-Visualizer related code
            // in this callback.
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }


    }

    private void setupVisualizerFxAndUI()
    {

        // Create the Visualizer object and attach it to our media player.
        try
        {
            mVisualizer = new Visualizer(GlobalVariables.mPlayer.getAudioSessionId());
            mVisualizer.setCaptureSize(Visualizer.getCaptureSizeRange()[1]);
            mVisualizer.setDataCaptureListener(
                    new Visualizer.OnDataCaptureListener() {
                        public void onWaveFormDataCapture(Visualizer visualizer,
                                                          byte[] bytes, int samplingRate) {
                            mVisualizerView.updateVisualizer(bytes);
                        }

                        public void onFftDataCapture(Visualizer visualizer,
                                                     byte[] bytes, int samplingRate) {
                        }
                    }, Visualizer.getMaxCaptureRate() / 2, true, false);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        Log.d("Log","mVisualizer:"+mVisualizer);
        Log.d("Log","mPlayer:"+GlobalVariables.mPlayer);

    }



    public void playButton(View v)
    {

        try
        {

            if (GlobalVariables.mPlayer.isPlaying()==true) // play/pause  button clicked when song is playing-->show play button and pause music
            {
                GlobalVariables.mPlayer.pause();// pausing the music
                playPauseButton.setImageResource(R.drawable.play);// since song is paused show play button image
                currentTime = GlobalVariables.mPlayer.getCurrentPosition();// remember the position where the music was paused


            }
            else if(GlobalVariables.mPlayer.isPlaying()==false)// play/pause button clicked when song is not playing--> show pause button and play music
            {

                //Log.d("Log","")


                GlobalVariables.mPlayer.start();// start playing music
                playPauseButton.setImageResource(R.drawable.pause);// since song is paused show play button image


            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


    public void stopButton(View v)
    {
        try {
            playPauseButton.setImageResource(R.drawable.play);// since song is stopped show play button image

            seekBar.setProgress(0);
            GlobalVariables.mPlayer.seekTo(0);

            GlobalVariables.mPlayer.pause();// stop playing the music




        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    private Runnable UpdateSongTime = new Runnable() {



            @Override
            public void run () {
                try {
                   // if(mPlayer.isPlaying()==true)
                    {
                        currentTime = GlobalVariables.mPlayer.getCurrentPosition();
                        seekBar.setProgress((int) currentTime);

                        String currentTimeString = calcTimeInMinsAndSecs(currentTime);
                        String totalTimeString = calcTimeInMinsAndSecs(finalTime);




                        durationTextView.setText(currentTimeString+"/"+totalTimeString);
                        Log.i("Log", "runnable thread running");

                        myHandler.postDelayed(this, 100);
                    }
                }
                catch (Exception e )
                {
                    e.printStackTrace();
                }

        }

    };

    private String calcTimeInMinsAndSecs(double time)
    {
        String result = "";
        long currMinutes = TimeUnit.MILLISECONDS.toMinutes((int) time);
        long currSeconds = TimeUnit.MILLISECONDS.toSeconds((int)time) - (currMinutes * 60);
        String currSecondsWithPrecedingZero = (currSeconds < 10) ? "0"+ String.valueOf(currSeconds) : String.valueOf(currSeconds);
        result = String.valueOf(currMinutes)+":"+ currSecondsWithPrecedingZero;

        return result;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_media_player, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
