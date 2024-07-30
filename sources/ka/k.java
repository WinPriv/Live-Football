package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean;
import com.huawei.openalliance.ad.ppskit.utils.ServerConfig;

/* loaded from: classes2.dex */
public final class k extends j1.a {

    /* renamed from: w, reason: collision with root package name */
    public static k f31355w;

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f31356x = new byte[0];

    /* renamed from: v, reason: collision with root package name */
    public final CountryCodeBean f31357v;

    public k(Context context) {
        super(context);
        this.f31357v = new CountryCodeBean(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // j1.a, ka.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.content.Context r9) {
        /*
            r8 = this;
            java.lang.String r0 = "ThirdDeviceImpl"
            r1 = 1
            r2 = 0
            java.lang.String r3 = "android.os.SystemProperties"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = "getInt"
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L36
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r2] = r7     // Catch: java.lang.Throwable -> L36
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L36
            r6[r1] = r7     // Catch: java.lang.Throwable -> L36
            java.lang.reflect.Method r4 = r3.getMethod(r4, r6)     // Catch: java.lang.Throwable -> L36
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = "ro.miui.notch"
            r5[r2] = r6     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L36
            r5[r1] = r6     // Catch: java.lang.Throwable -> L36
            java.lang.Object r3 = r4.invoke(r3, r5)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L36
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L36
            if (r3 != 0) goto L34
            goto L3c
        L34:
            r3 = r1
            goto L3d
        L36:
            r3 = move-exception
            java.lang.String r4 = "isNotchEnable mi Throwable:"
            e0.i.p(r3, r4, r0)
        L3c:
            r3 = r2
        L3d:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r4[r2] = r5
            java.lang.String r5 = "isNotchEnable xiaomi, hasNotch = %s"
            ka.n7.c(r0, r5, r4)
            if (r3 != 0) goto L5d
            android.content.pm.PackageManager r4 = r9.getPackageManager()     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = "com.oppo.feature.screen.heteromorphism"
            boolean r3 = r4.hasSystemFeature(r5)     // Catch: java.lang.Throwable -> L57
            goto L5d
        L57:
            r4 = move-exception
            java.lang.String r5 = "isNotchEnable oppo Throwable:"
            e0.i.p(r4, r5, r0)
        L5d:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r4[r2] = r5
            java.lang.String r5 = "isNotchEnable oppo, hasNotch = %s"
            ka.n7.c(r0, r5, r4)
            if (r3 != 0) goto Lbf
            java.lang.ClassLoader r9 = r9.getClassLoader()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r4 = "android.util.FtFeature"
            java.lang.Class r9 = r9.loadClass(r4)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r4 = "isFeatureSupport"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> Lab
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lab
            r5[r2] = r6     // Catch: java.lang.Throwable -> Lab
            java.lang.reflect.Method r4 = r9.getMethod(r4, r5)     // Catch: java.lang.Throwable -> Lab
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lab
            r6 = 32
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lab
            r5[r2] = r6     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r5 = r4.invoke(r9, r5)     // Catch: java.lang.Throwable -> Lab
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> Lab
            boolean r3 = r5.booleanValue()     // Catch: java.lang.Throwable -> Lab
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lab
            r6 = 8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lab
            r5[r2] = r6     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r9 = r4.invoke(r9, r5)     // Catch: java.lang.Throwable -> Lab
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> Lab
            boolean r3 = r9.booleanValue()     // Catch: java.lang.Throwable -> Lab
            goto Lbf
        Lab:
            r9 = move-exception
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getSimpleName()
            java.lang.String r4 = "hasNotchAtVivo "
            java.lang.String r9 = r4.concat(r9)
            java.lang.String r4 = "Notch"
            ka.n7.i(r4, r9)
        Lbf:
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r9[r2] = r1
            java.lang.String r1 = "isNotchEnable vivo, hasNotch = %s"
            ka.n7.c(r0, r1, r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.k.a(android.content.Context):boolean");
    }

    @Override // ka.l
    public final boolean c() {
        String str = ServerConfig.f22801b;
        if (TextUtils.isEmpty(str)) {
            str = this.f31357v.a();
        }
        return "CN".equalsIgnoreCase(str);
    }

    @Override // ka.l
    public final boolean d() {
        return c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0011, code lost:
    
        r6 = r6.getRootWindowInsets().getDisplayCutout();
     */
    @Override // j1.a, ka.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(android.view.ViewGroup r6) {
        /*
            r5 = this;
            r0 = -1
            if (r6 != 0) goto L4
            return r0
        L4:
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L75
            r3 = 28
            if (r2 < r3) goto L2f
            android.view.WindowInsets r2 = r6.getRootWindowInsets()     // Catch: java.lang.Throwable -> L75
            if (r2 == 0) goto L2f
            android.view.WindowInsets r6 = r6.getRootWindowInsets()     // Catch: java.lang.Throwable -> L75
            android.view.DisplayCutout r6 = b0.t.m(r6)     // Catch: java.lang.Throwable -> L75
            if (r6 == 0) goto L2f
            java.util.List r6 = androidx.appcompat.widget.r.p(r6)     // Catch: java.lang.Throwable -> L75
            boolean r2 = androidx.transition.n.M(r6)     // Catch: java.lang.Throwable -> L75
            if (r2 != 0) goto L2f
            java.lang.Object r6 = r6.get(r1)     // Catch: java.lang.Throwable -> L75
            android.graphics.Rect r6 = (android.graphics.Rect) r6     // Catch: java.lang.Throwable -> L75
            int r0 = r6.height()     // Catch: java.lang.Throwable -> L75
        L2f:
            java.lang.String r6 = "android"
            java.lang.String r2 = "dimen"
            if (r0 >= 0) goto L51
            java.lang.Object r3 = r5.f29568t     // Catch: java.lang.Throwable -> L75
            android.content.Context r3 = (android.content.Context) r3     // Catch: java.lang.Throwable -> L75
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "notch_height"
            int r3 = r3.getIdentifier(r4, r2, r6)     // Catch: java.lang.Throwable -> L75
            if (r3 <= 0) goto L51
            java.lang.Object r4 = r5.f29568t     // Catch: java.lang.Throwable -> L75
            android.content.Context r4 = (android.content.Context) r4     // Catch: java.lang.Throwable -> L75
            android.content.res.Resources r4 = r4.getResources()     // Catch: java.lang.Throwable -> L75
            int r0 = r4.getDimensionPixelSize(r3)     // Catch: java.lang.Throwable -> L75
        L51:
            if (r0 >= 0) goto L8a
            java.lang.Object r3 = r5.f29568t     // Catch: java.lang.Throwable -> L75
            android.content.Context r3 = (android.content.Context) r3     // Catch: java.lang.Throwable -> L75
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "status_bar_height"
            int r6 = r3.getIdentifier(r4, r2, r6)     // Catch: java.lang.Throwable -> L75
            if (r6 <= 0) goto L70
            java.lang.Object r2 = r5.f29568t     // Catch: java.lang.Throwable -> L75
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Throwable -> L75
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L75
            int r6 = r2.getDimensionPixelSize(r6)     // Catch: java.lang.Throwable -> L75
            r0 = r6
        L70:
            if (r0 != 0) goto L8a
            r0 = 110(0x6e, float:1.54E-43)
            goto L8a
        L75:
            r6 = move-exception
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r2[r1] = r6
            java.lang.String r6 = "ThirdDeviceImpl"
            java.lang.String r1 = "getNotchHeight err: %s"
            ka.n7.f(r6, r1, r2)
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.k.e(android.view.ViewGroup):int");
    }
}
