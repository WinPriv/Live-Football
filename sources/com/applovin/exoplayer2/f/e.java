package com.applovin.exoplayer2.f;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private long f15015a;

    /* renamed from: b, reason: collision with root package name */
    private long f15016b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f15017c;

    public void a() {
        this.f15015a = 0L;
        this.f15016b = 0L;
        this.f15017c = false;
    }

    public long a(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.g gVar) {
        if (this.f15016b == 0) {
            this.f15015a = gVar.f13647d;
        }
        if (this.f15017c) {
            return gVar.f13647d;
        }
        ByteBuffer byteBuffer = (ByteBuffer) com.applovin.exoplayer2.l.a.b(gVar.f13645b);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & DefaultClassResolver.NAME);
        }
        int b10 = com.applovin.exoplayer2.b.r.b(i10);
        if (b10 == -1) {
            this.f15017c = true;
            this.f15016b = 0L;
            this.f15015a = gVar.f13647d;
            com.applovin.exoplayer2.l.q.c("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return gVar.f13647d;
        }
        long a10 = a(vVar.f16850z);
        this.f15016b += b10;
        return a10;
    }

    public long a(com.applovin.exoplayer2.v vVar) {
        return a(vVar.f16850z);
    }

    private long a(long j10) {
        return Math.max(0L, ((this.f15016b - 529) * 1000000) / j10) + this.f15015a;
    }
}
