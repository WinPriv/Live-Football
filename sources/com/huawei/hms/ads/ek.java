package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.hms.ads.jsb.inner.data.H5Ad;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import fa.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ek extends af {

    /* loaded from: classes2.dex */
    public static class a implements ga.l {
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

        private List<H5Ad> Code(List<com.huawei.openalliance.ad.inter.data.f> list) {
            AdContentData m10;
            ArrayList arrayList = new ArrayList(4);
            if (list != null && list.size() > 0) {
                for (com.huawei.openalliance.ad.inter.data.f fVar : list) {
                    if (fVar != null && (m10 = fVar.m()) != null) {
                        arrayList.add(new H5Ad(m10));
                    }
                }
            }
            return arrayList;
        }

        @Override // ga.l
        public void I(int i10) {
            ag.Code(this.Z, this.I, bs.Code(i10), null, true);
        }

        @Override // ga.l
        public void Code(Map<String, List<com.huawei.openalliance.ad.inter.data.f>> map) {
            if (map != null && map.size() > 0) {
                List<H5Ad> Code = Code(map.get(this.Code));
                if (Code.size() > 0) {
                    ag.Code(this.Z, this.I, 1000, gb.b.p(Code), true);
                    return;
                }
            }
            ex.V("JsbReqPlacementAd", " ads map is empty.");
            ag.Code(this.Z, this.I, 1005, null, true);
        }
    }

    public ek() {
        super(aj.B);
    }

    @Override // com.huawei.hms.ads.af
    public void Code(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("slotId");
        String optString = jSONObject.optString(com.huawei.openalliance.ad.constant.av.U);
        int optInt = jSONObject.optInt(com.huawei.openalliance.ad.constant.av.f22030e, 4);
        int optInt2 = jSONObject.optInt("maxCount", 1);
        int optInt3 = jSONObject.optInt(com.huawei.openalliance.ad.constant.av.f22033i, 300);
        RequestOptions V = V(context, str);
        s.b bVar = new s.b(context);
        bVar.f28314e = false;
        bVar.f28311b = (String[]) Arrays.copyOf(new String[]{string}, 1);
        bVar.f28312c = optInt;
        bVar.f28313d = optString;
        bVar.f28315g = V;
        bVar.f28317i = 3;
        bVar.f28316h = I(str);
        fa.s sVar = new fa.s(bVar);
        if (optInt3 > 0) {
            sVar.f28297d = new a(context, string, remoteCallResultCallback, this.Code);
            sVar.a(300, 1);
            return;
        }
        a aVar = new a(context, string, remoteCallResultCallback, this.Code);
        if (optInt2 > 0) {
            sVar.f28297d = aVar;
            sVar.a(optInt3, 0);
        } else {
            sVar.f28297d = aVar;
            sVar.a(optInt3, optInt2);
        }
    }
}
