package com.applovin.impl.sdk.utils;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.icu.util.VersionInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.annotation.Keep;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.ab;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.huawei.hms.ads.gl;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

@Keep
/* loaded from: classes.dex */
public abstract class Utils {
    public static final int BYTES_PER_KB = 1000;
    public static final String KEY_AD_VALUES = "ad_values";
    public static final String MACRO_CLCODE = "{CLCODE}";
    public static final String MACRO_CLICK_X = "{CLICK_X}";
    public static final String MACRO_CLICK_Y = "{CLICK_Y}";
    private static final String MACRO_EVENT_ID = "{EVENT_ID}";
    public static final String MACRO_IS_VIDEO_CLICK = "{IS_VIDEO_CLICK}";
    public static final String MACRO_SCREEN_HEIGHT = "{SCREEN_HEIGHT}";
    public static final String MACRO_SCREEN_WIDTH = "{SCREEN_WIDTH}";
    public static final String PLAY_STORE_PACKAGE_NAME = "com.android.vending";
    public static final String PLAY_STORE_SCHEME = "market";
    private static final String TAG = "Utils";
    public static Boolean isDspDemoApp;
    private static final String[] LONG_TIME_FORMATS = {" second ago", " minute ago", " hour ago", " day ago", " week ago", " month ago"};
    private static final String[] LONG_TIME_FORMATS_PLURAL = {" seconds ago", " minutes ago", " hours ago", " days ago", " weeks ago", " months ago"};
    private static final String[] SHORT_TIME_FORMATS = {"s", com.anythink.expressad.d.a.b.dH, "h", "d", "w", "mth"};
    private static final int[] TIME_MULTIPLIERS = {60, 60, 24, 7, 4, 12};
    private static final DecimalFormat decimalFormat = new DecimalFormat();

    public static boolean bitMaskContainsFlag(long j10, long j11) {
        if ((j10 & j11) != 0) {
            return true;
        }
        return false;
    }

