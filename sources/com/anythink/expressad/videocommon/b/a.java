package com.anythink.expressad.videocommon.b;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f12316a;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.core.common.res.a.c f12317b = com.anythink.core.common.res.a.c.a();

    private a() {
    }

    public static a a() {
        if (f12316a == null) {
            synchronized (a.class) {
                if (f12316a == null) {
                    f12316a = new a();
                }
            }
        }
        return f12316a;
    }

    public static com.anythink.core.common.a.i b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return com.anythink.core.common.a.j.a().a(str);
    }

    public static String a(String str) {
        return TextUtils.isEmpty(str) ? "" : com.anythink.core.common.res.d.a(com.anythink.core.common.b.n.a().g()).b(4, com.anythink.core.common.k.f.a(str));
    }
}
