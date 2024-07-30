package com.anythink.expressad.f.a;

import android.os.CountDownTimer;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final long f9388a = 1000;

    /* renamed from: b, reason: collision with root package name */
    private long f9389b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f9390c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.expressad.f.a.a f9391d;

    /* renamed from: e, reason: collision with root package name */
    private a f9392e;

    private b a(long j10) {
        if (j10 < 0) {
            j10 = f9388a;
        }
        this.f9390c = j10;
        return this;
    }

    private b b(long j10) {
        this.f9389b = j10;
        return this;
    }

    private void c() {
        a aVar = this.f9392e;
        if (aVar != null) {
            aVar.cancel();
            this.f9392e = null;
        }
    }

    private b a(com.anythink.expressad.f.a.a aVar) {
        this.f9391d = aVar;
        return this;
    }

    private void b() {
        a aVar = this.f9392e;
        if (aVar == null) {
            if (aVar != null) {
                aVar.cancel();
                this.f9392e = null;
            }
            if (this.f9390c <= 0) {
                this.f9390c = this.f9389b + f9388a;
            }
            a aVar2 = new a(this.f9389b, this.f9390c);
            this.f9392e = aVar2;
            aVar2.a(this.f9391d);
        }
        this.f9392e.start();
    }

    private void a() {
        a aVar = this.f9392e;
        if (aVar != null) {
            aVar.cancel();
            this.f9392e = null;
        }
        if (this.f9390c <= 0) {
            this.f9390c = this.f9389b + f9388a;
        }
        a aVar2 = new a(this.f9389b, this.f9390c);
        this.f9392e = aVar2;
        aVar2.a(this.f9391d);
    }

    /* loaded from: classes.dex */
    public static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.anythink.expressad.f.a.a f9393a;

        public a(long j10, long j11) {
            super(j10, j11);
        }

        public final void a(com.anythink.expressad.f.a.a aVar) {
            this.f9393a = aVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j10) {
        }
    }
}
