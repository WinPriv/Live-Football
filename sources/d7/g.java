package d7;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.anythink.expressad.exoplayer.k.p;
import com.huawei.hms.ads.gl;
import d7.k;
import d7.m;
import java.util.BitSet;

/* compiled from: MaterialShapeDrawable.java */
/* loaded from: classes2.dex */
public class g extends Drawable implements n {
    public static final Paint O;
    public final RectF A;
    public final RectF B;
    public final Region C;
    public final Region D;
    public j E;
    public final Paint F;
    public final Paint G;
    public final c7.a H;
    public final a I;
    public final k J;
    public PorterDuffColorFilter K;
    public PorterDuffColorFilter L;
    public final RectF M;
    public final boolean N;

    /* renamed from: s, reason: collision with root package name */
    public b f27403s;

    /* renamed from: t, reason: collision with root package name */
    public final m.f[] f27404t;

    /* renamed from: u, reason: collision with root package name */
    public final m.f[] f27405u;

    /* renamed from: v, reason: collision with root package name */
    public final BitSet f27406v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f27407w;

    /* renamed from: x, reason: collision with root package name */
    public final Matrix f27408x;
    public final Path y;

    /* renamed from: z, reason: collision with root package name */
    public final Path f27409z;

    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: classes2.dex */
    public class a {
        public a() {
        }
    }

