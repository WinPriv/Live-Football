package com.huawei.openalliance.ad.ppskit.handlers;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.utils.ServerConfig;
import ka.g6;
import ka.n7;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f22502s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f22503t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ConfigSpHandler f22504u;

    public b(ConfigSpHandler configSpHandler, String str, String str2) {
        this.f22504u = configSpHandler;
        this.f22502s = str;
        this.f22503t = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g6 g6Var;
        Context context = this.f22504u.f22480c;
        synchronized (g6.f) {
            if (g6.f31203e == null) {
                g6.f31203e = new g6(context);
            }
            g6Var = g6.f31203e;
        }
        String a10 = a0.a.K(this.f22504u.f22480c).a(this.f22504u.f22480c, ServerConfig.a(), this.f22503t, ServerConfig.b(), g6Var.a(this.f22502s));
        if (TextUtils.isEmpty(a10)) {
            n7.g("ConfigSp", "asyncServerUrl, grs return null or empty");
            return;
        }
        String b10 = g6Var.b(this.f22502s);
        String str = this.f22502s + this.f22503t;
        synchronized (this.f22504u.f22483g) {
            this.f22504u.f.put(str, a10 + b10);
        }
        this.f22504u.f22484h.edit().putString(str, a10 + b10).commit();
    }
}
