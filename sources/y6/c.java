package y6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.huawei.hms.ads.gl;

/* compiled from: CircularDrawingDelegate.java */
/* loaded from: classes2.dex */
public final class c extends l<g> {

    /* renamed from: c, reason: collision with root package name */
    public int f36774c;

    /* renamed from: d, reason: collision with root package name */
    public float f36775d;

    /* renamed from: e, reason: collision with root package name */
    public float f36776e;
    public float f;

    public c(g gVar) {
        super(gVar);
        this.f36774c = 1;
    }

    @Override // y6.l
    public final void a(Canvas canvas, Rect rect, float f) {
        int i10;
        float width = rect.width() / f();
        float height = rect.height() / f();
        S s10 = this.f36802a;
        float f10 = (((g) s10).f36790g / 2.0f) + ((g) s10).f36791h;
        canvas.translate((f10 * width) + rect.left, (f10 * height) + rect.top);
        canvas.scale(width, height);
        canvas.rotate(-90.0f);
        float f11 = -f10;
        canvas.clipRect(f11, f11, f10, f10);
        if (((g) s10).f36792i == 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f36774c = i10;
        this.f36775d = ((g) s10).f36769a * f;
        this.f36776e = ((g) s10).f36770b * f;
        this.f = (((g) s10).f36790g - ((g) s10).f36769a) / 2.0f;
        if ((this.f36803b.d() && ((g) s10).f36773e == 2) || (this.f36803b.c() && ((g) s10).f == 1)) {
            this.f = (((1.0f - f) * ((g) s10).f36769a) / 2.0f) + this.f;
        } else if ((this.f36803b.d() && ((g) s10).f36773e == 1) || (this.f36803b.c() && ((g) s10).f == 2)) {
            this.f -= ((1.0f - f) * ((g) s10).f36769a) / 2.0f;
        }
    }

    @Override // y6.l
    public final void b(Canvas canvas, Paint paint, float f, float f10, int i10) {
        if (f == f10) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i10);
        paint.setStrokeWidth(this.f36775d);
        float f11 = this.f36774c;
        float f12 = f * 360.0f * f11;
        if (f10 < f) {
            f10 += 1.0f;
        }
        float f13 = (f10 - f) * 360.0f * f11;
        float f14 = this.f;
        float f15 = -f14;
        canvas.drawArc(new RectF(f15, f15, f14, f14), f12, f13, false, paint);
        if (this.f36776e > gl.Code && Math.abs(f13) < 360.0f) {
            paint.setStyle(Paint.Style.FILL);
            float f16 = this.f36775d;
            float f17 = this.f36776e;
            canvas.save();
            canvas.rotate(f12);
            float f18 = this.f;
            float f19 = f16 / 2.0f;
            canvas.drawRoundRect(new RectF(f18 - f19, f17, f18 + f19, -f17), f17, f17, paint);
            canvas.restore();
            float f20 = this.f36775d;
            float f21 = this.f36776e;
            canvas.save();
            canvas.rotate(f12 + f13);
            float f22 = this.f;
            float f23 = f20 / 2.0f;
            canvas.drawRoundRect(new RectF(f22 - f23, f21, f22 + f23, -f21), f21, f21, paint);
            canvas.restore();
        }
    }

    @Override // y6.l
    public final void c(Canvas canvas, Paint paint) {
        int C0 = a0.a.C0(((g) this.f36802a).f36772d, this.f36803b.B);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(C0);
        paint.setStrokeWidth(this.f36775d);
        float f = this.f;
        canvas.drawArc(new RectF(-f, -f, f, f), gl.Code, 360.0f, false, paint);
    }

    @Override // y6.l
    public final int d() {
        return f();
    }

    @Override // y6.l
    public final int e() {
        return f();
    }

    public final int f() {
        S s10 = this.f36802a;
        return (((g) s10).f36791h * 2) + ((g) s10).f36790g;
    }
}
