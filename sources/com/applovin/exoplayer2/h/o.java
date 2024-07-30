package com.applovin.exoplayer2.h;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15389a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15390b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15391c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15392d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15393e;

    public o(Object obj) {
        this(obj, -1L);
    }

    public o a(Object obj) {
        return this.f15389a.equals(obj) ? this : new o(obj, this.f15390b, this.f15391c, this.f15392d, this.f15393e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f15389a.equals(oVar.f15389a) && this.f15390b == oVar.f15390b && this.f15391c == oVar.f15391c && this.f15392d == oVar.f15392d && this.f15393e == oVar.f15393e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.f15389a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f15390b) * 31) + this.f15391c) * 31) + ((int) this.f15392d)) * 31) + this.f15393e;
    }

    public o(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public o(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    public boolean a() {
        return this.f15390b != -1;
    }

    public o(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public o(o oVar) {
        this.f15389a = oVar.f15389a;
        this.f15390b = oVar.f15390b;
        this.f15391c = oVar.f15391c;
        this.f15392d = oVar.f15392d;
        this.f15393e = oVar.f15393e;
    }

    private o(Object obj, int i10, int i11, long j10, int i12) {
        this.f15389a = obj;
        this.f15390b = i10;
        this.f15391c = i11;
        this.f15392d = j10;
        this.f15393e = i12;
    }
}
