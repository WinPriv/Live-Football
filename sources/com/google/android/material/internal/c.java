package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.material.internal.g;
import com.huawei.hms.ads.gl;
import java.util.WeakHashMap;
import l0.e;
import n0.c0;
import n0.l0;

/* compiled from: CollapsingTextHelper.java */
/* loaded from: classes2.dex */
public final class c {
    public CharSequence A;
    public CharSequence B;
    public boolean C;
    public Bitmap E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int[] L;
    public boolean M;
    public final TextPaint N;
    public final TextPaint O;
    public TimeInterpolator P;
    public TimeInterpolator Q;
    public float R;
    public float S;
    public float T;
    public ColorStateList U;
    public float V;
    public float W;
    public float X;
    public StaticLayout Y;
    public float Z;

    /* renamed from: a, reason: collision with root package name */
    public final View f20827a;

    /* renamed from: a0, reason: collision with root package name */
    public float f20828a0;

    /* renamed from: b, reason: collision with root package name */
    public float f20829b;

    /* renamed from: b0, reason: collision with root package name */
    public float f20830b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f20831c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f20832c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f20833d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f20835e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f20842j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f20843k;

    /* renamed from: l, reason: collision with root package name */
    public float f20844l;

    /* renamed from: m, reason: collision with root package name */
    public float f20845m;

    /* renamed from: n, reason: collision with root package name */
    public float f20846n;
    public float o;

    /* renamed from: p, reason: collision with root package name */
    public float f20847p;

    /* renamed from: q, reason: collision with root package name */
    public float f20848q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f20849r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f20850s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f20851t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f20852u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f20853v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f20854w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f20855x;
    public z6.a y;
    public int f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f20838g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f20840h = 15.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f20841i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public TextUtils.TruncateAt f20856z = TextUtils.TruncateAt.END;
    public boolean D = true;

    /* renamed from: d0, reason: collision with root package name */
    public int f20834d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public float f20836e0 = gl.Code;

    /* renamed from: f0, reason: collision with root package name */
    public float f20837f0 = 1.0f;

    /* renamed from: g0, reason: collision with root package name */
    public int f20839g0 = 1;

    public c(View view) {
        this.f20827a = view;
        TextPaint textPaint = new TextPaint(com.anythink.expressad.video.module.a.a.T);
        this.N = textPaint;
        this.O = new TextPaint(textPaint);
        this.f20833d = new Rect();
        this.f20831c = new Rect();
        this.f20835e = new RectF();
        g(view.getContext().getResources().getConfiguration());
    }

