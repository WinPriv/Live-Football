package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.l.ai;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final k f14470a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14471b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f14472c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f14473d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14474e;
    public final long[] f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f14475g;

    /* renamed from: h, reason: collision with root package name */
    public final long f14476h;

    public n(k kVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        boolean z10;
        boolean z11;
        if (iArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.a(z10);
        if (jArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        com.applovin.exoplayer2.l.a.a(z11);
        com.applovin.exoplayer2.l.a.a(iArr2.length == jArr2.length);
        this.f14470a = kVar;
        this.f14472c = jArr;
        this.f14473d = iArr;
        this.f14474e = i10;
        this.f = jArr2;
        this.f14475g = iArr2;
        this.f14476h = j10;
        this.f14471b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int a10 = ai.a(this.f, j10, true, false); a10 >= 0; a10--) {
            if ((this.f14475g[a10] & 1) != 0) {
                return a10;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int b10 = ai.b(this.f, j10, true, false); b10 < this.f.length; b10++) {
            if ((this.f14475g[b10] & 1) != 0) {
                return b10;
            }
        }
        return -1;
    }
}
