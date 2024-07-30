package f2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.activity.n;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.constant.w;

/* compiled from: BaseCountdown.java */
/* loaded from: classes.dex */
public class b {
    public Paint A;
    public Paint B;
    public Paint C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public int f27990a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f27991a0;

    /* renamed from: b, reason: collision with root package name */
    public int f27992b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f27993b0;

    /* renamed from: c, reason: collision with root package name */
    public int f27994c;

    /* renamed from: c0, reason: collision with root package name */
    public float f27995c0;

    /* renamed from: d, reason: collision with root package name */
    public int f27996d;

    /* renamed from: d0, reason: collision with root package name */
    public int f27997d0;

    /* renamed from: e, reason: collision with root package name */
    public int f27998e;

    /* renamed from: e0, reason: collision with root package name */
    public float f27999e0;
    public boolean f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f28000f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28001g;

    /* renamed from: g0, reason: collision with root package name */
    public int f28002g0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f28003h;

    /* renamed from: h0, reason: collision with root package name */
    public float f28004h0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f28005i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f28006i0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f28007j;

    /* renamed from: j0, reason: collision with root package name */
    public float f28008j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f28009k;

    /* renamed from: k0, reason: collision with root package name */
    public float f28010k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f28011l;

    /* renamed from: l0, reason: collision with root package name */
    public float f28012l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f28013m;

    /* renamed from: m0, reason: collision with root package name */
    public float f28014m0;

    /* renamed from: n, reason: collision with root package name */
    public Context f28015n;

    /* renamed from: n0, reason: collision with root package name */
    public float f28016n0;
    public String o;

    /* renamed from: o0, reason: collision with root package name */
    public float f28017o0;

    /* renamed from: p, reason: collision with root package name */
    public String f28018p;

    /* renamed from: p0, reason: collision with root package name */
    public float f28019p0;

    /* renamed from: q, reason: collision with root package name */
    public String f28020q;

    /* renamed from: q0, reason: collision with root package name */
    public float f28021q0;

    /* renamed from: r, reason: collision with root package name */
    public String f28022r;

    /* renamed from: r0, reason: collision with root package name */
    public float f28023r0;

    /* renamed from: s, reason: collision with root package name */
    public String f28024s;

    /* renamed from: s0, reason: collision with root package name */
    public float f28025s0;

    /* renamed from: t, reason: collision with root package name */
    public String f28026t;

    /* renamed from: t0, reason: collision with root package name */
    public float f28027t0;

    /* renamed from: u, reason: collision with root package name */
    public float f28028u;

    /* renamed from: u0, reason: collision with root package name */
    public float f28029u0;

    /* renamed from: v, reason: collision with root package name */
    public float f28030v;

    /* renamed from: v0, reason: collision with root package name */
    public String f28031v0;

    /* renamed from: w, reason: collision with root package name */
    public float f28032w;

    /* renamed from: w0, reason: collision with root package name */
    public String f28033w0;

    /* renamed from: x, reason: collision with root package name */
    public float f28034x;
    public float y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f28035z;

    public int a() {
        return (int) this.T;
    }

    public int b() {
        float f;
        float c10 = c(this.S);
        if (!this.f28009k && this.f) {
            if (this.f28035z) {
                Rect rect = new Rect();
                String valueOf = String.valueOf(this.f27990a);
                this.A.getTextBounds(valueOf, 0, valueOf.length(), rect);
                f = rect.width();
                this.f28008j0 = f;
            } else {
                f = this.S;
                this.f28008j0 = f;
            }
            c10 += f;
        }
        return (int) Math.ceil(c10);
    }

    public final float c(float f) {
        float f10 = this.E + this.F + this.I + this.J + this.K + this.L + this.G + this.H + this.M + this.f28028u + this.f28030v + this.f28032w + this.f28034x + this.y;
        if (this.f28009k) {
            Rect rect = new Rect();
            boolean z10 = this.f;
            float f11 = gl.Code;
            if (z10) {
                String w02 = n.w0(this.f27990a);
                this.A.getTextBounds(w02, 0, w02.length(), rect);
                float width = rect.width();
                this.f28008j0 = width;
                f11 = gl.Code + width;
            }
            if (this.f28001g) {
                String w03 = n.w0(this.f27992b);
                this.C.getTextBounds(w03, 0, w03.length(), rect);
                float width2 = rect.width();
                this.f28010k0 = width2;
                f11 += width2;
            }
            f10 += f11;
        } else if (this.f28001g) {
            f10 += f;
        }
        if (this.f28003h) {
            f10 += f;
        }
        if (this.f28005i) {
            f10 += f;
        }
        if (this.f28007j) {
            return f10 + f;
        }
        return f10;
    }

