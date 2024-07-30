package com.ironsource.mediationsdk.adunit.a;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.a;
import com.ironsource.environment.c;
import com.ironsource.environment.c.a;
import com.ironsource.environment.h;
import com.ironsource.environment.k;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    public static int a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_INIT_EXCEPTION;
        }
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_INIT_EXCEPTION;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
        return IronSourceError.ERROR_CODE_GENERIC;
    }

    public static int b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_LOAD_DURING_SHOW;
        }
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_LOAD_DURING_SHOW;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
        return IronSourceError.ERROR_CODE_GENERIC;
    }

    public static int c(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES;
        }
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return 1024;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
        return IronSourceError.ERROR_CODE_GENERIC;
    }

    public static void a(Context context) {
        com.ironsource.environment.c.a aVar = a.C0321a.f24648a;
        if (context != null) {
            try {
                if (!aVar.f24647c.getAndSet(true)) {
                    aVar.a("auid", h.y(context));
                    aVar.a("model", h.g());
                    aVar.a("make", h.h());
                    aVar.a("os", h.i());
                    String e10 = h.e();
                    if (e10 != null) {
                        aVar.a("osv", e10.replaceAll("[^0-9/.]", ""));
                        aVar.a("osvf", e10);
                    }
                    aVar.a("apilvl", String.valueOf(h.f()));
                    String i10 = h.i(context);
                    if (!TextUtils.isEmpty(i10)) {
                        aVar.a("carrier", i10);
                    }
                    String d10 = c.d(context);
                    if (!TextUtils.isEmpty(d10)) {
                        aVar.a("instlr", d10);
                    }
                    String A = h.A(context);
                    if (!TextUtils.isEmpty(A)) {
                        aVar.a("dt", A);
                    }
                    aVar.a("bid", context.getPackageName());
                    aVar.a("mem", String.valueOf(h.d(context)));
                    aVar.a("tkv", "2.0");
                    aVar.a("tsu", Long.valueOf(c.b(context)));
                    aVar.a("tai", Long.valueOf(c.a(context)));
                    aVar.a("apv", c.c(context));
                    aVar.a("ptype", Integer.valueOf(a.AnonymousClass1.f(context)));
                    aVar.a("simop", a.AnonymousClass1.e(context));
                    aVar.a("stid", k.b(context));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        aVar.b(context);
    }

    public static void a(String str, Object obj) {
        a.C0321a.f24648a.a(str, obj);
    }

    public static void a(String str, JSONObject jSONObject) {
        com.ironsource.environment.c.a aVar = a.C0321a.f24648a;
        if (jSONObject == null) {
            return;
        }
        try {
            Object obj = aVar.f24645a.get(str);
            if (!(obj instanceof JSONObject)) {
                aVar.a(str, jSONObject);
                return;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.putOpt(next, jSONObject.opt(next));
            }
            aVar.a(str, jSONObject2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void a(Map<String, Object> map) {
        com.ironsource.environment.c.a aVar = a.C0321a.f24648a;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    if (map.containsKey(str)) {
                        aVar.a(str, map.get(str));
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
