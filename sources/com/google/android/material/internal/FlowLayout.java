package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.hamkho.livefoot.R;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* loaded from: classes2.dex */
public class FlowLayout extends ViewGroup {

    /* renamed from: s, reason: collision with root package name */
    public int f20816s;

    /* renamed from: t, reason: collision with root package name */
    public int f20817t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f20818u;

    /* renamed from: v, reason: collision with root package name */
    public int f20819v;

    public boolean a() {
        return this.f20818u;
    }

    public int getItemSpacing() {
        return this.f20817t;
    }

    public int getLineSpacing() {
        return this.f20816s;
    }

    public int getRowCount() {
        return this.f20819v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        int paddingLeft;
        int paddingRight;
        int i14;
        int i15;
        if (getChildCount() == 0) {
            this.f20819v = 0;
            return;
        }
        this.f20819v = 1;
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        if (c0.e.d(this) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (z11) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i16 = (i12 - i10) - paddingRight;
        int i17 = paddingLeft;
        int i18 = paddingTop;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i15 = n0.g.c(marginLayoutParams);
                    i14 = n0.g.b(marginLayoutParams);
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i17 + i15;
                if (!this.f20818u && measuredWidth > i16) {
                    i18 = this.f20816s + paddingTop;
                    this.f20819v++;
                    i17 = paddingLeft;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f20819v - 1));
                int i20 = i17 + i15;
                int measuredWidth2 = childAt.getMeasuredWidth() + i20;
                int measuredHeight = childAt.getMeasuredHeight() + i18;
                if (z11) {
                    childAt.layout(i16 - measuredWidth2, i18, (i16 - i17) - i15, measuredHeight);
                } else {
                    childAt.layout(i20, i18, measuredWidth2, measuredHeight);
                }
                i17 += childAt.getMeasuredWidth() + i15 + i14 + this.f20817t;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            i12 = Integer.MAX_VALUE;
        } else {
            i12 = size;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i12 - getPaddingRight();
        int i16 = paddingTop;
        int i17 = 0;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i15 = marginLayoutParams.leftMargin + 0;
                    i14 = marginLayoutParams.rightMargin + 0;
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i15 > paddingRight && !a()) {
                    paddingLeft = getPaddingLeft();
                    i16 = this.f20816s + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i15;
                int measuredHeight = childAt.getMeasuredHeight() + i16;
                if (measuredWidth > i17) {
                    i17 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i15 + i14 + this.f20817t + paddingLeft;
                if (i18 == getChildCount() - 1) {
                    i17 += i14;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i17;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i13 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i13 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != i13) {
                size2 = paddingBottom;
            }
        } else {
            size2 = Math.min(paddingBottom, size2);
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i10) {
        this.f20817t = i10;
    }

    public void setLineSpacing(int i10) {
        this.f20816s = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f20818u = z10;
    }
}
