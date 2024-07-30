package com.anythink.expressad.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.anythink.expressad.exoplayer.k.p;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.webview.a;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class ProgressBar extends View implements a {
    private static final float C = 1200.0f;
    private static final long L = 25;

    /* renamed from: g, reason: collision with root package name */
    private static final String f10240g = "ProgressBar";

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f10241h = false;

    /* renamed from: t, reason: collision with root package name */
    private static final float f10242t = 0.05f;

    /* renamed from: u, reason: collision with root package name */
    private static final float f10243u = 0.2f;

    /* renamed from: v, reason: collision with root package name */
    private static final float f10244v = 0.4f;

    /* renamed from: w, reason: collision with root package name */
    private static final float f10245w = 1.0f;

    /* renamed from: x, reason: collision with root package name */
    private static final long f10246x = 2000;
    private static final float y = 0.2f;
    private int A;
    private int B;
    private long D;
    private Drawable E;
    private Drawable F;
    private Drawable G;
    private Drawable H;
    private boolean I;
    private a.InterfaceC0125a J;
    private Handler K;
    private boolean M;
    private boolean N;
    Runnable f;

    /* renamed from: i, reason: collision with root package name */
    private Rect f10247i;

    /* renamed from: j, reason: collision with root package name */
    private float f10248j;

    /* renamed from: k, reason: collision with root package name */
    private float f10249k;

    /* renamed from: l, reason: collision with root package name */
    private long f10250l;

    /* renamed from: m, reason: collision with root package name */
    private float f10251m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f10252n;
    private float o;

    /* renamed from: p, reason: collision with root package name */
    private float f10253p;

    /* renamed from: q, reason: collision with root package name */
    private float f10254q;

    /* renamed from: r, reason: collision with root package name */
    private long f10255r;

    /* renamed from: s, reason: collision with root package name */
    private int f10256s;

    /* renamed from: z, reason: collision with root package name */
    private int f10257z;

    public ProgressBar(Context context) {
        super(context);
        this.f10247i = new Rect();
        this.f10249k = 0.95f;
        this.D = L;
        this.I = false;
        this.K = new Handler(Looper.getMainLooper());
        this.f = new Runnable() { // from class: com.anythink.expressad.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.N = false;
        setWillNotDraw(false);
    }

    private void a() {
        setWillNotDraw(false);
    }

    private float b() {
        if (!this.f10252n) {
            if (this.f10255r < 2000) {
                if (this.A == 1) {
                    if (this.M) {
                        return 1.0f;
                    }
                    return f10244v;
                }
                if (this.f10257z == 1) {
                    if (this.M) {
                        return f10244v;
                    }
                    return 0.2f;
                }
                if (this.M) {
                    return 0.2f;
                }
            }
            return 0.05f;
        }
        if (this.M) {
            return 1.0f;
        }
        return f10244v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r11.M != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x005a, code lost:
    
        r5 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x004b, code lost:
    
        if (r11.M == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0050, code lost:
    
        if (r11.M != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0058, code lost:
    
        if (r11.M != false) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r12) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.webview.ProgressBar.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z10) {
        return null;
    }

    @Override // com.anythink.expressad.foundation.webview.a
    public float getProgress() {
        return this.f10253p;
    }

    @Override // com.anythink.expressad.foundation.webview.a
    public void initResource(boolean z10) {
        if (!z10 && (this.H != null || this.E != null || this.F != null || this.G != null)) {
            return;
        }
        Drawable drawable = getResources().getDrawable(getResources().getIdentifier("anythink_cm_highlight", i.f10125c, com.anythink.expressad.foundation.b.a.b().a()));
        this.H = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.H.getIntrinsicHeight());
        }
        Drawable drawable2 = getResources().getDrawable(getResources().getIdentifier("anythink_cm_head", i.f10125c, com.anythink.expressad.foundation.b.a.b().a()));
        this.E = drawable2;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.E.getIntrinsicHeight());
        }
        this.F = getResources().getDrawable(getResources().getIdentifier("anythink_cm_tail", i.f10125c, com.anythink.expressad.foundation.b.a.b().a()));
        this.G = getResources().getDrawable(getResources().getIdentifier("anythink_cm_end_animation", i.f10125c, com.anythink.expressad.foundation.b.a.b().a()));
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f10248j = getMeasuredWidth();
    }

    @Override // com.anythink.expressad.foundation.webview.a
    public void onThemeChange() {
        if (this.I) {
            initResource(true);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Drawable drawable = this.H;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (drawable.getIntrinsicWidth() * 1.5d), getHeight());
        }
        Drawable drawable2 = this.E;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    @Override // com.anythink.expressad.foundation.webview.a
    public void setPaused(boolean z10) {
        this.N = z10;
        if (!z10) {
            this.f10250l = System.currentTimeMillis();
        }
    }

    @Override // com.anythink.expressad.foundation.webview.a
    public void setProgress(float f, boolean z10) {
        if (z10 && f >= 1.0f) {
            startEndAnimation();
        }
    }

    @Override // com.anythink.expressad.foundation.webview.a
    public void setProgressBarListener(a.InterfaceC0125a interfaceC0125a) {
        this.J = interfaceC0125a;
    }

    @Override // com.anythink.expressad.foundation.webview.a
    public void setProgressState(int i10) {
        if (i10 != 5) {
            if (i10 != 6) {
                if (i10 != 7) {
                    if (i10 == 8) {
                        this.B = 1;
                        if (this.A == 1) {
                            startEndAnimation();
                            return;
                        }
                        return;
                    }
                    return;
                }
                startEndAnimation();
                return;
            }
            this.A = 1;
            if (this.B == 1) {
                startEndAnimation();
            }
            this.f10255r = 0L;
            return;
        }
        this.f10257z = 1;
        this.A = 0;
        this.B = 0;
        this.f10255r = 0L;
    }

    @Override // android.view.View, com.anythink.expressad.foundation.webview.a
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // com.anythink.expressad.foundation.webview.a
    public void setVisible(boolean z10) {
        if (z10) {
            this.M = true;
            this.f10250l = System.currentTimeMillis();
            this.f10251m = gl.Code;
            this.f10255r = 0L;
            this.f10252n = false;
            this.o = gl.Code;
            this.f10253p = gl.Code;
            this.f10248j = getMeasuredWidth();
            this.N = false;
            this.f10257z = 0;
            this.A = 0;
            this.B = 0;
            Drawable drawable = this.H;
            if (drawable != null) {
                this.f10256s = -drawable.getIntrinsicWidth();
            } else {
                this.f10256s = 0;
            }
            Drawable drawable2 = this.F;
            if (drawable2 != null) {
                drawable2.setAlpha(p.f9095b);
            }
            Drawable drawable3 = this.G;
            if (drawable3 != null) {
                drawable3.setAlpha(p.f9095b);
            }
            Drawable drawable4 = this.E;
            if (drawable4 != null) {
                drawable4.setAlpha(p.f9095b);
            }
            setVisibility(0);
            invalidate();
            return;
        }
        setVisibility(4);
    }

    @Override // com.anythink.expressad.foundation.webview.a
    public void startEndAnimation() {
        if (!this.f10252n) {
            this.f10252n = true;
            this.o = gl.Code;
        }
    }

    private void a(Canvas canvas, float f) {
        Drawable drawable;
        Drawable drawable2;
        if (this.f10252n) {
            float f10 = this.o;
            float f11 = this.f10248j;
            int i10 = (int) ((1.0f - (f10 / (f11 * 0.5f))) * 255.0f);
            if (i10 < 0) {
                i10 = 0;
            }
            if (f10 > f11 * 0.5f) {
                setVisible(false);
            }
            Drawable drawable3 = this.F;
            if (drawable3 != null) {
                drawable3.setAlpha(i10);
            }
            Drawable drawable4 = this.G;
            if (drawable4 != null) {
                drawable4.setAlpha(i10);
            }
            Drawable drawable5 = this.E;
            if (drawable5 != null) {
                drawable5.setAlpha(i10);
            }
            canvas.save();
            canvas.translate(this.o, gl.Code);
        }
        if (this.F != null && this.E != null) {
            Drawable drawable6 = this.F;
            drawable6.setBounds(0, 0, (int) (this.f10247i.width() - (this.E.getIntrinsicWidth() * 0.05f)), drawable6.getIntrinsicHeight());
            this.F.draw(canvas);
        }
        if (this.f10252n && (drawable2 = this.G) != null && this.E != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable7 = this.G;
            drawable7.setBounds(0, 0, intrinsicWidth, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate(-intrinsicWidth, gl.Code);
            this.G.draw(canvas);
            canvas.restore();
        }
        if (this.E != null) {
            canvas.save();
            canvas.translate(this.f10247i.width() - getWidth(), gl.Code);
            this.E.draw(canvas);
            canvas.restore();
        }
        if (!this.f10252n && Math.abs(this.f10253p - this.f10249k) < 1.0E-5f && (drawable = this.H) != null) {
            int i11 = (int) ((f * 0.2f * this.f10248j) + this.f10256s);
            this.f10256s = i11;
            if (drawable.getIntrinsicWidth() + i11 >= this.f10247i.width()) {
                this.f10256s = -this.H.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate(this.f10256s, gl.Code);
            this.H.draw(canvas);
            canvas.restore();
        }
        if (this.f10252n) {
            canvas.restore();
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10247i = new Rect();
        this.f10249k = 0.95f;
        this.D = L;
        this.I = false;
        this.K = new Handler(Looper.getMainLooper());
        this.f = new Runnable() { // from class: com.anythink.expressad.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.N = false;
        setWillNotDraw(false);
    }
}
