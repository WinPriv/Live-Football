package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.g;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public final class aj extends aq {

    /* renamed from: a */
    public static final g.a<aj> f13186a = new b0(1);

    /* renamed from: c */
    private final float f13187c;

    public aj() {
        this.f13187c = -1.0f;
    }

    public static aj a(Bundle bundle) {
        com.applovin.exoplayer2.l.a.a(bundle.getInt(a(0), -1) == 1);
        float f = bundle.getFloat(a(1), -1.0f);
        return f == -1.0f ? new aj() : new aj(f);
    }

    public static /* synthetic */ aj c(Bundle bundle) {
        return a(bundle);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof aj) || this.f13187c != ((aj) obj).f13187c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.f13187c));
    }

    public aj(float f) {
        com.applovin.exoplayer2.l.a.a(f >= gl.Code && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.f13187c = f;
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
