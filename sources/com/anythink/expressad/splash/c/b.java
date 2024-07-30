package com.anythink.expressad.splash.c;

import a3.k;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.splash.c.e;
import com.anythink.expressad.splash.view.ATSplashView;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static String f10924a = "ResManager";

    /* renamed from: b, reason: collision with root package name */
    private static int f10925b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, Boolean> f10926c = new ConcurrentHashMap<>();

    public static void a(final ATSplashView aTSplashView, final com.anythink.expressad.foundation.d.c cVar, final com.anythink.expressad.splash.view.a aVar) {
        k.f().a(cVar.be(), new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.splash.c.b.1
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str) {
                b.f10926c.put(com.anythink.expressad.foundation.d.c.this.be(), Boolean.TRUE);
                com.anythink.expressad.splash.view.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a();
                }
                ATSplashView aTSplashView2 = aTSplashView;
                if (aTSplashView2 != null) {
                    aTSplashView2.setImageReady(true);
                }
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str, String str2) {
                b.f10926c.put(com.anythink.expressad.foundation.d.c.this.be(), Boolean.FALSE);
                com.anythink.expressad.splash.view.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.b();
                }
                ATSplashView aTSplashView2 = aTSplashView;
                if (aTSplashView2 != null) {
                    aTSplashView2.setImageReady(false);
                }
            }
        });
        if (TextUtils.isEmpty(cVar.bd())) {
            return;
        }
        k.f().a(cVar.bd(), new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.splash.c.b.2
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str) {
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str, String str2) {
            }
        });
    }

    private static String b(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            return "file:///" + file.getAbsolutePath();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Exception e10) {
                e10.getMessage();
                return "";
            }
        }
    }

    private static com.anythink.expressad.foundation.d.c a(com.anythink.expressad.foundation.d.c cVar) {
        if (TextUtils.isEmpty(cVar.c()) && (TextUtils.isEmpty(cVar.d()) || !cVar.d().contains("<MBTPLMARK>"))) {
            cVar.a(false);
            cVar.b(true);
        } else {
            cVar.a(true);
            cVar.b(false);
        }
        return cVar;
    }

    private static void a(ATSplashView aTSplashView, String str, com.anythink.expressad.foundation.d.c cVar, String str2, String str3, boolean z10, int i10, boolean z11) {
        e.c cVar2 = new e.c();
        cVar2.c(str3);
        cVar2.b(str2);
        cVar2.a(cVar);
        cVar2.a(str);
        cVar2.b(z10);
        cVar2.a(i10);
        cVar2.a(z11);
        e.a.a().a(aTSplashView, cVar2, null);
    }

    public static boolean a(ATSplashView aTSplashView, com.anythink.expressad.foundation.d.c cVar) {
        boolean z10;
        if (aTSplashView == null) {
            o.d(f10924a, "mbSplashView  is null");
            return false;
        }
        if (TextUtils.isEmpty(cVar.S())) {
            z10 = true;
        } else {
            z10 = aTSplashView.isVideoReady();
            o.d(f10924a, "======isReady isVideoReady:".concat(String.valueOf(z10)));
        }
        if (z10 && !TextUtils.isEmpty(cVar.c())) {
            z10 = aTSplashView.isH5Ready();
            o.d(f10924a, "======isReady getAdZip:".concat(String.valueOf(z10)));
        }
        if (z10 && TextUtils.isEmpty(cVar.c()) && !TextUtils.isEmpty(cVar.d())) {
            z10 = aTSplashView.isH5Ready();
            o.d(f10924a, "======isReady getAdHtml:".concat(String.valueOf(z10)));
        }
        if (TextUtils.isEmpty(cVar.c()) && TextUtils.isEmpty(cVar.d())) {
            o.d(f10924a, "======isReady getAdHtml  getAdZip all are empty");
            z10 = false;
        }
        if (!cVar.j()) {
            return z10;
        }
        boolean isImageReady = TextUtils.isEmpty(cVar.be()) ? false : aTSplashView.isImageReady();
        o.d(f10924a, "======isReady DYNAMIC VIEW and image state is : ".concat(String.valueOf(isImageReady)));
        return isImageReady;
    }

    public static void a(String str) {
        f10926c.remove(str);
    }
}
