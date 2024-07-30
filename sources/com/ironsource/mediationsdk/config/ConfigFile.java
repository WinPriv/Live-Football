package com.ironsource.mediationsdk.config;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class ConfigFile {

    /* renamed from: e, reason: collision with root package name */
    public static ConfigFile f25372e;

    /* renamed from: a, reason: collision with root package name */
    public String f25373a;

    /* renamed from: b, reason: collision with root package name */
    public String f25374b;

    /* renamed from: c, reason: collision with root package name */
    public String f25375c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f25376d = {"Unity", "AdobeAir", "Xamarin", "Corona", "AdMob", "ReactNative", "Unreal", "Flutter", "Cordova", "Cocos2dx", "Other"};

    public static synchronized ConfigFile getConfigFile() {
        ConfigFile configFile;
        synchronized (ConfigFile.class) {
            if (f25372e == null) {
                f25372e = new ConfigFile();
            }
            configFile = f25372e;
        }
        return configFile;
    }

    public String getPluginFrameworkVersion() {
        return this.f25375c;
    }

    public String getPluginType() {
        return this.f25373a;
    }

    public String getPluginVersion() {
        return this.f25374b;
    }

    public void setPluginData(String str, String str2, String str3) {
        if (str != null) {
            if (!Arrays.asList(this.f25376d).contains(str)) {
                str = null;
            }
            this.f25373a = str;
        }
        if (str2 != null) {
            this.f25374b = str2;
        }
        if (str3 != null) {
            this.f25375c = str3;
        }
    }
}
