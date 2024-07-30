package com.huawei.openalliance.ad.ppskit.activity;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MenuItem;
import android.webkit.JavascriptInterface;
import androidx.activity.n;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.ppskit.beans.feedback.AdditionalContext;
import com.huawei.openalliance.ad.ppskit.beans.feedback.ComplainAddInfo;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import j7.r;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import ka.Cif;
import ka.bj;
import ka.n7;
import ka.q9;

/* loaded from: classes2.dex */
public class AdComplainActivity extends BasePureWebActivity {

    /* renamed from: w, reason: collision with root package name */
    public static String f22310w;

    /* renamed from: u, reason: collision with root package name */
    public bj f22311u;

    /* renamed from: v, reason: collision with root package name */
    public String f22312v;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22313s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f22314t;

        public a(Context context, String str) {
            this.f22313s = context;
            this.f22314t = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            Context context = this.f22313s;
            String c10 = ConfigSpHandler.b(context).c("complainH5Server", this.f22314t);
            boolean isEmpty = TextUtils.isEmpty(c10);
            AdComplainActivity adComplainActivity = AdComplainActivity.this;
            if (isEmpty && Cif.a(adComplainActivity).d()) {
                n7.e("AdComplainActivity", "grs url return null or empty, use local defalut url.");
                c10 = q9.a(context, "complainH5Server");
            }
            String str2 = AdComplainActivity.f22310w;
            adComplainActivity.getClass();
            if (y1.h(c10)) {
                str = "";
            } else {
                str = c10 + Locale.getDefault().getLanguage().toLowerCase(Locale.getDefault()) + "-" + Locale.getDefault().getCountry().toLowerCase(Locale.getDefault());
            }
            if (!TextUtils.isEmpty(str)) {
                n7.c("AdComplainActivity", "fullUrl= %s", str);
                n7.f("AdComplainActivity", "fullUrl= %s", y1.j(str));
                adComplainActivity.f22311u.a(str);
            } else {
                n7.g("AdComplainActivity", "url is empty");
                adComplainActivity.finish();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b {
        @JavascriptInterface
        public String complainAddInfo() {
            n7.c("AdComplainActivity", "add info: %s", AdComplainActivity.f22310w);
            return AdComplainActivity.f22310w;
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final void b() {
        ContentRecord l10;
        String uuid;
        n7.e("AdComplainActivity", "initLayout");
        setContentView(R.layout.pure_web_activity_layout);
        SafeIntent safeIntent = new SafeIntent(getIntent());
        String stringExtra = safeIntent.getStringExtra(ba.aw);
        this.f22312v = stringExtra;
        String str = "";
        if (stringExtra == null) {
            this.f22312v = "";
        }
        String stringExtra2 = safeIntent.getStringExtra("slotid");
        String stringExtra3 = safeIntent.getStringExtra("content_id");
        String stringExtra4 = safeIntent.getStringExtra("package_name");
        int intExtra = safeIntent.getIntExtra("apiVer", 2);
        Context applicationContext = getApplicationContext();
        if (intExtra != 3) {
            try {
                l10 = r.l(applicationContext, stringExtra4, stringExtra3, stringExtra2);
            } catch (Throwable th) {
                n7.f("FeedbackUtil", "get add info err: %s", th.getClass().getSimpleName());
            }
        } else {
            l10 = null;
        }
        ComplainAddInfo complainAddInfo = new ComplainAddInfo();
        AdditionalContext additionalContext = new AdditionalContext();
        Pair c02 = n.c0(applicationContext, stringExtra4);
        if (c02 != null) {
            uuid = (String) c02.first;
        } else {
            HashMap hashMap = d0.f22830a;
            uuid = UUID.randomUUID().toString();
        }
        complainAddInfo.b(uuid);
        a0.a.W(stringExtra3, intExtra, l10, additionalContext);
        additionalContext.g(androidx.transition.n.Q(y0.q(null, additionalContext)));
        additionalContext.e(stringExtra2);
        complainAddInfo.a(additionalContext);
        n7.f("FeedbackUtil", "add info: %s", additionalContext.toString());
        str = y0.q(null, complainAddInfo);
        f22310w = str;
        bj bjVar = (bj) findViewById(R.id.webview);
        this.f22311u = bjVar;
        bjVar.a(new b(), "complainJSInterface");
        p2.a(new a(this, a0.a.K(this).a()), 1);
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final String d() {
        return null;
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.BasePureWebActivity
    public final String k() {
        return this.f22312v;
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.BasePureWebActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return false;
    }
}
