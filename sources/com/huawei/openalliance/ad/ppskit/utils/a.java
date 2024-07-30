package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import ka.n7;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f22803s;

    public a(Context context) {
        this.f22803s = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f22803s;
        if (context != null) {
            try {
                Uri parse = Uri.parse("content://com.huawei.hms.servicemanager");
                if (!d0.g(context, parse)) {
                    n7.g("AAIDUtils", "provider uri invalid.");
                } else {
                    Bundle call = context.getContentResolver().call(parse, "getAAID", (String) null, (Bundle) null);
                    if (call != null) {
                        androidx.activity.n.f517x = call.getString("AAID");
                    } else {
                        androidx.activity.n.f517x = null;
                    }
                }
            } catch (Throwable th) {
                n7.h("AAIDUtils", "get AAID error: %s", th.getClass().getSimpleName());
            }
        }
    }
}
