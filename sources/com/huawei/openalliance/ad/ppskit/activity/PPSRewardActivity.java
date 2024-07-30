package com.huawei.openalliance.ad.ppskit.activity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.transition.n;
import com.hamkho.livefoot.R;
import com.huawei.hag.abilitykit.api.KitSdkManager;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.constant.bi;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.GlobalShareData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.inter.data.RewardEvent;
import com.huawei.openalliance.ad.ppskit.msgnotify.PersistentMessageCenter;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.p0;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import com.huawei.openalliance.ad.ppskit.views.PPSRewardView;
import com.huawei.openalliance.ad.ppskit.views.f0;
import com.huawei.openalliance.ad.ppskit.views.g0;
import com.huawei.openalliance.ad.ppskit.views.h0;
import j7.r;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import ka.Cif;
import ka.jj;
import ka.n7;
import ka.oc;
import ka.r4;
import la.x;

/* loaded from: classes2.dex */
public class PPSRewardActivity extends PPSBaseActivity {
    public String A;
    public GlobalShareData D;
    public String E;
    public p0 H;
    public String J;

    /* renamed from: u, reason: collision with root package name */
    public PPSRewardView f22398u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f22399v;

    /* renamed from: w, reason: collision with root package name */
    public ContentRecord f22400w;

    /* renamed from: x, reason: collision with root package name */
    public ua.b f22401x;
    public String y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f22402z = false;
    public boolean B = false;
    public boolean C = false;
    public int F = 1;
    public boolean G = true;
    public boolean I = true;

    /* loaded from: classes2.dex */
    public class a implements Callable<ContentRecord> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f22403a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f22404b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f22405c;

        public a(String str, String str2, String str3) {
            this.f22403a = str;
            this.f22404b = str2;
            this.f22405c = str3;
        }

