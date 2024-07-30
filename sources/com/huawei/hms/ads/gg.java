package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class gg {
    private static final String B = "AppNotificationEvtProcessor";
    private static final String C = "AppNotificationExceptionCmd";
    public static final String Code = "70";
    public static final String I = "1";
    public static final String V = "0";
    public static final String Z = "2";

    public static void Code(Context context, AdContentData adContentData) {
        Code(context, adContentData, Code, "2", null, null);
    }

    public static void I(Context context, AdContentData adContentData) {
        Code(context, adContentData, Code, "0", null, null);
    }

    public static void V(Context context, AdContentData adContentData) {
        Code(context, adContentData, Code, "1", null, null);
    }

    private static <T> void Code(Context context, AdContentData adContentData, String str, String str2, RemoteCallResultCallback<T> remoteCallResultCallback, Class<T> cls) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content_id", adContentData.L());
            jSONObject.put("templateId", adContentData.e0());
            jSONObject.put("slotid", adContentData.D());
            jSONObject.put("apiVer", adContentData.f0());
            jSONObject.put(com.huawei.openalliance.ad.constant.ba.f22049a, str);
            jSONObject.put("action", str2);
            ha.i.e(context).d(C, jSONObject.toString(), remoteCallResultCallback, cls);
        } catch (JSONException unused) {
            ex.I(B, "reportAnalysisEvent JSONException");
            if (remoteCallResultCallback != null) {
                CallResult<T> callResult = new CallResult<>();
                callResult.setCode(-1);
                callResult.setMsg("reportAnalysisEvent JSONException");
                remoteCallResultCallback.onRemoteCallResult(C, callResult);
            }
        }
    }
}
