package com.anythink.basead.mraid;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class a implements IBannerJSBridge {

    /* renamed from: a, reason: collision with root package name */
    c f4049a;

    /* renamed from: b, reason: collision with root package name */
    WeakReference<Activity> f4050b;

    /* renamed from: c, reason: collision with root package name */
    private b f4051c;

    private void a(Activity activity) {
        this.f4050b = new WeakReference<>(activity);
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void close() {
        b bVar = this.f4051c;
        if (bVar != null) {
            bVar.close();
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void expand(String str, boolean z10) {
        Activity activity;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z10);
            WeakReference<Activity> weakReference = this.f4050b;
            if (weakReference != null && (activity = weakReference.get()) != null) {
                c cVar = this.f4049a;
                if (cVar != null && cVar.isShowing()) {
                    return;
                }
                c cVar2 = new c(activity, bundle, this.f4051c);
                this.f4049a = cVar2;
                cVar2.show();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final com.anythink.expressad.foundation.d.c getMraidCampaign() {
        return null;
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void open(String str) {
        b bVar = this.f4051c;
        if (bVar != null) {
            bVar.open(str);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void unload() {
        close();
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void useCustomClose(boolean z10) {
        try {
            b bVar = this.f4051c;
            if (bVar != null) {
                bVar.useCustomClose(z10);
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(b bVar) {
        if (bVar != null) {
            this.f4051c = bVar;
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void cai(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void click(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void getFileInfo(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void getNetstat(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void gial(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void handlerH5Exception(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void increaseOfferFrequence(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void init(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void install(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void onJSBridgeConnect(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void openURL(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void readyStatus(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void reportUrls(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void resetCountdown(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void sendImpressions(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void toggleCloseBtn(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void triggerCloseBtn(Object obj, String str) {
    }
}
