package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.applovin.impl.sdk.e.f;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.d;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class s {
    private static final AtomicReference<d.a> E = new AtomicReference<>();
    private static final AtomicReference<b> F = new AtomicReference<>();
    private static final AtomicReference<Integer> G = new AtomicReference<>();
    private final int A;
    private final int B;
    private final p C;
    private final Context D;

    /* renamed from: a, reason: collision with root package name */
    private final i f19288a;

    /* renamed from: b, reason: collision with root package name */
    private final j f19289b;

    /* renamed from: c, reason: collision with root package name */
    private final c f19290c;

    /* renamed from: d, reason: collision with root package name */
    private final d f19291d;

    /* renamed from: e, reason: collision with root package name */
    private final f f19292e;
    private final h f;

    /* renamed from: g, reason: collision with root package name */
    private final String f19293g;

    /* renamed from: h, reason: collision with root package name */
    private final String f19294h;

    /* renamed from: i, reason: collision with root package name */
    private final double f19295i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f19296j;

    /* renamed from: k, reason: collision with root package name */
    private String f19297k;

    /* renamed from: l, reason: collision with root package name */
    private long f19298l;

    /* renamed from: m, reason: collision with root package name */
    private final a f19299m;

    /* renamed from: n, reason: collision with root package name */
    private final g f19300n;
    private boolean o;

    /* renamed from: p, reason: collision with root package name */
    private e f19301p;

    /* renamed from: q, reason: collision with root package name */
    private e f19302q;

    /* renamed from: r, reason: collision with root package name */
    private e f19303r;

    /* renamed from: s, reason: collision with root package name */
    private e f19304s;

    /* renamed from: t, reason: collision with root package name */
    private e f19305t;

    /* renamed from: u, reason: collision with root package name */
    private e f19306u;

    /* renamed from: v, reason: collision with root package name */
    private e f19307v;

    /* renamed from: w, reason: collision with root package name */
    private final int f19308w;

    /* renamed from: x, reason: collision with root package name */
    private final int f19309x;
    private final int y;

    /* renamed from: z, reason: collision with root package name */
    private final int f19310z;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: b, reason: collision with root package name */
        private final String f19316b;

        /* renamed from: c, reason: collision with root package name */
        private final String f19317c;

        /* renamed from: d, reason: collision with root package name */
        private final String f19318d;

        /* renamed from: e, reason: collision with root package name */
        private final String f19319e;
        private final String f;

        /* renamed from: g, reason: collision with root package name */
        private final Long f19320g;

        /* renamed from: h, reason: collision with root package name */
        private final long f19321h;

        /* renamed from: i, reason: collision with root package name */
        private final int f19322i;

        /* renamed from: j, reason: collision with root package name */
        private final int f19323j;

        public Long a() {
            p pVar = s.this.C;
            com.applovin.impl.sdk.c.d<Long> dVar = com.applovin.impl.sdk.c.d.f18739g;
            Long l10 = (Long) pVar.a(dVar);
            if (l10 != null) {
                return l10;
            }
            s.this.C.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Long>>) dVar, (com.applovin.impl.sdk.c.d<Long>) Long.valueOf(this.f19321h));
            return null;
        }

        public String b() {
            return this.f19316b;
        }

        public String c() {
            return this.f19317c;
        }

        public String d() {
            return this.f19318d;
        }

        public String e() {
            return this.f19319e;
        }

        public String f() {
            return this.f;
        }

        public Long g() {
            return this.f19320g;
        }

        public long h() {
            return this.f19321h;
        }

        public int i() {
            return this.f19322i;
        }

        public int j() {
            return this.f19323j;
        }

        private a() {
            PackageManager packageManager = s.this.D.getPackageManager();
            ApplicationInfo applicationInfo = s.this.D.getApplicationInfo();
            File file = new File(applicationInfo.sourceDir);
            PackageInfo packageInfo = packageManager.getPackageInfo(s.this.D.getPackageName(), 0);
            this.f19316b = packageManager.getApplicationLabel(applicationInfo).toString();
            this.f19317c = packageInfo.versionName;
            this.f19322i = packageInfo.versionCode;
            String str = applicationInfo.packageName;
            this.f19318d = str;
            this.f19319e = StringUtils.toShortSHA1Hash(str);
            this.f19321h = file.lastModified();
            this.f19320g = Long.valueOf(packageInfo.firstInstallTime);
            this.f19323j = applicationInfo.targetSdkVersion;
            this.f = packageManager.getInstallerPackageName(str);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f19324a;

        /* renamed from: b, reason: collision with root package name */
        private final int f19325b;

        public b(String str, int i10) {
            this.f19324a = str;
            this.f19325b = i10;
        }

        public String a() {
            return this.f19324a;
        }

        public int b() {
            return this.f19325b;
        }
    }

    /* loaded from: classes.dex */
    public class c {

        /* renamed from: b, reason: collision with root package name */
        private e f19327b;

        /* renamed from: c, reason: collision with root package name */
        private e f19328c;

        /* renamed from: d, reason: collision with root package name */
        private e f19329d;

        /* renamed from: e, reason: collision with root package name */
        private final AudioManager f19330e;

        public int a() {
            e eVar = this.f19329d;
            if (eVar != null && !eVar.a()) {
                return ((Integer) this.f19329d.f19337b).intValue();
            }
            s sVar = s.this;
            e eVar2 = new e(Integer.valueOf(sVar.C.ad().a()), s.this.y);
            this.f19329d = eVar2;
            return ((Integer) eVar2.f19337b).intValue();
        }

        public Integer b() {
            e eVar = this.f19327b;
            if (eVar != null && !eVar.a()) {
                return Integer.valueOf(((Integer) this.f19327b.f19337b).intValue());
            }
            if (this.f19330e == null) {
                return null;
            }
            try {
                e eVar2 = new e(Integer.valueOf((int) (this.f19330e.getStreamVolume(3) * ((Float) s.this.C.a(com.applovin.impl.sdk.c.b.eg)).floatValue())), s.this.f19309x);
                this.f19327b = eVar2;
                return Integer.valueOf(((Integer) eVar2.f19337b).intValue());
            } catch (Throwable th) {
                s.this.C.L();
                if (y.a()) {
                    s.this.C.L().b("DataProvider", "Unable to collect device volume", th);
                }
                return null;
            }
        }

        public String c() {
            e eVar = this.f19328c;
            if (eVar != null && !eVar.a()) {
                return (String) this.f19328c.f19337b;
            }
            if (this.f19330e == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            if (com.applovin.impl.sdk.utils.h.e()) {
                for (AudioDeviceInfo audioDeviceInfo : this.f19330e.getDevices(2)) {
                    sb2.append(audioDeviceInfo.getType());
                    sb2.append(",");
                }
            } else {
                if (this.f19330e.isWiredHeadsetOn()) {
                    sb2.append("3,");
                }
                if (this.f19330e.isBluetoothScoOn()) {
                    sb2.append("7,");
                }
                if (this.f19330e.isBluetoothA2dpOn()) {
                    sb2.append(8);
                }
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            String sb3 = sb2.toString();
            if (TextUtils.isEmpty(sb3)) {
                s.this.C.L();
                if (y.a()) {
                    s.this.C.L().b("DataProvider", "No sound outputs detected");
                }
            }
            e eVar2 = new e(sb3, r3.f19310z);
            this.f19328c = eVar2;
            return (String) eVar2.f19337b;
        }

        private c() {
            this.f19330e = (AudioManager) s.this.D.getSystemService(com.anythink.expressad.exoplayer.k.o.f9069b);
        }
    }

    /* loaded from: classes.dex */
    public class d {

        /* renamed from: b, reason: collision with root package name */
        private e f19332b;

        /* renamed from: c, reason: collision with root package name */
        private e f19333c;

        /* renamed from: d, reason: collision with root package name */
        private final Intent f19334d;

        /* renamed from: e, reason: collision with root package name */
        private BatteryManager f19335e;

        public Integer a() {
            int i10;
            BatteryManager batteryManager;
            e eVar = this.f19332b;
            if (eVar != null && !eVar.a()) {
                return Integer.valueOf(((Integer) this.f19332b.f19337b).intValue());
            }
            if (com.applovin.impl.sdk.utils.h.d() && (batteryManager = this.f19335e) != null) {
                i10 = batteryManager.getIntProperty(4);
            } else {
                Intent intent = this.f19334d;
                if (intent == null) {
                    return null;
                }
                int intExtra = intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                int intExtra2 = this.f19334d.getIntExtra("scale", -1);
                if (intExtra < 0 || intExtra2 < 0) {
                    return null;
                }
                i10 = (int) ((intExtra / intExtra2) * 100.0f);
            }
            e eVar2 = new e(Integer.valueOf(i10), s.this.y);
            this.f19332b = eVar2;
            return Integer.valueOf(((Integer) eVar2.f19337b).intValue());
        }

        public Integer b() {
            int intExtra;
            BatteryManager batteryManager;
            e eVar = this.f19333c;
            if (eVar != null && !eVar.a()) {
                return Integer.valueOf(((Integer) this.f19333c.f19337b).intValue());
            }
            if (com.applovin.impl.sdk.utils.h.g() && (batteryManager = this.f19335e) != null) {
                intExtra = batteryManager.getIntProperty(6);
            } else {
                Intent intent = this.f19334d;
                if (intent == null || (intExtra = intent.getIntExtra("status", -1)) < 0) {
                    return null;
                }
            }
            e eVar2 = new e(Integer.valueOf(intExtra), s.this.y);
            this.f19333c = eVar2;
            return Integer.valueOf(((Integer) eVar2.f19337b).intValue());
        }

        private d() {
            this.f19334d = s.this.D.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (com.applovin.impl.sdk.utils.h.d()) {
                this.f19335e = (BatteryManager) s.this.D.getSystemService("batterymanager");
            }
        }
    }

    /* loaded from: classes.dex */
    public class e {

        /* renamed from: b, reason: collision with root package name */
        private final Object f19337b;

        /* renamed from: c, reason: collision with root package name */
        private final long f19338c;

        private e(Object obj, long j10) {
            this.f19337b = obj;
            this.f19338c = b() + j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a() {
            return !((Boolean) s.this.C.a(com.applovin.impl.sdk.c.b.dF)).booleanValue() || this.f19338c - b() <= 0;
        }

        private long b() {
            return System.currentTimeMillis() / 1000;
        }
    }

    /* loaded from: classes.dex */
    public class f {

        /* renamed from: b, reason: collision with root package name */
        private int f19340b;

        /* renamed from: c, reason: collision with root package name */
        private int f19341c;

        /* renamed from: d, reason: collision with root package name */
        private int f19342d;

        /* renamed from: e, reason: collision with root package name */
        private float f19343e;
        private float f;

        /* renamed from: g, reason: collision with root package name */
        private float f19344g;

        /* renamed from: h, reason: collision with root package name */
        private double f19345h;

        public int a() {
            return this.f19340b;
        }

        public int b() {
            return this.f19341c;
        }

        public int c() {
            return this.f19342d;
        }

        public float d() {
            return this.f19343e;
        }

        public float e() {
            return this.f;
        }

        public float f() {
            return this.f19344g;
        }

        public double g() {
            return this.f19345h;
        }

        private f() {
            DisplayMetrics displayMetrics = s.this.D.getResources().getDisplayMetrics();
            if (displayMetrics == null) {
                return;
            }
            this.f19344g = displayMetrics.density;
            this.f19343e = displayMetrics.xdpi;
            this.f = displayMetrics.ydpi;
            this.f19342d = displayMetrics.densityDpi;
            Point a10 = com.applovin.impl.sdk.utils.h.a(s.this.D);
            int i10 = a10.x;
            this.f19340b = i10;
            this.f19341c = a10.y;
            this.f19345h = Math.sqrt(Math.pow(this.f19341c, 2.0d) + Math.pow(i10, 2.0d)) / this.f19343e;
        }
    }

    /* loaded from: classes.dex */
    public class g {

        /* renamed from: b, reason: collision with root package name */
        private final SharedPreferences f19347b;

        public String a() {
            return (String) s.this.C.b(com.applovin.impl.sdk.c.d.f18748q, null, this.f19347b);
        }

        public Object b() {
            String a10 = com.applovin.impl.sdk.c.d.f18749r.a();
            if (!this.f19347b.contains(a10)) {
                return null;
            }
            String str = (String) com.applovin.impl.sdk.c.e.a(a10, "", String.class, this.f19347b);
            Integer num = (Integer) com.applovin.impl.sdk.c.e.a(a10, Integer.MAX_VALUE, Integer.class, this.f19347b);
            Long l10 = (Long) com.applovin.impl.sdk.c.e.a(a10, Long.MAX_VALUE, Long.class, this.f19347b);
            Boolean bool = (Boolean) com.applovin.impl.sdk.c.e.a(a10, Boolean.FALSE, Boolean.class, this.f19347b);
            if (StringUtils.isValidString(str)) {
                return str;
            }
            if (num != null && num.intValue() != Integer.MAX_VALUE) {
                return num;
            }
            if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                return l10;
            }
            return bool;
        }

        private g() {
            this.f19347b = PreferenceManager.getDefaultSharedPreferences(s.this.D);
        }
    }

    /* loaded from: classes.dex */
    public class h {

        /* renamed from: b, reason: collision with root package name */
        private long f19349b;

        /* renamed from: c, reason: collision with root package name */
        private e f19350c;

        /* renamed from: d, reason: collision with root package name */
        private e f19351d;

        /* renamed from: e, reason: collision with root package name */
        private e f19352e;
        private final ActivityManager f;

        public Long a() {
            e eVar = this.f19350c;
            if (eVar != null && !eVar.a()) {
                return Long.valueOf(((Long) this.f19350c.f19337b).longValue());
            }
            if (this.f == null) {
                return null;
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            try {
                this.f.getMemoryInfo(memoryInfo);
                e eVar2 = new e(Long.valueOf(memoryInfo.availMem), s.this.f19308w);
                this.f19350c = eVar2;
                return Long.valueOf(((Long) eVar2.f19337b).longValue());
            } catch (Throwable th) {
                s.this.C.L();
                if (y.a()) {
                    s.this.C.L().b("DataProvider", "Unable to collect available memory.", th);
                }
                return null;
            }
        }

        public Long b() {
            e eVar = this.f19351d;
            if (eVar != null && !eVar.a()) {
                return Long.valueOf(((Long) this.f19351d.f19337b).longValue());
            }
            if (this.f == null) {
                return null;
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            try {
                this.f.getMemoryInfo(memoryInfo);
                e eVar2 = new e(Long.valueOf(memoryInfo.threshold), s.this.f19308w);
                this.f19351d = eVar2;
                return Long.valueOf(((Long) eVar2.f19337b).longValue());
            } catch (Throwable th) {
                s.this.C.L();
                if (y.a()) {
                    s.this.C.L().b("DataProvider", "Unable to collect low memory threshold.", th);
                }
                return null;
            }
        }

        public Boolean c() {
            e eVar = this.f19352e;
            if (eVar != null && !eVar.a()) {
                return Boolean.valueOf(((Boolean) this.f19352e.f19337b).booleanValue());
            }
            if (this.f == null) {
                return null;
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            try {
                this.f.getMemoryInfo(memoryInfo);
                e eVar2 = new e(Boolean.valueOf(memoryInfo.lowMemory), s.this.f19308w);
                this.f19352e = eVar2;
                return Boolean.valueOf(((Boolean) eVar2.f19337b).booleanValue());
            } catch (Throwable th) {
                s.this.C.L();
                if (y.a()) {
                    s.this.C.L().b("DataProvider", "Unable to collect has low memory.", th);
                }
                return null;
            }
        }

        public long d() {
            return this.f19349b;
        }

        private h() {
            ActivityManager activityManager = (ActivityManager) s.this.D.getSystemService("activity");
            this.f = activityManager;
            if (activityManager == null) {
                return;
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            try {
                activityManager.getMemoryInfo(memoryInfo);
                this.f19349b = memoryInfo.totalMem;
            } catch (Throwable th) {
                s.this.C.L();
                if (y.a()) {
                    s.this.C.L().b("DataProvider", "Unable to collect memory info.", th);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class i {

        /* renamed from: b, reason: collision with root package name */
        private final PowerManager f19354b;

        public Integer a() {
            if (s.this.f19301p != null && !s.this.f19301p.a()) {
                return Integer.valueOf(((Integer) s.this.f19301p.f19337b).intValue());
            }
            if (this.f19354b != null && com.applovin.impl.sdk.utils.h.d()) {
                s sVar = s.this;
                sVar.f19301p = new e(Integer.valueOf(this.f19354b.isPowerSaveMode() ? 1 : 0), s.this.y);
                return Integer.valueOf(((Integer) s.this.f19301p.f19337b).intValue());
            }
            return null;
        }

        private i() {
            this.f19354b = (PowerManager) s.this.D.getSystemService("power");
        }
    }

    /* loaded from: classes.dex */
    public class j {

        /* renamed from: b, reason: collision with root package name */
        private final TelephonyManager f19356b;

        /* renamed from: c, reason: collision with root package name */
        private String f19357c;

        /* renamed from: d, reason: collision with root package name */
        private String f19358d;

        /* renamed from: e, reason: collision with root package name */
        private String f19359e;
        private String f;

        /* renamed from: g, reason: collision with root package name */
        private String f19360g;

        /* renamed from: h, reason: collision with root package name */
        private e f19361h;

        public Integer a() {
            e eVar = this.f19361h;
            if (eVar != null && !eVar.a()) {
                return Integer.valueOf(((Integer) this.f19361h.f19337b).intValue());
            }
            if (com.applovin.impl.sdk.utils.h.a("android.permission.READ_PHONE_STATE", s.this.D) && this.f19356b != null && com.applovin.impl.sdk.utils.h.f()) {
                e eVar2 = new e(Integer.valueOf(this.f19356b.getDataNetworkType()), s.this.B);
                this.f19361h = eVar2;
                return Integer.valueOf(((Integer) eVar2.f19337b).intValue());
            }
            return null;
        }

        public String b() {
            return this.f19358d;
        }

        public String c() {
            return this.f19359e;
        }

        public String d() {
            return this.f;
        }

        public String e() {
            return this.f19360g;
        }

        private j() {
            TelephonyManager telephonyManager = (TelephonyManager) s.this.D.getSystemService("phone");
            this.f19356b = telephonyManager;
            if (telephonyManager == null) {
                return;
            }
            this.f19358d = telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH);
            try {
                this.f19359e = telephonyManager.getNetworkOperatorName();
            } catch (Throwable th) {
                s.this.C.L();
                if (y.a()) {
                    s.this.C.L().b("DataProvider", "Unable to collect carrier", th);
                }
            }
            try {
                this.f19357c = this.f19356b.getNetworkOperator();
            } catch (Throwable th2) {
                s.this.C.L();
                if (y.a()) {
                    s.this.C.L().b("DataProvider", "Unable to collect get network operator", th2);
                }
            }
            String str = this.f19357c;
            if (str == null) {
                return;
            }
            int min = Math.min(3, str.length());
            this.f = this.f19357c.substring(0, min);
            this.f19360g = this.f19357c.substring(min);
        }
    }

    public s(p pVar) {
        String str;
        boolean z10;
        this.C = pVar;
        Context y = p.y();
        this.D = y;
        this.f19308w = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.er)).intValue();
        this.f19309x = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.es)).intValue();
        this.y = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.et)).intValue();
        this.f19310z = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.eu)).intValue();
        this.A = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.ev)).intValue();
        this.B = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.ew)).intValue();
        this.f19288a = new i();
        this.f19289b = new j();
        this.f19290c = new c();
        this.f19291d = new d();
        this.f19292e = new f();
        this.f = new h();
        if (AppLovinSdkUtils.isFireOS(y)) {
            str = "fireos";
        } else {
            str = "android";
        }
        this.f19293g = str;
        int orientation = AppLovinSdkUtils.getOrientation(y);
        if (orientation == 1) {
            this.f19294h = "portrait";
        } else if (orientation == 2) {
            this.f19294h = "landscape";
        } else {
            this.f19294h = "none";
        }
        this.f19295i = Math.round((TimeZone.getDefault().getOffset(new Date().getTime()) * 10.0d) / 3600000.0d) / 10.0d;
        SensorManager sensorManager = (SensorManager) y.getSystemService("sensor");
        if (sensorManager != null && sensorManager.getDefaultSensor(4) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f19296j = z10;
        if (com.applovin.impl.sdk.utils.h.f()) {
            LocaleList locales = y.getResources().getConfiguration().getLocales();
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < locales.size(); i10++) {
                sb2.append(locales.get(i10));
                sb2.append(",");
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            this.f19297k = sb2.toString();
        }
        try {
            this.f19298l = Environment.getDataDirectory().getTotalSpace();
        } catch (Throwable th) {
            pVar.L();
            if (y.a()) {
                pVar.L().b("DataProvider", "Unable to collect total disk space.", th);
            }
        }
        this.f19300n = new g();
        this.f19299m = new a();
    }

    private boolean H() {
        String str = Build.TAGS;
        if (str != null && str.contains(a("lz}$blpz"))) {
            return true;
        }
        return false;
    }

    private boolean I() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i10 = 0; i10 < 9; i10++) {
            if (new File(a(strArr[i10])).exists()) {
                return true;
            }
        }
        return false;
    }

    public long A() {
        return this.f19298l;
    }

    public a B() {
        return this.f19299m;
    }

    public g C() {
        return this.f19300n;
    }

    public boolean D() {
        return this.o;
    }

    public Integer j() {
        e eVar = this.f19307v;
        if (eVar != null && !eVar.a()) {
            return Integer.valueOf(((Integer) this.f19307v.f19337b).intValue());
        }
        try {
            e eVar2 = new e(Integer.valueOf((int) ((Settings.System.getInt(this.D.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)), this.f19309x);
            this.f19307v = eVar2;
            return Integer.valueOf(((Integer) eVar2.f19337b).intValue());
        } catch (Settings.SettingNotFoundException e10) {
            this.C.L();
            if (y.a()) {
                this.C.L().b("DataProvider", "Unable to collect screen brightness", e10);
                return null;
            }
            return null;
        }
    }

    public long k() {
        long j10;
        List asList = Arrays.asList(StringUtils.emptyIfNull(Settings.Secure.getString(this.D.getContentResolver(), "enabled_accessibility_services")).split(com.huawei.openalliance.ad.constant.w.bE));
        if (asList.contains("AccessibilityMenuService")) {
            j10 = 256;
        } else {
            j10 = 0;
        }
        if (asList.contains("SelectToSpeakService")) {
            j10 |= 512;
        }
        if (asList.contains("SoundAmplifierService")) {
            j10 |= 2;
        }
        if (asList.contains("SpeechToTextAccessibilityService")) {
            j10 |= 128;
        }
        if (asList.contains("SwitchAccessService")) {
            j10 |= 4;
        }
        if ((this.D.getResources().getConfiguration().uiMode & 48) == 32) {
            j10 |= 1024;
        }
        if (b("accessibility_enabled")) {
            j10 |= 8;
        }
        if (b("touch_exploration_enabled")) {
            j10 |= 16;
        }
        if (com.applovin.impl.sdk.utils.h.d()) {
            if (b("accessibility_display_inversion_enabled")) {
                j10 |= 32;
            }
            if (b("skip_first_use_hints")) {
                j10 |= 64;
            }
        }
        if (b("lock_screen_allow_remote_input")) {
            j10 |= 2048;
        }
        if (b("enabled_accessibility_audio_description_by_default")) {
            j10 |= 4096;
        }
        if (b("accessibility_shortcut_on_lock_screen")) {
            j10 |= 8192;
        }
        if (b("wear_talkback_enabled")) {
            j10 |= 16384;
        }
        if (b("hush_gesture_used")) {
            j10 |= 32768;
        }
        if (b("high_text_contrast_enabled")) {
            j10 |= 65536;
        }
        if (b("accessibility_display_magnification_enabled")) {
            j10 |= 131072;
        }
        if (b("accessibility_display_magnification_navbar_enabled")) {
            j10 |= 262144;
        }
        if (b("accessibility_captioning_enabled")) {
            j10 |= 524288;
        }
        if (b("accessibility_display_daltonizer_enabled")) {
            j10 |= com.huawei.openalliance.ad.constant.w.f22146c;
        }
        if (b("accessibility_autoclick_enabled")) {
            j10 |= com.anythink.expressad.exoplayer.j.a.c.f8719a;
        }
        if (b("accessibility_large_pointer_icon")) {
            j10 |= 4194304;
        }
        if (b("reduce_bright_colors_activated")) {
            j10 |= 8388608;
        }
        if (b("reduce_bright_colors_persist_across_reboots")) {
            j10 |= 16777216;
        }
        if (b("tty_mode_enabled")) {
            j10 |= 33554432;
        }
        if (b("rtt_calling_mode")) {
            return j10 | 67108864;
        }
        return j10;
    }

    public float l() {
        try {
            return Settings.System.getFloat(this.D.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e10) {
            this.C.L();
            if (y.a()) {
                this.C.L().b("DataProvider", "Error collecting font scale", e10);
                return -1.0f;
            }
            return -1.0f;
        }
    }

    public boolean m() {
        e eVar = this.f19303r;
        if (eVar != null && !eVar.a()) {
            return ((Boolean) this.f19303r.f19337b).booleanValue();
        }
        e eVar2 = new e(Boolean.valueOf(Utils.isVPNConnected()), this.f19310z);
        this.f19303r = eVar2;
        return ((Boolean) eVar2.f19337b).booleanValue();
    }

    public boolean n() {
        ConnectivityManager connectivityManager;
        if (!com.applovin.impl.sdk.utils.h.f() || (connectivityManager = (ConnectivityManager) this.D.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            if (connectivityManager.getRestrictBackgroundStatus() != 3) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            this.C.L();
            if (y.a()) {
                this.C.L().b("DataProvider", "Unable to collect constrained network info.", th);
            }
            return false;
        }
    }

    public boolean o() {
        try {
            if (!H()) {
                if (!I()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public i p() {
        return this.f19288a;
    }

    public j q() {
        return this.f19289b;
    }

    public c r() {
        return this.f19290c;
    }

    public d s() {
        return this.f19291d;
    }

    public f t() {
        return this.f19292e;
    }

    public h u() {
        return this.f;
    }

    public String v() {
        return this.f19293g;
    }

    public String w() {
        return this.f19294h;
    }

    public double x() {
        return this.f19295i;
    }

    public boolean y() {
        return this.f19296j;
    }

    public String z() {
        return this.f19297k;
    }

    public d.a b() {
        return E.get();
    }

    public Integer c() {
        return G.get();
    }

    public d.a d() {
        d.a a10 = com.applovin.impl.sdk.utils.d.a(this.D);
        if (a10 == null) {
            return new d.a();
        }
        if (((Boolean) this.C.a(com.applovin.impl.sdk.c.b.dH)).booleanValue()) {
            if (a10.a() && !((Boolean) this.C.a(com.applovin.impl.sdk.c.b.dG)).booleanValue()) {
                a10.a("");
            }
            E.set(a10);
        } else {
            a10 = new d.a();
        }
        boolean z10 = false;
        if (StringUtils.isValidString(a10.b())) {
            List<String> testDeviceAdvertisingIds = this.C.C().getTestDeviceAdvertisingIds();
            if (testDeviceAdvertisingIds != null && testDeviceAdvertisingIds.contains(a10.b())) {
                z10 = true;
            }
            this.o = z10;
        } else {
            this.o = false;
        }
        return a10;
    }

    public void e() {
        this.C.M().a(new com.applovin.impl.sdk.e.f(this.C, new f.a() { // from class: com.applovin.impl.sdk.s.2
            @Override // com.applovin.impl.sdk.e.f.a
            public void a(d.a aVar) {
                s.E.set(aVar);
            }
        }), o.a.ADVERTISING_INFO_COLLECTION);
        this.C.M().a(new com.applovin.impl.sdk.e.z(this.C, true, new Runnable() { // from class: com.applovin.impl.sdk.s.3
            @Override // java.lang.Runnable
            public void run() {
                s.G.set(s.this.f19290c.b());
            }
        }), o.a.CACHING_OTHER);
    }

    public String f() {
        e eVar = this.f19306u;
        if (eVar != null && !eVar.a()) {
            return (String) this.f19306u.f19337b;
        }
        e eVar2 = new e(com.applovin.impl.sdk.utils.i.f(this.C), this.B);
        this.f19306u = eVar2;
        return (String) eVar2.f19337b;
    }

    public Long g() {
        e eVar = this.f19302q;
        if (eVar != null && !eVar.a()) {
            return Long.valueOf(((Long) this.f19302q.f19337b).longValue());
        }
        try {
            e eVar2 = new e(Long.valueOf(Environment.getDataDirectory().getFreeSpace()), this.f19310z);
            this.f19302q = eVar2;
            return Long.valueOf(((Long) eVar2.f19337b).longValue());
        } catch (Throwable th) {
            this.C.L();
            if (!y.a()) {
                return null;
            }
            this.C.L().b("DataProvider", "Unable to collect free space.", th);
            return null;
        }
    }

    public Float h() {
        e eVar = this.f19304s;
        if (eVar != null && !eVar.a()) {
            return Float.valueOf(((Float) this.f19304s.f19337b).floatValue());
        }
        if (this.C.ac() == null) {
            return null;
        }
        e eVar2 = new e(Float.valueOf(this.C.ac().c()), this.f19308w);
        this.f19304s = eVar2;
        return Float.valueOf(((Float) eVar2.f19337b).floatValue());
    }

    public Float i() {
        e eVar = this.f19305t;
        if (eVar != null && !eVar.a()) {
            return Float.valueOf(((Float) this.f19305t.f19337b).floatValue());
        }
        if (this.C.ac() == null) {
            return null;
        }
        e eVar2 = new e(Float.valueOf(this.C.ac().b()), this.f19308w);
        this.f19305t = eVar2;
        return Float.valueOf(((Float) eVar2.f19337b).floatValue());
    }

    private boolean b(String str) {
        try {
            return Settings.Secure.getInt(this.D.getContentResolver(), str) == 1;
        } catch (Throwable unused) {
            return false;
        }
    }

    public b a() {
        return F.get();
    }

    public static void a(final Context context) {
        new Thread(new Runnable() { // from class: com.applovin.impl.sdk.s.1
            @Override // java.lang.Runnable
            public void run() {
                s.E.set(com.applovin.impl.sdk.utils.d.a(context));
                if (!Utils.checkClassExistence("com.google.android.gms.appset.AppSet")) {
                    return;
                }
                try {
                    AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.applovin.impl.sdk.s.1.1
                        @Override // com.google.android.gms.tasks.OnSuccessListener
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public void onSuccess(AppSetIdInfo appSetIdInfo) {
                            s.F.set(new b(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                        }
                    });
                } catch (Throwable unused) {
                    y.f("DataProvider", "Could not collect AppSet ID.");
                }
            }
        }).start();
    }

    private String a(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = str.charAt(i10);
            for (int i11 = 9; i11 >= 0; i11--) {
                cArr[i10] = (char) (cArr[i10] ^ iArr[i11]);
            }
        }
        return new String(cArr);
    }
}
