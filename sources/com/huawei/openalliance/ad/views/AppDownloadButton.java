package com.huawei.openalliance.ad.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;
import com.huawei.hms.ads.Cdo;
import com.huawei.hms.ads.ch;
import com.huawei.hms.ads.dk;
import com.huawei.hms.ads.dl;
import com.huawei.hms.ads.er;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.jf;
import com.huawei.hms.ads.jh;
import com.huawei.hms.ads.js;
import com.huawei.hms.ads.jy;
import com.huawei.hms.ads.kn;
import com.huawei.hms.ads.nativead.R;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.TextState;
import com.huawei.openalliance.ad.constant.ah;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.download.app.PPSAppDownloadManager;
import com.huawei.openalliance.ad.download.app.a;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.views.s;
import da.m;
import gb.r0;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AppDownloadButton extends AppDownBtnContainer implements js, ca.c {
    private com.huawei.openalliance.ad.inter.data.j B;
    private AppInfo C;
    private q D;
    private boolean F;
    private r L;
    private s S;

    /* renamed from: a, reason: collision with root package name */
    private p f23630a;

    /* renamed from: b, reason: collision with root package name */
    private da.n f23631b;

    /* renamed from: c, reason: collision with root package name */
    private da.n f23632c;

    /* renamed from: d, reason: collision with root package name */
    private int f23633d;

    /* renamed from: e, reason: collision with root package name */
    private AdContentData f23634e;
    private boolean f;

    /* renamed from: g, reason: collision with root package name */
    private int f23635g;

    /* renamed from: h, reason: collision with root package name */
    private final int f23636h;

    /* renamed from: i, reason: collision with root package name */
    private List<TextState> f23637i;

    /* renamed from: j, reason: collision with root package name */
    private jy f23638j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f23639k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f23640l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f23641m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f23642n;
    private kn o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f23643p;

    /* renamed from: q, reason: collision with root package name */
    private int f23644q;

    /* renamed from: r, reason: collision with root package name */
    private MaterialClickInfo f23645r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f23646s;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppDownloadButton appDownloadButton = AppDownloadButton.this;
            appDownloadButton.I();
            if (appDownloadButton.D != null) {
                appDownloadButton.D.Code(appDownloadButton.f23631b);
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
            appDownloadButton.I();
            if (appDownloadButton.D != null && appDownloadButton.f23632c != appDownloadButton.f23631b) {
                appDownloadButton.D.Code(appDownloadButton.f23631b);
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
            appDownloadButton.I();
            if (appDownloadButton.D != null && appDownloadButton.f23632c != appDownloadButton.f23631b) {
                appDownloadButton.D.Code(appDownloadButton.f23631b);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppDownloadButton.this.I();
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppDownloadButton appDownloadButton = AppDownloadButton.this;
            appDownloadButton.I();
            if (appDownloadButton.D != null) {
                appDownloadButton.D.Code(appDownloadButton.f23631b);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f23652s;

        public f(int i10) {
            this.f23652s = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = this.f23652s;
            AppDownloadButton appDownloadButton = AppDownloadButton.this;
            appDownloadButton.f23644q = i10;
            appDownloadButton.I();
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23654a;

        static {
            int[] iArr = new int[da.n.values().length];
            f23654a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23654a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23654a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23654a[10] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23654a[9] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23654a[8] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppDownloadButton.this.I();
        }
    }

    /* loaded from: classes2.dex */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppDownloadButton.this.n();
        }
    }

    /* loaded from: classes2.dex */
    public class j implements m.a {
        public j() {
        }
    }

    /* loaded from: classes2.dex */
    public interface m {
    }

    /* loaded from: classes2.dex */
    public static class n implements View.OnClickListener {

        /* renamed from: s, reason: collision with root package name */
        public final WeakReference<AppDownloadButton> f23660s;

        public n(AppDownloadButton appDownloadButton) {
            this.f23660s = new WeakReference<>(appDownloadButton);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ex.V("AppDownBtn", "on cancel btn click.");
            AppDownloadButton appDownloadButton = this.f23660s.get();
            if (appDownloadButton != null) {
                appDownloadButton.V();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class o implements a.c {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<AppDownloadButton> f23661a;

        public o(AppDownloadButton appDownloadButton) {
            this.f23661a = new WeakReference<>(appDownloadButton);
        }

        @Override // com.huawei.openalliance.ad.download.app.a.c
        public final void Code() {
            AppDownloadButton appDownloadButton = this.f23661a.get();
            if (appDownloadButton != null) {
                ex.V("AppDownBtn", "cancelTask success");
                gb.w.b(new com.huawei.openalliance.ad.views.a(appDownloadButton));
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface p {
    }

    /* loaded from: classes2.dex */
    public interface q {
        void Code(AppInfo appInfo);

        void Code(da.n nVar);
    }

    /* loaded from: classes2.dex */
    public interface r {
        boolean Code(AppInfo appInfo, long j10);
    }

    public AppDownloadButton(Context context) {
        super(context);
        this.f23633d = -1;
        this.f = true;
        this.f23635g = 1;
        this.f23636h = 2;
        this.f23639k = true;
        this.f23641m = true;
        this.f23642n = false;
        this.f23643p = true;
        this.f23644q = -1;
        this.f23646s = false;
        Code(context, (AttributeSet) null, -1, -1);
    }

    private boolean D() {
        String str;
        if (d()) {
            str = "open harmony service";
        } else {
            if (this.f23631b == da.n.INSTALLED) {
                g();
                return true;
            }
            if (L()) {
                return a();
            }
            if (c()) {
                str = "open Ag detail";
            } else if (e()) {
                str = "open Ag mini detail";
            } else if (f()) {
                str = "open Gp detail";
            } else {
                return false;
            }
        }
        ex.V("AppDownBtn", str);
        return true;
    }

    private boolean F() {
        AppInfo appInfo = this.C;
        if (appInfo == null) {
            return false;
        }
        String l02 = appInfo.l0();
        if (TextUtils.isEmpty(l02) || TextUtils.isEmpty(this.C.q()) || !l02.equals("6")) {
            return false;
        }
        return true;
    }

    private boolean L() {
        AppInfo appInfo;
        if (this.f23635g == 1 && (appInfo = this.C) != null) {
            return "21".equalsIgnoreCase(appInfo.Q());
        }
        return false;
    }

    private boolean a() {
        HashMap hashMap;
        if (this.f23634e == null) {
            return false;
        }
        com.huawei.openalliance.ad.inter.data.j jVar = this.B;
        if (jVar != null) {
            hashMap = jVar.X();
        } else {
            hashMap = null;
        }
        boolean a10 = new fb.g(getContext(), this.f23634e, true, hashMap).a();
        if (a10) {
            ex.V("AppDownBtn", "list page btn openLandingPage");
            V(com.huawei.openalliance.ad.constant.v.B, this.f23635g);
        }
        return a10;
    }

    private boolean b() {
        AppInfo appInfo = this.C;
        if (appInfo == null) {
            k();
            ex.V("AppDownBtn", "appInfo is empty");
            return false;
        }
        if (this.f23631b == da.n.INSTALLED || appInfo.j0()) {
            return true;
        }
        String l02 = this.C.l0();
        if (!TextUtils.isEmpty(l02)) {
            if (l02.equals("7") && !TextUtils.isEmpty(this.C.j())) {
                return true;
            }
            if (l02.equals("9") && !TextUtils.isEmpty(this.C.q()) && !TextUtils.isEmpty(this.C.m0())) {
                return true;
            }
        }
        if (!TextUtils.isEmpty(this.C.G())) {
            return true;
        }
        k();
        return false;
    }

    private boolean c() {
        String l02 = this.C.l0();
        if (!TextUtils.isEmpty(l02) && !TextUtils.isEmpty(this.C.j()) && l02.equals("7")) {
            if (new fb.b(getContext(), this.f23634e).a()) {
                V(com.huawei.openalliance.ad.constant.v.Code, this.f23635g);
                m();
                return true;
            }
            k();
            return false;
        }
        return false;
    }

    private boolean d() {
        if ("9".equals(this.C.l0()) && !TextUtils.isEmpty(this.C.q()) && !TextUtils.isEmpty(this.C.m0())) {
            fb.c cVar = new fb.c(getContext(), this.f23634e, 1);
            if (cVar.a()) {
                V(cVar.c(), this.f23635g);
                m();
                return true;
            }
            k();
            return false;
        }
        return false;
    }

    private boolean e() {
        String l02 = this.C.l0();
        if (!TextUtils.isEmpty(l02) && !TextUtils.isEmpty(this.C.q()) && l02.equals("6")) {
            fb.j jVar = new fb.j(getContext(), this.f23634e);
            jVar.f28345e = this.f23635g;
            jVar.a();
            V(com.huawei.openalliance.ad.constant.v.F, this.f23635g);
            m();
            return true;
        }
        return false;
    }

    private boolean f() {
        List<Integer> n02;
        if (this.C != null && r0.a(getContext()) && (n02 = this.C.n0()) != null && n02.contains(14)) {
            er.Code(getContext()).Code();
            if (j7.r.b(getContext(), this.f23634e, this.B.X(), n02).a()) {
                V(com.huawei.openalliance.ad.constant.v.B, this.f23635g);
                m();
                return true;
            }
            k();
        }
        return false;
    }

    private void g() {
        AppDownloadTask task;
        ex.Code("AppDownBtn", "doClickAction, status:" + this.f23631b);
        int i10 = g.f23654a[this.f23631b.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5 && (task = getTask()) != null) {
                            Z(task);
                            return;
                        }
                        return;
                    }
                    h();
                    return;
                }
                AppDownloadTask task2 = getTask();
                if (task2 != null) {
                    com.huawei.openalliance.ad.download.app.a.t().v(task2);
                    return;
                }
                return;
            }
            Code(false);
            return;
        }
        if (!gb.b0.f() && n()) {
            ex.V("AppDownBtn", "not allowed");
        } else {
            Code(true);
            V("download", this.f23635g);
        }
    }

    private long getLeftSize() {
        if (this.C == null) {
            return 0L;
        }
        AppDownloadTask task = getTask();
        long k10 = this.C.k();
        if (task != null) {
            long k11 = this.C.k() - task.o();
            if (k11 > 0) {
                return k11;
            }
            return k10;
        }
        return k10;
    }

    private AppDownloadTask getTask() {
        AdContentData adContentData;
        AppDownloadTask p10 = com.huawei.openalliance.ad.download.app.a.t().p(this.C);
        if (p10 != null && (adContentData = this.f23634e) != null) {
            p10.G(adContentData.D());
            p10.r(this.f23634e.b1());
            p10.t(this.f23634e.L());
            p10.C(this.f23634e.u());
            p10.E(this.f23634e.A0());
            p10.z(this.f23634e.B0());
            p10.y(this.f23634e.E());
            p10.s(this.f23634e.f0());
            p10.H(this.f23634e.e0());
        }
        return p10;
    }

    private void h() {
        if (j() && this.f23644q != 1) {
            i();
            gb.w.a(600L, new i());
        } else {
            n();
        }
    }

    private void i() {
        Context context = getContext();
        AppDownloadTask r10 = r();
        if (context != null && r10 != null) {
            da.e.a(context).b(r10);
        }
    }

    private boolean j() {
        if (jf.b(this.f23634e.a1()) && ch.Code(this.C)) {
            return true;
        }
        return false;
    }

    private void k() {
        kn knVar = this.o;
        if (knVar != null) {
            knVar.Code(this);
        }
    }

    private void l() {
        kn knVar = this.o;
        if (knVar != null) {
            knVar.V(this);
        }
    }

    private void m() {
        kn knVar = this.o;
        if (knVar != null) {
            knVar.I(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n() {
        /*
            r6 = this;
            com.huawei.openalliance.ad.inter.data.AdContentData r0 = r6.f23634e
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.content.Context r0 = r6.getContext()
            com.huawei.openalliance.ad.inter.data.AppInfo r2 = r6.C
            java.lang.String r2 = r2.q()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L17
            goto L54
        L17:
            android.content.Context r3 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L56
            java.util.HashMap r4 = gb.b0.f28550a     // Catch: java.lang.Throwable -> L56
            java.lang.String r4 = "ApkUtil"
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto L2b
            java.lang.String r3 = "pm is null"
            com.huawei.hms.ads.ex.V(r4, r3)     // Catch: java.lang.Throwable -> L32
            goto L44
        L2b:
            r5 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r2, r5)     // Catch: java.lang.Throwable -> L32
            goto L45
        L32:
            r3 = move-exception
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = r3.getSimpleName()     // Catch: java.lang.Throwable -> L56
            java.lang.String r5 = "getApplicationInfo "
            java.lang.String r3 = r5.concat(r3)     // Catch: java.lang.Throwable -> L56
            com.huawei.hms.ads.ex.I(r4, r3)     // Catch: java.lang.Throwable -> L56
        L44:
            r3 = 0
        L45:
            com.huawei.hms.ads.cx r4 = com.huawei.hms.ads.cm.Code(r0)     // Catch: java.lang.Throwable -> L56
            int r3 = r4.Code(r3)     // Catch: java.lang.Throwable -> L56
            r4 = 1048576(0x100000, float:1.469368E-39)
            r3 = r3 & r4
            if (r3 == 0) goto L54
            r3 = 1
            goto L5e
        L54:
            r3 = r1
            goto L5e
        L56:
            java.lang.String r3 = "HarmonyUtils"
            java.lang.String r4 = "isHarmonyApp exception"
            com.huawei.hms.ads.ex.I(r3, r4)
            goto L54
        L5e:
            if (r3 == 0) goto L64
            boolean r1 = r6.V(r0)
        L64:
            if (r1 != 0) goto L6a
            boolean r1 = r6.Code(r0, r2)
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.views.AppDownloadButton.n():boolean");
    }

    private void o() {
        jy jyVar = this.f23638j;
        if (jyVar != null) {
            jyVar.Code(2, true);
        }
    }

    private void p() {
        jy jyVar = this.f23638j;
        if (jyVar != null) {
            jyVar.D();
        }
    }

    private boolean q() {
        AppInfo appInfo = this.C;
        if (appInfo != null && appInfo.j0() && gb.b0.k(getContext(), com.huawei.openalliance.ad.constant.w.W) >= 100300300) {
            return true;
        }
        return false;
    }

    private AppDownloadTask r() {
        AppDownloadTask appDownloadTask;
        boolean z10 = this.F;
        AppInfo appInfo = this.C;
        if (appInfo == null) {
            appDownloadTask = null;
        } else {
            appDownloadTask = new AppDownloadTask();
            appDownloadTask.f(z10);
            appDownloadTask.w(appInfo);
            appDownloadTask.e(appInfo.G());
            appDownloadTask.n(appInfo.p());
            appDownloadTask.d(appInfo.k());
            appDownloadTask.l();
            AppDownloadTask.u(appDownloadTask, appInfo);
        }
        if (appDownloadTask == null) {
            return null;
        }
        appDownloadTask.x(Integer.valueOf(this.f23635g));
        appDownloadTask.B(2);
        appDownloadTask.v(this.f23634e);
        AdContentData adContentData = this.f23634e;
        if (adContentData != null) {
            appDownloadTask.r(adContentData.b1());
            appDownloadTask.G(this.f23634e.D());
            appDownloadTask.t(this.f23634e.L());
            appDownloadTask.C(this.f23634e.u());
            appDownloadTask.E(this.f23634e.A0());
            appDownloadTask.z(this.f23634e.B0());
            appDownloadTask.y(this.f23634e.E());
            appDownloadTask.H(this.f23634e.e0());
            appDownloadTask.s(this.f23634e.f0());
        }
        return appDownloadTask;
    }

    public da.n I() {
        da.n nVar = da.n.DOWNLOAD;
        AppInfo appInfo = this.C;
        AppDownloadTask appDownloadTask = null;
        if (appInfo == null) {
            this.f23632c = this.f23631b;
            this.f23631b = nVar;
        } else {
            String q10 = appInfo.q();
            if (gb.b0.j(getContext(), this.C.q()) != null) {
                nVar = da.n.INSTALLED;
            } else {
                appDownloadTask = getTask();
                if (appDownloadTask != null) {
                    nVar = Code(appDownloadTask, q10, false);
                }
            }
            this.f23632c = this.f23631b;
            this.f23631b = nVar;
            I(appDownloadTask);
            appDownloadTask = q10;
        }
        ex.Code("AppDownBtn", "refreshStatus, status:%s, pkg:%s", this.f23631b, appDownloadTask);
        return this.f23631b;
    }

    public void S() {
        if (ex.Code()) {
            ex.Code("AppDownBtn", "downloadApp, status:%s", this.f23631b);
        }
        da.n nVar = this.f23631b;
        if ((nVar == da.n.DOWNLOAD || nVar == da.n.PAUSE) && this.C != null) {
            AppDownloadTask task = getTask();
            if (task != null) {
                task.x(Integer.valueOf(this.f23635g));
                task.B(2);
                task.f(this.F);
                com.huawei.openalliance.ad.download.app.a t10 = com.huawei.openalliance.ad.download.app.a.t();
                t10.getClass();
                da.h hVar = new da.h(task);
                Context context = t10.f22196v;
                JSONObject jSONObject = new JSONObject();
                try {
                    j7.r.h(task, jSONObject);
                    ha.i.e(context).d("startDownloadApp", jSONObject.toString(), hVar, String.class);
                    return;
                } catch (JSONException unused) {
                    j7.r.i(hVar, "startDownload JSONException", "startDownloadApp");
                    return;
                }
            }
            com.huawei.openalliance.ad.download.app.a.t().s(r());
        }
    }

    public void cancel() {
        Code((a.c) null);
    }

    public void continueDownload() {
        if (!b()) {
            ex.V("AppDownBtn", "click action invalid.");
            return;
        }
        l();
        if (D()) {
            return;
        }
        S();
    }

    public kn getClickActionListener() {
        return this.o;
    }

    @Override // com.huawei.openalliance.ad.views.AppDownBtnContainer
    public da.n getStatus() {
        return this.f23631b;
    }

    public s getStyle() {
        return this.S;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        String str;
        String q10;
        super.onAttachedToWindow();
        try {
            if (ex.Code()) {
                Object[] objArr = new Object[1];
                AppInfo appInfo = this.C;
                if (appInfo == null) {
                    q10 = null;
                } else {
                    q10 = appInfo.q();
                }
                objArr[0] = q10;
                ex.Code("AppDownBtn", "attach, pkg:%s", objArr);
            } else {
                if (this.C == null) {
                    str = "null";
                } else {
                    str = "not null";
                }
                ex.V("AppDownBtn", "attach appinfo is ".concat(str));
            }
            com.huawei.openalliance.ad.download.app.a.t().q(this.C, this);
            gb.w.b(new d());
        } catch (RuntimeException | Exception unused) {
            ex.I("AppDownBtn", "attach ex");
        }
    }

    @Override // com.huawei.openalliance.ad.views.AppDownBtnContainer, android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        ex.V("AppDownBtn", "onClick");
        if (Code()) {
            str = "fast click";
        } else if (!b()) {
            str = "click action invalid.";
        } else {
            l();
            if (D()) {
                return;
            }
            g();
            return;
        }
        ex.V("AppDownBtn", str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        String str;
        String q10;
        super.onDetachedFromWindow();
        try {
            if (ex.Code()) {
                Object[] objArr = new Object[1];
                AppInfo appInfo = this.C;
                if (appInfo == null) {
                    q10 = null;
                } else {
                    q10 = appInfo.q();
                }
                objArr[0] = q10;
                ex.Code("AppDownBtn", "detach, pkg:%s", objArr);
            } else {
                if (this.C == null) {
                    str = "null";
                } else {
                    str = "not null";
                }
                ex.V("AppDownBtn", "detach appinfo is ".concat(str));
            }
            com.huawei.openalliance.ad.download.app.a.t().w(this.C, this);
            er.Code(getContext()).V();
        } catch (RuntimeException | Exception unused) {
            ex.I("AppDownBtn", "detach ex");
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        ex.V("AppDownBtn", "onVisibilityChanged, status:" + this.f23631b);
        super.onVisibilityChanged(view, i10);
        gb.w.b(new h());
    }

    public void setAfDlBtnText(String str) {
        if (this.C != null && !TextUtils.isEmpty(str)) {
            this.C.B(str);
        }
    }

    public void setAllowedNonWifiNetwork(boolean z10) {
        this.F = z10;
    }

    public void setAppDownloadButtonStyle(s sVar) {
        this.S = sVar;
    }

    public void setAppInfo(AppInfo appInfo) {
        String str;
        if (appInfo == null) {
            str = "null";
        } else {
            str = "not null";
        }
        ex.V("AppDownBtn", "setAppInfo appInfo is ".concat(str));
        this.C = appInfo;
        if (appInfo != null) {
            com.huawei.openalliance.ad.download.app.a.t().q(appInfo, this);
        }
    }

    @Override // com.huawei.hms.ads.js
    public void setClickActionListener(kn knVar) {
        this.o = knVar;
    }

    public void setClickInfo(MaterialClickInfo materialClickInfo) {
        this.f23645r = materialClickInfo;
    }

    public void setIsSetProgressDrawable(boolean z10) {
        this.f23643p = z10;
    }

    public void setNeedAppendProgress(boolean z10) {
        this.f23646s = z10;
    }

    public void setNeedShowConfirmDialog(boolean z10) {
        this.f23641m = z10;
    }

    public void setOnDownloadStatusChangedListener(q qVar) {
        this.D = qVar;
    }

    public void setOnNonWifiDownloadListener(r rVar) {
        this.L = rVar;
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.Code(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.V(i10, i11, i12, i13);
    }

    @Override // com.huawei.hms.ads.js
    public void setPpsNativeView(jy jyVar) {
        this.f23638j = jyVar;
    }

    public void setShowPermissionDialog(boolean z10) {
        this.f = z10;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        super.setVisibilityInner(i10);
    }

    public AppDownloadButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23633d = -1;
        this.f = true;
        this.f23635g = 1;
        this.f23636h = 2;
        this.f23639k = true;
        this.f23641m = true;
        this.f23642n = false;
        this.f23643p = true;
        this.f23644q = -1;
        this.f23646s = false;
        Code(context, attributeSet, -1, -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private da.n Code(AppDownloadTask appDownloadTask, String str, boolean z10) {
        da.n nVar;
        int a10 = appDownloadTask.a();
        ex.Code("AppDownBtn", "refreshStatus, dwnStatus:%s, pkg:%s", Integer.valueOf(a10), str);
        da.n nVar2 = da.n.PAUSE;
        da.n nVar3 = da.n.DOWNLOAD;
        switch (a10) {
            case 0:
                int g6 = appDownloadTask.g();
                int k10 = appDownloadTask.k();
                this.f23633d = k10;
                if (g6 != 0 || k10 > 0) {
                    return nVar2;
                }
                return nVar3;
            case 1:
            case 2:
                nVar = da.n.DOWNLOADING;
                break;
            case 3:
                return da.n.INSTALL;
            case 4:
                int k11 = appDownloadTask.k();
                this.f23633d = k11;
                if (k11 > 0) {
                    return nVar2;
                }
                return nVar3;
            case 5:
                nVar = da.n.INSTALLING;
                break;
            case 6:
                if (z10) {
                    return da.n.INSTALLED;
                }
                ex.Code("AppDownBtn", " hasInstalled=%s", Boolean.valueOf(z10));
                com.huawei.openalliance.ad.download.app.a.t().c(appDownloadTask);
                return nVar3;
            default:
                return nVar3;
        }
        this.f23633d = appDownloadTask.k();
        return nVar;
    }

    public void B() {
        Context context = getContext();
        if (!(context instanceof Activity) || getStatus() != da.n.DOWNLOAD || !this.f23640l || !this.f23641m) {
            S();
            return;
        }
        dl dlVar = new dl(context);
        dlVar.Code(new l());
        this.f23642n = true;
        dlVar.Code(this.C, this.f23634e, getLeftSize());
    }

    public void V() {
        Code(new o(this));
    }

    public void Z() {
        ex.Code("AppDownBtn", "downloadInMobileData");
        if (q()) {
            B();
            return;
        }
        ex.Code("AppDownBtn", "not useAgMobileDataTipsDialog");
        Cdo cdo = new Cdo(getContext());
        cdo.Code(new k());
        cdo.Code(this.C, this.f23634e, getLeftSize());
    }

    public AppDownloadButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23633d = -1;
        this.f = true;
        this.f23635g = 1;
        this.f23636h = 2;
        this.f23639k = true;
        this.f23641m = true;
        this.f23642n = false;
        this.f23643p = true;
        this.f23644q = -1;
        this.f23646s = false;
        Code(context, attributeSet, i10, -1);
    }

    private String Code(int i10, da.n nVar) {
        String str = null;
        if (androidx.transition.n.h(this.f23637i)) {
            return null;
        }
        int i11 = 2;
        int i12 = 1 == i10 ? 2 : 1;
        switch (TextState.a.f21962a[nVar.ordinal()]) {
            case 1:
                i11 = 1;
                break;
            case 2:
                i11 = 3;
                break;
            case 3:
                break;
            case 4:
                i11 = 6;
                break;
            case 5:
                i11 = 4;
                break;
            case 6:
                i11 = 5;
                break;
            default:
                i11 = -1;
                break;
        }
        String i13 = gb.z.i();
        Iterator<TextState> it = this.f23637i.iterator();
        String str2 = null;
        String str3 = null;
        while (true) {
            if (it.hasNext()) {
                TextState next = it.next();
                if (next != null && i12 == next.p()) {
                    if (i11 == next.r()) {
                        if (i13.equalsIgnoreCase(new Locale(next.q()).getLanguage())) {
                            str = next.u();
                        } else if (1 == next.k()) {
                            str2 = next.u();
                        }
                    }
                    if (next.r() == 0) {
                        str3 = next.u();
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            str3 = str2;
        }
        return gb.p.j(str3);
    }

    private void I(AppDownloadTask appDownloadTask) {
        int i10;
        da.n nVar;
        if (ex.Code()) {
            Object[] objArr = new Object[3];
            objArr[0] = this.f23631b;
            objArr[1] = this.f23632c;
            AppInfo appInfo = this.C;
            objArr[2] = appInfo == null ? null : appInfo.q();
            ex.Code("AppDownBtn", "processStatus, status:%s, preStatus:%s, packageName:%s", objArr);
        }
        boolean F = F();
        da.n nVar2 = da.n.DOWNLOAD;
        if (F && this.f23631b != da.n.INSTALLED) {
            Code(nVar2);
            return;
        }
        Context context = getContext();
        s.b Code = this.S.Code(getContext(), this.f23631b);
        setTextColor(Code.f24157b);
        if (this.f23643p) {
            int i11 = this.f23633d;
            Drawable drawable = Code.f24156a;
            if (i11 != -1) {
                Code(drawable, i11);
            } else {
                setProgressDrawable(drawable);
            }
        }
        V(this.f23631b);
        switch (g.f23654a[this.f23631b.ordinal()]) {
            case 1:
                Code(context, this.f23635g, nVar2);
                return;
            case 2:
                i10 = this.f23635g;
                nVar = da.n.PAUSE;
                break;
            case 3:
                i10 = this.f23635g;
                nVar = da.n.DOWNLOADING;
                break;
            case 4:
                Code(context);
                return;
            case 5:
                Code(appDownloadTask, context);
                return;
            case 6:
                V(appDownloadTask, context);
                return;
            default:
                return;
        }
        Code(context, i10, nVar);
        setProgress(this.f23633d);
    }

    private void Z(AppDownloadTask appDownloadTask) {
        if (this.C == null || this.f23634e == null) {
            ex.I("AppDownBtn", "installApk, appinfo or content record is null");
        } else {
            com.huawei.openalliance.ad.download.app.a.t().s(appDownloadTask);
        }
    }

    @Override // ca.c
    public void V(AppDownloadTask appDownloadTask) {
        StringBuilder sb2 = new StringBuilder("onStatusChanged, taskId:");
        sb2.append(appDownloadTask.h());
        sb2.append(", packageName");
        AppInfo appInfo = this.C;
        sb2.append(appInfo == null ? null : appInfo.q());
        sb2.append(", status:");
        sb2.append(appDownloadTask.a());
        ex.V("AppDownBtn", sb2.toString());
        AppInfo appInfo2 = this.C;
        if (appInfo2 == null || !appInfo2.q().equals(appDownloadTask.h())) {
            return;
        }
        gb.w.b(new a());
    }

    public AppDownloadButton(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f23633d = -1;
        this.f = true;
        this.f23635g = 1;
        this.f23636h = 2;
        this.f23639k = true;
        this.f23641m = true;
        this.f23642n = false;
        this.f23643p = true;
        this.f23644q = -1;
        this.f23646s = false;
        Code(context, attributeSet, i10, i11);
    }

    private void V(AppDownloadTask appDownloadTask, Context context) {
        if (appDownloadTask != null) {
            Code(context, this.f23635g, da.n.INSTALLING);
        }
    }

    @Override // ca.c
    public void I(String str) {
        V(str);
    }

    @Override // com.huawei.hms.ads.js
    public void Z(String str) {
        AdContentData adContentData = this.f23634e;
        if (adContentData != null) {
            adContentData.y(str);
        }
    }

    private String Code(Context context, da.n nVar) {
        int i10;
        if (context == null || nVar == null) {
            return "";
        }
        switch (g.f23654a[nVar.ordinal()]) {
            case 1:
                return ch.Code(context, this.C);
            case 2:
                i10 = R.string.hiad_download_resume;
                break;
            case 3:
                return NumberFormat.getPercentInstance().format((this.f23633d * 1.0f) / 100.0f);
            case 4:
                return ch.Code(context, this.C, this.f23644q);
            case 5:
                i10 = R.string.hiad_download_install;
                break;
            case 6:
                i10 = R.string.hiad_download_installing;
                break;
            default:
                return null;
        }
        return context.getString(i10);
    }

    @Override // ca.c
    public void V(String str) {
        AppInfo appInfo = this.C;
        if (appInfo == null || str == null || !str.equals(appInfo.q())) {
            return;
        }
        gb.w.b(new e());
    }

    @Override // com.huawei.hms.ads.js
    public void Code(long j10) {
        AdContentData adContentData = this.f23634e;
        if (adContentData != null) {
            adContentData.b0(j10);
        }
    }

    public void V(String str, int i10) {
        if (this.f23634e != null) {
            o();
            if (i10 == 1 || this.f23634e.a0() == 7 || this.f23634e.a0() == 12) {
                jh.Code(getContext(), this.f23634e, 0, 0, str, i10, this.f23645r, a0.a.k(getContext()), gb.u.p(this));
                this.f23645r = null;
                p();
            }
        }
    }

    private void Code(Context context) {
        Code(context, this.f23635g, da.n.INSTALLED);
    }

    private boolean V(Context context) {
        boolean a10 = new fb.e(context, this.f23634e).a();
        if (a10) {
            PPSAppDownloadManager.h(this.C);
            o();
            jh.Code(context, this.f23634e, 0, 0, com.huawei.openalliance.ad.constant.v.Z, this.f23635g, this.f23645r, a0.a.k(getContext()), gb.u.p(this));
            this.f23645r = null;
            p();
        }
        return a10;
    }

    private void Code(Context context, int i10, da.n nVar) {
        String Code = Code(i10, nVar);
        if (TextUtils.isEmpty(Code)) {
            Code((CharSequence) Code(context, nVar), true, nVar);
            return;
        }
        if (this.f23646s && i10 == 1 && nVar == da.n.DOWNLOADING) {
            StringBuilder j10 = com.ironsource.adapters.facebook.a.j(Code);
            j10.append(NumberFormat.getPercentInstance().format((this.f23633d * 1.0f) / 100.0f));
            Code = j10.toString();
        }
        Code((CharSequence) Code, false, nVar);
    }

    public void Code(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.S = new s(context);
        super.setPadding(0, 0, 0, 0);
        setOnClickListener(this);
        setCancelBtnClickListener(new n(this));
    }

    @Override // ca.c
    public void Code(AppDownloadTask appDownloadTask) {
        AppInfo appInfo = this.C;
        if (appInfo == null || !appInfo.q().equals(appDownloadTask.h())) {
            return;
        }
        gb.w.b(new c());
    }

    private void Code(AppDownloadTask appDownloadTask, Context context) {
        if (appDownloadTask != null) {
            Code(context, this.f23635g, da.n.INSTALL);
        }
    }

    private void Code(a.c cVar) {
        com.huawei.openalliance.ad.download.app.a.t().r(this.C, cVar);
        I();
        setOnNonWifiDownloadListener(null);
        setNeedShowConfirmDialog(true);
    }

    private void Code(da.n nVar) {
        s.b Code = this.S.Code(getContext(), nVar);
        setTextColor(Code.f24157b);
        setProgressDrawable(Code.f24156a);
        Code(getContext(), this.f23635g, nVar);
    }

    public void Code(CharSequence charSequence, boolean z10, da.n nVar) {
        super.setText(charSequence);
    }

    @Override // ca.c
    public void Code(String str) {
        if (ex.Code()) {
            Object[] objArr = new Object[2];
            objArr[0] = str;
            AppInfo appInfo = this.C;
            objArr[1] = appInfo == null ? null : appInfo.q();
            ex.Code("AppDownBtn", "onStatusChanged, packageName:%s, packageName %s", objArr);
        }
        AppInfo appInfo2 = this.C;
        if (appInfo2 == null || !appInfo2.q().equals(str)) {
            return;
        }
        gb.w.b(new b());
    }

    @Override // ca.b
    public void Code(String str, int i10) {
        if (ex.Code()) {
            ex.Code("AppDownBtn", "status %s, packageName:%s", Integer.valueOf(i10), str);
        }
        if (ch.Code(this.C)) {
            gb.w.b(new f(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code(boolean z10) {
        ex.V("AppDownBtn", "processDownload, needShowPermissionDialog = %s", Boolean.valueOf(z10));
        if (!a0.a.v(getContext())) {
            Toast.makeText(getContext(), R.string.hiad_network_no_available, 0).show();
            return;
        }
        if (this.C.i0() && this.f && z10) {
            da.m.a(getContext(), this.C, new j());
            return;
        }
        if (!a0.a.s(getContext())) {
            long leftSize = getLeftSize();
            r rVar = this.L;
            if (rVar == null) {
                Z();
                return;
            } else if (!rVar.Code(this.C, leftSize)) {
                return;
            }
        }
        B();
    }

    private boolean Code(Context context, String str) {
        boolean c10 = gb.b0.c(context, str, this.C.D());
        if (c10) {
            PPSAppDownloadManager.h(this.C);
            o();
            jh.Code(context, this.f23634e, "intentSuccess", (Integer) 1, (Integer) null);
            jh.Code(context, this.f23634e, 0, 0, "app", this.f23635g, this.f23645r, a0.a.k(getContext()), gb.u.p(this));
        } else {
            ex.V("AppDownBtn", "handClick, openAppIntent fail");
            jh.Code(getContext(), this.f23634e, ah.D, (Integer) 1, Integer.valueOf(gb.b0.b(context, str) ? 2 : 1));
            boolean h10 = gb.b0.h(context, str);
            if (!h10) {
                ex.V("AppDownBtn", "handClick, openAppMainPage fail");
                return h10;
            }
            o();
            jh.Code(context, this.B.m(), (Integer) 1);
            PPSAppDownloadManager.h(this.C);
            jh.Code(context, this.f23634e, 0, 0, "app", this.f23635g, this.f23645r, a0.a.k(getContext()), gb.u.p(this));
            c10 = h10;
        }
        this.f23645r = null;
        p();
        return c10;
    }

    /* loaded from: classes2.dex */
    public class k implements dk.a {
        public k() {
        }

        @Override // com.huawei.hms.ads.dk.a
        public final void Code(AppInfo appInfo) {
            AppDownloadButton appDownloadButton = AppDownloadButton.this;
            appDownloadButton.setAllowedNonWifiNetwork(true);
            appDownloadButton.setNeedShowConfirmDialog(false);
            appDownloadButton.B();
        }

        @Override // com.huawei.hms.ads.dk.a
        public final void V(AppInfo appInfo) {
        }
    }

    /* loaded from: classes2.dex */
    public class l implements dk.a {
        public l() {
        }

        @Override // com.huawei.hms.ads.dk.a
        public final void Code(AppInfo appInfo) {
            AppDownloadButton appDownloadButton = AppDownloadButton.this;
            appDownloadButton.setNeedShowConfirmDialog(false);
            appDownloadButton.S();
        }

        @Override // com.huawei.hms.ads.dk.a
        public final void V(AppInfo appInfo) {
        }
    }

    @Override // com.huawei.hms.ads.js
    public boolean Code(com.huawei.openalliance.ad.inter.data.e eVar) {
        if (eVar == null) {
            setAppInfo(null);
            this.f23634e = null;
            this.B = null;
            return false;
        }
        if (eVar instanceof com.huawei.openalliance.ad.inter.data.j) {
            this.B = (com.huawei.openalliance.ad.inter.data.j) eVar;
        }
        try {
            this.f23635g = 1;
            this.f23634e = this.B.m();
            AppInfo w10 = eVar.w();
            setAppInfo(w10);
            com.huawei.openalliance.ad.inter.data.j jVar = this.B;
            if (jVar != null) {
                MetaData h_ = jVar.h_();
                if (h_ != null) {
                    this.f23637i = h_.O();
                }
                this.f23640l = jf.B(this.B.A());
            }
            if (w10 != null) {
                setShowPermissionDialog(w10.K());
                return true;
            }
        } catch (RuntimeException | Exception unused) {
            ex.Z("AppDownBtn", "setNativeAd ex");
        }
        return false;
    }

    public void setButtonTextWatcher(m mVar) {
    }

    public void setButtonTextWatcherInner(p pVar) {
    }
}
