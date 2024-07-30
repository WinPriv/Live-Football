package com.google.android.exoplayer2.ui;

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
import com.huawei.hms.ads.gl;

/* compiled from: SubtitlePainter.java */
/* loaded from: classes2.dex */
public final class f {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;

    /* renamed from: a, reason: collision with root package name */
    public final float f20354a;

    /* renamed from: b, reason: collision with root package name */
    public final float f20355b;

    /* renamed from: c, reason: collision with root package name */
    public final float f20356c;

    /* renamed from: d, reason: collision with root package name */
    public final float f20357d;

    /* renamed from: e, reason: collision with root package name */
    public final float f20358e;
    public final TextPaint f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f20359g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f20360h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f20361i;

    /* renamed from: j, reason: collision with root package name */
    public Layout.Alignment f20362j;

    /* renamed from: k, reason: collision with root package name */
    public Bitmap f20363k;

    /* renamed from: l, reason: collision with root package name */
    public float f20364l;

    /* renamed from: m, reason: collision with root package name */
    public int f20365m;

    /* renamed from: n, reason: collision with root package name */
    public int f20366n;
    public float o;

    /* renamed from: p, reason: collision with root package name */
    public int f20367p;

    /* renamed from: q, reason: collision with root package name */
    public float f20368q;

    /* renamed from: r, reason: collision with root package name */
    public float f20369r;

    /* renamed from: s, reason: collision with root package name */
    public int f20370s;

    /* renamed from: t, reason: collision with root package name */
    public int f20371t;

    /* renamed from: u, reason: collision with root package name */
    public int f20372u;

    /* renamed from: v, reason: collision with root package name */
    public int f20373v;

    /* renamed from: w, reason: collision with root package name */
    public int f20374w;

    /* renamed from: x, reason: collision with root package name */
    public float f20375x;
    public float y;

    /* renamed from: z, reason: collision with root package name */
    public float f20376z;

    public f(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f20358e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f20357d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f20354a = round;
        this.f20355b = round;
        this.f20356c = round;
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f20359g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f20360h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z10) {
        int i10;
        if (z10) {
            StaticLayout staticLayout = this.E;
            StaticLayout staticLayout2 = this.F;
            if (staticLayout != null && staticLayout2 != null) {
                int save = canvas.save();
                canvas.translate(this.G, this.H);
                if (Color.alpha(this.f20372u) > 0) {
                    Paint paint = this.f20359g;
                    paint.setColor(this.f20372u);
                    canvas.drawRect(-this.I, gl.Code, staticLayout.getWidth() + this.I, staticLayout.getHeight(), paint);
                }
                int i11 = this.f20374w;
                TextPaint textPaint = this.f;
                boolean z11 = true;
                if (i11 == 1) {
                    textPaint.setStrokeJoin(Paint.Join.ROUND);
                    textPaint.setStrokeWidth(this.f20354a);
                    textPaint.setColor(this.f20373v);
                    textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                    staticLayout2.draw(canvas);
                } else {
                    float f = this.f20355b;
                    if (i11 == 2) {
                        float f10 = this.f20356c;
                        textPaint.setShadowLayer(f, f10, f10, this.f20373v);
                    } else if (i11 == 3 || i11 == 4) {
                        if (i11 != 3) {
                            z11 = false;
                        }
                        int i12 = -1;
                        if (z11) {
                            i10 = -1;
                        } else {
                            i10 = this.f20373v;
                        }
                        if (z11) {
                            i12 = this.f20373v;
                        }
                        float f11 = f / 2.0f;
                        textPaint.setColor(this.f20370s);
                        textPaint.setStyle(Paint.Style.FILL);
                        float f12 = -f11;
                        textPaint.setShadowLayer(f, f12, f12, i10);
                        staticLayout2.draw(canvas);
                        textPaint.setShadowLayer(f, f11, f11, i12);
                    }
                }
                textPaint.setColor(this.f20370s);
                textPaint.setStyle(Paint.Style.FILL);
                staticLayout.draw(canvas);
                textPaint.setShadowLayer(gl.Code, gl.Code, gl.Code, 0);
                canvas.restoreToCount(save);
                return;
            }
            return;
        }
        this.J.getClass();
        this.f20363k.getClass();
        canvas.drawBitmap(this.f20363k, (Rect) null, this.J, this.f20360h);
    }
}
