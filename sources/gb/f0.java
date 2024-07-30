package gb;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.huawei.hms.ads.ex;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class f0 {

    /* renamed from: c, reason: collision with root package name */
    public static f0 f28581c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f28582d = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final Context f28583a;

    /* renamed from: b, reason: collision with root package name */
    public String f28584b;

    public f0(Context context) {
        HashSet hashSet;
        String str;
        this.f28584b = "0";
        Context applicationContext = context.getApplicationContext();
        this.f28583a = applicationContext;
        PackageManager packageManager = applicationContext.getPackageManager();
        if (packageManager == null) {
            ex.Z("DeviceTypeUtil", "packageManager is null.");
            return;
        }
        try {
            FeatureInfo[] systemAvailableFeatures = packageManager.getSystemAvailableFeatures();
            hashSet = new HashSet();
            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                if (!TextUtils.isEmpty(featureInfo.name)) {
                    ex.Code("DeviceTypeUtil", "add feature:" + featureInfo.name);
                    hashSet.add(featureInfo.name);
                }
            }
        } catch (Throwable th) {
            e0.i.q(th, "get device type error:", "DeviceTypeUtil");
        }
        if (!hashSet.contains("com.huawei.software.features.handset") && !hashSet.contains("com.hihonor.software.features.handset")) {
            if (!hashSet.contains("com.huawei.software.features.pad") && !hashSet.contains("com.hihonor.software.features.pad")) {
                if (!hashSet.contains("com.huawei.software.features.mobiletv") && !hashSet.contains("com.hihonor.software.features.mobiletv")) {
                    if (!hashSet.contains("com.huawei.software.features.tv") && !hashSet.contains("com.hihonor.software.features.tv")) {
                        if (!hashSet.contains("com.huawei.software.features.kidwatch") && !hashSet.contains("com.hihonor.software.features.kidwatch")) {
                            if (!hashSet.contains("com.huawei.software.features.watch") && !hashSet.contains("com.hihonor.software.features.watch")) {
                                String d10 = u.d("ro.build.characteristics");
                                ex.V("DeviceTypeUtil", "characteristics:" + d10);
                                if (!d10.equals(CallMraidJS.f)) {
                                    if (!d10.equals("tablet")) {
                                        if (d10.equals("tv")) {
                                        }
                                        ex.V("DeviceTypeUtil", "type is:" + this.f28584b);
                                    }
                                }
                            }
                            str = "2";
                            this.f28584b = str;
                            ex.V("DeviceTypeUtil", "type is:" + this.f28584b);
                        }
                        str = "3";
                        this.f28584b = str;
                        ex.V("DeviceTypeUtil", "type is:" + this.f28584b);
                    }
                    this.f28584b = "4";
                    ex.V("DeviceTypeUtil", "type is:" + this.f28584b);
                }
                str = "5";
                this.f28584b = str;
                ex.V("DeviceTypeUtil", "type is:" + this.f28584b);
            }
            this.f28584b = "1";
            ex.V("DeviceTypeUtil", "type is:" + this.f28584b);
        }
        this.f28584b = "0";
        ex.V("DeviceTypeUtil", "type is:" + this.f28584b);
    }

    public static f0 a(Context context) {
        f0 f0Var;
        synchronized (f28582d) {
            if (f28581c == null) {
                f28581c = new f0(context);
            }
            f0Var = f28581c;
        }
        return f0Var;
    }
}
