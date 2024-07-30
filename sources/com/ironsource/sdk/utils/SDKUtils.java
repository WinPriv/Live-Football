package com.ironsource.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.ironsource.environment.h;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.g.f;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SDKUtils {

    /* renamed from: a, reason: collision with root package name */
    public static String f26555a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f26556b = null;

    /* renamed from: c, reason: collision with root package name */
    public static String f26557c = null;

    /* renamed from: d, reason: collision with root package name */
    public static int f26558d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static String f26559e = null;
    public static Map<String, String> f = null;

    /* renamed from: g, reason: collision with root package name */
    public static String f26560g = "";

    /* loaded from: classes2.dex */
    public static class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    static {
        new AtomicInteger(1);
    }

    public static int convertDpToPx(int i10) {
        return (int) TypedValue.applyDimension(0, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i10) {
        return (int) TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static String decodeString(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            Logger.d("SDKUtils", "Failed decoding string " + e10.getMessage());
            return "";
        }
    }

    public static int dpToPx(long j10) {
        return (int) ((((float) j10) * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String encodeString(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] encrypt(java.lang.String r3) {
        /*
            r0 = 0
            java.lang.String r1 = "SHA-1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.io.UnsupportedEncodingException -> L18 java.security.NoSuchAlgorithmException -> L1a
            r1.reset()     // Catch: java.io.UnsupportedEncodingException -> L14 java.security.NoSuchAlgorithmException -> L16
            java.lang.String r2 = "UTF-8"
            byte[] r3 = r3.getBytes(r2)     // Catch: java.io.UnsupportedEncodingException -> L14 java.security.NoSuchAlgorithmException -> L16
            r1.update(r3)     // Catch: java.io.UnsupportedEncodingException -> L14 java.security.NoSuchAlgorithmException -> L16
            goto L1f
        L14:
            r3 = move-exception
            goto L1c
        L16:
            r3 = move-exception
            goto L1c
        L18:
            r3 = move-exception
            goto L1b
        L1a:
            r3 = move-exception
        L1b:
            r1 = r0
        L1c:
            r3.printStackTrace()
        L1f:
            if (r1 == 0) goto L26
            byte[] r3 = r1.digest()
            return r3
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.utils.SDKUtils.encrypt(java.lang.String):byte[]");
    }

    public static String fetchDemandSourceId(f fVar) {
        return fetchDemandSourceId(fVar.f26517d);
    }

    public static String flatMapToJsonAsString(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                try {
                    jSONObject.putOpt(next.getKey(), encodeString(next.getValue()));
                } catch (JSONException e10) {
                    Logger.i("SDKUtils", "flatMapToJsonAsStringfailed " + e10.toString());
                }
                it.remove();
            }
        }
        return jSONObject.toString();
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    public static int getActivityUIFlags(boolean z10) {
        int i10 = 2 | 1796;
        if (z10) {
            return i10 | 4096;
        }
        return i10;
    }

    public static String getAdvertiserId() {
        return f26555a;
    }

    public static String getControllerConfig() {
        return f26559e;
    }

    public static JSONObject getControllerConfigAsJSONObject() {
        try {
            return new JSONObject(getControllerConfig());
        } catch (Exception e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    public static String getControllerUrl() {
        if (!TextUtils.isEmpty(f26557c)) {
            return f26557c;
        }
        return "";
    }

    public static int getDebugMode() {
        return f26558d;
    }

    public static String getFileName(String str) {
        try {
            return URLEncoder.encode(str.split(File.separator)[r1.length - 1].split("\\?")[0], "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static Map<String, String> getInitSDKParams() {
        return f;
    }

    public static String getLimitAdTracking() {
        return f26556b;
    }

    public static String getMD5(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt("minOSVersionSupport");
    }

    public static JSONObject getNetworkConfiguration() {
        JSONObject jSONObject = new JSONObject();
        try {
            return getControllerConfigAsJSONObject().getJSONObject("networkConfig");
        } catch (Exception e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public static JSONObject getOrientation(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", translateOrientation(h.o(context)));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public static d.e getProductType(String str) {
        d.e eVar = d.e.RewardedVideo;
        if (!str.equalsIgnoreCase(eVar.toString())) {
            d.e eVar2 = d.e.Interstitial;
            if (!str.equalsIgnoreCase(eVar2.toString())) {
                d.e eVar3 = d.e.OfferWall;
                if (!str.equalsIgnoreCase(eVar3.toString())) {
                    return null;
                }
                return eVar3;
            }
            return eVar2;
        }
        return eVar;
    }

    public static String getSDKVersion() {
        return "5.121";
    }

    public static String getTesterParameters() {
        return f26560g;
    }

    public static String getValueFromJsonObject(String str, String str2) {
        try {
            return new JSONObject(str).getString(str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isApplicationVisible(Context context) {
        String packageName = context.getPackageName();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equalsIgnoreCase(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExternalStorageAvailable() {
        try {
            String externalStorageState = Environment.getExternalStorageState();
            if (!"mounted".equals(externalStorageState)) {
                if (!"mounted_ro".equals(externalStorageState)) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isIronSourceActivity(Activity activity) {
        if (!(activity instanceof ControllerActivity) && !(activity instanceof OpenUrlActivity)) {
            return false;
        }
        return true;
    }

    public static void loadGoogleAdvertiserInfo(Context context) {
        String C = h.C(context);
        String D = h.D(context);
        if (!TextUtils.isEmpty(C)) {
            f26555a = C;
        }
        if (!TextUtils.isEmpty(D)) {
            f26556b = D;
        }
    }

    public static Map<String, String> mergeHashMaps(Map<String, String>[] mapArr) {
        HashMap hashMap = new HashMap();
        if (mapArr == null) {
            return hashMap;
        }
        for (Map<String, String> map : mapArr) {
            if (map != null) {
                hashMap.putAll(map);
            }
        }
        return hashMap;
    }

    public static JSONObject mergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            jSONObject3 = new JSONObject(jSONObject.toString());
        }
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.names();
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                jSONObject3.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObject3;
    }

    public static int pxToDp(long j10) {
        return (int) ((((float) j10) / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String requireNonEmptyOrNull(String str, String str2) {
        if (str != null) {
            return str;
        }
        throw new NullPointerException(str2);
    }

    public static <T> T requireNonNull(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static void setControllerConfig(String str) {
        f26559e = str;
    }

    public static void setControllerUrl(String str) {
        f26557c = str;
    }

    public static void setDebugMode(int i10) {
        f26558d = i10;
    }

    public static void setInitSDKParams(Map<String, String> map) {
        f = map;
    }

    public static void setTesterParameters(String str) {
        f26560g = str;
    }

    public static void showNoInternetDialog(Context context) {
        new AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new a()).show();
    }

    public static String translateDeviceOrientation(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return "none";
            }
            return "landscape";
        }
        return "portrait";
    }

    public static String translateOrientation(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return "none";
            }
            return "landscape";
        }
        return "portrait";
    }

    public static String translateRequestedOrientation(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 11) {
                    if (i10 != 12) {
                        switch (i10) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return "none";
                        }
                    }
                }
            }
            return "portrait";
        }
        return "landscape";
    }

    public static String fetchDemandSourceId(JSONObject jSONObject) {
        String optString = jSONObject.optString("demandSourceId");
        return !TextUtils.isEmpty(optString) ? optString : jSONObject.optString("demandSourceName");
    }
}
