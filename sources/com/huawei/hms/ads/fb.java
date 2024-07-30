package com.huawei.hms.ads;

/* loaded from: classes2.dex */
public abstract class fb {
    public static final int Code = 3;
    public static final int I = 5;
    public static final int V = 4;
    public static final int Z = 6;

    public static String Code(int i10) {
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 != 6) {
                        return String.valueOf(i10);
                    }
                    return "E";
                }
                return "W";
            }
            return "I";
        }
        return "D";
    }
}
