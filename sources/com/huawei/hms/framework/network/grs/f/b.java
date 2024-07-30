package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.AssetsUtil;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, b> f21849b = new ConcurrentHashMap(16);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f21850c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private a f21851a;

    public b(Context context, boolean z10) {
        a(context, z10);
        f21849b.put(context.getPackageName(), this);
    }

    public static b a(String str) {
        return f21849b.get(str);
    }

    public Set<String> b() {
        return this.f21851a.b();
    }

    public com.huawei.hms.framework.network.grs.local.model.a a() {
        return this.f21851a.a();
    }

    public String a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z10) {
        String a10;
        synchronized (f21850c) {
            a10 = this.f21851a.a(context, aVar, grsBaseInfo, str, str2, z10);
        }
        return a10;
    }

    public Map<String, String> a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, boolean z10) {
        Map<String, String> a10;
        synchronized (f21850c) {
            a10 = this.f21851a.a(context, aVar, grsBaseInfo, str, z10);
        }
        return a10;
    }

    public void a(Context context, boolean z10) {
        String[] list = AssetsUtil.list(context, GrsApp.getInstance().getBrand(""));
        List<String> arrayList = list == null ? new ArrayList<>() : Arrays.asList(list);
        String appConfigName = GrsApp.getInstance().getAppConfigName();
        Logger.i("LocalManagerProxy", "appConfigName is: " + appConfigName);
        this.f21851a = new d(false, z10);
        if (arrayList.contains("grs_app_global_route_config.json") || !TextUtils.isEmpty(appConfigName)) {
            this.f21851a = new d(context, appConfigName, z10);
        }
        if (!this.f21851a.c() && arrayList.contains("grs_sdk_global_route_config.json")) {
            this.f21851a = new c(context, z10);
        }
        this.f21851a.a(context, arrayList);
    }

    public void a(GrsBaseInfo grsBaseInfo) {
        this.f21851a.a(grsBaseInfo);
    }
}
