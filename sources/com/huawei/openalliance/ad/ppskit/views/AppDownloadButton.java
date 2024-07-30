package com.huawei.openalliance.ad.ppskit.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.ppskit.activity.InterstitialAdActivity;
import com.huawei.openalliance.ad.ppskit.activity.LandingDetailsActivity;
import com.huawei.openalliance.ad.ppskit.beans.metadata.TextState;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.download.app.AppStatus;
import com.huawei.openalliance.ad.ppskit.download.local.AppLocalDownloadTask;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.ppskit.msgnotify.PersistentMessageCenter;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.i2;
import com.huawei.openalliance.ad.ppskit.utils.o2;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import ka.c7;
import ka.fj;
import ka.i5;
import ka.j5;
import ka.k5;
import ka.n7;
import ka.vf;
import ka.z6;
import org.json.JSONException;
import org.json.JSONObject;
import ra.k;
import sa.b;

/* loaded from: classes2.dex */
public class AppDownloadButton extends AppDownBtnContainer implements ta.b {

    /* renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ int f23084o0 = 0;
    public int F;
    public AppInfo G;
    public c1 H;
    public boolean I;
    public k J;
    public l K;
    public i L;
    public AppStatus M;
    public AppStatus N;
    public int O;
    public ContentRecord P;
    public boolean Q;
    public int R;
    public final int S;
    public List<TextState> T;
    public boolean U;
    public String V;
    public Map<String, String> W;

    /* renamed from: c0, reason: collision with root package name */
    public String f23085c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f23086d0;

    /* renamed from: e0, reason: collision with root package name */
    public fj f23087e0;

    /* renamed from: f0, reason: collision with root package name */
    public View.OnClickListener f23088f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f23089g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f23090h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f23091i0;

    /* renamed from: j0, reason: collision with root package name */
    public String f23092j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f23093k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f23094l0;

    /* renamed from: m0, reason: collision with root package name */
    public final int f23095m0;

