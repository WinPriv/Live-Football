package com.huawei.hms.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Gravity;
import gb.q0;
import gb.r0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes2.dex */
public class dt extends Drawable implements Animatable, Drawable.Callback {
    private static final int B = 2;
    private static final int C = 119;
    private static final String Code = "GifDrawable";
    private static final int D = 2;
    private static final int F = 5;
    private static final int I = 640;
    private static final int L = 4;
    private static final String S = "render_frame";
    private static final int V = 0;
    private static final int Z = 960;
    private Paint f;

    /* renamed from: i, reason: collision with root package name */
    private String f21616i;

    /* renamed from: l, reason: collision with root package name */
    private int f21619l;

    /* renamed from: m, reason: collision with root package name */
    private int f21620m;
    private ds o;

    /* renamed from: p, reason: collision with root package name */
    private Context f21622p;

    /* renamed from: r, reason: collision with root package name */
    private du f21624r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f21625s;

    /* renamed from: t, reason: collision with root package name */
    private q0 f21626t;

    /* renamed from: v, reason: collision with root package name */
    private dv f21628v;

    /* renamed from: w, reason: collision with root package name */
    private a f21629w;

    /* renamed from: a, reason: collision with root package name */
    private final String f21609a = S + hashCode();

    /* renamed from: b, reason: collision with root package name */
    private Canvas f21610b = new Canvas();

    /* renamed from: c, reason: collision with root package name */
    private Rect f21611c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    private Rect f21612d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    private Rect f21613e = new Rect();

    /* renamed from: g, reason: collision with root package name */
    private boolean f21614g = false;

    /* renamed from: h, reason: collision with root package name */
    private int f21615h = 0;

    /* renamed from: j, reason: collision with root package name */
    private Queue<du> f21617j = new ConcurrentLinkedQueue();

    /* renamed from: k, reason: collision with root package name */
    private Queue<Bitmap> f21618k = new ConcurrentLinkedQueue();

    /* renamed from: n, reason: collision with root package name */
    private boolean f21621n = false;

    /* renamed from: q, reason: collision with root package name */
    private long f21623q = 0;

    /* renamed from: u, reason: collision with root package name */
    private final WeakHashMap<Drawable.Callback, Void> f21627u = new WeakHashMap<>();

    /* loaded from: classes2.dex */
    public interface a {
        void Code(Bitmap bitmap);
    }

    public dt(Context context, String str) {
        this.f21622p = context.getApplicationContext();
        this.f21616i = str;
        q0 q0Var = new q0("gif-thread");
        this.f21626t = q0Var;
        q0Var.b();
        setCallback(this);
    }

