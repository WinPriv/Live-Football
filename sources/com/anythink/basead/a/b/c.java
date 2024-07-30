package com.anythink.basead.a.b;

import a3.k;
import android.text.TextUtils;
import com.anythink.basead.mraid.MraidWebView;
import com.anythink.core.common.a.j;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.i;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f3583a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f3584b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f3585c = 100;

    /* renamed from: d, reason: collision with root package name */
    private static Map<String, Integer> f3586d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, MraidWebView> f3587e = new ConcurrentHashMap<>(3);

    public static boolean a(String str) {
        Integer num = f3586d.get(str);
        return num != null && num.intValue() == 0;
    }

    public static MraidWebView b(String str) {
        return f3587e.remove(str);
    }

    public static boolean c(String str) {
        String a10 = com.anythink.core.common.k.f.a(str);
        com.anythink.core.common.res.d a11 = com.anythink.core.common.res.d.a(n.a().g());
        if (TextUtils.isEmpty(a10)) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a11.a(1));
        return new File(k.m(sb2, File.separator, a10, ".0")).exists();
    }

    public static boolean b(String str, int i10) {
        return j.a().a(str, i10);
    }

    public static void a(String str, int i10) {
        Integer num = f3586d.get(str);
        if (num == null || num.intValue() < i10) {
            f3586d.put(str, Integer.valueOf(i10));
        }
    }

    public static void a(String str, MraidWebView mraidWebView) {
        f3587e.put(str, mraidWebView);
    }

    public static String a(com.anythink.core.common.e.j jVar, i iVar) {
        return jVar.f5656d + "_" + iVar.p();
    }

    public static boolean a(i iVar, com.anythink.core.common.e.j jVar) {
        com.anythink.core.common.e.k kVar;
        boolean a10;
        if (iVar == null || !(a10 = a(iVar, jVar.f5661j, (kVar = jVar.f5664m)))) {
            return false;
        }
        if (!iVar.g()) {
            return a10;
        }
        if (kVar.V()) {
            return f3587e.containsKey(a(jVar, iVar));
        }
        return true;
    }

    public static boolean a(i iVar, int i10, com.anythink.core.common.e.k kVar) {
        if (TextUtils.equals(String.valueOf(i10), "1")) {
            if (TextUtils.isEmpty(iVar.x())) {
                return false;
            }
            return b(iVar.x(), kVar.S());
        }
        if (!TextUtils.equals(String.valueOf(i10), "3") || TextUtils.isEmpty(iVar.x())) {
            return true;
        }
        return b(iVar.x(), kVar.S());
    }
}
