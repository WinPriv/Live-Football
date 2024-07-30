package com.anythink.expressad.video.signal.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.module.AnythinkContainerView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m extends f {

    /* renamed from: b, reason: collision with root package name */
    private Activity f11944b;

    /* renamed from: c, reason: collision with root package name */
    private AnythinkContainerView f11945c;

    public m(Activity activity, AnythinkContainerView anythinkContainerView) {
        this.f11944b = activity;
        this.f11945c = anythinkContainerView;
    }

    private static com.anythink.expressad.videocommon.e.d c(String str) {
        if (com.anythink.expressad.videocommon.e.c.a() == null) {
            return null;
        }
        return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), str);
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.i
    public final String a() {
        if (this.f11945c == null) {
            super.a();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f11945c.getCampaign());
                String unitID = this.f11945c.getUnitID();
                String str = com.anythink.expressad.out.b.f10461a + ",3.0.1";
                com.anythink.expressad.videocommon.e.d a10 = com.anythink.expressad.videocommon.e.c.a() == null ? null : com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), unitID);
                JSONObject jSONObject = new JSONObject();
                if (a10 != null) {
                    jSONObject = a10.R();
                }
                com.anythink.expressad.foundation.h.o.a("JSRewardVideoV1", "getEndScreenInfo success campaign = " + this.f11945c.getCampaign());
                return a(arrayList, unitID, str, jSONObject);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return super.a();
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.i
    public final void b(String str) {
        super.b(str);
        try {
            if (this.f11944b != null && !TextUtils.isEmpty(str)) {
                if (str.equals("landscape")) {
                    this.f11944b.setRequestedOrientation(0);
                } else if (str.equals("portrait")) {
                    this.f11944b.setRequestedOrientation(1);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.i, com.anythink.expressad.video.signal.h
    public final void handlerPlayableException(String str) {
        AnythinkContainerView anythinkContainerView;
        super.handlerPlayableException(str);
        try {
            if (this.f11944b != null && !TextUtils.isEmpty(str) && (anythinkContainerView = this.f11945c) != null) {
                anythinkContainerView.handlerPlayableException(str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.h
    public final void install(com.anythink.expressad.foundation.d.c cVar) {
        super.install(cVar);
        AnythinkContainerView anythinkContainerView = this.f11945c;
        if (anythinkContainerView != null) {
            anythinkContainerView.install(cVar);
        }
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.h
    public final void notifyCloseBtn(int i10) {
        super.notifyCloseBtn(i10);
        AnythinkContainerView anythinkContainerView = this.f11945c;
        if (anythinkContainerView != null) {
            anythinkContainerView.notifyCloseBtn(i10);
        }
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.h
    public final void orientation(Configuration configuration) {
        super.orientation(configuration);
        try {
            AnythinkContainerView anythinkContainerView = this.f11945c;
            if (anythinkContainerView != null) {
                anythinkContainerView.orientation(configuration);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.h
    public final void toggleCloseBtn(int i10) {
        super.toggleCloseBtn(i10);
        AnythinkContainerView anythinkContainerView = this.f11945c;
        if (anythinkContainerView != null) {
            anythinkContainerView.toggleCloseBtn(i10);
        }
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.h
    public final void webviewshow() {
        super.webviewshow();
        try {
            AnythinkContainerView anythinkContainerView = this.f11945c;
            if (anythinkContainerView != null) {
                anythinkContainerView.webviewshow();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.i
    public final void a(String str) {
        AnythinkContainerView anythinkContainerView;
        super.a(str);
        try {
            if (this.f11944b == null || TextUtils.isEmpty(str) || !str.equals("click") || (anythinkContainerView = this.f11945c) == null) {
                return;
            }
            anythinkContainerView.triggerCloseBtn(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static String a(List<com.anythink.expressad.foundation.d.c> list, String str, String str2, JSONObject jSONObject) {
        try {
            if (list.size() <= 0) {
                return null;
            }
            com.anythink.expressad.foundation.h.b bVar = new com.anythink.expressad.foundation.h.b(com.anythink.expressad.foundation.b.a.b().d());
            Object b10 = com.anythink.expressad.foundation.d.c.b(list);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("campaignList", b10);
            jSONObject2.put("device", bVar.a());
            jSONObject2.put("unit_id", str);
            jSONObject2.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO, str2);
            jSONObject2.put("unitSetting", jSONObject);
            if (com.anythink.expressad.d.b.a() != null) {
                com.anythink.expressad.d.b.a();
                String a10 = com.anythink.expressad.d.b.a(com.anythink.expressad.foundation.b.a.b().e());
                if (!TextUtils.isEmpty(a10)) {
                    JSONObject jSONObject3 = new JSONObject(a10);
                    try {
                        Context d10 = com.anythink.expressad.foundation.b.a.b().d();
                        String obj = v.b(d10, "Anythink_ConfirmTitle".concat(String.valueOf(str)), "").toString();
                        String obj2 = v.b(d10, "Anythink_ConfirmContent".concat(String.valueOf(str)), "").toString();
                        String obj3 = v.b(d10, "Anythink_CancelText".concat(String.valueOf(str)), "").toString();
                        String obj4 = v.b(d10, "Anythink_ConfirmText".concat(String.valueOf(str)), "").toString();
                        if (!TextUtils.isEmpty(obj)) {
                            jSONObject3.put(com.anythink.expressad.d.a.b.ct, obj);
                        }
                        if (!TextUtils.isEmpty(obj2)) {
                            jSONObject3.put(com.anythink.expressad.d.a.b.cu, obj2);
                        }
                        if (!TextUtils.isEmpty(obj3)) {
                            jSONObject3.put(com.anythink.expressad.d.a.b.cv, obj3);
                        }
                        if (!TextUtils.isEmpty(obj4)) {
                            jSONObject3.put(com.anythink.expressad.d.a.b.cx, obj4);
                        }
                        if (!TextUtils.isEmpty(obj4)) {
                            jSONObject3.put(com.anythink.expressad.d.a.b.cw, obj4);
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    com.anythink.expressad.d.b.a();
                    String b11 = com.anythink.expressad.d.b.b(str);
                    if (!TextUtils.isEmpty(b11)) {
                        jSONObject3.put("ivreward", new JSONObject(b11));
                    }
                    jSONObject2.put("appSetting", jSONObject3);
                }
            }
            return jSONObject2.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    private static void a(JSONObject jSONObject, String str) {
        try {
            Context d10 = com.anythink.expressad.foundation.b.a.b().d();
            String obj = v.b(d10, "Anythink_ConfirmTitle".concat(String.valueOf(str)), "").toString();
            String obj2 = v.b(d10, "Anythink_ConfirmContent".concat(String.valueOf(str)), "").toString();
            String obj3 = v.b(d10, "Anythink_CancelText".concat(String.valueOf(str)), "").toString();
            String obj4 = v.b(d10, "Anythink_ConfirmText".concat(String.valueOf(str)), "").toString();
            if (!TextUtils.isEmpty(obj)) {
                jSONObject.put(com.anythink.expressad.d.a.b.ct, obj);
            }
            if (!TextUtils.isEmpty(obj2)) {
                jSONObject.put(com.anythink.expressad.d.a.b.cu, obj2);
            }
            if (!TextUtils.isEmpty(obj3)) {
                jSONObject.put(com.anythink.expressad.d.a.b.cv, obj3);
            }
            if (!TextUtils.isEmpty(obj4)) {
                jSONObject.put(com.anythink.expressad.d.a.b.cx, obj4);
            }
            if (TextUtils.isEmpty(obj4)) {
                return;
            }
            jSONObject.put(com.anythink.expressad.d.a.b.cw, obj4);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
