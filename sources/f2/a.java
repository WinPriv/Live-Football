package f2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.activity.n;
import com.huawei.hms.ads.gl;

/* compiled from: BackgroundCountdown.java */
/* loaded from: classes.dex */
public final class a extends b {
    public float A0;
    public float B0;
    public float C0;
    public int D0;
    public Paint E0;
    public Paint F0;
    public Paint G0;
    public float H0;
    public float I0;
    public RectF J0;
    public RectF K0;
    public RectF L0;
    public RectF M0;
    public RectF N0;
    public RectF O0;
    public RectF P0;
    public RectF Q0;
    public RectF R0;
    public RectF S0;
    public float T0;
    public float U0;
    public boolean V0;
    public float W0;
    public float X0;
    public int Y0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f27988x0;
    public boolean y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f27989z0;

    @Override // f2.b
    public final int a() {
        return (int) ((this.W0 * 2.0f) + this.C0);
    }

    @Override // f2.b
    public final int b() {
        float f;
        float c10 = c((this.W0 * 2.0f) + this.C0);
        if (this.f) {
            if (this.f28035z) {
                Rect rect = new Rect();
                String valueOf = String.valueOf(this.f27990a);
                this.A.getTextBounds(valueOf, 0, valueOf.length(), rect);
                f = (n.r0(this.f28015n, 2.0f) * 4) + rect.width();
                this.I0 = f;
            } else {
                f = this.C0;
                this.I0 = f;
            }
            c10 = c10 + f + (this.W0 * 2.0f);
        }
        return (int) Math.ceil(c10);
    }

    @Override // f2.b
    public final void e() {
        super.e();
        Paint paint = new Paint(1);
        this.E0 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.E0.setColor(this.D0);
        if (this.V0 && this.F0 == null) {
            Paint paint2 = new Paint(1);
            this.F0 = paint2;
            paint2.setColor(this.Y0);
            if (!this.f27988x0) {
                this.F0.setStrokeWidth(this.W0);
                this.F0.setStyle(Paint.Style.STROKE);
            }
        }
        if (this.y0 && this.G0 == null) {
            Paint paint3 = new Paint(1);
            this.G0 = paint3;
            paint3.setColor(this.f27989z0);
            this.G0.setStrokeWidth(this.A0);
        }
    }

    @Override // f2.b
    public final void f(Context context, TypedArray typedArray) {
        super.f(context, typedArray);
        this.D0 = typedArray.getColor(33, -12303292);
        this.B0 = typedArray.getDimension(36, gl.Code);
        boolean z10 = true;
        this.y0 = typedArray.getBoolean(8, true);
        this.f27989z0 = typedArray.getColor(34, Color.parseColor("#30FFFFFF"));
        this.A0 = typedArray.getDimension(35, n.r0(context, 0.5f));
        float dimension = typedArray.getDimension(37, gl.Code);
        this.C0 = dimension;
        this.H0 = dimension;
        this.W0 = typedArray.getDimension(32, n.r0(context, 1.0f));
        this.X0 = typedArray.getDimension(31, gl.Code);
        this.Y0 = typedArray.getColor(30, -16777216);
        this.V0 = typedArray.getBoolean(7, false);
        if (!typedArray.hasValue(33) && this.V0) {
            z10 = false;
        }
        this.f27988x0 = z10;
    }

    @Override // f2.b
    public final void h() {
        super.h();
        if (this.H0 == gl.Code || this.C0 < this.S) {
            this.C0 = this.S + (n.r0(this.f28015n, 2.0f) * 4);
        }
    }

