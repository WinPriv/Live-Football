package com.huawei.openalliance.ad.ppskit.activity;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.Toast;
import androidx.transition.n;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.es;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.constant.bi;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.annotations.OuterVisible;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.download.app.AppStatus;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import com.huawei.openalliance.ad.ppskit.handlers.l;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo;
import com.huawei.openalliance.ad.ppskit.linked.view.LinkedLandVideoView;
import com.huawei.openalliance.ad.ppskit.linked.view.LinkedLandView;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.i2;
import com.huawei.openalliance.ad.ppskit.utils.o2;
import com.huawei.openalliance.ad.ppskit.utils.p0;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.q2;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import com.huawei.openalliance.ad.ppskit.views.AppDownloadButton;
import com.huawei.openalliance.ad.ppskit.views.CustomEmuiActionBar;
import com.huawei.openalliance.ad.ppskit.views.PPSAppDetailView;
import com.huawei.openalliance.ad.ppskit.views.PPSExpandButtonDetailView;
import com.huawei.openalliance.ad.ppskit.views.PPSRewardPopUpView;
import com.huawei.openalliance.ad.ppskit.views.PPSWebView;
import com.huawei.openalliance.ad.ppskit.views.VideoView;
import com.huawei.openalliance.ad.ppskit.views.linkscroll.LinkScrollWebView;
import j7.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import ka.Cif;
import ka.e7;
import ka.jc;
import ka.ke;
import ka.l7;
import ka.n7;
import ka.oh;
import ka.p9;
import ka.ph;
import ka.qa;
import ka.v;
import ka.vf;
import ka.wi;
import ka.x3;
import ka.xi;
import ka.zh;
import la.m;
import la.o;
import la.p;
import la.q;

@OuterVisible
/* loaded from: classes2.dex */
public class PPSActivity extends PPSBaseActivity implements qa, CustomEmuiActionBar.a {

    /* renamed from: i0, reason: collision with root package name */
    public static final /* synthetic */ int f22351i0 = 0;
    public ClipboardManager A;
    public l B;
    public Boolean C;
    public PopupMenu D;
    public PPSAppDetailView E;
    public Integer F;
    public PPSExpandButtonDetailView G;
    public LinearLayout H;
    public v I;
    public AppInfo J;
    public j K;
    public Handler L;
    public p0 M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public boolean R;
    public PPSRewardPopUpView Y;

    /* renamed from: c0, reason: collision with root package name */
    public AppDownloadButton f22352c0;

    /* renamed from: d0, reason: collision with root package name */
    public String f22353d0;

    /* renamed from: e0, reason: collision with root package name */
    public long f22354e0;

    /* renamed from: f0, reason: collision with root package name */
    public q2 f22355f0;

    /* renamed from: g0, reason: collision with root package name */
    public ph f22356g0;

    /* renamed from: h0, reason: collision with root package name */
    public final a f22357h0;

    /* renamed from: v, reason: collision with root package name */
    public Context f22359v;

    /* renamed from: w, reason: collision with root package name */
    public PPSWebView f22360w;

    /* renamed from: x, reason: collision with root package name */
    public e7 f22361x;
    public ActionBar y;

    /* renamed from: z, reason: collision with root package name */
    public ContentRecord f22362z;

    /* renamed from: u, reason: collision with root package name */
    public final jc f22358u = new jc();
    public int S = 0;
    public final l7 T = new l7();
    public boolean U = false;
    public boolean V = false;
    public String W = null;
    public String X = null;
    public boolean Z = false;

    /* loaded from: classes2.dex */
    public class a implements xi {

        /* renamed from: com.huawei.openalliance.ad.ppskit.activity.PPSActivity$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0288a implements Runnable {
            public RunnableC0288a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                PPSActivity.u(PPSActivity.this, true);
            }
        }

        public a() {
        }

        @Override // ka.xi
        public final void a(wi wiVar) {
            Integer num = wiVar.f32151e;
            if (num == null) {
                n7.g("PPSActivity", "click action invalid");
                return;
            }
            int intValue = num.intValue();
            n7.f("PPSActivity", "click action: %d", Integer.valueOf(intValue));
            if (intValue == 1) {
                d2.a(new RunnableC0288a());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Callable<ContentRecord> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f22365a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f22366b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Intent f22367c;

        public b(String str, String str2, Intent intent) {
            this.f22365a = str;
            this.f22366b = str2;
            this.f22367c = intent;
        }

        @Override // java.util.concurrent.Callable
        public final ContentRecord call() {
            return r.o(PPSActivity.this, this.f22365a, this.f22366b, this.f22367c);
        }
    }

    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            n7.e("PPSActivity", "onClose");
            PPSActivity.this.finishAndRemoveTask();
        }
    }

    /* loaded from: classes2.dex */
    public class d implements PPSWebView.f {
        public d() {
        }
    }

