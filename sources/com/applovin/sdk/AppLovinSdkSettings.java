package com.applovin.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import e0.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinSdkSettings {

    /* renamed from: a, reason: collision with root package name */
    private boolean f19695a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f19696b;

    /* renamed from: g, reason: collision with root package name */
    private String f19700g;

    /* renamed from: l, reason: collision with root package name */
    private p f19705l;
    private boolean f = true;
    private final Map<String, Object> localSettings = CollectionUtils.map();
    private final Map<String, String> metaData = CollectionUtils.map();

    /* renamed from: h, reason: collision with root package name */
    private List<String> f19701h = Collections.emptyList();

    /* renamed from: i, reason: collision with root package name */
    private List<String> f19702i = Collections.emptyList();

    /* renamed from: j, reason: collision with root package name */
    private final Map<String, String> f19703j = CollectionUtils.map();

    /* renamed from: k, reason: collision with root package name */
    private final Object f19704k = new Object();

    /* renamed from: c, reason: collision with root package name */
    private boolean f19697c = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19698d = true;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19699e = true;

    public AppLovinSdkSettings(Context context) {
        this.f19695a = Utils.isVerboseLoggingEnabled(context);
        a(context);
    }

    @SuppressLint({"DiscouragedApi"})
    private void a(Context context) {
        JSONObject jSONObject;
        String rawResourceString = Utils.getRawResourceString(context.getResources().getIdentifier("applovin_sdk_settings", "raw", context.getPackageName()), context, null);
        if (StringUtils.isValidString(rawResourceString)) {
            jSONObject = JsonUtils.jsonObjectFromJsonString(rawResourceString, new JSONObject());
        } else {
            jSONObject = new JSONObject();
        }
        Map<String, String> tryToStringMap = JsonUtils.tryToStringMap(jSONObject);
        synchronized (this.f19704k) {
            this.f19703j.putAll(tryToStringMap);
        }
    }

    public void attachAppLovinSdk(p pVar) {
        this.f19705l = pVar;
        if (StringUtils.isValidString(this.f19700g)) {
            pVar.av().a(true);
            pVar.av().a(this.f19700g);
            this.f19700g = null;
        }
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.f19704k) {
            map = CollectionUtils.map(this.f19703j);
        }
        return map;
    }

    public List<String> getInitializationAdUnitIds() {
        return this.f19702i;
    }

    public List<String> getTestDeviceAdvertisingIds() {
        return this.f19701h;
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f19697c;
    }

    public boolean isExceptionHandlerEnabled() {
        return this.f19698d;
    }

    public boolean isLocationCollectionEnabled() {
        return this.f19699e;
    }

    public boolean isMuted() {
        return this.f19696b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f19695a;
    }

    public void setCreativeDebuggerEnabled(boolean z10) {
        y.j("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z10 + ")");
        this.f19697c = z10;
    }

    public void setExceptionHandlerEnabled(boolean z10) {
        y.j("AppLovinSdkSettings", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z10 + ")");
        this.f19698d = z10;
    }

    public void setExtraParameter(String str, String str2) {
        String str3;
        y.j("AppLovinSdkSettings", i.g("setExtraParameter(key=", str, ", value=", str2, ")"));
        if (TextUtils.isEmpty(str)) {
            y.i("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        if (str2 != null) {
            str3 = str2.trim();
        } else {
            str3 = null;
        }
        synchronized (this.f19704k) {
            this.f19703j.put(str, str3);
        }
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.f19705l != null) {
                if (StringUtils.isValidString(str3)) {
                    this.f19705l.av().a(true);
                    this.f19705l.av().a(str3);
                    return;
                } else {
                    this.f19705l.av().a(false);
                    this.f19705l.av().a((String) null);
                    return;
                }
            }
            this.f19700g = str3;
        }
    }

    public void setInitializationAdUnitIds(List<String> list) {
        y.j("AppLovinSdkSettings", "setInitializationAdUnitIds(initializationAdUnitIds=" + list + ")");
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (StringUtils.isValidString(str) && str.length() > 0) {
                    if (str.length() == 16) {
                        arrayList.add(str);
                    } else {
                        y.i("AppLovinSdkSettings", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                    }
                }
            }
            this.f19702i = arrayList;
            return;
        }
        this.f19702i = Collections.emptyList();
    }

    public void setLocationCollectionEnabled(boolean z10) {
        y.j("AppLovinSdkSettings", "setLocationCollectionEnabled(locationCollectionEnabled=" + z10 + ")");
        this.f19699e = z10;
    }

    public void setMuted(boolean z10) {
        y.j("AppLovinSdkSettings", "setMuted(muted=" + z10 + ")");
        this.f19696b = z10;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z10) {
        y.j("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z10 + ")");
        this.f = z10;
    }

    public void setTestDeviceAdvertisingIds(List<String> list) {
        y.j("AppLovinSdkSettings", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (str != null && str.length() == 36) {
                    arrayList.add(str);
                } else {
                    y.i("AppLovinSdkSettings", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
                }
            }
            this.f19701h = arrayList;
            return;
        }
        this.f19701h = Collections.emptyList();
    }

    public void setVerboseLogging(boolean z10) {
        y.j("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z10 + ")");
        if (Utils.isVerboseLoggingConfigured()) {
            y.i("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
            if (Utils.isVerboseLoggingEnabled(null) != z10) {
                y.i("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
                return;
            }
            return;
        }
        this.f19695a = z10;
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f;
    }

    public String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.f19695a + ", muted=" + this.f19696b + ", testDeviceAdvertisingIds=" + this.f19701h.toString() + ", initializationAdUnitIds=" + this.f19702i.toString() + ", creativeDebuggerEnabled=" + this.f19697c + ", exceptionHandlerEnabled=" + this.f19698d + ", locationCollectionEnabled=" + this.f19699e + '}';
    }
}
