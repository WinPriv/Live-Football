package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.g.g;
import com.huawei.hms.framework.network.grs.local.model.CountryCodeBean;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final String f21804e = "a";

    /* renamed from: a, reason: collision with root package name */
    private final GrsBaseInfo f21805a;

    /* renamed from: b, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.a f21806b;

    /* renamed from: c, reason: collision with root package name */
    private g f21807c;

    /* renamed from: d, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.c f21808d;

    /* renamed from: com.huawei.hms.framework.network.grs.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0283a implements com.huawei.hms.framework.network.grs.b {

        /* renamed from: a, reason: collision with root package name */
        String f21809a;

        /* renamed from: b, reason: collision with root package name */
        Map<String, String> f21810b;

        /* renamed from: c, reason: collision with root package name */
        IQueryUrlsCallBack f21811c;

        /* renamed from: d, reason: collision with root package name */
        Context f21812d;

        /* renamed from: e, reason: collision with root package name */
        GrsBaseInfo f21813e;
        com.huawei.hms.framework.network.grs.e.a f;

        public C0283a(String str, Map<String, String> map, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar) {
            this.f21809a = str;
            this.f21810b = map;
            this.f21811c = iQueryUrlsCallBack;
            this.f21812d = context;
            this.f21813e = grsBaseInfo;
            this.f = aVar;
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
            Map<String, String> map = this.f21810b;
            if (map != null && !map.isEmpty()) {
                Logger.i(a.f21804e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f21809a, StringUtils.anonymizeMessage(new JSONObject(this.f21810b).toString()));
                this.f21811c.onCallBackSuccess(this.f21810b);
                return;
            }
            if (this.f21810b == null) {
                Logger.i(a.f21804e, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File");
                Map<String, String> a10 = com.huawei.hms.framework.network.grs.f.b.a(this.f21812d.getPackageName()).a(this.f21812d, this.f, this.f21813e, this.f21809a, true);
                if (a10 == null || a10.isEmpty()) {
                    Logger.e(a.f21804e, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", this.f21809a);
                }
                if (a10 == null) {
                    a10 = new ConcurrentHashMap<>();
                }
                Logger.i(a.f21804e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f21809a, StringUtils.anonymizeMessage(new JSONObject(a10).toString()));
                this.f21811c.onCallBackSuccess(a10);
                return;
            }
            Logger.i(a.f21804e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", this.f21809a);
            this.f21811c.onCallBackFail(-3);
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(com.huawei.hms.framework.network.grs.g.d dVar) {
            IQueryUrlsCallBack iQueryUrlsCallBack;
            String j10 = dVar.j();
            Map<String, String> a10 = a.a(j10, this.f21809a);
            if (a10.isEmpty()) {
                Map<String, String> map = this.f21810b;
                if (map == null || map.isEmpty()) {
                    if (this.f21810b == null) {
                        if (!TextUtils.isEmpty(j10)) {
                            Logger.e(a.f21804e, "The serviceName[%s] is not configured on the GRS server.", this.f21809a);
                        }
                        Logger.i(a.f21804e, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File");
                        Map<String, String> a11 = com.huawei.hms.framework.network.grs.f.b.a(this.f21812d.getPackageName()).a(this.f21812d, this.f, this.f21813e, this.f21809a, true);
                        if (a11 == null || a11.isEmpty()) {
                            Logger.e(a.f21804e, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", this.f21809a);
                        }
                        if (a11 == null) {
                            a11 = new ConcurrentHashMap<>();
                        }
                        Logger.i(a.f21804e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f21809a, StringUtils.anonymizeMessage(new JSONObject(a11).toString()));
                        this.f21811c.onCallBackSuccess(a11);
                        return;
                    }
                    Logger.i(a.f21804e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", this.f21809a);
                    this.f21811c.onCallBackFail(-5);
                    return;
                }
                Logger.i(a.f21804e, "GrsClientManager.ayncGetGrsUrls: Return [%s][%s] Url: %s", this.f21809a, StringUtils.anonymizeMessage(new JSONObject(this.f21810b).toString()));
                iQueryUrlsCallBack = this.f21811c;
                a10 = this.f21810b;
            } else {
                Logger.i(a.f21804e, "GrsClientManager.ayncGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s", this.f21809a, StringUtils.anonymizeMessage(new JSONObject(a10).toString()));
                iQueryUrlsCallBack = this.f21811c;
            }
            iQueryUrlsCallBack.onCallBackSuccess(a10);
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements com.huawei.hms.framework.network.grs.b {

        /* renamed from: a, reason: collision with root package name */
        String f21814a;

        /* renamed from: b, reason: collision with root package name */
        String f21815b;

        /* renamed from: c, reason: collision with root package name */
        IQueryUrlCallBack f21816c;

        /* renamed from: d, reason: collision with root package name */
        String f21817d;

        /* renamed from: e, reason: collision with root package name */
        Context f21818e;
        GrsBaseInfo f;

        /* renamed from: g, reason: collision with root package name */
        com.huawei.hms.framework.network.grs.e.a f21819g;

        public b(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, String str3, Context context, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar) {
            this.f21814a = str;
            this.f21815b = str2;
            this.f21816c = iQueryUrlCallBack;
            this.f21817d = str3;
            this.f21818e = context;
            this.f = grsBaseInfo;
            this.f21819g = aVar;
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
            if (!TextUtils.isEmpty(this.f21817d)) {
                Logger.i(a.f21804e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f21814a, this.f21815b, StringUtils.anonymizeMessage(this.f21817d));
                this.f21816c.onCallBackSuccess(this.f21817d);
                return;
            }
            if (TextUtils.isEmpty(this.f21817d)) {
                Logger.i(a.f21804e, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File");
                String a10 = com.huawei.hms.framework.network.grs.f.b.a(this.f21818e.getPackageName()).a(this.f21818e, this.f21819g, this.f, this.f21814a, this.f21815b, true);
                if (a10 == null || a10.isEmpty()) {
                    Logger.e(a.f21804e, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", this.f21814a, this.f21815b);
                }
                Logger.i(a.f21804e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f21814a, this.f21815b, StringUtils.anonymizeMessage(a10));
                this.f21816c.onCallBackSuccess(a10);
                return;
            }
            Logger.i(a.f21804e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", this.f21814a, this.f21815b);
            this.f21816c.onCallBackFail(-3);
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(com.huawei.hms.framework.network.grs.g.d dVar) {
            IQueryUrlCallBack iQueryUrlCallBack;
            String str;
            String j10 = dVar.j();
            Map<String, String> a10 = a.a(j10, this.f21814a);
            if (a10.containsKey(this.f21815b)) {
                String str2 = a.f21804e;
                String str3 = this.f21815b;
                Logger.i(str2, "GrsClientManager.ayncGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s", this.f21814a, str3, StringUtils.anonymizeMessage(a10.get(str3)));
                iQueryUrlCallBack = this.f21816c;
                str = a10.get(this.f21815b);
            } else {
                if (TextUtils.isEmpty(this.f21817d)) {
                    if (TextUtils.isEmpty(this.f21817d)) {
                        if (!TextUtils.isEmpty(j10)) {
                            Logger.e(a.f21804e, "The serviceName[%s][%s] is not configured on the GRS server.", this.f21814a, this.f21815b);
                        }
                        Logger.i(a.f21804e, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File");
                        String a11 = com.huawei.hms.framework.network.grs.f.b.a(this.f21818e.getPackageName()).a(this.f21818e, this.f21819g, this.f, this.f21814a, this.f21815b, true);
                        if (a11 == null || a11.isEmpty()) {
                            Logger.e(a.f21804e, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", this.f21814a, this.f21815b);
                        }
                        Logger.i(a.f21804e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f21814a, this.f21815b, StringUtils.anonymizeMessage(a11));
                        this.f21816c.onCallBackSuccess(a11);
                        return;
                    }
                    Logger.i(a.f21804e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", this.f21814a, this.f21815b);
                    this.f21816c.onCallBackFail(-5);
                    return;
                }
                String str4 = a.f21804e;
                String str5 = this.f21815b;
                Logger.i(str4, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f21814a, str5, StringUtils.anonymizeMessage(a10.get(str5)));
                iQueryUrlCallBack = this.f21816c;
                str = this.f21817d;
            }
            iQueryUrlCallBack.onCallBackSuccess(str);
        }
    }

    public a(GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar, g gVar, com.huawei.hms.framework.network.grs.e.c cVar) {
        this.f21805a = grsBaseInfo;
        this.f21806b = aVar;
        this.f21807c = gVar;
        this.f21808d = cVar;
    }

    public static CountryCodeBean a(Context context, boolean z10) {
        return new CountryCodeBean(context, z10);
    }

    public String a(Context context, String str) {
        com.huawei.hms.framework.network.grs.g.d a10 = this.f21807c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.f21805a, context), str, this.f21808d);
        return a10 == null ? "" : a10.m() ? this.f21806b.a().a(this.f21805a.getGrsParasKey(true, true, context), "") : a10.j();
    }

    public String a(String str, String str2, Context context) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        String str3 = a(str, bVar, context).get(str2);
        if (bVar.a() && !TextUtils.isEmpty(str3)) {
            Logger.i(f21804e, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str3));
            return str3;
        }
        String a10 = a(context, str);
        String str4 = a(a10, str).get(str2);
        if (!TextUtils.isEmpty(str4)) {
            Logger.i(f21804e, "GrsClientManager.synGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str4));
            return str4;
        }
        if (TextUtils.isEmpty(str3)) {
            if (!TextUtils.isEmpty(a10)) {
                Logger.e(f21804e, "The serviceName[%s][%s] is not configured on the GRS server.", str, str2);
            }
            String str5 = f21804e;
            Logger.i(str5, "GrsClientManager.synGetGrsUrl: Get URL from Local JSON File.");
            str3 = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.f21806b, this.f21805a, str, str2, true);
            if (str3 == null || str3.isEmpty()) {
                Logger.e(str5, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", str, str2);
            }
        }
        Logger.i(f21804e, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str3));
        return str3;
    }

    public static Map<String, Map<String, String>> a(String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        if (TextUtils.isEmpty(str)) {
            Logger.v(f21804e, "isSpExpire jsonValue is null.");
            return concurrentHashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (!TextUtils.isEmpty(next)) {
                    concurrentHashMap.put(next, a(jSONObject2));
                }
            }
            return concurrentHashMap;
        } catch (JSONException e10) {
            Logger.w(f21804e, "getServicesUrlsMap occur a JSONException: %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return concurrentHashMap;
        }
    }

    public Map<String, String> a(String str, Context context) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        Map<String, String> a10 = a(str, bVar, context);
        if (bVar.a() && !a10.isEmpty()) {
            Logger.i(f21804e, "Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(a10).toString()));
            return a10;
        }
        String a11 = a(context, str);
        Map<String, String> a12 = a(a11, str);
        if (!a12.isEmpty()) {
            Logger.i(f21804e, "GrsClientManager.synGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(a12).toString()));
            return a12;
        }
        if (a10.isEmpty()) {
            if (!TextUtils.isEmpty(a11)) {
                Logger.e(f21804e, "The serviceName[%s] is not configured on the GRS server.", str);
            }
            String str2 = f21804e;
            Logger.i(str2, "GrsClientManager.synGetGrsUrls: Get URL from Local JSON File.");
            a10 = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.f21806b, this.f21805a, str, true);
            if (a10 == null || a10.isEmpty()) {
                Logger.e(str2, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", str);
            }
        }
        String str3 = f21804e;
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = StringUtils.anonymizeMessage(a10 != null ? new JSONObject(a10).toString() : "");
        Logger.i(str3, "GrsClientManager.synGetGrsUrls: Return [%s] Urls: %s", objArr);
        return a10;
    }

    private Map<String, String> a(String str, com.huawei.hms.framework.network.grs.e.b bVar, Context context) {
        Map<String, String> a10 = this.f21806b.a(this.f21805a, str, bVar, context);
        if (a10 != null && !a10.isEmpty()) {
            Logger.i(f21804e, "GrsClientManager.getUrlsLocal: Get URL from GRS Server Cache");
            return a10;
        }
        Map<String, String> a11 = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.f21806b, this.f21805a, str, false);
        Logger.i(f21804e, "GrsClientManager.getUrlsLocal: Get URL from Local JSON File");
        return a11 != null ? a11 : new HashMap();
    }

    public static Map<String, String> a(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            Logger.w(f21804e, "isSpExpire jsonValue from server is null.");
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.has(str2) ? jSONObject.getJSONObject(str2) : null;
            if (jSONObject2 == null) {
                Logger.w(f21804e, "getServiceNameUrls: paser null from server json data by {%s}.", str2);
                return hashMap;
            }
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject2.get(next).toString());
            }
            return hashMap;
        } catch (JSONException e10) {
            Logger.w(f21804e, "Method{getServiceNameUrls} query url from SP occur an JSONException: %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return hashMap;
        }
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String obj = jSONObject.get(next).toString();
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(obj)) {
                    concurrentHashMap.put(next, obj);
                }
            }
            return concurrentHashMap;
        } catch (JSONException e10) {
            Logger.w(f21804e, "getServiceUrls occur a JSONException: %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return concurrentHashMap;
        }
    }

    public void a(String str, IQueryUrlsCallBack iQueryUrlsCallBack, Context context) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        Map<String, String> a10 = a(str, bVar, context);
        if (!bVar.a()) {
            this.f21807c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.f21805a, context), new C0283a(str, a10, iQueryUrlsCallBack, context, this.f21805a, this.f21806b), str, this.f21808d);
            return;
        }
        if (a10.isEmpty()) {
            Logger.i(f21804e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", str);
            iQueryUrlsCallBack.onCallBackFail(-5);
        } else {
            String str2 = f21804e;
            Logger.i(str2, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(a10).toString()));
            Logger.i(str2, "ayncGetGrsUrls: %s", StringUtils.anonymizeMessage(new JSONObject(a10).toString()));
            iQueryUrlsCallBack.onCallBackSuccess(a10);
        }
    }

    public void a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, Context context) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        String str3 = a(str, bVar, context).get(str2);
        if (!bVar.a()) {
            this.f21807c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.f21805a, context), new b(str, str2, iQueryUrlCallBack, str3, context, this.f21805a, this.f21806b), str, this.f21808d);
        } else if (TextUtils.isEmpty(str3)) {
            Logger.i(f21804e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", str, str2);
            iQueryUrlCallBack.onCallBackFail(-5);
        } else {
            Logger.i(f21804e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str3));
            iQueryUrlCallBack.onCallBackSuccess(str3);
        }
    }
}
