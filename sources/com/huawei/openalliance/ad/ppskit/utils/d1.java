package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import ka.n7;
import ka.o7;
import ka.p7;
import ka.r7;
import ka.u7;

/* loaded from: classes2.dex */
public final class d1 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f22831s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f22832t;

    public d1(Context context, int i10) {
        this.f22831s = context;
        this.f22832t = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f22831s;
        String e10 = w1.e(context.createDeviceProtectedStorageContext());
        if (TextUtils.isEmpty(e10)) {
            n7.g("LogTool", "enable log failed, due to root path is null");
            return;
        }
        boolean U = androidx.transition.n.U("com.huawei.hms.support.log.KitLog");
        int i10 = this.f22832t;
        if (U) {
            o7.a().c(context, i10);
        }
        p7 p7Var = n7.f31494a;
        p7Var.f31641a = i10;
        p7Var.f31642b = "HiAd";
        r7 r7Var = p7.f31640d;
        r7Var.a(e10, "HiAdKitLog");
        p7Var.f31643c = true;
        StringBuilder sb2 = new StringBuilder("\n============================================================================\n====== HiAd-3.4.65.300\n====== Brand: ");
        sb2.append(Build.BRAND);
        sb2.append(" Model: ");
        sb2.append(m.C());
        sb2.append(" Release: ");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(" API: ");
        String i11 = com.ironsource.adapters.facebook.a.i(sb2, Build.VERSION.SDK_INT, "\n============================================================================");
        u7 u7Var = new u7(p7Var.f31642b, 4, "HiAd");
        u7Var.f31932g.append((Object) i11);
        r7Var.b(u7Var, 4, "HiAd");
    }
}
