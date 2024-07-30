package com.huawei.hms.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import gb.r0;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ck {
    private static final String Code = "ActivityStarter";
    private static final String I = "com.huawei.hms.pps.action.PPS_AR";
    private static final String V = "com.huawei.hms.pps.action.PPS_DETAIL";
    private static final int Z = 1;

    private static void Code(Context context, AdContentData adContentData, Intent intent) {
        intent.putExtra("content_id", adContentData.L());
        intent.putExtra("sdk_version", "13.4.65.300");
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.f22057e, adContentData.u());
        intent.putExtra("request_id", adContentData.E());
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.y, context.getPackageName());
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.N, adContentData.A0());
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.O, adContentData.B0());
        intent.putExtra("templateId", adContentData.e0());
        intent.putExtra("slotid", adContentData.D());
        intent.putExtra("apiVer", adContentData.f0());
    }

    private static boolean V(Context context, AdContentData adContentData, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            Code(adContentData, jSONObject);
            Code((Intent) null, jSONObject, map, false);
            a0.a.h(context, adContentData.w0()).d(com.huawei.openalliance.ad.constant.s.o, jSONObject.toString(), null, null);
            return true;
        } catch (JSONException e10) {
            ex.I(Code, "startArActivityViaAidl, e:".concat(e10.getClass().getSimpleName()));
            return false;
        }
    }

    private static void Code(Context context, AdContentData adContentData, ep epVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            Code(adContentData, jSONObject);
            adContentData.getClass();
            jSONObject.put(com.huawei.openalliance.ad.constant.ba.f22056d, true);
            jSONObject.put(com.huawei.openalliance.ad.constant.ba.f22062k, adContentData.d1());
            jSONObject.put("unique_id", adContentData.Y());
            Code(jSONObject, epVar);
            a0.a.h(context, adContentData.w0()).d(com.huawei.openalliance.ad.constant.s.f22107a, jSONObject.toString(), null, null);
        } catch (JSONException e10) {
            ex.I(Code, "startAdActivityViaAidl, e:".concat(e10.getClass().getSimpleName()));
        }
    }

    public static void Code(Context context, AdContentData adContentData, ep epVar, boolean z10) {
        try {
            if (!(context instanceof Activity) || adContentData.w0()) {
                Code(context, adContentData, epVar);
                return;
            }
            ex.V(Code, "activity context");
            Intent intent = new Intent();
            intent.setAction(V);
            intent.setPackage(r0.n(context));
            Code(context, adContentData, intent);
            intent.putExtra(com.huawei.openalliance.ad.constant.ba.f22056d, true);
            intent.putExtra(com.huawei.openalliance.ad.constant.ba.f22062k, adContentData.d1());
            intent.putExtra("unique_id", adContentData.Y());
            Code(intent, epVar);
            if (z10) {
                intent.addFlags(268959744);
            }
            intent.setClipData(com.huawei.openalliance.ad.constant.w.cH);
            ((Activity) context).startActivityForResult(intent, 1);
        } catch (Throwable th) {
            ex.Code(3, th);
            ex.V(Code, "startAdActivity error, %s", th.getClass().getSimpleName());
        }
    }

    private static void Code(Intent intent, ep epVar) {
        ex.Code(Code, "parseLinkedAdConfig");
        if (intent == null || epVar == null) {
            return;
        }
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.f22065n, epVar.B());
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.f22064m, epVar.C());
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.o, epVar.Code());
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.f22067q, epVar.I());
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.f22066p, epVar.V());
    }

    private static void Code(Intent intent, JSONObject jSONObject, Map<String, String> map, boolean z10) {
        if (map == null || map.isEmpty()) {
            return;
        }
        String p10 = gb.b.p(map);
        if (gb.p.f(p10)) {
            return;
        }
        if (z10) {
            intent.putExtra(com.huawei.openalliance.ad.constant.ba.P, p10);
            return;
        }
        try {
            jSONObject.put(com.huawei.openalliance.ad.constant.ba.P, p10);
        } catch (JSONException e10) {
            ex.Z(Code, "set ar linked params error,".concat(e10.getClass().getSimpleName()));
        }
    }

    private static void Code(AdContentData adContentData, JSONObject jSONObject) {
        jSONObject.put("content_id", adContentData.L());
        jSONObject.put("sdk_version", "13.4.65.300");
        jSONObject.put(com.huawei.openalliance.ad.constant.ba.f22057e, adContentData.u());
        jSONObject.put("request_id", adContentData.E());
        jSONObject.put(com.huawei.openalliance.ad.constant.ba.N, adContentData.A0());
        jSONObject.put(com.huawei.openalliance.ad.constant.ba.O, adContentData.B0());
        jSONObject.put("templateId", adContentData.e0());
        jSONObject.put("slotid", adContentData.D());
        jSONObject.put("apiVer", adContentData.f0());
    }

    public static void Code(JSONObject jSONObject, ep epVar) {
        if (jSONObject == null || epVar == null) {
            return;
        }
        ex.Code(Code, "parseLinkedAdConfigViaAid");
        try {
            jSONObject.put(com.huawei.openalliance.ad.constant.ba.f22065n, epVar.B());
            jSONObject.put(com.huawei.openalliance.ad.constant.ba.f22064m, epVar.C());
            jSONObject.put(com.huawei.openalliance.ad.constant.ba.o, epVar.Code());
            jSONObject.put(com.huawei.openalliance.ad.constant.ba.f22067q, epVar.I());
            jSONObject.put(com.huawei.openalliance.ad.constant.ba.f22066p, epVar.V());
        } catch (JSONException e10) {
            ex.I(Code, "startAdActivityViaAidl, e:".concat(e10.getClass().getSimpleName()));
        }
    }

    public static boolean Code(Context context, AdContentData adContentData, Map<String, String> map) {
        String concat;
        try {
            if (!(context instanceof Activity) || adContentData.w0()) {
                return V(context, adContentData, map);
            }
            try {
                Intent intent = new Intent();
                intent.setAction(I);
                intent.setPackage(r0.n(context));
                Code(context, adContentData, intent);
                Code(intent, (JSONObject) null, map, true);
                intent.setClipData(com.huawei.openalliance.ad.constant.w.cH);
                ((Activity) context).startActivityForResult(intent, 1);
                return true;
            } catch (ActivityNotFoundException e10) {
                concat = "ActivityNotFoundException e:".concat(e10.getClass().getSimpleName());
                ex.I(Code, concat);
                return false;
            } catch (Exception e11) {
                concat = "Exception e:".concat(e11.getClass().getSimpleName());
                ex.I(Code, concat);
                return false;
            }
        } catch (Throwable th) {
            ex.Code(3, th);
            ex.V(Code, "startArActivity error, %s", th.getClass().getSimpleName());
            return false;
        }
    }
}
