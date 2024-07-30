package com.huawei.hms.ads;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.activity.ComplianceActivity;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ao extends ag {
    private static final String B = "anchorViewX";
    private static final String C = "anchorViewY";
    private static final int D = -1;
    private static final String F = "anchorHeight";
    private static final String S = "anchorWidth";
    private static final String Z = "JsbStartComplianceActivity";

    /* loaded from: classes2.dex */
    public static class a implements ac {
        private Context Code;
        private RemoteCallResultCallback<String> I;
        private String V;
        private String Z;

        public a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback, String str2) {
            this.Code = context;
            this.V = str;
            this.I = remoteCallResultCallback;
            this.Z = str2;
        }

        @Override // com.huawei.hms.ads.ac
        public void Code(AdContentData adContentData) {
            if (adContentData == null || androidx.transition.n.h(adContentData.i0())) {
                ex.I(ao.Z, "content is null or compliance is null.");
            }
            try {
                JSONObject jSONObject = new JSONObject(this.V);
                int optInt = jSONObject.optInt(ao.B, -1);
                int optInt2 = jSONObject.optInt(ao.C, -1);
                if (-1 == optInt || -1 == optInt2) {
                    ex.I(ao.Z, "invalid anchor loc");
                }
                int optInt3 = jSONObject.optInt(ao.S, -1);
                int optInt4 = jSONObject.optInt(ao.F, -1);
                if (-1 == optInt3 || -1 == optInt4) {
                    ex.I(ao.Z, "invalid anchor size");
                }
                int[] iArr = {optInt, optInt2};
                int[] iArr2 = {optInt3, optInt4};
                if (ex.Code()) {
                    ex.Code(ao.Z, "parse param complete, anchor loc (%s, %s), anchor size (%s, %s)", Integer.valueOf(optInt), Integer.valueOf(optInt2), Integer.valueOf(optInt3), Integer.valueOf(optInt4));
                }
                ComplianceActivity.N = new b(this.I, this.Z);
                ComplianceActivity.n(this.Code, iArr, iArr2, adContentData, true);
            } catch (Throwable th) {
                ex.I(ao.Z, "parse param ex: %s", th.getClass().getSimpleName());
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements x9.e {
        private String Code;
        private RemoteCallResultCallback<String> V;

        public b(RemoteCallResultCallback<String> remoteCallResultCallback, String str) {
            this.V = remoteCallResultCallback;
            this.Code = str;
        }

        @Override // x9.e
        public void Code() {
            ex.V(ao.Z, "onActivityShow");
            ag.Code(this.V, this.Code, 1000, 5001, false);
        }

        @Override // x9.e
        public void V() {
            ex.V(ao.Z, "onActivityFinish");
            ag.Code(this.V, this.Code, 1000, 5002, false);
            ComplianceActivity.N = null;
        }
    }

    public ao() {
        super(aj.f21558z);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Code(context, str, true, (ac) new a(context, str, remoteCallResultCallback, this.Code));
            } catch (Throwable th) {
                ex.I(Z, "execute ex: %s", th.getClass().getSimpleName());
            }
        }
    }
}
