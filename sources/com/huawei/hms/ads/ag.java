package com.huawei.hms.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.jsb.inner.data.JsbCallBackData;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import gb.c0;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class ag implements ad {
    private static final byte[] B = new byte[0];
    private static WeakReference<Activity> C = null;
    private static final String Z = "JsbBaseCommand";
    protected String Code;
    protected String I;
    protected String V;

    public ag() {
    }

    public ag(String str) {
        this.Code = str;
    }

    public Integer B(String str) {
        try {
            int optInt = new JSONObject(str).optInt(com.huawei.openalliance.ad.constant.av.aq, -111111);
            if (optInt != -111111) {
                return Integer.valueOf(optInt);
            }
            return null;
        } catch (Throwable unused) {
            ex.Code(Z, "getDownloadSource error");
            return null;
        }
    }

    public MaterialClickInfo C(String str) {
        boolean z10;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Integer valueOf = Integer.valueOf(jSONObject.optInt(com.huawei.openalliance.ad.constant.ba.aj, -111111));
            Integer valueOf2 = Integer.valueOf(jSONObject.optInt(com.huawei.openalliance.ad.constant.ba.ak, -111111));
            String optString = jSONObject.optString(com.huawei.openalliance.ad.constant.ba.al, "");
            Float c10 = gb.p.c(jSONObject.optString(com.huawei.openalliance.ad.constant.ba.ap, "-111111"), Float.valueOf(-111111.0f));
            Integer valueOf3 = Integer.valueOf(jSONObject.optInt(com.huawei.openalliance.ad.constant.ba.an, -111111));
            Integer valueOf4 = Integer.valueOf(jSONObject.optInt(com.huawei.openalliance.ad.constant.ba.ao, -111111));
            Integer valueOf5 = Integer.valueOf(jSONObject.optInt(com.huawei.openalliance.ad.constant.ba.am, -111111));
            if (valueOf.intValue() == -111111) {
                valueOf = null;
            }
            if (valueOf2.intValue() == -111111) {
                valueOf2 = null;
            }
            if (!TextUtils.isEmpty(optString) && Pattern.matches("^[0-9\\*\\+\\-\\.]*$", optString) && optString.length() < 100) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                optString = null;
            }
            if (c10.floatValue() == -111111.0f) {
                c10 = null;
            }
            if (valueOf3.intValue() == -111111) {
                valueOf3 = null;
            }
            if (valueOf4.intValue() == -111111) {
                valueOf4 = null;
            }
            if (valueOf5.intValue() == -111111) {
                valueOf5 = null;
            }
            MaterialClickInfo.a aVar = new MaterialClickInfo.a();
            aVar.f22249a = valueOf;
            aVar.f22250b = valueOf2;
            aVar.f22251c = optString;
            aVar.f22252d = valueOf5;
            aVar.f22254g = c10;
            aVar.f22253e = valueOf3;
            aVar.f = valueOf4;
            return new MaterialClickInfo(aVar);
        } catch (Throwable unused) {
            ex.Code(Z, "getClickInfo error");
            return null;
        }
    }

    @Override // com.huawei.hms.ads.ad
    public Context Code(Context context) {
        synchronized (B) {
            WeakReference<Activity> weakReference = C;
            if (weakReference == null || weakReference.get() == null) {
                return context;
            }
            return C.get();
        }
    }

    public boolean S(String str) {
        try {
            if (!gb.p.f(str)) {
                if (Integer.parseInt(str.trim()) >= 10000300) {
                    return true;
                }
            }
        } catch (Throwable th) {
            ex.Z("H5Ad", "isSupportImpCtrl() exception: %s", th.getClass().getSimpleName());
        }
        return false;
    }

    public void V(RemoteCallResultCallback<String> remoteCallResultCallback, boolean z10) {
        Code(remoteCallResultCallback, this.Code, 1000, "ok", z10);
    }

    @Override // com.huawei.hms.ads.ad
    public void execute(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        ex.I(Z, "async execute is not implemented!");
        throw new IllegalStateException("async execute is not implemented!");
    }

    @Override // com.huawei.hms.ads.ad
    public c0.a Code() {
        return c0.a.IO;
    }

    @Override // com.huawei.hms.ads.ad
    public void V(String str) {
        this.I = str;
    }

    @Override // com.huawei.hms.ads.ad
    public Object Code(Context context, String str) {
        ex.I(Z, "direct call is not implemented!");
        throw new IllegalStateException("direct call is not implemented!");
    }

    @Override // com.huawei.hms.ads.ad
    public void Code(Activity activity) {
        synchronized (B) {
            WeakReference<Activity> weakReference = C;
            if (weakReference == null || weakReference.get() == null) {
                C = new WeakReference<>(activity);
            }
        }
    }

    public void Code(Context context, String str, ac acVar) {
        Code(context, str, false, acVar);
    }

    public void Code(Context context, final String str, boolean z10, final ac acVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            jSONObject.put("content_id", jSONObject2.optString("contentId"));
            jSONObject.put("unique_id", jSONObject2.optString(com.huawei.openalliance.ad.constant.av.f22045v));
            jSONObject.put(com.huawei.openalliance.ad.constant.av.I, z10);
            jSONObject.put(com.huawei.openalliance.ad.constant.av.Z, this.V);
            if (!TextUtils.isEmpty(jSONObject2.optString("apiVer"))) {
                jSONObject.put("apiVer", jSONObject2.optString("apiVer"));
            }
            if (!TextUtils.isEmpty(jSONObject2.optString("templateId"))) {
                jSONObject.put("templateId", jSONObject2.optString("templateId"));
            }
            if (!TextUtils.isEmpty(jSONObject2.optString("slotid"))) {
                jSONObject.put("slotid", jSONObject2.optString("slotid"));
            }
            ha.i.e(context).d(com.huawei.openalliance.ad.constant.s.f22123s, jSONObject.toString(), new RemoteCallResultCallback<String>() { // from class: com.huawei.hms.ads.ag.1
                @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                public void onRemoteCallResult(String str2, CallResult<String> callResult) {
                    if (callResult.getCode() == 200) {
                        AdContentData adContentData = (AdContentData) gb.b.o(AdContentData.class, callResult.getData(), new Class[0]);
                        ag.this.Code(adContentData, str);
                        if (adContentData == null) {
                            ex.I(ag.Z, "request ad content is null");
                        }
                        acVar.Code(adContentData);
                        return;
                    }
                    ex.I(ag.Z, "request ad content, retCode: %s", Integer.valueOf(callResult.getCode()));
                    acVar.Code(null);
                }
            }, String.class);
        } catch (Throwable unused) {
            ex.I(Z, "request ad content error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code(AdContentData adContentData, String str) {
        if (adContentData != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = TextUtils.isEmpty(jSONObject.optString(com.huawei.openalliance.ad.constant.av.C)) ? "" : jSONObject.optString(com.huawei.openalliance.ad.constant.av.C);
                if (!TextUtils.isEmpty(optString)) {
                    adContentData.y(optString);
                }
                if (!TextUtils.isEmpty(jSONObject.optString("requestId"))) {
                    adContentData.r(jSONObject.optString("requestId"));
                }
                String optString2 = jSONObject.optString(com.huawei.openalliance.ad.constant.av.f22043t);
                String optString3 = jSONObject.optString("userId");
                String optString4 = jSONObject.optString(com.huawei.openalliance.ad.constant.av.f22045v);
                if (!TextUtils.isEmpty(optString2)) {
                    adContentData.V0(optString2);
                }
                if (!TextUtils.isEmpty(optString3)) {
                    adContentData.X0(optString3);
                }
                if (!TextUtils.isEmpty(optString4)) {
                    adContentData.P(optString4);
                }
                Long valueOf = Long.valueOf(jSONObject.optLong(com.huawei.openalliance.ad.constant.av.aQ));
                if (valueOf.longValue() == 0) {
                    valueOf = Long.valueOf(gb.p.b(0L, optString));
                }
                if (valueOf.longValue() != 0) {
                    adContentData.b0(valueOf.longValue());
                }
            } catch (Throwable unused) {
                ex.I(Z, "update content failed");
            }
        }
    }

    public static void Code(RemoteCallResultCallback<String> remoteCallResultCallback, String str, int i10, JsbCallBackData jsbCallBackData) {
        if (remoteCallResultCallback != null) {
            CallResult<String> callResult = new CallResult<>();
            callResult.setCode(i10);
            try {
                callResult.setData(gb.b.p(jsbCallBackData));
            } catch (Throwable th) {
                e0.i.q(th, "onCallResult ", Z);
            }
            remoteCallResultCallback.onRemoteCallResult(str, callResult);
        }
    }

    public static <T> void Code(RemoteCallResultCallback<String> remoteCallResultCallback, String str, int i10, T t10, boolean z10) {
        Code(remoteCallResultCallback, str, i10, new JsbCallBackData(t10, z10, null));
    }

    public void Code(RemoteCallResultCallback<String> remoteCallResultCallback, boolean z10) {
        Code(remoteCallResultCallback, this.Code, 1011, "", z10);
    }

    @Override // com.huawei.hms.ads.ad
    public void Code(String str) {
        this.V = str;
    }

    public boolean Code(AdContentData adContentData) {
        return adContentData != null && adContentData.D0() && jf.Z(adContentData.a1());
    }
}
