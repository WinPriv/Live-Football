package ka;

import android.content.Context;

/* loaded from: classes2.dex */
public final class m0 extends y {
    public m0() {
        super("handleUriAction");
    }

    @Override // ka.y, ka.b2
    public final String a(Context context, String str, String str2, String str3) {
        return String.valueOf(f(context, str, str3));
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        if (f(context, str, str3)) {
            e(aVar);
        } else {
            c(aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r10)
            java.lang.String r10 = "content_id"
            java.lang.String r10 = r0.getString(r10)
            java.lang.String r1 = "click_action_type"
            int r1 = r0.getInt(r1)
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r9 = j7.r.n(r8, r9, r10, r0)
            java.lang.String r10 = "CmdHandleUriAction"
            r2 = 0
            if (r9 != 0) goto L26
            boolean r8 = ka.n7.d()
            if (r8 == 0) goto L25
            java.lang.String r8 = "content record is empty"
            ka.n7.b(r10, r8)
        L25:
            return r2
        L26:
            r3 = 0
            r4 = 1
            java.lang.String r5 = "param_content_ext"
            org.json.JSONObject r0 = r0.getJSONObject(r5)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L68
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = com.huawei.openalliance.ad.ppskit.utils.y0.o(r3, r0, r5, r6)     // Catch: java.lang.Throwable -> L68
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = "custom_data_key"
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = "user_id_key"
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L67
            java.lang.String r6 = "show_id_ext"
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L67
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L67
            r9.Y(r3)     // Catch: java.lang.Throwable -> L67
            r9.b0(r5)     // Catch: java.lang.Throwable -> L67
            r9.V1(r6)     // Catch: java.lang.Throwable -> L67
            boolean r3 = com.huawei.openalliance.ad.ppskit.utils.d0.m(r8)     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L6e
            r9.i2(r4)     // Catch: java.lang.Throwable -> L67
            goto L6e
        L67:
            r3 = r0
        L68:
            java.lang.String r0 = "param content ext is null, or rewardVerifyConfig is null"
            ka.n7.g(r10, r0)
            r0 = r3
        L6e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            ka.ii r8 = a0.a.M(r8, r9, r0, r10)
            if (r8 == 0) goto L81
            r8.f31311e = r4
            boolean r8 = r8.a()
            if (r8 == 0) goto L81
            return r4
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.m0.f(android.content.Context, java.lang.String, java.lang.String):boolean");
    }
}
