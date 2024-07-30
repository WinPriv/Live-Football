package com.anythink.expressad.exoplayer.e.a;

import com.anythink.expressad.exoplayer.k.af;

/* loaded from: classes.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    public final j f7923a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7924b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f7925c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f7926d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7927e;
    public final long[] f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f7928g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7929h;

    public m(j jVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        boolean z10;
        boolean z11;
        if (iArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.anythink.expressad.exoplayer.k.a.a(z10);
        if (jArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        com.anythink.expressad.exoplayer.k.a.a(z11);
        com.anythink.expressad.exoplayer.k.a.a(iArr2.length == jArr2.length);
        this.f7923a = jVar;
        this.f7925c = jArr;
        this.f7926d = iArr;
        this.f7927e = i10;
        this.f = jArr2;
        this.f7928g = iArr2;
        this.f7929h = j10;
        this.f7924b = jArr.length;
    }

    public final int a(long j10) {
        for (int a10 = af.a(this.f, j10, false); a10 >= 0; a10--) {
            if ((this.f7928g[a10] & 1) != 0) {
                return a10;
            }
        }
        return -1;
    }

    public final int b(long j10) {
        for (int a10 = af.a(this.f, j10, true, false); a10 < this.f.length; a10++) {
            if ((this.f7928g[a10] & 1) != 0) {
                return a10;
            }
        }
        return -1;
    }
}
