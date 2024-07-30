package com.huawei.hms.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.ads.base.R;
import java.util.ArrayList;
import m.i;

/* loaded from: classes2.dex */
public class jo {
    private static final int B = 1;
    private static final int C = 110002100;
    private static final String Code = "HwCustomTabsHelper";
    private static final String D = "com.huawei.browser.cct_page_can_go_back";
    private static final String F = "com.huawei.browser.cct_only_show_title";
    private static final String I = "com.android.browser";
    private static final String L = "com.huawei.browser.cct_horizontal_menu_items";
    private static final int S = 110008300;
    private static final String V = "com.huawei.browser";
    private static final String Z = "cct_extension_version";

    /* renamed from: a, reason: collision with root package name */
    private static final String f21731a = "com.huawei.browser.cct_vertical_menu_items";

    /* renamed from: b, reason: collision with root package name */
    private static final String f21732b = "com.huawei.browser.cct_auto_refresh";

    /* renamed from: c, reason: collision with root package name */
    private static final String f21733c = "com.huawei.browser.cct_emui_style";

    /* renamed from: d, reason: collision with root package name */
    private static final String f21734d = "com.huawei.browser.cct_enable_pps";

    /* renamed from: e, reason: collision with root package name */
    private static final String f21735e = "com.huawei.browser.cct_show_open_in_browser_menu";
    private static final String f = "com.huawei.browser.cct_copy_link";

    /* renamed from: g, reason: collision with root package name */
    private static final String f21736g = "com.huawei.browser.cct_tranlate_disable";

    /* renamed from: h, reason: collision with root package name */
    private static final jo f21737h = new jo();

    private jo() {
    }

    private static boolean B(Context context) {
        int i10;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        if (!Code(context, I, S)) {
            ex.V(Code, "isSupportAndroidCustomizedCustom current browser no support");
            return false;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(I, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    i10 = bundle.getInt(Z, 0);
                } else {
                    i10 = 0;
                }
                ex.V(Code, "isSupportAndroidCustomizedCustom: " + i10);
                if (i10 < 1) {
                    return false;
                }
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            ex.Z(Code, "getApplicationInfo failed due to name not found");
        }
        return false;
    }

    public static synchronized jo Code() {
        jo joVar;
        synchronized (jo.class) {
            joVar = f21737h;
        }
        return joVar;
    }

    private static boolean I(Context context) {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add("com.huawei.browser");
        String a10 = m.h.a(context, arrayList);
        boolean Code2 = Code(context, "com.huawei.browser", C);
        if ("com.huawei.browser".equals(a10) && Code2) {
            return true;
        }
        return false;
    }

    private static Activity V(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return V(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static boolean Z(Context context) {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(I);
        String a10 = m.h.a(context, arrayList);
        boolean B2 = B(context);
        if (I.equals(a10) && B2) {
            return true;
        }
        return false;
    }

    public void Code(Context context, Uri uri, boolean z10) {
        ex.Code(Code, "openCustomTab begin");
        Activity V2 = V(context);
        boolean I2 = I(V2);
        m.i Code2 = Code(V2, z10);
        Code2.f32621a.setPackage(I2 ? "com.huawei.browser" : I);
        Intent intent = Code2.f32621a;
        intent.setData(uri);
        if (intent != null) {
            try {
                intent.setClipData(com.huawei.openalliance.ad.constant.w.cH);
            } catch (ActivityNotFoundException unused) {
                ex.Z(Code, "openCustomTab ActivityNotFoundException");
                return;
            }
        }
        V2.startActivityForResult(intent, 0);
    }

    public m.l V() {
        return null;
    }

    public static boolean Code(Context context) {
        try {
            if (!I(context)) {
                if (!Z(context)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            ex.I(Code, "not support customTab");
            return false;
        }
    }

    private static boolean Code(Context context, String str, int i10) {
        PackageManager packageManager;
        if (TextUtils.isEmpty(str) || (packageManager = context.getPackageManager()) == null) {
            return false;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 16384);
            return (packageInfo != null ? packageInfo.versionCode : 0) >= i10;
        } catch (PackageManager.NameNotFoundException unused) {
            ex.Z(Code, "getTargetApkInfo failed due to name not found");
            return false;
        } catch (Throwable th) {
            ex.I(Code, "getTargetApkInfo ex: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    private m.i Code(Activity activity, boolean z10) {
        i.b bVar = new i.b(V());
        m.i a10 = bVar.a();
        Bitmap decodeResource = BitmapFactory.decodeResource(activity.getResources(), R.drawable.hiad_hm_close_btn);
        Intent intent = bVar.f32622a;
        intent.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", decodeResource);
        bVar.f32624c = 1;
        intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
        Intent intent2 = a10.f32621a;
        intent2.putExtra(F, true);
        intent2.putExtra(D, true);
        intent2.putExtra(f21732b, true);
        intent2.putExtra(f21733c, true);
        intent2.putExtra(f21735e, false);
        intent2.putExtra(f21734d, z10);
        intent2.putExtra(f, true);
        intent2.putExtra(f21736g, true);
        ArrayList<String> arrayList = new ArrayList<>(10);
        arrayList.add(jp.REFRESH.Code());
        intent2.putStringArrayListExtra(f21731a, arrayList);
        intent2.putStringArrayListExtra(L, new ArrayList<>(10));
        return a10;
    }
}
