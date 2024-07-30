package com.huawei.openalliance.ad.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.huawei.hms.ads.base.R;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.gl;
import gb.r0;

/* loaded from: classes2.dex */
public class PPSCircleProgressBar extends View {
    public int A;
    public float B;
    public int C;
    public Paint D;
    public String E;
    public Rect F;
    public int G;
    public ValueAnimator H;

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f23828s;

    /* renamed from: t, reason: collision with root package name */
    public int f23829t;

    /* renamed from: u, reason: collision with root package name */
    public float f23830u;

    /* renamed from: v, reason: collision with root package name */
    public int f23831v;

    /* renamed from: w, reason: collision with root package name */
    public int f23832w;

    /* renamed from: x, reason: collision with root package name */
    public int f23833x;
    public float y;

    /* renamed from: z, reason: collision with root package name */
    public float f23834z;

    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            PPSCircleProgressBar pPSCircleProgressBar = PPSCircleProgressBar.this;
            pPSCircleProgressBar.B = floatValue;
            pPSCircleProgressBar.postInvalidate();
        }
    }

    public PPSCircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String str;
        String str2;
        Resources resources;
        byte[] bArr = new byte[0];
        this.f23828s = bArr;
        synchronized (bArr) {
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.hiad_circle);
                try {
                    try {
                        resources = getResources();
                    } catch (UnsupportedOperationException unused) {
                        str = "PPSCircleProgressBar";
                        str2 = "initButtonAttr UnsupportedOperationException";
                        ex.I(str, str2);
                    } catch (RuntimeException unused2) {
                        str = "PPSCircleProgressBar";
                        str2 = "initButtonAttr RuntimeException";
                        ex.I(str, str2);
                    } catch (Throwable th) {
                        ex.I("PPSCircleProgressBar", "initButtonAttr error: ".concat(th.getClass().getSimpleName()));
                    }
                    if (resources == null) {
                        ex.I("PPSCircleProgressBar", "init attr, resource is null");
                        obtainStyledAttributes.recycle();
                    } else {
                        this.f23829t = obtainStyledAttributes.getColor(R.styleable.hiad_circle_progress_outerColor, resources.getColor(R.color.hiad_circle_outer));
                        this.f23830u = obtainStyledAttributes.getDimension(R.styleable.hiad_circle_progress_outerRadius, resources.getDimension(R.dimen.hiad_24_dp));
                        this.f23831v = obtainStyledAttributes.getColor(R.styleable.hiad_circle_progress_innerColor, resources.getColor(R.color.hiad_circle_inner));
                        this.f23833x = obtainStyledAttributes.getColor(R.styleable.hiad_circle_progress_textColor, resources.getColor(R.color.hiad_circle_text));
                        this.f23832w = obtainStyledAttributes.getColor(R.styleable.hiad_circle_progress_fillColor, resources.getColor(R.color.hiad_circle_fill));
                        this.y = obtainStyledAttributes.getDimension(R.styleable.hiad_circle_progress_textSize, r0.m(context, 18.0f));
                        this.f23834z = obtainStyledAttributes.getDimension(R.styleable.hiad_circle_progress_progressWidth, r0.i(context, 2.0f));
                        this.B = obtainStyledAttributes.getFloat(R.styleable.hiad_circle_progress_progress, gl.Code);
                        this.A = obtainStyledAttributes.getInt(R.styleable.hiad_circle_progress_maxProgress, 100);
                        this.C = obtainStyledAttributes.getInt(R.styleable.hiad_circle_progress_startPoint, 3);
                        obtainStyledAttributes.recycle();
                        this.D = new Paint();
                    }
                } catch (Throwable th2) {
                    obtainStyledAttributes.recycle();
                    throw th2;
                }
            }
        }
        float f = this.y;
        Paint paint = new Paint();
        paint.setTextSize(f);
        Rect rect = new Rect();
        paint.getTextBounds("...", 0, 3, rect);
        this.G = rect.width();
    }

    private int getPaddingSize() {
        int paddingStart = getPaddingStart();
        if (paddingStart <= 0) {
            paddingStart = getPaddingLeft();
        }
        int paddingEnd = getPaddingEnd();
        if (paddingEnd <= 0) {
            paddingEnd = getPaddingRight();
        }
        return paddingStart + paddingEnd;
    }

    private int getProgressBarSize() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int width = getWidth();
        if (width <= 0) {
            return layoutParams.width;
        }
        return width;
    }

    public final float a(String str, float f) {
        int paddingSize = getPaddingSize();
        int progressBarSize = getProgressBarSize();
        int b10 = r0.b(getContext(), f);
        while (b10 > 10 && !b(b10, paddingSize, progressBarSize, str)) {
            b10--;
        }
        if (b10 <= 10 && !b(b10, paddingSize, progressBarSize, str)) {
            String str2 = this.E;
            int width = this.F.width() + getPaddingSize();
            int progressBarSize2 = getProgressBarSize();
            int length = getCurrentText().length();
            int ceil = (int) Math.ceil(((width - progressBarSize2) / this.F.width()) * length);
            int ceil2 = (int) Math.ceil((this.G * length) / this.F.width());
            int i10 = length - ceil;
            if (i10 - ceil2 > 0) {
                str2 = str2.toString().substring(0, length - (ceil + ceil2)) + "...";
            } else if (i10 > 0) {
                str2 = str2.toString().substring(0, i10);
            }
            this.E = str2;
            this.D.getTextBounds(str.toString(), 0, str.length(), this.F);
        }
        float m10 = r0.m(getContext(), b10);
        Paint paint = new Paint();
        paint.setTextSize(m10);
        Rect rect = new Rect();
        paint.getTextBounds("...", 0, 3, rect);
        this.G = rect.width();
        return m10;
    }

    public final boolean b(int i10, int i11, int i12, String str) {
        float m10 = r0.m(getContext(), i10);
        if (i12 < 0) {
            return true;
        }
        this.D.setTextSize(m10);
        this.D.getTextBounds(str.toString(), 0, str.length(), this.F);
        if (this.F.width() + i11 <= i12) {
            return true;
        }
        return false;
    }

    public final void c(float f) {
        synchronized (this.f23828s) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.B, f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new a());
            this.H.setDuration(1000L);
            this.H.setInterpolator(new LinearInterpolator());
            this.H.start();
        }
    }

    public String getCurrentText() {
        String str;
        synchronized (this.f23828s) {
            if (TextUtils.isEmpty(this.E)) {
                str = "";
            } else {
                str = this.E;
            }
        }
        return str;
    }

    public int getInnerColor() {
        int i10;
        synchronized (this.f23828s) {
            i10 = this.f23831v;
        }
        return i10;
    }

    public int getMaxProgress() {
        int i10;
        synchronized (this.f23828s) {
            i10 = this.A;
        }
        return i10;
    }

    public int getOuterColor() {
        int i10;
        synchronized (this.f23828s) {
            i10 = this.f23829t;
        }
        return i10;
    }

    public float getOuterRadius() {
        float f;
        synchronized (this.f23828s) {
            f = this.f23830u;
        }
        return f;
    }

    public float getProgress() {
        float f;
        synchronized (this.f23828s) {
            f = this.B;
        }
        return f;
    }

    public float getProgressWidth() {
        float f;
        synchronized (this.f23828s) {
            f = this.f23834z;
        }
        return f;
    }

    public int getStartPoint() {
        int i10;
        synchronized (this.f23828s) {
            i10 = this.C;
        }
        return i10;
    }

    public int getTextColor() {
        int i10;
        synchronized (this.f23828s) {
            i10 = this.f23833x;
        }
        return i10;
    }

    public float getTextSize() {
        float f;
        synchronized (this.f23828s) {
            f = this.y;
        }
        return f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        boolean z10;
        synchronized (this.f23828s) {
            try {
                super.onDraw(canvas);
                int width = getWidth() / 2;
                this.D.setColor(this.f23832w);
                this.D.setStyle(Paint.Style.FILL);
                this.D.setAntiAlias(true);
                float f = width;
                canvas.drawCircle(f, f, this.f23830u, this.D);
                this.D.setColor(this.f23831v);
                this.D.setStyle(Paint.Style.STROKE);
                this.D.setStrokeWidth(this.f23834z);
                this.D.setAntiAlias(true);
                canvas.drawCircle(f, f, this.f23830u, this.D);
                this.D.setColor(this.f23829t);
                float f10 = this.f23830u;
                float f11 = f - f10;
                float f12 = f + f10;
                RectF rectF = new RectF(f11, f11, f12, f12);
                int i11 = this.C;
                int[] d10 = s.f.d(4);
                int length = d10.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length) {
                        i10 = d10[i12];
                        if (s.f.c(i10) == i11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            break;
                        } else {
                            i12++;
                        }
                    } else {
                        i10 = 3;
                        break;
                    }
                }
                canvas.drawArc(rectF, a3.l.d(i10), (this.B / this.A) * 360.0f, false, this.D);
                this.F = new Rect();
                this.D.setColor(this.f23833x);
                this.D.setStyle(Paint.Style.FILL);
                this.D.setTextSize(a(this.E, this.y));
                this.D.setStrokeWidth(gl.Code);
                String currentText = getCurrentText();
                this.E = currentText;
                this.D.getTextBounds(currentText, 0, currentText.length(), this.F);
                this.D.setTextAlign(Paint.Align.LEFT);
                Paint.FontMetricsInt fontMetricsInt = this.D.getFontMetricsInt();
                int measuredHeight = getMeasuredHeight() - fontMetricsInt.bottom;
                int i13 = fontMetricsInt.top;
                canvas.drawText(this.E, (getMeasuredWidth() / 2) - (this.F.width() / 2), ((measuredHeight + i13) / 2) - i13, this.D);
            } catch (Throwable unused) {
                ex.I("PPSCircleProgressBar", "onDraw error.");
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        synchronized (this.f23828s) {
            try {
                int size = View.MeasureSpec.getSize(i10);
                if (View.MeasureSpec.getMode(i10) != 1073741824) {
                    size = (int) ((this.f23830u * 2.0f) + this.f23834z);
                }
                int size2 = View.MeasureSpec.getSize(i11);
                if (View.MeasureSpec.getMode(i11) != 1073741824) {
                    size2 = (int) ((this.f23830u * 2.0f) + this.f23834z);
                }
                setMeasuredDimension(size, size2);
            } catch (Throwable unused) {
                ex.I("PPSCircleProgressBar", "onMeasure error.");
            }
        }
    }

    public void setCurrentText(String str) {
        synchronized (this.f23828s) {
            this.E = str;
        }
    }

    public void setInnerColor(int i10) {
        synchronized (this.f23828s) {
            this.f23831v = i10;
        }
    }

    public void setMaxProgress(int i10) {
        synchronized (this.f23828s) {
            this.A = i10;
        }
    }

    public void setOuterColor(int i10) {
        synchronized (this.f23828s) {
            this.f23829t = i10;
        }
    }

    public void setOuterRadius(float f) {
        synchronized (this.f23828s) {
            this.f23830u = f;
        }
    }

    public void setProgress(float f) {
        synchronized (this.f23828s) {
            if (f < gl.Code) {
                f = 0.0f;
            }
            int i10 = this.A;
            if (f > i10) {
                f = i10;
            }
            synchronized (this.f23828s) {
                c(f);
            }
        }
    }

    public void setProgressWidth(float f) {
        synchronized (this.f23828s) {
            this.f23834z = f;
        }
    }

    public void setStartPoint(int i10) {
        synchronized (this.f23828s) {
            this.C = i10;
        }
    }

    public void setTextColor(int i10) {
        synchronized (this.f23828s) {
            this.f23833x = i10;
        }
    }

    public void setTextSize(float f) {
        synchronized (this.f23828s) {
            this.y = f;
        }
    }
}
