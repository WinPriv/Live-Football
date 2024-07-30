package com.huawei.hms.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.Location;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import gb.b0;
import gb.c0;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class jd {
    public static int Code = 0;
    private static final String V = "AdRequester";

    /* loaded from: classes2.dex */
    public static class a<T> implements RemoteCallResultCallback<T> {
        private RemoteCallResultCallback<T> Code;
        private Context V;

        public a(Context context, RemoteCallResultCallback<T> remoteCallResultCallback) {
            this.Code = remoteCallResultCallback;
            this.V = context.getApplicationContext();
        }

        @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
        public void onRemoteCallResult(String str, CallResult<T> callResult) {
            if (callResult.getCode() == 201) {
                try {
                    ec.Code(this.V).I(new JSONObject(callResult.getMsg()).optInt(com.huawei.openalliance.ad.constant.ba.f22055c, 0));
                    return;
                } catch (JSONException unused) {
                    ex.I(jd.V, "parse ad config JSONException");
                    return;
                }
            }
            RemoteCallResultCallback<T> remoteCallResultCallback = this.Code;
            if (remoteCallResultCallback != null) {
                remoteCallResultCallback.onRemoteCallResult(str, callResult);
            }
        }
    }

    private static List<String> I() {
        try {
            if (g.V() != null) {
                return g.V().Code((Bundle) null);
            }
        } catch (Throwable th) {
            ex.V(V, "get blackTptIdList err: %s", th.getClass().getSimpleName());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long V(Context context) {
        int i10;
        ec Code2 = ec.Code(context);
        if (Z(context) && (i10 = Code) <= 10) {
            Code = i10 + 1;
            return 0L;
        }
        long i11 = Code2.i();
        if (I(context)) {
            i11 = Code2.v();
        }
        return i11 * 60000;
    }

    private static boolean Z(Context context) {
        if (HiAd.c(context).f22226k) {
            return true;
        }
        return false;
    }

    private static Boolean Code(Boolean bool) {
        return bool != null ? bool : Boolean.valueOf(com.huawei.openalliance.ad.ppskit.utils.g.a());
    }

    private static boolean I(Context context) {
        return !TextUtils.isEmpty(ec.Code(context).u());
    }

    public static /* synthetic */ List V() {
        return I();
    }

    public static void Code() {
        Code = 0;
    }

    private static void Code(final Context context, final AdSlotParam adSlotParam) {
        c0.a(new Runnable() { // from class: com.huawei.hms.ads.jd.1
            /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:11:0x002b, B:13:0x0031, B:18:0x0054, B:19:0x009d, B:23:0x0037, B:25:0x003d, B:29:0x0049, B:30:0x005b), top: B:10:0x002b }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    r7 = this;
                    com.huawei.openalliance.ad.beans.parameter.AdSlotParam r0 = com.huawei.openalliance.ad.beans.parameter.AdSlotParam.this
                    if (r0 == 0) goto Lc4
                    java.util.List r0 = r0.f()
                    if (r0 == 0) goto Lc4
                    int r1 = r0.size()
                    if (r1 <= 0) goto Lc4
                    android.content.Context r1 = r2
                    com.huawei.hms.ads.ec r1 = com.huawei.hms.ads.ec.Code(r1)
                    long r1 = r1.j()
                    android.content.Context r3 = r2
                    long r3 = com.huawei.hms.ads.jd.Code(r3)
                    long r5 = java.lang.System.currentTimeMillis()
                    long r5 = r5 - r1
                    int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                    if (r1 <= 0) goto Lc4
                    r1 = 1
                    r2 = 0
                    boolean r3 = gb.r0.f()     // Catch: java.lang.Throwable -> Lb0
                    if (r3 != 0) goto L5b
                    android.content.Context r3 = r2     // Catch: java.lang.Throwable -> Lb0
                    if (r3 != 0) goto L37
                L35:
                    r3 = r2
                    goto L51
                L37:
                    java.lang.Integer r3 = gb.r0.o(r3)     // Catch: java.lang.Throwable -> Lb0
                    if (r3 == 0) goto L49
                    int r3 = r3.intValue()     // Catch: java.lang.Throwable -> Lb0
                    r4 = 30456100(0x1d0b924, float:7.6672797E-38)
                    if (r3 >= r4) goto L47
                    goto L49
                L47:
                    r3 = r1
                    goto L51
                L49:
                    java.lang.String r3 = "HiAdTools"
                    java.lang.String r4 = "hms version is too low to support sdkType."
                    com.huawei.hms.ads.ex.V(r3, r4)     // Catch: java.lang.Throwable -> Lb0
                    goto L35
                L51:
                    if (r3 == 0) goto L54
                    goto L5b
                L54:
                    java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> Lb0
                    java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lb0
                    goto L9d
                L5b:
                    org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb0
                    r3.<init>()     // Catch: java.lang.Throwable -> Lb0
                    java.lang.String r4 = "slotid"
                    java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> Lb0
                    r3.put(r4, r0)     // Catch: java.lang.Throwable -> Lb0
                    java.lang.String r0 = "sdk_type"
                    android.content.Context r4 = r2     // Catch: java.lang.Throwable -> Lb0
                    java.lang.Integer r4 = gb.z.n(r4)     // Catch: java.lang.Throwable -> Lb0
                    r3.put(r0, r4)     // Catch: java.lang.Throwable -> Lb0
                    java.lang.String r0 = "uiEngineVer"
                    java.lang.String r4 = com.huawei.hms.ads.g.Code()     // Catch: java.lang.Throwable -> Lb0
                    r3.put(r0, r4)     // Catch: java.lang.Throwable -> Lb0
                    java.lang.String r0 = "sha256"
                    android.content.Context r4 = r2     // Catch: java.lang.Throwable -> Lb0
                    com.huawei.hms.ads.ec r4 = com.huawei.hms.ads.ec.Code(r4)     // Catch: java.lang.Throwable -> Lb0
                    java.lang.String r4 = r4.al()     // Catch: java.lang.Throwable -> Lb0
                    r3.put(r0, r4)     // Catch: java.lang.Throwable -> Lb0
                    java.lang.String r0 = "blackIdList"
                    java.util.List r4 = com.huawei.hms.ads.jd.V()     // Catch: java.lang.Throwable -> Lb0
                    java.lang.String r4 = gb.b.p(r4)     // Catch: java.lang.Throwable -> Lb0
                    r3.put(r0, r4)     // Catch: java.lang.Throwable -> Lb0
                    java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> Lb0
                L9d:
                    android.content.Context r3 = r2     // Catch: java.lang.Throwable -> Lb0
                    ha.i r3 = ha.i.e(r3)     // Catch: java.lang.Throwable -> Lb0
                    java.lang.String r4 = "reqConfig"
                    com.huawei.hms.ads.jd$1$1 r5 = new com.huawei.hms.ads.jd$1$1     // Catch: java.lang.Throwable -> Lb0
                    r5.<init>()     // Catch: java.lang.Throwable -> Lb0
                    java.lang.Class<com.huawei.openalliance.ad.beans.server.AppConfigRsp> r6 = com.huawei.openalliance.ad.beans.server.AppConfigRsp.class
                    r3.d(r4, r0, r5, r6)     // Catch: java.lang.Throwable -> Lb0
                    goto Lc4
                Lb0:
                    r0 = move-exception
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    java.lang.Class r0 = r0.getClass()
                    java.lang.String r0 = r0.getSimpleName()
                    r1[r2] = r0
                    java.lang.String r0 = "AdRequester"
                    java.lang.String r2 = "requestConfig err: %s"
                    com.huawei.hms.ads.ex.I(r0, r2, r1)
                Lc4:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.ads.jd.AnonymousClass1.run():void");
            }
        });
    }

    public static <T> void Code(Context context, String str, AdSlotParam adSlotParam, String str2, RemoteCallResultCallback<T> remoteCallResultCallback, Class<T> cls) {
        Context applicationContext = context.getApplicationContext();
        JSONObject jSONObject = new JSONObject();
        a aVar = new a(applicationContext, remoteCallResultCallback);
        try {
            adSlotParam.k(ec.Code(applicationContext).r());
            adSlotParam.y(ec.Code(applicationContext).g());
            adSlotParam.m(HiAd.c(context).f22225j);
            adSlotParam.D(gb.z.n(context));
            adSlotParam.C(g.Code());
            RequestOptions a10 = adSlotParam.a();
            if (a10 == null) {
                a10 = new RequestOptions();
                adSlotParam.i(a10);
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
            if (TextUtils.isEmpty(a10.getConsent())) {
                a10.Code(defaultSharedPreferences.getString(com.huawei.openalliance.ad.constant.w.f22150cd, ""));
            }
            a10.V(defaultSharedPreferences.getString(com.huawei.openalliance.ad.constant.w.ce, ""));
            a10.I(defaultSharedPreferences.getString(com.huawei.openalliance.ad.constant.w.cf, ""));
            Location a11 = gb.e.a(applicationContext, a10, adSlotParam.z() != null ? adSlotParam.z().a() : null);
            adSlotParam.j(a11);
            aa.a f = a11.f();
            adSlotParam.e(Integer.valueOf(f.f391a));
            adSlotParam.u(Integer.valueOf(f.f392b));
            adSlotParam.o(Integer.valueOf(f.f393c));
            if (!Code(applicationContext, applicationContext.getPackageName())) {
                adSlotParam.l();
            }
            if (cl.Code(context).V()) {
                adSlotParam.s(gb.a.a(context));
            }
            if (ec.Code(context).ae() && !TextUtils.equals(str, com.huawei.openalliance.ad.constant.w.cg)) {
                adSlotParam.d(je.Code(context).Code());
            }
            a10.Code(Code(a10.D()));
            jSONObject.put(com.huawei.openalliance.ad.constant.ba.I, gb.b.p(adSlotParam));
            jSONObject.put("content", str2);
            jSONObject.put(com.huawei.openalliance.ad.constant.ba.K, System.currentTimeMillis());
            ha.i.e(applicationContext).d(str, jSONObject.toString(), aVar, cls);
        } catch (JSONException unused) {
            ex.I(V, "requestAd JSONException");
            CallResult<T> callResult = new CallResult<>();
            callResult.setCode(-1);
            callResult.setMsg("requestAd JSONException");
            aVar.onRemoteCallResult(str, callResult);
        }
        Code(applicationContext, adSlotParam);
    }

    private static boolean Code(Context context, String str) {
        return com.huawei.openalliance.ad.constant.ct.Code(str, b0.a(context, str));
    }
}
