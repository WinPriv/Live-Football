package com.applovin.adview;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import com.anythink.expressad.exoplayer.b;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.adview.activity.b.a;
import com.applovin.impl.adview.activity.b.e;
import com.applovin.impl.adview.k;
import com.applovin.impl.adview.p;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinFullscreenActivity extends Activity implements k {

    @SuppressLint({"StaticFieldLeak"})
    public static p parentInterstitialWrapper;

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.p f12877a;

    /* renamed from: b, reason: collision with root package name */
    private com.applovin.impl.adview.activity.b.a f12878b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f12879c = new AtomicBoolean(true);

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.impl.adview.activity.a f12880d;

    /* renamed from: e, reason: collision with root package name */
    private a f12881e;
    private boolean f;

    /* loaded from: classes.dex */
    public static class a implements OnBackInvokedCallback {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f12884a;

        public a(Runnable runnable) {
            this.f12884a = runnable;
        }

        @Override // android.window.OnBackInvokedCallback
        public void onBackInvoked() {
            this.f12884a.run();
        }
    }

    @Override // com.applovin.impl.adview.k
    public void dismiss() {
        if (h.l() && this.f12881e != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f12881e);
            this.f12881e = null;
        }
        com.applovin.impl.adview.activity.b.a aVar = this.f12878b;
        if (aVar != null) {
            aVar.h();
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.applovin.impl.adview.activity.b.a aVar = this.f12878b;
        if (aVar != null) {
            aVar.a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            if (bundle.getBoolean("com.applovin.dismiss_on_restore", false)) {
                y.h("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
                dismiss();
                return;
            }
            y.f("AppLovinFullscreenActivity", "Activity was destroyed while in background.");
        }
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            y.c("AppLovinFullscreenActivity", "Failed to request window feature", th);
        }
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(b.f7294bc);
        getWindow().addFlags(128);
        View findViewById = findViewById(R.id.content);
        findViewById.setBackgroundColor(-16777216);
        String stringExtra = getIntent().getStringExtra("com.applovin.interstitial.sdk_key");
        if (TextUtils.isEmpty(stringExtra)) {
            p pVar = parentInterstitialWrapper;
            if (pVar != null && pVar.f() != null) {
                p.a(parentInterstitialWrapper.f(), parentInterstitialWrapper.c(), "Empty SDK key", null, this);
            }
            finish();
            return;
        }
        com.applovin.impl.sdk.p pVar2 = AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(this), this).coreSdk;
        this.f12877a = pVar2;
        this.f = ((Boolean) pVar2.a(com.applovin.impl.sdk.c.b.cR)).booleanValue();
        if (((Boolean) this.f12877a.a(com.applovin.impl.sdk.c.b.cS)).booleanValue()) {
            findViewById.setFitsSystemWindows(true);
        }
        com.applovin.impl.sdk.utils.b.a(this.f, this);
        if (h.l() && ((Boolean) this.f12877a.a(com.applovin.impl.sdk.c.b.fF)).booleanValue()) {
            this.f12881e = new a(new Runnable() { // from class: com.applovin.adview.AppLovinFullscreenActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    AppLovinFullscreenActivity.this.a();
                }
            });
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f12881e);
        }
        p pVar3 = parentInterstitialWrapper;
        if (pVar3 != null) {
            com.applovin.impl.adview.activity.b.a.a(pVar3.f(), parentInterstitialWrapper.e(), parentInterstitialWrapper.c(), parentInterstitialWrapper.d(), parentInterstitialWrapper.b(), this.f12877a, this, new a.InterfaceC0190a() { // from class: com.applovin.adview.AppLovinFullscreenActivity.2
                @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0190a
                public void a(com.applovin.impl.adview.activity.b.a aVar) {
                    AppLovinFullscreenActivity.this.f12878b = aVar;
                    aVar.d();
                }

                @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0190a
                public void a(String str, Throwable th2) {
                    p.a(AppLovinFullscreenActivity.parentInterstitialWrapper.f(), AppLovinFullscreenActivity.parentInterstitialWrapper.c(), str, th2, AppLovinFullscreenActivity.this);
                }
            });
            return;
        }
        Intent intent = new Intent(this, (Class<?>) FullscreenAdService.class);
        com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.f12877a);
        this.f12880d = aVar;
        bindService(intent, aVar, 1);
        if (h.h()) {
            String str = this.f12877a.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.DISABLE_SET_DATA_DIRECTORY_SUFFIX);
            if (!StringUtils.isValidString(str) || !Boolean.parseBoolean(str)) {
                try {
                    WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        parentInterstitialWrapper = null;
        com.applovin.impl.adview.activity.a aVar = this.f12880d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        com.applovin.impl.adview.activity.b.a aVar2 = this.f12878b;
        if (aVar2 != null) {
            if (!aVar2.i()) {
                this.f12878b.h();
            }
            this.f12878b.k();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        com.applovin.impl.adview.activity.b.a aVar = this.f12878b;
        if (aVar != null) {
            aVar.a(i10, keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        com.applovin.impl.adview.activity.b.a aVar = this.f12878b;
        if (aVar != null) {
            aVar.g();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        com.applovin.impl.adview.activity.b.a aVar;
        try {
            super.onResume();
            if (!this.f12879c.get() && (aVar = this.f12878b) != null) {
                aVar.f();
            }
        } catch (IllegalArgumentException e10) {
            this.f12877a.L();
            if (y.a()) {
                this.f12877a.L().b("AppLovinFullscreenActivity", "Error was encountered in onResume().", e10);
            }
            dismiss();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.applovin.impl.sdk.p pVar = this.f12877a;
        if (pVar != null) {
            bundle.putBoolean("com.applovin.dismiss_on_restore", ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.fz)).booleanValue());
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        com.applovin.impl.adview.activity.b.a aVar = this.f12878b;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        if (this.f12878b != null) {
            if (!this.f12879c.getAndSet(false) || (this.f12878b instanceof e)) {
                this.f12878b.c(z10);
            }
            if (z10) {
                com.applovin.impl.sdk.utils.b.a(this.f, this);
            }
        }
        super.onWindowFocusChanged(z10);
    }

    public void setPresenter(com.applovin.impl.adview.activity.b.a aVar) {
        this.f12878b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.adview.activity.b.a aVar = this.f12878b;
        if (aVar != null) {
            aVar.l();
        }
        if (Utils.isAppLovinTestEnvironment(getApplicationContext())) {
            super.onBackPressed();
        }
    }
}
