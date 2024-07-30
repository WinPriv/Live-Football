package com.huawei.openalliance.ad.ppskit.views;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import ka.n7;

/* loaded from: classes2.dex */
public final class g1 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public Paint f23429a;

    /* renamed from: b, reason: collision with root package name */
    public float f23430b;

    /* renamed from: c, reason: collision with root package name */
    public float f23431c;

    /* renamed from: d, reason: collision with root package name */
    public float f23432d;

    /* renamed from: e, reason: collision with root package name */
    public float f23433e;
    public final int f = 1728053247;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23434g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f23435h;

    /* renamed from: i, reason: collision with root package name */
    public long f23436i;

    /* renamed from: j, reason: collision with root package name */
    public final float f23437j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23438k;

    public g1(float f) {
        this.f23437j = f;
        Paint paint = new Paint();
        this.f23429a = paint;
        paint.setAntiAlias(true);
        this.f23429a.setStyle(Paint.Style.FILL);
        this.f23430b = gl.Code;
        this.f23432d = gl.Code;
        this.f23435h = 2;
        this.f23438k = z1.N();
    }

    public final void a() {
        if (n7.d()) {
            n7.b("HwFlickerDrawable", "start()");
        }
        if (this.f23435h == 0) {
            return;
        }
        this.f23436i = System.currentTimeMillis();
        invalidateSelf();
        this.f23435h = 0;
    }

    public final void b(float f, float f10) {
        float f11 = f10 - f;
        this.f23430b = f11;
        this.f23431c = (f11 * getLevel()) / 10000.0f;
        float f12 = this.f23430b * 0.3f;
        this.f23432d = f12;
        this.f23433e = -f12;
        int i10 = this.f;
        int i11 = 16777215 & i10;
        this.f23429a.setShader(new LinearGradient(gl.Code, gl.Code, this.f23432d, gl.Code, new int[]{i11, i10, i11}, new float[]{gl.Code, 0.93f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        float f;
        if (this.f23435h == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        float f10 = (this.f23432d + this.f23431c) / 2000.0f;
        if (this.f23434g) {
            this.f23434g = false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f23436i;
        this.f23436i = currentTimeMillis;
        if (j10 < 0) {
            j10 = 0;
        }
        float f11 = this.f23433e + (f10 * ((float) j10));
        if (Float.compare(f11, this.f23431c) > 0) {
            int i10 = (int) this.f23431c;
            if (i10 != 0) {
                f11 = (f11 % i10) - this.f23432d;
            }
            this.f23434g = true;
        }
        this.f23433e = f11;
        Rect bounds = getBounds();
        float f12 = this.f23437j;
        if (Float.compare(f12, gl.Code) > 0) {
            RectF rectF = new RectF();
            rectF.set(bounds);
            Path path = new Path();
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
            canvas.clipPath(path);
        }
        if (this.f23438k) {
            canvas.scale(-1.0f, 1.0f, bounds.width() / 2.0f, bounds.height() / 2.0f);
        }
        canvas.save();
        canvas.translate(f11, gl.Code);
        if (Float.compare(this.f23432d + f11, this.f23431c) > 0) {
            f = this.f23431c - f11;
        } else {
            f = this.f23432d;
        }
        if (Float.compare(f11, gl.Code) < 0) {
            float f13 = bounds.left - f11;
            canvas.clipRect(f13, bounds.top, f13 + f, bounds.bottom);
        }
        float f14 = bounds.left;
        canvas.drawRect(f14, bounds.top, f14 + f, bounds.bottom, this.f23429a);
        canvas.restore();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        this.f23431c = (this.f23430b * i10) / 10000.0f;
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        b(i10, i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        b(rect.left, rect.right);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
