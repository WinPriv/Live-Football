package com.ironsource.sdk.k;

import android.os.Handler;
import com.ironsource.environment.e.a;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static d f26531e;

    /* renamed from: a, reason: collision with root package name */
    public c f26532a = new c(a.a());

    /* renamed from: b, reason: collision with root package name */
    public final String f26533b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f26534c;

    /* renamed from: d, reason: collision with root package name */
    public Thread f26535d;

    public d(String str, JSONObject jSONObject) {
        this.f26533b = str;
        this.f26534c = jSONObject;
        IronSourceStorageUtils.deleteFolder(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, "temp"));
        IronSourceStorageUtils.makeDir(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, "temp"));
    }

    public static synchronized d a(String str, a aVar, JSONObject jSONObject) {
        d dVar;
        synchronized (d.class) {
            if (f26531e == null) {
                f26531e = new d(str, jSONObject);
            }
            dVar = f26531e;
        }
        return dVar;
    }

    public final boolean b() {
        Thread thread = this.f26535d;
        if (thread != null && thread.isAlive()) {
            return true;
        }
        return false;
    }

    public Thread a(com.ironsource.sdk.h.c cVar, String str, int i10, int i11, Handler handler) {
        JSONObject jSONObject = this.f26534c;
        if (i10 <= 0) {
            i10 = jSONObject.optInt("connectionTimeout", 5);
        }
        if (i11 <= 0) {
            i11 = jSONObject.optInt("readTimeout", 5);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return new Thread(new xb.c(new xb.a(cVar, str, (int) timeUnit.toMillis(i10), (int) timeUnit.toMillis(i11), IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.f26533b, "temp")), handler));
    }

    public final synchronized void a() {
        f26531e = null;
        c cVar = this.f26532a;
        if (cVar != null) {
            cVar.f26530a = null;
            this.f26532a = null;
        }
    }

    public final void a(com.ironsource.sdk.h.c cVar, String str) {
        JSONObject jSONObject = this.f26534c;
        int optInt = jSONObject.optInt("connectionTimeout", 5);
        int optInt2 = jSONObject.optInt("readTimeout", 5);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Thread thread = new Thread(new xb.c(new xb.a(cVar, str, (int) timeUnit.toMillis(optInt), (int) timeUnit.toMillis(optInt2), IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.f26533b, "temp")), this.f26532a));
        this.f26535d = thread;
        thread.start();
    }
}
