package com.applovin.exoplayer2.j;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.at;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.a.ai;
import com.applovin.exoplayer2.common.a.n;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.d.w;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.h.ac;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.j.a;
import com.applovin.exoplayer2.j.d;
import com.applovin.exoplayer2.j.f;
import com.applovin.exoplayer2.j.i;
import com.applovin.exoplayer2.v;
import com.huawei.hms.ads.br;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class c extends com.applovin.exoplayer2.j.f {

    /* renamed from: a */
    private static final int[] f15909a = new int[0];

    /* renamed from: b */
    private static final ai<Integer> f15910b = ai.a(new l(0));

    /* renamed from: c */
    private static final ai<Integer> f15911c = ai.a(new m(0));

    /* renamed from: d */
    private final d.b f15912d;

    /* renamed from: e */
    private final AtomicReference<C0183c> f15913e;

    /* loaded from: classes.dex */
    public static final class a implements Comparable<a> {

        /* renamed from: a */
        public final boolean f15914a;

        /* renamed from: b */
        private final String f15915b;

        /* renamed from: c */
        private final C0183c f15916c;

        /* renamed from: d */
        private final boolean f15917d;

        /* renamed from: e */
        private final int f15918e;
        private final int f;

        /* renamed from: g */
        private final int f15919g;

        /* renamed from: h */
        private final int f15920h;

        /* renamed from: i */
        private final int f15921i;

        /* renamed from: j */
        private final boolean f15922j;

        /* renamed from: k */
        private final int f15923k;

        /* renamed from: l */
        private final int f15924l;

        /* renamed from: m */
        private final int f15925m;

        /* renamed from: n */
        private final int f15926n;

        public a(v vVar, C0183c c0183c, int i10) {
            int i11;
            int i12;
            boolean z10;
            int i13;
            this.f15916c = c0183c;
            this.f15915b = c.a(vVar.f16830c);
            int i14 = 0;
            this.f15917d = c.a(i10, false);
            int i15 = 0;
            while (true) {
                i11 = Integer.MAX_VALUE;
                if (i15 < c0183c.C.size()) {
                    i12 = c.a(vVar, c0183c.C.get(i15), false);
                    if (i12 > 0) {
                        break;
                    } else {
                        i15++;
                    }
                } else {
                    i12 = 0;
                    i15 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.f = i15;
            this.f15918e = i12;
            this.f15919g = Integer.bitCount(vVar.f16832e & c0183c.D);
            boolean z11 = true;
            if ((vVar.f16831d & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f15922j = z10;
            int i16 = vVar.y;
            this.f15923k = i16;
            this.f15924l = vVar.f16850z;
            int i17 = vVar.f16834h;
            this.f15925m = i17;
            if ((i17 != -1 && i17 > c0183c.F) || (i16 != -1 && i16 > c0183c.E)) {
                z11 = false;
            }
            this.f15914a = z11;
            String[] d10 = com.applovin.exoplayer2.l.ai.d();
            int i18 = 0;
            while (true) {
                if (i18 < d10.length) {
                    i13 = c.a(vVar, d10[i18], false);
                    if (i13 > 0) {
                        break;
                    } else {
                        i18++;
                    }
                } else {
                    i13 = 0;
                    i18 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.f15920h = i18;
            this.f15921i = i13;
            while (true) {
                if (i14 < c0183c.G.size()) {
                    String str = vVar.f16838l;
                    if (str != null && str.equals(c0183c.G.get(i14))) {
                        i11 = i14;
                        break;
                    }
                    i14++;
                } else {
                    break;
                }
            }
            this.f15926n = i11;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(a aVar) {
            ai a10;
            ai aiVar;
            if (this.f15914a && this.f15917d) {
                a10 = c.f15910b;
            } else {
                a10 = c.f15910b.a();
            }
            n a11 = n.a().b(this.f15917d, aVar.f15917d).a(Integer.valueOf(this.f), Integer.valueOf(aVar.f), ai.b().a()).a(this.f15918e, aVar.f15918e).a(this.f15919g, aVar.f15919g).b(this.f15914a, aVar.f15914a).a(Integer.valueOf(this.f15926n), Integer.valueOf(aVar.f15926n), ai.b().a());
            Integer valueOf = Integer.valueOf(this.f15925m);
            Integer valueOf2 = Integer.valueOf(aVar.f15925m);
            if (!this.f15916c.K) {
                aiVar = c.f15911c;
            } else {
                aiVar = c.f15910b.a();
            }
            n a12 = a11.a(valueOf, valueOf2, aiVar).b(this.f15922j, aVar.f15922j).a(Integer.valueOf(this.f15920h), Integer.valueOf(aVar.f15920h), ai.b().a()).a(this.f15921i, aVar.f15921i).a(Integer.valueOf(this.f15923k), Integer.valueOf(aVar.f15923k), a10).a(Integer.valueOf(this.f15924l), Integer.valueOf(aVar.f15924l), a10);
            Integer valueOf3 = Integer.valueOf(this.f15925m);
            Integer valueOf4 = Integer.valueOf(aVar.f15925m);
            if (!com.applovin.exoplayer2.l.ai.a((Object) this.f15915b, (Object) aVar.f15915b)) {
                a10 = c.f15911c;
            }
            return a12.a(valueOf3, valueOf4, a10).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: a */
        private final boolean f15927a;

        /* renamed from: b */
        private final boolean f15928b;

        public b(v vVar, int i10) {
            this.f15927a = (vVar.f16831d & 1) != 0;
            this.f15928b = c.a(i10, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(b bVar) {
            return n.a().b(this.f15928b, bVar.f15928b).b(this.f15927a, bVar.f15927a).b();
        }
    }

    /* renamed from: com.applovin.exoplayer2.j.c$c */
    /* loaded from: classes.dex */
    public static final class C0183c extends i {

        /* renamed from: a */
        public static final C0183c f15929a;

        /* renamed from: b */
        @Deprecated
        public static final C0183c f15930b;

        /* renamed from: n */
        public static final g.a<C0183c> f15931n;
        private final SparseArray<Map<ad, e>> O;
        private final SparseBooleanArray P;

        /* renamed from: c */
        public final int f15932c;

        /* renamed from: d */
        public final boolean f15933d;

        /* renamed from: e */
        public final boolean f15934e;
        public final boolean f;

        /* renamed from: g */
        public final boolean f15935g;

        /* renamed from: h */
        public final boolean f15936h;

        /* renamed from: i */
        public final boolean f15937i;

        /* renamed from: j */
        public final boolean f15938j;

        /* renamed from: k */
        public final boolean f15939k;

        /* renamed from: l */
        public final boolean f15940l;

        /* renamed from: m */
        public final boolean f15941m;

        static {
            C0183c b10 = new d().b();
            f15929a = b10;
            f15930b = b10;
            f15931n = new w(2);
        }

        public /* synthetic */ C0183c(d dVar, AnonymousClass1 anonymousClass1) {
            this(dVar);
        }

        public static C0183c a(Context context) {
            return new d(context).b();
        }

        @Override // com.applovin.exoplayer2.j.i
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0183c.class != obj.getClass()) {
                return false;
            }
            C0183c c0183c = (C0183c) obj;
            if (super.equals(c0183c) && this.f15933d == c0183c.f15933d && this.f15934e == c0183c.f15934e && this.f == c0183c.f && this.f15935g == c0183c.f15935g && this.f15936h == c0183c.f15936h && this.f15937i == c0183c.f15937i && this.f15938j == c0183c.f15938j && this.f15932c == c0183c.f15932c && this.f15939k == c0183c.f15939k && this.f15940l == c0183c.f15940l && this.f15941m == c0183c.f15941m && a(this.P, c0183c.P) && a(this.O, c0183c.O)) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.j.i
        public int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f15933d ? 1 : 0)) * 31) + (this.f15934e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.f15935g ? 1 : 0)) * 31) + (this.f15936h ? 1 : 0)) * 31) + (this.f15937i ? 1 : 0)) * 31) + (this.f15938j ? 1 : 0)) * 31) + this.f15932c) * 31) + (this.f15939k ? 1 : 0)) * 31) + (this.f15940l ? 1 : 0)) * 31) + (this.f15941m ? 1 : 0);
        }

        private C0183c(d dVar) {
            super(dVar);
            this.f15933d = dVar.f15942a;
            this.f15934e = dVar.f15943b;
            this.f = dVar.f15944c;
            this.f15935g = dVar.f15945d;
            this.f15936h = dVar.f15946e;
            this.f15937i = dVar.f;
            this.f15938j = dVar.f15947g;
            this.f15932c = dVar.f15948h;
            this.f15939k = dVar.f15949i;
            this.f15940l = dVar.f15950j;
            this.f15941m = dVar.f15951k;
            this.O = dVar.f15952l;
            this.P = dVar.f15953m;
        }

        public static String d(int i10) {
            return Integer.toString(i10, 36);
        }

        public final boolean a(int i10) {
            return this.P.get(i10);
        }

        public final e b(int i10, ad adVar) {
            Map<ad, e> map = this.O.get(i10);
            if (map != null) {
                return map.get(adVar);
            }
            return null;
        }

        public final boolean a(int i10, ad adVar) {
            Map<ad, e> map = this.O.get(i10);
            return map != null && map.containsKey(adVar);
        }

        public static /* synthetic */ C0183c a(Bundle bundle) {
            return new d(bundle).b();
        }

        private static boolean a(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean a(SparseArray<Map<ad, e>> sparseArray, SparseArray<Map<ad, e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (indexOfKey < 0 || !a(sparseArray.valueAt(i10), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean a(Map<ad, e> map, Map<ad, e> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<ad, e> entry : map.entrySet()) {
                ad key = entry.getKey();
                if (!map2.containsKey(key) || !com.applovin.exoplayer2.l.ai.a(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends i.a {

        /* renamed from: a */
        private boolean f15942a;

        /* renamed from: b */
        private boolean f15943b;

        /* renamed from: c */
        private boolean f15944c;

        /* renamed from: d */
        private boolean f15945d;

        /* renamed from: e */
        private boolean f15946e;
        private boolean f;

        /* renamed from: g */
        private boolean f15947g;

        /* renamed from: h */
        private int f15948h;

        /* renamed from: i */
        private boolean f15949i;

        /* renamed from: j */
        private boolean f15950j;

        /* renamed from: k */
        private boolean f15951k;

        /* renamed from: l */
        private final SparseArray<Map<ad, e>> f15952l;

        /* renamed from: m */
        private final SparseBooleanArray f15953m;

        public /* synthetic */ d(Bundle bundle, AnonymousClass1 anonymousClass1) {
            this(bundle);
        }

        @Deprecated
        public d() {
            this.f15952l = new SparseArray<>();
            this.f15953m = new SparseBooleanArray();
            c();
        }

        public d a(boolean z10) {
            this.f15942a = z10;
            return this;
        }

        public d c(boolean z10) {
            this.f15944c = z10;
            return this;
        }

        public d d(boolean z10) {
            this.f15945d = z10;
            return this;
        }

        public d e(boolean z10) {
            this.f15946e = z10;
            return this;
        }

        public d f(boolean z10) {
            this.f = z10;
            return this;
        }

        public d g(boolean z10) {
            this.f15947g = z10;
            return this;
        }

        public d h(boolean z10) {
            this.f15949i = z10;
            return this;
        }

        public d i(boolean z10) {
            this.f15950j = z10;
            return this;
        }

        public d j(boolean z10) {
            this.f15951k = z10;
            return this;
        }

        private void c() {
            this.f15942a = true;
            this.f15943b = false;
            this.f15944c = true;
            this.f15945d = true;
            this.f15946e = false;
            this.f = false;
            this.f15947g = false;
            this.f15948h = 0;
            this.f15949i = true;
            this.f15950j = false;
            this.f15951k = true;
        }

        @Override // com.applovin.exoplayer2.j.i.a
        /* renamed from: a */
        public d b(Context context, boolean z10) {
            super.b(context, z10);
            return this;
        }

        @Override // com.applovin.exoplayer2.j.i.a
        /* renamed from: a */
        public d b(int i10, int i11, boolean z10) {
            super.b(i10, i11, z10);
            return this;
        }

        @Override // com.applovin.exoplayer2.j.i.a
        /* renamed from: a */
        public d b(Context context) {
            super.b(context);
            return this;
        }

        public d(Context context) {
            super(context);
            this.f15952l = new SparseArray<>();
            this.f15953m = new SparseBooleanArray();
            c();
        }

        public d a(int i10) {
            this.f15948h = i10;
            return this;
        }

        public d b(boolean z10) {
            this.f15943b = z10;
            return this;
        }

        public final d a(int i10, ad adVar, e eVar) {
            Map<ad, e> map = this.f15952l.get(i10);
            if (map == null) {
                map = new HashMap<>();
                this.f15952l.put(i10, map);
            }
            if (map.containsKey(adVar) && com.applovin.exoplayer2.l.ai.a(map.get(adVar), eVar)) {
                return this;
            }
            map.put(adVar, eVar);
            return this;
        }

        private d(Bundle bundle) {
            super(bundle);
            C0183c c0183c = C0183c.f15929a;
            a(bundle.getBoolean(C0183c.d(1000), c0183c.f15933d));
            b(bundle.getBoolean(C0183c.d(1001), c0183c.f15934e));
            c(bundle.getBoolean(C0183c.d(1002), c0183c.f));
            d(bundle.getBoolean(C0183c.d(1003), c0183c.f15935g));
            e(bundle.getBoolean(C0183c.d(1004), c0183c.f15936h));
            f(bundle.getBoolean(C0183c.d(1005), c0183c.f15937i));
            g(bundle.getBoolean(C0183c.d(1006), c0183c.f15938j));
            a(bundle.getInt(C0183c.d(1007), c0183c.f15932c));
            h(bundle.getBoolean(C0183c.d(1008), c0183c.f15939k));
            i(bundle.getBoolean(C0183c.d(br.L), c0183c.f15940l));
            j(bundle.getBoolean(C0183c.d(1010), c0183c.f15941m));
            this.f15952l = new SparseArray<>();
            a(bundle);
            this.f15953m = a(bundle.getIntArray(C0183c.d(1014)));
        }

        @Override // com.applovin.exoplayer2.j.i.a
        /* renamed from: a */
        public C0183c b() {
            return new C0183c(this);
        }

        private void a(Bundle bundle) {
            int[] intArray = bundle.getIntArray(C0183c.d(1011));
            List a10 = com.applovin.exoplayer2.l.c.a(ad.f15285c, bundle.getParcelableArrayList(C0183c.d(1012)), s.g());
            SparseArray a11 = com.applovin.exoplayer2.l.c.a(e.f15954e, (SparseArray<Bundle>) bundle.getSparseParcelableArray(C0183c.d(1013)), new SparseArray());
            if (intArray == null || intArray.length != a10.size()) {
                return;
            }
            for (int i10 = 0; i10 < intArray.length; i10++) {
                a(intArray[i10], (ad) a10.get(i10), (e) a11.get(i10));
            }
        }

        private SparseBooleanArray a(int[] iArr) {
            if (iArr == null) {
                return new SparseBooleanArray();
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
            for (int i10 : iArr) {
                sparseBooleanArray.append(i10, true);
            }
            return sparseBooleanArray;
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements Comparable<f> {

        /* renamed from: a */
        public final boolean f15959a;

        /* renamed from: b */
        private final boolean f15960b;

        /* renamed from: c */
        private final boolean f15961c;

        /* renamed from: d */
        private final boolean f15962d;

        /* renamed from: e */
        private final int f15963e;
        private final int f;

        /* renamed from: g */
        private final int f15964g;

        /* renamed from: h */
        private final int f15965h;

        /* renamed from: i */
        private final boolean f15966i;

        public f(v vVar, C0183c c0183c, int i10, String str) {
            boolean z10;
            boolean z11;
            s<String> sVar;
            int i11;
            boolean z12;
            boolean z13;
            boolean z14 = false;
            this.f15960b = c.a(i10, false);
            int i12 = vVar.f16831d & (~c0183c.f15932c);
            if ((i12 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f15961c = z10;
            if ((i12 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f15962d = z11;
            if (c0183c.H.isEmpty()) {
                sVar = s.a("");
            } else {
                sVar = c0183c.H;
            }
            int i13 = 0;
            while (true) {
                if (i13 < sVar.size()) {
                    i11 = c.a(vVar, sVar.get(i13), c0183c.J);
                    if (i11 > 0) {
                        break;
                    } else {
                        i13++;
                    }
                } else {
                    i13 = Integer.MAX_VALUE;
                    i11 = 0;
                    break;
                }
            }
            this.f15963e = i13;
            this.f = i11;
            int bitCount = Integer.bitCount(vVar.f16832e & c0183c.I);
            this.f15964g = bitCount;
            if ((vVar.f16832e & 1088) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f15966i = z12;
            if (c.a(str) == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            int a10 = c.a(vVar, str, z13);
            this.f15965h = a10;
            if (i11 > 0 || ((c0183c.H.isEmpty() && bitCount > 0) || this.f15961c || (this.f15962d && a10 > 0))) {
                z14 = true;
            }
            this.f15959a = z14;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(f fVar) {
            ai a10;
            n b10 = n.a().b(this.f15960b, fVar.f15960b).a(Integer.valueOf(this.f15963e), Integer.valueOf(fVar.f15963e), ai.b().a()).a(this.f, fVar.f).a(this.f15964g, fVar.f15964g).b(this.f15961c, fVar.f15961c);
            Boolean valueOf = Boolean.valueOf(this.f15962d);
            Boolean valueOf2 = Boolean.valueOf(fVar.f15962d);
            if (this.f == 0) {
                a10 = ai.b();
            } else {
                a10 = ai.b().a();
            }
            n a11 = b10.a(valueOf, valueOf2, a10).a(this.f15965h, fVar.f15965h);
            if (this.f15964g == 0) {
                a11 = a11.a(this.f15966i, fVar.f15966i);
            }
            return a11.b();
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements Comparable<g> {

        /* renamed from: a */
        public final boolean f15967a;

        /* renamed from: b */
        private final C0183c f15968b;

        /* renamed from: c */
        private final boolean f15969c;

        /* renamed from: d */
        private final boolean f15970d;

        /* renamed from: e */
        private final int f15971e;
        private final int f;

        /* renamed from: g */
        private final int f15972g;

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
        
            if (r10 < r8.f15995w) goto L99;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
        
            if (r10 < r8.f15996x) goto L99;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x008d A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public g(com.applovin.exoplayer2.v r7, com.applovin.exoplayer2.j.c.C0183c r8, int r9, boolean r10) {
            /*
                r6 = this;
                r6.<init>()
                r6.f15968b = r8
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1 = 1
                r2 = 0
                r3 = -1
                if (r10 == 0) goto L33
                int r4 = r7.f16842q
                if (r4 == r3) goto L14
                int r5 = r8.f15989q
                if (r4 > r5) goto L33
            L14:
                int r4 = r7.f16843r
                if (r4 == r3) goto L1c
                int r5 = r8.f15990r
                if (r4 > r5) goto L33
            L1c:
                float r4 = r7.f16844s
                int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r5 == 0) goto L29
                int r5 = r8.f15991s
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 > 0) goto L33
            L29:
                int r4 = r7.f16834h
                if (r4 == r3) goto L31
                int r5 = r8.f15992t
                if (r4 > r5) goto L33
            L31:
                r4 = r1
                goto L34
            L33:
                r4 = r2
            L34:
                r6.f15967a = r4
                if (r10 == 0) goto L5e
                int r10 = r7.f16842q
                if (r10 == r3) goto L40
                int r4 = r8.f15993u
                if (r10 < r4) goto L5e
            L40:
                int r10 = r7.f16843r
                if (r10 == r3) goto L48
                int r4 = r8.f15994v
                if (r10 < r4) goto L5e
            L48:
                float r10 = r7.f16844s
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L55
                int r0 = r8.f15995w
                float r0 = (float) r0
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L5e
            L55:
                int r10 = r7.f16834h
                if (r10 == r3) goto L5f
                int r0 = r8.f15996x
                if (r10 < r0) goto L5e
                goto L5f
            L5e:
                r1 = r2
            L5f:
                r6.f15969c = r1
                boolean r9 = com.applovin.exoplayer2.j.c.a(r9, r2)
                r6.f15970d = r9
                int r9 = r7.f16834h
                r6.f15971e = r9
                int r9 = r7.b()
                r6.f = r9
            L71:
                com.applovin.exoplayer2.common.a.s<java.lang.String> r9 = r8.B
                int r9 = r9.size()
                if (r2 >= r9) goto L8d
                java.lang.String r9 = r7.f16838l
                if (r9 == 0) goto L8a
                com.applovin.exoplayer2.common.a.s<java.lang.String> r10 = r8.B
                java.lang.Object r10 = r10.get(r2)
                boolean r9 = r9.equals(r10)
                if (r9 == 0) goto L8a
                goto L90
            L8a:
                int r2 = r2 + 1
                goto L71
            L8d:
                r2 = 2147483647(0x7fffffff, float:NaN)
            L90:
                r6.f15972g = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.j.c.g.<init>(com.applovin.exoplayer2.v, com.applovin.exoplayer2.j.c$c, int, boolean):void");
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(g gVar) {
            ai a10;
            ai aiVar;
            if (this.f15967a && this.f15970d) {
                a10 = c.f15910b;
            } else {
                a10 = c.f15910b.a();
            }
            n a11 = n.a().b(this.f15970d, gVar.f15970d).b(this.f15967a, gVar.f15967a).b(this.f15969c, gVar.f15969c).a(Integer.valueOf(this.f15972g), Integer.valueOf(gVar.f15972g), ai.b().a());
            Integer valueOf = Integer.valueOf(this.f15971e);
            Integer valueOf2 = Integer.valueOf(gVar.f15971e);
            if (!this.f15968b.K) {
                aiVar = c.f15911c;
            } else {
                aiVar = c.f15910b.a();
            }
            return a11.a(valueOf, valueOf2, aiVar).a(Integer.valueOf(this.f), Integer.valueOf(gVar.f), a10).a(Integer.valueOf(this.f15971e), Integer.valueOf(gVar.f15971e), a10).b();
        }
    }

    @Deprecated
    public c() {
        this(C0183c.f15929a, new a.b());
    }

    public static /* synthetic */ int a(Integer num, Integer num2) {
        return 0;
    }

    public c(Context context) {
        this(context, new a.b());
    }

    public static /* synthetic */ int b(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    @Override // com.applovin.exoplayer2.j.j
    public boolean a() {
        return true;
    }

    public c(Context context, d.b bVar) {
        this(C0183c.a(context), bVar);
    }

    @Override // com.applovin.exoplayer2.j.f
    public final Pair<at[], com.applovin.exoplayer2.j.d[]> a(f.a aVar, int[][][] iArr, int[] iArr2, p.a aVar2, ba baVar) throws com.applovin.exoplayer2.p {
        C0183c c0183c = this.f15913e.get();
        int a10 = aVar.a();
        d.a[] a11 = a(aVar, iArr, iArr2, c0183c);
        int i10 = 0;
        while (true) {
            if (i10 >= a10) {
                break;
            }
            int a12 = aVar.a(i10);
            if (!c0183c.a(i10) && !c0183c.M.contains(Integer.valueOf(a12))) {
                ad b10 = aVar.b(i10);
                if (c0183c.a(i10, b10)) {
                    e b11 = c0183c.b(i10, b10);
                    a11[i10] = b11 != null ? new d.a(b10.a(b11.f15955a), b11.f15956b, b11.f15958d) : null;
                }
            } else {
                a11[i10] = null;
            }
            i10++;
        }
        com.applovin.exoplayer2.j.d[] a13 = this.f15912d.a(a11, d(), aVar2, baVar);
        at[] atVarArr = new at[a10];
        for (int i11 = 0; i11 < a10; i11++) {
            boolean z10 = true;
            if ((c0183c.a(i11) || c0183c.M.contains(Integer.valueOf(aVar.a(i11)))) || (aVar.a(i11) != -2 && a13[i11] == null)) {
                z10 = false;
            }
            atVarArr[i11] = z10 ? at.f13249a : null;
        }
        if (c0183c.f15940l) {
            a(aVar, iArr, atVarArr, a13);
        }
        return Pair.create(atVarArr, a13);
    }

    public c(C0183c c0183c, d.b bVar) {
        this.f15912d = bVar;
        this.f15913e = new AtomicReference<>(c0183c);
    }

    private static void b(ac acVar, int[] iArr, int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!a(acVar.a(intValue), str, iArr[intValue], i10, i11, i12, i13, i14, i15, i16, i17, i18)) {
                list.remove(size);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements com.applovin.exoplayer2.g {

        /* renamed from: e */
        public static final g.a<e> f15954e = new com.applovin.exoplayer2.a.l(7);

        /* renamed from: a */
        public final int f15955a;

        /* renamed from: b */
        public final int[] f15956b;

        /* renamed from: c */
        public final int f15957c;

        /* renamed from: d */
        public final int f15958d;

        public e(int i10, int[] iArr, int i11) {
            this.f15955a = i10;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f15956b = copyOf;
            this.f15957c = iArr.length;
            this.f15958d = i11;
            Arrays.sort(copyOf);
        }

        public static /* synthetic */ e a(Bundle bundle) {
            boolean z10 = false;
            int i10 = bundle.getInt(a(0), -1);
            int[] intArray = bundle.getIntArray(a(1));
            int i11 = bundle.getInt(a(2), -1);
            if (i10 >= 0 && i11 >= 0) {
                z10 = true;
            }
            com.applovin.exoplayer2.l.a.a(z10);
            com.applovin.exoplayer2.l.a.b(intArray);
            return new e(i10, intArray, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f15955a == eVar.f15955a && Arrays.equals(this.f15956b, eVar.f15956b) && this.f15958d == eVar.f15958d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((Arrays.hashCode(this.f15956b) + (this.f15955a * 31)) * 31) + this.f15958d;
        }

        private static String a(int i10) {
            return Integer.toString(i10, 36);
        }
    }

    public Pair<d.a, a> b(ad adVar, int[][] iArr, int i10, C0183c c0183c, boolean z10) throws com.applovin.exoplayer2.p {
        d.a aVar = null;
        int i11 = -1;
        int i12 = -1;
        a aVar2 = null;
        for (int i13 = 0; i13 < adVar.f15286b; i13++) {
            ac a10 = adVar.a(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < a10.f15281a; i14++) {
                if (a(iArr2[i14], c0183c.f15939k)) {
                    a aVar3 = new a(a10.a(i14), c0183c, iArr2[i14]);
                    if ((aVar3.f15914a || c0183c.f15935g) && (aVar2 == null || aVar3.compareTo(aVar2) > 0)) {
                        i11 = i13;
                        i12 = i14;
                        aVar2 = aVar3;
                    }
                }
            }
        }
        if (i11 == -1) {
            return null;
        }
        ac a11 = adVar.a(i11);
        if (!c0183c.L && !c0183c.K && z10) {
            int[] a12 = a(a11, iArr[i11], i12, c0183c.F, c0183c.f15936h, c0183c.f15937i, c0183c.f15938j);
            if (a12.length > 1) {
                aVar = new d.a(a11, a12);
            }
        }
        if (aVar == null) {
            aVar = new d.a(a11, i12);
        }
        return Pair.create(aVar, (a) com.applovin.exoplayer2.l.a.b(aVar2));
    }

    public d.a[] a(f.a aVar, int[][][] iArr, int[] iArr2, C0183c c0183c) throws com.applovin.exoplayer2.p {
        boolean z10;
        String str;
        int i10;
        a aVar2;
        String str2;
        int i11;
        int a10 = aVar.a();
        d.a[] aVarArr = new d.a[a10];
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        boolean z12 = false;
        while (true) {
            if (i13 >= a10) {
                break;
            }
            if (2 == aVar.a(i13)) {
                if (!z11) {
                    d.a a11 = a(aVar.b(i13), iArr[i13], iArr2[i13], c0183c, true);
                    aVarArr[i13] = a11;
                    z11 = a11 != null;
                }
                z12 |= aVar.b(i13).f15286b > 0;
            }
            i13++;
        }
        int i14 = 0;
        int i15 = -1;
        a aVar3 = null;
        String str3 = null;
        while (i14 < a10) {
            if (z10 == aVar.a(i14)) {
                boolean z13 = (c0183c.f15941m || !z12) ? z10 : false;
                i10 = i15;
                aVar2 = aVar3;
                str2 = str3;
                i11 = i14;
                Pair<d.a, a> b10 = b(aVar.b(i14), iArr[i14], iArr2[i14], c0183c, z13);
                if (b10 != null && (aVar2 == null || ((a) b10.second).compareTo(aVar2) > 0)) {
                    if (i10 != -1) {
                        aVarArr[i10] = null;
                    }
                    d.a aVar4 = (d.a) b10.first;
                    aVarArr[i11] = aVar4;
                    str3 = aVar4.f15973a.a(aVar4.f15974b[0]).f16830c;
                    aVar3 = (a) b10.second;
                    i15 = i11;
                    i14 = i11 + 1;
                    z10 = true;
                }
            } else {
                i10 = i15;
                aVar2 = aVar3;
                str2 = str3;
                i11 = i14;
            }
            i15 = i10;
            aVar3 = aVar2;
            str3 = str2;
            i14 = i11 + 1;
            z10 = true;
        }
        String str4 = str3;
        int i16 = -1;
        f fVar = null;
        while (i12 < a10) {
            int a12 = aVar.a(i12);
            if (a12 != 1) {
                if (a12 != 2) {
                    if (a12 != 3) {
                        aVarArr[i12] = a(a12, aVar.b(i12), iArr[i12], c0183c);
                    } else {
                        str = str4;
                        Pair<d.a, f> a13 = a(aVar.b(i12), iArr[i12], c0183c, str);
                        if (a13 != null && (fVar == null || ((f) a13.second).compareTo(fVar) > 0)) {
                            if (i16 != -1) {
                                aVarArr[i16] = null;
                            }
                            aVarArr[i12] = (d.a) a13.first;
                            fVar = (f) a13.second;
                            i16 = i12;
                        }
                    }
                }
                str = str4;
            } else {
                str = str4;
            }
            i12++;
            str4 = str;
        }
        return aVarArr;
    }

    public d.a a(ad adVar, int[][] iArr, int i10, C0183c c0183c, boolean z10) throws com.applovin.exoplayer2.p {
        d.a a10 = (c0183c.L || c0183c.K || !z10) ? null : a(adVar, iArr, i10, c0183c);
        return a10 == null ? a(adVar, iArr, c0183c) : a10;
    }

    private static d.a a(ad adVar, int[][] iArr, int i10, C0183c c0183c) {
        ad adVar2 = adVar;
        C0183c c0183c2 = c0183c;
        int i11 = c0183c2.f ? 24 : 16;
        boolean z10 = c0183c2.f15934e && (i10 & i11) != 0;
        int i12 = 0;
        while (i12 < adVar2.f15286b) {
            ac a10 = adVar2.a(i12);
            int i13 = i12;
            int[] a11 = a(a10, iArr[i12], z10, i11, c0183c2.f15989q, c0183c2.f15990r, c0183c2.f15991s, c0183c2.f15992t, c0183c2.f15993u, c0183c2.f15994v, c0183c2.f15995w, c0183c2.f15996x, c0183c2.y, c0183c2.f15997z, c0183c2.A);
            if (a11.length > 0) {
                return new d.a(a10, a11);
            }
            i12 = i13 + 1;
            adVar2 = adVar;
            c0183c2 = c0183c;
        }
        return null;
    }

    private static int[] a(ac acVar, int[] iArr, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, boolean z11) {
        String str;
        int i21;
        int i22;
        HashSet hashSet;
        if (acVar.f15281a < 2) {
            return f15909a;
        }
        List<Integer> a10 = a(acVar, i19, i20, z11);
        if (a10.size() < 2) {
            return f15909a;
        }
        if (z10) {
            str = null;
        } else {
            HashSet hashSet2 = new HashSet();
            String str2 = null;
            int i23 = 0;
            int i24 = 0;
            while (i24 < a10.size()) {
                String str3 = acVar.a(a10.get(i24).intValue()).f16838l;
                if (hashSet2.add(str3)) {
                    i21 = i23;
                    i22 = i24;
                    hashSet = hashSet2;
                    int a11 = a(acVar, iArr, i10, str3, i11, i12, i13, i14, i15, i16, i17, i18, a10);
                    if (a11 > i21) {
                        i23 = a11;
                        str2 = str3;
                        i24 = i22 + 1;
                        hashSet2 = hashSet;
                    }
                } else {
                    i21 = i23;
                    i22 = i24;
                    hashSet = hashSet2;
                }
                i23 = i21;
                i24 = i22 + 1;
                hashSet2 = hashSet;
            }
            str = str2;
        }
        b(acVar, iArr, i10, str, i11, i12, i13, i14, i15, i16, i17, i18, a10);
        return a10.size() < 2 ? f15909a : com.applovin.exoplayer2.common.b.c.a(a10);
    }

    private static int a(ac acVar, int[] iArr, int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, List<Integer> list) {
        int i19 = 0;
        for (int i20 = 0; i20 < list.size(); i20++) {
            int intValue = list.get(i20).intValue();
            if (a(acVar.a(intValue), str, iArr[intValue], i10, i11, i12, i13, i14, i15, i16, i17, i18)) {
                i19++;
            }
        }
        return i19;
    }

    private static boolean a(v vVar, String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int i20;
        if ((vVar.f16832e & 16384) != 0 || !a(i10, false) || (i10 & i11) == 0) {
            return false;
        }
        if (str != null && !com.applovin.exoplayer2.l.ai.a((Object) vVar.f16838l, (Object) str)) {
            return false;
        }
        int i21 = vVar.f16842q;
        if (i21 != -1 && (i16 > i21 || i21 > i12)) {
            return false;
        }
        int i22 = vVar.f16843r;
        if (i22 != -1 && (i17 > i22 || i22 > i13)) {
            return false;
        }
        float f10 = vVar.f16844s;
        return (f10 == -1.0f || (((float) i18) <= f10 && f10 <= ((float) i14))) && (i20 = vVar.f16834h) != -1 && i19 <= i20 && i20 <= i15;
    }

    private static d.a a(ad adVar, int[][] iArr, C0183c c0183c) {
        int i10 = -1;
        ac acVar = null;
        g gVar = null;
        for (int i11 = 0; i11 < adVar.f15286b; i11++) {
            ac a10 = adVar.a(i11);
            List<Integer> a11 = a(a10, c0183c.y, c0183c.f15997z, c0183c.A);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < a10.f15281a; i12++) {
                v a12 = a10.a(i12);
                if ((a12.f16832e & 16384) == 0 && a(iArr2[i12], c0183c.f15939k)) {
                    g gVar2 = new g(a12, c0183c, iArr2[i12], a11.contains(Integer.valueOf(i12)));
                    if ((gVar2.f15967a || c0183c.f15933d) && (gVar == null || gVar2.compareTo(gVar) > 0)) {
                        acVar = a10;
                        i10 = i12;
                        gVar = gVar2;
                    }
                }
            }
        }
        if (acVar == null) {
            return null;
        }
        return new d.a(acVar, i10);
    }

    private static int[] a(ac acVar, int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12) {
        v a10 = acVar.a(i10);
        int[] iArr2 = new int[acVar.f15281a];
        int i12 = 0;
        for (int i13 = 0; i13 < acVar.f15281a; i13++) {
            if (i13 == i10 || a(acVar.a(i13), iArr[i13], a10, i11, z10, z11, z12)) {
                iArr2[i12] = i13;
                i12++;
            }
        }
        return Arrays.copyOf(iArr2, i12);
    }

    private static boolean a(v vVar, int i10, v vVar2, int i11, boolean z10, boolean z11, boolean z12) {
        int i12;
        int i13;
        String str;
        int i14;
        if (!a(i10, false) || (i12 = vVar.f16834h) == -1 || i12 > i11) {
            return false;
        }
        if (!z12 && ((i14 = vVar.y) == -1 || i14 != vVar2.y)) {
            return false;
        }
        if (z10 || ((str = vVar.f16838l) != null && TextUtils.equals(str, vVar2.f16838l))) {
            return z11 || ((i13 = vVar.f16850z) != -1 && i13 == vVar2.f16850z);
        }
        return false;
    }

    public Pair<d.a, f> a(ad adVar, int[][] iArr, C0183c c0183c, String str) throws com.applovin.exoplayer2.p {
        int i10 = -1;
        ac acVar = null;
        f fVar = null;
        for (int i11 = 0; i11 < adVar.f15286b; i11++) {
            ac a10 = adVar.a(i11);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < a10.f15281a; i12++) {
                if (a(iArr2[i12], c0183c.f15939k)) {
                    f fVar2 = new f(a10.a(i12), c0183c, iArr2[i12], str);
                    if (fVar2.f15959a && (fVar == null || fVar2.compareTo(fVar) > 0)) {
                        acVar = a10;
                        i10 = i12;
                        fVar = fVar2;
                    }
                }
            }
        }
        if (acVar == null) {
            return null;
        }
        return Pair.create(new d.a(acVar, i10), (f) com.applovin.exoplayer2.l.a.b(fVar));
    }

    public d.a a(int i10, ad adVar, int[][] iArr, C0183c c0183c) throws com.applovin.exoplayer2.p {
        ac acVar = null;
        b bVar = null;
        int i11 = 0;
        for (int i12 = 0; i12 < adVar.f15286b; i12++) {
            ac a10 = adVar.a(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < a10.f15281a; i13++) {
                if (a(iArr2[i13], c0183c.f15939k)) {
                    b bVar2 = new b(a10.a(i13), iArr2[i13]);
                    if (bVar == null || bVar2.compareTo(bVar) > 0) {
                        acVar = a10;
                        i11 = i13;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (acVar == null) {
            return null;
        }
        return new d.a(acVar, i11);
    }

    private static void a(f.a aVar, int[][][] iArr, at[] atVarArr, com.applovin.exoplayer2.j.d[] dVarArr) {
        boolean z10;
        boolean z11 = false;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < aVar.a(); i12++) {
            int a10 = aVar.a(i12);
            com.applovin.exoplayer2.j.d dVar = dVarArr[i12];
            if ((a10 == 1 || a10 == 2) && dVar != null && a(iArr[i12], aVar.b(i12), dVar)) {
                if (a10 == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else {
                    if (i10 != -1) {
                        z10 = false;
                        break;
                    }
                    i10 = i12;
                }
            }
        }
        z10 = true;
        if (i11 != -1 && i10 != -1) {
            z11 = true;
        }
        if (z10 && z11) {
            at atVar = new at(true);
            atVarArr[i11] = atVar;
            atVarArr[i10] = atVar;
        }
    }

    private static boolean a(int[][] iArr, ad adVar, com.applovin.exoplayer2.j.d dVar) {
        if (dVar == null) {
            return false;
        }
        int a10 = adVar.a(dVar.d());
        for (int i10 = 0; i10 < dVar.e(); i10++) {
            if (as.d(iArr[a10][dVar.b(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(int i10, boolean z10) {
        int c10 = as.c(i10);
        return c10 == 4 || (z10 && c10 == 3);
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, com.anythink.expressad.exoplayer.b.ar)) {
            return null;
        }
        return str;
    }

    public static int a(v vVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(vVar.f16830c)) {
            return 4;
        }
        String a10 = a(str);
        String a11 = a(vVar.f16830c);
        if (a11 == null || a10 == null) {
            return (z10 && a11 == null) ? 1 : 0;
        }
        if (a11.startsWith(a10) || a10.startsWith(a11)) {
            return 3;
        }
        return com.applovin.exoplayer2.l.ai.b(a11, "-")[0].equals(com.applovin.exoplayer2.l.ai.b(a10, "-")[0]) ? 2 : 0;
    }

    private static List<Integer> a(ac acVar, int i10, int i11, boolean z10) {
        int i12;
        ArrayList arrayList = new ArrayList(acVar.f15281a);
        for (int i13 = 0; i13 < acVar.f15281a; i13++) {
            arrayList.add(Integer.valueOf(i13));
        }
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < acVar.f15281a; i15++) {
                v a10 = acVar.a(i15);
                int i16 = a10.f16842q;
                if (i16 > 0 && (i12 = a10.f16843r) > 0) {
                    Point a11 = a(z10, i10, i11, i16, i12);
                    int i17 = a10.f16842q;
                    int i18 = a10.f16843r;
                    int i19 = i17 * i18;
                    if (i17 >= ((int) (a11.x * 0.98f)) && i18 >= ((int) (a11.y * 0.98f)) && i19 < i14) {
                        i14 = i19;
                    }
                }
            }
            if (i14 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int b10 = acVar.a(((Integer) arrayList.get(size)).intValue()).b();
                    if (b10 == -1 || b10 > i14) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
    
        if ((r6 > r7) != (r4 > r5)) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Point a(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L10
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L8
            r1 = r3
            goto L9
        L8:
            r1 = r0
        L9:
            if (r4 <= r5) goto Lc
            goto Ld
        Lc:
            r3 = r0
        Ld:
            if (r1 == r3) goto L10
            goto L13
        L10:
            r2 = r5
            r5 = r4
            r4 = r2
        L13:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L23
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = com.applovin.exoplayer2.l.ai.a(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.applovin.exoplayer2.l.ai.a(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.j.c.a(boolean, int, int, int, int):android.graphics.Point");
    }
}
