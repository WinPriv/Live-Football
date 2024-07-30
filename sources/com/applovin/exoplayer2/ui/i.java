package com.applovin.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.applovin.exoplayer2.l.ai;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
final class i {
    private int A;
    private int B;
    private int C;
    private int D;
    private StaticLayout E;
    private StaticLayout F;
    private int G;
    private int H;
    private int I;
    private Rect J;

    /* renamed from: a, reason: collision with root package name */
    private final float f16796a;

    /* renamed from: b, reason: collision with root package name */
    private final float f16797b;

    /* renamed from: c, reason: collision with root package name */
    private final float f16798c;

    /* renamed from: d, reason: collision with root package name */
    private final float f16799d;

    /* renamed from: e, reason: collision with root package name */
    private final float f16800e;
    private final TextPaint f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f16801g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f16802h;

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f16803i;

    /* renamed from: j, reason: collision with root package name */
    private Layout.Alignment f16804j;

    /* renamed from: k, reason: collision with root package name */
    private Bitmap f16805k;

    /* renamed from: l, reason: collision with root package name */
    private float f16806l;

    /* renamed from: m, reason: collision with root package name */
    private int f16807m;

    /* renamed from: n, reason: collision with root package name */
    private int f16808n;
    private float o;

    /* renamed from: p, reason: collision with root package name */
    private int f16809p;

    /* renamed from: q, reason: collision with root package name */
    private float f16810q;

    /* renamed from: r, reason: collision with root package name */
    private float f16811r;

    /* renamed from: s, reason: collision with root package name */
    private int f16812s;

    /* renamed from: t, reason: collision with root package name */
    private int f16813t;

    /* renamed from: u, reason: collision with root package name */
    private int f16814u;

    /* renamed from: v, reason: collision with root package name */
    private int f16815v;

    /* renamed from: w, reason: collision with root package name */
    private int f16816w;

    /* renamed from: x, reason: collision with root package name */
    private float f16817x;
    private float y;

    /* renamed from: z, reason: collision with root package name */
    private float f16818z;

    public i(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f16800e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f16799d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f16796a = round;
        this.f16797b = round;
        this.f16798c = round;
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f16801g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f16802h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f16805k
            int r1 = r7.C
            int r2 = r7.A
            int r1 = r1 - r2
            int r3 = r7.D
            int r4 = r7.B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.o
            float r5 = r5 * r1
            float r5 = r5 + r2
            float r2 = (float) r4
            float r3 = (float) r3
            float r4 = r7.f16806l
            float r4 = r4 * r3
            float r4 = r4 + r2
            float r2 = r7.f16810q
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            float r2 = r7.f16811r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L2e
            float r3 = r3 * r2
            int r0 = java.lang.Math.round(r3)
            goto L3f
        L2e:
            float r2 = (float) r1
            int r3 = r0.getHeight()
            float r3 = (float) r3
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r3 = r3 / r0
            float r3 = r3 * r2
            int r0 = java.lang.Math.round(r3)
        L3f:
            int r2 = r7.f16809p
            r3 = 1
            r6 = 2
            if (r2 != r6) goto L48
            float r2 = (float) r1
        L46:
            float r5 = r5 - r2
            goto L4e
        L48:
            if (r2 != r3) goto L4e
            int r2 = r1 / 2
            float r2 = (float) r2
            goto L46
        L4e:
            int r2 = java.lang.Math.round(r5)
            int r5 = r7.f16808n
            if (r5 != r6) goto L59
            float r3 = (float) r0
        L57:
            float r4 = r4 - r3
            goto L5f
        L59:
            if (r5 != r3) goto L5f
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L57
        L5f:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.i.b():void");
    }

