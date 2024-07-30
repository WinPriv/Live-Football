package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class t extends ImageSpan {

    /* renamed from: s, reason: collision with root package name */
    public WeakReference<Drawable> f24158s;

    /* renamed from: t, reason: collision with root package name */
    public int f24159t;

    /* renamed from: u, reason: collision with root package name */
    public int f24160u;

    public t(Context context, Bitmap bitmap, int i10) {
        super(context, bitmap, 2);
        if (gb.u.k()) {
            this.f24159t = 0;
            this.f24160u = i10;
        } else {
            this.f24159t = i10;
            this.f24160u = 0;
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f, int i12, int i13, int i14, Paint paint) {
        Drawable drawable;
        WeakReference<Drawable> weakReference = this.f24158s;
        if (weakReference != null) {
            drawable = weakReference.get();
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = getDrawable();
            this.f24158s = new WeakReference<>(drawable);
        }
        canvas.save();
        canvas.translate(this.f24159t + f, (((i14 - i12) / 2) + i12) - (drawable.getBounds().height() / 2));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return this.f24159t + super.getSize(paint, charSequence, i10, i11, fontMetricsInt) + this.f24160u;
    }

    public t(Drawable drawable, int i10, int i11) {
        super(drawable, 2);
        if (gb.u.k()) {
            this.f24159t = i11;
            this.f24160u = i10;
        } else {
            this.f24159t = i10;
            this.f24160u = i11;
        }
    }
}
