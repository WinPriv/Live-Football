package com.huawei.hms.framework.network.grs.e;

import android.content.Context;
import android.content.pm.PackageManager;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static final String f21841b = "c";

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, PLSharedPreferences> f21842c = new ConcurrentHashMap(16);

    /* renamed from: a, reason: collision with root package name */
    private final PLSharedPreferences f21843a;

    public c(Context context, String str) {
        String packageName = context.getPackageName();
        Logger.d(f21841b, "get pkgname from context is{%s}", packageName);
        Map<String, PLSharedPreferences> map = f21842c;
        if (map.containsKey(str + packageName)) {
            this.f21843a = map.get(str + packageName);
        } else {
            PLSharedPreferences pLSharedPreferences = new PLSharedPreferences(context, com.ironsource.adapters.facebook.a.h(str, packageName));
            this.f21843a = pLSharedPreferences;
            map.put(str + packageName, pLSharedPreferences);
        }
        a(context);
    }

    public String a(String str, String str2) {
        String string;
        PLSharedPreferences pLSharedPreferences = this.f21843a;
        if (pLSharedPreferences == null) {
            return str2;
        }
        synchronized (pLSharedPreferences) {
            string = this.f21843a.getString(str, str2);
        }
        return string;
    }

    public void b() {
        PLSharedPreferences pLSharedPreferences = this.f21843a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f21843a.clear();
        }
    }

    public Map<String, ?> a() {
        Map<String, ?> all;
        PLSharedPreferences pLSharedPreferences = this.f21843a;
        if (pLSharedPreferences == null) {
            return new HashMap();
        }
        synchronized (pLSharedPreferences) {
            all = this.f21843a.getAll();
        }
        return all;
    }

    public void b(String str, String str2) {
        PLSharedPreferences pLSharedPreferences = this.f21843a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f21843a.putString(str, str2);
        }
    }

    private void a(Context context) {
        String str = f21841b;
        Logger.i(str, "ContextHolder.getAppContext() from GRS is:" + ContextHolder.getAppContext());
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        try {
            String l10 = Long.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionCode);
            String a10 = a("version", "");
            if (l10.equals(a10)) {
                return;
            }
            Logger.i(str, "app version changed! old version{%s} and new version{%s}", a10, l10);
            b();
            b("version", l10);
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.w(f21841b, "get app version failed and catch NameNotFoundException");
        }
    }

    public void a(String str) {
        PLSharedPreferences pLSharedPreferences = this.f21843a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f21843a.remove(str);
        }
    }
}
