package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.anythink.core.api.ATAdConst;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.e.f;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.d;
import com.applovin.impl.sdk.utils.h;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.huawei.openalliance.ad.constant.av;
import com.huawei.openalliance.ad.constant.ba;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class q {

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicReference<d.a> f19264h = new AtomicReference<>();

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicReference<a> f19265j = new AtomicReference<>();

    /* renamed from: a, reason: collision with root package name */
    private final p f19266a;

    /* renamed from: b, reason: collision with root package name */
    private final y f19267b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f19268c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Object> f19269d;
    private final Map<String, Object> f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19271g;

    /* renamed from: e, reason: collision with root package name */
    private final Object f19270e = new Object();

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference<Integer> f19272i = new AtomicReference<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f19278a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19279b;

        public a(String str, int i10) {
            this.f19278a = str;
            this.f19279b = i10;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f19280a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f19281b = -1;
    }

    public q(p pVar) {
        if (pVar != null) {
            this.f19266a = pVar;
            this.f19267b = pVar.L();
            this.f19268c = p.y();
            this.f19269d = q();
            this.f = s();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Integer A() {
        if (((AudioManager) this.f19268c.getSystemService(com.anythink.expressad.exoplayer.k.o.f9069b)) == null) {
            return null;
        }
        try {
            return Integer.valueOf((int) (r0.getStreamVolume(3) * ((Float) this.f19266a.a(com.applovin.impl.sdk.c.b.eg)).floatValue()));
        } catch (Throwable th) {
            this.f19266a.L();
            if (y.a()) {
                this.f19266a.L().b("DataCollector", "Unable to collect device volume", th);
            }
            return null;
        }
    }

    private double B() {
        return Math.round((TimeZone.getDefault().getOffset(new Date().getTime()) * 10.0d) / 3600000.0d) / 10.0d;
    }

    private boolean C() {
        SensorManager sensorManager = (SensorManager) this.f19268c.getSystemService("sensor");
        if (sensorManager != null && sensorManager.getDefaultSensor(4) != null) {
            return true;
        }
        return false;
    }

    private String D() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f19268c.getSystemService("phone");
        if (telephonyManager != null) {
            return telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH);
        }
        return "";
    }

    private String E() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f19268c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                String networkOperator = telephonyManager.getNetworkOperator();
                return networkOperator.substring(0, Math.min(3, networkOperator.length()));
            } catch (Throwable th) {
                if (y.a()) {
                    this.f19267b.b("DataCollector", "Unable to collect mobile country code", th);
                    return "";
                }
                return "";
            }
        }
        return "";
    }

    private String F() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f19268c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                String networkOperator = telephonyManager.getNetworkOperator();
                return networkOperator.substring(Math.min(3, networkOperator.length()));
            } catch (Throwable th) {
                if (y.a()) {
                    this.f19267b.b("DataCollector", "Unable to collect mobile network code", th);
                    return "";
                }
                return "";
            }
        }
        return "";
    }

    private String G() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f19268c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                return telephonyManager.getNetworkOperatorName();
            } catch (Throwable th) {
                if (y.a()) {
                    this.f19267b.b("DataCollector", "Unable to collect carrier", th);
                    return "";
                }
                return "";
            }
        }
        return "";
    }

    private boolean H() {
        try {
            if (!I()) {
                if (!J()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean I() {
        String str = Build.TAGS;
        if (str != null && str.contains(b("lz}$blpz"))) {
            return true;
        }
        return false;
    }

    private boolean J() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i10 = 0; i10 < 9; i10++) {
            if (new File(b(strArr[i10])).exists()) {
                return true;
            }
        }
        return false;
    }

    private Map<String, String> p() {
        return Utils.stringifyObjectMap(a(null, true, false));
    }

    private Map<String, Object> q() {
        Map<String, Object> map = CollectionUtils.map(32);
        map.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        map.put("brand", Build.MANUFACTURER);
        map.put("brand_name", Build.BRAND);
        map.put("hardware", Build.HARDWARE);
        map.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        map.put("aida", Boolean.valueOf(com.applovin.impl.sdk.utils.d.a()));
        map.put("locale", Locale.getDefault().toString());
        map.put("model", Build.MODEL);
        map.put("os", Build.VERSION.RELEASE);
        map.put("platform", f());
        map.put("revision", Build.DEVICE);
        map.put("tz_offset", Double.valueOf(B()));
        map.put("gy", Boolean.valueOf(C()));
        map.put(com.anythink.expressad.foundation.g.a.bD, D());
        map.put("mcc", E());
        map.put("mnc", F());
        map.put("carrier", G());
        map.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f19268c)));
        map.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f19268c)));
        DisplayMetrics displayMetrics = this.f19268c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            map.put("adns", Float.valueOf(displayMetrics.density));
            map.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            map.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            map.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            Point a10 = com.applovin.impl.sdk.utils.h.a(this.f19268c);
            map.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow(a10.y, 2.0d) + Math.pow(a10.x, 2.0d)) / displayMetrics.xdpi));
            h.a a11 = com.applovin.impl.sdk.utils.h.a(this.f19268c, this.f19266a);
            if (a11 != null) {
                map.put("tl_cr", Integer.valueOf(a11.a()));
                map.put("tr_cr", Integer.valueOf(a11.b()));
                map.put("bl_cr", Integer.valueOf(a11.c()));
                map.put("br_cr", Integer.valueOf(a11.d()));
            }
        }
        map.put("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        a(map);
        return map;
    }

    private String r() {
        int orientation = AppLovinSdkUtils.getOrientation(this.f19268c);
        if (orientation == 1) {
            return "portrait";
        }
        if (orientation == 2) {
            return "landscape";
        }
        return "none";
    }

    private Map<String, Object> s() {
        PackageInfo packageInfo;
        String str;
        int i10;
        Map<String, Object> map = CollectionUtils.map();
        PackageManager packageManager = this.f19268c.getPackageManager();
        ApplicationInfo applicationInfo = this.f19268c.getApplicationInfo();
        long lastModified = new File(applicationInfo.sourceDir).lastModified();
        String str2 = null;
        try {
            packageInfo = packageManager.getPackageInfo(this.f19268c.getPackageName(), 0);
            try {
                str2 = packageManager.getInstallerPackageName(applicationInfo.packageName);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            packageInfo = null;
        }
        map.put(ATAdConst.KEY.APP_NAME, packageManager.getApplicationLabel(applicationInfo));
        Object obj = "";
        if (packageInfo == null) {
            str = "";
        } else {
            str = packageInfo.versionName;
        }
        map.put("app_version", str);
        if (packageInfo != null) {
            i10 = packageInfo.versionCode;
        } else {
            i10 = -1;
        }
        map.put("app_version_code", Integer.valueOf(i10));
        map.put("package_name", applicationInfo.packageName);
        map.put("vz", StringUtils.toShortSHA1Hash(applicationInfo.packageName));
        if (str2 == null) {
            str2 = "";
        }
        map.put("installer_name", str2);
        map.put("tg", com.applovin.impl.sdk.utils.q.a(this.f19266a));
        map.put("debug", Boolean.valueOf(Utils.isPubInDebugMode(p.y(), this.f19266a)));
        map.put("ia", Long.valueOf(lastModified));
        map.put("alts_ms", Long.valueOf(p.z()));
        map.put("j8", Boolean.valueOf(p.A()));
        p pVar = this.f19266a;
        com.applovin.impl.sdk.c.d<Long> dVar = com.applovin.impl.sdk.c.d.f18739g;
        Long l10 = (Long) pVar.a(dVar);
        if (l10 != null) {
            map.put("ia_v2", l10);
        } else {
            this.f19266a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Long>>) dVar, (com.applovin.impl.sdk.c.d<Long>) Long.valueOf(lastModified));
        }
        map.put("sdk_version", AppLovinSdk.VERSION);
        map.put("omid_sdk_version", this.f19266a.ag().c());
        map.put("api_did", this.f19266a.a(com.applovin.impl.sdk.c.b.f18706ad));
        if (packageInfo != null) {
            obj = Long.valueOf(packageInfo.firstInstallTime);
        }
        map.put("first_install_v3_ms", obj);
        map.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        map.put("epv", Integer.valueOf(Utils.getExoPlayerVersionCode()));
        return map;
    }

    private Map<String, Object> t() {
        Map<String, Object> map = CollectionUtils.map();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f19268c);
        String str = (String) this.f19266a.b(com.applovin.impl.sdk.c.d.f18748q, null, defaultSharedPreferences);
        if (StringUtils.isValidString(str)) {
            map.put(com.huawei.openalliance.ad.constant.w.f22150cd, str);
        }
        String a10 = com.applovin.impl.sdk.c.d.f18749r.a();
        if (defaultSharedPreferences.contains(a10)) {
            String str2 = (String) com.applovin.impl.sdk.c.e.a(a10, "", String.class, defaultSharedPreferences);
            Integer num = (Integer) com.applovin.impl.sdk.c.e.a(a10, Integer.MAX_VALUE, Integer.class, defaultSharedPreferences);
            Long l10 = (Long) com.applovin.impl.sdk.c.e.a(a10, Long.MAX_VALUE, Long.class, defaultSharedPreferences);
            Boolean bool = (Boolean) com.applovin.impl.sdk.c.e.a(a10, Boolean.FALSE, Boolean.class, defaultSharedPreferences);
            if (StringUtils.isValidString(str2)) {
                map.put("IABTCF_gdprApplies", str2);
            } else if (num != null && num.intValue() != Integer.MAX_VALUE) {
                map.put("IABTCF_gdprApplies", num);
            } else if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                map.put("IABTCF_gdprApplies", l10);
            } else {
                map.put("IABTCF_gdprApplies", bool);
            }
        }
        return map;
    }

    private boolean u() {
        ConnectivityManager connectivityManager;
        if (com.applovin.impl.sdk.utils.h.f() && (connectivityManager = (ConnectivityManager) this.f19268c.getSystemService("connectivity")) != null) {
            try {
                if (connectivityManager.getRestrictBackgroundStatus() != 3) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                this.f19266a.L();
                if (y.a()) {
                    this.f19266a.L().b("DataCollector", "Unable to collect constrained network info.", th);
                }
            }
        }
        return false;
    }

    private b v() {
        int i10;
        int i11;
        b bVar = new b();
        Intent registerReceiver = this.f19268c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i12 = -1;
        if (registerReceiver != null) {
            i10 = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
        } else {
            i10 = -1;
        }
        if (registerReceiver != null) {
            i11 = registerReceiver.getIntExtra("scale", -1);
        } else {
            i11 = -1;
        }
        if (i10 > 0 && i11 > 0) {
            bVar.f19281b = (int) ((i10 / i11) * 100.0f);
        } else {
            bVar.f19281b = -1;
        }
        if (registerReceiver != null) {
            i12 = registerReceiver.getIntExtra("status", -1);
        }
        bVar.f19280a = i12;
        return bVar;
    }

    private long w() {
        long j10;
        List asList = Arrays.asList(StringUtils.emptyIfNull(Settings.Secure.getString(this.f19268c.getContentResolver(), "enabled_accessibility_services")).split(com.huawei.openalliance.ad.constant.w.bE));
        if (asList.contains("AccessibilityMenuService")) {
            j10 = 256;
        } else {
            j10 = 0;
        }
        if (asList.contains("SelectToSpeakService")) {
            j10 |= 512;
        }
        if (asList.contains("SoundAmplifierService")) {
            j10 |= 2;
        }
        if (asList.contains("SpeechToTextAccessibilityService")) {
            j10 |= 128;
        }
        if (asList.contains("SwitchAccessService")) {
            j10 |= 4;
        }
        if ((this.f19268c.getResources().getConfiguration().uiMode & 48) == 32) {
            j10 |= 1024;
        }
        if (a("accessibility_enabled")) {
            j10 |= 8;
        }
        if (a("touch_exploration_enabled")) {
            j10 |= 16;
        }
        if (com.applovin.impl.sdk.utils.h.d()) {
            if (a("accessibility_display_inversion_enabled")) {
                j10 |= 32;
            }
            if (a("skip_first_use_hints")) {
                j10 |= 64;
            }
        }
        if (a("lock_screen_allow_remote_input")) {
            j10 |= 2048;
        }
        if (a("enabled_accessibility_audio_description_by_default")) {
            j10 |= 4096;
        }
        if (a("accessibility_shortcut_on_lock_screen")) {
            j10 |= 8192;
        }
        if (a("wear_talkback_enabled")) {
            j10 |= 16384;
        }
        if (a("hush_gesture_used")) {
            j10 |= 32768;
        }
        if (a("high_text_contrast_enabled")) {
            j10 |= 65536;
        }
        if (a("accessibility_display_magnification_enabled")) {
            j10 |= 131072;
        }
        if (a("accessibility_display_magnification_navbar_enabled")) {
            j10 |= 262144;
        }
        if (a("accessibility_captioning_enabled")) {
            j10 |= 524288;
        }
        if (a("accessibility_display_daltonizer_enabled")) {
            j10 |= com.huawei.openalliance.ad.constant.w.f22146c;
        }
        if (a("accessibility_autoclick_enabled")) {
            j10 |= com.anythink.expressad.exoplayer.j.a.c.f8719a;
        }
        if (a("accessibility_large_pointer_icon")) {
            j10 |= 4194304;
        }
        if (a("reduce_bright_colors_activated")) {
            j10 |= 8388608;
        }
        if (a("reduce_bright_colors_persist_across_reboots")) {
            j10 |= 16777216;
        }
        if (a("tty_mode_enabled")) {
            j10 |= 33554432;
        }
        if (a("rtt_calling_mode")) {
            return j10 | 67108864;
        }
        return j10;
    }

    private float x() {
        try {
            return Settings.System.getFloat(this.f19268c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e10) {
            if (y.a()) {
                this.f19267b.b("DataCollector", "Error collecting font scale", e10);
                return -1.0f;
            }
            return -1.0f;
        }
    }

    private String y() {
        AudioManager audioManager = (AudioManager) this.f19268c.getSystemService(com.anythink.expressad.exoplayer.k.o.f9069b);
        if (audioManager != null) {
            StringBuilder sb2 = new StringBuilder();
            if (com.applovin.impl.sdk.utils.h.e()) {
                for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                    sb2.append(audioDeviceInfo.getType());
                    sb2.append(",");
                }
            } else {
                if (audioManager.isWiredHeadsetOn()) {
                    sb2.append("3,");
                }
                if (audioManager.isBluetoothScoOn()) {
                    sb2.append("7,");
                }
                if (audioManager.isBluetoothA2dpOn()) {
                    sb2.append(8);
                }
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            String sb3 = sb2.toString();
            if (TextUtils.isEmpty(sb3) && y.a()) {
                this.f19267b.b("DataCollector", "No sound outputs detected");
            }
            return sb3;
        }
        return null;
    }

    private String z() {
        if (!com.applovin.impl.sdk.utils.h.f()) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            LocaleList locales = this.f19268c.getResources().getConfiguration().getLocales();
            for (int i10 = 0; i10 < locales.size(); i10++) {
                sb2.append(locales.get(i10));
                sb2.append(",");
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public Map<String, Object> c() {
        return CollectionUtils.map(this.f);
    }

    public Map<String, Object> d() {
        return a(false);
    }

    public void e() {
        synchronized (this.f19270e) {
            a(this.f19269d);
        }
    }

    public String f() {
        if (AppLovinSdkUtils.isFireOS(this.f19268c)) {
            return "fireos";
        }
        return "android";
    }

    public boolean g() {
        return this.f19271g;
    }

    public Map<String, Object> h() {
        Map<String, Object> map = CollectionUtils.map(this.f);
        map.put("first_install", Boolean.valueOf(this.f19266a.aw()));
        map.put("first_install_v2", Boolean.valueOf(!this.f19266a.u()));
        map.put("test_ads", Boolean.valueOf(this.f19271g));
        map.put(av.aw, Boolean.valueOf(this.f19266a.C().isMuted()));
        if (((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.dJ)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f19266a.o(), map);
        }
        if (((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.dM)).booleanValue()) {
            map.put("compass_random_token", this.f19266a.p());
        }
        if (((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.dO)).booleanValue()) {
            map.put("applovin_random_token", this.f19266a.q());
        }
        String name = this.f19266a.D().getName();
        if (StringUtils.isValidString(name)) {
            map.put("user_segment_name", name);
        }
        map.putAll(t());
        return map;
    }

    public Map<String, Object> i() {
        Map<String, Object> map = CollectionUtils.map();
        map.put(com.anythink.expressad.d.a.b.bH, this.f19266a.a(com.applovin.impl.sdk.c.b.ai));
        map.put("sc2", this.f19266a.a(com.applovin.impl.sdk.c.b.aj));
        map.put("sc3", this.f19266a.a(com.applovin.impl.sdk.c.b.ak));
        map.put("server_installed_at", this.f19266a.a(com.applovin.impl.sdk.c.b.al));
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f19266a.a(com.applovin.impl.sdk.c.d.H), map);
        return map;
    }

    public Map<String, Object> j() {
        if (!this.f19266a.C().isLocationCollectionEnabled() || !((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.ex)).booleanValue()) {
            return null;
        }
        Map<String, Object> map = CollectionUtils.map();
        x ah = this.f19266a.ah();
        boolean b10 = ah.b();
        map.put("loc_services_enabled", Boolean.valueOf(b10));
        if (!b10) {
            return map;
        }
        map.put("loc_auth", Boolean.valueOf(ah.a()));
        if (ah.c()) {
            double d10 = ah.d();
            p pVar = this.f19266a;
            com.applovin.impl.sdk.c.b<Integer> bVar = com.applovin.impl.sdk.c.b.ez;
            map.put("loc_lat", Utils.formatDoubleValue(d10, ((Integer) pVar.a(bVar)).intValue()));
            map.put("loc_long", Utils.formatDoubleValue(ah.e(), ((Integer) this.f19266a.a(bVar)).intValue()));
        }
        return map;
    }

    public d.a k() {
        d.a a10 = com.applovin.impl.sdk.utils.d.a(this.f19268c);
        if (a10 == null) {
            return new d.a();
        }
        if (((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.dH)).booleanValue()) {
            if (a10.a() && !((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.dG)).booleanValue()) {
                a10.a("");
            }
            f19264h.set(a10);
        } else {
            a10 = new d.a();
        }
        boolean z10 = false;
        if (StringUtils.isValidString(a10.b())) {
            List<String> testDeviceAdvertisingIds = this.f19266a.C().getTestDeviceAdvertisingIds();
            if (testDeviceAdvertisingIds != null && testDeviceAdvertisingIds.contains(a10.b())) {
                z10 = true;
            }
            this.f19271g = z10;
        } else {
            this.f19271g = false;
        }
        return a10;
    }

    public a l() {
        return f19265j.get();
    }

    public void m() {
        this.f19266a.M().a(new com.applovin.impl.sdk.e.f(this.f19266a, new f.a() { // from class: com.applovin.impl.sdk.q.3
            @Override // com.applovin.impl.sdk.e.f.a
            public void a(d.a aVar) {
                q.f19264h.set(aVar);
            }
        }), o.a.ADVERTISING_INFO_COLLECTION);
        this.f19266a.M().a(new com.applovin.impl.sdk.e.z(this.f19266a, true, new Runnable() { // from class: com.applovin.impl.sdk.q.4
            @Override // java.lang.Runnable
            public void run() {
                q.this.f19272i.set(q.this.A());
            }
        }), o.a.CACHING_OTHER);
    }

    public String a() {
        String encodeToString = Base64.encodeToString(new JSONObject(p()).toString().getBytes(Charset.defaultCharset()), 2);
        if (!((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.f18727fb)).booleanValue()) {
            return encodeToString;
        }
        return com.applovin.impl.sdk.utils.n.a(encodeToString, this.f19266a.B(), Utils.getServerAdjustedUnixTimestampMillis(this.f19266a));
    }

    public Map<String, Object> b() {
        return CollectionUtils.map(this.f19269d);
    }

    public static void b(final Context context) {
        if (Utils.checkClassExistence("com.google.android.gms.appset.AppSet")) {
            new Thread(new Runnable() { // from class: com.applovin.impl.sdk.q.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.applovin.impl.sdk.q.2.1
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            /* renamed from: a, reason: merged with bridge method [inline-methods] */
                            public void onSuccess(AppSetIdInfo appSetIdInfo) {
                                q.f19265j.set(new a(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                            }
                        });
                    } catch (Throwable unused) {
                        y.f("DataCollector", "Could not collect AppSet ID.");
                    }
                }
            }).start();
        }
    }

    private String b(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = str.charAt(i10);
            for (int i11 = 9; i11 >= 0; i11--) {
                cArr[i10] = (char) (cArr[i10] ^ iArr[i11]);
            }
        }
        return new String(cArr);
    }

    public Map<String, Object> a(Map<String, String> map, boolean z10, boolean z11) {
        Map<String, Object> map2 = CollectionUtils.map(64);
        Map<String, Object> a10 = a(z10);
        Map<String, Object> h10 = h();
        Map<String, Object> j10 = j();
        Map<String, String> allData = this.f19266a.r().getAllData();
        if (z11) {
            map2.put("device_info", a10);
            map2.put(ba.D, h10);
            if (map != null) {
                map2.put("ad_info", map);
            }
            if (j10 != null) {
                map2.put("location_info", j10);
            }
            if (!allData.isEmpty()) {
                map2.put("targeting_data", allData);
            }
        } else {
            map2.putAll(a10);
            map2.putAll(h10);
            if (map != null) {
                map2.putAll(map);
            }
            if (j10 != null) {
                map2.putAll(j10);
            }
            if (!allData.isEmpty()) {
                map2.putAll(allData);
            }
        }
        map2.put("accept", "custom_size,launch_app,video");
        map2.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.f19266a.s(), map2);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f19266a.a(com.applovin.impl.sdk.c.b.dT), map2);
        if (!((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.f18726fa)).booleanValue()) {
            map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f19266a.B());
        }
        map2.putAll(i());
        if (((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.eA)).booleanValue()) {
            com.applovin.impl.sdk.d.g P = this.f19266a.P();
            map2.put("li", Long.valueOf(P.b(com.applovin.impl.sdk.d.f.f18808b)));
            map2.put("si", Long.valueOf(P.b(com.applovin.impl.sdk.d.f.f18811e)));
            map2.put("mad", Long.valueOf(P.b(com.applovin.impl.sdk.d.f.f18809c)));
            map2.put("msad", Long.valueOf(P.b(com.applovin.impl.sdk.d.f.f)));
            map2.put("pf", Long.valueOf(P.b(com.applovin.impl.sdk.d.f.f18815j)));
            map2.put("mpf", Long.valueOf(P.b(com.applovin.impl.sdk.d.f.f18821q)));
            map2.put("gpf", Long.valueOf(P.b(com.applovin.impl.sdk.d.f.f18816k)));
            map2.put("asoac", Long.valueOf(P.b(com.applovin.impl.sdk.d.f.o)));
        }
        map2.put("rid", UUID.randomUUID().toString());
        return map2;
    }

    public Map<String, Object> a(boolean z10) {
        Map<String, Object> map;
        synchronized (this.f19270e) {
            map = CollectionUtils.map(this.f19269d);
        }
        return a(map, z10);
    }

    private void a(Map<String, Object> map) {
        if (((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.f18722ea)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(w()));
        }
        if (((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.f18723eb)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(x()));
        }
        if (((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.ei)).booleanValue() && Utils.isUserAgentCollectionEnabled(this.f19266a)) {
            af.b(this.f19266a);
        }
        if (((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.eh)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (!((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.f18725ed)).booleanValue() || map.containsKey("network_restricted")) {
            return;
        }
        map.put("network_restricted", Boolean.valueOf(u()));
    }

    private Map<String, Object> a(Map<String, Object> map, boolean z10) {
        d.a k10;
        PowerManager powerManager;
        Map<String, Object> map2 = CollectionUtils.map(map);
        Point a10 = com.applovin.impl.sdk.utils.h.a(this.f19268c);
        map2.put("dx", Integer.valueOf(a10.x));
        map2.put("dy", Integer.valueOf(a10.y));
        if (z10) {
            k10 = f19264h.get();
            if (k10 != null) {
                m();
            } else if (Utils.isMainThread()) {
                k10 = new d.a();
                map2.put("inc", Boolean.TRUE);
            } else {
                k10 = this.f19266a.R().k();
            }
        } else {
            k10 = this.f19266a.R().k();
        }
        String b10 = k10.b();
        if (StringUtils.isValidString(b10)) {
            map2.put(com.anythink.expressad.foundation.g.a.bj, b10);
        }
        map2.put("dnt", Boolean.valueOf(k10.a()));
        map2.put("dnt_code", k10.c().a());
        a aVar = f19265j.get();
        if (((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.dI)).booleanValue() && aVar != null) {
            map2.put("idfv", aVar.f19278a);
            map2.put("idfv_scope", Integer.valueOf(aVar.f19279b));
        }
        Object a11 = com.applovin.impl.b.a.b().a(this.f19268c);
        if (a11 != null) {
            map2.put(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, a11);
        }
        Object a12 = com.applovin.impl.b.a.a().a(this.f19268c);
        if (a12 != null) {
            map2.put(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, a12);
        }
        Object a13 = com.applovin.impl.b.a.c().a(this.f19268c);
        if (a13 != null) {
            map2.put(AppLovinSdkExtraParameterKey.DO_NOT_SELL, a13);
        }
        if (((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.dU)).booleanValue()) {
            b v3 = v();
            map2.put("act", Integer.valueOf(v3.f19280a));
            map2.put("acm", Integer.valueOf(v3.f19281b));
        }
        if (((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.f18724ec)).booleanValue()) {
            map2.put("mtl", Integer.valueOf(this.f19266a.Y().getLastTrimMemoryLevel()));
        }
        if (((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.ef)).booleanValue()) {
            map2.put("adr", Boolean.valueOf(H()));
        }
        Object A = z10 ? (Integer) this.f19272i.get() : A();
        if (A != null) {
            map2.put("volume", A);
        }
        try {
            map2.put("sb", Integer.valueOf((int) ((Settings.System.getInt(this.f19268c.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)));
        } catch (Settings.SettingNotFoundException e10) {
            if (y.a()) {
                this.f19267b.b("DataCollector", "Unable to collect screen brightness", e10);
            }
        }
        if (((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.ei)).booleanValue() && Utils.isUserAgentCollectionEnabled(this.f19266a)) {
            af.b(this.f19266a);
            String a14 = af.a();
            if (StringUtils.isValidString(a14)) {
                map2.put("ua", a14);
            }
        }
        if (((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.dW)).booleanValue()) {
            try {
                map2.put("fs", Long.valueOf(Environment.getDataDirectory().getFreeSpace()));
                map2.put("tds", Long.valueOf(Environment.getDataDirectory().getTotalSpace()));
            } catch (Throwable th) {
                map2.put("fs", -1);
                map2.put("tds", -1);
                if (y.a()) {
                    this.f19267b.b("DataCollector", "Unable to collect total & free space.", th);
                }
            }
        }
        if (((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.dX)).booleanValue()) {
            ActivityManager activityManager = (ActivityManager) this.f19268c.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                try {
                    activityManager.getMemoryInfo(memoryInfo);
                    map2.put("fm", Long.valueOf(memoryInfo.availMem));
                    map2.put("tm", Long.valueOf(memoryInfo.totalMem));
                    map2.put("lmt", Long.valueOf(memoryInfo.threshold));
                    map2.put("lm", Boolean.valueOf(memoryInfo.lowMemory));
                } catch (Throwable th2) {
                    map2.put("fm", -1);
                    map2.put("tm", -1);
                    map2.put("lmt", -1);
                    if (y.a()) {
                        this.f19267b.b("DataCollector", "Unable to collect memory info.", th2);
                    }
                }
            }
        }
        if (((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.dY)).booleanValue() && com.applovin.impl.sdk.utils.h.a("android.permission.READ_PHONE_STATE", this.f19268c) && com.applovin.impl.sdk.utils.h.f()) {
            map2.put("rat", Integer.valueOf(((TelephonyManager) this.f19268c.getSystemService("phone")).getDataNetworkType()));
        }
        if (((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.dV)).booleanValue()) {
            String y = y();
            if (!TextUtils.isEmpty(y)) {
                map2.put("so", y);
            }
        }
        map2.put("orientation_lock", r());
        if (((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.dZ)).booleanValue()) {
            map2.put("vs", Boolean.valueOf(Utils.isVPNConnected()));
        }
        if (com.applovin.impl.sdk.utils.h.d() && (powerManager = (PowerManager) this.f19268c.getSystemService("power")) != null) {
            map2.put("lpm", Integer.valueOf(powerManager.isPowerSaveMode() ? 1 : 0));
        }
        if (((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.ej)).booleanValue() && this.f19266a.ac() != null) {
            map2.put("da", Float.valueOf(this.f19266a.ac().c()));
        }
        if (((Boolean) this.f19266a.a(com.applovin.impl.sdk.c.b.ek)).booleanValue() && this.f19266a.ac() != null) {
            map2.put(com.anythink.expressad.foundation.g.a.K, Float.valueOf(this.f19266a.ac().b()));
        }
        map2.put("mute_switch", Integer.valueOf(this.f19266a.ad().a()));
        map2.put("network", com.applovin.impl.sdk.utils.i.f(this.f19266a));
        String z11 = z();
        if (StringUtils.isValidString(z11)) {
            map2.put("kb", z11);
        }
        ArrayService ai = this.f19266a.ai();
        if (ai.isAppHubInstalled()) {
            map2.put("ah_sdk_version_code", Long.valueOf(ai.getAppHubVersionCode()));
            map2.put("ah_dd_enabled", Boolean.valueOf(ai.isDirectDownloadEnabled()));
            map2.put("ah_random_user_token", StringUtils.emptyIfNull(ai.getRandomUserToken()));
        }
        return map2;
    }

    public static void a(final Context context) {
        new Thread(new Runnable() { // from class: com.applovin.impl.sdk.q.1
            @Override // java.lang.Runnable
            public void run() {
                q.f19264h.set(com.applovin.impl.sdk.utils.d.a(context));
            }
        }).start();
    }

    private boolean a(String str) {
        try {
            return Settings.Secure.getInt(this.f19268c.getContentResolver(), str) == 1;
        } catch (Throwable unused) {
            return false;
        }
    }
}