    public final float d(String str) {
        float f;
        int i10;
        Rect rect = new Rect();
        this.B.getTextBounds(str, 0, str.length(), rect);
        int i11 = this.V;
        if (i11 != 0) {
            if (i11 != 2) {
                return (this.f28012l0 - (this.T / 2.0f)) + (rect.height() / 2);
            }
            f = this.f28012l0;
            i10 = rect.bottom;
        } else {
            f = this.f28012l0 - this.T;
            i10 = rect.top;
        }
        return f - i10;
    }

    public void e() {
        Paint paint = new Paint(1);
        this.A = paint;
        paint.setColor(this.f27997d0);
        this.A.setTextAlign(Paint.Align.CENTER);
        this.A.setTextSize(this.f27999e0);
        if (this.f28000f0) {
            this.A.setFakeBoldText(true);
        }
        Paint paint2 = new Paint(1);
        this.B = paint2;
        paint2.setColor(this.f28002g0);
        this.B.setTextSize(this.f28004h0);
        if (this.f28006i0) {
            this.B.setFakeBoldText(true);
        }
        Paint paint3 = new Paint();
        this.C = paint3;
        paint3.setTextSize(this.f27999e0);
        if (this.f28000f0) {
            this.C.setFakeBoldText(true);
        }
    }

    public void f(Context context, TypedArray typedArray) {
        this.f28015n = context;
        this.f28000f0 = typedArray.getBoolean(10, false);
        this.f27999e0 = typedArray.getDimension(39, this.f28015n.getResources().getDisplayMetrics().scaledDensity * 12.0f);
        this.f27997d0 = typedArray.getColor(38, -16777216);
        this.f = typedArray.getBoolean(2, false);
        this.f28001g = typedArray.getBoolean(3, false);
        this.f28003h = typedArray.getBoolean(5, true);
        this.f28005i = typedArray.getBoolean(6, true);
        this.f28007j = typedArray.getBoolean(4, false);
        if (typedArray.getBoolean(1, true)) {
            this.f28009k = typedArray.getBoolean(0, false);
        }
        this.f28006i0 = typedArray.getBoolean(9, false);
        this.f28004h0 = typedArray.getDimension(29, this.f28015n.getResources().getDisplayMetrics().scaledDensity * 12.0f);
        this.f28002g0 = typedArray.getColor(28, -16777216);
        this.o = typedArray.getString(11);
        this.f28018p = typedArray.getString(12);
        this.f28020q = typedArray.getString(16);
        this.f28022r = typedArray.getString(22);
        this.f28024s = typedArray.getString(25);
        this.f28026t = typedArray.getString(20);
        this.V = typedArray.getInt(15, 1);
        this.f27995c0 = typedArray.getDimension(19, -1.0f);
        this.E = typedArray.getDimension(13, -1.0f);
        this.F = typedArray.getDimension(14, -1.0f);
        this.I = typedArray.getDimension(17, -1.0f);
        this.J = typedArray.getDimension(18, -1.0f);
        this.K = typedArray.getDimension(23, -1.0f);
        this.L = typedArray.getDimension(24, -1.0f);
        this.G = typedArray.getDimension(26, -1.0f);
        this.H = typedArray.getDimension(27, -1.0f);
        this.M = typedArray.getDimension(21, -1.0f);
        this.f28011l = typedArray.hasValue(2);
        this.f28013m = typedArray.hasValue(3);
        this.f28014m0 = this.E;
        this.f28016n0 = this.F;
        this.f28017o0 = this.I;
        this.f28019p0 = this.J;
        this.f28021q0 = this.K;
        this.f28023r0 = this.L;
        this.f28025s0 = this.G;
        this.f28027t0 = this.H;
        this.f28029u0 = this.M;
        if (!this.f && !this.f28001g && !this.f28003h) {
            this.f28005i = true;
        }
        if (!this.f28005i) {
            this.f28007j = false;
        }
    }

