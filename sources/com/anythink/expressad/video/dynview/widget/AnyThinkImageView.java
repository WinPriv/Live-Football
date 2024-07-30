package com.anythink.expressad.video.dynview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.anythink.expressad.foundation.h.o;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class AnyThinkImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11606a = "MBridgeImageView";

    /* renamed from: b, reason: collision with root package name */
    private Xfermode f11607b;

    /* renamed from: c, reason: collision with root package name */
    private int f11608c;

    /* renamed from: d, reason: collision with root package name */
    private int f11609d;

    /* renamed from: e, reason: collision with root package name */
    private int f11610e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f11611g;

    /* renamed from: h, reason: collision with root package name */
    private int f11612h;

    /* renamed from: i, reason: collision with root package name */
    private int f11613i;

    /* renamed from: j, reason: collision with root package name */
    private int f11614j;

    /* renamed from: k, reason: collision with root package name */
    private int f11615k;

    /* renamed from: l, reason: collision with root package name */
    private float[] f11616l;

    /* renamed from: m, reason: collision with root package name */
    private float[] f11617m;

    /* renamed from: n, reason: collision with root package name */
    private RectF f11618n;
    private RectF o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f11619p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f11620q;

    /* renamed from: r, reason: collision with root package name */
    private Path f11621r;

    /* renamed from: s, reason: collision with root package name */
    private Paint f11622s;

    public AnyThinkImageView(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        a(canvas, this.f11614j, this.f11615k, this.o, this.f11616l);
    }

    private void b() {
        int i10;
        int i11;
        int i12;
        try {
            if (this.f11616l != null && this.f11617m != null) {
                int i13 = 0;
                while (true) {
                    i10 = 2;
                    if (i13 >= 2) {
                        break;
                    }
                    float[] fArr = this.f11616l;
                    int i14 = this.f;
                    fArr[i13] = i14;
                    this.f11617m[i13] = i14 - (this.f11614j / 2.0f);
                    i13++;
                }
                while (true) {
                    i11 = 4;
                    if (i10 >= 4) {
                        break;
                    }
                    float[] fArr2 = this.f11616l;
                    int i15 = this.f11611g;
                    fArr2[i10] = i15;
                    this.f11617m[i10] = i15 - (this.f11614j / 2.0f);
                    i10++;
                }
                while (true) {
                    if (i11 >= 6) {
                        break;
                    }
                    float[] fArr3 = this.f11616l;
                    int i16 = this.f11612h;
                    fArr3[i11] = i16;
                    this.f11617m[i11] = i16 - (this.f11614j / 2.0f);
                    i11++;
                }
                for (i12 = 6; i12 < 8; i12++) {
                    float[] fArr4 = this.f11616l;
                    int i17 = this.f11613i;
                    fArr4[i12] = i17;
                    this.f11617m[i12] = i17 - (this.f11614j / 2.0f);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void c() {
        RectF rectF = this.o;
        if (rectF != null) {
            int i10 = this.f11614j;
            rectF.set(i10 / 2.0f, i10 / 2.0f, this.f11608c - (i10 / 2.0f), this.f11609d - (i10 / 2.0f));
        }
    }

    private void d() {
        RectF rectF = this.f11618n;
        if (rectF != null) {
            rectF.set(gl.Code, gl.Code, this.f11608c, this.f11609d);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f11618n, null, 31);
            int i10 = this.f11608c;
            int i11 = this.f11614j;
            int i12 = this.f11609d;
            canvas.scale(((i10 - (i11 * 2)) * 1.0f) / i10, ((i12 - (i11 * 2)) * 1.0f) / i12, i10 / 2.0f, i12 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f11622s;
            if (paint != null) {
                paint.reset();
                this.f11622s.setAntiAlias(true);
                this.f11622s.setStyle(Paint.Style.FILL);
                this.f11622s.setXfermode(this.f11607b);
            }
            Path path = this.f11621r;
            if (path != null) {
                path.reset();
                this.f11621r.addRoundRect(this.f11618n, this.f11617m, Path.Direction.CCW);
            }
            canvas.drawPath(this.f11621r, this.f11622s);
            Paint paint2 = this.f11622s;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f11619p) {
                a(canvas, this.f11614j, this.f11615k, this.o, this.f11616l);
            }
        } catch (Exception e10) {
            o.a(f11606a, e10.getMessage());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        super.onSizeChanged(i10, i11, i12, i13);
        this.f11608c = i10;
        this.f11609d = i11;
        int i17 = 0;
        if (this.f11620q) {
            try {
                if (this.f11616l != null && this.f11617m != null) {
                    while (true) {
                        i14 = 2;
                        if (i17 >= 2) {
                            break;
                        }
                        float[] fArr = this.f11616l;
                        int i18 = this.f;
                        fArr[i17] = i18;
                        this.f11617m[i17] = i18 - (this.f11614j / 2.0f);
                        i17++;
                    }
                    while (true) {
                        i15 = 4;
                        if (i14 >= 4) {
                            break;
                        }
                        float[] fArr2 = this.f11616l;
                        int i19 = this.f11611g;
                        fArr2[i14] = i19;
                        this.f11617m[i14] = i19 - (this.f11614j / 2.0f);
                        i14++;
                    }
                    while (true) {
                        if (i15 >= 6) {
                            break;
                        }
                        float[] fArr3 = this.f11616l;
                        int i20 = this.f11612h;
                        fArr3[i15] = i20;
                        this.f11617m[i15] = i20 - (this.f11614j / 2.0f);
                        i15++;
                    }
                    for (i16 = 6; i16 < 8; i16++) {
                        float[] fArr4 = this.f11616l;
                        int i21 = this.f11613i;
                        fArr4[i16] = i21;
                        this.f11617m[i16] = i21 - (this.f11614j / 2.0f);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else if (this.f11616l != null && this.f11617m != null) {
            while (true) {
                try {
                    float[] fArr5 = this.f11616l;
                    if (i17 >= fArr5.length) {
                        break;
                    }
                    int i22 = this.f11610e;
                    fArr5[i17] = i22;
                    this.f11617m[i17] = i22 - (this.f11614j / 2.0f);
                    i17++;
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        RectF rectF = this.o;
        if (rectF != null) {
            int i23 = this.f11614j;
            rectF.set(i23 / 2.0f, i23 / 2.0f, this.f11608c - (i23 / 2.0f), this.f11609d - (i23 / 2.0f));
        }
        RectF rectF2 = this.f11618n;
        if (rectF2 != null) {
            rectF2.set(gl.Code, gl.Code, this.f11608c, this.f11609d);
        }
    }

    public void setBorder(int i10, int i11, int i12) {
        this.f11619p = true;
        this.f11614j = i11;
        this.f11615k = i12;
        this.f11610e = i10;
    }

    public void setCornerRadius(int i10) {
        this.f11610e = i10;
    }

    public void setCustomBorder(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f11619p = true;
        this.f11620q = true;
        this.f11614j = i14;
        this.f11615k = i15;
        this.f = i10;
        this.f11612h = i12;
        this.f11611g = i11;
        this.f11613i = i13;
    }

    public AnyThinkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        try {
            a(i10, i11);
            Path path = this.f11621r;
            if (path != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
            if (canvas != null) {
                canvas.drawPath(this.f11621r, this.f11622s);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public AnyThinkImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11621r = new Path();
        this.f11622s = new Paint();
        this.f11616l = new float[8];
        this.f11617m = new float[8];
        this.o = new RectF();
        this.f11618n = new RectF();
        this.f11607b = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    private void a(int i10, int i11) {
        Path path = this.f11621r;
        if (path != null) {
            path.reset();
        }
        Paint paint = this.f11622s;
        if (paint != null) {
            paint.setStrokeWidth(i10);
            this.f11622s.setColor(i11);
            this.f11622s.setStyle(Paint.Style.STROKE);
        }
    }

    private void a() {
        if (this.f11616l == null || this.f11617m == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                float[] fArr = this.f11616l;
                if (i10 >= fArr.length) {
                    return;
                }
                int i11 = this.f11610e;
                fArr[i10] = i11;
                this.f11617m[i10] = i11 - (this.f11614j / 2.0f);
                i10++;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
    }
}
