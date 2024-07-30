package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f21852a = "e";

    /* renamed from: b, reason: collision with root package name */
    public static final Set<String> f21853b = Collections.unmodifiableSet(new a(16));

    /* loaded from: classes2.dex */
    public class a extends HashSet<String> {
        public a(int i10) {
            super(i10);
            add("ser_country");
            add("reg_country");
            add("issue_country");
            add("geo_ip");
        }
    }

    private static String a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, String str, GrsBaseInfo grsBaseInfo, boolean z10) {
        String str2;
        StringBuilder sb2;
        String serCountry = grsBaseInfo.getSerCountry();
        String regCountry = grsBaseInfo.getRegCountry();
        String issueCountry = grsBaseInfo.getIssueCountry();
        for (String str3 : str.split(">")) {
            if (f21853b.contains(str3.trim())) {
                if ("ser_country".equals(str3.trim()) && !TextUtils.isEmpty(serCountry) && !"UNKNOWN".equals(serCountry)) {
                    str2 = f21852a;
                    sb2 = new StringBuilder("current route_by is serCountry and routerCountry is: ");
                } else {
                    if ("reg_country".equals(str3.trim()) && !TextUtils.isEmpty(regCountry) && !"UNKNOWN".equals(regCountry)) {
                        Logger.i(f21852a, "current route_by is regCountry and routerCountry is: " + regCountry);
                        return regCountry;
                    }
                    if ("issue_country".equals(str3.trim()) && !TextUtils.isEmpty(issueCountry) && !"UNKNOWN".equals(issueCountry)) {
                        Logger.i(f21852a, "current route_by is issueCountry and routerCountry is: " + issueCountry);
                        return issueCountry;
                    }
                    if ("geo_ip".equals(str3.trim())) {
                        serCountry = new com.huawei.hms.framework.network.grs.g.b(context, aVar, grsBaseInfo).a(z10);
                        str2 = f21852a;
                        sb2 = new StringBuilder("current route_by is geo_ip and routerCountry is: ");
                    }
                }
                sb2.append(serCountry);
                Logger.i(str2, sb2.toString());
                return serCountry;
            }
        }
        return "";
    }

    public static String b(Context context, com.huawei.hms.framework.network.grs.e.a aVar, String str, GrsBaseInfo grsBaseInfo, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            Logger.w(f21852a, "routeBy must be not empty string or null.");
            return null;
        }
        if (!"no_route".equals(str) && !"unconditional".equals(str)) {
            return a(context, aVar, str, grsBaseInfo, z10);
        }
        Logger.v(f21852a, "routeBy equals NO_ROUTE_POLICY");
        return "no_route_country";
    }
}
