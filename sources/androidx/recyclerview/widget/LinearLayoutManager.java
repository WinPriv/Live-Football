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
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.y.b {
    public final a A;
    public final b B;
    public final int C;
    public final int[] D;

    /* renamed from: p, reason: collision with root package name */
    public int f2096p;

    /* renamed from: q, reason: collision with root package name */
    public c f2097q;

    /* renamed from: r, reason: collision with root package name */
    public s f2098r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2099s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2100t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2101u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2102v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f2103w;

    /* renamed from: x, reason: collision with root package name */
    public int f2104x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public SavedState f2105z;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: s, reason: collision with root package name */
        public int f2106s;

        /* renamed from: t, reason: collision with root package name */
        public int f2107t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f2108u;

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
            parcel.writeInt(this.f2106s);
            parcel.writeInt(this.f2107t);
            parcel.writeInt(this.f2108u ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f2106s = parcel.readInt();
            this.f2107t = parcel.readInt();
            this.f2108u = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f2106s = savedState.f2106s;
            this.f2107t = savedState.f2107t;
            this.f2108u = savedState.f2108u;
        }
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public s f2109a;

        /* renamed from: b, reason: collision with root package name */
        public int f2110b;

        /* renamed from: c, reason: collision with root package name */
        public int f2111c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2112d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2113e;

        public a() {
            d();
        }

        public final void a() {
            int k10;
            if (this.f2112d) {
                k10 = this.f2109a.g();
            } else {
                k10 = this.f2109a.k();
            }
            this.f2111c = k10;
        }

        public final void b(int i10, View view) {
            int l10;
            if (this.f2112d) {
                int b10 = this.f2109a.b(view);
                s sVar = this.f2109a;
                if (Integer.MIN_VALUE == sVar.f2378b) {
                    l10 = 0;
                } else {
                    l10 = sVar.l() - sVar.f2378b;
                }
                this.f2111c = l10 + b10;
            } else {
                this.f2111c = this.f2109a.e(view);
            }
            this.f2110b = i10;
        }

        public final void c(int i10, View view) {
            int l10;
            s sVar = this.f2109a;
            if (Integer.MIN_VALUE == sVar.f2378b) {
                l10 = 0;
            } else {
                l10 = sVar.l() - sVar.f2378b;
            }
            if (l10 >= 0) {
                b(i10, view);
                return;
            }
            this.f2110b = i10;
            if (this.f2112d) {
                int g6 = (this.f2109a.g() - l10) - this.f2109a.b(view);
                this.f2111c = this.f2109a.g() - g6;
                if (g6 > 0) {
                    int c10 = this.f2111c - this.f2109a.c(view);
                    int k10 = this.f2109a.k();
                    int min = c10 - (Math.min(this.f2109a.e(view) - k10, 0) + k10);
                    if (min < 0) {
                        this.f2111c = Math.min(g6, -min) + this.f2111c;
                        return;
                    }
                    return;
                }
                return;
            }
            int e10 = this.f2109a.e(view);
            int k11 = e10 - this.f2109a.k();
            this.f2111c = e10;
            if (k11 > 0) {
                int g10 = (this.f2109a.g() - Math.min(0, (this.f2109a.g() - l10) - this.f2109a.b(view))) - (this.f2109a.c(view) + e10);
                if (g10 < 0) {
                    this.f2111c -= Math.min(k11, -g10);
                }
            }
        }

        public final void d() {
            this.f2110b = -1;
            this.f2111c = Integer.MIN_VALUE;
            this.f2112d = false;
            this.f2113e = false;
        }

        public final String toString() {
            return "AnchorInfo{mPosition=" + this.f2110b + ", mCoordinate=" + this.f2111c + ", mLayoutFromEnd=" + this.f2112d + ", mValid=" + this.f2113e + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f2114a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f2115b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2116c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2117d;
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: b, reason: collision with root package name */
        public int f2119b;

        /* renamed from: c, reason: collision with root package name */
        public int f2120c;

        /* renamed from: d, reason: collision with root package name */
        public int f2121d;

        /* renamed from: e, reason: collision with root package name */
        public int f2122e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f2123g;

        /* renamed from: j, reason: collision with root package name */
        public int f2126j;

        /* renamed from: l, reason: collision with root package name */
        public boolean f2128l;

        /* renamed from: a, reason: collision with root package name */
        public boolean f2118a = true;

        /* renamed from: h, reason: collision with root package name */
        public int f2124h = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f2125i = 0;

        /* renamed from: k, reason: collision with root package name */
        public List<RecyclerView.c0> f2127k = null;

        public final void a(View view) {
            int a10;
            int size = this.f2127k.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f2127k.get(i11).itemView;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.c() && (a10 = (pVar.a() - this.f2121d) * this.f2122e) >= 0 && a10 < i10) {
                    view2 = view3;
                    if (a10 == 0) {
                        break;
                    } else {
                        i10 = a10;
                    }
                }
            }
            if (view2 == null) {
                this.f2121d = -1;
            } else {
                this.f2121d = ((RecyclerView.p) view2.getLayoutParams()).a();
            }
        }

        public final View b(RecyclerView.v vVar) {
            List<RecyclerView.c0> list = this.f2127k;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    View view = this.f2127k.get(i10).itemView;
                    RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                    if (!pVar.c() && this.f2121d == pVar.a()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View view2 = vVar.j(Long.MAX_VALUE, this.f2121d).itemView;
            this.f2121d += this.f2122e;
            return view2;
        }
    }

    public LinearLayoutManager() {
        this(1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean B0() {
        if (this.f2105z == null && this.f2099s == this.f2102v) {
            return true;
        }
        return false;
    }

    public void C0(RecyclerView.z zVar, int[] iArr) {
        boolean z10;
        int i10;
        int i11;
        if (zVar.f2201a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = this.f2098r.l();
        } else {
            i10 = 0;
        }
        if (this.f2097q.f == -1) {
            i11 = 0;
        } else {
            i11 = i10;
            i10 = 0;
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public void D0(RecyclerView.z zVar, c cVar, RecyclerView.o.c cVar2) {
        int i10 = cVar.f2121d;
        if (i10 >= 0 && i10 < zVar.b()) {
            ((m.b) cVar2).a(i10, Math.max(0, cVar.f2123g));
        }
    }

    public final int E0(RecyclerView.z zVar) {
        if (w() == 0) {
            return 0;
        }
        I0();
        s sVar = this.f2098r;
        boolean z10 = !this.f2103w;
        return w.a(zVar, sVar, L0(z10), K0(z10), this, this.f2103w);
    }

    public final int F0(RecyclerView.z zVar) {
        if (w() == 0) {
            return 0;
        }
        I0();
        s sVar = this.f2098r;
        boolean z10 = !this.f2103w;
        return w.b(zVar, sVar, L0(z10), K0(z10), this, this.f2103w, this.f2101u);
    }

    public final int G0(RecyclerView.z zVar) {
        if (w() == 0) {
            return 0;
        }
        I0();
        s sVar = this.f2098r;
        boolean z10 = !this.f2103w;
        return w.c(zVar, sVar, L0(z10), K0(z10), this, this.f2103w);
    }

    public final int H0(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 == 130 && this.f2096p == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        if (this.f2096p == 0) {
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (this.f2096p == 1) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (this.f2096p == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            if (this.f2096p != 1 && V0()) {
                return -1;
            }
            return 1;
        }
        if (this.f2096p == 1 || !V0()) {
            return -1;
        }
        return 1;
    }

    public final void I0() {
        if (this.f2097q == null) {
            this.f2097q = new c();
        }
    }

    public final int J0(RecyclerView.v vVar, c cVar, RecyclerView.z zVar, boolean z10) {
        boolean z11;
        int i10 = cVar.f2120c;
        int i11 = cVar.f2123g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f2123g = i11 + i10;
            }
            Y0(vVar, cVar);
        }
        int i12 = cVar.f2120c + cVar.f2124h;
        while (true) {
            if (!cVar.f2128l && i12 <= 0) {
                break;
            }
            int i13 = cVar.f2121d;
            if (i13 >= 0 && i13 < zVar.b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                break;
            }
            b bVar = this.B;
            bVar.f2114a = 0;
            bVar.f2115b = false;
            bVar.f2116c = false;
            bVar.f2117d = false;
            W0(vVar, zVar, cVar, bVar);
            if (!bVar.f2115b) {
                int i14 = cVar.f2119b;
                int i15 = bVar.f2114a;
                cVar.f2119b = (cVar.f * i15) + i14;
                if (!bVar.f2116c || cVar.f2127k != null || !zVar.f2206g) {
                    cVar.f2120c -= i15;
                    i12 -= i15;
                }
                int i16 = cVar.f2123g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    cVar.f2123g = i17;
                    int i18 = cVar.f2120c;
                    if (i18 < 0) {
                        cVar.f2123g = i17 + i18;
                    }
                    Y0(vVar, cVar);
                }
                if (z10 && bVar.f2117d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f2120c;
    }

    public final View K0(boolean z10) {
        if (this.f2101u) {
            return P0(0, w(), z10);
        }
        return P0(w() - 1, -1, z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean L() {
        return true;
    }

    public final View L0(boolean z10) {
        if (this.f2101u) {
            return P0(w() - 1, -1, z10);
        }
        return P0(0, w(), z10);
    }

    public final int M0() {
        View P0 = P0(0, w(), false);
        if (P0 == null) {
            return -1;
        }
        return RecyclerView.o.F(P0);
    }

    public final int N0() {
        View P0 = P0(w() - 1, -1, false);
        if (P0 == null) {
            return -1;
        }
        return RecyclerView.o.F(P0);
    }

    public final View O0(int i10, int i11) {
        char c10;
        int i12;
        int i13;
        I0();
        if (i11 > i10) {
            c10 = 1;
        } else if (i11 < i10) {
            c10 = 65535;
        } else {
            c10 = 0;
        }
        if (c10 == 0) {
            return v(i10);
        }
        if (this.f2098r.e(v(i10)) < this.f2098r.k()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        if (this.f2096p == 0) {
            return this.f2153c.a(i10, i11, i12, i13);
        }
        return this.f2154d.a(i10, i11, i12, i13);
    }

    public final View P0(int i10, int i11, boolean z10) {
        int i12;
        I0();
        if (z10) {
            i12 = 24579;
        } else {
            i12 = 320;
        }
        if (this.f2096p == 0) {
            return this.f2153c.a(i10, i11, i12, 320);
        }
        return this.f2154d.a(i10, i11, i12, 320);
    }

    public View Q0(RecyclerView.v vVar, RecyclerView.z zVar, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        boolean z12;
        boolean z13;
        I0();
        int w10 = w();
        if (z11) {
            i11 = w() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = w10;
            i11 = 0;
            i12 = 1;
        }
        int b10 = zVar.b();
        int k10 = this.f2098r.k();
        int g6 = this.f2098r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i11 != i10) {
            View v3 = v(i11);
            int F = RecyclerView.o.F(v3);
            int e10 = this.f2098r.e(v3);
            int b11 = this.f2098r.b(v3);
            if (F >= 0 && F < b10) {
                if (((RecyclerView.p) v3.getLayoutParams()).c()) {
                    if (view3 == null) {
                        view3 = v3;
                    }
                } else {
                    if (b11 <= k10 && e10 < k10) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (e10 >= g6 && b11 > g6) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z12 && !z13) {
                        return v3;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = v3;
                        }
                        view2 = v3;
                    } else {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = v3;
                        }
                        view2 = v3;
                    }
                }
            }
            i11 += i12;
        }
        if (view == null) {
            if (view2 != null) {
                return view2;
            }
            return view3;
        }
        return view;
    }

    public final int R0(int i10, RecyclerView.v vVar, RecyclerView.z zVar, boolean z10) {
        int g6;
        int g10 = this.f2098r.g() - i10;
        if (g10 > 0) {
            int i11 = -b1(-g10, vVar, zVar);
            int i12 = i10 + i11;
            if (z10 && (g6 = this.f2098r.g() - i12) > 0) {
                this.f2098r.o(g6);
                return g6 + i11;
            }
            return i11;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View S(View view, int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        int H0;
        View O0;
        View T0;
        a1();
        if (w() == 0 || (H0 = H0(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        I0();
        e1(H0, (int) (this.f2098r.l() * 0.33333334f), false, zVar);
        c cVar = this.f2097q;
        cVar.f2123g = Integer.MIN_VALUE;
        cVar.f2118a = false;
        J0(vVar, cVar, zVar, true);
        if (H0 == -1) {
            if (this.f2101u) {
                O0 = O0(w() - 1, -1);
            } else {
                O0 = O0(0, w());
            }
        } else if (this.f2101u) {
            O0 = O0(0, w());
        } else {
            O0 = O0(w() - 1, -1);
        }
        if (H0 == -1) {
            T0 = U0();
        } else {
            T0 = T0();
        }
        if (T0.hasFocusable()) {
            if (O0 == null) {
                return null;
            }
            return T0;
        }
        return O0;
    }

    public final int S0(int i10, RecyclerView.v vVar, RecyclerView.z zVar, boolean z10) {
        int k10;
        int k11 = i10 - this.f2098r.k();
        if (k11 > 0) {
            int i11 = -b1(k11, vVar, zVar);
            int i12 = i10 + i11;
            if (z10 && (k10 = i12 - this.f2098r.k()) > 0) {
                this.f2098r.o(-k10);
                return i11 - k10;
            }
            return i11;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(M0());
            accessibilityEvent.setToIndex(N0());
        }
    }

    public final View T0() {
        int w10;
        if (this.f2101u) {
            w10 = 0;
        } else {
            w10 = w() - 1;
        }
        return v(w10);
    }

    public final View U0() {
        int i10;
        if (this.f2101u) {
            i10 = w() - 1;
        } else {
            i10 = 0;
        }
        return v(i10);
    }

    public final boolean V0() {
        if (z() == 1) {
            return true;
        }
        return false;
    }

    public void W0(RecyclerView.v vVar, RecyclerView.z zVar, c cVar, b bVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        View b10 = cVar.b(vVar);
        if (b10 == null) {
            bVar.f2115b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) b10.getLayoutParams();
        if (cVar.f2127k == null) {
            boolean z12 = this.f2101u;
            if (cVar.f == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12 == z11) {
                b(b10, -1, false);
            } else {
                b(b10, 0, false);
            }
        } else {
            boolean z13 = this.f2101u;
            if (cVar.f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z13 == z10) {
                b(b10, -1, true);
            } else {
                b(b10, 0, true);
            }
        }
        RecyclerView.p pVar2 = (RecyclerView.p) b10.getLayoutParams();
        Rect itemDecorInsetsForChild = this.f2152b.getItemDecorInsetsForChild(b10);
        int i14 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + 0;
        int i15 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + 0;
        int x10 = RecyclerView.o.x(this.f2163n, this.f2161l, D() + C() + ((ViewGroup.MarginLayoutParams) pVar2).leftMargin + ((ViewGroup.MarginLayoutParams) pVar2).rightMargin + i14, ((ViewGroup.MarginLayoutParams) pVar2).width, d());
        int x11 = RecyclerView.o.x(this.o, this.f2162m, B() + E() + ((ViewGroup.MarginLayoutParams) pVar2).topMargin + ((ViewGroup.MarginLayoutParams) pVar2).bottomMargin + i15, ((ViewGroup.MarginLayoutParams) pVar2).height, e());
        if (w0(b10, x10, x11, pVar2)) {
            b10.measure(x10, x11);
        }
        bVar.f2114a = this.f2098r.c(b10);
        if (this.f2096p == 1) {
            if (V0()) {
                i13 = this.f2163n - D();
                i10 = i13 - this.f2098r.d(b10);
            } else {
                i10 = C();
                i13 = this.f2098r.d(b10) + i10;
            }
            if (cVar.f == -1) {
                i11 = cVar.f2119b;
                i12 = i11 - bVar.f2114a;
            } else {
                i12 = cVar.f2119b;
                i11 = bVar.f2114a + i12;
            }
        } else {
            int E = E();
            int d10 = this.f2098r.d(b10) + E;
            if (cVar.f == -1) {
                int i16 = cVar.f2119b;
                int i17 = i16 - bVar.f2114a;
                i13 = i16;
                i11 = d10;
                i10 = i17;
                i12 = E;
            } else {
                int i18 = cVar.f2119b;
                int i19 = bVar.f2114a + i18;
                i10 = i18;
                i11 = d10;
                i12 = E;
                i13 = i19;
            }
        }
        RecyclerView.o.N(b10, i10, i12, i13, i11);
        if (pVar.c() || pVar.b()) {
            bVar.f2116c = true;
        }
        bVar.f2117d = b10.hasFocusable();
    }

    public final void Y0(RecyclerView.v vVar, c cVar) {
        if (cVar.f2118a && !cVar.f2128l) {
            int i10 = cVar.f2123g;
            int i11 = cVar.f2125i;
            if (cVar.f == -1) {
                int w10 = w();
                if (i10 >= 0) {
                    int f = (this.f2098r.f() - i10) + i11;
                    if (this.f2101u) {
                        for (int i12 = 0; i12 < w10; i12++) {
                            View v3 = v(i12);
                            if (this.f2098r.e(v3) < f || this.f2098r.n(v3) < f) {
                                Z0(vVar, 0, i12);
                                return;
                            }
                        }
                        return;
                    }
                    int i13 = w10 - 1;
                    for (int i14 = i13; i14 >= 0; i14--) {
                        View v10 = v(i14);
                        if (this.f2098r.e(v10) < f || this.f2098r.n(v10) < f) {
                            Z0(vVar, i13, i14);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i10 >= 0) {
                int i15 = i10 - i11;
                int w11 = w();
                if (this.f2101u) {
                    int i16 = w11 - 1;
                    for (int i17 = i16; i17 >= 0; i17--) {
                        View v11 = v(i17);
                        if (this.f2098r.b(v11) > i15 || this.f2098r.m(v11) > i15) {
                            Z0(vVar, i16, i17);
                            return;
                        }
                    }
                    return;
                }
                for (int i18 = 0; i18 < w11; i18++) {
                    View v12 = v(i18);
                    if (this.f2098r.b(v12) > i15 || this.f2098r.m(v12) > i15) {
                        Z0(vVar, 0, i18);
                        return;
                    }
                }
            }
        }
    }

    public final void Z0(RecyclerView.v vVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                View v3 = v(i10);
                l0(i10);
                vVar.g(v3);
                i10--;
            }
            return;
        }
        while (true) {
            i11--;
            if (i11 >= i10) {
                View v10 = v(i11);
                l0(i11);
                vVar.g(v10);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public final PointF a(int i10) {
        if (w() == 0) {
            return null;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < RecyclerView.o.F(v(0))) {
            z10 = true;
        }
        if (z10 != this.f2101u) {
            i11 = -1;
        }
        if (this.f2096p == 0) {
            return new PointF(i11, gl.Code);
        }
        return new PointF(gl.Code, i11);
    }

    public final void a1() {
        if (this.f2096p != 1 && V0()) {
            this.f2101u = !this.f2100t;
        } else {
            this.f2101u = this.f2100t;
        }
    }

    public final int b1(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        int i11;
        if (w() == 0 || i10 == 0) {
            return 0;
        }
        I0();
        this.f2097q.f2118a = true;
        if (i10 > 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        e1(i11, abs, true, zVar);
        c cVar = this.f2097q;
        int J0 = J0(vVar, cVar, zVar, false) + cVar.f2123g;
        if (J0 < 0) {
            return 0;
        }
        if (abs > J0) {
            i10 = i11 * J0;
        }
        this.f2098r.o(-i10);
        this.f2097q.f2126j = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void c(String str) {
        if (this.f2105z == null) {
            super.c(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0234  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c0(androidx.recyclerview.widget.RecyclerView.v r18, androidx.recyclerview.widget.RecyclerView.z r19) {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.c0(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z):void");
    }

    public final void c1(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(a3.l.i("invalid orientation:", i10));
        }
        c(null);
        if (i10 != this.f2096p || this.f2098r == null) {
            s a10 = s.a(this, i10);
            this.f2098r = a10;
            this.A.f2109a = a10;
            this.f2096p = i10;
            n0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean d() {
        if (this.f2096p == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void d0(RecyclerView.z zVar) {
        this.f2105z = null;
        this.f2104x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.d();
    }

    public void d1(boolean z10) {
        c(null);
        if (this.f2102v == z10) {
            return;
        }
        this.f2102v = z10;
        n0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean e() {
        if (this.f2096p == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f2105z = savedState;
            if (this.f2104x != -1) {
                savedState.f2106s = -1;
            }
            n0();
        }
    }

    public final void e1(int i10, int i11, boolean z10, RecyclerView.z zVar) {
        boolean z11;
        int i12;
        int k10;
        c cVar = this.f2097q;
        int i13 = 1;
        boolean z12 = false;
        if (this.f2098r.i() == 0 && this.f2098r.f() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        cVar.f2128l = z11;
        this.f2097q.f = i10;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        C0(zVar, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i10 == 1) {
            z12 = true;
        }
        c cVar2 = this.f2097q;
        if (z12) {
            i12 = max2;
        } else {
            i12 = max;
        }
        cVar2.f2124h = i12;
        if (!z12) {
            max = max2;
        }
        cVar2.f2125i = max;
        if (z12) {
            cVar2.f2124h = this.f2098r.h() + i12;
            View T0 = T0();
            c cVar3 = this.f2097q;
            if (this.f2101u) {
                i13 = -1;
            }
            cVar3.f2122e = i13;
            int F = RecyclerView.o.F(T0);
            c cVar4 = this.f2097q;
            cVar3.f2121d = F + cVar4.f2122e;
            cVar4.f2119b = this.f2098r.b(T0);
            k10 = this.f2098r.b(T0) - this.f2098r.g();
        } else {
            View U0 = U0();
            c cVar5 = this.f2097q;
            cVar5.f2124h = this.f2098r.k() + cVar5.f2124h;
            c cVar6 = this.f2097q;
            if (!this.f2101u) {
                i13 = -1;
            }
            cVar6.f2122e = i13;
            int F2 = RecyclerView.o.F(U0);
            c cVar7 = this.f2097q;
            cVar6.f2121d = F2 + cVar7.f2122e;
            cVar7.f2119b = this.f2098r.e(U0);
            k10 = (-this.f2098r.e(U0)) + this.f2098r.k();
        }
        c cVar8 = this.f2097q;
        cVar8.f2120c = i11;
        if (z10) {
            cVar8.f2120c = i11 - k10;
        }
        cVar8.f2123g = k10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final Parcelable f0() {
        SavedState savedState = this.f2105z;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (w() > 0) {
            I0();
            boolean z10 = this.f2099s ^ this.f2101u;
            savedState2.f2108u = z10;
            if (z10) {
                View T0 = T0();
                savedState2.f2107t = this.f2098r.g() - this.f2098r.b(T0);
                savedState2.f2106s = RecyclerView.o.F(T0);
            } else {
                View U0 = U0();
                savedState2.f2106s = RecyclerView.o.F(U0);
                savedState2.f2107t = this.f2098r.e(U0) - this.f2098r.k();
            }
        } else {
            savedState2.f2106s = -1;
        }
        return savedState2;
    }

    public final void f1(int i10, int i11) {
        int i12;
        this.f2097q.f2120c = this.f2098r.g() - i11;
        c cVar = this.f2097q;
        if (this.f2101u) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        cVar.f2122e = i12;
        cVar.f2121d = i10;
        cVar.f = 1;
        cVar.f2119b = i11;
        cVar.f2123g = Integer.MIN_VALUE;
    }

    public final void g1(int i10, int i11) {
        int i12;
        this.f2097q.f2120c = i11 - this.f2098r.k();
        c cVar = this.f2097q;
        cVar.f2121d = i10;
        if (this.f2101u) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        cVar.f2122e = i12;
        cVar.f = -1;
        cVar.f2119b = i11;
        cVar.f2123g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void h(int i10, int i11, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        int i12;
        if (this.f2096p != 0) {
            i10 = i11;
        }
        if (w() != 0 && i10 != 0) {
            I0();
            if (i10 > 0) {
                i12 = 1;
            } else {
                i12 = -1;
            }
            e1(i12, Math.abs(i10), true, zVar);
            D0(zVar, this.f2097q, cVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r7, androidx.recyclerview.widget.RecyclerView.o.c r8) {
        /*
            r6 = this;
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r6.f2105z
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L13
            int r4 = r0.f2106s
            if (r4 < 0) goto Ld
            r5 = r1
            goto Le
        Ld:
            r5 = r3
        Le:
            if (r5 == 0) goto L13
            boolean r0 = r0.f2108u
            goto L22
        L13:
            r6.a1()
            boolean r0 = r6.f2101u
            int r4 = r6.f2104x
            if (r4 != r2) goto L22
            if (r0 == 0) goto L21
            int r4 = r7 + (-1)
            goto L22
        L21:
            r4 = r3
        L22:
            if (r0 == 0) goto L25
            r1 = r2
        L25:
            r0 = r3
        L26:
            int r2 = r6.C
            if (r0 >= r2) goto L38
            if (r4 < 0) goto L38
            if (r4 >= r7) goto L38
            r2 = r8
            androidx.recyclerview.widget.m$b r2 = (androidx.recyclerview.widget.m.b) r2
            r2.a(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L26
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.i(int, androidx.recyclerview.widget.RecyclerView$o$c):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int j(RecyclerView.z zVar) {
        return E0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int k(RecyclerView.z zVar) {
        return F0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int l(RecyclerView.z zVar) {
        return G0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int m(RecyclerView.z zVar) {
        return E0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int n(RecyclerView.z zVar) {
        return F0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int o(RecyclerView.z zVar) {
        return G0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int o0(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.f2096p == 1) {
            return 0;
        }
        return b1(i10, vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void p0(int i10) {
        this.f2104x = i10;
        this.y = Integer.MIN_VALUE;
        SavedState savedState = this.f2105z;
        if (savedState != null) {
            savedState.f2106s = -1;
        }
        n0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final View q(int i10) {
        int w10 = w();
        if (w10 == 0) {
            return null;
        }
        int F = i10 - RecyclerView.o.F(v(0));
        if (F >= 0 && F < w10) {
            View v3 = v(F);
            if (RecyclerView.o.F(v3) == i10) {
                return v3;
            }
        }
        return super.q(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int q0(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.f2096p == 0) {
            return 0;
        }
        return b1(i10, vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p r() {
        return new RecyclerView.p(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean x0() {
        boolean z10;
        if (this.f2162m == 1073741824 || this.f2161l == 1073741824) {
            return false;
        }
        int w10 = w();
        int i10 = 0;
        while (true) {
            if (i10 < w10) {
                ViewGroup.LayoutParams layoutParams = v(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void z0(RecyclerView recyclerView, int i10) {
        o oVar = new o(recyclerView.getContext());
        oVar.f2188a = i10;
        A0(oVar);
    }

    public LinearLayoutManager(int i10) {
        this.f2096p = 1;
        this.f2100t = false;
        this.f2101u = false;
        this.f2102v = false;
        this.f2103w = true;
        this.f2104x = -1;
        this.y = Integer.MIN_VALUE;
        this.f2105z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        c1(i10);
        c(null);
        if (this.f2100t) {
            this.f2100t = false;
            n0();
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2096p = 1;
        this.f2100t = false;
        this.f2101u = false;
        this.f2102v = false;
        this.f2103w = true;
        this.f2104x = -1;
        this.y = Integer.MIN_VALUE;
        this.f2105z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        RecyclerView.o.d G = RecyclerView.o.G(context, attributeSet, i10, i11);
        c1(G.f2166a);
        boolean z10 = G.f2168c;
        c(null);
        if (z10 != this.f2100t) {
            this.f2100t = z10;
            n0();
        }
        d1(G.f2169d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void R(RecyclerView recyclerView) {
    }

    public void X0(RecyclerView.v vVar, RecyclerView.z zVar, a aVar, int i10) {
    }
}
