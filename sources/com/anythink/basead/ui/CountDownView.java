package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class CountDownView extends View {

    /* renamed from: a, reason: collision with root package name */
    private Paint f4231a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f4232b;

    /* renamed from: c, reason: collision with root package name */
    private Paint f4233c;

    /* renamed from: d, reason: collision with root package name */
    private float f4234d;

    /* renamed from: e, reason: collision with root package name */
    private float f4235e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f4236g;

    /* renamed from: h, reason: collision with root package name */
    private int f4237h;

    /* renamed from: i, reason: collision with root package name */
    private int f4238i;

    /* renamed from: j, reason: collision with root package name */
    private int f4239j;

    /* renamed from: k, reason: collision with root package name */
    private int f4240k;

    /* renamed from: l, reason: collision with root package name */
    private RectF f4241l;

    /* renamed from: m, reason: collision with root package name */
    private float f4242m;

    /* renamed from: n, reason: collision with root package name */
    private String f4243n;
    private Rect o;

    /* renamed from: p, reason: collision with root package name */
    private int f4244p;

    /* renamed from: q, reason: collision with root package name */
    private float f4245q;

    /* renamed from: r, reason: collision with root package name */
    private Paint.FontMetrics f4246r;

    public CountDownView(Context context) {
        this(context, null);
    }

    private void a(Context context) {
        this.f4234d = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.f4235e = TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics());
        this.f = Color.parseColor("#66000000");
        this.f4236g = Color.parseColor("#CC000000");
        this.f4237h = -1;
        Paint paint = new Paint();
        this.f4231a = paint;
        paint.setAntiAlias(true);
        this.f4231a.setStrokeCap(Paint.Cap.ROUND);
        this.f4231a.setStyle(Paint.Style.STROKE);
        this.f4231a.setStrokeWidth(this.f4234d);
        Paint paint2 = new Paint(this.f4231a);
        this.f4232b = paint2;
        paint2.setColor(this.f);
        this.f4232b.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.f4233c = paint3;
        paint3.setAntiAlias(true);
        this.f4233c.setTextSize(this.f4235e);
        this.f4233c.setColor(this.f4237h);
        this.f4241l = new RectF();
        this.o = new Rect();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f4241l.centerX(), this.f4241l.centerY(), this.f4240k, this.f4232b);
        this.f4231a.setColor(this.f4236g);
        canvas.drawArc(this.f4241l, gl.Code, 360.0f, false, this.f4231a);
        this.f4231a.setColor(this.f4237h);
        canvas.drawArc(this.f4241l, -90.0f, this.f4242m, false, this.f4231a);
        if (!TextUtils.isEmpty(this.f4243n)) {
            Paint paint = this.f4233c;
            String str = this.f4243n;
            paint.getTextBounds(str, 0, str.length(), this.o);
            this.f4245q = this.f4233c.measureText(this.f4243n);
            this.f4246r = this.f4233c.getFontMetrics();
            String str2 = this.f4243n;
            float centerX = this.f4241l.centerX() - (this.f4245q / 2.0f);
            float centerY = this.f4241l.centerY();
            Paint.FontMetrics fontMetrics = this.f4246r;
            float f = fontMetrics.bottom;
            canvas.drawText(str2, centerX, (((f - fontMetrics.top) / 2.0f) - f) + centerY, this.f4233c);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f4238i = i10;
        this.f4239j = i11;
        a();
    }

    public void refresh(int i10) {
        this.f4242m = ((i10 * 1.0f) / this.f4244p) * 360.0f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) Math.ceil((this.f4244p - i10) / 1000.0d));
        this.f4243n = sb2.toString();
        invalidate();
    }

    public void setBgColor(int i10) {
        this.f = i10;
        this.f4232b.setColor(i10);
    }

    public void setDuration(int i10) {
        this.f4244p = i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10 / 1000);
        this.f4243n = sb2.toString();
    }

    public void setThickInPx(int i10) {
        float f = i10;
        this.f4234d = f;
        this.f4231a.setStrokeWidth(f);
        a();
    }

    public void setUnderRingColor(int i10) {
        this.f4236g = i10;
    }

    public CountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4234d = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.f4235e = TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics());
        this.f = Color.parseColor("#66000000");
        this.f4236g = Color.parseColor("#CC000000");
        this.f4237h = -1;
        Paint paint = new Paint();
        this.f4231a = paint;
        paint.setAntiAlias(true);
        this.f4231a.setStrokeCap(Paint.Cap.ROUND);
        this.f4231a.setStyle(Paint.Style.STROKE);
        this.f4231a.setStrokeWidth(this.f4234d);
        Paint paint2 = new Paint(this.f4231a);
        this.f4232b = paint2;
        paint2.setColor(this.f);
        this.f4232b.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.f4233c = paint3;
        paint3.setAntiAlias(true);
        this.f4233c.setTextSize(this.f4235e);
        this.f4233c.setColor(this.f4237h);
        this.f4241l = new RectF();
        this.o = new Rect();
    }

    private void a() {
        float f = this.f4234d * 0.5f;
        RectF rectF = this.f4241l;
        float f10 = gl.Code + f;
        rectF.set(f10, f10, this.f4238i - f, this.f4239j - f);
        this.f4240k = ((int) this.f4241l.width()) >> 1;
    }
}
