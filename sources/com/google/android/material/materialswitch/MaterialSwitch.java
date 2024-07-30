package com.google.android.material.materialswitch;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.hamkho.livefoot.R;
import f0.a;
import g0.a;

/* loaded from: classes2.dex */
public class MaterialSwitch extends SwitchCompat {

    /* renamed from: k0, reason: collision with root package name */
    public static final int[] f20891k0 = {R.attr.state_with_icon};
    public Drawable T;
    public Drawable U;
    public Drawable V;
    public Drawable W;

    /* renamed from: c0, reason: collision with root package name */
    public ColorStateList f20892c0;

    /* renamed from: d0, reason: collision with root package name */
    public ColorStateList f20893d0;

    /* renamed from: e0, reason: collision with root package name */
    public PorterDuff.Mode f20894e0;

    /* renamed from: f0, reason: collision with root package name */
    public ColorStateList f20895f0;

    /* renamed from: g0, reason: collision with root package name */
    public ColorStateList f20896g0;

    /* renamed from: h0, reason: collision with root package name */
    public PorterDuff.Mode f20897h0;

    /* renamed from: i0, reason: collision with root package name */
    public int[] f20898i0;

    /* renamed from: j0, reason: collision with root package name */
    public int[] f20899j0;

    public static void h(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable != null && colorStateList != null) {
            int colorForState = colorStateList.getColorForState(iArr, 0);
            int colorForState2 = colorStateList.getColorForState(iArr2, 0);
            ThreadLocal<double[]> threadLocal = a.f27897a;
            float f10 = 1.0f - f;
            a.b.g(drawable, Color.argb((int) ((Color.alpha(colorForState2) * f) + (Color.alpha(colorForState) * f10)), (int) ((Color.red(colorForState2) * f) + (Color.red(colorForState) * f10)), (int) ((Color.green(colorForState2) * f) + (Color.green(colorForState) * f10)), (int) ((Color.blue(colorForState2) * f) + (Color.blue(colorForState) * f10))));
        }
    }

    public final void f() {
        this.T = s6.a.b(this.T, this.f20892c0, getThumbTintMode());
        this.U = s6.a.b(this.U, this.f20893d0, this.f20894e0);
        i();
        super.setThumbDrawable(s6.a.a(this.T, this.U));
        refreshDrawableState();
    }

    public final void g() {
        this.V = s6.a.b(this.V, this.f20895f0, getTrackTintMode());
        this.W = s6.a.b(this.W, this.f20896g0, this.f20897h0);
        i();
        Drawable drawable = this.V;
        if (drawable != null && this.W != null) {
            drawable = new LayerDrawable(new Drawable[]{this.V, this.W});
        } else if (drawable == null) {
            drawable = this.W;
        }
        if (drawable != null) {
            setSwitchMinWidth(drawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getThumbDrawable() {
        return this.T;
    }

    public Drawable getThumbIconDrawable() {
        return this.U;
    }

    public ColorStateList getThumbIconTintList() {
        return this.f20893d0;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f20894e0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getThumbTintList() {
        return this.f20892c0;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.W;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.f20896g0;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f20897h0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getTrackDrawable() {
        return this.V;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getTrackTintList() {
        return this.f20895f0;
    }

    public final void i() {
        if (this.f20892c0 == null && this.f20893d0 == null && this.f20895f0 == null && this.f20896g0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f20892c0;
        if (colorStateList != null) {
            h(this.T, colorStateList, this.f20898i0, this.f20899j0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f20893d0;
        if (colorStateList2 != null) {
            h(this.U, colorStateList2, this.f20898i0, this.f20899j0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f20895f0;
        if (colorStateList3 != null) {
            h(this.V, colorStateList3, this.f20898i0, this.f20899j0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f20896g0;
        if (colorStateList4 != null) {
            h(this.W, colorStateList4, this.f20898i0, this.f20899j0, thumbPosition);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        i();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (this.U != null) {
            View.mergeDrawableStates(onCreateDrawableState, f20891k0);
        }
        int[] iArr = new int[onCreateDrawableState.length];
        int i11 = 0;
        for (int i12 : onCreateDrawableState) {
            if (i12 != 16842912) {
                iArr[i11] = i12;
                i11++;
            }
        }
        this.f20898i0 = iArr;
        this.f20899j0 = s6.a.c(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.T = drawable;
        f();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.U = drawable;
        f();
    }

    public void setThumbIconResource(int i10) {
        setThumbIconDrawable(g.a.a(getContext(), i10));
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.f20893d0 = colorStateList;
        f();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.f20894e0 = mode;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.f20892c0 = colorStateList;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        f();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.W = drawable;
        g();
    }

    public void setTrackDecorationResource(int i10) {
        setTrackDecorationDrawable(g.a.a(getContext(), i10));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.f20896g0 = colorStateList;
        g();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.f20897h0 = mode;
        g();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.V = drawable;
        g();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.f20895f0 = colorStateList;
        g();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        g();
    }
}
