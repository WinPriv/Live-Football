package com.applovin.exoplayer2.e.b;

import com.applovin.exoplayer2.a.x;
import com.applovin.exoplayer2.e.a;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.m;
import com.applovin.exoplayer2.e.p;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends com.applovin.exoplayer2.e.a {

    /* renamed from: com.applovin.exoplayer2.e.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0164a implements a.f {

        /* renamed from: a, reason: collision with root package name */
        private final p f14118a;

        /* renamed from: b, reason: collision with root package name */
        private final int f14119b;

        /* renamed from: c, reason: collision with root package name */
        private final m.a f14120c;

        @Override // com.applovin.exoplayer2.e.a.f
        public a.e a(i iVar, long j10) throws IOException {
            long c10 = iVar.c();
            long a10 = a(iVar);
            long b10 = iVar.b();
            iVar.c(Math.max(6, this.f14118a.f14917c));
            long a11 = a(iVar);
            long b11 = iVar.b();
            if (a10 <= j10 && a11 > j10) {
                return a.e.a(b10);
            }
            if (a11 <= j10) {
                return a.e.b(a11, b11);
            }
            return a.e.a(a10, c10);
        }

        private C0164a(p pVar, int i10) {
            this.f14118a = pVar;
            this.f14119b = i10;
            this.f14120c = new m.a();
        }

        private long a(i iVar) throws IOException {
            while (iVar.b() < iVar.d() - 6 && !m.a(iVar, this.f14118a, this.f14119b, this.f14120c)) {
                iVar.c(1);
            }
            if (iVar.b() >= iVar.d() - 6) {
                iVar.c((int) (iVar.d() - iVar.b()));
                return this.f14118a.f14923j;
            }
            return this.f14120c.f14911a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p pVar, int i10, long j10, long j11) {
        super(new x(pVar, 1), new C0164a(pVar, i10), pVar.a(), 0L, pVar.f14923j, j10, j11, pVar.b(), Math.max(6, pVar.f14917c));
        Objects.requireNonNull(pVar);
    }
}
