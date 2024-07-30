package fb;

import android.content.Context;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i extends m {

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, String> f28344e;

    public i(Context context, AdContentData adContentData, Map<String, String> map) {
        super(context, adContentData);
        this.f28344e = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    @Override // fb.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r10 = this;
            java.lang.String r0 = "OpenArAction"
            android.content.Context r1 = r10.f28346a
            com.huawei.openalliance.ad.inter.data.AdContentData r2 = r10.f28347b
            if (r2 != 0) goto L17
            java.lang.String r2 = "contentRecord is null"
            com.huawei.hms.ads.ex.I(r0, r2)
            java.lang.String r0 = "contentNull"
            java.lang.String r2 = ""
            r3 = 0
            com.huawei.hms.ads.cz.Code(r1, r2, r3, r0)
            goto L8e
        L17:
            java.lang.String r3 = "result:"
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r5 = 1
            r6 = 0
            java.lang.String r7 = "content"
            java.lang.String r8 = r2.L()     // Catch: org.json.JSONException -> L81
            r4.put(r7, r8)     // Catch: org.json.JSONException -> L81
            java.lang.String r7 = "templateId"
            java.lang.String r8 = r2.e0()     // Catch: org.json.JSONException -> L81
            r4.put(r7, r8)     // Catch: org.json.JSONException -> L81
            java.lang.String r7 = "slotid"
            java.lang.String r8 = r2.D()     // Catch: org.json.JSONException -> L81
            r4.put(r7, r8)     // Catch: org.json.JSONException -> L81
            java.lang.String r7 = "apiVer"
            int r8 = r2.f0()     // Catch: org.json.JSONException -> L81
            r4.put(r7, r8)     // Catch: org.json.JSONException -> L81
            ha.c r7 = ha.c.c(r1)     // Catch: org.json.JSONException -> L81
            java.lang.String r8 = "arContentVertify"
            java.lang.String r4 = r4.toString()     // Catch: org.json.JSONException -> L81
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            com.huawei.openalliance.ad.ipc.CallResult r4 = r7.b(r9, r8, r4, r6)     // Catch: org.json.JSONException -> L81
            java.lang.Object r4 = r4.getData()     // Catch: org.json.JSONException -> L81
            java.lang.String r4 = (java.lang.String) r4     // Catch: org.json.JSONException -> L81
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L81
            r7.<init>(r3)     // Catch: org.json.JSONException -> L81
            r7.append(r4)     // Catch: org.json.JSONException -> L81
            java.lang.String r3 = r7.toString()     // Catch: org.json.JSONException -> L81
            com.huawei.hms.ads.ex.V(r0, r3)     // Catch: org.json.JSONException -> L81
            boolean r3 = gb.p.f(r4)     // Catch: org.json.JSONException -> L81
            if (r3 != 0) goto L79
            java.lang.String r3 = "1"
            boolean r3 = r3.equalsIgnoreCase(r4)     // Catch: org.json.JSONException -> L81
            if (r3 == 0) goto L79
            r3 = r5
            goto L87
        L79:
            java.lang.String r3 = r2.L()     // Catch: org.json.JSONException -> L81
            com.huawei.hms.ads.cz.Code(r1, r3, r2, r4)     // Catch: org.json.JSONException -> L81
            goto L86
        L81:
            java.lang.String r3 = "isArContentPrepared JSONException"
            com.huawei.hms.ads.ex.I(r0, r3)
        L86:
            r3 = r6
        L87:
            if (r3 != 0) goto L93
            java.lang.String r1 = "ar content is not prepared"
            com.huawei.hms.ads.ex.V(r0, r1)
        L8e:
            boolean r0 = r10.d()
            return r0
        L93:
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.f28344e
            boolean r0 = com.huawei.hms.ads.ck.Code(r1, r2, r0)
            if (r0 == 0) goto La0
            java.lang.String r0 = "arDetail"
            r10.f28348c = r0
            goto La1
        La0:
            r5 = r6
        La1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.i.a():boolean");
    }
}
