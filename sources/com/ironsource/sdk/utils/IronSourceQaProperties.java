package com.ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class IronSourceQaProperties {

    /* renamed from: a, reason: collision with root package name */
    public static IronSourceQaProperties f26550a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f26551b = new HashMap();

    private IronSourceQaProperties() {
    }

    public static IronSourceQaProperties getInstance() {
        if (f26550a == null) {
            f26550a = new IronSourceQaProperties();
        }
        return f26550a;
    }

    public static boolean isInitialized() {
        if (f26550a != null) {
            return true;
        }
        return false;
    }

    public Map<String, String> getParameters() {
        return f26551b;
    }

    public void setQaParameter(String str, String str2) {
        if (str != null && str2 != null) {
            f26551b.put(str, str2);
        }
    }
}
