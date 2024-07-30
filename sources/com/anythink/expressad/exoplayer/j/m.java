package com.anythink.expressad.exoplayer.j;

import android.os.Handler;
import com.anythink.expressad.exoplayer.j.d;

/* loaded from: classes.dex */
public final class m implements aa<Object>, d {

    /* renamed from: a, reason: collision with root package name */
    public static final long f8829a = 1000000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8830b = 2000;

    /* renamed from: c, reason: collision with root package name */
    private static final int f8831c = 2000;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8832d = 524288;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f8833e;
    private final d.a f;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.k.y f8834g;

    /* renamed from: h, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.k.c f8835h;

    /* renamed from: i, reason: collision with root package name */
    private int f8836i;

    /* renamed from: j, reason: collision with root package name */
    private long f8837j;

    /* renamed from: k, reason: collision with root package name */
    private long f8838k;

    /* renamed from: l, reason: collision with root package name */
    private long f8839l;

    /* renamed from: m, reason: collision with root package name */
    private long f8840m;

    /* renamed from: n, reason: collision with root package name */
    private long f8841n;

    /* renamed from: com.anythink.expressad.exoplayer.j.m$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8842a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f8843b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f8844c;

        public AnonymousClass1(int i10, long j10, long j11) {
            this.f8842a = i10;
            this.f8843b = j10;
            this.f8844c = j11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m.this.f.c();
        }
    }

    public /* synthetic */ m(Handler handler, d.a aVar, long j10, int i10, com.anythink.expressad.exoplayer.k.c cVar, byte b10) {
        this(handler, aVar, j10, i10, cVar);
    }

    @Override // com.anythink.expressad.exoplayer.j.aa
    public final synchronized void b() {
        if (this.f8836i == 0) {
            this.f8837j = this.f8835h.a();
        }
        this.f8836i++;
    }

    @Override // com.anythink.expressad.exoplayer.j.aa
    public final synchronized void c() {
        boolean z10;
        if (this.f8836i > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.anythink.expressad.exoplayer.k.a.b(z10);
        long a10 = this.f8835h.a();
        int i10 = (int) (a10 - this.f8837j);
        long j10 = i10;
        this.f8839l += j10;
        long j11 = this.f8840m;
        long j12 = this.f8838k;
        this.f8840m = j11 + j12;
        if (i10 > 0) {
            this.f8834g.a((int) Math.sqrt(j12), (float) ((8000 * j12) / j10));
            if (this.f8839l >= 2000 || this.f8840m >= 524288) {
                this.f8841n = this.f8834g.a();
            }
        }
        long j13 = this.f8838k;
        long j14 = this.f8841n;
        Handler handler = this.f8833e;
        if (handler != null && this.f != null) {
            handler.post(new AnonymousClass1(i10, j13, j14));
        }
        int i11 = this.f8836i - 1;
        this.f8836i = i11;
        if (i11 > 0) {
            this.f8837j = a10;
        }
        this.f8838k = 0L;
    }

    public m() {
        this(null, null, 1000000L, 2000, com.anythink.expressad.exoplayer.k.c.f9012a);
    }

    @Override // com.anythink.expressad.exoplayer.j.d
    public final synchronized long a() {
        return this.f8841n;
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Handler f8846a;

        /* renamed from: b, reason: collision with root package name */
        private d.a f8847b;

        /* renamed from: c, reason: collision with root package name */
        private long f8848c = 1000000;

        /* renamed from: d, reason: collision with root package name */
        private int f8849d = 2000;

        /* renamed from: e, reason: collision with root package name */
        private com.anythink.expressad.exoplayer.k.c f8850e = com.anythink.expressad.exoplayer.k.c.f9012a;

        private a a(Handler handler, d.a aVar) {
            com.anythink.expressad.exoplayer.k.a.a((handler == null || aVar == null) ? false : true);
            this.f8846a = handler;
            this.f8847b = aVar;
            return this;
        }

        private a a(int i10) {
            this.f8849d = i10;
            return this;
        }

        private a a(long j10) {
            this.f8848c = j10;
            return this;
        }

        private a a(com.anythink.expressad.exoplayer.k.c cVar) {
            this.f8850e = cVar;
            return this;
        }

        private m a() {
            return new m(this.f8846a, this.f8847b, this.f8848c, this.f8849d, this.f8850e, (byte) 0);
        }
    }

    @Deprecated
    private m(Handler handler, d.a aVar) {
        this(handler, aVar, 1000000L, 2000, com.anythink.expressad.exoplayer.k.c.f9012a);
    }

    @Override // com.anythink.expressad.exoplayer.j.aa
    public final synchronized void a(int i10) {
        this.f8838k += i10;
    }

    @Deprecated
    private m(Handler handler, d.a aVar, int i10) {
        this(handler, aVar, 1000000L, i10, com.anythink.expressad.exoplayer.k.c.f9012a);
    }

    private m(Handler handler, d.a aVar, long j10, int i10, com.anythink.expressad.exoplayer.k.c cVar) {
        this.f8833e = handler;
        this.f = aVar;
        this.f8834g = new com.anythink.expressad.exoplayer.k.y(i10);
        this.f8835h = cVar;
        this.f8841n = j10;
    }

    private void a(int i10, long j10, long j11) {
        Handler handler = this.f8833e;
        if (handler == null || this.f == null) {
            return;
        }
        handler.post(new AnonymousClass1(i10, j10, j11));
    }
}
