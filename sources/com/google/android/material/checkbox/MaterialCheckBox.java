package com.google.android.material.checkbox;

import a3.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.activity.n;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.m0;
import com.anythink.expressad.foundation.h.i;
import com.google.android.material.internal.k;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import e0.f;
import g0.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n1.d;
import n1.e;

/* loaded from: classes2.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    public static final int[] Q = {R.attr.state_indeterminate};
    public static final int[] R = {R.attr.state_error};
    public static final int[][] S = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    @SuppressLint({"DiscouragedApi"})
    public static final int T = Resources.getSystem().getIdentifier("btn_check_material_anim", i.f10125c, "android");
    public boolean A;
    public boolean B;
    public CharSequence C;
    public Drawable D;
    public Drawable E;
    public boolean F;
    public ColorStateList G;
    public ColorStateList H;
    public PorterDuff.Mode I;
    public int J;
    public int[] K;
    public boolean L;
    public CharSequence M;
    public CompoundButton.OnCheckedChangeListener N;
    public final d O;
    public final a P;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashSet<c> f20600w;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashSet<b> f20601x;
    public ColorStateList y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20602z;

    /* loaded from: classes2.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: s, reason: collision with root package name */
        public int f20603s;

        /* loaded from: classes2.dex */
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("MaterialCheckBox.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" CheckedState=");
            int i10 = this.f20603s;
            if (i10 != 1) {
                if (i10 != 2) {
                    str = "unchecked";
                } else {
                    str = "indeterminate";
                }
            } else {
                str = "checked";
            }
            return l.p(sb2, str, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f20603s));
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f20603s = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    /* loaded from: classes2.dex */
    public class a extends n1.c {
        public a() {
        }

        @Override // n1.c
        public final void a(Drawable drawable) {
            ColorStateList colorStateList = MaterialCheckBox.this.G;
            if (colorStateList != null) {
                a.b.h(drawable, colorStateList);
            }
        }

        @Override // n1.c
        public final void b(Drawable drawable) {
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.G;
            if (colorStateList != null) {
                a.b.g(drawable, colorStateList.getColorForState(materialCheckBox.K, colorStateList.getDefaultColor()));
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a();
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        super(g7.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        boolean z10;
        this.f20600w = new LinkedHashSet<>();
        this.f20601x = new LinkedHashSet<>();
        Context context2 = getContext();
        d dVar = new d(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal<TypedValue> threadLocal = f.f27633a;
        Drawable a10 = f.a.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        dVar.f33159s = a10;
        a10.setCallback(dVar.f33151x);
        new d.c(dVar.f33159s.getConstantState());
        this.O = dVar;
        this.P = new a();
        Context context3 = getContext();
        this.D = r0.c.a(this);
        this.G = getSuperButtonTintList();
        setSupportButtonTintList(null);
        m0 e10 = k.e(context3, attributeSet, n.f495g0, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        this.E = e10.e(2);
        if (this.D != null && z6.b.b(R.attr.isMaterial3Theme, context3, false)) {
            int i10 = e10.i(0, 0);
            int i11 = e10.i(1, 0);
            if (i10 == T && i11 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                super.setButtonDrawable((Drawable) null);
                this.D = g.a.a(context3, R.drawable.mtrl_checkbox_button);
                this.F = true;
                if (this.E == null) {
                    this.E = g.a.a(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.H = z6.c.b(context3, e10, 3);
        this.I = com.google.android.material.internal.n.f(e10.h(4, -1), PorterDuff.Mode.SRC_IN);
        this.f20602z = e10.a(10, false);
        this.A = e10.a(6, true);
        this.B = e10.a(9, false);
        this.C = e10.k(8);
        if (e10.l(7)) {
            setCheckedState(e10.h(7, 0));
        }
        e10.n();
        b();
    }

    private String getButtonStateDescription() {
        int i10 = this.J;
        if (i10 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        if (i10 == 0) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.y == null) {
            int K0 = a0.a.K0(R.attr.colorControlActivated, this);
            int K02 = a0.a.K0(R.attr.colorError, this);
            int K03 = a0.a.K0(R.attr.colorSurface, this);
            int K04 = a0.a.K0(R.attr.colorOnSurface, this);
            this.y = new ColorStateList(S, new int[]{a0.a.S0(1.0f, K03, K02), a0.a.S0(1.0f, K03, K0), a0.a.S0(0.54f, K03, K04), a0.a.S0(0.38f, K03, K04), a0.a.S0(0.38f, K03, K04)});
        }
        return this.y;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.G;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        e eVar;
        this.D = s6.a.b(this.D, this.G, r0.b.b(this));
        this.E = s6.a.b(this.E, this.H, this.I);
        if (this.F) {
            d dVar = this.O;
            if (dVar != null) {
                Drawable drawable = dVar.f33159s;
                a aVar = this.P;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (aVar.f33146a == null) {
                        aVar.f33146a = new n1.b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f33146a);
                }
                ArrayList<n1.c> arrayList = dVar.f33150w;
                d.b bVar = dVar.f33147t;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (dVar.f33150w.size() == 0 && (eVar = dVar.f33149v) != null) {
                        bVar.f33154b.removeListener(eVar);
                        dVar.f33149v = null;
                    }
                }
                Drawable drawable2 = dVar.f33159s;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (aVar.f33146a == null) {
                        aVar.f33146a = new n1.b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f33146a);
                } else if (aVar != null) {
                    if (dVar.f33150w == null) {
                        dVar.f33150w = new ArrayList<>();
                    }
                    if (!dVar.f33150w.contains(aVar)) {
                        dVar.f33150w.add(aVar);
                        if (dVar.f33149v == null) {
                            dVar.f33149v = new e(dVar);
                        }
                        bVar.f33154b.addListener(dVar.f33149v);
                    }
                }
            }
            Drawable drawable3 = this.D;
            if ((drawable3 instanceof AnimatedStateListDrawable) && dVar != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, dVar, false);
                ((AnimatedStateListDrawable) this.D).addTransition(R.id.indeterminate, R.id.unchecked, dVar, false);
            }
        }
        Drawable drawable4 = this.D;
        if (drawable4 != null && (colorStateList2 = this.G) != null) {
            a.b.h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.E;
        if (drawable5 != null && (colorStateList = this.H) != null) {
            a.b.h(drawable5, colorStateList);
        }
        super.setButtonDrawable(s6.a.a(this.D, this.E));
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.D;
    }

    public Drawable getButtonIconDrawable() {
        return this.E;
    }

    public ColorStateList getButtonIconTintList() {
        return this.H;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.I;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.G;
    }

    public int getCheckedState() {
        return this.J;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.C;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        if (this.J == 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f20602z && this.G == null && this.H == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, Q);
        }
        if (this.B) {
            View.mergeDrawableStates(onCreateDrawableState, R);
        }
        this.K = s6.a.c(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a10;
        int i10;
        if (this.A && TextUtils.isEmpty(getText()) && (a10 = r0.c.a(this)) != null) {
            if (com.google.android.material.internal.n.e(this)) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            int width = ((getWidth() - a10.getIntrinsicWidth()) / 2) * i10;
            int save = canvas.save();
            canvas.translate(width, gl.Code);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = a10.getBounds();
                a.b.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.B) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.C));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f20603s);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f20603s = getCheckedState();
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(g.a.a(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.E = drawable;
        b();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(g.a.a(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.H == colorStateList) {
            return;
        }
        this.H = colorStateList;
        b();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.I == mode) {
            return;
        }
        this.I = mode;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.G == colorStateList) {
            return;
        }
        this.G = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.A = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        boolean z10;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.J != i10) {
            this.J = i10;
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            super.setChecked(z10);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.M == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.L) {
                return;
            }
            this.L = true;
            LinkedHashSet<b> linkedHashSet = this.f20601x;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
            if (this.J != 2 && (onCheckedChangeListener = this.N) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.L = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.C = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        CharSequence charSequence;
        if (i10 != 0) {
            charSequence = getResources().getText(i10);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z10) {
        if (this.B == z10) {
            return;
        }
        this.B = z10;
        refreshDrawableState();
        Iterator<c> it = this.f20600w.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.N = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.M = charSequence;
        if (charSequence == null) {
            if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
                super.setStateDescription(getButtonStateDescription());
                return;
            }
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f20602z = z10;
        if (z10) {
            r0.b.c(this, getMaterialThemeColorsTintList());
        } else {
            r0.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.D = drawable;
        this.F = false;
        b();
    }
}
