package com.huawei.openalliance.ad.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowMetrics;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.hms.ads.cl;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.constant.bi;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.msgnotify.NotifyCallback;
import com.huawei.openalliance.ad.views.PPSBaseDialogContentView;
import com.huawei.openalliance.ad.views.z;
import e0.i;
import gb.f0;
import gb.h0;
import gb.r0;
import gb.u;
import gb.w;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class a extends com.huawei.openalliance.ad.activity.c implements NotifyCallback {
    public static Context K;
    public PPSBaseDialogContentView A;
    public PPSBaseDialogContentView B;
    public ImageView C;
    public ImageView D;
    public ImageView E;
    public RelativeLayout F;
    public View G;
    public View H;
    public d I;
    public boolean J = false;

    /* renamed from: s, reason: collision with root package name */
    public int f21948s;

    /* renamed from: t, reason: collision with root package name */
    public int f21949t;

    /* renamed from: u, reason: collision with root package name */
    public int f21950u;

    /* renamed from: v, reason: collision with root package name */
    public int f21951v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f21952w;

    /* renamed from: x, reason: collision with root package name */
    public int[] f21953x;
    public AdContentData y;

    /* renamed from: z, reason: collision with root package name */
    public PPSBaseDialogContentView f21954z;

    /* renamed from: com.huawei.openalliance.ad.activity.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0284a implements Runnable {
        public RunnableC0284a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ex.V("BaseDialogActivity", "anchor point changed, do finish.");
            a.this.finish();
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: s, reason: collision with root package name */
        public final WeakReference<Context> f21956s;

        /* renamed from: t, reason: collision with root package name */
        public final WeakReference<View> f21957t;

        /* renamed from: u, reason: collision with root package name */
        public final int[] f21958u;

        public b(View view, Context context, int[] iArr) {
            this.f21956s = new WeakReference<>(context);
            this.f21957t = new WeakReference<>(view);
            this.f21958u = Arrays.copyOf(iArr, iArr.length);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            int[] iArr;
            boolean z10;
            try {
                View view = this.f21957t.get();
                Context context = this.f21956s.get();
                if (view != null && context != null && (iArr = this.f21958u) != null) {
                    int[] iArr2 = new int[2];
                    view.getLocationOnScreen(iArr2);
                    int i10 = iArr2[0];
                    if (i10 == 0 && iArr2[1] == 0) {
                        ex.V("BaseDialogActivity", "anchorView onGlobalLayout newLoc[x,y] =0,0");
                        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        return;
                    }
                    if (iArr[0] != i10 || iArr[1] != iArr2[1]) {
                        int max = Math.max(r0.q(a.K), u.m(a.K));
                        if (Math.abs(iArr[0] - iArr2[0]) <= max && Math.abs(iArr[1] - iArr2[1]) <= max) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            return;
                        }
                        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        ex.V("BaseDialogActivity", "anchorView location change newLoc[x,y] = " + iArr2[0] + "," + iArr2[1] + "--oldLoc[x,y] = " + iArr[0] + "," + iArr[1]);
                        a0.a.n(context, new Intent("com.huawei.ads.feedback.action.ANCHOR_LOCATION_CHANGE"));
                    }
                }
            } catch (Throwable th) {
                i.q(th, "onGlobalLayout error:", "BaseDialogActivity");
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements z {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<a> f21959a;

        public c(a aVar) {
            this.f21959a = new WeakReference<>(aVar);
        }

        public final void a(int i10) {
            a aVar = this.f21959a.get();
            if (aVar != null && !aVar.J) {
                ex.V("BaseDialogActivity", "got safePadding: %s", Integer.valueOf(i10));
                PPSBaseDialogContentView pPSBaseDialogContentView = aVar.B;
                if (pPSBaseDialogContentView != null) {
                    int i11 = pPSBaseDialogContentView.A;
                    if (i11 > i10) {
                        pPSBaseDialogContentView.A = i11 - i10;
                    }
                    int i12 = pPSBaseDialogContentView.B;
                    if (i12 > i10) {
                        pPSBaseDialogContentView.B = i12 - i10;
                    }
                    pPSBaseDialogContentView.b();
                }
                if (aVar.E != null) {
                    aVar.f21948s += i10;
                    aVar.l();
                }
                aVar.J = true;
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null) {
                ex.V("BaseDialogActivity", "intent is empty");
                return;
            }
            String action = intent.getAction();
            ex.V("BaseDialogActivity", "FeedbackEventReceiver action = %s", action);
            if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(action) || "com.huawei.intent.action.CLICK_STATUSBAR".equals(action)) {
                a.this.finish();
            }
        }
    }

    public static boolean d(int[] iArr) {
        if (iArr != null && iArr.length == 2) {
            return false;
        }
        return true;
    }

    private void h() {
        int i10;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowMetrics currentWindowMetrics2;
        Rect bounds2;
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = getWindowManager().getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            this.f21949t = bounds.width();
            currentWindowMetrics2 = getWindowManager().getCurrentWindowMetrics();
            bounds2 = currentWindowMetrics2.getBounds();
            i10 = bounds2.height();
        } else {
            Point point = new Point();
            getWindowManager().getDefaultDisplay().getSize(point);
            this.f21949t = point.x;
            i10 = point.y;
        }
        this.f21950u = i10;
        ex.Code("BaseDialogActivity", "initDevicesInfo screenWidth: %s, screenHeight: %s", Integer.valueOf(this.f21949t), Integer.valueOf(this.f21950u));
        this.f21951v = u.r(this);
        this.f21948s = r0.i(this, 22.0f);
    }

    public boolean a() {
        int i10;
        int identifier;
        try {
            this.f21952w = getIntent().getIntArrayExtra(ba.as);
            this.f21953x = getIntent().getIntArrayExtra(ba.at);
            if (!d(this.f21952w) && !d(this.f21953x)) {
                if (u.k()) {
                    int[] iArr = this.f21952w;
                    int i11 = (this.f21949t - iArr[0]) - this.f21953x[0];
                    iArr[0] = i11;
                    ex.V("BaseDialogActivity", "rtl mAnchorViewLoc[x,y]= %d, %d", Integer.valueOf(i11), Integer.valueOf(this.f21952w[1]));
                }
                if (u.h(this)) {
                    try {
                        identifier = getResources().getIdentifier("hw_multiwindow_height_of_drag_bar", "dimen", "androidhwext");
                    } catch (Throwable th) {
                        ex.I("u", "getMultiWindowDragBarHeight ".concat(th.getClass().getSimpleName()));
                    }
                    if (identifier > 0) {
                        i10 = getResources().getDimensionPixelSize(identifier);
                        int[] iArr2 = this.f21952w;
                        iArr2[1] = iArr2[1] - i10;
                        ex.Code("BaseDialogActivity", "windowing mode is freeform");
                        ex.Code("BaseDialogActivity", "initDevicesInfo dragBarHeight: %s", Integer.valueOf(i10));
                    }
                    i10 = 0;
                    int[] iArr22 = this.f21952w;
                    iArr22[1] = iArr22[1] - i10;
                    ex.Code("BaseDialogActivity", "windowing mode is freeform");
                    ex.Code("BaseDialogActivity", "initDevicesInfo dragBarHeight: %s", Integer.valueOf(i10));
                }
                return true;
            }
            ex.I("BaseDialogActivity", "mAnchorViewLoc or mAnchorViewSize is unavailable");
            return false;
        } catch (Throwable th2) {
            ex.I("BaseDialogActivity", "getIntentExtra error: %s", th2.getClass().getSimpleName());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.activity.a.b():void");
    }

    public final void e() {
        boolean z10;
        int i10;
        if (!d(this.f21952w) && !d(this.f21953x)) {
            boolean z11 = true;
            if (this.f21952w[1] + (this.f21953x[1] >> 1) <= (this.f21950u >> 1)) {
                this.f21954z.setVisibility(8);
                this.C.setVisibility(8);
                this.D.setVisibility(0);
                this.B = this.A;
                this.E = this.D;
                boolean a10 = h0.a(this);
                if ("0".equalsIgnoreCase(f0.a(this).f28584b) && (1 == (i10 = this.f21951v) || 9 == i10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!h0.d() || !h0.b(this)) {
                    z11 = false;
                }
                if (a10 || z10 || z11) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.B.getLayoutParams();
                    layoutParams.setMargins(0, 0, 0, Math.max(r0.i(this, 40.0f), u.m(this)));
                    this.B.setLayoutParams(layoutParams);
                    return;
                }
                return;
            }
            this.A.setVisibility(8);
            this.C.setVisibility(0);
            this.D.setVisibility(8);
            this.B = this.f21954z;
            this.E = this.C;
            int q10 = r0.q(this);
            if (cl.Code(this).Code(this)) {
                q10 = Math.max(q10, cl.Code(this).Code(this.F));
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.B.getLayoutParams();
            layoutParams2.setMargins(0, q10, 0, 0);
            this.B.setLayoutParams(layoutParams2);
            return;
        }
        ex.I("BaseDialogActivity", "mAnchorViewLoc or mAnchorViewSize is unavailable");
    }

    @Override // com.huawei.openalliance.ad.activity.c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
        ex.V("BaseDialogActivity", "finish");
        RelativeLayout relativeLayout = this.F;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(4);
        }
    }

    public final void g() {
        try {
            this.I = new d();
            registerReceiver(this.I, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"), "android.permission.WRITE_SECURE_SETTINGS", null);
            IntentFilter intentFilter = new IntentFilter("com.huawei.intent.action.CLICK_STATUSBAR");
            if (getBaseContext() != null) {
                registerReceiver(this.I, intentFilter, "huawei.permission.CLICK_STATUSBAR_BROADCAST", null);
            }
            a0.a.u(this, bi.B, this);
        } catch (Throwable th) {
            ex.I("BaseDialogActivity", "registerReceiver error: %s", th.getClass().getSimpleName());
        }
    }

    public int i() {
        return 0;
    }

    public final void k() {
        if (!d(this.f21952w) && !d(this.f21953x)) {
            ViewGroup.LayoutParams layoutParams = this.G.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] iArr = this.f21952w;
                layoutParams2.width = iArr[0];
                layoutParams2.height = iArr[1];
                this.G.setLayoutParams(layoutParams2);
            }
            ViewGroup.LayoutParams layoutParams3 = this.H.getLayoutParams();
            if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                int[] iArr2 = this.f21953x;
                layoutParams4.width = iArr2[0];
                layoutParams4.height = iArr2[1];
                this.H.setLayoutParams(layoutParams4);
                return;
            }
            return;
        }
        ex.I("BaseDialogActivity", "mAnchorViewLoc or mAnchorViewSize is unavailable");
    }

    public final void l() {
        ImageView imageView;
        float f;
        if (!d(this.f21952w) && !d(this.f21953x)) {
            int i10 = r0.i(this, 36.0f);
            int i11 = this.f21948s;
            int i12 = (this.f21949t - i11) - i10;
            int i13 = (this.f21952w[0] + (this.f21953x[0] >> 1)) - (i10 >> 1);
            if (i13 >= i11) {
                i11 = i13;
            }
            if (i11 <= i12) {
                i12 = i11;
            }
            if (u.k()) {
                imageView = this.E;
                f = -i12;
            } else {
                imageView = this.E;
                f = i12;
            }
            imageView.setX(f);
            return;
        }
        ex.I("BaseDialogActivity", "mAnchorViewLoc or mAnchorViewSize is unavailable");
    }

    @Override // com.huawei.openalliance.ad.activity.c, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        finish();
    }

    @Override // com.huawei.openalliance.ad.activity.c, android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            requestWindowFeature(1);
            setContentView(i());
            K = getApplicationContext();
            h();
            if (!a()) {
                ex.I("BaseDialogActivity", "getIntentExtra return false");
                j();
                finish();
                return;
            }
            Window window = getWindow();
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            getWindow().addFlags(134217728);
            c();
            if (Build.VERSION.SDK_INT >= 29) {
                this.F.setForceDarkAllowed(false);
            }
            g();
            e();
            k();
            l();
            f();
        } catch (Throwable th) {
            ex.I("BaseDialogActivity", "onCreate ex: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.activity.c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            d dVar = this.I;
            if (dVar != null) {
                unregisterReceiver(dVar);
            }
            a0.a.t(this, bi.B);
        } catch (Throwable th) {
            ex.I("BaseDialogActivity", "unRegisterFeedbackReceiver: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.msgnotify.NotifyCallback
    public final void onMessageNotify(String str, Intent intent) {
        if (!TextUtils.isEmpty(str) && intent != null) {
            ex.Code("BaseDialogActivity", "onMessageNotify msgName:%s", str);
            try {
                String action = intent.getAction();
                ex.V("BaseDialogActivity", "FeedbackEventReceiver action = %s", action);
                if ("com.huawei.ads.feedback.action.ANCHOR_LOCATION_CHANGE".equals(action) || "com.huawei.ads.feedback.action.FINISH_FEEDBACK_ACTIVITY".equals(action)) {
                    w.b(new RunnableC0284a());
                    return;
                }
                return;
            } catch (Throwable th) {
                i.q(th, "error: ", "BaseDialogActivity");
                return;
            }
        }
        ex.V("BaseDialogActivity", "msgName or msgData is empty!");
    }

    public void c() {
    }

    public void f() {
    }

    public void j() {
    }
}
