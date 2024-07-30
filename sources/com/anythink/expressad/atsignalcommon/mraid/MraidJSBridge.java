package com.anythink.expressad.atsignalcommon.mraid;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.a;
import com.anythink.expressad.atsignalcommon.windvane.l;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.o;
import com.huawei.hms.ads.ep;
import com.huawei.openalliance.ad.constant.av;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MraidJSBridge extends l {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f7011a = "MraidJSBridge";

    /* renamed from: b, reason: collision with root package name */
    private IMraidJSBridge f7012b;

    public void close(Object obj, String str) {
        if (obj instanceof a) {
            CallMraidJS.getInstance().fireNativeMethodCompleteEvent(((a) obj).f7045a, "close");
        }
        try {
            o.d(f7011a, "MRAID close");
            IMraidJSBridge iMraidJSBridge = this.f7012b;
            if (iMraidJSBridge != null) {
                iMraidJSBridge.close();
            }
        } catch (Throwable th) {
            o.b(f7011a, "MRAID close", th);
        }
    }

    public void expand(Object obj, String str) {
        if (obj instanceof a) {
            CallMraidJS.getInstance().fireNativeMethodCompleteEvent(((a) obj).f7045a, "expand");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("url");
            String optString2 = jSONObject.optString("shouldUseCustomClose");
            o.d(f7011a, "MRAID expand " + optString + " " + optString2);
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && this.f7012b != null) {
                this.f7012b.expand(optString, optString2.toLowerCase().equals(ep.Code));
            }
        } catch (Throwable th) {
            o.b(f7011a, "MRAID expand", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.expressad.atsignalcommon.windvane.l
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof IMraidJSBridge) {
                this.f7012b = (IMraidJSBridge) context;
                return;
            }
            if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof IMraidJSBridge)) {
                this.f7012b = (IMraidJSBridge) windVaneWebView.getObject();
            }
            if (windVaneWebView.getMraidObject() != null && (windVaneWebView.getMraidObject() instanceof IMraidJSBridge)) {
                this.f7012b = (IMraidJSBridge) windVaneWebView.getMraidObject();
            }
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
        }
    }

    public void open(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (obj instanceof a) {
            windVaneWebView = ((a) obj).f7045a;
            CallMraidJS.getInstance().fireNativeMethodCompleteEvent(windVaneWebView, av.ai);
        } else {
            windVaneWebView = null;
        }
        try {
            String optString = new JSONObject(str).optString("url");
            o.d(f7011a, "MRAID Open ".concat(String.valueOf(optString)));
            if (this.f7012b != null && !TextUtils.isEmpty(optString)) {
                if (windVaneWebView != null && System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.anythink.expressad.a.b.a.f6634c) {
                    c mraidCampaign = this.f7012b.getMraidCampaign();
                    windVaneWebView.getUrl();
                    if (com.anythink.expressad.a.b.a.a(mraidCampaign)) {
                        return;
                    }
                }
                this.f7012b.open(optString);
            }
        } catch (Throwable th) {
            o.b(f7011a, "MRAID Open", th);
        }
    }

    public void setOrientationProperties(Object obj, String str) {
        if (obj instanceof a) {
            CallMraidJS.getInstance().fireNativeMethodCompleteEvent(((a) obj).f7045a, "setOrientationProperties");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("allowOrientationChange");
            String optString2 = jSONObject.optString("forceOrientation");
            o.d(f7011a, "MRAID setOrientationProperties");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && this.f7012b != null) {
                optString.toLowerCase().equals(ep.Code);
                String lowerCase = optString2.toLowerCase();
                int hashCode = lowerCase.hashCode();
                if (hashCode != 729267099) {
                    if (hashCode == 1430647483) {
                        lowerCase.equals("landscape");
                        return;
                    }
                    return;
                }
                lowerCase.equals("portrait");
            }
        } catch (Throwable th) {
            o.b(f7011a, "MRAID setOrientationProperties", th);
        }
    }

    public void unload(Object obj, String str) {
        if (obj instanceof a) {
            CallMraidJS.getInstance().fireNativeMethodCompleteEvent(((a) obj).f7045a, "unload");
        }
        try {
            o.d(f7011a, "MRAID unload");
            IMraidJSBridge iMraidJSBridge = this.f7012b;
            if (iMraidJSBridge != null) {
                iMraidJSBridge.unload();
            }
        } catch (Throwable th) {
            o.b(f7011a, "MRAID unload", th);
        }
    }

    public void useCustomClose(Object obj, String str) {
        if (obj instanceof a) {
            CallMraidJS.getInstance().fireNativeMethodCompleteEvent(((a) obj).f7045a, "useCustomClose");
        }
        try {
            String optString = new JSONObject(str).optString("shouldUseCustomClose");
            o.d(f7011a, "MRAID useCustomClose ".concat(String.valueOf(optString)));
            if (!TextUtils.isEmpty(optString) && this.f7012b != null) {
                this.f7012b.useCustomClose(optString.toLowerCase().equals(ep.Code));
            }
        } catch (Throwable th) {
            o.b(f7011a, "MRAID useCustomClose", th);
        }
    }
}
