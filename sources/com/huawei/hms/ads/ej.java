package com.huawei.hms.ads;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.jsb.inner.data.H5Ad;
import com.huawei.hms.ads.jsb.inner.data.JsbCallBackData;
import com.huawei.openalliance.ad.beans.metadata.ImpEX;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.FeedbackInfo;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import ga.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ej extends af {

    /* loaded from: classes2.dex */
    public static class a implements ga.j {
        private int B;
        private String Code;
        private String I;
        private Context V;
        private RemoteCallResultCallback<String> Z;

        public a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback, String str2, int i10) {
            this.Code = str;
            this.V = context;
            this.Z = remoteCallResultCallback;
            this.I = str2;
            this.B = i10;
        }

        private ArrayList<FeedbackInfo> Code(com.huawei.openalliance.ad.inter.data.e eVar) {
            if (!androidx.transition.n.h(eVar.f_()) || androidx.transition.n.h(eVar.l()) || androidx.transition.n.h(eVar.o()) || eVar.l().size() != eVar.o().size()) {
                return null;
            }
            ArrayList<FeedbackInfo> arrayList = new ArrayList<>();
            for (int i10 = 0; i10 < eVar.l().size(); i10++) {
                FeedbackInfo feedbackInfo = new FeedbackInfo();
                feedbackInfo.Code(eVar.l().get(i10));
                feedbackInfo.m(gb.p.b(-1L, eVar.o().get(i10)));
                feedbackInfo.l(1);
                arrayList.add(feedbackInfo);
            }
            return arrayList;
        }

        private <T> void I(List<T> list) {
            if (androidx.transition.n.h(list)) {
                ex.V("JsbReqNativeAd", " ads list is empty.");
                ag.Code(this.Z, this.I, 1005, null, true);
            } else {
                ag.Code(this.Z, this.I, 1000, list, true);
            }
        }

        private void V(List<com.huawei.openalliance.ad.inter.data.e> list) {
            ArrayList arrayList = new ArrayList();
            Code(list, arrayList);
            I(arrayList);
        }

        @Override // ga.j
        public void Code(int i10) {
            ag.Code(this.Z, this.I, bs.Code(i10), null, true);
        }

        private void Code(List<com.huawei.openalliance.ad.inter.data.e> list) {
            ArrayList arrayList = new ArrayList();
            Code(list, arrayList);
            I(arrayList);
        }

        private <T> void Code(List<com.huawei.openalliance.ad.inter.data.e> list, List<T> list2) {
            if (androidx.transition.n.h(list)) {
                return;
            }
            for (com.huawei.openalliance.ad.inter.data.e eVar : list) {
                if (eVar != null && eVar.m() != null) {
                    int i10 = this.B;
                    if (i10 == 3) {
                        AdContentData m10 = eVar.m();
                        m10.G(m10.d0());
                        if (!androidx.transition.n.h(Code(eVar))) {
                            m10.G(Code(eVar));
                        }
                        list2.add(eVar.m());
                    } else if (i10 == 2) {
                        list2.add(new H5Ad(eVar.m()));
                    }
                }
            }
        }

        @Override // ga.j
        public void Code(Map<String, List<com.huawei.openalliance.ad.inter.data.e>> map) {
            if (a0.a.r(map)) {
                ex.Code("JsbReqNativeAd", " ads map is empty.");
                ag.Code(this.Z, this.I, 1005, null, true);
                return;
            }
            List<com.huawei.openalliance.ad.inter.data.e> list = map.get(this.Code);
            int i10 = this.B;
            if (i10 == 2) {
                Code(list);
            } else {
                if (i10 != 3) {
                    return;
                }
                V(list);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements d {
        private String Code;
        private RemoteCallResultCallback<String> V;

        public b(RemoteCallResultCallback<String> remoteCallResultCallback, String str) {
            this.V = remoteCallResultCallback;
            this.Code = str;
        }

        @Override // ga.d
        public void Code(List<String> list) {
            ag.Code(this.V, this.Code, 200, new JsbCallBackData(gb.b.p(list), false, ah.Code));
        }
    }

    public ej() {
        super(aj.V);
    }

    private List<Integer> Code(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                int optInt = jSONArray.optInt(i10, -111111);
                if (optInt != -111111) {
                    arrayList.add(Integer.valueOf(optInt));
                }
            }
        }
        return arrayList;
    }

    private String F(String str) {
        HashMap hashMap = new HashMap();
        Map map = (Map) gb.b.o(Map.class, str, new Class[0]);
        if (map != null && map.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                if (entry != null) {
                    arrayList.add(new ImpEX((String) entry.getKey(), gb.p.i((String) entry.getValue())));
                }
            }
            if (arrayList.size() > 0) {
                hashMap.put("contentBundle", arrayList);
            }
        }
        if (hashMap.size() > 0) {
            return gb.b.p(hashMap);
        }
        return null;
    }

    private List<String> V(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String optString = jSONArray.optString(i10);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(optString);
                }
            }
        }
        return arrayList;
    }

    @Override // com.huawei.hms.ads.af
    public void Code(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("slotId");
        String optString2 = jSONObject.optString(com.huawei.openalliance.ad.constant.av.U);
        JSONArray optJSONArray = jSONObject.optJSONArray(com.huawei.openalliance.ad.constant.av.W);
        int optInt = jSONObject.optInt(com.huawei.openalliance.ad.constant.av.aK, 2);
        int optInt2 = jSONObject.optInt("adType", 3);
        int optInt3 = jSONObject.optInt(com.huawei.openalliance.ad.constant.av.f22027b, -111111);
        int optInt4 = jSONObject.optInt(com.huawei.openalliance.ad.constant.av.f22028c, -111111);
        int optInt5 = jSONObject.optInt(com.huawei.openalliance.ad.constant.av.f22029d, -111111);
        int optInt6 = jSONObject.optInt(com.huawei.openalliance.ad.constant.av.f22030e, 4);
        int optInt7 = jSONObject.optInt(com.huawei.openalliance.ad.constant.av.f22031g, -111111);
        int optInt8 = jSONObject.optInt("maxCount", 0);
        List<String> V = V(jSONObject.optJSONArray(com.huawei.openalliance.ad.constant.av.f));
        boolean optBoolean = jSONObject.optBoolean(com.huawei.openalliance.ad.constant.av.aD, true);
        boolean optBoolean2 = jSONObject.optBoolean(com.huawei.openalliance.ad.constant.av.aC, false);
        boolean optBoolean3 = jSONObject.optBoolean(com.huawei.openalliance.ad.constant.av.aE, false);
        RequestOptions Code = cj.Code(V(context, str));
        fa.o oVar = new fa.o(context, new String[]{optString}, optInt2, V);
        if (optInt7 != -111111) {
            oVar.f28274p = Integer.valueOf(optInt7);
        }
        if (optInt3 != -111111) {
            oVar.f28280v = Integer.valueOf(optInt3);
        }
        if (optInt4 != -111111) {
            oVar.f28281w = Integer.valueOf(optInt4);
        }
        if (optInt5 != -111111) {
            oVar.f28282x = Integer.valueOf(optInt5);
        }
        if (optInt8 > 0) {
            oVar.f28279u = optInt8;
        }
        oVar.f28273n = Code;
        App app = Code.getApp();
        if (app != null) {
            oVar.D = app;
        }
        oVar.f28266g = F(optString2);
        oVar.G = Z(optString2);
        oVar.E = Code(optJSONArray);
        oVar.f28268i = optBoolean;
        oVar.f28269j = optBoolean2;
        oVar.f28262b = new b(remoteCallResultCallback, this.Code);
        oVar.f28265e = new a(context, optString, remoteCallResultCallback, this.Code, optInt);
        oVar.F = 3;
        oVar.o = I(str);
        ex.V("o", "setSupportTptAd: %s", Boolean.valueOf(optBoolean3));
        oVar.f28270k = optBoolean3;
        oVar.a(optInt6);
    }
}
