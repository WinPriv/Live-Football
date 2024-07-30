package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.g;
import com.huawei.hms.ads.gl;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class am implements g {

    /* renamed from: a */
    public static final am f13209a = new am(1.0f);

    /* renamed from: d */
    public static final g.a<am> f13210d = new com.applovin.exoplayer2.a.l(2);

    /* renamed from: b */
    public final float f13211b;

    /* renamed from: c */
    public final float f13212c;

    /* renamed from: e */
    private final int f13213e;

    public am(float f) {
        this(f, 1.0f);
    }

    public static /* synthetic */ am b(Bundle bundle) {
        return a(bundle);
    }

    public long a(long j10) {
        return j10 * this.f13213e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || am.class != obj.getClass()) {
            return false;
        }
        am amVar = (am) obj;
        if (this.f13211b == amVar.f13211b && this.f13212c == amVar.f13212c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.f13212c) + ((Float.floatToRawIntBits(this.f13211b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public String toString() {
        return com.applovin.exoplayer2.l.ai.a("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f13211b), Float.valueOf(this.f13212c));
    }

    public am(float f, float f10) {
        com.applovin.exoplayer2.l.a.a(f > gl.Code);
        com.applovin.exoplayer2.l.a.a(f10 > gl.Code);
        this.f13211b = f;
        this.f13212c = f10;
        this.f13213e = Math.round(f * 1000.0f);
    }

    public am a(float f) {
        return new am(f, this.f13212c);
    }

    public static /* synthetic */ am a(Bundle bundle) {
        return new am(bundle.getFloat(a(0), 1.0f), bundle.getFloat(a(1), 1.0f));
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