    public final void g() {
        boolean z10;
        float f;
        float measureText = this.B.measureText(w.bE);
        boolean z11 = false;
        if (!TextUtils.isEmpty(this.o)) {
            f = this.B.measureText(this.o);
            z10 = false;
        } else {
            z10 = true;
            f = 0.0f;
        }
        if (this.f) {
            if (this.W) {
                this.f28028u = this.B.measureText(this.f28018p);
            } else if (!z10) {
                this.f28018p = this.o;
                this.f28028u = f;
            } else if (!this.f27993b0) {
                this.f28018p = w.bE;
                this.f28028u = measureText;
            }
        } else {
            this.f28028u = gl.Code;
        }
        if (this.f28001g) {
            if (this.X) {
                this.f28030v = this.B.measureText(this.f28020q);
            } else if (!z10) {
                this.f28020q = this.o;
                this.f28030v = f;
            } else if (!this.f27993b0) {
                this.f28020q = w.bE;
                this.f28030v = measureText;
            }
        } else {
            this.f28030v = gl.Code;
        }
        if (this.f28003h) {
            if (this.Y) {
                this.f28032w = this.B.measureText(this.f28022r);
            } else if (this.f28005i) {
                if (!z10) {
                    this.f28022r = this.o;
                    this.f28032w = f;
                } else if (!this.f27993b0) {
                    this.f28022r = w.bE;
                    this.f28032w = measureText;
                }
            } else {
                this.f28032w = gl.Code;
            }
        } else {
            this.f28032w = gl.Code;
        }
        if (this.f28005i) {
            if (this.Z) {
                this.f28034x = this.B.measureText(this.f28024s);
            } else if (this.f28007j) {
                if (!z10) {
                    this.f28024s = this.o;
                    this.f28034x = f;
                } else if (!this.f27993b0) {
                    this.f28024s = w.bE;
                    this.f28034x = measureText;
                }
            } else {
                this.f28034x = gl.Code;
            }
        } else {
            this.f28034x = gl.Code;
        }
        if (this.f28007j && this.f27993b0 && this.f27991a0) {
            this.y = this.B.measureText(this.f28026t);
        } else {
            this.y = gl.Code;
        }
        int r02 = n.r0(this.f28015n, 3.0f);
        float f10 = this.f27995c0;
        if (f10 < gl.Code) {
            z11 = true;
        }
        if (this.f && this.f28028u > gl.Code) {
            if (this.E < gl.Code) {
                if (!z11) {
                    this.E = f10;
                } else {
                    this.E = r02;
                }
            }
            if (this.F < gl.Code) {
                if (!z11) {
                    this.F = f10;
                } else {
                    this.F = r02;
                }
            }
        } else {
            this.E = gl.Code;
            this.F = gl.Code;
        }
        if (this.f28001g && this.f28030v > gl.Code) {
            if (this.I < gl.Code) {
                if (!z11) {
                    this.I = f10;
                } else {
                    this.I = r02;
                }
            }
            if (this.J < gl.Code) {
                if (!z11) {
                    this.J = f10;
                } else {
                    this.J = r02;
                }
            }
        } else {
            this.I = gl.Code;
            this.J = gl.Code;
        }
        if (this.f28003h && this.f28032w > gl.Code) {
            if (this.K < gl.Code) {
                if (!z11) {
                    this.K = f10;
                } else {
                    this.K = r02;
                }
            }
            if (this.f28005i) {
                if (this.L < gl.Code) {
                    if (!z11) {
                        this.L = f10;
                    } else {
                        this.L = r02;
                    }
                }
            } else {
                this.L = gl.Code;
            }
        } else {
            this.K = gl.Code;
            this.L = gl.Code;
        }
        if (this.f28005i) {
            if (this.f28034x > gl.Code) {
                if (this.G < gl.Code) {
                    if (!z11) {
                        this.G = f10;
                    } else {
                        this.G = r02;
                    }
                }
                if (this.f28007j) {
                    if (this.H < gl.Code) {
                        if (!z11) {
                            this.H = f10;
                        } else {
                            this.H = r02;
                        }
                    }
                } else {
                    this.H = gl.Code;
                }
            } else {
                this.G = gl.Code;
                this.H = gl.Code;
            }
            if (this.f28007j && this.y > gl.Code) {
                if (this.M < gl.Code) {
                    if (!z11) {
                        this.M = f10;
                        return;
                    } else {
                        this.M = r02;
                        return;
                    }
                }
                return;
            }
            this.M = gl.Code;
            return;
        }
        this.G = gl.Code;
        this.H = gl.Code;
        this.M = gl.Code;
    }

    public void h() {
        this.A.getTextBounds("00", 0, 2, new Rect());
        this.S = r0.width();
        this.T = r0.height();
        this.U = r0.bottom;
    }

