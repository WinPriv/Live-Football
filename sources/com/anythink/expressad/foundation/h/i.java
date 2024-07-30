package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10123a = "layout";

    /* renamed from: b, reason: collision with root package name */
    public static final String f10124b = "id";

    /* renamed from: c, reason: collision with root package name */
    public static final String f10125c = "drawable";

    /* renamed from: d, reason: collision with root package name */
    public static final String f10126d = "color";

    /* renamed from: e, reason: collision with root package name */
    public static final String f10127e = "style";
    public static final String f = "anim";

    /* renamed from: g, reason: collision with root package name */
    public static final String f10128g = "string";

    /* renamed from: h, reason: collision with root package name */
    public static final int f10129h = -1;

    /* renamed from: i, reason: collision with root package name */
    private static final String f10130i = "ResourceUtil";

    public static Resources a(Context context) {
        if (context != null) {
            try {
                return context.getResources();
            } catch (Exception e10) {
                o.d(f10130i, "Resource error:" + e10.getMessage());
            }
        }
        return null;
    }

    public static int a(Context context, String str, String str2) {
        String str3 = "";
        try {
            try {
                str3 = com.anythink.expressad.foundation.b.a.b().a();
            } catch (Exception unused) {
                o.d(f10130i, "ATSDKContext.getInstance() is null resName:".concat(String.valueOf(str)));
            }
            if (w.a(str3) && context != null) {
                str3 = context.getPackageName();
            }
            if (w.a(str3) || context == null) {
                return -1;
            }
            return context.getResources().getIdentifier(str, str2, str3);
        } catch (Exception unused2) {
            a3.l.B(str, "Resource not found resName:", f10130i);
            return -1;
        }
    }
}
