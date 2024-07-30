package com.applovin.impl.mediation.a;

import android.os.Bundle;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f17557a;

    /* renamed from: b, reason: collision with root package name */
    protected final p f17558b;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f17559c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Object> f17560d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f17561e = new Object();
    private final Object f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private String f17562g;

    /* renamed from: h, reason: collision with root package name */
    private String f17563h;

    public f(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, p pVar) {
        if (pVar != null) {
            if (jSONObject2 != null) {
                if (jSONObject != null) {
                    this.f17558b = pVar;
                    this.f17557a = jSONObject2;
                    this.f17559c = jSONObject;
                    this.f17560d = map;
                    return;
                }
                throw new IllegalArgumentException("No ad object specified");
            }
            throw new IllegalArgumentException("No full response specified");
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public JSONObject U() {
        JSONObject jSONObject;
        synchronized (this.f) {
            jSONObject = this.f17557a;
        }
        return jSONObject;
    }

    public JSONObject V() {
        JSONObject jSONObject;
        synchronized (this.f17561e) {
            jSONObject = this.f17559c;
        }
        return jSONObject;
    }

    public String W() {
        return b("class", (String) null);
    }

    public String X() {
        return b("name", (String) null);
    }

    public String Y() {
        return X().split("_")[0];
    }

    public boolean Z() {
        return b("is_testing", Boolean.FALSE).booleanValue();
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f) {
            bool2 = JsonUtils.getBoolean(this.f17557a, str, bool);
        }
        return bool2;
    }

    public Boolean aa() {
        String str = this.f17558b.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT);
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        if (c(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT)) {
            return b(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, Boolean.FALSE);
        }
        return a(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, (Boolean) null);
    }

    public Boolean ab() {
        String str = this.f17558b.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER);
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        if (c(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER)) {
            return b(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, Boolean.FALSE);
        }
        return a(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, (Boolean) null);
    }

    public Boolean ac() {
        String str = this.f17558b.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.DO_NOT_SELL);
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        if (c(AppLovinSdkExtraParameterKey.DO_NOT_SELL)) {
            return b(AppLovinSdkExtraParameterKey.DO_NOT_SELL, Boolean.FALSE);
        }
        return a(AppLovinSdkExtraParameterKey.DO_NOT_SELL, (Boolean) null);
    }

    public String ad() {
        if (c("consent_string")) {
            return b("consent_string", (String) null);
        }
        return a("consent_string", (String) null);
    }

    public boolean ae() {
        return b("run_on_ui_thread", Boolean.TRUE).booleanValue();
    }

    public Map<String, Object> af() {
        return this.f17560d;
    }

    public Bundle ag() {
        Bundle bundle;
        boolean z10;
        if (d("server_parameters") instanceof JSONObject) {
            bundle = JsonUtils.toBundle(a("server_parameters", (JSONObject) null));
        } else {
            bundle = new Bundle();
        }
        int a10 = a();
        if (a10 != -1) {
            if (a10 == 2) {
                bundle.putBoolean("is_muted", this.f17558b.C().isMuted());
            } else {
                if (a10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bundle.putBoolean("is_muted", z10);
            }
        }
        if (!bundle.containsKey("amount")) {
            bundle.putLong("amount", a("amount", 0L));
        }
        if (!bundle.containsKey(AppLovinEventParameters.REVENUE_CURRENCY)) {
            bundle.putString(AppLovinEventParameters.REVENUE_CURRENCY, a(AppLovinEventParameters.REVENUE_CURRENCY, ""));
        }
        return bundle;
    }

    public Bundle ah() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), ag());
    }

    public long ai() {
        return b("adapter_timeout_ms", ((Long) this.f17558b.a(com.applovin.impl.sdk.c.a.f18690k)).longValue());
    }

    public long aj() {
        return b("init_completion_delay_ms", -1L);
    }

    public long ak() {
        return b("auto_init_delay_ms", 0L);
    }

    public String al() {
        return this.f17563h;
    }

    public Boolean b(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f17561e) {
            bool2 = JsonUtils.getBoolean(this.f17559c, str, bool);
        }
        return bool2;
    }

    public boolean c(String str) {
        boolean has;
        synchronized (this.f17561e) {
            has = this.f17559c.has(str);
        }
        return has;
    }

    public Object d(String str) {
        Object opt;
        synchronized (this.f17561e) {
            opt = this.f17559c.opt(str);
        }
        return opt;
    }

    public void e(String str) {
        this.f17562g = str;
    }

    public void f(String str) {
        this.f17563h = str;
    }

    public List<String> g(String str) {
        if (str != null) {
            JSONArray a10 = a(str, new JSONArray());
            List list = Collections.EMPTY_LIST;
            List optList = JsonUtils.optList(a10, list);
            List optList2 = JsonUtils.optList(b(str, new JSONArray()), list);
            ArrayList arrayList = new ArrayList(optList2.size() + optList.size());
            arrayList.addAll(optList);
            arrayList.addAll(optList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    public String getAdUnitId() {
        return a("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.f17562g;
    }

    public String h(String str) {
        String b10 = b(str, "");
        if (StringUtils.isValidString(b10)) {
            return b10;
        }
        return a(str, "");
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + W() + "', adapterName='" + X() + "', isTesting=" + Z() + '}';
    }

    public int a(String str, int i10) {
        int i11;
        synchronized (this.f) {
            i11 = JsonUtils.getInt(this.f17557a, str, i10);
        }
        return i11;
    }

    public int b(String str, int i10) {
        int i11;
        synchronized (this.f17561e) {
            i11 = JsonUtils.getInt(this.f17559c, str, i10);
        }
        return i11;
    }

    public void c(String str, int i10) {
        synchronized (this.f17561e) {
            JsonUtils.putInt(this.f17559c, str, i10);
        }
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f) {
            jSONArray2 = JsonUtils.getJSONArray(this.f17557a, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f17561e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f17559c, str, jSONArray);
        }
        return jSONArray2;
    }

    public void c(String str, long j10) {
        synchronized (this.f17561e) {
            JsonUtils.putLong(this.f17559c, str, j10);
        }
    }

    public long a(String str, long j10) {
        long j11;
        synchronized (this.f) {
            j11 = JsonUtils.getLong(this.f17557a, str, j10);
        }
        return j11;
    }

    public long b(String str, long j10) {
        long j11;
        synchronized (this.f17561e) {
            j11 = JsonUtils.getLong(this.f17559c, str, j10);
        }
        return j11;
    }

    public void c(String str, String str2) {
        synchronized (this.f17561e) {
            JsonUtils.putString(this.f17559c, str, str2);
        }
    }

    public String a(String str, String str2) {
        String string;
        synchronized (this.f) {
            string = JsonUtils.getString(this.f17557a, str, str2);
        }
        return string;
    }

    public String b(String str, String str2) {
        String string;
        synchronized (this.f17561e) {
            string = JsonUtils.getString(this.f17559c, str, str2);
        }
        return string;
    }

    public float a(String str, float f) {
        float f10;
        synchronized (this.f17561e) {
            f10 = JsonUtils.getFloat(this.f17559c, str, f);
        }
        return f10;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f17561e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f17559c, str, jSONObject);
        }
        return jSONObject2;
    }

    public void a(String str, Object obj) {
        synchronized (this.f17561e) {
            JsonUtils.putObject(this.f17559c, str, obj);
        }
    }

    private int a() {
        return b("mute_state", a("mute_state", ((Integer) this.f17558b.a(com.applovin.impl.sdk.c.a.K)).intValue()));
    }
}
