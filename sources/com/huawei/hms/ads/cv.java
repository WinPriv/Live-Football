package com.huawei.hms.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public class cv extends cn {
    private static final int B = 32;
    private static final int C = 8;
    private static final byte[] F = new byte[0];
    public static final String I = "CN";
    private static cw S = null;
    private static final String Z = "ThirdDeviceImpl";

    public cv(Context context) {
        super(context);
    }

    private static cw I(Context context) {
        cw cwVar;
        synchronized (F) {
            if (S == null) {
                S = new cv(context);
            }
            cwVar = S;
        }
        return cwVar;
    }

    public static cw V(Context context) {
        return I(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0011, code lost:
    
        r6 = r6.getRootWindowInsets().getDisplayCutout();
     */
    @Override // com.huawei.hms.ads.cn, com.huawei.hms.ads.cw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int Code(android.view.View r6) {
        /*
            r5 = this;
            r0 = -1
            if (r6 != 0) goto L4
            return r0
        L4:
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L6d
            r3 = 28
            if (r2 < r3) goto L2f
            android.view.WindowInsets r2 = r6.getRootWindowInsets()     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L2f
            android.view.WindowInsets r6 = r6.getRootWindowInsets()     // Catch: java.lang.Throwable -> L6d
            android.view.DisplayCutout r6 = b0.t.m(r6)     // Catch: java.lang.Throwable -> L6d
            if (r6 == 0) goto L2f
            java.util.List r6 = androidx.appcompat.widget.r.p(r6)     // Catch: java.lang.Throwable -> L6d
            boolean r2 = androidx.transition.n.h(r6)     // Catch: java.lang.Throwable -> L6d
            if (r2 != 0) goto L2f
            java.lang.Object r6 = r6.get(r1)     // Catch: java.lang.Throwable -> L6d
            android.graphics.Rect r6 = (android.graphics.Rect) r6     // Catch: java.lang.Throwable -> L6d
            int r0 = r6.height()     // Catch: java.lang.Throwable -> L6d
        L2f:
            java.lang.String r6 = "android"
            java.lang.String r2 = "dimen"
            if (r0 >= 0) goto L4d
            android.content.Context r3 = r5.Code     // Catch: java.lang.Throwable -> L6d
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r4 = "notch_height"
            int r3 = r3.getIdentifier(r4, r2, r6)     // Catch: java.lang.Throwable -> L6d
            if (r3 <= 0) goto L4d
            android.content.Context r4 = r5.Code     // Catch: java.lang.Throwable -> L6d
            android.content.res.Resources r4 = r4.getResources()     // Catch: java.lang.Throwable -> L6d
            int r0 = r4.getDimensionPixelSize(r3)     // Catch: java.lang.Throwable -> L6d
        L4d:
            if (r0 >= 0) goto L82
            android.content.Context r3 = r5.Code     // Catch: java.lang.Throwable -> L6d
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r4 = "status_bar_height"
            int r6 = r3.getIdentifier(r4, r2, r6)     // Catch: java.lang.Throwable -> L6d
            if (r6 <= 0) goto L68
            android.content.Context r2 = r5.Code     // Catch: java.lang.Throwable -> L6d
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L6d
            int r6 = r2.getDimensionPixelSize(r6)     // Catch: java.lang.Throwable -> L6d
            r0 = r6
        L68:
            if (r0 != 0) goto L82
            r0 = 110(0x6e, float:1.54E-43)
            goto L82
        L6d:
            r6 = move-exception
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r2[r1] = r6
            java.lang.String r6 = "ThirdDeviceImpl"
            java.lang.String r1 = "getNotchHeight err: %s"
            com.huawei.hms.ads.ex.V(r6, r1, r2)
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.ads.cv.Code(android.view.View):int");
    }

    @Override // com.huawei.hms.ads.cn, com.huawei.hms.ads.cw
    public boolean Code() {
        return "CN".equalsIgnoreCase(ec.Code(this.Code).W());
    }

    @Override // com.huawei.hms.ads.cn, com.huawei.hms.ads.cw
    public boolean V() {
        return Code();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.huawei.hms.ads.cn, com.huawei.hms.ads.cw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Code(android.content.Context r10) {
        /*
            r9 = this;
            java.lang.String r0 = "Notch"
            java.lang.String r1 = "ThirdDeviceImpl"
            r2 = 1
            r3 = 0
            java.lang.String r4 = "android.os.SystemProperties"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = "getInt"
            r6 = 2
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L38
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r3] = r8     // Catch: java.lang.Throwable -> L38
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L38
            r7[r2] = r8     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Method r5 = r4.getMethod(r5, r7)     // Catch: java.lang.Throwable -> L38
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = "ro.miui.notch"
            r6[r3] = r7     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L38
            r6[r2] = r7     // Catch: java.lang.Throwable -> L38
            java.lang.Object r4 = r5.invoke(r4, r6)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L38
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L38
            if (r4 != 0) goto L36
            goto L3e
        L36:
            r4 = r2
            goto L3f
        L38:
            r4 = move-exception
            java.lang.String r5 = "isNotchEnable mi Throwable:"
            e0.i.q(r4, r5, r1)
        L3e:
            r4 = r3
        L3f:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            r5[r3] = r6
            java.lang.String r6 = "isNotchEnable xiaomi, hasNotch = %s"
            com.huawei.hms.ads.ex.Code(r1, r6, r5)
            if (r4 != 0) goto L5f
            android.content.pm.PackageManager r5 = r10.getPackageManager()     // Catch: java.lang.Throwable -> L59
            java.lang.String r6 = "com.oppo.feature.screen.heteromorphism"
            boolean r4 = r5.hasSystemFeature(r6)     // Catch: java.lang.Throwable -> L59
            goto L5f
        L59:
            r5 = move-exception
            java.lang.String r6 = "isNotchEnable oppo Throwable:"
            e0.i.q(r5, r6, r1)
        L5f:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            r5[r3] = r6
            java.lang.String r6 = "isNotchEnable oppo, hasNotch = %s"
            com.huawei.hms.ads.ex.Code(r1, r6, r5)
            if (r4 != 0) goto Lb8
            java.lang.ClassLoader r10 = r10.getClassLoader()     // Catch: java.lang.Exception -> Lad java.lang.NoSuchMethodException -> Lb0 java.lang.ClassNotFoundException -> Lb3
            java.lang.String r5 = "android.util.FtFeature"
            java.lang.Class r10 = r10.loadClass(r5)     // Catch: java.lang.Exception -> Lad java.lang.NoSuchMethodException -> Lb0 java.lang.ClassNotFoundException -> Lb3
            java.lang.String r5 = "isFeatureSupport"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lad java.lang.NoSuchMethodException -> Lb0 java.lang.ClassNotFoundException -> Lb3
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> Lad java.lang.NoSuchMethodException -> Lb0 java.lang.ClassNotFoundException -> Lb3
            r6[r3] = r7     // Catch: java.lang.Exception -> Lad java.lang.NoSuchMethodException -> Lb0 java.lang.ClassNotFoundException -> Lb3
            java.lang.reflect.Method r5 = r10.getMethod(r5, r6)     // Catch: java.lang.Exception -> Lad java.lang.NoSuchMethodException -> Lb0 java.lang.ClassNotFoundException -> Lb3
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Lad java.lang.NoSuchMethodException -> Lb0 java.lang.ClassNotFoundException -> Lb3
            r7 = 32
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> Lad java.lang.NoSuchMethodException -> Lb0 java.lang.ClassNotFoundException -> Lb3
            r6[r3] = r7     // Catch: java.lang.Exception -> Lad java.lang.NoSuchMethodException -> Lb0 java.lang.ClassNotFoundException -> Lb3
            java.lang.Object r6 = r5.invoke(r10, r6)     // Catch: java.lang.Exception -> Lad java.lang.NoSuchMethodException -> Lb0 java.lang.ClassNotFoundException -> Lb3
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Exception -> Lad java.lang.NoSuchMethodException -> Lb0 java.lang.ClassNotFoundException -> Lb3
            boolean r4 = r6.booleanValue()     // Catch: java.lang.Exception -> Lad java.lang.NoSuchMethodException -> Lb0 java.lang.ClassNotFoundException -> Lb3
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Lad java.lang.NoSuchMethodException -> Lb0 java.lang.ClassNotFoundException -> Lb3
            r7 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> Lad java.lang.NoSuchMethodException -> Lb0 java.lang.ClassNotFoundException -> Lb3
            r6[r3] = r7     // Catch: java.lang.Exception -> Lad java.lang.NoSuchMethodException -> Lb0 java.lang.ClassNotFoundException -> Lb3
            java.lang.Object r10 = r5.invoke(r10, r6)     // Catch: java.lang.Exception -> Lad java.lang.NoSuchMethodException -> Lb0 java.lang.ClassNotFoundException -> Lb3
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Exception -> Lad java.lang.NoSuchMethodException -> Lb0 java.lang.ClassNotFoundException -> Lb3
            boolean r4 = r10.booleanValue()     // Catch: java.lang.Exception -> Lad java.lang.NoSuchMethodException -> Lb0 java.lang.ClassNotFoundException -> Lb3
            goto Lb8
        Lad:
            java.lang.String r10 = "hasNotchAtVivo Exception"
            goto Lb5
        Lb0:
            java.lang.String r10 = "hasNotchAtVivo NoSuchMethodException"
            goto Lb5
        Lb3:
            java.lang.String r10 = "hasNotchAtVivo ClassNotFoundException"
        Lb5:
            com.huawei.hms.ads.ex.Z(r0, r10)
        Lb8:
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r10[r3] = r0
            java.lang.String r0 = "isNotchEnable vivo, hasNotch = %s"
            com.huawei.hms.ads.ex.Code(r1, r0, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.ads.cv.Code(android.content.Context):boolean");
    }
}
