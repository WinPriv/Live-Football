package com.applovin.exoplayer2.j;

import android.util.Pair;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.at;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.ac;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.u;

/* loaded from: classes.dex */
public abstract class f extends j {

    /* renamed from: a, reason: collision with root package name */
    private a f15978a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f15979a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f15980b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f15981c;

        /* renamed from: d, reason: collision with root package name */
        private final ad[] f15982d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f15983e;
        private final int[][][] f;

        /* renamed from: g, reason: collision with root package name */
        private final ad f15984g;

        public a(String[] strArr, int[] iArr, ad[] adVarArr, int[] iArr2, int[][][] iArr3, ad adVar) {
            this.f15980b = strArr;
            this.f15981c = iArr;
            this.f15982d = adVarArr;
            this.f = iArr3;
            this.f15983e = iArr2;
            this.f15984g = adVar;
            this.f15979a = iArr.length;
        }

        public int a() {
            return this.f15979a;
        }

        public ad b(int i10) {
            return this.f15982d[i10];
        }

        public int a(int i10) {
            return this.f15981c[i10];
        }
    }

    public abstract Pair<at[], d[]> a(a aVar, int[][][] iArr, int[] iArr2, p.a aVar2, ba baVar) throws com.applovin.exoplayer2.p;

    @Override // com.applovin.exoplayer2.j.j
    public final void a(Object obj) {
        this.f15978a = (a) obj;
    }

    @Override // com.applovin.exoplayer2.j.j
    public final k a(as[] asVarArr, ad adVar, p.a aVar, ba baVar) throws com.applovin.exoplayer2.p {
        int[] a10;
        int[] iArr = new int[asVarArr.length + 1];
        int length = asVarArr.length + 1;
        ac[][] acVarArr = new ac[length];
        int[][][] iArr2 = new int[asVarArr.length + 1][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = adVar.f15286b;
            acVarArr[i10] = new ac[i11];
            iArr2[i10] = new int[i11];
        }
        int[] a11 = a(asVarArr);
        for (int i12 = 0; i12 < adVar.f15286b; i12++) {
            ac a12 = adVar.a(i12);
            int a13 = a(asVarArr, a12, iArr, u.e(a12.a(0).f16838l) == 5);
            if (a13 == asVarArr.length) {
                a10 = new int[a12.f15281a];
            } else {
                a10 = a(asVarArr[a13], a12);
            }
            int i13 = iArr[a13];
            acVarArr[a13][i13] = a12;
            iArr2[a13][i13] = a10;
            iArr[a13] = i13 + 1;
        }
        ad[] adVarArr = new ad[asVarArr.length];
        String[] strArr = new String[asVarArr.length];
        int[] iArr3 = new int[asVarArr.length];
        for (int i14 = 0; i14 < asVarArr.length; i14++) {
            int i15 = iArr[i14];
            adVarArr[i14] = new ad((ac[]) ai.a(acVarArr[i14], i15));
            iArr2[i14] = (int[][]) ai.a(iArr2[i14], i15);
            strArr[i14] = asVarArr[i14].y();
            iArr3[i14] = asVarArr[i14].a();
        }
        a aVar2 = new a(strArr, iArr3, adVarArr, a11, iArr2, new ad((ac[]) ai.a(acVarArr[asVarArr.length], iArr[asVarArr.length])));
        Pair<at[], d[]> a14 = a(aVar2, iArr2, a11, aVar, baVar);
        return new k((at[]) a14.first, (d[]) a14.second, aVar2);
    }

    private static int a(as[] asVarArr, ac acVar, int[] iArr, boolean z10) throws com.applovin.exoplayer2.p {
        int length = asVarArr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < asVarArr.length; i11++) {
            as asVar = asVarArr[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < acVar.f15281a; i13++) {
                i12 = Math.max(i12, as.c(asVar.a(acVar.a(i13))));
            }
            boolean z12 = iArr[i11] == 0;
            if (i12 > i10 || (i12 == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = i12;
            }
        }
        return length;
    }

    private static int[] a(as asVar, ac acVar) throws com.applovin.exoplayer2.p {
        int[] iArr = new int[acVar.f15281a];
        for (int i10 = 0; i10 < acVar.f15281a; i10++) {
            iArr[i10] = asVar.a(acVar.a(i10));
        }
        return iArr;
    }

    private static int[] a(as[] asVarArr) throws com.applovin.exoplayer2.p {
        int length = asVarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = asVarArr[i10].o();
        }
        return iArr;
    }
}
