package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.huawei.openalliance.ad.constant.w;
import com.ironsource.mediationsdk.AbstractC1414b;
import com.ironsource.mediationsdk.C1427q;
import com.ironsource.mediationsdk.H;
import com.ironsource.mediationsdk.K;
import com.ironsource.mediationsdk.L;
import com.ironsource.mediationsdk.config.VersionInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class IronSourceUtils {
    public static final int NOT_SAVED_NUMBER_SHARED_PREFERENCE = -1;

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f25876a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public static String f25877b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f25878c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final IronSourceUtils f25879d = new IronSourceUtils();

    public static boolean a(Context context, String str, boolean z10) {
        return context.getSharedPreferences("Mediation_Shared_Preferences", 0).getBoolean(str, z10);
    }

    public static String b(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return "default_is_events_url";
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return "default_rv_events_url";
        }
        if (IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) {
            return "default_pxl_events_url";
        }
        return "";
    }

    public static String c(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return "default_is_events_formatter_type";
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) || IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) {
            return "default_rv_events_formatter_type";
        }
        return "";
    }

    public static void createAndStartWorker(Runnable runnable, String str) {
        Thread thread = new Thread(runnable, str);
        thread.setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
        thread.start();
    }

    public static String d(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return "default_is_trigger_events";
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return "default_rv_trigger_events";
        }
        if (IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) {
            return "default_pxl_trigger_events";
        }
        return "";
    }

    public static boolean doesClassExist(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int e(Context context, String str) {
        return context.getSharedPreferences("Mediation_Shared_Preferences", 0).getInt(str, 0);
    }

    public static void f(Context context, String str, boolean z10) {
        SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
        edit.putBoolean(str, z10);
        edit.apply();
    }

    public static void g(Context context, int i10, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
        edit.putInt(str, i10);
        edit.apply();
    }

    public static String getBase64Auth(String str, String str2) {
        return "Basic " + Base64.encodeToString(e0.i.f(str, w.bE, str2).getBytes(), 10);
    }

    @Deprecated
    public static String getCachedValueByKeyOfCachedInitResponse(Context context, String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(getLastResponse(context));
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        return jSONObject.optString(str);
    }

    public static String getConnectionType(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return "wifi";
            }
            if (!networkCapabilities.hasTransport(0)) {
                return "none";
            }
            return "cellular";
        } catch (Exception e10) {
            IronLog.NATIVE.error("failed to connection type - exception = " + e10);
            return "none";
        }
    }

    public static String getCurrentMethodName() {
        try {
            return new Throwable().getStackTrace()[1].getMethodName();
        } catch (Exception unused) {
            return "";
        }
    }

    public static int getCurrentTimestamp() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public static synchronized String getDefaultEventsFormatterType(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                str2 = context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString(c(str), str2);
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultEventsFormatterType(eventType: " + str + ", defaultFormatterType:" + str2 + ")", e10);
            }
        }
        return str2;
    }

    public static synchronized String getDefaultEventsURL(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                str2 = context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString(b(str), str2);
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultEventsURL(eventType: " + str + ", defaultEventsURL:" + str2 + ")", e10);
            }
        }
        return str2;
    }

    public static synchronized int[] getDefaultNonConnectivityEvents(Context context, String str) {
        int[] iArr;
        String str2;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("Mediation_Shared_Preferences", 0);
                    if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
                        str2 = "default_is_non_connectivity_events";
                    } else if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
                        str2 = "default_rv_non_connectivity_events";
                    } else {
                        str2 = "";
                    }
                    String string = sharedPreferences.getString(str2, null);
                    if (!TextUtils.isEmpty(string)) {
                        StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                        ArrayList arrayList = new ArrayList();
                        while (stringTokenizer.hasMoreTokens()) {
                            arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                        }
                        int size = arrayList.size();
                        iArr = new int[size];
                        for (int i10 = 0; i10 < size; i10++) {
                            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                        }
                    }
                } catch (Exception e10) {
                    IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultNonConnectivityEvents(eventType: " + str + ")", e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iArr;
    }

    public static synchronized int[] getDefaultOptInEvents(Context context, String str) {
        int[] iArr;
        String str2;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("Mediation_Shared_Preferences", 0);
                    if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
                        str2 = "default_is_opt_in_events";
                    } else if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
                        str2 = "default_rv_opt_in_events";
                    } else {
                        str2 = "";
                    }
                    String string = sharedPreferences.getString(str2, null);
                    if (!TextUtils.isEmpty(string)) {
                        StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                        ArrayList arrayList = new ArrayList();
                        while (stringTokenizer.hasMoreTokens()) {
                            arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                        }
                        int size = arrayList.size();
                        iArr = new int[size];
                        for (int i10 = 0; i10 < size; i10++) {
                            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                        }
                    }
                } catch (Exception e10) {
                    IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultOptInEvents(eventType: " + str + ")", e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iArr;
    }

    public static synchronized int[] getDefaultOptOutEvents(Context context, String str) {
        int[] iArr;
        String str2;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("Mediation_Shared_Preferences", 0);
                    if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
                        str2 = "default_is_opt_out_events";
                    } else if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
                        str2 = "default_rv_opt_out_events";
                    } else {
                        str2 = "";
                    }
                    String string = sharedPreferences.getString(str2, null);
                    if (!TextUtils.isEmpty(string)) {
                        StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                        ArrayList arrayList = new ArrayList();
                        while (stringTokenizer.hasMoreTokens()) {
                            arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                        }
                        int size = arrayList.size();
                        iArr = new int[size];
                        for (int i10 = 0; i10 < size; i10++) {
                            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                        }
                    }
                } catch (Exception e10) {
                    IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultOptOutEvents(eventType: " + str + ")", e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iArr;
    }

    public static synchronized int[] getDefaultTriggerEvents(Context context, String str) {
        int[] iArr;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString(d(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                    }
                }
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultTriggerEvents(eventType: " + str + ")", e10);
            }
        }
        return iArr;
    }

    public static String getDeviceType(Context context) {
        if (com.ironsource.environment.h.c(context)) {
            return "Tablet";
        }
        return "Phone";
    }

    public static boolean getFirstSession(Context context) {
        if (f25878c == null) {
            f25878c = Boolean.valueOf(!H.b(context));
        }
        return f25878c.booleanValue();
    }

    public static long getFirstSessionTimestamp(Context context) {
        if (context == null) {
            return -1L;
        }
        return context.getSharedPreferences("Mediation_Shared_Preferences", 0).getLong(IronSourceConstants.FIRST_SESSION_TIMESTAMP, -1L);
    }

    public static IronSourceUtils getInstance() {
        return f25879d;
    }

    public static K getIronSourceAdvId(Context context) {
        String str;
        if (context != null) {
            L.a();
            String a10 = L.a(context);
            if (TextUtils.isEmpty(a10)) {
                a10 = com.ironsource.environment.h.x(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 0);
                str = IronSourceConstants.TYPE_UUID;
            } else {
                str = IronSourceConstants.TYPE_GAID;
            }
            return new K(a10, str);
        }
        return null;
    }

    public static JSONObject getJsonForMetaData(String str, List<String> list, List<String> list2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (int i11 = 0; i10 < list.size() && i11 < list2.size(); i11++) {
                String str2 = list.get(i10);
                String str3 = list2.get(i11);
                if (!TextUtils.isEmpty(str3) && !str2.equals(str3)) {
                    str2 = str2 + w.aG + str3;
                }
                arrayList.add(str2);
                i10++;
            }
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, str + w.aG + TextUtils.join(",", arrayList));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONObject getJsonForUserId(boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z10) {
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, "dynamic");
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static String getLastResponse(Context context) {
        return context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString("last_response", "");
    }

    public static String getMD5(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (Throwable th) {
            if (str == null) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getMD5(input:null)", th);
                return "";
            }
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, a3.k.l("getMD5(input:", str, ")"), th);
            return "";
        }
    }

    public static JSONObject getMediationAdditionalData(boolean z10) {
        return getMediationAdditionalData(z10, false, 1);
    }

    public static String getMediationUserId() {
        return com.ironsource.mediationsdk.sdk.e.a().a("userId");
    }

    public static JSONObject getProviderAdditionalData(AbstractC1414b abstractC1414b) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("providerPriority", abstractC1414b.f25332n);
            jSONObject.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, abstractC1414b.f);
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, !TextUtils.isEmpty(abstractC1414b.f25325g) ? abstractC1414b.f25325g : abstractC1414b.j());
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractC1414b.f25321b.getCoreSDKVersion());
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractC1414b.f25321b.getVersion());
        } catch (Exception e10) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getProviderAdditionalData(adapter: " + abstractC1414b.j() + ")", e10);
        }
        return jSONObject;
    }

    public static String getSDKVersion() {
        return VersionInfo.VERSION;
    }

    public static String getSHA256(String str) {
        try {
            return String.format("%064x", new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(str.getBytes())));
        } catch (NoSuchAlgorithmException e10) {
            if (str == null) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getSHA256(input:null)", e10);
                return "";
            }
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, a3.k.l("getSHA256(input:", str, ")"), e10);
            return "";
        }
    }

    public static int getSerr() {
        return 1;
    }

    public static synchronized String getSessionId() {
        String str;
        synchronized (IronSourceUtils.class) {
            if (f25876a.compareAndSet(false, true)) {
                f25877b = UUID.randomUUID().toString();
            }
            str = f25877b;
        }
        return str;
    }

    public static long getTimeStamp() {
        return System.currentTimeMillis();
    }

    public static String getTransId(long j10, String str) {
        return getSHA256(String.format("%s%s%s", Long.valueOf(j10), L.a().f24855j, str));
    }

    public static String getUserIdForNetworks() {
        String a10 = com.ironsource.mediationsdk.sdk.e.a().a("userIdType");
        String a11 = com.ironsource.mediationsdk.sdk.e.a().a("userId");
        if (a10 != null && a10.equals(IronSourceConstants.TYPE_USER_GENERATED) && !TextUtils.isEmpty(a11)) {
            return a11;
        }
        return null;
    }

    public static void h(long j10, Context context, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
        edit.putLong(str, j10);
        edit.apply();
    }

    public static void i(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static boolean isAndroidXAvailable() {
        if (!doesClassExist("androidx.appcompat.app.AppCompatActivity") && !doesClassExist("androidx.core.app.CoreComponentFactory") && !doesClassExist("androidx.fragment.app.Fragment") && !doesClassExist("androidx.lifecycle.LiveData") && !doesClassExist("androidx.annotation.Keep")) {
            return false;
        }
        return true;
    }

    public static boolean isGooglePlayInstalled(Context context) {
        return com.ironsource.environment.k.a(context);
    }

    @Deprecated
    public static boolean isInitResponseCached(Context context) {
        String cachedValueByKeyOfCachedInitResponse = getCachedValueByKeyOfCachedInitResponse(context, "appKey");
        String cachedValueByKeyOfCachedInitResponse2 = getCachedValueByKeyOfCachedInitResponse(context, "userId");
        String cachedValueByKeyOfCachedInitResponse3 = getCachedValueByKeyOfCachedInitResponse(context, "response");
        if (!TextUtils.isEmpty(cachedValueByKeyOfCachedInitResponse) && !TextUtils.isEmpty(cachedValueByKeyOfCachedInitResponse2) && !TextUtils.isEmpty(cachedValueByKeyOfCachedInitResponse3)) {
            return true;
        }
        return false;
    }

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception e10) {
            IronLog.NATIVE.error("failed to check if network is connected - exception = " + e10);
            return false;
        }
    }

    public static JSONObject mergeJsons(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        if (jSONObject == null && jSONObject2 == null) {
            return new JSONObject();
        }
        if (jSONObject == null) {
            return jSONObject2;
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject.has(next)) {
                jSONObject.put(next, jSONObject2.get(next));
            }
        }
        return jSONObject;
    }

    public static Vector<Pair<String, String>> parseJsonToPairVector(JSONObject jSONObject) {
        Vector<Pair<String, String>> vector = new Vector<>();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        vector.add(new Pair<>(next, jSONObject.get(next).toString()));
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return vector;
    }

    public static Map<String, String> parseJsonToStringMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        hashMap.put(next, jSONObject.get(next).toString());
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return hashMap;
    }

    public static synchronized void saveDefaultEventsFormatterType(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
                edit.putString(c(str), str2);
                edit.commit();
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultEventsFormatterType(eventType: " + str + ", formatterType:" + str2 + ")", e10);
            }
        }
    }

    public static synchronized void saveDefaultEventsURL(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
                edit.putString(b(str), str2);
                edit.commit();
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultEventsURL(eventType: " + str + ", eventsUrl:" + str2 + ")", e10);
            }
        }
    }

    public static synchronized void saveDefaultNonConnectivityEvents(Context context, String str, int[] iArr) {
        String str2;
        String str3;
        synchronized (IronSourceUtils.class) {
            try {
                try {
                    SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
                    if (iArr != null) {
                        StringBuilder sb2 = new StringBuilder();
                        for (int i10 : iArr) {
                            sb2.append(i10);
                            sb2.append(",");
                        }
                        str2 = sb2.toString();
                    } else {
                        str2 = null;
                    }
                    if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
                        str3 = "default_is_non_connectivity_events";
                    } else if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
                        str3 = "default_rv_non_connectivity_events";
                    } else {
                        str3 = "";
                    }
                    edit.putString(str3, str2);
                    edit.commit();
                } catch (Exception e10) {
                    IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultNonConnectivityEvents(eventType: " + str + ", nonConnectivityEvents:" + iArr + ")", e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void saveDefaultOptInEvents(Context context, String str, int[] iArr) {
        String str2;
        String str3;
        synchronized (IronSourceUtils.class) {
            try {
                try {
                    SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
                    if (iArr != null) {
                        StringBuilder sb2 = new StringBuilder();
                        for (int i10 : iArr) {
                            sb2.append(i10);
                            sb2.append(",");
                        }
                        str2 = sb2.toString();
                    } else {
                        str2 = null;
                    }
                    if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
                        str3 = "default_is_opt_in_events";
                    } else if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
                        str3 = "default_rv_opt_in_events";
                    } else {
                        str3 = "";
                    }
                    edit.putString(str3, str2);
                    edit.commit();
                } catch (Exception e10) {
                    IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptInEvents(eventType: " + str + ", optInEvents:" + iArr + ")", e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void saveDefaultOptOutEvents(Context context, String str, int[] iArr) {
        String str2;
        String str3;
        synchronized (IronSourceUtils.class) {
            try {
                try {
                    SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
                    if (iArr != null) {
                        StringBuilder sb2 = new StringBuilder();
                        for (int i10 : iArr) {
                            sb2.append(i10);
                            sb2.append(",");
                        }
                        str2 = sb2.toString();
                    } else {
                        str2 = null;
                    }
                    if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
                        str3 = "default_is_opt_out_events";
                    } else if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
                        str3 = "default_rv_opt_out_events";
                    } else {
                        str3 = "";
                    }
                    edit.putString(str3, str2);
                    edit.commit();
                } catch (Exception e10) {
                    IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptOutEvents(eventType: " + str + ", optOutEvents:" + iArr + ")", e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void saveDefaultTriggerEvents(Context context, String str, int[] iArr) {
        String str2;
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
                if (iArr != null) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 : iArr) {
                        sb2.append(i10);
                        sb2.append(",");
                    }
                    str2 = sb2.toString();
                } else {
                    str2 = null;
                }
                edit.putString(d(str), str2);
                edit.commit();
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultTriggerEvents(eventType: " + str + ", triggerEvents:" + iArr + ")", e10);
            }
        }
    }

    public static void saveFirstSessionTimestamp(Context context, long j10) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
        edit.putLong(IronSourceConstants.FIRST_SESSION_TIMESTAMP, j10);
        edit.apply();
    }

    public static synchronized void saveLastResponse(Context context, String str) {
        synchronized (IronSourceUtils.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
            edit.putString("last_response", str);
            edit.apply();
        }
    }

    public static synchronized void sendAutomationLog(String str) {
        synchronized (IronSourceUtils.class) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "automation_log:" + Long.toString(System.currentTimeMillis()) + " text: " + str, 0);
        }
    }

    public static JSONObject getMediationAdditionalData(boolean z10, boolean z11, int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z10) {
                jSONObject.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            }
            if (z11 && i10 != -1) {
                jSONObject.put(IronSourceConstants.EVENTS_PROGRAMMATIC, i10);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONObject getProviderAdditionalData(C1427q c1427q) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, c1427q.f25791b.getSubProviderId());
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, !TextUtils.isEmpty(c1427q.f25791b.getAdSourceNameForEvents()) ? c1427q.f25791b.getAdSourceNameForEvents() : c1427q.a());
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, c1427q.f25790a.getCoreSDKVersion());
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, c1427q.f25790a.getVersion());
            jSONObject.put("providerPriority", c1427q.f);
        } catch (Exception e10) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getProviderAdditionalData(adapter: " + c1427q.a() + ")", e10);
        }
        return jSONObject;
    }
}
