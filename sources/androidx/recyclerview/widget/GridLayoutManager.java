package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.huawei.hms.ads.gl;
import java.util.Arrays;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import o0.g;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public c K;
    public final Rect L;

    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int b(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i10) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final SparseIntArray f2094a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        public final SparseIntArray f2095b = new SparseIntArray();

        public final int a(int i10, int i11) {
            int c10 = c(i10);
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int c11 = c(i14);
                i12 += c11;
                if (i12 == i11) {
                    i13++;
                    i12 = 0;
                } else if (i12 > i11) {
                    i13++;
                    i12 = c11;
                }
            }
            if (i12 + c10 > i11) {
                return i13 + 1;
            }
            return i13;
        }

        public int b(int i10, int i11) {
            int c10 = c(i10);
            if (c10 == i11) {
                return 0;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int c11 = c(i13);
                i12 += c11;
                if (i12 == i11) {
                    i12 = 0;
                } else if (i12 > i11) {
                    i12 = c11;
                }
            }
            if (c10 + i12 > i11) {
                return 0;
            }
            return i12;
        }

        public abstract int c(int i10);

        public final void d() {
            this.f2094a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        n1(RecyclerView.o.G(context, attributeSet, i10, i11).f2167b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final boolean B0() {
        if (this.f2105z == null && !this.E) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(RecyclerView.z zVar, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        boolean z10;
        int i10 = this.F;
        for (int i11 = 0; i11 < this.F; i11++) {
            int i12 = cVar.f2121d;
            if (i12 >= 0 && i12 < zVar.b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && i10 > 0) {
                int i13 = cVar.f2121d;
                ((m.b) cVar2).a(i13, Math.max(0, cVar.f2123g));
                i10 -= this.K.c(i13);
                cVar.f2121d += cVar.f2122e;
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int I(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.f2096p == 0) {
            return this.F;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return j1(zVar.b() - 1, vVar, zVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View Q0(RecyclerView.v vVar, RecyclerView.z zVar, boolean z10, boolean z11) {
        int i10;
        int i11;
        int w10 = w();
        int i12 = 1;
        if (z11) {
            i11 = w() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = w10;
            i11 = 0;
        }
        int b10 = zVar.b();
        I0();
        int k10 = this.f2098r.k();
        int g6 = this.f2098r.g();
        View view = null;
        View view2 = null;
        while (i11 != i10) {
            View v3 = v(i11);
            int F = RecyclerView.o.F(v3);
            if (F >= 0 && F < b10 && k1(F, vVar, zVar) == 0) {
                if (((RecyclerView.p) v3.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = v3;
                    }
                } else {
                    if (this.f2098r.e(v3) < g6 && this.f2098r.b(v3) >= k10) {
                        return v3;
                    }
                    if (view == null) {
                        view = v3;
                    }
                }
            }
            i11 += i12;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e1, code lost:
    
        if (r13 == r5) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0111, code lost:
    
        if (r13 == r5) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x001e, code lost:
    
        if (r22.f2151a.j(r3) != false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View S(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.v r25, androidx.recyclerview.widget.RecyclerView.z r26) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.S(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void W(RecyclerView.v vVar, RecyclerView.z zVar, View view, o0.g gVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            V(view, gVar);
            return;
        }
        b bVar = (b) layoutParams;
        int j12 = j1(bVar.a(), vVar, zVar);
        if (this.f2096p == 0) {
            gVar.g(g.c.a(bVar.f2093e, bVar.f, j12, 1, false));
        } else {
            gVar.g(g.c.a(j12, 1, bVar.f2093e, bVar.f, false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [int, boolean] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void W0(RecyclerView.v vVar, RecyclerView.z zVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int x10;
        int i20;
        ?? r12;
        boolean z12;
        View b10;
        int j10 = this.f2098r.j();
        int i21 = 1;
        if (j10 != 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (w() > 0) {
            i10 = this.G[this.F];
        } else {
            i10 = 0;
        }
        if (z10) {
            o1();
        }
        if (cVar.f2122e == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i22 = this.F;
        if (!z11) {
            i22 = k1(cVar.f2121d, vVar, zVar) + l1(cVar.f2121d, vVar, zVar);
        }
        int i23 = 0;
        while (i23 < this.F) {
            int i24 = cVar.f2121d;
            if (i24 >= 0 && i24 < zVar.b()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12 || i22 <= 0) {
                break;
            }
            int i25 = cVar.f2121d;
            int l12 = l1(i25, vVar, zVar);
            if (l12 <= this.F) {
                i22 -= l12;
                if (i22 < 0 || (b10 = cVar.b(vVar)) == null) {
                    break;
                }
                this.H[i23] = b10;
                i23++;
            } else {
                throw new IllegalArgumentException(com.ironsource.adapters.facebook.a.i(a3.l.r("Item at position ", i25, " requires ", l12, " spans but GridLayoutManager has only "), this.F, " spans."));
            }
        }
        if (i23 == 0) {
            bVar.f2115b = true;
            return;
        }
        if (z11) {
            i11 = 0;
            i12 = i23;
        } else {
            i11 = i23 - 1;
            i21 = -1;
            i12 = -1;
        }
        int i26 = 0;
        while (i11 != i12) {
            View view = this.H[i11];
            b bVar2 = (b) view.getLayoutParams();
            int l13 = l1(RecyclerView.o.F(view), vVar, zVar);
            bVar2.f = l13;
            bVar2.f2093e = i26;
            i26 += l13;
            i11 += i21;
        }
        float f = gl.Code;
        int i27 = 0;
        for (int i28 = 0; i28 < i23; i28++) {
            View view2 = this.H[i28];
            if (cVar.f2127k == null) {
                if (z11) {
                    r12 = 0;
                    b(view2, -1, false);
                } else {
                    r12 = 0;
                    b(view2, 0, false);
                }
            } else {
                r12 = 0;
                r12 = 0;
                if (z11) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            }
            RecyclerView recyclerView = this.f2152b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view2));
            }
            m1(view2, j10, r12);
            int c10 = this.f2098r.c(view2);
            if (c10 > i27) {
                i27 = c10;
            }
            float d10 = (this.f2098r.d(view2) * 1.0f) / ((b) view2.getLayoutParams()).f;
            if (d10 > f) {
                f = d10;
            }
        }
        if (z10) {
            h1(Math.max(Math.round(f * this.F), i10));
            i27 = 0;
            for (int i29 = 0; i29 < i23; i29++) {
                View view3 = this.H[i29];
                m1(view3, 1073741824, true);
                int c11 = this.f2098r.c(view3);
                if (c11 > i27) {
                    i27 = c11;
                }
            }
        }
        for (int i30 = 0; i30 < i23; i30++) {
            View view4 = this.H[i30];
            if (this.f2098r.c(view4) != i27) {
                b bVar3 = (b) view4.getLayoutParams();
                Rect rect2 = bVar3.f2171b;
                int i31 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) bVar3).topMargin + ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
                int i32 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                int i110 = i1(bVar3.f2093e, bVar3.f);
                if (this.f2096p == 1) {
                    i20 = RecyclerView.o.x(i110, 1073741824, i32, ((ViewGroup.MarginLayoutParams) bVar3).width, false);
                    x10 = View.MeasureSpec.makeMeasureSpec(i27 - i31, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i27 - i32, 1073741824);
                    x10 = RecyclerView.o.x(i110, 1073741824, i31, ((ViewGroup.MarginLayoutParams) bVar3).height, false);
                    i20 = makeMeasureSpec;
                }
                if (y0(view4, i20, x10, (RecyclerView.p) view4.getLayoutParams())) {
                    view4.measure(i20, x10);
                }
            }
        }
        bVar.f2114a = i27;
        if (this.f2096p == 1) {
            if (cVar.f == -1) {
                i19 = cVar.f2119b;
                i18 = i19 - i27;
            } else {
                i18 = cVar.f2119b;
                i19 = i27 + i18;
            }
            i16 = 0;
            i15 = i18;
            i17 = i19;
            i14 = 0;
        } else {
            if (cVar.f == -1) {
                i14 = cVar.f2119b;
                i13 = i14 - i27;
            } else {
                i13 = cVar.f2119b;
                i14 = i27 + i13;
            }
            i15 = 0;
            i16 = i13;
            i17 = 0;
        }
        for (int i33 = 0; i33 < i23; i33++) {
            View view5 = this.H[i33];
            b bVar4 = (b) view5.getLayoutParams();
            if (this.f2096p == 1) {
                if (V0()) {
                    i14 = C() + this.G[this.F - bVar4.f2093e];
                    i16 = i14 - this.f2098r.d(view5);
                } else {
                    i16 = this.G[bVar4.f2093e] + C();
                    i14 = this.f2098r.d(view5) + i16;
                }
            } else {
                int E = E() + this.G[bVar4.f2093e];
                i15 = E;
                i17 = this.f2098r.d(view5) + E;
            }
            RecyclerView.o.N(view5, i16, i15, i14, i17);
            if (bVar4.c() || bVar4.b()) {
                bVar.f2116c = true;
            }
            bVar.f2117d = view5.hasFocusable() | bVar.f2117d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void X(int i10, int i11) {
        this.K.d();
        this.K.f2095b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void X0(RecyclerView.v vVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i10) {
        boolean z10;
        o1();
        if (zVar.b() > 0 && !zVar.f2206g) {
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int k12 = k1(aVar.f2110b, vVar, zVar);
            if (z10) {
                while (k12 > 0) {
                    int i11 = aVar.f2110b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    aVar.f2110b = i12;
                    k12 = k1(i12, vVar, zVar);
                }
            } else {
                int b10 = zVar.b() - 1;
                int i13 = aVar.f2110b;
                while (i13 < b10) {
                    int i14 = i13 + 1;
                    int k13 = k1(i14, vVar, zVar);
                    if (k13 <= k12) {
                        break;
                    }
                    i13 = i14;
                    k12 = k13;
                }
                aVar.f2110b = i13;
            }
        }
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void Y() {
        this.K.d();
        this.K.f2095b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void Z(int i10, int i11) {
        this.K.d();
        this.K.f2095b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void a0(int i10, int i11) {
        this.K.d();
        this.K.f2095b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void b0(int i10, int i11) {
        this.K.d();
        this.K.f2095b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void c0(RecyclerView.v vVar, RecyclerView.z zVar) {
        boolean z10 = zVar.f2206g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z10) {
            int w10 = w();
            for (int i10 = 0; i10 < w10; i10++) {
                b bVar = (b) v(i10).getLayoutParams();
                int a10 = bVar.a();
                sparseIntArray2.put(a10, bVar.f);
                sparseIntArray.put(a10, bVar.f2093e);
            }
        }
        super.c0(vVar, zVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void d0(RecyclerView.z zVar) {
        super.d0(zVar);
        this.E = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d1(boolean z10) {
        if (!z10) {
            super.d1(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean f(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    public final void h1(int i10) {
        int i11;
        int[] iArr = this.G;
        int i12 = this.F;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 > 0 && i12 - i13 < i15) {
                i11 = i14 + 1;
                i13 -= i12;
            } else {
                i11 = i14;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.G = iArr;
    }

    public final int i1(int i10, int i11) {
        if (this.f2096p == 1 && V0()) {
            int[] iArr = this.G;
            int i12 = this.F;
            return iArr[i12 - i10] - iArr[(i12 - i10) - i11];
        }
        int[] iArr2 = this.G;
        return iArr2[i11 + i10] - iArr2[i10];
    }

    public final int j1(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (!zVar.f2206g) {
            return this.K.a(i10, this.F);
        }
        int b10 = vVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
            return 0;
        }
        return this.K.a(b10, this.F);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int k(RecyclerView.z zVar) {
        return F0(zVar);
    }

    public final int k1(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (!zVar.f2206g) {
            return this.K.b(i10, this.F);
        }
        int i11 = this.J.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = vVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 0;
        }
        return this.K.b(b10, this.F);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int l(RecyclerView.z zVar) {
        return G0(zVar);
    }

    public final int l1(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (!zVar.f2206g) {
            return this.K.c(i10);
        }
        int i11 = this.I.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = vVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 1;
        }
        return this.K.c(b10);
    }

    public final void m1(View view, int i10, boolean z10) {
        int i11;
        int i12;
        boolean w02;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f2171b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int i15 = i1(bVar.f2093e, bVar.f);
        if (this.f2096p == 1) {
            i12 = RecyclerView.o.x(i15, i10, i14, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i11 = RecyclerView.o.x(this.f2098r.l(), this.f2162m, i13, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int x10 = RecyclerView.o.x(i15, i10, i13, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int x11 = RecyclerView.o.x(this.f2098r.l(), this.f2161l, i14, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i11 = x10;
            i12 = x11;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z10) {
            w02 = y0(view, i12, i11, pVar);
        } else {
            w02 = w0(view, i12, i11, pVar);
        }
        if (w02) {
            view.measure(i12, i11);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int n(RecyclerView.z zVar) {
        return F0(zVar);
    }

    public final void n1(int i10) {
        if (i10 == this.F) {
            return;
        }
        this.E = true;
        if (i10 >= 1) {
            this.F = i10;
            this.K.d();
            n0();
            return;
        }
        throw new IllegalArgumentException(a3.l.i("Span count should be at least 1. Provided ", i10));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int o(RecyclerView.z zVar) {
        return G0(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int o0(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        o1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.o0(i10, vVar, zVar);
    }

    public final void o1() {
        int B;
        int E;
        if (this.f2096p == 1) {
            B = this.f2163n - D();
            E = C();
        } else {
            B = this.o - B();
            E = E();
        }
        h1(B - E);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int q0(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        o1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.q0(i10, vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p r() {
        if (this.f2096p == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p s(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void t0(Rect rect, int i10, int i11) {
        int g6;
        int g10;
        if (this.G == null) {
            super.t0(rect, i10, i11);
        }
        int D = D() + C();
        int B = B() + E();
        if (this.f2096p == 1) {
            int height = rect.height() + B;
            RecyclerView recyclerView = this.f2152b;
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            g10 = RecyclerView.o.g(i11, height, c0.d.d(recyclerView));
            int[] iArr = this.G;
            g6 = RecyclerView.o.g(i10, iArr[iArr.length - 1] + D, c0.d.e(this.f2152b));
        } else {
            int width = rect.width() + D;
            RecyclerView recyclerView2 = this.f2152b;
            WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
            g6 = RecyclerView.o.g(i10, width, c0.d.e(recyclerView2));
            int[] iArr2 = this.G;
            g10 = RecyclerView.o.g(i11, iArr2[iArr2.length - 1] + B, c0.d.d(this.f2152b));
        }
        this.f2152b.setMeasuredDimension(g6, g10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int y(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.f2096p == 1) {
            return this.F;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return j1(zVar.b() - 1, vVar, zVar) + 1;
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.p {

        /* renamed from: e, reason: collision with root package name */
        public int f2093e;
        public int f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2093e = -1;
            this.f = 0;
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f2093e = -1;
            this.f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2093e = -1;
            this.f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2093e = -1;
            this.f = 0;
        }
    }

    public GridLayoutManager(int i10) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        n1(i10);
    }

    public GridLayoutManager() {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        n1(3);
    }
}
