package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.g;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public final class ax extends aq {

    /* renamed from: a */
    public static final g.a<ax> f13307a = new com.applovin.exoplayer2.a.l(3);

    /* renamed from: c */
    private final int f13308c;

    /* renamed from: d */
    private final float f13309d;

    public ax(int i10) {
        com.applovin.exoplayer2.l.a.a(i10 > 0, "maxStars must be a positive integer");
        this.f13308c = i10;
        this.f13309d = -1.0f;
    }

    public static ax a(Bundle bundle) {
        com.applovin.exoplayer2.l.a.a(bundle.getInt(a(0), -1) == 2);
        int i10 = bundle.getInt(a(1), 5);
        float f = bundle.getFloat(a(2), -1.0f);
        if (f == -1.0f) {
            return new ax(i10);
        }
        return new ax(i10, f);
    }

    public static /* synthetic */ ax c(Bundle bundle) {
        return a(bundle);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ax)) {
            return false;
        }
        ax axVar = (ax) obj;
        if (this.f13308c != axVar.f13308c || this.f13309d != axVar.f13309d) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f13308c), Float.valueOf(this.f13309d));
    }

    public ax(int i10, float f) {
        com.applovin.exoplayer2.l.a.a(i10 > 0, "maxStars must be a positive integer");
        com.applovin.exoplayer2.l.a.a(f >= gl.Code && f <= ((float) i10), "starRating is out of range [0, maxStars]");
        this.f13308c = i10;
        this.f13309d = f;
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
