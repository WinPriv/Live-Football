package com.applovin.exoplayer2.e.c;

import a3.l;
import com.anythink.expressad.exoplayer.k.o;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.c.d;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.v;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: b, reason: collision with root package name */
    private final y f14163b;

    /* renamed from: c, reason: collision with root package name */
    private final y f14164c;

    /* renamed from: d, reason: collision with root package name */
    private int f14165d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14166e;
    private boolean f;

    /* renamed from: g, reason: collision with root package name */
    private int f14167g;

    public e(x xVar) {
        super(xVar);
        this.f14163b = new y(v.f16336a);
        this.f14164c = new y(4);
    }

    @Override // com.applovin.exoplayer2.e.c.d
    public boolean a(y yVar) throws d.a {
        int h10 = yVar.h();
        int i10 = (h10 >> 4) & 15;
        int i11 = h10 & 15;
        if (i11 == 7) {
            this.f14167g = i10;
            return i10 != 5;
        }
        throw new d.a(l.i("Video format not supported: ", i11));
    }

    @Override // com.applovin.exoplayer2.e.c.d
    public boolean a(y yVar, long j10) throws ai {
        int h10 = yVar.h();
        long n10 = (yVar.n() * 1000) + j10;
        if (h10 == 0 && !this.f14166e) {
            y yVar2 = new y(new byte[yVar.a()]);
            yVar.a(yVar2.d(), 0, yVar.a());
            com.applovin.exoplayer2.m.a a10 = com.applovin.exoplayer2.m.a.a(yVar2);
            this.f14165d = a10.f16382b;
            this.f14162a.a(new v.a().f(o.f9074h).d(a10.f).g(a10.f16383c).h(a10.f16384d).b(a10.f16385e).a(a10.f16381a).a());
            this.f14166e = true;
            return false;
        }
        if (h10 != 1 || !this.f14166e) {
            return false;
        }
        int i10 = this.f14167g == 1 ? 1 : 0;
        if (!this.f && i10 == 0) {
            return false;
        }
        byte[] d10 = this.f14164c.d();
        d10[0] = 0;
        d10[1] = 0;
        d10[2] = 0;
        int i11 = 4 - this.f14165d;
        int i12 = 0;
        while (yVar.a() > 0) {
            yVar.a(this.f14164c.d(), i11, this.f14165d);
            this.f14164c.d(0);
            int w10 = this.f14164c.w();
            this.f14163b.d(0);
            this.f14162a.a(this.f14163b, 4);
            this.f14162a.a(yVar, w10);
            i12 = i12 + 4 + w10;
        }
        this.f14162a.a(n10, i10, i12, 0, null);
        this.f = true;
        return true;
    }
}
