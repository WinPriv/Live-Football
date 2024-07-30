package com.ironsource.sdk.controller;

import android.app.Activity;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.bj;
import com.ironsource.environment.a;
import com.ironsource.sdk.a.f;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.vungle.warren.model.Advertisement;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a implements com.ironsource.sdk.b.a {

    /* renamed from: a, reason: collision with root package name */
    public z f26093a;

    /* renamed from: b, reason: collision with root package name */
    public final com.ironsource.sdk.c.d f26094b = com.ironsource.sdk.c.d.a();

    /* renamed from: c, reason: collision with root package name */
    public final c f26095c;

    public a(c cVar) {
        this.f26095c = cVar;
    }

    public final void a(String str, x.d.a aVar) {
        char c10;
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("functionName");
        JSONObject optJSONObject = jSONObject.optJSONObject("functionParams");
        String optString2 = jSONObject.optString("success");
        String optString3 = jSONObject.optString(bj.b.S);
        com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f();
        try {
            switch (optString.hashCode()) {
                case -1384357108:
                    if (optString.equals("removeAdView")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 691453791:
                    if (optString.equals("sendMessage")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 842351363:
                    if (optString.equals("loadWithUrl")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1182065477:
                    if (optString.equals("handleGetViewVisibility")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1491535759:
                    if (optString.equals("webviewAction")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            com.ironsource.sdk.c.d dVar = this.f26094b;
            if (c10 == 0) {
                Activity a10 = this.f26095c.a();
                String string = optJSONObject.getString("adViewId");
                if (string.isEmpty()) {
                    Logger.i(com.ironsource.sdk.c.d.f26062a, "loadWithUrl fail - adViewId is empty");
                    throw new Exception("adViewId is empty");
                }
                com.ironsource.sdk.a c11 = dVar.c(optJSONObject);
                if (dVar.f26064b.containsKey(string)) {
                    Logger.i(com.ironsource.sdk.c.d.f26062a, "sendMessageToAd fail - collection already contain adViewId");
                    throw new Exception("collection already contain adViewId");
                }
                com.ironsource.sdk.c.c cVar = new com.ironsource.sdk.c.c(this, a10, string, c11);
                cVar.f26047a = IronSourceStorageUtils.getNetworkStorageDir(a10.getApplicationContext());
                com.ironsource.environment.e.a aVar2 = com.ironsource.environment.e.a.f24660a;
                aVar2.a(new Runnable() { // from class: com.ironsource.sdk.c.c.1

                    /* renamed from: s */
                    public final /* synthetic */ String f26053s;

                    /* renamed from: t */
                    public final /* synthetic */ JSONObject f26054t;

                    /* renamed from: u */
                    public final /* synthetic */ String f26055u;

                    public AnonymousClass1(String optString32, JSONObject optJSONObject2, String optString22) {
                        r2 = optString32;
                        r3 = optJSONObject2;
                        r4 = optString22;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String str2 = r2;
                        c cVar2 = c.this;
                        if (cVar2.f26050t != null) {
                            com.ironsource.sdk.a.d.a(f.f26010p, new com.ironsource.sdk.a.a().a("callfailreason", "loadWithUrl | webView is not null").f25984a);
                        }
                        try {
                            c.b(cVar2, str2);
                            String string2 = r3.getString("urlForWebView");
                            if (string2.startsWith(".")) {
                                StringBuilder sb2 = new StringBuilder(Advertisement.FILE_SCHEME);
                                sb2.append(cVar2.f26047a);
                                String substring = string2.substring(string2.indexOf("/") + 1);
                                sb2.append(substring.substring(substring.indexOf("/")));
                                string2 = sb2.toString();
                            }
                            cVar2.f26050t.loadUrl(string2);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("adViewId", cVar2.f26049s);
                            cVar2.f26051u.a(r4, jSONObject2);
                        } catch (Exception e10) {
                            cVar2.b(str2, e10.getMessage());
                            com.ironsource.sdk.a.d.a(f.f26010p, new com.ironsource.sdk.a.a().a("callfailreason", e10.getMessage()).f25984a);
                        }
                    }
                });
                if (com.ironsource.sdk.c.d.b(optJSONObject2)) {
                    aVar2.a(new Runnable() { // from class: com.ironsource.sdk.c.d.1

                        /* renamed from: s */
                        public final /* synthetic */ c f26065s;

                        /* renamed from: t */
                        public final /* synthetic */ Activity f26066t;

                        /* renamed from: u */
                        public final /* synthetic */ String f26067u;

                        public AnonymousClass1(c cVar2, Activity a102, String string2) {
                            r2 = cVar2;
                            r3 = a102;
                            r4 = string2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            d.this.f26064b.put(r4, new a(r2, r3.getApplicationContext()));
                        }
                    });
                    return;
                } else {
                    dVar.f26064b.put(string2, cVar2);
                    return;
                }
            }
            if (c10 == 1) {
                String string2 = new JSONObject(optJSONObject2.getString("params")).getString("adViewId");
                if (string2.isEmpty()) {
                    Logger.i(com.ironsource.sdk.c.d.f26062a, "sendMessageToAd fail - adViewId is empty");
                    throw new Exception("adViewId is empty");
                }
                if (!dVar.f26064b.containsKey(string2)) {
                    Logger.i(com.ironsource.sdk.c.d.f26062a, "sendMessageToAd fail - collection does not contain adViewId");
                    throw new Exception("collection does not contain adViewId");
                }
                com.ironsource.sdk.c.e eVar = dVar.f26064b.get(string2);
                if (eVar != null) {
                    eVar.b(optJSONObject2, optString22, optString32);
                    return;
                }
                return;
            }
            if (c10 == 2) {
                String string3 = optJSONObject2.getString("adViewId");
                if (string3.isEmpty()) {
                    Logger.i(com.ironsource.sdk.c.d.f26062a, "removeAdView fail - adViewId is empty");
                    throw new Exception("adViewId is empty");
                }
                if (!dVar.f26064b.containsKey(string3)) {
                    Logger.i(com.ironsource.sdk.c.d.f26062a, "removeAdView fail - collection does not contain adViewId");
                    throw new Exception("collection does not contain adViewId");
                }
                com.ironsource.sdk.c.e eVar2 = dVar.f26064b.get(string3);
                dVar.f26064b.remove(string3);
                if (eVar2 != null) {
                    eVar2.a(optString22, optString32);
                    return;
                }
                return;
            }
            if (c10 == 3) {
                String string4 = optJSONObject2.getString("adViewId");
                if (string4.isEmpty()) {
                    Logger.i(com.ironsource.sdk.c.d.f26062a, "removeAdView fail - adViewId is empty");
                    throw new Exception("adViewId is empty");
                }
                if (!dVar.f26064b.containsKey(string4)) {
                    Logger.i(com.ironsource.sdk.c.d.f26062a, "removeAdView fail - collection does not contain adViewId");
                    throw new Exception("collection does not contain adViewId");
                }
                com.ironsource.sdk.c.e eVar3 = dVar.f26064b.get(string4);
                if (eVar3 != null) {
                    eVar3.a(optJSONObject2, optString22, optString32);
                    return;
                }
                return;
            }
            if (c10 != 4) {
                throw new IllegalArgumentException(String.format("%s | unsupported AdViews API", optString));
            }
            String string5 = optJSONObject2.getString("adViewId");
            if (string5.isEmpty()) {
                Logger.i(com.ironsource.sdk.c.d.f26062a, "performWebViewAction fail - adViewId is empty");
                throw new Exception("adViewId is empty");
            }
            if (!dVar.f26064b.containsKey(string5)) {
                Logger.i(com.ironsource.sdk.c.d.f26062a, "performWebViewAction fail - collection does not contain adViewId");
                throw new Exception("collection does not contain adViewId");
            }
            com.ironsource.sdk.c.e eVar4 = dVar.f26064b.get(string5);
            String string6 = optJSONObject2.getString("actionName");
            if (eVar4 != null) {
                eVar4.a(string6, optString22, optString32);
            }
        } catch (Exception e10) {
            fVar.a("errMsg", e10.getMessage());
            String a11 = com.ironsource.sdk.c.d.a(optJSONObject2);
            if (!TextUtils.isEmpty(a11)) {
                fVar.a("adViewId", a11);
            }
            aVar.a(false, optString32, fVar);
        }
    }

    @Override // com.ironsource.sdk.b.a
    public final void a(String str, String str2, String str3) {
        a(str, a.AnonymousClass1.b(str2, str3));
    }

    @Override // com.ironsource.sdk.b.a
    public final void a(String str, JSONObject jSONObject) {
        if (this.f26093a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f26093a.a(str, jSONObject);
    }
}
