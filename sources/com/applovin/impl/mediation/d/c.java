package com.applovin.impl.mediation.d;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.vungle.warren.BuildConfig;
import com.vungle.warren.utility.platform.Platform;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final TreeMap<String, String> f17890a;

    /* renamed from: b, reason: collision with root package name */
    private static final List<String> f17891b;

    /* renamed from: c, reason: collision with root package name */
    private static JSONArray f17892c;

    /* renamed from: d, reason: collision with root package name */
    private static final Object f17893d = new Object();

    static {
        TreeMap<String, String> treeMap = new TreeMap<>();
        f17890a = treeMap;
        treeMap.put("com.applovin.mediation.adapters.AdColonyMediationAdapter", "AdColony");
        treeMap.put("com.applovin.mediation.adapters.AmazonMediationAdapter", Platform.MANUFACTURER_AMAZON);
        treeMap.put("com.applovin.mediation.adapters.AmazonPublisherServicesMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", "AppLovin");
        treeMap.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", "BidMachine");
        treeMap.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "Chartboost");
        treeMap.put("com.applovin.mediation.adapters.CriteoMediationAdapter", "Criteo");
        treeMap.put("com.applovin.mediation.adapters.CSJMediationAdapter", "CSJ");
        treeMap.put("com.applovin.mediation.adapters.DataseatMediationAdapter", "Dataseat");
        treeMap.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "Facebook");
        treeMap.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "AdMob");
        treeMap.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "Google Ad Manager");
        treeMap.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "HyprMX");
        treeMap.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "InMobi");
        treeMap.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "Fyber");
        treeMap.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "ironSource");
        treeMap.put("com.applovin.mediation.adapters.LineMediationAdapter", "LINE");
        treeMap.put("com.applovin.mediation.adapters.MaioMediationAdapter", "Maio");
        treeMap.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "Mintegral");
        treeMap.put("com.applovin.mediation.adapters.MobileFuseMediationAdapter", "MobileFuse");
        treeMap.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "myTarget");
        treeMap.put("com.applovin.mediation.adapters.NendMediationAdapter", "Nend");
        treeMap.put("com.applovin.mediation.adapters.NimbusMediationAdapter", "Nimbus");
        treeMap.put("com.applovin.mediation.adapters.OguryMediationAdapter", "Ogury");
        treeMap.put("com.applovin.mediation.adapters.OguryPresageMediationAdapter", "Ogury Presage");
        treeMap.put("com.applovin.mediation.adapters.PangleMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.SayGamesMediationAdapter", "SayGames");
        treeMap.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "Smaato");
        treeMap.put("com.applovin.mediation.adapters.SnapMediationAdapter", "Snap");
        treeMap.put("com.applovin.mediation.adapters.TapjoyMediationAdapter", "Tapjoy");
        treeMap.put("com.applovin.mediation.adapters.TencentMediationAdapter", "Tencent");
        treeMap.put("com.applovin.mediation.adapters.TaboolaMediationAdapter", "Taboola");
        treeMap.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "Unity Ads");
        treeMap.put("com.applovin.mediation.adapters.VerizonAdsMediationAdapter", "Verizon");
        treeMap.put("com.applovin.mediation.adapters.VerveMediationAdapter", "Verve");
        treeMap.put("com.applovin.mediation.adapters.VungleMediationAdapter", BuildConfig.OMSDK_PARTNER_NAME);
        treeMap.put("com.applovin.mediation.adapters.YahooMediationAdapter", "Yahoo");
        treeMap.put("com.applovin.mediation.adapters.YandexMediationAdapter", "Yandex");
        f17891b = new ArrayList(treeMap.keySet());
    }

    public static JSONArray a(p pVar) {
        if (f17892c != null) {
            b(pVar);
            return f17892c;
        }
        f17892c = new JSONArray();
        for (String str : f17891b) {
            MaxAdapter b10 = b(str, pVar);
            if (b10 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", f17890a.get(str));
                    jSONObject.put("class", str);
                    jSONObject.put("sdk_version", b10.getSdkVersion());
                    jSONObject.put("version", b10.getAdapterVersion());
                } catch (Throwable unused) {
                }
                synchronized (f17893d) {
                    f17892c.put(jSONObject);
                }
            }
        }
        return f17892c;
    }

    private static void b(p pVar) {
        MaxAdapter b10;
        for (int i10 = 0; i10 < f17892c.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(f17892c, i10, (JSONObject) null);
            String string = JsonUtils.getString(jSONObject, "class", "");
            if (!StringUtils.isValidString(JsonUtils.getString(jSONObject, "sdk_version", "")) && (b10 = b(string, pVar)) != null) {
                String sdkVersion = b10.getSdkVersion();
                if (StringUtils.isValidString(sdkVersion)) {
                    synchronized (f17893d) {
                        JsonUtils.putString(jSONObject, "sdk_version", sdkVersion);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public static MaxAdapter b(String str, p pVar) {
        Class<?> cls;
        if (TextUtils.isEmpty(str)) {
            pVar.L();
            if (y.a()) {
                pVar.L().e("AppLovinSdk", "Failed to create adapter instance. No class name provided");
            }
            return null;
        }
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            pVar.L();
            if (y.a()) {
                pVar.L().b("AppLovinSdk", "Failed to load: " + str, th);
            }
        }
        if (MaxAdapter.class.isAssignableFrom(cls)) {
            return (MaxAdapter) cls.getConstructor(AppLovinSdk.class).newInstance(pVar.K());
        }
        pVar.L();
        if (y.a()) {
            pVar.L().e("AppLovinSdk", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
        }
        return null;
    }

    public static JSONObject a(String str, p pVar) {
        JSONArray a10 = a(pVar);
        for (int i10 = 0; i10 < a10.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(a10, i10, (JSONObject) null);
            if (jSONObject != null && str.equals(JsonUtils.getString(jSONObject, "class", null))) {
                return jSONObject;
            }
        }
        return null;
    }

    public static boolean b(Object obj) {
        return (obj instanceof com.applovin.impl.mediation.a.a) && "APPLOVIN".equals(((com.applovin.impl.mediation.a.a) obj).Y());
    }

    public static o.a a(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.INTERSTITIAL) {
            return o.a.MEDIATION_INTERSTITIAL;
        }
        if (maxAdFormat == MaxAdFormat.APP_OPEN) {
            return o.a.MEDIATION_APP_OPEN;
        }
        if (maxAdFormat == MaxAdFormat.REWARDED) {
            return o.a.MEDIATION_INCENTIVIZED;
        }
        if (maxAdFormat == MaxAdFormat.REWARDED_INTERSTITIAL) {
            return o.a.MEDIATION_REWARDED_INTERSTITIAL;
        }
        return o.a.MEDIATION_BANNER;
    }

    public static boolean a(Object obj) {
        return (obj instanceof e) && StringUtils.isValidString(((e) obj).N());
    }

    public static AppLovinSdkUtils.Size a(int i10, MaxAdFormat maxAdFormat, Context context) {
        Display defaultDisplay;
        if (i10 < 0) {
            try {
                if (context instanceof Activity) {
                    defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
                } else {
                    defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                }
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                i10 = AppLovinSdkUtils.pxToDp(context, displayMetrics.widthPixels);
            } catch (Throwable unused) {
                return maxAdFormat.getSize();
            }
        }
        Class<?> cls = Class.forName("com.google.android.gms.ads.AdSize");
        Method method = cls.getMethod("getCurrentOrientationAnchoredAdaptiveBannerAdSize", Context.class, Integer.TYPE);
        Method method2 = cls.getMethod("getWidth", new Class[0]);
        Method method3 = cls.getMethod("getHeight", new Class[0]);
        Object invoke = method.invoke(null, context, Integer.valueOf(i10));
        return new AppLovinSdkUtils.Size(((Integer) method2.invoke(invoke, new Object[0])).intValue(), ((Integer) method3.invoke(invoke, new Object[0])).intValue());
    }
}
