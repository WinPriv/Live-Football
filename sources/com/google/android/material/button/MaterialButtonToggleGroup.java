package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.activity.n;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.k;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import d7.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import o0.g;

/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int C = 0;
    public final int A;
    public HashSet B;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f20584s;

    /* renamed from: t, reason: collision with root package name */
    public final e f20585t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet<d> f20586u;

    /* renamed from: v, reason: collision with root package name */
    public final a f20587v;

    /* renamed from: w, reason: collision with root package name */
    public Integer[] f20588w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20589x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20590z;

    /* loaded from: classes2.dex */
    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int compareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (compareTo == 0) {
                int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
                if (compareTo2 == 0) {
                    MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
                    return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton3)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton4)));
                }
                return compareTo2;
            }
            return compareTo;
        }
    }

    /* loaded from: classes2.dex */
    public class b extends n0.a {
        public b() {
        }

        @Override // n0.a
        public final void d(View view, g gVar) {
            int i10;
            this.f33037a.onInitializeAccessibilityNodeInfo(view, gVar.f33521a);
            int i11 = MaterialButtonToggleGroup.C;
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            materialButtonToggleGroup.getClass();
            if (view instanceof MaterialButton) {
                i10 = 0;
                for (int i12 = 0; i12 < materialButtonToggleGroup.getChildCount(); i12++) {
                    if (materialButtonToggleGroup.getChildAt(i12) == view) {
                        break;
                    }
                    if ((materialButtonToggleGroup.getChildAt(i12) instanceof MaterialButton) && materialButtonToggleGroup.d(i12)) {
                        i10++;
                    }
                }
            }
            i10 = -1;
            gVar.g(g.c.a(0, 1, i10, 1, ((MaterialButton) view).isChecked()));
        }
    }

    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: e, reason: collision with root package name */
        public static final d7.a f20593e = new d7.a(gl.Code);

        /* renamed from: a, reason: collision with root package name */
        public final d7.c f20594a;

        /* renamed from: b, reason: collision with root package name */
        public final d7.c f20595b;

        /* renamed from: c, reason: collision with root package name */
        public final d7.c f20596c;

        /* renamed from: d, reason: collision with root package name */
        public final d7.c f20597d;

        public c(d7.c cVar, d7.c cVar2, d7.c cVar3, d7.c cVar4) {
            this.f20594a = cVar;
            this.f20595b = cVar3;
            this.f20596c = cVar4;
            this.f20597d = cVar2;
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a();
    }

    /* loaded from: classes2.dex */
    public class e implements MaterialButton.b {
        public e() {
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(g7.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f20584s = new ArrayList();
        this.f20585t = new e();
        this.f20586u = new LinkedHashSet<>();
        this.f20587v = new a();
        this.f20589x = false;
        this.B = new HashSet();
        TypedArray d10 = k.d(getContext(), attributeSet, n.f492d0, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(d10.getBoolean(3, false));
        this.A = d10.getResourceId(1, -1);
        this.f20590z = d10.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(d10.getBoolean(0, true));
        d10.recycle();
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        c0.d.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (d(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && d(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            materialButton.setId(c0.e.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f20585t);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton c10 = c(i10);
            int min = Math.min(c10.getStrokeWidth(), c(i10 - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams2 = c10.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            }
            if (getOrientation() == 0) {
                n0.g.g(layoutParams, 0);
                n0.g.h(layoutParams, -min);
                layoutParams.topMargin = 0;
            } else {
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = -min;
                n0.g.h(layoutParams, 0);
            }
            c10.setLayoutParams(layoutParams);
        }
        if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c(firstVisibleChildIndex).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
            } else {
                n0.g.g(layoutParams3, 0);
                n0.g.h(layoutParams3, 0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        j shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f20584s.add(new c(shapeAppearanceModel.f27435e, shapeAppearanceModel.f27437h, shapeAppearanceModel.f, shapeAppearanceModel.f27436g));
        materialButton.setEnabled(isEnabled());
        c0.l(materialButton, new b());
    }

    public final void b(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.B);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.y && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else if (!z10 && hashSet.contains(Integer.valueOf(i10))) {
            if (!this.f20590z || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        } else {
            return;
        }
        e(hashSet);
    }

    public final MaterialButton c(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    public final boolean d(int i10) {
        if (getChildAt(i10).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f20587v);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(c(i10), Integer.valueOf(i10));
        }
        this.f20588w = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(Set<Integer> set) {
        HashSet hashSet = this.B;
        this.B = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = c(i10).getId();
            boolean contains = set.contains(Integer.valueOf(id2));
            View findViewById = findViewById(id2);
            if (findViewById instanceof MaterialButton) {
                this.f20589x = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f20589x = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator<d> it = this.f20586u.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
        invalidate();
    }

    public final void f() {
        boolean z10;
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton c10 = c(i10);
            if (c10.getVisibility() != 8) {
                j shapeAppearanceModel = c10.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                j.a aVar = new j.a(shapeAppearanceModel);
                c cVar2 = (c) this.f20584s.get(i10);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    d7.a aVar2 = c.f20593e;
                    if (i10 == firstVisibleChildIndex) {
                        if (z10) {
                            if (com.google.android.material.internal.n.e(this)) {
                                cVar = new c(aVar2, aVar2, cVar2.f20595b, cVar2.f20596c);
                            } else {
                                cVar = new c(cVar2.f20594a, cVar2.f20597d, aVar2, aVar2);
                            }
                        } else {
                            cVar = new c(cVar2.f20594a, aVar2, cVar2.f20595b, aVar2);
                        }
                    } else if (i10 == lastVisibleChildIndex) {
                        if (z10) {
                            if (com.google.android.material.internal.n.e(this)) {
                                cVar = new c(cVar2.f20594a, cVar2.f20597d, aVar2, aVar2);
                            } else {
                                cVar = new c(aVar2, aVar2, cVar2.f20595b, cVar2.f20596c);
                            }
                        } else {
                            cVar = new c(aVar2, cVar2.f20597d, aVar2, cVar2.f20596c);
                        }
                    } else {
                        cVar2 = null;
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    aVar.f27446e = new d7.a(gl.Code);
                    aVar.f = new d7.a(gl.Code);
                    aVar.f27447g = new d7.a(gl.Code);
                    aVar.f27448h = new d7.a(gl.Code);
                } else {
                    aVar.f27446e = cVar2.f20594a;
                    aVar.f27448h = cVar2.f20597d;
                    aVar.f = cVar2.f20595b;
                    aVar.f27447g = cVar2.f20596c;
                }
                c10.setShapeAppearanceModel(new j(aVar));
            }
        }
    }

    public int getCheckedButtonId() {
        if (this.y && !this.B.isEmpty()) {
            return ((Integer) this.B.iterator().next()).intValue();
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = c(i10).getId();
            if (this.B.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f20588w;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i11;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.A;
        if (i10 != -1) {
            e(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.y) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) g.b.a(1, visibleButtonCount, i10).f33535a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        f();
        a();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f20584s.remove(indexOfChild);
        }
        f();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            c(i10).setEnabled(z10);
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.f20590z = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.y != z10) {
            this.y = z10;
            e(new HashSet());
        }
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
