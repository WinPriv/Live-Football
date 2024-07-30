package com.google.android.material.imageview;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import androidx.appcompat.widget.AppCompatImageView;
import d0.a;
import d7.j;
import d7.n;

/* loaded from: classes2.dex */
public class ShapeableImageView extends AppCompatImageView implements n {

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f20808v;

    /* renamed from: w, reason: collision with root package name */
    public j f20809w;

    /* renamed from: x, reason: collision with root package name */
    public float f20810x;
    public boolean y;

    public int getContentPaddingBottom() {
        return 0;
    }

    public final int getContentPaddingEnd() {
        return 0;
    }

    public int getContentPaddingLeft() {
        boolean z10 = true;
        if (getLayoutDirection() != 1) {
            z10 = false;
        }
        if (z10) {
            return 0;
        }
        getLayoutDirection();
        return 0;
    }

    public int getContentPaddingRight() {
        boolean z10 = true;
        if (getLayoutDirection() != 1) {
            z10 = false;
        }
        if (z10) {
            return 0;
        }
        getLayoutDirection();
        return 0;
    }

    public final int getContentPaddingStart() {
        return 0;
    }

    public int getContentPaddingTop() {
        return 0;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public j getShapeAppearanceModel() {
        return this.f20809w;
    }

    public ColorStateList getStrokeColor() {
        return this.f20808v;
    }

    public float getStrokeWidth() {
        return this.f20810x;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(null, null);
        if (this.f20808v == null) {
        } else {
            throw null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.y || !isLayoutDirectionResolved()) {
            return;
        }
        this.y = true;
        isPaddingRelative();
        setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        getPaddingLeft();
        getPaddingTop();
        getPaddingRight();
        getPaddingBottom();
        throw null;
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(getContentPaddingLeft() + i10, getContentPaddingTop() + i11, getContentPaddingRight() + i12, getContentPaddingBottom() + i13);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(getContentPaddingStart() + i10, getContentPaddingTop() + i11, getContentPaddingEnd() + i12, getContentPaddingBottom() + i13);
    }

    @Override // d7.n
    public void setShapeAppearanceModel(j jVar) {
        this.f20809w = jVar;
        getWidth();
        getHeight();
        getPaddingLeft();
        getPaddingTop();
        getPaddingRight();
        getPaddingBottom();
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f20808v = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i10) {
        setStrokeColor(a.b(i10, getContext()));
    }

    public void setStrokeWidth(float f) {
        if (this.f20810x != f) {
            this.f20810x = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i10) {
        setStrokeWidth(getResources().getDimensionPixelSize(i10));
    }
}
