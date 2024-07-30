package com.huawei.hms.ads;

/* loaded from: classes2.dex */
public class hc {
    public static final int B = 100;
    public static final int Code = 0;
    public static final int I = 50;
    public static final int V = 25;
    public static final int Z = 75;

    public static int Code(float f, float f10) {
        if (f10 >= 75.0f && f < 75.0f) {
            return 75;
        }
        if (f10 >= 50.0f && f < 50.0f) {
            return 50;
        }
        if (f10 >= 25.0f && f < 25.0f) {
            return 25;
        }
        return 0;
    }
}
