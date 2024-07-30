package com.ironsource.mediationsdk.server;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.openalliance.ad.constant.bj;
import com.ironsource.environment.a;
import com.ironsource.environment.c;
import com.ironsource.environment.h;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.g;
import com.vungle.warren.model.Cookie;
import e0.i;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class ServerURL {
    public static String a(Vector<Pair<String, String>> vector) {
        Iterator<Pair<String, String>> it = vector.iterator();
        String str = "";
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            if (str.length() > 0) {
                str = str.concat(ContainerUtils.FIELD_DELIMITER);
            }
            StringBuilder j10 = com.ironsource.adapters.facebook.a.j(str);
            j10.append((String) next.first);
            j10.append(ContainerUtils.KEY_VALUE_DELIMITER);
            j10.append(URLEncoder.encode((String) next.second, "UTF-8"));
            str = j10.toString();
        }
        return str;
    }

    public static String getCPVProvidersURL(Context context, String str, String str2, String str3, String str4, boolean z10, Vector<Pair<String, String>> vector, boolean z11) {
        String str5;
        String str6;
        Vector vector2 = new Vector();
        vector2.add(new Pair("platform", "android"));
        vector2.add(new Pair("applicationKey", str));
        vector2.add(new Pair("applicationUserId", str2));
        vector2.add(new Pair(bj.f.Code, IronSourceUtils.getSDKVersion()));
        if (z10) {
            if (z10) {
                str6 = "1";
            } else {
                str6 = "0";
            }
            vector2.add(new Pair("rvManual", str6));
        }
        if (IronSourceUtils.getSerr() == 0) {
            vector2.add(new Pair("serr", String.valueOf(IronSourceUtils.getSerr())));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginType())) {
            vector2.add(new Pair("pluginType", ConfigFile.getConfigFile().getPluginType()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginVersion())) {
            vector2.add(new Pair("pluginVersion", ConfigFile.getConfigFile().getPluginVersion()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginFrameworkVersion())) {
            vector2.add(new Pair("plugin_fw_v", ConfigFile.getConfigFile().getPluginFrameworkVersion()));
        }
        if (!TextUtils.isEmpty(str3)) {
            vector2.add(new Pair("advId", str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            vector2.add(new Pair("mt", str4));
        }
        String c10 = c.c(context, context.getPackageName());
        if (!TextUtils.isEmpty(c10)) {
            vector2.add(new Pair("appVer", c10));
        }
        int i10 = Build.VERSION.SDK_INT;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        vector2.add(new Pair("osVer", sb2.toString()));
        vector2.add(new Pair("devMake", Build.MANUFACTURER));
        vector2.add(new Pair("devModel", Build.MODEL));
        boolean firstSession = IronSourceUtils.getFirstSession(context);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(firstSession ? 1 : 0);
        vector2.add(new Pair("fs", sb3.toString()));
        ConcurrentHashMap<String, List<String>> d10 = com.ironsource.d.b.a().d();
        if (d10.containsKey("is_child_directed")) {
            vector2.add(new Pair(Cookie.COPPA_KEY, d10.get("is_child_directed").get(0)));
        }
        String connectionType = IronSourceUtils.getConnectionType(context);
        if (!TextUtils.isEmpty(connectionType)) {
            vector2.add(new Pair("connType", connectionType));
        }
        if (vector != null) {
            vector2.addAll(vector);
        }
        String q10 = h.q();
        if (q10.length() != 0) {
            vector2.add(new Pair("browserUserAgent", q10));
        }
        try {
            str5 = h.a(context) + "-" + h.b(context);
        } catch (Exception e10) {
            e10.printStackTrace();
            str5 = null;
        }
        if (str5 != null && str5.length() != 0) {
            vector2.add(new Pair("deviceLang", str5));
        }
        vector2.add(new Pair("bundleId", context.getPackageName()));
        StringBuilder sb4 = new StringBuilder();
        sb4.append(a.AnonymousClass1.c(context));
        vector2.add(new Pair("mcc", sb4.toString()));
        StringBuilder sb5 = new StringBuilder();
        sb5.append(a.AnonymousClass1.d(context));
        vector2.add(new Pair("mnc", sb5.toString()));
        String j10 = h.j(context);
        if (!TextUtils.isEmpty(j10)) {
            vector2.add(new Pair("icc", j10));
        }
        String i11 = h.i(context);
        if (!TextUtils.isEmpty(i11)) {
            vector2.add(new Pair("mCar", i11));
        }
        String c11 = h.c();
        if (!TextUtils.isEmpty(c11)) {
            vector2.add(new Pair(com.anythink.expressad.foundation.g.a.V, c11));
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(h.b());
        vector2.add(new Pair("tzOff", sb6.toString()));
        String y = h.y(context);
        if (!TextUtils.isEmpty(y)) {
            vector2.add(new Pair("auid", y));
        }
        if (z11) {
            vector2.add(new Pair(IronSourceConstants.EVENTS_DEMAND_ONLY, "1"));
        }
        vector2.addAll(IronSourceUtils.parseJsonToPairVector(new com.ironsource.environment.d.b().a()));
        String encode = URLEncoder.encode(IronSourceAES.encode(g.a().b(), a(vector2)), "UTF-8");
        StringBuilder sb7 = new StringBuilder();
        sb7.append("https://init.supersonicads.com/sdk/v" + IronSourceUtils.getSDKVersion() + "?request=");
        sb7.append(encode);
        return sb7.toString();
    }

    public static String getRequestURL(String str, boolean z10, int i10) {
        Vector vector = new Vector();
        vector.add(new Pair("impression", Boolean.toString(z10)));
        vector.add(new Pair("placementId", Integer.toString(i10)));
        return i.f(str, ContainerUtils.FIELD_DELIMITER, a(vector));
    }
}
