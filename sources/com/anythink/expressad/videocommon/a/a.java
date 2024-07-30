package com.anythink.expressad.videocommon.a;

import android.text.TextUtils;
import com.anythink.core.common.b.n;
import com.anythink.expressad.foundation.d.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12310a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f12311b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final String f12312c = "com.anythink.expressad.videocommon.a.a";

    /* renamed from: d, reason: collision with root package name */
    private static a f12313d;

    private a() {
        try {
            n.a().g();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static a a() {
        if (f12313d == null) {
            synchronized (a.class) {
                if (f12313d == null) {
                    f12313d = new a();
                }
            }
        }
        return f12313d;
    }

    private static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TextUtils.isEmpty(str2);
    }

    public static boolean a(c cVar) {
        try {
            com.anythink.expressad.videocommon.e.a b10 = com.anythink.expressad.videocommon.e.c.a().b();
            long c10 = b10 != null ? b10.c() : 0L;
            long currentTimeMillis = System.currentTimeMillis();
            if (cVar != null) {
                long o = cVar.o() * 1000;
                long bg = currentTimeMillis - cVar.bg();
                if (o > 0 && o >= bg) {
                    return false;
                }
                if (o <= 0 && c10 >= bg) {
                    return false;
                }
            }
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return true;
        }
    }

    public static List<c> a(List<c> list) {
        ArrayList arrayList = null;
        if (list == null) {
            return null;
        }
        try {
            com.anythink.expressad.videocommon.e.a b10 = com.anythink.expressad.videocommon.e.c.a().b();
            long c10 = b10 != null ? b10.c() : 0L;
            long currentTimeMillis = System.currentTimeMillis();
            if (list.size() <= 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (c cVar : list) {
                    if (cVar != null) {
                        long o = cVar.o() * 1000;
                        long bg = currentTimeMillis - cVar.bg();
                        if ((o > 0 && o >= bg) || (o <= 0 && c10 >= bg)) {
                            arrayList2.add(cVar);
                        }
                    }
                }
                return arrayList2;
            } catch (Exception e10) {
                e = e10;
                arrayList = arrayList2;
                e.printStackTrace();
                return arrayList;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private static void b() {
    }

    private static void c() {
    }

    private static void d() {
    }

    private static void e() {
    }

    private static void f() {
    }
}
