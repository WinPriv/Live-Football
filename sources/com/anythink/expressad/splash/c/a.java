package com.anythink.expressad.splash.c;

import android.content.Context;
import com.anythink.core.common.b.n;
import com.anythink.expressad.splash.view.ATSplashNativeView;
import com.anythink.expressad.splash.view.ATSplashView;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: com.anythink.expressad.splash.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0132a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f10923a = new a(0);

        public static /* synthetic */ a a() {
            return f10923a;
        }
    }

    public /* synthetic */ a(byte b10) {
        this();
    }

    private static a a() {
        return C0132a.f10923a;
    }

    private a() {
    }

    public static void a(ATSplashView aTSplashView, com.anythink.expressad.splash.a.b bVar, com.anythink.expressad.splash.b.a aVar) {
        Context context = aTSplashView.getContext();
        if (context == null) {
            context = n.a().g();
        }
        try {
            aVar.a(new ATSplashNativeView(context, aTSplashView, bVar));
        } catch (Throwable unused) {
            aVar.a("View render error.");
        }
    }

    private static void a(Context context, ATSplashView aTSplashView, com.anythink.expressad.splash.a.b bVar, com.anythink.expressad.splash.b.a aVar) {
        try {
            ATSplashNativeView aTSplashNativeView = new ATSplashNativeView(context, aTSplashView, bVar);
            if (aVar != null) {
                aVar.a(aTSplashNativeView);
            }
        } catch (Throwable unused) {
            if (aVar != null) {
                aVar.a("View render error.");
            }
        }
    }
}
