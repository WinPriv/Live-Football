package com.anythink.core.common;

import android.text.TextUtils;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustEvent;
import com.appsflyer.AppsFlyerLib;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class q {

    /* renamed from: c, reason: collision with root package name */
    private static volatile q f6382c;

    /* renamed from: a, reason: collision with root package name */
    private final String f6383a = "1";

    /* renamed from: b, reason: collision with root package name */
    private final String f6384b = "2";

    private q() {
    }

    public static q a() {
        if (f6382c == null) {
            synchronized (q.class) {
                if (f6382c == null) {
                    f6382c = new q();
                }
            }
        }
        return f6382c;
    }

    public static void a(com.anythink.core.common.e.e eVar) {
        if (eVar == null) {
            return;
        }
        try {
            com.anythink.core.c.d a10 = com.anythink.core.c.e.a(com.anythink.core.common.b.n.a().g()).a(eVar.W());
            if (a10 != null) {
                String B = a10.B();
                if (TextUtils.isEmpty(B)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(B);
                JSONObject optJSONObject = jSONObject.optJSONObject("1");
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY);
                    if (!TextUtils.isEmpty(optString)) {
                        String p10 = eVar.p();
                        double w10 = eVar.w() / 1000.0d;
                        String l10 = eVar.l();
                        try {
                            AdjustEvent adjustEvent = new AdjustEvent(optString);
                            adjustEvent.setRevenue(w10, p10);
                            adjustEvent.setOrderId(l10);
                            Adjust.trackEvent(adjustEvent);
                        } catch (Throwable unused) {
                        }
                    }
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("2");
                if (optJSONObject2 != null) {
                    int optInt = optJSONObject2.optInt("rtye");
                    HashMap hashMap = new HashMap();
                    hashMap.put("af_order_id", eVar.l());
                    hashMap.put("af_content_id", eVar.W());
                    hashMap.put("af_content_type", eVar.Y());
                    hashMap.put("af_revenue", Double.valueOf(optInt == 2 ? eVar.w() : eVar.w() / 1000.0d));
                    hashMap.put("af_currency", "USD");
                    AppsFlyerLib.getInstance().trackEvent(com.anythink.core.common.b.n.a().g(), "af_ad_view", hashMap);
                }
            }
        } catch (Throwable unused2) {
        }
    }

    private static void a(String str, double d10, String str2, String str3) {
        try {
            AdjustEvent adjustEvent = new AdjustEvent(str);
            adjustEvent.setRevenue(d10, str2);
            adjustEvent.setOrderId(str3);
            Adjust.trackEvent(adjustEvent);
        } catch (Throwable unused) {
        }
    }
}
