package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.y.b {
    public final LazySpanLookup B;
    public final int C;
    public boolean D;
    public boolean E;
    public SavedState F;
    public final Rect G;
    public final b H;
    public final boolean I;
    public int[] J;
    public final a K;

    /* renamed from: p, reason: collision with root package name */
    public int f2214p;

    /* renamed from: q, reason: collision with root package name */
    public d[] f2215q;

    /* renamed from: r, reason: collision with root package name */
    public s f2216r;

    /* renamed from: s, reason: collision with root package name */
    public s f2217s;

    /* renamed from: t, reason: collision with root package name */
    public int f2218t;

    /* renamed from: u, reason: collision with root package name */
    public int f2219u;

    /* renamed from: v, reason: collision with root package name */
    public final n f2220v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2221w;
    public BitSet y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2222x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f2223z = -1;
    public int A = Integer.MIN_VALUE;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean A;
        public boolean B;

        /* renamed from: s, reason: collision with root package name */
        public int f2230s;

        /* renamed from: t, reason: collision with root package name */
        public int f2231t;

        /* renamed from: u, reason: collision with root package name */
        public int f2232u;

        /* renamed from: v, reason: collision with root package name */
        public int[] f2233v;

        /* renamed from: w, reason: collision with root package name */
        public int f2234w;

        /* renamed from: x, reason: collision with root package name */
        public int[] f2235x;
        public List<LazySpanLookup.FullSpanItem> y;

        /* renamed from: z, reason: collision with root package name */
        public boolean f2236z;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2230s);
            parcel.writeInt(this.f2231t);
            parcel.writeInt(this.f2232u);
            if (this.f2232u > 0) {
                parcel.writeIntArray(this.f2233v);
            }
            parcel.writeInt(this.f2234w);
            if (this.f2234w > 0) {
                parcel.writeIntArray(this.f2235x);
            }
            parcel.writeInt(this.f2236z ? 1 : 0);
            parcel.writeInt(this.A ? 1 : 0);
            parcel.writeInt(this.B ? 1 : 0);
            parcel.writeList(this.y);
        }

        public SavedState(Parcel parcel) {
            this.f2230s = parcel.readInt();
            this.f2231t = parcel.readInt();
            int readInt = parcel.readInt();
            this.f2232u = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f2233v = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f2234w = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f2235x = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f2236z = parcel.readInt() == 1;
            this.A = parcel.readInt() == 1;
            this.B = parcel.readInt() == 1;
            this.y = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f2232u = savedState.f2232u;
            this.f2230s = savedState.f2230s;
            this.f2231t = savedState.f2231t;
            this.f2233v = savedState.f2233v;
            this.f2234w = savedState.f2234w;
            this.f2235x = savedState.f2235x;
            this.f2236z = savedState.f2236z;
            this.A = savedState.A;
            this.B = savedState.B;
            this.y = savedState.y;
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.D0();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f2238a;

        /* renamed from: b, reason: collision with root package name */
        public int f2239b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2240c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2241d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2242e;
        public int[] f;

        public b() {
            a();
        }

        public final void a() {
            this.f2238a = -1;
            this.f2239b = Integer.MIN_VALUE;
            this.f2240c = false;
            this.f2241d = false;
            this.f2242e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.p {

        /* renamed from: e, reason: collision with root package name */
        public d f2244e;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList<View> f2245a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        public int f2246b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        public int f2247c = Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        public int f2248d = 0;

        /* renamed from: e, reason: collision with root package name */
        public final int f2249e;

        public d(int i10) {
            this.f2249e = i10;
        }

        public static c h(View view) {
            return (c) view.getLayoutParams();
        }

        public final void a() {
            View view = this.f2245a.get(r0.size() - 1);
            c h10 = h(view);
            this.f2247c = StaggeredGridLayoutManager.this.f2216r.b(view);
            h10.getClass();
        }

        public final void b() {
            this.f2245a.clear();
            this.f2246b = Integer.MIN_VALUE;
            this.f2247c = Integer.MIN_VALUE;
            this.f2248d = 0;
        }

        public final int c() {
            boolean z10 = StaggeredGridLayoutManager.this.f2221w;
            ArrayList<View> arrayList = this.f2245a;
            if (z10) {
                return e(arrayList.size() - 1, -1);
            }
            return e(0, arrayList.size());
        }

        public final int d() {
            boolean z10 = StaggeredGridLayoutManager.this.f2221w;
            ArrayList<View> arrayList = this.f2245a;
            if (z10) {
                return e(0, arrayList.size());
            }
            return e(arrayList.size() - 1, -1);
        }

        public final int e(int i10, int i11) {
            int i12;
            boolean z10;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int k10 = staggeredGridLayoutManager.f2216r.k();
            int g6 = staggeredGridLayoutManager.f2216r.g();
            if (i11 > i10) {
                i12 = 1;
            } else {
                i12 = -1;
            }
            while (i10 != i11) {
                View view = this.f2245a.get(i10);
                int e10 = staggeredGridLayoutManager.f2216r.e(view);
                int b10 = staggeredGridLayoutManager.f2216r.b(view);
                boolean z11 = false;
                if (e10 <= g6) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (b10 >= k10) {
                    z11 = true;
                }
                if (z10 && z11 && (e10 < k10 || b10 > g6)) {
                    return RecyclerView.o.F(view);
                }
                i10 += i12;
            }
            return -1;
        }

        public final int f(int i10) {
            int i11 = this.f2247c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f2245a.size() == 0) {
                return i10;
            }
            a();
            return this.f2247c;
        }

        public final View g(int i10, int i11) {
            ArrayList<View> arrayList = this.f2245a;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            View view = null;
            if (i11 == -1) {
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    View view2 = arrayList.get(i12);
                    if ((staggeredGridLayoutManager.f2221w && RecyclerView.o.F(view2) <= i10) || ((!staggeredGridLayoutManager.f2221w && RecyclerView.o.F(view2) >= i10) || !view2.hasFocusable())) {
                        break;
                    }
                    i12++;
                    view = view2;
                }
            } else {
                int size2 = arrayList.size() - 1;
                while (size2 >= 0) {
                    View view3 = arrayList.get(size2);
                    if ((staggeredGridLayoutManager.f2221w && RecyclerView.o.F(view3) >= i10) || ((!staggeredGridLayoutManager.f2221w && RecyclerView.o.F(view3) <= i10) || !view3.hasFocusable())) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        public final int i(int i10) {
            int i11 = this.f2246b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            ArrayList<View> arrayList = this.f2245a;
            if (arrayList.size() == 0) {
                return i10;
            }
            View view = arrayList.get(0);
            c h10 = h(view);
            this.f2246b = StaggeredGridLayoutManager.this.f2216r.e(view);
            h10.getClass();
            return this.f2246b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2214p = -1;
        this.f2221w = false;
        LazySpanLookup lazySpanLookup = new LazySpanLookup();
        this.B = lazySpanLookup;
        this.C = 2;
        this.G = new Rect();
        this.H = new b();
        this.I = true;
        this.K = new a();
        RecyclerView.o.d G = RecyclerView.o.G(context, attributeSet, i10, i11);
        int i12 = G.f2166a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i12 != this.f2218t) {
            this.f2218t = i12;
            s sVar = this.f2216r;
            this.f2216r = this.f2217s;
            this.f2217s = sVar;
            n0();
        }
        int i13 = G.f2167b;
        c(null);
        if (i13 != this.f2214p) {
            lazySpanLookup.a();
            n0();
            this.f2214p = i13;
            this.y = new BitSet(this.f2214p);
            this.f2215q = new d[this.f2214p];
            for (int i14 = 0; i14 < this.f2214p; i14++) {
                this.f2215q[i14] = new d(i14);
            }
            n0();
        }
        boolean z10 = G.f2168c;
        c(null);
        SavedState savedState = this.F;
        if (savedState != null && savedState.f2236z != z10) {
            savedState.f2236z = z10;
        }
        this.f2221w = z10;
        n0();
        this.f2220v = new n();
        this.f2216r = s.a(this, this.f2218t);
        this.f2217s = s.a(this, 1 - this.f2218t);
    }

    public static int f1(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i10;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean B0() {
        if (this.F == null) {
            return true;
        }
        return false;
    }

    public final int C0(int i10) {
        boolean z10;
        if (w() == 0) {
            if (!this.f2222x) {
                return -1;
            }
            return 1;
        }
        if (i10 < M0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f2222x) {
            return -1;
        }
        return 1;
    }

    public final boolean D0() {
        int M0;
        if (w() != 0 && this.C != 0 && this.f2156g) {
            if (this.f2222x) {
                M0 = N0();
                M0();
            } else {
                M0 = M0();
                N0();
            }
            if (M0 == 0 && R0() != null) {
                this.B.a();
                this.f = true;
                n0();
                return true;
            }
        }
        return false;
    }

    public final int E0(RecyclerView.z zVar) {
        if (w() == 0) {
            return 0;
        }
        s sVar = this.f2216r;
        boolean z10 = this.I;
        return w.a(zVar, sVar, J0(!z10), I0(!z10), this, this.I);
    }

    public final int F0(RecyclerView.z zVar) {
        if (w() == 0) {
            return 0;
        }
        s sVar = this.f2216r;
        boolean z10 = this.I;
        return w.b(zVar, sVar, J0(!z10), I0(!z10), this, this.I, this.f2222x);
    }

    public final int G0(RecyclerView.z zVar) {
        if (w() == 0) {
            return 0;
        }
        s sVar = this.f2216r;
        boolean z10 = this.I;
        return w.c(zVar, sVar, J0(!z10), I0(!z10), this, this.I);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v19 */
    public final int H0(RecyclerView.v vVar, n nVar, RecyclerView.z zVar) {
        int i10;
        int k10;
        int i11;
        int O0;
        int i12;
        int i13;
        d dVar;
        ?? r82;
        int i14;
        int c10;
        int k11;
        int c11;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = 0;
        int i20 = 1;
        this.y.set(0, this.f2214p, true);
        n nVar2 = this.f2220v;
        if (nVar2.f2368i) {
            if (nVar.f2365e == 1) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = Integer.MIN_VALUE;
            }
        } else if (nVar.f2365e == 1) {
            i10 = nVar.f2366g + nVar.f2362b;
        } else {
            i10 = nVar.f - nVar.f2362b;
        }
        int i21 = nVar.f2365e;
        for (int i22 = 0; i22 < this.f2214p; i22++) {
            if (!this.f2215q[i22].f2245a.isEmpty()) {
                e1(this.f2215q[i22], i21, i10);
            }
        }
        if (this.f2222x) {
            k10 = this.f2216r.g();
        } else {
            k10 = this.f2216r.k();
        }
        boolean z10 = false;
        while (true) {
            int i23 = nVar.f2363c;
            if (i23 >= 0 && i23 < zVar.b()) {
                i11 = i20;
            } else {
                i11 = i19;
            }
            if (i11 == 0 || (!nVar2.f2368i && this.y.isEmpty())) {
                break;
            }
            View view = vVar.j(Long.MAX_VALUE, nVar.f2363c).itemView;
            nVar.f2363c += nVar.f2364d;
            c cVar = (c) view.getLayoutParams();
            int a10 = cVar.a();
            LazySpanLookup lazySpanLookup = this.B;
            int[] iArr = lazySpanLookup.f2224a;
            if (iArr != null && a10 < iArr.length) {
                i12 = iArr[a10];
            } else {
                i12 = -1;
            }
            if (i12 == -1) {
                i13 = i20;
            } else {
                i13 = i19;
            }
            if (i13 != 0) {
                if (V0(nVar.f2365e)) {
                    i18 = this.f2214p - i20;
                    i17 = -1;
                    i16 = -1;
                } else {
                    i16 = i20;
                    i17 = this.f2214p;
                    i18 = i19;
                }
                d dVar2 = null;
                if (nVar.f2365e == i20) {
                    int k12 = this.f2216r.k();
                    int i24 = Integer.MAX_VALUE;
                    while (i18 != i17) {
                        d dVar3 = this.f2215q[i18];
                        int f = dVar3.f(k12);
                        if (f < i24) {
                            i24 = f;
                            dVar2 = dVar3;
                        }
                        i18 += i16;
                    }
                } else {
                    int g6 = this.f2216r.g();
                    int i25 = Integer.MIN_VALUE;
                    while (i18 != i17) {
                        d dVar4 = this.f2215q[i18];
                        int i26 = dVar4.i(g6);
                        if (i26 > i25) {
                            dVar2 = dVar4;
                            i25 = i26;
                        }
                        i18 += i16;
                    }
                }
                dVar = dVar2;
                lazySpanLookup.b(a10);
                lazySpanLookup.f2224a[a10] = dVar.f2249e;
            } else {
                dVar = this.f2215q[i12];
            }
            cVar.f2244e = dVar;
            if (nVar.f2365e == 1) {
                r82 = 0;
                b(view, -1, false);
            } else {
                r82 = 0;
                b(view, 0, false);
            }
            if (this.f2218t == 1) {
                T0(view, RecyclerView.o.x(this.f2219u, this.f2161l, r82, ((ViewGroup.MarginLayoutParams) cVar).width, r82), RecyclerView.o.x(this.o, this.f2162m, B() + E(), ((ViewGroup.MarginLayoutParams) cVar).height, true), r82);
            } else {
                T0(view, RecyclerView.o.x(this.f2163n, this.f2161l, D() + C(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.o.x(this.f2219u, this.f2162m, 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), false);
            }
            if (nVar.f2365e == 1) {
                c10 = dVar.f(k10);
                i14 = this.f2216r.c(view) + c10;
            } else {
                i14 = dVar.i(k10);
                c10 = i14 - this.f2216r.c(view);
            }
            if (nVar.f2365e == 1) {
                d dVar5 = cVar.f2244e;
                dVar5.getClass();
                c cVar2 = (c) view.getLayoutParams();
                cVar2.f2244e = dVar5;
                ArrayList<View> arrayList = dVar5.f2245a;
                arrayList.add(view);
                dVar5.f2247c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    dVar5.f2246b = Integer.MIN_VALUE;
                }
                if (cVar2.c() || cVar2.b()) {
                    dVar5.f2248d = StaggeredGridLayoutManager.this.f2216r.c(view) + dVar5.f2248d;
                }
            } else {
                d dVar6 = cVar.f2244e;
                dVar6.getClass();
                c cVar3 = (c) view.getLayoutParams();
                cVar3.f2244e = dVar6;
                ArrayList<View> arrayList2 = dVar6.f2245a;
                arrayList2.add(0, view);
                dVar6.f2246b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    dVar6.f2247c = Integer.MIN_VALUE;
                }
                if (cVar3.c() || cVar3.b()) {
                    dVar6.f2248d = StaggeredGridLayoutManager.this.f2216r.c(view) + dVar6.f2248d;
                }
            }
            if (S0() && this.f2218t == 1) {
                c11 = this.f2217s.g() - (((this.f2214p - 1) - dVar.f2249e) * this.f2219u);
                k11 = c11 - this.f2217s.c(view);
            } else {
                k11 = this.f2217s.k() + (dVar.f2249e * this.f2219u);
                c11 = this.f2217s.c(view) + k11;
            }
            if (this.f2218t == 1) {
                RecyclerView.o.N(view, k11, c10, c11, i14);
            } else {
                RecyclerView.o.N(view, c10, k11, i14, c11);
            }
            e1(dVar, nVar2.f2365e, i10);
            X0(vVar, nVar2);
            if (nVar2.f2367h && view.hasFocusable()) {
                i15 = 0;
                this.y.set(dVar.f2249e, false);
            } else {
                i15 = 0;
            }
            i19 = i15;
            i20 = 1;
            z10 = true;
        }
        int i27 = i19;
        if (!z10) {
            X0(vVar, nVar2);
        }
        if (nVar2.f2365e == -1) {
            O0 = this.f2216r.k() - P0(this.f2216r.k());
        } else {
            O0 = O0(this.f2216r.g()) - this.f2216r.g();
        }
        if (O0 > 0) {
            return Math.min(nVar.f2362b, O0);
        }
        return i27;
    }

    public final View I0(boolean z10) {
        int k10 = this.f2216r.k();
        int g6 = this.f2216r.g();
        View view = null;
        for (int w10 = w() - 1; w10 >= 0; w10--) {
            View v3 = v(w10);
            int e10 = this.f2216r.e(v3);
            int b10 = this.f2216r.b(v3);
            if (b10 > k10 && e10 < g6) {
                if (b10 > g6 && z10) {
                    if (view == null) {
                        view = v3;
                    }
                } else {
                    return v3;
                }
            }
        }
        return view;
    }

    public final View J0(boolean z10) {
        int k10 = this.f2216r.k();
        int g6 = this.f2216r.g();
        int w10 = w();
        View view = null;
        for (int i10 = 0; i10 < w10; i10++) {
            View v3 = v(i10);
            int e10 = this.f2216r.e(v3);
            if (this.f2216r.b(v3) > k10 && e10 < g6) {
                if (e10 < k10 && z10) {
                    if (view == null) {
                        view = v3;
                    }
                } else {
                    return v3;
                }
            }
        }
        return view;
    }

    public final void K0(RecyclerView.v vVar, RecyclerView.z zVar, boolean z10) {
        int g6;
        int O0 = O0(Integer.MIN_VALUE);
        if (O0 != Integer.MIN_VALUE && (g6 = this.f2216r.g() - O0) > 0) {
            int i10 = g6 - (-b1(-g6, vVar, zVar));
            if (z10 && i10 > 0) {
                this.f2216r.o(i10);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean L() {
        if (this.C != 0) {
            return true;
        }
        return false;
    }

    public final void L0(RecyclerView.v vVar, RecyclerView.z zVar, boolean z10) {
        int k10;
        int P0 = P0(Integer.MAX_VALUE);
        if (P0 != Integer.MAX_VALUE && (k10 = P0 - this.f2216r.k()) > 0) {
            int b12 = k10 - b1(k10, vVar, zVar);
            if (z10 && b12 > 0) {
                this.f2216r.o(-b12);
            }
        }
    }

    public final int M0() {
        if (w() == 0) {
            return 0;
        }
        return RecyclerView.o.F(v(0));
    }

    public final int N0() {
        int w10 = w();
        if (w10 == 0) {
            return 0;
        }
        return RecyclerView.o.F(v(w10 - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void O(int i10) {
        super.O(i10);
        for (int i11 = 0; i11 < this.f2214p; i11++) {
            d dVar = this.f2215q[i11];
            int i12 = dVar.f2246b;
            if (i12 != Integer.MIN_VALUE) {
                dVar.f2246b = i12 + i10;
            }
            int i13 = dVar.f2247c;
            if (i13 != Integer.MIN_VALUE) {
                dVar.f2247c = i13 + i10;
            }
        }
    }

    public final int O0(int i10) {
        int f = this.f2215q[0].f(i10);
        for (int i11 = 1; i11 < this.f2214p; i11++) {
            int f10 = this.f2215q[i11].f(i10);
            if (f10 > f) {
                f = f10;
            }
        }
        return f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void P(int i10) {
        super.P(i10);
        for (int i11 = 0; i11 < this.f2214p; i11++) {
            d dVar = this.f2215q[i11];
            int i12 = dVar.f2246b;
            if (i12 != Integer.MIN_VALUE) {
                dVar.f2246b = i12 + i10;
            }
            int i13 = dVar.f2247c;
            if (i13 != Integer.MIN_VALUE) {
                dVar.f2247c = i13 + i10;
            }
        }
    }

    public final int P0(int i10) {
        int i11 = this.f2215q[0].i(i10);
        for (int i12 = 1; i12 < this.f2214p; i12++) {
            int i13 = this.f2215q[i12].i(i10);
            if (i13 < i11) {
                i11 = i13;
            }
        }
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void Q() {
        this.B.a();
        for (int i10 = 0; i10 < this.f2214p; i10++) {
            this.f2215q[i10].b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q0(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f2222x
            if (r0 == 0) goto L9
            int r0 = r7.N0()
            goto Ld
        L9:
            int r0 = r7.M0()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1a
            if (r8 >= r9) goto L16
            int r2 = r9 + 1
            goto L1c
        L16:
            int r2 = r8 + 1
            r3 = r9
            goto L1d
        L1a:
            int r2 = r8 + r9
        L1c:
            r3 = r8
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r7.B
            r4.c(r3)
            r5 = 1
            if (r10 == r5) goto L36
            r6 = 2
            if (r10 == r6) goto L32
            if (r10 == r1) goto L2b
            goto L39
        L2b:
            r4.e(r8, r5)
            r4.d(r9, r5)
            goto L39
        L32:
            r4.e(r8, r9)
            goto L39
        L36:
            r4.d(r8, r9)
        L39:
            if (r2 > r0) goto L3c
            return
        L3c:
            boolean r8 = r7.f2222x
            if (r8 == 0) goto L45
            int r8 = r7.M0()
            goto L49
        L45:
            int r8 = r7.N0()
        L49:
            if (r3 > r8) goto L4e
            r7.n0()
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Q0(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void R(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2152b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i10 = 0; i10 < this.f2214p; i10++) {
            this.f2215q[i10].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d1, code lost:
    
        if (r10 == r11) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e5, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e3, code lost:
    
        if (r10 == r11) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View R0() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.R0():android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x004a, code lost:
    
        if (r8.f2218t == 1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x004f, code lost:
    
        if (r8.f2218t == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x005d, code lost:
    
        if (S0() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0069, code lost:
    
        if (S0() == false) goto L54;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View S(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.v r11, androidx.recyclerview.widget.RecyclerView.z r12) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.S(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    public final boolean S0() {
        if (z() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (w() > 0) {
            View J0 = J0(false);
            View I0 = I0(false);
            if (J0 != null && I0 != null) {
                int F = RecyclerView.o.F(J0);
                int F2 = RecyclerView.o.F(I0);
                if (F < F2) {
                    accessibilityEvent.setFromIndex(F);
                    accessibilityEvent.setToIndex(F2);
                } else {
                    accessibilityEvent.setFromIndex(F2);
                    accessibilityEvent.setToIndex(F);
                }
            }
        }
    }

    public final void T0(View view, int i10, int i11, boolean z10) {
        RecyclerView recyclerView = this.f2152b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.getItemDecorInsetsForChild(view));
        }
        c cVar = (c) view.getLayoutParams();
        int f12 = f1(i10, ((ViewGroup.MarginLayoutParams) cVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int f13 = f1(i11, ((ViewGroup.MarginLayoutParams) cVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect.bottom);
        if (w0(view, f12, f13, cVar)) {
            view.measure(f12, f13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x0408, code lost:
    
        if (D0() != false) goto L254;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U0(androidx.recyclerview.widget.RecyclerView.v r17, androidx.recyclerview.widget.RecyclerView.z r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.U0(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, boolean):void");
    }

    public final boolean V0(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f2218t == 0) {
            if (i10 == -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.f2222x) {
                return true;
            }
            return false;
        }
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 == this.f2222x) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 == S0()) {
            return true;
        }
        return false;
    }

    public final void W0(int i10, RecyclerView.z zVar) {
        int M0;
        int i11;
        if (i10 > 0) {
            M0 = N0();
            i11 = 1;
        } else {
            M0 = M0();
            i11 = -1;
        }
        n nVar = this.f2220v;
        nVar.f2361a = true;
        d1(M0, zVar);
        c1(i11);
        nVar.f2363c = M0 + nVar.f2364d;
        nVar.f2362b = Math.abs(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void X(int i10, int i11) {
        Q0(i10, i11, 1);
    }

    public final void X0(RecyclerView.v vVar, n nVar) {
        int min;
        int min2;
        if (nVar.f2361a && !nVar.f2368i) {
            if (nVar.f2362b == 0) {
                if (nVar.f2365e == -1) {
                    Y0(nVar.f2366g, vVar);
                    return;
                } else {
                    Z0(nVar.f, vVar);
                    return;
                }
            }
            int i10 = 1;
            if (nVar.f2365e == -1) {
                int i11 = nVar.f;
                int i12 = this.f2215q[0].i(i11);
                while (i10 < this.f2214p) {
                    int i13 = this.f2215q[i10].i(i11);
                    if (i13 > i12) {
                        i12 = i13;
                    }
                    i10++;
                }
                int i14 = i11 - i12;
                if (i14 < 0) {
                    min2 = nVar.f2366g;
                } else {
                    min2 = nVar.f2366g - Math.min(i14, nVar.f2362b);
                }
                Y0(min2, vVar);
                return;
            }
            int i15 = nVar.f2366g;
            int f = this.f2215q[0].f(i15);
            while (i10 < this.f2214p) {
                int f10 = this.f2215q[i10].f(i15);
                if (f10 < f) {
                    f = f10;
                }
                i10++;
            }
            int i16 = f - nVar.f2366g;
            if (i16 < 0) {
                min = nVar.f;
            } else {
                min = Math.min(i16, nVar.f2362b) + nVar.f;
            }
            Z0(min, vVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void Y() {
        this.B.a();
        n0();
    }

    public final void Y0(int i10, RecyclerView.v vVar) {
        for (int w10 = w() - 1; w10 >= 0; w10--) {
            View v3 = v(w10);
            if (this.f2216r.e(v3) >= i10 && this.f2216r.n(v3) >= i10) {
                c cVar = (c) v3.getLayoutParams();
                cVar.getClass();
                if (cVar.f2244e.f2245a.size() == 1) {
                    return;
                }
                d dVar = cVar.f2244e;
                ArrayList<View> arrayList = dVar.f2245a;
                int size = arrayList.size();
                View remove = arrayList.remove(size - 1);
                c h10 = d.h(remove);
                h10.f2244e = null;
                if (h10.c() || h10.b()) {
                    dVar.f2248d -= StaggeredGridLayoutManager.this.f2216r.c(remove);
                }
                if (size == 1) {
                    dVar.f2246b = Integer.MIN_VALUE;
                }
                dVar.f2247c = Integer.MIN_VALUE;
                k0(v3, vVar);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void Z(int i10, int i11) {
        Q0(i10, i11, 8);
    }

    public final void Z0(int i10, RecyclerView.v vVar) {
        while (w() > 0) {
            View v3 = v(0);
            if (this.f2216r.b(v3) <= i10 && this.f2216r.m(v3) <= i10) {
                c cVar = (c) v3.getLayoutParams();
                cVar.getClass();
                if (cVar.f2244e.f2245a.size() == 1) {
                    return;
                }
                d dVar = cVar.f2244e;
                ArrayList<View> arrayList = dVar.f2245a;
                View remove = arrayList.remove(0);
                c h10 = d.h(remove);
                h10.f2244e = null;
                if (arrayList.size() == 0) {
                    dVar.f2247c = Integer.MIN_VALUE;
                }
                if (h10.c() || h10.b()) {
                    dVar.f2248d -= StaggeredGridLayoutManager.this.f2216r.c(remove);
                }
                dVar.f2246b = Integer.MIN_VALUE;
                k0(v3, vVar);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public final PointF a(int i10) {
        int C0 = C0(i10);
        PointF pointF = new PointF();
        if (C0 == 0) {
            return null;
        }
        if (this.f2218t == 0) {
            pointF.x = C0;
            pointF.y = gl.Code;
        } else {
            pointF.x = gl.Code;
            pointF.y = C0;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void a0(int i10, int i11) {
        Q0(i10, i11, 2);
    }

    public final void a1() {
        if (this.f2218t != 1 && S0()) {
            this.f2222x = !this.f2221w;
        } else {
            this.f2222x = this.f2221w;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void b0(int i10, int i11) {
        Q0(i10, i11, 4);
    }

    public final int b1(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (w() == 0 || i10 == 0) {
            return 0;
        }
        W0(i10, zVar);
        n nVar = this.f2220v;
        int H0 = H0(vVar, nVar, zVar);
        if (nVar.f2362b >= H0) {
            if (i10 < 0) {
                i10 = -H0;
            } else {
                i10 = H0;
            }
        }
        this.f2216r.o(-i10);
        this.D = this.f2222x;
        nVar.f2362b = 0;
        X0(vVar, nVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void c0(RecyclerView.v vVar, RecyclerView.z zVar) {
        U0(vVar, zVar, true);
    }

    public final void c1(int i10) {
        boolean z10;
        n nVar = this.f2220v;
        nVar.f2365e = i10;
        boolean z11 = this.f2222x;
        int i11 = 1;
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            i11 = -1;
        }
        nVar.f2364d = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean d() {
        if (this.f2218t == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void d0(RecyclerView.z zVar) {
        this.f2223z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    public final void d1(int i10, RecyclerView.z zVar) {
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        n nVar = this.f2220v;
        boolean z13 = false;
        nVar.f2362b = 0;
        nVar.f2363c = i10;
        RecyclerView.y yVar = this.f2155e;
        if (yVar != null && yVar.f2192e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (i13 = zVar.f2201a) != -1) {
            boolean z14 = this.f2222x;
            if (i13 < i10) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z14 == z12) {
                i11 = this.f2216r.l();
                i12 = 0;
            } else {
                i12 = this.f2216r.l();
                i11 = 0;
            }
        } else {
            i11 = 0;
            i12 = 0;
        }
        RecyclerView recyclerView = this.f2152b;
        if (recyclerView != null && recyclerView.mClipToPadding) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            nVar.f = this.f2216r.k() - i12;
            nVar.f2366g = this.f2216r.g() + i11;
        } else {
            nVar.f2366g = this.f2216r.f() + i11;
            nVar.f = -i12;
        }
        nVar.f2367h = false;
        nVar.f2361a = true;
        if (this.f2216r.i() == 0 && this.f2216r.f() == 0) {
            z13 = true;
        }
        nVar.f2368i = z13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean e() {
        if (this.f2218t == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.F = savedState;
            if (this.f2223z != -1) {
                savedState.f2233v = null;
                savedState.f2232u = 0;
                savedState.f2230s = -1;
                savedState.f2231t = -1;
                savedState.f2233v = null;
                savedState.f2232u = 0;
                savedState.f2234w = 0;
                savedState.f2235x = null;
                savedState.y = null;
            }
            n0();
        }
    }

    public final void e1(d dVar, int i10, int i11) {
        int i12 = dVar.f2248d;
        int i13 = dVar.f2249e;
        if (i10 == -1) {
            int i14 = dVar.f2246b;
            if (i14 == Integer.MIN_VALUE) {
                View view = dVar.f2245a.get(0);
                c h10 = d.h(view);
                dVar.f2246b = StaggeredGridLayoutManager.this.f2216r.e(view);
                h10.getClass();
                i14 = dVar.f2246b;
            }
            if (i14 + i12 <= i11) {
                this.y.set(i13, false);
                return;
            }
            return;
        }
        int i15 = dVar.f2247c;
        if (i15 == Integer.MIN_VALUE) {
            dVar.a();
            i15 = dVar.f2247c;
        }
        if (i15 - i12 >= i11) {
            this.y.set(i13, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean f(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final Parcelable f0() {
        int M0;
        View J0;
        int i10;
        int k10;
        int[] iArr;
        SavedState savedState = this.F;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.f2236z = this.f2221w;
        savedState2.A = this.D;
        savedState2.B = this.E;
        LazySpanLookup lazySpanLookup = this.B;
        if (lazySpanLookup != null && (iArr = lazySpanLookup.f2224a) != null) {
            savedState2.f2235x = iArr;
            savedState2.f2234w = iArr.length;
            savedState2.y = lazySpanLookup.f2225b;
        } else {
            savedState2.f2234w = 0;
        }
        int i11 = -1;
        if (w() > 0) {
            if (this.D) {
                M0 = N0();
            } else {
                M0 = M0();
            }
            savedState2.f2230s = M0;
            if (this.f2222x) {
                J0 = I0(true);
            } else {
                J0 = J0(true);
            }
            if (J0 != null) {
                i11 = RecyclerView.o.F(J0);
            }
            savedState2.f2231t = i11;
            int i12 = this.f2214p;
            savedState2.f2232u = i12;
            savedState2.f2233v = new int[i12];
            for (int i13 = 0; i13 < this.f2214p; i13++) {
                if (this.D) {
                    i10 = this.f2215q[i13].f(Integer.MIN_VALUE);
                    if (i10 != Integer.MIN_VALUE) {
                        k10 = this.f2216r.g();
                        i10 -= k10;
                        savedState2.f2233v[i13] = i10;
                    } else {
                        savedState2.f2233v[i13] = i10;
                    }
                } else {
                    i10 = this.f2215q[i13].i(Integer.MIN_VALUE);
                    if (i10 != Integer.MIN_VALUE) {
                        k10 = this.f2216r.k();
                        i10 -= k10;
                        savedState2.f2233v[i13] = i10;
                    } else {
                        savedState2.f2233v[i13] = i10;
                    }
                }
            }
        } else {
            savedState2.f2230s = -1;
            savedState2.f2231t = -1;
            savedState2.f2232u = 0;
        }
        return savedState2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void g0(int i10) {
        if (i10 == 0) {
            D0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void h(int i10, int i11, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        n nVar;
        boolean z10;
        int f;
        int i12;
        if (this.f2218t != 0) {
            i10 = i11;
        }
        if (w() != 0 && i10 != 0) {
            W0(i10, zVar);
            int[] iArr = this.J;
            if (iArr == null || iArr.length < this.f2214p) {
                this.J = new int[this.f2214p];
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int i15 = this.f2214p;
                nVar = this.f2220v;
                if (i13 >= i15) {
                    break;
                }
                if (nVar.f2364d == -1) {
                    f = nVar.f;
                    i12 = this.f2215q[i13].i(f);
                } else {
                    f = this.f2215q[i13].f(nVar.f2366g);
                    i12 = nVar.f2366g;
                }
                int i16 = f - i12;
                if (i16 >= 0) {
                    this.J[i14] = i16;
                    i14++;
                }
                i13++;
            }
            Arrays.sort(this.J, 0, i14);
            for (int i17 = 0; i17 < i14; i17++) {
                int i18 = nVar.f2363c;
                if (i18 >= 0 && i18 < zVar.b()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ((m.b) cVar).a(nVar.f2363c, this.J[i17]);
                    nVar.f2363c += nVar.f2364d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int j(RecyclerView.z zVar) {
        return E0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int k(RecyclerView.z zVar) {
        return F0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int l(RecyclerView.z zVar) {
        return G0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int m(RecyclerView.z zVar) {
        return E0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int n(RecyclerView.z zVar) {
        return F0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int o(RecyclerView.z zVar) {
        return G0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int o0(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        return b1(i10, vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void p0(int i10) {
        SavedState savedState = this.F;
        if (savedState != null && savedState.f2230s != i10) {
            savedState.f2233v = null;
            savedState.f2232u = 0;
            savedState.f2230s = -1;
            savedState.f2231t = -1;
        }
        this.f2223z = i10;
        this.A = Integer.MIN_VALUE;
        n0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int q0(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        return b1(i10, vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p r() {
        if (this.f2218t == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p s(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void t0(Rect rect, int i10, int i11) {
        int g6;
        int g10;
        int D = D() + C();
        int B = B() + E();
        if (this.f2218t == 1) {
            int height = rect.height() + B;
            RecyclerView recyclerView = this.f2152b;
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            g10 = RecyclerView.o.g(i11, height, c0.d.d(recyclerView));
            g6 = RecyclerView.o.g(i10, (this.f2219u * this.f2214p) + D, c0.d.e(this.f2152b));
        } else {
            int width = rect.width() + D;
            RecyclerView recyclerView2 = this.f2152b;
            WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
            g6 = RecyclerView.o.g(i10, width, c0.d.e(recyclerView2));
            g10 = RecyclerView.o.g(i11, (this.f2219u * this.f2214p) + B, c0.d.d(this.f2152b));
        }
        this.f2152b.setMeasuredDimension(g6, g10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void z0(RecyclerView recyclerView, int i10) {
        o oVar = new o(recyclerView.getContext());
        oVar.f2188a = i10;
        A0(oVar);
    }

    /* loaded from: classes.dex */
    public static class LazySpanLookup {

        /* renamed from: a, reason: collision with root package name */
        public int[] f2224a;

        /* renamed from: b, reason: collision with root package name */
        public List<FullSpanItem> f2225b;

        public final void a() {
            int[] iArr = this.f2224a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2225b = null;
        }

        public final void b(int i10) {
            int[] iArr = this.f2224a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f2224a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int length = iArr.length;
                while (length <= i10) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f2224a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2224a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int c(int r6) {
            /*
                r5 = this;
                int[] r0 = r5.f2224a
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.length
                if (r6 < r0) goto La
                return r1
            La:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.f2225b
                if (r0 != 0) goto Lf
                goto L5e
            Lf:
                r2 = 0
                if (r0 != 0) goto L13
                goto L2b
            L13:
                int r0 = r0.size()
                int r0 = r0 + r1
            L18:
                if (r0 < 0) goto L2b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r5.f2225b
                java.lang.Object r3 = r3.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r3
                int r4 = r3.f2226s
                if (r4 != r6) goto L28
                r2 = r3
                goto L2b
            L28:
                int r0 = r0 + (-1)
                goto L18
            L2b:
                if (r2 == 0) goto L32
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.f2225b
                r0.remove(r2)
            L32:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.f2225b
                int r0 = r0.size()
                r2 = 0
            L39:
                if (r2 >= r0) goto L4b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r5.f2225b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r3
                int r3 = r3.f2226s
                if (r3 < r6) goto L48
                goto L4c
            L48:
                int r2 = r2 + 1
                goto L39
            L4b:
                r2 = r1
            L4c:
                if (r2 == r1) goto L5e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.f2225b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r5.f2225b
                r3.remove(r2)
                int r0 = r0.f2226s
                goto L5f
            L5e:
                r0 = r1
            L5f:
                if (r0 != r1) goto L6b
                int[] r0 = r5.f2224a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r6, r2, r1)
                int[] r6 = r5.f2224a
                int r6 = r6.length
                return r6
            L6b:
                int r0 = r0 + 1
                int[] r2 = r5.f2224a
                int r2 = r2.length
                int r0 = java.lang.Math.min(r0, r2)
                int[] r2 = r5.f2224a
                java.util.Arrays.fill(r2, r6, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.c(int):int");
        }

        public final void d(int i10, int i11) {
            int[] iArr = this.f2224a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                b(i12);
                int[] iArr2 = this.f2224a;
                System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
                Arrays.fill(this.f2224a, i10, i12, -1);
                List<FullSpanItem> list = this.f2225b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        FullSpanItem fullSpanItem = this.f2225b.get(size);
                        int i13 = fullSpanItem.f2226s;
                        if (i13 >= i10) {
                            fullSpanItem.f2226s = i13 + i11;
                        }
                    }
                }
            }
        }

        public final void e(int i10, int i11) {
            int[] iArr = this.f2224a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                b(i12);
                int[] iArr2 = this.f2224a;
                System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
                int[] iArr3 = this.f2224a;
                Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
                List<FullSpanItem> list = this.f2225b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        FullSpanItem fullSpanItem = this.f2225b.get(size);
                        int i13 = fullSpanItem.f2226s;
                        if (i13 >= i10) {
                            if (i13 < i12) {
                                this.f2225b.remove(size);
                            } else {
                                fullSpanItem.f2226s = i13 - i11;
                            }
                        }
                    }
                }
            }
        }

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* renamed from: s, reason: collision with root package name */
            public int f2226s;

            /* renamed from: t, reason: collision with root package name */
            public int f2227t;

            /* renamed from: u, reason: collision with root package name */
            public int[] f2228u;

            /* renamed from: v, reason: collision with root package name */
            public boolean f2229v;

            /* loaded from: classes.dex */
            public class a implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                public final FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final FullSpanItem[] newArray(int i10) {
                    return new FullSpanItem[i10];
                }
            }

            public FullSpanItem(Parcel parcel) {
                this.f2226s = parcel.readInt();
                this.f2227t = parcel.readInt();
                this.f2229v = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f2228u = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f2226s + ", mGapDir=" + this.f2227t + ", mHasUnwantedGapAfter=" + this.f2229v + ", mGapPerSpan=" + Arrays.toString(this.f2228u) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f2226s);
                parcel.writeInt(this.f2227t);
                parcel.writeInt(this.f2229v ? 1 : 0);
                int[] iArr = this.f2228u;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f2228u);
                } else {
                    parcel.writeInt(0);
                }
            }

            public FullSpanItem() {
            }
        }
    }
}
