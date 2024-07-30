package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Intent;
import android.webkit.WebView;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinUserService;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class o implements n.a, AppLovinWebViewActivity.EventListener {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f19209a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private static WeakReference<AppLovinWebViewActivity> f19210b;

    /* renamed from: c, reason: collision with root package name */
    private final p f19211c;

    /* renamed from: d, reason: collision with root package name */
    private final y f19212d;

    /* renamed from: e, reason: collision with root package name */
    private AppLovinUserService.OnConsentDialogDismissListener f19213e;
    private n f;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference<Activity> f19214g;

    /* renamed from: h, reason: collision with root package name */
    private com.applovin.impl.sdk.utils.a f19215h;

    /* renamed from: i, reason: collision with root package name */
    private AtomicBoolean f19216i = new AtomicBoolean();

    public o(p pVar) {
        this.f19214g = new WeakReference<>(null);
        this.f19211c = pVar;
        this.f19212d = pVar.L();
        if (pVar.t() != null) {
            this.f19214g = new WeakReference<>(pVar.t());
        }
        p.a(p.y()).a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.o.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                o.this.f19214g = new WeakReference(activity);
            }
        });
        this.f = new n(this, pVar);
    }

    private void g() {
        this.f19211c.w().b(this.f19215h);
        if (d()) {
            AppLovinWebViewActivity appLovinWebViewActivity = f19210b.get();
            f19210b = null;
            if (appLovinWebViewActivity != null) {
                appLovinWebViewActivity.finish();
                AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener = this.f19213e;
                if (onConsentDialogDismissListener != null) {
                    onConsentDialogDismissListener.onDismiss();
                    this.f19213e = null;
                }
            }
        }
    }

    @Override // com.applovin.impl.sdk.n.a
    public void b() {
    }

    @Override // com.applovin.sdk.AppLovinWebViewActivity.EventListener
    public void onReceivedEvent(String str) {
        if ("accepted".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(true, p.y());
            g();
        } else if ("rejected".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(false, p.y());
            a(((Boolean) this.f19211c.a(com.applovin.impl.sdk.c.b.aJ)).booleanValue(), ((Long) this.f19211c.a(com.applovin.impl.sdk.c.b.aO)).longValue());
        } else if ("closed".equalsIgnoreCase(str)) {
            a(((Boolean) this.f19211c.a(com.applovin.impl.sdk.c.b.aK)).booleanValue(), ((Long) this.f19211c.a(com.applovin.impl.sdk.c.b.aP)).longValue());
        } else if (AppLovinWebViewActivity.EVENT_DISMISSED_VIA_BACK_BUTTON.equalsIgnoreCase(str)) {
            a(((Boolean) this.f19211c.a(com.applovin.impl.sdk.c.b.aL)).booleanValue(), ((Long) this.f19211c.a(com.applovin.impl.sdk.c.b.aQ)).longValue());
        }
    }

    public void c() {
        if (this.f19216i.getAndSet(true)) {
            return;
        }
        final String str = (String) this.f19211c.a(com.applovin.impl.sdk.c.b.aG);
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.o.2
            @Override // java.lang.Runnable
            public void run() {
                p unused = o.this.f19211c;
                WebView tryToCreateWebView = Utils.tryToCreateWebView(p.y(), "preloading consent dialog", true);
                if (tryToCreateWebView == null) {
                    return;
                }
                tryToCreateWebView.loadUrl(str);
            }
        });
    }

    public boolean d() {
        WeakReference<AppLovinWebViewActivity> weakReference = f19210b;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public void a(final Activity activity, final AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        activity.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.o.3
            @Override // java.lang.Runnable
            public void run() {
                o oVar = o.this;
                if (oVar.a(oVar.f19211c) && !o.f19209a.getAndSet(true)) {
                    o.this.f19214g = new WeakReference(activity);
                    o.this.f19213e = onConsentDialogDismissListener;
                    o.this.f19215h = new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.o.3.1
                        @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
                        public void onActivityStarted(Activity activity2) {
                            if (activity2 instanceof AppLovinWebViewActivity) {
                                if (!o.this.d() || o.f19210b.get() != activity2) {
                                    AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) activity2;
                                    WeakReference unused = o.f19210b = new WeakReference(appLovinWebViewActivity);
                                    appLovinWebViewActivity.loadUrl((String) o.this.f19211c.a(com.applovin.impl.sdk.c.b.aG), o.this);
                                }
                                o.f19209a.set(false);
                            }
                        }
                    };
                    o.this.f19211c.w().a(o.this.f19215h);
                    Intent intent = new Intent(activity, (Class<?>) AppLovinWebViewActivity.class);
                    intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, o.this.f19211c.B());
                    intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, (Serializable) o.this.f19211c.a(com.applovin.impl.sdk.c.b.aH));
                    activity.startActivity(intent);
                    return;
                }
                AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener2 = onConsentDialogDismissListener;
                if (onConsentDialogDismissListener2 != null) {
                    onConsentDialogDismissListener2.onDismiss();
                }
            }
        });
    }

    public void a(final long j10) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.o.4
            @Override // java.lang.Runnable
            public void run() {
                y unused = o.this.f19212d;
                if (y.a()) {
                    o.this.f19212d.b("ConsentDialogManager", "Scheduling repeating consent alert");
                }
                o.this.f.a(j10, o.this.f19211c, o.this);
            }
        });
    }

    private void a(boolean z10, long j10) {
        g();
        if (z10) {
            a(j10);
        }
    }

    @Override // com.applovin.impl.sdk.n.a
    public void a() {
        final Activity activity = this.f19214g.get();
        if (activity != null) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.o.5
                @Override // java.lang.Runnable
                public void run() {
                    o.this.a(activity, (AppLovinUserService.OnConsentDialogDismissListener) null);
                }
            }, ((Long) this.f19211c.a(com.applovin.impl.sdk.c.b.aI)).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(p pVar) {
        if (d()) {
            y.i("AppLovinSdk", "Consent dialog already showing");
            return false;
        }
        if (!com.applovin.impl.sdk.utils.i.a(p.y())) {
            y.i("AppLovinSdk", "No internet available, skip showing of consent dialog");
            return false;
        }
        if (!((Boolean) pVar.a(com.applovin.impl.sdk.c.b.aF)).booleanValue()) {
            if (y.a()) {
                this.f19212d.e("ConsentDialogManager", "Blocked publisher from showing consent dialog");
            }
            return false;
        }
        if (StringUtils.isValidString((String) pVar.a(com.applovin.impl.sdk.c.b.aG))) {
            return true;
        }
        if (y.a()) {
            this.f19212d.e("ConsentDialogManager", "AdServer returned empty consent dialog URL");
        }
        return false;
    }
}
