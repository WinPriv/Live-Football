package com.anythink.expressad.video.signal.communication;

import a3.k;
import a3.l;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.b.n;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.d.b;
import com.anythink.expressad.foundation.d.f;
import com.anythink.expressad.foundation.g.a;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.video.bt.a.c;
import com.anythink.expressad.video.signal.factory.IJSFactory;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.openalliance.ad.ppskit.db.bean.AppDownloadRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class BaseVideoBridge extends AbsFeedBackForH5 implements IVideoBridge {

    /* renamed from: h, reason: collision with root package name */
    protected static final String f11954h = "JS-Video-Brigde";

    /* renamed from: j, reason: collision with root package name */
    private static final int f11955j = 1;

    /* renamed from: k, reason: collision with root package name */
    private static final int f11956k = 2;

    /* renamed from: l, reason: collision with root package name */
    private static final String f11957l = "showTransparent";

    /* renamed from: m, reason: collision with root package name */
    private static final String f11958m = "mute";

    /* renamed from: n, reason: collision with root package name */
    private static final String f11959n = "closeType";
    private static final String o = "orientationType";

    /* renamed from: p, reason: collision with root package name */
    private static final String f11960p = "type";

    /* renamed from: q, reason: collision with root package name */
    private static final String f11961q = "h5cbp";

    /* renamed from: r, reason: collision with root package name */
    private static final String f11962r = "webfront";

    /* renamed from: s, reason: collision with root package name */
    private static final String f11963s = "showAlertRole";

    /* renamed from: i, reason: collision with root package name */
    protected IJSFactory f11964i;

    private static String a(int i10) {
        switch (i10) {
            case 1:
                return ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO;
            case 2:
                return "unit_id";
            case 3:
                return "appSetting";
            case 4:
                return "unitSetting";
            case 5:
                return "device";
            case 6:
                return "sdkSetting";
            default:
                return "";
        }
    }

    private static String b(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String jSONObject2 = jSONObject.toString();
            if (TextUtils.isEmpty(jSONObject2)) {
                return "";
            }
            return Base64.encodeToString(jSONObject2.getBytes(), 2);
        } catch (Throwable unused) {
            o.d(f11954h, "code to string is error");
            return "";
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void appendSubView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().i(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "appendSubView error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void appendViewTo(Object obj, String str) {
        a(obj, str);
        try {
            c.a().j(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "appendViewTo error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void bringViewToFront(Object obj, String str) {
        a(obj, str);
        try {
            c.a().m(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "bringViewToFront error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void broadcast(Object obj, String str) {
        a(obj, str);
        try {
            c.a().M(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "broadcast error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void cai(Object obj, String str) {
        int i10;
        o.a(f11954h, "cai:".concat(String.valueOf(str)));
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
                        o.a(f11954h, e10.getMessage());
                    }
                } catch (Throwable th) {
                    CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + th.getLocalizedMessage());
                    o.b(f11954h, "cai", th);
                }
            } catch (JSONException e11) {
                CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + e11.getLocalizedMessage());
                o.b(f11954h, "cai", e11);
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void clearAllCache(Object obj, String str) {
        try {
            n.a().g().getSharedPreferences(a.f9788p, 0).edit().clear().apply();
            if (obj != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 0);
                jSONObject.put(CrashHianalyticsData.MESSAGE, "Success");
                j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th) {
            k.w(th, "getAllCache error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void click(Object obj, String str) {
        String str2;
        int i10;
        com.anythink.expressad.video.signal.a.j jVar;
        o.b(f11954h, "click");
        try {
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    i10 = jSONObject.optInt("type");
                    str2 = jSONObject.optString("pt");
                } catch (JSONException e10) {
                    str2 = "";
                    e10.printStackTrace();
                    i10 = 1;
                }
                IJSFactory iJSFactory = this.f11964i;
                if (iJSFactory != null) {
                    iJSFactory.getJSCommon().click(i10, str2);
                    return;
                }
                if (obj != null) {
                    com.anythink.expressad.atsignalcommon.windvane.a aVar = (com.anythink.expressad.atsignalcommon.windvane.a) obj;
                    if ((aVar.f7045a.getObject() instanceof com.anythink.expressad.video.signal.a.j) && (jVar = (com.anythink.expressad.video.signal.a.j) aVar.f7045a.getObject()) != null) {
                        jVar.click(i10, str2);
                    }
                }
            }
        } catch (Throwable th) {
            o.b(f11954h, "click error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void closeAd(Object obj, String str) {
        a(obj, str);
        try {
            c.a().L(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "closeAd error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void closeVideoOperte(Object obj, String str) {
        try {
            if (this.f11964i != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("close");
                int optInt2 = jSONObject.optInt("view_visible");
                o.b(f11954h, "closeVideoOperte,close:" + optInt + ",viewVisible:" + optInt2);
                this.f11964i.getJSVideoModule().closeVideoOperate(optInt, optInt2);
                j.a().a(obj, b(0));
            }
        } catch (Throwable th) {
            o.b(f11954h, "closeOperte error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void closeWeb(Object obj, String str) {
        l.B(str, "type", f11954h);
        try {
            if (!TextUtils.isEmpty(str) && this.f11964i != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("status");
                this.f11964i.getJSContainerModule().hideAlertWebview();
                this.f11964i.getJSVideoModule().hideAlertView(optInt);
            }
        } catch (Throwable th) {
            o.b(f11954h, "closeWeb", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void createNativeEC(Object obj, String str) {
        a(obj, str);
        try {
            c.a().Q(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "createNativeEC error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void createPlayerView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().c(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "createPlayerView error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void createSubPlayTemplateView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().d(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "createSubPlayTemplateView error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void createView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().a(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "createWebview error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void createWebview(Object obj, String str) {
        a(obj, str);
        try {
            c.a().b(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "createWebview error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void destroyComponent(Object obj, String str) {
        a(obj, str);
        try {
            c.a().e(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "destroyComponent error ", f11954h);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0077 A[Catch: all -> 0x0097, TRY_ENTER, TryCatch #2 {all -> 0x0097, blocks: (B:12:0x0064, B:15:0x0077, B:17:0x0082, B:22:0x007b), top: B:11:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082 A[Catch: all -> 0x0097, TRY_LEAVE, TryCatch #2 {all -> 0x0097, blocks: (B:12:0x0064, B:15:0x0077, B:17:0x0082, B:22:0x007b), top: B:11:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b A[Catch: all -> 0x0097, TryCatch #2 {all -> 0x0097, blocks: (B:12:0x0064, B:15:0x0077, B:17:0x0082, B:22:0x007b), top: B:11:0x0064 }] */
    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getAllCache(java.lang.Object r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r8 = "getAllCache error "
            java.lang.String r0 = "JS-Video-Brigde"
            r1 = 0
            r2 = 0
            com.anythink.core.common.b.n r3 = com.anythink.core.common.b.n.a()     // Catch: java.lang.Throwable -> L44
            android.content.Context r3 = r3.g()     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = "anythink_h5_cachesp"
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r1)     // Catch: java.lang.Throwable -> L44
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L44
            r4.<init>()     // Catch: java.lang.Throwable -> L44
            java.util.Map r2 = r3.getAll()     // Catch: java.lang.Throwable -> L42
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L42
        L25:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L42
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L42
            java.lang.Object r5 = r3.getKey()     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L42
            r4.put(r5, r3)     // Catch: java.lang.Throwable -> L42
            goto L25
        L3f:
            java.lang.String r2 = "getAllCache Success"
            goto L64
        L42:
            r2 = move-exception
            goto L47
        L44:
            r3 = move-exception
            r4 = r2
            r2 = r3
        L47:
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r3 = r8.concat(r3)
            com.anythink.expressad.foundation.h.o.d(r0, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "getAllCache Error, reason is : "
            r3.<init>(r5)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L64:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L97
            r3.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = "code"
            r3.put(r5, r1)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "message"
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "data"
            if (r4 == 0) goto L7b
            r3.put(r1, r4)     // Catch: java.lang.Throwable -> L97
            goto L80
        L7b:
            java.lang.String r2 = "{}"
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L97
        L80:
            if (r7 == 0) goto L96
            com.anythink.expressad.atsignalcommon.windvane.j r1 = com.anythink.expressad.atsignalcommon.windvane.j.a()     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L97
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L97
            r3 = 2
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)     // Catch: java.lang.Throwable -> L97
            r1.a(r7, r2)     // Catch: java.lang.Throwable -> L97
        L96:
            return
        L97:
            r7 = move-exception
            a3.k.w(r7, r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.signal.communication.BaseVideoBridge.getAllCache(java.lang.Object, java.lang.String):void");
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getAppSetting(Object obj, String str) {
        JSONObject jSONObject;
        try {
            String optString = new JSONObject(str).optString("appid", "");
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(optString)) {
                b.a();
                String a10 = b.a(optString);
                if (TextUtils.isEmpty(a10)) {
                    b.a();
                    jSONObject = new JSONObject(b.c().R());
                } else {
                    jSONObject = new JSONObject(a10);
                    jSONObject.put("isDefault", 0);
                }
                if (obj != null) {
                    jSONObject2.put("code", 0);
                    jSONObject2.put(CrashHianalyticsData.MESSAGE, "Success");
                    jSONObject2.put("data", jSONObject);
                } else {
                    jSONObject2.put("code", 1);
                    jSONObject2.put(CrashHianalyticsData.MESSAGE, "Get App Setting error, plz try again later.");
                }
            } else {
                jSONObject2.put("code", 1);
                jSONObject2.put(CrashHianalyticsData.MESSAGE, "Get App Setting error, because must give a appId.");
            }
            j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            o.d(f11954h, "getAppSetting error : " + th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getComponentOptions(Object obj, String str) {
        a(obj, str);
        try {
            c.a();
            c.f(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "getComponentOptions error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getCurrentProgress(Object obj, String str) {
        try {
            IJSFactory iJSFactory = this.f11964i;
            if (iJSFactory != null) {
                String currentProgress = iJSFactory.getJSVideoModule().getCurrentProgress();
                o.b(f11954h, "getCurrentProgress:".concat(String.valueOf(currentProgress)));
                if (!TextUtils.isEmpty(currentProgress)) {
                    currentProgress = Base64.encodeToString(currentProgress.getBytes(), 2);
                }
                j.a().a(obj, currentProgress);
            }
        } catch (Throwable th) {
            o.b(f11954h, "getCurrentProgress error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getCutout(Object obj, String str) {
        try {
            String o6 = this.f11964i.getJSCommon().o();
            o.d(f11954h, o6);
            if (obj != null && !TextUtils.isEmpty(o6)) {
                j.a().a(obj, Base64.encodeToString(o6.getBytes(), 2));
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put(CrashHianalyticsData.MESSAGE, "No notch data, plz try again later.");
            j.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            o.d(f11954h, "getCutout error : " + th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getFileInfo(Object obj, String str) {
        a(obj, str);
        try {
            c.a();
            c.P(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.b(f11954h, "getFileInfo error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getRewardSetting(Object obj, String str) {
        try {
            JSONObject k10 = com.anythink.expressad.videocommon.e.c.a().b().k();
            JSONObject jSONObject = new JSONObject();
            if (obj != null) {
                jSONObject.put("code", 0);
                jSONObject.put(CrashHianalyticsData.MESSAGE, "Success");
                jSONObject.put("data", k10);
            } else {
                jSONObject.put("code", 1);
                jSONObject.put(CrashHianalyticsData.MESSAGE, "Get Reward Setting error, plz try again later.");
            }
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            o.d(f11954h, "getRewardSetting error : " + th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getRewardUnitSetting(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("appid", "");
            String optString2 = jSONObject.optString("unitid", "");
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                JSONObject R = com.anythink.expressad.videocommon.e.c.a().a(optString, optString2).R();
                if (obj != null) {
                    jSONObject2.put("code", 0);
                    jSONObject2.put(CrashHianalyticsData.MESSAGE, "Success");
                    jSONObject2.put("data", R);
                } else {
                    jSONObject2.put("code", 1);
                    jSONObject2.put(CrashHianalyticsData.MESSAGE, "Get Reward Unit Setting error, plz try again later.");
                }
            } else {
                jSONObject2.put("code", 1);
                jSONObject2.put(CrashHianalyticsData.MESSAGE, "Get reward unit Setting error, because must give appId and unitId.");
            }
            j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            o.d(f11954h, "getRewardUnitSetting error : " + th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getSDKInfo(Object obj, String str) {
        o.b(f11954h, "getSDKInfo");
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("type");
                JSONObject jSONObject = new JSONObject();
                int i10 = 0;
                if (this.f11964i != null) {
                    while (i10 < jSONArray.length()) {
                        int i11 = jSONArray.getInt(i10);
                        jSONObject.put(a(i11), this.f11964i.getJSCommon().h(i11));
                        i10++;
                    }
                } else if (obj != null) {
                    while (i10 < jSONArray.length()) {
                        int i12 = jSONArray.getInt(i10);
                        com.anythink.expressad.atsignalcommon.windvane.a aVar = (com.anythink.expressad.atsignalcommon.windvane.a) obj;
                        if (aVar.f7045a.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
                            jSONObject.put(a(i12), ((com.anythink.expressad.video.signal.a.j) aVar.f7045a.getObject()).h(i12));
                        }
                        i10++;
                    }
                }
                j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                return;
            }
            j.a().b(obj, "params is null");
        } catch (Throwable th) {
            o.b(f11954h, "getSDKInfo error", th);
            j.a().b(obj, f.f9575i);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getUnitSetting(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put(CrashHianalyticsData.MESSAGE, "Get Unit Setting error, RV/IV can not support this method.");
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            o.d(f11954h, "getUnitSetting error : " + th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void gial(Object obj, String str) {
        l.C(str, "gial:", f11954h);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.f6985b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("packageNameList", ContentRecord.XRINFOLIST_NULL);
            jSONObject.put("data", jSONObject2);
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            CommonJSBridgeImpUtils.callbackExcep(obj, e10.getMessage());
            o.a(f11954h, e10.getMessage());
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, th.getMessage());
            o.a(f11954h, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void handleNativeObject(Object obj, String str) {
        a(obj, str);
        try {
            com.anythink.expressad.video.bt.a.b.a().a(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "handleNativeObject error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void handlerH5Exception(Object obj, String str) {
        try {
            if (this.f11964i != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                o.b(f11954h, "handlerH5Exception,params:".concat(String.valueOf(str)));
                this.f11964i.getJSCommon().handlerH5Exception(jSONObject.optInt("code", c.f11213a), jSONObject.optString(CrashHianalyticsData.MESSAGE, "h5 error"));
            }
        } catch (Throwable th) {
            o.b(f11954h, "handlerH5Exception", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void hideView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().n(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "hideView error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void increaseOfferFrequence(Object obj, String str) {
        a(obj, str);
        try {
            c.a();
            new JSONObject(str);
            c.a(obj);
        } catch (Throwable th) {
            k.w(th, "increaseOfferFrequence error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void init(Object obj, String str) {
        boolean z10;
        boolean z11;
        o.b(f11954h, "init");
        try {
            IJSFactory iJSFactory = this.f11964i;
            int i10 = 1;
            if (iJSFactory != null) {
                String i11 = iJSFactory.getJSCommon().i();
                if (!TextUtils.isEmpty(i11)) {
                    i11 = Base64.encodeToString(i11.getBytes(), 2);
                }
                j.a().a(obj, i11);
                this.f11964i.getJSCommon().h();
                if (!TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    int optInt = jSONObject.optInt(f11957l);
                    int optInt2 = jSONObject.optInt("mute");
                    int optInt3 = jSONObject.optInt(f11959n);
                    int optInt4 = jSONObject.optInt(o);
                    int optInt5 = jSONObject.optInt(f11961q);
                    int optInt6 = jSONObject.optInt(f11962r);
                    int optInt7 = jSONObject.optInt(f11963s);
                    com.anythink.expressad.video.signal.c jSCommon = this.f11964i.getJSCommon();
                    if (optInt == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    jSCommon.a(z11);
                    this.f11964i.getJSCommon().b(optInt2);
                    this.f11964i.getJSCommon().c(optInt3);
                    this.f11964i.getJSCommon().d(optInt4);
                    this.f11964i.getJSCommon().e(optInt5);
                    this.f11964i.getJSCommon().f(optInt6);
                    com.anythink.expressad.video.signal.c jSCommon2 = this.f11964i.getJSCommon();
                    if (optInt7 != 0) {
                        i10 = optInt7;
                    }
                    jSCommon2.i(i10);
                    return;
                }
                return;
            }
            if (obj != null) {
                com.anythink.expressad.atsignalcommon.windvane.a aVar = (com.anythink.expressad.atsignalcommon.windvane.a) obj;
                if (aVar.f7045a.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
                    com.anythink.expressad.video.signal.a.j jVar = (com.anythink.expressad.video.signal.a.j) aVar.f7045a.getObject();
                    String i12 = jVar.i();
                    if (!TextUtils.isEmpty(str)) {
                        JSONObject jSONObject2 = new JSONObject(str);
                        int optInt8 = jSONObject2.optInt(f11957l);
                        int optInt9 = jSONObject2.optInt("mute");
                        int optInt10 = jSONObject2.optInt(f11959n);
                        int optInt11 = jSONObject2.optInt(o);
                        int optInt12 = jSONObject2.optInt(f11961q);
                        int optInt13 = jSONObject2.optInt(f11962r);
                        int optInt14 = jSONObject2.optInt(f11963s);
                        if (optInt8 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        jVar.a(z10);
                        jVar.b(optInt9);
                        jVar.c(optInt10);
                        jVar.d(optInt11);
                        jVar.e(optInt12);
                        jVar.f(optInt13);
                        if (optInt14 != 0) {
                            i10 = optInt14;
                        }
                        jVar.i(i10);
                        o.b(f11954h, "init jsCommon.setIsShowingTransparent = ".concat(String.valueOf(optInt8)));
                    }
                    j.a().a(obj, Base64.encodeToString(i12.getBytes(), 2));
                }
            }
        } catch (Throwable th) {
            o.b(f11954h, "init error", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.l
    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        super.initialize(obj, windVaneWebView);
        if (obj instanceof IJSFactory) {
            this.f11964i = (IJSFactory) obj;
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void insertViewAbove(Object obj, String str) {
        a(obj, str);
        try {
            c.a().s(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "insertViewAbove error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void insertViewBelow(Object obj, String str) {
        a(obj, str);
        try {
            c.a().t(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "insertViewBelow error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void isSystemResume(Object obj, String str) {
        try {
            if (this.f11964i != null) {
                o.b(f11954h, "isSystemResume,params:".concat(String.valueOf(str)));
                j.a().a(obj, b(this.f11964i.getActivityProxy().h()));
            }
        } catch (Throwable th) {
            o.b(f11954h, "isSystemResume", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void ivRewardAdsWithoutVideo(Object obj, String str) {
        l.B(str, "ivRewardAdsWithoutVideo ： params", f11954h);
        try {
            if (!TextUtils.isEmpty(str) && this.f11964i != null && !TextUtils.isEmpty(str)) {
                this.f11964i.getJSContainerModule().ivRewardAdsWithoutVideo(str);
            }
        } catch (Throwable th) {
            o.b(f11954h, "ivRewardAdsWithoutVideo", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void loadads(Object obj, String str) {
        String str2;
        int i10;
        int i11;
        o.b(f11954h, "loadads");
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                str2 = jSONObject.optString("unitId");
                i11 = jSONObject.optInt("type", 1);
                if (i11 > 2) {
                    i11 = 1;
                }
                i10 = jSONObject.optInt("adtype", 1);
            } else {
                str2 = "";
                i10 = 1;
                i11 = 1;
            }
            if (TextUtils.isEmpty(str2)) {
                j.a().a(obj, b(1));
                return;
            }
            if (obj != null) {
                WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a;
                if ((windVaneWebView instanceof WindVaneWebView) && windVaneWebView.getWebViewListener() != null) {
                    ((com.anythink.expressad.atsignalcommon.a.a) windVaneWebView.getWebViewListener()).a(str2, i11, i10);
                }
            }
            j.a().a(obj, b(0));
        } catch (Throwable th) {
            o.b(f11954h, "loadads error", th);
            j.a().a(obj, b(1));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void loadingResourceStatus(Object obj, String str) {
        a(obj, str);
        if (obj != null) {
            try {
                int optInt = new JSONObject(str).optInt("isReady", 1);
                WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a;
                if (windVaneWebView != null && windVaneWebView.getWebViewListener() != null) {
                    windVaneWebView.getWebViewListener().loadingResourceStatus(windVaneWebView, optInt);
                }
            } catch (Throwable th) {
                k.w(th, "loadingResourceStatus error ", f11954h);
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f11964i != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                o.b(f11954h, "notifyCloseBtn,result:".concat(String.valueOf(optInt)));
                this.f11964i.getJSVideoModule().notifyCloseBtn(optInt);
            }
        } catch (Throwable th) {
            o.b(f11954h, "notifyCloseBtn", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void onlyAppendSubView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().k(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "appendSubView error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void onlyAppendViewTo(Object obj, String str) {
        a(obj, str);
        try {
            c.a().l(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "appendViewTo error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void onlyInsertViewAbove(Object obj, String str) {
        a(obj, str);
        try {
            c.a().u(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "insertViewAbove error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void onlyInsertViewBelow(Object obj, String str) {
        a(obj, str);
        try {
            c.a().v(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "insertViewBelow error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void openURL(Object obj, String str) {
        o.d(f11954h, "openURL:".concat(String.valueOf(str)));
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
                o.d(f11954h, e10.getMessage());
            } catch (Throwable th) {
                o.d(f11954h, th.getMessage());
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playVideoFinishOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str) && this.f11964i != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("type");
                o.b(f11954h, "playVideoFinishOperate,type: ".concat(String.valueOf(optInt)));
                this.f11964i.getJSCommon().g(optInt);
            }
        } catch (Throwable th) {
            o.b(f11954h, "playVideoFinishOperate error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerGetMuteState(Object obj, String str) {
        a(obj, str);
        try {
            c.a().H(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "playerGetMuteState error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerMute(Object obj, String str) {
        a(obj, str);
        try {
            c.a().F(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "playerMute error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerPause(Object obj, String str) {
        a(obj, str);
        try {
            c.a().B(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "playerPause error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerPlay(Object obj, String str) {
        a(obj, str);
        try {
            c.a().A(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "playerPlay error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerResume(Object obj, String str) {
        a(obj, str);
        try {
            c.a().C(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "playerResume error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerSetRenderType(Object obj, String str) {
        a(obj, str);
        try {
            c.a();
            c.J(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "playerSetRenderType error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerSetSource(Object obj, String str) {
        a(obj, str);
        try {
            c.a();
            c.I(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "playerSetSource error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerStop(Object obj, String str) {
        a(obj, str);
        try {
            c.a().D(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "playerStop error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerUnmute(Object obj, String str) {
        a(obj, str);
        try {
            c.a().G(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "playerUnmute error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerUpdateFrame(Object obj, String str) {
        a(obj, str);
        try {
            c.a();
            c.E(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "playerUpdateFrame error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void preloadSubPlayTemplateView(Object obj, String str) {
        a(obj, str);
        try {
            if (this.f11964i != null) {
                c.a().K(obj, new JSONObject(str));
                return;
            }
            WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a;
            if (windVaneWebView instanceof WindVaneWebView) {
                if (windVaneWebView.getWebViewListener() != null) {
                    ((com.anythink.expressad.atsignalcommon.a.a) windVaneWebView.getWebViewListener()).a(obj, str);
                    o.a(f11954h, "preloadSubPlayTemplateView: RVWebViewListener");
                } else {
                    o.a(f11954h, "preloadSubPlayTemplateView: failed");
                }
            }
        } catch (Throwable th) {
            k.w(th, "preloadSubPlayTemplateView error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void progressBarOperate(Object obj, String str) {
        try {
            if (this.f11964i != null && !TextUtils.isEmpty(str)) {
                this.f11964i.getJSVideoModule().progressBarOperate(new JSONObject(str).optInt("view_visible"));
                j.a().a(obj, b(0));
            }
        } catch (Throwable th) {
            o.b(f11954h, "progressOperate error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void progressOperate(Object obj, String str) {
        try {
            if (this.f11964i != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("progress");
                int optInt2 = jSONObject.optInt("view_visible");
                o.b(f11954h, "progressOperate,progress:" + optInt + ",viewVisible:" + optInt2);
                this.f11964i.getJSVideoModule().progressOperate(optInt, optInt2);
                j.a().a(obj, b(0));
            }
        } catch (Throwable th) {
            o.b(f11954h, "progressOperate error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void reactDeveloper(Object obj, String str) {
        o.a(f11954h, "reactDeveloper");
        try {
            if (this.f11964i != null && !TextUtils.isEmpty(str)) {
                this.f11964i.getJSBTModule().reactDeveloper(obj, str);
            } else {
                j.a().b(obj, b(1));
            }
        } catch (Throwable th) {
            k.w(th, "reactDeveloper error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                com.anythink.expressad.atsignalcommon.windvane.a aVar = (com.anythink.expressad.atsignalcommon.windvane.a) obj;
                int optInt = new JSONObject(str).optInt("isReady", 1);
                if (aVar.f7045a.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
                    ((com.anythink.expressad.video.signal.a.j) aVar.f7045a.getObject()).j(optInt);
                }
                WindVaneWebView windVaneWebView = aVar.f7045a;
                if (windVaneWebView != null && windVaneWebView.getWebViewListener() != null) {
                    windVaneWebView.getWebViewListener().readyState(windVaneWebView, optInt);
                }
            } catch (Throwable th) {
                o.b(f11954h, "readyStatus", th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void removeCacheItem(java.lang.Object r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "removeCacheItem error "
            java.lang.String r1 = "JS-Video-Brigde"
            r2 = 1
            r3 = 0
            com.anythink.core.common.b.n r4 = com.anythink.core.common.b.n.a()     // Catch: java.lang.Throwable -> L3d
            android.content.Context r4 = r4.g()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = "anythink_h5_cachesp"
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r5, r3)     // Catch: java.lang.Throwable -> L3d
            boolean r5 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L3d
            if (r5 != 0) goto L3a
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3d
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r9 = "key"
            java.lang.String r9 = r5.getString(r9)     // Catch: java.lang.Throwable -> L3d
            boolean r5 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L3d
            if (r5 != 0) goto L36
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Throwable -> L3d
            android.content.SharedPreferences$Editor r9 = r4.remove(r9)     // Catch: java.lang.Throwable -> L3d
            r9.apply()     // Catch: java.lang.Throwable -> L3d
        L36:
            java.lang.String r9 = "Delete Success"
            r4 = r2
            goto L5c
        L3a:
            java.lang.String r9 = ""
            goto L5b
        L3d:
            r9 = move-exception
            java.lang.String r4 = java.lang.String.valueOf(r9)
            java.lang.String r4 = r0.concat(r4)
            com.anythink.expressad.foundation.h.o.d(r1, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Delete Error, reason is : "
            r4.<init>(r5)
            java.lang.String r9 = r9.getMessage()
            r4.append(r9)
            java.lang.String r9 = r4.toString()
        L5b:
            r4 = r3
        L5c:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L9b
            r5.<init>()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = "code"
            if (r4 == 0) goto L66
            r2 = r3
        L66:
            r5.put(r6, r2)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "message"
            r5.put(r2, r9)     // Catch: java.lang.Throwable -> L9b
            r9 = 2
            if (r8 == 0) goto L87
            if (r4 == 0) goto L87
            com.anythink.expressad.atsignalcommon.windvane.j r2 = com.anythink.expressad.atsignalcommon.windvane.j.a()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L9b
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r9 = android.util.Base64.encodeToString(r3, r9)     // Catch: java.lang.Throwable -> L9b
            r2.a(r8, r9)     // Catch: java.lang.Throwable -> L9b
            return
        L87:
            com.anythink.expressad.atsignalcommon.windvane.j r2 = com.anythink.expressad.atsignalcommon.windvane.j.a()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L9b
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r9 = android.util.Base64.encodeToString(r3, r9)     // Catch: java.lang.Throwable -> L9b
            r2.b(r8, r9)     // Catch: java.lang.Throwable -> L9b
            return
        L9b:
            com.anythink.expressad.foundation.h.o.d(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.signal.communication.BaseVideoBridge.removeCacheItem(java.lang.Object, java.lang.String):void");
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void removeFromSuperView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().h(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "removeFromSuperView error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void reportUrls(Object obj, String str) {
        o.a(f11954h, "reportUrls");
        try {
            if (!TextUtils.isEmpty(str)) {
                c.a();
                c.b(obj, str);
            } else {
                j.a().b(obj, b(1));
            }
        } catch (Throwable th) {
            k.w(th, "reportUrls error ", f11954h);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCacheItem(java.lang.Object r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "setCacheItem error "
            java.lang.String r1 = "JS-Video-Brigde"
            r2 = 1
            r3 = 0
            com.anythink.core.common.b.n r4 = com.anythink.core.common.b.n.a()     // Catch: java.lang.Throwable -> L49
            android.content.Context r4 = r4.g()     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = "anythink_h5_cachesp"
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r5, r3)     // Catch: java.lang.Throwable -> L49
            boolean r5 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto L46
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L49
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L49
            java.lang.String r9 = "key"
            java.lang.String r9 = r5.getString(r9)     // Catch: java.lang.Throwable -> L49
            java.lang.String r6 = "value"
            java.lang.String r5 = r5.getString(r6)     // Catch: java.lang.Throwable -> L49
            boolean r6 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L49
            if (r6 != 0) goto L42
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L49
            if (r6 != 0) goto L42
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Throwable -> L49
            android.content.SharedPreferences$Editor r9 = r4.putString(r9, r5)     // Catch: java.lang.Throwable -> L49
            r9.apply()     // Catch: java.lang.Throwable -> L49
        L42:
            java.lang.String r9 = "Save Success"
            r4 = r2
            goto L68
        L46:
            java.lang.String r9 = ""
            goto L67
        L49:
            r9 = move-exception
            java.lang.String r4 = java.lang.String.valueOf(r9)
            java.lang.String r4 = r0.concat(r4)
            com.anythink.expressad.foundation.h.o.d(r1, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Save Error, reason is : "
            r4.<init>(r5)
            java.lang.String r9 = r9.getMessage()
            r4.append(r9)
            java.lang.String r9 = r4.toString()
        L67:
            r4 = r3
        L68:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La7
            r5.<init>()     // Catch: java.lang.Throwable -> La7
            java.lang.String r6 = "code"
            if (r4 == 0) goto L72
            r2 = r3
        L72:
            r5.put(r6, r2)     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = "message"
            r5.put(r2, r9)     // Catch: java.lang.Throwable -> La7
            r9 = 2
            if (r8 == 0) goto L93
            if (r4 == 0) goto L93
            com.anythink.expressad.atsignalcommon.windvane.j r2 = com.anythink.expressad.atsignalcommon.windvane.j.a()     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> La7
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> La7
            java.lang.String r9 = android.util.Base64.encodeToString(r3, r9)     // Catch: java.lang.Throwable -> La7
            r2.a(r8, r9)     // Catch: java.lang.Throwable -> La7
            return
        L93:
            com.anythink.expressad.atsignalcommon.windvane.j r2 = com.anythink.expressad.atsignalcommon.windvane.j.a()     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> La7
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> La7
            java.lang.String r9 = android.util.Base64.encodeToString(r3, r9)     // Catch: java.lang.Throwable -> La7
            r2.b(r8, r9)     // Catch: java.lang.Throwable -> La7
            return
        La7:
            com.anythink.expressad.foundation.h.o.d(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.signal.communication.BaseVideoBridge.setCacheItem(java.lang.Object, java.lang.String):void");
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setScaleFitXY(Object obj, String str) {
        try {
            if (this.f11964i != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("fitxy");
                o.b(f11954h, "setScaleFitXY,type:".concat(String.valueOf(optInt)));
                this.f11964i.getJSVideoModule().setScaleFitXY(optInt);
            }
        } catch (Throwable th) {
            o.b(f11954h, "showVideoClickView error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setSubPlayTemplateInfo(Object obj, String str) {
        l.B(str, "setSubPlayTemplateInfo : ", f11954h);
        a(obj, str);
        try {
            c.a().N(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "setSubPlayTemplateInfo error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setViewAlpha(Object obj, String str) {
        a(obj, str);
        try {
            c.a().q(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "setViewAlpha error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setViewBgColor(Object obj, String str) {
        a(obj, str);
        try {
            c.a().p(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "setViewBgColor error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setViewRect(Object obj, String str) {
        a(obj, str);
        try {
            c.a().g(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "setViewRect error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setViewScale(Object obj, String str) {
        a(obj, str);
        try {
            c.a().r(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "setViewScale error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void showAlertView(Object obj, String str) {
        o.b(f11954h, "showAlertView");
        try {
            if (this.f11964i != null && !TextUtils.isEmpty(str)) {
                this.f11964i.getJSVideoModule().showIVRewardAlertView(str);
                j.a().a(obj, "showAlertView", "");
            }
        } catch (Throwable th) {
            o.b(f11954h, "showAlertView", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void showVideoClickView(Object obj, String str) {
        try {
            if (this.f11964i != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("type");
                o.b(f11954h, "showVideoClickView,type:".concat(String.valueOf(optInt)));
                this.f11964i.getJSContainerModule().showVideoClickView(optInt);
            }
        } catch (Throwable th) {
            o.b(f11954h, "showVideoClickView error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void showVideoLocation(Object obj, String str) {
        try {
            if (this.f11964i != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("margin_top", 0);
                int optInt2 = jSONObject.optInt("margin_left", 0);
                int optInt3 = jSONObject.optInt("view_width", 0);
                int optInt4 = jSONObject.optInt("view_height", 0);
                int optInt5 = jSONObject.optInt("radius", 0);
                int optInt6 = jSONObject.optInt("border_top", 0);
                int optInt7 = jSONObject.optInt("border_left", 0);
                int optInt8 = jSONObject.optInt("border_width", 0);
                int optInt9 = jSONObject.optInt("border_height", 0);
                o.b(f11954h, "showVideoLocation,margin_top:" + optInt + ",marginLeft:" + optInt2 + ",viewWidth:" + optInt3 + ",viewHeight:" + optInt4 + ",radius:" + optInt5 + ",borderTop: " + optInt6 + ",borderLeft: " + optInt7 + ",borderWidth: " + optInt8 + ",borderHeight: " + optInt9);
                this.f11964i.getJSVideoModule().showVideoLocation(optInt, optInt2, optInt3, optInt4, optInt5, optInt6, optInt7, optInt8, optInt9);
                this.f11964i.getJSCommon().l();
            }
        } catch (Throwable th) {
            o.b(f11954h, "showVideoLocation error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void showView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().o(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "showView error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void soundOperate(Object obj, String str) {
        try {
            if (this.f11964i != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("mute");
                int optInt2 = jSONObject.optInt("view_visible");
                String optString = jSONObject.optString("pt", "");
                o.b(f11954h, "soundOperate,mute:" + optInt + ",viewVisible:" + optInt2 + ",pt:" + optString);
                if (TextUtils.isEmpty(optString)) {
                    this.f11964i.getJSVideoModule().soundOperate(optInt, optInt2);
                } else {
                    this.f11964i.getJSVideoModule().soundOperate(optInt, optInt2, optString);
                }
                j.a().a(obj, b(0));
            }
        } catch (Throwable th) {
            o.b(f11954h, "soundOperate error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void statistics(Object obj, String str) {
        o.b(f11954h, "statistics,params:".concat(String.valueOf(str)));
        try {
            if (this.f11964i != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                this.f11964i.getJSCommon().a(jSONObject.optInt("type"), jSONObject.optString("data"));
            }
        } catch (Throwable th) {
            o.b(f11954h, "statistics error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f11964i != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                o.b(f11954h, "toggleCloseBtn,result:".concat(String.valueOf(optInt)));
                int i10 = 2;
                if (optInt != 1) {
                    if (optInt == 2) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                }
                this.f11964i.getJSVideoModule().closeVideoOperate(0, i10);
            }
        } catch (Throwable th) {
            o.b(f11954h, "toggleCloseBtn", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void triggerCloseBtn(Object obj, String str) {
        o.b(f11954h, "triggerCloseBtn");
        try {
            if (this.f11964i != null && !TextUtils.isEmpty(str) && new JSONObject(str).optString("state").equals("click")) {
                this.f11964i.getJSVideoModule().closeVideoOperate(1, -1);
                j.a().a(obj, b(0));
            }
        } catch (Throwable th) {
            o.b(f11954h, "triggerCloseBtn error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void videoOperate(Object obj, String str) {
        try {
            if (this.f11964i != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("pause_or_resume");
                o.b(f11954h, "videoOperate,pauseOrResume:".concat(String.valueOf(optInt)));
                this.f11964i.getJSVideoModule().videoOperate(optInt);
                j.a().a(obj, b(0));
            }
        } catch (Throwable th) {
            o.b(f11954h, "videoOperate error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void webviewFireEvent(Object obj, String str) {
        a(obj, str);
        try {
            c.a().O(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "setSubPlayTemplateInfo error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void webviewGoBack(Object obj, String str) {
        a(obj, str);
        try {
            c.a().y(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "webviewGoBack error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void webviewGoForward(Object obj, String str) {
        a(obj, str);
        try {
            c.a().z(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "webviewGoForward error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void webviewLoad(Object obj, String str) {
        a(obj, str);
        try {
            c.a().w(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "webviewLoad error ", f11954h);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void webviewReload(Object obj, String str) {
        a(obj, str);
        try {
            c.a().x(obj, new JSONObject(str));
        } catch (Throwable th) {
            k.w(th, "webviewReload error ", f11954h);
        }
    }

    private static void a(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put(CrashHianalyticsData.MESSAGE, "params is null");
                j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Exception e10) {
            o.a(f11954h, e10.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getEncryptPrice(Object obj, String str) {
    }
}