    /* renamed from: n0, reason: collision with root package name */
    public MaterialClickInfo f23096n0;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppDownloadButton appDownloadButton = AppDownloadButton.this;
            appDownloadButton.l();
            k kVar = appDownloadButton.J;
            if (kVar != null) {
                kVar.a(appDownloadButton.M);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppDownloadButton appDownloadButton = AppDownloadButton.this;
            appDownloadButton.l();
            k kVar = appDownloadButton.J;
            if (kVar != null) {
                kVar.a(appDownloadButton.M);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppDownloadButton appDownloadButton = AppDownloadButton.this;
            appDownloadButton.l();
            k kVar = appDownloadButton.J;
            if (kVar != null) {
                AppStatus appStatus = appDownloadButton.N;
                AppStatus appStatus2 = appDownloadButton.M;
                if (appStatus != appStatus2) {
                    kVar.a(appStatus2);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppDownloadButton appDownloadButton = AppDownloadButton.this;
            appDownloadButton.l();
            k kVar = appDownloadButton.J;
            if (kVar != null) {
                kVar.a(appDownloadButton.M);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23101a;

        static {
            int[] iArr = new int[AppStatus.values().length];
            f23101a = iArr;
            try {
                iArr[AppStatus.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23101a[AppStatus.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23101a[AppStatus.DOWNLOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23101a[AppStatus.INSTALLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23101a[AppStatus.INSTALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23101a[AppStatus.INSTALLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f implements k.b {
        public f() {
        }
    }

    /* loaded from: classes2.dex */
    public interface i {
        CharSequence a(String str);
    }

    /* loaded from: classes2.dex */
    public static class j implements View.OnClickListener {

        /* renamed from: s, reason: collision with root package name */
        public final WeakReference<AppDownloadButton> f23105s;

        public j(AppDownloadButton appDownloadButton) {
            this.f23105s = new WeakReference<>(appDownloadButton);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c7 l10;
            n7.e("AppDownloadButton", "on cancel btn click.");
            AppDownloadButton appDownloadButton = this.f23105s.get();
            if (appDownloadButton != null) {
                n7.e("AppDownloadButton", "on user cancel download.");
                sa.b.q().getClass();
                n7.e("ApDnMgr", "user cancel");
                sa.b q10 = sa.b.q();
                AppInfo appInfo = appDownloadButton.G;
                q10.getClass();
                if (!sa.b.v(appInfo)) {
                    AppLocalDownloadTask t10 = q10.t(appInfo);
                    if (t10 == null) {
                        n7.e("ApDnMgr", " removeTask failed:" + appInfo.getPackageName());
                    } else {
                        Context context = (Context) q10.f250s;
                        sa.c cVar = new sa.c(q10, t10);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("content", com.huawei.openalliance.ad.ppskit.utils.y0.q(null, t10));
                            AppInfo A = androidx.activity.n.A(t10);
                            if (A != null) {
                                jSONObject.put(ba.D, com.huawei.openalliance.ad.ppskit.utils.y0.q(null, A));
                            }
                            if (t10.N()) {
                                l10 = z6.m(context);
                            } else {
                                l10 = c7.l(context);
                            }
                            l10.k("cancelDownloadApp", jSONObject.toString(), cVar, String.class);
                        } catch (JSONException unused) {
                            androidx.activity.n.Z(cVar, "cancelDownload JSONException", "cancelDownloadApp");
                        }
                    }
                }
                appDownloadButton.l();
                appDownloadButton.setOnNonWifiDownloadListener(null);
                appDownloadButton.setNeedShowConfirmDialog(true);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface k {
        void a(AppStatus appStatus);
    }

    /* loaded from: classes2.dex */
    public interface l {
        boolean a();
    }

    public AppDownloadButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = 0;
        this.M = AppStatus.DOWNLOAD;
        this.O = -1;
        this.Q = true;
        this.R = 1;
        this.S = 2;
        this.U = true;
        this.f23086d0 = false;
        this.f23090h0 = true;
        this.f23091i0 = false;
        this.f23093k0 = false;
        this.f23094l0 = false;
        this.f23095m0 = -1;
        this.H = new c1(context);
        super.setPadding(0, 0, 0, 0);
        setOnClickListener(this);
        setCancelBtnClickListener(new j(this));
    }

    private long getLeftSize() {
        if (this.G == null) {
            return 0L;
        }
        AppLocalDownloadTask task = getTask();
        long fileSize = this.G.getFileSize();
        if (task != null) {
            n7.c("AppDownloadButton", " filesize=%s", Long.valueOf(task.j()));
            long fileSize2 = this.G.getFileSize() - task.getDownloadedSize();
            if (fileSize2 > 0) {
                return fileSize2;
            }
            return fileSize;
        }
        return fileSize;
    }

    private AppLocalDownloadTask getTask() {
        AppLocalDownloadTask t10 = sa.b.q().t(this.G);
        if (t10 != null) {
            ContentRecord contentRecord = this.P;
            if (contentRecord != null) {
                t10.z(contentRecord.p2());
                t10.A(this.P.v0());
                t10.E(this.P.h());
                t10.w(this.P.j2());
                t10.u(this.P.K0());
                t10.F(this.P.M0());
                t10.G(this.P.N0());
                t10.y(this.P.o1());
                t10.v(this.P.a1());
                t10.H(this.P.Z0());
            }
            n7.c("AppDownloadButton", "task.getCallerPackageName()=%s", t10.D());
            n7.c("AppDownloadButton", "callerPackageName %s", this.f23085c0);
            if (!TextUtils.isEmpty(t10.D())) {
                if (!t10.D().equalsIgnoreCase(this.f23085c0)) {
                    n7.e("AppDownloadButton", "change caller package");
                }
            }
            t10.B(this.f23085c0);
            t10.C(this.V);
        }
        return t10;
    }

    @Override // ta.b
    public final void a(AppLocalDownloadTask appLocalDownloadTask) {
        if (n7.d()) {
            Object[] objArr = new Object[3];
            objArr[0] = appLocalDownloadTask.g();
            AppInfo appInfo = this.G;
            objArr[1] = appInfo == null ? null : appInfo.getPackageName();
            objArr[2] = Integer.valueOf(appLocalDownloadTask.getProgress());
            n7.c("AppDownloadButton", "onProgressChanged, taskId:%s, packageName %s, progress:%s", objArr);
        }
        AppInfo appInfo2 = this.G;
        if (appInfo2 == null || !appInfo2.getPackageName().equals(appLocalDownloadTask.g())) {
            return;
        }
        d2.a(new c());
    }

    @Override // ta.b
    public final void b(AppLocalDownloadTask appLocalDownloadTask) {
        if (n7.d()) {
            Object[] objArr = new Object[3];
            objArr[0] = appLocalDownloadTask.g();
            AppInfo appInfo = this.G;
            objArr[1] = appInfo == null ? null : appInfo.getPackageName();
            objArr[2] = Integer.valueOf(appLocalDownloadTask.getStatus());
            n7.c("AppDownloadButton", "onStatusChanged, taskId:%s, packageName %s, status:%s", objArr);
        }
        AppInfo appInfo2 = this.G;
        if (appInfo2 == null || !appInfo2.getPackageName().equals(appLocalDownloadTask.g())) {
            return;
        }
        d2.a(new a());
    }

    @Override // ta.b
    public final void c(String str) {
        b(str);
    }

    public final void f() {
        if ((getContext() instanceof Activity) && getStatus() == AppStatus.DOWNLOAD && this.f23089g0 && this.f23090h0) {
            Context context = getContext();
            k5 k5Var = new k5(context);
            k5Var.f31268b = new h();
            this.f23091i0 = true;
            AppInfo appInfo = this.G;
            ContentRecord contentRecord = this.P;
            getLeftSize();
            if (appInfo != null && contentRecord != null) {
                n7.e("ConfirmDownloadAlertStrategy", "showConfirmDownloadAlert, context:" + context);
                k5Var.a("115", contentRecord);
                com.huawei.openalliance.ad.ppskit.utils.v.b(context, "", context.getString(R.string.hiad_confirm_download_app), context.getString(R.string.hiad_download_install), context.getString(R.string.hiad_dialog_cancel), new j5(k5Var, contentRecord, appInfo));
                return;
            }
            n7.e("ConfirmDownloadAlertStrategy", "appInfo or contentRecord is empty");
            i5.a aVar = k5Var.f31268b;
            if (aVar != null) {
                aVar.b();
                return;
            }
            return;
        }
        n();
    }

    public final AppLocalDownloadTask g() {
        AppLocalDownloadTask appLocalDownloadTask;
        boolean z10 = this.I;
        AppInfo appInfo = this.G;
        if (appInfo == null) {
            appLocalDownloadTask = null;
        } else {
            AppLocalDownloadTask appLocalDownloadTask2 = new AppLocalDownloadTask();
            appLocalDownloadTask2.setAllowedMobileNetowrk(z10);
            appLocalDownloadTask2.r(appInfo);
            appLocalDownloadTask2.h(appInfo.getDownloadUrl());
            appLocalDownloadTask2.i(appInfo.getSha256());
            appLocalDownloadTask2.a(appInfo.getFileSize());
            appLocalDownloadTask2.d();
            AppLocalDownloadTask.q(appLocalDownloadTask2, appInfo);
            appLocalDownloadTask = appLocalDownloadTask2;
        }
        if (appLocalDownloadTask != null) {
            appLocalDownloadTask.s(Integer.valueOf(this.R));
            appLocalDownloadTask.x(Integer.valueOf(this.S));
            appLocalDownloadTask.t(this.f23092j0);
            appLocalDownloadTask.p(this.P);
            ContentRecord contentRecord = this.P;
            if (contentRecord != null) {
                appLocalDownloadTask.A(contentRecord.v0());
                appLocalDownloadTask.z(this.P.p2());
                appLocalDownloadTask.E(this.P.h());
                appLocalDownloadTask.w(this.P.j2());
                appLocalDownloadTask.u(this.P.K0());
                appLocalDownloadTask.F(this.P.M0());
                appLocalDownloadTask.G(this.P.N0());
                appLocalDownloadTask.y(this.P.o1());
                appLocalDownloadTask.H(this.P.Z0());
                appLocalDownloadTask.v(this.P.a1());
            }
            appLocalDownloadTask.C(this.V);
            appLocalDownloadTask.B(this.f23085c0);
            n7.c("AppDownloadButton", " new allowedNonWifiNetwork=%s", Boolean.valueOf(appLocalDownloadTask.l()));
        }
        return appLocalDownloadTask;
    }

    public String getCallerPackageName() {
        return this.f23085c0;
    }

    public fj getClickActionListener() {
        return this.f23087e0;
    }

    public MaterialClickInfo getClickInfo() {
        return this.f23096n0;
    }

    public int getRoundRadius() {
        if (com.huawei.openalliance.ad.ppskit.utils.d0.v(getStyle().f23407e)) {
            return 28;
        }
        return 18;
    }

    public String getSdkVersion() {
        return this.V;
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.AppDownBtnContainer
    public AppStatus getStatus() {
        AppStatus appStatus = this.M;
        if (appStatus == null) {
            return AppStatus.DOWNLOAD;
        }
        return appStatus;
    }

    public c1 getStyle() {
        return this.H;
    }

    public final void h(int i10, Context context, AppStatus appStatus) {
        int i11;
        String str;
        String str2;
        CharSequence charSequence;
        int i12;
        String str3;
        int i13;
        boolean z10 = false;
        String str4 = null;
        if (androidx.transition.n.M(this.T)) {
            str2 = null;
        } else {
            if (i10 != 1) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            int l10 = TextState.l(appStatus);
            String l11 = i2.l();
            Iterator<TextState> it = this.T.iterator();
            String str5 = null;
            String str6 = null;
            while (true) {
                if (it.hasNext()) {
                    TextState next = it.next();
                    if (next != null) {
                        n7.c("AppDownloadButton", "state.getShowPosition() is %s", Integer.valueOf(next.k()));
                        if (i11 != next.k()) {
                            continue;
                        } else {
                            if (l10 == next.b()) {
                                if (l11.equalsIgnoreCase(new Locale(next.c()).getLanguage())) {
                                    str = next.d();
                                    break;
                                } else if (1 == next.p()) {
                                    str5 = next.d();
                                }
                            }
                            if (next.b() == 0) {
                                str6 = next.d();
                            }
                        }
                    }
                } else {
                    str = null;
                    break;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                str5 = str;
            }
            if (!TextUtils.isEmpty(str5)) {
                str6 = str5;
            }
            str2 = y1.p(str6);
        }
        n7.b("AppDownloadButton", "configtext " + str2);
        if (TextUtils.isEmpty(str2)) {
            String str7 = "";
            String str8 = str7;
            str8 = str7;
            if (context != null && appStatus != null) {
                str8 = str7;
                if (this.G != null) {
                    switch (e.f23101a[appStatus.ordinal()]) {
                        case 1:
                            AppInfo appInfo = this.G;
                            str3 = str7;
                            if (appInfo != null) {
                                str3 = androidx.activity.n.E(appInfo.n(), context.getString(R.string.hiad_download_download));
                            }
                            str4 = str3;
                            break;
                        case 2:
                            i12 = R.string.hiad_download_resume;
                            str4 = context.getString(i12);
                            break;
                        case 3:
                            if (this.R == 11) {
                                i12 = R.string.hiad_download_downloading;
                                str4 = context.getString(i12);
                                break;
                            } else {
                                str4 = NumberFormat.getPercentInstance().format((this.O * 1.0f) / 100.0f);
                                break;
                            }
                        case 4:
                            AppInfo appInfo2 = this.G;
                            str3 = str7;
                            if (appInfo2 != null) {
                                String U = appInfo2.U();
                                if (!TextUtils.isEmpty(appInfo2.L())) {
                                    z10 = true;
                                }
                                if (z10) {
                                    if (this.f23095m0 == 1) {
                                        str3 = context.getString(R.string.hiad_app_preordered);
                                    } else {
                                        i13 = R.string.hiad_app_preorder;
                                    }
                                } else {
                                    i13 = R.string.hiad_download_open;
                                }
                                str3 = androidx.activity.n.E(U, context.getString(i13));
                            }
                            str4 = str3;
                            break;
                        case 5:
                            i12 = R.string.hiad_download_install;
                            str4 = context.getString(i12);
                            break;
                        case 6:
                            i12 = R.string.hiad_download_installing;
                            str4 = context.getString(i12);
                            break;
                    }
                    str8 = str4;
                }
            }
            i iVar = this.L;
            charSequence = str8;
            if (iVar != null) {
                charSequence = iVar.a(str8);
            }
        } else {
            i iVar2 = this.L;
            charSequence = str2;
        }
        super.setText(charSequence);
    }

    public final void i(String str, int i10) {
        long j10;
        int i11;
        boolean z10 = false;
        if (this.P != null && (i10 == 1 || (getContext() instanceof LandingDetailsActivity) || this.P.z0() == 7 || (this.P.z0() == 12 && (getContext() instanceof InterstitialAdActivity)))) {
            z10 = true;
        }
        if (z10) {
            if (this.P != null && ((getContext() instanceof LandingDetailsActivity) || this.F == 4)) {
                n7.e("AppDownloadButton", "rpt show for missing imp.");
                if (this.P.X1() != null) {
                    j10 = this.P.X1().b0();
                    i11 = this.P.X1().d0();
                } else {
                    j10 = 500;
                    i11 = 50;
                }
                androidx.activity.n.H(getContext(), this.P, Long.valueOf(j10), Integer.valueOf(i11), 2, a0.a.f0(getContext()), com.huawei.openalliance.ad.constant.w.dm);
            }
            vf.a aVar = new vf.a();
            aVar.f32023c = str;
            aVar.f32024d = Integer.valueOf(i10);
            aVar.f = a0.a.f0(getContext());
            aVar.f32025e = this.f23096n0;
            androidx.activity.n.N(getContext(), this.P, z1.v(this), new vf(aVar));
            this.f23096n0 = null;
        }
    }

    public final void j(boolean z10) {
        if (!com.huawei.openalliance.ad.ppskit.utils.k1.g(getContext())) {
            Toast.makeText(getContext(), R.string.hiad_network_no_available, 0).show();
        } else if (this.G.d0() && this.Q && z10) {
            ra.k.a(getContext(), this.G, new f());
        } else {
            r();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r0.equals("6") != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(com.huawei.openalliance.ad.ppskit.download.local.AppLocalDownloadTask r6) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.AppDownloadButton.k(com.huawei.openalliance.ad.ppskit.download.local.AppLocalDownloadTask):void");
    }

    public final AppStatus l() {
        k(o());
        return this.M;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r11 = this;
            com.huawei.openalliance.ad.ppskit.inter.data.AppInfo r0 = r11.G
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L32
            int r3 = r11.R
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.D(r3)
            if (r0 == 0) goto L32
            android.content.Context r0 = r11.getContext()
            java.lang.String r3 = "com.huawei.appmarket"
            android.content.pm.PackageInfo r0 = com.huawei.openalliance.ad.ppskit.utils.o2.f(r0, r3)     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L20
        L1e:
            r0 = r2
            goto L2b
        L20:
            int r0 = r0.versionCode     // Catch: java.lang.Throwable -> L23
            goto L2b
        L23:
            java.lang.String r0 = "ApkUtil"
            java.lang.String r3 = "getAppVersionCode fail"
            ka.n7.g(r0, r3)
            goto L1e
        L2b:
            r3 = 100300300(0x5fa760c, float:2.355325E-35)
            if (r0 < r3) goto L32
            r0 = r1
            goto L33
        L32:
            r0 = r2
        L33:
            if (r0 != 0) goto Le8
            ka.m5 r0 = new ka.m5
            android.content.Context r3 = r11.getContext()
            r0.<init>(r3)
            com.huawei.openalliance.ad.ppskit.views.AppDownloadButton$g r4 = new com.huawei.openalliance.ad.ppskit.views.AppDownloadButton$g
            r4.<init>()
            r0.f31268b = r4
            com.huawei.openalliance.ad.ppskit.inter.data.AppInfo r4 = r11.G
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r5 = r11.P
            long r6 = r11.getLeftSize()
            java.lang.String r8 = "AlertReminder"
            if (r4 == 0) goto Ldb
            if (r5 != 0) goto L55
            goto Ldb
        L55:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "showNonWifiAlert, context:"
            r9.<init>(r10)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            ka.n7.e(r8, r9)
            ka.l5 r8 = new ka.l5
            r8.<init>(r0, r5, r4)
            r0 = 2131951999(0x7f13017f, float:1.9540428E38)
            java.lang.String r4 = r3.getString(r0)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r5 = com.huawei.openalliance.ad.ppskit.utils.x.b(r6)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            r5 = 2131951978(0x7f13016a, float:1.9540386E38)
            java.lang.String r1 = r3.getString(r5, r1)
            r0[r2] = r1
            java.util.regex.Pattern r1 = com.huawei.openalliance.ad.ppskit.utils.y1.f23070a
            android.content.res.Resources r1 = r3.getResources()
            ka.l r2 = ka.Cif.a(r3)     // Catch: java.lang.Exception -> La6 java.lang.RuntimeException -> La8
            boolean r2 = r2.c()     // Catch: java.lang.Exception -> La6 java.lang.RuntimeException -> La8
            if (r2 == 0) goto Lbc
            java.lang.String r2 = "hiad_download_use_mobile_network_zh"
            java.lang.String r5 = "string"
            java.lang.String r6 = r3.getPackageName()     // Catch: java.lang.Exception -> La6 java.lang.RuntimeException -> La8
            int r2 = r1.getIdentifier(r2, r5, r6)     // Catch: java.lang.Exception -> La6 java.lang.RuntimeException -> La8
            java.lang.String r2 = r1.getString(r2, r0)     // Catch: java.lang.Exception -> La6 java.lang.RuntimeException -> La8
            goto Lbd
        La6:
            r2 = move-exception
            goto La9
        La8:
            r2 = move-exception
        La9:
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r5 = "getChinaString "
            java.lang.String r2 = r5.concat(r2)
            java.lang.String r5 = "StringUtils"
            ka.n7.i(r5, r2)
        Lbc:
            r2 = 0
        Lbd:
            if (r2 != 0) goto Lc8
            r2 = 2131952013(0x7f13018d, float:1.9540457E38)
            java.lang.String r0 = r1.getString(r2, r0)
            r5 = r0
            goto Lc9
        Lc8:
            r5 = r2
        Lc9:
            r0 = 2131951975(0x7f130167, float:1.954038E38)
            java.lang.String r6 = r3.getString(r0)
            r0 = 2131951988(0x7f130174, float:1.9540406E38)
            java.lang.String r7 = r3.getString(r0)
            com.huawei.openalliance.ad.ppskit.utils.v.b(r3, r4, r5, r6, r7, r8)
            goto Leb
        Ldb:
            java.lang.String r1 = "appInfo or contentRecord is empty"
            ka.n7.e(r8, r1)
            ka.i5$a r0 = r0.f31268b
            if (r0 == 0) goto Leb
            r0.b()
            goto Leb
        Le8:
            r11.f()
        Leb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.AppDownloadButton.m():void");
    }

    public final void n() {
        if (n7.d()) {
            n7.c("AppDownloadButton", "downloadApp, status:%s", this.M);
        }
        AppStatus appStatus = this.M;
        if ((appStatus == AppStatus.DOWNLOAD || appStatus == AppStatus.PAUSE) && this.G != null) {
            AppLocalDownloadTask task = getTask();
            if (task != null) {
                task.s(Integer.valueOf(this.R));
                task.x(Integer.valueOf(this.S));
                task.t(this.f23092j0);
                task.setAllowedMobileNetowrk(this.I);
                Context context = (Context) sa.b.q().f250s;
                b.C0482b c0482b = new b.C0482b(task);
                JSONObject jSONObject = new JSONObject();
                try {
                    androidx.activity.n.X(task, jSONObject);
                    c7.l(context).k("startDownloadApp", jSONObject.toString(), c0482b, String.class);
                } catch (JSONException unused) {
                    androidx.activity.n.Z(c0482b, "startDownload JSONException", "startDownloadApp");
                }
                n7.c("AppDownloadButton", " allowedNonWifiNetwork= %s", Boolean.valueOf(task.l()));
                return;
            }
            sa.b.q().r(g());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r0 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        if (r3 <= 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.openalliance.ad.ppskit.download.local.AppLocalDownloadTask o() {
        /*
            r10 = this;
            com.huawei.openalliance.ad.ppskit.download.app.AppStatus r0 = com.huawei.openalliance.ad.ppskit.download.app.AppStatus.INSTALL
            com.huawei.openalliance.ad.ppskit.inter.data.AppInfo r1 = r10.G
            r2 = 0
            if (r1 != 0) goto Lf
            com.huawei.openalliance.ad.ppskit.download.app.AppStatus r1 = r10.M
            r10.N = r1
            r10.M = r0
            goto L99
        Lf:
            java.lang.String r1 = r1.getPackageName()
            android.content.Context r3 = r10.getContext()
            com.huawei.openalliance.ad.ppskit.inter.data.AppInfo r4 = r10.G
            java.lang.String r4 = r4.getPackageName()
            android.content.pm.PackageInfo r3 = com.huawei.openalliance.ad.ppskit.utils.o2.f(r3, r4)
            java.lang.String r4 = "AppDownloadButton"
            r5 = 1
            r6 = 0
            r7 = 2
            if (r3 == 0) goto L2b
            com.huawei.openalliance.ad.ppskit.download.app.AppStatus r0 = com.huawei.openalliance.ad.ppskit.download.app.AppStatus.INSTALLED
            goto L88
        L2b:
            com.huawei.openalliance.ad.ppskit.download.local.AppLocalDownloadTask r2 = r10.getTask()
            if (r2 == 0) goto L86
            int r3 = r2.getStatus()
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r8[r6] = r9
            r8[r5] = r1
            java.lang.String r9 = "refreshStatus, downloadStatus:%s, packageName:%s"
            ka.n7.c(r4, r9, r8)
            switch(r3) {
                case 0: goto L72;
                case 1: goto L69;
                case 2: goto L69;
                case 3: goto L88;
                case 4: goto L60;
                case 5: goto L5d;
                case 6: goto L48;
                default: goto L47;
            }
        L47:
            goto L83
        L48:
            com.huawei.openalliance.ad.ppskit.download.app.AppStatus r0 = com.huawei.openalliance.ad.ppskit.download.app.AppStatus.DOWNLOAD
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r3[r6] = r8
            java.lang.String r8 = " hasInstalled=%s"
            ka.n7.c(r4, r8, r3)
            sa.b r3 = sa.b.q()
            r3.j(r2)
            goto L88
        L5d:
            com.huawei.openalliance.ad.ppskit.download.app.AppStatus r0 = com.huawei.openalliance.ad.ppskit.download.app.AppStatus.INSTALLING
            goto L6b
        L60:
            int r0 = r2.getProgress()
            r10.O = r0
            if (r0 <= 0) goto L83
            goto L80
        L69:
            com.huawei.openalliance.ad.ppskit.download.app.AppStatus r0 = com.huawei.openalliance.ad.ppskit.download.app.AppStatus.DOWNLOADING
        L6b:
            int r3 = r2.getProgress()
            r10.O = r3
            goto L88
        L72:
            int r0 = r2.m()
            int r3 = r2.getProgress()
            r10.O = r3
            if (r0 != 0) goto L80
            if (r3 <= 0) goto L83
        L80:
            com.huawei.openalliance.ad.ppskit.download.app.AppStatus r0 = com.huawei.openalliance.ad.ppskit.download.app.AppStatus.PAUSE
            goto L88
        L83:
            com.huawei.openalliance.ad.ppskit.download.app.AppStatus r0 = com.huawei.openalliance.ad.ppskit.download.app.AppStatus.DOWNLOAD
            goto L88
        L86:
            com.huawei.openalliance.ad.ppskit.download.app.AppStatus r0 = com.huawei.openalliance.ad.ppskit.download.app.AppStatus.DOWNLOAD
        L88:
            com.huawei.openalliance.ad.ppskit.download.app.AppStatus r3 = r10.M
            r10.N = r3
            r10.M = r0
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r6] = r0
            r3[r5] = r1
            java.lang.String r0 = "refreshAppStatus, status:%s, packageName:%s"
            ka.n7.c(r4, r0, r3)
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.AppDownloadButton.o():com.huawei.openalliance.ad.ppskit.download.local.AppLocalDownloadTask");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String str;
        String str2;
        String packageName;
        super.onAttachedToWindow();
        this.f23094l0 = true;
        try {
            if (n7.d()) {
                Object[] objArr = new Object[1];
                AppInfo appInfo = this.G;
                if (appInfo == null) {
                    packageName = null;
                } else {
                    packageName = appInfo.getPackageName();
                }
                objArr[0] = packageName;
                n7.c("AppDownloadButton", "onAttachedToWindow, packageName:%s", objArr);
            } else {
                AppInfo appInfo2 = this.G;
                Pattern pattern = y1.f23070a;
                if (appInfo2 == null) {
                    str2 = "null";
                } else {
                    str2 = "not null";
                }
                n7.e("AppDownloadButton", "onAttachedToWindow appinfo is ".concat(str2));
            }
            sa.b.q().s(this.G, this);
            k(null);
            p2.a(new com.huawei.openalliance.ad.ppskit.views.a(this), 0);
        } catch (RuntimeException unused) {
            str = "onAttachedToWindow RuntimeException";
            n7.g("AppDownloadButton", str);
        } catch (Exception unused2) {
            str = "onAttachedToWindow Exception";
            n7.g("AppDownloadButton", str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015d  */
    @Override // com.huawei.openalliance.ad.ppskit.views.AppDownBtnContainer, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r13) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.AppDownloadButton.onClick(android.view.View):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        String str;
        String str2;
        String packageName;
        super.onDetachedFromWindow();
        this.f23094l0 = false;
        try {
            if (n7.d()) {
                Object[] objArr = new Object[1];
                AppInfo appInfo = this.G;
                if (appInfo == null) {
                    packageName = null;
                } else {
                    packageName = appInfo.getPackageName();
                }
                objArr[0] = packageName;
                n7.c("AppDownloadButton", "onDetachedFromWindow, packageName:%s", objArr);
            } else {
                AppInfo appInfo2 = this.G;
                Pattern pattern = y1.f23070a;
                if (appInfo2 == null) {
                    str2 = "null";
                } else {
                    str2 = "not null";
                }
                n7.e("AppDownloadButton", "onDetachedFromWindow appinfo is ".concat(str2));
            }
            sa.b.q().u(this.G, this);
        } catch (RuntimeException unused) {
            str = "onDetachedFromWindow RuntimeException";
            n7.g("AppDownloadButton", str);
        } catch (Exception unused2) {
            str = "onDetachedFromWindow Exception";
            n7.g("AppDownloadButton", str);
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        n7.c("AppDownloadButton", "onVisibilityChanged, status:%s", this.M);
        super.onVisibilityChanged(view, i10);
        if (!this.f23094l0) {
            n7.g("AppDownloadButton", "not attached to window, return.");
        } else {
            k(null);
            p2.a(new com.huawei.openalliance.ad.ppskit.views.a(this), 0);
        }
    }

    public final void p() {
        c7 l10;
        boolean z10;
        boolean z11;
        AppLocalDownloadTask task;
        AppStatus status = getStatus();
        n7.e("AppDownloadButton", "onClick, status:" + status);
        int i10 = e.f23101a[status.ordinal()];
        if (i10 != 1) {
            boolean z12 = false;
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5 && (task = getTask()) != null) {
                            if (this.G != null && this.P != null) {
                                sa.b.q().r(task);
                                return;
                            } else {
                                n7.g("AppDownloadButton", "installApk, appinfo or content record is null");
                                return;
                            }
                        }
                        return;
                    }
                    Integer q10 = androidx.transition.n.q(4, 1, this.P.q0());
                    if (q10 != null && q10.intValue() == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        AppInfo appInfo = this.G;
                        if (appInfo != null && !TextUtils.isEmpty(appInfo.L())) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            z12 = true;
                        }
                    }
                    if (z12 && this.f23095m0 != 1) {
                        Context context = getContext();
                        AppLocalDownloadTask g6 = g();
                        if (context != null && g6 != null) {
                            throw null;
                        }
                        d2.b(new com.huawei.openalliance.ad.ppskit.views.b(this), 600L);
                        return;
                    }
                    q();
                    return;
                }
                AppLocalDownloadTask task2 = getTask();
                if (task2 != null) {
                    Context context2 = (Context) sa.b.q().f250s;
                    b.C0482b c0482b = new b.C0482b(task2);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("content", com.huawei.openalliance.ad.ppskit.utils.y0.q(null, task2));
                        AppInfo A = androidx.activity.n.A(task2);
                        if (A != null) {
                            jSONObject.put(ba.D, com.huawei.openalliance.ad.ppskit.utils.y0.q(null, A));
                        }
                        if (task2.N()) {
                            l10 = z6.m(context2);
                        } else {
                            l10 = c7.l(context2);
                        }
                        l10.k("pauseDownloadApp", jSONObject.toString(), c0482b, String.class);
                        return;
                    } catch (JSONException unused) {
                        androidx.activity.n.Z(c0482b, "pauseDownload JSONException", "pauseDownloadApp");
                        return;
                    }
                }
                return;
            }
            j(false);
            return;
        }
        if (!o2.b() && q()) {
            return;
        }
        j(this.U);
        if (!this.f23086d0) {
            i("download", this.R);
            this.f23086d0 = true;
        }
    }

    public final boolean q() {
        String str;
        z6.f aVar;
        boolean z10 = false;
        if (this.P == null) {
            return false;
        }
        AppInfo appInfo = this.G;
        if (appInfo != null) {
            str = appInfo.getPackageName();
        } else {
            str = null;
        }
        if (a0.a.t0(getContext(), str)) {
            aVar = new ra.m();
        } else {
            aVar = new ra.a();
        }
        if (aVar.e(getContext(), this.G, this.P, Integer.valueOf(this.R))) {
            z10 = true;
            if (!this.f23086d0) {
                i("app", 7);
                this.f23086d0 = true;
            }
            PersistentMessageCenter.getInstance().notifyMessage(getContext().getPackageName(), "com.huawei.hms.pps.action.OPEN_IN_ADREWARD", new Intent("com.huawei.hms.pps.action.OPEN_IN_ADREWARD"));
        }
        return z10;
    }

    public final void r() {
        if (!com.huawei.openalliance.ad.ppskit.utils.k1.g(getContext())) {
            Toast.makeText(getContext(), R.string.hiad_network_no_available, 0).show();
            return;
        }
        if (!com.huawei.openalliance.ad.ppskit.utils.k1.e(getContext())) {
            getLeftSize();
            l lVar = this.K;
            if (lVar != null) {
                if (!lVar.a()) {
                    return;
                }
            } else {
                m();
                return;
            }
        }
        f();
    }

    public void setAllowedNonWifiNetwork(boolean z10) {
        this.I = z10;
    }

    public void setAppDownloadButtonStyle(c1 c1Var) {
        this.H = c1Var;
        k(null);
        p2.a(new com.huawei.openalliance.ad.ppskit.views.a(this), 0);
    }

    public void setAppInfo(AppInfo appInfo) {
        String str;
        Pattern pattern = y1.f23070a;
        if (appInfo == null) {
            str = "null";
        } else {
            str = "not null";
        }
        n7.e("AppDownloadButton", "setAppInfo appInfo is ".concat(str));
        this.G = appInfo;
        if (appInfo != null) {
            sa.b.q().s(appInfo, this);
        }
    }

    public void setButtonTextWatcher(i iVar) {
        this.L = iVar;
    }

    public void setCallerPackageName(String str) {
        this.f23085c0 = str;
    }

    public void setClickActionListener(fj fjVar) {
        this.f23087e0 = fjVar;
    }

    public void setClickInfo(MaterialClickInfo materialClickInfo) {
        this.f23096n0 = materialClickInfo;
    }

    public void setContentRecord(ContentRecord contentRecord) {
        String str;
        try {
            if (contentRecord != null) {
                this.P = contentRecord;
                AppInfo j02 = contentRecord.j0();
                if (j02 != null) {
                    setAppInfo(j02);
                    setShowPermissionDialog(j02.isPermPromptForLanding());
                }
                String j22 = contentRecord.j2();
                ContentRecord contentRecord2 = this.P;
                if (contentRecord2 != null) {
                    contentRecord2.V1(j22);
                }
                this.R = 2;
                this.T = contentRecord.s0();
                boolean z10 = false;
                Integer q10 = androidx.transition.n.q(14, 0, this.P.q0());
                if (q10 != null && 1 == q10.intValue()) {
                    z10 = true;
                }
                this.f23089g0 = z10;
                return;
            }
            setAppInfo(null);
            this.P = null;
        } catch (IllegalArgumentException unused) {
            str = "setAdLandingPageData IllegalArgumentException";
            n7.g("AppDownloadButton", str);
        } catch (Exception unused2) {
            str = "setAdLandingPageData error";
            n7.g("AppDownloadButton", str);
        }
    }

    public void setLinkedCoverClickListener(View.OnClickListener onClickListener) {
        this.f23088f0 = onClickListener;
    }

    public void setNeedShowConfirmDialog(boolean z10) {
        this.f23090h0 = z10;
    }

    public void setNeedShowPermision(boolean z10) {
        this.U = z10;
    }

    public void setOnDownloadStatusChangedListener(k kVar) {
        this.J = kVar;
    }

    public void setOnNonWifiDownloadListener(l lVar) {
        this.K = lVar;
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f23076s.setPadding(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
        this.f23076s.setPaddingRelative(i10, i11, i12, i13);
    }

    public void setPosition(int i10) {
        this.F = i10;
    }

    public void setSdkVersion(String str) {
        this.V = str;
    }

    public void setShowPermissionDialog(boolean z10) {
        this.Q = z10;
    }

    public void setSource(int i10) {
        this.R = i10;
    }

    public void setVenusExt(String str) {
        this.f23092j0 = str;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        super.setVisibilityInner(i10);
    }

    @Override // ta.b
    public final void a(String str) {
        if (n7.d()) {
            Object[] objArr = new Object[2];
            objArr[0] = str;
            AppInfo appInfo = this.G;
            objArr[1] = appInfo == null ? null : appInfo.getPackageName();
            n7.c("AppDownloadButton", "onStatusChanged, packageName:%s, packageName %s", objArr);
        }
        AppInfo appInfo2 = this.G;
        if (appInfo2 == null || !appInfo2.getPackageName().equals(str)) {
            return;
        }
        d2.a(new b());
    }

    @Override // ta.b
    public final void b(String str) {
        AppInfo appInfo = this.G;
        if (appInfo == null || str == null || !str.equals(appInfo.getPackageName())) {
            return;
        }
        d2.a(new d());
    }

    /* loaded from: classes2.dex */
    public class g implements i5.a {
        public g() {
        }

        @Override // ka.i5.a
        public final void a() {
            AppDownloadButton appDownloadButton = AppDownloadButton.this;
            appDownloadButton.setAllowedNonWifiNetwork(true);
            appDownloadButton.setNeedShowConfirmDialog(false);
            appDownloadButton.f();
        }

        @Override // ka.i5.a
        public final void b() {
        }
    }

    /* loaded from: classes2.dex */
    public class h implements i5.a {
        public h() {
        }

        @Override // ka.i5.a
        public final void a() {
            AppDownloadButton appDownloadButton = AppDownloadButton.this;
            appDownloadButton.setNeedShowConfirmDialog(false);
            appDownloadButton.n();
        }

        @Override // ka.i5.a
        public final void b() {
        }
    }
}
