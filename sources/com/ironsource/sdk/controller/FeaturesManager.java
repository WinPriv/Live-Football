package com.ironsource.sdk.controller;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FeaturesManager {

    /* renamed from: c, reason: collision with root package name */
    public static volatile FeaturesManager f26080c;

    /* renamed from: a, reason: collision with root package name */
    public Map<String, ?> f26081a;

    /* renamed from: b, reason: collision with root package name */
    public final a f26082b = new a();

    /* loaded from: classes2.dex */
    public class a extends ArrayList<String> {
        public a() {
            add("webviewperad-v1");
            add("noPackagesInstallationPolling");
            add("removeViewOnDestroy");
            add("bannerMultipleInstances");
            add("lastUpdateTimeRemoval");
            add("isnFileSystemAPI");
            add("controlActivityLifecycle");
            add("bannersOpenMeasurement");
            add("initRecovery");
        }
    }

    private FeaturesManager() {
        if (f26080c == null) {
            this.f26081a = new HashMap();
            return;
        }
        throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
    }

    public static FeaturesManager getInstance() {
        if (f26080c == null) {
            synchronized (FeaturesManager.class) {
                if (f26080c == null) {
                    f26080c = new FeaturesManager();
                }
            }
        }
        return f26080c;
    }

    public JSONObject getDataManagerConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        if (networkConfiguration.has("dataManager")) {
            return networkConfiguration.optJSONObject("dataManager");
        }
        return new JSONObject();
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.f26081a.containsKey("debugMode")) {
                num = (Integer) this.f26081a.get("debugMode");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int getInitRecoverTrials() {
        JSONObject optJSONObject = SDKUtils.getNetworkConfiguration().optJSONObject("init");
        if (optJSONObject == null) {
            return 0;
        }
        return optJSONObject.optInt("recoverTrials", 0);
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f26081a = map;
    }
}
