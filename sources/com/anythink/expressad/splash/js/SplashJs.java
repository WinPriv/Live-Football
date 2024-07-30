package com.anythink.expressad.splash.js;

import a3.l;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.a;
import com.anythink.expressad.foundation.h.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SplashJs extends AbsFeedBackForH5 {

    /* renamed from: h, reason: collision with root package name */
    private static String f11081h = "SplashJs";

    /* renamed from: i, reason: collision with root package name */
    private SplashJSBridgeImpl f11082i;

    public void cai(Object obj, String str) {
        l.B(str, "cai", f11081h);
        SplashJSBridgeImpl splashJSBridgeImpl = this.f11082i;
        if (splashJSBridgeImpl != null) {
            splashJSBridgeImpl.cai(obj, str);
        }
    }

    public void getFileInfo(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                SplashJsUtils.getFileInfo(obj, new JSONObject(str));
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void gial(Object obj, String str) {
        l.B(str, "gial", f11081h);
        SplashJSBridgeImpl splashJSBridgeImpl = this.f11082i;
        if (splashJSBridgeImpl != null) {
            splashJSBridgeImpl.gial(obj, str);
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        if (obj != null) {
            try {
                WindVaneWebView windVaneWebView = ((a) obj).f7045a;
                if (windVaneWebView != null && windVaneWebView.getWebViewListener() != null) {
                    windVaneWebView.getWebViewListener().onReceivedError(windVaneWebView, 0, str.toString(), windVaneWebView.getUrl());
                }
            } catch (Throwable th) {
                o.b(f11081h, "handlerH5Exception", th);
            }
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            SplashJsUtils.increaseOfferFrequence(obj, new JSONObject(str));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void init(Object obj, String str) {
        l.B(str, "initialize", f11081h);
        SplashJSBridgeImpl splashJSBridgeImpl = this.f11082i;
        if (splashJSBridgeImpl != null) {
            splashJSBridgeImpl.init(obj, str);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.l
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof SplashJSBridgeImpl)) {
                this.f11082i = (SplashJSBridgeImpl) windVaneWebView.getObject();
            }
        } catch (Throwable th) {
            o.b(f11081h, "initialize", th);
        }
    }

    public void install(Object obj, String str) {
        SplashJSBridgeImpl splashJSBridgeImpl = this.f11082i;
        if (splashJSBridgeImpl != null) {
            splashJSBridgeImpl.install(obj, str);
        }
    }

    public void onJSBridgeConnect(Object obj, String str) {
        try {
            o.d(f11081h, "onJSBridgeConnect");
            SplashJSBridgeImpl splashJSBridgeImpl = this.f11082i;
            if (splashJSBridgeImpl != null) {
                splashJSBridgeImpl.onJSBridgeConnect(obj, str);
            }
        } catch (Throwable th) {
            o.b(f11081h, "onJSBridgeConnect", th);
        }
    }

    public void openURL(Object obj, String str) {
        l.B(str, "openURL", f11081h);
        SplashJSBridgeImpl splashJSBridgeImpl = this.f11082i;
        if (splashJSBridgeImpl != null) {
            splashJSBridgeImpl.openURL(obj, str);
        }
    }

    public void pauseCountDown(Object obj, String str) {
        try {
            o.d(f11081h, "pauseCountDown");
            SplashJSBridgeImpl splashJSBridgeImpl = this.f11082i;
            if (splashJSBridgeImpl != null) {
                splashJSBridgeImpl.pauseCountDown(obj, str);
            }
        } catch (Throwable th) {
            o.b(f11081h, "pauseCountDown", th);
        }
    }

    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                int optInt = new JSONObject(str).optInt("isReady", 1);
                WindVaneWebView windVaneWebView = ((a) obj).f7045a;
                if (windVaneWebView != null && windVaneWebView.getWebViewListener() != null) {
                    windVaneWebView.getWebViewListener().readyState(windVaneWebView, optInt);
                }
            } catch (Throwable th) {
                o.b(f11081h, "readyStatus", th);
            }
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            o.d(f11081h, "reportUrls");
            SplashJSBridgeImpl splashJSBridgeImpl = this.f11082i;
            if (splashJSBridgeImpl != null) {
                splashJSBridgeImpl.reportUrls(obj, str);
            }
        } catch (Throwable th) {
            o.b(f11081h, "reportUrls", th);
        }
    }

    public void resetCountdown(Object obj, String str) {
        l.B(str, "resetCountdown", f11081h);
        SplashJSBridgeImpl splashJSBridgeImpl = this.f11082i;
        if (splashJSBridgeImpl != null) {
            splashJSBridgeImpl.resetCountdown(obj, str);
        }
    }

    public void resumeCountDown(Object obj, String str) {
        try {
            o.d(f11081h, "resumeCountDown");
            SplashJSBridgeImpl splashJSBridgeImpl = this.f11082i;
            if (splashJSBridgeImpl != null) {
                splashJSBridgeImpl.resumeCountDown(obj, str);
            }
        } catch (Throwable th) {
            o.b(f11081h, "resumeCountDown", th);
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            o.d(f11081h, "sendImpressions");
            SplashJSBridgeImpl splashJSBridgeImpl = this.f11082i;
            if (splashJSBridgeImpl != null) {
                splashJSBridgeImpl.sendImpressions(obj, str);
            }
        } catch (Throwable th) {
            o.b(f11081h, "sendImpressions", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        l.B(str, "toggleCloseBtn", f11081h);
        SplashJSBridgeImpl splashJSBridgeImpl = this.f11082i;
        if (splashJSBridgeImpl != null) {
            splashJSBridgeImpl.toggleCloseBtn(obj, str);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        l.B(str, "triggerCloseBtn", f11081h);
        SplashJSBridgeImpl splashJSBridgeImpl = this.f11082i;
        if (splashJSBridgeImpl != null) {
            splashJSBridgeImpl.triggerCloseBtn(obj, str);
        }
    }
}
