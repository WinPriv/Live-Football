package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.view.View;
import d0.a;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* loaded from: classes2.dex */
public class MaterialDivider extends View {

    /* renamed from: s, reason: collision with root package name */
    public int f20746s;

    /* renamed from: t, reason: collision with root package name */
    public int f20747t;

    /* renamed from: u, reason: collision with root package name */
    public int f20748u;

    /* renamed from: v, reason: collision with root package name */
    public int f20749v;

    public int getDividerColor() {
        return this.f20747t;
    }

    public int getDividerInsetEnd() {
        return this.f20749v;
    }

    public int getDividerInsetStart() {
        return this.f20748u;
    }

    public int getDividerThickness() {
        return this.f20746s;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        if (c0.e.d(this) != 1) {
        }
        getWidth();
        getBottom();
        getTop();
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.f20746s;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i10) {
        if (this.f20747t == i10) {
            return;
        }
        this.f20747t = i10;
        ColorStateList.valueOf(i10);
        throw null;
    }

    public void setDividerColorResource(int i10) {
        Context context = getContext();
        Object obj = a.f27248a;
        setDividerColor(a.d.a(context, i10));
    }

    public void setDividerInsetEnd(int i10) {
        this.f20749v = i10;
    }

    public void setDividerInsetEndResource(int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(int i10) {
        this.f20748u = i10;
    }

    public void setDividerInsetStartResource(int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(int i10) {
        if (this.f20746s != i10) {
            this.f20746s = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }
}
