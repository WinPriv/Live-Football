package com.huawei.hms.ads;

import android.net.Uri;

/* loaded from: classes2.dex */
public class w extends Video {
    private Uri Code;
    private int I;
    private Float V;

    public w(com.huawei.openalliance.ad.inter.data.p pVar) {
        if (pVar != null) {
            this.Code = Uri.parse(pVar.f22303s);
            this.V = pVar.D;
            this.I = pVar.f22304t;
        }
    }

    @Override // com.huawei.hms.ads.Video
    public float getAspectRatio() {
        Float f = this.V;
        if (f == null) {
            return 1.7777778f;
        }
        return f.floatValue();
    }

    @Override // com.huawei.hms.ads.Video
    public int getDuration() {
        return this.I;
    }

    @Override // com.huawei.hms.ads.Video
    public Uri getUri() {
        return this.Code;
    }
}
