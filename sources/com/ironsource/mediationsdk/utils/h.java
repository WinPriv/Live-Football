package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.huawei.openalliance.ad.constant.bj;
import com.huawei.openalliance.ad.constant.w;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.L;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class h implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final String f25918s = "h";

    /* renamed from: t, reason: collision with root package name */
    public final Context f25919t;

    private h() {
    }

    public static String a() {
        try {
            String str = Build.VERSION.RELEASE;
            return Build.VERSION.SDK_INT + "(" + str + ")";
        } catch (Exception unused) {
            return "";
        }
    }

    public final String b() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.f25919t.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (networkOperatorName.equals("")) {
                return "";
            }
            return networkOperatorName;
        } catch (Exception e10) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, a3.l.p(new StringBuilder(), this.f25918s, ":getMobileCarrier()"), e10);
            return "";
        }
    }

    public final int c() {
        int i10;
        try {
            Intent registerReceiver = this.f25919t.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i11 = 0;
            if (registerReceiver != null) {
                i10 = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
            } else {
                i10 = 0;
            }
            if (registerReceiver != null) {
                i11 = registerReceiver.getIntExtra("scale", -1);
            }
            if (i10 == -1 || i11 == -1) {
                return -1;
            }
            return (int) ((i10 / i11) * 100.0f);
        } catch (Exception e10) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, a3.l.p(new StringBuilder(), this.f25918s, ":getBatteryLevel()"), e10);
            return -1;
        }
    }

    public final int d() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            return Math.round(((timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60) / 15) * 15;
        } catch (Exception e10) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, a3.l.p(new StringBuilder(), this.f25918s, ":getGmtMinutesOffset()"), e10);
            return 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        boolean z10;
        boolean z11;
        String str3;
        String str4;
        String str5;
        long j10;
        boolean z12;
        String str6;
        String str7;
        String str8 = "";
        Context context = this.f25919t;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sessionId", IronSourceUtils.getSessionId());
            try {
                str = context.getPackageName();
            } catch (Exception unused) {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("bundleId", str);
                String c10 = com.ironsource.environment.c.c(context, str);
                if (!TextUtils.isEmpty(c10)) {
                    hashMap.put("appVersion", c10);
                }
            }
            hashMap.put("appKey", L.a().f24855j);
            String C = com.ironsource.environment.h.C(context);
            String D = com.ironsource.environment.h.D(context);
            boolean z13 = true;
            if (!TextUtils.isEmpty(C)) {
                str2 = IronSourceConstants.TYPE_GAID;
                z10 = false;
            } else {
                C = com.ironsource.environment.h.x(context);
                if (TextUtils.isEmpty(C)) {
                    str2 = "";
                } else {
                    str2 = IronSourceConstants.TYPE_UUID;
                }
                z10 = true;
            }
            if (!TextUtils.isEmpty(C)) {
                hashMap.put("advertisingId", C);
                hashMap.put("advertisingIdType", str2);
            }
            if (!TextUtils.isEmpty(D)) {
                z11 = Boolean.parseBoolean(D);
                hashMap.put("isLimitAdTrackingEnabled", Boolean.valueOf(z11));
            } else {
                z11 = false;
            }
            if (z10 || z11) {
                String str9 = "other";
                if (TextUtils.isEmpty(D)) {
                    str9 = "missingDependencies";
                } else if (!com.ironsource.environment.g.b()) {
                    str9 = "publisherAPI";
                } else if (!com.ironsource.environment.h.G(context)) {
                    str9 = "missingManifest";
                } else if (Boolean.parseBoolean(D)) {
                    str9 = "userLat";
                }
                hashMap.put("AdvIdOutputReason", str9);
            }
            hashMap.put("deviceOS", "Android");
            if (!TextUtils.isEmpty(a())) {
                hashMap.put("osVersion", a());
            }
            String connectionType = IronSourceUtils.getConnectionType(context);
            if (!TextUtils.isEmpty(connectionType)) {
                hashMap.put("connectionType", connectionType);
            }
            hashMap.put(bj.f.Code, IronSourceUtils.getSDKVersion());
            try {
                str3 = Locale.getDefault().getLanguage();
            } catch (Exception unused2) {
                str3 = "";
            }
            if (!TextUtils.isEmpty(str3)) {
                hashMap.put("language", str3);
            }
            try {
                str4 = Build.MANUFACTURER;
            } catch (Exception unused3) {
                str4 = "";
            }
            if (!TextUtils.isEmpty(str4)) {
                hashMap.put("deviceOEM", str4);
            }
            try {
                str5 = Build.MODEL;
            } catch (Exception unused4) {
                str5 = "";
            }
            if (!TextUtils.isEmpty(str5)) {
                hashMap.put("deviceModel", str5);
            }
            String b10 = b();
            if (!TextUtils.isEmpty(b10)) {
                hashMap.put("mobileCarrier", b10);
            }
            long j11 = -1;
            try {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                j10 = (statFs.getAvailableBlocks() * statFs.getBlockSize()) / w.f22146c;
            } catch (Exception unused5) {
                j10 = -1;
            }
            hashMap.put("internalFreeMemory", Long.valueOf(j10));
            try {
                z12 = Environment.getExternalStorageState().equals("mounted");
            } catch (Exception unused6) {
                z12 = false;
            }
            if (z12) {
                StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                j11 = (statFs2.getAvailableBlocks() * statFs2.getBlockSize()) / w.f22146c;
            }
            hashMap.put("externalFreeMemory", Long.valueOf(j11));
            hashMap.put("battery", Integer.valueOf(c()));
            int d10 = d();
            if (d10 > 840 || d10 < -720 || d10 % 15 != 0) {
                z13 = false;
            }
            if (z13) {
                hashMap.put("gmtMinutesOffset", Integer.valueOf(d10));
            }
            try {
                str6 = ConfigFile.getConfigFile().getPluginType();
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginType()", e10);
                str6 = "";
            }
            if (!TextUtils.isEmpty(str6)) {
                hashMap.put("pluginType", str6);
            }
            try {
                str7 = ConfigFile.getConfigFile().getPluginVersion();
            } catch (Exception e11) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginVersion()", e11);
                str7 = "";
            }
            if (!TextUtils.isEmpty(str7)) {
                hashMap.put("pluginVersion", str7);
            }
            try {
                str8 = ConfigFile.getConfigFile().getPluginFrameworkVersion();
            } catch (Exception e12) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginFrameworkVersion()", e12);
            }
            if (!TextUtils.isEmpty(str8)) {
                hashMap.put("plugin_fw_v", str8);
            }
            String valueOf = String.valueOf(com.ironsource.environment.h.j());
            if (!TextUtils.isEmpty(valueOf)) {
                hashMap.put("jb", valueOf);
            }
            String str10 = L.a().o;
            if (!TextUtils.isEmpty(str10)) {
                hashMap.put("mt", str10);
            }
            String valueOf2 = String.valueOf(IronSourceUtils.getFirstSession(context));
            if (!TextUtils.isEmpty(valueOf2)) {
                hashMap.put("firstSession", valueOf2);
            }
            String y = com.ironsource.environment.h.y(context);
            if (!TextUtils.isEmpty(y)) {
                hashMap.put("auid", y);
            }
            hashMap.put("mcc", Integer.valueOf(a.AnonymousClass1.c(context)));
            hashMap.put("mnc", Integer.valueOf(a.AnonymousClass1.d(context)));
            String j12 = com.ironsource.environment.h.j(context);
            if (!TextUtils.isEmpty(j12)) {
                hashMap.put("icc", j12);
            }
            String c11 = com.ironsource.environment.h.c();
            if (!TextUtils.isEmpty(c11)) {
                hashMap.put(com.anythink.expressad.foundation.g.a.V, c11);
            }
            IronLog.INTERNAL.verbose("collecting data for events: " + hashMap);
            com.ironsource.mediationsdk.sdk.e.a().a(hashMap);
        } catch (Exception e13) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "Thread name = h", e13);
        }
    }

    public h(Context context) {
        this.f25919t = context.getApplicationContext();
    }
}
