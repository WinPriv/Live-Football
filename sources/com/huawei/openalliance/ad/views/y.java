package com.huawei.openalliance.ad.views;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.huawei.hms.ads.gl;

/* loaded from: classes2.dex */
public final class y extends x {
    public float A;
    public final Path B;
    public final RectF C;
    public final RectF D;
    public Rect E;
    public float F;

    /* renamed from: z, reason: collision with root package name */
    public float f24177z;

    public y(Drawable drawable) {
        super(drawable);
        this.B = new Path();
        RectF rectF = new RectF();
        this.C = rectF;
        this.D = new RectF();
        Rect bounds = getBounds();
        this.E = bounds;
        rectF.set(bounds.left, bounds.top, bounds.height() + r1, this.E.bottom);
        this.F = this.E.height() / 2.0f;
    }

    @Override // com.huawei.openalliance.ad.views.x
    public final Path b(int i10) {
        float f = i10 / 10000.0f;
        int compare = Float.compare(f, this.f24177z);
        RectF rectF = this.D;
        float f10 = gl.Code;
        RectF rectF2 = this.C;
        Path path = this.B;
        if (compare < 0) {
            path.reset();
            path.addArc(rectF2, 90.0f, 180.0f);
            if (Float.compare(this.f24177z, gl.Code) != 0) {
                f10 = (f / this.f24177z) * this.F;
            }
            Rect rect = this.E;
            Rect rect2 = this.E;
            rectF.set(rect2.left + f10, rect2.top, (rect.height() + rect.left) - f10, rect2.bottom);
            path.addArc(rectF, 270.0f, -180.0f);
        } else if (Float.compare(f, this.A) < 0) {
            path.reset();
            path.addArc(rectF2, 90.0f, 180.0f);
            Rect rect3 = this.E;
            float f11 = rect3.left + this.F;
            float width = rect3.width() * f;
            Rect rect4 = this.E;
            path.addRect(f11, rect4.top, rect4.left + width, rect4.bottom, Path.Direction.CCW);
        } else {
            path.reset();
            path.addArc(rectF2, 90.0f, 180.0f);
            float f12 = this.E.right - this.F;
            if (Float.compare(this.f24177z, this.A) != 0) {
                Rect rect5 = this.E;
                path.addRect(rect5.left + this.F, rect5.top, f12, rect5.bottom, Path.Direction.CCW);
            }
            if (Float.compare(this.f24177z, gl.Code) != 0) {
                f10 = this.F * ((f - this.A) / this.f24177z);
            }
            Rect rect6 = this.E;
            rectF.set(f12 - f10, rect6.top, f12 + f10, rect6.bottom);
            path.addArc(rectF, 270.0f, 180.0f);
        }
        return path;
    }

    @Override // com.huawei.openalliance.ad.views.x, android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.E.set(i10, i11, i12, i13);
        this.C.set(i10, i11, i10 + r0, i13);
        float f = (i13 - i11) / 2.0f;
        this.F = f;
        int i14 = i12 - i10;
        if (i14 != 0) {
            float f10 = f / i14;
            this.f24177z = f10;
            this.A = 1.0f - f10;
        }
    }
}
