package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.hms.ads.jsb.inner.data.H5Ad;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class el extends af {

    /* loaded from: classes2.dex */
    public static class a implements ga.m {
        private String Code;
        private String I;
        private Context V;
        private RemoteCallResultCallback<String> Z;

        public a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback, String str2) {
            this.Code = str;
            this.V = context;
            this.Z = remoteCallResultCallback;
            this.I = str2;
        }

        private List<H5Ad> Code(List<com.huawei.openalliance.ad.inter.data.g> list) {
            ArrayList arrayList = new ArrayList(4);
            if (list != null && list.size() > 0) {
                for (com.huawei.openalliance.ad.inter.data.g gVar : list) {
                    if (gVar != null) {
                        arrayList.add(new H5Ad(gVar.m()));
                    }
                }
            }
            return arrayList;
        }

        @Override // ga.m
        public void Code(int i10) {
            ag.Code(this.Z, this.I, bs.Code(i10), null, true);
        }

        @Override // ga.m
        public void Code(Map<String, List<com.huawei.openalliance.ad.inter.data.g>> map) {
            if (map != null && map.size() > 0) {
                List<H5Ad> Code = Code(map.get(this.Code));
                if (Code.size() > 0) {
                    ag.Code(this.Z, this.I, 1000, gb.b.p(Code), true);
                    return;
                }
            }
            ex.V("JsbReqRewardAd", " ads map is empty.");
            ag.Code(this.Z, this.I, 1005, null, true);
        }
    }

    public el() {
        super(aj.I);
    }

    @Override // com.huawei.hms.ads.af
    public void Code(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("slotId");
        String optString2 = jSONObject.optString(com.huawei.openalliance.ad.constant.av.U);
        int optInt = jSONObject.optInt(com.huawei.openalliance.ad.constant.av.f22030e, 4);
        RequestOptions V = V(context, str);
        fa.v vVar = new fa.v(context, new String[]{optString});
        vVar.f28325e = V;
        App app = V.getApp();
        if (app != null) {
            vVar.o = app;
        }
        vVar.f28334p = 3;
        vVar.f28335q = Z(optString2);
        vVar.f = I(str);
        vVar.f28324d = new a(context, optString, remoteCallResultCallback, this.Code);
        vVar.a(optInt);
    }
}
