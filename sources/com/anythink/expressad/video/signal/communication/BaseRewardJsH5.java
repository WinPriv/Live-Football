package com.anythink.expressad.video.signal.communication;

import a3.l;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.common.b.n;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
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
public class BaseRewardJsH5 implements IRewardBridge {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f11952a = "JS-Reward-Brigde";

    /* renamed from: b, reason: collision with root package name */
    protected IJSFactory f11953b;

    private static String a(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String jSONObject2 = jSONObject.toString();
            if (TextUtils.isEmpty(jSONObject2)) {
                return "";
            }
            return Base64.encodeToString(jSONObject2.getBytes(), 2);
        } catch (Throwable unused) {
            o.d(f11952a, "code to string is error");
            return "";
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void cai(Object obj, String str) {
        int i10;
        o.a(f11952a, "cai:".concat(String.valueOf(str)));
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
                        o.a(f11952a, e10.getMessage());
                    }
                } catch (Throwable th) {
                    CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + th.getLocalizedMessage());
                    o.b(f11952a, "cai", th);
                }
            } catch (JSONException e11) {
                CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + e11.getLocalizedMessage());
                o.b(f11952a, "cai", e11);
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void getEndScreenInfo(Object obj, String str) {
        String str2;
        try {
            IJSFactory iJSFactory = this.f11953b;
            if (iJSFactory != null) {
                String a10 = iJSFactory.getIJSRewardVideoV1().a();
                if (!TextUtils.isEmpty(a10)) {
                    str2 = Base64.encodeToString(a10.getBytes(), 2);
                    o.a(f11952a, "getEndScreenInfo success");
                } else {
                    str2 = "";
                    o.a(f11952a, "getEndScreenInfo failed");
                }
                j.a().a(obj, str2);
            }
        } catch (Throwable th) {
            o.b(f11952a, "getEndScreenInfo", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void gial(Object obj, String str) {
        l.C(str, "gial:", f11952a);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.f6985b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("packageNameList", ContentRecord.XRINFOLIST_NULL);
            jSONObject.put("data", jSONObject2);
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            CommonJSBridgeImpUtils.callbackExcep(obj, e10.getMessage());
            o.a(f11952a, e10.getMessage());
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, th.getMessage());
            o.a(f11952a, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void handlerPlayableException(Object obj, String str) {
        try {
            if (this.f11953b != null && !TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("msg");
                o.a(f11952a, "handlerPlayableException,msg:".concat(String.valueOf(str)));
                this.f11953b.getIJSRewardVideoV1().handlerPlayableException(optString);
            }
        } catch (Throwable th) {
            o.b(f11952a, "setOrientation", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        if (context instanceof IJSFactory) {
            this.f11953b = (IJSFactory) context;
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void install(Object obj, String str) {
        com.anythink.expressad.video.signal.a.j jVar;
        Context context;
        try {
            if (this.f11953b != null) {
                o.a(f11952a, "install:".concat(String.valueOf(str)));
                if (obj != null) {
                    a aVar = (a) obj;
                    if ((aVar.f7045a.getObject() instanceof com.anythink.expressad.video.signal.a.j) && (jVar = (com.anythink.expressad.video.signal.a.j) aVar.f7045a.getObject()) != null && (context = aVar.f7045a.getContext()) != null && context != context.getApplicationContext()) {
                        jVar.a(context);
                    }
                }
                if (this.f11953b.getJSContainerModule().endCardShowing()) {
                    this.f11953b.getJSCommon().click(3, str);
                } else {
                    this.f11953b.getJSCommon().click(1, str);
                }
            }
        } catch (Throwable th) {
            o.b(f11952a, av.ag, th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f11953b != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                o.a(f11952a, "notifyCloseBtn,state:".concat(String.valueOf(str)));
                this.f11953b.getIJSRewardVideoV1().notifyCloseBtn(optInt);
            }
        } catch (Throwable th) {
            o.b(f11952a, "notifyCloseBtn", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        o.d(f11952a, "openURL:".concat(String.valueOf(str)));
        Context g6 = n.a().g();
        if (!TextUtils.isEmpty(str)) {
            if (g6 == null) {
                try {
                    if ((obj instanceof a) && (windVaneWebView = ((a) obj).f7045a) != null) {
                        g6 = windVaneWebView.getContext();
                    }
                } catch (Exception e10) {
                    o.d(f11952a, e10.getMessage());
                }
            }
            if (g6 == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                int optInt = jSONObject.optInt("type");
                if (optInt == 1) {
                    com.anythink.core.common.k.l.a(g6, optString);
                } else if (optInt == 2) {
                    com.anythink.core.common.k.l.b(g6, optString);
                }
            } catch (JSONException e11) {
                o.d(f11952a, e11.getMessage());
            } catch (Throwable th) {
                o.d(f11952a, th.getMessage());
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void setOrientation(Object obj, String str) {
        try {
            if (this.f11953b != null && !TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("state");
                o.a(f11952a, "setOrientation,state:".concat(String.valueOf(str)));
                this.f11953b.getIJSRewardVideoV1().b(optString);
            }
        } catch (Throwable th) {
            o.b(f11952a, "setOrientation", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f11953b != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                o.a(f11952a, "toggleCloseBtn,state:".concat(String.valueOf(str)));
                this.f11953b.getIJSRewardVideoV1().toggleCloseBtn(optInt);
            }
        } catch (Throwable th) {
            o.b(f11952a, "toggleCloseBtn", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.f11953b != null && !TextUtils.isEmpty(str)) {
                j.a().a(obj, a(0));
                this.f11953b.getIJSRewardVideoV1().a(new JSONObject(str).optString("state"));
                o.a(f11952a, "triggerCloseBtn,state:".concat(String.valueOf(str)));
            }
        } catch (Throwable th) {
            o.b(f11952a, "triggerCloseBtn", th);
            j.a().a(obj, a(-1));
        }
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        if (obj instanceof IJSFactory) {
            this.f11953b = (IJSFactory) obj;
        }
    }
}
