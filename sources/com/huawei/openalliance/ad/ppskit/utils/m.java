package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.applovin.sdk.AppLovinEventTypes;
import com.huawei.android.app.PackageManagerEx;
import com.huawei.openalliance.ad.ppskit.activity.SafeIntent;
import com.huawei.openalliance.ad.ppskit.beans.metadata.InnerPackageInfo;
import com.huawei.openalliance.ad.ppskit.utils.f0;
import com.huawei.openalliance.ad.ppskit.utils.q1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ka.Cif;
import ka.n7;
import ka.w6;
import ka.y6;

/* loaded from: classes2.dex */
public final class m {

    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22893s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ q1 f22894t;

        public a(Context context, q1 q1Var) {
            this.f22893s = context;
            this.f22894t = q1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m.o(this.f22893s, this.f22894t);
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22895s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ q1 f22896t;

        public b(Context context, q1 q1Var) {
            this.f22895s = context;
            this.f22896t = q1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m.s(this.f22895s, this.f22896t);
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22897s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ q1 f22898t;

        public c(Context context, q1 q1Var) {
            this.f22897s = context;
            this.f22898t = q1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m.Q(this.f22897s, this.f22898t);
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22899s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ q1 f22900t;

        public d(Context context, q1 q1Var) {
            this.f22899s = context;
            this.f22900t = q1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m.S(this.f22899s, this.f22900t);
        }
    }

    /* loaded from: classes2.dex */
    public static class e implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22901s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ q1 f22902t;

        public e(Context context, q1 q1Var) {
            this.f22901s = context;
            this.f22902t = q1Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r11 = this;
                android.content.Context r0 = r11.f22901s
                java.lang.String r1 = "DeviceUtil"
                r2 = 0
                if (r0 != 0) goto L9
                goto Lb3
            L9:
                com.huawei.openalliance.ad.ppskit.utils.h r3 = com.huawei.openalliance.ad.ppskit.utils.h.a(r0)
                boolean r3 = r3.c()
                if (r3 == 0) goto L15
                goto Lb3
            L15:
                int r3 = com.huawei.openalliance.ad.ppskit.utils.f0.a.f22843a     // Catch: java.lang.Throwable -> Lad
                java.lang.String r4 = "location_huawei_ads"
                r5 = 23
                if (r3 >= r5) goto L25
                boolean r3 = ka.Cif.f(r0)     // Catch: java.lang.Throwable -> Lad
                if (r3 != 0) goto L25
                goto La0
            L25:
                ka.l r3 = ka.Cif.a(r0)     // Catch: java.lang.Throwable -> Lad
                boolean r3 = r3.d()     // Catch: java.lang.Throwable -> Lad
                if (r3 == 0) goto L31
                goto La0
            L31:
                android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> Lad
                java.lang.String r5 = "com.huawei.settings.intent.action.SERVICE_AUTH_STATE"
                r3.<init>(r5)     // Catch: java.lang.Throwable -> Lad
                java.lang.String r5 = "com.android.settings"
                r3.setPackage(r5)     // Catch: java.lang.Throwable -> Lad
                android.content.pm.PackageManager r5 = r0.getPackageManager()     // Catch: java.lang.Throwable -> Lad
                r6 = 131072(0x20000, float:1.83671E-40)
                java.util.List r3 = r5.queryIntentContentProviders(r3, r6)     // Catch: java.lang.Throwable -> Lad
                if (r3 == 0) goto La0
                int r3 = r3.size()     // Catch: java.lang.Throwable -> Lad
                if (r3 != 0) goto L50
                goto La0
            L50:
                android.content.ContentResolver r5 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L90
                android.net.Uri r6 = oa.h.f33796a     // Catch: java.lang.Throwable -> L90
                r7 = 0
                java.lang.String r8 = "com.huawei.opendevice.open.LOCATION_AUTHORITY"
                r9 = 0
                r10 = 0
                android.database.Cursor r3 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L90
                if (r3 == 0) goto L8a
                boolean r5 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L92
                if (r5 == 0) goto L8a
                java.lang.String r5 = "isNeedAuth"
                int r5 = r3.getColumnIndexOrThrow(r5)     // Catch: java.lang.Throwable -> L92
                java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> L92
                java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L92
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L92
                boolean r5 = r6.equalsIgnoreCase(r5)     // Catch: java.lang.Throwable -> L92
                if (r5 == 0) goto L7e
                goto L97
            L7e:
                android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L92
                int r0 = android.provider.Settings.Secure.getInt(r0, r4, r2)     // Catch: java.lang.Throwable -> L92
                androidx.transition.n.D(r3)     // Catch: java.lang.Throwable -> Lad
                goto La8
            L8a:
                java.lang.String r0 = "cursor is null"
                ka.n7.i(r1, r0)     // Catch: java.lang.Throwable -> L92
                goto L97
            L90:
                r0 = 0
                r3 = r0
            L92:
                java.lang.String r0 = "get switch status meets exception"
                ka.n7.i(r1, r0)     // Catch: java.lang.Throwable -> L9b
            L97:
                androidx.transition.n.D(r3)     // Catch: java.lang.Throwable -> Lad
                goto Lb3
            L9b:
                r0 = move-exception
                androidx.transition.n.D(r3)     // Catch: java.lang.Throwable -> Lad
                throw r0     // Catch: java.lang.Throwable -> Lad
            La0:
                android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> Lad
                int r0 = android.provider.Settings.Secure.getInt(r0, r4, r2)     // Catch: java.lang.Throwable -> Lad
            La8:
                r1 = 1
                if (r0 != r1) goto Lb3
                r2 = r1
                goto Lb3
            Lad:
                r0 = move-exception
                java.lang.String r3 = "get location switch encounter exception: "
                e0.i.p(r0, r3, r1)
            Lb3:
                com.huawei.openalliance.ad.ppskit.utils.q1 r0 = r11.f22902t
                r0.getClass()
                byte[] r1 = com.huawei.openalliance.ad.ppskit.utils.q1.f22960g
                monitor-enter(r1)
                r0.B()     // Catch: java.lang.Throwable -> Lcd
                com.huawei.openalliance.ad.ppskit.utils.q1$b r3 = r0.f22965a     // Catch: java.lang.Throwable -> Lcd
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> Lcd
                r3.baseLocationSwitch = r2     // Catch: java.lang.Throwable -> Lcd
                com.huawei.openalliance.ad.ppskit.utils.q1$b r2 = r0.f22965a     // Catch: java.lang.Throwable -> Lcd
                r0.n(r2)     // Catch: java.lang.Throwable -> Lcd
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lcd
                return
            Lcd:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lcd
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.m.e.run():void");
        }
    }

    /* loaded from: classes2.dex */
    public static class f implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22903s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ q1 f22904t;

        public f(Context context, q1 q1Var) {
            this.f22903s = context;
            this.f22904t = q1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m.U(this.f22903s, this.f22904t);
        }
    }

