package com.google.android.exoplayer2.source.dash;

import b6.f;
import c6.c0;
import c6.h0;
import c6.j;
import com.anythink.expressad.exoplayer.k.o;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.d;
import d6.g0;
import d6.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k4.i0;
import k4.m1;
import l4.w;
import l5.k;
import l5.l;
import l5.m;
import l5.n;
import n5.i;
import p4.h;
import p4.u;
import x4.e;

/* compiled from: DefaultDashChunkSource.java */
/* loaded from: classes2.dex */
public final class c implements com.google.android.exoplayer2.source.dash.a {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f20159a;

    /* renamed from: b, reason: collision with root package name */
    public final m5.a f20160b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f20161c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20162d;

    /* renamed from: e, reason: collision with root package name */
    public final j f20163e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final d.c f20164g;

    /* renamed from: h, reason: collision with root package name */
    public final b[] f20165h;

    /* renamed from: i, reason: collision with root package name */
    public f f20166i;

    /* renamed from: j, reason: collision with root package name */
    public n5.c f20167j;

    /* renamed from: k, reason: collision with root package name */
    public int f20168k;

    /* renamed from: l, reason: collision with root package name */
    public j5.b f20169l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20170m;

    /* compiled from: DefaultDashChunkSource.java */
    /* loaded from: classes2.dex */
    public static final class a implements a.InterfaceC0232a {

        /* renamed from: a, reason: collision with root package name */
        public final j.a f20171a;

        public a(j.a aVar) {
            this.f20171a = aVar;
        }

        @Override // com.google.android.exoplayer2.source.dash.a.InterfaceC0232a
        public final c a(c0 c0Var, n5.c cVar, m5.a aVar, int i10, int[] iArr, f fVar, int i11, long j10, boolean z10, ArrayList arrayList, d.c cVar2, h0 h0Var, w wVar) {
            j a10 = this.f20171a.a();
            if (h0Var != null) {
                a10.b(h0Var);
            }
            return new c(c0Var, cVar, aVar, i10, iArr, fVar, i11, a10, j10, z10, arrayList, cVar2);
        }
    }

    /* compiled from: DefaultDashChunkSource.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final l5.f f20172a;

        /* renamed from: b, reason: collision with root package name */
        public final n5.j f20173b;

        /* renamed from: c, reason: collision with root package name */
        public final n5.b f20174c;

        /* renamed from: d, reason: collision with root package name */
        public final m5.c f20175d;

        /* renamed from: e, reason: collision with root package name */
        public final long f20176e;
        public final long f;

        public b(long j10, n5.j jVar, n5.b bVar, l5.f fVar, long j11, m5.c cVar) {
            this.f20176e = j10;
            this.f20173b = jVar;
            this.f20174c = bVar;
            this.f = j11;
            this.f20172a = fVar;
            this.f20175d = cVar;
        }

        public final b a(long j10, n5.j jVar) throws j5.b {
            long g6;
            long g10;
            m5.c l10 = this.f20173b.l();
            m5.c l11 = jVar.l();
            if (l10 == null) {
                return new b(j10, jVar, this.f20174c, this.f20172a, this.f, l10);
            }
            if (!l10.h()) {
                return new b(j10, jVar, this.f20174c, this.f20172a, this.f, l11);
            }
            long j11 = l10.j(j10);
            if (j11 == 0) {
                return new b(j10, jVar, this.f20174c, this.f20172a, this.f, l11);
            }
            long i10 = l10.i();
            long a10 = l10.a(i10);
            long j12 = (j11 + i10) - 1;
            long b10 = l10.b(j12, j10) + l10.a(j12);
            long i11 = l11.i();
            long a11 = l11.a(i11);
            long j13 = this.f;
            if (b10 == a11) {
                g6 = j12 + 1;
            } else if (b10 >= a11) {
                if (a11 < a10) {
                    g10 = j13 - (l11.g(a10, j10) - i10);
                    return new b(j10, jVar, this.f20174c, this.f20172a, g10, l11);
                }
                g6 = l10.g(a11, j10);
            } else {
                throw new j5.b();
            }
            g10 = (g6 - i11) + j13;
            return new b(j10, jVar, this.f20174c, this.f20172a, g10, l11);
        }