    /* loaded from: classes2.dex */
    public class e {
    }

    /* loaded from: classes2.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSWebView pPSWebView = PPSActivity.this.f22360w;
            if (pPSWebView != null) {
                pPSWebView.n();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSWebView pPSWebView = PPSActivity.this.f22360w;
            if (pPSWebView != null) {
                pPSWebView.p();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class h implements Callable<Boolean> {
        public h() {
        }

        @Override // java.util.concurrent.Callable
        public final Boolean call() {
            boolean z10;
            PPSActivity pPSActivity = PPSActivity.this;
            l lVar = pPSActivity.B;
            String str = pPSActivity.N;
            synchronized (lVar.f22585a) {
                z10 = false;
                if (lVar.G(str).getInt("show_landing_page_menu", 0) == 1) {
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    /* loaded from: classes2.dex */
    public static class i implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final WeakReference<PPSActivity> f22374s;

        public i(PPSActivity pPSActivity) {
            this.f22374s = new WeakReference<>(pPSActivity);
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSActivity pPSActivity = this.f22374s.get();
            if (pPSActivity == null) {
                return;
            }
            PPSActivity.u(pPSActivity, false);
        }
    }

    /* loaded from: classes2.dex */
    public class j extends BroadcastReceiver {
        public j() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String d10;
            String str;
            PPSActivity pPSActivity = PPSActivity.this;
            try {
                String action = intent.getAction();
                if (!TextUtils.isEmpty(action) && action.equals("android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
                    String stringExtra = intent.getStringExtra("reason");
                    n7.c(pPSActivity.d(), "systemReason:%s", stringExtra);
                    if (!TextUtils.isEmpty(stringExtra)) {
                        if (stringExtra.equalsIgnoreCase("homekey")) {
                            d10 = pPSActivity.d();
                            str = "closedialog SYSTEM_HOME_KEY";
                        } else if (stringExtra.equalsIgnoreCase("recentapps")) {
                            d10 = pPSActivity.d();
                            str = "closedialog SYSTEM_RECENT_APPS";
                        } else {
                            return;
                        }
                        n7.e(d10, str);
                        PPSActivity.B(pPSActivity);
                    }
                }
            } catch (Throwable th) {
                e0.i.p(th, "onReceive ex: ", pPSActivity.d());
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface k {
    }

    public PPSActivity() {
        new e();
        this.f22357h0 = new a();
    }

    public static void B(PPSActivity pPSActivity) {
        Handler handler = pPSActivity.L;
        if (handler != null) {
            handler.postDelayed(new o(pPSActivity), 300L);
        }
    }

    public static void u(PPSActivity pPSActivity, boolean z10) {
        if (z10) {
            boolean z11 = false;
            Integer q10 = n.q(22, 0, pPSActivity.f22362z.q0());
            if (q10 != null && 1 == q10.intValue()) {
                z11 = true;
            }
            if (!z11) {
                n7.e("PPSActivity", "not allow confirm");
                return;
            }
        }
        AppDownloadButton appDownloadButton = pPSActivity.f22352c0;
        if (appDownloadButton != null && !appDownloadButton.f23091i0 && !pPSActivity.Z && appDownloadButton.getStatus() == AppStatus.DOWNLOAD) {
            pPSActivity.Z = true;
            if (pPSActivity.Y == null) {
                PPSRewardPopUpView pPSRewardPopUpView = new PPSRewardPopUpView(pPSActivity);
                pPSActivity.Y = pPSRewardPopUpView;
                pPSRewardPopUpView.setPopUpClickListener(new la.l(pPSActivity));
                pPSActivity.Y.getDialog().setOnCancelListener(new m(pPSActivity));
            }
            pPSActivity.Y.setAdPopupData(pPSActivity.f22362z);
            pPSActivity.Y.a();
            pPSActivity.v("127");
        }
    }

    public final void A() {
        boolean z10;
        ContentRecord contentRecord = this.f22362z;
        boolean z11 = false;
        if (contentRecord != null && this.J != null) {
            Integer q10 = n.q(9, 0, contentRecord.q0());
            if (q10 != null && 1 != q10.intValue()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                z11 = true;
            }
        }
        String d10 = d();
        if (z11) {
            n7.e(d10, "auto download app");
            AppDownloadButton appDownloadButton = this.f22352c0;
            if (appDownloadButton != null) {
                appDownloadButton.setSdkVersion(this.O);
                this.f22352c0.setCallerPackageName(this.N);
                if (AppStatus.DOWNLOAD == this.f22352c0.getStatus()) {
                    this.f22352c0.setSource(15);
                    this.f22352c0.performClick();
                    return;
                }
                return;
            }
            n7.g(d(), "there is no download button");
            return;
        }
        n7.e(d10, "do not auto download app");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0183, code lost:
    
        if (r3 != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C() {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.activity.PPSActivity.C():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            r7 = this;
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r0 = r7.f22362z
            java.lang.String r0 = r0.q0()
            int r0 = androidx.transition.n.f0(r0)
            r1 = 2
            r2 = 0
            r3 = 1
            java.lang.String r4 = "PPSActivity"
            if (r0 == r1) goto L29
            java.lang.Object[] r0 = new java.lang.Object[r3]
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r1 = r7.f22362z
            java.lang.String r1 = r1.q0()
            int r1 = androidx.transition.n.f0(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "no need popup strategy %s."
            ka.n7.c(r4, r1, r0)
            return
        L29:
            com.huawei.openalliance.ad.ppskit.inter.data.AppInfo r0 = r7.J
            if (r0 == 0) goto Lb2
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r0 = r7.f22362z
            java.lang.String r0 = r0.f1()
            if (r0 != 0) goto L37
            goto Lb2
        L37:
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r0 = r7.f22362z
            if (r0 == 0) goto L59
            com.huawei.openalliance.ad.ppskit.inter.data.AppInfo r1 = r7.J
            if (r1 == 0) goto L59
            java.lang.String r0 = r0.q0()
            r1 = 9
            java.lang.Integer r0 = androidx.transition.n.q(r1, r2, r0)
            if (r0 == 0) goto L54
            int r0 = r0.intValue()
            if (r3 != r0) goto L52
            goto L54
        L52:
            r0 = r2
            goto L55
        L54:
            r0 = r3
        L55:
            if (r0 == 0) goto L59
            r0 = r3
            goto L5a
        L59:
            r0 = r2
        L5a:
            if (r0 == 0) goto L62
            java.lang.String r0 = "no need popup auto download."
            ka.n7.b(r4, r0)
            return
        L62:
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r0 = r7.f22362z
            java.lang.String r0 = r0.f1()
            java.lang.String r1 = "1"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L84
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r0 = r7.f22362z
            java.lang.String r0 = r0.f1()
            java.lang.String r1 = "2"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L84
            java.lang.String r0 = "landing type no need pop."
            ka.n7.b(r4, r0)
            return
        L84:
            com.huawei.openalliance.ad.ppskit.inter.data.AppInfo r0 = r7.J
            long r0 = r0.x()
            r5 = 0
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            java.lang.Object[] r3 = new java.lang.Object[r3]
            if (r5 >= 0) goto L9e
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3[r2] = r0
            java.lang.String r0 = "delay time error:%s"
            ka.n7.h(r4, r0, r3)
            return
        L9e:
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            r3[r2] = r5
            java.lang.String r2 = "show app download dialog start delayTime %s"
            ka.n7.f(r4, r2, r3)
            com.huawei.openalliance.ad.ppskit.activity.PPSActivity$i r2 = new com.huawei.openalliance.ad.ppskit.activity.PPSActivity$i
            r2.<init>(r7)
            com.huawei.openalliance.ad.ppskit.utils.d2.b(r2, r0)
            return
        Lb2:
            java.lang.String r0 = "app or pageType para error."
            ka.n7.b(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.activity.PPSActivity.D():void");
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final void b() {
        if (!d0.m(this)) {
            setRequestedOrientation(1);
            z1.q(this, 14);
        }
        setContentView(R.layout.pps_activity_landing_page);
        this.f22387s = (ViewGroup) findViewById(R.id.hiad_landing_layout);
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public String d() {
        return "PPSActivity";
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final void e() {
        ViewGroup viewGroup = this.f22387s;
        if (viewGroup != null) {
            ((ViewGroup) viewGroup.getParent()).removeView(this.f22387s);
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public String f() {
        ContentRecord contentRecord;
        if (this.U && (contentRecord = this.f22362z) != null) {
            return contentRecord.h1();
        }
        return super.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0138 A[Catch: all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:18:0x00f9, B:20:0x00fd, B:23:0x010a, B:25:0x0125, B:27:0x012c, B:32:0x0138, B:35:0x016a, B:37:0x018a, B:39:0x0193, B:40:0x019c, B:52:0x013d, B:54:0x0145, B:55:0x014f, B:58:0x0161, B:60:0x0165), top: B:17:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0099  */
    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.activity.PPSActivity.g():void");
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final void h() {
        this.f22362z = null;
    }

    public final boolean k() {
        AppDownloadButton appDownloadButton;
        if (this.f22362z == null || (appDownloadButton = this.f22352c0) == null) {
            return false;
        }
        AppStatus status = appDownloadButton.getStatus();
        if (status != AppStatus.DOWNLOAD && status != AppStatus.INSTALLED) {
            n7.b("PPSActivity", "current app status not support scan animation.");
            return false;
        }
        return true;
    }

    public final boolean l() {
        if (this.C == null) {
            h hVar = new h();
            Boolean bool = Boolean.FALSE;
            int i10 = c5.e.f3284t;
            this.C = (Boolean) c5.e.b(hVar, bool, 1L, TimeUnit.SECONDS);
        }
        return this.C.booleanValue();
    }

    public final void m() {
        e7 e7Var = this.f22361x;
        if (e7Var != null) {
            n7.b("LinkedLandVideoViewAdapter", "destroy adapter");
            p9 p9Var = e7Var.f31123c;
            if (p9Var instanceof LinkedLandView) {
                LinkedLandView linkedLandView = (LinkedLandView) p9Var;
                linkedLandView.f22668s = null;
                LinkedLandVideoView linkedLandVideoView = linkedLandView.f22669t;
                if (linkedLandVideoView != null) {
                    linkedLandVideoView.a();
                    linkedLandView.f22669t.setLinkedLandView(null);
                    linkedLandView.f22669t.setLinkedNativeAd(null);
                }
                linkedLandView.f22669t = null;
                ArrayList arrayList = linkedLandView.f22670u;
                if (arrayList != null && !arrayList.isEmpty()) {
                    Iterator it = linkedLandView.f22670u.iterator();
                    while (it.hasNext()) {
                        View view = (View) it.next();
                        if (view != null) {
                            view.setOnClickListener(null);
                        }
                    }
                    linkedLandView.setOnClickListener(null);
                }
            }
        }
    }

    public final boolean o() {
        ContentRecord contentRecord = this.f22362z;
        if (contentRecord == null || contentRecord.X1() == null || !"1".equals(this.f22362z.f1()) || !"4".equals(this.f22362z.X1().k())) {
            return false;
        }
        return true;
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        if (configuration == null) {
            return;
        }
        boolean U = z1.U(getApplicationContext());
        super.onConfigurationChanged(configuration);
        int i11 = configuration.uiMode & 48;
        n7.e("PPSActivity", "currentNightMode=" + i11);
        if (32 != i11 && !U) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        q(i10);
        n7.b("PPSActivity", "onConfigurationChanged newConfig.screenWidthDp=" + configuration.screenWidthDp + ", this.screenWidthDp=" + this.F);
        Integer num = this.F;
        if (num == null || configuration.screenWidthDp != num.intValue()) {
            n7.b("PPSActivity", "onConfigurationChanged resetButtonWidth()");
            this.F = Integer.valueOf(configuration.screenWidthDp);
            d2.a(new la.i(this));
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity, com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        if (d0.l() < 3 && !Cif.f(this)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            setTheme(R.style.HiAdThemeNoActionBar);
        }
        z1.Q(this);
        if (n7.d()) {
            n7.b("PPSActivity", "onCreate");
        }
        ph phVar = new ph(getApplicationContext());
        this.f22356g0 = phVar;
        p2.a(new oh(phVar), 0);
        super.onCreate(bundle);
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onCreateOptionsMenu(android.view.Menu r5) {
        /*
            r4 = this;
            r0 = 0
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r1 = r4.f22362z     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L6
            return r0
        L6:
            com.huawei.openalliance.ad.ppskit.inter.data.AppInfo r1 = r4.J     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L1b
            boolean r1 = r1.d0()     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L1b
            android.view.MenuInflater r1 = r4.getMenuInflater()     // Catch: java.lang.Throwable -> L65
            r2 = 2131689473(0x7f0f0001, float:1.9007962E38)
            r1.inflate(r2, r5)     // Catch: java.lang.Throwable -> L65
            goto L25
        L1b:
            android.view.MenuInflater r1 = r4.getMenuInflater()     // Catch: java.lang.Throwable -> L65
            r2 = 2131689474(0x7f0f0002, float:1.9007964E38)
            r1.inflate(r2, r5)     // Catch: java.lang.Throwable -> L65
        L25:
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r1 = r4.f22362z     // Catch: java.lang.Throwable -> L65
            r2 = 1
            if (r1 == 0) goto L3a
            com.huawei.openalliance.ad.ppskit.inter.data.AppInfo r3 = r4.J     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L3a
            java.lang.String r1 = r1.g1()     // Catch: java.lang.Throwable -> L65
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L3a
            r1 = r2
            goto L3b
        L3a:
            r1 = r0
        L3b:
            if (r1 == 0) goto L49
            r1 = 2131362666(0x7f0a036a, float:1.834512E38)
            android.view.MenuItem r5 = r5.findItem(r1)     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L49
            r5.setVisible(r2)     // Catch: java.lang.Throwable -> L65
        L49:
            boolean r5 = r4.l()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L64
            int r5 = com.huawei.openalliance.ad.ppskit.utils.d0.l()     // Catch: java.lang.Throwable -> L65
            r1 = 3
            if (r5 >= r1) goto L5f
            boolean r5 = ka.Cif.f(r4)     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L5d
            goto L5f
        L5d:
            r5 = r0
            goto L60
        L5f:
            r5 = r2
        L60:
            r5 = r5 ^ r2
            if (r5 != 0) goto L64
            r0 = r2
        L64:
            return r0
        L65:
            r5 = move-exception
            java.lang.String r1 = r4.d()
            java.lang.String r2 = "onCreateOptionsMenu ex: "
            e0.i.p(r5, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.activity.PPSActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onDestroy() {
        LinkScrollWebView linkScrollWebView;
        if (n7.d()) {
            n7.b("PPSActivity", "onDestroy");
        }
        super.onDestroy();
        try {
            m();
            PPSWebView pPSWebView = this.f22360w;
            if (pPSWebView != null && (linkScrollWebView = pPSWebView.f23296t) != null) {
                linkScrollWebView.destroy();
            }
            PPSAppDetailView pPSAppDetailView = this.E;
            if (pPSAppDetailView != null) {
                pPSAppDetailView.h();
            }
            PPSExpandButtonDetailView pPSExpandButtonDetailView = this.G;
            if (pPSExpandButtonDetailView != null) {
                pPSExpandButtonDetailView.h();
            }
            j jVar = this.K;
            if (jVar != null) {
                unregisterReceiver(jVar);
                this.K = null;
            }
        } catch (Throwable th) {
            e0.i.p(th, "onDestroy ex: ", d());
        }
        x3 x3Var = this.f22356g0.f31665d;
        if (x3Var != null) {
            try {
                x3Var.e();
            } catch (RemoteException e10) {
                n7.h("RemoteLoader", "onDestroy err: %s", e10.getClass().getSimpleName());
            }
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.CustomEmuiActionBar.a
    public void onMenuBtnClick(View view) {
        boolean z10;
        MenuItem findItem;
        ContextThemeWrapper contextThemeWrapper;
        AppInfo appInfo;
        MenuInflater menuInflater;
        Menu menu;
        int i10;
        int identifier;
        if (this.D == null) {
            try {
                identifier = getResources().getIdentifier("androidhwext:style/Theme.Emui", null, null);
            } catch (RuntimeException unused) {
                n7.g("SystemUtil", "getEMUIAppContext exception");
            }
            if (identifier > 0) {
                contextThemeWrapper = new ContextThemeWrapper(this, identifier);
                this.D = new PopupMenu(contextThemeWrapper, view, 8388613);
                appInfo = this.J;
                if (appInfo == null && appInfo.d0()) {
                    menuInflater = this.D.getMenuInflater();
                    menu = this.D.getMenu();
                    i10 = R.menu.hiad_land_page_expand_menu;
                } else {
                    menuInflater = this.D.getMenuInflater();
                    menu = this.D.getMenu();
                    i10 = R.menu.hiad_land_page_menu;
                }
                menuInflater.inflate(i10, menu);
                this.D.setOnMenuItemClickListener(new la.k(this));
            }
            contextThemeWrapper = this;
            this.D = new PopupMenu(contextThemeWrapper, view, 8388613);
            appInfo = this.J;
            if (appInfo == null) {
            }
            menuInflater = this.D.getMenuInflater();
            menu = this.D.getMenu();
            i10 = R.menu.hiad_land_page_menu;
            menuInflater.inflate(i10, menu);
            this.D.setOnMenuItemClickListener(new la.k(this));
        }
        ContentRecord contentRecord = this.f22362z;
        if (contentRecord != null && this.J != null && !TextUtils.isEmpty(contentRecord.g1())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (findItem = this.D.getMenu().findItem(R.id.hiad_menu_item_privacy_policy)) != null) {
            findItem.setVisible(true);
        }
        this.D.show();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            return y(menuItem);
        } catch (Throwable th) {
            e0.i.p(th, "onOptionsItemSelected ex: ", d());
            return false;
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onPause() {
        VideoView videoView;
        if (n7.d()) {
            n7.b("PPSActivity", "onPause");
        }
        super.onPause();
        ContentRecord contentRecord = this.f22362z;
        if (contentRecord != null && contentRecord.z() == 12) {
            Intent intent = new Intent(es.V);
            if (d0.m(getApplicationContext())) {
                intent.setPackage(this.N);
                getApplicationContext().sendBroadcast(intent);
            } else {
                n.B(getApplicationContext(), this.N, bi.I, intent);
            }
        }
        e7 e7Var = this.f22361x;
        if (e7Var != null) {
            p9 p9Var = e7Var.f31123c;
            if (p9Var instanceof LinkedLandView) {
                LinkedLandVideoView linkedLandVideoView = ((LinkedLandView) p9Var).f22669t;
                if ((linkedLandVideoView instanceof LinkedLandVideoView) && (videoView = linkedLandVideoView.C.f22692v) != null) {
                    videoView.c();
                }
            }
        }
        x3 x3Var = this.f22356g0.f31665d;
        if (x3Var != null) {
            try {
                x3Var.d();
            } catch (RemoteException e10) {
                n7.h("RemoteLoader", "onPause err: %s", e10.getClass().getSimpleName());
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        int i11;
        q2 q2Var;
        int i12;
        q2 q2Var2;
        n7.c("PPSActivity", "requestPermissions, result= %s", Arrays.toString(iArr));
        if (i10 == 21) {
            if (iArr.length > 0 && iArr[0] == 0 && iArr[1] == 0 && (q2Var2 = this.f22355f0) != null) {
                q2Var2.a(0);
            } else if (this.f22355f0 != null) {
                if (shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION") && shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION")) {
                    q2Var = this.f22355f0;
                    i12 = 2;
                } else {
                    q2Var = this.f22355f0;
                    i12 = 3;
                }
                q2Var.a(i12);
            }
        }
        if (i10 == 11 || i10 == 12) {
            if (iArr.length > 1 && iArr[0] == 0 && iArr[1] == 0) {
                p0 p0Var = this.M;
                if (p0Var != null) {
                    if (i10 == 11) {
                        p0Var.d(true, true);
                        return;
                    } else {
                        p0Var.i(true, true);
                        return;
                    }
                }
                return;
            }
            if (shouldShowRequestPermissionRationale("android.permission.WRITE_CALENDAR") && shouldShowRequestPermissionRationale("android.permission.READ_CALENDAR")) {
                p0 p0Var2 = this.M;
                if (p0Var2 != null) {
                    if (i10 == 11) {
                        p0Var2.d(false, true);
                        return;
                    } else {
                        p0Var2.i(false, true);
                        return;
                    }
                }
                return;
            }
            if (i10 == 11) {
                i11 = R.string.hiad_calender_permission_appoint_message;
            } else {
                i11 = R.string.hiad_calender_permission_cancel_message;
            }
            new AlertDialog.Builder(this).setTitle(R.string.hiad_calender_permission_dialog).setMessage(i11).setPositiveButton(R.string.hiad_calender_set, new q(this, i10)).setNegativeButton(R.string.hiad_dialog_cancel, new p(this, i10)).show();
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onResume() {
        LinkedLandVideoView linkedLandVideoView;
        VideoInfo videoInfo;
        if (n7.d()) {
            n7.b("PPSActivity", "onResume");
        }
        super.onResume();
        d2.a(new f());
        e7 e7Var = this.f22361x;
        if (e7Var != null) {
            p9 p9Var = e7Var.f31123c;
            if ((p9Var instanceof LinkedLandView) && (linkedLandVideoView = ((LinkedLandView) p9Var).f22669t) != null && linkedLandVideoView.S != null && (videoInfo = linkedLandVideoView.F) != null && linkedLandVideoView.f22676x) {
                linkedLandVideoView.C.l(videoInfo.getTimeBeforeVideoAutoPlay());
            }
        }
        d2.a(new la.i(this));
        x3 x3Var = this.f22356g0.f31665d;
        if (x3Var != null) {
            try {
                x3Var.c();
            } catch (RemoteException e10) {
                n7.h("RemoteLoader", "onResume err: %s", e10.getClass().getSimpleName());
            }
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onStop() {
        ContentRecord contentRecord;
        Integer q10;
        String string;
        if (n7.d()) {
            n7.b("PPSActivity", "onStop");
        }
        super.onStop();
        d2.a(new g());
        boolean z10 = false;
        if (1 == this.S) {
            String str = this.N;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty("com.huawei.hms.ads.EXSPLASH_DISMISS")) {
                n7.f("ExSplashUtil", "notify %s to %s", "com.huawei.hms.ads.EXSPLASH_DISMISS", str);
                Intent intent = new Intent("com.huawei.hms.ads.EXSPLASH_DISMISS");
                intent.setPackage(str);
                ConfigSpHandler b10 = ConfigSpHandler.b(this);
                synchronized (b10.f22478a) {
                    string = b10.s().getString("exsplash_unique_id", "exsplash_unique_id");
                }
                intent.putExtra("exsplash_unique_id", string);
                sendBroadcast(intent);
                l d10 = l.d(this);
                synchronized (d10.f22585a) {
                    d10.G(str).edit().putInt("exsplash_ad_status", 3).commit();
                }
            }
        }
        if (!isFinishing() && (contentRecord = this.f22362z) != null && (q10 = n.q(18, 0, contentRecord.q0())) != null && 1 == q10.intValue()) {
            z10 = true;
        }
        if (z10) {
            n7.e("PPSActivity", "checkFinish true");
            finish();
        }
    }

    public final boolean p() {
        String str;
        ContentRecord contentRecord = this.f22362z;
        if (contentRecord == null) {
            return false;
        }
        if (contentRecord.M1() && this.f22358u != null) {
            jc.c(this.f22359v, this.f22362z);
            return true;
        }
        Context context = this.f22359v;
        ke keVar = new ke(context, zh.a(this.f22362z.z0(), context), null);
        ContentRecord contentRecord2 = this.f22362z;
        keVar.f31382b = contentRecord2;
        AppInfo j02 = contentRecord2.j0();
        if (j02 == null) {
            str = "appInfo is null";
        } else if (!o2.c(this.f22359v, j02.getPackageName()) && o2.b()) {
            str = "app not installed, need download";
        } else {
            boolean g6 = o2.g(this.f22359v, j02.getPackageName(), j02.getIntentUri());
            if (g6) {
                vf.a aVar = new vf.a();
                aVar.f32023c = "app";
                aVar.f32024d = 2;
                this.f22362z.getClass();
                aVar.f = a0.a.f0(this.f22359v);
                keVar.r(new vf(aVar));
                keVar.i(1, null, "intentSuccess");
            }
            return g6;
        }
        n7.e("PPSActivity", str);
        return false;
    }

    @TargetApi(29)
    public final void q(int i10) {
        PPSWebView pPSWebView;
        WebSettings settings;
        if (Build.VERSION.SDK_INT >= 29 && (pPSWebView = this.f22360w) != null && (settings = pPSWebView.getSettings()) != null) {
            settings.setForceDark(i10);
        }
    }

    public final void r(Context context) {
        if (w.cp.equalsIgnoreCase(context.getPackageName())) {
            this.L = new Handler(Looper.myLooper());
            this.K = new j();
            context.registerReceiver(this.K, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"), "android.permission.WRITE_SECURE_SETTINGS", null);
        }
    }

    public final void s(Uri uri) {
        n7.e("PPSActivity", "intent data not null, parseApiData");
        try {
            String queryParameter = uri.getQueryParameter("cnt");
            String queryParameter2 = uri.getQueryParameter("sig");
            if (!TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter2)) {
                w(queryParameter, queryParameter2);
            }
            n7.f("PPSActivity", "parseApiData finish, isValid: %s", Boolean.valueOf(this.U));
        } catch (Throwable th) {
            n7.h("PPSActivity", "get intent data error: %s", th.getClass().getSimpleName());
        }
    }

    public final void t(WebViewClient webViewClient) {
        PPSWebView pPSWebView = this.f22360w;
        if (pPSWebView != null) {
            pPSWebView.setVmallWebViewClient(webViewClient);
        }
    }

    public final void v(String str) {
        boolean z10 = true;
        char c10 = 65535;
        switch (str.hashCode()) {
            case 48694:
                if (str.equals("127")) {
                    c10 = 0;
                    break;
                }
                break;
            case 48695:
                if (str.equals("128")) {
                    c10 = 1;
                    break;
                }
                break;
            case 48696:
                if (str.equals("129")) {
                    c10 = 2;
                    break;
                }
                break;
            case 48718:
                if (str.equals("130")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
                break;
            default:
                z10 = false;
                break;
        }
        if (z10 && this.I != null) {
            n7.e("PPSActivity", "report Type is ".concat(str));
            this.I.n(this.f22362z, str);
        } else {
            n7.g("PPSActivity", "invalid parameter");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 1185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.activity.PPSActivity.w(java.lang.String, java.lang.String):void");
    }

    public final void x(boolean z10, Intent intent, l7 l7Var) {
        Float A;
        boolean z11;
        n7.c("PPSActivity", "parseLinkedAdConfig, isFromApi: %s", Boolean.valueOf(z10));
        if (l7Var == null) {
            return;
        }
        if (!z10 && intent != null && intent.hasExtra(ba.f22065n)) {
            l7Var.b(intent.getIntExtra(ba.f22065n, 0));
            ContentRecord contentRecord = this.f22362z;
            if (contentRecord != null && ("4".equals(contentRecord.f1()) || o())) {
                l7Var.b(0);
            }
            l7Var.f31407b = intent.getStringExtra(ba.f22064m);
            l7Var.f31408c = intent.getIntExtra(ba.o, 0);
            l7Var.a(intent.getBooleanExtra(ba.f22067q, false));
            l7Var.f31409d = intent.getStringExtra(ba.f22066p);
        } else {
            ContentRecord contentRecord2 = this.f22362z;
            if (contentRecord2 != null) {
                com.huawei.openalliance.ad.ppskit.beans.metadata.VideoInfo h02 = contentRecord2.h0();
                this.f22358u.getClass();
                if (h02 == null || ((A = h02.A()) != null && A.floatValue() < 1.0f)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    n7.e("PPSActivity", "api parse linkedVideo");
                    l7Var.b(10);
                    if (i2.h(this.f22362z) || o()) {
                        l7Var.b(0);
                    }
                    l7Var.f31407b = this.P;
                    l7Var.f31408c = 0;
                    l7Var.a(true);
                    l7Var.f31409d = "y";
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        l7Var.f = f();
    }

    public final boolean y(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.hiad_menu_item_refresh) {
            PPSWebView pPSWebView = this.f22360w;
            if (pPSWebView != null) {
                pPSWebView.q();
            }
            return true;
        }
        if (itemId == R.id.hiad_menu_item_copy_link) {
            ClipData newPlainText = ClipData.newPlainText(com.anythink.expressad.exoplayer.k.o.f9070c, this.f22362z.p3());
            ClipboardManager clipboardManager = this.A;
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(newPlainText);
                Toast.makeText(getApplicationContext(), R.string.hiad_link_already_copied, 1).show();
            }
            return true;
        }
        if (itemId == R.id.hiad_menu_item_open_in_browser) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(this.f22362z.p3() + "#" + System.currentTimeMillis()));
                intent.setFlags(268468224);
                startActivity(intent);
            } catch (Throwable th) {
                e0.i.p(th, "openLinkInBrowser ", "PPSActivity");
            }
            return true;
        }
        if (itemId == R.id.hiad_menu_item_permission) {
            ra.k.a(this, this.J, null);
            return true;
        }
        if (itemId == R.id.hiad_menu_item_privacy_policy) {
            try {
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.VIEW");
                intent2.setData(Uri.parse(this.f22362z.g1() + "#" + System.currentTimeMillis()));
                intent2.setFlags(268468224);
                startActivity(intent2);
            } catch (Throwable th2) {
                e0.i.p(th2, "openPrivacyPolicyInBrowser ", "PPSActivity");
            }
            return true;
        }
        return false;
    }

    public final void z(Intent intent, String str) {
        String stringExtra = intent.getStringExtra("content_id");
        this.O = intent.getStringExtra("sdk_version");
        this.P = intent.getStringExtra(ba.f22057e);
        this.Q = intent.getStringExtra("request_id");
        this.R = intent.getBooleanExtra(ba.f22062k, false);
        if (intent.hasExtra("splash_type")) {
            this.S = intent.getIntExtra("splash_type", 0);
        }
        this.W = intent.getStringExtra(ba.N);
        this.X = intent.getStringExtra(ba.O);
        if (oa.j.b(str, o2.j(this, str))) {
            String stringExtra2 = intent.getStringExtra("contentRecord");
            if (n7.d()) {
                n7.c("PPSActivity", "adcontent from intent:%s", stringExtra2);
            }
            ContentRecord contentRecord = (ContentRecord) y0.o(null, stringExtra2, ContentRecord.class, new Class[0]);
            if (contentRecord != null && !n.M(contentRecord.z1())) {
                this.f22362z = contentRecord;
                contentRecord.t3(str);
                this.V = true;
            }
        }
        if (intent.hasExtra("unique_id")) {
            this.f22353d0 = getIntent().getStringExtra("unique_id");
        }
        if (this.f22362z == null) {
            this.f22362z = (ContentRecord) c5.e.e(new b(str, stringExtra, intent));
        }
        x(this.U, intent, this.T);
    }
}
