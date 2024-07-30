package com.ironsource.mediationsdk.adunit.b;

import a3.l;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class j extends sb.a {
    public j(d dVar) {
        super(dVar);
    }

    public final void a(int i10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        hashMap.put("reason", str);
        a(b.TROUBLESHOOT_LOAD_FAILED, hashMap);
    }

    public final void b(int i10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        hashMap.put("reason", str);
        a(b.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, hashMap);
    }

    public final void c(String str) {
        a(b.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, l.t("reason", str));
    }

    public final void d(String str) {
        a(b.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, l.t("reason", str));
    }

    public final void e(String str) {
        a(b.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, l.t("reason", str));
    }

    public final void f(String str) {
        a(b.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, l.t("reason", str));
    }

    public final void g(String str) {
        a(b.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, l.t("reason", str));
    }

    public final void h(String str) {
        a(b.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, l.t("reason", str));
    }

    public final void i(String str) {
        a(b.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, l.t("reason", str));
    }

    public final void j(String str) {
        a(b.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, l.t("reason", str));
    }

    public final void k(String str) {
        a(b.TROUBLESHOOT_UNEXPECTED_CLOSED, l.t("reason", str));
    }

    public final void l(String str) {
        a(b.TROUBLESHOOT_UNEXPECTED_TIMEOUT, l.t("reason", str));
    }

    public final void m(String str) {
        a(b.TROUBLESHOOT_INTERNAL_ERROR, l.t("reason", str));
    }

    public final void n(String str) {
        a(b.TROUBLESHOOT_ADAPTER_BRIDGE_INTERNAL_ERROR, l.t("reason", str));
    }

    public final void o(String str) {
        a(b.TROUBLESHOOTING_WATERFALL_OVERHEAD, l.t("reason", str));
    }

    public final void p(String str) {
        a(b.TROUBLESHOOT_AD_EXPIRED, l.t("reason", str));
    }

    public final void a(int i10, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        hashMap.put("reason", str);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        a(b.TROUBLESHOOT_NOTIFICATION_ERROR, hashMap);
    }

    public final void b(String str) {
        a(b.TROUBLESHOOT_AD_ADAPTER_NOT_AVAILABLE, l.t("reason", str));
    }

    public final void a(String str) {
        a(b.TROUBLESHOOT_NETWORK_ADAPTER_NOT_AVAILABLE, l.t("reason", str));
    }

    public final void a(Map<String, Object> map, String str) {
        HashMap t10 = l.t("reason", str);
        if (map != null && !map.isEmpty()) {
            t10.putAll(map);
        }
        a(b.TROUBLESHOOT_BIDDING_DATA_MISSING, t10);
    }
}
