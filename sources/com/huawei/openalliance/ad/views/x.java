package com.huawei.openalliance.ad.views;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.huawei.hms.ads.gl;

/* loaded from: classes2.dex */
public abstract class x extends ClipDrawable {

    /* renamed from: s, reason: collision with root package name */
    public Drawable f24171s;

    /* renamed from: t, reason: collision with root package name */
    public Paint f24172t;

    /* renamed from: u, reason: collision with root package name */
    public Bitmap f24173u;

    /* renamed from: v, reason: collision with root package name */
    public Bitmap f24174v;

    /* renamed from: w, reason: collision with root package name */
    public Canvas f24175w;

    /* renamed from: x, reason: collision with root package name */
    public PorterDuffXfermode f24176x;
    public boolean y;

    public x(Drawable drawable) {
        super(drawable, 17, 1);
        Paint paint = new Paint();
        this.f24172t = paint;
        paint.setAntiAlias(true);
        this.f24172t.setColor(-16711936);
        this.f24171s = drawable;
        this.f24176x = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.y = gb.u.b();
    }

    public final void a() {
        Rect bounds = getBounds();
        if (bounds.width() > 0 && bounds.height() > 0) {
            Bitmap bitmap = this.f24174v;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f24174v = Bitmap.createBitmap(bounds.width(), bounds.height(), Bitmap.Config.ARGB_8888);
            this.f24175w = new Canvas(this.f24174v);
        }
    }

    public abstract Path b(int i10);

    public final void c() {
        Rect bounds = getBounds();
        if (bounds.width() > 0 && bounds.height() > 0) {
            Bitmap bitmap = this.f24173u;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f24173u = Bitmap.createBitmap(bounds.width(), bounds.height(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f24173u);
            this.f24171s.setBounds(bounds);
            int level = this.f24171s.getLevel();
            this.f24171s.setLevel(10000);
            this.f24171s.draw(canvas);
            this.f24171s.setLevel(level);
        }
    }

    @Override // android.graphics.drawable.ClipDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        if (canvas == null) {
            return;
        }
        if (this.f24173u == null) {
            c();
        }
        a();
        Path b10 = b(getLevel());
        if (b10 != null && (canvas2 = this.f24175w) != null) {
            canvas2.drawPath(b10, this.f24172t);
        } else {
            Log.e("HwEclipseClipDrawable", "getClipPath fail.");
        }
        if (this.f24173u != null && this.f24174v != null) {
            Rect bounds = getBounds();
            if (this.y) {
                canvas.scale(-1.0f, 1.0f, bounds.width() / 2.0f, bounds.height() / 2.0f);
            }
            int saveLayer = canvas.saveLayer(gl.Code, gl.Code, bounds.width(), bounds.height(), null);
            canvas.drawBitmap(this.f24174v, gl.Code, gl.Code, this.f24172t);
            this.f24172t.setXfermode(this.f24176x);
            canvas.drawBitmap(this.f24173u, gl.Code, gl.Code, this.f24172t);
            this.f24172t.setXfermode(null);
            canvas.restoreToCount(saveLayer);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f24171s.setBounds(i10, i11, i12, i13);
        if (this.f24173u != null) {
            c();
        }
        if (this.f24174v != null) {
            a();
            Path b10 = b(getLevel());
            if (b10 != null) {
                this.f24175w.drawPath(b10, this.f24172t);
            } else {
                Log.e("HwEclipseClipDrawable", "getClipPath fail.");
            }
        }
    }
}
