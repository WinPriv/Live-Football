package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.anythink.expressad.exoplayer.k.p;
import com.google.android.material.internal.h;
import com.google.android.material.internal.n;
import com.huawei.hms.ads.gl;
import d7.g;
import d7.k;
import g0.a;
import g0.b;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import z6.d;

/* compiled from: ChipDrawable.java */
/* loaded from: classes2.dex */
public final class a extends g implements Drawable.Callback, h.b {

    /* renamed from: a1, reason: collision with root package name */
    public static final int[] f20612a1 = {R.attr.state_enabled};

    /* renamed from: b1, reason: collision with root package name */
    public static final ShapeDrawable f20613b1 = new ShapeDrawable(new OvalShape());
    public final Paint.FontMetrics A0;
    public final RectF B0;
    public final PointF C0;
    public final Path D0;
    public final h E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public int K0;
    public boolean L0;
    public int M0;
    public int N0;
    public ColorFilter O0;
    public ColorStateList P;
    public PorterDuffColorFilter P0;
    public ColorStateList Q;
    public ColorStateList Q0;
    public float R;
    public PorterDuff.Mode R0;
    public float S;
    public int[] S0;
    public ColorStateList T;
    public boolean T0;
    public float U;
    public ColorStateList U0;
    public ColorStateList V;
    public WeakReference<InterfaceC0236a> V0;
    public CharSequence W;
    public TextUtils.TruncateAt W0;
    public boolean X;
    public boolean X0;
    public Drawable Y;
    public int Y0;
    public ColorStateList Z;
    public boolean Z0;

    /* renamed from: c0, reason: collision with root package name */
    public float f20614c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f20615d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f20616e0;

    /* renamed from: f0, reason: collision with root package name */
    public Drawable f20617f0;

    /* renamed from: g0, reason: collision with root package name */
    public RippleDrawable f20618g0;

    /* renamed from: h0, reason: collision with root package name */
    public ColorStateList f20619h0;

    /* renamed from: i0, reason: collision with root package name */
    public float f20620i0;

    /* renamed from: j0, reason: collision with root package name */
    public SpannableStringBuilder f20621j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f20622k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f20623l0;

    /* renamed from: m0, reason: collision with root package name */
    public Drawable f20624m0;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f20625n0;

    /* renamed from: o0, reason: collision with root package name */
    public h6.g f20626o0;

    /* renamed from: p0, reason: collision with root package name */
    public h6.g f20627p0;

    /* renamed from: q0, reason: collision with root package name */
    public float f20628q0;

    /* renamed from: r0, reason: collision with root package name */
    public float f20629r0;

    /* renamed from: s0, reason: collision with root package name */
    public float f20630s0;

    /* renamed from: t0, reason: collision with root package name */
    public float f20631t0;

    /* renamed from: u0, reason: collision with root package name */
    public float f20632u0;

    /* renamed from: v0, reason: collision with root package name */
    public float f20633v0;

    /* renamed from: w0, reason: collision with root package name */
    public float f20634w0;

    /* renamed from: x0, reason: collision with root package name */
    public float f20635x0;
    public final Context y0;

    /* renamed from: z0, reason: collision with root package name */
    public final Paint f20636z0;

