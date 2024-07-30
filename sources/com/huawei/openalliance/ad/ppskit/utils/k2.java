package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import com.huawei.appgallery.markethomecountrysdk.api.HomeCountryApi;
import java.util.concurrent.Callable;
import ka.n7;

/* loaded from: classes2.dex */
public final class k2 implements Callable<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f22886a;

    public k2(Context context) {
        this.f22886a = context;
    }

    @Override // java.util.concurrent.Callable
    public final String call() {
        try {
            return (String) v9.e.a(HomeCountryApi.getHomeCountry(this.f22886a, "PPSSDK", false));
        } catch (Throwable th) {
            n7.j("AdInfoUtil", "getAgCountryCodeFromAg Throwable is %s ", th.getClass().getSimpleName());
            return com.huawei.openalliance.ad.constant.w.aU;
        }
    }
}
