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
import androidx.appcompat.widget.AppCompatImageButton;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {
    public RectF A;
    public Drawable B;
    public Drawable C;
    public float D;
    public float E;
    public float F;
    public float G;

    /* renamed from: v, reason: collision with root package name */
    public float f1328v;

    /* renamed from: w, reason: collision with root package name */
    public float f1329w;

    /* renamed from: x, reason: collision with root package name */
    public float f1330x;
    public Path y;

    /* renamed from: z, reason: collision with root package name */
    public ViewOutlineProvider f1331z;

    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ImageFilterButton imageFilterButton = ImageFilterButton.this;
            outline.setRoundRect(0, 0, imageFilterButton.getWidth(), imageFilterButton.getHeight(), (Math.min(r3, r4) * imageFilterButton.f1329w) / 2.0f);
        }
    }

    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ImageFilterButton imageFilterButton = ImageFilterButton.this;
            outline.setRoundRect(0, 0, imageFilterButton.getWidth(), imageFilterButton.getHeight(), imageFilterButton.f1330x);
        }
    }

    public final void a() {
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

    public final void b() {
        if (Float.isNaN(this.D) && Float.isNaN(this.E) && Float.isNaN(this.F) && Float.isNaN(this.G)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            a();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getContrast() {
        throw null;
    }

    public float getCrossfade() {
        return this.f1328v;
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
        return this.f1330x;
    }

    public float getRoundPercent() {
        return this.f1329w;
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
        a();
    }

    public void setAltImageResource(int i10) {
        this.B = g.a.a(getContext(), i10).mutate();
        throw null;
    }

    public void setBrightness(float f) {
        throw null;
    }

    public void setContrast(float f) {
        throw null;
    }

    public void setCrossfade(float f) {
        this.f1328v = f;
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.B != null && drawable != null) {
            this.C = drawable.mutate();
            throw null;
        }
        super.setImageDrawable(drawable);
    }

    public void setImagePanX(float f) {
        this.D = f;
        b();
    }

    public void setImagePanY(float f) {
        this.E = f;
        b();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.B == null) {
            super.setImageResource(i10);
        } else {
            this.C = g.a.a(getContext(), i10).mutate();
            throw null;
        }
    }

    public void setImageRotate(float f) {
        this.G = f;
        b();
    }

    public void setImageZoom(float f) {
        this.F = f;
        b();
    }

    public void setRound(float f) {
        boolean z10;
        if (Float.isNaN(f)) {
            this.f1330x = f;
            float f10 = this.f1329w;
            this.f1329w = -1.0f;
            setRoundPercent(f10);
            return;
        }
        if (this.f1330x != f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1330x = f;
        if (f != gl.Code) {
            if (this.y == null) {
                this.y = new Path();
            }
            if (this.A == null) {
                this.A = new RectF();
            }
            if (this.f1331z == null) {
                b bVar = new b();
                this.f1331z = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.A.set(gl.Code, gl.Code, getWidth(), getHeight());
            this.y.reset();
            Path path = this.y;
            RectF rectF = this.A;
            float f11 = this.f1330x;
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
        if (this.f1329w != f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1329w = f;
        if (f != gl.Code) {
            if (this.y == null) {
                this.y = new Path();
            }
            if (this.A == null) {
                this.A = new RectF();
            }
            if (this.f1331z == null) {
                a aVar = new a();
                this.f1331z = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f1329w) / 2.0f;
            this.A.set(gl.Code, gl.Code, width, height);
            this.y.reset();
            this.y.addRoundRect(this.A, min, min, Path.Direction.CW);
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