    /* loaded from: classes2.dex */
    public static class g implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22905s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ q1 f22906t;

        public g(Context context, q1 q1Var) {
            this.f22905s = context;
            this.f22906t = q1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m.W(this.f22905s, this.f22906t);
        }
    }

    /* loaded from: classes2.dex */
    public static class h implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ SensorManager f22907s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ o f22908t;

        public h(SensorManager sensorManager, o oVar) {
            this.f22907s = sensorManager;
            this.f22908t = oVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f22907s.unregisterListener(this.f22908t);
        }
    }

    /* loaded from: classes2.dex */
    public static class i implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22909s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ q1 f22910t;

        public i(Context context, q1 q1Var) {
            this.f22909s = context;
            this.f22910t = q1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m.b(this.f22909s, this.f22910t);
        }
    }

    /* loaded from: classes2.dex */
    public static class j implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ SensorManager f22911s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ o f22912t;

        public j(SensorManager sensorManager, o oVar) {
            this.f22911s = sensorManager;
            this.f22912t = oVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f22911s.unregisterListener(this.f22912t);
        }
    }

    /* loaded from: classes2.dex */
    public static class k implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ SensorManager f22913s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ o f22914t;

        public k(SensorManager sensorManager, o oVar) {
            this.f22913s = sensorManager;
            this.f22914t = oVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f22913s.unregisterListener(this.f22914t);
        }
    }

    /* loaded from: classes2.dex */
    public static class l implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ SensorManager f22915s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ o f22916t;

        public l(SensorManager sensorManager, o oVar) {
            this.f22915s = sensorManager;
            this.f22916t = oVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f22915s.unregisterListener(this.f22916t);
        }
    }

    /* renamed from: com.huawei.openalliance.ad.ppskit.utils.m$m, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class RunnableC0294m implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22917s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ q1 f22918t;

        public RunnableC0294m(Context context, q1 q1Var) {
            this.f22917s = context;
            this.f22918t = q1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m.f(this.f22917s, this.f22918t);
        }
    }

    /* loaded from: classes2.dex */
    public static class n implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22919s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ q1 f22920t;

        public n(Context context, q1 q1Var) {
            this.f22919s = context;
            this.f22920t = q1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m.g(this.f22919s, this.f22920t);
        }
    }

    public static Context A(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static Long B(Context context, long j10) {
        String str;
        String str2;
        q1 m10 = q1.m(context);
        m10.getClass();
        synchronized (q1.f22963j) {
            m10.D();
            q1.d dVar = m10.f22967c;
            str = null;
            if (dVar == null) {
                str2 = null;
            } else {
                str2 = dVar.freeSdcard;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = W(context, m10);
        } else if (c2.b("getFreeSdcard", j10)) {
            p2.g(new g(context, m10));
        }
        if (!TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str2)) {
            str = str2;
        }
        return y1.s(str);
    }

    public static String C() {
        String o6 = z1.o("ro.product.model");
        if (TextUtils.isEmpty(o6)) {
            return Build.MODEL;
        }
        return o6;
    }

    public static String D() {
        String o6 = z1.o("ro.build.huawei.display.id");
        if (TextUtils.isEmpty(o6)) {
            return Build.DISPLAY;
        }
        return o6;
    }

    public static String E(Context context, long j10) {
        String str;
        q1 m10 = q1.m(context);
        m10.getClass();
        synchronized (q1.f22960g) {
            m10.B();
            str = m10.f22965a.acceler;
        }
        if (TextUtils.isEmpty(str)) {
            str = b(context, m10);
        } else if (c2.b("getAcceler", j10)) {
            p2.g(new i(context, m10));
        }
        if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str)) {
            return null;
        }
        return str;
    }

    public static boolean F(Context context) {
        boolean z10;
        q1 m10 = q1.m(context);
        m10.getClass();
        synchronized (q1.f22960g) {
            m10.B();
            Boolean bool = m10.f22965a.baseLocationSwitch;
            if (bool != null) {
                z10 = bool.booleanValue();
            } else {
                z10 = false;
            }
        }
        p2.d(new e(context, m10));
        return z10;
    }

    public static ArrayList G() {
        ArrayList arrayList = new ArrayList();
        try {
            HashSet hashSet = new HashSet();
            n7.c("DeviceUtil", "Install List size: %s", Integer.valueOf(hashSet.size()));
            if (!androidx.transition.n.M(hashSet)) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((InnerPackageInfo) it.next()).a());
                    }
                    return arrayList2;
                } catch (Throwable unused) {
                    arrayList = arrayList2;
                    n7.g("DeviceUtil", "get Install List Exception");
                    return arrayList;
                }
            }
        } catch (Throwable unused2) {
        }
        return arrayList;
    }

    public static Integer H(Context context, long j10) {
        String str;
        q1 m10 = q1.m(context);
        m10.getClass();
        synchronized (q1.f22960g) {
            m10.B();
            str = m10.f22965a.battery;
        }
        if (TextUtils.isEmpty(str)) {
            str = f(context, m10);
        } else if (c2.b("getBattery", j10)) {
            p2.g(new RunnableC0294m(context, m10));
        }
        if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str)) {
            str = null;
        }
        return y1.q(str);
    }

    public static boolean I() {
        try {
            return PackageManagerEx.hasHwSystemFeature("com.huawei.hardware.screen.type.eink");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Integer J(Context context, long j10) {
        String str;
        q1 m10 = q1.m(context);
        m10.getClass();
        synchronized (q1.f22960g) {
            m10.B();
            str = m10.f22965a.charging;
        }
        if (TextUtils.isEmpty(str)) {
            str = g(context, m10);
        } else if (c2.b("getCharging", j10)) {
            p2.g(new n(context, m10));
        }
        if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str)) {
            str = null;
        }
        return y1.q(str);
    }

    public static boolean K(Context context) {
        return "1".equalsIgnoreCase(com.huawei.openalliance.ad.ppskit.utils.h.a(context).f22857b);
    }

    public static boolean L(Context context) {
        try {
            return a0.a.L(context).d();
        } catch (Throwable th) {
            n7.h("DeviceUtil", "isFoldablePhone exception: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    public static boolean M(Context context) {
        int i10;
        try {
            i10 = a0.a.L(context).c();
        } catch (Throwable th) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (displayMetrics.heightPixels / displayMetrics.widthPixels > 1.5f) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            n7.h("DeviceUtil", "getFoldableStatus %s", th.getClass().getSimpleName());
        }
        if (i10 != 1) {
            return false;
        }
        return true;
    }

    public static String N(Context context) {
        String str;
        q1 m10 = q1.m(context);
        m10.getClass();
        byte[] bArr = q1.f22960g;
        synchronized (bArr) {
            m10.B();
            str = m10.f22965a.cpuModel;
        }
        if (TextUtils.isEmpty(str)) {
            String o6 = z1.o("ro.product.cpu.abi");
            if (TextUtils.isEmpty(o6)) {
                o6 = z1.o("ro.product.cpu.abilist64");
            }
            if (TextUtils.isEmpty(o6)) {
                o6 = com.huawei.openalliance.ad.constant.w.aU;
            }
            synchronized (bArr) {
                m10.B();
                q1.b bVar = m10.f22965a;
                bVar.cpuModel = o6;
                m10.n(bVar);
            }
            return o6;
        }
        if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str)) {
            return null;
        }
        return str;
    }

    public static Integer O(Context context) {
        String str;
        q1 m10 = q1.m(context);
        m10.getClass();
        synchronized (q1.f22960g) {
            m10.B();
            str = m10.f22965a.cpuCoreCnt;
        }
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            try {
                str2 = y1.d(Integer.valueOf(new File("/sys/devices/system/cpu/").listFiles(new u()).length));
            } catch (Throwable unused) {
                n7.i("DeviceUtil", "get CpuCoreCnt exception");
            }
            if (str2 == null) {
                str = com.huawei.openalliance.ad.constant.w.aU;
            } else {
                str = str2;
            }
            synchronized (q1.f22960g) {
                m10.B();
                q1.b bVar = m10.f22965a;
                bVar.cpuCoreCnt = str;
                m10.n(bVar);
            }
        } else if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str)) {
            str = null;
        }
        return y1.q(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String P(android.content.Context r6) {
        /*
            com.huawei.openalliance.ad.ppskit.utils.q1 r6 = com.huawei.openalliance.ad.ppskit.utils.q1.m(r6)
            r6.getClass()
            byte[] r0 = com.huawei.openalliance.ad.ppskit.utils.q1.f22960g
            monitor-enter(r0)
            r6.B()     // Catch: java.lang.Throwable -> La4
            com.huawei.openalliance.ad.ppskit.utils.q1$b r1 = r6.f22965a     // Catch: java.lang.Throwable -> La4
            java.lang.String r1 = r1.cpuSpeed     // Catch: java.lang.Throwable -> La4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La4
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            if (r0 == 0) goto L9a
            java.lang.String r0 = "get CpuSpeed:"
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3c
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L38
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L36
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L36
            if (r5 != 0) goto L51
            java.lang.String r2 = r4.trim()     // Catch: java.lang.Throwable -> L36
            goto L51
        L36:
            r4 = move-exception
            goto L40
        L38:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L40
        L3c:
            r1 = move-exception
            r4 = r1
            r1 = r2
            r3 = r1
        L40:
            java.lang.String r5 = "DeviceUtil"
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L92
            java.lang.String r4 = r4.getSimpleName()     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = r0.concat(r4)     // Catch: java.lang.Throwable -> L92
            ka.n7.i(r5, r0)     // Catch: java.lang.Throwable -> L92
        L51:
            androidx.transition.n.D(r1)
            androidx.transition.n.D(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L61
            java.lang.String r0 = "NOT_FOUND"
        L5f:
            r1 = r0
            goto L80
        L61:
            java.lang.Float r0 = java.lang.Float.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L76
            float r0 = r0.floatValue()     // Catch: java.lang.NumberFormatException -> L76
            r1 = 1232348160(0x49742400, float:1000000.0)
            float r0 = r0 / r1
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L76
            java.lang.String r0 = com.huawei.openalliance.ad.ppskit.utils.y1.d(r0)     // Catch: java.lang.NumberFormatException -> L76
            goto L5f
        L76:
            java.lang.String r0 = "NOT_FOUND"
            java.lang.String r1 = "DeviceUtil"
            java.lang.String r2 = "getCpuSpeed toInteger NumberFormatException"
            ka.n7.i(r1, r2)
            goto L5f
        L80:
            byte[] r0 = com.huawei.openalliance.ad.ppskit.utils.q1.f22960g
            monitor-enter(r0)
            r6.B()     // Catch: java.lang.Throwable -> L8f
            com.huawei.openalliance.ad.ppskit.utils.q1$b r2 = r6.f22965a     // Catch: java.lang.Throwable -> L8f
            r2.cpuSpeed = r1     // Catch: java.lang.Throwable -> L8f
            r6.n(r2)     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            goto La3
        L8f:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            throw r6
        L92:
            r6 = move-exception
            androidx.transition.n.D(r1)
            androidx.transition.n.D(r3)
            throw r6
        L9a:
            java.lang.String r6 = "NOT_FOUND"
            boolean r6 = android.text.TextUtils.equals(r6, r1)
            if (r6 == 0) goto La3
            r1 = r2
        La3:
            return r1
        La4:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La4
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.m.P(android.content.Context):java.lang.String");
    }

    public static String Q(Context context, q1 q1Var) {
        String string = Settings.Global.getString(context.getContentResolver(), "unified_device_name");
        if (TextUtils.isEmpty(string)) {
            string = z1.o("ro.config.marketing_name");
        }
        if (TextUtils.isEmpty(string)) {
            string = z1.o("ro.product.model");
        }
        if (TextUtils.isEmpty(string)) {
            string = com.huawei.openalliance.ad.constant.w.aU;
        }
        q1Var.getClass();
        synchronized (q1.f22960g) {
            q1Var.B();
            q1.b bVar = q1Var.f22965a;
            bVar.pdtName = string;
            q1Var.n(bVar);
        }
        return string;
    }

    public static Long R(Context context) {
        String str;
        long j10;
        q1 m10 = q1.m(context);
        m10.getClass();
        byte[] bArr = q1.f22960g;
        synchronized (bArr) {
            m10.B();
            str = m10.f22965a.totalSto;
        }
        if (TextUtils.isEmpty(str)) {
            String c10 = w1.c(context);
            if (!TextUtils.isEmpty(c10)) {
                j10 = x.u(c10).longValue();
            } else {
                j10 = 0;
            }
            String d10 = y1.d(Long.valueOf(j10));
            if (TextUtils.isEmpty(d10)) {
                d10 = com.huawei.openalliance.ad.constant.w.aU;
            }
            str = d10;
            synchronized (bArr) {
                m10.B();
                q1.b bVar = m10.f22965a;
                bVar.totalSto = str;
                m10.n(bVar);
            }
        } else if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str)) {
            str = null;
        }
        return y1.s(str);
    }

    public static String S(Context context, q1 q1Var) {
        String str = com.huawei.openalliance.ad.constant.w.aU;
        long e10 = e(context);
        if (e10 > 0) {
            str = Long.toString(e10);
        }
        q1Var.getClass();
        synchronized (q1.f22960g) {
            q1Var.B();
            q1.b bVar = q1Var.f22965a;
            bVar.totalMem = str;
            q1Var.n(bVar);
        }
        return str;
    }

    public static String T(Context context) {
        String str;
        q1 m10 = q1.m(context);
        m10.getClass();
        byte[] bArr = q1.f22960g;
        synchronized (bArr) {
            m10.B();
            str = m10.f22965a.vendor;
        }
        if (TextUtils.isEmpty(str)) {
            String v3 = y1.v(Cif.a(context).k());
            if (TextUtils.isEmpty(v3)) {
                v3 = com.huawei.openalliance.ad.constant.w.aU;
            }
            String str2 = v3;
            synchronized (bArr) {
                m10.B();
                q1.b bVar = m10.f22965a;
                bVar.vendor = str2;
                m10.n(bVar);
            }
            return str2;
        }
        if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str)) {
            return null;
        }
        return str;
    }

    public static String U(Context context, q1 q1Var) {
        String str;
        String c10 = w1.c(context);
        if (!TextUtils.isEmpty(c10)) {
            str = y1.d(x.t(c10));
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = com.huawei.openalliance.ad.constant.w.aU;
        }
        q1Var.getClass();
        synchronized (q1.f22960g) {
            q1Var.B();
            q1.b bVar = q1Var.f22965a;
            bVar.freeSto = str;
            q1Var.n(bVar);
        }
        return str;
    }

    public static String V(Context context) {
        String str;
        q1 m10 = q1.m(context);
        m10.getClass();
        byte[] bArr = q1.f22960g;
        synchronized (bArr) {
            m10.B();
            str = m10.f22965a.vendCountry;
        }
        if (TextUtils.isEmpty(str)) {
            String v3 = y1.v(Cif.a(context).l());
            if (TextUtils.isEmpty(v3)) {
                v3 = com.huawei.openalliance.ad.constant.w.aU;
            }
            String str2 = v3;
            synchronized (bArr) {
                m10.B();
                q1.b bVar = m10.f22965a;
                bVar.vendCountry = str2;
                m10.n(bVar);
            }
            return str2;
        }
        if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str)) {
            return null;
        }
        return str;
    }

    public static String W(Context context, q1 q1Var) {
        String str;
        String d10 = w1.d(context);
        if (!TextUtils.isEmpty(d10)) {
            str = y1.d(x.t(d10));
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = com.huawei.openalliance.ad.constant.w.aU;
        }
        q1Var.getClass();
        synchronized (q1.f22963j) {
            q1Var.D();
            q1.d dVar = q1Var.f22967c;
            if (dVar != null) {
                dVar.freeSdcard = str;
                q1Var.p(dVar);
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static boolean X(Context context) {
        String str;
        ?? r02 = "DeviceUtil";
        boolean z10 = false;
        if (context == null) {
            str = "loc_tag isGpsSwitchOpen Context is null";
        } else {
            try {
                try {
                    int i10 = Settings.Secure.getInt(context.getContentResolver(), "location_mode");
                    n7.e("DeviceUtil", "loc_tag isGpsSwitchOpen locationMode is " + i10);
                    r02 = 3;
                    r02 = 3;
                    if (i10 == 3) {
                        z10 = true;
                    }
                } catch (Settings.SettingNotFoundException unused) {
                    str = "loc_tag isGpsSwitchOpen SettingNotFoundException";
                }
                return z10;
            } catch (Throwable th) {
                e0.i.p(th, "get location service switch exception: ", r02);
                return z10;
            }
        }
        n7.i("DeviceUtil", str);
        r02 = r02;
        return z10;
    }

    public static String Y(Context context, q1 q1Var) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(4);
        if (defaultSensor != null) {
            o oVar = new o(sensorManager, q1Var);
            sensorManager.registerListener(oVar, defaultSensor, 3);
            f1.a(new h(sensorManager, oVar), com.anythink.expressad.video.module.a.a.m.ag);
            return q1Var.a();
        }
        return null;
    }

    public static boolean Z(Context context) {
        Boolean bool;
        Boolean bool2;
        q1 m10 = q1.m(context);
        m10.getClass();
        byte[] bArr = q1.f22960g;
        synchronized (bArr) {
            m10.B();
            bool = m10.f22965a.isTv;
            bool2 = null;
            if (bool == null) {
                bool = null;
            }
        }
        if (bool != null) {
            synchronized (bArr) {
                m10.B();
                Boolean bool3 = m10.f22965a.isTv;
                if (bool3 != null) {
                    bool2 = bool3;
                }
            }
            return bool2.booleanValue();
        }
        boolean c10 = com.huawei.openalliance.ad.ppskit.utils.h.a(context).c();
        synchronized (bArr) {
            m10.B();
            m10.f22965a.isTv = Boolean.valueOf(c10);
            m10.n(m10.f22965a);
        }
        return c10;
    }

    public static int a(Context context) {
        Integer num;
        Integer num2;
        int i10;
        q1 m10 = q1.m(context);
        m10.getClass();
        byte[] bArr = q1.f22960g;
        synchronized (bArr) {
            m10.B();
            num = m10.f22965a.type;
            num2 = null;
            if (num == null) {
                num = null;
            }
        }
        if (num != null) {
            synchronized (bArr) {
                m10.B();
                Integer num3 = m10.f22965a.type;
                if (num3 != null) {
                    num2 = num3;
                }
            }
            return num2.intValue();
        }
        com.huawei.openalliance.ad.ppskit.utils.h a10 = com.huawei.openalliance.ad.ppskit.utils.h.a(context);
        if ("4".equalsIgnoreCase(a10.f22857b)) {
            i10 = 8;
        } else if ("1".equalsIgnoreCase(a10.f22857b)) {
            i10 = 5;
        } else {
            i10 = 4;
        }
        synchronized (bArr) {
            m10.B();
            m10.f22965a.type = Integer.valueOf(i10);
            m10.n(m10.f22965a);
        }
        return i10;
    }

    public static String b(Context context, q1 q1Var) {
        String str;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        if (defaultSensor != null) {
            o oVar = new o(sensorManager, q1Var);
            sensorManager.registerListener(oVar, defaultSensor, 3);
            f1.f22845a.c(new j(sensorManager, oVar), "KIT_ACCELER_DeviceUtil", com.anythink.expressad.video.module.a.a.m.ag);
            q1Var.getClass();
            synchronized (q1.f22960g) {
                q1Var.B();
                str = q1Var.f22965a.acceler;
            }
            return str;
        }
        return null;
    }

    public static String c(Context context, q1 q1Var) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(2);
        if (defaultSensor != null) {
            o oVar = new o(sensorManager, q1Var);
            sensorManager.registerListener(oVar, defaultSensor, 3);
            f1.f22845a.c(new k(sensorManager, oVar), "KIT_MAGNET_DeviceUtil", com.anythink.expressad.video.module.a.a.m.ag);
            return q1Var.b();
        }
        return null;
    }

    public static String d(Context context, q1 q1Var) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(6);
        if (defaultSensor != null) {
            o oVar = new o(sensorManager, q1Var);
            sensorManager.registerListener(oVar, defaultSensor, 3);
            f1.f22845a.c(new l(sensorManager, oVar), "KIT_BARO_DeviceUtil", com.anythink.expressad.video.module.a.a.m.ag);
            return q1Var.c();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long e(android.content.Context r12) {
        /*
            boolean r12 = ka.Cif.e(r12)
            r0 = 1024(0x400, double:5.06E-321)
            java.lang.String r2 = "DeviceUtil"
            r3 = 1
            r4 = 0
            r5 = 0
            if (r12 == 0) goto L50
            java.lang.String r12 = "true"
            java.lang.String r7 = "ro.config.vicky_demo_6G"
            java.lang.String r7 = com.huawei.openalliance.ad.ppskit.utils.z1.o(r7)     // Catch: java.lang.Throwable -> L3e
            boolean r12 = r12.equals(r7)     // Catch: java.lang.Throwable -> L3e
            if (r12 == 0) goto L22
            r7 = 6442450944(0x180000000, double:3.1829936864E-314)
            goto L51
        L22:
            java.lang.String r12 = "com.huawei.android.util.SystemInfo"
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = "getDeviceRam"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L3e
            java.lang.reflect.Method r7 = r12.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L3e
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r12 = r7.invoke(r12, r8)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L3e
            long r7 = java.lang.Long.parseLong(r12)     // Catch: java.lang.Throwable -> L3e
            long r7 = r7 * r0
            goto L51
        L3e:
            r12 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getSimpleName()
            r7[r4] = r12
            java.lang.String r12 = "getDeviceRamForHw: %s"
            ka.n7.j(r2, r12, r7)
        L50:
            r7 = r5
        L51:
            int r12 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r12 > 0) goto Lc7
            r12 = 0
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L9b
            java.lang.String r8 = "/proc/meminfo"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L9b
            boolean r8 = r7.exists()     // Catch: java.lang.Throwable -> L9b
            if (r8 != 0) goto L64
            goto Lba
        L64:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L9b
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L9b
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L99
            java.lang.String r9 = "UTF-8"
            r7.<init>(r8, r9)     // Catch: java.lang.Throwable -> L99
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L96
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L96
            java.lang.String r12 = r9.readLine()     // Catch: java.lang.Throwable -> L94
            boolean r10 = com.huawei.openalliance.ad.ppskit.utils.y1.h(r12)     // Catch: java.lang.Throwable -> L94
            if (r10 == 0) goto L80
            goto L8a
        L80:
            java.lang.String r10 = "\\s+"
            java.lang.String[] r12 = r12.split(r10)     // Catch: java.lang.Throwable -> L94
            int r10 = r12.length     // Catch: java.lang.Throwable -> L94
            r11 = 2
            if (r10 >= r11) goto L8b
        L8a:
            goto Lb1
        L8b:
            r12 = r12[r3]     // Catch: java.lang.Throwable -> L94
            long r2 = java.lang.Long.parseLong(r12)     // Catch: java.lang.Throwable -> L94
            long r5 = r2 * r0
            goto Lb1
        L94:
            r12 = move-exception
            goto La0
        L96:
            r0 = move-exception
            r9 = r12
            goto L9f
        L99:
            r0 = move-exception
            goto L9d
        L9b:
            r0 = move-exception
            r8 = r12
        L9d:
            r7 = r12
            r9 = r7
        L9f:
            r12 = r0
        La0:
            java.lang.String r0 = "getDeviceRamNative: %s"
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lbc
            java.lang.Class r12 = r12.getClass()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r12 = r12.getSimpleName()     // Catch: java.lang.Throwable -> Lbc
            r1[r4] = r12     // Catch: java.lang.Throwable -> Lbc
            ka.n7.j(r2, r0, r1)     // Catch: java.lang.Throwable -> Lbc
        Lb1:
            androidx.transition.n.D(r9)
            androidx.transition.n.D(r7)
            androidx.transition.n.D(r8)
        Lba:
            r7 = r5
            goto Lc7
        Lbc:
            r12 = move-exception
            androidx.transition.n.D(r9)
            androidx.transition.n.D(r7)
            androidx.transition.n.D(r8)
            throw r12
        Lc7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.m.e(android.content.Context):long");
    }

    public static String f(Context context, q1 q1Var) {
        String str;
        SafeIntent safeIntent = new SafeIntent(context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
        int intExtra = safeIntent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
        int intExtra2 = safeIntent.getIntExtra("scale", -1);
        int i10 = (int) ((intExtra / intExtra2) * 100.0f);
        if (intExtra != -1 && intExtra2 != -1) {
            str = y1.d(Integer.valueOf(i10));
        } else {
            str = com.huawei.openalliance.ad.constant.w.aU;
        }
        q1Var.getClass();
        synchronized (q1.f22960g) {
            q1Var.B();
            q1.b bVar = q1Var.f22965a;
            bVar.battery = str;
            q1Var.n(bVar);
        }
        return str;
    }

    public static String g(Context context, q1 q1Var) {
        String d10;
        int intExtra = new SafeIntent(context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))).getIntExtra("status", 1);
        if (intExtra == -1) {
            d10 = com.huawei.openalliance.ad.constant.w.aU;
        } else {
            d10 = y1.d(Integer.valueOf(intExtra));
        }
        q1Var.getClass();
        synchronized (q1.f22960g) {
            q1Var.B();
            q1.b bVar = q1Var.f22965a;
            bVar.charging = d10;
            q1Var.n(bVar);
        }
        return d10;
    }

    public static boolean h(Context context) {
        if (context == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!p1.a(context, (String) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean i(q1 q1Var) {
        boolean z10;
        String property = System.getProperty("http.proxyPort");
        String property2 = System.getProperty("http.proxyHost");
        if (property == null) {
            property = "-1";
        }
        int parseInt = Integer.parseInt(property);
        if (!TextUtils.isEmpty(property2) && parseInt != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean valueOf = Boolean.valueOf(z10);
        q1Var.getClass();
        synchronized (q1.f22960g) {
            q1Var.B();
            q1.b bVar = q1Var.f22965a;
            if (bVar != null) {
                bVar.isProxy = valueOf;
                q1Var.n(bVar);
            }
        }
        return z10;
    }

    public static boolean j(Context context, q1 q1Var) {
        boolean z10 = false;
        if (Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", 0) > 0) {
            z10 = true;
        }
        Boolean valueOf = Boolean.valueOf(z10);
        q1Var.getClass();
        synchronized (q1.f22960g) {
            q1Var.B();
            q1.b bVar = q1Var.f22965a;
            if (bVar != null) {
                bVar.isDebug = valueOf;
                q1Var.n(bVar);
            }
        }
        return z10;
    }

    public static boolean k(Context context, q1 q1Var) {
        boolean z10;
        boolean z11;
        SafeIntent safeIntent = new SafeIntent(context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
        int intExtra = safeIntent.getIntExtra("status", -1);
        boolean z12 = true;
        if (intExtra != 2 && intExtra != 5) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (safeIntent.getIntExtra("plugged", -1) == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10 || !z11) {
            z12 = false;
        }
        Boolean valueOf = Boolean.valueOf(z12);
        q1Var.getClass();
        synchronized (q1.f22960g) {
            q1Var.B();
            q1.b bVar = q1Var.f22965a;
            if (bVar != null) {
                bVar.usb = valueOf;
                q1Var.n(bVar);
            }
        }
        return z12;
    }

    public static Boolean l(Context context, q1 q1Var) {
        boolean c10 = o2.c(context, "com.huawei.works");
        q1Var.getClass();
        synchronized (q1.f22963j) {
            q1Var.D();
            q1.d dVar = q1Var.f22967c;
            if (dVar != null) {
                dVar.isWelinkUser = Boolean.valueOf(c10);
                q1Var.p(q1Var.f22967c);
            }
        }
        return Boolean.valueOf(c10);
    }

    public static Boolean m(Context context, q1 q1Var) {
        try {
            y6 c10 = w6.b(context).c(String.class, "queryChildMode", "", true);
            if (200 == c10.f32210b) {
                n7.e("DeviceUtil", "query child mode success");
                String str = (String) c10.f32211c;
                if (y1.h(str)) {
                    return Boolean.FALSE;
                }
                boolean parseBoolean = Boolean.parseBoolean(str);
                q1Var.getClass();
                synchronized (q1.f22963j) {
                    q1Var.D();
                    q1.d dVar = q1Var.f22967c;
                    if (dVar != null) {
                        dVar.isChildMode = Boolean.valueOf(parseBoolean);
                        q1Var.p(q1Var.f22967c);
                    }
                }
                return Boolean.valueOf(parseBoolean);
            }
        } catch (Throwable th) {
            n7.h("DeviceUtil", "query child mode err: %s", th.getClass().getSimpleName());
        }
        return Boolean.FALSE;
    }

    public static String n(Context context, long j10) {
        String str;
        q1 m10 = q1.m(context);
        m10.getClass();
        synchronized (q1.f22960g) {
            m10.B();
            str = m10.f22965a.wifiName;
        }
        if (TextUtils.isEmpty(str)) {
            str = o(context, m10);
        } else if (c2.b("getWifi", j10)) {
            p2.g(new a(context, m10));
        }
        if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str)) {
            return null;
        }
        return str;
    }

    public static String o(Context context, q1 q1Var) {
        String str;
        String str2 = null;
        try {
            WifiInfo d10 = g2.d(context);
            if (Build.VERSION.SDK_INT >= 29) {
                if (!h(context)) {
                    n7.b("DeviceUtil", "get wifi name has no location permission ");
                    return com.huawei.openalliance.ad.constant.w.aU;
                }
                if (d10 != null) {
                    String ssid = d10.getSSID();
                    if (!ssid.equals("<unknown ssid>")) {
                        str2 = ssid;
                    }
                }
            } else if (d10 != null) {
                int networkId = d10.getNetworkId();
                List<WifiConfiguration> configuredNetworks = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConfiguredNetworks();
                if (!androidx.transition.n.M(configuredNetworks)) {
                    for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                        if (wifiConfiguration != null && wifiConfiguration.networkId == networkId) {
                            String str3 = wifiConfiguration.SSID;
                            if (!str3.replace("\"", "").equals("<unknown ssid>")) {
                                str2 = str3;
                            }
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                str = str2.replace("\"", "");
            } else {
                str = com.huawei.openalliance.ad.constant.w.aU;
            }
            str2 = str;
            q1Var.getClass();
            synchronized (q1.f22960g) {
                q1Var.B();
                q1.b bVar = q1Var.f22965a;
                bVar.wifiName = str2;
                q1Var.n(bVar);
            }
        } catch (Throwable th) {
            n7.h("DeviceUtil", "getWifi exception: %s", th.getClass().getSimpleName());
        }
        return str2;
    }

    public static String p(Context context, String str) {
        String a10;
        if (d0.q(context, str)) {
            a10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(context).l(str);
        } else {
            a10 = a0.a.K(context).a();
        }
        return y1.v(a10);
    }

    public static String q(Context context) {
        String str;
        String simpleName;
        String str2;
        if (com.huawei.openalliance.ad.ppskit.handlers.l.d(context).k() && !z1.R(context)) {
            q1 m10 = q1.m(context);
            m10.getClass();
            byte[] bArr = q1.f22961h;
            synchronized (bArr) {
                m10.C();
                q1.e eVar = m10.f22966b;
                if (eVar == null) {
                    str = null;
                } else {
                    str = eVar.hiadUTag;
                }
            }
            if (TextUtils.isEmpty(str)) {
                if (context == null) {
                    return "";
                }
                if (com.huawei.openalliance.ad.ppskit.handlers.l.d(context).k() && !z1.R(context)) {
                    if (com.huawei.openalliance.ad.ppskit.handlers.l.d(context).j(30, context.getPackageName(), "udid")) {
                        n7.b("DeviceUtil", "within udid call time interval");
                        return "";
                    }
                    try {
                        if (n7.d()) {
                            n7.b("DeviceUtil", "no cached udid, direct get.");
                        }
                        com.huawei.openalliance.ad.ppskit.handlers.l.d(context).S(context.getPackageName(), "udid");
                        Class<?> cls = Class.forName(a0.a.L(context).g());
                        Object invoke = cls.getDeclaredMethod("getUDID", new Class[0]).invoke(cls, new Object[0]);
                        if (invoke instanceof String) {
                            String str3 = (String) invoke;
                            synchronized (bArr) {
                                m10.C();
                                q1.e eVar2 = m10.f22966b;
                                if (eVar2 != null) {
                                    eVar2.hiadUTag = str3;
                                    m10.o(eVar2, m10.f22969e.getSharedPreferences("hiad_sp_sec_properties_cache", 4).edit());
                                }
                            }
                            return (String) invoke;
                        }
                        synchronized (bArr) {
                            m10.C();
                            q1.e eVar3 = m10.f22966b;
                            if (eVar3 != null) {
                                eVar3.hiadUTag = com.huawei.openalliance.ad.constant.w.aU;
                                m10.o(eVar3, m10.f22969e.getSharedPreferences("hiad_sp_sec_properties_cache", 4).edit());
                            }
                        }
                        return "";
                    } catch (RuntimeException e10) {
                        simpleName = e10.getClass().getSimpleName();
                        str2 = "getUDID RuntimeException:";
                        n7.i("DeviceUtil", str2.concat(simpleName));
                        return "";
                    } catch (Throwable th) {
                        simpleName = th.getClass().getSimpleName();
                        str2 = "getUDID Exception:";
                        n7.i("DeviceUtil", str2.concat(simpleName));
                        return "";
                    }
                }
                n7.e("DeviceUtil", "not enable user info or oobe, skip udid.");
                return "";
            }
            n7.e("DeviceUtil", "use cached udid");
            if (com.huawei.openalliance.ad.constant.w.aU.equalsIgnoreCase(str)) {
                return null;
            }
            return str;
        }
        n7.e("DeviceUtil", "not enable user info or oobe, skip udid.");
        return "";
    }

    public static String r(Context context, long j10) {
        String str;
        q1 m10 = q1.m(context);
        m10.getClass();
        synchronized (q1.f22963j) {
            m10.D();
            q1.d dVar = m10.f22967c;
            if (dVar == null) {
                str = null;
            } else {
                str = dVar.wifiLevel;
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = s(context, m10);
        } else if (c2.b("getWifiLevel", j10)) {
            p2.g(new b(context, m10));
        }
        if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str)) {
            return null;
        }
        return str;
    }

    public static String s(Context context, q1 q1Var) {
        WifiInfo d10;
        String str = null;
        try {
            d10 = g2.d(context);
        } catch (Throwable th) {
            n7.h("DeviceUtil", "getWifiLevel exception: %s", th.getClass().getSimpleName());
        }
        if (Build.VERSION.SDK_INT >= 29 && !h(context)) {
            n7.b("DeviceUtil", "get wifi level has no location permission ");
            return com.huawei.openalliance.ad.constant.w.aU;
        }
        if (d10 != null) {
            str = Integer.toString(d10.getRssi());
        }
        q1Var.getClass();
        synchronized (q1.f22963j) {
            q1Var.D();
            q1.d dVar = q1Var.f22967c;
            if (dVar != null) {
                dVar.wifiLevel = str;
                q1Var.p(dVar);
            }
        }
        return str;
    }

    public static boolean t(Context context, q1 q1Var, String str) {
        boolean z10;
        int i10;
        boolean z11;
        String str2;
        ArrayList arrayList = new ArrayList();
        arrayList.add("/system/lib/libc_malloc_debug_qemu.so");
        arrayList.add("/sys/qemu_trace");
        arrayList.add("/system/bin/qemu-props");
        arrayList.add("/dev/socket/genyd");
        arrayList.add("/dev/socket/baseband_genyd");
        arrayList.add("/dev/socket/qemud");
        arrayList.add("/dev/qemu_pipe");
        Iterator it = arrayList.iterator();
        while (true) {
            z10 = true;
            if (it.hasNext()) {
                if (new File((String) it.next()).exists()) {
                    z11 = true;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
        synchronized (d10.f22585a) {
            Map<String, String> K = d10.K(str, true);
            if (K != null) {
                str2 = K.get("emulatorFile");
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            for (String str3 : str2.split(",")) {
                if (new File(str3).exists()) {
                    break;
                }
            }
        }
        z10 = z11;
        Boolean valueOf = Boolean.valueOf(z10);
        q1Var.getClass();
        synchronized (q1.f22960g) {
            q1Var.B();
            q1.b bVar = q1Var.f22965a;
            if (bVar != null) {
                bVar.isEmulator = valueOf;
                q1Var.n(bVar);
            }
        }
        return z10;
    }

    public static String u(Context context) {
        String f10 = Cif.a(context).f();
        n7.f("DeviceUtil", "getHMVerion, ver= %s", f10);
        if (TextUtils.isEmpty(f10)) {
            return null;
        }
        return f10;
    }

    public static String v(Context context, long j10) {
        String str;
        q1 m10 = q1.m(context);
        m10.getClass();
        synchronized (q1.f22960g) {
            m10.B();
            str = m10.f22965a.pdtName;
        }
        if (TextUtils.isEmpty(str)) {
            return Q(context, m10);
        }
        if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str)) {
            if (c2.b("getPdtName", j10)) {
                p2.g(new c(context, m10));
            }
            return null;
        }
        return str;
    }

    public static Long w(Context context, long j10) {
        String str;
        q1 m10 = q1.m(context);
        m10.getClass();
        synchronized (q1.f22960g) {
            m10.B();
            str = m10.f22965a.totalMem;
        }
        if (TextUtils.isEmpty(str)) {
            str = S(context, m10);
        } else if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str)) {
            if (c2.b("getTotalMem", j10)) {
                p2.g(new d(context, m10));
            }
            str = null;
        }
        return y1.s(str);
    }

    public static Long x(Context context, long j10) {
        String str;
        q1 m10 = q1.m(context);
        m10.getClass();
        synchronized (q1.f22960g) {
            m10.B();
            str = m10.f22965a.freeSto;
        }
        if (TextUtils.isEmpty(str)) {
            str = U(context, m10);
        } else if (c2.b("getFreeSto", j10)) {
            p2.g(new f(context, m10));
        }
        if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str)) {
            str = null;
        }
        return y1.s(str);
    }

    public static boolean y() {
        if (f0.a.f22843a < 21 && f0.a.f22844b < 33) {
            return false;
        }
        return true;
    }

    public static boolean z(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
            return true;
        }
        return false;
    }

    /* loaded from: classes2.dex */
    public static class o implements SensorEventListener {

        /* renamed from: s, reason: collision with root package name */
        public final SensorManager f22921s;

        /* renamed from: t, reason: collision with root package name */
        public final q1 f22922t;

        public o(SensorManager sensorManager, q1 q1Var) {
            this.f22921s = sensorManager;
            this.f22922t = q1Var;
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 4) {
                float[] fArr = sensorEvent.values;
                String str = y1.d(Float.valueOf(fArr[0])) + "," + y1.d(Float.valueOf(fArr[1])) + "," + y1.d(Float.valueOf(fArr[2]));
                q1 q1Var = this.f22922t;
                q1Var.getClass();
                synchronized (q1.f22960g) {
                    q1Var.B();
                    q1.b bVar = q1Var.f22965a;
                    bVar.gyro = str;
                    q1Var.n(bVar);
                }
                this.f22921s.unregisterListener(this);
                f1.f22845a.d("KIT_GROY_DeviceUtil");
            }
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr2 = sensorEvent.values;
                String str2 = y1.d(Float.valueOf(fArr2[0])) + "," + y1.d(Float.valueOf(fArr2[1])) + "," + y1.d(Float.valueOf(fArr2[2]));
                q1 q1Var2 = this.f22922t;
                q1Var2.getClass();
                synchronized (q1.f22960g) {
                    q1Var2.B();
                    q1.b bVar2 = q1Var2.f22965a;
                    bVar2.acceler = str2;
                    q1Var2.n(bVar2);
                }
                this.f22921s.unregisterListener(this);
                f1.f22845a.d("KIT_ACCELER_DeviceUtil");
            }
            if (sensorEvent.sensor.getType() == 2) {
                float[] fArr3 = sensorEvent.values;
                String str3 = y1.d(Float.valueOf(fArr3[0])) + "," + y1.d(Float.valueOf(fArr3[1])) + "," + y1.d(Float.valueOf(fArr3[2]));
                q1 q1Var3 = this.f22922t;
                q1Var3.getClass();
                synchronized (q1.f22960g) {
                    q1Var3.B();
                    q1.b bVar3 = q1Var3.f22965a;
                    bVar3.magnet = str3;
                    q1Var3.n(bVar3);
                }
                this.f22921s.unregisterListener(this);
                f1.f22845a.d("KIT_MAGNET_DeviceUtil");
            }
            if (sensorEvent.sensor.getType() == 6) {
                float f = sensorEvent.values[0];
                q1 q1Var4 = this.f22922t;
                String d10 = y1.d(Float.valueOf(f));
                q1Var4.getClass();
                synchronized (q1.f22960g) {
                    q1Var4.B();
                    q1.b bVar4 = q1Var4.f22965a;
                    bVar4.baro = d10;
                    q1Var4.n(bVar4);
                }
                this.f22921s.unregisterListener(this);
                f1.f22845a.d("KIT_BARO_DeviceUtil");
            }
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i10) {
        }
    }
}
