package com.huawei.openalliance.ad.ppskit.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
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
import androidx.transition.n;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.constant.bi;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.h;
import com.huawei.openalliance.ad.ppskit.utils.m;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import com.huawei.openalliance.ad.ppskit.views.PPSBaseDialogContentView;
import com.huawei.openalliance.ad.ppskit.views.o1;
import e0.i;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import ka.Cif;
import ka.n7;

/* loaded from: classes2.dex */
public class BaseDialogActivity extends PPSBaseActivity implements xa.a {
    public PPSBaseDialogContentView A;
    public PPSBaseDialogContentView B;
    public PPSBaseDialogContentView C;
    public ImageView D;
    public ImageView E;
    public ImageView F;
    public RelativeLayout G;
    public View H;
    public View I;
    public b J;
    public boolean K = false;

    /* renamed from: u, reason: collision with root package name */
    public int f22321u;

    /* renamed from: v, reason: collision with root package name */
    public int f22322v;

    /* renamed from: w, reason: collision with root package name */
    public int f22323w;

    /* renamed from: x, reason: collision with root package name */
    public int f22324x;
    public int[] y;

    /* renamed from: z, reason: collision with root package name */
    public int[] f22325z;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseDialogActivity.this.finish();
        }
    }

    /* loaded from: classes2.dex */
    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null) {
                n7.e("BaseDialogActivity", "intent is empty");
                return;
            }
            String action = intent.getAction();
            n7.f("BaseDialogActivity", "FeedbackEventReceiver action = %s", action);
            if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(action) || "com.huawei.intent.action.CLICK_STATUSBAR".equals(action) || "com.huawei.ads.feedback.action.ANCHOR_LOCATION_CHANGE".equals(action)) {
                BaseDialogActivity.this.finish();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: s, reason: collision with root package name */
        public final WeakReference<Context> f22328s;

        /* renamed from: t, reason: collision with root package name */
        public final WeakReference<View> f22329t;

        /* renamed from: u, reason: collision with root package name */
        public final int[] f22330u;

        public c(View view, Context context, int[] iArr) {
            this.f22328s = new WeakReference<>(context);
            this.f22329t = new WeakReference<>(view);
            this.f22330u = Arrays.copyOf(iArr, iArr.length);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            int[] iArr;
            try {
                View view = this.f22329t.get();
                Context context = this.f22328s.get();
                if (view != null && context != null && (iArr = this.f22330u) != null) {
                    int[] iArr2 = new int[2];
                    view.getLocationOnScreen(iArr2);
                    int i10 = iArr2[0];
                    if (i10 == 0 && iArr2[1] == 0) {
                        n7.e("BaseDialogActivity", "anchorView onGlobalLayout newLoc[x,y] =0,0");
                        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        return;
                    }
                    if (iArr[0] != i10 || iArr[1] != iArr2[1]) {
                        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        n7.e("BaseDialogActivity", "anchorView location change newLoc[x,y] = " + iArr2[0] + "," + iArr2[1] + "--oldLoc[x,y] = " + iArr[0] + "," + iArr[1]);
                        Intent intent = new Intent("com.huawei.ads.feedback.action.ANCHOR_LOCATION_CHANGE");
                        if (d0.m(context)) {
                            context.sendBroadcast(intent);
                        } else {
                            intent.putExtra(bi.B, true);
                            n.B(context, context.getPackageName(), bi.B, intent);
                        }
                    }
                }
            } catch (Throwable th) {
                i.p(th, "onGlobalLayout error:", "BaseDialogActivity");
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements o1 {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<BaseDialogActivity> f22331a;

        public d(BaseDialogActivity baseDialogActivity) {
            this.f22331a = new WeakReference<>(baseDialogActivity);
        }

        public final void a(int i10) {
            BaseDialogActivity baseDialogActivity = this.f22331a.get();
            if (baseDialogActivity != null && !baseDialogActivity.K) {
                n7.f("BaseDialogActivity", "got safePadding: %s", Integer.valueOf(i10));
                PPSBaseDialogContentView pPSBaseDialogContentView = baseDialogActivity.C;
                if (pPSBaseDialogContentView != null) {
                    int i11 = pPSBaseDialogContentView.f23170z;
                    if (i11 > i10) {
                        pPSBaseDialogContentView.f23170z = i11 - i10;
                    }
                    int i12 = pPSBaseDialogContentView.A;
                    if (i12 > i10) {
                        pPSBaseDialogContentView.A = i12 - i10;
                    }
                    pPSBaseDialogContentView.a();
                }
                if (baseDialogActivity.F != null) {
                    baseDialogActivity.f22321u += i10;
                    baseDialogActivity.u();
                }
                baseDialogActivity.K = true;
            }
        }
    }

    public static boolean k(int[] iArr) {
        if (iArr != null && iArr.length == 2) {
            return false;
        }
        return true;
    }

    private void q() {
        int i10;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowMetrics currentWindowMetrics2;
        Rect bounds2;
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = getWindowManager().getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            this.f22322v = bounds.width();
            currentWindowMetrics2 = getWindowManager().getCurrentWindowMetrics();
            bounds2 = currentWindowMetrics2.getBounds();
            i10 = bounds2.height();
        } else {
            Point point = new Point();
            getWindowManager().getDefaultDisplay().getSize(point);
            this.f22322v = point.x;
            i10 = point.y;
        }
        this.f22323w = i10;
        n7.c("BaseDialogActivity", "initDevicesInfo screenWidth: %s, screenHeight: %s", Integer.valueOf(this.f22322v), Integer.valueOf(this.f22323w));
        this.f22324x = z1.V(this);
        this.f22321u = d0.b(this, 22.0f);
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final String d() {
        return "BaseDialogActivity";
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public void finish() {
        super.finish();
        n7.e("BaseDialogActivity", "finish");
        overridePendingTransition(0, 0);
        RelativeLayout relativeLayout = this.G;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(4);
        }
    }

    public int l() {
        return 0;
    }

    @Override // xa.a
    public final void n(String str, Intent intent) {
        if (!TextUtils.isEmpty(str) && intent != null) {
            n7.c("BaseDialogActivity", "onMessageNotify msgName:%s", str);
            try {
                String action = intent.getAction();
                n7.f("BaseDialogActivity", "FeedbackEventReceiver action = %s", action);
                if ("com.huawei.ads.feedback.action.ANCHOR_LOCATION_CHANGE".equals(action)) {
                    d2.a(new a());
                    return;
                }
                return;
            } catch (Throwable th) {
                i.p(th, "error: ", "BaseDialogActivity");
                return;
            }
        }
        n7.e("BaseDialogActivity", "msgName or msgData is empty!");
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        n7.e("BaseDialogActivity", "onConfigurationChanged");
        super.onConfigurationChanged(configuration);
        finish();
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity, com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            requestWindowFeature(1);
            setContentView(l());
            q();
            if (!p()) {
                n7.g("BaseDialogActivity", "getIntentExtra return false");
                finish();
                return;
            }
            Window window = getWindow();
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            getWindow().addFlags(134217728);
            m();
            if (Build.VERSION.SDK_INT >= 29) {
                this.G.setForceDarkAllowed(false);
            }
            s();
            r();
            t();
            u();
            o();
        } catch (Throwable th) {
            n7.h("BaseDialogActivity", "onCreate ex: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        try {
            b bVar = this.J;
            if (bVar != null) {
                unregisterReceiver(bVar);
            }
            n.R(this);
        } catch (Throwable th) {
            n7.h("BaseDialogActivity", "unRegisterFeedbackReceiver: %s", th.getClass().getSimpleName());
        }
    }

    public boolean p() {
        int i10;
        int identifier;
        try {
            SafeIntent safeIntent = new SafeIntent(getIntent());
            this.y = safeIntent.getIntArrayExtra(ba.as);
            this.f22325z = safeIntent.getIntArrayExtra(ba.at);
            if (!k(this.y) && !k(this.f22325z)) {
                if (z1.D()) {
                    int[] iArr = this.y;
                    int i11 = (this.f22322v - iArr[0]) - this.f22325z[0];
                    iArr[0] = i11;
                    n7.f("BaseDialogActivity", "rtl mAnchorViewLoc[x,y]= %d, %d", Integer.valueOf(i11), Integer.valueOf(this.y[1]));
                }
                if (z1.G(this)) {
                    try {
                        identifier = getResources().getIdentifier("hw_multiwindow_height_of_drag_bar", "dimen", "androidhwext");
                    } catch (Throwable th) {
                        n7.g("SystemUtil", "getMultiWindowDragBarHeight ".concat(th.getClass().getSimpleName()));
                    }
                    if (identifier > 0) {
                        i10 = getResources().getDimensionPixelSize(identifier);
                        int[] iArr2 = this.y;
                        iArr2[1] = iArr2[1] - i10;
                        n7.b("BaseDialogActivity", "windowing mode is freeform");
                        n7.c("BaseDialogActivity", "initDevicesInfo dragBarHeight: %s", Integer.valueOf(i10));
                    }
                    i10 = 0;
                    int[] iArr22 = this.y;
                    iArr22[1] = iArr22[1] - i10;
                    n7.b("BaseDialogActivity", "windowing mode is freeform");
                    n7.c("BaseDialogActivity", "initDevicesInfo dragBarHeight: %s", Integer.valueOf(i10));
                }
                return true;
            }
            n7.g("BaseDialogActivity", "mAnchorViewLoc or mAnchorViewSize is unavailable");
            return false;
        } catch (Throwable th2) {
            n7.h("BaseDialogActivity", "getIntentExtra error: %s", th2.getClass().getSimpleName());
            return false;
        }
    }

    public final void r() {
        boolean z10;
        int i10;
        int i11;
        if (!k(this.y) && !k(this.f22325z)) {
            boolean z11 = true;
            if (this.y[1] + (this.f22325z[1] >> 1) <= (this.f22323w >> 1)) {
                this.A.setVisibility(8);
                this.D.setVisibility(8);
                this.E.setVisibility(0);
                this.C = this.B;
                this.F = this.E;
                boolean K = m.K(this);
                if ("0".equalsIgnoreCase(h.a(this).f22857b) && (1 == (i11 = this.f22324x) || 9 == i11)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!m.L(this) || !m.M(this)) {
                    z11 = false;
                }
                if (K || z10 || z11) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.C.getLayoutParams();
                    int b10 = d0.b(this, 40.0f);
                    Resources resources = getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    if (identifier > 0) {
                        i10 = resources.getDimensionPixelSize(identifier);
                    } else {
                        i10 = 0;
                    }
                    layoutParams.setMargins(0, 0, 0, Math.max(b10, i10));
                    this.C.setLayoutParams(layoutParams);
                    return;
                }
                return;
            }
            this.B.setVisibility(8);
            this.D.setVisibility(0);
            this.E.setVisibility(8);
            this.C = this.A;
            this.F = this.D;
            int a10 = d0.a(this);
            if (Cif.a(this).a(this)) {
                a10 = Math.max(a10, Cif.a(this).e(this.G));
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.C.getLayoutParams();
            layoutParams2.setMargins(0, a10, 0, 0);
            this.C.setLayoutParams(layoutParams2);
            return;
        }
        n7.g("BaseDialogActivity", "mAnchorViewLoc or mAnchorViewSize is unavailable");
    }

    public final void s() {
        try {
            this.J = new b();
            registerReceiver(this.J, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"), "android.permission.WRITE_SECURE_SETTINGS", null);
            IntentFilter intentFilter = new IntentFilter("com.huawei.intent.action.CLICK_STATUSBAR");
            if (getBaseContext() != null) {
                registerReceiver(this.J, intentFilter, "huawei.permission.CLICK_STATUSBAR_BROADCAST", null);
            }
            n.C(this, this);
        } catch (Throwable th) {
            n7.h("BaseDialogActivity", "registerReceiver error: %s", th.getClass().getSimpleName());
        }
    }

    public final void t() {
        if (!k(this.y) && !k(this.f22325z)) {
            ViewGroup.LayoutParams layoutParams = this.H.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] iArr = this.y;
                layoutParams2.width = iArr[0];
                layoutParams2.height = iArr[1];
                this.H.setLayoutParams(layoutParams2);
            }
            ViewGroup.LayoutParams layoutParams3 = this.I.getLayoutParams();
            if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                int[] iArr2 = this.f22325z;
                layoutParams4.width = iArr2[0];
                layoutParams4.height = iArr2[1];
                this.I.setLayoutParams(layoutParams4);
                return;
            }
            return;
        }
        n7.g("BaseDialogActivity", "mAnchorViewLoc or mAnchorViewSize is unavailable");
    }

    public final void u() {
        ImageView imageView;
        float f;
        if (!k(this.y) && !k(this.f22325z)) {
            int b10 = d0.b(this, 36.0f);
            int i10 = this.f22321u;
            int i11 = (this.f22322v - i10) - b10;
            int i12 = (this.y[0] + (this.f22325z[0] >> 1)) - (b10 >> 1);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 <= i11) {
                i11 = i10;
            }
            if (z1.D()) {
                imageView = this.F;
                f = -i11;
            } else {
                imageView = this.F;
                f = i11;
            }
            imageView.setX(f);
            return;
        }
        n7.g("BaseDialogActivity", "mAnchorViewLoc or mAnchorViewSize is unavailable");
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final void b() {
    }

    public void m() {
    }

    public void o() {
    }
}
