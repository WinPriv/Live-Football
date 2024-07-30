package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class MotionLabel extends View {
    public float A;
    public String B;
    public int C;
    public int D;
    public int E;
    public Matrix F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;

    /* renamed from: s, reason: collision with root package name */
    public Path f1346s;

    /* renamed from: t, reason: collision with root package name */
    public int f1347t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1348u;

    /* renamed from: v, reason: collision with root package name */
    public float f1349v;

    /* renamed from: w, reason: collision with root package name */
    public float f1350w;

    /* renamed from: x, reason: collision with root package name */
    public ViewOutlineProvider f1351x;
    public RectF y;

    /* renamed from: z, reason: collision with root package name */
    public float f1352z;

    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            MotionLabel motionLabel = MotionLabel.this;
            outline.setRoundRect(0, 0, motionLabel.getWidth(), motionLabel.getHeight(), (Math.min(r3, r4) * motionLabel.f1349v) / 2.0f);
        }
    }

    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            MotionLabel motionLabel = MotionLabel.this;
            outline.setRoundRect(0, 0, motionLabel.getWidth(), motionLabel.getHeight(), motionLabel.f1350w);
        }
    }

    private float getHorizontalOffset() {
        Float.isNaN(this.A);
        this.B.length();
        throw null;
    }

    private float getVerticalOffset() {
        Float.isNaN(this.A);
        throw null;
    }

    public final void a() {
        Float.isNaN(this.K);
        Float.isNaN(this.L);
        Float.isNaN(this.M);
        Float.isNaN(this.N);
        throw null;
    }

    public float getRound() {
        return this.f1350w;
    }

    public float getRoundPercent() {
        return this.f1349v;
    }

    public float getScaleFromTextSize() {
        return this.A;
    }

    public float getTextBackgroundPanX() {
        return this.K;
    }

    public float getTextBackgroundPanY() {
        return this.L;
    }

    public float getTextBackgroundRotate() {
        return this.N;
    }

    public float getTextBackgroundZoom() {
        return this.M;
    }

    public int getTextOutlineColor() {
        return this.f1347t;
    }

    public float getTextPanX() {
        return this.I;
    }

    public float getTextPanY() {
        return this.J;
    }

    public float getTextureHeight() {
        return this.G;
    }

    public float getTextureWidth() {
        return this.H;
    }

    public Typeface getTypeface() {
        throw null;
    }

    @Override // android.view.View
    public final void layout(int i10, int i11, int i12, int i13) {
        float f;
        super.layout(i10, i11, i12, i13);
        boolean isNaN = Float.isNaN(this.A);
        if (isNaN) {
            f = 1.0f;
        } else {
            f = this.f1352z / this.A;
        }
        boolean z10 = this.f1348u;
        if (z10 || !isNaN) {
            if (!z10 && f == 1.0f) {
                return;
            }
            this.f1346s.reset();
            this.B.length();
            throw null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        if (Float.isNaN(this.A)) {
            f = 1.0f;
        } else {
            f = this.f1352z / this.A;
        }
        super.onDraw(canvas);
        if (!this.f1348u && f == 1.0f) {
            canvas.drawText(this.B, gl.Code + this.C + getHorizontalOffset(), this.D + getVerticalOffset(), null);
            return;
        }
        if (this.F == null) {
            this.F = new Matrix();
        }
        if (this.f1348u) {
            throw null;
        }
        float horizontalOffset = this.C + getHorizontalOffset();
        float verticalOffset = this.D + getVerticalOffset();
        this.F.reset();
        this.F.preTranslate(horizontalOffset, verticalOffset);
        this.f1346s.transform(this.F);
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.C = getPaddingLeft();
        getPaddingRight();
        this.D = getPaddingTop();
        getPaddingBottom();
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
        } else {
            this.B.getClass();
            throw null;
        }
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i10) {
        if ((i10 & 8388615) == 0) {
            i10 |= 8388611;
        }
        if ((i10 & 112) == 0) {
            i10 |= 48;
        }
        if (i10 != this.E) {
            invalidate();
        }
        this.E = i10;
        int i11 = i10 & 112;
        if (i11 != 48) {
            if (i11 != 80) {
                this.J = gl.Code;
            } else {
                this.J = 1.0f;
            }
        } else {
            this.J = -1.0f;
        }
        int i12 = i10 & 8388615;
        if (i12 != 3) {
            if (i12 != 5) {
                if (i12 != 8388611) {
                    if (i12 != 8388613) {
                        this.I = gl.Code;
                        return;
                    }
                }
            }
            this.I = 1.0f;
            return;
        }
        this.I = -1.0f;
    }

    public void setRound(float f) {
        boolean z10;
        if (Float.isNaN(f)) {
            this.f1350w = f;
            float f10 = this.f1349v;
            this.f1349v = -1.0f;
            setRoundPercent(f10);
            return;
        }
        if (this.f1350w != f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1350w = f;
        if (f != gl.Code) {
            if (this.f1346s == null) {
                this.f1346s = new Path();
            }
            if (this.y == null) {
                this.y = new RectF();
            }
            if (this.f1351x == null) {
                b bVar = new b();
                this.f1351x = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.y.set(gl.Code, gl.Code, getWidth(), getHeight());
            this.f1346s.reset();
            Path path = this.f1346s;
            RectF rectF = this.y;
            float f11 = this.f1350w;
            path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z10;
        if (this.f1349v != f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1349v = f;
        if (f != gl.Code) {
            if (this.f1346s == null) {
                this.f1346s = new Path();
            }
            if (this.y == null) {
                this.y = new RectF();
            }
            if (this.f1351x == null) {
                a aVar = new a();
                this.f1351x = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f1349v) / 2.0f;
            this.y.set(gl.Code, gl.Code, width, height);
            this.f1346s.reset();
            this.f1346s.addRoundRect(this.y, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f) {
        this.A = f;
    }

    public void setText(CharSequence charSequence) {
        this.B = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.K = f;
        a();
        throw null;
    }

    public void setTextBackgroundPanY(float f) {
        this.L = f;
        a();
        throw null;
    }

    public void setTextBackgroundRotate(float f) {
        this.N = f;
        a();
        throw null;
    }

    public void setTextBackgroundZoom(float f) {
        this.M = f;
        a();
        throw null;
    }

    public void setTextFillColor(int i10) {
        invalidate();
    }

    public void setTextOutlineColor(int i10) {
        this.f1347t = i10;
        this.f1348u = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f) {
        this.f1348u = true;
        if (Float.isNaN(f)) {
            this.f1348u = false;
        }
        invalidate();
    }

    public void setTextPanX(float f) {
        this.I = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        this.J = f;
        invalidate();
    }

    public void setTextSize(float f) {
        this.f1352z = f;
        Log.v("MotionLabel", w.a.a() + "  " + f + " / " + this.A);
        Float.isNaN(this.A);
        throw null;
    }

    public void setTextureHeight(float f) {
        this.G = f;
        a();
        throw null;
    }

    public void setTextureWidth(float f) {
        this.H = f;
        a();
        throw null;
    }

    public void setTypeface(Typeface typeface) {
        throw null;
    }
}
