package n5;

import android.net.Uri;
import androidx.transition.t;
import d6.g0;
import j7.j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k4.i0;
import n5.k;

/* compiled from: Representation.java */
/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: s, reason: collision with root package name */
    public final i0 f33399s;

    /* renamed from: t, reason: collision with root package name */
    public final j0<n5.b> f33400t;

    /* renamed from: u, reason: collision with root package name */
    public final long f33401u;

    /* renamed from: v, reason: collision with root package name */
    public final List<e> f33402v;

    /* renamed from: w, reason: collision with root package name */
    public final List<e> f33403w;

    /* renamed from: x, reason: collision with root package name */
    public final List<e> f33404x;
    public final i y;

    /* compiled from: Representation.java */
    /* loaded from: classes2.dex */
    public static class b extends j {
        public final i A;
        public final t B;

        /* renamed from: z, reason: collision with root package name */
        public final String f33406z;

        /* JADX WARN: Multi-variable type inference failed */
        public b(long j10, i0 i0Var, j0 j0Var, k.e eVar, ArrayList arrayList, List list, List list2) {
            super(i0Var, j0Var, eVar, arrayList, list, list2);
            i iVar;
            Uri.parse(((n5.b) j0Var.get(0)).f33350a);
            long j11 = eVar.f33422e;
            if (j11 <= 0) {
                iVar = null;
            } else {
                iVar = new i(null, eVar.f33421d, j11);
            }
            this.A = iVar;
            this.f33406z = null;
            this.B = iVar == null ? new t(new i(null, 0L, -1L)) : null;
        }

        @Override // n5.j
        public final String f() {
            return this.f33406z;
        }

        @Override // n5.j
        public final m5.c l() {
            return this.B;
        }

        @Override // n5.j
        public final i m() {
            return this.A;
        }
    }

    public j() {
        throw null;
    }

    public j(i0 i0Var, j0 j0Var, k kVar, ArrayList arrayList, List list, List list2) {
        d6.a.a(!j0Var.isEmpty());
        this.f33399s = i0Var;
        this.f33400t = j0.C(j0Var);
        this.f33402v = Collections.unmodifiableList(arrayList);
        this.f33403w = list;
        this.f33404x = list2;
        this.y = kVar.a(this);
        this.f33401u = g0.P(kVar.f33409c, 1000000L, kVar.f33408b);
    }

    public abstract String f();

    public abstract m5.c l();

    public abstract i m();

    /* compiled from: Representation.java */
    /* loaded from: classes2.dex */
    public static class a extends j implements m5.c {

        /* renamed from: z, reason: collision with root package name */
        public final k.a f33405z;

        public a(long j10, i0 i0Var, j0 j0Var, k.a aVar, ArrayList arrayList, List list, List list2) {
            super(i0Var, j0Var, aVar, arrayList, list, list2);
            this.f33405z = aVar;
        }

        @Override // m5.c
        public final long a(long j10) {
            return this.f33405z.g(j10);
        }

        @Override // m5.c
        public final long b(long j10, long j11) {
            return this.f33405z.e(j10, j11);
        }

        @Override // m5.c
        public final long c(long j10, long j11) {
            return this.f33405z.c(j10, j11);
        }

        @Override // m5.c
        public final long d(long j10, long j11) {
            k.a aVar = this.f33405z;
            if (aVar.f != null) {
                return com.anythink.expressad.exoplayer.b.f7291b;
            }
            long b10 = aVar.b(j10, j11) + aVar.c(j10, j11);
            return (aVar.e(b10, j10) + aVar.g(b10)) - aVar.f33414i;
        }

        @Override // m5.c
        public final i e(long j10) {
            return this.f33405z.h(j10, this);
        }

        @Override // n5.j
        public final String f() {
            return null;
        }

        @Override // m5.c
        public final long g(long j10, long j11) {
            return this.f33405z.f(j10, j11);
        }

        @Override // m5.c
        public final boolean h() {
            return this.f33405z.i();
        }

        @Override // m5.c
        public final long i() {
            return this.f33405z.f33410d;
        }

        @Override // m5.c
        public final long j(long j10) {
            return this.f33405z.d(j10);
        }

        @Override // m5.c
        public final long k(long j10, long j11) {
            return this.f33405z.b(j10, j11);
        }

        @Override // n5.j
        public final i m() {
            return null;
        }

        @Override // n5.j
        public final m5.c l() {
            return this;
        }
    }
}
