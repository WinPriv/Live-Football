package com.huawei.openalliance.ad.ppskit.handlers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.inner.KitPreloadCfg;
import com.huawei.openalliance.ad.ppskit.beans.inner.TvAdFailedInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Location;
import com.huawei.openalliance.ad.ppskit.beans.metadata.SleepLightAllowPkgList;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.utils.ServerConfig;
import com.huawei.openalliance.ad.ppskit.utils.m2;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.u1;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import ka.Cif;
import ka.g6;
import ka.hi;
import ka.n7;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ConfigSpHandler {

    /* renamed from: r, reason: collision with root package name */
    public static ConfigSpHandler f22476r;

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f22477s = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f22478a;

    /* renamed from: c, reason: collision with root package name */
    public final Context f22480c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22481d;

    /* renamed from: e, reason: collision with root package name */
    public Map<String, String> f22482e;

    /* renamed from: h, reason: collision with root package name */
    public final SharedPreferences f22484h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList<Integer> f22485i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList<Integer> f22486j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList<String> f22487k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList<TvAdFailedInfo> f22488l;

    /* renamed from: m, reason: collision with root package name */
    public JSONArray f22489m;

    /* renamed from: n, reason: collision with root package name */
    public SleepLightAllowPkgList f22490n;
    public final String o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f22491p;

    /* renamed from: q, reason: collision with root package name */
    public long f22492q;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f22479b = new byte[0];
    public final HashMap f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f22483g = new byte[0];

    @DataKeep
    /* loaded from: classes2.dex */
    public static class ServiceEnableAppList {
        List<String> apps = new ArrayList();
    }

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Serializable C = a0.a.C(ConfigSpHandler.this.o);
            if (C != null && (C instanceof SleepLightAllowPkgList)) {
                synchronized (ConfigSpHandler.this.f22491p) {
                    ConfigSpHandler.this.f22490n = (SleepLightAllowPkgList) C;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConfigSpHandler configSpHandler = ConfigSpHandler.this;
            Map<String, ?> all = configSpHandler.f22484h.getAll();
            synchronized (configSpHandler.f22483g) {
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    configSpHandler.f.put(entry.getKey(), (String) entry.getValue());
                }
            }
        }
    }

    public ConfigSpHandler(Context context) {
        byte[] bArr = new byte[0];
        this.f22478a = bArr;
        this.f22481d = true;
        byte[] bArr2 = new byte[0];
        this.f22491p = bArr2;
        Context createDeviceProtectedStorageContext = context.getApplicationContext().createDeviceProtectedStorageContext();
        this.f22480c = createDeviceProtectedStorageContext;
        this.f22484h = createDeviceProtectedStorageContext.getSharedPreferences("HiAd_url_cache_sp", 4);
        this.f22481d = Cif.a(context).d();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(createDeviceProtectedStorageContext.getFilesDir());
        String str = File.separator;
        this.o = a3.l.q(sb2, str, com.huawei.openalliance.ad.constant.w.f22161i, str, "configSp.config");
        synchronized (bArr2) {
            this.f22490n = new SleepLightAllowPkgList();
        }
        p2.a(new a(), 0);
        q(false);
        synchronized (bArr) {
            SharedPreferences s10 = s();
            boolean k10 = k(s10);
            n7.c("ConfigSp", "need reload openShowSceneList: %s", Boolean.valueOf(k10));
            if (this.f22485i == null || k10) {
                n7.b("ConfigSp", "reload openShowSceneList");
                this.f22485i = new ArrayList<>();
                try {
                    JSONArray jSONArray = new JSONArray(s10.getString("tv_ad_open_show_scene", ContentRecord.XRINFOLIST_NULL));
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        this.f22485i.add(Integer.valueOf(jSONArray.getInt(i10)));
                    }
                } catch (Throwable th) {
                    n7.c("ConfigSp", "reload openShowSceneList err: %s", th.getClass().getSimpleName());
                    n7.a();
                }
            }
        }
        synchronized (this.f22478a) {
            SharedPreferences s11 = s();
            boolean k11 = k(s11);
            n7.c("ConfigSp", "need reload showPlayModeList: %s", Boolean.valueOf(k11));
            if (this.f22486j == null || k11) {
                n7.b("ConfigSp", "reload showPlayModeList");
                this.f22486j = new ArrayList<>();
                try {
                    JSONArray jSONArray2 = new JSONArray(s11.getString("tv_ad_show_play_mode", ContentRecord.XRINFOLIST_NULL));
                    for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                        this.f22486j.add(Integer.valueOf(jSONArray2.getInt(i11)));
                    }
                } catch (Throwable th2) {
                    n7.c("ConfigSp", "reload showPlayModeList err: %s", th2.getClass().getSimpleName());
                    n7.a();
                }
            }
        }
        synchronized (this.f22478a) {
            SharedPreferences s12 = s();
            boolean k12 = k(s12);
            n7.c("ConfigSp", "need reload adShowBrandList: %s", Boolean.valueOf(k12));
            if (this.f22487k == null || k12) {
                n7.b("ConfigSp", "reload adShowBrandList");
                this.f22487k = new ArrayList<>();
                try {
                    JSONArray jSONArray3 = new JSONArray(s12.getString("tv_ad_show_brand_list", ContentRecord.XRINFOLIST_NULL));
                    for (int i12 = 0; i12 < jSONArray3.length(); i12++) {
                        this.f22487k.add(jSONArray3.getString(i12));
                    }
                } catch (Throwable th3) {
                    n7.c("ConfigSp", "reload adShowBrandList err: %s", th3.getClass().getSimpleName());
                    n7.a();
                }
            }
        }
        r();
        p2.a(new b(), 2);
    }

    public static ConfigSpHandler b(Context context) {
        ConfigSpHandler configSpHandler;
        synchronized (f22477s) {
            if (f22476r == null) {
                f22476r = new ConfigSpHandler(context);
            }
            configSpHandler = f22476r;
        }
        return configSpHandler;
    }

    public static void d(SharedPreferences.Editor editor, String str, Integer num) {
        if (num != null) {
            editor.putInt(str, num.intValue());
        }
    }

    public static void e(SharedPreferences.Editor editor, String str, String str2) {
        if (str2 != null) {
            editor.putString(str, str2);
        }
    }

    public final void A(String str) {
        synchronized (this.f22478a) {
            s().edit().putString("tv_launcher_package", str).commit();
        }
    }

    public final void B(String str) {
        synchronized (this.f22478a) {
            try {
                s().edit().putString("analysisSwitch", new JSONObject(str).getString("analysisSwitch")).commit();
            } finally {
            }
        }
    }

    public final void C(String str) {
        synchronized (this.f22478a) {
            SharedPreferences.Editor edit = s().edit();
            Map map = (Map) y0.o(null, str, Map.class, new Class[0]);
            if (!a0.a.e0(map)) {
                String str2 = (String) map.get("eventTypeBlackList");
                if (!y1.h(str2)) {
                    String[] split = str2.trim().split(",");
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(Arrays.asList(split));
                    edit.putStringSet("eventTypeBlackList", hashSet).commit();
                }
            }
        }
    }

    public final String D(String str) {
        Map<String, String> u2 = u(false);
        if (!a0.a.e0(u2)) {
            return u2.get(str);
        }
        return null;
    }

    public final Long a() {
        Long valueOf;
        synchronized (this.f22478a) {
            valueOf = Long.valueOf(s().getLong("diskcache_valid_time", 5760L));
        }
        return valueOf;
    }

    public final String c(String str, String str2) {
        String str3;
        g6 g6Var;
        String h10 = com.ironsource.adapters.facebook.a.h(str, str2);
        synchronized (this.f22483g) {
            str3 = (String) this.f.get(h10);
        }
        if (TextUtils.isEmpty(str3)) {
            Context context = this.f22480c;
            synchronized (g6.f) {
                if (g6.f31203e == null) {
                    g6.f31203e = new g6(context);
                }
                g6Var = g6.f31203e;
            }
            String a10 = g6Var.a(str);
            String a11 = a0.a.K(this.f22480c).a(this.f22480c, ServerConfig.a(), str2, ServerConfig.b(), a10);
            if (n7.d()) {
                n7.c("ConfigSp", "app: %s service name: %s original url: %s server url from grs: %s", ServerConfig.a(), ServerConfig.b(), y1.j(a10), y1.j(a11));
            }
            if (TextUtils.isEmpty(a11)) {
                return null;
            }
            String b10 = g6Var.b(str);
            str3 = com.ironsource.adapters.facebook.a.h(a11, b10);
            synchronized (this.f22483g) {
                this.f.put(h10, a11 + b10);
            }
        } else {
            p2.a(new com.huawei.openalliance.ad.ppskit.handlers.b(this, str, str2), 2);
        }
        return str3;
    }

    public final void f(SharedPreferences.Editor editor, List<Integer> list) {
        JSONArray jSONArray = new JSONArray();
        this.f22485i = new ArrayList<>();
        if (list != null && list.size() > 0) {
            for (Integer num : list) {
                this.f22485i.add(num);
                jSONArray.put(num);
            }
        }
        e(editor, "tv_ad_open_show_scene", jSONArray.toString());
    }

    public final void g(KitPreloadCfg kitPreloadCfg) {
        synchronized (this.f22478a) {
            if (kitPreloadCfg == null) {
                return;
            }
            SharedPreferences.Editor edit = s().edit();
            int a10 = kitPreloadCfg.a();
            if (oa.e.f33790a.contains(Integer.valueOf(a10))) {
                edit.putInt("preloadMode", a10);
            } else {
                edit.putInt("preloadMode", 0);
            }
            edit.putString("preloadSchedule", y0.q(null, kitPreloadCfg.b()));
            int c10 = kitPreloadCfg.c();
            if (c10 < 30 || c10 > 360) {
                c10 = 60;
            }
            edit.putInt("preloadRandom", c10);
            edit.commit();
            kitPreloadCfg.a();
            androidx.activity.n.F(this.f22480c).getClass();
        }
    }

    public final void h(Location location) {
        synchronized (this.f22479b) {
            this.f22480c.getSharedPreferences("HiAdSharedPreferences_config_sec", 4).edit().putString("lkl", m2.a(y0.q(null, location), u1.h(this.f22480c))).commit();
        }
    }

    public final void i(Integer num) {
        if (num != null && num.intValue() > 0) {
            synchronized (this.f22478a) {
                SharedPreferences.Editor edit = s().edit();
                edit.putInt("disk_cache_size", num.intValue());
                edit.commit();
            }
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public final void j(String str) {
        synchronized (this.f22478a) {
            if (n7.d()) {
                n7.c("ConfigSp", "updateServiceEnableApp packageName: %s enable: %s", str, Boolean.TRUE);
            }
            SharedPreferences s10 = s();
            ServiceEnableAppList serviceEnableAppList = (ServiceEnableAppList) y0.o(null, s10.getString("service_enable_app_list", ""), ServiceEnableAppList.class, new Class[0]);
            if (serviceEnableAppList == null) {
                serviceEnableAppList = new ServiceEnableAppList();
            }
            if (serviceEnableAppList.apps == null) {
                serviceEnableAppList.apps = new ArrayList();
            }
            if (!serviceEnableAppList.apps.contains(str)) {
                serviceEnableAppList.apps.add(str);
            }
            n7.c("ConfigSp", "updateServiceEnableApp set size: %d content: %s", Integer.valueOf(serviceEnableAppList.apps.size()), serviceEnableAppList.apps);
            s10.edit().putString("service_enable_app_list", y0.q(null, serviceEnableAppList)).commit();
        }
    }

    public final boolean k(SharedPreferences sharedPreferences) {
        Object s10 = androidx.transition.n.s(sharedPreferences, "hasFileChangedUnexpectedly", null, null, false);
        long currentTimeMillis = System.currentTimeMillis();
        if (s10 instanceof Boolean) {
            return ((Boolean) s10).booleanValue();
        }
        if (s10 != null || currentTimeMillis - this.f22492q <= com.anythink.expressad.d.a.b.aD) {
            return false;
        }
        this.f22492q = currentTimeMillis;
        return true;
    }

    public final long l() {
        long longValue;
        synchronized (this.f22478a) {
            Long l10 = 150L;
            Map<String, String> u2 = u(true);
            if (u2 != null && u2.get("rewardMaxData") != null) {
                l10 = Long.valueOf(y1.a(u2.get("rewardMaxData"), 150L));
            }
            longValue = l10.longValue() * 1024 * 1024;
        }
        return longValue;
    }

    public final boolean m() {
        boolean equals;
        synchronized (this.f22478a) {
            equals = "1".equals(s().getString("analysisSwitch", "0"));
        }
        return equals;
    }

    public final String n() {
        String str;
        synchronized (this.f22478a) {
            str = "wx1958092de846ff5b";
            if (!a0.a.e0(u(true))) {
                str = this.f22482e.get("wxHmsId");
            }
            if (TextUtils.isEmpty(str)) {
                str = "wx1958092de846ff5b";
            }
        }
        return str;
    }

    public final Location o() {
        Location location;
        synchronized (this.f22479b) {
            String string = this.f22480c.getSharedPreferences("HiAdSharedPreferences_config_sec", 4).getString("lkl", "");
            location = null;
            if (!TextUtils.isEmpty(string)) {
                location = (Location) y0.o(null, m2.c(string, u1.h(this.f22480c)), Location.class, new Class[0]);
            }
        }
        return location;
    }

    public final void p(SharedPreferences.Editor editor, List<Integer> list) {
        JSONArray jSONArray = new JSONArray();
        this.f22486j = new ArrayList<>();
        if (list != null && list.size() > 0) {
            for (Integer num : list) {
                this.f22486j.add(num);
                jSONArray.put(num);
            }
        }
        e(editor, "tv_ad_show_play_mode", jSONArray.toString());
    }

    public final void q(boolean z10) {
        boolean z11;
        synchronized (this.f22478a) {
            SharedPreferences s10 = s();
            if (!k(s10) && !z10) {
                z11 = false;
                n7.c("ConfigSp", "need reload configmap: %s", Boolean.valueOf(z11));
                if (this.f22482e != null || z11) {
                    n7.b("ConfigSp", "reload map");
                    this.f22482e = (Map) y0.o(null, s10.getString("kit_config_map", ""), Map.class, new Class[0]);
                }
            }
            z11 = true;
            n7.c("ConfigSp", "need reload configmap: %s", Boolean.valueOf(z11));
            if (this.f22482e != null) {
            }
            n7.b("ConfigSp", "reload map");
            this.f22482e = (Map) y0.o(null, s10.getString("kit_config_map", ""), Map.class, new Class[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r() {
        synchronized (this.f22478a) {
            SharedPreferences s10 = s();
            boolean k10 = k(s10);
            n7.c("ConfigSp", "need reload tvFailedList: %s", Boolean.valueOf(k10));
            if (this.f22488l == null || k10) {
                n7.b("ConfigSp", "reload tvFailedList");
                this.f22488l = new ArrayList<>();
                try {
                    this.f22489m = new JSONArray(s10.getString("tv_filed_infos", ContentRecord.XRINFOLIST_NULL));
                    for (int i10 = 0; i10 < this.f22489m.length(); i10++) {
                        this.f22488l.add(y0.o(null, this.f22489m.getString(i10), TvAdFailedInfo.class, new Class[0]));
                    }
                } catch (Throwable th) {
                    n7.c("ConfigSp", "reload adShowBrandList err: %s", th.getClass().getSimpleName());
                    n7.a();
                }
            }
        }
    }

    public final SharedPreferences s() {
        return this.f22480c.getSharedPreferences("HiAdSharedPreferences_config", 4);
    }

    public final void t() {
        boolean z10;
        hi hiVar;
        hi hiVar2;
        Long l10;
        if (!z1.S(this.f22480c) && z1.u()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (a0.a.A0 != null) {
                hiVar2 = a0.a.A0;
            } else {
                synchronized (a0.a.B0) {
                    if (a0.a.A0 == null) {
                        a0.a.A0 = new hi();
                    }
                    hiVar = a0.a.A0;
                }
                hiVar2 = hiVar;
            }
            synchronized (this.f22478a) {
                if (!a0.a.e0(u(false))) {
                    l10 = y1.s(this.f22482e.get("mvRptPeriod"));
                } else {
                    l10 = null;
                }
                if (l10 != null && l10.longValue() >= 0) {
                    l10.longValue();
                }
            }
            hiVar2.getClass();
        }
    }

    public final Map<String, String> u(boolean z10) {
        Map<String, String> map;
        synchronized (this.f22478a) {
            q(z10);
            map = this.f22482e;
        }
        return map;
    }

    public final void v(SharedPreferences.Editor editor, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                e(editor, "kit_config_map", jSONObject.toString());
                this.f22482e = (Map) y0.o(null, jSONObject.toString(), Map.class, new Class[0]);
            } catch (JSONException unused) {
                n7.i("ConfigSp", "putConfigMap JSONException");
            }
        }
    }

    public final void w(SharedPreferences.Editor editor, String str) {
        JSONArray jSONArray = new JSONArray();
        this.f22487k = new ArrayList<>();
        if (!y1.h(str)) {
            for (String str2 : str.split(",")) {
                this.f22487k.add(str2);
                jSONArray.put(str2);
            }
        }
        e(editor, "tv_ad_show_brand_list", jSONArray.toString());
    }

    public final void x(Integer num) {
        if (num != null && num.intValue() > 0) {
            synchronized (this.f22478a) {
                s().edit().putLong("exsplash_cache_max_size", num.intValue()).commit();
            }
        }
    }

    public final void y(Integer num) {
        if (num != null && num.intValue() > 0) {
            synchronized (this.f22478a) {
                s().edit().putInt("exsplash_cache_max_num", num.intValue()).commit();
            }
        }
    }

    public final boolean z() {
        synchronized (this.f22478a) {
            boolean z10 = this.f22481d;
            Map<String, String> u2 = u(false);
            if (u2 != null && u2.get("locClctSwitch") != null) {
                if (TextUtils.equals("0", u2.get("locClctSwitch"))) {
                    return false;
                }
                if (TextUtils.equals("1", u2.get("locClctSwitch"))) {
                    return true;
                }
                return z10;
            }
            return z10;
        }
    }
}