    @Override // f2.b
    public final void i(Canvas canvas) {
        float f;
        if (this.f) {
            if (this.V0) {
                RectF rectF = this.O0;
                float f10 = this.X0;
                canvas.drawRoundRect(rectF, f10, f10, this.F0);
            }
            if (this.f27988x0) {
                RectF rectF2 = this.J0;
                float f11 = this.B0;
                canvas.drawRoundRect(rectF2, f11, f11, this.E0);
                if (this.y0) {
                    float f12 = this.D;
                    float f13 = this.W0;
                    float f14 = this.T0;
                    canvas.drawLine(f12 + f13, f14, f12 + this.I0 + f13, f14, this.G0);
                }
            }
            canvas.drawText(n.w0(this.f27990a), this.J0.centerX(), this.U0, this.A);
            if (this.f28028u > gl.Code) {
                canvas.drawText(this.f28018p, (this.W0 * 2.0f) + this.D + this.I0 + this.E, this.N, this.B);
            }
            f = (this.W0 * 2.0f) + this.D + this.I0 + this.f28028u + this.E + this.F;
        } else {
            f = this.D;
        }
        if (this.f28001g) {
            if (this.V0) {
                RectF rectF3 = this.P0;
                float f15 = this.X0;
                canvas.drawRoundRect(rectF3, f15, f15, this.F0);
            }
            if (this.f27988x0) {
                RectF rectF4 = this.K0;
                float f16 = this.B0;
                canvas.drawRoundRect(rectF4, f16, f16, this.E0);
                if (this.y0) {
                    float f17 = this.W0;
                    float f18 = this.T0;
                    canvas.drawLine(f + f17, f18, this.C0 + f + f17, f18, this.G0);
                }
            }
            canvas.drawText(n.w0(this.f27992b), this.K0.centerX(), this.U0, this.A);
            if (this.f28030v > gl.Code) {
                canvas.drawText(this.f28020q, (this.W0 * 2.0f) + this.C0 + f + this.I, this.O, this.B);
            }
            f = f + this.C0 + this.f28030v + this.I + this.J + (this.W0 * 2.0f);
        }
        if (this.f28003h) {
            if (this.V0) {
                RectF rectF5 = this.Q0;
                float f19 = this.X0;
                canvas.drawRoundRect(rectF5, f19, f19, this.F0);
            }
            if (this.f27988x0) {
                RectF rectF6 = this.L0;
                float f20 = this.B0;
                canvas.drawRoundRect(rectF6, f20, f20, this.E0);
                if (this.y0) {
                    float f21 = this.W0;
                    float f22 = this.T0;
                    canvas.drawLine(f + f21, f22, this.C0 + f + f21, f22, this.G0);
                }
            }
            canvas.drawText(n.w0(this.f27994c), this.L0.centerX(), this.U0, this.A);
            if (this.f28032w > gl.Code) {
                canvas.drawText(this.f28022r, (this.W0 * 2.0f) + this.C0 + f + this.K, this.P, this.B);
            }
            f = f + this.C0 + this.f28032w + this.K + this.L + (this.W0 * 2.0f);
        }
        if (this.f28005i) {
            if (this.V0) {
                RectF rectF7 = this.R0;
                float f23 = this.X0;
                canvas.drawRoundRect(rectF7, f23, f23, this.F0);
            }
            if (this.f27988x0) {
                RectF rectF8 = this.M0;
                float f24 = this.B0;
                canvas.drawRoundRect(rectF8, f24, f24, this.E0);
                if (this.y0) {
                    float f25 = this.W0;
                    float f26 = this.T0;
                    canvas.drawLine(f + f25, f26, this.C0 + f + f25, f26, this.G0);
                }
            }
            canvas.drawText(n.w0(this.f27996d), this.M0.centerX(), this.U0, this.A);
            if (this.f28034x > gl.Code) {
                canvas.drawText(this.f28024s, (this.W0 * 2.0f) + this.C0 + f + this.G, this.Q, this.B);
            }
            if (this.f28007j) {
                if (this.V0) {
                    RectF rectF9 = this.S0;
                    float f27 = this.X0;
                    canvas.drawRoundRect(rectF9, f27, f27, this.F0);
                }
                float f28 = (this.W0 * 2.0f) + f + this.C0 + this.f28034x + this.G + this.H;
                if (this.f27988x0) {
                    RectF rectF10 = this.N0;
                    float f29 = this.B0;
                    canvas.drawRoundRect(rectF10, f29, f29, this.E0);
                    if (this.y0) {
                        float f30 = this.W0;
                        float f31 = this.T0;
                        canvas.drawLine(f28 + f30, f31, this.C0 + f28 + f30, f31, this.G0);
                    }
                }
                canvas.drawText(n.v0(this.f27998e), this.N0.centerX(), this.U0, this.A);
                if (this.y > gl.Code) {
                    canvas.drawText(this.f28026t, (this.W0 * 2.0f) + f28 + this.C0 + this.M, this.R, this.B);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    @Override // f2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(android.view.View r7, int r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.a.j(android.view.View, int, int, int, int):void");
    }

    public final float l(String str, float f) {
        this.B.getTextBounds(str, 0, str.length(), new Rect());
        int i10 = this.V;
        if (i10 != 0) {
            if (i10 != 2) {
                float f10 = this.C0;
                return ((f + f10) - (f10 / 2.0f)) + (r0.height() / 2) + this.W0;
            }
            return ((f + this.C0) - r0.bottom) + (this.W0 * 2.0f);
        }
        return f - r0.top;
    }

    public final void m(RectF rectF) {
        float f;
        Paint.FontMetrics fontMetrics = this.A.getFontMetrics();
        float f10 = rectF.top;
        float f11 = (rectF.bottom - f10) - fontMetrics.bottom;
        float f12 = fontMetrics.top;
        this.U0 = ((((f11 + f12) / 2.0f) + f10) - f12) - this.U;
        float centerY = rectF.centerY();
        if (this.A0 == n.r0(this.f28015n, 0.5f)) {
            f = this.A0;
        } else {
            f = this.A0 / 2.0f;
        }
        this.T0 = centerY + f;
    }
}
