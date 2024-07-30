package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.a;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u extends com.applovin.exoplayer2.e.a {

    /* loaded from: classes.dex */
    public static final class a implements a.f {

        /* renamed from: a, reason: collision with root package name */
        private final ag f14837a;

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.exoplayer2.l.y f14838b;

        @Override // com.applovin.exoplayer2.e.a.f
        public a.e a(com.applovin.exoplayer2.e.i iVar, long j10) throws IOException {
            long c10 = iVar.c();
            int min = (int) Math.min(20000L, iVar.d() - c10);
            this.f14838b.a(min);
            iVar.d(this.f14838b.d(), 0, min);
            return a(this.f14838b, j10, c10);
        }

        private a(ag agVar) {
            this.f14837a = agVar;
            this.f14838b = new com.applovin.exoplayer2.l.y();
        }

        @Override // com.applovin.exoplayer2.e.a.f
        public void a() {
            this.f14838b.a(ai.f);
        }

        private a.e a(com.applovin.exoplayer2.l.y yVar, long j10, long j11) {
            int i10 = -1;
            int i11 = -1;
            long j12 = -9223372036854775807L;
            while (yVar.a() >= 4) {
                if (u.b(yVar.d(), yVar.c()) != 442) {
                    yVar.e(1);
                } else {
                    yVar.e(4);
                    long a10 = v.a(yVar);
                    if (a10 != com.anythink.expressad.exoplayer.b.f7291b) {
                        long b10 = this.f14837a.b(a10);
                        if (b10 > j10) {
                            if (j12 == com.anythink.expressad.exoplayer.b.f7291b) {
                                return a.e.a(b10, j11);
                            }
                            return a.e.a(j11 + i11);
                        }
                        if (100000 + b10 > j10) {
                            return a.e.a(j11 + yVar.c());
                        }
                        i11 = yVar.c();
                        j12 = b10;
                    }
                    a(yVar);
                    i10 = yVar.c();
                }
            }
            if (j12 != com.anythink.expressad.exoplayer.b.f7291b) {
                return a.e.b(j12, j11 + i10);
            }
            return a.e.f14114a;
        }

        private static void a(com.applovin.exoplayer2.l.y yVar) {
            int b10;
            int b11 = yVar.b();
            if (yVar.a() < 10) {
                yVar.d(b11);
                return;
            }
            yVar.e(9);
            int h10 = yVar.h() & 7;
            if (yVar.a() < h10) {
                yVar.d(b11);
                return;
            }
            yVar.e(h10);
            if (yVar.a() >= 4) {
                if (u.b(yVar.d(), yVar.c()) == 443) {
                    yVar.e(4);
                    int i10 = yVar.i();
                    if (yVar.a() < i10) {
                        yVar.d(b11);
                        return;
                    }
                    yVar.e(i10);
                }
                while (yVar.a() >= 4 && (b10 = u.b(yVar.d(), yVar.c())) != 442 && b10 != 441 && (b10 >>> 8) == 1) {
                    yVar.e(4);
                    if (yVar.a() < 2) {
                        yVar.d(b11);
                        return;
                    }
                    yVar.d(Math.min(yVar.b(), yVar.c() + yVar.i()));
                }
                return;
            }
            yVar.d(b11);
        }
    }

    public u(ag agVar, long j10, long j11) {
        super(new a.b(), new a(agVar), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & DefaultClassResolver.NAME) | ((bArr[i10] & DefaultClassResolver.NAME) << 24) | ((bArr[i10 + 1] & DefaultClassResolver.NAME) << 16) | ((bArr[i10 + 2] & DefaultClassResolver.NAME) << 8);
    }
}
