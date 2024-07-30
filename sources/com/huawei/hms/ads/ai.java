package com.huawei.hms.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ai {
    private static final String Code = "JsbCmdManager";
    private static final byte[] I = new byte[0];
    private static ai V;
    private final List<String> B;
    private final Map<String, Class<? extends ad>> C;
    private final Map<String, ad> Z = new HashMap();

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
            ai.V(this.Code, this.B, this.V, this.I, this.Z);
        }
    }

    private ai() {
        ArrayList arrayList = new ArrayList();
        this.B = arrayList;
        HashMap hashMap = new HashMap();
        this.C = hashMap;
        hashMap.put(aj.V, androidx.transition.n.a(com.huawei.openalliance.ad.constant.w.bv));
        hashMap.put(aj.F, androidx.transition.n.a(com.huawei.openalliance.ad.constant.w.bv));
        hashMap.put(aj.I, androidx.transition.n.a("com.huawei.openalliance.ad.jsb.JsbRewardProxy"));
        hashMap.put(aj.Z, androidx.transition.n.a("com.huawei.openalliance.ad.jsb.JsbInterstitialProxy"));
        hashMap.put(aj.B, androidx.transition.n.a(com.huawei.openalliance.ad.constant.w.bA));
        hashMap.put(aj.C, ae.class);
        hashMap.put(aj.f21538c, bb.class);
        hashMap.put(aj.f21539d, bc.class);
        hashMap.put(aj.S, bg.class);
        hashMap.put(aj.L, be.class);
        hashMap.put(aj.D, bf.class);
        hashMap.put(aj.f21536a, ba.class);
        hashMap.put(aj.f21537b, at.class);
        hashMap.put(aj.f21540e, az.class);
        hashMap.put(aj.f21543i, ay.class);
        hashMap.put(aj.f21541g, av.class);
        hashMap.put(aj.f21542h, aw.class);
        hashMap.put(aj.f21544j, androidx.transition.n.a("com.huawei.openalliance.ad.jsb.JsbRewardProxy"));
        hashMap.put(aj.f21545k, androidx.transition.n.a("com.huawei.openalliance.ad.jsb.JsbInterstitialProxy"));
        hashMap.put(aj.f21547m, bq.class);
        hashMap.put(aj.f21546l, bp.class);
        hashMap.put(aj.o, bk.class);
        hashMap.put(aj.f21548n, bj.class);
        hashMap.put(aj.f21549p, bo.class);
        hashMap.put(aj.f21550q, bm.class);
        hashMap.put(aj.f21551r, bn.class);
        hashMap.put(aj.f21552s, bl.class);
        hashMap.put(aj.Code, an.class);
        hashMap.put(aj.f21553t, am.class);
        hashMap.put(aj.f21557x, bd.class);
        hashMap.put(aj.y, bh.class);
        hashMap.put(aj.f, au.class);
        if (androidx.transition.n.a(com.huawei.openalliance.ad.constant.w.bB) != null) {
            hashMap.put(aj.f21554u, ap.class);
            hashMap.put(aj.f21555v, ar.class);
            hashMap.put(aj.f21556w, aq.class);
        }
        hashMap.put(aj.f21558z, ao.class);
        hashMap.put(aj.A, ak.class);
        hashMap.put(aj.E, al.class);
        arrayList.add(aj.C);
        arrayList.add(aj.f21544j);
        arrayList.add(aj.f21545k);
        arrayList.add(aj.F);
    }

    public static String V(String str) {
        return new JSONObject(str).optString(com.huawei.openalliance.ad.constant.av.X);
    }

    public ad Code(String str) {
        StringBuilder sb2;
        String sb3;
        if (!TextUtils.isEmpty(str)) {
            ad adVar = this.Z.get(str);
            if (adVar == null) {
                ex.Code(Code, "create command %s", str);
                Class<? extends ad> cls = this.C.get(str);
                if (cls == null) {
                    sb2 = new StringBuilder("no class found for cmd: ");
                } else {
                    try {
                        adVar = cls.newInstance();
                    } catch (InstantiationException unused) {
                        ex.I(Code, "get cmd %s Instantiation Exception", str);
                    } catch (Throwable th) {
                        ex.I(Code, "get cmd %s: %s", str, th.getClass().getSimpleName());
                    }
                    if (adVar == null) {
                        sb2 = new StringBuilder("no instance created for cmd: ");
                    } else {
                        this.Z.put(str, adVar);
                    }
                }
                sb2.append(str);
                sb3 = sb2.toString();
            }
            return adVar;
        }
        sb3 = "get cmd, method is empty";
        ex.I(Code, sb3);
        return null;
    }

    public static ai Code() {
        ai aiVar;
        synchronized (I) {
            if (V == null) {
                V = new ai();
            }
            aiVar = V;
        }
        return aiVar;
    }

    public void V() {
        this.Z.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void V(Context context, ad adVar, String str, String str2, RemoteCallResultCallback<String> remoteCallResultCallback) {
        if (adVar == null) {
            String l10 = a3.k.l("api for ", str, " is not found");
            ex.V(Code, "call " + l10);
            ag.Code(remoteCallResultCallback, str, -1, l10, true);
            return;
        }
        ex.V(Code, "call method: " + str);
        if (ex.Code()) {
            ex.Code(Code, "param: %s", androidx.transition.n.e(str2));
        }
        try {
            adVar.execute(context, str2, remoteCallResultCallback);
        } catch (Throwable th) {
            ex.I(Code, "call method %s, ex: %s", str, th.getClass().getSimpleName());
            ag.Code(remoteCallResultCallback, str, -1, th.getClass().getSimpleName() + com.huawei.openalliance.ad.constant.w.bE + th.getMessage(), true);
            ex.Code(3, th);
        }
    }

    public boolean Code(String str, Context context) {
        return (context instanceof Activity) && this.B.contains(str);
    }
}
