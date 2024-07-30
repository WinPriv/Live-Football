package com.applovin.exoplayer2.e.h;

import com.anythink.expressad.exoplayer.k.p;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.k;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f14505a;

    /* renamed from: b, reason: collision with root package name */
    public int f14506b;

    /* renamed from: c, reason: collision with root package name */
    public long f14507c;

    /* renamed from: d, reason: collision with root package name */
    public long f14508d;

    /* renamed from: e, reason: collision with root package name */
    public long f14509e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public int f14510g;

    /* renamed from: h, reason: collision with root package name */
    public int f14511h;

    /* renamed from: i, reason: collision with root package name */
    public int f14512i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f14513j = new int[p.f9095b];

    /* renamed from: k, reason: collision with root package name */
    private final y f14514k = new y(p.f9095b);

    public void a() {
        this.f14505a = 0;
        this.f14506b = 0;
        this.f14507c = 0L;
        this.f14508d = 0L;
        this.f14509e = 0L;
        this.f = 0L;
        this.f14510g = 0;
        this.f14511h = 0;
        this.f14512i = 0;
    }

    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        return a(iVar, -1L);
    }

    public boolean a(com.applovin.exoplayer2.e.i iVar, long j10) throws IOException {
        com.applovin.exoplayer2.l.a.a(iVar.c() == iVar.b());
        this.f14514k.a(4);
        while (true) {
            if ((j10 == -1 || iVar.c() + 4 < j10) && k.a(iVar, this.f14514k.d(), 0, 4, true)) {
                this.f14514k.d(0);
                if (this.f14514k.o() == 1332176723) {
                    iVar.a();
                    return true;
                }
                iVar.b(1);
            }
        }
        do {
            if (j10 != -1 && iVar.c() >= j10) {
                break;
            }
        } while (iVar.a(1) != -1);
        return false;
    }

    public boolean a(com.applovin.exoplayer2.e.i iVar, boolean z10) throws IOException {
        a();
        this.f14514k.a(27);
        if (!k.a(iVar, this.f14514k.d(), 0, 27, z10) || this.f14514k.o() != 1332176723) {
            return false;
        }
        int h10 = this.f14514k.h();
        this.f14505a = h10;
        if (h10 != 0) {
            if (z10) {
                return false;
            }
            throw ai.a("unsupported bit stream revision");
        }
        this.f14506b = this.f14514k.h();
        this.f14507c = this.f14514k.t();
        this.f14508d = this.f14514k.p();
        this.f14509e = this.f14514k.p();
        this.f = this.f14514k.p();
        int h11 = this.f14514k.h();
        this.f14510g = h11;
        this.f14511h = h11 + 27;
        this.f14514k.a(h11);
        if (!k.a(iVar, this.f14514k.d(), 0, this.f14510g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f14510g; i10++) {
            this.f14513j[i10] = this.f14514k.h();
            this.f14512i += this.f14513j[i10];
        }
        return true;
    }
}
