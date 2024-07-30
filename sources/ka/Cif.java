package ka;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: ka.if, reason: invalid class name */
/* loaded from: classes2.dex */
public final class Cif {

    /* renamed from: a, reason: collision with root package name */
    public static volatile j1.a f31293a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f31294b = new byte[0];

    public static l a(Context context) {
        j1.a aVar;
        if (f31293a == null) {
            synchronized (f31294b) {
                if (f31293a == null) {
                    if (e(context)) {
                        synchronized (g.f31198w) {
                            try {
                                if (g.f31197v == null) {
                                    g.f31197v = new g(context);
                                }
                                aVar = g.f31197v;
                            } finally {
                            }
                        }
                        f31293a = aVar;
                    } else if (f(context)) {
                        synchronized (d.f31072w) {
                            if (d.f31071v == null) {
                                d.f31071v = new d(context);
                            }
                            aVar = d.f31071v;
                        }
                        f31293a = aVar;
                    } else {
                        if (b()) {
                            aVar = c.o(context);
                        } else {
                            synchronized (k.f31356x) {
                                if (k.f31355w == null) {
                                    k.f31355w = new k(context);
                                }
                                aVar = k.f31355w;
                            }
                        }
                        f31293a = aVar;
                    }
                }
            }
        }
        return f31293a;
    }

    public static boolean b() {
        boolean z10;
        String o = com.huawei.openalliance.ad.ppskit.utils.z1.o("ro.build.2b2c.partner.ext_channel");
        if (!TextUtils.isEmpty(o) && o.startsWith("02")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (n7.d()) {
            n7.c("DeviceManager", "channel:%s", o);
        }
        n7.f("DeviceManager", "isDroi:%s", Boolean.valueOf(z10));
        return z10;
    }

    public static boolean c(Context context) {
        if (!d(context) && !b() && !g(context)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:8:0x001a, B:10:0x002a, B:15:0x0038, B:17:0x0048, B:21:0x0053), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(android.content.Context r6) {
        /*
            com.huawei.openalliance.ad.ppskit.utils.q1 r0 = com.huawei.openalliance.ad.ppskit.utils.q1.m(r6)
            java.lang.String r1 = r0.G()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 1
            if (r2 != 0) goto L19
            java.lang.String r6 = java.lang.String.valueOf(r3)
            boolean r6 = android.text.TextUtils.equals(r6, r1)
            goto L9e
        L19:
            r1 = 0
            java.lang.String r2 = com.huawei.openalliance.ad.ppskit.utils.z1.c(r6)     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = com.huawei.openalliance.ad.ppskit.utils.z1.d(r6)     // Catch: java.lang.Throwable -> L33
            java.lang.String r5 = "HUAWEI"
            boolean r2 = r5.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L35
            boolean r2 = r5.equalsIgnoreCase(r4)     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L31
            goto L35
        L31:
            r2 = r1
            goto L36
        L33:
            r6 = move-exception
            goto L87
        L35:
            r2 = r3
        L36:
            if (r2 != 0) goto L5c
            java.lang.String r2 = com.huawei.openalliance.ad.ppskit.utils.z1.c(r6)     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = com.huawei.openalliance.ad.ppskit.utils.z1.d(r6)     // Catch: java.lang.Throwable -> L33
            java.lang.String r5 = "HONOR"
            boolean r2 = r5.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L50
            boolean r2 = r5.equalsIgnoreCase(r4)     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L50
            r2 = r3
            goto L51
        L50:
            r2 = r1
        L51:
            if (r2 != 0) goto L5c
            boolean r2 = g(r6)     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L5a
            goto L5c
        L5a:
            r2 = r1
            goto L5d
        L5c:
            r2 = r3
        L5d:
            if (r2 != 0) goto L85
            ka.n r6 = a0.a.L(r6)     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = r6.f()     // Catch: java.lang.Throwable -> L82
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = "EMUI_SDK_INT"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L82
            r4 = 0
            java.lang.Object r6 = r6.get(r4)     // Catch: java.lang.Throwable -> L82
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L82
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L82
            if (r6 <= 0) goto L7f
            goto L80
        L7f:
            r3 = r1
        L80:
            r2 = r3
            goto L85
        L82:
            r6 = move-exception
            r1 = r2
            goto L87
        L85:
            r6 = r2
            goto L9b
        L87:
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getSimpleName()
            java.lang.String r2 = "isHuaweiPhone Error:"
            java.lang.String r6 = r2.concat(r6)
            java.lang.String r2 = "DeviceManager"
            ka.n7.i(r2, r6)
            r6 = r1
        L9b:
            r0.t(r6)
        L9e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.Cif.d(android.content.Context):boolean");
    }

    public static boolean e(Context context) {
        com.huawei.openalliance.ad.ppskit.utils.q1 m10 = com.huawei.openalliance.ad.ppskit.utils.q1.m(context);
        String w10 = m10.w();
        boolean z10 = true;
        if (!TextUtils.isEmpty(w10)) {
            return TextUtils.equals(String.valueOf(true), w10);
        }
        if (!d(context) || f(context)) {
            z10 = false;
        }
        m10.J(z10);
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (com.hihonor.android.os.Build.VERSION.MAGIC_SDK_INT >= 33) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f(android.content.Context r4) {
        /*
            com.huawei.openalliance.ad.ppskit.utils.q1 r0 = com.huawei.openalliance.ad.ppskit.utils.q1.m(r4)
            java.lang.String r1 = r0.x()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 1
            if (r2 != 0) goto L18
            java.lang.String r4 = java.lang.String.valueOf(r3)
            boolean r4 = android.text.TextUtils.equals(r4, r1)
            goto L4d
        L18:
            r1 = 0
            java.lang.String r2 = "HONOR"
            java.lang.String r4 = com.huawei.openalliance.ad.ppskit.utils.z1.c(r4)     // Catch: java.lang.Throwable -> L35
            boolean r4 = r2.equalsIgnoreCase(r4)     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L32
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L35
            r2 = 31
            if (r4 < r2) goto L32
            int r4 = com.hihonor.android.os.Build.VERSION.MAGIC_SDK_INT     // Catch: java.lang.Throwable -> L35
            r2 = 33
            if (r4 < r2) goto L32
            goto L33
        L32:
            r3 = r1
        L33:
            r4 = r3
            goto L4a
        L35:
            r4 = move-exception
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r2 = "isHonor6UpPhone Error:"
            java.lang.String r4 = r2.concat(r4)
            java.lang.String r2 = "DeviceManager"
            ka.n7.i(r2, r4)
            r4 = r1
        L4a:
            r0.L(r4)
        L4d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.Cif.f(android.content.Context):boolean");
    }

    public static boolean g(Context context) {
        if (!"Huanglong".equalsIgnoreCase(com.huawei.openalliance.ad.ppskit.utils.z1.c(context)) && !"Minrray".equalsIgnoreCase(com.huawei.openalliance.ad.ppskit.utils.z1.c(context)) && !"Hivendor".equalsIgnoreCase(com.huawei.openalliance.ad.ppskit.utils.z1.c(context))) {
            return false;
        }
        return true;
    }
}
