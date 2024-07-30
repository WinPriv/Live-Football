package com.huawei.openalliance.ad.ppskit.beans.metadata;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.handlers.l;
import com.huawei.openalliance.ad.ppskit.utils.o2;
import ka.n7;
import ma.a;

@DataKeep
/* loaded from: classes2.dex */
public class App {
    private static final String TAG = "App";
    private Integer brand;
    private String country;
    private AppExt ext;
    private String lang;
    private String lmt;

    @a
    private String mediaContent;
    private Integer mediaGpsOn;
    private String name;
    private String pkgname;
    private String sign;
    private Integer systemFlag;
    private String verCode;
    private String version;

    public App() {
    }

    public App(Context context, String str) {
        String str2;
        int i10;
        ApplicationInfo applicationInfo;
        this.pkgname = str;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return;
        }
        l d10 = l.d(context);
        try {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(this.pkgname, 128);
                this.version = packageInfo.versionName;
                this.name = packageInfo.applicationInfo.loadLabel(packageManager).toString();
                this.lmt = d10.r(context.getPackageName());
                str2 = this.pkgname;
            } catch (Throwable th) {
                n7.h(TAG, "fail to get packageInfo: %s", th.getClass().getSimpleName());
            }
        } catch (PackageManager.NameNotFoundException unused) {
            n7.g(TAG, "fail to get packageInfo");
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(str2, 0);
            } catch (PackageManager.NameNotFoundException | Exception unused2) {
            }
            if (applicationInfo != null) {
                if ((applicationInfo.flags & 1) > 0) {
                    i10 = 1;
                    this.systemFlag = Integer.valueOf(i10);
                    this.sign = o2.j(context, this.pkgname);
                }
            }
        }
        i10 = 0;
        this.systemFlag = Integer.valueOf(i10);
        this.sign = o2.j(context, this.pkgname);
    }

    public final String a() {
        return this.version;
    }

    public final void b(AppExt appExt) {
        this.ext = appExt;
    }

    public final void c(Integer num) {
        this.brand = num;
    }

    public final void d(Integer num) {
        this.mediaGpsOn = num;
    }

    public final String e() {
        return this.pkgname;
    }

    public final void f(String str) {
        this.pkgname = str;
    }

    public final String g() {
        return this.mediaContent;
    }

    public final void h(String str) {
        this.mediaContent = str;
    }

    public final void i(String str) {
        this.lang = str;
    }

    public final void j(String str) {
        this.country = str;
    }

    public final void k(String str) {
        this.verCode = str;
    }
}
