package com.anythink.expressad.splash.js;

import a3.l;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.b.n;
import com.anythink.expressad.atsignalcommon.base.d;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.d.b;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.splash.d.a;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.openalliance.ad.constant.av;
import com.huawei.openalliance.ad.ppskit.db.bean.AppDownloadRecord;
import com.vungle.warren.model.ReportDBAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SplashJSBridgeImpl implements ISplashBridge {

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<Context> f11072b;

    /* renamed from: c, reason: collision with root package name */
    private List<c> f11073c;

    /* renamed from: d, reason: collision with root package name */
    private String f11074d;

    /* renamed from: e, reason: collision with root package name */
    private String f11075e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f11076g;

    /* renamed from: i, reason: collision with root package name */
    private int f11078i;

    /* renamed from: j, reason: collision with root package name */
    private a f11079j;

    /* renamed from: k, reason: collision with root package name */
    private SplashExpandDialog f11080k;

    /* renamed from: a, reason: collision with root package name */
    private String f11071a = "SplashJSBridgeImpl";

    /* renamed from: h, reason: collision with root package name */
    private int f11077h = 5;

    public SplashJSBridgeImpl(Context context, String str, String str2) {
        this.f11075e = str;
        this.f11074d = str2;
        this.f11072b = new WeakReference<>(context);
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void cai(Object obj, String str) {
        int i10;
        o.a(this.f11071a, "cai:".concat(String.valueOf(str)));
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
                        o.a(this.f11071a, e10.getMessage());
                    }
                } catch (JSONException e11) {
                    CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + e11.getLocalizedMessage());
                    o.b(this.f11071a, "cai", e11);
                }
            } catch (Throwable th) {
                CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + th.getLocalizedMessage());
                o.b(this.f11071a, "cai", th);
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void close() {
        o.d(this.f11071a, "close");
        try {
            a aVar = this.f11079j;
            if (aVar != null) {
                aVar.c();
            }
        } catch (Throwable th) {
            o.b(this.f11071a, "close", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void expand(String str, boolean z10) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z10);
            WeakReference<Context> weakReference = this.f11072b;
            if (weakReference != null && weakReference.get() != null) {
                SplashExpandDialog splashExpandDialog = this.f11080k;
                if (splashExpandDialog != null && splashExpandDialog.isShowing()) {
                    return;
                }
                SplashExpandDialog splashExpandDialog2 = new SplashExpandDialog(this.f11072b.get(), bundle, this.f11079j);
                this.f11080k = splashExpandDialog2;
                splashExpandDialog2.setCampaignList(this.f11074d, this.f11073c);
                this.f11080k.show();
                a aVar = this.f11079j;
                if (aVar != null) {
                    aVar.a(true);
                }
            }
        } catch (Throwable th) {
            o.b(this.f11071a, "expand", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public c getMraidCampaign() {
        List<c> list = this.f11073c;
        if (list != null && list.size() > 0) {
            return this.f11073c.get(0);
        }
        return null;
    }

    public a getSplashBridgeListener() {
        return this.f11079j;
    }

    public List<c> getmCampaignList() {
        return this.f11073c;
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void gial(Object obj, String str) {
        l.C(str, "gial:", this.f11071a);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.f6985b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("packageNameList", new JSONArray());
            jSONObject.put("data", jSONObject2);
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            CommonJSBridgeImpUtils.callbackExcep(obj, e10.getMessage());
            o.a(this.f11071a, e10.getMessage());
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, th.getMessage());
            o.a(this.f11071a, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void init(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            com.anythink.expressad.splash.a.a aVar = new com.anythink.expressad.splash.a.a(n.a().g());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", aVar.a());
            jSONObject.put("campaignList", c.b(this.f11073c));
            b.a();
            com.anythink.expressad.d.c c10 = b.c(com.anythink.expressad.foundation.b.a.b().e(), this.f11074d);
            if (c10 == null) {
                c10 = com.anythink.expressad.d.c.c(this.f11074d);
            }
            if (!TextUtils.isEmpty(this.f11075e)) {
                c10.e(this.f11075e);
            }
            c10.a(this.f11074d);
            c10.b(this.f11077h);
            c10.a(this.f11076g);
            jSONObject.put("unitSetting", c10.s());
            b.a();
            String a10 = b.a(com.anythink.expressad.foundation.b.a.b().e());
            if (!TextUtils.isEmpty(a10)) {
                jSONObject.put("appSetting", new JSONObject(a10));
            }
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO, d.f6970a);
            o.d(this.f11071a, "init" + jSONObject.toString());
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            o.b(this.f11071a, "init", th);
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void install(Object obj, String str) {
        c cVar;
        o.d(this.f11071a, av.ag);
        try {
            List<c> list = this.f11073c;
            if (list == null) {
                return;
            }
            if (list != null && list.size() > 0) {
                cVar = this.f11073c.get(0);
            } else {
                cVar = null;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject a10 = c.a(cVar);
                    JSONObject jSONObject = new JSONObject(str);
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
                a aVar = this.f11079j;
                if (aVar != null) {
                    aVar.a(cVar);
                }
            }
        } catch (Throwable th) {
            o.b(this.f11071a, "click", th);
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void onJSBridgeConnect(Object obj, String str) {
        try {
            if (obj instanceof com.anythink.expressad.atsignalcommon.windvane.a) {
                j.a();
                j.b(((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a);
            }
        } catch (Throwable th) {
            o.b(this.f11071a, "onJSBridgeConnect", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void open(String str) {
        a aVar = this.f11079j;
        if (aVar != null) {
            aVar.b(str);
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        o.d(this.f11071a, "openURL:".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        Context g6 = n.a().g();
        if (!TextUtils.isEmpty(str)) {
            if (g6 == null) {
                try {
                    if ((obj instanceof com.anythink.expressad.atsignalcommon.windvane.a) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                        g6 = windVaneWebView.getContext();
                    }
                } catch (Exception e10) {
                    o.d(this.f11071a, e10.getMessage());
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
                o.d(this.f11071a, e11.getMessage());
            } catch (Throwable th) {
                o.d(this.f11071a, th.getMessage());
            }
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void pauseCountDown(Object obj, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 0);
            jSONObject.put(CrashHianalyticsData.MESSAGE, "Call pause count down success.");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("countdown", this.f11078i);
            jSONObject.put("data", jSONObject2);
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            o.d(this.f11071a, e10.getMessage());
        }
        a aVar = this.f11079j;
        if (aVar != null) {
            aVar.a(1, -1);
        }
    }

    public void release() {
        if (this.f11079j != null) {
            this.f11079j = null;
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void reportUrls(Object obj, String str) {
        boolean z10;
        o.a(this.f11071a, "reportUrls:".concat(String.valueOf(str)));
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
                j.a().a(obj, SplashJsUtils.codeToJsonString(0));
            } catch (Throwable th) {
                o.b(this.f11071a, "reportUrls", th);
            }
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void resetCountdown(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                int i10 = new JSONObject(str).getInt("countdown");
                a aVar = this.f11079j;
                if (aVar != null) {
                    aVar.b(i10);
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    @Override // com.anythink.expressad.splash.js.ISplashBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void resumeCountDown(java.lang.Object r3, java.lang.String r4) {
        /*
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L2c
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L22
            r0.<init>(r4)     // Catch: java.lang.Exception -> L22
            java.lang.String r4 = "countdown"
            int r4 = r0.optInt(r4)     // Catch: java.lang.Exception -> L22
            com.anythink.expressad.atsignalcommon.windvane.j r0 = com.anythink.expressad.atsignalcommon.windvane.j.a()     // Catch: java.lang.Exception -> L1f
            java.lang.String r1 = com.anythink.expressad.splash.js.SplashJsUtils.codeToJsonString(r1)     // Catch: java.lang.Exception -> L1f
            r0.a(r3, r1)     // Catch: java.lang.Exception -> L1f
            r1 = r4
            goto L2c
        L1f:
            r3 = move-exception
            r1 = r4
            goto L23
        L22:
            r3 = move-exception
        L23:
            java.lang.String r4 = r2.f11071a
            java.lang.String r3 = r3.getMessage()
            com.anythink.expressad.foundation.h.o.d(r4, r3)
        L2c:
            com.anythink.expressad.splash.d.a r3 = r2.f11079j
            if (r3 == 0) goto L34
            r4 = 2
            r3.a(r4, r1)
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.splash.js.SplashJSBridgeImpl.resumeCountDown(java.lang.Object, java.lang.String):void");
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void sendImpressions(Object obj, String str) {
        l.C(str, "sendImpressions:", this.f11071a);
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    String string = jSONArray.getString(i10);
                    for (c cVar : this.f11073c) {
                        if (cVar.aZ().equals(string)) {
                            f.a(this.f11074d, cVar, f.f);
                            arrayList.add(string);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            o.b(this.f11071a, "sendImpressions", th);
        }
    }

    public void setAllowSkip(int i10) {
        this.f11076g = i10;
    }

    public void setCampaignList(List<c> list) {
        this.f11073c = list;
    }

    public void setCountdownS(int i10) {
        this.f11077h = i10;
    }

    public void setDevCloseBtnStatus(int i10) {
        this.f = i10;
    }

    public void setSplashBridgeListener(a aVar) {
        if (aVar != null) {
            this.f11079j = aVar;
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                a aVar = this.f11079j;
                if (aVar != null) {
                    aVar.a(optInt);
                }
            }
        } catch (Throwable th) {
            o.b(this.f11071a, "toggleCloseBtn", th);
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void triggerCloseBtn(Object obj, String str) {
        a aVar = this.f11079j;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void unload() {
        close();
    }

    public void updateContext(Context context) {
        this.f11072b = new WeakReference<>(context);
    }

    public void updateCountDown(int i10) {
        this.f11078i = i10;
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void useCustomClose(boolean z10) {
        int i10;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        try {
            a aVar = this.f11079j;
            if (aVar != null) {
                aVar.a(i10);
            }
        } catch (Throwable th) {
            o.b(this.f11071a, "useCustomClose", th);
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void handlerH5Exception(Object obj, String str) {
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void readyStatus(Object obj, String str) {
    }
}
