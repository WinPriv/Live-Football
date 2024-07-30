package b6;

import b6.f;
import d6.a0;
import d6.g0;
import d6.p;
import j5.m0;
import j7.j0;
import j7.r;
import java.util.ArrayList;
import java.util.List;
import k4.i0;

/* compiled from: AdaptiveTrackSelection.java */
/* loaded from: classes2.dex */
public final class a extends b6.b {

    /* renamed from: g, reason: collision with root package name */
    public final c6.e f2996g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2997h;

    /* renamed from: i, reason: collision with root package name */
    public final long f2998i;

    /* renamed from: j, reason: collision with root package name */
    public final long f2999j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3000k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3001l;

    /* renamed from: m, reason: collision with root package name */
    public final float f3002m;

    /* renamed from: n, reason: collision with root package name */
    public final float f3003n;
    public final j0<C0030a> o;

    /* renamed from: p, reason: collision with root package name */
    public final d6.c f3004p;

    /* renamed from: q, reason: collision with root package name */
    public float f3005q;

    /* renamed from: r, reason: collision with root package name */
    public int f3006r;

    /* renamed from: s, reason: collision with root package name */
    public int f3007s;

    /* renamed from: t, reason: collision with root package name */
    public long f3008t;

    /* renamed from: u, reason: collision with root package name */
    public l5.l f3009u;

    /* compiled from: AdaptiveTrackSelection.java */
    /* renamed from: b6.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0030a {

        /* renamed from: a, reason: collision with root package name */
        public final long f3010a;

        /* renamed from: b, reason: collision with root package name */
        public final long f3011b;

