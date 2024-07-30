package y6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.huawei.hms.ads.gl;

/* compiled from: LinearDrawingDelegate.java */
/* loaded from: classes2.dex */
public final class o extends l<u> {

    /* renamed from: c, reason: collision with root package name */
    public float f36807c;

    /* renamed from: d, reason: collision with root package name */
    public float f36808d;

    /* renamed from: e, reason: collision with root package name */
    public float f36809e;

    public o(u uVar) {
        super(uVar);
        this.f36807c = 300.0f;
    }

    @Override // y6.l
    public final void a(Canvas canvas, Rect rect, float f) {
        this.f36807c = rect.width();
        S s10 = this.f36802a;
        float f10 = ((u) s10).f36769a;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(gl.Code, (rect.height() - ((u) s10).f36769a) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (((u) s10).f36831i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f36803b.d() && ((u) s10).f36773e == 1) || (this.f36803b.c() && ((u) s10).f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f36803b.d() || this.f36803b.c()) {
            canvas.translate(gl.Code, ((f - 1.0f) * ((u) s10).f36769a) / 2.0f);
        }
        float f11 = this.f36807c;
        canvas.clipRect((-f11) / 2.0f, (-f10) / 2.0f, f11 / 2.0f, f10 / 2.0f);
        this.f36808d = ((u) s10).f36769a * f;
        this.f36809e = ((u) s10).f36770b * f;
    }

    @Override // y6.l
    public final void b(Canvas canvas, Paint paint, float f, float f10, int i10) {
        if (f == f10) {
            return;
        }
        float f11 = this.f36807c;
        float f12 = (-f11) / 2.0f;
        float f13 = this.f36809e * 2.0f;
        float f14 = f11 - f13;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i10);
        float f15 = this.f36808d;
        RectF rectF = new RectF((f * f14) + f12, (-f15) / 2.0f, (f14 * f10) + f12 + f13, f15 / 2.0f);
        float f16 = this.f36809e;
        canvas.drawRoundRect(rectF, f16, f16, paint);
    }

    @Override // y6.l
    public final void c(Canvas canvas, Paint paint) {
        int C0 = a0.a.C0(((u) this.f36802a).f36772d, this.f36803b.B);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(C0);
        float f = this.f36807c;
        float f10 = this.f36808d;
        RectF rectF = new RectF((-f) / 2.0f, (-f10) / 2.0f, f / 2.0f, f10 / 2.0f);
        float f11 = this.f36809e;
        canvas.drawRoundRect(rectF, f11, f11, paint);
    }

    @Override // y6.l
    public final int d() {
        return ((u) this.f36802a).f36769a;
    }

    @Override // y6.l
    public final int e() {
        return -1;
    }
}