    /* compiled from: ChipDrawable.java */
    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0236a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.hamkho.livefoot.R.attr.chipStyle, com.hamkho.livefoot.R.style.Widget_MaterialComponents_Chip_Action);
        this.S = -1.0f;
        this.f20636z0 = new Paint(1);
        this.A0 = new Paint.FontMetrics();
        this.B0 = new RectF();
        this.C0 = new PointF();
        this.D0 = new Path();
        this.N0 = p.f9095b;
        this.R0 = PorterDuff.Mode.SRC_IN;
        this.V0 = new WeakReference<>(null);
        i(context);
        this.y0 = context;
        h hVar = new h(this);
        this.E0 = hVar;
        this.W = "";
        hVar.f20874a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f20612a1;
        setState(iArr);
        if (!Arrays.equals(this.S0, iArr)) {
            this.S0 = iArr;
            if (T()) {
                w(getState(), iArr);
            }
        }
        this.X0 = true;
        int[] iArr2 = a7.a.f352a;
        f20613b1.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean t(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public static boolean u(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public final void A(boolean z10) {
        boolean z11;
        if (this.f20623l0 != z10) {
            boolean R = R();
            this.f20623l0 = z10;
            boolean R2 = R();
            if (R != R2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (R2) {
                    o(this.f20624m0);
                } else {
                    U(this.f20624m0);
                }
                invalidateSelf();
                v();
            }
        }
    }

    @Deprecated
    public final void B(float f) {
        if (this.S != f) {
            this.S = f;
            setShapeAppearanceModel(this.f27403s.f27411a.e(f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.Y;
        Drawable drawable4 = null;
        if (drawable3 != 0) {
            boolean z10 = drawable3 instanceof b;
            drawable2 = drawable3;
            if (z10) {
                drawable2 = ((b) drawable3).b();
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float q10 = q();
            if (drawable != null) {
                drawable4 = drawable.mutate();
            }
            this.Y = drawable4;
            float q11 = q();
            U(drawable2);
            if (S()) {
                o(this.Y);
            }
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void D(float f) {
        if (this.f20614c0 != f) {
            float q10 = q();
            this.f20614c0 = f;
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        this.f20615d0 = true;
        if (this.Z != colorStateList) {
            this.Z = colorStateList;
            if (S()) {
                a.b.h(this.Y, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z10) {
        boolean z11;
        if (this.X != z10) {
            boolean S = S();
            this.X = z10;
            boolean S2 = S();
            if (S != S2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (S2) {
                    o(this.Y);
                } else {
                    U(this.Y);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void G(ColorStateList colorStateList) {
        if (this.T != colorStateList) {
            this.T = colorStateList;
            if (this.Z0) {
                g.b bVar = this.f27403s;
                if (bVar.f27414d != colorStateList) {
                    bVar.f27414d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void H(float f) {
        if (this.U != f) {
            this.U = f;
            this.f20636z0.setStrokeWidth(f);
            if (this.Z0) {
                this.f27403s.f27420k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f20617f0;
        Drawable drawable4 = null;
        if (drawable3 != 0) {
            boolean z10 = drawable3 instanceof b;
            drawable2 = drawable3;
            if (z10) {
                drawable2 = ((b) drawable3).b();
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float r10 = r();
            if (drawable != null) {
                drawable4 = drawable.mutate();
            }
            this.f20617f0 = drawable4;
            int[] iArr = a7.a.f352a;
            this.f20618g0 = new RippleDrawable(a7.a.c(this.V), this.f20617f0, f20613b1);
            float r11 = r();
            U(drawable2);
            if (T()) {
                o(this.f20617f0);
            }
            invalidateSelf();
            if (r10 != r11) {
                v();
            }
        }
    }

    public final void J(float f) {
        if (this.f20634w0 != f) {
            this.f20634w0 = f;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    public final void K(float f) {
        if (this.f20620i0 != f) {
            this.f20620i0 = f;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    public final void L(float f) {
        if (this.f20633v0 != f) {
            this.f20633v0 = f;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        if (this.f20619h0 != colorStateList) {
            this.f20619h0 = colorStateList;
            if (T()) {
                a.b.h(this.f20617f0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z10) {
        boolean z11;
        if (this.f20616e0 != z10) {
            boolean T = T();
            this.f20616e0 = z10;
            boolean T2 = T();
            if (T != T2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (T2) {
                    o(this.f20617f0);
                } else {
                    U(this.f20617f0);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void O(float f) {
        if (this.f20630s0 != f) {
            float q10 = q();
            this.f20630s0 = f;
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void P(float f) {
        if (this.f20629r0 != f) {
            float q10 = q();
            this.f20629r0 = f;
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (this.T0) {
                colorStateList2 = a7.a.c(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.U0 = colorStateList2;
            onStateChange(getState());
        }
    }

    public final boolean R() {
        if (this.f20623l0 && this.f20624m0 != null && this.L0) {
            return true;
        }
        return false;
    }

    public final boolean S() {
        if (this.X && this.Y != null) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        if (this.f20616e0 && this.f20617f0 != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.internal.h.b
    public final void a() {
        v();
        invalidateSelf();
    }

    @Override // d7.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        RectF rectF;
        int i12;
        int i13;
        int i14;
        RectF rectF2;
        boolean z10;
        int i15;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i10 = this.N0) != 0) {
            if (i10 < 255) {
                i11 = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
            } else {
                i11 = 0;
            }
            boolean z11 = this.Z0;
            Paint paint = this.f20636z0;
            RectF rectF3 = this.B0;
            if (!z11) {
                paint.setColor(this.F0);
                paint.setStyle(Paint.Style.FILL);
                rectF3.set(bounds);
                canvas.drawRoundRect(rectF3, s(), s(), paint);
            }
            if (!this.Z0) {
                paint.setColor(this.G0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.O0;
                if (colorFilter == null) {
                    colorFilter = this.P0;
                }
                paint.setColorFilter(colorFilter);
                rectF3.set(bounds);
                canvas.drawRoundRect(rectF3, s(), s(), paint);
            }
            if (this.Z0) {
                super.draw(canvas);
            }
            if (this.U > gl.Code && !this.Z0) {
                paint.setColor(this.I0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.Z0) {
                    ColorFilter colorFilter2 = this.O0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.P0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f = bounds.left;
                float f10 = this.U / 2.0f;
                rectF3.set(f + f10, bounds.top + f10, bounds.right - f10, bounds.bottom - f10);
                float f11 = this.S - (this.U / 2.0f);
                canvas.drawRoundRect(rectF3, f11, f11, paint);
            }
            paint.setColor(this.J0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            if (!this.Z0) {
                canvas.drawRoundRect(rectF3, s(), s(), paint);
            } else {
                RectF rectF4 = new RectF(bounds);
                Path path = this.D0;
                k kVar = this.J;
                g.b bVar = this.f27403s;
                kVar.a(bVar.f27411a, bVar.f27419j, rectF4, this.I, path);
                f(canvas, paint, path, this.f27403s.f27411a, h());
            }
            if (S()) {
                p(bounds, rectF3);
                float f12 = rectF3.left;
                float f13 = rectF3.top;
                canvas.translate(f12, f13);
                this.Y.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.Y.draw(canvas);
                canvas.translate(-f12, -f13);
            }
            if (R()) {
                p(bounds, rectF3);
                float f14 = rectF3.left;
                float f15 = rectF3.top;
                canvas.translate(f14, f15);
                this.f20624m0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.f20624m0.draw(canvas);
                canvas.translate(-f14, -f15);
            }
            if (this.X0 && this.W != null) {
                PointF pointF = this.C0;
                pointF.set(gl.Code, gl.Code);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.W;
                h hVar = this.E0;
                if (charSequence != null) {
                    float q10 = q() + this.f20628q0 + this.f20631t0;
                    if (a.c.a(this) == 0) {
                        pointF.x = bounds.left + q10;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = bounds.right - q10;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = bounds.centerY();
                    TextPaint textPaint = hVar.f20874a;
                    Paint.FontMetrics fontMetrics = this.A0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF3.setEmpty();
                if (this.W != null) {
                    float q11 = q() + this.f20628q0 + this.f20631t0;
                    float r10 = r() + this.f20635x0 + this.f20632u0;
                    if (a.c.a(this) == 0) {
                        rectF3.left = bounds.left + q11;
                        rectF3.right = bounds.right - r10;
                    } else {
                        rectF3.left = bounds.left + r10;
                        rectF3.right = bounds.right - q11;
                    }
                    rectF3.top = bounds.top;
                    rectF3.bottom = bounds.bottom;
                }
                d dVar = hVar.f;
                TextPaint textPaint2 = hVar.f20874a;
                if (dVar != null) {
                    textPaint2.drawableState = getState();
                    hVar.f.e(this.y0, textPaint2, hVar.f20875b);
                }
                textPaint2.setTextAlign(align);
                if (Math.round(hVar.a(this.W.toString())) > Math.round(rectF3.width())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i15 = canvas.save();
                    canvas.clipRect(rectF3);
                } else {
                    i15 = 0;
                }
                CharSequence charSequence2 = this.W;
                if (z10 && this.W0 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.W0);
                }
                CharSequence charSequence3 = charSequence2;
                int length = charSequence3.length();
                float f16 = pointF.x;
                float f17 = pointF.y;
                rectF = rectF3;
                i12 = i11;
                i13 = 0;
                i14 = 255;
                canvas.drawText(charSequence3, 0, length, f16, f17, textPaint2);
                if (z10) {
                    canvas.restoreToCount(i15);
                }
            } else {
                rectF = rectF3;
                i12 = i11;
                i13 = 0;
                i14 = 255;
            }
            if (T()) {
                rectF.setEmpty();
                if (T()) {
                    float f18 = this.f20635x0 + this.f20634w0;
                    if (a.c.a(this) == 0) {
                        float f19 = bounds.right - f18;
                        rectF2 = rectF;
                        rectF2.right = f19;
                        rectF2.left = f19 - this.f20620i0;
                    } else {
                        rectF2 = rectF;
                        float f20 = bounds.left + f18;
                        rectF2.left = f20;
                        rectF2.right = f20 + this.f20620i0;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f21 = this.f20620i0;
                    float f22 = exactCenterY - (f21 / 2.0f);
                    rectF2.top = f22;
                    rectF2.bottom = f22 + f21;
                } else {
                    rectF2 = rectF;
                }
                float f23 = rectF2.left;
                float f24 = rectF2.top;
                canvas.translate(f23, f24);
                this.f20617f0.setBounds(i13, i13, (int) rectF2.width(), (int) rectF2.height());
                int[] iArr = a7.a.f352a;
                this.f20618g0.setBounds(this.f20617f0.getBounds());
                this.f20618g0.jumpToCurrentState();
                this.f20618g0.draw(canvas);
                canvas.translate(-f23, -f24);
            }
            if (this.N0 < i14) {
                canvas.restoreToCount(i12);
            }
        }
    }

    @Override // d7.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.N0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.O0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.R;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(r() + this.E0.a(this.W.toString()) + q() + this.f20628q0 + this.f20631t0 + this.f20632u0 + this.f20635x0), this.Y0);
    }

    @Override // d7.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // d7.g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.Z0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.S);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.R, this.S);
        }
        outline.setAlpha(this.N0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // d7.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        boolean z10;
        boolean z11;
        ColorStateList colorStateList;
        if (t(this.P) || t(this.Q) || t(this.T)) {
            return true;
        }
        if (this.T0 && t(this.U0)) {
            return true;
        }
        d dVar = this.E0.f;
        if (dVar != null && (colorStateList = dVar.f37318j) != null && colorStateList.isStateful()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        if (this.f20623l0 && this.f20624m0 != null && this.f20622k0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 || u(this.Y) || u(this.f20624m0) || t(this.Q0)) {
            return true;
        }
        return false;
    }

    public final void o(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        a.c.b(drawable, a.c.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f20617f0) {
            if (drawable.isStateful()) {
                drawable.setState(this.S0);
            }
            a.b.h(drawable, this.f20619h0);
            return;
        }
        Drawable drawable2 = this.Y;
        if (drawable == drawable2 && this.f20615d0) {
            a.b.h(drawable2, this.Z);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (S()) {
            onLayoutDirectionChanged |= a.c.b(this.Y, i10);
        }
        if (R()) {
            onLayoutDirectionChanged |= a.c.b(this.f20624m0, i10);
        }
        if (T()) {
            onLayoutDirectionChanged |= a.c.b(this.f20617f0, i10);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (S()) {
            onLevelChange |= this.Y.setLevel(i10);
        }
        if (R()) {
            onLevelChange |= this.f20624m0.setLevel(i10);
        }
        if (T()) {
            onLevelChange |= this.f20617f0.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // d7.g, android.graphics.drawable.Drawable, com.google.android.material.internal.h.b
    public final boolean onStateChange(int[] iArr) {
        if (this.Z0) {
            super.onStateChange(iArr);
        }
        return w(iArr, this.S0);
    }

    public final void p(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        float f;
        rectF.setEmpty();
        if (S() || R()) {
            float f10 = this.f20628q0 + this.f20629r0;
            if (this.L0) {
                drawable = this.f20624m0;
            } else {
                drawable = this.Y;
            }
            float f11 = this.f20614c0;
            if (f11 <= gl.Code && drawable != null) {
                f11 = drawable.getIntrinsicWidth();
            }
            if (a.c.a(this) == 0) {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + f11;
            } else {
                float f13 = rect.right - f10;
                rectF.right = f13;
                rectF.left = f13 - f11;
            }
            if (this.L0) {
                drawable2 = this.f20624m0;
            } else {
                drawable2 = this.Y;
            }
            float f14 = this.f20614c0;
            if (f14 <= gl.Code && drawable2 != null) {
                f14 = (float) Math.ceil(n.b(24, this.y0));
                if (drawable2.getIntrinsicHeight() <= f14) {
                    f = drawable2.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f;
                }
            }
            f = f14;
            float exactCenterY2 = rect.exactCenterY() - (f / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f;
        }
    }

    public final float q() {
        Drawable drawable;
        if (!S() && !R()) {
            return gl.Code;
        }
        float f = this.f20629r0;
        if (this.L0) {
            drawable = this.f20624m0;
        } else {
            drawable = this.Y;
        }
        float f10 = this.f20614c0;
        if (f10 <= gl.Code && drawable != null) {
            f10 = drawable.getIntrinsicWidth();
        }
        return f10 + f + this.f20630s0;
    }

    public final float r() {
        if (T()) {
            return this.f20633v0 + this.f20620i0 + this.f20634w0;
        }
        return gl.Code;
    }

    public final float s() {
        if (this.Z0) {
            return this.f27403s.f27411a.f27435e.a(h());
        }
        return this.S;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // d7.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.N0 != i10) {
            this.N0 = i10;
            invalidateSelf();
        }
    }

    @Override // d7.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.O0 != colorFilter) {
            this.O0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // d7.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.Q0 != colorStateList) {
            this.Q0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // d7.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.R0 != mode) {
            this.R0 = mode;
            ColorStateList colorStateList = this.Q0;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.P0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (S()) {
            visible |= this.Y.setVisible(z10, z11);
        }
        if (R()) {
            visible |= this.f20624m0.setVisible(z10, z11);
        }
        if (T()) {
            visible |= this.f20617f0.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v() {
        InterfaceC0236a interfaceC0236a = this.V0.get();
        if (interfaceC0236a != null) {
            interfaceC0236a.a();
        }
    }

    public final boolean w(int[] iArr, int[] iArr2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        boolean z12;
        boolean z13;
        boolean z14;
        int i15;
        PorterDuffColorFilter porterDuffColorFilter;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.P;
        if (colorStateList2 != null) {
            i10 = colorStateList2.getColorForState(iArr, this.F0);
        } else {
            i10 = 0;
        }
        int d10 = d(i10);
        boolean z15 = true;
        if (this.F0 != d10) {
            this.F0 = d10;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.Q;
        if (colorStateList3 != null) {
            i11 = colorStateList3.getColorForState(iArr, this.G0);
        } else {
            i11 = 0;
        }
        int d11 = d(i11);
        if (this.G0 != d11) {
            this.G0 = d11;
            onStateChange = true;
        }
        int b10 = f0.a.b(d11, d10);
        if (this.H0 != b10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f27403s.f27413c == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 | z11) {
            this.H0 = b10;
            k(ColorStateList.valueOf(b10));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.T;
        if (colorStateList4 != null) {
            i12 = colorStateList4.getColorForState(iArr, this.I0);
        } else {
            i12 = 0;
        }
        if (this.I0 != i12) {
            this.I0 = i12;
            onStateChange = true;
        }
        if (this.U0 != null && a7.a.d(iArr)) {
            i13 = this.U0.getColorForState(iArr, this.J0);
        } else {
            i13 = 0;
        }
        if (this.J0 != i13) {
            this.J0 = i13;
            if (this.T0) {
                onStateChange = true;
            }
        }
        d dVar = this.E0.f;
        if (dVar != null && (colorStateList = dVar.f37318j) != null) {
            i14 = colorStateList.getColorForState(iArr, this.K0);
        } else {
            i14 = 0;
        }
        if (this.K0 != i14) {
            this.K0 = i14;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            for (int i16 : state) {
                if (i16 == 16842912) {
                    z12 = true;
                    break;
                }
            }
        }
        z12 = false;
        if (z12 && this.f20622k0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (this.L0 != z13 && this.f20624m0 != null) {
            float q10 = q();
            this.L0 = z13;
            if (q10 != q()) {
                onStateChange = true;
                z14 = true;
            } else {
                z14 = false;
                onStateChange = true;
            }
        } else {
            z14 = false;
        }
        ColorStateList colorStateList5 = this.Q0;
        if (colorStateList5 != null) {
            i15 = colorStateList5.getColorForState(iArr, this.M0);
        } else {
            i15 = 0;
        }
        if (this.M0 != i15) {
            this.M0 = i15;
            ColorStateList colorStateList6 = this.Q0;
            PorterDuff.Mode mode = this.R0;
            if (colorStateList6 != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.P0 = porterDuffColorFilter;
        } else {
            z15 = onStateChange;
        }
        if (u(this.Y)) {
            z15 |= this.Y.setState(iArr);
        }
        if (u(this.f20624m0)) {
            z15 |= this.f20624m0.setState(iArr);
        }
        if (u(this.f20617f0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z15 |= this.f20617f0.setState(iArr3);
        }
        int[] iArr4 = a7.a.f352a;
        if (u(this.f20618g0)) {
            z15 |= this.f20618g0.setState(iArr2);
        }
        if (z15) {
            invalidateSelf();
        }
        if (z14) {
            v();
        }
        return z15;
    }

    public final void x(boolean z10) {
        if (this.f20622k0 != z10) {
            this.f20622k0 = z10;
            float q10 = q();
            if (!z10 && this.L0) {
                this.L0 = false;
            }
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void y(Drawable drawable) {
        if (this.f20624m0 != drawable) {
            float q10 = q();
            this.f20624m0 = drawable;
            float q11 = q();
            U(this.f20624m0);
            o(this.f20624m0);
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void z(ColorStateList colorStateList) {
        boolean z10;
        if (this.f20625n0 != colorStateList) {
            this.f20625n0 = colorStateList;
            if (this.f20623l0 && this.f20624m0 != null && this.f20622k0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                a.b.h(this.f20624m0, colorStateList);
            }
            onStateChange(getState());
        }
    }
}
