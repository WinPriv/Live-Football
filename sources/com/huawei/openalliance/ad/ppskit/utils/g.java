package com.huawei.openalliance.ad.ppskit.utils;

import android.app.UiModeManager;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.android.app.PackageManagerEx;
import com.huawei.hag.abilitykit.api.KitSdkManager;
import com.huawei.hms.ads.ex;
import com.huawei.hms.dnsbackup.Address;
import com.huawei.hms.dnsbackup.DNSBackup;
import com.huawei.hms.dnsbackup.DNSResult;
import com.huawei.hms.framework.network.restclient.dnkeeper.DNKeeperManager;
import com.huawei.hms.framework.network.restclient.dnkeeper.RequestHost;
import com.huawei.hms.framework.network.restclient.hwhttp.dns.DnsResult;
import com.huawei.hms.network.NetworkKit;
import com.huawei.hms.network.ShareNetworkKit;
import com.huawei.hms.network.httpclient.HttpClient;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.b9;
import ka.n7;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static Context f22849a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f22850b = false;

    /* renamed from: c, reason: collision with root package name */
    public static b9 f22851c = null;

    /* renamed from: d, reason: collision with root package name */
    public static int f22852d = -1;

    public static boolean a() {
        if (androidx.transition.n.k("com.huawei.hag.abilitykit.api.KitSdkManager")) {
            try {
                boolean canIUseApi = KitSdkManager.getInstance().canIUseApi("startAbilityByAbilityInfo");
                ex.V("HagUtil", "can use api is %s", Boolean.valueOf(canIUseApi));
                return canIUseApi;
            } catch (Throwable th) {
                ex.V("HagUtil", "isSupportFaApi exception %s", th.getClass().getSimpleName());
            }
        }
        return false;
    }

    public static int b(Context context) {
        boolean z10;
        int i10;
        int i11 = f22852d;
        if (i11 >= 0) {
            return i11;
        }
        if (((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f22852d = 1;
        } else {
            if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                i10 = 2;
            } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                i10 = 3;
            } else if (f()) {
                f22852d = 4;
            } else if (context.getPackageManager().hasSystemFeature("com.huawei.software.features.car")) {
                i10 = 7;
            } else {
                f22852d = 0;
            }
            f22852d = i10;
        }
        return f22852d;
    }

    public static ArrayList c(String str) {
        List addressList;
        n7.e("DNSUtil", "lookup:" + androidx.transition.n.u(str));
        ArrayList arrayList = new ArrayList();
        DnsResult queryIpsSync = DNKeeperManager.getInstance().queryIpsSync(new RequestHost(str));
        if (queryIpsSync != null && (addressList = queryIpsSync.getAddressList()) != null && !addressList.isEmpty()) {
            Iterator it = addressList.iterator();
            while (it.hasNext()) {
                String value = ((DnsResult.Address) it.next()).getValue();
                if (!TextUtils.isEmpty(value)) {
                    n7.c("DNSUtil", "ip:%s", value);
                    arrayList.add(InetAddress.getByName(value));
                }
            }
        }
        return arrayList;
    }

    public static void d() {
        new HttpClient.Builder();
    }

    public static void e(Context context) {
        try {
            if (k()) {
                n7.e("DNSUtil", "init DNKeeper");
                DNKeeperManager.getInstance().init(context.getApplicationContext());
            }
        } catch (Throwable th) {
            n7.h("DNSUtil", "init DNKeeper error: %s", th.getClass().getSimpleName());
        }
    }

    public static boolean f() {
        try {
            return PackageManagerEx.hasHwSystemFeature("com.huawei.software.features.kidpad");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static ArrayList g(String str) {
        List addressList;
        ArrayList arrayList = new ArrayList();
        DNSResult syncLookupDNS = DNSBackup.DNSBackupApi.syncLookupDNS(str);
        if (syncLookupDNS != null && (addressList = syncLookupDNS.getAddressList()) != null && !addressList.isEmpty()) {
            Iterator it = addressList.iterator();
            while (it.hasNext()) {
                String address = ((Address) it.next()).getAddress();
                if (!TextUtils.isEmpty(address)) {
                    n7.c("HMSDNSUtil", "ip:%s", address);
                    arrayList.add(InetAddress.getByName(address));
                }
            }
        }
        return arrayList;
    }

    public static void h(Context context) {
        if (f22850b) {
            n7.b("MediaCacheFactory", "SdkFactory already initialized.");
            return;
        }
        n7.e("MediaCacheFactory", "init");
        f22850b = true;
        f22849a = context.getApplicationContext();
        i(context);
    }

    public static void i(Context context) {
        String str;
        try {
            if (!z1.R(context) && d0.m(context) && ShareNetworkKit.isInit()) {
                NetworkKit.init(f22849a, (NetworkKit.Callback) null);
                f22851c = new b9();
                str = "initNetowrkKit end.";
            } else {
                f22850b = false;
                str = "not init Networkkit in oobe";
            }
            n7.e("MediaCacheFactory", str);
        } catch (Throwable unused) {
            f22850b = false;
            n7.g("MediaCacheFactory", "init networkKit failed.");
        }
    }

    public static void j(String str) {
        boolean z10;
        try {
            Class.forName("com.huawei.hms.framework.network.restclient.dnkeeper.DNKeeperManager");
            z10 = true;
        } catch (Throwable unused) {
            n7.g("DNSUtil", "check DNKeeperManager available error");
            z10 = false;
        }
        if (z10) {
            DNKeeperManager.getInstance().removeCache(str);
        }
    }

    public static boolean k() {
        boolean z10;
        try {
            Class.forName("com.huawei.hms.framework.network.restclient.dnkeeper.DNKeeperManager");
            z10 = true;
        } catch (Throwable unused) {
            n7.g("DNSUtil", "check DNKeeperManager available error");
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        boolean isInit = ShareNetworkKit.isInit();
        n7.f("DNSUtil", "ShareNetworkKit: %s", Boolean.valueOf(isInit));
        return isInit;
    }
}
