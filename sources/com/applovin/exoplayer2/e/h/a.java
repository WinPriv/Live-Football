package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.e.k;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.l.ai;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    private final e f14478a;

    /* renamed from: b, reason: collision with root package name */
    private final long f14479b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14480c;

    /* renamed from: d, reason: collision with root package name */
    private final h f14481d;

    /* renamed from: e, reason: collision with root package name */
    private int f14482e;
    private long f;

    /* renamed from: g, reason: collision with root package name */
    private long f14483g;

    /* renamed from: h, reason: collision with root package name */
    private long f14484h;

    /* renamed from: i, reason: collision with root package name */
    private long f14485i;

    /* renamed from: j, reason: collision with root package name */
    private long f14486j;

    /* renamed from: k, reason: collision with root package name */
    private long f14487k;

    /* renamed from: l, reason: collision with root package name */
    private long f14488l;

    /* renamed from: com.applovin.exoplayer2.e.h.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0168a implements v {
        private C0168a() {
        }

        @Override // com.applovin.exoplayer2.e.v
        public boolean a() {
            return true;
        }

        @Override // com.applovin.exoplayer2.e.v
        public long b() {
            return a.this.f14481d.a(a.this.f);
        }

        @Override // com.applovin.exoplayer2.e.v
        public v.a a(long j10) {
            long b10 = a.this.f14481d.b(j10);
            return new v.a(new w(j10, ai.a(((((a.this.f14480c - a.this.f14479b) * b10) / a.this.f) + a.this.f14479b) - 30000, a.this.f14479b, a.this.f14480c - 1)));
        }
    }

    public a(h hVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        com.applovin.exoplayer2.l.a.a(z11);
        this.f14481d = hVar;
        this.f14479b = j10;
        this.f14480c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.f14482e = 0;
        } else {
            this.f = j13;
            this.f14482e = 4;
        }
        this.f14478a = new e();
    }

    private long c(com.applovin.exoplayer2.e.i iVar) throws IOException {
        if (this.f14485i == this.f14486j) {
            return -1L;
        }
        long c10 = iVar.c();
        if (!this.f14478a.a(iVar, this.f14486j)) {
            long j10 = this.f14485i;
            if (j10 != c10) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f14478a.a(iVar, false);
        iVar.a();
        long j11 = this.f14484h;
        e eVar = this.f14478a;
        long j12 = eVar.f14507c;
        long j13 = j11 - j12;
        int i10 = eVar.f14511h + eVar.f14512i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f14486j = c10;
            this.f14488l = j12;
        } else {
            this.f14485i = iVar.c() + i10;
            this.f14487k = this.f14478a.f14507c;
        }
        long j14 = this.f14486j;
        long j15 = this.f14485i;
        if (j14 - j15 < 100000) {
            this.f14486j = j15;
            return j15;
        }
        long c11 = iVar.c() - (i10 * (j13 <= 0 ? 2L : 1L));
        long j16 = this.f14486j;
        long j17 = this.f14485i;
        return ai.a((((j16 - j17) * j13) / (this.f14488l - this.f14487k)) + c11, j17, j16 - 1);
    }

    private void d(com.applovin.exoplayer2.e.i iVar) throws IOException {
        while (true) {
            this.f14478a.a(iVar);
            this.f14478a.a(iVar, false);
            e eVar = this.f14478a;
            if (eVar.f14507c > this.f14484h) {
                iVar.a();
                return;
            } else {
                iVar.b(eVar.f14511h + eVar.f14512i);
                this.f14485i = iVar.c();
                this.f14487k = this.f14478a.f14507c;
            }
        }
    }

    @Override // com.applovin.exoplayer2.e.h.f
    public long a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        int i10 = this.f14482e;
        if (i10 == 0) {
            long c10 = iVar.c();
            this.f14483g = c10;
            this.f14482e = 1;
            long j10 = this.f14480c - 65307;
            if (j10 > c10) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long c11 = c(iVar);
                if (c11 != -1) {
                    return c11;
                }
                this.f14482e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            d(iVar);
            this.f14482e = 4;
            return -(this.f14487k + 2);
        }
        this.f = b(iVar);
        this.f14482e = 4;
        return this.f14483g;
    }

    public long b(com.applovin.exoplayer2.e.i iVar) throws IOException {
        this.f14478a.a();
        if (this.f14478a.a(iVar)) {
            this.f14478a.a(iVar, false);
            e eVar = this.f14478a;
            iVar.b(eVar.f14511h + eVar.f14512i);
            long j10 = this.f14478a.f14507c;
            while (true) {
                e eVar2 = this.f14478a;
                if ((eVar2.f14506b & 4) == 4 || !eVar2.a(iVar) || iVar.c() >= this.f14480c || !this.f14478a.a(iVar, true)) {
                    break;
                }
                e eVar3 = this.f14478a;
                if (!k.a(iVar, eVar3.f14511h + eVar3.f14512i)) {
                    break;
                }
                j10 = this.f14478a.f14507c;
            }
            return j10;
        }
        throw new EOFException();
    }

    @Override // com.applovin.exoplayer2.e.h.f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0168a b() {
        if (this.f != 0) {
            return new C0168a();
        }
        return null;
    }

    @Override // com.applovin.exoplayer2.e.h.f
    public void a(long j10) {
        this.f14484h = ai.a(j10, 0L, this.f - 1);
        this.f14482e = 2;
        this.f14485i = this.f14479b;
        this.f14486j = this.f14480c;
        this.f14487k = 0L;
        this.f14488l = this.f;
    }
}
