package com.applovin.exoplayer2.m.a;

import android.media.MediaFormat;
import com.applovin.exoplayer2.l.af;
import com.applovin.exoplayer2.m.l;
import com.applovin.exoplayer2.v;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class h implements a, l {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f16414a;

    /* renamed from: b, reason: collision with root package name */
    private final c f16415b;

    /* renamed from: c, reason: collision with root package name */
    private final af<Long> f16416c;

    /* renamed from: d, reason: collision with root package name */
    private final af<e> f16417d;

    /* renamed from: e, reason: collision with root package name */
    private volatile int f16418e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f16419g;

    public void a(int i10) {
        this.f16418e = i10;
    }

    @Override // com.applovin.exoplayer2.m.l
    public void a(long j10, long j11, v vVar, MediaFormat mediaFormat) {
        this.f16416c.a(j11, (long) Long.valueOf(j10));
        a(vVar.f16847v, vVar.f16848w, j11);
    }

    @Override // com.applovin.exoplayer2.m.a.a
    public void a(long j10, float[] fArr) {
        this.f16415b.a(j10, fArr);
    }

    @Override // com.applovin.exoplayer2.m.a.a
    public void a() {
        this.f16416c.a();
        this.f16415b.a();
        this.f16414a.set(true);
    }

    private void a(byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.f16419g;
        int i11 = this.f;
        this.f16419g = bArr;
        if (i10 == -1) {
            i10 = this.f16418e;
        }
        this.f = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.f16419g)) {
            return;
        }
        byte[] bArr3 = this.f16419g;
        e a10 = bArr3 != null ? f.a(bArr3, this.f) : null;
        if (a10 == null || !g.a(a10)) {
            a10 = e.a(this.f);
        }
        this.f16417d.a(j10, (long) a10);
    }
}
