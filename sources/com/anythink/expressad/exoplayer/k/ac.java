package com.anythink.expressad.exoplayer.k;

/* loaded from: classes.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    public static final long f8983a = Long.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    private static final long f8984b = 8589934592L;

    /* renamed from: c, reason: collision with root package name */
    private long f8985c;

    /* renamed from: d, reason: collision with root package name */
    private long f8986d;

    /* renamed from: e, reason: collision with root package name */
    private volatile long f8987e = com.anythink.expressad.exoplayer.b.f7291b;

    public ac(long j10) {
        c(j10);
    }

    private long b() {
        return this.f8985c;
    }

    private synchronized void c(long j10) {
        a.b(this.f8987e == com.anythink.expressad.exoplayer.b.f7291b);
        this.f8985c = j10;
    }

    private void d() {
        this.f8987e = com.anythink.expressad.exoplayer.b.f7291b;
    }

    private synchronized void e() {
        while (this.f8987e == com.anythink.expressad.exoplayer.b.f7291b) {
            wait();
        }
    }

    public final long a() {
        if (this.f8985c == Long.MAX_VALUE) {
            return 0L;
        }
        return this.f8987e == com.anythink.expressad.exoplayer.b.f7291b ? com.anythink.expressad.exoplayer.b.f7291b : this.f8986d;
    }

    private static long d(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public final long b(long j10) {
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        if (this.f8987e != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f8987e = j10;
        } else {
            long j11 = this.f8985c;
            if (j11 != Long.MAX_VALUE) {
                this.f8986d = j11 - j10;
            }
            synchronized (this) {
                this.f8987e = j10;
                notifyAll();
            }
        }
        return j10 + this.f8986d;
    }

    public final long a(long j10) {
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        if (this.f8987e != com.anythink.expressad.exoplayer.b.f7291b) {
            long j11 = (this.f8987e * 90000) / 1000000;
            long j12 = (4294967296L + j11) / f8984b;
            long j13 = ((j12 - 1) * f8984b) + j10;
            long j14 = (j12 * f8984b) + j10;
            j10 = Math.abs(j13 - j11) < Math.abs(j14 - j11) ? j13 : j14;
        }
        return b((j10 * 1000000) / 90000);
    }

    private long c() {
        if (this.f8987e != com.anythink.expressad.exoplayer.b.f7291b) {
            return this.f8987e + this.f8986d;
        }
        long j10 = this.f8985c;
        return j10 != Long.MAX_VALUE ? j10 : com.anythink.expressad.exoplayer.b.f7291b;
    }

    private static long e(long j10) {
        return (j10 * 90000) / 1000000;
    }
}
