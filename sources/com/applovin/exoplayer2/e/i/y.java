package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;

/* loaded from: classes.dex */
public final class y implements ad {

    /* renamed from: a, reason: collision with root package name */
    private final x f14864a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f14865b = new com.applovin.exoplayer2.l.y(32);

    /* renamed from: c, reason: collision with root package name */
    private int f14866c;

    /* renamed from: d, reason: collision with root package name */
    private int f14867d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14868e;
    private boolean f;

    public y(x xVar) {
        this.f14864a = xVar;
    }

    @Override // com.applovin.exoplayer2.e.i.ad
    public void a(ag agVar, com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        this.f14864a.a(agVar, jVar, dVar);
        this.f = true;
    }

    @Override // com.applovin.exoplayer2.e.i.ad
    public void a() {
        this.f = true;
    }

    @Override // com.applovin.exoplayer2.e.i.ad
    public void a(com.applovin.exoplayer2.l.y yVar, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int c10 = z10 ? yVar.c() + yVar.h() : -1;
        if (this.f) {
            if (!z10) {
                return;
            }
            this.f = false;
            yVar.d(c10);
            this.f14867d = 0;
        }
        while (yVar.a() > 0) {
            int i11 = this.f14867d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int h10 = yVar.h();
                    yVar.d(yVar.c() - 1);
                    if (h10 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(yVar.a(), 3 - this.f14867d);
                yVar.a(this.f14865b.d(), this.f14867d, min);
                int i12 = this.f14867d + min;
                this.f14867d = i12;
                if (i12 == 3) {
                    this.f14865b.d(0);
                    this.f14865b.c(3);
                    this.f14865b.e(1);
                    int h11 = this.f14865b.h();
                    int h12 = this.f14865b.h();
                    this.f14868e = (h11 & 128) != 0;
                    this.f14866c = (((h11 & 15) << 8) | h12) + 3;
                    int e10 = this.f14865b.e();
                    int i13 = this.f14866c;
                    if (e10 < i13) {
                        this.f14865b.b(Math.min(4098, Math.max(i13, this.f14865b.e() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(yVar.a(), this.f14866c - this.f14867d);
                yVar.a(this.f14865b.d(), this.f14867d, min2);
                int i14 = this.f14867d + min2;
                this.f14867d = i14;
                int i15 = this.f14866c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.f14868e) {
                        if (ai.a(this.f14865b.d(), 0, this.f14866c, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        this.f14865b.c(this.f14866c - 4);
                    } else {
                        this.f14865b.c(i15);
                    }
                    this.f14865b.d(0);
                    this.f14864a.a(this.f14865b);
                    this.f14867d = 0;
                }
            }
        }
    }
}
