package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentResource;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import java.util.ArrayList;
import java.util.HashSet;
import ka.h5;
import ka.n7;

/* loaded from: classes2.dex */
public final class h implements h5 {

    /* renamed from: c, reason: collision with root package name */
    public static h f22854c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f22855d = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final Context f22856a;

    /* renamed from: b, reason: collision with root package name */
    public String f22857b;

    public /* synthetic */ h(Context context) {
        HashSet hashSet;
        String str;
        this.f22857b = "0";
        Context applicationContext = context.getApplicationContext();
        this.f22856a = applicationContext;
        PackageManager packageManager = applicationContext.getPackageManager();
        if (packageManager == null) {
            n7.i("DeviceTypeUtil", "packageManager is null.");
            return;
        }
        try {
            FeatureInfo[] systemAvailableFeatures = packageManager.getSystemAvailableFeatures();
            hashSet = new HashSet();
            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                if (!TextUtils.isEmpty(featureInfo.name)) {
                    n7.b("DeviceTypeUtil", "add feature:" + featureInfo.name);
                    hashSet.add(featureInfo.name);
                }
            }
        } catch (Throwable th) {
            e0.i.p(th, "get device type error:", "DeviceTypeUtil");
        }
        if (!hashSet.contains("com.huawei.software.features.handset") && !hashSet.contains("com.hihonor.software.features.handset")) {
            if (!hashSet.contains("com.huawei.software.features.pad") && !hashSet.contains("com.hihonor.software.features.pad")) {
                if (!hashSet.contains("com.huawei.software.features.mobiletv") && !hashSet.contains("com.hihonor.software.features.mobiletv")) {
                    if (!hashSet.contains("com.huawei.software.features.tv") && !hashSet.contains("com.hihonor.software.features.tv")) {
                        if (!hashSet.contains("com.huawei.software.features.kidwatch") && !hashSet.contains("com.hihonor.software.features.kidwatch")) {
                            if (!hashSet.contains("com.huawei.software.features.watch") && !hashSet.contains("com.hihonor.software.features.watch")) {
                                String o = z1.o("ro.build.characteristics");
                                n7.e("DeviceTypeUtil", "characteristics:" + o);
                                if (!o.equals(CallMraidJS.f)) {
                                    if (!o.equals("tablet")) {
                                        if (o.equals("tv")) {
                                        }
                                        n7.e("DeviceTypeUtil", "type is:" + this.f22857b);
                                    }
                                }
                            }
                            str = "2";
                            this.f22857b = str;
                            n7.e("DeviceTypeUtil", "type is:" + this.f22857b);
                        }
                        str = "3";
                        this.f22857b = str;
                        n7.e("DeviceTypeUtil", "type is:" + this.f22857b);
                    }
                    this.f22857b = "4";
                    n7.e("DeviceTypeUtil", "type is:" + this.f22857b);
                }
                str = "5";
                this.f22857b = str;
                n7.e("DeviceTypeUtil", "type is:" + this.f22857b);
            }
            this.f22857b = "1";
            n7.e("DeviceTypeUtil", "type is:" + this.f22857b);
        }
        this.f22857b = "0";
        n7.e("DeviceTypeUtil", "type is:" + this.f22857b);
    }

    public static h a(Context context) {
        h hVar;
        synchronized (f22855d) {
            if (f22854c == null) {
                f22854c = new h(context);
            }
            hVar = f22854c;
        }
        return hVar;
    }

    public ArrayList b(String str) {
        int i10;
        com.huawei.openalliance.ad.ppskit.handlers.s n10 = com.huawei.openalliance.ad.ppskit.handlers.s.n(this.f22856a);
        ConfigSpHandler b10 = ConfigSpHandler.b(this.f22856a);
        synchronized (b10.f22478a) {
            i10 = b10.s().getInt("exsplash_delete_mode", 2);
        }
        n10.getClass();
        if (1 == i10) {
            return n10.h(ContentResource.class, null, 40, new String[]{str}, "priority ASC", null);
        }
        return n10.h(ContentResource.class, null, 40, new String[]{str}, "priority ASC, updateTime ASC", null);
    }

    public boolean c() {
        return "4".equalsIgnoreCase(a(this.f22856a).f22857b);
    }

    public /* synthetic */ h(Context context, String str) {
        this.f22856a = context.getApplicationContext();
        this.f22857b = str;
    }
}
