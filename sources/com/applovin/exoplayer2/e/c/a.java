package com.applovin.exoplayer2.e.c;

import com.anythink.expressad.exoplayer.k.o;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.b.a;
import com.applovin.exoplayer2.e.c.d;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f14140b = {5512, 11025, 22050, 44100};

    /* renamed from: c, reason: collision with root package name */
    private boolean f14141c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14142d;

    /* renamed from: e, reason: collision with root package name */
    private int f14143e;

    public a(x xVar) {
        super(xVar);
    }

    @Override // com.applovin.exoplayer2.e.c.d
    public boolean a(y yVar) throws d.a {
        if (!this.f14141c) {
            int h10 = yVar.h();
            int i10 = (h10 >> 4) & 15;
            this.f14143e = i10;
            if (i10 == 2) {
                this.f14162a.a(new v.a().f(o.f9085t).k(1).l(f14140b[(h10 >> 2) & 3]).a());
                this.f14142d = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f14162a.a(new v.a().f(i10 == 7 ? o.f9089x : o.y).k(1).l(8000).a());
                this.f14142d = true;
            } else if (i10 != 10) {
                throw new d.a("Audio format not supported: " + this.f14143e);
            }
            this.f14141c = true;
        } else {
            yVar.e(1);
        }
        return true;
    }

    @Override // com.applovin.exoplayer2.e.c.d
    public boolean a(y yVar, long j10) throws ai {
        if (this.f14143e == 2) {
            int a10 = yVar.a();
            this.f14162a.a(yVar, a10);
            this.f14162a.a(j10, 1, a10, 0, null);
            return true;
        }
        int h10 = yVar.h();
        if (h10 == 0 && !this.f14142d) {
            int a11 = yVar.a();
            byte[] bArr = new byte[a11];
            yVar.a(bArr, 0, a11);
            a.C0152a a12 = com.applovin.exoplayer2.b.a.a(bArr);
            this.f14162a.a(new v.a().f(o.f9083r).d(a12.f13331c).k(a12.f13330b).l(a12.f13329a).a(Collections.singletonList(bArr)).a());
            this.f14142d = true;
            return false;
        }
        if (this.f14143e == 10 && h10 != 1) {
            return false;
        }
        int a13 = yVar.a();
        this.f14162a.a(yVar, a13);
        this.f14162a.a(j10, 1, a13, 0, null);
        return true;
    }
}
