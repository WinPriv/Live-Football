package com.anythink.expressad.exoplayer.e;

import com.anythink.expressad.exoplayer.e.k;
import com.anythink.expressad.exoplayer.k.af;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: a, reason: collision with root package name */
    public final int f7731a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f7732b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f7733c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f7734d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f7735e;
    private final long f;

    public a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f7732b = iArr;
        this.f7733c = jArr;
        this.f7734d = jArr2;
        this.f7735e = jArr3;
        int length = iArr.length;
        this.f7731a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    private int b(long j10) {
        return af.a(this.f7735e, j10, true);
    }

    @Override // com.anythink.expressad.exoplayer.e.k
    public final boolean a() {
        return true;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f7731a + ", sizes=" + Arrays.toString(this.f7732b) + ", offsets=" + Arrays.toString(this.f7733c) + ", timeUs=" + Arrays.toString(this.f7735e) + ", durationsUs=" + Arrays.toString(this.f7734d) + ")";
    }

    @Override // com.anythink.expressad.exoplayer.e.k
    public final k.a a(long j10) {
        int a10 = af.a(this.f7735e, j10, true);
        l lVar = new l(this.f7735e[a10], this.f7733c[a10]);
        if (lVar.f7956b < j10 && a10 != this.f7731a - 1) {
            int i10 = a10 + 1;
            return new k.a(lVar, new l(this.f7735e[i10], this.f7733c[i10]));
        }
        return new k.a(lVar);
    }

    @Override // com.anythink.expressad.exoplayer.e.k
    public final long b() {
        return this.f;
    }
}
