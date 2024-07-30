package i8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;

/* compiled from: Metadata.java */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29294a;

    /* renamed from: b, reason: collision with root package name */
    public String f29295b;

    /* renamed from: c, reason: collision with root package name */
    public String f29296c;

    /* renamed from: d, reason: collision with root package name */
    public int f29297d;

    /* renamed from: e, reason: collision with root package name */
    public int f29298e = 0;

    public r(Context context) {
        this.f29294a = context;
    }

    public static String a(n7.e eVar) {
        eVar.a();
        String str = eVar.f33460c.f33473e;
        if (str != null) {
            return str;
        }
        eVar.a();
        String str2 = eVar.f33460c.f33470b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(com.huawei.openalliance.ad.constant.w.bE);
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final PackageInfo b(String str) {
        try {
            return this.f29294a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    public final boolean c() {
        int i10;
        synchronized (this) {
            i10 = this.f29298e;
            if (i10 == 0) {
                PackageManager packageManager = this.f29294a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i10 = 0;
                } else {
                    if (!PlatformVersion.isAtLeastO()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f29298e = 1;
                            i10 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                        this.f29298e = 2;
                        i10 = 2;
                    } else {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (PlatformVersion.isAtLeastO()) {
                            this.f29298e = 2;
                        } else {
                            this.f29298e = 1;
                        }
                        i10 = this.f29298e;
                    }
                }
            }
        }
        if (i10 != 0) {
            return true;
        }
        return false;
    }

    public final synchronized void d() {
        PackageInfo b10 = b(this.f29294a.getPackageName());
        if (b10 != null) {
            this.f29295b = Integer.toString(b10.versionCode);
            this.f29296c = b10.versionName;
        }
    }
}
