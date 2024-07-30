package com.huawei.hms.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class u extends Image {
    private static final String Code = "u";
    private double B;
    private int C;
    private String D;
    private boolean F;
    private com.huawei.openalliance.ad.inter.data.h I;
    private String L;
    private int S;
    private WeakReference<Drawable> V;
    private Uri Z;

    public u() {
    }

    public u(com.huawei.openalliance.ad.inter.data.h hVar, boolean z10) {
        this.I = hVar;
        this.F = z10;
        if (hVar != null) {
            String str = hVar.f22260s;
            if (!TextUtils.isEmpty(str)) {
                this.Z = Uri.parse(str);
            }
            int i10 = hVar.f22261t;
            this.C = i10;
            int i11 = hVar.f22262u;
            this.S = i11;
            if (i11 > 0) {
                this.B = (i10 * 1.0d) / i11;
            }
        }
    }

    public void Code(Drawable drawable) {
        this.V = new WeakReference<>(drawable);
    }

    public void V(String str) {
        this.L = str;
    }

    @Override // com.huawei.hms.ads.Image
    public Drawable getDrawable() {
        Drawable drawable = null;
        if (this.F) {
            return null;
        }
        WeakReference<Drawable> weakReference = this.V;
        if (weakReference != null) {
            drawable = weakReference.get();
        }
        if (drawable != null) {
            return drawable;
        }
        n nVar = new n(this.I);
        nVar.Code(this.D);
        nVar.V(this.L);
        return nVar;
    }

    @Override // com.huawei.hms.ads.Image
    public int getHeight() {
        return this.S;
    }

    @Override // com.huawei.hms.ads.Image
    public double getScale() {
        return this.B;
    }

    @Override // com.huawei.hms.ads.Image
    public Uri getUri() {
        return this.Z;
    }

    @Override // com.huawei.hms.ads.Image
    public int getWidth() {
        return this.C;
    }

    public void Code(String str) {
        this.D = str;
    }
}
