package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c implements v {

    /* renamed from: a, reason: collision with root package name */
    public final int f14135a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f14136b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f14137c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f14138d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f14139e;
    private final long f;

    public c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f14136b = iArr;
        this.f14137c = jArr;
        this.f14138d = jArr2;
        this.f14139e = jArr3;
        int length = iArr.length;
        this.f14135a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return true;
    }

    public int b(long j10) {
        return ai.a(this.f14139e, j10, true, true);
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f14135a + ", sizes=" + Arrays.toString(this.f14136b) + ", offsets=" + Arrays.toString(this.f14137c) + ", timeUs=" + Arrays.toString(this.f14139e) + ", durationsUs=" + Arrays.toString(this.f14138d) + ")";
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j10) {
        int b10 = b(j10);
        w wVar = new w(this.f14139e[b10], this.f14137c[b10]);
        if (wVar.f14943b < j10 && b10 != this.f14135a - 1) {
            int i10 = b10 + 1;
            return new v.a(wVar, new w(this.f14139e[i10], this.f14137c[i10]));
        }
        return new v.a(wVar);
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f;
    }
}
