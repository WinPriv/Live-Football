package o5;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.transition.t;
import c6.h0;
import d6.e0;
import d6.g0;
import j5.m0;
import j7.j0;
import j7.v1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k4.i0;
import l4.w;
import p5.e;

/* compiled from: HlsChunkSource.java */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final i f33637a;

    /* renamed from: b, reason: collision with root package name */
    public final c6.j f33638b;

    /* renamed from: c, reason: collision with root package name */
    public final c6.j f33639c;

    /* renamed from: d, reason: collision with root package name */
    public final t f33640d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri[] f33641e;
    public final i0[] f;

    /* renamed from: g, reason: collision with root package name */
    public final p5.j f33642g;

    /* renamed from: h, reason: collision with root package name */
    public final m0 f33643h;

    /* renamed from: i, reason: collision with root package name */
    public final List<i0> f33644i;

    /* renamed from: k, reason: collision with root package name */
    public final w f33646k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f33647l;

    /* renamed from: n, reason: collision with root package name */
    public j5.b f33649n;
    public Uri o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f33650p;

    /* renamed from: q, reason: collision with root package name */
    public b6.f f33651q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f33653s;

    /* renamed from: j, reason: collision with root package name */
    public final f f33645j = new f();

    /* renamed from: m, reason: collision with root package name */
    public byte[] f33648m = g0.f;

    /* renamed from: r, reason: collision with root package name */
    public long f33652r = com.anythink.expressad.exoplayer.b.f7291b;

    /* compiled from: HlsChunkSource.java */
    /* loaded from: classes2.dex */
    public static final class a extends l5.j {

        /* renamed from: l, reason: collision with root package name */
        public byte[] f33654l;

        public a(c6.j jVar, c6.m mVar, i0 i0Var, int i10, Object obj, byte[] bArr) {
            super(jVar, mVar, i0Var, i10, obj, bArr);
        }
    }

    /* compiled from: HlsChunkSource.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public l5.e f33655a = null;

        /* renamed from: b, reason: collision with root package name */
        public boolean f33656b = false;

        /* renamed from: c, reason: collision with root package name */
        public Uri f33657c = null;
    }

    /* compiled from: HlsChunkSource.java */
    /* loaded from: classes2.dex */
    public static final class c extends l5.b {

        /* renamed from: e, reason: collision with root package name */
        public final List<e.d> f33658e;
        public final long f;

        public c(long j10, List list) {
            super(0L, list.size() - 1);
            this.f = j10;
            this.f33658e = list;
        }

        @Override // l5.m
        public final long a() {
            c();
            return this.f + this.f33658e.get((int) this.f32490d).f34421w;
        }

        @Override // l5.m
        public final long b() {
            c();
            e.d dVar = this.f33658e.get((int) this.f32490d);
            return this.f + dVar.f34421w + dVar.f34419u;
        }
    }

    /* compiled from: HlsChunkSource.java */
    /* loaded from: classes2.dex */
    public static final class d extends b6.b {

        /* renamed from: g, reason: collision with root package name */
        public int f33659g;

        public d(m0 m0Var, int[] iArr) {
            super(m0Var, iArr);
            this.f33659g = b(m0Var.f29804v[iArr[0]]);
        }

        @Override // b6.f
        public final void f(long j10, long j11, long j12, List<? extends l5.l> list, l5.m[] mVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!j(this.f33659g, elapsedRealtime)) {
                return;
            }
            int i10 = this.f3013b;
            do {
                i10--;
                if (i10 < 0) {
                    throw new IllegalStateException();
                }
            } while (j(i10, elapsedRealtime));
            this.f33659g = i10;
        }

        @Override // b6.f
        public final int g() {
            return this.f33659g;
        }

        @Override // b6.f
        public final int p() {
            return 0;
        }

        @Override // b6.f
        public final Object r() {
            return null;
        }
    }

    /* compiled from: HlsChunkSource.java */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final e.d f33660a;

        /* renamed from: b, reason: collision with root package name */
        public final long f33661b;

        /* renamed from: c, reason: collision with root package name */
        public final int f33662c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f33663d;

        public e(e.d dVar, long j10, int i10) {
            boolean z10;
            this.f33660a = dVar;
            this.f33661b = j10;
            this.f33662c = i10;
            if ((dVar instanceof e.a) && ((e.a) dVar).E) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f33663d = z10;
        }
    }

    public g(i iVar, p5.j jVar, Uri[] uriArr, i0[] i0VarArr, h hVar, h0 h0Var, t tVar, List<i0> list, w wVar) {
        this.f33637a = iVar;
        this.f33642g = jVar;
        this.f33641e = uriArr;
        this.f = i0VarArr;
        this.f33640d = tVar;
        this.f33644i = list;
        this.f33646k = wVar;
        c6.j a10 = hVar.a();
        this.f33638b = a10;
        if (h0Var != null) {
            a10.b(h0Var);
        }
        this.f33639c = hVar.a();
        this.f33643h = new m0("", i0VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((i0VarArr[i10].f30522w & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f33651q = new d(this.f33643h, l7.a.j0(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l5.m[] a(j jVar, long j10) {
        int a10;
        boolean z10;
        List list;
        if (jVar == null) {
            a10 = -1;
        } else {
            a10 = this.f33643h.a(jVar.f32508d);
        }
        int length = this.f33651q.length();
        l5.m[] mVarArr = new l5.m[length];
        boolean z11 = false;
        int i10 = 0;
        while (i10 < length) {
            int d10 = this.f33651q.d(i10);
            Uri uri = this.f33641e[d10];
            p5.j jVar2 = this.f33642g;
            if (!jVar2.a(uri)) {
                mVarArr[i10] = l5.m.f32537a;
            } else {
                p5.e m10 = jVar2.m(uri, z11);
                m10.getClass();
                long f = m10.f34400h - jVar2.f();
                if (d10 != a10) {
                    z10 = true;
                } else {
                    z10 = z11;
                }
                Pair<Long, Integer> d11 = d(jVar, z10, m10, f, j10);
                long longValue = ((Long) d11.first).longValue();
                int intValue = ((Integer) d11.second).intValue();
                int i11 = (int) (longValue - m10.f34403k);
                if (i11 >= 0) {
                    j0 j0Var = m10.f34409r;
                    if (j0Var.size() >= i11) {
                        ArrayList arrayList = new ArrayList();
                        if (i11 < j0Var.size()) {
                            if (intValue != -1) {
                                e.c cVar = (e.c) j0Var.get(i11);
                                if (intValue == 0) {
                                    arrayList.add(cVar);
                                } else if (intValue < cVar.E.size()) {
                                    j0 j0Var2 = cVar.E;
                                    arrayList.addAll(j0Var2.subList(intValue, j0Var2.size()));
                                }
                                i11++;
                            }
                            arrayList.addAll(j0Var.subList(i11, j0Var.size()));
                            intValue = 0;
                        }
                        if (m10.f34406n != com.anythink.expressad.exoplayer.b.f7291b) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            j0 j0Var3 = m10.f34410s;
                            if (intValue < j0Var3.size()) {
                                arrayList.addAll(j0Var3.subList(intValue, j0Var3.size()));
                            }
                        }
                        list = Collections.unmodifiableList(arrayList);
                        mVarArr[i10] = new c(f, list);
                    }
                }
                j0.b bVar = j0.f30006t;
                list = v1.f30113w;
                mVarArr[i10] = new c(f, list);
            }
            i10++;
            z11 = false;
        }
        return mVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(j jVar) {
        j0 j0Var;
        if (jVar.o == -1) {
            return 1;
        }
        p5.e m10 = this.f33642g.m(this.f33641e[this.f33643h.a(jVar.f32508d)], false);
        m10.getClass();
        int i10 = (int) (jVar.f32536j - m10.f34403k);
        if (i10 < 0) {
            return 1;
        }
        j0 j0Var2 = m10.f34409r;
        if (i10 < j0Var2.size()) {
            j0Var = ((e.c) j0Var2.get(i10)).E;
        } else {
            j0Var = m10.f34410s;
        }
        int size = j0Var.size();
        int i11 = jVar.o;
        if (i11 >= size) {
            return 2;
        }
        e.a aVar = (e.a) j0Var.get(i11);
        if (aVar.E) {
            return 0;
        }
        if (g0.a(Uri.parse(e0.c(m10.f34447a, aVar.f34417s)), jVar.f32506b.f3377a)) {
            return 1;
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r54, long r56, java.util.List<o5.j> r58, boolean r59, o5.g.b r60) {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.g.c(long, long, java.util.List, boolean, o5.g$b):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<Long, Integer> d(j jVar, boolean z10, p5.e eVar, long j10, long j11) {
        j0 j0Var;
        long j12;
        boolean z11 = true;
        int i10 = -1;
        if (jVar != null && !z10) {
            boolean z12 = jVar.H;
            long j13 = jVar.f32536j;
            int i11 = jVar.o;
            if (z12) {
                if (i11 == -1) {
                    j13 = jVar.b();
                }
                Long valueOf = Long.valueOf(j13);
                if (i11 != -1) {
                    i10 = i11 + 1;
                }
                return new Pair<>(valueOf, Integer.valueOf(i10));
            }
            return new Pair<>(Long.valueOf(j13), Integer.valueOf(i11));
        }
        long j14 = eVar.f34412u + j10;
        if (jVar != null && !this.f33650p) {
            j11 = jVar.f32510g;
        }
        boolean z13 = eVar.o;
        long j15 = eVar.f34403k;
        j0 j0Var2 = eVar.f34409r;
        if (!z13 && j11 >= j14) {
            return new Pair<>(Long.valueOf(j15 + j0Var2.size()), -1);
        }
        long j16 = j11 - j10;
        Long valueOf2 = Long.valueOf(j16);
        int i12 = 0;
        if (this.f33642g.h() && jVar != null) {
            z11 = false;
        }
        int c10 = g0.c(j0Var2, valueOf2, z11);
        long j17 = c10 + j15;
        if (c10 >= 0) {
            e.c cVar = (e.c) j0Var2.get(c10);
            long j18 = cVar.f34421w + cVar.f34419u;
            j0 j0Var3 = eVar.f34410s;
            if (j16 < j18) {
                j0Var = cVar.E;
            } else {
                j0Var = j0Var3;
            }
            while (true) {
                if (i12 >= j0Var.size()) {
                    break;
                }
                e.a aVar = (e.a) j0Var.get(i12);
                if (j16 < aVar.f34421w + aVar.f34419u) {
                    if (aVar.D) {
                        if (j0Var == j0Var3) {
                            j12 = 1;
                        } else {
                            j12 = 0;
                        }
                        j17 += j12;
                        i10 = i12;
                    }
                } else {
                    i12++;
                }
            }
        }
        return new Pair<>(Long.valueOf(j17), Integer.valueOf(i10));
    }

    public final a e(Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        f fVar = this.f33645j;
        byte[] remove = fVar.f33636a.remove(uri);
        if (remove != null) {
            fVar.f33636a.put(uri, remove);
            return null;
        }
        return new a(this.f33639c, new c6.m(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 1, null), this.f[i10], this.f33651q.p(), this.f33651q.r(), this.f33648m);
    }
}
