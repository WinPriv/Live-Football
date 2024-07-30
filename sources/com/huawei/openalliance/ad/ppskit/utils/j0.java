package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import ka.n7;

/* loaded from: classes2.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final ContentRecord f22879a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f22880b;

    public j0(Context context, ContentRecord contentRecord) {
        n7.e("ILandingJs", "ILandingJs added");
        this.f22879a = contentRecord;
        this.f22880b = context;
    }

    public final void a(String str, String str2, boolean z10) {
        String str3;
        n7.e("ILandingJs", "call event report from js");
        ContentRecord contentRecord = this.f22879a;
        boolean z11 = false;
        if (contentRecord != null && ("2".equals(contentRecord.f1()) || "1".equals(contentRecord.f1()))) {
            z11 = true;
        }
        if (!z11) {
            str3 = "has no permission to report event";
        } else if (TextUtils.isEmpty(str2)) {
            str3 = "additionalinfo is null";
        } else {
            if (contentRecord == null) {
                n7.g("event", "onLandingEventReport, ad data is null");
                return;
            }
            AdEventReport y = androidx.activity.n.y(contentRecord);
            y.L(str);
            y.k0(str2);
            y.A(Boolean.valueOf(z10));
            androidx.activity.n.P(this.f22880b, "rptLandingEvent", y);
            return;
        }
        n7.g("ILandingJs", str3);
    }

    @JavascriptInterface
    public void eventReport(String str, String str2) {
        a(str, str2, false);
    }

    @JavascriptInterface
    public void eventReport(String str, String str2, boolean z10) {
        a(str, str2, z10);
    }
}
