package com.anythink.expressad.atsignalcommon.bridge;

import a3.l;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.common.b.n;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.a;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.huawei.openalliance.ad.ppskit.db.bean.AppDownloadRecord;
import com.vungle.warren.model.ReportDBAdapter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class CommonBannerJSBridgeImp implements IBannerJSBridge {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6983a = "CommonBannerJSBridgeImp";

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void cai(Object obj, String str) {
        int i10;
        o.a(f6983a, "cai:".concat(String.valueOf(str)));
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
                        o.a(f6983a, e10.getMessage());
                    }
                } catch (JSONException e11) {
                    CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + e11.getLocalizedMessage());
                    o.b(f6983a, "cai", e11);
                }
            } catch (Throwable th) {
                CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + th.getLocalizedMessage());
                o.b(f6983a, "cai", th);
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void click(Object obj, String str) {
        l.C(str, "click: ", f6983a);
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void getFileInfo(Object obj, String str) {
        l.C(str, "getFileInfo:", f6983a);
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void getNetstat(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        o.d(f6983a, "getNetstat:".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        Context g6 = n.a().g();
        if (!TextUtils.isEmpty(str)) {
            if (g6 == null) {
                try {
                    if ((obj instanceof a) && (windVaneWebView = ((a) obj).f7045a) != null) {
                        g6 = windVaneWebView.getContext();
                    }
                } catch (Exception e10) {
                    o.d(f6983a, e10.getMessage());
                }
            }
            if (g6 == null) {
                j.a().a(obj, CommonJSBridgeImpUtils.codeToJsonString(1));
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NativeAdvancedJsUtils.f6923m, k.a());
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    jSONObject2 = Base64.encodeToString(jSONObject2.getBytes(), 2);
                }
                j.a().a(obj, jSONObject2);
            } catch (Throwable th) {
                o.d(f6983a, th.getMessage());
                j.a().a(obj, CommonJSBridgeImpUtils.codeToJsonString(1));
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void gial(Object obj, String str) {
        l.C(str, "gial:", f6983a);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.f6985b);
            jSONObject.put("data", new JSONObject());
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            CommonJSBridgeImpUtils.callbackExcep(obj, e10.getMessage());
            o.a(f6983a, e10.getMessage());
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, th.getMessage());
            o.a(f6983a, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void handlerH5Exception(Object obj, String str) {
        l.C(str, "handlerH5Exception: ", f6983a);
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void increaseOfferFrequence(Object obj, String str) {
        o.a(f6983a, "increaseOfferFrequence:".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                CommonJSBridgeImpUtils.increaseOfferFrequence(obj, new JSONObject(str));
            } catch (Throwable th) {
                o.b(f6983a, "increaseOfferFrequence", th);
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void init(Object obj, String str) {
        l.C(str, "init: ", f6983a);
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void install(Object obj, String str) {
        l.C(str, "install: ", f6983a);
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void onJSBridgeConnect(Object obj, String str) {
        try {
            if (obj instanceof a) {
                j.a();
                j.b(((a) obj).f7045a);
            }
        } catch (Throwable th) {
            o.b(f6983a, "onJSBridgeConnect", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        o.d(f6983a, "openURL:".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        Context g6 = n.a().g();
        if (!TextUtils.isEmpty(str)) {
            if (g6 == null) {
                try {
                    if ((obj instanceof a) && (windVaneWebView = ((a) obj).f7045a) != null) {
                        g6 = windVaneWebView.getContext();
                    }
                } catch (Exception e10) {
                    o.d(f6983a, e10.getMessage());
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
                o.d(f6983a, e11.getMessage());
            } catch (Throwable th) {
                o.d(f6983a, th.getMessage());
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void readyStatus(Object obj, String str) {
        l.C(str, "readyStatus: ", f6983a);
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void reportUrls(Object obj, String str) {
        boolean z10;
        o.a(f6983a, "reportUrls:".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    int optInt = jSONObject.optInt("type");
                    String optString = jSONObject.optString("url");
                    int optInt2 = jSONObject.optInt(ReportDBAdapter.ReportColumns.TABLE_NAME);
                    boolean z11 = true;
                    if (optInt2 == 0) {
                        Context g6 = n.a().g();
                        if (optInt == 0) {
                            z11 = false;
                        }
                        com.anythink.expressad.a.a.a(g6, (c) null, "", optString, z11);
                    } else {
                        Context g10 = n.a().g();
                        if (optInt != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        com.anythink.expressad.a.a.a(g10, null, "", optString, false, z10, optInt2);
                    }
                }
                j.a().a(obj, CommonJSBridgeImpUtils.codeToJsonString(0));
            } catch (Throwable th) {
                o.b(f6983a, "reportUrls", th);
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void resetCountdown(Object obj, String str) {
        l.C(str, "resetCountdown: ", f6983a);
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void sendImpressions(Object obj, String str) {
        l.C(str, "sendImpressions: ", f6983a);
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void toggleCloseBtn(Object obj, String str) {
        l.C(str, "toggleCloseBtn: ", f6983a);
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void triggerCloseBtn(Object obj, String str) {
        l.C(str, "triggerCloseBtn: ", f6983a);
    }
}