    public void i(Canvas canvas) {
        float f;
        float f10;
        if (this.f) {
            canvas.drawText(n.w0(this.f27990a), (this.f28008j0 / 2.0f) + this.D, this.f28012l0, this.A);
            if (this.f28028u > gl.Code) {
                canvas.drawText(this.f28018p, this.D + this.f28008j0 + this.E, this.N, this.B);
            }
            f = this.D + this.f28008j0 + this.f28028u + this.E + this.F;
        } else {
            f = this.D;
        }
        if (this.f28001g) {
            if (this.f28009k) {
                f10 = this.f28010k0;
            } else {
                f10 = this.S;
            }
            canvas.drawText(n.w0(this.f27992b), (f10 / 2.0f) + f, this.f28012l0, this.A);
            if (this.f28030v > gl.Code) {
                canvas.drawText(this.f28020q, f + f10 + this.I, this.O, this.B);
            }
            f = f + f10 + this.f28030v + this.I + this.J;
        }
        if (this.f28003h) {
            canvas.drawText(n.w0(this.f27994c), (this.S / 2.0f) + f, this.f28012l0, this.A);
            if (this.f28032w > gl.Code) {
                canvas.drawText(this.f28022r, this.S + f + this.K, this.P, this.B);
            }
            f = f + this.S + this.f28032w + this.K + this.L;
        }
        if (this.f28005i) {
            canvas.drawText(n.w0(this.f27996d), (this.S / 2.0f) + f, this.f28012l0, this.A);
            if (this.f28034x > gl.Code) {
                canvas.drawText(this.f28024s, this.S + f + this.G, this.Q, this.B);
            }
            if (this.f28007j) {
                float f11 = f + this.S + this.f28034x + this.G + this.H;
                canvas.drawText(n.v0(this.f27998e), (this.S / 2.0f) + f11, this.f28012l0, this.A);
                if (this.y > gl.Code) {
                    canvas.drawText(this.f28026t, f11 + this.S + this.M, this.R, this.B);
                }
            }
        }
    }

    public void j(View view, int i10, int i11, int i12, int i13) {
        float paddingLeft;
        if (view.getPaddingTop() == view.getPaddingBottom()) {
            this.f28012l0 = ((this.T / 2.0f) + (i11 / 2)) - this.U;
        } else {
            this.f28012l0 = ((i11 - (i11 - r6)) + this.T) - this.U;
        }
        if (this.f && this.f28028u > gl.Code) {
            this.N = d(this.f28018p);
        }
        if (this.f28001g && this.f28030v > gl.Code) {
            this.O = d(this.f28020q);
        }
        if (this.f28003h && this.f28032w > gl.Code) {
            this.P = d(this.f28022r);
        }
        if (this.f28034x > gl.Code) {
            this.Q = d(this.f28024s);
        }
        if (this.f28007j && this.y > gl.Code) {
            this.R = d(this.f28026t);
        }
        if (view.getPaddingLeft() == view.getPaddingRight()) {
            paddingLeft = (i10 - i12) / 2;
        } else {
            paddingLeft = view.getPaddingLeft();
        }
        this.D = paddingLeft;
    }

    public final void k(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        if (!z13) {
            z14 = false;
        }
        if (this.f != z10) {
            this.f = z10;
            if (z10) {
                this.E = this.f28014m0;
                this.F = this.f28016n0;
            }
        }
        if (this.f28001g != z11) {
            this.f28001g = z11;
            if (z11) {
                this.I = this.f28017o0;
                this.J = this.f28019p0;
            }
        }
        if (this.f28003h != z12) {
            this.f28003h = z12;
            if (z12) {
                this.K = this.f28021q0;
                this.L = this.f28023r0;
                this.f28022r = this.f28031v0;
            }
        }
        if (this.f28005i != z13) {
            this.f28005i = z13;
            if (z13) {
                this.G = this.f28025s0;
                this.H = this.f28027t0;
                this.f28024s = this.f28033w0;
            } else {
                this.f28022r = this.f28031v0;
            }
            this.K = this.f28021q0;
            this.L = this.f28023r0;
        }
        if (this.f28007j != z14) {
            this.f28007j = z14;
            if (z14) {
                this.M = this.f28029u0;
            } else {
                this.f28024s = this.f28033w0;
            }
            this.G = this.f28025s0;
            this.H = this.f28027t0;
        }
    }
}
