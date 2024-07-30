package com.applovin.exoplayer2.e.d;

import java.util.List;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f14184a;

    /* renamed from: b, reason: collision with root package name */
    public final List<a> f14185b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f14186a;

        /* renamed from: b, reason: collision with root package name */
        public final String f14187b;

        /* renamed from: c, reason: collision with root package name */
        public final long f14188c;

        /* renamed from: d, reason: collision with root package name */
        public final long f14189d;

        public a(String str, String str2, long j10, long j11) {
            this.f14186a = str;
            this.f14187b = str2;
            this.f14188c = j10;
            this.f14189d = j11;
        }
    }

    public b(long j10, List<a> list) {
        this.f14184a = j10;
        this.f14185b = list;
    }

    public com.applovin.exoplayer2.g.f.b a(long j10) {
        long j11;
        if (this.f14185b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f14185b.size() - 1; size >= 0; size--) {
            a aVar = this.f14185b.get(size);
            boolean equals = "video/mp4".equals(aVar.f14186a) | z10;
            if (size == 0) {
                j12 -= aVar.f14189d;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f14188c;
            }
            long j17 = j12;
            j12 = j11;
            if (equals && j12 != j17) {
                j16 = j17 - j12;
                j15 = j12;
                z10 = false;
            } else {
                z10 = equals;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j17;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new com.applovin.exoplayer2.g.f.b(j13, j14, this.f14184a, j15, j16);
    }
}
