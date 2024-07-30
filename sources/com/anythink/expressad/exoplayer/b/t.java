package com.anythink.expressad.exoplayer.b;

import com.anythink.expressad.exoplayer.b.f;
import com.anythink.expressad.exoplayer.k.af;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class t implements f {

    /* renamed from: b, reason: collision with root package name */
    public static final float f7542b = 8.0f;

    /* renamed from: c, reason: collision with root package name */
    public static final float f7543c = 0.1f;

    /* renamed from: d, reason: collision with root package name */
    public static final float f7544d = 8.0f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f7545e = 0.1f;
    public static final int f = -1;

    /* renamed from: g, reason: collision with root package name */
    private static final float f7546g = 0.01f;

    /* renamed from: h, reason: collision with root package name */
    private static final int f7547h = 1024;

    /* renamed from: n, reason: collision with root package name */
    private int f7553n;
    private s o;

    /* renamed from: p, reason: collision with root package name */
    private ByteBuffer f7554p;

    /* renamed from: q, reason: collision with root package name */
    private ShortBuffer f7555q;

    /* renamed from: r, reason: collision with root package name */
    private ByteBuffer f7556r;

    /* renamed from: s, reason: collision with root package name */
    private long f7557s;

    /* renamed from: t, reason: collision with root package name */
    private long f7558t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f7559u;

    /* renamed from: k, reason: collision with root package name */
    private float f7550k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private float f7551l = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    private int f7548i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f7549j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f7552m = -1;

    public t() {
        ByteBuffer byteBuffer = f.f7351a;
        this.f7554p = byteBuffer;
        this.f7555q = byteBuffer.asShortBuffer();
        this.f7556r = byteBuffer;
        this.f7553n = -1;
    }

    public final float a(float f10) {
        float a10 = af.a(f10);
        if (this.f7550k != a10) {
            this.f7550k = a10;
            this.o = null;
        }
        h();
        return a10;
    }

    public final float b(float f10) {
        float a10 = af.a(f10);
        if (this.f7551l != a10) {
            this.f7551l = a10;
            this.o = null;
        }
        h();
        return a10;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final int c() {
        return 2;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final int d() {
        return this.f7552m;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void e() {
        boolean z10;
        if (this.o != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.anythink.expressad.exoplayer.k.a.b(z10);
        this.o.a();
        this.f7559u = true;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f7556r;
        this.f7556r = f.f7351a;
        return byteBuffer;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final boolean g() {
        if (this.f7559u) {
            s sVar = this.o;
            if (sVar == null || sVar.c() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void h() {
        if (a()) {
            s sVar = this.o;
            if (sVar == null) {
                this.o = new s(this.f7549j, this.f7548i, this.f7550k, this.f7551l, this.f7552m);
            } else {
                sVar.b();
            }
        }
        this.f7556r = f.f7351a;
        this.f7557s = 0L;
        this.f7558t = 0L;
        this.f7559u = false;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void i() {
        this.f7550k = 1.0f;
        this.f7551l = 1.0f;
        this.f7548i = -1;
        this.f7549j = -1;
        this.f7552m = -1;
        ByteBuffer byteBuffer = f.f7351a;
        this.f7554p = byteBuffer;
        this.f7555q = byteBuffer.asShortBuffer();
        this.f7556r = byteBuffer;
        this.f7553n = -1;
        this.o = null;
        this.f7557s = 0L;
        this.f7558t = 0L;
        this.f7559u = false;
    }

    private void a(int i10) {
        this.f7553n = i10;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final int b() {
        return this.f7548i;
    }

    public final long a(long j10) {
        long j11 = this.f7558t;
        if (j11 >= 1024) {
            int i10 = this.f7552m;
            int i11 = this.f7549j;
            if (i10 == i11) {
                return af.a(j10, this.f7557s, j11);
            }
            return af.a(j10, this.f7557s * i10, j11 * i11);
        }
        return (long) (this.f7550k * j10);
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final boolean a(int i10, int i11, int i12) {
        if (i12 == 2) {
            int i13 = this.f7553n;
            if (i13 == -1) {
                i13 = i10;
            }
            if (this.f7549j == i10 && this.f7548i == i11 && this.f7552m == i13) {
                return false;
            }
            this.f7549j = i10;
            this.f7548i = i11;
            this.f7552m = i13;
            this.o = null;
            return true;
        }
        throw new f.a(i10, i11, i12);
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final boolean a() {
        if (this.f7549j != -1) {
            return Math.abs(this.f7550k - 1.0f) >= 0.01f || Math.abs(this.f7551l - 1.0f) >= 0.01f || this.f7552m != this.f7549j;
        }
        return false;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void a(ByteBuffer byteBuffer) {
        com.anythink.expressad.exoplayer.k.a.b(this.o != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f7557s += remaining;
            this.o.a(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int c10 = this.o.c() * this.f7548i * 2;
        if (c10 > 0) {
            if (this.f7554p.capacity() < c10) {
                ByteBuffer order = ByteBuffer.allocateDirect(c10).order(ByteOrder.nativeOrder());
                this.f7554p = order;
                this.f7555q = order.asShortBuffer();
            } else {
                this.f7554p.clear();
                this.f7555q.clear();
            }
            this.o.b(this.f7555q);
            this.f7558t += c10;
            this.f7554p.limit(c10);
            this.f7556r = this.f7554p;
        }
    }
}
