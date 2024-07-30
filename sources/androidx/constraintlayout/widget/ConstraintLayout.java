package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import s.f;
import u.c;
import u.d;
import u.e;
import u.g;
import u.k;
import v.b;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static androidx.constraintlayout.widget.b H;
    public int A;
    public androidx.constraintlayout.widget.a B;
    public x.b C;
    public int D;
    public HashMap<String, Integer> E;
    public final SparseArray<d> F;
    public final b G;

    /* renamed from: s, reason: collision with root package name */
    public final SparseArray<View> f1363s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList<ConstraintHelper> f1364t;

    /* renamed from: u, reason: collision with root package name */
    public final e f1365u;

    /* renamed from: v, reason: collision with root package name */
    public int f1366v;

    /* renamed from: w, reason: collision with root package name */
    public int f1367w;

    /* renamed from: x, reason: collision with root package name */
    public int f1368x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1369z;

    /* loaded from: classes.dex */
    public class b implements b.InterfaceC0495b {

        /* renamed from: a, reason: collision with root package name */
        public final ConstraintLayout f1411a;

        /* renamed from: b, reason: collision with root package name */
        public int f1412b;

        /* renamed from: c, reason: collision with root package name */
        public int f1413c;

        /* renamed from: d, reason: collision with root package name */
        public int f1414d;

        /* renamed from: e, reason: collision with root package name */
        public int f1415e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f1416g;

        public b(ConstraintLayout constraintLayout) {
            this.f1411a = constraintLayout;
        }

        public static boolean a(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                if ((mode == Integer.MIN_VALUE || mode == 0) && i12 == size) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @SuppressLint({"WrongCall"})
        public final void b(d dVar, b.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            boolean z16;
            int baseline;
            int i15;
            boolean z17;
            boolean z18;
            boolean z19;
            boolean z20;
            boolean z21;
            boolean z22;
            boolean z23;
            int i16;
            boolean z24;
            boolean z25;
            boolean z26;
            int i17;
            if (dVar == null) {
                return;
            }
            if (dVar.f35647j0 == 8 && !dVar.G) {
                aVar.f35858e = 0;
                aVar.f = 0;
                aVar.f35859g = 0;
                return;
            }
            if (dVar.W == null) {
                return;
            }
            int i18 = aVar.f35854a;
            int i19 = aVar.f35855b;
            int i20 = aVar.f35856c;
            int i21 = aVar.f35857d;
            int i22 = this.f1412b + this.f1413c;
            int i23 = this.f1414d;
            View view = (View) dVar.f35645i0;
            int c10 = f.c(i18);
            c cVar = dVar.M;
            c cVar2 = dVar.K;
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 != 3) {
                            makeMeasureSpec = 0;
                        } else {
                            int i24 = this.f;
                            if (cVar2 != null) {
                                i17 = cVar2.f35619g + 0;
                            } else {
                                i17 = 0;
                            }
                            if (cVar != null) {
                                i17 += cVar.f35619g;
                            }
                            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i24, i23 + i17, -1);
                        }
                    } else {
                        makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i23, -2);
                        if (dVar.f35663s == 1) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        int i25 = aVar.f35862j;
                        if (i25 == 1 || i25 == 2) {
                            if (view.getMeasuredHeight() == dVar.l()) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            if (aVar.f35862j != 2 && z24 && ((!z24 || !z25) && !(view instanceof Placeholder) && !dVar.B())) {
                                z26 = false;
                            } else {
                                z26 = true;
                            }
                            if (z26) {
                                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.r(), 1073741824);
                            }
                        }
                    }
                } else {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i23, -2);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i20, 1073741824);
            }
            int c11 = f.c(i19);
            if (c11 != 0) {
                if (c11 != 1) {
                    if (c11 != 2) {
                        if (c11 != 3) {
                            makeMeasureSpec2 = 0;
                        } else {
                            int i26 = this.f1416g;
                            if (cVar2 != null) {
                                i16 = dVar.L.f35619g + 0;
                            } else {
                                i16 = 0;
                            }
                            if (cVar != null) {
                                i16 += dVar.N.f35619g;
                            }
                            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i26, i22 + i16, -1);
                        }
                    } else {
                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1416g, i22, -2);
                        if (dVar.f35664t == 1) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        int i27 = aVar.f35862j;
                        if (i27 == 1 || i27 == 2) {
                            if (view.getMeasuredWidth() == dVar.r()) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            if (aVar.f35862j != 2 && z21 && ((!z21 || !z22) && !(view instanceof Placeholder) && !dVar.C())) {
                                z23 = false;
                            } else {
                                z23 = true;
                            }
                            if (z23) {
                                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.l(), 1073741824);
                            }
                        }
                    }
                } else {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1416g, i22, -2);
                }
            } else {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
            }
            e eVar = (e) dVar.W;
            ConstraintLayout constraintLayout = ConstraintLayout.this;
            if (eVar != null && q.e.g(constraintLayout.A, 256) && view.getMeasuredWidth() == dVar.r() && view.getMeasuredWidth() < eVar.r() && view.getMeasuredHeight() == dVar.l() && view.getMeasuredHeight() < eVar.l() && view.getBaseline() == dVar.f35636d0 && !dVar.A()) {
                if (a(dVar.I, makeMeasureSpec, dVar.r()) && a(dVar.J, makeMeasureSpec2, dVar.l())) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                if (z20) {
                    aVar.f35858e = dVar.r();
                    aVar.f = dVar.l();
                    aVar.f35859g = dVar.f35636d0;
                    return;
                }
            }
            if (i18 == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i19 == 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i19 != 4 && i19 != 1) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (i18 != 4 && i18 != 1) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (z10 && dVar.Z > gl.Code) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z11 && dVar.Z > gl.Code) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (view == null) {
                return;
            }
            a aVar2 = (a) view.getLayoutParams();
            int i28 = aVar.f35862j;
            if (i28 != 1 && i28 != 2 && z10 && dVar.f35663s == 0 && z11 && dVar.f35664t == 0) {
                z16 = false;
                i15 = -1;
                baseline = 0;
                i10 = 0;
                i12 = 0;
            } else {
                if ((view instanceof VirtualLayout) && (dVar instanceof k)) {
                    ((VirtualLayout) view).p((k) dVar, makeMeasureSpec, makeMeasureSpec2);
                } else {
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                }
                dVar.I = makeMeasureSpec;
                dVar.J = makeMeasureSpec2;
                dVar.f35640g = false;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int baseline2 = view.getBaseline();
                int i29 = dVar.f35666v;
                if (i29 > 0) {
                    i10 = Math.max(i29, measuredWidth);
                } else {
                    i10 = measuredWidth;
                }
                int i30 = dVar.f35667w;
                if (i30 > 0) {
                    i10 = Math.min(i30, i10);
                }
                int i31 = dVar.y;
                if (i31 > 0) {
                    i12 = Math.max(i31, measuredHeight);
                    i11 = makeMeasureSpec2;
                } else {
                    i11 = makeMeasureSpec2;
                    i12 = measuredHeight;
                }
                int i32 = dVar.f35669z;
                if (i32 > 0) {
                    i12 = Math.min(i32, i12);
                }
                if (!q.e.g(constraintLayout.A, 1)) {
                    if (z14 && z12) {
                        i10 = (int) ((i12 * dVar.Z) + 0.5f);
                    } else if (z15 && z13) {
                        i12 = (int) ((i10 / dVar.Z) + 0.5f);
                    }
                }
                if (measuredWidth == i10 && measuredHeight == i12) {
                    baseline = baseline2;
                    z16 = false;
                } else {
                    if (measuredWidth != i10) {
                        i13 = 1073741824;
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                    } else {
                        i13 = 1073741824;
                    }
                    if (measuredHeight != i12) {
                        i14 = View.MeasureSpec.makeMeasureSpec(i12, i13);
                    } else {
                        i14 = i11;
                    }
                    view.measure(makeMeasureSpec, i14);
                    dVar.I = makeMeasureSpec;
                    dVar.J = i14;
                    z16 = false;
                    dVar.f35640g = false;
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    i12 = measuredHeight2;
                    i10 = measuredWidth2;
                }
                i15 = -1;
            }
            if (baseline != i15) {
                z17 = true;
            } else {
                z17 = z16;
            }
            if (i10 == aVar.f35856c && i12 == aVar.f35857d) {
                z18 = z16;
            } else {
                z18 = true;
            }
            aVar.f35861i = z18;
            if (aVar2.f1375c0) {
                z19 = true;
            } else {
                z19 = z17;
            }
            if (z19 && baseline != -1 && dVar.f35636d0 != baseline) {
                aVar.f35861i = true;
            }
            aVar.f35858e = i10;
            aVar.f = i12;
            aVar.f35860h = z19;
            aVar.f35859g = baseline;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1363s = new SparseArray<>();
        this.f1364t = new ArrayList<>(4);
        this.f1365u = new e();
        this.f1366v = 0;
        this.f1367w = 0;
        this.f1368x = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.f1369z = true;
        this.A = 257;
        this.B = null;
        this.C = null;
        this.D = -1;
        this.E = new HashMap<>();
        this.F = new SparseArray<>();
        this.G = new b(this);
        d(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public static androidx.constraintlayout.widget.b getSharedValues() {
        if (H == null) {
            H = new androidx.constraintlayout.widget.b();
        }
        return H;
    }

    public final View b(int i10) {
        return this.f1363s.get(i10);
    }

    public final d c(View view) {
        if (view == this) {
            return this.f1365u;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof a) {
                return ((a) view.getLayoutParams()).f1401q0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof a) {
                return ((a) view.getLayoutParams()).f1401q0;
            }
            return null;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d(AttributeSet attributeSet, int i10) {
        e eVar = this.f1365u;
        eVar.f35645i0 = this;
        b bVar = this.G;
        eVar.f35673w0 = bVar;
        eVar.f35671u0.f = bVar;
        this.f1363s.put(getId(), this);
        this.B = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.e.f34521z, i10, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == 16) {
                    this.f1366v = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1366v);
                } else if (index == 17) {
                    this.f1367w = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1367w);
                } else if (index == 14) {
                    this.f1368x = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1368x);
                } else if (index == 15) {
                    this.y = obtainStyledAttributes.getDimensionPixelOffset(index, this.y);
                } else if (index == 113) {
                    this.A = obtainStyledAttributes.getInt(index, this.A);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            f(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.C = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
                        this.B = aVar;
                        aVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.B = null;
                    }
                    this.D = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        eVar.F0 = this.A;
        s.c.f35008p = eVar.W(512);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.f1364t;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.get(i10).n(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((parseInt / 1080.0f) * width);
                        int i13 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i12;
                        float f10 = i13;
                        float f11 = i12 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f10, f11, f10, paint);
                        float parseInt4 = i13 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f11, f10, f11, parseInt4, paint);
                        canvas.drawLine(f11, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f10, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f10, f11, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f11, f10, paint);
                    }
                }
            }
        }
    }

    public final boolean e() {
        boolean z10;
        if ((getContext().getApplicationInfo().flags & 4194304) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    public void f(int i10) {
        this.C = new x.b(getContext(), this, i10);
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f1369z = true;
        super.forceLayout();
    }

    public final void g(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.E == null) {
                this.E = new HashMap<>();
            }
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.E.put(str, Integer.valueOf(num.intValue()));
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.y;
    }

    public int getMaxWidth() {
        return this.f1368x;
    }

    public int getMinHeight() {
        return this.f1367w;
    }

    public int getMinWidth() {
        return this.f1366v;
    }

    public int getOptimizationLevel() {
        return this.f1365u.F0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        e eVar = this.f1365u;
        if (eVar.f35648k == null) {
            int id3 = getId();
            if (id3 != -1) {
                eVar.f35648k = getContext().getResources().getResourceEntryName(id3);
            } else {
                eVar.f35648k = "parent";
            }
        }
        if (eVar.f35649k0 == null) {
            eVar.f35649k0 = eVar.f35648k;
            Log.v("ConstraintLayout", " setDebugName " + eVar.f35649k0);
        }
        Iterator<d> it = eVar.f35709s0.iterator();
        while (it.hasNext()) {
            d next = it.next();
            View view = (View) next.f35645i0;
            if (view != null) {
                if (next.f35648k == null && (id2 = view.getId()) != -1) {
                    next.f35648k = getContext().getResources().getResourceEntryName(id2);
                }
                if (next.f35649k0 == null) {
                    next.f35649k0 = next.f35648k;
                    Log.v("ConstraintLayout", " setDebugName " + next.f35649k0);
                }
            }
        }
        eVar.o(sb2);
        return sb2.toString();
    }

    public final void h(d dVar, a aVar, SparseArray<d> sparseArray, int i10, c.a aVar2) {
        View view = this.f1363s.get(i10);
        d dVar2 = sparseArray.get(i10);
        if (dVar2 != null && view != null && (view.getLayoutParams() instanceof a)) {
            aVar.f1375c0 = true;
            c.a aVar3 = c.a.BASELINE;
            if (aVar2 == aVar3) {
                a aVar4 = (a) view.getLayoutParams();
                aVar4.f1375c0 = true;
                aVar4.f1401q0.F = true;
            }
            dVar.j(aVar3).b(dVar2.j(aVar2), aVar.D, aVar.C, true);
            dVar.F = true;
            dVar.j(c.a.TOP).j();
            dVar.j(c.a.BOTTOM).j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:265:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x02f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i() {
        /*
            Method dump skipped, instructions count: 1392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.i():boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            a aVar = (a) childAt.getLayoutParams();
            d dVar = aVar.f1401q0;
            if ((childAt.getVisibility() != 8 || aVar.f1377d0 || aVar.f1379e0 || isInEditMode) && !aVar.f1380f0) {
                int s10 = dVar.s();
                int t10 = dVar.t();
                int r10 = dVar.r() + s10;
                int l10 = dVar.l() + t10;
                childAt.layout(s10, t10, r10, l10);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(s10, t10, r10, l10);
                }
            }
        }
        ArrayList<ConstraintHelper> arrayList = this.f1364t;
        int size = arrayList.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                arrayList.get(i15).m();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        d c10 = c(view);
        if ((view instanceof Guideline) && !(c10 instanceof g)) {
            a aVar = (a) view.getLayoutParams();
            g gVar = new g();
            aVar.f1401q0 = gVar;
            aVar.f1377d0 = true;
            gVar.S(aVar.V);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.o();
            ((a) view.getLayoutParams()).f1379e0 = true;
            ArrayList<ConstraintHelper> arrayList = this.f1364t;
            if (!arrayList.contains(constraintHelper)) {
                arrayList.add(constraintHelper);
            }
        }
        this.f1363s.put(view.getId(), view);
        this.f1369z = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1363s.remove(view.getId());
        d c10 = c(view);
        this.f1365u.f35709s0.remove(c10);
        c10.D();
        this.f1364t.remove(view);
        this.f1369z = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f1369z = true;
        super.requestLayout();
    }

    public void setConstraintSet(androidx.constraintlayout.widget.a aVar) {
        this.B = aVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        int id2 = getId();
        SparseArray<View> sparseArray = this.f1363s;
        sparseArray.remove(id2);
        super.setId(i10);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.y) {
            return;
        }
        this.y = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f1368x) {
            return;
        }
        this.f1368x = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f1367w) {
            return;
        }
        this.f1367w = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f1366v) {
            return;
        }
        this.f1366v = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(x.c cVar) {
        x.b bVar = this.C;
        if (bVar != null) {
            bVar.getClass();
        }
    }

    public void setOptimizationLevel(int i10) {
        this.A = i10;
        e eVar = this.f1365u;
        eVar.F0 = i10;
        s.c.f35008p = eVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1363s = new SparseArray<>();
        this.f1364t = new ArrayList<>(4);
        this.f1365u = new e();
        this.f1366v = 0;
        this.f1367w = 0;
        this.f1368x = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.f1369z = true;
        this.A = 257;
        this.B = null;
        this.C = null;
        this.D = -1;
        this.E = new HashMap<>();
        this.F = new SparseArray<>();
        this.G = new b(this);
        d(attributeSet, i10);
    }

    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public final int C;
        public final int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;

        /* renamed from: a, reason: collision with root package name */
        public int f1370a;

        /* renamed from: a0, reason: collision with root package name */
        public boolean f1371a0;

        /* renamed from: b, reason: collision with root package name */
        public int f1372b;

        /* renamed from: b0, reason: collision with root package name */
        public boolean f1373b0;

        /* renamed from: c, reason: collision with root package name */
        public float f1374c;

        /* renamed from: c0, reason: collision with root package name */
        public boolean f1375c0;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f1376d;

        /* renamed from: d0, reason: collision with root package name */
        public boolean f1377d0;

        /* renamed from: e, reason: collision with root package name */
        public int f1378e;

        /* renamed from: e0, reason: collision with root package name */
        public boolean f1379e0;
        public int f;

        /* renamed from: f0, reason: collision with root package name */
        public boolean f1380f0;

        /* renamed from: g, reason: collision with root package name */
        public int f1381g;

        /* renamed from: g0, reason: collision with root package name */
        public int f1382g0;

        /* renamed from: h, reason: collision with root package name */
        public int f1383h;

        /* renamed from: h0, reason: collision with root package name */
        public int f1384h0;

        /* renamed from: i, reason: collision with root package name */
        public int f1385i;

        /* renamed from: i0, reason: collision with root package name */
        public int f1386i0;

        /* renamed from: j, reason: collision with root package name */
        public int f1387j;

        /* renamed from: j0, reason: collision with root package name */
        public int f1388j0;

        /* renamed from: k, reason: collision with root package name */
        public int f1389k;

        /* renamed from: k0, reason: collision with root package name */
        public int f1390k0;

        /* renamed from: l, reason: collision with root package name */
        public int f1391l;

        /* renamed from: l0, reason: collision with root package name */
        public int f1392l0;

        /* renamed from: m, reason: collision with root package name */
        public int f1393m;

        /* renamed from: m0, reason: collision with root package name */
        public float f1394m0;

        /* renamed from: n, reason: collision with root package name */
        public int f1395n;

        /* renamed from: n0, reason: collision with root package name */
        public int f1396n0;
        public int o;

        /* renamed from: o0, reason: collision with root package name */
        public int f1397o0;

        /* renamed from: p, reason: collision with root package name */
        public int f1398p;

        /* renamed from: p0, reason: collision with root package name */
        public float f1399p0;

        /* renamed from: q, reason: collision with root package name */
        public int f1400q;

        /* renamed from: q0, reason: collision with root package name */
        public d f1401q0;

        /* renamed from: r, reason: collision with root package name */
        public float f1402r;

        /* renamed from: s, reason: collision with root package name */
        public int f1403s;

        /* renamed from: t, reason: collision with root package name */
        public int f1404t;

        /* renamed from: u, reason: collision with root package name */
        public int f1405u;

        /* renamed from: v, reason: collision with root package name */
        public int f1406v;

        /* renamed from: w, reason: collision with root package name */
        public final int f1407w;

        /* renamed from: x, reason: collision with root package name */
        public int f1408x;
        public final int y;

        /* renamed from: z, reason: collision with root package name */
        public int f1409z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0013a {

            /* renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f1410a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1410a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1370a = -1;
            this.f1372b = -1;
            this.f1374c = -1.0f;
            this.f1376d = true;
            this.f1378e = -1;
            this.f = -1;
            this.f1381g = -1;
            this.f1383h = -1;
            this.f1385i = -1;
            this.f1387j = -1;
            this.f1389k = -1;
            this.f1391l = -1;
            this.f1393m = -1;
            this.f1395n = -1;
            this.o = -1;
            this.f1398p = -1;
            this.f1400q = 0;
            this.f1402r = gl.Code;
            this.f1403s = -1;
            this.f1404t = -1;
            this.f1405u = -1;
            this.f1406v = -1;
            this.f1407w = Integer.MIN_VALUE;
            this.f1408x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.f1409z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f1371a0 = true;
            this.f1373b0 = true;
            this.f1375c0 = false;
            this.f1377d0 = false;
            this.f1379e0 = false;
            this.f1380f0 = false;
            this.f1382g0 = -1;
            this.f1384h0 = -1;
            this.f1386i0 = -1;
            this.f1388j0 = -1;
            this.f1390k0 = Integer.MIN_VALUE;
            this.f1392l0 = Integer.MIN_VALUE;
            this.f1394m0 = 0.5f;
            this.f1401q0 = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.e.f34521z);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = C0013a.f1410a.get(index);
                switch (i11) {
                    case 1:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1398p);
                        this.f1398p = resourceId;
                        if (resourceId == -1) {
                            this.f1398p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f1400q = obtainStyledAttributes.getDimensionPixelSize(index, this.f1400q);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f1402r) % 360.0f;
                        this.f1402r = f;
                        if (f < gl.Code) {
                            this.f1402r = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f1370a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1370a);
                        break;
                    case 6:
                        this.f1372b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1372b);
                        break;
                    case 7:
                        this.f1374c = obtainStyledAttributes.getFloat(index, this.f1374c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1378e);
                        this.f1378e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1378e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1381g);
                        this.f1381g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1381g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1383h);
                        this.f1383h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1383h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1385i);
                        this.f1385i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1385i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1387j);
                        this.f1387j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1387j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1389k);
                        this.f1389k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1389k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1391l);
                        this.f1391l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1391l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1393m);
                        this.f1393m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1393m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1403s);
                        this.f1403s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1403s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1404t);
                        this.f1404t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1404t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1405u);
                        this.f1405u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1405u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1406v);
                        this.f1406v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1406v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f1407w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1407w);
                        break;
                    case 22:
                        this.f1408x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1408x);
                        break;
                    case 23:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 24:
                        this.f1409z = obtainStyledAttributes.getDimensionPixelSize(index, this.f1409z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = obtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = obtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 30:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 31:
                        int i12 = obtainStyledAttributes.getInt(index, 0);
                        this.L = i12;
                        if (i12 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.M = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.R = Math.max(gl.Code, obtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.S = Math.max(gl.Code, obtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                androidx.constraintlayout.widget.a.h(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.H = obtainStyledAttributes.getFloat(index, this.H);
                                break;
                            case 46:
                                this.I = obtainStyledAttributes.getFloat(index, this.I);
                                break;
                            case 47:
                                this.J = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.K = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                break;
                            case 50:
                                this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                break;
                            case 51:
                                this.Y = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f1395n);
                                this.f1395n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f1395n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.o);
                                this.o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        androidx.constraintlayout.widget.a.g(this, obtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        androidx.constraintlayout.widget.a.g(this, obtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 67:
                                        this.f1376d = obtainStyledAttributes.getBoolean(index, this.f1376d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.f1377d0 = false;
            this.f1371a0 = true;
            this.f1373b0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.W) {
                this.f1371a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.X) {
                this.f1373b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f1371a0 = false;
                if (i10 == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f1373b0 = false;
                if (i11 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.f1374c != -1.0f || this.f1370a != -1 || this.f1372b != -1) {
                this.f1377d0 = true;
                this.f1371a0 = true;
                this.f1373b0 = true;
                if (!(this.f1401q0 instanceof g)) {
                    this.f1401q0 = new g();
                }
                ((g) this.f1401q0).S(this.V);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }

        public a() {
            super(-2, -2);
            this.f1370a = -1;
            this.f1372b = -1;
            this.f1374c = -1.0f;
            this.f1376d = true;
            this.f1378e = -1;
            this.f = -1;
            this.f1381g = -1;
            this.f1383h = -1;
            this.f1385i = -1;
            this.f1387j = -1;
            this.f1389k = -1;
            this.f1391l = -1;
            this.f1393m = -1;
            this.f1395n = -1;
            this.o = -1;
            this.f1398p = -1;
            this.f1400q = 0;
            this.f1402r = gl.Code;
            this.f1403s = -1;
            this.f1404t = -1;
            this.f1405u = -1;
            this.f1406v = -1;
            this.f1407w = Integer.MIN_VALUE;
            this.f1408x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.f1409z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f1371a0 = true;
            this.f1373b0 = true;
            this.f1375c0 = false;
            this.f1377d0 = false;
            this.f1379e0 = false;
            this.f1380f0 = false;
            this.f1382g0 = -1;
            this.f1384h0 = -1;
            this.f1386i0 = -1;
            this.f1388j0 = -1;
            this.f1390k0 = Integer.MIN_VALUE;
            this.f1392l0 = Integer.MIN_VALUE;
            this.f1394m0 = 0.5f;
            this.f1401q0 = new d();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1370a = -1;
            this.f1372b = -1;
            this.f1374c = -1.0f;
            this.f1376d = true;
            this.f1378e = -1;
            this.f = -1;
            this.f1381g = -1;
            this.f1383h = -1;
            this.f1385i = -1;
            this.f1387j = -1;
            this.f1389k = -1;
            this.f1391l = -1;
            this.f1393m = -1;
            this.f1395n = -1;
            this.o = -1;
            this.f1398p = -1;
            this.f1400q = 0;
            this.f1402r = gl.Code;
            this.f1403s = -1;
            this.f1404t = -1;
            this.f1405u = -1;
            this.f1406v = -1;
            this.f1407w = Integer.MIN_VALUE;
            this.f1408x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.f1409z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f1371a0 = true;
            this.f1373b0 = true;
            this.f1375c0 = false;
            this.f1377d0 = false;
            this.f1379e0 = false;
            this.f1380f0 = false;
            this.f1382g0 = -1;
            this.f1384h0 = -1;
            this.f1386i0 = -1;
            this.f1388j0 = -1;
            this.f1390k0 = Integer.MIN_VALUE;
            this.f1392l0 = Integer.MIN_VALUE;
            this.f1394m0 = 0.5f;
            this.f1401q0 = new d();
        }
    }
}
