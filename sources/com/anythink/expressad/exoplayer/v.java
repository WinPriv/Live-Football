package com.anythink.expressad.exoplayer;

import com.huawei.hms.ads.gl;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f9345a = new v(1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final float f9346b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9347c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9348d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9349e;

    public v(float f) {
        this(f, 1.0f, false);
    }

    public final long a(long j10) {
        return j10 * this.f9349e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.f9346b == vVar.f9346b && this.f9347c == vVar.f9347c && this.f9348d == vVar.f9348d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f9347c) + ((Float.floatToRawIntBits(this.f9346b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31) + (this.f9348d ? 1 : 0);
    }

    public v(float f, float f10) {
        this(f, f10, false);
    }

    public v(float f, float f10, boolean z10) {
        com.anythink.expressad.exoplayer.k.a.a(f > gl.Code);
        com.anythink.expressad.exoplayer.k.a.a(f10 > gl.Code);
        this.f9346b = f;
        this.f9347c = f10;
        this.f9348d = z10;
        this.f9349e = Math.round(f * 1000.0f);
    }
}
