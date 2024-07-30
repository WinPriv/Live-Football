package com.huawei.openalliance.ad.ppskit.utils;

import com.huawei.openalliance.ad.ppskit.utils.u1;

/* loaded from: classes2.dex */
public final class t1 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u1.a f23025s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f23026t;

    public t1(u1.a aVar, String str) {
        this.f23025s = aVar;
        this.f23026t = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u1.a aVar = this.f23025s;
        String str = this.f23026t;
        synchronized (aVar.f23036a) {
            aVar.b().edit().putString("aes_work_key1", str).apply();
        }
    }
}
