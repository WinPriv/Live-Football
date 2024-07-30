package com.applovin.exoplayer2.j;

import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.a.ad;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.h.ac;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.j.d;
import com.applovin.exoplayer2.l.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class a extends com.applovin.exoplayer2.j.b {

    /* renamed from: d, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.d f15885d;

    /* renamed from: e, reason: collision with root package name */
    private final long f15886e;
    private final long f;

    /* renamed from: g, reason: collision with root package name */
    private final long f15887g;

    /* renamed from: h, reason: collision with root package name */
    private final float f15888h;

    /* renamed from: i, reason: collision with root package name */
    private final float f15889i;

    /* renamed from: j, reason: collision with root package name */
    private final s<C0182a> f15890j;

    /* renamed from: k, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.d f15891k;

    /* renamed from: l, reason: collision with root package name */
    private float f15892l;

    /* renamed from: m, reason: collision with root package name */
    private int f15893m;

    /* renamed from: n, reason: collision with root package name */
    private int f15894n;
    private long o;

    /* renamed from: p, reason: collision with root package name */
    private com.applovin.exoplayer2.h.b.b f15895p;

    /* renamed from: com.applovin.exoplayer2.j.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0182a {

        /* renamed from: a, reason: collision with root package name */
        public final long f15896a;

        /* renamed from: b, reason: collision with root package name */
        public final long f15897b;

        public C0182a(long j10, long j11) {
            this.f15896a = j10;
            this.f15897b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0182a)) {
                return false;
            }
            C0182a c0182a = (C0182a) obj;
            if (this.f15896a == c0182a.f15896a && this.f15897b == c0182a.f15897b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f15896a) * 31) + ((int) this.f15897b);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements d.b {

        /* renamed from: a, reason: collision with root package name */
        private final int f15898a;

        /* renamed from: b, reason: collision with root package name */
        private final int f15899b;

        /* renamed from: c, reason: collision with root package name */
        private final int f15900c;

        /* renamed from: d, reason: collision with root package name */
        private final float f15901d;

        /* renamed from: e, reason: collision with root package name */
        private final float f15902e;
        private final com.applovin.exoplayer2.l.d f;

        public b() {
            this(10000, 25000, 25000, 0.7f, 0.75f, com.applovin.exoplayer2.l.d.f16291a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.j.d.b
        public final d[] a(d.a[] aVarArr, com.applovin.exoplayer2.k.d dVar, p.a aVar, ba baVar) {
            d a10;
            s b10 = a.b(aVarArr);
            d[] dVarArr = new d[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                d.a aVar2 = aVarArr[i10];
                if (aVar2 != null) {
                    int[] iArr = aVar2.f15974b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            a10 = new e(aVar2.f15973a, iArr[0], aVar2.f15975c);
                        } else {
                            a10 = a(aVar2.f15973a, iArr, aVar2.f15975c, dVar, (s) b10.get(i10));
                        }
                        dVarArr[i10] = a10;
                    }
                }
            }
            return dVarArr;
        }

        public b(int i10, int i11, int i12, float f, float f10, com.applovin.exoplayer2.l.d dVar) {
            this.f15898a = i10;
            this.f15899b = i11;
            this.f15900c = i12;
            this.f15901d = f;
            this.f15902e = f10;
            this.f = dVar;
        }

        public a a(ac acVar, int[] iArr, int i10, com.applovin.exoplayer2.k.d dVar, s<C0182a> sVar) {
            return new a(acVar, iArr, i10, dVar, this.f15898a, this.f15899b, this.f15900c, this.f15901d, this.f15902e, sVar, this.f);
        }
    }

    public a(ac acVar, int[] iArr, int i10, com.applovin.exoplayer2.k.d dVar, long j10, long j11, long j12, float f, float f10, List<C0182a> list, com.applovin.exoplayer2.l.d dVar2) {
        super(acVar, iArr, i10);
        if (j12 < j10) {
            q.c("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j12 = j10;
        }
        this.f15885d = dVar;
        this.f15886e = j10 * 1000;
        this.f = j11 * 1000;
        this.f15887g = j12 * 1000;
        this.f15888h = f;
        this.f15889i = f10;
        this.f15890j = s.a((Collection) list);
        this.f15891k = dVar2;
        this.f15892l = 1.0f;
        this.f15894n = 0;
        this.o = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // com.applovin.exoplayer2.j.b, com.applovin.exoplayer2.j.d
    public void b() {
        this.f15895p = null;
    }

    @Override // com.applovin.exoplayer2.j.d
    public int c() {
        return this.f15893m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static s<s<C0182a>> b(d.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (d.a aVar : aVarArr) {
            if (aVar != null && aVar.f15974b.length > 1) {
                s.a i10 = s.i();
                i10.a(new C0182a(0L, 0L));
                arrayList.add(i10);
            } else {
                arrayList.add(null);
            }
        }
        long[][] c10 = c(aVarArr);
        int[] iArr = new int[c10.length];
        long[] jArr = new long[c10.length];
        for (int i11 = 0; i11 < c10.length; i11++) {
            long[] jArr2 = c10[i11];
            jArr[i11] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        a(arrayList, jArr);
        s<Integer> a10 = a(c10);
        for (int i12 = 0; i12 < a10.size(); i12++) {
            int intValue = a10.get(i12).intValue();
            int i13 = iArr[intValue] + 1;
            iArr[intValue] = i13;
            jArr[intValue] = c10[intValue][i13];
            a(arrayList, jArr);
        }
        for (int i14 = 0; i14 < aVarArr.length; i14++) {
            if (arrayList.get(i14) != null) {
                jArr[i14] = jArr[i14] * 2;
            }
        }
        a(arrayList, jArr);
        s.a i15 = s.i();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            s.a aVar2 = (s.a) arrayList.get(i16);
            i15.a(aVar2 == null ? s.g() : aVar2.a());
        }
        return i15.a();
    }

    private static long[][] c(d.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            d.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f15974b.length];
                int i11 = 0;
                while (true) {
                    if (i11 >= aVar.f15974b.length) {
                        break;
                    }
                    jArr[i10][i11] = aVar.f15973a.a(r5[i11]).f16834h;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    @Override // com.applovin.exoplayer2.j.b, com.applovin.exoplayer2.j.d
    public void a() {
        this.o = com.anythink.expressad.exoplayer.b.f7291b;
        this.f15895p = null;
    }

    @Override // com.applovin.exoplayer2.j.b, com.applovin.exoplayer2.j.d
    public void a(float f) {
        this.f15892l = f;
    }

    private static s<Integer> a(long[][] jArr) {
        com.applovin.exoplayer2.common.a.ac b10 = ad.a().b().b();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long[] jArr2 = jArr[i10];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    long[] jArr3 = jArr[i10];
                    double d10 = 0.0d;
                    if (i11 >= jArr3.length) {
                        break;
                    }
                    long j10 = jArr3[i11];
                    if (j10 != -1) {
                        d10 = Math.log(j10);
                    }
                    dArr[i11] = d10;
                    i11++;
                }
                int i12 = length - 1;
                double d11 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d12 = dArr[i13];
                    i13++;
                    b10.a(Double.valueOf(d11 == 0.0d ? 1.0d : (((d12 + dArr[i13]) * 0.5d) - dArr[0]) / d11), Integer.valueOf(i10));
                }
            }
        }
        return s.a(b10.h());
    }

    private static void a(List<s.a<C0182a>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            s.a<C0182a> aVar = list.get(i10);
            if (aVar != null) {
                aVar.a(new C0182a(j10, jArr[i10]));
            }
        }
    }
}
