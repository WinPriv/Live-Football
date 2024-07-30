package n1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import com.anythink.expressad.exoplayer.k.p;
import com.huawei.hms.ads.gl;
import f0.d;
import g0.a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VectorDrawableCompat.java */
/* loaded from: classes.dex */
public final class g extends n1.f {
    public static final PorterDuff.Mode B = PorterDuff.Mode.SRC_IN;
    public final Rect A;

    /* renamed from: t, reason: collision with root package name */
    public C0444g f33160t;

    /* renamed from: u, reason: collision with root package name */
    public PorterDuffColorFilter f33161u;

    /* renamed from: v, reason: collision with root package name */
    public ColorFilter f33162v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f33163w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f33164x;
    public final float[] y;

    /* renamed from: z, reason: collision with root package name */
    public final Matrix f33165z;

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class a extends e {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class d {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: n1.g$g, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0444g extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public int f33204a;

        /* renamed from: b, reason: collision with root package name */
        public f f33205b;

        /* renamed from: c, reason: collision with root package name */
        public ColorStateList f33206c;

        /* renamed from: d, reason: collision with root package name */
        public PorterDuff.Mode f33207d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f33208e;
        public Bitmap f;

        /* renamed from: g, reason: collision with root package name */
        public ColorStateList f33209g;

        /* renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f33210h;

        /* renamed from: i, reason: collision with root package name */
        public int f33211i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f33212j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f33213k;

        /* renamed from: l, reason: collision with root package name */
        public Paint f33214l;

        public C0444g(C0444g c0444g) {
            this.f33206c = null;
            this.f33207d = g.B;
            if (c0444g != null) {
                this.f33204a = c0444g.f33204a;
                f fVar = new f(c0444g.f33205b);
                this.f33205b = fVar;
                if (c0444g.f33205b.f33195e != null) {
                    fVar.f33195e = new Paint(c0444g.f33205b.f33195e);
                }
                if (c0444g.f33205b.f33194d != null) {
                    this.f33205b.f33194d = new Paint(c0444g.f33205b.f33194d);
                }
                this.f33206c = c0444g.f33206c;
                this.f33207d = c0444g.f33207d;
                this.f33208e = c0444g.f33208e;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f33204a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new g(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new g(this);
        }

        public C0444g() {
            this.f33206c = null;
            this.f33207d = g.B;
            this.f33205b = new f();
        }
    }

    public g() {
        this.f33164x = true;
        this.y = new float[9];
        this.f33165z = new Matrix();
        this.A = new Rect();
        this.f33160t = new C0444g();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            a.b.b(drawable);
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        if (r10 == false) goto L40;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.g.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return a.C0385a.a(drawable);
        }
        return this.f33160t.f33205b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f33160t.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return a.b.c(drawable);
        }
        return this.f33162v;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f33159s != null) {
            return new h(this.f33159s.getConstantState());
        }
        this.f33160t.f33204a = getChangingConfigurations();
        return this.f33160t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f33160t.f33205b.f33198i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f33160t.f33205b.f33197h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return a.C0385a.d(drawable);
        }
        return this.f33160t.f33208e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C0444g c0444g = this.f33160t;
            if (c0444g != null) {
                f fVar = c0444g.f33205b;
                if (fVar.f33203n == null) {
                    fVar.f33203n = Boolean.valueOf(fVar.f33196g.a());
                }
                if (fVar.f33203n.booleanValue() || ((colorStateList = this.f33160t.f33206c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f33163w && super.mutate() == this) {
            this.f33160t = new C0444g(this.f33160t);
            this.f33163w = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0444g c0444g = this.f33160t;
        ColorStateList colorStateList = c0444g.f33206c;
        if (colorStateList != null && (mode = c0444g.f33207d) != null) {
            this.f33161u = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        } else {
            z10 = false;
        }
        f fVar = c0444g.f33205b;
        if (fVar.f33203n == null) {
            fVar.f33203n = Boolean.valueOf(fVar.f33196g.a());
        }
        if (fVar.f33203n.booleanValue()) {
            boolean b10 = c0444g.f33205b.f33196g.b(iArr);
            c0444g.f33213k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f33160t.f33205b.getRootAlpha() != i10) {
            this.f33160t.f33205b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            a.C0385a.e(drawable, z10);
        } else {
            this.f33160t.f33208e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f33162v = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            g0.a.a(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            a.b.h(drawable, colorStateList);
            return;
        }
        C0444g c0444g = this.f33160t;
        if (c0444g.f33206c != colorStateList) {
            c0444g.f33206c = colorStateList;
            this.f33161u = a(colorStateList, c0444g.f33207d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            a.b.i(drawable, mode);
            return;
        }
        C0444g c0444g = this.f33160t;
        if (c0444g.f33207d != mode) {
            c0444g.f33207d = mode;
            this.f33161u = a(c0444g.f33206c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f33215a;

        public h(Drawable.ConstantState constantState) {
            this.f33215a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f33215a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f33215a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            g gVar = new g();
            gVar.f33159s = (VectorDrawable) this.f33215a.newDrawable();
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.f33159s = (VectorDrawable) this.f33215a.newDrawable(resources);
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.f33159s = (VectorDrawable) this.f33215a.newDrawable(resources, theme);
            return gVar;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class e extends d {

        /* renamed from: a, reason: collision with root package name */
        public d.a[] f33186a;

        /* renamed from: b, reason: collision with root package name */
        public String f33187b;

        /* renamed from: c, reason: collision with root package name */
        public int f33188c;

        /* renamed from: d, reason: collision with root package name */
        public final int f33189d;

        public e() {
            this.f33186a = null;
            this.f33188c = 0;
        }

        public d.a[] getPathData() {
            return this.f33186a;
        }

        public String getPathName() {
            return this.f33187b;
        }

        public void setPathData(d.a[] aVarArr) {
            if (!f0.d.a(this.f33186a, aVarArr)) {
                this.f33186a = f0.d.e(aVarArr);
                return;
            }
            d.a[] aVarArr2 = this.f33186a;
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                aVarArr2[i10].f27904a = aVarArr[i10].f27904a;
                int i11 = 0;
                while (true) {
                    float[] fArr = aVarArr[i10].f27905b;
                    if (i11 < fArr.length) {
                        aVarArr2[i10].f27905b[i11] = fArr[i11];
                        i11++;
                    }
                }
            }
        }

        public e(e eVar) {
            this.f33186a = null;
            this.f33188c = 0;
            this.f33187b = eVar.f33187b;
            this.f33189d = eVar.f33189d;
            this.f33186a = f0.d.e(eVar.f33186a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.g.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public g(C0444g c0444g) {
        this.f33164x = true;
        this.y = new float[9];
        this.f33165z = new Matrix();
        this.A = new Rect();
        this.f33160t = c0444g;
        this.f33161u = a(c0444g.f33206c, c0444g.f33207d);
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: e, reason: collision with root package name */
        public e0.c f33166e;
        public float f;

        /* renamed from: g, reason: collision with root package name */
        public e0.c f33167g;

        /* renamed from: h, reason: collision with root package name */
        public float f33168h;

        /* renamed from: i, reason: collision with root package name */
        public float f33169i;

        /* renamed from: j, reason: collision with root package name */
        public float f33170j;

        /* renamed from: k, reason: collision with root package name */
        public float f33171k;

        /* renamed from: l, reason: collision with root package name */
        public float f33172l;

        /* renamed from: m, reason: collision with root package name */
        public Paint.Cap f33173m;

        /* renamed from: n, reason: collision with root package name */
        public Paint.Join f33174n;
        public float o;

        public b() {
            this.f = gl.Code;
            this.f33168h = 1.0f;
            this.f33169i = 1.0f;
            this.f33170j = gl.Code;
            this.f33171k = 1.0f;
            this.f33172l = gl.Code;
            this.f33173m = Paint.Cap.BUTT;
            this.f33174n = Paint.Join.MITER;
            this.o = 4.0f;
        }

        @Override // n1.g.d
        public final boolean a() {
            if (!this.f33167g.b() && !this.f33166e.b()) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // n1.g.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean b(int[] r7) {
            /*
                r6 = this;
                e0.c r0 = r6.f33167g
                boolean r1 = r0.b()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L1c
                android.content.res.ColorStateList r1 = r0.f27619b
                int r4 = r1.getDefaultColor()
                int r1 = r1.getColorForState(r7, r4)
                int r4 = r0.f27620c
                if (r1 == r4) goto L1c
                r0.f27620c = r1
                r0 = r2
                goto L1d
            L1c:
                r0 = r3
            L1d:
                e0.c r1 = r6.f33166e
                boolean r4 = r1.b()
                if (r4 == 0) goto L36
                android.content.res.ColorStateList r4 = r1.f27619b
                int r5 = r4.getDefaultColor()
                int r7 = r4.getColorForState(r7, r5)
                int r4 = r1.f27620c
                if (r7 == r4) goto L36
                r1.f27620c = r7
                goto L37
            L36:
                r2 = r3
            L37:
                r7 = r2 | r0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.g.b.b(int[]):boolean");
        }

        public float getFillAlpha() {
            return this.f33169i;
        }

        public int getFillColor() {
            return this.f33167g.f27620c;
        }

        public float getStrokeAlpha() {
            return this.f33168h;
        }

        public int getStrokeColor() {
            return this.f33166e.f27620c;
        }

        public float getStrokeWidth() {
            return this.f;
        }

        public float getTrimPathEnd() {
            return this.f33171k;
        }

        public float getTrimPathOffset() {
            return this.f33172l;
        }

        public float getTrimPathStart() {
            return this.f33170j;
        }

        public void setFillAlpha(float f) {
            this.f33169i = f;
        }

        public void setFillColor(int i10) {
            this.f33167g.f27620c = i10;
        }

        public void setStrokeAlpha(float f) {
            this.f33168h = f;
        }

        public void setStrokeColor(int i10) {
            this.f33166e.f27620c = i10;
        }

        public void setStrokeWidth(float f) {
            this.f = f;
        }

        public void setTrimPathEnd(float f) {
            this.f33171k = f;
        }

        public void setTrimPathOffset(float f) {
            this.f33172l = f;
        }

        public void setTrimPathStart(float f) {
            this.f33170j = f;
        }

        public b(b bVar) {
            super(bVar);
            this.f = gl.Code;
            this.f33168h = 1.0f;
            this.f33169i = 1.0f;
            this.f33170j = gl.Code;
            this.f33171k = 1.0f;
            this.f33172l = gl.Code;
            this.f33173m = Paint.Cap.BUTT;
            this.f33174n = Paint.Join.MITER;
            this.o = 4.0f;
            this.f33166e = bVar.f33166e;
            this.f = bVar.f;
            this.f33168h = bVar.f33168h;
            this.f33167g = bVar.f33167g;
            this.f33188c = bVar.f33188c;
            this.f33169i = bVar.f33169i;
            this.f33170j = bVar.f33170j;
            this.f33171k = bVar.f33171k;
            this.f33172l = bVar.f33172l;
            this.f33173m = bVar.f33173m;
            this.f33174n = bVar.f33174n;
            this.o = bVar.o;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f33175a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<d> f33176b;

        /* renamed from: c, reason: collision with root package name */
        public float f33177c;

        /* renamed from: d, reason: collision with root package name */
        public float f33178d;

        /* renamed from: e, reason: collision with root package name */
        public float f33179e;
        public float f;

        /* renamed from: g, reason: collision with root package name */
        public float f33180g;

        /* renamed from: h, reason: collision with root package name */
        public float f33181h;

        /* renamed from: i, reason: collision with root package name */
        public float f33182i;

        /* renamed from: j, reason: collision with root package name */
        public final Matrix f33183j;

        /* renamed from: k, reason: collision with root package name */
        public final int f33184k;

        /* renamed from: l, reason: collision with root package name */
        public String f33185l;

        public c() {
            this.f33175a = new Matrix();
            this.f33176b = new ArrayList<>();
            this.f33177c = gl.Code;
            this.f33178d = gl.Code;
            this.f33179e = gl.Code;
            this.f = 1.0f;
            this.f33180g = 1.0f;
            this.f33181h = gl.Code;
            this.f33182i = gl.Code;
            this.f33183j = new Matrix();
            this.f33185l = null;
        }

        @Override // n1.g.d
        public final boolean a() {
            int i10 = 0;
            while (true) {
                ArrayList<d> arrayList = this.f33176b;
                if (i10 >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i10).a()) {
                    return true;
                }
                i10++;
            }
        }

        @Override // n1.g.d
        public final boolean b(int[] iArr) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                ArrayList<d> arrayList = this.f33176b;
                if (i10 < arrayList.size()) {
                    z10 |= arrayList.get(i10).b(iArr);
                    i10++;
                } else {
                    return z10;
                }
            }
        }

        public final void c() {
            Matrix matrix = this.f33183j;
            matrix.reset();
            matrix.postTranslate(-this.f33178d, -this.f33179e);
            matrix.postScale(this.f, this.f33180g);
            matrix.postRotate(this.f33177c, gl.Code, gl.Code);
            matrix.postTranslate(this.f33181h + this.f33178d, this.f33182i + this.f33179e);
        }

        public String getGroupName() {
            return this.f33185l;
        }

        public Matrix getLocalMatrix() {
            return this.f33183j;
        }

        public float getPivotX() {
            return this.f33178d;
        }

        public float getPivotY() {
            return this.f33179e;
        }

        public float getRotation() {
            return this.f33177c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.f33180g;
        }

        public float getTranslateX() {
            return this.f33181h;
        }

        public float getTranslateY() {
            return this.f33182i;
        }

        public void setPivotX(float f) {
            if (f != this.f33178d) {
                this.f33178d = f;
                c();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f33179e) {
                this.f33179e = f;
                c();
            }
        }

        public void setRotation(float f) {
            if (f != this.f33177c) {
                this.f33177c = f;
                c();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f) {
                this.f = f;
                c();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f33180g) {
                this.f33180g = f;
                c();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f33181h) {
                this.f33181h = f;
                c();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f33182i) {
                this.f33182i = f;
                c();
            }
        }

        public c(c cVar, q.b<String, Object> bVar) {
            e aVar;
            this.f33175a = new Matrix();
            this.f33176b = new ArrayList<>();
            this.f33177c = gl.Code;
            this.f33178d = gl.Code;
            this.f33179e = gl.Code;
            this.f = 1.0f;
            this.f33180g = 1.0f;
            this.f33181h = gl.Code;
            this.f33182i = gl.Code;
            Matrix matrix = new Matrix();
            this.f33183j = matrix;
            this.f33185l = null;
            this.f33177c = cVar.f33177c;
            this.f33178d = cVar.f33178d;
            this.f33179e = cVar.f33179e;
            this.f = cVar.f;
            this.f33180g = cVar.f33180g;
            this.f33181h = cVar.f33181h;
            this.f33182i = cVar.f33182i;
            String str = cVar.f33185l;
            this.f33185l = str;
            this.f33184k = cVar.f33184k;
            if (str != null) {
                bVar.put(str, this);
            }
            matrix.set(cVar.f33183j);
            ArrayList<d> arrayList = cVar.f33176b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                d dVar = arrayList.get(i10);
                if (dVar instanceof c) {
                    this.f33176b.add(new c((c) dVar, bVar));
                } else {
                    if (dVar instanceof b) {
                        aVar = new b((b) dVar);
                    } else if (dVar instanceof a) {
                        aVar = new a((a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f33176b.add(aVar);
                    String str2 = aVar.f33187b;
                    if (str2 != null) {
                        bVar.put(str2, aVar);
                    }
                }
            }
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: p, reason: collision with root package name */
        public static final Matrix f33190p = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Path f33191a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f33192b;

        /* renamed from: c, reason: collision with root package name */
        public final Matrix f33193c;

        /* renamed from: d, reason: collision with root package name */
        public Paint f33194d;

        /* renamed from: e, reason: collision with root package name */
        public Paint f33195e;
        public PathMeasure f;

        /* renamed from: g, reason: collision with root package name */
        public final c f33196g;

        /* renamed from: h, reason: collision with root package name */
        public float f33197h;

        /* renamed from: i, reason: collision with root package name */
        public float f33198i;

        /* renamed from: j, reason: collision with root package name */
        public float f33199j;

        /* renamed from: k, reason: collision with root package name */
        public float f33200k;

        /* renamed from: l, reason: collision with root package name */
        public int f33201l;

        /* renamed from: m, reason: collision with root package name */
        public String f33202m;

        /* renamed from: n, reason: collision with root package name */
        public Boolean f33203n;
        public final q.b<String, Object> o;

        public f() {
            this.f33193c = new Matrix();
            this.f33197h = gl.Code;
            this.f33198i = gl.Code;
            this.f33199j = gl.Code;
            this.f33200k = gl.Code;
            this.f33201l = p.f9095b;
            this.f33202m = null;
            this.f33203n = null;
            this.o = new q.b<>();
            this.f33196g = new c();
            this.f33191a = new Path();
            this.f33192b = new Path();
        }

        public final void a(c cVar, Matrix matrix, Canvas canvas, int i10, int i11) {
            int i12;
            float f;
            float f10;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            Path.FillType fillType;
            Path.FillType fillType2;
            cVar.f33175a.set(matrix);
            Matrix matrix2 = cVar.f33175a;
            matrix2.preConcat(cVar.f33183j);
            canvas.save();
            char c10 = 0;
            int i13 = 0;
            while (true) {
                ArrayList<d> arrayList = cVar.f33176b;
                if (i13 < arrayList.size()) {
                    d dVar = arrayList.get(i13);
                    if (dVar instanceof c) {
                        a((c) dVar, matrix2, canvas, i10, i11);
                    } else if (dVar instanceof e) {
                        e eVar = (e) dVar;
                        float f11 = i10 / this.f33199j;
                        float f12 = i11 / this.f33200k;
                        float min = Math.min(f11, f12);
                        Matrix matrix3 = this.f33193c;
                        matrix3.set(matrix2);
                        matrix3.postScale(f11, f12);
                        float[] fArr = {gl.Code, 1.0f, 1.0f, gl.Code};
                        matrix2.mapVectors(fArr);
                        float hypot = (float) Math.hypot(fArr[c10], fArr[1]);
                        i12 = i13;
                        float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                        float f13 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                        float max = Math.max(hypot, hypot2);
                        if (max > gl.Code) {
                            f = Math.abs(f13) / max;
                        } else {
                            f = 0.0f;
                        }
                        if (f != gl.Code) {
                            eVar.getClass();
                            Path path = this.f33191a;
                            path.reset();
                            d.a[] aVarArr = eVar.f33186a;
                            if (aVarArr != null) {
                                d.a.b(aVarArr, path);
                            }
                            Path path2 = this.f33192b;
                            path2.reset();
                            if (eVar instanceof a) {
                                if (eVar.f33188c == 0) {
                                    fillType2 = Path.FillType.WINDING;
                                } else {
                                    fillType2 = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType2);
                                path2.addPath(path, matrix3);
                                canvas.clipPath(path2);
                            } else {
                                b bVar = (b) eVar;
                                float f14 = bVar.f33170j;
                                if (f14 != gl.Code || bVar.f33171k != 1.0f) {
                                    float f15 = bVar.f33172l;
                                    float f16 = (f14 + f15) % 1.0f;
                                    float f17 = (bVar.f33171k + f15) % 1.0f;
                                    if (this.f == null) {
                                        this.f = new PathMeasure();
                                    }
                                    this.f.setPath(path, false);
                                    float length = this.f.getLength();
                                    float f18 = f16 * length;
                                    float f19 = f17 * length;
                                    path.reset();
                                    if (f18 > f19) {
                                        this.f.getSegment(f18, length, path, true);
                                        PathMeasure pathMeasure = this.f;
                                        f10 = gl.Code;
                                        pathMeasure.getSegment(gl.Code, f19, path, true);
                                    } else {
                                        f10 = 0.0f;
                                        this.f.getSegment(f18, f19, path, true);
                                    }
                                    path.rLineTo(f10, f10);
                                }
                                path2.addPath(path, matrix3);
                                e0.c cVar2 = bVar.f33167g;
                                if (cVar2.f27618a != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10 && cVar2.f27620c == 0) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                if (z11) {
                                    if (this.f33195e == null) {
                                        Paint paint = new Paint(1);
                                        this.f33195e = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    }
                                    Paint paint2 = this.f33195e;
                                    Shader shader = cVar2.f27618a;
                                    if (shader != null) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (z15) {
                                        shader.setLocalMatrix(matrix3);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(bVar.f33169i * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(p.f9095b);
                                        int i14 = cVar2.f27620c;
                                        float f20 = bVar.f33169i;
                                        PorterDuff.Mode mode = g.B;
                                        paint2.setColor((i14 & 16777215) | (((int) (Color.alpha(i14) * f20)) << 24));
                                    }
                                    paint2.setColorFilter(null);
                                    if (bVar.f33188c == 0) {
                                        fillType = Path.FillType.WINDING;
                                    } else {
                                        fillType = Path.FillType.EVEN_ODD;
                                    }
                                    path2.setFillType(fillType);
                                    canvas.drawPath(path2, paint2);
                                }
                                e0.c cVar3 = bVar.f33166e;
                                if (cVar3.f27618a != null) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (!z12 && cVar3.f27620c == 0) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                                if (z13) {
                                    if (this.f33194d == null) {
                                        z14 = true;
                                        Paint paint3 = new Paint(1);
                                        this.f33194d = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    } else {
                                        z14 = true;
                                    }
                                    Paint paint4 = this.f33194d;
                                    Paint.Join join = bVar.f33174n;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = bVar.f33173m;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(bVar.o);
                                    Shader shader2 = cVar3.f27618a;
                                    if (shader2 == null) {
                                        z14 = false;
                                    }
                                    if (z14) {
                                        shader2.setLocalMatrix(matrix3);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(bVar.f33168h * 255.0f));
                                    } else {
                                        paint4.setShader(null);
                                        paint4.setAlpha(p.f9095b);
                                        int i15 = cVar3.f27620c;
                                        float f21 = bVar.f33168h;
                                        PorterDuff.Mode mode2 = g.B;
                                        paint4.setColor((i15 & 16777215) | (((int) (Color.alpha(i15) * f21)) << 24));
                                    }
                                    paint4.setColorFilter(null);
                                    paint4.setStrokeWidth(bVar.f * f * min);
                                    canvas.drawPath(path2, paint4);
                                }
                            }
                        }
                        i13 = i12 + 1;
                        c10 = 0;
                    }
                    i12 = i13;
                    i13 = i12 + 1;
                    c10 = 0;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f33201l;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f33201l = i10;
        }

        public f(f fVar) {
            this.f33193c = new Matrix();
            this.f33197h = gl.Code;
            this.f33198i = gl.Code;
            this.f33199j = gl.Code;
            this.f33200k = gl.Code;
            this.f33201l = p.f9095b;
            this.f33202m = null;
            this.f33203n = null;
            q.b<String, Object> bVar = new q.b<>();
            this.o = bVar;
            this.f33196g = new c(fVar.f33196g, bVar);
            this.f33191a = new Path(fVar.f33191a);
            this.f33192b = new Path(fVar.f33192b);
            this.f33197h = fVar.f33197h;
            this.f33198i = fVar.f33198i;
            this.f33199j = fVar.f33199j;
            this.f33200k = fVar.f33200k;
            this.f33201l = fVar.f33201l;
            this.f33202m = fVar.f33202m;
            String str = fVar.f33202m;
            if (str != null) {
                bVar.put(str, this);
            }
            this.f33203n = fVar.f33203n;
        }
    }
}
