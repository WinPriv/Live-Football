package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    private final int f14549a;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14552d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14553e;
    private boolean f;

    /* renamed from: b, reason: collision with root package name */
    private final ag f14550b = new ag(0);

    /* renamed from: g, reason: collision with root package name */
    private long f14554g = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: h, reason: collision with root package name */
    private long f14555h = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: i, reason: collision with root package name */
    private long f14556i = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f14551c = new com.applovin.exoplayer2.l.y();

    public ab(int i10) {
        this.f14549a = i10;
    }

    public boolean a() {
        return this.f14552d;
    }

    public long b() {
        return this.f14556i;
    }

    public ag c() {
        return this.f14550b;
    }

    private int b(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar, int i10) throws IOException {
        int min = (int) Math.min(this.f14549a, iVar.d());
        long j10 = 0;
        if (iVar.c() != j10) {
            uVar.f14937a = j10;
            return 1;
        }
        this.f14551c.a(min);
        iVar.a();
        iVar.d(this.f14551c.d(), 0, min);
        this.f14554g = a(this.f14551c, i10);
        this.f14553e = true;
        return 0;
    }

    private int c(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar, int i10) throws IOException {
        long d10 = iVar.d();
        int min = (int) Math.min(this.f14549a, d10);
        long j10 = d10 - min;
        if (iVar.c() != j10) {
            uVar.f14937a = j10;
            return 1;
        }
        this.f14551c.a(min);
        iVar.a();
        iVar.d(this.f14551c.d(), 0, min);
        this.f14555h = b(this.f14551c, i10);
        this.f = true;
        return 0;
    }

    public int a(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar, int i10) throws IOException {
        if (i10 <= 0) {
            return a(iVar);
        }
        if (!this.f) {
            return c(iVar, uVar, i10);
        }
        if (this.f14555h == com.anythink.expressad.exoplayer.b.f7291b) {
            return a(iVar);
        }
        if (!this.f14553e) {
            return b(iVar, uVar, i10);
        }
        long j10 = this.f14554g;
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            return a(iVar);
        }
        long b10 = this.f14550b.b(this.f14555h) - this.f14550b.b(j10);
        this.f14556i = b10;
        if (b10 < 0) {
            com.applovin.exoplayer2.l.q.c("TsDurationReader", "Invalid duration: " + this.f14556i + ". Using TIME_UNSET instead.");
            this.f14556i = com.anythink.expressad.exoplayer.b.f7291b;
        }
        return a(iVar);
    }

    private long b(com.applovin.exoplayer2.l.y yVar, int i10) {
        int c10 = yVar.c();
        int b10 = yVar.b();
        for (int i11 = b10 - 188; i11 >= c10; i11--) {
            if (ae.a(yVar.d(), c10, b10, i11)) {
                long a10 = ae.a(yVar, i11, i10);
                if (a10 != com.anythink.expressad.exoplayer.b.f7291b) {
                    return a10;
                }
            }
        }
        return com.anythink.expressad.exoplayer.b.f7291b;
    }

    private int a(com.applovin.exoplayer2.e.i iVar) {
        this.f14551c.a(ai.f);
        this.f14552d = true;
        iVar.a();
        return 0;
    }

    private long a(com.applovin.exoplayer2.l.y yVar, int i10) {
        int b10 = yVar.b();
        for (int c10 = yVar.c(); c10 < b10; c10++) {
            if (yVar.d()[c10] == 71) {
                long a10 = ae.a(yVar, c10, i10);
                if (a10 != com.anythink.expressad.exoplayer.b.f7291b) {
                    return a10;
                }
            }
        }
        return com.anythink.expressad.exoplayer.b.f7291b;
    }
}
