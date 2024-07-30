package com.ironsource.mediationsdk.adunit.adapter.utility;

import java.util.Map;

/* loaded from: classes2.dex */
public class AdData {

    /* renamed from: a, reason: collision with root package name */
    public final String f25126a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, Object> f25127b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, Object> f25128c;

    public AdData(String str, Map<String, Object> map, Map<String, Object> map2) {
        this.f25126a = str;
        this.f25127b = map;
        this.f25128c = map2;
    }

    public Map<String, Object> getAdUnitData() {
        return this.f25128c;
    }

    public Boolean getBoolean(String str) {
        return (Boolean) this.f25127b.get(str);
    }

    public Map<String, Object> getConfiguration() {
        return this.f25127b;
    }

    public Integer getInt(String str) {
        return (Integer) this.f25127b.get(str);
    }

    public String getServerData() {
        return this.f25126a;
    }

    public String getString(String str) {
        return (String) this.f25127b.get(str);
    }
}