        public final long b(long j10) {
            m5.c cVar = this.f20175d;
            long j11 = this.f20176e;
            return (cVar.k(j11, j10) + (cVar.c(j11, j10) + this.f)) - 1;
        }

        public final long c(long j10) {
            return this.f20175d.b(j10 - this.f, this.f20176e) + d(j10);
        }

        public final long d(long j10) {
            return this.f20175d.a(j10 - this.f);
        }

        public final boolean e(long j10, long j11) {
            if (this.f20175d.h() || j11 == com.anythink.expressad.exoplayer.b.f7291b || c(j10) <= j11) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: DefaultDashChunkSource.java */
    /* renamed from: com.google.android.exoplayer2.source.dash.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0233c extends l5.b {

        /* renamed from: e, reason: collision with root package name */
        public final b f20177e;

        public C0233c(b bVar, long j10, long j11) {
            super(j10, j11);
            this.f20177e = bVar;
        }

        @Override // l5.m
        public final long a() {
            c();
            return this.f20177e.d(this.f32490d);
        }

        @Override // l5.m
        public final long b() {
            c();
            return this.f20177e.c(this.f32490d);
        }
    }

    public c(c0 c0Var, n5.c cVar, m5.a aVar, int i10, int[] iArr, f fVar, int i11, j jVar, long j10, boolean z10, ArrayList arrayList, d.c cVar2) {
        int i12;
        int i13;
        h eVar;
        i0 i0Var;
        l5.d dVar;
        this.f20159a = c0Var;
        this.f20167j = cVar;
        this.f20160b = aVar;
        this.f20161c = iArr;
        this.f20166i = fVar;
        this.f20162d = i11;
        this.f20163e = jVar;
        this.f20168k = i10;
        this.f = j10;
        this.f20164g = cVar2;
        long e10 = cVar.e(i10);
        ArrayList<n5.j> l10 = l();
        this.f20165h = new b[fVar.length()];
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.f20165h.length) {
            n5.j jVar2 = l10.get(fVar.d(i15));
            n5.b d10 = aVar.d(jVar2.f33400t);
            b[] bVarArr = this.f20165h;
            n5.b bVar = d10 == null ? jVar2.f33400t.get(i14) : d10;
            i0 i0Var2 = jVar2.f33399s;
            String str = i0Var2.C;
            if (r.l(str)) {
                dVar = null;
            } else {
                if (str == null || (!str.startsWith(o.f) && !str.startsWith(o.f9084s) && !str.startsWith(o.R) && !str.startsWith("video/x-matroska") && !str.startsWith("audio/x-matroska") && !str.startsWith("application/x-matroska"))) {
                    i12 = i14;
                } else {
                    i12 = 1;
                }
                if (i12 != 0) {
                    eVar = new v4.d(1);
                    i0Var = i0Var2;
                } else {
                    if (z10) {
                        i13 = 4;
                    } else {
                        i13 = i14;
                    }
                    i0Var = i0Var2;
                    eVar = new e(i13, null, null, arrayList, cVar2);
                }
                dVar = new l5.d(eVar, i11, i0Var);
            }
            int i16 = i15;
            bVarArr[i16] = new b(e10, jVar2, bVar, dVar, 0L, jVar2.l());
            i15 = i16 + 1;
            i14 = 0;
        }
    }

    @Override // l5.h
    public final void a() throws IOException {
        j5.b bVar = this.f20169l;
        if (bVar == null) {
            this.f20159a.a();
            return;
        }
        throw bVar;
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public final void b(f fVar) {
        this.f20166i = fVar;
    }

    @Override // l5.h
    public final void c(long j10, long j11, List<? extends l> list, b0.j jVar) {
        l lVar;
        b[] bVarArr;
        long max;
        boolean z10;
        n5.b bVar;
        l5.f fVar;
        long j12;
        long i10;
        long j13;
        j jVar2;
        long j14;
        int i11;
        b0.j jVar3;
        Object iVar;
        n5.b bVar2;
        int i12;
        i iVar2;
        long j15;
        long j16;
        long i13;
        boolean z11;
        if (this.f20169l != null) {
            return;
        }
        long j17 = j11 - j10;
        long J = g0.J(this.f20167j.b(this.f20168k).f33387b) + g0.J(this.f20167j.f33354a) + j11;
        d.c cVar = this.f20164g;
        if (cVar != null) {
            d dVar = d.this;
            n5.c cVar2 = dVar.f20183x;
            if (!cVar2.f33357d) {
                z11 = false;
            } else if (dVar.f20184z) {
                z11 = true;
            } else {
                Map.Entry<Long, Long> ceilingEntry = dVar.f20182w.ceilingEntry(Long.valueOf(cVar2.f33360h));
                d.b bVar3 = dVar.f20179t;
                if (ceilingEntry != null && ceilingEntry.getValue().longValue() < J) {
                    long longValue = ceilingEntry.getKey().longValue();
                    DashMediaSource dashMediaSource = DashMediaSource.this;
                    long j18 = dashMediaSource.f20126h0;
                    if (j18 == com.anythink.expressad.exoplayer.b.f7291b || j18 < longValue) {
                        dashMediaSource.f20126h0 = longValue;
                    }
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && dVar.y) {
                    dVar.f20184z = true;
                    dVar.y = false;
                    DashMediaSource dashMediaSource2 = DashMediaSource.this;
                    dashMediaSource2.V.removeCallbacks(dashMediaSource2.O);
                    dashMediaSource2.B();
                }
            }
            if (z11) {
                return;
            }
        }
        long J2 = g0.J(g0.u(this.f));
        long k10 = k(J2);
        i iVar3 = null;
        if (list.isEmpty()) {
            lVar = null;
        } else {
            lVar = list.get(list.size() - 1);
        }
        int length = this.f20166i.length();
        m[] mVarArr = new m[length];
        int i14 = 0;
        while (true) {
            bVarArr = this.f20165h;
            if (i14 >= length) {
                break;
            }
            b bVar4 = bVarArr[i14];
            m5.c cVar3 = bVar4.f20175d;
            m.a aVar = m.f32537a;
            if (cVar3 == null) {
                mVarArr[i14] = aVar;
                j16 = j17;
                j15 = k10;
            } else {
                j15 = k10;
                long j19 = bVar4.f20176e;
                long c10 = cVar3.c(j19, J2);
                long j20 = bVar4.f;
                long j21 = c10 + j20;
                long b10 = bVar4.b(J2);
                if (lVar != null) {
                    j16 = j17;
                    i13 = lVar.b();
                } else {
                    j16 = j17;
                    i13 = g0.i(bVar4.f20175d.g(j11, j19) + j20, j21, b10);
                }
                if (i13 < j21) {
                    mVarArr[i14] = aVar;
                } else {
                    mVarArr[i14] = new C0233c(m(i14), i13, b10);
                }
            }
            i14++;
            k10 = j15;
            j17 = j16;
        }
        long j22 = j17;
        long j23 = k10;
        if (!this.f20167j.f33357d) {
            max = com.anythink.expressad.exoplayer.b.f7291b;
        } else {
            max = Math.max(0L, Math.min(k(J2), bVarArr[0].c(bVarArr[0].b(J2))) - j10);
        }
        this.f20166i.f(j10, j22, max, list, mVarArr);
        b m10 = m(this.f20166i.g());
        m5.c cVar4 = m10.f20175d;
        n5.b bVar5 = m10.f20174c;
        l5.f fVar2 = m10.f20172a;
        n5.j jVar4 = m10.f20173b;
        if (fVar2 != null) {
            if (((l5.d) fVar2).A == null) {
                iVar2 = jVar4.y;
            } else {
                iVar2 = null;
            }
            if (cVar4 == null) {
                iVar3 = jVar4.m();
            }
            i iVar4 = iVar3;
            if (iVar2 != null || iVar4 != null) {
                j jVar5 = this.f20163e;
                i0 o = this.f20166i.o();
                int p10 = this.f20166i.p();
                Object r10 = this.f20166i.r();
                if (iVar2 != null) {
                    i a10 = iVar2.a(iVar4, bVar5.f33350a);
                    if (a10 != null) {
                        iVar2 = a10;
                    }
                } else {
                    iVar2 = iVar4;
                }
                jVar.f2720b = new k(jVar5, m5.d.a(jVar4, bVar5.f33350a, iVar2, 0), o, p10, r10, m10.f20172a);
                return;
            }
        }
        long j24 = m10.f20176e;
        if (j24 != com.anythink.expressad.exoplayer.b.f7291b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (cVar4.j(j24) == 0) {
            jVar.f2719a = z10;
            return;
        }
        long c11 = cVar4.c(j24, J2);
        boolean z12 = z10;
        long j25 = m10.f;
        long j26 = c11 + j25;
        long b11 = m10.b(J2);
        if (lVar != null) {
            long b12 = lVar.b();
            bVar = bVar5;
            fVar = fVar2;
            j12 = j24;
            i10 = b12;
        } else {
            bVar = bVar5;
            fVar = fVar2;
            j12 = j24;
            i10 = g0.i(cVar4.g(j11, j24) + j25, j26, b11);
        }
        if (i10 < j26) {
            this.f20169l = new j5.b();
            return;
        }
        if (i10 <= b11 && (!this.f20170m || i10 < b11)) {
            if (z12 && m10.d(i10) >= j12) {
                jVar.f2719a = true;
                return;
            }
            int min = (int) Math.min(1, (b11 - i10) + 1);
            if (j24 != com.anythink.expressad.exoplayer.b.f7291b) {
                while (min > 1 && m10.d((min + i10) - 1) >= j12) {
                    min--;
                }
            }
            if (list.isEmpty()) {
                j13 = j11;
            } else {
                j13 = com.anythink.expressad.exoplayer.b.f7291b;
            }
            j jVar6 = this.f20163e;
            int i15 = this.f20162d;
            i0 o6 = this.f20166i.o();
            int p11 = this.f20166i.p();
            Object r11 = this.f20166i.r();
            long d10 = m10.d(i10);
            i e10 = cVar4.e(i10 - j25);
            if (fVar == null) {
                long c12 = m10.c(i10);
                if (m10.e(i10, j23)) {
                    bVar2 = bVar;
                    i12 = 0;
                } else {
                    bVar2 = bVar;
                    i12 = 8;
                }
                iVar = new n(jVar6, m5.d.a(jVar4, bVar2.f33350a, e10, i12), o6, p11, r11, d10, c12, i10, i15, o6);
                jVar3 = jVar;
            } else {
                n5.b bVar6 = bVar;
                i iVar5 = e10;
                int i16 = 1;
                int i17 = 1;
                while (true) {
                    if (i17 < min) {
                        int i18 = min;
                        jVar2 = jVar6;
                        i a11 = iVar5.a(cVar4.e((i17 + i10) - j25), bVar6.f33350a);
                        if (a11 == null) {
                            break;
                        }
                        i16++;
                        i17++;
                        iVar5 = a11;
                        jVar6 = jVar2;
                        min = i18;
                    } else {
                        jVar2 = jVar6;
                        break;
                    }
                }
                long j27 = (i16 + i10) - 1;
                long c13 = m10.c(j27);
                if (j24 != com.anythink.expressad.exoplayer.b.f7291b && j12 <= c13) {
                    j14 = j12;
                } else {
                    j14 = com.anythink.expressad.exoplayer.b.f7291b;
                }
                if (m10.e(j27, j23)) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                int i19 = i16;
                jVar3 = jVar;
                iVar = new l5.i(jVar2, m5.d.a(jVar4, bVar6.f33350a, iVar5, i11), o6, p11, r11, d10, c13, j13, j14, i10, i19, -jVar4.f33401u, m10.f20172a);
            }
            jVar3.f2720b = iVar;
            return;
        }
        jVar.f2719a = z12;
    }

    @Override // l5.h
    public final long d(long j10, m1 m1Var) {
        long j11;
        for (b bVar : this.f20165h) {
            m5.c cVar = bVar.f20175d;
            if (cVar != null) {
                long j12 = bVar.f20176e;
                long g6 = cVar.g(j10, j12);
                long j13 = bVar.f;
                long j14 = g6 + j13;
                long d10 = bVar.d(j14);
                m5.c cVar2 = bVar.f20175d;
                long j15 = cVar2.j(j12);
                if (d10 < j10 && (j15 == -1 || j14 < ((cVar2.i() + j13) + j15) - 1)) {
                    j11 = bVar.d(j14 + 1);
                } else {
                    j11 = d10;
                }
                return m1Var.a(j10, d10, j11);
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public final void e(n5.c cVar, int i10) {
        b[] bVarArr = this.f20165h;
        try {
            this.f20167j = cVar;
            this.f20168k = i10;
            long e10 = cVar.e(i10);
            ArrayList<n5.j> l10 = l();
            for (int i11 = 0; i11 < bVarArr.length; i11++) {
                bVarArr[i11] = bVarArr[i11].a(e10, l10.get(this.f20166i.d(i11)));
            }
        } catch (j5.b e11) {
            this.f20169l = e11;
        }
    }

    @Override // l5.h
    public final void f(l5.e eVar) {
        p4.c cVar;
        if (eVar instanceof k) {
            int b10 = this.f20166i.b(((k) eVar).f32508d);
            b[] bVarArr = this.f20165h;
            b bVar = bVarArr[b10];
            if (bVar.f20175d == null) {
                l5.f fVar = bVar.f20172a;
                u uVar = ((l5.d) fVar).f32499z;
                if (uVar instanceof p4.c) {
                    cVar = (p4.c) uVar;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    n5.j jVar = bVar.f20173b;
                    bVarArr[b10] = new b(bVar.f20176e, jVar, bVar.f20174c, fVar, bVar.f, new m5.e(cVar, jVar.f33401u));
                }
            }
        }
        d.c cVar2 = this.f20164g;
        if (cVar2 != null) {
            long j10 = cVar2.f20190d;
            if (j10 == com.anythink.expressad.exoplayer.b.f7291b || eVar.f32511h > j10) {
                cVar2.f20190d = eVar.f32511h;
            }
            d.this.y = true;
        }
    }

    @Override // l5.h
    public final int g(long j10, List<? extends l> list) {
        if (this.f20169l == null && this.f20166i.length() >= 2) {
            return this.f20166i.m(j10, list);
        }
        return list.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[RETURN] */
    @Override // l5.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(l5.e r12, boolean r13, c6.a0.c r14, c6.a0 r15) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.c.h(l5.e, boolean, c6.a0$c, c6.a0):boolean");
    }

    @Override // l5.h
    public final boolean j(long j10, l5.e eVar, List<? extends l> list) {
        if (this.f20169l != null) {
            return false;
        }
        return this.f20166i.h(j10, eVar, list);
    }

    public final long k(long j10) {
        n5.c cVar = this.f20167j;
        long j11 = cVar.f33354a;
        if (j11 == com.anythink.expressad.exoplayer.b.f7291b) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        return j10 - g0.J(j11 + cVar.b(this.f20168k).f33387b);
    }

    public final ArrayList<n5.j> l() {
        List<n5.a> list = this.f20167j.b(this.f20168k).f33388c;
        ArrayList<n5.j> arrayList = new ArrayList<>();
        for (int i10 : this.f20161c) {
            arrayList.addAll(list.get(i10).f33347c);
        }
        return arrayList;
    }

    public final b m(int i10) {
        b[] bVarArr = this.f20165h;
        b bVar = bVarArr[i10];
        n5.b d10 = this.f20160b.d(bVar.f20173b.f33400t);
        if (d10 != null && !d10.equals(bVar.f20174c)) {
            b bVar2 = new b(bVar.f20176e, bVar.f20173b, d10, bVar.f20172a, bVar.f, bVar.f20175d);
            bVarArr[i10] = bVar2;
            return bVar2;
        }
        return bVar;
    }

    @Override // l5.h
    public final void release() {
        for (b bVar : this.f20165h) {
            l5.f fVar = bVar.f20172a;
            if (fVar != null) {
                ((l5.d) fVar).f32493s.release();
            }
        }
    }
}
