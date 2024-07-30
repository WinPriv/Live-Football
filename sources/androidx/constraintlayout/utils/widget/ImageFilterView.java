package androidx.constraintlayout.utils.widget;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {
    public Path A;
    public ViewOutlineProvider B;
    public RectF C;
    public float D;
    public float E;
    public float F;
    public float G;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f1334v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f1335w;

    /* renamed from: x, reason: collision with root package name */
    public float f1336x;
    public float y;

    /* renamed from: z, reason: collision with root package name */
    public float f1337z;

    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ImageFilterView imageFilterView = ImageFilterView.this;
            outline.setRoundRect(0, 0, imageFilterView.getWidth(), imageFilterView.getHeight(), (Math.min(r3, r4) * imageFilterView.y) / 2.0f);
        }
    }

    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ImageFilterView imageFilterView = ImageFilterView.this;
            outline.setRoundRect(0, 0, imageFilterView.getWidth(), imageFilterView.getHeight(), imageFilterView.f1337z);
        }
    }

    public final void c() {
        float f;
        float f10;
        float f11;
        float f12;
        if (Float.isNaN(this.D) && Float.isNaN(this.E) && Float.isNaN(this.F) && Float.isNaN(this.G)) {
            return;
        }
        boolean isNaN = Float.isNaN(this.D);
        float f13 = gl.Code;
        if (isNaN) {
            f = 0.0f;
        } else {
            f = this.D;
        }
        if (Float.isNaN(this.E)) {
            f10 = 0.0f;
        } else {
            f10 = this.E;
        }
        if (Float.isNaN(this.F)) {
            f11 = 1.0f;
        } else {
            f11 = this.F;
        }
        if (!Float.isNaN(this.G)) {
            f13 = this.G;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        if (intrinsicWidth * height < intrinsicHeight * width) {
            f12 = width / intrinsicWidth;
        } else {
            f12 = height / intrinsicHeight;
        }
        float f14 = f11 * f12;
        matrix.postScale(f14, f14);
        float f15 = intrinsicWidth * f14;
        float f16 = f14 * intrinsicHeight;
        matrix.postTranslate(((((width - f15) * f) + width) - f15) * 0.5f, ((((height - f16) * f10) + height) - f16) * 0.5f);
        matrix.postRotate(f13, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void d() {
        if (Float.isNaN(this.D) && Float.isNaN(this.E) && Float.isNaN(this.F) && Float.isNaN(this.G)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            c();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getBrightness() {
        throw null;
    }

    public float getContrast() {
        throw null;
    }

    public float getCrossfade() {
        return this.f1336x;
    }

    public float getImagePanX() {
        return this.D;
    }

    public float getImagePanY() {
        return this.E;
    }

    public float getImageRotate() {
        return this.G;
    }

    public float getImageZoom() {
        return this.F;
    }

    public float getRound() {
        return this.f1337z;
    }

    public float getRoundPercent() {
        return this.y;
    }

    public float getSaturation() {
        throw null;
    }

    public float getWarmth() {
        throw null;
    }

    @Override // android.view.View
    public final void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        c();
    }

    public void setAltImageResource(int i10) {
        this.f1334v = g.a.a(getContext(), i10).mutate();
        throw null;
    }

    public void setBrightness(float f) {
        throw null;
    }

    public void setContrast(float f) {
        throw null;
    }

    public void setCrossfade(float f) {
        this.f1336x = f;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f1334v != null && drawable != null) {
            this.f1335w = drawable.mutate();
            throw null;
        }
        super.setImageDrawable(drawable);
    }

    public void setImagePanX(float f) {
        this.D = f;
        d();
    }

    public void setImagePanY(float f) {
        this.E = f;
        d();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.f1334v == null) {
            super.setImageResource(i10);
        } else {
            this.f1335w = g.a.a(getContext(), i10).mutate();
            throw null;
        }
    }

    public void setImageRotate(float f) {
        this.G = f;
        d();
    }

    public void setImageZoom(float f) {
        this.F = f;
        d();
    }

    public void setRound(float f) {
        boolean z10;
        if (Float.isNaN(f)) {
            this.f1337z = f;
            float f10 = this.y;
            this.y = -1.0f;
            setRoundPercent(f10);
            return;
        }
        if (this.f1337z != f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1337z = f;
        if (f != gl.Code) {
            if (this.A == null) {
                this.A = new Path();
            }
            if (this.C == null) {
                this.C = new RectF();
            }
            if (this.B == null) {
                b bVar = new b();
                this.B = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.C.set(gl.Code, gl.Code, getWidth(), getHeight());
            this.A.reset();
            Path path = this.A;
            RectF rectF = this.C;
            float f11 = this.f1337z;
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
        if (this.y != f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.y = f;
        if (f != gl.Code) {
            if (this.A == null) {
                this.A = new Path();
            }
            if (this.C == null) {
                this.C = new RectF();
            }
            if (this.B == null) {
                a aVar = new a();
                this.B = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.y) / 2.0f;
            this.C.set(gl.Code, gl.Code, width, height);
            this.A.reset();
            this.A.addRoundRect(this.C, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        throw null;
    }

    public void setWarmth(float f) {
        throw null;
    }

    private void setOverlay(boolean z10) {
    }
}
