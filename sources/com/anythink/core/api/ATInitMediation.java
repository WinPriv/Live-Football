package com.anythink.core.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.common.b.n;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ATInitMediation {
    public static final String KEY_LOCAL = "anythink_local";

    public static boolean getBooleanFromMap(Map<String, Object> map, String str) {
        return getBooleanFromMap(map, str, false);
    }

    public static double getDoubleFromMap(Map<String, Object> map, String str) {
        return getDoubleFromMap(map, str, 0.0d);
    }

    public static int getIntFromMap(Map<String, Object> map, String str) {
        return getIntFromMap(map, str, 0);
    }

    public static long getLongFromMap(Map<String, Object> map, String str) {
        return getLongFromMap(map, str, 0L);
    }

    public static String getStringFromMap(Map<String, Object> map, String str) {
        return getStringFromMap(map, str, "");
    }

    private static <T> T getValueFromMap(Map<String, Object> map, String str, T t10) {
        Object obj;
        try {
            if (!TextUtils.isEmpty(str) && map != null && map.size() > 0) {
                Object obj2 = map.get(str);
                if (obj2 == null) {
                    return t10;
                }
                String str2 = (T) obj2.toString();
                if (t10 instanceof String) {
                    obj = str2;
                } else if (t10 instanceof Integer) {
                    obj = (T) Integer.valueOf(Integer.parseInt(str2));
                } else if (t10 instanceof Long) {
                    obj = (T) Long.valueOf(Long.parseLong(str2));
                } else if (t10 instanceof Double) {
                    obj = (T) Double.valueOf(Double.parseDouble(str2));
                } else if (t10 instanceof Float) {
                    obj = (T) Float.valueOf(Float.parseFloat(str2));
                } else if (t10 instanceof Boolean) {
                    obj = (T) Boolean.valueOf(Boolean.parseBoolean(str2));
                } else {
                    obj = t10;
                }
                if (ATSDK.isNetworkLogDebug()) {
                    Log.d("ATInitMediation", "key = " + str + "getValueFromMap() >>> result = " + obj + " defaultValue = " + t10);
                }
                return (T) obj;
            }
            return t10;
        } catch (Exception e10) {
            if (ATSDK.isNetworkLogDebug()) {
                Log.e("ATInitMediation", "getValueFromMap() >>> errorMsg = " + e10.getMessage());
            }
            return t10;
        }
    }

    public final void checkToSaveInitData(String str, Map<String, Object> map, String... strArr) {
        n.a().a(str, map, strArr);
    }

    public List getActivityStatus() {
        return null;
    }

    public List getMetaValutStatus() {
        return null;
    }

    public String getNetworkName() {
        return "";
    }

    public String getNetworkSDKClass() {
        return "";
    }

    public String getNetworkVersion() {
        return "";
    }

    public List getPermissionStatus() {
        return null;
    }

    public Map<String, Boolean> getPluginClassStatus() {
        return null;
    }

    public List getProviderStatus() {
        return null;
    }

    public List getResourceStatus() {
        return null;
    }

    public List getServiceStatus() {
        return null;
    }

    public abstract void initSDK(Context context, Map<String, Object> map, MediationInitCallback mediationInitCallback);

    public final void runOnMainThread(Runnable runnable) {
        n.a().a(runnable);
    }

    public final void runOnThreadPool(Runnable runnable) {
        n.a();
        n.b(runnable);
    }

    public boolean setUserDataConsent(Context context, boolean z10, boolean z11) {
        return false;
    }

    public static boolean getBooleanFromMap(Map<String, Object> map, String str, boolean z10) {
        return ((Boolean) getValueFromMap(map, str, Boolean.valueOf(z10))).booleanValue();
    }

    public static double getDoubleFromMap(Map<String, Object> map, String str, double d10) {
        return ((Double) getValueFromMap(map, str, Double.valueOf(d10))).doubleValue();
    }

    public static int getIntFromMap(Map<String, Object> map, String str, int i10) {
        return ((Integer) getValueFromMap(map, str, Integer.valueOf(i10))).intValue();
    }

    public static long getLongFromMap(Map<String, Object> map, String str, long j10) {
        return ((Long) getValueFromMap(map, str, Long.valueOf(j10))).longValue();
    }

    public static String getStringFromMap(Map<String, Object> map, String str, String str2) {
        return (String) getValueFromMap(map, str, str2);
    }
}
