package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.expressad.activity.ATCommonActivity;
import com.anythink.expressad.out.p;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class s extends f {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f10198a = false;

    /* renamed from: b, reason: collision with root package name */
    public static char[] f10199b = {'a', 'n', 'd', 'r', 'o', 'i', 'd', 'c', 'o', 'n', 't', 'e', 'n', 't', 'p', 'm', 'g', 'e', 't', 'C', 'o', 'n', 't', 'e', 'x', 't'};

    /* renamed from: c, reason: collision with root package name */
    private static final String f10200c = "SDKUtil";

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f10201a = "com.android.vending";

        /* renamed from: b, reason: collision with root package name */
        public static final String f10202b = "market";

        /* renamed from: c, reason: collision with root package name */
        public static final String f10203c = "play.google.com";

        /* renamed from: d, reason: collision with root package name */
        public static final String f10204d = "market.android.com";

        /* renamed from: e, reason: collision with root package name */
        public static final String f10205e = "google.com";
        public static final String f = "market://";

        /* renamed from: g, reason: collision with root package name */
        public static final String f10206g = "details?id=";

        /* renamed from: h, reason: collision with root package name */
        public static final String f10207h = "market://details?id=com.package.name";

        private static Intent a() {
            return new Intent("android.intent.action.VIEW", Uri.parse(f10207h));
        }

        private static boolean b(Context context) {
            List<ResolveInfo> a10 = a(context);
            return a10 != null && a10.size() > 0;
        }

        private static boolean c(String str) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    Uri parse = Uri.parse(str);
                    if (!parse.getHost().equals("play.google.com")) {
                        if (!parse.getHost().equals("market.android.com")) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
            } catch (Throwable th) {
                o.d(s.f10200c, Log.getStackTraceString(th));
            }
            return false;
        }

        private static String d(String str) {
            if (b(str)) {
                return str;
            }
            if (c(str)) {
                return "market://".concat(String.valueOf(str.substring(str.indexOf(f10206g))));
            }
            return null;
        }

        private static List<ResolveInfo> a(Context context) {
            try {
                return context.getPackageManager().queryIntentActivities(a(), 0);
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }

        public static boolean b(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                return Uri.parse(str).getScheme().equals("market");
            } catch (Throwable th) {
                o.d(s.f10200c, Log.getStackTraceString(th));
                return false;
            }
        }

        public static boolean a(String str) {
            return b(str) || c(str);
        }

        public static boolean a(Context context, String str, p.c cVar) {
            try {
                if (!b(str)) {
                    str = c(str) ? "market://".concat(String.valueOf(str.substring(str.indexOf(f10206g)))) : null;
                }
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                Intent a10 = a();
                a10.setData(Uri.parse(str));
                a10.addFlags(268435456);
                context.startActivity(a10);
                s.a(cVar);
                return true;
            } catch (Throwable th) {
                o.d(s.f10200c, Log.getStackTraceString(th));
                return false;
            }
        }
    }

    public static void a(p.c cVar) {
        if (cVar instanceof p.e) {
            ((p.e) cVar).b();
        }
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.lastIndexOf("/") == -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.hashCode());
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str.substring(str.lastIndexOf("/") + 1).hashCode() + str.hashCode());
        return sb3.toString();
    }

    public static void a(Context context, String str, com.anythink.expressad.foundation.d.c cVar, p.c cVar2) {
        if (context == null) {
            return;
        }
        if (f10198a) {
            a(context, str, cVar2);
            return;
        }
        try {
            int i10 = ATCommonActivity.f6748s;
            Intent intent = new Intent(context, (Class<?>) ATCommonActivity.class);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (a.b(str)) {
                str = "https://play.google.com/store/apps/details?id=".concat(String.valueOf(str.replace("market://details?id=", "")));
            }
            intent.putExtra("url", str);
            o.b("url", "webview url = ".concat(String.valueOf(str)));
            intent.setFlags(268435456);
            intent.putExtra("mvcommon", cVar);
            context.startActivity(intent);
        } catch (Exception unused) {
            a(context, str, cVar2);
        }
    }

    private static void b(Context context, String str, p.c cVar) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            boolean z10 = queryIntentActivities.size() > 0;
            if (!str.startsWith("market://")) {
                if (str.startsWith("https://play.google.com/")) {
                    b(context, "market://details?id=".concat(String.valueOf(str.replace("https://play.google.com/store/apps/details?id=", ""))), cVar);
                }
            } else {
                if (!z10) {
                    a(context, "https://play.google.com/store/apps/details?id=".concat(String.valueOf(str.replace("market://details?id=", ""))), cVar);
                    return;
                }
                Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                while (it.hasNext()) {
                    if (it.next().activityInfo.packageName.equals("com.android.vending")) {
                        intent.setClassName("com.android.vending", "com.android.vending.AssetBrowserActivity");
                        break;
                    }
                }
                try {
                    context.startActivity(intent);
                    a(cVar);
                } catch (Exception unused) {
                    a(context, "https://play.google.com/store/apps/details?id=".concat(String.valueOf(str.replace("market://details?id=", ""))), cVar);
                }
            }
        } catch (Exception e10) {
            o.d(f10200c, e10.getMessage());
        }
    }

    public static void a(Context context, String str, p.c cVar) {
        if (str == null || context == null) {
            return;
        }
        try {
            if (a.b(str)) {
                str = "https://play.google.com/store/apps/details?id=".concat(String.valueOf(str.replace("market://details?id=", "")));
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, com.anythink.expressad.exoplayer.b.aX);
            if (resolveActivity != null) {
                ActivityInfo activityInfo = resolveActivity.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
            }
            context.startActivity(intent);
            a(cVar);
        } catch (Exception e10) {
            e10.printStackTrace();
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent2.addFlags(268468224);
                context.startActivity(intent2);
                a(cVar);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public static String a(String str) {
        String sb2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File a10 = com.anythink.expressad.foundation.g.c.d.a(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_IMG);
        if (TextUtils.isEmpty(str)) {
            sb2 = "";
        } else if (str.lastIndexOf("/") == -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str.hashCode());
            sb2 = sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str.substring(str.lastIndexOf("/") + 1).hashCode() + str.hashCode());
            sb2 = sb4.toString();
        }
        return new File(a10, sb2).getAbsolutePath();
    }

    private static String a() {
        return com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.AD_ANYTHINK_700);
    }
}
