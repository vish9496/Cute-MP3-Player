package com.beaglebuddy.id3.enums;



/**
 * <table class="logos_width">
 *    <tbody>
 *       <tr>
 *          <td                               ><img src="../../../../resources/id3v2.gif"                     width="56"  height="54"  alt="ID3 logo"        /></td>
 *          <td class="logos_horz_align_right"><img src="../../../../resources/beaglebuddy_software_logo.gif" width="340" height="110" alt="Beaglebuddy logo"/></td>
 *       </tr>
 *    </tbody>
 * </table>
 * ID3v2.x event types.
 * @see com.beaglebuddy.id3.pojo.EventCode
 * @see com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyEventTimingCodes
 * @see com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyEventTimingCodes
 */
public enum EventType
{                                                                                                                                                 /** padding (has no meaning)                                                                             */
   PADDING                     ("padding (has no meaning)"                                                                            , true ),   /** end of initial silence                                                                               */
   END_OF_INITIAL_SILENCE      ("end of initial silence"                                                                              , true ),   /** intro start                                                                                          */
   INTRO_START                 ("intro start"                                                                                         , true ),   /** main part start                                                                                      */
   MAIN_PART_START             ("main part start"                                                                                     , true ),   /** outro start                                                                                          */
   OUTRO_START                 ("outro start"                                                                                         , true ),   /** outro end                                                                                            */
   OUTRO_END                   ("outro end"                                                                                           , true ),   /** verse start                                                                                          */
   VERSE_START                 ("verse start"                                                                                         , true ),   /** refrain start                                                                                        */
   REFRAIN_START               ("refrain start"                                                                                       , true ),   /** interlude start                                                                                      */
   INTERLUDE_START             ("interlude start"                                                                                     , true ),   /** theme start                                                                                          */
   THEME_START                 ("theme start"                                                                                         , true ),   /** variation start                                                                                      */
   VARIATION_START             ("variation start"                                                                                     , true ),   /** key change                                                                                           */
   KEY_CHANGE                  ("key change"                                                                                          , true ),   /** time change                                                                                          */
   TIME_CHANGE                 ("time change"                                                                                         , true ),   /** momentary unwanted noise (Snap, Crackle & Pop)                                                       */
   UNWANTED_NOISE              ("momentary unwanted noise (Snap, Crackle & Pop)"                                                      , true ),   /** sustained noise                                                                                      */
   SUSTAINED_NOISE             ("sustained noise"                                                                                     , true ),   /** sustained noise end                                                                                  */
   SUSTAINED_NOISE_END         ("sustained noise end"                                                                                 , true ),   /** intro end                                                                                            */
   INTRO_END                   ("intro end"                                                                                           , true ),   /** main part end                                                                                        */
   MAIN_PART_END               ("main part end"                                                                                       , true ),   /** verse end                                                                                            */
   VERSE_END                   ("verse end"                                                                                           , true ),   /** refrain end                                                                                          */
   REFRAIN_END                 ("refrain end"                                                                                         , true ),   /** theme end                                                                                            */
   THEME_END                   ("theme end"                                                                                           , true ),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X15("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X16("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X17("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X18("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X19("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X1A("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X1B("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X1C("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X1D("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X1E("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X1F("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X20("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X21("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X22("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X23("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X24("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X25("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X26("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X27("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X28("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X29("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X2A("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X2B("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X2C("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X2D("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X2E("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X2F("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X30("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X31("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X32("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X33("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X34("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X35("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X36("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X37("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X38("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X39("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X3A("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X3B("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X3C("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X3D("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X3E("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X3F("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X40("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X41("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X42("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X43("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X44("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X45("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X46("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X47("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X48("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X49("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X4A("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X4B("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X4C("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X4D("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X4E("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X4F("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X50("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X51("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X52("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X53("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X54("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X55("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X56("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X57("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X58("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X59("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X5A("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X5B("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X5C("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X5D("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X5E("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X5F("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X60("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X61("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X62("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X63("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X64("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X65("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X66("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X67("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X68("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X69("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X6A("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X6B("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X6C("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X6D("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X6E("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X6F("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X70("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X71("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X72("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X73("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X74("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X75("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X76("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X77("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X78("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X79("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X7A("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X7B("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X7C("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X7D("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X7E("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X7F("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X80("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X81("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X82("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X83("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X84("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X85("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X86("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X87("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X88("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X89("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X8A("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X8B("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X8C("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X8D("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X8E("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X8F("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X90("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X91("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X92("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X93("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X94("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X95("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X96("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X97("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X98("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X99("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X9A("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X9B("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X9C("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X9D("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X9E("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0X9F("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XA0("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XA1("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XA2("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XA3("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XA4("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XA5("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XA6("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XA7("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XA8("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XA9("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XAA("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XAB("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XAC("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XAD("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XAE("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XAF("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XB0("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XB1("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XB2("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XB3("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XB4("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XB5("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XB6("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XB7("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XB8("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XB9("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XBA("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XBB("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XBC("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XBD("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XBE("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XBF("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XC0("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XC1("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XC2("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XC3("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XC4("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XC5("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XC6("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XC7("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XC8("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XC9("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XCA("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XCB("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XCC("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XCD("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XCE("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XCF("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XD0("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XD1("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XD2("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XD3("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XD4("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XD5("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XD6("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XD7("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XD8("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XD9("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XDA("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XDB("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XDC("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XDD("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XDE("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XDF("reserved for future use"                                                                             , false),   /** not predefined sync 0 - for user defined event                                                       */
   USER_DEFINED_EVENT_0        ("not predefined sync 0"                                                                               , true ),   /** not predefined sync 1 - for user defined event                                                       */
   USER_DEFINED_EVENT_1        ("not predefined sync 1"                                                                               , true ),   /** not predefined sync 2 - for user defined event                                                       */
   USER_DEFINED_EVENT_2        ("not predefined sync 2"                                                                               , true ),   /** not predefined sync 3 - for user defined event                                                       */
   USER_DEFINED_EVENT_3        ("not predefined sync 3"                                                                               , true ),   /** not predefined sync 4 - for user defined event                                                       */
   USER_DEFINED_EVENT_4        ("not predefined sync 4"                                                                               , true ),   /** not predefined sync 5 - for user defined event                                                       */
   USER_DEFINED_EVENT_5        ("not predefined sync 5"                                                                               , true ),   /** not predefined sync 6 - for user defined event                                                       */
   USER_DEFINED_EVENT_6        ("not predefined sync 6"                                                                               , true ),   /** not predefined sync 7 - for user defined event                                                       */
   USER_DEFINED_EVENT_7        ("not predefined sync 7"                                                                               , true ),   /** not predefined sync 8 - for user defined event                                                       */
   USER_DEFINED_EVENT_8        ("not predefined sync 8"                                                                               , true ),   /** not predefined sync 9 - for user defined event                                                       */
   USER_DEFINED_EVENT_9        ("not predefined sync 9"                                                                               , true ),   /** not predefined sync A - for user defined event                                                       */
   USER_DEFINED_EVENT_A        ("not predefined sync A"                                                                               , true ),   /** not predefined sync B - for user defined event                                                       */
   USER_DEFINED_EVENT_B        ("not predefined sync B"                                                                               , true ),   /** not predefined sync C - for user defined event                                                       */
   USER_DEFINED_EVENT_C        ("not predefined sync C"                                                                               , true ),   /** not predefined sync D - for user defined event                                                       */
   USER_DEFINED_EVENT_D        ("not predefined sync D"                                                                               , true ),   /** not predefined sync E - for user defined event                                                       */
   USER_DEFINED_EVENT_E        ("not predefined sync E"                                                                               , true ),   /** not predefined sync F - for user defined event                                                       */
   USER_DEFINED_EVENT_F        ("not predefined sync F"                                                                               , true ),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XF0("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XF1("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XF2("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XF3("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XF4("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XF5("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XF6("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XF7("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XF8("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XF9("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XFA("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XFB("reserved for future use"                                                                             , false),   /** reserved for future use                                                                              */
   RESERVED_FOR_FUTURE_USE_0XFC("reserved for future use"                                                                             , false),   /** audio end (start of silence)                                                                         */
   AUDIO_ENDS                  ("audio end (start of silence)"                                                                        , true ),   /** audio file ends                                                                                      */
   AUDIO_FILE_ENDS             ("audio file ends"                                                                                     , true ),   /** one more byte of events follows (all the following bytes with the value 0xFF have the same function) */
   EVENT_BYTE_FOLLOWS          ("one more byte of events follows (all the following bytes with the value 0xFF have the same function)", true );

   // data members
   private String  description;    // description of the event
   private boolean valid;          // whether a user may specify this value

   /**
    * constructor.
    * @param description   description of the picture type.
    */
   private EventType(String description, boolean valid)
   {
      this.description = description;
      this.valid       = valid;
   }

   /**
    * gets the description of the event code.
    * @return the description of the event code.
    */
   public String getDescription()
   {
      return description;
   }

   /**
    * determines whether a user may specify this value as an event.  Some event codes are reserved for future use and therefore are not to be used at this time.
    * @return whether a user may specify this value.
    */
   public boolean isValid()
   {
      return valid;
   }

   /**
    * converts an integral value to its corresponding event code enum.  The event codes are: <br/><br/><br/>
    * <table class="beaglebuddy">
    *    <thead>
    *       <tr><th class="beaglebuddy">Value</th><th class="beaglebuddy">Description</th></tr>
    *    </thead>
    *    </tbody>
    *       <tr><td class="beaglebuddy">0x00     </td><td class="beaglebuddy">padding (has no meaning)                                                                            </td></tr>
    *       <tr><td class="beaglebuddy">0x01     </td><td class="beaglebuddy">end of initial silence                                                                              </td></tr>
    *       <tr><td class="beaglebuddy">0x02     </td><td class="beaglebuddy">intro start                                                                                         </td></tr>
    *       <tr><td class="beaglebuddy">0x03     </td><td class="beaglebuddy">mainpart start                                                                                      </td></tr>
    *       <tr><td class="beaglebuddy">0x04     </td><td class="beaglebuddy">outro start                                                                                         </td></tr>
    *       <tr><td class="beaglebuddy">0x05     </td><td class="beaglebuddy">outro end                                                                                           </td></tr>
    *       <tr><td class="beaglebuddy">0x06     </td><td class="beaglebuddy">verse start                                                                                         </td></tr>
    *       <tr><td class="beaglebuddy">0x07     </td><td class="beaglebuddy">refrain start                                                                                       </td></tr>
    *       <tr><td class="beaglebuddy">0x08     </td><td class="beaglebuddy">interlude start                                                                                     </td></tr>
    *       <tr><td class="beaglebuddy">0x09     </td><td class="beaglebuddy">theme start                                                                                         </td></tr>
    *       <tr><td class="beaglebuddy">0x0A     </td><td class="beaglebuddy">variation start                                                                                     </td></tr>
    *       <tr><td class="beaglebuddy">0x0B     </td><td class="beaglebuddy">key change                                                                                          </td></tr>
    *       <tr><td class="beaglebuddy">0x0C     </td><td class="beaglebuddy">time change                                                                                         </td></tr>
    *       <tr><td class="beaglebuddy">0x0D     </td><td class="beaglebuddy">momentary unwanted noise (Snap, Crackle & Pop)                                                      </td></tr>
    *       <tr><td class="beaglebuddy">0x0E     </td><td class="beaglebuddy">sustained noise                                                                                     </td></tr>
    *       <tr><td class="beaglebuddy">0x0F     </td><td class="beaglebuddy">sustained noise end                                                                                 </td></tr>
    *       <tr><td class="beaglebuddy">0x10     </td><td class="beaglebuddy">intro end                                                                                           </td></tr>
    *       <tr><td class="beaglebuddy">0x11     </td><td class="beaglebuddy">mainpart end                                                                                        </td></tr>
    *       <tr><td class="beaglebuddy">0x12     </td><td class="beaglebuddy">verse end                                                                                           </td></tr>
    *       <tr><td class="beaglebuddy">0x13     </td><td class="beaglebuddy">refrain end                                                                                         </td></tr>
    *       <tr><td class="beaglebuddy">0x14     </td><td class="beaglebuddy">theme end                                                                                           </td></tr>
    *       <tr><td class="beaglebuddy">0x15-0xDF</td><td class="beaglebuddy">reserved for future use                                                                             </td></tr>
    *       <tr><td class="beaglebuddy">0xE0-0xEF</td><td class="beaglebuddy">not predefined sync 0-F.  Can be used by the user to define their own events.                       </td></tr>
    *       <tr><td class="beaglebuddy">0xF0-0xFC</td><td class="beaglebuddy">reserved for future use                                                                             </td></tr>
    *       <tr><td class="beaglebuddy">0xFD     </td><td class="beaglebuddy">audio end (start of silence)                                                                        </td></tr>
    *       <tr><td class="beaglebuddy">0xFE     </td><td class="beaglebuddy">audio file ends                                                                                     </td></tr>
    *       <tr><td class="beaglebuddy">0xFF     </td><td class="beaglebuddy">one more byte of events follows (all the following bytes with the value 0xFF have the same function)</td></tr>
    *    </tbody>
    * </table>
    * @return an event type enum corresponding to the integral value.
    * @param eventType  integral value to be converted to a event type enum.
    * @throws IllegalArgumentException   if the value is not a valid event type.
    */
   public static EventType valueOf(byte eventType) throws IllegalArgumentException
   {
      for (EventType e : EventType.values())
         if (eventType == e.ordinal())
            return e;
      throw new IllegalArgumentException("Invalid event type " + eventType + ".");
   }

   /**
    * gets a string representation of the event type enum.
    * @return a string representation of the event type enum.
    */
   public String toString()
   {
      return "" + ordinal() + " - " + description;
   }
}
