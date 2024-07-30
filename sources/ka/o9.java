package ka;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class o9 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    public static final ConcurrentHashMap B = new ConcurrentHashMap();
    public a A;

    /* renamed from: s, reason: collision with root package name */
    public String f31599s;

    /* renamed from: t, reason: collision with root package name */
    public final View f31600t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f31601u;

    /* renamed from: v, reason: collision with root package name */
    public long f31602v;

    /* renamed from: w, reason: collision with root package name */
    public int f31603w;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f31604x = new Rect();
    public boolean y = true;

    /* renamed from: z, reason: collision with root package name */
    public final a f31605z = new a();

    /* loaded from: classes2.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onReceive(android.content.Context r6, android.content.Intent r7) {
            /*
                r5 = this;
                if (r7 != 0) goto L3
                return
            L3:
                java.lang.String r6 = r7.getAction()
                ka.o9 r7 = ka.o9.this
                java.lang.String r0 = r7.f31599s
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r3 = 0
                r2[r3] = r6
                java.lang.String r4 = "receive screen state: %s"
                ka.n7.f(r0, r4, r2)
                java.lang.String r0 = "android.intent.action.SCREEN_ON"
                boolean r0 = android.text.TextUtils.equals(r0, r6)
                if (r0 != 0) goto L2e
                java.lang.String r0 = "android.intent.action.SCREEN_OFF"
                boolean r0 = android.text.TextUtils.equals(r0, r6)
                if (r0 != 0) goto L2e
                java.lang.String r0 = "android.intent.action.USER_PRESENT"
                boolean r6 = android.text.TextUtils.equals(r0, r6)
                if (r6 == 0) goto L85
            L2e:
                android.view.View r6 = r7.f31600t
                android.content.Context r6 = r6.getContext()
                if (r6 != 0) goto L37
                goto L4e
            L37:
                java.lang.String r0 = "power"
                java.lang.Object r0 = r6.getSystemService(r0)
                android.os.PowerManager r0 = (android.os.PowerManager) r0
                if (r0 != 0) goto L42
                goto L4e
            L42:
                boolean r0 = r0.isInteractive()     // Catch: java.lang.Exception -> L47
                goto L4f
            L47:
                java.lang.String r0 = "SystemUtil"
                java.lang.String r2 = "isScreenInteractive has exception"
                ka.n7.g(r0, r2)
            L4e:
                r0 = r1
            L4f:
                if (r6 != 0) goto L52
                goto L5c
            L52:
                java.lang.String r2 = "keyguard"
                java.lang.Object r6 = r6.getSystemService(r2)
                android.app.KeyguardManager r6 = (android.app.KeyguardManager) r6
                if (r6 != 0) goto L5e
            L5c:
                r6 = r3
                goto L62
            L5e:
                boolean r6 = r6.inKeyguardRestrictedInputMode()
            L62:
                if (r0 == 0) goto L68
                if (r6 != 0) goto L68
                r6 = r1
                goto L69
            L68:
                r6 = r3
            L69:
                r7.y = r6
                boolean r6 = ka.n7.d()
                if (r6 == 0) goto L82
                java.lang.String r6 = r7.f31599s
                java.lang.Object[] r0 = new java.lang.Object[r1]
                boolean r1 = r7.y
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0[r3] = r1
                java.lang.String r1 = "checkScreenState screen available: %s "
                ka.n7.c(r6, r1, r0)
            L82:
                r7.f()
            L85:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ka.o9.a.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    public o9(View view) {
        this.f31599s = "ViewMonitor";
        this.f31600t = view;
        if (view != null) {
            this.f31599s = view.getClass().getSimpleName().concat("ViewMonitor");
        }
    }

    public final void d() {
        n7.e(this.f31599s, "onViewAttachedToWindow");
        n7.e(this.f31599s, "registerObservers");
        View view = this.f31600t;
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ConcurrentHashMap concurrentHashMap = B;
            o9 o9Var = (o9) concurrentHashMap.get(view);
            if (o9Var != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(o9Var);
                viewTreeObserver.removeOnGlobalLayoutListener(o9Var);
            }
            concurrentHashMap.put(view, this);
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                viewTreeObserver.addOnScrollChangedListener(this);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.A = this.f31605z;
            m6 a10 = m6.a(view.getContext());
            a aVar = this.A;
            a10.getClass();
            if (aVar != null) {
                com.huawei.openalliance.ad.ppskit.utils.d2.a(new k6(a10, aVar, intentFilter));
            }
            this.y = true;
        }
        f();
    }

    public final void e() {
        if (n7.d()) {
            n7.b(this.f31599s, "onViewDetachedFromWindow");
        }
        n7.e(this.f31599s, "unregisterObservers");
        View view = this.f31600t;
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                viewTreeObserver.removeOnScrollChangedListener(this);
            }
            view.setOnSystemUiVisibilityChangeListener(null);
            if (this.A != null) {
                m6 a10 = m6.a(view.getContext());
                a aVar = this.A;
                a10.getClass();
                if (aVar != null) {
                    com.huawei.openalliance.ad.ppskit.utils.d2.a(new l6(a10, aVar));
                }
                this.A = null;
            }
            B.remove(view);
        }
        g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r3 <= 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r6 = this;
            boolean r0 = r6.y
            r1 = 1
            r2 = 0
            android.graphics.Rect r3 = r6.f31604x
            android.view.View r4 = r6.f31600t
            if (r0 == 0) goto L18
            boolean r0 = r4.isShown()
            if (r0 == 0) goto L18
            boolean r0 = r4.getLocalVisibleRect(r3)
            if (r0 == 0) goto L18
            r0 = r1
            goto L19
        L18:
            r0 = r2
        L19:
            int r5 = r4.getWidth()
            int r4 = r4.getHeight()
            int r4 = r4 * r5
            if (r0 == 0) goto L3e
            if (r4 <= 0) goto L3e
            int r5 = r3.width()
            int r3 = r3.height()
            int r3 = r3 * r5
            int r3 = r3 * 100
            int r3 = r3 / r4
            int r4 = r6.f31603w
            if (r3 <= r4) goto L38
            r6.f31603w = r3
        L38:
            r6.b(r3)
            if (r3 > 0) goto L3e
            goto L3f
        L3e:
            r2 = r0
        L3f:
            if (r2 == 0) goto L59
            boolean r0 = r6.f31601u
            if (r0 == 0) goto L46
            goto L5c
        L46:
            java.lang.String r0 = r6.f31599s
            java.lang.String r2 = "onViewShown"
            ka.n7.e(r0, r2)
            r6.f31601u = r1
            long r0 = java.lang.System.currentTimeMillis()
            r6.f31602v = r0
            r6.a()
            goto L5c
        L59:
            r6.g()
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.o9.f():void");
    }

    public final void g() {
        if (!this.f31601u) {
            return;
        }
        n7.e(this.f31599s, "onViewHidden");
        this.f31601u = false;
        long currentTimeMillis = System.currentTimeMillis() - this.f31602v;
        if (n7.d()) {
            n7.c(this.f31599s, "max physical visible area percentage: %d duration: %d", Integer.valueOf(this.f31603w), Long.valueOf(currentTimeMillis));
        }
        c(currentTimeMillis, this.f31603w);
        this.f31603w = 0;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (n7.d()) {
            n7.b(this.f31599s, "onGlobalLayout");
        }
        f();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        if (n7.d()) {
            n7.b(this.f31599s, "onScrollChanged");
        }
        f();
    }

    public void a() {
    }

    public void b(int i10) {
    }

    public void c(long j10, int i10) {
    }
}
