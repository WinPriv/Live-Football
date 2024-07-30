package ka;

import android.content.Context;

/* loaded from: classes2.dex */
public final class y9 extends com.huawei.openalliance.ad.ppskit.net.http.c {

    /* renamed from: c, reason: collision with root package name */
    public final Context f32215c;

    /* renamed from: b, reason: collision with root package name */
    public final String f32214b = "POST";

    /* renamed from: d, reason: collision with root package name */
    public boolean f32216d = false;

    public y9(Context context) {
        this.f32215c = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r10, com.huawei.openalliance.ad.ppskit.beans.base.ReqBean r11) {
        /*
            r9 = this;
            java.lang.String r0 = com.huawei.openalliance.ad.ppskit.utils.m.C()
            boolean r1 = com.huawei.openalliance.ad.ppskit.utils.y1.h(r0)
            if (r1 != 0) goto L15
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r1 = "X-HW-AD-Model"
            r9.b(r1, r0)
        L15:
            java.lang.String r0 = "Accept-Encoding"
            java.lang.String r1 = "gzip"
            r9.b(r0, r1)
            java.lang.String r0 = r11.d()
            java.lang.String r1 = r11.a()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            android.content.Context r3 = r9.f32215c
            java.lang.String r4 = r11.b(r3)
            java.lang.String r11 = r11.c()
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            r6 = 0
            if (r5 != 0) goto Ld1
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto Ld1
            boolean r5 = android.text.TextUtils.isEmpty(r11)
            if (r5 == 0) goto L4b
            goto Ld1
        L4b:
            java.lang.String r5 = "Digest username="
            java.lang.String r7 = ",realm="
            java.lang.String r8 = ",nonce="
            java.lang.StringBuilder r5 = a3.k.o(r5, r0, r7, r1, r8)
            r5.append(r2)
            java.lang.String r7 = ",response="
            r5.append(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r0 = ":"
            r7.append(r0)
            r7.append(r1)
            r7.append(r0)
            java.lang.String r1 = "2595416ae5a59e7c7c1ff6dc4f42f4865be7133d82facbb82283010de705308b"
            byte[] r1 = com.huawei.openalliance.ad.ppskit.utils.u1.b(r3, r1)
            java.lang.String r1 = com.huawei.openalliance.ad.ppskit.utils.m2.c(r4, r1)
            r7.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = r9.f32214b
            r1.append(r2)
            r1.append(r0)
            r1.append(r11)
            java.lang.String r11 = r7.toString()
            java.lang.String r0 = r1.toString()
            int r1 = c5.e.f3284t
            java.lang.String r1 = "UTF-8"
            java.lang.String r2 = "HmacSHA256"
            javax.crypto.Mac r4 = javax.crypto.Mac.getInstance(r2)     // Catch: java.io.UnsupportedEncodingException -> Lbe java.security.InvalidKeyException -> Lc1 java.security.NoSuchAlgorithmException -> Lc4
            javax.crypto.spec.SecretKeySpec r7 = new javax.crypto.spec.SecretKeySpec     // Catch: java.io.UnsupportedEncodingException -> Lbe java.security.InvalidKeyException -> Lc1 java.security.NoSuchAlgorithmException -> Lc4
            byte[] r11 = r11.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> Lbe java.security.InvalidKeyException -> Lc1 java.security.NoSuchAlgorithmException -> Lc4
            r7.<init>(r11, r2)     // Catch: java.io.UnsupportedEncodingException -> Lbe java.security.InvalidKeyException -> Lc1 java.security.NoSuchAlgorithmException -> Lc4
            r4.init(r7)     // Catch: java.io.UnsupportedEncodingException -> Lbe java.security.InvalidKeyException -> Lc1 java.security.NoSuchAlgorithmException -> Lc4
            byte[] r11 = r0.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> Lbe java.security.InvalidKeyException -> Lc1 java.security.NoSuchAlgorithmException -> Lc4
            byte[] r11 = r4.doFinal(r11)     // Catch: java.io.UnsupportedEncodingException -> Lbe java.security.InvalidKeyException -> Lc1 java.security.NoSuchAlgorithmException -> Lc4
            java.lang.String r6 = androidx.transition.n.w(r11)     // Catch: java.io.UnsupportedEncodingException -> Lbe java.security.InvalidKeyException -> Lc1 java.security.NoSuchAlgorithmException -> Lc4
            goto Lcb
        Lbe:
            java.lang.String r11 = "fail to cipher UnsupportedEncodingException"
            goto Lc6
        Lc1:
            java.lang.String r11 = "fail to cipher InvalidKeyException"
            goto Lc6
        Lc4:
            java.lang.String r11 = "fail to cipher NoSuchAlgorithmException"
        Lc6:
            java.lang.String r0 = "e"
            ka.n7.i(r0, r11)
        Lcb:
            java.lang.String r11 = ",algorithm=HmacSHA256"
            java.lang.String r6 = a3.l.p(r5, r6, r11)
        Ld1:
            boolean r11 = android.text.TextUtils.isEmpty(r6)
            if (r11 != 0) goto Ldc
            java.lang.String r11 = "Authorization"
            r9.b(r11, r6)
        Ldc:
            java.lang.String r11 = "Content-Type"
            java.lang.String r0 = "application/json"
            r9.b(r11, r0)
            android.util.Pair r10 = androidx.activity.n.c0(r3, r10)
            if (r10 == 0) goto L106
            java.lang.Object r11 = r10.first
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L106
            java.lang.Object r11 = r10.second
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L106
            java.lang.Object r10 = r10.first
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = "X-HW-AD-Oaid"
            r9.b(r11, r10)
        L106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.y9.d(java.lang.String, com.huawei.openalliance.ad.ppskit.beans.base.ReqBean):void");
    }
}
