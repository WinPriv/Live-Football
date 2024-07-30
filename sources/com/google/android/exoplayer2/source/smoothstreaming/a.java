package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import c6.a0;
import c6.c0;
import c6.h0;
import c6.j;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import d6.e0;
import d6.g0;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import k4.i0;
import k4.m1;
import l5.d;
import l5.f;
import l5.i;
import l5.m;
import q5.a;
import x4.e;
import x4.k;
import x4.l;

/* compiled from: DefaultSsChunkSource.java */
/* loaded from: classes2.dex */
public final class a implements com.google.android.exoplayer2.source.smoothstreaming.b {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f20217a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20218b;

    /* renamed from: c, reason: collision with root package name */
    public final f[] f20219c;

    /* renamed from: d, reason: collision with root package name */
    public final j f20220d;

    /* renamed from: e, reason: collision with root package name */
    public b6.f f20221e;
    public q5.a f;

    /* renamed from: g, reason: collision with root package name */
    public int f20222g;

    /* renamed from: h, reason: collision with root package name */
    public j5.b f20223h;

    /* compiled from: DefaultSsChunkSource.java */
    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0234a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public final j.a f20224a;

        public C0234a(j.a aVar) {
            this.f20224a = aVar;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.b.a
        public final a a(c0 c0Var, q5.a aVar, int i10, b6.f fVar, h0 h0Var) {
            j a10 = this.f20224a.a();
            if (h0Var != null) {
                a10.b(h0Var);
            }
            return new a(c0Var, aVar, i10, fVar, a10);
        }
    }

    /* compiled from: DefaultSsChunkSource.java */
    /* loaded from: classes2.dex */
    public static final class b extends l5.b {

        /* renamed from: e, reason: collision with root package name */
        public final a.b f20225e;

        public b(a.b bVar, int i10) {
            super(i10, bVar.f34672k - 1);
            this.f20225e = bVar;
        }

        @Override // l5.m
        public final long a() {
            c();
            return this.f20225e.o[(int) this.f32490d];
        }

        @Override // l5.m
        public final long b() {
            return this.f20225e.b((int) this.f32490d) + a();
        }
    }

    public a(c0 c0Var, q5.a aVar, int i10, b6.f fVar, j jVar) {
        l[] lVarArr;
        int i11;
        this.f20217a = c0Var;
        this.f = aVar;
        this.f20218b = i10;
        this.f20221e = fVar;
        this.f20220d = jVar;
        a.b bVar = aVar.f[i10];
        this.f20219c = new f[fVar.length()];
        int i12 = 0;
        while (i12 < this.f20219c.length) {
            int d10 = fVar.d(i12);
            i0 i0Var = bVar.f34671j[d10];
            if (i0Var.G != null) {
                a.C0462a c0462a = aVar.f34657e;
                c0462a.getClass();
                lVarArr = c0462a.f34662c;
            } else {
                lVarArr = null;
            }
            int i13 = bVar.f34663a;
            if (i13 == 2) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            int i14 = i12;
            this.f20219c[i14] = new d(new e(3, null, new k(d10, i13, bVar.f34665c, com.anythink.expressad.exoplayer.b.f7291b, aVar.f34658g, i0Var, 0, lVarArr, i11, null, null), Collections.emptyList()), bVar.f34663a, i0Var);
            i12 = i14 + 1;
        }
    }

