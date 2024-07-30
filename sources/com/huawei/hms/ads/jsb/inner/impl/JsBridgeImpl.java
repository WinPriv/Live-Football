package com.huawei.hms.ads.jsb.inner.impl;

import a3.k;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.transition.n;
import com.huawei.hms.ads.ad;
import com.huawei.hms.ads.ag;
import com.huawei.hms.ads.ai;
import com.huawei.hms.ads.annotation.AllApi;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.jsb.JsbConfig;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import e0.i;
import gb.c0;
import org.json.JSONObject;

@AllApi
/* loaded from: classes2.dex */
public class JsBridgeImpl {
    private static final String Code = "JsBridgeImpl";

    /* loaded from: classes2.dex */
    public static class a<T> implements Runnable {
        private ad B;
        private final Context Code;
        private final String I;
        private final String V;
        private final RemoteCallResultCallback<String> Z;

        public a(Context context, ad adVar, String str, String str2, RemoteCallResultCallback<String> remoteCallResultCallback) {
            this.Code = context;
            this.V = str;
            this.I = str2;
            this.Z = remoteCallResultCallback;
            this.B = adVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            JsBridgeImpl.V(this.Code, this.B, this.V, this.I, this.Z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void V(Context context, ad adVar, String str, String str2, RemoteCallResultCallback<String> remoteCallResultCallback) {
        if (adVar != null) {
            ex.V(Code, "call method: " + str);
            if (ex.Code()) {
                ex.Code(Code, "param: %s", n.e(str2));
            }
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String optString = jSONObject.optString("content");
                adVar.Code(jSONObject.optString("url"));
                adVar.V(jSONObject.optString("cid"));
                adVar.execute(context, optString, remoteCallResultCallback);
                return;
            } catch (Throwable th) {
                ex.I(Code, "call method %s, ex: %s", str, th.getClass().getSimpleName());
                ag.Code(remoteCallResultCallback, str, 1011, th.getClass().getSimpleName() + w.bE + th.getMessage(), true);
                ex.Code(3, th);
                return;
            }
        }
        String l10 = k.l("api for ", str, " is not found");
        ex.V(Code, "call " + l10);
        ag.Code(remoteCallResultCallback, str, 1011, l10, true);
    }

    @AllApi
    public static void initConfig(Context context, JsbConfig jsbConfig) {
        com.huawei.hms.ads.jsb.a.Code(context).Code(jsbConfig);
    }

    @AllApi
    public static String invoke(Context context, String str, String str2) {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        int i10 = 1011;
        if (context != null) {
            try {
            } catch (Throwable th) {
                ex.I(Code, "call method : ".concat(th.getClass().getSimpleName()));
                obj = "call " + str + " " + th.getClass().getSimpleName() + w.bE + th.getMessage();
            }
            if (!TextUtils.isEmpty(str2)) {
                ad Code2 = ai.Code().Code(str);
                if (Code2 != null) {
                    ex.V(Code, "call api: " + str);
                    obj = Code2.Code(context.getApplicationContext(), new JSONObject(str2).optString("content"));
                    i10 = 1000;
                } else {
                    obj = null;
                }
                try {
                    jSONObject.put("code", i10);
                    jSONObject.put("data", obj);
                } catch (Throwable th2) {
                    i.q(th2, "call method : ", Code);
                }
                return jSONObject.toString();
            }
        }
        ex.Z(Code, "param is invalid, please check it!");
        jSONObject.put("msg", "invalid params");
        jSONObject.put("code", 1011);
        return jSONObject.toString();
    }

    @AllApi
    public static void invoke(Context context, String str, String str2, RemoteCallResultCallback<String> remoteCallResultCallback, Class<String> cls) {
        if (context == null || TextUtils.isEmpty(str2)) {
            ex.Z(Code, "param is invalid, please check it!");
            ag.Code(remoteCallResultCallback, str, 1001, null, true);
            return;
        }
        ad Code2 = ai.Code().Code(str);
        c0.a aVar = c0.a.IO;
        if (Code2 != null) {
            aVar = Code2.Code();
            if (ai.Code().Code(str, context)) {
                Code2.Code((Activity) context);
            }
        }
        c0.b(new a(context.getApplicationContext(), Code2, str, str2, remoteCallResultCallback), aVar);
    }
}
