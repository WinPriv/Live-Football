package com.huawei.appgallery.markethomecountrysdk.api;

import android.content.Context;
import d0.b;
import java.util.concurrent.ThreadPoolExecutor;
import o9.a;
import v9.Task;
import v9.d;
import w9.e;

/* loaded from: classes2.dex */
public class HomeCountryApi {
    public static Task<String> getHomeCountry(Context context, String str, boolean z10) {
        b bVar = new b(3);
        if (context == null) {
            bVar.a(new Exception(com.anythink.expressad.foundation.g.b.b.f9831a));
        } else {
            a aVar = new a(bVar, context, str, z10);
            ThreadPoolExecutor threadPoolExecutor = d.f35997c.f35998a;
            b bVar2 = new b(3);
            try {
                threadPoolExecutor.execute(new e(bVar2, aVar));
            } catch (Exception e10) {
                bVar2.a(e10);
            }
        }
        return (w9.d) bVar.f27251t;
    }
}
