package com.anythink.expressad.atsignalcommon.bridge;

import android.content.Context;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.h.o;
import com.huawei.openalliance.ad.constant.av;

/* loaded from: classes.dex */
public class BannerJSPlugin extends AbsFeedBackForH5 {

    /* renamed from: h, reason: collision with root package name */
    private final String f6981h = "BannerJSBridge";

    /* renamed from: i, reason: collision with root package name */
    private IBannerJSBridge f6982i;

    public void cai(Object obj, String str) {
        try {
            o.d("BannerJSBridge", "cai");
            IBannerJSBridge iBannerJSBridge = this.f6982i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.cai(obj, str);
            }
        } catch (Throwable th) {
            o.b("BannerJSBridge", "cai", th);
        }
    }

    public void click(Object obj, String str) {
        try {
            o.d("BannerJSBridge", "click");
            IBannerJSBridge iBannerJSBridge = this.f6982i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.click(obj, str);
            }
        } catch (Throwable th) {
            o.b("BannerJSBridge", "click", th);
        }
    }

    public void getFileInfo(Object obj, String str) {
        try {
            o.d("BannerJSBridge", "getFileInfo");
            IBannerJSBridge iBannerJSBridge = this.f6982i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.getFileInfo(obj, str);
            }
        } catch (Throwable th) {
            o.b("BannerJSBridge", "getFileInfo", th);
        }
    }

    public void getNetstat(Object obj, String str) {
        try {
            o.d("BannerJSBridge", "getNetstat");
            IBannerJSBridge iBannerJSBridge = this.f6982i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.getNetstat(obj, str);
            }
        } catch (Throwable th) {
            o.b("BannerJSBridge", "getNetstat", th);
        }
    }

    public void gial(Object obj, String str) {
        try {
            o.d("BannerJSBridge", "gial");
            IBannerJSBridge iBannerJSBridge = this.f6982i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.gial(obj, str);
            }
        } catch (Throwable th) {
            o.b("BannerJSBridge", "gial", th);
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        try {
            o.d("BannerJSBridge", "handlerH5Exception");
            IBannerJSBridge iBannerJSBridge = this.f6982i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.handlerH5Exception(obj, str);
            }
        } catch (Throwable th) {
            o.b("BannerJSBridge", "handlerH5Exception", th);
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            o.d("BannerJSBridge", "increaseOfferFrequence");
            IBannerJSBridge iBannerJSBridge = this.f6982i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.increaseOfferFrequence(obj, str);
            }
        } catch (Throwable th) {
            o.b("BannerJSBridge", "increaseOfferFrequence", th);
        }
    }

    public void init(Object obj, String str) {
        try {
            o.d("BannerJSBridge", "init");
            IBannerJSBridge iBannerJSBridge = this.f6982i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.init(obj, str);
            }
        } catch (Throwable th) {
            o.b("BannerJSBridge", "init", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.expressad.atsignalcommon.windvane.l
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof IBannerJSBridge) {
                this.f6982i = (IBannerJSBridge) context;
            } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof IBannerJSBridge)) {
                this.f6982i = (IBannerJSBridge) windVaneWebView.getObject();
            }
        } catch (Throwable th) {
            o.b("BannerJSBridge", "initialize", th);
        }
    }

    public void install(Object obj, String str) {
        try {
            o.d("BannerJSBridge", av.ag);
            IBannerJSBridge iBannerJSBridge = this.f6982i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.install(obj, str);
            }
        } catch (Throwable th) {
            o.b("BannerJSBridge", av.ag, th);
        }
    }

    public void onJSBridgeConnect(Object obj, String str) {
        try {
            o.d("BannerJSBridge", "onJSBridgeConnect");
            IBannerJSBridge iBannerJSBridge = this.f6982i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.onJSBridgeConnect(obj, str);
            }
        } catch (Throwable th) {
            o.b("BannerJSBridge", "onJSBridgeConnect", th);
        }
    }

    public void openURL(Object obj, String str) {
        try {
            o.d("BannerJSBridge", "openURL");
            IBannerJSBridge iBannerJSBridge = this.f6982i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.openURL(obj, str);
            }
        } catch (Throwable th) {
            o.b("BannerJSBridge", "openURL", th);
        }
    }

    public void readyStatus(Object obj, String str) {
        try {
            o.d("BannerJSBridge", "readyStatus");
            IBannerJSBridge iBannerJSBridge = this.f6982i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.readyStatus(obj, str);
            }
        } catch (Throwable th) {
            o.b("BannerJSBridge", "readyStatus", th);
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            o.d("BannerJSBridge", "reportUrls");
            IBannerJSBridge iBannerJSBridge = this.f6982i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.reportUrls(obj, str);
            }
        } catch (Throwable th) {
            o.b("BannerJSBridge", "reportUrls", th);
        }
    }

    public void resetCountdown(Object obj, String str) {
        try {
            o.d("BannerJSBridge", "resetCountdown");
            IBannerJSBridge iBannerJSBridge = this.f6982i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.resetCountdown(obj, str);
            }
        } catch (Throwable th) {
            o.b("BannerJSBridge", "resetCountdown", th);
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            o.d("BannerJSBridge", "sendImpressions");
            IBannerJSBridge iBannerJSBridge = this.f6982i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.sendImpressions(obj, str);
            }
        } catch (Throwable th) {
            o.b("BannerJSBridge", "sendImpressions", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            o.d("BannerJSBridge", "toggleCloseBtn");
            IBannerJSBridge iBannerJSBridge = this.f6982i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.toggleCloseBtn(obj, str);
            }
        } catch (Throwable th) {
            o.b("BannerJSBridge", "toggleCloseBtn", th);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        try {
            o.d("BannerJSBridge", "triggerCloseBtn");
            IBannerJSBridge iBannerJSBridge = this.f6982i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.triggerCloseBtn(obj, str);
            }
        } catch (Throwable th) {
            o.b("BannerJSBridge", "triggerCloseBtn", th);
        }
    }
}
