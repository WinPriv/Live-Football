package com.huawei.hms.ads;

import android.graphics.Bitmap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class du {
    int Code;
    int I;
    Bitmap V;

    public du() {
    }

    public du(int i10, Bitmap bitmap, int i11) {
        this.Code = i10;
        this.V = bitmap;
        this.I = i11;
    }

    public du Code() {
        du duVar = new du();
        duVar.Code = this.Code;
        duVar.I = this.I;
        return duVar;
    }

    public String toString() {
        return "GifFrame{frameIndex=" + this.Code + ", delay=" + this.I + '}';
    }
}
