package com.huawei.openalliance.ad.ppskit.activity;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.ppskit.handlers.l;
import com.huawei.openalliance.ad.ppskit.utils.ServerConfig;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import e0.i;
import java.util.Locale;
import ka.Cif;
import ka.bj;
import ka.n7;
import ka.v;

/* loaded from: classes2.dex */
public class SplashFeedbackActivity extends BasePureWebActivity {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f22421w = 0;

    /* renamed from: u, reason: collision with root package name */
    public bj f22422u;

    /* renamed from: v, reason: collision with root package name */
    public String f22423v;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22424s;

        public a(Context context) {
            this.f22424s = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            Context context = this.f22424s;
            String a10 = a0.a.K(context).a(this.f22424s, ServerConfig.a(), a0.a.K(context).a(), ServerConfig.b(), "h5Server");
            SplashFeedbackActivity splashFeedbackActivity = SplashFeedbackActivity.this;
            String c10 = y1.c(splashFeedbackActivity, "haid_h5_content_server");
            if (TextUtils.isEmpty(a10) && Cif.a(splashFeedbackActivity).d()) {
                n7.e("SplashFeedbackActivity", "grs url return null or empty, use local defalut url.");
                a10 = c10;
            }
            String h10 = com.ironsource.adapters.facebook.a.h(a10, "/cch5/pps-jssdk/h5-splashfeedback/index.html");
            int i10 = SplashFeedbackActivity.f22421w;
            if (y1.h(h10)) {
                str = "";
            } else {
                str = h10 + "?language=" + i.f(Locale.getDefault().getLanguage().toLowerCase(Locale.getDefault()), "-", Locale.getDefault().getCountry().toUpperCase(Locale.getDefault())) + "&script=" + z1.H(splashFeedbackActivity) + "&version=" + System.currentTimeMillis();
            }
            if (!TextUtils.isEmpty(str)) {
                n7.f("SplashFeedbackActivity", "url= %s", y1.j(str));
                splashFeedbackActivity.f22422u.a(str);
            } else {
                n7.e("SplashFeedbackActivity", "url is null");
                splashFeedbackActivity.finish();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f22426a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22427b;

        /* renamed from: c, reason: collision with root package name */
        public final String f22428c;

        /* renamed from: d, reason: collision with root package name */
        public final String f22429d;

        public b(Context context, String str, String str2, int i10) {
            this.f22426a = context;
            this.f22429d = str;
            this.f22427b = i10;
            this.f22428c = str2;
        }

        @JavascriptInterface
        public void back() {
            n7.b("SplashFeedbackActivity", "back");
            Context context = this.f22426a;
            if (context instanceof PPSBaseActivity) {
                ((PPSBaseActivity) context).finishAndRemoveTask();
            }
        }

        @JavascriptInterface
        public String getSplashFeedbackBtnText() {
            return this.f22428c;
        }

        @JavascriptInterface
        public boolean isDarkMode() {
            return z1.T(this.f22426a);
        }

        @JavascriptInterface
        public boolean openLinkInBrowser(String str) {
            return d0.h(this.f22426a, str);
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void submit(java.lang.String r13, int r14) {
            /*
                Method dump skipped, instructions count: 331
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.activity.SplashFeedbackActivity.b.submit(java.lang.String, int):void");
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final void b() {
        String string;
        n7.b("SplashFeedbackActivity", "initLayout");
        setContentView(R.layout.pure_web_activity_layout);
        String f = f();
        new v(getApplicationContext()).l(f, "146", "", "", "");
        int intExtra = getIntent().getIntExtra(ba.ah, 0);
        l d10 = l.d(this);
        synchronized (d10.f22585a) {
            string = d10.G(f).getString("splashFeedbackBtnText", "");
        }
        this.f22423v = string;
        bj bjVar = (bj) findViewById(R.id.webview);
        this.f22422u = bjVar;
        bjVar.a(new b(this, f, this.f22423v, intExtra), "_ISplashFeedbackJS");
        p2.a(new a(this), 1);
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final String d() {
        return "SplashFeedbackActivity";
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final String f() {
        String str;
        try {
            str = getIntent().getStringExtra(ba.y);
        } catch (Throwable th) {
            i.p(th, "get caller error:", "SplashFeedbackActivity");
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return super.f();
    }
}
