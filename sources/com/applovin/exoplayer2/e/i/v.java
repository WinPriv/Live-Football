package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    private boolean f14841c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14842d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14843e;

    /* renamed from: a, reason: collision with root package name */
    private final ag f14839a = new ag(0);
    private long f = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: g, reason: collision with root package name */
    private long f14844g = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: h, reason: collision with root package name */
    private long f14845h = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f14840b = new com.applovin.exoplayer2.l.y();

    public boolean a() {
        return this.f14841c;
    }

    public ag b() {
        return this.f14839a;
    }

    public long c() {
        return this.f14845h;
    }

    private int b(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        int min = (int) Math.min(20000L, iVar.d());
        long j10 = 0;
        if (iVar.c() != j10) {
            uVar.f14937a = j10;
            return 1;
        }
        this.f14840b.a(min);
        iVar.a();
        iVar.d(this.f14840b.d(), 0, min);
        this.f = b(this.f14840b);
        this.f14842d = true;
        return 0;
    }

    private int c(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        long d10 = iVar.d();
        int min = (int) Math.min(20000L, d10);
        long j10 = d10 - min;
        if (iVar.c() != j10) {
            uVar.f14937a = j10;
            return 1;
        }
        this.f14840b.a(min);
        iVar.a();
        iVar.d(this.f14840b.d(), 0, min);
        this.f14844g = c(this.f14840b);
        this.f14843e = true;
        return 0;
    }

    public int a(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        if (!this.f14843e) {
            return c(iVar, uVar);
        }
        if (this.f14844g == com.anythink.expressad.exoplayer.b.f7291b) {
            return a(iVar);
        }
        if (!this.f14842d) {
            return b(iVar, uVar);
        }
        long j10 = this.f;
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            return a(iVar);
        }
        long b10 = this.f14839a.b(this.f14844g) - this.f14839a.b(j10);
        this.f14845h = b10;
        if (b10 < 0) {
            com.applovin.exoplayer2.l.q.c("PsDurationReader", "Invalid duration: " + this.f14845h + ". Using TIME_UNSET instead.");
            this.f14845h = com.anythink.expressad.exoplayer.b.f7291b;
        }
        return a(iVar);
    }

    private long b(com.applovin.exoplayer2.l.y yVar) {
        int b10 = yVar.b();
        for (int c10 = yVar.c(); c10 < b10 - 3; c10++) {
            if (a(yVar.d(), c10) == 442) {
                yVar.d(c10 + 4);
                long a10 = a(yVar);
                if (a10 != com.anythink.expressad.exoplayer.b.f7291b) {
                    return a10;
                }
            }
        }
        return com.anythink.expressad.exoplayer.b.f7291b;
    }

    private long c(com.applovin.exoplayer2.l.y yVar) {
        int c10 = yVar.c();
        for (int b10 = yVar.b() - 4; b10 >= c10; b10--) {
            if (a(yVar.d(), b10) == 442) {
                yVar.d(b10 + 4);
                long a10 = a(yVar);
                if (a10 != com.anythink.expressad.exoplayer.b.f7291b) {
                    return a10;
                }
            }
        }
        return com.anythink.expressad.exoplayer.b.f7291b;
    }

    private static long b(byte[] bArr) {
        byte b10 = bArr[0];
        long j10 = (((b10 & 56) >> 3) << 30) | ((b10 & 3) << 28) | ((bArr[1] & 255) << 20);
        byte b11 = bArr[2];
        return j10 | (((b11 & 248) >> 3) << 15) | ((b11 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public static long a(com.applovin.exoplayer2.l.y yVar) {
        int c10 = yVar.c();
        if (yVar.a() < 9) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        byte[] bArr = new byte[9];
        yVar.a(bArr, 0, 9);
        yVar.d(c10);
        return !a(bArr) ? com.anythink.expressad.exoplayer.b.f7291b : b(bArr);
    }

    private int a(com.applovin.exoplayer2.e.i iVar) {
        this.f14840b.a(ai.f);
        this.f14841c = true;
        iVar.a();
        return 0;
    }

    private int a(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & DefaultClassResolver.NAME) | ((bArr[i10] & DefaultClassResolver.NAME) << 24) | ((bArr[i10 + 1] & DefaultClassResolver.NAME) << 16) | ((bArr[i10 + 2] & DefaultClassResolver.NAME) << 8);
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }
}
