package com.ironsource.mediationsdk.adunit.b;

import a3.l;
import android.text.TextUtils;
import com.huawei.hms.ads.ep;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a extends sb.a {
    public a(d dVar) {
        super(dVar);
    }

    public final void a() {
        a(b.SESSION_CAPPED, (HashMap) null);
    }

    public final void b(String str) {
        a(b.SHOW_AD_SUCCESS, l.t("placement", str));
    }

    public final void c(String str) {
        a(b.AD_OPENED, l.t("placement", str));
    }

    public final void d(String str) {
        a(b.AD_CLICKED, l.t("placement", str));
    }

    public final void e(String str) {
        a(b.AD_STARTED, l.t("placement", str));
    }

    public final void f(String str) {
        a(b.AD_ENDED, l.t("placement", str));
    }

    public final void g(String str) {
        a(b.AD_VISIBLE, l.t("placement", str));
    }

    public final void h(String str) {
        a(b.PLACEMENT_CAPPED, l.t("placement", str));
    }

    public final void a(String str) {
        a(b.SHOW_AD, l.t("placement", str));
    }

    public final void a(String str, int i10, String str2, String str3) {
        HashMap t10 = l.t("placement", str);
        t10.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        t10.put("reason", str2);
        if (!TextUtils.isEmpty(str3)) {
            t10.put(IronSourceConstants.EVENTS_EXT1, str3);
        }
        a(b.SHOW_AD_FAILED, t10);
    }

    public final void a(String str, String str2) {
        HashMap t10 = l.t("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            t10.put(IronSourceConstants.EVENTS_EXT1, str2);
        }
        a(b.AD_CLOSED, t10);
    }

    public final void a(String str, String str2, int i10, long j10, String str3, long j11, Map<String, Object> map, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        hashMap.put(IronSourceConstants.EVENTS_REWARD_NAME, str2);
        hashMap.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(i10));
        hashMap.put(IronSourceConstants.EVENTS_TRANS_ID, str3);
        if (j11 != 0) {
            hashMap.put("duration", Long.valueOf(j11));
        }
        hashMap.putAll(map);
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, str4);
        }
        this.f35304a.b(b.AD_REWARDED, hashMap, j10);
    }

    public final void a(boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("status", z10 ? ep.Code : ep.V);
        a(b.SHOW_AD_CHANCE, hashMap);
    }
}
