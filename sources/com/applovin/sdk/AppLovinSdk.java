package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.d.c;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.e;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AppLovinSdk {
    private static final String TAG = "AppLovinSdk";
    public static final String VERSION = getVersion();
    public static final int VERSION_CODE = getVersionCode();
    private static final Map<String, AppLovinSdk> sdkInstances = new HashMap(1);
    private static final Object sdkInstancesLock = new Object();
    public final p coreSdk;

    /* loaded from: classes.dex */
    public interface SdkInitializationListener {
        void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    /* loaded from: classes.dex */
    public static class a extends AppLovinSdkSettings {
        public a(Context context) {
            super(context);
        }
    }

    private AppLovinSdk(p pVar) {
        this.coreSdk = pVar;
    }

    public static AppLovinSdk getInstance(Context context) {
        return getInstance(new a(context), context);
    }

    private static String getVersion() {
        return "11.8.2";
    }

    private static int getVersionCode() {
        return 11080299;
    }

    public static void reinitializeAll(Boolean bool, Boolean bool2, Boolean bool3) {
        synchronized (sdkInstancesLock) {
            for (AppLovinSdk appLovinSdk : sdkInstances.values()) {
                appLovinSdk.coreSdk.b();
                appLovinSdk.coreSdk.j();
                if (bool != null) {
                    appLovinSdk.coreSdk.L();
                    if (y.a()) {
                        appLovinSdk.coreSdk.L().c(TAG, "Toggled 'huc' to " + bool);
                    }
                    appLovinSdk.getEventService().trackEvent(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, CollectionUtils.map("value", bool.toString()));
                }
                if (bool2 != null) {
                    appLovinSdk.coreSdk.L();
                    if (y.a()) {
                        appLovinSdk.coreSdk.L().c(TAG, "Toggled 'aru' to " + bool2);
                    }
                    appLovinSdk.getEventService().trackEvent(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, CollectionUtils.map("value", bool2.toString()));
                }
                if (bool3 != null) {
                    appLovinSdk.coreSdk.L();
                    if (y.a()) {
                        appLovinSdk.coreSdk.L().c(TAG, "Toggled 'dns' to " + bool3);
                    }
                    appLovinSdk.getEventService().trackEvent(AppLovinSdkExtraParameterKey.DO_NOT_SELL, CollectionUtils.map("value", bool3.toString()));
                }
            }
        }
    }

    public AppLovinAdService getAdService() {
        return this.coreSdk.E();
    }

    public List<MaxMediatedNetworkInfo> getAvailableMediatedNetworks() {
        JSONArray a10 = c.a(this.coreSdk);
        ArrayList arrayList = new ArrayList(a10.length());
        for (int i10 = 0; i10 < a10.length(); i10++) {
            arrayList.add(new MaxMediatedNetworkInfoImpl(JsonUtils.getJSONObject(a10, i10, (JSONObject) null)));
        }
        return arrayList;
    }

    public AppLovinCFService getCFService() {
        return this.coreSdk.I();
    }

    public AppLovinSdkConfiguration getConfiguration() {
        return this.coreSdk.ax();
    }

    public AppLovinEventService getEventService() {
        return this.coreSdk.G();
    }

    public String getMediationProvider() {
        return this.coreSdk.s();
    }

    public AppLovinPostbackService getPostbackService() {
        return this.coreSdk.ak();
    }

    public String getSdkKey() {
        return this.coreSdk.B();
    }

    public AppLovinSdkSettings getSettings() {
        return this.coreSdk.C();
    }

    public AppLovinTargetingData getTargetingData() {
        return this.coreSdk.r();
    }

    public String getUserIdentifier() {
        return this.coreSdk.o();
    }

    public AppLovinUserSegment getUserSegment() {
        return this.coreSdk.D();
    }

    public AppLovinUserService getUserService() {
        return this.coreSdk.H();
    }

    public AppLovinVariableService getVariableService() {
        return this.coreSdk.J();
    }

    public void initializeSdk() {
    }

    public boolean isEnabled() {
        return this.coreSdk.d();
    }

    public boolean isInitialized() {
        return this.coreSdk.d();
    }

    public void setMediationProvider(String str) {
        this.coreSdk.d(str);
    }

    public void setPluginVersion(String str) {
        this.coreSdk.b(str);
    }

    public void setUserIdentifier(String str) {
        this.coreSdk.c(str);
    }

    public void showCreativeDebugger() {
        this.coreSdk.n();
    }

    public void showMediationDebugger() {
        this.coreSdk.m();
    }

    public String toString() {
        return "AppLovinSdk{sdkKey='" + getSdkKey() + "', isEnabled=" + isEnabled() + ", isFirstSession=" + this.coreSdk.aw() + '}';
    }

    public static AppLovinSdk getInstance(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (context != null) {
            return getInstance(e.a(context).a("applovin.sdk.key", ""), appLovinSdkSettings, context);
        }
        throw new IllegalArgumentException("No context specified");
    }

    public void initializeSdk(SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.a(sdkInitializationListener);
    }

    public void showMediationDebugger(Map<String, List<?>> map) {
        this.coreSdk.a(map);
    }

    public static void initializeSdk(Context context) {
        initializeSdk(context, null);
    }

    public static void initializeSdk(Context context, SdkInitializationListener sdkInitializationListener) {
        if (context != null) {
            AppLovinSdk appLovinSdk = getInstance(context);
            if (appLovinSdk != null) {
                appLovinSdk.initializeSdk(sdkInitializationListener);
                return;
            } else {
                y.i(TAG, "Unable to initialize AppLovin SDK: SDK object not created");
                return;
            }
        }
        throw new IllegalArgumentException("No context specified");
    }

    public static AppLovinSdk getInstance(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (appLovinSdkSettings == null) {
            throw new IllegalArgumentException("No userSettings specified");
        }
        if (context != null) {
            synchronized (sdkInstancesLock) {
                Map<String, AppLovinSdk> map = sdkInstances;
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                if (!TextUtils.isEmpty(str)) {
                    String str2 = File.separator;
                    if (str.contains(str2)) {
                        y.i(TAG, "\n**************************************************\nINVALID SDK KEY: " + str + "\n**************************************************\n");
                        if (!map.isEmpty()) {
                            return map.values().iterator().next();
                        }
                        str = str.replace(str2, "");
                    }
                }
                p pVar = new p();
                pVar.a(str, appLovinSdkSettings, context);
                AppLovinSdk appLovinSdk = new AppLovinSdk(pVar);
                pVar.a(appLovinSdk);
                appLovinSdkSettings.attachAppLovinSdk(pVar);
                map.put(str, appLovinSdk);
                return appLovinSdk;
            }
        }
        throw new IllegalArgumentException("No context specified");
    }
}
