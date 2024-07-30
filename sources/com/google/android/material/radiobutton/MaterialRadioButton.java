package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.activity.n;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.google.android.material.internal.k;
import g7.a;
import r0.b;
import z6.c;

/* loaded from: classes2.dex */
public class MaterialRadioButton extends AppCompatRadioButton {
    public static final int[][] y = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: w, reason: collision with root package name */
    public ColorStateList f20947w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20948x;

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.hamkho.livefoot.R.attr.radioButtonStyle, com.hamkho.livefoot.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray d10 = k.d(context2, attributeSet, n.f496h0, com.hamkho.livefoot.R.attr.radioButtonStyle, com.hamkho.livefoot.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (d10.hasValue(0)) {
            b.c(this, c.a(context2, d10, 0));
        }
        this.f20948x = d10.getBoolean(1, false);
        d10.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f20947w == null) {
            int K0 = a0.a.K0(com.hamkho.livefoot.R.attr.colorControlActivated, this);
            int K02 = a0.a.K0(com.hamkho.livefoot.R.attr.colorOnSurface, this);
            int K03 = a0.a.K0(com.hamkho.livefoot.R.attr.colorSurface, this);
            this.f20947w = new ColorStateList(y, new int[]{a0.a.S0(1.0f, K03, K0), a0.a.S0(0.54f, K03, K02), a0.a.S0(0.38f, K03, K02), a0.a.S0(0.38f, K03, K02)});
        }
        return this.f20947w;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f20948x && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f20948x = z10;
        if (z10) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
