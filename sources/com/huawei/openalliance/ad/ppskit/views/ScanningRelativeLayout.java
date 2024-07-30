package com.huawei.openalliance.ad.ppskit.views;

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
import android.widget.RelativeLayout;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.lang.ref.WeakReference;
import ka.n7;
import ka.t6;
import ka.zi;

/* loaded from: classes2.dex */
public class ScanningRelativeLayout extends AutoScaleSizeRelativeLayout implements zi {
    public Paint A;
    public Paint B;
    public float C;
    public float D;
    public float E;
    public ValueAnimator F;
    public PorterDuffXfermode G;
    public boolean H;
    public boolean I;

    /* renamed from: x, reason: collision with root package name */
    public int f23334x;
    public Bitmap y;

    /* renamed from: z, reason: collision with root package name */
    public Bitmap f23335z;

    /* loaded from: classes2.dex */
    public static class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<ScanningRelativeLayout> f23336a;

        public a(ScanningRelativeLayout scanningRelativeLayout) {
            this.f23336a = new WeakReference<>(scanningRelativeLayout);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScanningRelativeLayout scanningRelativeLayout = this.f23336a.get();
            if (scanningRelativeLayout != null && valueAnimator != null) {
                scanningRelativeLayout.setLeft(((Float) valueAnimator.getAnimatedValue()).floatValue());
                scanningRelativeLayout.postInvalidate();
            }
        }
    }

    public ScanningRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.H = false;
        this.I = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.f18o0);
        int resourceId = obtainStyledAttributes.getResourceId(1, R.drawable.hiad_scan);
        this.f23334x = obtainStyledAttributes.getDimensionPixelOffset(0, 36);
        obtainStyledAttributes.recycle();
        n7.e("ScanningRelativeLayout", "init");
        try {
            Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), resourceId);
            this.f23335z = decodeResource;
            float f = -decodeResource.getWidth();
            this.D = f;
            this.C = f;
            Paint paint = new Paint(1);
            this.B = paint;
            paint.setDither(true);
            this.B.setFilterBitmap(true);
            Paint paint2 = new Paint(1);
            this.A = paint2;
            paint2.setDither(true);
            this.A.setStyle(Paint.Style.FILL);
            this.A.setColor(-1);
            this.A.setFilterBitmap(true);
            this.G = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } catch (Throwable th) {
            n7.h("ScanningRelativeLayout", "init exception: %s", th.getClass().getSimpleName());
        }
    }

    @Override // ka.zi
    public final void b() {
        n7.e("ScanningRelativeLayout", "stop");
        try {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.F.cancel();
            }
        } catch (Throwable th) {
            n7.h("ScanningRelativeLayout", "cancel animation exception: %s", th.getClass().getSimpleName());
        }
        this.C = this.D;
        postInvalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.y == null) {
            return;
        }
        try {
            canvas.drawBitmap(this.f23335z, this.C, gl.Code, this.B);
            int saveLayer = canvas.saveLayer(gl.Code, gl.Code, getWidth(), getHeight(), this.B, 31);
            this.B.setXfermode(this.G);
            canvas.drawBitmap(this.y, gl.Code, gl.Code, this.B);
            this.B.setXfermode(null);
            canvas.restoreToCount(saveLayer);
        } catch (Throwable th) {
            n7.h("ScanningRelativeLayout", "dispatchDraw exception: %s", th.getClass().getSimpleName());
        }
    }

    @Override // ka.zi
    public final boolean e() {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator == null) {
            return false;
        }
        return valueAnimator.isRunning();
    }

    public final void g() {
        try {
            ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe(View.TRANSLATION_X, Keyframe.ofFloat(gl.Code, this.D), Keyframe.ofFloat(1.0f, this.E)));
            this.F = ofPropertyValuesHolder;
            ofPropertyValuesHolder.setInterpolator(new t6(0.2f, 0.2f));
            this.F.setDuration(1500L);
            if (this.H) {
                this.F.setRepeatCount(-1);
            }
            this.F.addUpdateListener(new a(this));
        } catch (Throwable th) {
            n7.h("ScanningRelativeLayout", "init animator exception: %s", th.getClass().getSimpleName());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.F.cancel();
            }
        } catch (Throwable th) {
            n7.h("ScanningRelativeLayout", "animator cancel exception: %s", th.getClass().getSimpleName());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        ValueAnimator valueAnimator;
        super.onSizeChanged(i10, i11, i12, i13);
        n7.e("ScanningRelativeLayout", "onSizeChanged");
        if (getWidth() > 0 && getHeight() > 0) {
            try {
                this.y = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(this.y).drawRoundRect(new RectF(gl.Code, gl.Code, getWidth(), getHeight()), com.huawei.openalliance.ad.ppskit.utils.d0.b(getContext(), this.f23334x), com.huawei.openalliance.ad.ppskit.utils.d0.b(getContext(), this.f23334x), this.A);
            } catch (Throwable th) {
                n7.h("ScanningRelativeLayout", "createBitMapException: %s", th.getClass().getSimpleName());
            }
        }
        this.E = i10;
        if (!this.I && this.H && (valueAnimator = this.F) != null) {
            boolean isRunning = valueAnimator.isRunning();
            if (isRunning) {
                this.F.cancel();
            }
            this.F = null;
            g();
            ValueAnimator valueAnimator2 = this.F;
            if (valueAnimator2 != null && isRunning) {
                valueAnimator2.start();
            }
        }
        if (i10 != 0 && i11 != 0) {
            this.I = false;
        }
    }

    @Override // ka.zi
    public final void p(RelativeLayout relativeLayout, ContentRecord contentRecord) {
        n7.e("ScanningRelativeLayout", "start");
        post(new a1(this));
    }

    @Override // ka.zi
    public void setAutoRepeat(boolean z10) {
        this.H = z10;
    }

    public void setLeft(float f) {
        this.C = f;
    }

    public void setRadius(int i10) {
        this.f23334x = i10;
        setRectCornerRadius(com.huawei.openalliance.ad.ppskit.utils.d0.b(getContext(), i10));
    }
}
