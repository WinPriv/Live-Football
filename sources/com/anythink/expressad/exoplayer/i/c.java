package com.anythink.expressad.exoplayer.i;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.anythink.expressad.exoplayer.aa;
import com.anythink.expressad.exoplayer.h.ae;
import com.anythink.expressad.exoplayer.h.af;
import com.anythink.expressad.exoplayer.i.a;
import com.anythink.expressad.exoplayer.i.e;
import com.anythink.expressad.exoplayer.i.f;
import com.anythink.expressad.exoplayer.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class c extends com.anythink.expressad.exoplayer.i.e {

    /* renamed from: a, reason: collision with root package name */
    private static final float f8618a = 0.98f;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f8619b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    private static final int f8620c = 1000;

    /* renamed from: d, reason: collision with root package name */
    private final f.a f8621d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference<C0112c> f8622e;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8623a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8624b;

        /* renamed from: c, reason: collision with root package name */
        public final String f8625c;

        public a(int i10, int i11, String str) {
            this.f8623a = i10;
            this.f8624b = i11;
            this.f8625c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f8623a == aVar.f8623a && this.f8624b == aVar.f8624b && TextUtils.equals(this.f8625c, aVar.f8625c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i10;
            int i11 = ((this.f8623a * 31) + this.f8624b) * 31;
            String str = this.f8625c;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            return i11 + i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        private final C0112c f8626a;

        /* renamed from: b, reason: collision with root package name */
        private final int f8627b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8628c;

        /* renamed from: d, reason: collision with root package name */
        private final int f8629d;

        /* renamed from: e, reason: collision with root package name */
        private final int f8630e;
        private final int f;

        /* renamed from: g, reason: collision with root package name */
        private final int f8631g;

        public b(m mVar, C0112c c0112c, int i10) {
            this.f8626a = c0112c;
            this.f8627b = c.a(i10, false) ? 1 : 0;
            this.f8628c = c.a(mVar, c0112c.f8633b) ? 1 : 0;
            this.f8629d = (mVar.f9273z & 1) != 0 ? 1 : 0;
            this.f8630e = mVar.f9269u;
            this.f = mVar.f9270v;
            this.f8631g = mVar.f9254d;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(b bVar) {
            int i10 = this.f8627b;
            int i11 = bVar.f8627b;
            if (i10 != i11) {
                return c.a(i10, i11);
            }
            int i12 = this.f8628c;
            int i13 = bVar.f8628c;
            if (i12 != i13) {
                return c.a(i12, i13);
            }
            int i14 = this.f8629d;
            int i15 = bVar.f8629d;
            if (i14 != i15) {
                return c.a(i14, i15);
            }
            if (this.f8626a.f8643m) {
                return c.a(bVar.f8631g, this.f8631g);
            }
            int i16 = 1;
            if (i10 != 1) {
                i16 = -1;
            }
            int i17 = this.f8630e;
            int i18 = bVar.f8630e;
            if (i17 != i18) {
                return c.a(i17, i18) * i16;
            }
            int i19 = this.f;
            int i20 = bVar.f;
            if (i19 != i20) {
                return c.a(i19, i20) * i16;
            }
            return c.a(this.f8631g, bVar.f8631g) * i16;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f8627b == bVar.f8627b && this.f8628c == bVar.f8628c && this.f8629d == bVar.f8629d && this.f8630e == bVar.f8630e && this.f == bVar.f && this.f8631g == bVar.f8631g) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (((((((((this.f8627b * 31) + this.f8628c) * 31) + this.f8629d) * 31) + this.f8630e) * 31) + this.f) * 31) + this.f8631g;
        }
    }

    /* renamed from: com.anythink.expressad.exoplayer.i.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0112c implements Parcelable {

        /* renamed from: b, reason: collision with root package name */
        public final String f8633b;

        /* renamed from: c, reason: collision with root package name */
        public final String f8634c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f8635d;

        /* renamed from: e, reason: collision with root package name */
        public final int f8636e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final int f8637g;

        /* renamed from: h, reason: collision with root package name */
        public final int f8638h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f8639i;

        /* renamed from: j, reason: collision with root package name */
        public final int f8640j;

        /* renamed from: k, reason: collision with root package name */
        public final int f8641k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f8642l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f8643m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f8644n;
        public final boolean o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f8645p;

        /* renamed from: q, reason: collision with root package name */
        public final int f8646q;

        /* renamed from: r, reason: collision with root package name */
        private final SparseArray<Map<af, e>> f8647r;

        /* renamed from: s, reason: collision with root package name */
        private final SparseBooleanArray f8648s;

        /* renamed from: a, reason: collision with root package name */
        public static final C0112c f8632a = new C0112c();
        public static final Parcelable.Creator<C0112c> CREATOR = new Parcelable.Creator<C0112c>() { // from class: com.anythink.expressad.exoplayer.i.c.c.1
            private static C0112c a(Parcel parcel) {
                return new C0112c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ C0112c createFromParcel(Parcel parcel) {
                return new C0112c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ C0112c[] newArray(int i10) {
                return new C0112c[i10];
            }

            private static C0112c[] a(int i10) {
                return new C0112c[i10];
            }
        };

        private C0112c() {
            this(new SparseArray(), new SparseBooleanArray(), null, null, false, 0, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x010d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0107 A[LOOP:0: B:51:0x00b0->B:58:0x0107, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00ad A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 271
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.i.c.C0112c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            int hashCode;
            int i10 = (((((((((((((((((((((((((((this.f8635d ? 1 : 0) * 31) + this.f8636e) * 31) + (this.f8643m ? 1 : 0)) * 31) + (this.f8644n ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31) + this.f) * 31) + this.f8637g) * 31) + (this.f8639i ? 1 : 0)) * 31) + (this.f8645p ? 1 : 0)) * 31) + (this.f8642l ? 1 : 0)) * 31) + this.f8640j) * 31) + this.f8641k) * 31) + this.f8638h) * 31) + this.f8646q) * 31;
            String str = this.f8633b;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = (i10 + hashCode) * 31;
            String str2 = this.f8634c;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            return i12 + i11;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            SparseArray<Map<af, e>> sparseArray = this.f8647r;
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                int keyAt = sparseArray.keyAt(i11);
                Map<af, e> valueAt = sparseArray.valueAt(i11);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry<af, e> entry : valueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
            parcel.writeSparseBooleanArray(this.f8648s);
            parcel.writeString(this.f8633b);
            parcel.writeString(this.f8634c);
            com.anythink.expressad.exoplayer.k.af.a(parcel, this.f8635d);
            parcel.writeInt(this.f8636e);
            com.anythink.expressad.exoplayer.k.af.a(parcel, this.f8643m);
            com.anythink.expressad.exoplayer.k.af.a(parcel, this.f8644n);
            com.anythink.expressad.exoplayer.k.af.a(parcel, this.o);
            parcel.writeInt(this.f);
            parcel.writeInt(this.f8637g);
            parcel.writeInt(this.f8638h);
            com.anythink.expressad.exoplayer.k.af.a(parcel, this.f8639i);
            com.anythink.expressad.exoplayer.k.af.a(parcel, this.f8645p);
            parcel.writeInt(this.f8640j);
            parcel.writeInt(this.f8641k);
            com.anythink.expressad.exoplayer.k.af.a(parcel, this.f8642l);
            parcel.writeInt(this.f8646q);
        }

        public C0112c(SparseArray<Map<af, e>> sparseArray, SparseBooleanArray sparseBooleanArray, String str, String str2, boolean z10, int i10, boolean z11, boolean z12, boolean z13, int i11, int i12, int i13, boolean z14, boolean z15, int i14, int i15, boolean z16, int i16) {
            this.f8647r = sparseArray;
            this.f8648s = sparseBooleanArray;
            this.f8633b = com.anythink.expressad.exoplayer.k.af.b(str);
            this.f8634c = com.anythink.expressad.exoplayer.k.af.b(str2);
            this.f8635d = z10;
            this.f8636e = i10;
            this.f8643m = z11;
            this.f8644n = z12;
            this.o = z13;
            this.f = i11;
            this.f8637g = i12;
            this.f8638h = i13;
            this.f8639i = z14;
            this.f8645p = z15;
            this.f8640j = i14;
            this.f8641k = i15;
            this.f8642l = z16;
            this.f8646q = i16;
        }

        public final boolean a(int i10) {
            return this.f8648s.get(i10);
        }

        public final e b(int i10, af afVar) {
            Map<af, e> map = this.f8647r.get(i10);
            if (map != null) {
                return map.get(afVar);
            }
            return null;
        }

        public final boolean a(int i10, af afVar) {
            Map<af, e> map = this.f8647r.get(i10);
            return map != null && map.containsKey(afVar);
        }

        private d a() {
            return new d(this, (byte) 0);
        }

        private static SparseArray<Map<af, e>> a(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray<Map<af, e>> sparseArray = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i11 = 0; i11 < readInt3; i11++) {
                    hashMap.put((af) parcel.readParcelable(af.class.getClassLoader()), (e) parcel.readParcelable(e.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }

        private static void a(Parcel parcel, SparseArray<Map<af, e>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = sparseArray.keyAt(i10);
                Map<af, e> valueAt = sparseArray.valueAt(i10);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry<af, e> entry : valueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
        }

        public C0112c(Parcel parcel) {
            this.f8647r = a(parcel);
            this.f8648s = parcel.readSparseBooleanArray();
            this.f8633b = parcel.readString();
            this.f8634c = parcel.readString();
            this.f8635d = com.anythink.expressad.exoplayer.k.af.a(parcel);
            this.f8636e = parcel.readInt();
            this.f8643m = com.anythink.expressad.exoplayer.k.af.a(parcel);
            this.f8644n = com.anythink.expressad.exoplayer.k.af.a(parcel);
            this.o = com.anythink.expressad.exoplayer.k.af.a(parcel);
            this.f = parcel.readInt();
            this.f8637g = parcel.readInt();
            this.f8638h = parcel.readInt();
            this.f8639i = com.anythink.expressad.exoplayer.k.af.a(parcel);
            this.f8645p = com.anythink.expressad.exoplayer.k.af.a(parcel);
            this.f8640j = parcel.readInt();
            this.f8641k = parcel.readInt();
            this.f8642l = com.anythink.expressad.exoplayer.k.af.a(parcel);
            this.f8646q = parcel.readInt();
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

        /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[LOOP:0: B:6:0x000d->B:14:0x0064, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0067 A[EDGE_INSN: B:15:0x0067->B:16:0x0067 BREAK  A[LOOP:0: B:6:0x000d->B:14:0x0064], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static boolean a(android.util.SparseArray<java.util.Map<com.anythink.expressad.exoplayer.h.af, com.anythink.expressad.exoplayer.i.c.e>> r9, android.util.SparseArray<java.util.Map<com.anythink.expressad.exoplayer.h.af, com.anythink.expressad.exoplayer.i.c.e>> r10) {
            /*
                int r0 = r9.size()
                int r1 = r10.size()
                r2 = 0
                if (r1 == r0) goto Lc
                return r2
            Lc:
                r1 = r2
            Ld:
                r3 = 1
                if (r1 >= r0) goto L68
                int r4 = r9.keyAt(r1)
                int r4 = r10.indexOfKey(r4)
                if (r4 < 0) goto L67
                java.lang.Object r5 = r9.valueAt(r1)
                java.util.Map r5 = (java.util.Map) r5
                java.lang.Object r4 = r10.valueAt(r4)
                java.util.Map r4 = (java.util.Map) r4
                int r6 = r5.size()
                int r7 = r4.size()
                if (r7 == r6) goto L32
            L30:
                r3 = r2
                goto L61
            L32:
                java.util.Set r5 = r5.entrySet()
                java.util.Iterator r5 = r5.iterator()
            L3a:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L61
                java.lang.Object r6 = r5.next()
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                java.lang.Object r7 = r6.getKey()
                com.anythink.expressad.exoplayer.h.af r7 = (com.anythink.expressad.exoplayer.h.af) r7
                boolean r8 = r4.containsKey(r7)
                if (r8 == 0) goto L30
                java.lang.Object r6 = r6.getValue()
                java.lang.Object r7 = r4.get(r7)
                boolean r6 = com.anythink.expressad.exoplayer.k.af.a(r6, r7)
                if (r6 != 0) goto L3a
                goto L30
            L61:
                if (r3 != 0) goto L64
                goto L67
            L64:
                int r1 = r1 + 1
                goto Ld
            L67:
                return r2
            L68:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.i.c.C0112c.a(android.util.SparseArray, android.util.SparseArray):boolean");
        }

        private static boolean a(Map<af, e> map, Map<af, e> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<af, e> entry : map.entrySet()) {
                af key = entry.getKey();
                if (!map2.containsKey(key) || !com.anythink.expressad.exoplayer.k.af.a(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray<Map<af, e>> f8649a;

        /* renamed from: b, reason: collision with root package name */
        private final SparseBooleanArray f8650b;

        /* renamed from: c, reason: collision with root package name */
        private String f8651c;

        /* renamed from: d, reason: collision with root package name */
        private String f8652d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f8653e;
        private int f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f8654g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f8655h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f8656i;

        /* renamed from: j, reason: collision with root package name */
        private int f8657j;

        /* renamed from: k, reason: collision with root package name */
        private int f8658k;

        /* renamed from: l, reason: collision with root package name */
        private int f8659l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f8660m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f8661n;
        private int o;

        /* renamed from: p, reason: collision with root package name */
        private int f8662p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f8663q;

        /* renamed from: r, reason: collision with root package name */
        private int f8664r;

        public /* synthetic */ d(C0112c c0112c, byte b10) {
            this(c0112c);
        }

        private d a(String str) {
            this.f8651c = str;
            return this;
        }

        private d b(String str) {
            this.f8652d = str;
            return this;
        }

        private d c(int i10) {
            this.f = i10;
            return this;
        }

        private d d(boolean z10) {
            this.f8656i = z10;
            return this;
        }

        private d e(boolean z10) {
            this.f8660m = z10;
            return this;
        }

        private d f(boolean z10) {
            this.f8661n = z10;
            return this;
        }

        public d() {
            this(C0112c.f8632a);
        }

        private d a(boolean z10) {
            this.f8653e = z10;
            return this;
        }

        private d b(boolean z10) {
            this.f8654g = z10;
            return this;
        }

        private d c(boolean z10) {
            this.f8655h = z10;
            return this;
        }

        private d d() {
            return a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        private d e() {
            return a(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        private d(C0112c c0112c) {
            this.f8649a = a((SparseArray<Map<af, e>>) c0112c.f8647r);
            this.f8650b = c0112c.f8648s.clone();
            this.f8651c = c0112c.f8633b;
            this.f8652d = c0112c.f8634c;
            this.f8653e = c0112c.f8635d;
            this.f = c0112c.f8636e;
            this.f8654g = c0112c.f8643m;
            this.f8655h = c0112c.f8644n;
            this.f8656i = c0112c.o;
            this.f8657j = c0112c.f;
            this.f8658k = c0112c.f8637g;
            this.f8659l = c0112c.f8638h;
            this.f8660m = c0112c.f8639i;
            this.f8661n = c0112c.f8645p;
            this.o = c0112c.f8640j;
            this.f8662p = c0112c.f8641k;
            this.f8663q = c0112c.f8642l;
            this.f8664r = c0112c.f8646q;
        }

        private d a(int i10, int i11) {
            this.f8657j = i10;
            this.f8658k = i11;
            return this;
        }

        private d c() {
            return a(1279, 719);
        }

        private d d(int i10) {
            this.f8659l = i10;
            return this;
        }

        public final d b(int i10) {
            if (this.f8664r != i10) {
                this.f8664r = i10;
            }
            return this;
        }

        private d a(Context context, boolean z10) {
            Point a10 = com.anythink.expressad.exoplayer.k.af.a(context);
            return a(a10.x, a10.y, z10);
        }

        public final C0112c b() {
            return new C0112c(this.f8649a, this.f8650b, this.f8651c, this.f8652d, this.f8653e, this.f, this.f8654g, this.f8655h, this.f8656i, this.f8657j, this.f8658k, this.f8659l, this.f8660m, this.f8661n, this.o, this.f8662p, this.f8663q, this.f8664r);
        }

        private d a(int i10, int i11, boolean z10) {
            this.o = i10;
            this.f8662p = i11;
            this.f8663q = z10;
            return this;
        }

        public final d a(int i10, boolean z10) {
            if (this.f8650b.get(i10) == z10) {
                return this;
            }
            if (z10) {
                this.f8650b.put(i10, true);
            } else {
                this.f8650b.delete(i10);
            }
            return this;
        }

        public final d a(int i10, af afVar, e eVar) {
            Map<af, e> map = this.f8649a.get(i10);
            if (map == null) {
                map = new HashMap<>();
                this.f8649a.put(i10, map);
            }
            if (map.containsKey(afVar) && com.anythink.expressad.exoplayer.k.af.a(map.get(afVar), eVar)) {
                return this;
            }
            map.put(afVar, eVar);
            return this;
        }

        public final d a(int i10, af afVar) {
            Map<af, e> map = this.f8649a.get(i10);
            if (map != null && map.containsKey(afVar)) {
                map.remove(afVar);
                if (map.isEmpty()) {
                    this.f8649a.remove(i10);
                }
            }
            return this;
        }

        public final d a(int i10) {
            Map<af, e> map = this.f8649a.get(i10);
            if (map != null && !map.isEmpty()) {
                this.f8649a.remove(i10);
            }
            return this;
        }

        public final d a() {
            if (this.f8649a.size() == 0) {
                return this;
            }
            this.f8649a.clear();
            return this;
        }

        private static SparseArray<Map<af, e>> a(SparseArray<Map<af, e>> sparseArray) {
            SparseArray<Map<af, e>> sparseArray2 = new SparseArray<>();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
            }
            return sparseArray2;
        }
    }

    public c() {
        this((f.a) null);
    }

    public static /* synthetic */ int a(int i10, int i11) {
        if (i10 > i11) {
            return 1;
        }
        return i11 > i10 ? -1 : 0;
    }

    private static int b(int i10, int i11) {
        if (i10 == -1) {
            return i11 == -1 ? 0 : -1;
        }
        if (i11 == -1) {
            return 1;
        }
        return i10 - i11;
    }

    private static int c(int i10, int i11) {
        if (i10 > i11) {
            return 1;
        }
        return i11 > i10 ? -1 : 0;
    }

    private d d() {
        return new d(c(), (byte) 0);
    }

    @Deprecated
    private void e() {
        a(d().a());
    }

    private c(com.anythink.expressad.exoplayer.j.d dVar) {
        this(new a.C0111a(dVar));
    }

    public static boolean a(int i10, boolean z10) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            return z10 && i11 == 3;
        }
        return true;
    }

    @Deprecated
    private void b(int i10, boolean z10) {
        a(d().a(i10, z10));
    }

    private C0112c c() {
        return this.f8622e.get();
    }

    private c(f.a aVar) {
        this.f8621d = aVar;
        this.f8622e = new AtomicReference<>(C0112c.f8632a);
    }

    private void a(C0112c c0112c) {
        com.anythink.expressad.exoplayer.k.a.a(c0112c);
        if (this.f8622e.getAndSet(c0112c).equals(c0112c)) {
            return;
        }
        b();
    }

    @Deprecated
    private e b(int i10, af afVar) {
        return c().b(i10, afVar);
    }

    @Deprecated
    private void c(int i10, af afVar) {
        a(d().a(i10, afVar));
    }

    @Deprecated
    private void b(int i10) {
        a(d().a(i10));
    }

    @Deprecated
    private void c(int i10) {
        a(d().b(i10));
    }

    /* loaded from: classes.dex */
    public static final class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() { // from class: com.anythink.expressad.exoplayer.i.c.e.1
            private static e a(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ e[] newArray(int i10) {
                return new e[i10];
            }

            private static e[] a(int i10) {
                return new e[i10];
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final int f8665a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f8666b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8667c;

        private e(int i10, int... iArr) {
            this.f8665a = i10;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f8666b = copyOf;
            this.f8667c = iArr.length;
            Arrays.sort(copyOf);
        }

        private boolean a(int i10) {
            for (int i11 : this.f8666b) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f8665a == eVar.f8665a && Arrays.equals(this.f8666b, eVar.f8666b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f8666b) + (this.f8665a * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f8665a);
            parcel.writeInt(this.f8666b.length);
            parcel.writeIntArray(this.f8666b);
        }

        public e(Parcel parcel) {
            this.f8665a = parcel.readInt();
            int readByte = parcel.readByte();
            this.f8667c = readByte;
            int[] iArr = new int[readByte];
            this.f8666b = iArr;
            parcel.readIntArray(iArr);
        }
    }

    private static f b(af afVar, int[][] iArr, int i10, C0112c c0112c, f.a aVar) {
        List<Integer> list;
        int i11;
        int i12;
        int i13;
        String str;
        int[] a10;
        int i14;
        int i15;
        HashSet hashSet;
        List<Integer> list2;
        int i16;
        int i17;
        int i18;
        int i19 = c0112c.o ? 24 : 16;
        boolean z10 = c0112c.f8644n && (i10 & i19) != 0;
        for (int i20 = 0; i20 < afVar.f8256b; i20++) {
            ae a11 = afVar.a(i20);
            int[] iArr2 = iArr[i20];
            int i21 = c0112c.f;
            int i22 = c0112c.f8637g;
            int i23 = c0112c.f8638h;
            int i24 = c0112c.f8640j;
            int i25 = c0112c.f8641k;
            boolean z11 = c0112c.f8642l;
            if (a11.f8252a < 2) {
                a10 = f8619b;
            } else {
                List<Integer> a12 = a(a11, i24, i25, z11);
                if (a12.size() < 2) {
                    a10 = f8619b;
                } else {
                    if (z10) {
                        list = a12;
                        i11 = i23;
                        i12 = i22;
                        i13 = i21;
                        str = null;
                    } else {
                        HashSet hashSet2 = new HashSet();
                        String str2 = null;
                        int i26 = 0;
                        int i27 = 0;
                        while (i27 < a12.size()) {
                            String str3 = a11.a(a12.get(i27).intValue()).f9257h;
                            if (hashSet2.add(str3)) {
                                i14 = i26;
                                i15 = i27;
                                hashSet = hashSet2;
                                list2 = a12;
                                i16 = i23;
                                i17 = i22;
                                i18 = i21;
                                i26 = a(a11, iArr2, i19, str3, i21, i22, i16, list2);
                                if (i26 > i14) {
                                    str2 = str3;
                                    i27 = i15 + 1;
                                    hashSet2 = hashSet;
                                    a12 = list2;
                                    i23 = i16;
                                    i22 = i17;
                                    i21 = i18;
                                }
                            } else {
                                i14 = i26;
                                i15 = i27;
                                hashSet = hashSet2;
                                list2 = a12;
                                i16 = i23;
                                i17 = i22;
                                i18 = i21;
                            }
                            i26 = i14;
                            i27 = i15 + 1;
                            hashSet2 = hashSet;
                            a12 = list2;
                            i23 = i16;
                            i22 = i17;
                            i21 = i18;
                        }
                        list = a12;
                        i11 = i23;
                        i12 = i22;
                        i13 = i21;
                        str = str2;
                    }
                    b(a11, iArr2, i19, str, i13, i12, i11, list);
                    a10 = list.size() < 2 ? f8619b : com.anythink.expressad.exoplayer.k.af.a(list);
                }
            }
            if (a10.length > 0) {
                return ((f.a) com.anythink.expressad.exoplayer.k.a.a(aVar)).a(a11, a10);
            }
        }
        return null;
    }

    private static f c(af afVar, int[][] iArr, C0112c c0112c) {
        ae aeVar = null;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < afVar.f8256b; i12++) {
            ae a10 = afVar.a(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < a10.f8252a; i13++) {
                if (a(iArr2[i13], c0112c.f8645p)) {
                    int i14 = (a10.a(i13).f9273z & 1) != 0 ? 2 : 1;
                    if (a(iArr2[i13], false)) {
                        i14 += 1000;
                    }
                    if (i14 > i11) {
                        aeVar = a10;
                        i10 = i13;
                        i11 = i14;
                    }
                }
            }
        }
        if (aeVar == null) {
            return null;
        }
        return new com.anythink.expressad.exoplayer.i.d(aeVar, i10);
    }

    private void a(d dVar) {
        C0112c b10 = dVar.b();
        com.anythink.expressad.exoplayer.k.a.a(b10);
        if (this.f8622e.getAndSet(b10).equals(b10)) {
            return;
        }
        b();
    }

    @Deprecated
    private boolean a(int i10) {
        return c().a(i10);
    }

    @Deprecated
    private void a(int i10, af afVar, e eVar) {
        a(d().a(i10, afVar, eVar));
    }

    @Deprecated
    private boolean a(int i10, af afVar) {
        return c().a(i10, afVar);
    }

    @Override // com.anythink.expressad.exoplayer.i.e
    public final Pair<aa[], f[]> a(e.a aVar, int[][][] iArr, int[] iArr2) {
        e.a aVar2;
        int i10;
        int i11;
        f[] fVarArr;
        int i12;
        boolean z10;
        int i13;
        f fVar;
        String str;
        int[] a10;
        HashSet hashSet;
        c cVar = this;
        e.a aVar3 = aVar;
        int[][][] iArr3 = iArr;
        C0112c c0112c = cVar.f8622e.get();
        int a11 = aVar.a();
        int a12 = aVar.a();
        f[] fVarArr2 = new f[a12];
        int i14 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (i14 < a12) {
            if (2 == aVar3.a(i14)) {
                if (z11) {
                    i10 = a11;
                    i11 = a12;
                    fVarArr = fVarArr2;
                    z10 = z12;
                    aVar2 = aVar;
                    i12 = i14;
                } else {
                    af b10 = aVar3.b(i14);
                    int[][] iArr4 = iArr3[i14];
                    int i15 = iArr2[i14];
                    f.a aVar4 = cVar.f8621d;
                    if (!c0112c.f8643m && aVar4 != null) {
                        int i16 = c0112c.o ? 24 : 16;
                        boolean z13 = c0112c.f8644n && (i15 & i16) != 0;
                        int i17 = 0;
                        while (i17 < b10.f8256b) {
                            ae a13 = b10.a(i17);
                            int[] iArr5 = iArr4[i17];
                            i10 = a11;
                            int i18 = c0112c.f;
                            int i19 = c0112c.f8637g;
                            int i20 = c0112c.f8638h;
                            i11 = a12;
                            int i21 = c0112c.f8640j;
                            z10 = z12;
                            int i22 = c0112c.f8641k;
                            boolean z14 = c0112c.f8642l;
                            fVarArr = fVarArr2;
                            i13 = i14;
                            if (a13.f8252a < 2) {
                                a10 = f8619b;
                            } else {
                                List<Integer> a14 = a(a13, i21, i22, z14);
                                if (a14.size() < 2) {
                                    a10 = f8619b;
                                } else {
                                    if (z13) {
                                        str = null;
                                    } else {
                                        HashSet hashSet2 = new HashSet();
                                        int i23 = 0;
                                        int i24 = 0;
                                        String str2 = null;
                                        while (i23 < a14.size()) {
                                            String str3 = a13.a(a14.get(i23).intValue()).f9257h;
                                            if (hashSet2.add(str3)) {
                                                hashSet = hashSet2;
                                                int a15 = a(a13, iArr5, i16, str3, i18, i19, i20, a14);
                                                if (a15 > i24) {
                                                    i24 = a15;
                                                    str2 = str3;
                                                }
                                            } else {
                                                hashSet = hashSet2;
                                            }
                                            i23++;
                                            hashSet2 = hashSet;
                                        }
                                        str = str2;
                                    }
                                    b(a13, iArr5, i16, str, i18, i19, i20, a14);
                                    a10 = a14.size() < 2 ? f8619b : com.anythink.expressad.exoplayer.k.af.a(a14);
                                }
                            }
                            if (a10.length > 0) {
                                fVar = ((f.a) com.anythink.expressad.exoplayer.k.a.a(aVar4)).a(a13, a10);
                                break;
                            }
                            i17++;
                            a11 = i10;
                            a12 = i11;
                            z12 = z10;
                            fVarArr2 = fVarArr;
                            i14 = i13;
                        }
                    }
                    i10 = a11;
                    i11 = a12;
                    fVarArr = fVarArr2;
                    i13 = i14;
                    z10 = z12;
                    fVar = null;
                    if (fVar == null) {
                        fVar = a(b10, iArr4, c0112c);
                    }
                    fVarArr[i13] = fVar;
                    z11 = fVar != null;
                    i12 = i13;
                    aVar2 = aVar;
                }
                z12 = z10 | (aVar2.b(i12).f8256b > 0);
            } else {
                aVar2 = aVar3;
                i10 = a11;
                i11 = a12;
                fVarArr = fVarArr2;
                i12 = i14;
            }
            i14 = i12 + 1;
            iArr3 = iArr;
            aVar3 = aVar2;
            a11 = i10;
            a12 = i11;
            fVarArr2 = fVarArr;
            cVar = this;
        }
        e.a aVar5 = aVar3;
        int i25 = a11;
        f[] fVarArr3 = fVarArr2;
        boolean z15 = z12;
        int i26 = a12;
        boolean z16 = false;
        boolean z17 = false;
        for (int i27 = 0; i27 < i26; i27++) {
            int a16 = aVar5.a(i27);
            if (a16 != 1) {
                if (a16 != 2) {
                    if (a16 != 3) {
                        fVarArr3[i27] = c(aVar5.b(i27), iArr[i27], c0112c);
                    } else if (!z17) {
                        f b11 = b(aVar5.b(i27), iArr[i27], c0112c);
                        fVarArr3[i27] = b11;
                        z17 = b11 != null;
                    }
                }
            } else if (!z16) {
                f a17 = a(aVar5.b(i27), iArr[i27], c0112c, z15 ? null : this.f8621d);
                fVarArr3[i27] = a17;
                z16 = a17 != null;
            }
        }
        for (int i28 = 0; i28 < i25; i28++) {
            if (c0112c.a(i28)) {
                fVarArr3[i28] = null;
            } else {
                af b12 = aVar5.b(i28);
                if (c0112c.a(i28, b12)) {
                    e b13 = c0112c.b(i28, b12);
                    if (b13 == null) {
                        fVarArr3[i28] = null;
                    } else {
                        if (b13.f8667c == 1) {
                            fVarArr3[i28] = new com.anythink.expressad.exoplayer.i.d(b12.a(b13.f8665a), b13.f8666b[0]);
                        } else {
                            fVarArr3[i28] = ((f.a) com.anythink.expressad.exoplayer.k.a.a(this.f8621d)).a(b12.a(b13.f8665a), b13.f8666b);
                        }
                    }
                }
            }
        }
        aa[] aaVarArr = new aa[i25];
        for (int i29 = 0; i29 < i25; i29++) {
            aaVarArr[i29] = !c0112c.a(i29) && (aVar5.a(i29) == 5 || fVarArr3[i29] != null) ? aa.f7259a : null;
        }
        a(aVar5, iArr, aaVarArr, fVarArr3, c0112c.f8646q);
        return Pair.create(aaVarArr, fVarArr3);
    }

    private static void b(ae aeVar, int[] iArr, int i10, String str, int i11, int i12, int i13, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!a(aeVar.a(intValue), str, iArr[intValue], i10, i11, i12, i13)) {
                list.remove(size);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if ((android.text.TextUtils.isEmpty(r11.A) || a(r11, com.anythink.expressad.exoplayer.b.ar)) != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.anythink.expressad.exoplayer.i.f b(com.anythink.expressad.exoplayer.h.af r16, int[][] r17, com.anythink.expressad.exoplayer.i.c.C0112c r18) {
        /*
            r0 = r16
            r1 = r18
            r2 = 0
            r3 = 0
            r5 = r2
            r4 = r3
            r6 = r4
            r7 = r6
        La:
            int r8 = r0.f8256b
            if (r4 >= r8) goto L92
            com.anythink.expressad.exoplayer.h.ae r8 = r0.a(r4)
            r9 = r17[r4]
            r10 = r3
        L15:
            int r11 = r8.f8252a
            if (r10 >= r11) goto L8e
            r11 = r9[r10]
            boolean r12 = r1.f8645p
            boolean r11 = a(r11, r12)
            if (r11 == 0) goto L8b
            com.anythink.expressad.exoplayer.m r11 = r8.a(r10)
            int r12 = r11.f9273z
            int r13 = r1.f8636e
            int r13 = ~r13
            r12 = r12 & r13
            r13 = r12 & 1
            if (r13 == 0) goto L33
            r13 = 1
            goto L34
        L33:
            r13 = r3
        L34:
            r12 = r12 & 2
            if (r12 == 0) goto L3a
            r12 = 1
            goto L3b
        L3a:
            r12 = r3
        L3b:
            java.lang.String r15 = r1.f8634c
            boolean r15 = a(r11, r15)
            if (r15 != 0) goto L70
            boolean r14 = r1.f8635d
            if (r14 == 0) goto L5e
            java.lang.String r14 = r11.A
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L5a
            java.lang.String r14 = "und"
            boolean r14 = a(r11, r14)
            if (r14 == 0) goto L58
            goto L5a
        L58:
            r14 = r3
            goto L5b
        L5a:
            r14 = 1
        L5b:
            if (r14 == 0) goto L5e
            goto L70
        L5e:
            if (r13 == 0) goto L62
            r14 = 3
            goto L7c
        L62:
            if (r12 == 0) goto L8b
            java.lang.String r12 = r1.f8633b
            boolean r11 = a(r11, r12)
            if (r11 == 0) goto L6e
            r14 = 2
            goto L7c
        L6e:
            r14 = 1
            goto L7c
        L70:
            if (r13 == 0) goto L75
            r11 = 8
            goto L7a
        L75:
            if (r12 != 0) goto L79
            r11 = 6
            goto L7a
        L79:
            r11 = 4
        L7a:
            int r14 = r11 + r15
        L7c:
            r11 = r9[r10]
            boolean r11 = a(r11, r3)
            if (r11 == 0) goto L86
            int r14 = r14 + 1000
        L86:
            if (r14 <= r7) goto L8b
            r5 = r8
            r6 = r10
            r7 = r14
        L8b:
            int r10 = r10 + 1
            goto L15
        L8e:
            int r4 = r4 + 1
            goto La
        L92:
            if (r5 != 0) goto L95
            return r2
        L95:
            com.anythink.expressad.exoplayer.i.d r0 = new com.anythink.expressad.exoplayer.i.d
            r0.<init>(r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.i.c.b(com.anythink.expressad.exoplayer.h.af, int[][], com.anythink.expressad.exoplayer.i.c$c):com.anythink.expressad.exoplayer.i.f");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00f4 A[LOOP:1: B:19:0x003f->B:27:0x00f4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.anythink.expressad.exoplayer.i.f[] a(com.anythink.expressad.exoplayer.i.e.a r32, int[][][] r33, int[] r34, com.anythink.expressad.exoplayer.i.c.C0112c r35) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.i.c.a(com.anythink.expressad.exoplayer.i.e$a, int[][][], int[], com.anythink.expressad.exoplayer.i.c$c):com.anythink.expressad.exoplayer.i.f[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ff A[LOOP:0: B:13:0x0022->B:21:0x00ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.anythink.expressad.exoplayer.i.f a(com.anythink.expressad.exoplayer.h.af r25, int[][] r26, int r27, com.anythink.expressad.exoplayer.i.c.C0112c r28, com.anythink.expressad.exoplayer.i.f.a r29) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.i.c.a(com.anythink.expressad.exoplayer.h.af, int[][], int, com.anythink.expressad.exoplayer.i.c$c, com.anythink.expressad.exoplayer.i.f$a):com.anythink.expressad.exoplayer.i.f");
    }

    private static int[] a(ae aeVar, int[] iArr, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, boolean z11) {
        String str;
        int a10;
        if (aeVar.f8252a < 2) {
            return f8619b;
        }
        List<Integer> a11 = a(aeVar, i14, i15, z11);
        if (a11.size() < 2) {
            return f8619b;
        }
        if (z10) {
            str = null;
        } else {
            HashSet hashSet = new HashSet();
            String str2 = null;
            int i16 = 0;
            for (int i17 = 0; i17 < a11.size(); i17++) {
                String str3 = aeVar.a(a11.get(i17).intValue()).f9257h;
                if (hashSet.add(str3) && (a10 = a(aeVar, iArr, i10, str3, i11, i12, i13, a11)) > i16) {
                    i16 = a10;
                    str2 = str3;
                }
            }
            str = str2;
        }
        b(aeVar, iArr, i10, str, i11, i12, i13, a11);
        return a11.size() < 2 ? f8619b : com.anythink.expressad.exoplayer.k.af.a(a11);
    }

    private static int a(ae aeVar, int[] iArr, int i10, String str, int i11, int i12, int i13, List<Integer> list) {
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            int intValue = list.get(i15).intValue();
            if (a(aeVar.a(intValue), str, iArr[intValue], i10, i11, i12, i13)) {
                i14++;
            }
        }
        return i14;
    }

    private static boolean a(m mVar, String str, int i10, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        return a(i10, false) && (i10 & i11) != 0 && (str == null || com.anythink.expressad.exoplayer.k.af.a((Object) mVar.f9257h, (Object) str)) && (((i15 = mVar.f9262m) == -1 || i15 <= i12) && (((i16 = mVar.f9263n) == -1 || i16 <= i13) && ((i17 = mVar.f9254d) == -1 || i17 <= i14)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        if (b(r2.f9254d, r10) < 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.anythink.expressad.exoplayer.i.f a(com.anythink.expressad.exoplayer.h.af r18, int[][] r19, com.anythink.expressad.exoplayer.i.c.C0112c r20) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.i.c.a(com.anythink.expressad.exoplayer.h.af, int[][], com.anythink.expressad.exoplayer.i.c$c):com.anythink.expressad.exoplayer.i.f");
    }

    private static f a(af afVar, int[][] iArr, C0112c c0112c, f.a aVar) {
        int[] iArr2;
        int a10;
        int i10 = -1;
        int i11 = -1;
        b bVar = null;
        for (int i12 = 0; i12 < afVar.f8256b; i12++) {
            ae a11 = afVar.a(i12);
            int[] iArr3 = iArr[i12];
            for (int i13 = 0; i13 < a11.f8252a; i13++) {
                if (a(iArr3[i13], c0112c.f8645p)) {
                    b bVar2 = new b(a11.a(i13), c0112c, iArr3[i13]);
                    if (bVar == null || bVar2.compareTo(bVar) > 0) {
                        i10 = i12;
                        i11 = i13;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        ae a12 = afVar.a(i10);
        if (!c0112c.f8643m && aVar != null) {
            int[] iArr4 = iArr[i10];
            boolean z10 = c0112c.f8644n;
            HashSet hashSet = new HashSet();
            a aVar2 = null;
            int i14 = 0;
            for (int i15 = 0; i15 < a12.f8252a; i15++) {
                m a13 = a12.a(i15);
                a aVar3 = new a(a13.f9269u, a13.f9270v, z10 ? null : a13.f9257h);
                if (hashSet.add(aVar3) && (a10 = a(a12, iArr4, aVar3)) > i14) {
                    i14 = a10;
                    aVar2 = aVar3;
                }
            }
            if (i14 > 1) {
                iArr2 = new int[i14];
                int i16 = 0;
                for (int i17 = 0; i17 < a12.f8252a; i17++) {
                    if (a(a12.a(i17), iArr4[i17], (a) com.anythink.expressad.exoplayer.k.a.a(aVar2))) {
                        iArr2[i16] = i17;
                        i16++;
                    }
                }
            } else {
                iArr2 = f8619b;
            }
            if (iArr2.length > 0) {
                return aVar.a(a12, iArr2);
            }
        }
        return new com.anythink.expressad.exoplayer.i.d(a12, i11);
    }

    private static int[] a(ae aeVar, int[] iArr, boolean z10) {
        int a10;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        a aVar = null;
        for (int i11 = 0; i11 < aeVar.f8252a; i11++) {
            m a11 = aeVar.a(i11);
            a aVar2 = new a(a11.f9269u, a11.f9270v, z10 ? null : a11.f9257h);
            if (hashSet.add(aVar2) && (a10 = a(aeVar, iArr, aVar2)) > i10) {
                i10 = a10;
                aVar = aVar2;
            }
        }
        if (i10 > 1) {
            int[] iArr2 = new int[i10];
            int i12 = 0;
            for (int i13 = 0; i13 < aeVar.f8252a; i13++) {
                if (a(aeVar.a(i13), iArr[i13], (a) com.anythink.expressad.exoplayer.k.a.a(aVar))) {
                    iArr2[i12] = i13;
                    i12++;
                }
            }
            return iArr2;
        }
        return f8619b;
    }

    private static int a(ae aeVar, int[] iArr, a aVar) {
        int i10 = 0;
        for (int i11 = 0; i11 < aeVar.f8252a; i11++) {
            if (a(aeVar.a(i11), iArr[i11], aVar)) {
                i10++;
            }
        }
        return i10;
    }

    private static boolean a(m mVar, int i10, a aVar) {
        String str;
        return a(i10, false) && mVar.f9269u == aVar.f8623a && mVar.f9270v == aVar.f8624b && ((str = aVar.f8625c) == null || TextUtils.equals(str, mVar.f9257h));
    }

    private static void a(e.a aVar, int[][][] iArr, aa[] aaVarArr, f[] fVarArr, int i10) {
        boolean z10;
        boolean z11;
        if (i10 == 0) {
            return;
        }
        boolean z12 = false;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < aVar.a(); i13++) {
            int a10 = aVar.a(i13);
            f fVar = fVarArr[i13];
            if ((a10 == 1 || a10 == 2) && fVar != null) {
                int[][] iArr2 = iArr[i13];
                int a11 = aVar.b(i13).a(fVar.f());
                int i14 = 0;
                while (true) {
                    if (i14 >= fVar.g()) {
                        z11 = true;
                        break;
                    } else {
                        if ((iArr2[a11][fVar.b(i14)] & 32) != 32) {
                            z11 = false;
                            break;
                        }
                        i14++;
                    }
                }
                if (!z11) {
                    continue;
                } else if (a10 == 1) {
                    if (i12 != -1) {
                        z10 = false;
                        break;
                    }
                    i12 = i13;
                } else {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i13;
                }
            }
        }
        z10 = true;
        if (i12 != -1 && i11 != -1) {
            z12 = true;
        }
        if (z10 && z12) {
            aa aaVar = new aa(i10);
            aaVarArr[i12] = aaVar;
            aaVarArr[i11] = aaVar;
        }
    }

    private static boolean a(int[][] iArr, af afVar, f fVar) {
        if (fVar == null) {
            return false;
        }
        int a10 = afVar.a(fVar.f());
        for (int i10 = 0; i10 < fVar.g(); i10++) {
            if ((iArr[a10][fVar.b(i10)] & 32) != 32) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(m mVar) {
        return TextUtils.isEmpty(mVar.A) || a(mVar, com.anythink.expressad.exoplayer.b.ar);
    }

    public static boolean a(m mVar, String str) {
        return str != null && TextUtils.equals(str, com.anythink.expressad.exoplayer.k.af.b(mVar.A));
    }

    private static List<Integer> a(ae aeVar, int i10, int i11, boolean z10) {
        int i12;
        ArrayList arrayList = new ArrayList(aeVar.f8252a);
        for (int i13 = 0; i13 < aeVar.f8252a; i13++) {
            arrayList.add(Integer.valueOf(i13));
        }
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < aeVar.f8252a; i15++) {
                m a10 = aeVar.a(i15);
                int i16 = a10.f9262m;
                if (i16 > 0 && (i12 = a10.f9263n) > 0) {
                    Point a11 = a(z10, i10, i11, i16, i12);
                    int i17 = a10.f9262m;
                    int i18 = a10.f9263n;
                    int i19 = i17 * i18;
                    if (i17 >= ((int) (a11.x * f8618a)) && i18 >= ((int) (a11.y * f8618a)) && i19 < i14) {
                        i14 = i19;
                    }
                }
            }
            if (i14 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int a12 = aeVar.a(((Integer) arrayList.get(size)).intValue()).a();
                    if (a12 == -1 || a12 > i14) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
    
        if ((r6 > r7) != (r4 > r5)) goto L13;
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
            int r4 = com.anythink.expressad.exoplayer.k.af.a(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.anythink.expressad.exoplayer.k.af.a(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.i.c.a(boolean, int, int, int, int):android.graphics.Point");
    }
}
