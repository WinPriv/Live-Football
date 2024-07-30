package com.applovin.exoplayer2;

/* loaded from: classes.dex */
public final class av {

    /* renamed from: a, reason: collision with root package name */
    public static final av f13251a;

    /* renamed from: b, reason: collision with root package name */
    public static final av f13252b;

    /* renamed from: c, reason: collision with root package name */
    public static final av f13253c;

    /* renamed from: d, reason: collision with root package name */
    public static final av f13254d;

    /* renamed from: e, reason: collision with root package name */
    public static final av f13255e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f13256g;

    static {
        av avVar = new av(0L, 0L);
        f13251a = avVar;
        f13252b = new av(Long.MAX_VALUE, Long.MAX_VALUE);
        f13253c = new av(Long.MAX_VALUE, 0L);
        f13254d = new av(0L, Long.MAX_VALUE);
        f13255e = avVar;
    }

    public av(long j10, long j11) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.a(z10);
        com.applovin.exoplayer2.l.a.a(j11 >= 0);
        this.f = j10;
        this.f13256g = j11;
    }

    public long a(long j10, long j11, long j12) {
        boolean z10;
        long j13 = this.f;
        if (j13 == 0 && this.f13256g == 0) {
            return j10;
        }
        long c10 = com.applovin.exoplayer2.l.ai.c(j10, j13, Long.MIN_VALUE);
        long b10 = com.applovin.exoplayer2.l.ai.b(j10, this.f13256g, Long.MAX_VALUE);
        boolean z11 = true;
        if (c10 <= j11 && j11 <= b10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c10 > j12 || j12 > b10) {
            z11 = false;
        }
        if (z10 && z11) {
            if (Math.abs(j11 - j10) <= Math.abs(j12 - j10)) {
                return j11;
            }
            return j12;
        }
        if (z10) {
            return j11;
        }
        if (z11) {
            return j12;
        }
        return c10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || av.class != obj.getClass()) {
            return false;
        }
        av avVar = (av) obj;
        if (this.f == avVar.f && this.f13256g == avVar.f13256g) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f) * 31) + ((int) this.f13256g);
    }
}