    static {
        Paint paint = new Paint(1);
        O = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new j());
    }

    public final void b(RectF rectF, Path path) {
        k kVar = this.J;
        b bVar = this.f27403s;
        kVar.a(bVar.f27411a, bVar.f27419j, rectF, this.I, path);
        if (this.f27403s.f27418i != 1.0f) {
            Matrix matrix = this.f27408x;
            matrix.reset();
            float f = this.f27403s.f27418i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.M, true);
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        int color;
        int d10;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z10) {
                colorForState = d(colorForState);
            }
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z10 && (d10 = d((color = paint.getColor()))) != color) {
            porterDuffColorFilter = new PorterDuffColorFilter(d10, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        return porterDuffColorFilter;
    }

    public final int d(int i10) {
        b bVar = this.f27403s;
        float f = bVar.f27423n + bVar.o + bVar.f27422m;
        t6.a aVar = bVar.f27412b;
        if (aVar != null) {
            return aVar.a(f, i10);
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0128, code lost:
    
        if (r0 != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0214  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r22) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.g.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas) {
        if (this.f27406v.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i10 = this.f27403s.f27426r;
        Path path = this.y;
        c7.a aVar = this.H;
        if (i10 != 0) {
            canvas.drawPath(path, aVar.f3456a);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            m.f fVar = this.f27404t[i11];
            int i12 = this.f27403s.f27425q;
            Matrix matrix = m.f.f27487b;
            fVar.a(matrix, aVar, i12, canvas);
            this.f27405u[i11].a(matrix, aVar, this.f27403s.f27425q, canvas);
        }
        if (this.N) {
            b bVar = this.f27403s;
            int sin = (int) (Math.sin(Math.toRadians(bVar.f27427s)) * bVar.f27426r);
            b bVar2 = this.f27403s;
            int cos = (int) (Math.cos(Math.toRadians(bVar2.f27427s)) * bVar2.f27426r);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, O);
            canvas.translate(sin, cos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, j jVar, RectF rectF) {
        if (jVar.d(rectF)) {
            float a10 = jVar.f.a(rectF) * this.f27403s.f27419j;
            canvas.drawRoundRect(rectF, a10, a10, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    public void g(Canvas canvas) {
        boolean z10;
        Paint paint = this.G;
        Path path = this.f27409z;
        j jVar = this.E;
        RectF rectF = this.B;
        rectF.set(h());
        Paint.Style style = this.f27403s.f27429u;
        Paint.Style style2 = Paint.Style.FILL_AND_STROKE;
        float f = gl.Code;
        if ((style == style2 || style == Paint.Style.STROKE) && paint.getStrokeWidth() > gl.Code) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f = paint.getStrokeWidth() / 2.0f;
        }
        rectF.inset(f, f);
        f(canvas, paint, path, jVar, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f27403s.f27421l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f27403s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        b bVar = this.f27403s;
        if (bVar.f27424p == 2) {
            return;
        }
        if (bVar.f27411a.d(h())) {
            outline.setRoundRect(getBounds(), this.f27403s.f27411a.f27435e.a(h()) * this.f27403s.f27419j);
            return;
        }
        RectF h10 = h();
        Path path = this.y;
        b(h10, path);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            outline.setPath(path);
            return;
        }
        if (i10 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f27403s.f27417h;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.C;
        region.set(bounds);
        RectF h10 = h();
        Path path = this.y;
        b(h10, path);
        Region region2 = this.D;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        RectF rectF = this.A;
        rectF.set(getBounds());
        return rectF;
    }

    public final void i(Context context) {
        this.f27403s.f27412b = new t6.a(context);
        n();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f27407w = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (!super.isStateful() && (((colorStateList = this.f27403s.f) == null || !colorStateList.isStateful()) && (((colorStateList2 = this.f27403s.f27415e) == null || !colorStateList2.isStateful()) && (((colorStateList3 = this.f27403s.f27414d) == null || !colorStateList3.isStateful()) && ((colorStateList4 = this.f27403s.f27413c) == null || !colorStateList4.isStateful()))))) {
            return false;
        }
        return true;
    }

    public final void j(float f) {
        b bVar = this.f27403s;
        if (bVar.f27423n != f) {
            bVar.f27423n = f;
            n();
        }
    }

    public final void k(ColorStateList colorStateList) {
        b bVar = this.f27403s;
        if (bVar.f27413c != colorStateList) {
            bVar.f27413c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean l(int[] iArr) {
        boolean z10;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f27403s.f27413c != null && color2 != (colorForState2 = this.f27403s.f27413c.getColorForState(iArr, (color2 = (paint2 = this.F).getColor())))) {
            paint2.setColor(colorForState2);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f27403s.f27414d != null && color != (colorForState = this.f27403s.f27414d.getColorForState(iArr, (color = (paint = this.G).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z10;
    }

    public final boolean m() {
        PorterDuffColorFilter porterDuffColorFilter = this.K;
        PorterDuffColorFilter porterDuffColorFilter2 = this.L;
        b bVar = this.f27403s;
        this.K = c(bVar.f, bVar.f27416g, this.F, true);
        b bVar2 = this.f27403s;
        this.L = c(bVar2.f27415e, bVar2.f27416g, this.G, false);
        b bVar3 = this.f27403s;
        if (bVar3.f27428t) {
            this.H.a(bVar3.f.getColorForState(getState(), 0));
        }
        if (!m0.b.a(porterDuffColorFilter, this.K) || !m0.b.a(porterDuffColorFilter2, this.L)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f27403s = new b(this.f27403s);
        return this;
    }

    public final void n() {
        b bVar = this.f27403s;
        float f = bVar.f27423n + bVar.o;
        bVar.f27425q = (int) Math.ceil(0.75f * f);
        this.f27403s.f27426r = (int) Math.ceil(f * 0.25f);
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f27407w = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.h.b
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        boolean l10 = l(iArr);
        boolean m10 = m();
        if (!l10 && !m10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        b bVar = this.f27403s;
        if (bVar.f27421l != i10) {
            bVar.f27421l = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f27403s.getClass();
        super.invalidateSelf();
    }

    @Override // d7.n
    public final void setShapeAppearanceModel(j jVar) {
        this.f27403s.f27411a = jVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f27403s.f = colorStateList;
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f27403s;
        if (bVar.f27416g != mode) {
            bVar.f27416g = mode;
            m();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(j.b(context, attributeSet, i10, i11).a());
    }

    public g(j jVar) {
        this(new b(jVar));
    }

    public g(b bVar) {
        k kVar;
        this.f27404t = new m.f[4];
        this.f27405u = new m.f[4];
        this.f27406v = new BitSet(8);
        this.f27408x = new Matrix();
        this.y = new Path();
        this.f27409z = new Path();
        this.A = new RectF();
        this.B = new RectF();
        this.C = new Region();
        this.D = new Region();
        Paint paint = new Paint(1);
        this.F = paint;
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new c7.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            kVar = k.a.f27464a;
        } else {
            kVar = new k();
        }
        this.J = kVar;
        this.M = new RectF();
        this.N = true;
        this.f27403s = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m();
        l(getState());
        this.I = new a();
    }

    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: classes2.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public j f27411a;

        /* renamed from: b, reason: collision with root package name */
        public t6.a f27412b;

        /* renamed from: c, reason: collision with root package name */
        public ColorStateList f27413c;

        /* renamed from: d, reason: collision with root package name */
        public ColorStateList f27414d;

        /* renamed from: e, reason: collision with root package name */
        public final ColorStateList f27415e;
        public ColorStateList f;

        /* renamed from: g, reason: collision with root package name */
        public PorterDuff.Mode f27416g;

        /* renamed from: h, reason: collision with root package name */
        public Rect f27417h;

        /* renamed from: i, reason: collision with root package name */
        public final float f27418i;

        /* renamed from: j, reason: collision with root package name */
        public float f27419j;

        /* renamed from: k, reason: collision with root package name */
        public float f27420k;

        /* renamed from: l, reason: collision with root package name */
        public int f27421l;

        /* renamed from: m, reason: collision with root package name */
        public float f27422m;

        /* renamed from: n, reason: collision with root package name */
        public float f27423n;
        public final float o;

        /* renamed from: p, reason: collision with root package name */
        public final int f27424p;

        /* renamed from: q, reason: collision with root package name */
        public int f27425q;

        /* renamed from: r, reason: collision with root package name */
        public int f27426r;

        /* renamed from: s, reason: collision with root package name */
        public int f27427s;

        /* renamed from: t, reason: collision with root package name */
        public final boolean f27428t;

        /* renamed from: u, reason: collision with root package name */
        public final Paint.Style f27429u;

        public b(j jVar) {
            this.f27413c = null;
            this.f27414d = null;
            this.f27415e = null;
            this.f = null;
            this.f27416g = PorterDuff.Mode.SRC_IN;
            this.f27417h = null;
            this.f27418i = 1.0f;
            this.f27419j = 1.0f;
            this.f27421l = p.f9095b;
            this.f27422m = gl.Code;
            this.f27423n = gl.Code;
            this.o = gl.Code;
            this.f27424p = 0;
            this.f27425q = 0;
            this.f27426r = 0;
            this.f27427s = 0;
            this.f27428t = false;
            this.f27429u = Paint.Style.FILL_AND_STROKE;
            this.f27411a = jVar;
            this.f27412b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            g gVar = new g(this);
            gVar.f27407w = true;
            return gVar;
        }

        public b(b bVar) {
            this.f27413c = null;
            this.f27414d = null;
            this.f27415e = null;
            this.f = null;
            this.f27416g = PorterDuff.Mode.SRC_IN;
            this.f27417h = null;
            this.f27418i = 1.0f;
            this.f27419j = 1.0f;
            this.f27421l = p.f9095b;
            this.f27422m = gl.Code;
            this.f27423n = gl.Code;
            this.o = gl.Code;
            this.f27424p = 0;
            this.f27425q = 0;
            this.f27426r = 0;
            this.f27427s = 0;
            this.f27428t = false;
            this.f27429u = Paint.Style.FILL_AND_STROKE;
            this.f27411a = bVar.f27411a;
            this.f27412b = bVar.f27412b;
            this.f27420k = bVar.f27420k;
            this.f27413c = bVar.f27413c;
            this.f27414d = bVar.f27414d;
            this.f27416g = bVar.f27416g;
            this.f = bVar.f;
            this.f27421l = bVar.f27421l;
            this.f27418i = bVar.f27418i;
            this.f27426r = bVar.f27426r;
            this.f27424p = bVar.f27424p;
            this.f27428t = bVar.f27428t;
            this.f27419j = bVar.f27419j;
            this.f27422m = bVar.f27422m;
            this.f27423n = bVar.f27423n;
            this.o = bVar.o;
            this.f27425q = bVar.f27425q;
            this.f27427s = bVar.f27427s;
            this.f27415e = bVar.f27415e;
            this.f27429u = bVar.f27429u;
            if (bVar.f27417h != null) {
                this.f27417h = new Rect(bVar.f27417h);
            }
        }
    }
}
