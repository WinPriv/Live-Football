package com.huawei.openalliance.ad.views;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.ads.ed;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.gl;
import com.huawei.hms.ads.splash.R;
import com.huawei.openalliance.ad.constant.bj;
import gb.r0;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class ScanningRelativeLayout extends AutoScaleSizeRelativeLayout {

    /* renamed from: c0, reason: collision with root package name */
    public Bitmap f24071c0;

    /* renamed from: d0, reason: collision with root package name */
    public Bitmap f24072d0;

    /* renamed from: e0, reason: collision with root package name */
    public Paint f24073e0;

    /* renamed from: f0, reason: collision with root package name */
    public Paint f24074f0;

    /* renamed from: g0, reason: collision with root package name */
    public float f24075g0;

    /* renamed from: h0, reason: collision with root package name */
    public float f24076h0;

    /* renamed from: i0, reason: collision with root package name */
    public float f24077i0;

    /* renamed from: j0, reason: collision with root package name */
    public ValueAnimator f24078j0;

    /* renamed from: k0, reason: collision with root package name */
    public PorterDuffXfermode f24079k0;
    public int y;

    /* loaded from: classes2.dex */
    public static class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<ScanningRelativeLayout> f24080a;

        public a(ScanningRelativeLayout scanningRelativeLayout) {
            this.f24080a = new WeakReference<>(scanningRelativeLayout);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScanningRelativeLayout scanningRelativeLayout = this.f24080a.get();
            if (scanningRelativeLayout != null && valueAnimator != null) {
                scanningRelativeLayout.setLeft(((Float) valueAnimator.getAnimatedValue()).floatValue());
                scanningRelativeLayout.postInvalidate();
            }
        }
    }

    public ScanningRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void Code() {
        ex.V("ScanningRelativeLayout", bj.b.Code);
        try {
            ValueAnimator valueAnimator = this.f24078j0;
            if (valueAnimator == null) {
                S();
            } else if (valueAnimator.isRunning()) {
                this.f24078j0.cancel();
            }
        } catch (Throwable th) {
            ex.I("ScanningRelativeLayout", "prepare scan exception: %s", th.getClass().getSimpleName());
        }
    }

    public final void S() {
        try {
            ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe(View.TRANSLATION_X, Keyframe.ofFloat(gl.Code, this.f24076h0), Keyframe.ofFloat(1.0f, this.f24077i0)));
            this.f24078j0 = ofPropertyValuesHolder;
            ofPropertyValuesHolder.setInterpolator(new ed(0.2f, gl.Code, 0.2f, 1.0f));
            this.f24078j0.setDuration(1500L);
            this.f24078j0.addUpdateListener(new a(this));
        } catch (Throwable th) {
            ex.I("ScanningRelativeLayout", "init animator exception: %s", th.getClass().getSimpleName());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f24071c0 == null) {
            return;
        }
        try {
            canvas.drawBitmap(this.f24072d0, this.f24075g0, gl.Code, this.f24074f0);
            int saveLayer = canvas.saveLayer(gl.Code, gl.Code, getWidth(), getHeight(), this.f24074f0, 31);
            this.f24074f0.setXfermode(this.f24079k0);
            canvas.drawBitmap(this.f24071c0, gl.Code, gl.Code, this.f24074f0);
            this.f24074f0.setXfermode(null);
            canvas.restoreToCount(saveLayer);
        } catch (Throwable th) {
            ex.I("ScanningRelativeLayout", "dispatchDraw exception: %s", th.getClass().getSimpleName());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f24078j0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f24078j0.cancel();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (getWidth() > 0 && getHeight() > 0) {
            try {
                this.f24071c0 = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(this.f24071c0).drawRoundRect(new RectF(gl.Code, gl.Code, getWidth(), getHeight()), r0.i(getContext(), this.y), r0.i(getContext(), this.y), this.f24073e0);
            } catch (Throwable th) {
                ex.I("ScanningRelativeLayout", "createBitMapException: %s", th.getClass().getSimpleName());
            }
        }
        this.f24077i0 = i10;
    }

    public void setLeft(float f) {
        this.f24075g0 = f;
    }

    public void setRadius(int i10) {
        this.y = i10;
        setRectCornerRadius(r0.i(getContext(), i10));
    }

    public ScanningRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScanningRelativeLayout);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.ScanningRelativeLayout_layoutScanImage, R.drawable.hiad_scan);
        this.y = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ScanningRelativeLayout_layoutRadius, 36);
        obtainStyledAttributes.recycle();
        ex.V("ScanningRelativeLayout", "init");
        try {
            Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), resourceId);
            this.f24072d0 = decodeResource;
            float f = -decodeResource.getWidth();
            this.f24076h0 = f;
            this.f24075g0 = f;
            Paint paint = new Paint(1);
            this.f24074f0 = paint;
            paint.setDither(true);
            this.f24074f0.setFilterBitmap(true);
            Paint paint2 = new Paint(1);
            this.f24073e0 = paint2;
            paint2.setDither(true);
            this.f24073e0.setStyle(Paint.Style.FILL);
            this.f24073e0.setColor(-1);
            this.f24073e0.setFilterBitmap(true);
            this.f24079k0 = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } catch (Throwable th) {
            ex.I("ScanningRelativeLayout", "init exception: %s", th.getClass().getSimpleName());
        }
    }
}
