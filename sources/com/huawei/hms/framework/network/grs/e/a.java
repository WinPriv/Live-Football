package com.huawei.hms.framework.network.grs.e;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.g.d;
import com.huawei.hms.framework.network.grs.g.g;
import com.huawei.hms.framework.network.grs.h.e;
import com.huawei.openalliance.ad.constant.w;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final String f21835e = "a";
    private static final Map<String, Map<String, Map<String, String>>> f = new ConcurrentHashMap(16);

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Long> f21836a = new ConcurrentHashMap(16);

    /* renamed from: b, reason: collision with root package name */
    private final c f21837b;

    /* renamed from: c, reason: collision with root package name */
    private final c f21838c;

    /* renamed from: d, reason: collision with root package name */
    private final g f21839d;

    public a(c cVar, c cVar2, g gVar) {
        this.f21838c = cVar2;
        this.f21837b = cVar;
        this.f21839d = gVar;
        gVar.a(this);
    }

    public c a() {
        return this.f21837b;
    }

    public g b() {
        return this.f21839d;
    }

    public c c() {
        return this.f21838c;
    }

    public Map<String, String> a(GrsBaseInfo grsBaseInfo, String str, b bVar, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        Map<String, Map<String, Map<String, String>>> map = f;
        Map<String, Map<String, String>> map2 = map.get(grsParasKey);
        if (map2 != null && !map2.isEmpty()) {
            a(grsBaseInfo, bVar, context, str);
            return map2.get(str);
        }
        Logger.i(f21835e, "Cache size is: " + map.size());
        return new HashMap();
    }

    public void b(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        String a10 = this.f21837b.a(grsParasKey, "");
        String a11 = this.f21837b.a(grsParasKey + "time", "0");
        long j10 = 0;
        if (!TextUtils.isEmpty(a11) && a11.matches("\\d+")) {
            try {
                j10 = Long.parseLong(a11);
            } catch (NumberFormatException e10) {
                Logger.w(f21835e, "convert urlParamKey from String to Long catch NumberFormatException.", e10);
            }
        }
        Map<String, Map<String, Map<String, String>>> map = f;
        map.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(a10));
        Logger.i(f21835e, "Cache size is: " + map.size());
        this.f21836a.put(grsParasKey, Long.valueOf(j10));
        a(grsBaseInfo, grsParasKey, context);
    }

    public void a(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        this.f21837b.b(grsParasKey + "time", "0");
        this.f21836a.remove(grsParasKey + "time");
        Map<String, Map<String, Map<String, String>>> map = f;
        map.remove(grsParasKey);
        Logger.i(f21835e, "Cache size is: " + map.size());
        this.f21839d.a(grsParasKey);
    }

    private void a(GrsBaseInfo grsBaseInfo, b bVar, Context context, String str) {
        Long l10 = this.f21836a.get(grsBaseInfo.getGrsParasKey(true, true, context));
        if (e.a(l10)) {
            bVar.a(2);
            return;
        }
        if (e.a(l10, w.as)) {
            this.f21839d.a(new com.huawei.hms.framework.network.grs.g.j.c(grsBaseInfo, context), null, str, this.f21838c);
        }
        bVar.a(1);
    }

    public void a(GrsBaseInfo grsBaseInfo, d dVar, Context context, com.huawei.hms.framework.network.grs.g.j.c cVar) {
        if (dVar.f() == 2) {
            Logger.w(f21835e, "update cache from server failed");
            return;
        }
        if (cVar.d().size() == 0) {
            String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
            if (dVar.m()) {
                f.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(this.f21837b.a(grsParasKey, "")));
            } else {
                this.f21837b.b(grsParasKey, dVar.j());
                f.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(dVar.j()));
            }
            if (!TextUtils.isEmpty(dVar.e())) {
                this.f21837b.b(com.ironsource.adapters.facebook.a.h(grsParasKey, "ETag"), dVar.e());
            }
            this.f21837b.b(com.ironsource.adapters.facebook.a.h(grsParasKey, "time"), dVar.a());
            this.f21836a.put(grsParasKey, Long.valueOf(Long.parseLong(dVar.a())));
        } else {
            this.f21837b.b("geoipCountryCode", dVar.j());
            this.f21837b.b("geoipCountryCodetime", dVar.a());
        }
        Logger.i(f21835e, "Cache size is: " + f.size());
    }

    private void a(GrsBaseInfo grsBaseInfo, String str, Context context) {
        if (e.a(this.f21836a.get(str), w.as)) {
            this.f21839d.a(new com.huawei.hms.framework.network.grs.g.j.c(grsBaseInfo, context), null, null, this.f21838c);
        }
    }
}
