package com.iab.omid.library.ironsrc.devicevolume;

import com.huawei.hms.ads.gl;

/* loaded from: classes2.dex */
public class a {
    public float a(int i10, int i11) {
        if (i11 > 0 && i10 > 0) {
            float f = i10 / i11;
            if (f > 1.0f) {
                return 1.0f;
            }
            return f;
        }
        return gl.Code;
    }
}