    public static int a(float f, int i10, int i11) {
        float f10 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i11) * f) + (Color.alpha(i10) * f10)), Math.round((Color.red(i11) * f) + (Color.red(i10) * f10)), Math.round((Color.green(i11) * f) + (Color.green(i10) * f10)), Math.round((Color.blue(i11) * f) + (Color.blue(i10) * f10)));
    }

    public static float f(float f, float f10, float f11, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f11 = timeInterpolator.getInterpolation(f11);
        }
        LinearInterpolator linearInterpolator = h6.a.f28768a;
        return a3.k.d(f10, f, f11, f);
    }

    public final boolean b(CharSequence charSequence) {
        e.d dVar;
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        boolean z10 = true;
        if (c0.e.d(this.f20827a) != 1) {
            z10 = false;
        }
        if (this.D) {
            if (z10) {
                dVar = l0.e.f32307d;
            } else {
                dVar = l0.e.f32306c;
            }
            return dVar.b(charSequence, charSequence.length());
        }
        return z10;
    }

    public final void c(float f, boolean z10) {
        boolean z11;
        boolean z12;
        float f10;
        float f11;
        Typeface typeface;
        boolean z13;
        boolean z14;
        StaticLayout staticLayout;
        Layout.Alignment alignment;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        if (this.A == null) {
            return;
        }
        float width = this.f20833d.width();
        float width2 = this.f20831c.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f10 = this.f20841i;
            f11 = this.V;
            this.F = 1.0f;
            typeface = this.f20849r;
        } else {
            float f12 = this.f20840h;
            float f13 = this.W;
            Typeface typeface2 = this.f20852u;
            if (Math.abs(f - gl.Code) < 1.0E-5f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                this.F = 1.0f;
            } else {
                this.F = f(this.f20840h, this.f20841i, f, this.Q) / this.f20840h;
            }
            float f14 = this.f20841i / this.f20840h;
            float f15 = width2 * f14;
            if (!z10 && f15 > width) {
                width = Math.min(width / f14, width2);
            } else {
                width = width2;
            }
            f10 = f12;
            f11 = f13;
            typeface = typeface2;
        }
        TextPaint textPaint = this.N;
        if (width > gl.Code) {
            if (this.G != f10) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (this.X != f11) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (this.f20855x != typeface) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (this.Y != null && width != r9.getWidth()) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (!z15 && !z16 && !z18 && !z17 && !this.M) {
                z19 = false;
            } else {
                z19 = true;
            }
            this.G = f10;
            this.X = f11;
            this.f20855x = typeface;
            this.M = false;
            if (this.F != 1.0f) {
                z20 = true;
            } else {
                z20 = false;
            }
            textPaint.setLinearText(z20);
            z13 = z19;
        } else {
            z13 = false;
        }
        if (this.B == null || z13) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f20855x);
            textPaint.setLetterSpacing(this.X);
            boolean b10 = b(this.A);
            this.C = b10;
            int i10 = this.f20834d0;
            if (i10 > 1 && !b10) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                i10 = 1;
            }
            try {
                if (i10 == 1) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f, b10 ? 1 : 0) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            if (this.C) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else {
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            }
                        } else if (this.C) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        }
                    } else {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    }
                }
                g gVar = new g(this.A, textPaint, (int) width);
                gVar.f20873l = this.f20856z;
                gVar.f20872k = b10;
                gVar.f20867e = alignment;
                gVar.f20871j = false;
                gVar.f = i10;
                float f16 = this.f20836e0;
                float f17 = this.f20837f0;
                gVar.f20868g = f16;
                gVar.f20869h = f17;
                gVar.f20870i = this.f20839g0;
                staticLayout = gVar.a();
            } catch (g.a e10) {
                Log.e("CollapsingTextHelper", e10.getCause().getMessage(), e10);
                staticLayout = null;
            }
            staticLayout.getClass();
            this.Y = staticLayout;
            this.B = staticLayout.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.O;
        textPaint.setTextSize(this.f20841i);
        textPaint.setTypeface(this.f20849r);
        textPaint.setLetterSpacing(this.V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f20851t;
            if (typeface != null) {
                this.f20850s = z6.g.a(configuration, typeface);
            }
            Typeface typeface2 = this.f20854w;
            if (typeface2 != null) {
                this.f20853v = z6.g.a(configuration, typeface2);
            }
            Typeface typeface3 = this.f20850s;
            if (typeface3 == null) {
                typeface3 = this.f20851t;
            }
            this.f20849r = typeface3;
            Typeface typeface4 = this.f20853v;
            if (typeface4 == null) {
                typeface4 = this.f20854w;
            }
            this.f20852u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z10) {
        float f;
        float f10;
        StaticLayout staticLayout;
        View view = this.f20827a;
        if ((view.getHeight() > 0 && view.getWidth() > 0) || z10) {
            c(1.0f, z10);
            CharSequence charSequence = this.B;
            TextPaint textPaint = this.N;
            if (charSequence != null && (staticLayout = this.Y) != null) {
                this.f20832c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f20856z);
            }
            CharSequence charSequence2 = this.f20832c0;
            if (charSequence2 != null) {
                this.Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.Z = gl.Code;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f20838g, this.C ? 1 : 0);
            int i10 = absoluteGravity & 112;
            Rect rect = this.f20833d;
            if (i10 != 48) {
                if (i10 != 80) {
                    this.f20845m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
                } else {
                    this.f20845m = textPaint.ascent() + rect.bottom;
                }
            } else {
                this.f20845m = rect.top;
            }
            int i11 = absoluteGravity & 8388615;
            if (i11 != 1) {
                if (i11 != 5) {
                    this.o = rect.left;
                } else {
                    this.o = rect.right - this.Z;
                }
            } else {
                this.o = rect.centerX() - (this.Z / 2.0f);
            }
            c(gl.Code, z10);
            StaticLayout staticLayout2 = this.Y;
            if (staticLayout2 != null) {
                f = staticLayout2.getHeight();
            } else {
                f = 0.0f;
            }
            StaticLayout staticLayout3 = this.Y;
            if (staticLayout3 != null && this.f20834d0 > 1) {
                f10 = staticLayout3.getWidth();
            } else {
                CharSequence charSequence3 = this.B;
                if (charSequence3 != null) {
                    f10 = textPaint.measureText(charSequence3, 0, charSequence3.length());
                } else {
                    f10 = 0.0f;
                }
            }
            StaticLayout staticLayout4 = this.Y;
            if (staticLayout4 != null) {
                staticLayout4.getLineCount();
            }
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f, this.C ? 1 : 0);
            int i12 = absoluteGravity2 & 112;
            Rect rect2 = this.f20831c;
            if (i12 != 48) {
                if (i12 != 80) {
                    this.f20844l = rect2.centerY() - (f / 2.0f);
                } else {
                    this.f20844l = textPaint.descent() + (rect2.bottom - f);
                }
            } else {
                this.f20844l = rect2.top;
            }
            int i13 = absoluteGravity2 & 8388615;
            if (i13 != 1) {
                if (i13 != 5) {
                    this.f20846n = rect2.left;
                } else {
                    this.f20846n = rect2.right - f10;
                }
            } else {
                this.f20846n = rect2.centerX() - (f10 / 2.0f);
            }
            Bitmap bitmap = this.E;
            if (bitmap != null) {
                bitmap.recycle();
                this.E = null;
            }
            m(this.f20829b);
            float f11 = this.f20829b;
            RectF rectF = this.f20835e;
            rectF.left = f(rect2.left, rect.left, f11, this.P);
            rectF.top = f(this.f20844l, this.f20845m, f11, this.P);
            rectF.right = f(rect2.right, rect.right, f11, this.P);
            rectF.bottom = f(rect2.bottom, rect.bottom, f11, this.P);
            this.f20847p = f(this.f20846n, this.o, f11, this.P);
            this.f20848q = f(this.f20844l, this.f20845m, f11, this.P);
            m(f11);
            z0.b bVar = h6.a.f28769b;
            this.f20828a0 = 1.0f - f(gl.Code, 1.0f, 1.0f - f11, bVar);
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.d.k(view);
            this.f20830b0 = f(1.0f, gl.Code, f11, bVar);
            c0.d.k(view);
            ColorStateList colorStateList = this.f20843k;
            ColorStateList colorStateList2 = this.f20842j;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f11, e(colorStateList2), e(this.f20843k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f12 = this.V;
            float f13 = this.W;
            if (f12 != f13) {
                textPaint.setLetterSpacing(f(f13, f12, f11, bVar));
            } else {
                textPaint.setLetterSpacing(f12);
            }
            this.H = f(gl.Code, this.R, f11, null);
            this.I = f(gl.Code, this.S, f11, null);
            this.J = f(gl.Code, this.T, f11, null);
            int a10 = a(f11, e(null), e(this.U));
            this.K = a10;
            textPaint.setShadowLayer(this.H, this.I, this.J, a10);
            c0.d.k(view);
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f20843k != colorStateList || this.f20842j != colorStateList) {
            this.f20843k = colorStateList;
            this.f20842j = colorStateList;
            h(false);
        }
    }

    public final boolean j(Typeface typeface) {
        z6.a aVar = this.y;
        if (aVar != null) {
            aVar.f37309v = true;
        }
        if (this.f20851t != typeface) {
            this.f20851t = typeface;
            Typeface a10 = z6.g.a(this.f20827a.getContext().getResources().getConfiguration(), typeface);
            this.f20850s = a10;
            if (a10 == null) {
                a10 = this.f20851t;
            }
            this.f20849r = a10;
            return true;
        }
        return false;
    }

    public final boolean k(Typeface typeface) {
        if (this.f20854w != typeface) {
            this.f20854w = typeface;
            Typeface a10 = z6.g.a(this.f20827a.getContext().getResources().getConfiguration(), typeface);
            this.f20853v = a10;
            if (a10 == null) {
                a10 = this.f20854w;
            }
            this.f20852u = a10;
            return true;
        }
        return false;
    }

    public final void l(float f) {
        if (f < gl.Code) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f20829b) {
            this.f20829b = f;
            RectF rectF = this.f20835e;
            float f10 = this.f20831c.left;
            Rect rect = this.f20833d;
            rectF.left = f(f10, rect.left, f, this.P);
            rectF.top = f(this.f20844l, this.f20845m, f, this.P);
            rectF.right = f(r3.right, rect.right, f, this.P);
            rectF.bottom = f(r3.bottom, rect.bottom, f, this.P);
            this.f20847p = f(this.f20846n, this.o, f, this.P);
            this.f20848q = f(this.f20844l, this.f20845m, f, this.P);
            m(f);
            z0.b bVar = h6.a.f28769b;
            this.f20828a0 = 1.0f - f(gl.Code, 1.0f, 1.0f - f, bVar);
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            View view = this.f20827a;
            c0.d.k(view);
            this.f20830b0 = f(1.0f, gl.Code, f, bVar);
            c0.d.k(view);
            ColorStateList colorStateList = this.f20843k;
            ColorStateList colorStateList2 = this.f20842j;
            TextPaint textPaint = this.N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f, e(colorStateList2), e(this.f20843k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f11 = this.V;
            float f12 = this.W;
            if (f11 != f12) {
                textPaint.setLetterSpacing(f(f12, f11, f, bVar));
            } else {
                textPaint.setLetterSpacing(f11);
            }
            this.H = f(gl.Code, this.R, f, null);
            this.I = f(gl.Code, this.S, f, null);
            this.J = f(gl.Code, this.T, f, null);
            int a10 = a(f, e(null), e(this.U));
            this.K = a10;
            textPaint.setShadowLayer(this.H, this.I, this.J, a10);
            c0.d.k(view);
        }
    }

    public final void m(float f) {
        c(f, false);
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        c0.d.k(this.f20827a);
    }
}
