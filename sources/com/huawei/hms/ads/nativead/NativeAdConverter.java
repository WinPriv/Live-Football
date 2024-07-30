package com.huawei.hms.ads.nativead;

import android.content.Context;
import com.huawei.hms.ads.annotation.GlobalApi;
import com.huawei.hms.ads.bw;
import com.huawei.openalliance.ad.inter.data.e;

@GlobalApi
/* loaded from: classes2.dex */
public class NativeAdConverter {
    @GlobalApi
    public static NativeAd deserialization(Context context, String str) {
        return deserialization(context, str, null);
    }

    @GlobalApi
    public static String serialization(NativeAd nativeAd) {
        if (nativeAd instanceof bw) {
            return e.a.a(((bw) nativeAd).Code());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0058  */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @com.huawei.hms.ads.annotation.GlobalApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.hms.ads.nativead.NativeAd deserialization(android.content.Context r5, java.lang.String r6, com.huawei.hms.ads.nativead.NativeAdConfiguration r7) {
        /*
            int r0 = a0.a.f10g0
            java.lang.String r0 = "a"
            boolean r1 = gb.p.f(r6)
            r2 = 0
            if (r1 == 0) goto Ld
            r3 = r2
            goto L49
        Ld:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L2e java.lang.ClassNotFoundException -> L31 java.io.IOException -> L36 java.io.UnsupportedEncodingException -> L3b
            byte[] r6 = androidx.transition.n.i(r6)     // Catch: java.lang.Throwable -> L2e java.lang.ClassNotFoundException -> L31 java.io.IOException -> L36 java.io.UnsupportedEncodingException -> L3b
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L2e java.lang.ClassNotFoundException -> L31 java.io.IOException -> L36 java.io.UnsupportedEncodingException -> L3b
            gb.n r6 = new gb.n     // Catch: java.lang.Throwable -> L26 java.lang.ClassNotFoundException -> L28 java.io.IOException -> L2a java.io.UnsupportedEncodingException -> L2c
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L26 java.lang.ClassNotFoundException -> L28 java.io.IOException -> L2a java.io.UnsupportedEncodingException -> L2c
            java.lang.Object r3 = r6.readObject()     // Catch: java.lang.ClassNotFoundException -> L33 java.io.IOException -> L38 java.io.UnsupportedEncodingException -> L3d java.lang.Throwable -> L64
            boolean r4 = r3 instanceof java.io.Serializable     // Catch: java.lang.ClassNotFoundException -> L33 java.io.IOException -> L38 java.io.UnsupportedEncodingException -> L3d java.lang.Throwable -> L64
            if (r4 == 0) goto L42
            java.io.Serializable r3 = (java.io.Serializable) r3     // Catch: java.lang.ClassNotFoundException -> L33 java.io.IOException -> L38 java.io.UnsupportedEncodingException -> L3d java.lang.Throwable -> L64
            goto L43
        L26:
            r5 = move-exception
            goto L66
        L28:
            r6 = r2
            goto L33
        L2a:
            r6 = r2
            goto L38
        L2c:
            r6 = r2
            goto L3d
        L2e:
            r5 = move-exception
            r1 = r2
            goto L66
        L31:
            r6 = r2
            r1 = r6
        L33:
            java.lang.String r3 = "fail to get Serializable ClassNotFoundException"
            goto L3f
        L36:
            r6 = r2
            r1 = r6
        L38:
            java.lang.String r3 = "fail to get Serializable IOException"
            goto L3f
        L3b:
            r6 = r2
            r1 = r6
        L3d:
            java.lang.String r3 = "fail to get Serializable UnsupportedEncodingException"
        L3f:
            com.huawei.hms.ads.ex.Z(r0, r3)     // Catch: java.lang.Throwable -> L64
        L42:
            r3 = r2
        L43:
            androidx.transition.n.g(r6)
            androidx.transition.n.g(r1)
        L49:
            boolean r6 = r3 instanceof com.huawei.openalliance.ad.inter.data.AdContentData
            if (r6 == 0) goto L55
            com.huawei.openalliance.ad.inter.data.j r6 = new com.huawei.openalliance.ad.inter.data.j
            com.huawei.openalliance.ad.inter.data.AdContentData r3 = (com.huawei.openalliance.ad.inter.data.AdContentData) r3
            r6.<init>(r3)
            goto L56
        L55:
            r6 = r2
        L56:
            if (r6 == 0) goto L63
            com.huawei.hms.ads.bw r0 = new com.huawei.hms.ads.bw
            r0.<init>(r5, r6)
            if (r7 == 0) goto L62
            r0.Code(r7)
        L62:
            return r0
        L63:
            return r2
        L64:
            r5 = move-exception
            r2 = r6
        L66:
            androidx.transition.n.g(r2)
            androidx.transition.n.g(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.ads.nativead.NativeAdConverter.deserialization(android.content.Context, java.lang.String, com.huawei.hms.ads.nativead.NativeAdConfiguration):com.huawei.hms.ads.nativead.NativeAd");
    }
}