    public static List<Uri> checkCachedResourcesExist(boolean z10, com.applovin.impl.sdk.ad.e eVar, com.applovin.impl.sdk.p pVar, Context context) {
        if (eVar instanceof com.applovin.impl.c.a) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = new ArrayList(eVar.B()).iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!pVar.W().b(uri.getLastPathSegment(), context)) {
                pVar.L();
                if (y.a()) {
                    pVar.L().e(TAG, "Cached HTML asset missing: " + uri);
                }
                arrayList.add(uri);
            }
        }
        if (z10) {
            Uri h10 = eVar.h();
            if (!pVar.W().b(h10.getLastPathSegment(), context)) {
                pVar.L();
                if (y.a()) {
                    pVar.L().e(TAG, "Cached video missing: " + h10);
                }
                arrayList.add(h10);
            }
        }
        return arrayList;
    }

    public static boolean checkClassExistence(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean checkClassesExistence(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (checkClassExistence(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void close(Closeable closeable, com.applovin.impl.sdk.p pVar) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th) {
            if (pVar != null) {
                pVar.L();
                if (y.a()) {
                    pVar.L().b(TAG, "Unable to close stream: " + closeable, th);
                }
            }
        }
    }

    public static int compare(String str, String str2) {
        try {
            int compareTo = VersionInfo.getInstance(StringUtils.toDigitsOnlyVersionString(str)).compareTo(VersionInfo.getInstance(StringUtils.toDigitsOnlyVersionString(str2)));
            if (compareTo == 0) {
                return compareTo;
            }
            if (compareTo > 0) {
                return 1;
            }
            return -1;
        } catch (Throwable th) {
            y.c(TAG, "Failed to process version string.", th);
            return 0;
        }
    }

    public static void disconnect(HttpURLConnection httpURLConnection, com.applovin.impl.sdk.p pVar) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Throwable th) {
            if (pVar != null) {
                pVar.L();
                if (y.a()) {
                    pVar.L().b(TAG, "Unable to disconnect connection: " + httpURLConnection, th);
                }
            }
        }
    }

    public static String encodeUrlMap(Map<String, String> map, boolean z10) {
        if (map != null && !map.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                TreeMap treeMap = new TreeMap(new Comparator<String>() { // from class: com.applovin.impl.sdk.utils.Utils.1
                    @Override // java.util.Comparator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public int compare(String str, String str2) {
                        return str.compareToIgnoreCase(str2);
                    }
                });
                treeMap.putAll(map);
                map = treeMap;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append(ContainerUtils.FIELD_DELIMITER);
                }
                String value = entry.getValue();
                if (value instanceof String) {
                    String str = value;
                    if (str.contains(ContainerUtils.FIELD_DELIMITER)) {
                        value = str.replace(ContainerUtils.FIELD_DELIMITER, "%26");
                    }
                }
                sb2.append((Object) entry.getKey());
                sb2.append('=');
                sb2.append((Object) value);
            }
            return sb2.toString();
        }
        return "";
    }

    private static long floatToLong(float f) {
        return Math.round(f);
    }

    public static String formatDoubleValue(double d10, int i10) {
        DecimalFormat decimalFormat2 = decimalFormat;
        decimalFormat2.setMaximumFractionDigits(i10);
        return decimalFormat2.format(d10);
    }

    private static List<Class> generateClassesList(List<String> list, com.applovin.impl.sdk.p pVar) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            try {
                arrayList.add(Class.forName(str));
            } catch (ClassNotFoundException unused) {
                pVar.L();
                if (y.a()) {
                    pVar.L().e(TAG, "Failed to create class for name: " + str);
                }
            }
        }
        return arrayList;
    }

    public static String getAdServeId(Object obj) {
        if (obj instanceof com.applovin.impl.mediation.a.a) {
            return ((com.applovin.impl.mediation.a.a) obj).g();
        }
        if (com.applovin.impl.mediation.d.c.a(obj)) {
            return ((com.applovin.impl.sdk.ad.e) obj).N();
        }
        return null;
    }

    public static int getAlwaysFinishActivitiesSetting(Context context) {
        h.b();
        return Settings.System.getInt(context.getContentResolver(), "always_finish_activities", 0);
    }

    public static String getAndroidOSInfo() {
        try {
            return Build.VERSION.RELEASE + " (" + getAndroidSdkCodename() + " - API " + Build.VERSION.SDK_INT + ")";
        } catch (Throwable th) {
            y.c(TAG, "Unable to get Android OS info", th);
            return "";
        }
    }

    public static String getAndroidSdkCodename() {
        try {
            for (Field field : Build.VERSION_CODES.class.getFields()) {
                if (field.getInt(null) == Build.VERSION.SDK_INT) {
                    return field.getName();
                }
            }
            return "";
        } catch (Throwable th) {
            y.c(TAG, "Unable to get Android SDK codename", th);
            return "";
        }
    }

    public static boolean getBooleanForProbability(int i10) {
        if (i10 <= 0 || i10 > 100 || ((int) (Math.random() * 100.0d)) + 1 > i10) {
            return false;
        }
        return true;
    }

    public static int getExoPlayerVersionCode() {
        return 2015001;
    }

    public static Field getField(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return getField(superclass, str);
        }
    }

    public static String getFileName(Uri uri) {
        return TextUtils.join("_", uri.getPathSegments());
    }

    public static Map<String, String> getMetaData(AppLovinSdkSettings appLovinSdkSettings) {
        try {
            Field field = getField(appLovinSdkSettings.getClass(), "metaData");
            if (field != null) {
                field.setAccessible(true);
            }
            return (Map) field.get(appLovinSdkSettings);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, String str2, String str3, com.applovin.impl.sdk.p pVar) {
        return getPostbacks(str, jSONObject, str2, (Map<String, String>) null, str3, pVar);
    }

    public static String getPrettyDate(long j10, boolean z10) {
        String[] strArr;
        String[] strArr2;
        if (z10) {
            strArr = LONG_TIME_FORMATS;
        } else {
            strArr = SHORT_TIME_FORMATS;
        }
        if (z10) {
            strArr2 = LONG_TIME_FORMATS_PLURAL;
        } else {
            strArr2 = SHORT_TIME_FORMATS;
        }
        long currentTimeMillis = (System.currentTimeMillis() - j10) / 1000;
        for (int i10 = 0; i10 < strArr.length; i10++) {
            int i11 = TIME_MULTIPLIERS[i10];
            if (currentTimeMillis < i11) {
                if (currentTimeMillis <= 0) {
                    if (z10) {
                        return "just now";
                    }
                    return "now";
                }
                if (currentTimeMillis == 1) {
                    return String.format("%d%s", Long.valueOf(currentTimeMillis), strArr[i10]);
                }
                return String.format("%d%s", Long.valueOf(currentTimeMillis), strArr2[i10]);
            }
            currentTimeMillis /= i11;
        }
        if (z10) {
            return "just now";
        }
        return "now";
    }

    public static String getRawResourceString(int i10, Context context, com.applovin.impl.sdk.p pVar) {
        try {
            InputStream openRawResource = context.getResources().openRawResource(i10);
            try {
                byte[] bArr = new byte[openRawResource.available()];
                openRawResource.read(bArr);
                return new String(bArr);
            } catch (IOException e10) {
                if (pVar != null) {
                    pVar.L();
                    if (y.a()) {
                        pVar.L().b(TAG, "Opening raw resource file threw exception", e10);
                    }
                }
                return "";
            } finally {
                close(openRawResource, pVar);
            }
        } catch (Throwable th) {
            if (pVar != null) {
                pVar.L();
                if (y.a()) {
                    pVar.L().b(TAG, "Failed to retrieve resource " + i10, th);
                }
            }
            return "";
        }
    }

    public static View getRootView(View view) {
        View rootView;
        if (view == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        View findViewById = rootView.findViewById(R.id.content);
        if (findViewById != null) {
            return findViewById;
        }
        return rootView;
    }

    public static int getRotation(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        return windowManager.getDefaultDisplay().getRotation();
    }

    public static long getServerAdjustedUnixTimestampMillis(com.applovin.impl.sdk.p pVar) {
        long longValue = ((Long) pVar.a(com.applovin.impl.sdk.c.b.f18728fc)).longValue();
        long longValue2 = ((Long) pVar.a(com.applovin.impl.sdk.c.b.f18729fd)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        if (longValue > 0 && longValue2 > 0) {
            return (longValue - longValue2) + currentTimeMillis;
        }
        return currentTimeMillis;
    }

    public static String getString(Class cls, String str) {
        try {
            Field field = getField(cls, str);
            field.setAccessible(true);
            return (String) field.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int getVideoCompletionPercent(JSONObject jSONObject) {
        int i10 = JsonUtils.getInt(jSONObject, "video_completion_percent", -1);
        if (i10 >= 0 && i10 <= 100) {
            return i10;
        }
        return 95;
    }

    public static com.applovin.impl.sdk.ad.d getZone(JSONObject jSONObject, com.applovin.impl.sdk.p pVar) {
        return com.applovin.impl.sdk.ad.d.a(AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", null)), AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", null)), JsonUtils.getString(jSONObject, "zone_id", null));
    }

    public static byte[] gzip(byte[] bArr) throws IOException {
        if (bArr != null && bArr.length != 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    public static boolean hasAndroidCoreJsonLibrary(com.applovin.impl.sdk.p pVar) {
        if (h.c()) {
            try {
                JSONObject.wrap(JSONObject.NULL);
                return true;
            } catch (Throwable th) {
                pVar.L();
                if (y.a()) {
                    pVar.L().a(TAG, "Failed to wrap JSONObject with exception", th);
                    return false;
                }
                return false;
            }
        }
        return true;
    }

    public static boolean isAppLovinTestEnvironment(Context context) {
        return e.a(context).a("applovin.sdk.is_test_environment");
    }

    public static boolean isBML(AppLovinAdSize appLovinAdSize) {
        if (appLovinAdSize != AppLovinAdSize.BANNER && appLovinAdSize != AppLovinAdSize.MREC && appLovinAdSize != AppLovinAdSize.LEADER && appLovinAdSize != AppLovinAdSize.CROSS_PROMO) {
            return false;
        }
        return true;
    }

    public static boolean isCurrentProcessInForeground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Throwable th) {
            y.c(TAG, "Exception thrown while getting memory state.", th);
        }
        int i10 = runningAppProcessInfo.importance;
        if (i10 != 100 && i10 != 200) {
            return false;
        }
        return true;
    }

    public static boolean isDeepLinkPlusUrl(Uri uri) {
        if (uri == null || !"applovin".equalsIgnoreCase(uri.getScheme()) || !"com.applovin.sdk".equalsIgnoreCase(uri.getHost()) || !"/adservice/deeplink".equals(uri.getPath())) {
            return false;
        }
        return true;
    }

    public static boolean isDomainWhitelisted(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDspDemoApp(Context context) {
        if (isDspDemoApp == null) {
            isDspDemoApp = Boolean.valueOf("com.applovin.apps.dspdemo".equals(context.getPackageName()));
        }
        return isDspDemoApp.booleanValue();
    }

    public static boolean isMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public static boolean isMemberOfPackageNameList(List<String> list) {
        Context y = com.applovin.impl.sdk.p.y();
        if (y == null) {
            y.i(TAG, "Failed to check whether or not app is member of package names");
            return false;
        }
        return list.contains(y.getPackageName());
    }

    public static boolean isProguardRulesOmitted() {
        try {
            String str = AppLovinSdk.VERSION;
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        }
    }

    public static boolean isPubInDebugMode(Context context, com.applovin.impl.sdk.p pVar) {
        String str = pVar.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.RUN_IN_RELEASE_MODE);
        if ((StringUtils.isValidString(str) && Boolean.parseBoolean(str)) || (context.getApplicationInfo().flags & 2) == 0) {
            return false;
        }
        return true;
    }

    public static boolean isTestApp(Context context) {
        String packageName = context.getPackageName();
        if (!"com.revolverolver.fliptrickster".equals(packageName) && !"com.mindstormstudios.idlemakeover".equals(packageName)) {
            return false;
        }
        return true;
    }

    public static boolean isUserAgentCollectionEnabled(com.applovin.impl.sdk.p pVar) {
        String str = pVar.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.USER_AGENT_COLLECTION_ENABLED);
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return true;
    }

    public static boolean isVPNConnected() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                String displayName = networkInterfaces.nextElement().getDisplayName();
                if (displayName.contains("tun") || displayName.contains("ppp") || displayName.contains("ipsec")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            y.c(TAG, "Unable to check Network Interfaces", th);
            return false;
        }
    }

    @Keep
    public static boolean isVerboseLoggingConfigured() {
        Context y = com.applovin.impl.sdk.p.y();
        if (y != null) {
            return e.a(y).a("applovin.sdk.verbose_logging");
        }
        return false;
    }

    public static boolean isVerboseLoggingEnabled(Context context) {
        if (context == null) {
            context = com.applovin.impl.sdk.p.y();
        }
        if (context == null) {
            return false;
        }
        return e.a(context).a("applovin.sdk.verbose_logging", false);
    }

    public static boolean isVideoMutedInitially(com.applovin.impl.sdk.p pVar) {
        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.cI)).booleanValue()) {
            return pVar.C().isMuted();
        }
        return ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.cG)).booleanValue();
    }

    public static boolean isViewInChildView(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (isViewInChildView(view, viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isViewInTopActivity(View view, Activity activity) {
        if (activity != null && view != null) {
            Window window = activity.getWindow();
            if (window != null) {
                return isViewInChildView(view, window.getDecorView());
            }
            View findViewById = activity.findViewById(R.id.content);
            if (findViewById != null) {
                return isViewInChildView(view, findViewById.getRootView());
            }
        }
        return false;
    }

    public static int kilobytesToByes(int i10) {
        return i10 * 1000;
    }

    public static void logJava8MethodReference() {
        y.f("AppLovinSdk", "Java version 8 supported.");
    }

    public static void maybeHandleNoFillResponseForPublisher(String str, MaxAdFormat maxAdFormat, JSONObject jSONObject, com.applovin.impl.sdk.p pVar) {
        String str2;
        if (jSONObject.has("no_fill_reason")) {
            Object object = JsonUtils.getObject(jSONObject, "no_fill_reason", new Object());
            StringBuilder s10 = a3.l.s("\n**************************************************\nNO FILL received:\n..ID: \"", str, "\"\n..FORMAT: \"");
            if (maxAdFormat != null) {
                str2 = maxAdFormat.getLabel();
            } else {
                str2 = "None";
            }
            s10.append(str2);
            s10.append("\"\n..SDK KEY: \"");
            s10.append(pVar.B());
            s10.append("\"\n..PACKAGE NAME: \"");
            s10.append(com.applovin.impl.sdk.p.y().getPackageName());
            s10.append("\"\n..Reason: ");
            s10.append(object);
            s10.append("\n**************************************************\n");
            String sb2 = s10.toString();
            pVar.L();
            if (y.a()) {
                pVar.L().e("AppLovinSdk", sb2);
            }
        }
    }

    public static void maybeLogCustomDataSizeLimit(String str, String str2) {
        if (str != null && str.length() > kilobytesToByes(8)) {
            y.h(str2, "Provided custom data parameter longer than supported (" + str.length() + " bytes, " + kilobytesToByes(8) + " maximum)");
        }
    }

    public static AppLovinAd maybeRetrieveNonDummyAd(AppLovinAd appLovinAd, com.applovin.impl.sdk.p pVar) {
        if (appLovinAd instanceof com.applovin.impl.sdk.ad.f) {
            com.applovin.impl.sdk.ad.f fVar = (com.applovin.impl.sdk.ad.f) appLovinAd;
            AppLovinAd dequeueAd = pVar.E().dequeueAd(fVar.getAdZone());
            pVar.L();
            if (y.a()) {
                pVar.L().b(TAG, "Dequeued ad for dummy ad: " + dequeueAd);
            }
            if (dequeueAd != null) {
                fVar.a(dequeueAd);
                ((AppLovinAdImpl) dequeueAd).setDummyAd(fVar);
                return dequeueAd;
            }
            return fVar.a();
        }
        return appLovinAd;
    }

    public static double millisToSeconds(long j10) {
        return j10 / 1000.0d;
    }

    public static boolean objectIsOfType(Object obj, List<String> list, com.applovin.impl.sdk.p pVar) {
        if (list == null) {
            return false;
        }
        Iterator<Class> it = generateClassesList(list, pVar).iterator();
        while (it.hasNext()) {
            if (it.next().isInstance(obj)) {
                if (obj instanceof Map) {
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        if (!(entry.getKey() instanceof String)) {
                            pVar.L();
                            if (y.a()) {
                                pVar.L().b(TAG, "Invalid key type used. Map keys should be of type String.");
                            }
                            return false;
                        }
                        if (!objectIsOfType(entry.getValue(), list, pVar)) {
                            return false;
                        }
                    }
                    return true;
                }
                if (obj instanceof List) {
                    Iterator it2 = ((List) obj).iterator();
                    while (it2.hasNext()) {
                        if (!objectIsOfType(it2.next(), list, pVar)) {
                            return false;
                        }
                    }
                    return true;
                }
                return true;
            }
        }
        pVar.L();
        if (y.a()) {
            pVar.L().b(TAG, "Object '" + obj + "' does not match any of the required types '" + list + "'.");
        }
        return false;
    }

    public static boolean openUri(Context context, Uri uri, com.applovin.impl.sdk.p pVar) {
        boolean z10 = false;
        if (uri == null) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            if ("market".equals(intent.getScheme())) {
                intent.setPackage("com.android.vending");
            }
            pVar.Y().pauseForClick();
            context.startActivity(intent);
            z10 = true;
        } catch (Throwable th) {
            pVar.L();
            if (y.a()) {
                pVar.L().b(TAG, "Unable to open \"" + uri + "\".", th);
            }
        }
        if (!z10) {
            pVar.Y().resumeForClick();
        }
        return z10;
    }

    public static long parseColor(String str) {
        if (StringUtils.isValidString(str)) {
            try {
                return Color.parseColor(str);
            } catch (Throwable unused) {
                return Long.MAX_VALUE;
            }
        }
        return Long.MAX_VALUE;
    }

    public static void renameKeyInObjectMap(String str, String str2, Map<String, Object> map) {
        if (map.containsKey(str)) {
            map.put(str2, map.get(str));
            map.remove(str);
        }
    }

    public static String retrieveLauncherActivityFullyQualifiedName(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (!queryIntentActivities.isEmpty()) {
            return queryIntentActivities.get(0).activityInfo.name;
        }
        return null;
    }

    public static Activity retrieveParentActivity(View view, com.applovin.impl.sdk.p pVar) {
        if (view == null) {
            return null;
        }
        int i10 = 0;
        while (i10 < 1000) {
            i10++;
            try {
                Context context = view.getContext();
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } catch (Throwable th) {
                pVar.L();
                if (y.a()) {
                    pVar.L().b(TAG, "Encountered error while retrieving activity from view", th);
                }
            }
        }
        return null;
    }

    public static Object sanitizeSuperProperty(Object obj, com.applovin.impl.sdk.p pVar) {
        int intValue;
        String valueOf;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Map map2 = CollectionUtils.map(map.size());
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                if (key instanceof String) {
                    valueOf = (String) key;
                } else {
                    valueOf = String.valueOf(key);
                }
                map2.put(valueOf, sanitizeSuperProperty(entry.getValue(), pVar));
            }
            return map2;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(sanitizeSuperProperty(it.next(), pVar));
            }
            return arrayList;
        }
        if (obj instanceof Date) {
            return String.valueOf(((Date) obj).getTime());
        }
        String valueOf2 = String.valueOf(obj);
        if (obj instanceof String) {
            int intValue2 = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.bs)).intValue();
            if (intValue2 > 0 && valueOf2.length() > intValue2) {
                return valueOf2.substring(0, intValue2);
            }
            return valueOf2;
        }
        if ((obj instanceof Uri) && (intValue = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.bt)).intValue()) > 0 && valueOf2.length() > intValue) {
            return valueOf2.substring(0, intValue);
        }
        return valueOf2;
    }

    public static float secondsToMillis(float f) {
        return f * 1000.0f;
    }

    public static long secondsToMillisLong(float f) {
        return floatToLong(secondsToMillis(f));
    }

    public static void setImageUrl(final String str, final ImageView imageView, final com.applovin.impl.sdk.p pVar) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        pVar.L();
        if (y.a()) {
            pVar.L().b(TAG, "Fetching image: " + str + "...");
        }
        pVar.M().c().execute(new Runnable() { // from class: com.applovin.impl.sdk.utils.Utils.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    InputStream openStream = new URL(str).openStream();
                    final Bitmap decodeStream = BitmapFactory.decodeStream(openStream);
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.Utils.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            pVar.L();
                            if (y.a()) {
                                pVar.L().b(Utils.TAG, "Image fetched");
                            }
                            imageView.setImageDrawable(new BitmapDrawable(com.applovin.impl.sdk.p.y().getResources(), decodeStream));
                        }
                    });
                    Utils.close(openStream, pVar);
                } catch (Throwable th) {
                    pVar.L();
                    if (y.a()) {
                        pVar.L().b(Utils.TAG, "Failed to fetch image: " + str, th);
                    }
                }
            }
        });
    }

    public static String shortenKey(String str) {
        if (str != null && str.length() > 4) {
            return str.substring(str.length() - 4);
        }
        return "NOKEY";
    }

    public static void showAlert(MaxError maxError, String str, Context context) {
        StringBuilder sb2 = new StringBuilder();
        if (maxError.getCode() == -5001) {
            for (MaxNetworkResponseInfo maxNetworkResponseInfo : maxError.getWaterfall().getNetworkResponses()) {
                MaxError error = maxNetworkResponseInfo.getError();
                String name = maxNetworkResponseInfo.getMediatedNetwork().getName();
                sb2.append(e0.i.g("\nFailed to load ", str, " from ", name, ":\n"));
                sb2.append("\nMAX Error " + error.getCode() + ": " + error.getMessage() + "\n");
                StringBuilder s10 = a3.l.s("\n", name, " Error ");
                s10.append(error.getMediatedNetworkErrorCode());
                s10.append(": ");
                s10.append(error.getMediatedNetworkErrorMessage());
                s10.append("\n\n");
                sb2.append(s10.toString());
            }
        } else {
            StringBuilder s11 = a3.l.s("Failed to load ", str, " with error ");
            s11.append(maxError.getCode());
            s11.append(": ");
            s11.append(maxError.getMessage());
            sb2.append(s11.toString());
        }
        showAlert("", sb2.toString(), context);
    }

    public static void showToast(final String str, final Context context) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.Utils.2
            @Override // java.lang.Runnable
            public void run() {
                Toast makeText = Toast.makeText(context, str, 0);
                makeText.setMargin(gl.Code, 0.1f);
                makeText.show();
            }
        });
    }

    public static void showWebViewActivity(Uri uri, Activity activity, com.applovin.impl.sdk.p pVar) {
        if (activity == null) {
            activity = pVar.x();
        }
        Intent intent = new Intent(activity, (Class<?>) AppLovinWebViewActivity.class);
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, pVar.B());
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, uri.toString());
        activity.startActivity(intent);
    }

    public static Map<String, String> stringifyObjectMap(Map<String, Object> map) {
        Map<String, String> map2 = CollectionUtils.map();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                map2.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return map2;
    }

    public static Map<String, String> toUrlSafeMap(Map<String, String> map, com.applovin.impl.sdk.p pVar) {
        Map<String, String> map2 = CollectionUtils.map(map);
        for (String str : map2.keySet()) {
            String str2 = map2.get(str);
            if (str2 != null) {
                map2.put(str, StringUtils.encodeUriString(str2));
            }
        }
        return map2;
    }

    public static int toVersionCode(String str) {
        int i10 = 0;
        for (String str2 : str.replaceAll("-beta", ".").split("\\.")) {
            if (str2.length() > 2) {
                y.i(TAG, "Version number components cannot be longer than two digits -> ".concat(str));
                return i10;
            }
            i10 = (i10 * 100) + Integer.parseInt(str2);
        }
        if (!str.contains("-beta")) {
            return (i10 * 100) + 99;
        }
        return i10;
    }

    public static double tryParseDouble(String str, double d10) {
        try {
            return Double.parseDouble(str);
        } catch (Throwable th) {
            y.c(TAG, "Failed to parse double from String: " + str, th);
            return d10;
        }
    }

    public static WebView tryToCreateWebView(Context context, String str) {
        return tryToCreateWebView(context, str, false);
    }

    public static String urlStringWithoutQueryParameters(String str) {
        Uri parse = Uri.parse(str);
        return new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath()).build().toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void validateAdSdkKey(AppLovinAd appLovinAd, com.applovin.impl.sdk.p pVar) {
        if (!(appLovinAd instanceof AppLovinAdBase)) {
            return;
        }
        String B = pVar.B();
        String B2 = ((AppLovinAdBase) appLovinAd).getSdk().B();
        if (!B.equals(B2)) {
            y.i("AppLovinAd", "Ad was loaded from sdk with key: " + B2 + ", but is being rendered from sdk with key: " + B);
            pVar.P().a(com.applovin.impl.sdk.d.f.f18819n);
        }
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, String str2, String str3, Map<String, String> map, com.applovin.impl.sdk.p pVar) {
        return getPostbacks(str, jSONObject, str2, Collections.emptyMap(), str3, map, false, pVar);
    }

    public static void showToast(String str, MaxAd maxAd, Context context) {
        Toast.makeText(context, maxAd.getFormat().getLabel() + ": " + str, 1).show();
    }

    public static WebView tryToCreateWebView(Context context, String str, boolean z10) {
        try {
            WebView webView = new WebView(context);
            if (z10) {
                webView.setWebViewClient(new ab());
            }
            return webView;
        } catch (Throwable th) {
            y.c(TAG, "Failed to initialize WebView for " + str + ".", th);
            return null;
        }
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, String str2, Map<String, String> map, String str3, com.applovin.impl.sdk.p pVar) {
        return getPostbacks(str, jSONObject, str2, map, str3, null, false, pVar);
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, String str2, Map<String, String> map, String str3, Map<String, String> map2, boolean z10, com.applovin.impl.sdk.p pVar) {
        if (map == null) {
            map = CollectionUtils.map(1);
        }
        Map<String, String> map3 = map;
        map3.put(MACRO_CLCODE, str2);
        return getPostbacks(str, jSONObject, map3, str3, map2, z10, pVar);
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, Map<String, String> map, String str2, com.applovin.impl.sdk.p pVar) {
        return getPostbacks(str, jSONObject, map, str2, (Map<String, String>) null, pVar);
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, Map<String, String> map, String str2, Map<String, String> map2, com.applovin.impl.sdk.p pVar) {
        return getPostbacks(str, jSONObject, map, str2, map2, false, pVar);
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, Map<String, String> map, String str2, Map<String, String> map2, boolean z10, com.applovin.impl.sdk.p pVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, str, new JSONObject());
        ArrayList arrayList = new ArrayList(jSONObject2.length() + 1);
        if (StringUtils.isValidString(str2)) {
            arrayList.add(new com.applovin.impl.sdk.d.a(str2, null, map2, z10));
        }
        if (jSONObject2.length() > 0) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next)) {
                        String optString = jSONObject2.optString(next);
                        String replace = StringUtils.replace(next, map);
                        if (!TextUtils.isEmpty(optString)) {
                            optString = StringUtils.replace(optString, map);
                        }
                        arrayList.add(new com.applovin.impl.sdk.d.a(replace, optString, map2, z10));
                    }
                } catch (Throwable th) {
                    pVar.L();
                    if (y.a()) {
                        pVar.L().b(TAG, "Failed to create and add postback url.", th);
                    }
                }
            }
        }
        return arrayList;
    }

    public static void assertMainThread() {
    }

    public static void showAlert(String str, String str2, Context context) {
        new AlertDialog.Builder(context).setTitle(str).setMessage(str2).setNegativeButton(R.string.ok, (DialogInterface.OnClickListener) null).create().show();
    }
}