    public void a(com.applovin.exoplayer2.i.a aVar, c cVar, float f, float f10, float f11, Canvas canvas, int i10, int i11, int i12, int i13) {
        int i14;
        boolean z10 = aVar.f15510e == null;
        if (!z10) {
            i14 = -16777216;
        } else if (TextUtils.isEmpty(aVar.f15507b)) {
            return;
        } else {
            i14 = aVar.f15517m ? aVar.f15518n : cVar.f16706d;
        }
        if (a(this.f16803i, aVar.f15507b) && ai.a(this.f16804j, aVar.f15508c) && this.f16805k == aVar.f15510e && this.f16806l == aVar.f && this.f16807m == aVar.f15511g && ai.a(Integer.valueOf(this.f16808n), Integer.valueOf(aVar.f15512h)) && this.o == aVar.f15513i && ai.a(Integer.valueOf(this.f16809p), Integer.valueOf(aVar.f15514j)) && this.f16810q == aVar.f15515k && this.f16811r == aVar.f15516l && this.f16812s == cVar.f16704b && this.f16813t == cVar.f16705c && this.f16814u == i14 && this.f16816w == cVar.f16707e && this.f16815v == cVar.f && ai.a(this.f.getTypeface(), cVar.f16708g) && this.f16817x == f && this.y == f10 && this.f16818z == f11 && this.A == i10 && this.B == i11 && this.C == i12 && this.D == i13) {
            a(canvas, z10);
            return;
        }
        this.f16803i = aVar.f15507b;
        this.f16804j = aVar.f15508c;
        this.f16805k = aVar.f15510e;
        this.f16806l = aVar.f;
        this.f16807m = aVar.f15511g;
        this.f16808n = aVar.f15512h;
        this.o = aVar.f15513i;
        this.f16809p = aVar.f15514j;
        this.f16810q = aVar.f15515k;
        this.f16811r = aVar.f15516l;
        this.f16812s = cVar.f16704b;
        this.f16813t = cVar.f16705c;
        this.f16814u = i14;
        this.f16816w = cVar.f16707e;
        this.f16815v = cVar.f;
        this.f.setTypeface(cVar.f16708g);
        this.f16817x = f;
        this.y = f10;
        this.f16818z = f11;
        this.A = i10;
        this.B = i11;
        this.C = i12;
        this.D = i13;
        if (z10) {
            com.applovin.exoplayer2.l.a.b(this.f16803i);
            a();
        } else {
            com.applovin.exoplayer2.l.a.b(this.f16805k);
            b();
        }
        a(canvas, z10);
    }

    private void b(Canvas canvas) {
        canvas.drawBitmap(this.f16805k, (Rect) null, this.J, this.f16802h);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a() {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.i.a():void");
    }

    private void a(Canvas canvas, boolean z10) {
        if (z10) {
            a(canvas);
            return;
        }
        com.applovin.exoplayer2.l.a.b(this.J);
        com.applovin.exoplayer2.l.a.b(this.f16805k);
        b(canvas);
    }

    private void a(Canvas canvas) {
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f16814u) > 0) {
            this.f16801g.setColor(this.f16814u);
            canvas.drawRect(-this.I, gl.Code, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f16801g);
        }
        int i10 = this.f16816w;
        if (i10 == 1) {
            this.f.setStrokeJoin(Paint.Join.ROUND);
            this.f.setStrokeWidth(this.f16796a);
            this.f.setColor(this.f16815v);
            this.f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i10 == 2) {
            TextPaint textPaint = this.f;
            float f = this.f16797b;
            float f10 = this.f16798c;
            textPaint.setShadowLayer(f, f10, f10, this.f16815v);
        } else if (i10 == 3 || i10 == 4) {
            boolean z10 = i10 == 3;
            int i11 = z10 ? -1 : this.f16815v;
            int i12 = z10 ? this.f16815v : -1;
            float f11 = this.f16797b / 2.0f;
            this.f.setColor(this.f16812s);
            this.f.setStyle(Paint.Style.FILL);
            float f12 = -f11;
            this.f.setShadowLayer(this.f16797b, f12, f12, i11);
            staticLayout2.draw(canvas);
            this.f.setShadowLayer(this.f16797b, f11, f11, i12);
        }
        this.f.setColor(this.f16812s);
        this.f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f.setShadowLayer(gl.Code, gl.Code, gl.Code, 0);
        canvas.restoreToCount(save);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }
}
