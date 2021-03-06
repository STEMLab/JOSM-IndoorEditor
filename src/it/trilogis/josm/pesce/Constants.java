package it.trilogis.josm.pesce;

public class Constants {
    public static final double[][][] DELTA = {{
        {1.6502499988746422e-06, -1.789952999864397e-05, 1.},
        {4.921200002172554e-06, -1.321032999967997e-05},
        {8.555550003563894e-06, -9.042129999414783e-06},
        {9.28245000153538e-06, -1.847300001855956e-07},
        {7.465250000393553e-06, 1.1277770001427712e-05},
        {4.557750003186811e-06, 1.4924920000325415e-05},
        {5.599000019174127e-07, 1.7530020000933177e-05},
        {5.648049999251725e-06, 2.378232000133096e-05, 2.},
        {-7.072300000743326e-06, 2.378232000133096e-05, 2.},
        {-3.074449999473927e-06, 1.8051070000524305e-05},
        {-8.16259999680824e-06, 1.336182000066799e-05},
        {-1.1070149994907297e-05, 5.02547000102993e-06},
        {-1.0706699995921554e-05, -2.2688299985418325e-06},
        {-7.799199998714812e-06, -9.56317999900591e-06},
        {-4.5282499954169e-06, -1.633647999987886e-05 }},
        {{3.7593500010757452e-06, -1.0486459999015096e-05},
        {4.1342100018937344e-06, -1.0352879998620779e-05},
        {4.452559998924244e-06, -1.0039259999317096e-05},
        {4.67393000036509e-06, -9.585469999962015e-06},
        {4.773050001460888e-06, -8.940499998999485e-06},
        {4.676290004113071e-06, -8.294799998864733e-06},
        {4.4011299991097985e-06, -7.765099999446079e-06},
        {3.997340002115379e-06, -7.447169998897607e-06},
        {3.5379100040699996e-06, -7.398490000198876e-06},
        {3.144490001716349e-06, -7.5940899986193244e-06},
        {2.8315900024722396e-06, -7.987969999234679e-06},
        {2.6454200039438547e-06, -8.521929999005806e-06},
        {2.61349000396649e-06, -9.11713000029124e-06},
        {2.740500001152668e-06, -9.685640000256512e-06},
        {3.007700001944613e-06, -1.0143479999058513e-05},
        {3.375620003964741e-06, -1.0423039999096773e-05}}};
    
    public static final String OSM_RELATION_TYPE_SPACELAYER = "indoorgml:SpaceLayer";
    public static final String OSM_RELATION_ROLE_STATE = "state";
    public static final String OSM_RELATION_ROLE_TRANSITION = "transition";
    public static final String OSM_KEY_ID = "name"; // WARNING: NOT USED (EVERYWHERE) YET
    public static final String OSM_KEY_LEVEL = "indoor:level";
    public static final String OSM_KEY_ANCHORNODE = "indoor:anchornode";
    public static final String OSM_KEY_DOOR = "indoor:door";
    public static final String OSM_KEY_DESCRIPTION = "indoor:description";
    public static final String[] OSM_VALUES_TRUE = {"yes","true","1"};
    public static final String OSM_VALUE_FALSE = "no";

    public static final String SRID4326 = "EPSG:4326";
    
    
    public static final int ALLLEVELS = -1000000000;
    public static final String ALLLEVELS_STRING = "All";
    public static final int PREVIOUSLEVEL = -1000000001;
    public static final String PREVIOUSLEVEL_STRING = "Previous level";
    public static final int MISSEDLEVEL = -1000000002;
    public static final String MISSEDLEVEL_STRING = "No level defined";
    
    public static final boolean COMO = true;
}
