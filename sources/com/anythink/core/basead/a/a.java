package com.anythink.core.basead.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.anythink.core.c.b;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.am;
import com.anythink.core.common.k.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4670a = "play.google.com";

    /* renamed from: b, reason: collision with root package name */
    public static final String f4671b = "market.android.com";

    /* renamed from: c, reason: collision with root package name */
    public static final String f4672c = "details?";

    /* renamed from: d, reason: collision with root package name */
    public static final String f4673d = "market";

    /* renamed from: e, reason: collision with root package name */
    public static final String f4674e = "market://";

    public static am a(String str) {
        am amVar = new am();
        amVar.f5547l = 8;
        amVar.f5549n = false;
        amVar.f5548m = true;
        amVar.o = str;
        try {
            if (Uri.parse(str).getScheme().equals("intent")) {
                Intent parseUri = Intent.parseUri(str, 1);
                parseUri.addCategory("android.intent.category.BROWSABLE");
                parseUri.setComponent(null);
                parseUri.setSelector(null);
                String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                if (!TextUtils.isEmpty(stringExtra) && stringExtra.startsWith("http")) {
                    amVar.f5547l = 10;
                    amVar.o = stringExtra;
                    return amVar;
                }
            }
        } catch (Throwable unused) {
        }
        if (c(str)) {
            String d10 = d(str);
            amVar.f5547l = 9;
            amVar.o = d10;
        }
        return amVar;
    }

    private static void b(Context context, String str) {
        l.a(context, str);
    }

    private static boolean c(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return Uri.parse(str).getScheme().equals("market");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static String d(String str) {
        try {
            return "https://play.google.com/store/apps/details?id=".concat(String.valueOf(str.replace("market://details?id=", "")));
        } catch (Throwable unused) {
            return str;
        }
    }

    private static String e(String str) {
        try {
            return "market://".concat(String.valueOf(str.substring(str.indexOf(f4672c))));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean b(String str) {
        Uri parse;
        try {
            if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && parse.getHost() != null) {
                if (parse.getHost().equals("play.google.com")) {
                    return true;
                }
                return parse.getHost().equals("market.android.com");
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static am a(Context context, String str) {
        am amVar = new am();
        amVar.f5549n = !str.startsWith("http");
        amVar.o = str;
        if (c(str)) {
            amVar.o = str;
            boolean equals = TextUtils.equals(b.a(context).b(n.a().p()).l(), "1");
            if (a(context, str, false, equals)) {
                amVar.f5548m = true;
                if (equals) {
                    amVar.f5547l = 3;
                } else {
                    amVar.f5547l = 4;
                }
            } else if (a(context, str, false, false)) {
                amVar.f5548m = true;
                amVar.f5547l = 4;
            }
            return amVar;
        }
        if (!str.startsWith("http")) {
            amVar.o = str;
            if (a(context, str, false, false)) {
                amVar.f5548m = true;
                amVar.f5547l = 5;
            }
            return amVar;
        }
        if (b(str)) {
            String e10 = e(str);
            amVar.f5549n = true;
            amVar.o = e10;
            if (a(context, e10, false, true)) {
                amVar.f5548m = true;
                amVar.f5547l = 1;
            } else if (a(context, e10, false, false)) {
                amVar.f5548m = true;
                amVar.f5547l = 2;
            }
        }
        return amVar;
    }

    public static boolean a(Context context, String str, boolean z10) {
        if (b(str)) {
            return a(context, e(str), z10, true);
        }
        String scheme = Uri.parse(str).getScheme();
        if (scheme == null || scheme.startsWith("http")) {
            return false;
        }
        return a(context, str, z10, scheme.startsWith("market") && TextUtils.equals(a3.l.h(b.a(context)).l(), "1"));
    }

    private static boolean a(final Context context, String str, boolean z10, boolean z11) {
        Intent intent;
        try {
            Uri parse = Uri.parse(str);
            if (parse.getScheme().equals("intent")) {
                intent = Intent.parseUri(str, 1);
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setComponent(null);
                intent.setSelector(null);
            } else {
                intent = new Intent("android.intent.action.VIEW", parse);
                intent.setData(parse);
            }
            if (z11 && TextUtils.isEmpty(intent.getPackage())) {
                intent.setPackage("com.android.vending");
            }
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable unused) {
            if (!z10) {
                return false;
            }
            n.a().a(new Runnable() { // from class: com.anythink.core.basead.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    Toast.makeText(context, "Detect that the App Market is not installed and cannot be opened through the App Market.", 1).show();
                }
            });
            return false;
        }
    }
}
