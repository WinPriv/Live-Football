package com.huawei.hms.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import com.huawei.openalliance.ad.inter.HiAd;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class fx implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final String Code = "ViewMonitor";
    private static final Map<View, fx> V = new ConcurrentHashMap();
    private boolean B;
    private long C;
    private int S;
    private View Z;

    /* renamed from: a, reason: collision with root package name */
    private BroadcastReceiver f21693a;
    private String I = Code;
    private Rect F = new Rect();
    private boolean D = true;
    private BroadcastReceiver L = new BroadcastReceiver() { // from class: com.huawei.hms.ads.fx.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            ex.V(fx.this.I, "receive screen state: %s", action);
            if (TextUtils.equals("android.intent.action.SCREEN_ON", action) || TextUtils.equals("android.intent.action.SCREEN_OFF", action) || TextUtils.equals("android.intent.action.USER_PRESENT", action)) {
                fx.this.Z();
                fx.this.C();
            }
        }
    };

    public fx(View view) {
        this.Z = view;
        V();
    }

    private void B() {
        ex.V(this.I, "unregisterObservers");
        View view = this.Z;
        if (view == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
            viewTreeObserver.removeOnScrollChangedListener(this);
        }
        this.Z.setOnSystemUiVisibilityChangeListener(null);
        if (this.f21693a != null) {
            HiAd c10 = HiAd.c(this.Z.getContext());
            BroadcastReceiver broadcastReceiver = this.f21693a;
            if (broadcastReceiver == null) {
                c10.getClass();
            } else {
                c10.f22219c.remove(broadcastReceiver);
            }
            this.f21693a = null;
        }
        V.remove(this.Z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r4 <= 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C() {
        /*
            r5 = this;
            boolean r0 = r5.D
            r1 = 0
            if (r0 == 0) goto L19
            android.view.View r0 = r5.Z
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L19
            android.view.View r0 = r5.Z
            android.graphics.Rect r2 = r5.F
            boolean r0 = r0.getLocalVisibleRect(r2)
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = r1
        L1a:
            android.view.View r2 = r5.Z
            int r2 = r2.getWidth()
            android.view.View r3 = r5.Z
            int r3 = r3.getHeight()
            int r3 = r3 * r2
            if (r0 == 0) goto L47
            if (r3 <= 0) goto L47
            android.graphics.Rect r2 = r5.F
            int r2 = r2.width()
            android.graphics.Rect r4 = r5.F
            int r4 = r4.height()
            int r4 = r4 * r2
            int r4 = r4 * 100
            int r4 = r4 / r3
            int r2 = r5.S
            if (r4 <= r2) goto L41
            r5.S = r4
        L41:
            r5.Code(r4)
            if (r4 > 0) goto L47
            goto L48
        L47:
            r1 = r0
        L48:
            if (r1 == 0) goto L4e
            r5.b()
            goto L51
        L4e:
            r5.c()
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.ads.fx.C():void");
    }

    private void I() {
        ex.V(this.I, "registerObservers");
        View view = this.Z;
        if (view == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        Map<View, fx> map = V;
        fx fxVar = map.get(this.Z);
        if (fxVar != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(fxVar);
            viewTreeObserver.removeOnGlobalLayoutListener(fxVar);
        }
        map.put(this.Z, this);
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
            viewTreeObserver.addOnScrollChangedListener(this);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f21693a = this.L;
        HiAd c10 = HiAd.c(this.Z.getContext());
        BroadcastReceiver broadcastReceiver = this.f21693a;
        if (broadcastReceiver == null) {
            c10.getClass();
        } else {
            c10.f22219c.put(broadcastReceiver, intentFilter);
        }
        this.D = true;
    }

    private void V() {
        View view = this.Z;
        if (view != null) {
            this.I = view.getClass().getSimpleName().concat(Code);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Z() {
        /*
            r4 = this;
            android.view.View r0 = r4.Z
            android.content.Context r0 = r0.getContext()
            int r1 = gb.u.f28631a
            r1 = 1
            if (r0 != 0) goto Lc
        Lb:
            goto L23
        Lc:
            java.lang.String r2 = "power"
            java.lang.Object r2 = r0.getSystemService(r2)
            android.os.PowerManager r2 = (android.os.PowerManager) r2
            if (r2 != 0) goto L17
            goto Lb
        L17:
            boolean r2 = r2.isInteractive()     // Catch: java.lang.Exception -> L1c
            goto L24
        L1c:
            java.lang.String r2 = "u"
            java.lang.String r3 = "isScreenInteractive has exception"
            com.huawei.hms.ads.ex.I(r2, r3)
        L23:
            r2 = r1
        L24:
            boolean r0 = gb.u.o(r0)
            r3 = 0
            if (r2 == 0) goto L2f
            if (r0 != 0) goto L2f
            r0 = r1
            goto L30
        L2f:
            r0 = r3
        L30:
            r4.D = r0
            boolean r0 = com.huawei.hms.ads.ex.Code()
            if (r0 == 0) goto L49
            java.lang.String r0 = r4.I
            java.lang.Object[] r1 = new java.lang.Object[r1]
            boolean r2 = r4.D
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1[r3] = r2
            java.lang.String r2 = "checkScreenState screen available: %s "
            com.huawei.hms.ads.ex.Code(r0, r2, r1)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.ads.fx.Z():void");
    }

    public void D() {
        ex.V(this.I, "onViewAttachedToWindow");
        I();
        C();
    }

    public void L() {
        if (ex.Code()) {
            ex.Code(this.I, "onViewDetachedFromWindow");
        }
        B();
        c();
    }

    public void a() {
        ex.V(this.I, "onViewVisibilityChanged");
        C();
    }

    public void b() {
        if (this.B) {
            return;
        }
        ex.V(this.I, "onViewShown");
        this.B = true;
        this.C = System.currentTimeMillis();
        Code();
    }

    public void c() {
        if (!this.B) {
            return;
        }
        ex.V(this.I, "onViewHidden");
        this.B = false;
        long currentTimeMillis = System.currentTimeMillis() - this.C;
        if (ex.Code()) {
            ex.Code(this.I, "max physical visible area percentage: %d duration: %d", Integer.valueOf(this.S), Long.valueOf(currentTimeMillis));
        }
        Code(currentTimeMillis, this.S);
        this.S = 0;
    }

    public boolean d() {
        if (this.B && this.Z.isShown()) {
            return true;
        }
        return false;
    }

    public int e() {
        boolean z10;
        if (this.D && this.Z.isShown() && this.Z.getLocalVisibleRect(this.F)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = this.Z.getHeight() * this.Z.getWidth();
        if (!z10 || height <= 0) {
            return 0;
        }
        return ((this.F.height() * this.F.width()) * 100) / height;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (ex.Code()) {
            ex.Code(this.I, "onGlobalLayout");
        }
        C();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        if (ex.Code()) {
            ex.Code(this.I, "onScrollChanged");
        }
        C();
    }

    public void Code() {
    }

    public void Code(int i10) {
    }

    public void Code(long j10, int i10) {
    }
}
