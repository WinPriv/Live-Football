package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdSource;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import java.util.List;
import ka.n7;

/* loaded from: classes2.dex */
public final class l2 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f22891s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f22892t;

    public l2(Context context, List list) {
        this.f22891s = list;
        this.f22892t = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        String str;
        List<AdSource> list = this.f22891s;
        try {
            if (!androidx.transition.n.M(list) && (context = this.f22892t) != null) {
                for (AdSource adSource : list) {
                    if (adSource != null) {
                        SourceParam sourceParam = new SourceParam();
                        sourceParam.o(true);
                        sourceParam.l(false);
                        sourceParam.n(adSource.k());
                        e6.c f = com.huawei.openalliance.ad.ppskit.handlers.i0.d(context.getApplicationContext()).f(sourceParam);
                        Object[] objArr = new Object[1];
                        if (f != null) {
                            str = y1.j(f.f27764a);
                        } else {
                            str = null;
                        }
                        objArr[0] = str;
                        n7.f("AdSourceUtil", "downloadDspLogo result= %s", objArr);
                    }
                }
            }
        } catch (Throwable unused) {
            n7.i("AdSourceUtil", "downloadDspLogo error");
        }
    }
}
