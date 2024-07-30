package l5;

import android.util.SparseArray;
import com.applovin.exoplayer2.a0;
import d6.g0;
import java.io.IOException;
import k4.i0;
import l5.f;
import p4.t;
import p4.u;
import p4.w;

/* compiled from: BundledChunkExtractor.java */
/* loaded from: classes2.dex */
public final class d implements p4.j, f {
    public static final t B;
    public i0[] A;

    /* renamed from: s, reason: collision with root package name */
    public final p4.h f32493s;

    /* renamed from: t, reason: collision with root package name */
    public final int f32494t;

    /* renamed from: u, reason: collision with root package name */
    public final i0 f32495u;

    /* renamed from: v, reason: collision with root package name */
    public final SparseArray<a> f32496v = new SparseArray<>();

    /* renamed from: w, reason: collision with root package name */
    public boolean f32497w;

    /* renamed from: x, reason: collision with root package name */
    public f.a f32498x;
    public long y;

    /* renamed from: z, reason: collision with root package name */
    public u f32499z;

    /* compiled from: BundledChunkExtractor.java */
    /* loaded from: classes2.dex */
    public static final class a implements w {

        /* renamed from: a, reason: collision with root package name */
        public final int f32500a;

        /* renamed from: b, reason: collision with root package name */
        public final i0 f32501b;

        /* renamed from: c, reason: collision with root package name */
        public final p4.g f32502c = new p4.g();

        /* renamed from: d, reason: collision with root package name */
        public i0 f32503d;

        /* renamed from: e, reason: collision with root package name */
        public w f32504e;
        public long f;

        public a(int i10, int i11, i0 i0Var) {
            this.f32500a = i11;
            this.f32501b = i0Var;
        }

        @Override // p4.w
        public final void b(i0 i0Var) {
            i0 i0Var2 = this.f32501b;
            if (i0Var2 != null) {
                i0Var = i0Var.e(i0Var2);
            }
            this.f32503d = i0Var;
            w wVar = this.f32504e;
            int i10 = g0.f27302a;
            wVar.b(i0Var);
        }

        @Override // p4.w
        public final void c(long j10, int i10, int i11, int i12, w.a aVar) {
            long j11 = this.f;
            if (j11 != com.anythink.expressad.exoplayer.b.f7291b && j10 >= j11) {
                this.f32504e = this.f32502c;
            }
            w wVar = this.f32504e;
            int i13 = g0.f27302a;
            wVar.c(j10, i10, i11, i12, aVar);
        }

        @Override // p4.w
        public final int d(c6.h hVar, int i10, boolean z10) throws IOException {
            w wVar = this.f32504e;
            int i11 = g0.f27302a;
            return wVar.a(hVar, i10, z10);
        }

        @Override // p4.w
        public final void e(int i10, d6.w wVar) {
            w wVar2 = this.f32504e;
            int i11 = g0.f27302a;
            wVar2.f(i10, wVar);
        }

        public final void g(f.a aVar, long j10) {
            if (aVar == null) {
                this.f32504e = this.f32502c;
                return;
            }
            this.f = j10;
            w a10 = ((c) aVar).a(this.f32500a);
            this.f32504e = a10;
            i0 i0Var = this.f32503d;
            if (i0Var != null) {
                a10.b(i0Var);
            }
        }
    }

    static {
        new a0(26);
        B = new t();
    }

    public d(p4.h hVar, int i10, i0 i0Var) {
        this.f32493s = hVar;
        this.f32494t = i10;
        this.f32495u = i0Var;
    }

    public final void a(f.a aVar, long j10, long j11) {
        this.f32498x = aVar;
        this.y = j11;
        boolean z10 = this.f32497w;
        p4.h hVar = this.f32493s;
        if (!z10) {
            hVar.f(this);
            if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
                hVar.g(0L, j10);
            }
            this.f32497w = true;
            return;
        }
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            j10 = 0;
        }
        hVar.g(0L, j10);
        int i10 = 0;
        while (true) {
            SparseArray<a> sparseArray = this.f32496v;
            if (i10 < sparseArray.size()) {
                sparseArray.valueAt(i10).g(aVar, j11);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // p4.j
    public final void i(u uVar) {
        this.f32499z = uVar;
    }

    @Override // p4.j
    public final void m() {
        SparseArray<a> sparseArray = this.f32496v;
        i0[] i0VarArr = new i0[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            i0 i0Var = sparseArray.valueAt(i10).f32503d;
            d6.a.e(i0Var);
            i0VarArr[i10] = i0Var;
        }
        this.A = i0VarArr;
    }

    @Override // p4.j
    public final w s(int i10, int i11) {
        boolean z10;
        i0 i0Var;
        SparseArray<a> sparseArray = this.f32496v;
        a aVar = sparseArray.get(i10);
        if (aVar == null) {
            if (this.A == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            d6.a.d(z10);
            if (i11 == this.f32494t) {
                i0Var = this.f32495u;
            } else {
                i0Var = null;
            }
            aVar = new a(i10, i11, i0Var);
            aVar.g(this.f32498x, this.y);
            sparseArray.put(i10, aVar);
        }
        return aVar;
    }
}
