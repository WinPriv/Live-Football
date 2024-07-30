package com.anythink.expressad.videocommon.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.widget.ATImageView;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class RoundImageView extends ATImageView {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12491a = "RoundImageView";

    /* renamed from: c, reason: collision with root package name */
    private static final int f12492c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f12493d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f12494e = 5;

    /* renamed from: m, reason: collision with root package name */
    private static final String f12495m = "state_instance";

    /* renamed from: n, reason: collision with root package name */
    private static final String f12496n = "state_type";
    private static final String o = "state_border_radius";

    /* renamed from: b, reason: collision with root package name */
    private int f12497b;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private Paint f12498g;

    /* renamed from: h, reason: collision with root package name */
    private int f12499h;

    /* renamed from: i, reason: collision with root package name */
    private Matrix f12500i;

    /* renamed from: j, reason: collision with root package name */
    private BitmapShader f12501j;

    /* renamed from: k, reason: collision with root package name */
    private int f12502k;

    /* renamed from: l, reason: collision with root package name */
    private RectF f12503l;

    public RoundImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12500i = new Matrix();
        Paint paint = new Paint();
        this.f12498g = paint;
        paint.setAntiAlias(true);
        this.f = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f12497b = 1;
    }

    private void a() {
        Bitmap a10;
        try {
            Drawable drawable = getDrawable();
            if (drawable == null || (a10 = a(drawable)) == null || a10.isRecycled()) {
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f12501j = new BitmapShader(a10, tileMode, tileMode);
            int i10 = this.f12497b;
            float f = 1.0f;
            if (i10 == 0) {
                f = (this.f12502k * 1.0f) / Math.min(a10.getWidth(), a10.getHeight());
            } else if (i10 == 1) {
                f = Math.max((getWidth() * 1.0f) / a10.getWidth(), (getHeight() * 1.0f) / a10.getHeight());
            }
            this.f12500i.setScale(f, f);
            this.f12501j.setLocalMatrix(this.f12500i);
            this.f12498g.setShader(this.f12501j);
        } catch (Throwable th) {
            o.d(f12491a, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.widget.ATImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap a10;
        try {
            if (getDrawable() == null) {
                return;
            }
            try {
                Drawable drawable = getDrawable();
                if (drawable != null && (a10 = a(drawable)) != null && !a10.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f12501j = new BitmapShader(a10, tileMode, tileMode);
                    int i10 = this.f12497b;
                    float f = 1.0f;
                    if (i10 == 0) {
                        f = (this.f12502k * 1.0f) / Math.min(a10.getWidth(), a10.getHeight());
                    } else if (i10 == 1) {
                        f = Math.max((getWidth() * 1.0f) / a10.getWidth(), (getHeight() * 1.0f) / a10.getHeight());
                    }
                    this.f12500i.setScale(f, f);
                    this.f12501j.setLocalMatrix(this.f12500i);
                    this.f12498g.setShader(this.f12501j);
                }
            } catch (Throwable th) {
                o.d(f12491a, th.getMessage());
            }
            if (this.f12497b == 1) {
                RectF rectF = this.f12503l;
                int i11 = this.f;
                canvas.drawRoundRect(rectF, i11, i11, this.f12498g);
            } else {
                int i12 = this.f12499h;
                canvas.drawCircle(i12, i12, i12, this.f12498g);
            }
        } catch (Throwable th2) {
            o.d(f12491a, th2.getMessage());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f12497b == 0) {
            int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.f12502k = min;
            this.f12499h = min / 2;
            setMeasuredDimension(min, min);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable(f12495m));
            this.f12497b = bundle.getInt(f12496n);
            this.f = bundle.getInt(o);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f12495m, super.onSaveInstanceState());
        bundle.putInt(f12496n, this.f12497b);
        bundle.putInt(o, this.f);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f12497b == 1) {
            this.f12503l = new RectF(gl.Code, gl.Code, getWidth(), getHeight());
        }
    }

    public void setBorderRadius(int i10) {
        int b10 = t.b(getContext(), i10);
        if (this.f != b10) {
            this.f = b10;
            invalidate();
        }
    }

    public void setType(int i10) {
        if (this.f12497b != i10) {
            this.f12497b = i10;
            if (i10 != 1 && i10 != 0) {
                this.f12497b = 0;
            }
            requestLayout();
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12500i = new Matrix();
        Paint paint = new Paint();
        this.f12498g = paint;
        paint.setAntiAlias(true);
        this.f = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f12497b = 1;
    }

    public RoundImageView(Context context) {
        super(context);
        this.f12500i = new Matrix();
        Paint paint = new Paint();
        this.f12498g = paint;
        paint.setAntiAlias(true);
        this.f = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f12497b = 1;
    }

    private static Bitmap a(Drawable drawable) {
        try {
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable th) {
            o.d("View", th.getMessage());
            return null;
        }
    }
}
