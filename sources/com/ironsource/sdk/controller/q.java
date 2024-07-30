package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.bj;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.e.a.a;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f26237a;

    /* renamed from: b, reason: collision with root package name */
    public final com.ironsource.sdk.e.a.a f26238b = new com.ironsource.sdk.e.a.a();

    public q(Context context) {
        this.f26237a = context;
    }

    public final void a(String str, x.d.a aVar) {
        char c10;
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("omidFunction");
        JSONObject optJSONObject = jSONObject.optJSONObject("omidParams");
        String optString2 = jSONObject.optString("success");
        String optString3 = jSONObject.optString(bj.b.S);
        com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f();
        if (optJSONObject != null) {
            String optString4 = optJSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(optString4)) {
                fVar.a("adViewId", optString4);
            }
        }
        try {
            switch (optString.hashCode()) {
                case -1655974669:
                    if (optString.equals("activate")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -984459207:
                    if (optString.equals("getOmidData")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 70701699:
                    if (optString.equals("finishSession")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1208109646:
                    if (optString.equals("impressionOccurred")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1850541012:
                    if (optString.equals("startSession")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            com.ironsource.sdk.e.a.a aVar2 = this.f26238b;
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 != 4) {
                                throw new IllegalArgumentException(String.format("%s | unsupported OMID API", optString));
                            }
                        } else {
                            aVar2.a(optJSONObject);
                            AdSession adSession = aVar2.f26453c.get(optJSONObject.optString("adViewId"));
                            if (adSession != null) {
                                AdEvents createAdEvents = AdEvents.createAdEvents(adSession);
                                if (optJSONObject.optBoolean("signalLoaded")) {
                                    createAdEvents.loaded();
                                }
                                createAdEvents.impressionOccurred();
                            } else {
                                throw new IllegalStateException("OMID Session has not started");
                            }
                        }
                    } else {
                        aVar2.a(optJSONObject);
                        String optString5 = optJSONObject.optString("adViewId");
                        AdSession adSession2 = aVar2.f26453c.get(optString5);
                        if (adSession2 != null) {
                            adSession2.finish();
                            aVar2.f26453c.remove(optString5);
                        } else {
                            throw new IllegalStateException("OMID Session has not started");
                        }
                    }
                } else {
                    a.C0341a a10 = a.C0341a.a(optJSONObject);
                    if (aVar2.f26454d) {
                        if (!TextUtils.isEmpty(a10.f26460g)) {
                            String str2 = a10.f26460g;
                            if (!aVar2.f26453c.containsKey(str2)) {
                                com.ironsource.sdk.c.e a11 = com.ironsource.sdk.c.d.a().a(str2);
                                if (a11 != null) {
                                    AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(a10.f, a10.f26459e, a10.f26456b, a10.f26457c, a10.f26455a), AdSessionContext.createHtmlAdSessionContext(aVar2.f26452b, a11.a(), null, a10.f26458d));
                                    createAdSession.registerAdView(a11.a());
                                    createAdSession.start();
                                    aVar2.f26453c.put(str2, createAdSession);
                                } else {
                                    throw new IllegalStateException("No adview found with the provided adViewId");
                                }
                            } else {
                                throw new IllegalStateException("OMID Session has already started");
                            }
                        } else {
                            throw new IllegalStateException("Missing adview id in OMID params");
                        }
                    } else {
                        throw new IllegalStateException("OMID has not been activated");
                    }
                }
                aVar.a(true, optString2, fVar);
            }
            Context context = this.f26237a;
            if (!aVar2.f26454d) {
                Omid.activate(context);
                aVar2.f26454d = true;
            }
            fVar = aVar2.a();
            aVar.a(true, optString2, fVar);
        } catch (Exception e10) {
            fVar.a("errMsg", e10.getMessage());
            Logger.i(com.anythink.expressad.foundation.d.c.bj, "OMIDJSAdapter " + optString + " Exception: " + e10.getMessage());
            aVar.a(false, optString3, fVar);
        }
    }
}
