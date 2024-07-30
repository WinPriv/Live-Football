package com.google.android.material.card;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import d7.j;
import d7.n;

/* loaded from: classes2.dex */
public class MaterialCardView extends CardView implements Checkable, n {
    public static final int[] A = {R.attr.state_checked};
    public static final int[] B = {com.hamkho.livefoot.R.attr.state_dragged};

    /* renamed from: z, reason: collision with root package name */
    public boolean f20599z;

    /* loaded from: classes2.dex */
    public interface a {
    }

    private RectF getBoundsAsRectF() {
        new RectF();
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public int getCheckedIconGravity() {
        throw null;
    }

    public int getCheckedIconMargin() {
        throw null;
    }

    public int getCheckedIconSize() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public j getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A);
        }
        if (this.f20599z) {
            View.mergeDrawableStates(onCreateDrawableState, B);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(false);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i10) {
        ColorStateList.valueOf(i10);
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        throw null;
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean z10) {
        throw null;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconGravity(int i10) {
        throw null;
    }

    public void setCheckedIconMargin(int i10) {
        throw null;
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 == -1) {
            return;
        }
        getResources().getDimensionPixelSize(i10);
        throw null;
    }

    public void setCheckedIconResource(int i10) {
        g.a.a(getContext(), i10);
        throw null;
    }

    public void setCheckedIconSize(int i10) {
        throw null;
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 == 0) {
            return;
        }
        getResources().getDimensionPixelSize(i10);
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
    }

    public void setDragged(boolean z10) {
        if (this.f20599z != z10) {
            this.f20599z = z10;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT <= 26) {
                invalidate();
                return;
            }
            throw null;
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        throw null;
    }

    public void setProgress(float f) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i10) {
        d0.a.b(i10, getContext());
        throw null;
    }

    @Override // d7.n
    public void setShapeAppearanceModel(j jVar) {
        setClipToOutline(jVar.d(getBoundsAsRectF()));
        throw null;
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(int i10) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setOnCheckedChangeListener(a aVar) {
    }
}
