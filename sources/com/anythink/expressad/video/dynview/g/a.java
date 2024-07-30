package com.anythink.expressad.video.dynview.g;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public final class a extends ShapeDrawable {

    /* renamed from: a, reason: collision with root package name */
    private int f11449a;

    /* renamed from: b, reason: collision with root package name */
    private float f11450b;

    /* renamed from: c, reason: collision with root package name */
    private float f11451c;

    /* renamed from: d, reason: collision with root package name */
    private int f11452d;

    /* renamed from: e, reason: collision with root package name */
    private int f11453e;
    private Bitmap f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f11454g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f11455h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f11456i;

    /* renamed from: com.anythink.expressad.video.dynview.g.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0137a implements b {

        /* renamed from: a, reason: collision with root package name */
        private RectShape f11457a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f11458b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap f11459c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f11460d;

        /* renamed from: e, reason: collision with root package name */
        private int f11461e;
        private int f;

        /* renamed from: g, reason: collision with root package name */
        private int f11462g;

        /* renamed from: h, reason: collision with root package name */
        private float f11463h;

        /* renamed from: i, reason: collision with root package name */
        private float f11464i;

        public /* synthetic */ C0137a(byte b10) {
            this();
        }

        private C0137a() {
            this.f = 100;
            this.f11462g = 10;
            this.f11457a = new RectShape();
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b a(Bitmap bitmap) {
            this.f11458b = bitmap;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b b(Bitmap bitmap) {
            this.f11459c = bitmap;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b c(int i10) {
            this.f11462g = i10;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b a() {
            this.f11460d = true;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b b(float f) {
            this.f11464i = f;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b a(int i10) {
            this.f11461e = i10;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b b(int i10) {
            this.f = i10;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b a(float f) {
            this.f11463h = f;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final a b() {
            return new a(this, (byte) 0);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        b a();

        b a(float f);

        b a(int i10);

        b a(Bitmap bitmap);

        b b(float f);

        b b(int i10);

        b b(Bitmap bitmap);

        a b();

        b c(int i10);
    }

    public /* synthetic */ a(C0137a c0137a, byte b10) {
        this(c0137a);
    }

    private void a(Canvas canvas) {
        float f = this.f11451c / 2.0f;
        Path path = new Path();
        path.moveTo(gl.Code, gl.Code);
        path.lineTo(gl.Code, (this.f11452d + f) - this.f11453e);
        path.lineTo(this.f11450b, (f - this.f11452d) - this.f11453e);
        path.lineTo(this.f11450b, gl.Code);
        if (this.f11455h) {
            try {
                a(canvas, path);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(gl.Code, this.f11452d + f + this.f11453e);
        path2.lineTo(gl.Code, this.f11451c);
        path2.lineTo(this.f11450b, this.f11451c);
        path2.lineTo(this.f11450b, (f - this.f11452d) + this.f11453e);
        if (this.f11455h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f11454g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.f11454g);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    private void b(Canvas canvas) {
        float f = this.f11450b / 2.0f;
        Path path = new Path();
        path.moveTo(gl.Code, gl.Code);
        path.lineTo(gl.Code, this.f11451c);
        path.lineTo((f - this.f11452d) - this.f11453e, this.f11451c);
        path.lineTo((this.f11452d + f) - this.f11453e, gl.Code);
        if (this.f11455h) {
            try {
                a(canvas, path);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(this.f11452d + f + this.f11453e, gl.Code);
        path2.lineTo(this.f11450b, gl.Code);
        path2.lineTo(this.f11450b, this.f11451c);
        path2.lineTo((f - this.f11452d) + this.f11453e, this.f11451c);
        if (this.f11455h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f11454g;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            try {
                a(canvas, path2, this.f11454g);
            } catch (Exception e13) {
                e13.printStackTrace();
            }
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f11449a == 1) {
            float f = this.f11451c / 2.0f;
            Path path = new Path();
            path.moveTo(gl.Code, gl.Code);
            path.lineTo(gl.Code, (this.f11452d + f) - this.f11453e);
            path.lineTo(this.f11450b, (f - this.f11452d) - this.f11453e);
            path.lineTo(this.f11450b, gl.Code);
            if (this.f11455h) {
                try {
                    a(canvas, path);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            } else {
                Bitmap bitmap = this.f;
                if (bitmap != null && !bitmap.isRecycled()) {
                    try {
                        a(canvas, path, this.f);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            }
            Path path2 = new Path();
            path2.moveTo(gl.Code, this.f11452d + f + this.f11453e);
            path2.lineTo(gl.Code, this.f11451c);
            path2.lineTo(this.f11450b, this.f11451c);
            path2.lineTo(this.f11450b, (f - this.f11452d) + this.f11453e);
            if (this.f11455h) {
                try {
                    a(canvas, path2);
                    return;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    return;
                }
            }
            Bitmap bitmap2 = this.f11454g;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                try {
                    a(canvas, path2, this.f11454g);
                    return;
                } catch (Exception e13) {
                    e13.printStackTrace();
                    return;
                }
            }
            return;
        }
        float f10 = this.f11450b / 2.0f;
        Path path3 = new Path();
        path3.moveTo(gl.Code, gl.Code);
        path3.lineTo(gl.Code, this.f11451c);
        path3.lineTo((f10 - this.f11452d) - this.f11453e, this.f11451c);
        path3.lineTo((this.f11452d + f10) - this.f11453e, gl.Code);
        if (this.f11455h) {
            try {
                a(canvas, path3);
            } catch (Exception e14) {
                e14.printStackTrace();
            }
        } else {
            Bitmap bitmap3 = this.f;
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                try {
                    a(canvas, path3, this.f);
                } catch (Exception e15) {
                    e15.printStackTrace();
                }
            }
        }
        Path path4 = new Path();
        path4.moveTo(this.f11452d + f10 + this.f11453e, gl.Code);
        path4.lineTo(this.f11450b, gl.Code);
        path4.lineTo(this.f11450b, this.f11451c);
        path4.lineTo((f10 - this.f11452d) + this.f11453e, this.f11451c);
        if (this.f11455h) {
            try {
                a(canvas, path4);
                return;
            } catch (Exception e16) {
                e16.printStackTrace();
                return;
            }
        }
        Bitmap bitmap4 = this.f11454g;
        if (bitmap4 != null && !bitmap4.isRecycled()) {
            try {
                a(canvas, path4, this.f11454g);
            } catch (Exception e17) {
                e17.printStackTrace();
            }
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    private a(C0137a c0137a) {
        super(c0137a.f11457a);
        this.f11455h = false;
        this.f = c0137a.f11458b;
        this.f11454g = c0137a.f11459c;
        this.f11455h = c0137a.f11460d;
        this.f11449a = c0137a.f11461e;
        this.f11452d = c0137a.f;
        this.f11453e = c0137a.f11462g;
        this.f11450b = c0137a.f11463h;
        this.f11451c = c0137a.f11464i;
        Paint paint = new Paint();
        this.f11456i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f11456i.setAntiAlias(true);
    }

    private void a(Canvas canvas, Path path, Bitmap bitmap) {
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f11456i.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        canvas.drawPath(path, this.f11456i);
    }

    private void a(Canvas canvas, Path path) {
        this.f11456i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.f11456i);
    }

    public static C0137a a() {
        return new C0137a((byte) 0);
    }
}
