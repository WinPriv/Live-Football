package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.a;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class aa extends com.applovin.exoplayer2.e.a {
    public aa(ag agVar, long j10, long j11, int i10, int i11) {
        super(new a.b(), new a(i10, agVar, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }

    /* loaded from: classes.dex */
    public static final class a implements a.f {

        /* renamed from: a, reason: collision with root package name */
        private final ag f14545a;

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.exoplayer2.l.y f14546b = new com.applovin.exoplayer2.l.y();

        /* renamed from: c, reason: collision with root package name */
        private final int f14547c;

        /* renamed from: d, reason: collision with root package name */
        private final int f14548d;

        public a(int i10, ag agVar, int i11) {
            this.f14547c = i10;
            this.f14545a = agVar;
            this.f14548d = i11;
        }

        @Override // com.applovin.exoplayer2.e.a.f
        public a.e a(com.applovin.exoplayer2.e.i iVar, long j10) throws IOException {
            long c10 = iVar.c();
            int min = (int) Math.min(this.f14548d, iVar.d() - c10);
            this.f14546b.a(min);
            iVar.d(this.f14546b.d(), 0, min);
            return a(this.f14546b, j10, c10);
        }

        private a.e a(com.applovin.exoplayer2.l.y yVar, long j10, long j11) {
            int a10;
            int a11;
            int b10 = yVar.b();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (yVar.a() >= 188 && (a11 = (a10 = ae.a(yVar.d(), yVar.c(), b10)) + 188) <= b10) {
                long a12 = ae.a(yVar, a10, this.f14547c);
                if (a12 != com.anythink.expressad.exoplayer.b.f7291b) {
                    long b11 = this.f14545a.b(a12);
                    if (b11 > j10) {
                        if (j14 == com.anythink.expressad.exoplayer.b.f7291b) {
                            return a.e.a(b11, j11);
                        }
                        return a.e.a(j11 + j13);
                    }
                    if (100000 + b11 > j10) {
                        return a.e.a(j11 + a10);
                    }
                    j13 = a10;
                    j14 = b11;
                }
                yVar.d(a11);
                j12 = a11;
            }
            if (j14 != com.anythink.expressad.exoplayer.b.f7291b) {
                return a.e.b(j14, j11 + j12);
            }
            return a.e.f14114a;
        }

        @Override // com.applovin.exoplayer2.e.a.f
        public void a() {
            this.f14546b.a(ai.f);
        }
    }
}
