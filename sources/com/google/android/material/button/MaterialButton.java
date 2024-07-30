package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.k;
import com.huawei.hms.ads.gl;
import d7.j;
import d7.n;
import g0.a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import r0.j;
import z6.c;

/* loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, n {
    public static final int[] I = {R.attr.state_checkable};
    public static final int[] J = {R.attr.state_checked};
    public Drawable A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;

    /* renamed from: v, reason: collision with root package name */
    public final n6.a f20579v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashSet<a> f20580w;

    /* renamed from: x, reason: collision with root package name */
    public b f20581x;
    public PorterDuff.Mode y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f20582z;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public boolean f20583u;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f1595s, i10);
            parcel.writeInt(this.f20583u ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.f20583u = parcel.readInt() == 1;
        }
    }

    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes2.dex */
    public interface b {
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(g7.a.a(context, attributeSet, com.hamkho.livefoot.R.attr.materialButtonStyle, com.hamkho.livefoot.R.style.Widget_MaterialComponents_Button), attributeSet, com.hamkho.livefoot.R.attr.materialButtonStyle);
        this.f20580w = new LinkedHashSet<>();
        this.F = false;
        this.G = false;
        Context context2 = getContext();
        TypedArray d10 = k.d(context2, attributeSet, androidx.activity.n.f491c0, com.hamkho.livefoot.R.attr.materialButtonStyle, com.hamkho.livefoot.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.E = d10.getDimensionPixelSize(12, 0);
        this.y = com.google.android.material.internal.n.f(d10.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f20582z = c.a(getContext(), d10, 14);
        this.A = c.d(getContext(), d10, 10);
        this.H = d10.getInteger(11, 1);
        this.B = d10.getDimensionPixelSize(13, 0);
        n6.a aVar = new n6.a(this, new j(j.b(context2, attributeSet, com.hamkho.livefoot.R.attr.materialButtonStyle, com.hamkho.livefoot.R.style.Widget_MaterialComponents_Button)));
        this.f20579v = aVar;
        aVar.f33434c = d10.getDimensionPixelOffset(1, 0);
        aVar.f33435d = d10.getDimensionPixelOffset(2, 0);
        aVar.f33436e = d10.getDimensionPixelOffset(3, 0);
        aVar.f = d10.getDimensionPixelOffset(4, 0);
        if (d10.hasValue(8)) {
            int dimensionPixelSize = d10.getDimensionPixelSize(8, -1);
            aVar.f33437g = dimensionPixelSize;
            aVar.c(aVar.f33433b.e(dimensionPixelSize));
            aVar.f33445p = true;
        }
        aVar.f33438h = d10.getDimensionPixelSize(20, 0);
        aVar.f33439i = com.google.android.material.internal.n.f(d10.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        aVar.f33440j = c.a(getContext(), d10, 6);
        aVar.f33441k = c.a(getContext(), d10, 19);
        aVar.f33442l = c.a(getContext(), d10, 16);
        aVar.f33446q = d10.getBoolean(5, false);
        aVar.f33449t = d10.getDimensionPixelSize(9, 0);
        aVar.f33447r = d10.getBoolean(21, true);
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        int f = c0.e.f(this);
        int paddingTop = getPaddingTop();
        int e10 = c0.e.e(this);
        int paddingBottom = getPaddingBottom();
        if (d10.hasValue(0)) {
            aVar.o = true;
            setSupportBackgroundTintList(aVar.f33440j);
            setSupportBackgroundTintMode(aVar.f33439i);
        } else {
            aVar.e();
        }
        c0.e.k(this, f + aVar.f33434c, paddingTop + aVar.f33436e, e10 + aVar.f33435d, paddingBottom + aVar.f);
        d10.recycle();
        setCompoundDrawablePadding(this.E);
        c(this.A != null);
    }

    private String getA11yClassName() {
        boolean z10;
        Class cls;
        n6.a aVar = this.f20579v;
        if (aVar != null && aVar.f33446q) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = gl.Code;
        for (int i10 = 0; i10 < lineCount; i10++) {
            f = Math.max(f, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(f);
    }

    public final boolean a() {
        n6.a aVar = this.f20579v;
        if (aVar != null && !aVar.o) {
            return true;
        }
        return false;
    }

    public final void b() {
        boolean z10;
        boolean z11;
        int i10 = this.H;
        boolean z12 = false;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            j.b.e(this, this.A, null, null, null);
            return;
        }
        if (i10 != 3 && i10 != 4) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            j.b.e(this, null, null, this.A, null);
            return;
        }
        if (i10 == 16 || i10 == 32) {
            z12 = true;
        }
        if (z12) {
            j.b.e(this, null, this.A, null, null);
        }
    }

    public final void c(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        Drawable drawable = this.A;
        boolean z14 = true;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.A = mutate;
            a.b.h(mutate, this.f20582z);
            PorterDuff.Mode mode = this.y;
            if (mode != null) {
                a.b.i(this.A, mode);
            }
            int i10 = this.B;
            if (i10 == 0) {
                i10 = this.A.getIntrinsicWidth();
            }
            int i11 = this.B;
            if (i11 == 0) {
                i11 = this.A.getIntrinsicHeight();
            }
            Drawable drawable2 = this.A;
            int i12 = this.C;
            int i13 = this.D;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.A.setVisible(true, z10);
        }
        if (z10) {
            b();
            return;
        }
        Drawable[] a10 = j.b.a(this);
        Drawable drawable3 = a10[0];
        Drawable drawable4 = a10[1];
        Drawable drawable5 = a10[2];
        int i14 = this.H;
        if (i14 != 1 && i14 != 2) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11 || drawable3 == this.A) {
            if (i14 != 3 && i14 != 4) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!z12 || drawable5 == this.A) {
                if (i14 != 16 && i14 != 32) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (!z13 || drawable4 == this.A) {
                    z14 = false;
                }
            }
        }
        if (z14) {
            b();
        }
    }

    public final void d(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.A != null && getLayout() != null) {
            int i12 = this.H;
            boolean z13 = true;
            if (i12 != 1 && i12 != 2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                if (i12 != 3 && i12 != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z12) {
                    if (i12 != 16 && i12 != 32) {
                        z13 = false;
                    }
                    if (z13) {
                        this.C = 0;
                        if (i12 == 16) {
                            this.D = 0;
                            c(false);
                            return;
                        }
                        int i13 = this.B;
                        if (i13 == 0) {
                            i13 = this.A.getIntrinsicHeight();
                        }
                        int max = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - i13) - this.E) - getPaddingBottom()) / 2);
                        if (this.D != max) {
                            this.D = max;
                            c(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.D = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i14 = this.H;
            if (i14 != 1 && i14 != 3 && ((i14 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i14 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i15 = this.B;
                if (i15 == 0) {
                    i15 = this.A.getIntrinsicWidth();
                }
                int textLayoutWidth = i10 - getTextLayoutWidth();
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                int e10 = (((textLayoutWidth - c0.e.e(this)) - i15) - this.E) - c0.e.f(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    e10 /= 2;
                }
                if (c0.e.d(this) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.H != 4) {
                    z13 = false;
                }
                if (z11 != z13) {
                    e10 = -e10;
                }
                if (this.C != e10) {
                    this.C = e10;
                    c(false);
                    return;
                }
                return;
            }
            this.C = 0;
            c(false);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f20579v.f33437g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.A;
    }

    public int getIconGravity() {
        return this.H;
    }

    public int getIconPadding() {
        return this.E;
    }

    public int getIconSize() {
        return this.B;
    }

    public ColorStateList getIconTint() {
        return this.f20582z;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.y;
    }

    public int getInsetBottom() {
        return this.f20579v.f;
    }

    public int getInsetTop() {
        return this.f20579v.f33436e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f20579v.f33442l;
        }
        return null;
    }

    public d7.j getShapeAppearanceModel() {
        if (a()) {
            return this.f20579v.f33433b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f20579v.f33441k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f20579v.f33438h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        if (a()) {
            return this.f20579v.f33440j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (a()) {
            return this.f20579v.f33439i;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.F;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            androidx.activity.n.L0(this, this.f20579v.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        boolean z10;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        n6.a aVar = this.f20579v;
        if (aVar != null && aVar.f33446q) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            View.mergeDrawableStates(onCreateDrawableState, I);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, J);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        n6.a aVar = this.f20579v;
        if (aVar != null && aVar.f33446q) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1595s);
        setChecked(savedState.f20583u);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f20583u = this.F;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f20579v.f33447r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.A != null) {
            if (this.A.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (a()) {
            n6.a aVar = this.f20579v;
            if (aVar.b(false) != null) {
                aVar.b(false).setTint(i10);
                return;
            }
            return;
        }
        super.setBackgroundColor(i10);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (a()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                n6.a aVar = this.f20579v;
                aVar.o = true;
                ColorStateList colorStateList = aVar.f33440j;
                MaterialButton materialButton = aVar.f33432a;
                materialButton.setSupportBackgroundTintList(colorStateList);
                materialButton.setSupportBackgroundTintMode(aVar.f33439i);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = g.a.a(getContext(), i10);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (a()) {
            this.f20579v.f33446q = z10;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        boolean z11;
        n6.a aVar = this.f20579v;
        if (aVar != null && aVar.f33446q) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && isEnabled() && this.F != z10) {
            this.F = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z12 = this.F;
                if (!materialButtonToggleGroup.f20589x) {
                    materialButtonToggleGroup.b(getId(), z12);
                }
            }
            if (this.G) {
                return;
            }
            this.G = true;
            Iterator<a> it = this.f20580w.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.G = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (a()) {
            n6.a aVar = this.f20579v;
            if (!aVar.f33445p || aVar.f33437g != i10) {
                aVar.f33437g = i10;
                aVar.f33445p = true;
                aVar.c(aVar.f33433b.e(i10));
            }
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (a()) {
            this.f20579v.b(false).j(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.A != drawable) {
            this.A = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.H != i10) {
            this.H = i10;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.E != i10) {
            this.E = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = g.a.a(getContext(), i10);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i10) {
        if (i10 >= 0) {
            if (this.B != i10) {
                this.B = i10;
                c(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f20582z != colorStateList) {
            this.f20582z = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.y != mode) {
            this.y = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(d0.a.b(i10, getContext()));
    }

    public void setInsetBottom(int i10) {
        n6.a aVar = this.f20579v;
        aVar.d(aVar.f33436e, i10);
    }

    public void setInsetTop(int i10) {
        n6.a aVar = this.f20579v;
        aVar.d(i10, aVar.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f20581x = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f20581x;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            n6.a aVar = this.f20579v;
            if (aVar.f33442l != colorStateList) {
                aVar.f33442l = colorStateList;
                MaterialButton materialButton = aVar.f33432a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(a7.a.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (a()) {
            setRippleColor(d0.a.b(i10, getContext()));
        }
    }

    @Override // d7.n
    public void setShapeAppearanceModel(d7.j jVar) {
        if (a()) {
            this.f20579v.c(jVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (a()) {
            n6.a aVar = this.f20579v;
            aVar.f33444n = z10;
            aVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            n6.a aVar = this.f20579v;
            if (aVar.f33441k != colorStateList) {
                aVar.f33441k = colorStateList;
                aVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (a()) {
            setStrokeColor(d0.a.b(i10, getContext()));
        }
    }

    public void setStrokeWidth(int i10) {
        if (a()) {
            n6.a aVar = this.f20579v;
            if (aVar.f33438h != i10) {
                aVar.f33438h = i10;
                aVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (a()) {
            n6.a aVar = this.f20579v;
            if (aVar.f33440j != colorStateList) {
                aVar.f33440j = colorStateList;
                if (aVar.b(false) != null) {
                    a.b.h(aVar.b(false), aVar.f33440j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (a()) {
            n6.a aVar = this.f20579v;
            if (aVar.f33439i != mode) {
                aVar.f33439i = mode;
                if (aVar.b(false) != null && aVar.f33439i != null) {
                    a.b.i(aVar.b(false), aVar.f33439i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f20579v.f33447r = z10;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.F);
    }
}