    @Override // l5.h
    public final void a() throws IOException {
        j5.b bVar = this.f20223h;
        if (bVar == null) {
            this.f20217a.a();
            return;
        }
        throw bVar;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public final void b(b6.f fVar) {
        this.f20221e = fVar;
    }

    @Override // l5.h
    public final void c(long j10, long j11, List<? extends l5.l> list, b0.j jVar) {
        int b10;
        long b11;
        long j12;
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f20223h != null) {
            return;
        }
        a.b[] bVarArr = this.f.f;
        int i10 = this.f20218b;
        a.b bVar = bVarArr[i10];
        if (bVar.f34672k == 0) {
            jVar.f2719a = !r1.f34656d;
            return;
        }
        boolean isEmpty = list.isEmpty();
        long[] jArr = bVar.o;
        if (isEmpty) {
            b10 = g0.f(jArr, j11, true);
        } else {
            b10 = (int) (list.get(list.size() - 1).b() - this.f20222g);
            if (b10 < 0) {
                this.f20223h = new j5.b();
                return;
            }
        }
        int i11 = b10;
        if (i11 >= bVar.f34672k) {
            jVar.f2719a = !this.f.f34656d;
            return;
        }
        long j13 = j11 - j10;
        q5.a aVar = this.f;
        if (!aVar.f34656d) {
            b11 = -9223372036854775807L;
        } else {
            a.b bVar2 = aVar.f[i10];
            int i12 = bVar2.f34672k - 1;
            b11 = (bVar2.b(i12) + bVar2.o[i12]) - j10;
        }
        int length = this.f20221e.length();
        m[] mVarArr = new m[length];
        for (int i13 = 0; i13 < length; i13++) {
            this.f20221e.d(i13);
            mVarArr[i13] = new b(bVar, i11);
        }
        this.f20221e.f(j10, j13, b11, list, mVarArr);
        long j14 = jArr[i11];
        long b12 = bVar.b(i11) + j14;
        if (list.isEmpty()) {
            j12 = j11;
        } else {
            j12 = -9223372036854775807L;
        }
        int i14 = i11 + this.f20222g;
        int g6 = this.f20221e.g();
        f fVar = this.f20219c[g6];
        int d10 = this.f20221e.d(g6);
        i0[] i0VarArr = bVar.f34671j;
        if (i0VarArr != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        List<Long> list2 = bVar.f34675n;
        if (list2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        d6.a.d(z11);
        if (i11 < list2.size()) {
            z12 = true;
        } else {
            z12 = false;
        }
        d6.a.d(z12);
        String num = Integer.toString(i0VarArr[d10].f30524z);
        String l10 = list2.get(i11).toString();
        Uri d11 = e0.d(bVar.f34673l, bVar.f34674m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l10).replace("{start_time}", l10));
        jVar.f2720b = new i(this.f20220d, new c6.m(d11), this.f20221e.o(), this.f20221e.p(), this.f20221e.r(), j14, b12, j12, com.anythink.expressad.exoplayer.b.f7291b, i14, 1, j14, fVar);
    }

    @Override // l5.h
    public final long d(long j10, m1 m1Var) {
        long j11;
        a.b bVar = this.f.f[this.f20218b];
        int f = g0.f(bVar.o, j10, true);
        long[] jArr = bVar.o;
        long j12 = jArr[f];
        if (j12 < j10 && f < bVar.f34672k - 1) {
            j11 = jArr[f + 1];
        } else {
            j11 = j12;
        }
        return m1Var.a(j10, j12, j11);
    }

    @Override // l5.h
    public final int g(long j10, List<? extends l5.l> list) {
        if (this.f20223h == null && this.f20221e.length() >= 2) {
            return this.f20221e.m(j10, list);
        }
        return list.size();
    }

    @Override // l5.h
    public final boolean h(l5.e eVar, boolean z10, a0.c cVar, a0 a0Var) {
        a0.b b10 = a0Var.b(b6.l.a(this.f20221e), cVar);
        if (z10 && b10 != null && b10.f3292a == 2) {
            b6.f fVar = this.f20221e;
            if (fVar.i(fVar.b(eVar.f32508d), b10.f3293b)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public final void i(q5.a aVar) {
        a.b[] bVarArr = this.f.f;
        int i10 = this.f20218b;
        a.b bVar = bVarArr[i10];
        int i11 = bVar.f34672k;
        a.b bVar2 = aVar.f[i10];
        if (i11 != 0 && bVar2.f34672k != 0) {
            int i12 = i11 - 1;
            long[] jArr = bVar.o;
            long b10 = bVar.b(i12) + jArr[i12];
            long j10 = bVar2.o[0];
            if (b10 <= j10) {
                this.f20222g += i11;
            } else {
                this.f20222g = g0.f(jArr, j10, true) + this.f20222g;
            }
        } else {
            this.f20222g += i11;
        }
        this.f = aVar;
    }

    @Override // l5.h
    public final boolean j(long j10, l5.e eVar, List<? extends l5.l> list) {
        if (this.f20223h != null) {
            return false;
        }
        return this.f20221e.h(j10, eVar, list);
    }

    @Override // l5.h
    public final void release() {
        for (f fVar : this.f20219c) {
            ((d) fVar).f32493s.release();
        }
    }

    @Override // l5.h
    public final void f(l5.e eVar) {
    }
}
