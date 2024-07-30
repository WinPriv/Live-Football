package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.hamkho.livefoot.R;

/* compiled from: CalendarStyle.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f20671a;

    /* renamed from: b, reason: collision with root package name */
    public final a f20672b;

    /* renamed from: c, reason: collision with root package name */
    public final a f20673c;

    /* renamed from: d, reason: collision with root package name */
    public final a f20674d;

    /* renamed from: e, reason: collision with root package name */
    public final a f20675e;
    public final a f;

    /* renamed from: g, reason: collision with root package name */
    public final a f20676g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f20677h;

    public b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(z6.b.c(context, R.attr.materialCalendarStyle, f.class.getCanonicalName()).data, androidx.activity.n.f493e0);
        this.f20671a = a.a(obtainStyledAttributes.getResourceId(3, 0), context);
        this.f20676g = a.a(obtainStyledAttributes.getResourceId(1, 0), context);
        this.f20672b = a.a(obtainStyledAttributes.getResourceId(2, 0), context);
        this.f20673c = a.a(obtainStyledAttributes.getResourceId(4, 0), context);
        ColorStateList a10 = z6.c.a(context, obtainStyledAttributes, 6);
        this.f20674d = a.a(obtainStyledAttributes.getResourceId(8, 0), context);
        this.f20675e = a.a(obtainStyledAttributes.getResourceId(7, 0), context);
        this.f = a.a(obtainStyledAttributes.getResourceId(9, 0), context);
        Paint paint = new Paint();
        this.f20677h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
