package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.av;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1418f {

    /* renamed from: b, reason: collision with root package name */
    public static final C1418f f25423b = new C1418f();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f25424a = new AtomicBoolean(false);

    /* renamed from: com.ironsource.mediationsdk.f$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f25425a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f25426b;

        /* renamed from: c, reason: collision with root package name */
        public com.ironsource.mediationsdk.c.b f25427c;

        /* renamed from: d, reason: collision with root package name */
        public JSONObject f25428d;

        /* renamed from: e, reason: collision with root package name */
        public JSONObject f25429e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public String f25430g;
    }

    /* renamed from: com.ironsource.mediationsdk.f$p */
    /* loaded from: classes2.dex */
    public static class p implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final String f25431s;

        /* renamed from: t, reason: collision with root package name */
        public final String f25432t;

        /* renamed from: u, reason: collision with root package name */
        public final String f25433u;

        public p(String str, String str2, String str3) {
            this.f25431s = str;
            this.f25432t = str2;
            this.f25433u = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0055 A[Catch: Exception -> 0x0085, TRY_LEAVE, TryCatch #0 {Exception -> 0x0085, blocks: (B:3:0x0020, B:10:0x0055), top: B:2:0x0020 }] */
        /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r8 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r8.f25431s
                r0.append(r1)
                java.lang.String r1 = ";"
                r0.append(r1)
                java.lang.String r2 = r8.f25432t
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = r8.f25433u
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.net.URL r3 = new java.net.URL     // Catch: java.lang.Exception -> L85
                r3.<init>(r2)     // Catch: java.lang.Exception -> L85
                java.net.URLConnection r2 = r3.openConnection()     // Catch: java.lang.Exception -> L85
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Exception -> L85
                java.lang.String r3 = "GET"
                r2.setRequestMethod(r3)     // Catch: java.lang.Exception -> L85
                r3 = 15000(0x3a98, float:2.102E-41)
                r2.setReadTimeout(r3)     // Catch: java.lang.Exception -> L85
                r2.setConnectTimeout(r3)     // Catch: java.lang.Exception -> L85
                r2.connect()     // Catch: java.lang.Exception -> L85
                int r3 = r2.getResponseCode()     // Catch: java.lang.Exception -> L85
                java.lang.String r4 = r2.getResponseMessage()     // Catch: java.lang.Exception -> L85
                r2.disconnect()     // Catch: java.lang.Exception -> L85
                r2 = 200(0xc8, float:2.8E-43)
                r5 = 1
                if (r3 == r2) goto L52
                r2 = 204(0xcc, float:2.86E-43)
                if (r3 != r2) goto L50
                goto L52
            L50:
                r2 = 0
                goto L53
            L52:
                r2 = r5
            L53:
                if (r2 != 0) goto L84
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L85
                r2.<init>()     // Catch: java.lang.Exception -> L85
                java.lang.String r6 = "provider"
                java.lang.String r7 = "Mediation"
                r2.put(r6, r7)     // Catch: java.lang.Exception -> L85
                java.lang.String r6 = "programmatic"
                r2.put(r6, r5)     // Catch: java.lang.Exception -> L85
                java.lang.String r5 = "ext1"
                r2.put(r5, r0)     // Catch: java.lang.Exception -> L85
                java.lang.String r5 = "errorCode"
                r2.put(r5, r3)     // Catch: java.lang.Exception -> L85
                java.lang.String r3 = "reason"
                r2.put(r3, r4)     // Catch: java.lang.Exception -> L85
                com.ironsource.mediationsdk.a.c r3 = new com.ironsource.mediationsdk.a.c     // Catch: java.lang.Exception -> L85
                r4 = 81320(0x13da8, float:1.13954E-40)
                r3.<init>(r4, r2)     // Catch: java.lang.Exception -> L85
                com.ironsource.mediationsdk.a.h r2 = com.ironsource.mediationsdk.a.h.d()     // Catch: java.lang.Exception -> L85
                r2.b(r3)     // Catch: java.lang.Exception -> L85
            L84:
                return
            L85:
                r2 = move-exception
                r2.printStackTrace()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "Send auction url failed with params - "
                r3.<init>(r4)
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = r2.getMessage()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                r1.error(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C1418f.p.run():void");
        }
    }

    /* JADX WARN: Enum class init method not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.ironsource.mediationsdk.f$q */
    /* loaded from: classes2.dex */
    public static final class q {

        /* renamed from: a, reason: collision with root package name */
        public static final int f25434a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f25435b = 2;
    }

    public static com.ironsource.mediationsdk.c.b a(String str, List<com.ironsource.mediationsdk.c.b> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10).a().equals(str)) {
                return list.get(i10);
            }
        }
        return null;
    }

    public static a b(JSONObject jSONObject) {
        String optString = jSONObject.optString("auctionId");
        if (TextUtils.isEmpty(optString)) {
            throw new JSONException("Invalid auction response - auction id is missing");
        }
        a aVar = new a();
        aVar.f25425a = optString;
        if (jSONObject.has("settings")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
            aVar.f25427c = new com.ironsource.mediationsdk.c.b(jSONObject2);
            r3 = jSONObject2.has("armData") ? jSONObject2.optJSONObject("armData") : null;
            if (jSONObject2.has(IronSourceConstants.EVENTS_GENERIC_PARAMS)) {
                aVar.f25428d = jSONObject2.optJSONObject(IronSourceConstants.EVENTS_GENERIC_PARAMS);
            }
            if (jSONObject2.has("configurations")) {
                aVar.f25429e = jSONObject2.optJSONObject("configurations");
            }
        }
        aVar.f25426b = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("waterfall");
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            com.ironsource.mediationsdk.c.b bVar = new com.ironsource.mediationsdk.c.b(jSONArray.getJSONObject(i10), r3);
            if (!bVar.h()) {
                aVar.f = 1002;
                aVar.f25430g = a3.l.i("waterfall ", i10);
                IronLog.INTERNAL.verbose("AuctionResponseItem " + i10 + " not valid - parsing error");
                throw new JSONException("invalid response");
            }
            aVar.f25426b.add(bVar);
        }
        return aVar;
    }

    public static String d(String str) {
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str) || !com.ironsource.mediationsdk.c.b.a(str)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("params")) {
                return "";
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("parameters = " + jSONObject2);
            if (!jSONObject2.has(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID)) {
                return "";
            }
            str2 = jSONObject2.getString(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID);
            ironLog.verbose("demand source = " + str2);
            return str2;
        } catch (JSONException e10) {
            e10.printStackTrace();
            IronLog.INTERNAL.error("exception " + e10.getMessage());
            return str2;
        }
    }

    public static JSONObject e(String str) {
        try {
            return new JSONObject(IronSourceAES.decode(com.ironsource.mediationsdk.utils.g.a().b(), str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject g(JSONObject jSONObject, List<String> list) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (list.contains(next)) {
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        return jSONObject2;
    }

    public static void h(String str, String str2, String str3) {
        com.ironsource.environment.e.c.f24668a.c(new p(str, str2, str3));
    }

    public static void i(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (jSONObject.has(next)) {
                int i10 = 0;
                str = next;
                while (jSONObject.has(str)) {
                    i10++;
                    str = next + "_" + i10;
                }
            } else {
                str = next;
            }
            try {
                jSONObject.put(str, jSONObject2.opt(next));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (r0 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        return com.ironsource.mediationsdk.C1418f.q.f25434a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        return com.ironsource.mediationsdk.C1418f.q.f25435b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int j() {
        /*
            int r0 = com.ironsource.mediationsdk.C1418f.q.f25434a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L18
            android.security.NetworkSecurityPolicy r0 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r0 = r0.isCleartextTrafficPermitted()
            if (r0 == 0) goto L15
        L12:
            int r0 = com.ironsource.mediationsdk.C1418f.q.f25434a
            goto L31
        L15:
            int r0 = com.ironsource.mediationsdk.C1418f.q.f25435b
            goto L31
        L18:
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.flags
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 & r1
            if (r0 == 0) goto L2d
            r0 = 1
            goto L2e
        L2d:
            r0 = 0
        L2e:
            if (r0 == 0) goto L15
            goto L12
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C1418f.j():int");
    }

    public final JSONObject c(Context context, Map<String, Object> map, List<String> list, C1421j c1421j, int i10, String str, com.ironsource.mediationsdk.utils.c cVar, ISBannerSize iSBannerSize, JSONObject jSONObject) {
        Object obj;
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            obj = "";
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("instanceType", 2);
            jSONObject3.put("biddingAdditionalData", new JSONObject((Map) map.get(next)));
            if (c1421j != null) {
                obj = c1421j.a(next);
            }
            jSONObject3.put("performance", obj);
            jSONObject2.put(next, jSONObject3);
        }
        if (list != null) {
            for (String str2 : list) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("instanceType", 1);
                jSONObject4.put("performance", c1421j != null ? c1421j.a(str2) : "");
                jSONObject2.put(str2, jSONObject4);
            }
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = C1416d.a().f25384g;
        concurrentHashMap.putAll(com.ironsource.d.b.a().d());
        JSONObject jSONObject5 = new JSONObject();
        for (Map.Entry<String, List<String>> entry : concurrentHashMap.entrySet()) {
            jSONObject5.put(entry.getKey(), TextUtils.join(",", entry.getValue()));
        }
        a(new com.ironsource.environment.a.b().a(), false);
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("applicationUserId", L.a().f24857k);
        Boolean bool = L.a().N;
        if (bool != null) {
            jSONObject6.put(av.O, bool.booleanValue() ? 1 : 0);
        }
        jSONObject6.put("mobileCarrier", com.ironsource.environment.h.i(context));
        jSONObject6.put("connectionType", IronSourceUtils.getConnectionType(context));
        jSONObject6.put("deviceOS", "android");
        jSONObject6.put("deviceWidth", context.getResources().getConfiguration().screenWidthDp);
        jSONObject6.put("deviceHeight", context.getResources().getConfiguration().screenHeightDp);
        jSONObject6.put("deviceOSVersion", Build.VERSION.SDK_INT + "(" + Build.VERSION.RELEASE + ")");
        jSONObject6.put("deviceModel", Build.MODEL);
        jSONObject6.put("deviceMake", Build.MANUFACTURER);
        jSONObject6.put("bundleId", context.getPackageName());
        jSONObject6.put("appVersion", com.ironsource.environment.c.c(context, context.getPackageName()));
        jSONObject6.put("clientTimestamp", new Date().getTime());
        jSONObject6.put("fs", IronSourceUtils.getFirstSession(context) ? 1 : 0);
        jSONObject6.put("browserUserAgent", com.ironsource.environment.h.q());
        jSONObject6.put(av.f22030e, IronSourceUtils.getDeviceType(context));
        jSONObject6.put("deviceLang", Locale.getDefault().getLanguage());
        jSONObject6.put("secure", j() - 1);
        if (iSBannerSize != null) {
            jSONObject6.put("bannerSize", iSBannerSize.getDescription());
            jSONObject6.put("bannerWidth", iSBannerSize.getWidth());
            jSONObject6.put("bannerHeight", iSBannerSize.getHeight());
        }
        String C = com.ironsource.environment.h.C(context);
        if (TextUtils.isEmpty(C)) {
            C = com.ironsource.environment.h.x(context);
            if (!TextUtils.isEmpty(C)) {
                obj = IronSourceConstants.TYPE_UUID;
            }
        } else {
            obj = IronSourceConstants.TYPE_GAID;
        }
        if (!TextUtils.isEmpty(C)) {
            jSONObject6.put("advId", C);
            jSONObject6.put("advIdType", obj);
        }
        String D = com.ironsource.environment.h.D(context);
        if (!TextUtils.isEmpty(D)) {
            jSONObject6.put("isLimitAdTrackingEnabled", D);
        }
        String B = com.ironsource.environment.h.B(context);
        if (!TextUtils.isEmpty(B)) {
            jSONObject6.put("asid", B);
        }
        String y = com.ironsource.environment.h.y(context);
        if (!TextUtils.isEmpty(y)) {
            jSONObject6.put("auid", y);
        }
        JSONObject jSONObject7 = new JSONObject();
        jSONObject7.put("applicationKey", L.a().f24855j);
        jSONObject7.put("SDKVersion", IronSourceUtils.getSDKVersion());
        jSONObject7.put("clientParams", jSONObject6);
        jSONObject7.put(IronSourceConstants.KEY_SESSION_DEPTH, i10);
        jSONObject7.put("sessionId", str);
        jSONObject7.put("instances", jSONObject2);
        jSONObject7.put("auctionData", cVar.f25890c);
        jSONObject7.put("metaData", jSONObject5);
        if (jSONObject != null) {
            jSONObject7.put("sg", jSONObject);
        }
        return jSONObject7;
    }

    public final JSONObject f(String str, boolean z10, Map<String, Object> map, List<String> list, C1421j c1421j, int i10, ISBannerSize iSBannerSize, JSONObject jSONObject) {
        String str2;
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            String str3 = "";
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("instp", 2);
            jSONObject4.put("badt", new JSONObject((Map) map.get(next)));
            if (c1421j != null) {
                str3 = c1421j.a(next);
            }
            jSONObject4.put("prfm", str3);
            jSONObject3.put(next, jSONObject4);
        }
        if (list != null) {
            for (String str4 : list) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("instp", 1);
                if (c1421j == null) {
                    str2 = "";
                } else {
                    str2 = c1421j.a(str4);
                }
                jSONObject5.put("prfm", str2);
                jSONObject3.put(str4, jSONObject5);
            }
        }
        jSONObject2.put("inst", jSONObject3);
        JSONObject a10 = new com.ironsource.environment.a.b().a();
        a(a10, false);
        a10.put("sd", i10);
        a10.put("scr", j() - 1);
        if (jSONObject != null) {
            a10.put("sg", jSONObject);
        }
        jSONObject2.put("ctdt", a10);
        if (iSBannerSize != null) {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("bns", iSBannerSize.getDescription());
            jSONObject6.put("bnw", iSBannerSize.getWidth());
            jSONObject6.put("bnh", iSBannerSize.getHeight());
            jSONObject2.put("bndt", jSONObject6);
        }
        jSONObject2.put("adu", str);
        jSONObject2.put("dner", !z10 ? 1 : 0);
        return jSONObject2;
    }

    public static C1418f a() {
        return f25423b;
    }

    public static String c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            JSONObject jSONObject = new JSONObject(str);
            return jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : str;
        } catch (JSONException e10) {
            e10.printStackTrace();
            IronLog.INTERNAL.error("exception " + e10.getMessage());
            return str;
        }
    }

    public final String a(String str, int i10, com.ironsource.mediationsdk.c.b bVar, String str2, String str3, String str4) {
        String str5;
        String d10 = bVar.d();
        if (!TextUtils.isEmpty(d10) && !TextUtils.isEmpty(str2)) {
            double parseDouble = Double.parseDouble(d10);
            if (Double.parseDouble(str2) != 0.0d) {
                str5 = String.valueOf(Math.round((parseDouble / r5) * 1000.0d) / 1000.0d);
                return a(str, bVar.a(), i10, d(bVar.b()), d10, str5, str3, str4);
            }
        }
        str5 = "";
        return a(str, bVar.a(), i10, d(bVar.b()), d10, str5, str3, str4);
    }

    public static String a(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7) {
        return str.replace("${AUCTION_PRICE}", str4).replace("${AUCTION_LOSS}", str6).replace("${AUCTION_MBR}", str5).replace("${INSTANCE}", str2).replace("${INSTANCE_TYPE}", Integer.toString(i10)).replace("${DYNAMIC_DEMAND_SOURCE}", str3).replace("${PLACEMENT_NAME}", str7);
    }

    public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, List<String> list) {
        n0 a10 = n0.a();
        a10.getClass();
        JSONObject jSONObject3 = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            try {
                String language = applicationContext.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject3.put("dLang", language.toUpperCase(Locale.ENGLISH));
                }
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    jSONObject3.put("plType", pluginType);
                }
                String e10 = com.ironsource.environment.h.e();
                if (e10 != null) {
                    jSONObject3.put("dOSVF", e10);
                    jSONObject3.put("dOSV", e10.replaceAll("[^0-9/.]", ""));
                }
                String y = com.ironsource.environment.h.y(applicationContext);
                if (y != null) {
                    jSONObject3.put("auid", y);
                }
                jSONObject3.put("sId", IronSourceUtils.getSessionId());
                jSONObject3.put("appKey", L.a().f24855j);
                jSONObject3.put("mCar", com.ironsource.environment.h.i(applicationContext));
                jSONObject3.put("medV", IronSourceUtils.getSDKVersion());
                jSONObject3.put("dModel", Build.MODEL);
                jSONObject3.put("dOS", "android");
                jSONObject3.put("dMake", Build.MANUFACTURER);
                jSONObject3.put("dAPI", String.valueOf(Build.VERSION.SDK_INT));
                jSONObject3.put("bId", applicationContext.getPackageName());
                jSONObject3.put("appV", com.ironsource.environment.c.c(applicationContext, applicationContext.getPackageName()));
                jSONObject3.put("usId", L.a().f24857k);
            } catch (JSONException e11) {
                IronLog.INTERNAL.error("got the following error " + e11.getMessage());
                e11.printStackTrace();
            }
        }
        a10.c(jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        Context applicationContext2 = ContextProvider.getInstance().getApplicationContext();
        int k10 = com.ironsource.environment.h.k();
        int l10 = com.ironsource.environment.h.l();
        float o = com.ironsource.environment.h.o();
        if (applicationContext2 != null) {
            try {
                ConcurrentHashMap<String, List<String>> concurrentHashMap = C1416d.a().f25384g;
                concurrentHashMap.putAll(com.ironsource.d.b.a().d());
                JSONObject jSONObject5 = new JSONObject();
                for (Map.Entry<String, List<String>> entry : concurrentHashMap.entrySet()) {
                    jSONObject5.put(entry.getKey(), entry.getValue());
                }
                Boolean bool = L.a().N;
                if (bool != null) {
                    jSONObject4.put(av.O, bool.booleanValue());
                }
                String B = com.ironsource.environment.h.B(applicationContext2);
                if (!TextUtils.isEmpty(B)) {
                    jSONObject4.put("asid", B);
                }
                jSONObject4.put("connT", IronSourceUtils.getConnectionType(applicationContext2));
                jSONObject4.put("dVol", com.ironsource.environment.h.l(applicationContext2));
                jSONObject4.put("root", com.ironsource.environment.h.j());
                jSONObject4.put("bat", com.ironsource.environment.h.v(applicationContext2));
                jSONObject4.put("diskFS", com.ironsource.environment.h.p());
                jSONObject4.put("MD", jSONObject5);
                jSONObject4.put("cTime", new Date().getTime());
                jSONObject4.put("dWidth", k10);
                jSONObject4.put("dHeight", l10);
                jSONObject4.put("dScrenScle", String.valueOf(o));
                jSONObject4.put("sDepIS", com.ironsource.mediationsdk.utils.o.a().b(2));
                jSONObject4.put("sDepRV", com.ironsource.mediationsdk.utils.o.a().b(1));
                jSONObject4.put("UA", com.ironsource.environment.h.q());
            } catch (JSONException e12) {
                IronLog.INTERNAL.error("got the following error " + e12.getMessage());
                e12.printStackTrace();
            }
        }
        a10.c(jSONObject4);
        JSONObject g6 = g(a10.f25757a, list.isEmpty() ? com.ironsource.environment.m.f24698a : list);
        JSONObject jSONObject6 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    HashMap<String, String> hashMap = com.ironsource.environment.m.f24699b;
                    String str = hashMap.containsKey(next) ? hashMap.get(next) : next;
                    if ((list.isEmpty() && !com.ironsource.environment.m.f24698a.contains(str) && !str.startsWith("metadata_")) || list.contains(str)) {
                        jSONObject6.put(str, jSONObject.opt(next));
                    }
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
        }
        i(g6, jSONObject6);
        if (!list.isEmpty()) {
            jSONObject2 = g(jSONObject2, list);
        }
        i(g6, jSONObject2);
        return g6;
    }

    public static Map<String, String> b(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj instanceof String) {
                        hashMap.put(next, (String) obj);
                    }
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
            IronLog.INTERNAL.error("exception " + e10.getMessage());
        }
        return hashMap;
    }

    public final void a(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null || jSONObject.length() <= 0 || TextUtils.isEmpty(jSONObject.optString("tcs")) || !this.f25424a.compareAndSet(false, true)) {
            return;
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.getMediationAdditionalData(z10, true, -1)));
    }
}
