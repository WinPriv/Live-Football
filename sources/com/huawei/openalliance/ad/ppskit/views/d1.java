package com.huawei.openalliance.ad.ppskit.views;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class d1 extends ImageSpan {

    /* renamed from: s, reason: collision with root package name */
    public WeakReference<Drawable> f23415s;

    /* renamed from: t, reason: collision with root package name */
    public int f23416t;

    /* renamed from: u, reason: collision with root package name */
    public int f23417u;

    public d1(BitmapDrawable bitmapDrawable, int i10) {
        super(bitmapDrawable, 2);
        if (z1.D()) {
            this.f23416t = i10;
            this.f23417u = 0;
        } else {
            this.f23416t = 0;
            this.f23417u = i10;
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f, int i12, int i13, int i14, Paint paint) {
        Drawable drawable;
        WeakReference<Drawable> weakReference = this.f23415s;
        if (weakReference != null) {
            drawable = weakReference.get();
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = getDrawable();
            this.f23415s = new WeakReference<>(drawable);
        }
        canvas.save();
        canvas.translate(this.f23416t + f, (((i14 - i12) / 2) + i12) - (drawable.getBounds().height() / 2));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return this.f23416t + super.getSize(paint, charSequence, i10, i11, fontMetricsInt) + this.f23417u;
    }
}
