package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private String f19184a;

    /* renamed from: b, reason: collision with root package name */
    private String f19185b;

    /* renamed from: c, reason: collision with root package name */
    private String f19186c;

    /* renamed from: d, reason: collision with root package name */
    private String f19187d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, String> f19188e;
    private Map<String, String> f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, Object> f19189g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f19190h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f19191i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f19192j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f19193k;

    /* renamed from: l, reason: collision with root package name */
    private String f19194l;

    /* renamed from: m, reason: collision with root package name */
    private int f19195m;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f19196a;

        /* renamed from: b, reason: collision with root package name */
        private String f19197b;

        /* renamed from: c, reason: collision with root package name */
        private String f19198c;

        /* renamed from: d, reason: collision with root package name */
        private String f19199d;

        /* renamed from: e, reason: collision with root package name */
        private Map<String, String> f19200e;
        private Map<String, String> f;

        /* renamed from: g, reason: collision with root package name */
        private Map<String, Object> f19201g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f19202h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f19203i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f19204j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f19205k;

        public a a(String str) {
            this.f19196a = str;
            return this;
        }

        public a b(String str) {
            this.f19197b = str;
            return this;
        }

        public a c(String str) {
            this.f19198c = str;
            return this;
        }

        public a d(String str) {
            this.f19199d = str;
            return this;
        }

        public a a(Map<String, String> map) {
            this.f19200e = map;
            return this;
        }

        public a b(Map<String, String> map) {
            this.f = map;
            return this;
        }

        public a c(Map<String, Object> map) {
            this.f19201g = map;
            return this;
        }

        public a d(boolean z10) {
            this.f19205k = z10;
            return this;
        }

        public a a(boolean z10) {
            this.f19202h = z10;
            return this;
        }

        public a b(boolean z10) {
            this.f19203i = z10;
            return this;
        }

        public a c(boolean z10) {
            this.f19204j = z10;
            return this;
        }

        public j a() {
            return new j(this);
        }
    }

    public static a o() {
        return new a();
    }

    public String a() {
        return this.f19185b;
    }

    public String b() {
        return this.f19186c;
    }

    public String c() {
        return this.f19187d;
    }

    public Map<String, String> d() {
        return this.f19188e;
    }

    public Map<String, String> e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f19184a.equals(((j) obj).f19184a);
        }
        return false;
    }

    public Map<String, Object> f() {
        return this.f19189g;
    }

    public boolean g() {
        return this.f19190h;
    }

    public boolean h() {
        return this.f19191i;
    }

    public int hashCode() {
        return this.f19184a.hashCode();
    }

    public boolean i() {
        return this.f19193k;
    }

    public String j() {
        return this.f19194l;
    }

    public int k() {
        return this.f19195m;
    }

    public void l() {
        this.f19195m++;
    }

    public void m() {
        Map<String, String> map = CollectionUtils.map(this.f19188e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f19188e = map;
    }

    public JSONObject n() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ContentRecord.UNIQUE_ID, this.f19184a);
        jSONObject.put("communicatorRequestId", this.f19194l);
        jSONObject.put("httpMethod", this.f19185b);
        jSONObject.put("targetUrl", this.f19186c);
        jSONObject.put("backupUrl", this.f19187d);
        jSONObject.put("isEncodingEnabled", this.f19190h);
        jSONObject.put("gzipBodyEncoding", this.f19191i);
        jSONObject.put("isAllowedPreInitEvent", this.f19192j);
        jSONObject.put("attemptNumber", this.f19195m);
        if (this.f19188e != null) {
            jSONObject.put("parameters", new JSONObject(this.f19188e));
        }
        if (this.f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f));
        }
        if (this.f19189g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f19189g));
        }
        return jSONObject;
    }

    public boolean p() {
        return this.f19192j;
    }

    public String toString() {
        return "PostbackRequest{uniqueId='" + this.f19184a + "', communicatorRequestId='" + this.f19194l + "', httpMethod='" + this.f19185b + "', targetUrl='" + this.f19186c + "', backupUrl='" + this.f19187d + "', attemptNumber=" + this.f19195m + ", isEncodingEnabled=" + this.f19190h + ", isGzipBodyEncoding=" + this.f19191i + ", isAllowedPreInitEvent=" + this.f19192j + ", shouldFireInWebView=" + this.f19193k + '}';
    }

    public j(JSONObject jSONObject, p pVar) throws Exception {
        Map<String, String> map;
        Map<String, String> map2;
        Map<String, Object> map3;
        String string = JsonUtils.getString(jSONObject, ContentRecord.UNIQUE_ID, UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        String string3 = JsonUtils.getString(jSONObject, "httpMethod", "");
        String string4 = jSONObject.getString("targetUrl");
        String string5 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i10 = jSONObject.getInt("attemptNumber");
        if (JsonUtils.valueExists(jSONObject, "parameters")) {
            map = Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters")));
        } else {
            map = CollectionUtils.map();
        }
        if (JsonUtils.valueExists(jSONObject, "httpHeaders")) {
            map2 = Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders")));
        } else {
            map2 = CollectionUtils.map();
        }
        if (JsonUtils.valueExists(jSONObject, "requestBody")) {
            map3 = Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody")));
        } else {
            map3 = CollectionUtils.map();
        }
        this.f19184a = string;
        this.f19185b = string3;
        this.f19194l = string2;
        this.f19186c = string4;
        this.f19187d = string5;
        this.f19188e = map;
        this.f = map2;
        this.f19189g = map3;
        this.f19190h = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f19191i = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f19192j = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.f19193k = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f19195m = i10;
    }

    private j(a aVar) {
        this.f19184a = UUID.randomUUID().toString();
        this.f19185b = aVar.f19197b;
        this.f19186c = aVar.f19198c;
        this.f19187d = aVar.f19199d;
        this.f19188e = aVar.f19200e;
        this.f = aVar.f;
        this.f19189g = aVar.f19201g;
        this.f19190h = aVar.f19202h;
        this.f19191i = aVar.f19203i;
        this.f19192j = aVar.f19204j;
        this.f19193k = aVar.f19205k;
        this.f19194l = aVar.f19196a;
        this.f19195m = 0;
    }
}
