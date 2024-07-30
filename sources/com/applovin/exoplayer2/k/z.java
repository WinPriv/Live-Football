package com.applovin.exoplayer2.k;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class z implements i {

    /* renamed from: a, reason: collision with root package name */
    private final i f16238a;

    /* renamed from: b, reason: collision with root package name */
    private long f16239b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f16240c = Uri.EMPTY;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, List<String>> f16241d = Collections.emptyMap();

    public z(i iVar) {
        this.f16238a = (i) com.applovin.exoplayer2.l.a.b(iVar);
    }

    @Override // com.applovin.exoplayer2.k.i
    public void a(aa aaVar) {
        com.applovin.exoplayer2.l.a.b(aaVar);
        this.f16238a.a(aaVar);
    }

    @Override // com.applovin.exoplayer2.k.i
    public Map<String, List<String>> b() {
        return this.f16238a.b();
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() throws IOException {
        this.f16238a.c();
    }

    public long d() {
        return this.f16239b;
    }

    public Uri e() {
        return this.f16240c;
    }

    public Map<String, List<String>> f() {
        return this.f16241d;
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws IOException {
        this.f16240c = lVar.f16095a;
        this.f16241d = Collections.emptyMap();
        long a10 = this.f16238a.a(lVar);
        this.f16240c = (Uri) com.applovin.exoplayer2.l.a.b(a());
        this.f16241d = b();
        return a10;
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i10, int i11) throws IOException {
        int a10 = this.f16238a.a(bArr, i10, i11);
        if (a10 != -1) {
            this.f16239b += a10;
        }
        return a10;
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        return this.f16238a.a();
    }
}
