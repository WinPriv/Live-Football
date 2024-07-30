package com.anythink.expressad.advanced.js;

import a3.l;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.b.n;
import com.anythink.expressad.advanced.a.b;
import com.anythink.expressad.advanced.d.a;
import com.anythink.expressad.atsignalcommon.base.d;
import com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.o;
import com.huawei.openalliance.ad.constant.av;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NativeAdvancedJSBridgeImpl extends CommonBannerJSBridgeImp {

    /* renamed from: c, reason: collision with root package name */
    private WeakReference<Context> f6904c;

    /* renamed from: d, reason: collision with root package name */
    private List<c> f6905d;

    /* renamed from: e, reason: collision with root package name */
    private String f6906e;
    private String f;

    /* renamed from: g, reason: collision with root package name */
    private int f6907g;

    /* renamed from: h, reason: collision with root package name */
    private int f6908h;

    /* renamed from: j, reason: collision with root package name */
    private a f6910j;

    /* renamed from: k, reason: collision with root package name */
    private NativeAdvancedExpandDialog f6911k;

    /* renamed from: b, reason: collision with root package name */
    private String f6903b = "NativeAdvancedJSBridgeImpl";

    /* renamed from: i, reason: collision with root package name */
    private int f6909i = 5;

    public NativeAdvancedJSBridgeImpl(Context context, String str, String str2) {
        this.f = str;
        this.f6906e = str2;
        this.f6904c = new WeakReference<>(context);
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void click(Object obj, String str) {
        c cVar;
        try {
            List<c> list = this.f6905d;
            if (list != null && list.size() > 0) {
                cVar = this.f6905d.get(0);
            } else {
                cVar = null;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject a10 = c.a(cVar);
                    JSONObject jSONObject = new JSONObject(str).getJSONObject("pt");
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        a10.put(next, jSONObject.getString(next));
                    }
                    c b10 = c.b(a10);
                    String optString = a10.optString("unitId");
                    if (!TextUtils.isEmpty(optString)) {
                        b10.l(optString);
                    }
                    cVar = b10;
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                a aVar = this.f6910j;
                if (aVar != null) {
                    aVar.a(cVar);
                }
            }
        } catch (Throwable th) {
            o.b(this.f6903b, "click", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void close() {
        o.d(this.f6903b, "close");
        try {
            a aVar = this.f6910j;
            if (aVar != null) {
                aVar.d();
            }
        } catch (Throwable th) {
            o.b(this.f6903b, "close", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void expand(String str, boolean z10) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z10);
            WeakReference<Context> weakReference = this.f6904c;
            if (weakReference != null && weakReference.get() != null) {
                NativeAdvancedExpandDialog nativeAdvancedExpandDialog = this.f6911k;
                if (nativeAdvancedExpandDialog != null && nativeAdvancedExpandDialog.isShowing()) {
                    return;
                }
                NativeAdvancedExpandDialog nativeAdvancedExpandDialog2 = new NativeAdvancedExpandDialog(this.f6904c.get(), bundle, this.f6910j);
                this.f6911k = nativeAdvancedExpandDialog2;
                nativeAdvancedExpandDialog2.setCampaignList(this.f6906e, this.f6905d);
                this.f6911k.show();
                a aVar = this.f6910j;
                if (aVar != null) {
                    aVar.a(true);
                }
            }
        } catch (Throwable th) {
            o.b(this.f6903b, "expand", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void getFileInfo(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is empty");
            return;
        }
        try {
            NativeAdvancedJsUtils.getFileInfo(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.a(this.f6903b, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public c getMraidCampaign() {
        List<c> list = this.f6905d;
        if (list != null && list.size() > 0) {
            return this.f6905d.get(0);
        }
        return null;
    }

    public List<c> getmCampaignList() {
        return this.f6905d;
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void init(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            b bVar = new b(n.a().g());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f6907g);
            jSONObject2.put("customURLScheme", 1);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", bVar.a());
            jSONObject.put("campaignList", c.b(this.f6905d));
            com.anythink.expressad.d.b.a();
            com.anythink.expressad.d.c d10 = com.anythink.expressad.d.b.d(com.anythink.expressad.foundation.b.a.b().e(), this.f6906e);
            if (d10 == null) {
                d10 = com.anythink.expressad.d.c.y();
            }
            if (!TextUtils.isEmpty(this.f)) {
                d10.e(this.f);
            }
            d10.a(this.f6906e);
            d10.b(this.f6909i);
            d10.a(this.f6908h);
            jSONObject.put("unitSetting", d10.s());
            jSONObject.put("appSetting", new JSONObject());
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO, d.f6970a);
            o.d(this.f6903b, "init" + jSONObject.toString());
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            o.b(this.f6903b, "init", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void install(Object obj, String str) {
        c cVar;
        o.d(this.f6903b, av.ag);
        try {
            List<c> list = this.f6905d;
            if (list != null && list.size() > 0) {
                cVar = this.f6905d.get(0);
            } else {
                cVar = null;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject a10 = c.a(cVar);
                    JSONObject jSONObject = new JSONObject(str).getJSONObject("pt");
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        a10.put(next, jSONObject.getString(next));
                    }
                    c b10 = c.b(a10);
                    String optString = a10.optString("unitId");
                    if (!TextUtils.isEmpty(optString)) {
                        b10.l(optString);
                    }
                    cVar = b10;
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                a aVar = this.f6910j;
                if (aVar != null) {
                    aVar.a(cVar);
                }
            }
        } catch (Throwable th) {
            o.b(this.f6903b, av.ag, th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void onJSBridgeConnect(Object obj, String str) {
        try {
            if (obj instanceof com.anythink.expressad.atsignalcommon.windvane.a) {
                j.a();
                j.b(((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a);
            }
        } catch (Throwable th) {
            o.b(this.f6903b, "onJSBridgeConnect", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void open(String str) {
        a aVar = this.f6910j;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void readyStatus(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        try {
            if ((obj instanceof com.anythink.expressad.atsignalcommon.windvane.a) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                try {
                    windVaneWebView.getWebViewListener().readyState(windVaneWebView, new JSONObject(str).getInt("isReady"));
                } catch (Exception unused) {
                    windVaneWebView.getWebViewListener().readyState(windVaneWebView, 2);
                }
            }
        } catch (Throwable th) {
            o.a(this.f6903b, th.getMessage());
        }
    }

    public void release() {
        if (this.f6910j != null) {
            this.f6910j = null;
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void resetCountdown(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                int i10 = new JSONObject(str).getInt("countdown");
                a aVar = this.f6910j;
                if (aVar != null) {
                    aVar.b(i10);
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void sendImpressions(Object obj, String str) {
        l.C(str, "sendImpressions:", this.f6903b);
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    String string = jSONArray.getString(i10);
                    for (c cVar : this.f6905d) {
                        if (cVar.aZ().equals(string)) {
                            f.a(this.f6906e, cVar, f.f9818g);
                            arrayList.add(string);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            o.b(this.f6903b, "sendImpressions", th);
        }
    }

    public void setAllowSkip(int i10) {
        this.f6908h = i10;
    }

    public void setCampaignList(List<c> list) {
        this.f6905d = list;
    }

    public void setCountdownS(int i10) {
        this.f6909i = i10;
    }

    public void setDevCloseBtnStatus(int i10) {
        this.f6907g = i10;
    }

    public void setNativeAdvancedBridgeListener(a aVar) {
        if (aVar != null) {
            this.f6910j = aVar;
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                a aVar = this.f6910j;
                if (aVar != null) {
                    aVar.a(optInt);
                }
            }
        } catch (Throwable th) {
            o.b(this.f6903b, "toggleCloseBtn", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void triggerCloseBtn(Object obj, String str) {
        if (this.f6910j != null) {
            NativeAdvancedJsUtils.callbackSuccess(obj);
            this.f6910j.a();
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void unload() {
        close();
    }

    public void updateContext(Context context) {
        this.f6904c = new WeakReference<>(context);
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void useCustomClose(boolean z10) {
        int i10;
        try {
            if (this.f6908h == -1) {
                if (z10) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                a aVar = this.f6910j;
                if (aVar != null) {
                    aVar.a(i10);
                }
            }
        } catch (Throwable th) {
            o.b(this.f6903b, "useCustomClose", th);
        }
    }
}
