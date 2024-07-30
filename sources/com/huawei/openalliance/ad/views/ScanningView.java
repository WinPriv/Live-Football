package com.huawei.openalliance.ad.views;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.gl;
import com.huawei.hms.ads.splash.R;

/* loaded from: classes2.dex */
public class ScanningView extends View {
    public float A;
    public ValueAnimator B;
    public Animator.AnimatorListener C;

    /* renamed from: s, reason: collision with root package name */
    public final int f24081s;

    /* renamed from: t, reason: collision with root package name */
    public Bitmap f24082t;

    /* renamed from: u, reason: collision with root package name */
    public Bitmap f24083u;

    /* renamed from: v, reason: collision with root package name */
    public Paint f24084v;

    /* renamed from: w, reason: collision with root package name */
    public Paint f24085w;

    /* renamed from: x, reason: collision with root package name */
    public PorterDuffXfermode f24086x;
    public float y;

    /* renamed from: z, reason: collision with root package name */
    public float f24087z;

    public ScanningView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.f24084v = paint;
        paint.setDither(true);
        this.f24084v.setFilterBitmap(true);
        Paint paint2 = new Paint(1);
        this.f24085w = paint2;
        paint2.setDither(true);
        this.f24085w.setStyle(Paint.Style.FILL);
        this.f24085w.setColor(-1);
        this.f24085w.setFilterBitmap(true);
        this.f24086x = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScanningView);
        this.f24081s = obtainStyledAttributes.getResourceId(R.styleable.ScanningView_lightImage, R.drawable.hiad_arrow_scan);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.f24082t == null) {
            return;
        }
        try {
            int saveLayer = canvas.saveLayer(gl.Code, gl.Code, getWidth(), getHeight(), this.f24084v, 31);
            canvas.drawBitmap(this.f24083u, gl.Code, this.y, this.f24084v);
            this.f24084v.setXfermode(this.f24086x);
            canvas.drawBitmap(this.f24082t, gl.Code, gl.Code, this.f24084v);
            this.f24084v.setXfermode(null);
            canvas.restoreToCount(saveLayer);
        } catch (Throwable th) {
            ex.I("ScanningView", "draw exception: %s", th.getClass().getSimpleName());
        }
        super.draw(canvas);
    }

    public Bitmap getSrcBitmap() {
        return this.f24082t;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f24083u = BitmapFactory.decodeResource(getResources(), this.f24081s);
        float f = i11;
        this.f24087z = f;
        this.y = f;
        this.A = -i11;
    }

    public void setAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.C = animatorListener;
    }

    public void setSrcBitmap(Bitmap bitmap) {
        this.f24082t = bitmap;
    }
}
