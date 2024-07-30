package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import d7.g;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* compiled from: CalendarItemStyle.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f20665a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f20666b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f20667c;

    /* renamed from: d, reason: collision with root package name */
    public final ColorStateList f20668d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20669e;
    public final d7.j f;

    public a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, d7.j jVar, Rect rect) {
        a0.a.w0(rect.left);
        a0.a.w0(rect.top);
        a0.a.w0(rect.right);
        a0.a.w0(rect.bottom);
        this.f20665a = rect;
        this.f20666b = colorStateList2;
        this.f20667c = colorStateList;
        this.f20668d = colorStateList3;
        this.f20669e = i10;
        this.f = jVar;
    }

    public static a a(int i10, Context context) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a0.a.u0(z10, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, androidx.activity.n.f494f0);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList a10 = z6.c.a(context, obtainStyledAttributes, 4);
        ColorStateList a11 = z6.c.a(context, obtainStyledAttributes, 9);
        ColorStateList a12 = z6.c.a(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        d7.j jVar = new d7.j(d7.j.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new d7.a(0)));
        obtainStyledAttributes.recycle();
        return new a(a10, a11, a12, dimensionPixelSize, jVar, rect);
    }

    public final void b(TextView textView) {
        d7.g gVar = new d7.g();
        d7.g gVar2 = new d7.g();
        d7.j jVar = this.f;
        gVar.setShapeAppearanceModel(jVar);
        gVar2.setShapeAppearanceModel(jVar);
        gVar.k(this.f20667c);
        gVar.f27403s.f27420k = this.f20669e;
        gVar.invalidateSelf();
        g.b bVar = gVar.f27403s;
        ColorStateList colorStateList = bVar.f27414d;
        ColorStateList colorStateList2 = this.f20668d;
        if (colorStateList != colorStateList2) {
            bVar.f27414d = colorStateList2;
            gVar.onStateChange(gVar.getState());
        }
        ColorStateList colorStateList3 = this.f20666b;
        textView.setTextColor(colorStateList3);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), gVar, gVar2);
        Rect rect = this.f20665a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
        c0.d.q(textView, insetDrawable);
    }
}
