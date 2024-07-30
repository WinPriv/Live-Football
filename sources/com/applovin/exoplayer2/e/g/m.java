package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.l.y;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public c f14453a;

    /* renamed from: b, reason: collision with root package name */
    public long f14454b;

    /* renamed from: c, reason: collision with root package name */
    public long f14455c;

    /* renamed from: d, reason: collision with root package name */
    public long f14456d;

    /* renamed from: e, reason: collision with root package name */
    public int f14457e;
    public int f;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14464m;
    public l o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14467q;

    /* renamed from: r, reason: collision with root package name */
    public long f14468r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f14469s;

    /* renamed from: g, reason: collision with root package name */
    public long[] f14458g = new long[0];

    /* renamed from: h, reason: collision with root package name */
    public int[] f14459h = new int[0];

    /* renamed from: i, reason: collision with root package name */
    public int[] f14460i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    public int[] f14461j = new int[0];

    /* renamed from: k, reason: collision with root package name */
    public long[] f14462k = new long[0];

    /* renamed from: l, reason: collision with root package name */
    public boolean[] f14463l = new boolean[0];

    /* renamed from: n, reason: collision with root package name */
    public boolean[] f14465n = new boolean[0];

    /* renamed from: p, reason: collision with root package name */
    public final y f14466p = new y();

    public void a() {
        this.f14457e = 0;
        this.f14468r = 0L;
        this.f14469s = false;
        this.f14464m = false;
        this.f14467q = false;
        this.o = null;
    }

    public long b(int i10) {
        return this.f14462k[i10] + this.f14461j[i10];
    }

    public boolean c(int i10) {
        if (this.f14464m && this.f14465n[i10]) {
            return true;
        }
        return false;
    }

    public void a(int i10, int i11) {
        this.f14457e = i10;
        this.f = i11;
        if (this.f14459h.length < i10) {
            this.f14458g = new long[i10];
            this.f14459h = new int[i10];
        }
        if (this.f14460i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f14460i = new int[i12];
            this.f14461j = new int[i12];
            this.f14462k = new long[i12];
            this.f14463l = new boolean[i12];
            this.f14465n = new boolean[i12];
        }
    }

    public void a(int i10) {
        this.f14466p.a(i10);
        this.f14464m = true;
        this.f14467q = true;
    }

    public void a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        iVar.b(this.f14466p.d(), 0, this.f14466p.b());
        this.f14466p.d(0);
        this.f14467q = false;
    }

    public void a(y yVar) {
        yVar.a(this.f14466p.d(), 0, this.f14466p.b());
        this.f14466p.d(0);
        this.f14467q = false;
    }
}
