package com.ironsource.environment.e;

import android.os.Handler;
import android.os.Looper;
import zc.d;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f24660a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f24661b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public static final b f24662c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f24663d;

    static {
        b bVar = new b("isadplayer-background");
        bVar.start();
        bVar.a();
        f24662c = bVar;
        b bVar2 = new b("isadplayer-publisher-callbacks");
        bVar2.start();
        bVar2.a();
        f24663d = bVar2;
    }

    private a() {
    }

    public static Looper a() {
        return f24662c.getLooper();
    }

    public final void b(Runnable runnable) {
        d.d(runnable, "action");
        f24662c.a(runnable, 0L);
    }

    public final void c(Runnable runnable) {
        d.d(runnable, "action");
        f24663d.a(runnable, 0L);
    }

    public final void a(Runnable runnable) {
        d.d(runnable, "action");
        f24661b.postDelayed(runnable, 0L);
    }
}