        public C0030a(long j10, long j11) {
            this.f3010a = j10;
            this.f3011b = j11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0030a)) {
                return false;
            }
            C0030a c0030a = (C0030a) obj;
            if (this.f3010a == c0030a.f3010a && this.f3011b == c0030a.f3011b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((int) this.f3010a) * 31) + ((int) this.f3011b);
        }
    }

    /* compiled from: AdaptiveTrackSelection.java */
    /* loaded from: classes2.dex */
    public static class b implements f.b {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m0 m0Var, int[] iArr, int i10, c6.e eVar, long j10, long j11, long j12, j0 j0Var) {
        super(m0Var, iArr);
        a0 a0Var = d6.c.f27283a;
        if (j12 < j10) {
            p.f("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j12 = j10;
        }
        this.f2996g = eVar;
        this.f2997h = j10 * 1000;
        this.f2998i = j11 * 1000;
        this.f2999j = j12 * 1000;
        this.f3000k = 1279;
        this.f3001l = 719;
        this.f3002m = 0.7f;
        this.f3003n = 0.75f;
        this.o = j0.C(j0Var);
        this.f3004p = a0Var;
        this.f3005q = 1.0f;
        this.f3007s = 0;
        this.f3008t = com.anythink.expressad.exoplayer.b.f7291b;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            j0.a aVar = (j0.a) arrayList.get(i10);
            if (aVar != null) {
                aVar.b(new C0030a(j10, jArr[i10]));
            }
        }
    }

    public static long x(List list) {
        if (list.isEmpty()) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        l5.l lVar = (l5.l) r.B(list);
        long j10 = lVar.f32510g;
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        long j11 = lVar.f32511h;
        if (j11 == com.anythink.expressad.exoplayer.b.f7291b) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        return j11 - j10;
    }

    @Override // b6.b, b6.f
    public final void e() {
        this.f3009u = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    @Override // b6.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(long r14, long r16, long r18, java.util.List<? extends l5.l> r20, l5.m[] r21) {
        /*
            r13 = this;
            r0 = r13
            r1 = r21
            d6.c r2 = r0.f3004p
            long r2 = r2.elapsedRealtime()
            int r4 = r0.f3006r
            int r5 = r1.length
            if (r4 >= r5) goto L23
            r4 = r1[r4]
            boolean r4 = r4.next()
            if (r4 == 0) goto L23
            int r4 = r0.f3006r
            r1 = r1[r4]
            long r4 = r1.b()
            long r6 = r1.a()
            goto L37
        L23:
            int r4 = r1.length
            r5 = 0
        L25:
            if (r5 >= r4) goto L3c
            r6 = r1[r5]
            boolean r7 = r6.next()
            if (r7 == 0) goto L39
            long r4 = r6.b()
            long r6 = r6.a()
        L37:
            long r4 = r4 - r6
            goto L40
        L39:
            int r5 = r5 + 1
            goto L25
        L3c:
            long r4 = x(r20)
        L40:
            int r1 = r0.f3007s
            if (r1 != 0) goto L4e
            r1 = 1
            r0.f3007s = r1
            int r1 = r13.w(r2, r4)
            r0.f3006r = r1
            return
        L4e:
            int r6 = r0.f3006r
            boolean r7 = r20.isEmpty()
            r8 = -1
            if (r7 == 0) goto L59
            r7 = r8
            goto L65
        L59:
            java.lang.Object r7 = j7.r.B(r20)
            l5.l r7 = (l5.l) r7
            k4.i0 r7 = r7.f32508d
            int r7 = r13.b(r7)
        L65:
            if (r7 == r8) goto L70
            java.lang.Object r1 = j7.r.B(r20)
            l5.l r1 = (l5.l) r1
            int r1 = r1.f32509e
            r6 = r7
        L70:
            int r7 = r13.w(r2, r4)
            boolean r2 = r13.j(r6, r2)
            if (r2 != 0) goto Lb2
            k4.i0[] r2 = r0.f3015d
            r3 = r2[r6]
            r2 = r2[r7]
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            long r11 = r0.f2997h
            if (r10 != 0) goto L8c
            goto L9e
        L8c:
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 == 0) goto L93
            long r4 = r18 - r4
            goto L95
        L93:
            r4 = r18
        L95:
            float r4 = (float) r4
            float r5 = r0.f3003n
            float r4 = r4 * r5
            long r4 = (long) r4
            long r11 = java.lang.Math.min(r4, r11)
        L9e:
            int r2 = r2.f30524z
            int r3 = r3.f30524z
            if (r2 <= r3) goto La9
            int r4 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r4 >= 0) goto La9
            goto Lb1
        La9:
            if (r2 >= r3) goto Lb2
            long r2 = r0.f2998i
            int r2 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r2 < 0) goto Lb2
        Lb1:
            r7 = r6
        Lb2:
            if (r7 != r6) goto Lb5
            goto Lb6
        Lb5:
            r1 = 3
        Lb6:
            r0.f3007s = r1
            r0.f3006r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.a.f(long, long, long, java.util.List, l5.m[]):void");
    }

    @Override // b6.f
    public final int g() {
        return this.f3006r;
    }

    @Override // b6.b, b6.f
    public final void l() {
        this.f3008t = com.anythink.expressad.exoplayer.b.f7291b;
        this.f3009u = null;
    }

    @Override // b6.b, b6.f
    public final int m(long j10, List<? extends l5.l> list) {
        boolean z10;
        l5.l lVar;
        int i10;
        int i11;
        long elapsedRealtime = this.f3004p.elapsedRealtime();
        long j11 = this.f3008t;
        if (j11 != com.anythink.expressad.exoplayer.b.f7291b && elapsedRealtime - j11 < 1000 && (list.isEmpty() || ((l5.l) r.B(list)).equals(this.f3009u))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return list.size();
        }
        this.f3008t = elapsedRealtime;
        if (list.isEmpty()) {
            lVar = null;
        } else {
            lVar = (l5.l) r.B(list);
        }
        this.f3009u = lVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long x10 = g0.x(list.get(size - 1).f32510g - j10, this.f3005q);
        long j12 = this.f2999j;
        if (x10 < j12) {
            return size;
        }
        i0 i0Var = this.f3015d[w(elapsedRealtime, x(list))];
        for (int i12 = 0; i12 < size; i12++) {
            l5.l lVar2 = list.get(i12);
            i0 i0Var2 = lVar2.f32508d;
            if (g0.x(lVar2.f32510g - j10, this.f3005q) >= j12 && i0Var2.f30524z < i0Var.f30524z && (i10 = i0Var2.J) != -1 && i10 <= this.f3001l && (i11 = i0Var2.I) != -1 && i11 <= this.f3000k && i10 < i0Var.J) {
                return i12;
            }
        }
        return size;
    }

    @Override // b6.f
    public final int p() {
        return this.f3007s;
    }

    @Override // b6.b, b6.f
    public final void q(float f) {
        this.f3005q = f;
    }

    @Override // b6.f
    public final Object r() {
        return null;
    }

    public final int w(long j10, long j11) {
        boolean z10;
        long h10 = (((float) this.f2996g.h()) * this.f3002m) / this.f3005q;
        j0<C0030a> j0Var = this.o;
        if (!j0Var.isEmpty()) {
            int i10 = 1;
            while (i10 < j0Var.size() - 1 && j0Var.get(i10).f3010a < h10) {
                i10++;
            }
            C0030a c0030a = j0Var.get(i10 - 1);
            C0030a c0030a2 = j0Var.get(i10);
            long j12 = c0030a.f3010a;
            float f = ((float) (h10 - j12)) / ((float) (c0030a2.f3010a - j12));
            long j13 = c0030a2.f3011b;
            h10 = (f * ((float) (j13 - r3))) + c0030a.f3011b;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f3013b; i12++) {
            if (j10 == Long.MIN_VALUE || !j(i12, j10)) {
                if (this.f3015d[i12].f30524z <= h10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return i12;
                }
                i11 = i12;
            }
        }
        return i11;
    }
}
