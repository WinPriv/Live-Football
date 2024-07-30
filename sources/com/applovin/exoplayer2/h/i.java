package com.applovin.exoplayer2.h;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class i implements com.applovin.exoplayer2.k.i {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.i f15348a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15349b;

    /* renamed from: c, reason: collision with root package name */
    private final a f15350c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f15351d;

    /* renamed from: e, reason: collision with root package name */
    private int f15352e;

    /* loaded from: classes.dex */
    public interface a {
        void a(com.applovin.exoplayer2.l.y yVar);
    }

    public i(com.applovin.exoplayer2.k.i iVar, int i10, a aVar) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.a(z10);
        this.f15348a = iVar;
        this.f15349b = i10;
        this.f15350c = aVar;
        this.f15351d = new byte[1];
        this.f15352e = i10;
    }

    private boolean d() throws IOException {
        if (this.f15348a.a(this.f15351d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f15351d[0] & com.anythink.expressad.exoplayer.k.p.f9095b) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int a10 = this.f15348a.a(bArr, i12, i11);
            if (a10 == -1) {
                return false;
            }
            i12 += a10;
            i11 -= a10;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f15350c.a(new com.applovin.exoplayer2.l.y(bArr, i10));
        }
        return true;
    }

    @Override // com.applovin.exoplayer2.k.i
    public void a(com.applovin.exoplayer2.k.aa aaVar) {
        com.applovin.exoplayer2.l.a.b(aaVar);
        this.f15348a.a(aaVar);
    }

    @Override // com.applovin.exoplayer2.k.i
    public Map<String, List<String>> b() {
        return this.f15348a.b();
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(com.applovin.exoplayer2.k.l lVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f15352e == 0) {
            if (!d()) {
                return -1;
            }
            this.f15352e = this.f15349b;
        }
        int a10 = this.f15348a.a(bArr, i10, Math.min(this.f15352e, i11));
        if (a10 != -1) {
            this.f15352e -= a10;
        }
        return a10;
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        return this.f15348a.a();
    }
}
