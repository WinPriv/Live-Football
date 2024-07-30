package com.huawei.hms.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public class cm {
    private static volatile cx Code;
    private static final byte[] V = new byte[0];

    public static cx Code(Context context) {
        cx Code2;
        if (Code == null) {
            synchronized (V) {
                if (Code == null) {
                    if (cl.Z(context)) {
                        Code2 = cs.Code(context);
                    } else {
                        Code2 = cu.Code(context);
                    }
                    Code = Code2;
                }
            }
        }
        return Code;
    }
}
