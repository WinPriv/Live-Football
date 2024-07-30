package ka;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.Gravity;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes2.dex */
public final class a6 extends Drawable implements Animatable, Drawable.Callback {
    public int C;
    public w5 E;
    public final Context F;
    public e6 H;
    public boolean I;
    public final com.huawei.openalliance.ad.ppskit.utils.c0 J;
    public f6 L;

    /* renamed from: x, reason: collision with root package name */
    public Paint f30922x;

    /* renamed from: z, reason: collision with root package name */
    public final String f30923z;

    /* renamed from: s, reason: collision with root package name */
    public final String f30917s = "render_frame" + hashCode();

    /* renamed from: t, reason: collision with root package name */
    public final Canvas f30918t = new Canvas();

    /* renamed from: u, reason: collision with root package name */
    public final Rect f30919u = new Rect();

    /* renamed from: v, reason: collision with root package name */
    public final Rect f30920v = new Rect();

    /* renamed from: w, reason: collision with root package name */
    public final Rect f30921w = new Rect();
    public boolean y = false;
    public final ConcurrentLinkedQueue A = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue B = new ConcurrentLinkedQueue();
    public boolean D = false;
    public long G = 0;
    public final WeakHashMap<Drawable.Callback, Void> K = new WeakHashMap<>();

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ w5 f30924s;