    private InputStream B(String str) {
        try {
            return this.f21622p.getResources().openRawResource(Integer.parseInt(str.substring(com.huawei.openalliance.ad.constant.bw.RES.toString().length())));
        } catch (Resources.NotFoundException | NumberFormatException e10) {
            ex.I(e(), "loadFile ".concat(e10.getClass().getSimpleName()));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r10 > com.huawei.hms.ads.dt.I) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        r4 = (int) (((r3 * r0) * 1.0f) / r10);
        com.huawei.hms.ads.ex.V(e(), "reduce image size to w: %d, h: %d src w: %d, h: %d", java.lang.Integer.valueOf(r3), java.lang.Integer.valueOf(r4), java.lang.Integer.valueOf(r10), java.lang.Integer.valueOf(r0));
        r0 = android.graphics.Bitmap.createBitmap(r3, r4, android.graphics.Bitmap.Config.RGB_565);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r10 > com.huawei.hms.ads.dt.Z) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap Code(android.graphics.Bitmap r9, boolean r10) {
        /*
            r8 = this;
            boolean r0 = com.huawei.hms.ads.ex.Code()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1f
            java.lang.String r0 = r8.e()
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.util.Queue<android.graphics.Bitmap> r4 = r8.f21618k
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r1] = r4
            java.lang.String r4 = "image pool size: %d"
            com.huawei.hms.ads.ex.Code(r0, r4, r3)
        L1f:
            java.util.Queue<android.graphics.Bitmap> r0 = r8.f21618k
            java.lang.Object r0 = r0.poll()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 != 0) goto L8d
            java.lang.String r0 = r8.e()
            java.lang.String r3 = "cache bitmap null"
            com.huawei.hms.ads.ex.V(r0, r3)
            if (r10 == 0) goto L84
            int r10 = r9.getWidth()
            int r0 = r9.getHeight()
            if (r10 >= r0) goto L40
            r3 = r2
            goto L41
        L40:
            r3 = r1
        L41:
            if (r3 == 0) goto L48
            r3 = 640(0x280, float:8.97E-43)
            if (r10 <= r3) goto L4d
            goto L4e
        L48:
            r3 = 960(0x3c0, float:1.345E-42)
            if (r10 <= r3) goto L4d
            goto L4e
        L4d:
            r3 = r10
        L4e:
            int r4 = r3 * r0
            float r4 = (float) r4
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r5
            float r5 = (float) r10
            float r4 = r4 / r5
            int r4 = (int) r4
            java.lang.String r5 = r8.e()
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r6[r1] = r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r6[r2] = r1
            r1 = 2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6[r1] = r10
            r10 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r10] = r0
            java.lang.String r10 = "reduce image size to w: %d, h: %d src w: %d, h: %d"
            com.huawei.hms.ads.ex.V(r5, r10, r6)
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r4, r10)
            goto L8d
        L84:
            android.graphics.Bitmap$Config r10 = r9.getConfig()
            android.graphics.Bitmap r9 = r9.copy(r10, r2)
            return r9
        L8d:
            r8.Code(r9, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.ads.dt.Code(android.graphics.Bitmap, boolean):android.graphics.Bitmap");
    }

    public static /* synthetic */ int D(dt dtVar) {
        int i10 = dtVar.f21619l;
        dtVar.f21619l = i10 + 1;
        return i10;
    }

    private Paint Z() {
        if (this.f == null) {
            this.f = new Paint(2);
        }
        return this.f;
    }

    private void b() {
        gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.dt.6
            @Override // java.lang.Runnable
            public void run() {
                if (dt.this.f21628v != null) {
                    dt.this.f21628v.Code();
                }
            }
        });
    }

    private void c() {
        this.f21618k.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        ex.V(e(), "on play end");
        c();
        gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.dt.8
            @Override // java.lang.Runnable
            public void run() {
                if (dt.this.f21628v != null) {
                    dt.this.f21628v.I();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e() {
        return "GifDrawable_" + hashCode();
    }

    public int I() {
        int intrinsicHeight = getIntrinsicHeight() * getIntrinsicWidth() * (this.f21617j.size() + this.f21618k.size()) * 4;
        if (intrinsicHeight > 0) {
            return intrinsicHeight;
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        du duVar = this.f21624r;
        if (duVar != null && duVar.V != null) {
            if (ex.Code()) {
                ex.Code(e(), "draw frame: %d", Integer.valueOf(this.f21624r.Code));
            }
            if (this.f21625s) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), this.f21611c);
                this.f21625s = false;
            }
            canvas.drawBitmap(this.f21624r.V, (Rect) null, this.f21611c, Z());
        }
    }

    public void finalize() {
        super.finalize();
        this.f21626t.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        du duVar = this.f21624r;
        if (duVar != null) {
            return duVar.V.getHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        du duVar = this.f21624r;
        if (duVar != null) {
            return duVar.V.getWidth();
        }
        return super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        for (Drawable.Callback callback : this.f21627u.keySet()) {
            if (callback != null) {
                callback.invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f21614g;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f21625s = true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        for (Drawable.Callback callback : this.f21627u.keySet()) {
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Z().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Z().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        ex.V(e(), "setVisible " + z10);
        if (!z10) {
            stop();
        } else if (!this.f21614g) {
            start();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        ex.V(e(), "start");
        this.f21614g = true;
        Code();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        ex.V(e(), "stop");
        this.f21614g = false;
        V();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        for (Drawable.Callback callback : this.f21627u.keySet()) {
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        ex.V(e(), "replay " + androidx.transition.n.e(this.f21616i));
        Code(this.f21616i);
    }

    private InputStream C(String str) {
        try {
            return this.f21622p.getAssets().open(str.substring(com.huawei.openalliance.ad.constant.bw.ASSET.toString().length()));
        } catch (IOException e10) {
            ex.I(e(), "loadFile ".concat(e10.getClass().getSimpleName()));
            return null;
        }
    }

    private void D() {
        gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.dt.3
            @Override // java.lang.Runnable
            public void run() {
                if (dt.this.f21628v != null) {
                    dt.this.f21628v.V();
                }
                dt.this.V();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean F() {
        return this.f21621n;
    }

    private InputStream I(String str) {
        try {
            return this.f21622p.getContentResolver().openInputStream(Uri.parse(str));
        } catch (FileNotFoundException e10) {
            ex.I(e(), "oPIs ".concat(e10.getClass().getSimpleName()));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        final ds dsVar;
        if (F() || (dsVar = this.o) == null || dsVar.I()) {
            return;
        }
        this.f21626t.c(new Runnable() { // from class: com.huawei.hms.ads.dt.4
            @Override // java.lang.Runnable
            public void run() {
                ex.V(dt.this.e(), "fetch next");
                long currentTimeMillis = System.currentTimeMillis();
                du Code2 = dsVar.Code();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                ex.Code(dt.this.e(), "frame fetch - decoding duration: %d gif: %s", Long.valueOf(currentTimeMillis2), Code2);
                dt dtVar = dt.this;
                if (Code2 != null) {
                    boolean Code3 = dtVar.Code(Code2, currentTimeMillis2);
                    ex.Code(dt.this.e(), "need reduce size: %s", Boolean.valueOf(Code3));
                    du Code4 = Code2.Code();
                    Code4.V = dt.this.Code(Code2.V, Code3);
                    if (!dt.this.f21617j.offer(Code4)) {
                        ex.I(dt.this.e(), "fail to add frame to cache");
                    }
                    int i10 = Code4.I;
                    if (currentTimeMillis2 <= i10) {
                        ex.V(dt.this.e(), "send to render directly");
                    } else {
                        int i11 = (int) ((currentTimeMillis2 * 1.0d) / i10);
                        if (i11 > 5) {
                            i11 = 5;
                        }
                        ex.Code(dt.this.e(), "preferred cached frame num: %d", Integer.valueOf(i11));
                        if (dt.this.f21617j.size() < i11) {
                            dt.this.L();
                            return;
                        }
                    }
                    dt dtVar2 = dt.this;
                    dtVar2.Code((du) dtVar2.f21617j.poll());
                    return;
                }
                du duVar = (du) dtVar.f21617j.poll();
                if (duVar != null) {
                    dt.this.Code(duVar);
                    return;
                }
                long currentTimeMillis3 = System.currentTimeMillis() - dt.this.f21623q;
                if (currentTimeMillis3 < dt.this.f21620m) {
                    try {
                        Thread.sleep(dt.this.f21620m - currentTimeMillis3);
                    } catch (InterruptedException unused) {
                        ex.Code(dt.this.e(), "InterruptedException");
                    }
                }
                dt.this.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        ds dsVar = this.o;
        if (dsVar != null) {
            dsVar.V();
            this.o = null;
        }
    }

    private InputStream Z(String str) {
        try {
            return new FileInputStream(new File(str));
        } catch (FileNotFoundException e10) {
            ex.I(e(), "loadFile ".concat(e10.getClass().getSimpleName()));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.dt.5
            @Override // java.lang.Runnable
            public void run() {
                dt.D(dt.this);
                if (dt.this.f21615h == 0 || dt.this.f21619l < dt.this.f21615h) {
                    dt.this.B();
                } else {
                    dt.this.V();
                    dt.this.d();
                }
            }
        });
    }

    private void C() {
        Code(false);
        this.f21619l = 0;
        this.f21617j.clear();
    }

    public void Code() {
        if (TextUtils.isEmpty(this.f21616i)) {
            return;
        }
        ex.V(e(), "play " + androidx.transition.n.e(this.f21616i));
        V();
        C();
        Code(this.f21616i);
    }

    public void V() {
        ex.V(e(), "stop play " + androidx.transition.n.e(this.f21616i));
        gb.w.d(this.f21609a);
        Code(true);
        this.f21617j.clear();
        this.f21626t.c(new Runnable() { // from class: com.huawei.hms.ads.dt.1
            @Override // java.lang.Runnable
            public void run() {
                dt.this.S();
            }
        });
    }

    private void I(du duVar) {
        if (duVar == null || this.f21618k.size() >= 2) {
            ex.V(e(), "drop frame");
        } else {
            if (this.f21618k.contains(duVar.V) || this.f21618k.offer(duVar.V)) {
                return;
            }
            ex.I(e(), "fail to release frame to pool");
        }
    }

    private void V(du duVar) {
        a aVar;
        I(this.f21624r);
        this.f21624r = duVar;
        if (duVar != null && (aVar = this.f21629w) != null) {
            aVar.Code(duVar.V);
        }
        this.f21620m = duVar.I;
        gb.w.c(new Runnable() { // from class: com.huawei.hms.ads.dt.7
            @Override // java.lang.Runnable
            public void run() {
                if (dt.this.F()) {
                    dt.this.f21624r = null;
                } else {
                    dt.this.invalidateSelf();
                    dt.this.L();
                }
            }
        }, this.f21609a, 0L);
        this.f21623q = System.currentTimeMillis();
    }

    public void Code(int i10) {
        this.f21615h = i10;
    }

    private void Code(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 != null) {
            this.f21610b.setBitmap(bitmap2);
            this.f21610b.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f21612d.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            this.f21613e.set(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
            this.f21610b.drawBitmap(bitmap, this.f21612d, this.f21613e, (Paint) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(String str) {
        S();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        InputStream C2 = str.startsWith(com.huawei.openalliance.ad.constant.bw.ASSET.toString()) ? C(str) : str.startsWith(com.huawei.openalliance.ad.constant.bw.RES.toString()) ? B(str) : str.startsWith(com.huawei.openalliance.ad.constant.bw.CONTENT.toString()) ? I(str) : Z(str);
        if (C2 != null) {
            try {
                this.o = new ds(C2, 100);
                L();
            } catch (Exception unused) {
                ex.I(e(), "exception in creating gif decoder");
                D();
            }
        }
    }

    public void Code(Drawable.Callback callback) {
        this.f21627u.put(callback, null);
        setCallback(this);
    }

    public void Code(a aVar) {
        this.f21629w = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code(du duVar) {
        if (duVar == null) {
            ex.V(e(), "invalid frame.");
            return;
        }
        ex.V(e(), "onFrameDecoded index: %d isstop: %s", Integer.valueOf(duVar.Code), Boolean.valueOf(F()));
        if (F()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f21623q;
        if (ex.Code()) {
            ex.Code(e(), "onFrameDecoded decodeInterval: %d currentFrameDuration: %d", Long.valueOf(currentTimeMillis), Integer.valueOf(this.f21620m));
        }
        if (duVar.Code == 1) {
            b();
        } else {
            int i10 = this.f21620m;
            if (currentTimeMillis < i10) {
                try {
                    Thread.sleep(i10 - currentTimeMillis);
                } catch (InterruptedException unused) {
                    ex.Code(e(), "sleep InterruptedException");
                }
            }
        }
        V(duVar);
    }

    public void Code(dv dvVar) {
        this.f21628v = dvVar;
    }

    private void Code(final String str) {
        this.f21626t.c(new Runnable() { // from class: com.huawei.hms.ads.dt.2
            @Override // java.lang.Runnable
            public void run() {
                dt.this.V(str);
            }
        });
    }

    private synchronized void Code(boolean z10) {
        this.f21621n = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Code(du duVar, long j10) {
        int i10;
        long width = duVar.V.getWidth() * duVar.V.getHeight() * (duVar.V.getConfig() == Bitmap.Config.RGB_565 ? 2 : 4);
        int i11 = duVar.I;
        if (j10 > i11) {
            i10 = (int) Math.ceil((j10 * 1.0d) / i11);
            if (i10 > 5) {
                i10 = 5;
            }
        } else {
            i10 = 1;
        }
        long max = width * Math.max(i10, this.f21617j.size());
        long j11 = r0.j();
        if (ex.Code()) {
            ex.Code(e(), "max frame mem: %d unused memory: %d", Long.valueOf(max), Long.valueOf(j11));
        }
        return max >= j11;
    }
}
