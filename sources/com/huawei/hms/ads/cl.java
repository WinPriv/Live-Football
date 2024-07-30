package com.huawei.hms.ads;

import android.content.Context;
import android.text.TextUtils;
import gb.m;

/* loaded from: classes2.dex */
public class cl {
    private static final byte[] B = new byte[0];
    private static final String Code = "DeviceManager";
    private static final String I = "02";
    private static final String V = "ro.build.2b2c.partner.ext_channel";
    private static volatile cw Z;

    public static boolean B(Context context) {
        if (!V(context) && !Code()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean C(android.content.Context r6) {
        /*
            android.content.Context r6 = r6.getApplicationContext()
            gb.m r6 = gb.m.b(r6)
            byte[] r0 = r6.f28595b
            monitor-enter(r0)
            r6.g()     // Catch: java.lang.Throwable -> Lbd
            gb.m$b r1 = r6.f28596c     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r1 = r1.f28599s     // Catch: java.lang.Throwable -> Lbd
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r2 = 1
            if (r0 != 0) goto L24
            java.lang.String r6 = java.lang.String.valueOf(r2)
            boolean r6 = android.text.TextUtils.equals(r6, r1)
            goto Lb9
        L24:
            r0 = 0
            java.lang.String r1 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L82 java.lang.RuntimeException -> L90
            java.lang.String r3 = "HUAWEI"
            boolean r3 = r1.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L82 java.lang.RuntimeException -> L90
            if (r3 != 0) goto L4c
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L82 java.lang.RuntimeException -> L90
            java.lang.String r4 = "HUAWEI"
            boolean r4 = r3.equalsIgnoreCase(r4)     // Catch: java.lang.Throwable -> L82 java.lang.RuntimeException -> L90
            if (r4 != 0) goto L4c
            java.lang.String r4 = "HONOR"
            boolean r1 = r1.equalsIgnoreCase(r4)     // Catch: java.lang.Throwable -> L82 java.lang.RuntimeException -> L90
            if (r1 != 0) goto L4c
            java.lang.String r1 = "HONOR"
            boolean r1 = r3.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L82 java.lang.RuntimeException -> L90
            if (r1 == 0) goto L4a
            goto L4c
        L4a:
            r1 = r0
            goto L4d
        L4c:
            r1 = r2
        L4d:
            if (r1 != 0) goto L80
            boolean r3 = gb.z.f()     // Catch: java.lang.Throwable -> L76 java.lang.RuntimeException -> L7b
            if (r3 == 0) goto L5c
            java.lang.String r3 = "com.hihonor.android.os.Build$VERSION"
        L57:
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L76 java.lang.RuntimeException -> L7b
            goto L5f
        L5c:
            java.lang.String r3 = "com.huawei.android.os.BuildEx$VERSION"
            goto L57
        L5f:
            java.lang.String r4 = "EMUI_SDK_INT"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L76 java.lang.RuntimeException -> L7b
            r4 = 0
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L76 java.lang.RuntimeException -> L7b
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L76 java.lang.RuntimeException -> L7b
            int r1 = r3.intValue()     // Catch: java.lang.Throwable -> L76 java.lang.RuntimeException -> L7b
            if (r1 <= 0) goto L73
            goto L74
        L73:
            r2 = r0
        L74:
            r1 = r2
            goto L80
        L76:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L83
        L7b:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L91
        L80:
            r0 = r1
            goto La4
        L82:
            r1 = move-exception
        L83:
            java.lang.String r2 = "DeviceManager"
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = "isHuaweiPhone Error:"
            goto L9d
        L90:
            r1 = move-exception
        L91:
            java.lang.String r2 = "DeviceManager"
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = "isHuaweiPhone RuntimeException:"
        L9d:
            java.lang.String r1 = r3.concat(r1)
            com.huawei.hms.ads.ex.Z(r2, r1)
        La4:
            byte[] r1 = r6.f28595b
            monitor-enter(r1)
            r6.g()     // Catch: java.lang.Throwable -> Lba
            gb.m$b r2 = r6.f28596c     // Catch: java.lang.Throwable -> Lba
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lba
            r2.f28599s = r3     // Catch: java.lang.Throwable -> Lba
            gb.m$b r2 = r6.f28596c     // Catch: java.lang.Throwable -> Lba
            r6.c(r2)     // Catch: java.lang.Throwable -> Lba
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lba
            r6 = r0
        Lb9:
            return r6
        Lba:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lba
            throw r6
        Lbd:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbd
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.ads.cl.C(android.content.Context):boolean");
    }

    public static cw Code(Context context) {
        if (Z == null) {
            synchronized (B) {
                if (Z == null) {
                    Z = I(context) ? ct.V(context) : Z(context) ? cr.V(context) : Code() ? cq.V(context) : cv.V(context);
                }
            }
        }
        return Z;
    }

    public static boolean I(Context context) {
        String str;
        String str2;
        gb.m b10 = gb.m.b(context);
        synchronized (b10.f28595b) {
            b10.g();
            m.b bVar = b10.f28596c;
            str = null;
            if (bVar != null && (str2 = bVar.f28605z) != null) {
                str = str2;
            }
        }
        boolean z10 = true;
        if (!TextUtils.isEmpty(str)) {
            return TextUtils.equals(String.valueOf(true), str);
        }
        if (!V(context) || Z(context)) {
            z10 = false;
        }
        synchronized (b10.f28595b) {
            b10.g();
            m.b bVar2 = b10.f28596c;
            if (bVar2 != null) {
                bVar2.f28605z = String.valueOf(z10);
                b10.c(b10.f28596c);
            }
        }
        return z10;
    }

    public static boolean V(Context context) {
        return C(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (com.hihonor.android.os.Build.VERSION.MAGIC_SDK_INT >= 33) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean Z(android.content.Context r4) {
        /*
            gb.m r4 = gb.m.b(r4)
            java.lang.String r0 = r4.f()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r1 != 0) goto L18
            java.lang.String r4 = java.lang.String.valueOf(r2)
            boolean r4 = android.text.TextUtils.equals(r4, r0)
            goto L4b
        L18:
            r0 = 0
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = "HONOR"
            boolean r1 = r1.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L30
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L33
            r3 = 31
            if (r1 < r3) goto L30
            int r1 = com.hihonor.android.os.Build.VERSION.MAGIC_SDK_INT     // Catch: java.lang.Throwable -> L33
            r3 = 33
            if (r1 < r3) goto L30
            goto L31
        L30:
            r2 = r0
        L31:
            r0 = r2
            goto L47
        L33:
            r1 = move-exception
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = "isHonor6UpPhone Error:"
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r2 = "DeviceManager"
            com.huawei.hms.ads.ex.Z(r2, r1)
        L47:
            r4.a(r0)
            r4 = r0
        L4b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.ads.cl.Z(android.content.Context):boolean");
    }

    private static boolean Code() {
        String d10 = gb.u.d(V);
        return !TextUtils.isEmpty(d10) && d10.startsWith(I);
    }
}
