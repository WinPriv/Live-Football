package com.anythink.expressad.video.signal.communication;

import a3.l;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.common.b.n;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.a;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.video.signal.factory.IJSFactory;
import com.huawei.openalliance.ad.constant.av;
import com.huawei.openalliance.ad.ppskit.db.bean.AppDownloadRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class BaseRewardJs extends AbsFeedBackForH5 implements IRewardBridge {

    /* renamed from: h, reason: collision with root package name */
    protected static final String f11950h = "JS-Reward-Brigde";

    /* renamed from: i, reason: collision with root package name */
    protected IRewardBridge f11951i;

    private static String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", -1);
            String jSONObject2 = jSONObject.toString();
            if (TextUtils.isEmpty(jSONObject2)) {
                return "";
            }
            return Base64.encodeToString(jSONObject2.getBytes(), 2);
        } catch (Throwable unused) {
            o.d(f11950h, "code to string is error");
            return "";
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void cai(Object obj, String str) {
        int i10;
        o.a(f11950h, "cai:".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                try {
                    String optString = new JSONObject(str).optString(AppDownloadRecord.PACKAGE_NAME);
                    if (TextUtils.isEmpty(optString)) {
                        CommonJSBridgeImpUtils.callbackExcep(obj, "packageName is empty");
                    }
                    if (t.a(n.a().g(), optString)) {
                        i10 = 1;
                    } else {
                        i10 = 2;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", CommonJSBridgeImpUtils.f6985b);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", i10);
                        jSONObject.put("data", jSONObject2);
                        j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e10) {
                        CommonJSBridgeImpUtils.callbackExcep(obj, e10.getMessage());
                        o.a(f11950h, e10.getMessage());
                    }
                } catch (JSONException e11) {
                    CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + e11.getLocalizedMessage());
                    o.b(f11950h, "cai", e11);
                }
            } catch (Throwable th) {
                CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + th.getLocalizedMessage());
                o.b(f11950h, "cai", th);
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void getEndScreenInfo(Object obj, String str) {
        try {
            IRewardBridge iRewardBridge = this.f11951i;
            if (iRewardBridge != null) {
                iRewardBridge.getEndScreenInfo(obj, str);
                o.d(f11950h, "getEndScreenInfo factory is true");
                return;
            }
            o.d(f11950h, "getEndScreenInfo factory is null");
            if (obj != null) {
                WindVaneWebView windVaneWebView = ((a) obj).f7045a;
                if ((windVaneWebView instanceof WindVaneWebView) && windVaneWebView.getWebViewListener() != null) {
                    ((com.anythink.expressad.atsignalcommon.a.a) windVaneWebView.getWebViewListener()).a(obj);
                }
            }
        } catch (Throwable th) {
            o.b(f11950h, "getEndScreenInfo", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void gial(Object obj, String str) {
        l.C(str, "gial:", f11950h);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.f6985b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("packageNameList", ContentRecord.XRINFOLIST_NULL);
            jSONObject.put("data", jSONObject2);
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            CommonJSBridgeImpUtils.callbackExcep(obj, e10.getMessage());
            o.a(f11950h, e10.getMessage());
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, th.getMessage());
            o.a(f11950h, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void handlerPlayableException(Object obj, String str) {
        try {
            if (this.f11951i != null && !TextUtils.isEmpty(str)) {
                this.f11951i.handlerPlayableException(obj, str);
            }
        } catch (Throwable th) {
            o.b(f11950h, "handlerPlayableException", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.l
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        boolean z10;
        super.initialize(context, windVaneWebView);
        try {
            z10 = IJSFactory.class.isInstance(context);
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            z10 = false;
        }
        try {
            if (z10) {
                this.f11951i = (IRewardBridge) BaseRewardJsH5.class.newInstance();
                BaseRewardJsH5.class.getMethod("initialize", Context.class, WindVaneWebView.class).invoke(this.f11951i, context, windVaneWebView);
            } else {
                if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof IRewardBridge)) {
                    return;
                }
                this.f11951i = (IRewardBridge) windVaneWebView.getObject();
            }
        } catch (Exception e11) {
            if (com.anythink.expressad.a.f6552a) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void install(Object obj, String str) {
        try {
            IRewardBridge iRewardBridge = this.f11951i;
            if (iRewardBridge != null) {
                iRewardBridge.install(obj, str);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (obj != null) {
                a aVar = (a) obj;
                if (aVar.f7045a.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
                    com.anythink.expressad.video.signal.a.j jVar = (com.anythink.expressad.video.signal.a.j) aVar.f7045a.getObject();
                    Context context = aVar.f7045a.getContext();
                    if (context != null && context != context.getApplicationContext()) {
                        jVar.a(context);
                    }
                    jVar.click(1, str);
                    o.d(f11950h, "JSCommon install jump success");
                }
            }
            o.d(f11950h, "JSCommon install failed");
        } catch (Throwable th) {
            o.b(f11950h, av.ag, th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f11951i != null && !TextUtils.isEmpty(str)) {
                this.f11951i.notifyCloseBtn(obj, str);
            }
        } catch (Throwable th) {
            o.b(f11950h, "notifyCloseBtn", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void openURL(Object obj, String str) {
        o.d(f11950h, "openURL:".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                int optInt = jSONObject.optInt("type");
                if (optInt == 1) {
                    com.anythink.core.common.k.l.a(this.f7070e, optString);
                } else if (optInt == 2) {
                    com.anythink.core.common.k.l.b(this.f7070e, optString);
                }
            } catch (JSONException e10) {
                o.d(f11950h, e10.getMessage());
            } catch (Throwable th) {
                o.d(f11950h, th.getMessage());
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void setOrientation(Object obj, String str) {
        try {
            if (this.f11951i != null && !TextUtils.isEmpty(str)) {
                this.f11951i.setOrientation(obj, str);
            }
        } catch (Throwable th) {
            o.b(f11950h, "setOrientation", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f11951i != null && !TextUtils.isEmpty(str)) {
                this.f11951i.toggleCloseBtn(obj, str);
            }
        } catch (Throwable th) {
            o.b(f11950h, "toggleCloseBtn", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.f11951i != null && !TextUtils.isEmpty(str)) {
                this.f11951i.triggerCloseBtn(obj, str);
            }
        } catch (Throwable th) {
            o.b(f11950h, "triggerCloseBtn", th);
            j.a().a(obj, a());
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.l
    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        boolean z10;
        super.initialize(obj, windVaneWebView);
        try {
            z10 = IJSFactory.class.isInstance(obj);
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            z10 = false;
        }
        try {
            if (z10) {
                this.f11951i = (IRewardBridge) BaseRewardJsH5.class.newInstance();
                BaseRewardJsH5.class.getMethod("initialize", Object.class, WindVaneWebView.class).invoke(this.f11951i, obj, windVaneWebView);
            } else {
                if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof IRewardBridge)) {
                    return;
                }
                this.f11951i = (IRewardBridge) windVaneWebView.getObject();
            }
        } catch (Exception e11) {
            if (com.anythink.expressad.a.f6552a) {
                e11.printStackTrace();
            }
        }
    }
}