        public a(w5 w5Var) {
            this.f30924s = w5Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:197:0x0110, code lost:
        
            r10 = r0.f32051d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:198:0x0112, code lost:
        
            monitor-enter(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:200:0x0113, code lost:
        
            r5 = r0.f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:201:0x0115, code lost:
        
            monitor-exit(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:202:0x0116, code lost:
        
            if (r5 == false) goto L103;
         */
        /* JADX WARN: Code restructure failed: missing block: B:203:0x0118, code lost:
        
            r0.b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0212, code lost:
        
            if (r0 > 640) goto L142;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x021a, code lost:
        
            r8 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x021b, code lost:
        
            r13 = (int) (((r8 * r7) * 1.0f) / r0);
            ka.n7.f(r4.d(), "reduce image size to w: %d, h: %d src w: %d, h: %d", java.lang.Integer.valueOf(r8), java.lang.Integer.valueOf(r13), java.lang.Integer.valueOf(r0), java.lang.Integer.valueOf(r7));
            r7 = android.graphics.Bitmap.createBitmap(r8, r13, android.graphics.Bitmap.Config.RGB_565);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0217, code lost:
        
            if (r0 > 960) goto L142;
         */
        /* JADX WARN: Removed duplicated region for block: B:139:0x011c A[EDGE_INSN: B:139:0x011c->B:15:0x011c BREAK  A[LOOP:0: B:90:0x002a->B:112:0x002a], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:140:0x002a A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0292  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x02a4  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x02b2  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x02ee  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 821
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ka.a6.a.run():void");
        }
    }

    public a6(Context context, String str) {
        this.F = context.getApplicationContext();
        this.f30923z = str;
        com.huawei.openalliance.ad.ppskit.utils.c0 c0Var = new com.huawei.openalliance.ad.ppskit.utils.c0("gif-thread");
        this.J = c0Var;
        c0Var.a();
        setCallback(this);
    }

    public static void a(a6 a6Var, e6 e6Var) {
        boolean z10;
        boolean z11;
        if (e6Var == null) {
            n7.e(a6Var.d(), "invalid frame.");
            return;
        }
        String d10 = a6Var.d();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(e6Var.f31118a);
        synchronized (a6Var) {
            z10 = a6Var.D;
        }
        objArr[1] = Boolean.valueOf(z10);
        n7.f(d10, "onFrameDecoded index: %d isstop: %s", objArr);
        synchronized (a6Var) {
            z11 = a6Var.D;
        }
        if (!z11) {
            long currentTimeMillis = System.currentTimeMillis() - a6Var.G;
            if (n7.d()) {
                n7.c(a6Var.d(), "onFrameDecoded decodeInterval: %d currentFrameDuration: %d", Long.valueOf(currentTimeMillis), Integer.valueOf(a6Var.C));
            }
            if (e6Var.f31118a == 1) {
                com.huawei.openalliance.ad.ppskit.utils.d2.a(new c6(a6Var));
            } else {
                long j10 = a6Var.C;
                if (currentTimeMillis < j10) {
                    try {
                        Thread.sleep(j10 - currentTimeMillis);
                    } catch (InterruptedException unused) {
                        n7.b(a6Var.d(), "sleep InterruptedException");
                    }
                }
            }
            e6 e6Var2 = a6Var.H;
            if (e6Var2 != null) {
                ConcurrentLinkedQueue concurrentLinkedQueue = a6Var.B;
                if (concurrentLinkedQueue.size() < 2) {
                    if (!concurrentLinkedQueue.contains(e6Var2.f31119b) && !concurrentLinkedQueue.offer(e6Var2.f31119b)) {
                        n7.g(a6Var.d(), "fail to release frame to pool");
                    }
                    a6Var.H = e6Var;
                    a6Var.C = e6Var.f31120c;
                    com.huawei.openalliance.ad.ppskit.utils.d2.c(new d6(a6Var), a6Var.f30917s, 0L);
                    a6Var.G = System.currentTimeMillis();
                }
            }
            n7.e(a6Var.d(), "drop frame");
            a6Var.H = e6Var;
            a6Var.C = e6Var.f31120c;
            com.huawei.openalliance.ad.ppskit.utils.d2.c(new d6(a6Var), a6Var.f30917s, 0L);
            a6Var.G = System.currentTimeMillis();
        }
    }

    public final void b() {
        n7.e(d(), "stop play " + com.huawei.openalliance.ad.ppskit.utils.y1.j(this.f30923z));
        com.huawei.openalliance.ad.ppskit.utils.d2.d(this.f30917s);
        synchronized (this) {
            this.D = true;
        }
        this.A.clear();
        this.J.b(new x5(this));
    }

    public final void c() {
        boolean z10;
        w5 w5Var;
        synchronized (this) {
            z10 = this.D;
        }
        if (z10 || (w5Var = this.E) == null) {
            return;
        }
        this.J.b(new a(w5Var));
    }

    public final String d() {
        return "GifDrawable_" + hashCode();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        e6 e6Var = this.H;
        if (e6Var != null && e6Var.f31119b != null) {
            if (n7.d()) {
                n7.c(d(), "draw frame: %d", Integer.valueOf(this.H.f31118a));
            }
            boolean z10 = this.I;
            Rect rect = this.f30919u;
            if (z10) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), rect);
                this.I = false;
            }
            Bitmap bitmap = this.H.f31119b;
            if (this.f30922x == null) {
                this.f30922x = new Paint(2);
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.f30922x);
        }
    }

    public final void finalize() {
        super.finalize();
        this.J.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        e6 e6Var = this.H;
        if (e6Var != null) {
            return e6Var.f31119b.getHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        e6 e6Var = this.H;
        if (e6Var != null) {
            return e6Var.f31119b.getWidth();
        }
        return super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        for (Drawable.Callback callback : this.K.keySet()) {
            if (callback != null) {
                callback.invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.y;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.I = true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        for (Drawable.Callback callback : this.K.keySet()) {
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f30922x == null) {
            this.f30922x = new Paint(2);
        }
        this.f30922x.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f30922x == null) {
            this.f30922x = new Paint(2);
        }
        this.f30922x.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        n7.e(d(), "setVisible " + z10);
        if (!z10) {
            stop();
        } else if (!this.y) {
            start();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        n7.e(d(), "start");
        this.y = true;
        String str = this.f30923z;
        if (!TextUtils.isEmpty(str)) {
            n7.e(d(), "play " + com.huawei.openalliance.ad.ppskit.utils.y1.j(str));
            b();
            synchronized (this) {
                this.D = false;
            }
            this.A.clear();
            this.J.b(new y5(this, str));
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        n7.e(d(), "stop");
        this.y = false;
        b();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        for (Drawable.Callback callback : this.K.keySet()) {
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }
}
