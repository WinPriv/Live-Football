package com.applovin.exoplayer2;

import com.applovin.exoplayer2.h.p;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
final class ae {

    /* renamed from: a, reason: collision with root package name */
    public final p.a f13142a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13143b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13144c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13145d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13146e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13147g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13148h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f13149i;

    public ae(p.a aVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15;
        boolean z16 = false;
        if (z13 && !z11) {
            z14 = false;
        } else {
            z14 = true;
        }
        com.applovin.exoplayer2.l.a.a(z14);
        if (z12 && !z11) {
            z15 = false;
        } else {
            z15 = true;
        }
        com.applovin.exoplayer2.l.a.a(z15);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z16 = true;
        }
        com.applovin.exoplayer2.l.a.a(z16);
        this.f13142a = aVar;
        this.f13143b = j10;
        this.f13144c = j11;
        this.f13145d = j12;
        this.f13146e = j13;
        this.f = z10;
        this.f13147g = z11;
        this.f13148h = z12;
        this.f13149i = z13;
    }

    public ae a(long j10) {
        if (j10 == this.f13143b) {
            return this;
        }
        return new ae(this.f13142a, j10, this.f13144c, this.f13145d, this.f13146e, this.f, this.f13147g, this.f13148h, this.f13149i);
    }

    public ae b(long j10) {
        if (j10 == this.f13144c) {
            return this;
        }
        return new ae(this.f13142a, this.f13143b, j10, this.f13145d, this.f13146e, this.f, this.f13147g, this.f13148h, this.f13149i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ae.class != obj.getClass()) {
            return false;
        }
        ae aeVar = (ae) obj;
        if (this.f13143b == aeVar.f13143b && this.f13144c == aeVar.f13144c && this.f13145d == aeVar.f13145d && this.f13146e == aeVar.f13146e && this.f == aeVar.f && this.f13147g == aeVar.f13147g && this.f13148h == aeVar.f13148h && this.f13149i == aeVar.f13149i && com.applovin.exoplayer2.l.ai.a(this.f13142a, aeVar.f13142a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((this.f13142a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f13143b)) * 31) + ((int) this.f13144c)) * 31) + ((int) this.f13145d)) * 31) + ((int) this.f13146e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.f13147g ? 1 : 0)) * 31) + (this.f13148h ? 1 : 0)) * 31) + (this.f13149i ? 1 : 0);
    }
}
