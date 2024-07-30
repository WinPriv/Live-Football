package com.huawei.openalliance.ad.views;

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

/* loaded from: classes2.dex */
public final class w extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public Paint f24161a;

    /* renamed from: b, reason: collision with root package name */
    public float f24162b;

    /* renamed from: c, reason: collision with root package name */
    public float f24163c;

    /* renamed from: d, reason: collision with root package name */
    public float f24164d;

    /* renamed from: e, reason: collision with root package name */
    public float f24165e;
    public final int f = 1728053247;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24166g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f24167h;

    /* renamed from: i, reason: collision with root package name */
    public long f24168i;

    /* renamed from: j, reason: collision with root package name */
    public final float f24169j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f24170k;

    public w(float f) {
        this.f24169j = f;
        Paint paint = new Paint();
        this.f24161a = paint;
        paint.setAntiAlias(true);
        this.f24161a.setStyle(Paint.Style.FILL);
        this.f24162b = gl.Code;
        this.f24164d = gl.Code;
        this.f24167h = 2;
        this.f24170k = gb.u.b();
    }

    public final void a(float f, float f10) {
        float f11 = f10 - f;
        this.f24162b = f11;
        this.f24163c = (f11 * getLevel()) / 10000.0f;
        float f12 = this.f24162b * 0.3f;
        this.f24164d = f12;
        this.f24165e = -f12;
        int i10 = this.f;
        int i11 = 16777215 & i10;
        this.f24161a.setShader(new LinearGradient(gl.Code, gl.Code, this.f24164d, gl.Code, new int[]{i11, i10, i11}, new float[]{gl.Code, 0.93f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        float f;
        if (this.f24167h == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        float f10 = (this.f24164d + this.f24163c) / 2000.0f;
        if (this.f24166g) {
            this.f24166g = false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f24168i;
        this.f24168i = currentTimeMillis;
        if (j10 < 0) {
            j10 = 0;
        }
        float f11 = this.f24165e + (f10 * ((float) j10));
        if (Float.compare(f11, this.f24163c) > 0) {
            int i10 = (int) this.f24163c;
            if (i10 != 0) {
                f11 = (f11 % i10) - this.f24164d;
            }
            this.f24166g = true;
        }
        this.f24165e = f11;
        Rect bounds = getBounds();
        float f12 = this.f24169j;
        if (Float.compare(f12, gl.Code) > 0) {
            RectF rectF = new RectF();
            rectF.set(bounds);
            Path path = new Path();
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
            canvas.clipPath(path);
        }
        if (this.f24170k) {
            canvas.scale(-1.0f, 1.0f, bounds.width() / 2.0f, bounds.height() / 2.0f);
        }
        canvas.save();
        canvas.translate(f11, gl.Code);
        if (Float.compare(this.f24164d + f11, this.f24163c) > 0) {
            f = this.f24163c - f11;
        } else {
            f = this.f24164d;
        }
        if (Float.compare(f11, gl.Code) < 0) {
            float f13 = bounds.left - f11;
            canvas.clipRect(f13, bounds.top, f13 + f, bounds.bottom);
        }
        float f14 = bounds.left;
        canvas.drawRect(f14, bounds.top, f14 + f, bounds.bottom, this.f24161a);
        canvas.restore();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        this.f24163c = (this.f24162b * i10) / 10000.0f;
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        a(i10, i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        a(rect.left, rect.right);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
