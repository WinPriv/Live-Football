package com.applovin.exoplayer2.l;

import com.applovin.exoplayer2.am;

/* loaded from: classes.dex */
public final class ac implements s {

    /* renamed from: a, reason: collision with root package name */
    private final d f16257a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16258b;

    /* renamed from: c, reason: collision with root package name */
    private long f16259c;

    /* renamed from: d, reason: collision with root package name */
    private long f16260d;

    /* renamed from: e, reason: collision with root package name */
    private am f16261e = am.f13209a;

    public ac(d dVar) {
        this.f16257a = dVar;
    }

    public void a() {
        if (this.f16258b) {
            return;
        }
        this.f16260d = this.f16257a.a();
        this.f16258b = true;
    }

    public void b() {
        if (this.f16258b) {
            a(c_());
            this.f16258b = false;
        }
    }

    @Override // com.applovin.exoplayer2.l.s
    public long c_() {
        long a10;
        long j10 = this.f16259c;
        if (this.f16258b) {
            long a11 = this.f16257a.a() - this.f16260d;
            am amVar = this.f16261e;
            if (amVar.f13211b == 1.0f) {
                a10 = com.applovin.exoplayer2.h.b(a11);
            } else {
                a10 = amVar.a(a11);
            }
            return j10 + a10;
        }
        return j10;
    }

    @Override // com.applovin.exoplayer2.l.s
    public am d() {
        return this.f16261e;
    }

    public void a(long j10) {
        this.f16259c = j10;
        if (this.f16258b) {
            this.f16260d = this.f16257a.a();
        }
    }

    @Override // com.applovin.exoplayer2.l.s
    public void a(am amVar) {
        if (this.f16258b) {
            a(c_());
        }
        this.f16261e = amVar;
    }
}
