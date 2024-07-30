package com.anythink.expressad.foundation.g.f.g;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import com.anythink.expressad.foundation.h.o;
import java.util.Locale;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10005a = "b";

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f10006b;

    /* renamed from: c, reason: collision with root package name */
    private static ConnectivityManager f10007c;

    /* renamed from: d, reason: collision with root package name */
    private static com.anythink.expressad.foundation.g.f.c.a f10008d;

    private b() {
    }

    private static b a(Context context) {
        NetworkInfo activeNetworkInfo;
        String lowerCase;
        if (f10006b == null) {
            synchronized (b.class) {
                if (f10006b == null) {
                    f10006b = new b();
                    if (context != null) {
                        f10007c = (ConnectivityManager) context.getSystemService("connectivity");
                    }
                    f10008d = new com.anythink.expressad.foundation.g.f.c.a();
                    try {
                        ConnectivityManager connectivityManager = f10007c;
                        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                            String typeName = activeNetworkInfo.getTypeName();
                            Locale locale = Locale.US;
                            if ("wifi".equals(typeName.toLowerCase(locale))) {
                                com.anythink.expressad.foundation.g.f.c.a aVar = f10008d;
                                aVar.f9915e = "wifi";
                                aVar.f9914d = false;
                            } else {
                                if (activeNetworkInfo.getExtraInfo() != null && (lowerCase = activeNetworkInfo.getExtraInfo().toLowerCase(locale)) != null) {
                                    if (!lowerCase.startsWith("cmwap") && !lowerCase.startsWith("uniwap") && !lowerCase.startsWith("3gwap")) {
                                        if (lowerCase.startsWith("ctwap")) {
                                            com.anythink.expressad.foundation.g.f.c.a aVar2 = f10008d;
                                            aVar2.f9914d = true;
                                            aVar2.f9911a = lowerCase;
                                            aVar2.f9912b = "10.0.0.200";
                                            aVar2.f9913c = "80";
                                        } else if (lowerCase.startsWith("cmnet") || lowerCase.startsWith("uninet") || lowerCase.startsWith("ctnet") || lowerCase.startsWith("3gnet")) {
                                            com.anythink.expressad.foundation.g.f.c.a aVar3 = f10008d;
                                            aVar3.f9914d = false;
                                            aVar3.f9911a = lowerCase;
                                        }
                                        com.anythink.expressad.foundation.g.f.c.a aVar4 = f10008d;
                                        aVar4.f9915e = aVar4.f9911a;
                                    }
                                    com.anythink.expressad.foundation.g.f.c.a aVar5 = f10008d;
                                    aVar5.f9914d = true;
                                    aVar5.f9911a = lowerCase;
                                    aVar5.f9912b = "10.0.0.172";
                                    aVar5.f9913c = "80";
                                    com.anythink.expressad.foundation.g.f.c.a aVar42 = f10008d;
                                    aVar42.f9915e = aVar42.f9911a;
                                }
                                String defaultHost = Proxy.getDefaultHost();
                                int defaultPort = Proxy.getDefaultPort();
                                if (defaultHost != null && defaultHost.length() > 0) {
                                    f10008d.f9912b = defaultHost;
                                    if ("10.0.0.172".equals(defaultHost.trim())) {
                                        com.anythink.expressad.foundation.g.f.c.a aVar6 = f10008d;
                                        aVar6.f9914d = true;
                                        aVar6.f9913c = "80";
                                    } else if ("10.0.0.200".equals(f10008d.f9912b.trim())) {
                                        com.anythink.expressad.foundation.g.f.c.a aVar7 = f10008d;
                                        aVar7.f9914d = true;
                                        aVar7.f9913c = "80";
                                    } else {
                                        com.anythink.expressad.foundation.g.f.c.a aVar8 = f10008d;
                                        aVar8.f9914d = false;
                                        aVar8.f9913c = Integer.toString(defaultPort);
                                    }
                                } else {
                                    f10008d.f9914d = false;
                                }
                                com.anythink.expressad.foundation.g.f.c.a aVar422 = f10008d;
                                aVar422.f9915e = aVar422.f9911a;
                            }
                        }
                    } catch (Exception e10) {
                        o.d(f10005a, e10.getMessage());
                    }
                }
            }
        }
        return f10006b;
    }

    private static com.anythink.expressad.foundation.g.f.c.a b() {
        return f10008d;
    }

    private static void a() {
        NetworkInfo activeNetworkInfo;
        String lowerCase;
        try {
            ConnectivityManager connectivityManager = f10007c;
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return;
            }
            String typeName = activeNetworkInfo.getTypeName();
            Locale locale = Locale.US;
            if ("wifi".equals(typeName.toLowerCase(locale))) {
                com.anythink.expressad.foundation.g.f.c.a aVar = f10008d;
                aVar.f9915e = "wifi";
                aVar.f9914d = false;
                return;
            }
            if (activeNetworkInfo.getExtraInfo() != null && (lowerCase = activeNetworkInfo.getExtraInfo().toLowerCase(locale)) != null) {
                if (!lowerCase.startsWith("cmwap") && !lowerCase.startsWith("uniwap") && !lowerCase.startsWith("3gwap")) {
                    if (lowerCase.startsWith("ctwap")) {
                        com.anythink.expressad.foundation.g.f.c.a aVar2 = f10008d;
                        aVar2.f9914d = true;
                        aVar2.f9911a = lowerCase;
                        aVar2.f9912b = "10.0.0.200";
                        aVar2.f9913c = "80";
                    } else if (lowerCase.startsWith("cmnet") || lowerCase.startsWith("uninet") || lowerCase.startsWith("ctnet") || lowerCase.startsWith("3gnet")) {
                        com.anythink.expressad.foundation.g.f.c.a aVar3 = f10008d;
                        aVar3.f9914d = false;
                        aVar3.f9911a = lowerCase;
                    }
                    com.anythink.expressad.foundation.g.f.c.a aVar4 = f10008d;
                    aVar4.f9915e = aVar4.f9911a;
                }
                com.anythink.expressad.foundation.g.f.c.a aVar5 = f10008d;
                aVar5.f9914d = true;
                aVar5.f9911a = lowerCase;
                aVar5.f9912b = "10.0.0.172";
                aVar5.f9913c = "80";
                com.anythink.expressad.foundation.g.f.c.a aVar42 = f10008d;
                aVar42.f9915e = aVar42.f9911a;
            }
            String defaultHost = Proxy.getDefaultHost();
            int defaultPort = Proxy.getDefaultPort();
            if (defaultHost != null && defaultHost.length() > 0) {
                f10008d.f9912b = defaultHost;
                if ("10.0.0.172".equals(defaultHost.trim())) {
                    com.anythink.expressad.foundation.g.f.c.a aVar6 = f10008d;
                    aVar6.f9914d = true;
                    aVar6.f9913c = "80";
                } else if ("10.0.0.200".equals(f10008d.f9912b.trim())) {
                    com.anythink.expressad.foundation.g.f.c.a aVar7 = f10008d;
                    aVar7.f9914d = true;
                    aVar7.f9913c = "80";
                } else {
                    com.anythink.expressad.foundation.g.f.c.a aVar8 = f10008d;
                    aVar8.f9914d = false;
                    aVar8.f9913c = Integer.toString(defaultPort);
                }
            } else {
                f10008d.f9914d = false;
            }
            com.anythink.expressad.foundation.g.f.c.a aVar422 = f10008d;
            aVar422.f9915e = aVar422.f9911a;
        } catch (Exception e10) {
            o.d(f10005a, e10.getMessage());
        }
    }

    private static void a(NetworkInfo networkInfo) {
        String lowerCase;
        if (networkInfo.getExtraInfo() != null && (lowerCase = networkInfo.getExtraInfo().toLowerCase(Locale.US)) != null) {
            if (!lowerCase.startsWith("cmwap") && !lowerCase.startsWith("uniwap") && !lowerCase.startsWith("3gwap")) {
                if (lowerCase.startsWith("ctwap")) {
                    com.anythink.expressad.foundation.g.f.c.a aVar = f10008d;
                    aVar.f9914d = true;
                    aVar.f9911a = lowerCase;
                    aVar.f9912b = "10.0.0.200";
                    aVar.f9913c = "80";
                    return;
                }
                if (lowerCase.startsWith("cmnet") || lowerCase.startsWith("uninet") || lowerCase.startsWith("ctnet") || lowerCase.startsWith("3gnet")) {
                    com.anythink.expressad.foundation.g.f.c.a aVar2 = f10008d;
                    aVar2.f9914d = false;
                    aVar2.f9911a = lowerCase;
                    return;
                }
            } else {
                com.anythink.expressad.foundation.g.f.c.a aVar3 = f10008d;
                aVar3.f9914d = true;
                aVar3.f9911a = lowerCase;
                aVar3.f9912b = "10.0.0.172";
                aVar3.f9913c = "80";
                return;
            }
        }
        String defaultHost = Proxy.getDefaultHost();
        int defaultPort = Proxy.getDefaultPort();
        if (defaultHost != null && defaultHost.length() > 0) {
            f10008d.f9912b = defaultHost;
            if ("10.0.0.172".equals(defaultHost.trim())) {
                com.anythink.expressad.foundation.g.f.c.a aVar4 = f10008d;
                aVar4.f9914d = true;
                aVar4.f9913c = "80";
                return;
            } else if ("10.0.0.200".equals(f10008d.f9912b.trim())) {
                com.anythink.expressad.foundation.g.f.c.a aVar5 = f10008d;
                aVar5.f9914d = true;
                aVar5.f9913c = "80";
                return;
            } else {
                com.anythink.expressad.foundation.g.f.c.a aVar6 = f10008d;
                aVar6.f9914d = false;
                aVar6.f9913c = Integer.toString(defaultPort);
                return;
            }
        }
        f10008d.f9914d = false;
    }
}
