package com.google.android.exoplayer2.source.smoothstreaming;

import c6.a0;
import c6.c0;
import c6.h0;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.drm.f;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import j5.f0;
import j5.g0;
import j5.m0;
import j5.n0;
import j5.s;
import j5.x;
import java.io.IOException;
import java.util.ArrayList;
import k4.i0;
import k4.m1;
import l3.d;
import l5.g;
import q5.a;

/* compiled from: SsMediaPeriod.java */
/* loaded from: classes2.dex */
public final class c implements s, g0.a<g<b>> {
    public final n0 A;
    public final d B;
    public s.a C;
    public q5.a D;
    public g<b>[] E;
    public d0.b F;

    /* renamed from: s, reason: collision with root package name */
    public final b.a f20226s;

    /* renamed from: t, reason: collision with root package name */
    public final h0 f20227t;

    /* renamed from: u, reason: collision with root package name */
    public final c0 f20228u;

    /* renamed from: v, reason: collision with root package name */
    public final f f20229v;

    /* renamed from: w, reason: collision with root package name */
    public final e.a f20230w;

    /* renamed from: x, reason: collision with root package name */
    public final a0 f20231x;
    public final x.a y;

    /* renamed from: z, reason: collision with root package name */
    public final c6.b f20232z;

    public c(q5.a aVar, b.a aVar2, h0 h0Var, d dVar, f fVar, e.a aVar3, a0 a0Var, x.a aVar4, c0 c0Var, c6.b bVar) {
        this.D = aVar;
        this.f20226s = aVar2;
        this.f20227t = h0Var;
        this.f20228u = c0Var;
        this.f20229v = fVar;
        this.f20230w = aVar3;
        this.f20231x = a0Var;
        this.y = aVar4;
        this.f20232z = bVar;
        this.B = dVar;
        m0[] m0VarArr = new m0[aVar.f.length];
        int i10 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f;
            if (i10 < bVarArr.length) {
                i0[] i0VarArr = bVarArr[i10].f34671j;
                i0[] i0VarArr2 = new i0[i0VarArr.length];
                for (int i11 = 0; i11 < i0VarArr.length; i11++) {
                    i0 i0Var = i0VarArr[i11];
                    i0VarArr2[i11] = i0Var.b(fVar.f(i0Var));
                }
                m0VarArr[i10] = new m0(Integer.toString(i10), i0VarArr2);
                i10++;
            } else {
                this.A = new n0(m0VarArr);
                g<b>[] gVarArr = new g[0];
                this.E = gVarArr;
                dVar.getClass();
                this.F = d.d(gVarArr);
                return;
            }
        }
    }

    @Override // j5.s, j5.g0
    public final long b() {
        return this.F.b();
    }

    @Override // j5.s, j5.g0
    public final boolean c(long j10) {
        return this.F.c(j10);
    }

    @Override // j5.s
    public final long d(long j10, m1 m1Var) {
        for (g<b> gVar : this.E) {
            if (gVar.f32513s == 2) {
                return gVar.f32517w.d(j10, m1Var);
            }
        }
        return j10;
    }

    @Override // j5.s, j5.g0
    public final long e() {
        return this.F.e();
    }

    @Override // j5.s, j5.g0
    public final void f(long j10) {
        this.F.f(j10);
    }

    @Override // j5.g0.a
    public final void g(g<b> gVar) {
        this.C.g(this);
    }

    @Override // j5.s, j5.g0
    public final boolean isLoading() {
        return this.F.isLoading();
    }

    @Override // j5.s
    public final void j() throws IOException {
        this.f20228u.a();
    }

    @Override // j5.s
    public final void k(s.a aVar, long j10) {
        this.C = aVar;
        aVar.a(this);
    }

    @Override // j5.s
    public final long l(long j10) {
        for (g<b> gVar : this.E) {
            gVar.A(j10);
        }
        return j10;
    }

    @Override // j5.s
    public final long o(b6.f[] fVarArr, boolean[] zArr, f0[] f0VarArr, boolean[] zArr2, long j10) {
        int i10;
        b6.f fVar;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < fVarArr.length) {
            f0 f0Var = f0VarArr[i11];
            if (f0Var != null) {
                g gVar = (g) f0Var;
                b6.f fVar2 = fVarArr[i11];
                if (fVar2 != null && zArr[i11]) {
                    ((b) gVar.f32517w).b(fVar2);
                    arrayList.add(gVar);
                } else {
                    gVar.z(null);
                    f0VarArr[i11] = null;
                }
            }
            if (f0VarArr[i11] == null && (fVar = fVarArr[i11]) != null) {
                int b10 = this.A.b(fVar.a());
                i10 = i11;
                g gVar2 = new g(this.D.f[b10].f34663a, null, null, this.f20226s.a(this.f20228u, this.D, b10, fVar, this.f20227t), this, this.f20232z, j10, this.f20229v, this.f20230w, this.f20231x, this.y);
                arrayList.add(gVar2);
                f0VarArr[i10] = gVar2;
                zArr2[i10] = true;
            } else {
                i10 = i11;
            }
            i11 = i10 + 1;
        }
        g<b>[] gVarArr = new g[arrayList.size()];
        this.E = gVarArr;
        arrayList.toArray(gVarArr);
        g<b>[] gVarArr2 = this.E;
        this.B.getClass();
        this.F = d.d(gVarArr2);
        return j10;
    }

    @Override // j5.s
    public final long p() {
        return com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // j5.s
    public final n0 r() {
        return this.A;
    }

    @Override // j5.s
    public final void t(long j10, boolean z10) {
        for (g<b> gVar : this.E) {
            gVar.t(j10, z10);
        }
    }
}
