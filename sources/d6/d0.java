package d6;

/* compiled from: TimestampAdjuster.java */
/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public long f27292a;

    /* renamed from: b, reason: collision with root package name */
    public long f27293b;

    /* renamed from: c, reason: collision with root package name */
    public long f27294c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal<Long> f27295d = new ThreadLocal<>();

    public d0(long j10) {
        d(j10);
    }

    public final synchronized long a(long j10) {
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        if (this.f27293b == com.anythink.expressad.exoplayer.b.f7291b) {
            long j11 = this.f27292a;
            if (j11 == 9223372036854775806L) {
                Long l10 = this.f27295d.get();
                l10.getClass();
                j11 = l10.longValue();
            }
            this.f27293b = j11 - j10;
            notifyAll();
        }
        this.f27294c = j10;
        return j10 + this.f27293b;
    }

    public final synchronized long b(long j10) {
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        long j11 = this.f27294c;
        if (j11 != com.anythink.expressad.exoplayer.b.f7291b) {
            long j12 = (j11 * 90000) / 1000000;
            long j13 = (4294967296L + j12) / 8589934592L;
            long j14 = ((j13 - 1) * 8589934592L) + j10;
            j10 += j13 * 8589934592L;
            if (Math.abs(j14 - j12) < Math.abs(j10 - j12)) {
                j10 = j14;
            }
        }
        return a((j10 * 1000000) / 90000);
    }

    public final synchronized long c() {
        long j10;
        j10 = this.f27292a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = com.anythink.expressad.exoplayer.b.f7291b;
        }
        return j10;
    }

    public final synchronized void d(long j10) {
        long j11;
        this.f27292a = j10;
        if (j10 == Long.MAX_VALUE) {
            j11 = 0;
        } else {
            j11 = -9223372036854775807L;
        }
        this.f27293b = j11;
        this.f27294c = com.anythink.expressad.exoplayer.b.f7291b;
    }
}
