package com.facebook.shimmer;

import a3.k;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.huawei.hms.ads.gl;

/* compiled from: ShimmerDrawable.java */
/* loaded from: classes.dex */
public final class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final a f19897a = new a();

    /* renamed from: b, reason: collision with root package name */
    public final Paint f19898b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f19899c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f19900d;

    /* renamed from: e, reason: collision with root package name */
    public ValueAnimator f19901e;
    public com.facebook.shimmer.a f;

    /* compiled from: ShimmerDrawable.java */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.invalidateSelf();
        }
    }

    public b() {
        Paint paint = new Paint();
        this.f19898b = paint;
        this.f19899c = new Rect();
        this.f19900d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        com.facebook.shimmer.a aVar;
        ValueAnimator valueAnimator = this.f19901e;
        if (valueAnimator != null && !valueAnimator.isStarted() && (aVar = this.f) != null && aVar.o && getCallback() != null) {
            this.f19901e.start();
        }
    }

    public final void b() {
        com.facebook.shimmer.a aVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width != 0 && height != 0 && (aVar = this.f) != null) {
            int i10 = aVar.f19883g;
            if (i10 <= 0) {
                i10 = Math.round(aVar.f19885i * width);
            }
            com.facebook.shimmer.a aVar2 = this.f;
            int i11 = aVar2.f19884h;
            if (i11 <= 0) {
                i11 = Math.round(aVar2.f19886j * height);
            }
            com.facebook.shimmer.a aVar3 = this.f;
            boolean z10 = true;
            if (aVar3.f != 1) {
                int i12 = aVar3.f19880c;
                if (i12 != 1 && i12 != 3) {
                    z10 = false;
                }
                if (z10) {
                    i10 = 0;
                }
                if (!z10) {
                    i11 = 0;
                }
                com.facebook.shimmer.a aVar4 = this.f;
                radialGradient = new LinearGradient(gl.Code, gl.Code, i10, i11, aVar4.f19879b, aVar4.f19878a, Shader.TileMode.CLAMP);
            } else {
                float f = i11 / 2.0f;
                float max = (float) (Math.max(i10, i11) / Math.sqrt(2.0d));
                com.facebook.shimmer.a aVar5 = this.f;
                radialGradient = new RadialGradient(i10 / 2.0f, f, max, aVar5.f19879b, aVar5.f19878a, Shader.TileMode.CLAMP);
            }
            this.f19898b.setShader(radialGradient);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float d10;
        float d11;
        if (this.f != null) {
            Paint paint = this.f19898b;
            if (paint.getShader() != null) {
                float tan = (float) Math.tan(Math.toRadians(this.f.f19889m));
                Rect rect = this.f19899c;
                float width = (rect.width() * tan) + rect.height();
                float height = (tan * rect.height()) + rect.width();
                ValueAnimator valueAnimator = this.f19901e;
                float f10 = gl.Code;
                if (valueAnimator != null) {
                    f = valueAnimator.getAnimatedFraction();
                } else {
                    f = 0.0f;
                }
                int i10 = this.f.f19880c;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            float f11 = -height;
                            d11 = k.d(height, f11, f, f11);
                        } else {
                            d10 = k.d(-width, width, f, width);
                        }
                    } else {
                        d11 = k.d(-height, height, f, height);
                    }
                    f10 = d11;
                    d10 = 0.0f;
                } else {
                    float f12 = -width;
                    d10 = k.d(width, f12, f, f12);
                }
                Matrix matrix = this.f19900d;
                matrix.reset();
                matrix.setRotate(this.f.f19889m, rect.width() / 2.0f, rect.height() / 2.0f);
                matrix.postTranslate(f10, d10);
                paint.getShader().setLocalMatrix(matrix);
                canvas.drawRect(rect, paint);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        com.facebook.shimmer.a aVar = this.f;
        if (aVar != null && (aVar.f19890n || aVar.f19891p)) {
            return -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f19899c.set(0, 0, rect.width(), rect.height());
        b();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
