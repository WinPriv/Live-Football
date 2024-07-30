package com.anythink.expressad.atsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class MBWebViewChecker {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Boolean f7023a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Handler f7024b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f7025c;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context) {
        WebView webView;
        try {
            webView = new WebView(context);
        } catch (Exception unused) {
            webView = null;
        }
        if (webView != null) {
            return true;
        }
        return false;
    }

    public static boolean isWebViewAvailable(final Context context) {
        Boolean bool = Boolean.FALSE;
        f7025c = bool;
        if (bool == null || !bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f7023a == null) {
                try {
                    f7023a = Boolean.valueOf(b(context));
                } catch (Exception unused) {
                    f7023a = Boolean.FALSE;
                }
            }
            if (f7023a == null) {
                f7023a = Boolean.FALSE;
            }
            return f7023a.booleanValue();
        }
        if (f7023a == null && f7024b == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f7024b = handler;
            handler.post(new Runnable() { // from class: com.anythink.expressad.atsignalcommon.webEnvCheck.MBWebViewChecker.1
                @Override // java.lang.Runnable
                public void run() {
                    if (MBWebViewChecker.f7023a == null) {
                        try {
                            Boolean unused2 = MBWebViewChecker.f7023a = Boolean.valueOf(MBWebViewChecker.b(context));
                        } catch (Exception unused3) {
                            Boolean unused4 = MBWebViewChecker.f7023a = Boolean.FALSE;
                        }
                    }
                }
            });
        }
        if (f7023a == null) {
            return true;
        }
        return f7023a.booleanValue();
    }
}