        @Override // java.util.concurrent.Callable
        public final ContentRecord call() {
            return r.l(PPSRewardActivity.this, this.f22403a, this.f22404b, this.f22405c);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSRewardActivity pPSRewardActivity = PPSRewardActivity.this;
            pPSRewardActivity.getClass();
            d2.a(new x(pPSRewardActivity));
            PPSRewardView pPSRewardView = pPSRewardActivity.f22398u;
            if (pPSRewardView != null) {
                pPSRewardView.X();
            }
            GlobalShareData globalShareData = pPSRewardActivity.D;
            synchronized (r4.f31738c) {
                if (globalShareData == null) {
                    n7.b("GlobalDataShare", "set contentRecord null");
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSRewardView pPSRewardView = PPSRewardActivity.this.f22398u;
            if (pPSRewardView != null) {
                pPSRewardView.W();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSRewardView pPSRewardView = PPSRewardActivity.this.f22398u;
            if (pPSRewardView != null) {
                pPSRewardView.getClass();
                d2.a(new f0(pPSRewardView));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSRewardView pPSRewardView = PPSRewardActivity.this.f22398u;
            if (pPSRewardView != null) {
                pPSRewardView.I0 = null;
                d2.a(new g0(pPSRewardView));
                PersistentMessageCenter persistentMessageCenter = PersistentMessageCenter.getInstance();
                String packageName = pPSRewardView.f23268x.getPackageName();
                persistentMessageCenter.getClass();
                if (!TextUtils.isEmpty(packageName) && !TextUtils.isEmpty("com.huawei.hms.pps.action.OPEN_IN_ADREWARD")) {
                    synchronized (persistentMessageCenter.f22706a) {
                        String str = packageName + "_com.huawei.hms.pps.action.OPEN_IN_ADREWARD";
                        n7.e("PersistentMessageCenter", "unregister notify: " + str);
                        Set set = (Set) persistentMessageCenter.f22707b.get(str);
                        if (set != null) {
                            set.remove(pPSRewardView);
                            if (set.isEmpty()) {
                                persistentMessageCenter.f22707b.remove(str);
                            }
                        }
                    }
                }
            }
            PPSRewardActivity.this.f22400w = null;
            synchronized (r4.f31738c) {
                n7.b("GlobalDataShare", "set contentRecord null");
            }
            PPSRewardActivity.l(PPSRewardActivity.this, 7, 0, 0);
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSRewardActivity pPSRewardActivity = PPSRewardActivity.this;
            if (!pPSRewardActivity.f22402z) {
                PPSRewardView pPSRewardView = pPSRewardActivity.f22398u;
                if (pPSRewardView != null) {
                    RewardEvent rewardEvent = RewardEvent.CLOSE;
                    pPSRewardView.getClass();
                    d2.a(new h0(pPSRewardView, rewardEvent));
                    return;
                }
                return;
            }
            PPSRewardActivity.l(pPSRewardActivity, 4, -1, -1);
            PPSRewardActivity.super.onBackPressed();
        }
    }

    /* loaded from: classes2.dex */
    public class g implements DialogInterface.OnClickListener {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f22412s;

        public g(int i10) {
            this.f22412s = i10;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            p0 p0Var = PPSRewardActivity.this.H;
            if (p0Var != null) {
                if (this.f22412s == 11) {
                    p0Var.d(false, true);
                } else {
                    p0Var.i(false, true);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class h implements DialogInterface.OnClickListener {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f22414s;

        public h(int i10) {
            this.f22414s = i10;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            PPSRewardActivity pPSRewardActivity = PPSRewardActivity.this;
            intent.setData(Uri.fromParts(WiseOpenHianalyticsData.UNION_PACKAGE, pPSRewardActivity.getPackageName(), null));
            pPSRewardActivity.startActivity(intent);
            dialogInterface.dismiss();
            p0 p0Var = pPSRewardActivity.H;
            if (p0Var != null) {
                if (this.f22414s == 11) {
                    p0Var.d(false, false);
                } else {
                    p0Var.i(false, false);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class i implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final Context f22416s;

        public i(Context context) {
            this.f22416s = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.huawei.openalliance.ad.ppskit.handlers.x.i()) {
                n7.f("PPSRewardActivity", "init abilitySDK retCode is %s", Integer.valueOf(KitSdkManager.getInstance().initSync(this.f22416s)));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class j implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final Context f22417s;

        public j(Context context) {
            this.f22417s = context.getApplicationContext();
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.huawei.openalliance.ad.ppskit.utils.g.h(this.f22417s);
        }
    }

    /* loaded from: classes2.dex */
    public class k implements va.b {
        public k() {
        }
    }

    /* loaded from: classes2.dex */
    public class l implements va.d {
        public l() {
        }
    }

    /* loaded from: classes2.dex */
    public class m implements va.e {
        public m() {
        }
    }

    public static void l(PPSRewardActivity pPSRewardActivity, int i10, int i11, int i12) {
        pPSRewardActivity.getClass();
        Intent intent = new Intent("com.huawei.hms.pps.action.PPS_REWARD_STATUS_CHANGED");
        intent.setPackage(pPSRewardActivity.A);
        intent.putExtra("reward_ad_status", i10);
        ContentRecord contentRecord = pPSRewardActivity.f22400w;
        if (contentRecord != null) {
            intent.putExtra(ba.f22057e, contentRecord.j2());
        }
        if (6 == i10) {
            intent.putExtra("reward_ad_error", i11);
            intent.putExtra("reward_ad_extra", i12);
        }
        if (d0.m(pPSRewardActivity)) {
            pPSRewardActivity.sendBroadcast(intent);
        } else {
            n.B(pPSRewardActivity, pPSRewardActivity.A, bi.Code, intent);
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final void b() {
        setContentView(R.layout.hiad_activity_reward);
        this.f22387s = (ViewGroup) findViewById(R.id.hiad_reward_view);
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public String d() {
        return "PPSRewardActivity";
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final void e() {
        ViewGroup viewGroup = this.f22387s;
        if (viewGroup != null) {
            ((ViewGroup) viewGroup.getParent()).removeView(this.f22387s);
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final void g() {
        String t02;
        int i10 = 0;
        try {
            String f10 = f();
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra("content_id");
            String stringExtra2 = intent.getStringExtra("slotid");
            String stringExtra3 = intent.getStringExtra("request_id");
            String stringExtra4 = intent.getStringExtra(ba.f22057e);
            String stringExtra5 = intent.getStringExtra(ba.N);
            String stringExtra6 = intent.getStringExtra(ba.O);
            this.E = intent.getStringExtra("sdk_version");
            this.F = intent.getIntExtra(ba.f22060i, 1);
            this.G = getIntent().getBooleanExtra(ba.f22061j, true);
            this.I = getIntent().getBooleanExtra(ba.J, true);
            if (intent.hasExtra("unique_id")) {
                this.J = getIntent().getStringExtra("unique_id");
            }
            ContentRecord contentRecord = (ContentRecord) c5.e.e(new a(f10, stringExtra, stringExtra2));
            this.f22400w = contentRecord;
            if (contentRecord != null) {
                contentRecord.t3(f10);
                this.f22400w.B(this.E);
                this.f22400w.D(stringExtra3);
                this.f22400w.V1(stringExtra4);
                this.f22400w.i2(c(intent));
                this.f22400w.o2(this.I);
                this.f22400w.Y(stringExtra5);
                this.f22400w.b0(stringExtra6);
                AppInfo j02 = this.f22400w.j0();
                if (j02 != null) {
                    j02.c0(this.J);
                    this.f22400w.E0(j02);
                }
                this.y = this.f22400w.h1();
                this.f22401x = new ua.b(AdContentData.f(this, this.f22400w), this.y);
                jj a10 = jj.a();
                int p10 = p();
                a10.f31350a = p10;
                a10.f31352c = p10;
                jj a11 = jj.a();
                int m10 = m(this.f22400w);
                a11.f31351b = m10;
                a11.f31353d = m10;
            }
            this.A = f10;
            this.D = new GlobalShareData(stringExtra, this.E, f10);
            this.B = getIntent().getBooleanExtra("reward_key_nonwifi_action_play", false);
            this.C = getIntent().getBooleanExtra("reward_key_nonwifi_action_download", false);
        } catch (Throwable unused) {
            n7.g(d(), "fail to get contentRecord");
            n7.a();
            finish();
        }
        try {
            if (this.f22400w == null) {
                n7.g(d(), "reward ad is null, finish, this should not happen");
                finish();
                return;
            }
            n7.e(d(), "begin to init reward");
            if (this.f22400w.X1() == null) {
                t02 = "1";
            } else {
                t02 = this.f22400w.X1().t0();
            }
            if (!"2".equals(t02)) {
                i10 = 1;
            }
            setRequestedOrientation(i10);
            z1.q(this, i10);
            PPSRewardView pPSRewardView = (PPSRewardView) findViewById(R.id.hiad_reward_view);
            this.f22398u = pPSRewardView;
            pPSRewardView.setOrientation(i10);
            PPSRewardView pPSRewardView2 = this.f22398u;
            m mVar = new m();
            oc ocVar = pPSRewardView2.y;
            if (ocVar != null) {
                ocVar.f31609x = mVar;
            }
            pPSRewardView2.f23270z = mVar;
            pPSRewardView2.I0 = new l();
            pPSRewardView2.C(new k());
            this.f22398u.D(this.f22400w, this.A, this.E, this.F, this.G);
            this.H = this.f22398u.getAppointJs();
            Resources resources = getResources();
            if (resources != null) {
                if (resources.getConfiguration() != null) {
                    this.f22399v = Integer.valueOf(resources.getConfiguration().screenWidthDp);
                }
                onConfigurationChanged(resources.getConfiguration());
            }
        } catch (Throwable th) {
            n7.g(d(), "onCreate ex: ".concat(th.getClass().getSimpleName()));
            n7.a();
            finish();
        }
    }

    public final void k(int i10, int i11) {
        new AlertDialog.Builder(this).setTitle(R.string.hiad_calender_permission_dialog).setMessage(i11).setPositiveButton(R.string.hiad_calender_set, new h(i10)).setNegativeButton(R.string.hiad_dialog_cancel, new g(i10)).show();
    }

    public final int m(ContentRecord contentRecord) {
        Integer q10;
        try {
            int d10 = (int) this.f22401x.d();
            Map<String, String> T0 = contentRecord.T0();
            int i10 = 90;
            if (T0 != null) {
                String str = T0.get("rwdCloseShowTm");
                if (str != null && str.trim().length() != 0 && (q10 = y1.q(str)) != null && q10.intValue() >= 0 && q10.intValue() <= 100) {
                    i10 = q10.intValue();
                }
                n7.e("PPSRewardActivity", "Reward close button input string is " + str);
            }
            return Math.min(((d10 * i10) / 100) / 1000, 27);
        } catch (Throwable th) {
            n7.j("PPSRewardActivity", "get reward close show time exception: %s", th.getClass().getSimpleName());
            return 0;
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onBackPressed() {
        d2.a(new f());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (r0 != null) goto L27;
     */
    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity, android.content.ComponentCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onConfigurationChanged(android.content.res.Configuration r8) {
        /*
            r7 = this;
            java.lang.String r0 = "SystemUtil"
            r1 = 0
            java.lang.String r2 = "com.huawei.android.dynamicfeature.plugin.language.LanguagePlugin"
            java.lang.String r3 = "createInstance "
            java.lang.String r4 = "ReflectAPI"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L12 java.lang.ClassNotFoundException -> L14
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.Throwable -> L12 java.lang.ClassNotFoundException -> L14
            goto L25
        L12:
            r2 = move-exception
            goto L15
        L14:
            r2 = move-exception
        L15:
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = r2.getSimpleName()     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = r3.concat(r2)     // Catch: java.lang.Throwable -> L40
            ka.n7.g(r4, r2)     // Catch: java.lang.Throwable -> L40
            r2 = 0
        L25:
            if (r2 != 0) goto L2a
            java.lang.String r2 = "cannot get languagePlugin."
            goto L3c
        L2a:
            java.lang.String r3 = "activityInit"
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L40
            java.lang.Class<android.app.Activity> r6 = android.app.Activity.class
            r5[r1] = r6     // Catch: java.lang.Throwable -> L40
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L40
            r6[r1] = r7     // Catch: java.lang.Throwable -> L40
            androidx.transition.n.s(r2, r3, r5, r6, r4)     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "reload lang when screen changed."
        L3c:
            ka.n7.e(r0, r2)     // Catch: java.lang.Throwable -> L40
            goto L45
        L40:
            java.lang.String r2 = "reload lang error."
            ka.n7.e(r0, r2)
        L45:
            if (r8 != 0) goto L48
            return
        L48:
            super.onConfigurationChanged(r8)
            int r0 = r8.uiMode
            r0 = r0 & 48
            java.lang.String r2 = r7.d()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "currentNightMode="
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            ka.n7.e(r2, r3)
            r2 = 32
            r3 = 29
            if (r2 != r0) goto L7d
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L8c
            com.huawei.openalliance.ad.ppskit.views.PPSRewardView r0 = r7.f22398u
            if (r0 == 0) goto L8c
            android.webkit.WebSettings r0 = r0.getWebViewSettings()
            if (r0 == 0) goto L8c
            r1 = 2
        L79:
            f3.e.n(r0, r1)
            goto L8c
        L7d:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L8c
            com.huawei.openalliance.ad.ppskit.views.PPSRewardView r0 = r7.f22398u
            if (r0 == 0) goto L8c
            android.webkit.WebSettings r0 = r0.getWebViewSettings()
            if (r0 == 0) goto L8c
            goto L79
        L8c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onConfigurationChanged newConfig.screenWidthDp="
            r0.<init>(r1)
            int r1 = r8.screenWidthDp
            r0.append(r1)
            java.lang.String r1 = ", this.screenWidthDp="
            r0.append(r1)
            java.lang.Integer r1 = r7.f22399v
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "PPSRewardActivity"
            ka.n7.b(r1, r0)
            java.lang.Integer r0 = r7.f22399v
            if (r0 == 0) goto Lb7
            int r2 = r8.screenWidthDp
            int r0 = r0.intValue()
            if (r2 == r0) goto Lcc
        Lb7:
            java.lang.String r0 = "onConfigurationChanged resetButtonWidth()"
            ka.n7.b(r1, r0)
            int r8 = r8.screenWidthDp
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.f22399v = r8
            la.x r8 = new la.x
            r8.<init>(r7)
            com.huawei.openalliance.ad.ppskit.utils.d2.a(r8)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.activity.PPSRewardActivity.onConfigurationChanged(android.content.res.Configuration):void");
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity, com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (!Cif.c(this)) {
            getWindow().getDecorView().setSystemUiVisibility(5380);
        }
        z1.Q(this);
        super.onCreate(bundle);
        n7.e(d(), "onCreate");
        g();
        j();
        p2.a(new j(this), 0);
        p2.a(new i(getApplicationContext()), 1);
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        d2.a(new e());
        jj.a().f31354e.clear();
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onPause() {
        d2.a(new c());
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        int i11;
        n7.c("PPSRewardActivity", "requestPermissions, result= %s", Arrays.toString(iArr));
        if (i10 == 11 || i10 == 12) {
            if (iArr.length > 1 && iArr[0] == 0 && iArr[1] == 0) {
                p0 p0Var = this.H;
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
                p0 p0Var2 = this.H;
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
            k(i10, i11);
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onResume() {
        d2.a(new b());
        super.onResume();
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        d2.a(new d());
    }

    public final int p() {
        int i10;
        try {
            int d10 = (int) this.f22401x.d();
            com.huawei.openalliance.ad.ppskit.handlers.l d11 = com.huawei.openalliance.ad.ppskit.handlers.l.d(this);
            String str = this.y;
            synchronized (d11.f22585a) {
                i10 = d11.G(str).getInt("reward_gain_time_percent", 90);
            }
            int i11 = ((i10 * d10) / 100) / 1000;
            if (i11 <= 0) {
                i11 = ((d10 * 90) / 100) / 1000;
            }
            return Math.min(i11, 27);
        } catch (Throwable th) {
            n7.j("PPSRewardActivity", "get reward gain time exception: %s", th.getClass().getSimpleName());
            return 0;
        }
    }
}
