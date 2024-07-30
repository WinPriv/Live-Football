package com.google.android.material.textfield;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.b0;
import g0.a;
import java.util.Locale;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* loaded from: classes2.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    public final float A;
    public int B;
    public ColorStateList C;

    /* renamed from: w, reason: collision with root package name */
    public final b0 f21099w;

    /* renamed from: x, reason: collision with root package name */
    public final AccessibilityManager f21100x;
    public final Rect y;

    /* renamed from: z, reason: collision with root package name */
    public final int f21101z;

    /* loaded from: classes2.dex */
    public class a<T> extends ArrayAdapter<String> {

        /* renamed from: s, reason: collision with root package name */
        public ColorStateList f21102s;

        /* renamed from: t, reason: collision with root package name */
        public ColorStateList f21103t;

        public a(Context context, int i10, String[] strArr) {
            super(context, i10, strArr);
            a();
        }

        public final void a() {
            boolean z10;
            ColorStateList colorStateList;
            boolean z11;
            boolean z12;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            ColorStateList colorStateList2 = materialAutoCompleteTextView.C;
            if (colorStateList2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ColorStateList colorStateList3 = null;
            if (!z10) {
                colorStateList = null;
            } else {
                int[] iArr = {R.attr.state_pressed};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
            }
            this.f21103t = colorStateList;
            if (materialAutoCompleteTextView.B != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (materialAutoCompleteTextView.C != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    int[] iArr2 = {R.attr.state_hovered, -16842919};
                    int[] iArr3 = {R.attr.state_selected, -16842919};
                    colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{f0.a.b(materialAutoCompleteTextView.C.getColorForState(iArr3, 0), materialAutoCompleteTextView.B), f0.a.b(materialAutoCompleteTextView.C.getColorForState(iArr2, 0), materialAutoCompleteTextView.B), materialAutoCompleteTextView.B});
                }
            }
            this.f21102s = colorStateList3;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            boolean z10;
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
                Drawable drawable = null;
                if (materialAutoCompleteTextView.getText().toString().contentEquals(textView.getText())) {
                    if (materialAutoCompleteTextView.B != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        ColorDrawable colorDrawable = new ColorDrawable(materialAutoCompleteTextView.B);
                        if (this.f21103t != null) {
                            a.b.h(colorDrawable, this.f21102s);
                            drawable = new RippleDrawable(this.f21103t, colorDrawable, null);
                        } else {
                            drawable = colorDrawable;
                        }
                    }
                }
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                c0.d.q(textView, drawable);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(g7.a.a(context, attributeSet, com.hamkho.livefoot.R.attr.autoCompleteTextViewStyle, 0), attributeSet, 0);
        this.y = new Rect();
        Context context2 = getContext();
        TypedArray d10 = com.google.android.material.internal.k.d(context2, attributeSet, androidx.activity.n.Z, com.hamkho.livefoot.R.attr.autoCompleteTextViewStyle, 2132018020, new int[0]);
        if (d10.hasValue(0) && d10.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f21101z = d10.getResourceId(2, com.hamkho.livefoot.R.layout.mtrl_auto_complete_simple_item);
        this.A = d10.getDimensionPixelOffset(1, com.hamkho.livefoot.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.B = d10.getColor(3, 0);
        this.C = z6.c.a(context2, d10, 4);
        this.f21100x = (AccessibilityManager) context2.getSystemService("accessibility");
        b0 b0Var = new b0(context2);
        this.f21099w = b0Var;
        b0Var.Q = true;
        androidx.appcompat.widget.j jVar = b0Var.R;
        jVar.setFocusable(true);
        b0Var.G = this;
        jVar.setInputMethodMode(2);
        b0Var.m(getAdapter());
        b0Var.H = new r(this);
        if (d10.hasValue(5)) {
            setSimpleItems(d10.getResourceId(5, 0));
        }
        d10.recycle();
    }

    public static void a(MaterialAutoCompleteTextView materialAutoCompleteTextView, Object obj) {
        materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        boolean z10;
        AccessibilityManager accessibilityManager = this.f21100x;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f21099w.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b10 = b();
        if (b10 != null && b10.U) {
            return b10.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.A;
    }

    public int getSimpleItemSelectedColor() {
        return this.B;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.C;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b10 = b();
        if (b10 != null && b10.U && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21099w.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int selectedItemPosition;
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b10 = b();
            int i12 = 0;
            if (adapter != null && b10 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                b0 b0Var = this.f21099w;
                if (!b0Var.a()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = b0Var.f1126u.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i13 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i12) {
                        view = null;
                        i12 = itemViewType;
                    }
                    view = adapter.getView(max, view, b10);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i13 = Math.max(i13, view.getMeasuredWidth());
                }
                Drawable background = b0Var.getBackground();
                if (background != null) {
                    Rect rect = this.y;
                    background.getPadding(rect);
                    i13 += rect.left + rect.right;
                }
                i12 = b10.getEndIconView().getMeasuredWidth() + i13;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i12), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        boolean z11;
        AccessibilityManager accessibilityManager = this.f21100x;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f21099w.m(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        b0 b0Var = this.f21099w;
        if (b0Var != null) {
            b0Var.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f21099w.I = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        TextInputLayout b10 = b();
        if (b10 != null) {
            b10.r();
        }
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.B = i10;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.C = colorStateList;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        boolean z10;
        AccessibilityManager accessibilityManager = this.f21100x;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f21099w.show();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new a(getContext(), this.f21101z, strArr));
    }
}
