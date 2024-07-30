package com.applovin.exoplayer2.c;

import com.applovin.exoplayer2.v;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f13652a;

    /* renamed from: b, reason: collision with root package name */
    public final v f13653b;

    /* renamed from: c, reason: collision with root package name */
    public final v f13654c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13655d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13656e;

    public h(String str, v vVar, v vVar2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        com.applovin.exoplayer2.l.a.a(z10);
        this.f13652a = com.applovin.exoplayer2.l.a.a(str);
        this.f13653b = (v) com.applovin.exoplayer2.l.a.b(vVar);
        this.f13654c = (v) com.applovin.exoplayer2.l.a.b(vVar2);
        this.f13655d = i10;
        this.f13656e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f13655d == hVar.f13655d && this.f13656e == hVar.f13656e && this.f13652a.equals(hVar.f13652a) && this.f13653b.equals(hVar.f13653b) && this.f13654c.equals(hVar.f13654c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f13654c.hashCode() + ((this.f13653b.hashCode() + e0.i.b(this.f13652a, (((this.f13655d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f13656e) * 31, 31)) * 31);
    }
}
