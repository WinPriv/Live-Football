package com.anythink.interstitial.a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.n;
import com.anythink.core.common.v;
import com.anythink.interstitial.api.ATInterstitialAutoEventListener;
import com.anythink.interstitial.api.ATInterstitialAutoLoadListener;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static volatile b f12559c;

    /* renamed from: a, reason: collision with root package name */
    String f12560a = "InterstitialAuto";

    /* renamed from: b, reason: collision with root package name */
    ATInterstitialAutoLoadListener f12561b = new ATInterstitialAutoLoadListener() { // from class: com.anythink.interstitial.a.b.1
        @Override // com.anythink.interstitial.api.ATInterstitialAutoLoadListener
        public final void onInterstitialAutoLoadFail(final String str, final AdError adError) {
            n.a().a(new Runnable() { // from class: com.anythink.interstitial.a.b.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (b.this.f12562d != null) {
                        b.this.f12562d.onInterstitialAutoLoadFail(str, adError);
                    }
                }
            });
        }

        @Override // com.anythink.interstitial.api.ATInterstitialAutoLoadListener
        public final void onInterstitialAutoLoaded(final String str) {
            n.a().a(new Runnable() { // from class: com.anythink.interstitial.a.b.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (b.this.f12562d != null) {
                        b.this.f12562d.onInterstitialAutoLoaded(str);
                    }
                }
            });
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private ATInterstitialAutoLoadListener f12562d;

    public static void b(String... strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                v.a().a(str, false);
                a.a(n.a().g(), str).k();
            }
        }
    }

    public static List<ATAdInfo> c(String str) {
        a a10 = a.a(n.a().E(), str);
        if (a10 != null) {
            return a10.a(n.a().E());
        }
        return null;
    }

    private ATAdStatusInfo d(String str) {
        if (n.a().g() != null && !TextUtils.isEmpty(n.a().p()) && !TextUtils.isEmpty(n.a().q())) {
            a a10 = a.a(n.a().E(), str);
            if (a10 == null) {
                return null;
            }
            return a10.a(n.a().E(), (Map<String, Object>) null);
        }
        Log.e(this.f12560a, "SDK init error!");
        return null;
    }

    public static b a() {
        if (f12559c == null) {
            synchronized (b.class) {
                if (f12559c == null) {
                    f12559c = new b();
                }
            }
        }
        return f12559c;
    }

    public final ATAdStatusInfo b(String str) {
        ATAdStatusInfo aTAdStatusInfo;
        if (!TextUtils.isEmpty(str)) {
            aTAdStatusInfo = d(str);
            if (aTAdStatusInfo == null) {
                aTAdStatusInfo = new ATAdStatusInfo(false, false, null);
            }
        } else {
            aTAdStatusInfo = new ATAdStatusInfo(false, false, null);
        }
        com.anythink.core.common.k.n.b(str, g.i.f5086n, g.i.f5092u, aTAdStatusInfo.toString(), "");
        return aTAdStatusInfo;
    }

    public final void a(Context context, String[] strArr, ATInterstitialAutoLoadListener aTInterstitialAutoLoadListener) {
        if (context instanceof Activity) {
            n.a().a((Activity) context);
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (!v.a().f(str)) {
                    v.a().a(str, true);
                    a.a(context, str).a(context, 3, (com.anythink.core.common.b.a) null, (com.anythink.core.common.b.b) null, (Map<String, Object>) null);
                }
            }
        }
        this.f12562d = aTInterstitialAutoLoadListener;
    }

    private ATInterstitialAutoLoadListener b() {
        return this.f12561b;
    }

    public static void a(String... strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str) && !v.a().f(str)) {
                v.a().a(str, true);
                a.a(n.a().E(), str).a(n.a().E(), 3, (com.anythink.core.common.b.a) null, (com.anythink.core.common.b.b) null, (Map<String, Object>) null);
            }
        }
    }

    public static void a(String str, Map<String, Object> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        v.a().a(str, map);
    }

    private void a(Activity activity, String str, ATInterstitialAutoEventListener aTInterstitialAutoEventListener) {
        a(activity, str, "", aTInterstitialAutoEventListener);
    }

    public final void a(Activity activity, String str, String str2, ATInterstitialAutoEventListener aTInterstitialAutoEventListener) {
        com.anythink.core.common.k.n.b(str, g.i.f5086n, g.i.f5090s, g.i.f5080h, "");
        if (TextUtils.isEmpty(str)) {
            Log.e(this.f12560a, "PlacementId is Empty!");
            return;
        }
        if (n.a().g() != null && !TextUtils.isEmpty(n.a().p()) && !TextUtils.isEmpty(n.a().q())) {
            if (activity == null) {
                Log.e(this.f12560a, "Interstitial Show Activity is null.");
            }
            a.a(activity, str).a(activity, str2, new c(aTInterstitialAutoEventListener), (ATEventInterface) null, (Map<String, Object>) null);
            return;
        }
        Log.e(this.f12560a, "Show error: SDK init error!");
    }

    public final boolean a(String str) {
        boolean z10 = false;
        if (!TextUtils.isEmpty(str)) {
            ATAdStatusInfo d10 = d(str);
            if (d10 == null) {
                return false;
            }
            z10 = d10.isReady();
        }
        com.anythink.core.common.k.n.b(str, g.i.f5086n, g.i.f5091t, String.valueOf(z10), "");
        return z10;
    }

    public static void a(String str, String str2, Map<String, Object> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        n.a().a(str, str2, "3", map);
    }
}
