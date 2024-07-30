package com.applovin.exoplayer2.l;

/* loaded from: classes.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    private long f16270a;

    /* renamed from: b, reason: collision with root package name */
    private long f16271b;

    /* renamed from: c, reason: collision with root package name */
    private long f16272c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Long> f16273d = new ThreadLocal<>();

    public ag(long j10) {
        a(j10);
    }

    public static long d(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public static long e(long j10) {
        return (j10 * 90000) / 1000000;
    }

    public synchronized long a() {
        long j10;
        j10 = this.f16270a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = com.anythink.expressad.exoplayer.b.f7291b;
        }
        return j10;
    }

    public synchronized long b() {
        long a10;
        long j10 = this.f16272c;
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            a10 = j10 + this.f16271b;
        } else {
            a10 = a();
        }
        return a10;
    }

    public synchronized long c() {
        return this.f16271b;
    }

    public synchronized void a(long j10) {
        this.f16270a = j10;
        this.f16271b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f16272c = com.anythink.expressad.exoplayer.b.f7291b;
    }

    public synchronized long c(long j10) {
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        if (this.f16271b == com.anythink.expressad.exoplayer.b.f7291b) {
            long j11 = this.f16270a;
            if (j11 == 9223372036854775806L) {
                j11 = ((Long) a.b(this.f16273d.get())).longValue();
            }
            this.f16271b = j11 - j10;
            notifyAll();
        }
        this.f16272c = j10;
        return j10 + this.f16271b;
    }

    public synchronized long b(long j10) {
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        long j11 = this.f16272c;
        if (j11 != com.anythink.expressad.exoplayer.b.f7291b) {
            long e10 = e(j11);
            long j12 = (4294967296L + e10) / 8589934592L;
            long j13 = ((j12 - 1) * 8589934592L) + j10;
            long j14 = (j12 * 8589934592L) + j10;
            j10 = Math.abs(j13 - e10) < Math.abs(j14 - e10) ? j13 : j14;
        }
        return c(d(j10));
    }
}
