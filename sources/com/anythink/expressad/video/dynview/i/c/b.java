package com.anythink.expressad.video.dynview.i.c;

import android.os.CountDownTimer;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final long f11484a = 1000;

    /* renamed from: b, reason: collision with root package name */
    private long f11485b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f11486c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.expressad.video.dynview.i.c.a f11487d;

    /* renamed from: e, reason: collision with root package name */
    private a f11488e;

    /* loaded from: classes.dex */
    public static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.anythink.expressad.video.dynview.i.c.a f11489a;

        public a(long j10, long j11) {
            super(j10, j11);
        }

        public final void a(com.anythink.expressad.video.dynview.i.c.a aVar) {
            this.f11489a = aVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            com.anythink.expressad.video.dynview.i.c.a aVar = this.f11489a;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j10) {
            com.anythink.expressad.video.dynview.i.c.a aVar = this.f11489a;
            if (aVar != null) {
                aVar.a(j10);
            }
        }
    }

    private void d() {
        a aVar = this.f11488e;
        if (aVar != null) {
            aVar.cancel();
            this.f11488e = null;
        }
        if (this.f11486c <= 0) {
            this.f11486c = this.f11485b + f11484a;
        }
        a aVar2 = new a(this.f11485b, this.f11486c);
        this.f11488e = aVar2;
        aVar2.a(this.f11487d);
    }

    public final b a() {
        this.f11486c = f11484a;
        return this;
    }

    public final void b() {
        if (this.f11488e == null) {
            d();
        }
        this.f11488e.start();
    }

    public final void c() {
        a aVar = this.f11488e;
        if (aVar != null) {
            aVar.cancel();
            this.f11488e = null;
        }
    }

    public final b a(com.anythink.expressad.video.dynview.i.c.a aVar) {
        this.f11487d = aVar;
        return this;
    }

    public final b a(long j10) {
        this.f11485b = j10;
        return this;
    }

    public final void a(long j10, com.anythink.expressad.video.dynview.i.c.a aVar) {
        this.f11485b = j10;
        this.f11487d = aVar;
        d();
        a aVar2 = this.f11488e;
        if (aVar2 != null) {
            aVar2.start();
        }
    }
}
