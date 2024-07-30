package com.huawei.openalliance.ad.ppskit.views;

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
import com.huawei.openalliance.ad.ppskit.utils.z1;

/* loaded from: classes2.dex */
public abstract class h1 extends ClipDrawable {

    /* renamed from: s, reason: collision with root package name */
    public Drawable f23442s;

    /* renamed from: t, reason: collision with root package name */
    public Paint f23443t;

    /* renamed from: u, reason: collision with root package name */
    public Bitmap f23444u;

    /* renamed from: v, reason: collision with root package name */
    public Bitmap f23445v;

    /* renamed from: w, reason: collision with root package name */
    public Canvas f23446w;

    /* renamed from: x, reason: collision with root package name */
    public PorterDuffXfermode f23447x;
    public boolean y;

    public h1(Drawable drawable) {
        super(drawable, 17, 1);
        Paint paint = new Paint();
        this.f23443t = paint;
        paint.setAntiAlias(true);
        this.f23443t.setColor(-16711936);
        this.f23442s = drawable;
        this.f23447x = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.y = z1.N();
    }

    public abstract Path a(int i10);

    public final void b() {
        Rect bounds = getBounds();
        if (bounds.width() > 0 && bounds.height() > 0) {
            Bitmap bitmap = this.f23444u;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f23444u = Bitmap.createBitmap(bounds.width(), bounds.height(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f23444u);
            this.f23442s.setBounds(bounds);
            int level = this.f23442s.getLevel();
            this.f23442s.setLevel(10000);
            this.f23442s.draw(canvas);
            this.f23442s.setLevel(level);
        }
    }

    public final void c() {
        Rect bounds = getBounds();
        if (bounds.width() > 0 && bounds.height() > 0) {
            Bitmap bitmap = this.f23445v;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f23445v = Bitmap.createBitmap(bounds.width(), bounds.height(), Bitmap.Config.ARGB_8888);
            this.f23446w = new Canvas(this.f23445v);
        }
    }

    @Override // android.graphics.drawable.ClipDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        if (canvas == null) {
            return;
        }
        if (this.f23444u == null) {
            b();
        }
        c();
        Path a10 = a(getLevel());
        if (a10 != null && (canvas2 = this.f23446w) != null) {
            canvas2.drawPath(a10, this.f23443t);
        } else {
            Log.e("HwEclipseClipDrawable", "getClipPath fail.");
        }
        if (this.f23444u != null && this.f23445v != null) {
            Rect bounds = getBounds();
            if (this.y) {
                canvas.scale(-1.0f, 1.0f, bounds.width() / 2.0f, bounds.height() / 2.0f);
            }
            int saveLayer = canvas.saveLayer(gl.Code, gl.Code, bounds.width(), bounds.height(), null);
            canvas.drawBitmap(this.f23445v, gl.Code, gl.Code, this.f23443t);
            this.f23443t.setXfermode(this.f23447x);
            canvas.drawBitmap(this.f23444u, gl.Code, gl.Code, this.f23443t);
            this.f23443t.setXfermode(null);
            canvas.restoreToCount(saveLayer);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f23442s.setBounds(i10, i11, i12, i13);
        if (this.f23444u != null) {
            b();
        }
        if (this.f23445v != null) {
            c();
            Path a10 = a(getLevel());
            if (a10 != null) {
                this.f23446w.drawPath(a10, this.f23443t);
            } else {
                Log.e("HwEclipseClipDrawable", "getClipPath fail.");
            }
        }
    }
}
