package com.anythink.expressad.videocommon;

import android.text.TextUtils;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12300a = "TemplateWebviewCache";

    /* renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0140a> f12301b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0140a> f12302c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0140a> f12303d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0140a> f12304e = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0140a> f = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0140a> f12305g = new ConcurrentHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0140a> f12306h = new ConcurrentHashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0140a> f12307i = new ConcurrentHashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0140a> f12308j = new ConcurrentHashMap<>();

    /* renamed from: k, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0140a> f12309k = new ConcurrentHashMap<>();

    /* renamed from: com.anythink.expressad.videocommon.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0140a {

        /* renamed from: a, reason: collision with root package name */
        private WindVaneWebView f12314a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f12315b;

        public final WindVaneWebView a() {
            return this.f12314a;
        }

        public final String b() {
            WindVaneWebView windVaneWebView = this.f12314a;
            if (windVaneWebView != null) {
                return (String) windVaneWebView.getTag();
            }
            return "";
        }

        public final boolean c() {
            return this.f12315b;
        }

        public final void a(WindVaneWebView windVaneWebView) {
            this.f12314a = windVaneWebView;
        }

        public final void a(String str) {
            WindVaneWebView windVaneWebView = this.f12314a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        public final void a(boolean z10) {
            this.f12315b = z10;
        }
    }

    public static C0140a a(String str) {
        if (f12306h.containsKey(str)) {
            return f12306h.get(str);
        }
        if (f12307i.containsKey(str)) {
            return f12307i.get(str);
        }
        if (f12308j.containsKey(str)) {
            return f12308j.get(str);
        }
        if (f12309k.containsKey(str)) {
            return f12309k.get(str);
        }
        return null;
    }

    public static void b(String str) {
        if (f12306h.containsKey(str)) {
            f12306h.remove(str);
        }
        if (f12308j.containsKey(str)) {
            f12308j.remove(str);
        }
        if (f12307i.containsKey(str)) {
            f12307i.remove(str);
        }
        if (f12309k.containsKey(str)) {
            f12309k.remove(str);
        }
    }

    public static void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : f12306h.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    f12306h.remove(str2);
                }
            }
        } else {
            f12306h.clear();
        }
        f12307i.clear();
    }

    public static void d(String str) {
        for (Map.Entry<String, C0140a> entry : f12306h.entrySet()) {
            if (entry.getKey().contains(str)) {
                f12306h.remove(entry.getKey());
            }
        }
    }

    public static void e(String str) {
        for (Map.Entry<String, C0140a> entry : f12307i.entrySet()) {
            if (entry.getKey().contains(str)) {
                f12307i.remove(entry.getKey());
            }
        }
    }

    private static void f(String str) {
        for (Map.Entry<String, C0140a> entry : f12308j.entrySet()) {
            if (entry.getKey().startsWith(str)) {
                f12308j.remove(entry.getKey());
            }
        }
    }

    private static void g(String str) {
        for (Map.Entry<String, C0140a> entry : f12309k.entrySet()) {
            if (entry.getKey().startsWith(str)) {
                f12309k.remove(entry.getKey());
            }
        }
    }

    private static void c() {
        f12306h.clear();
    }

    public static void a(String str, C0140a c0140a, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                f12307i.put(str, c0140a);
                return;
            } else {
                f12306h.put(str, c0140a);
                return;
            }
        }
        if (z11) {
            f12309k.put(str, c0140a);
        } else {
            f12308j.put(str, c0140a);
        }
    }

    public static void b() {
        f12308j.clear();
        f12309k.clear();
    }

    public static void b(int i10, c cVar) {
        if (cVar == null) {
            return;
        }
        try {
            String aa2 = cVar.aa();
            if (i10 == 94) {
                if (cVar.A()) {
                    ConcurrentHashMap<String, C0140a> concurrentHashMap = f12302c;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(aa2);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0140a> concurrentHashMap2 = f;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(aa2);
                    return;
                }
                return;
            }
            if (i10 != 287) {
                ConcurrentHashMap<String, C0140a> concurrentHashMap3 = f12301b;
                if (concurrentHashMap3 != null) {
                    concurrentHashMap3.remove(aa2);
                    return;
                }
                return;
            }
            if (cVar.A()) {
                ConcurrentHashMap<String, C0140a> concurrentHashMap4 = f12303d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(aa2);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0140a> concurrentHashMap5 = f12305g;
            if (concurrentHashMap5 != null) {
                concurrentHashMap5.remove(aa2);
            }
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
        }
    }

    public static void a() {
        f12306h.clear();
        f12307i.clear();
    }

    private static void a(String str, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                for (Map.Entry<String, C0140a> entry : f12307i.entrySet()) {
                    if (entry.getKey().startsWith(str)) {
                        f12307i.remove(entry.getKey());
                    }
                }
                return;
            }
            for (Map.Entry<String, C0140a> entry2 : f12306h.entrySet()) {
                if (entry2.getKey().startsWith(str)) {
                    f12306h.remove(entry2.getKey());
                }
            }
            return;
        }
        if (z11) {
            for (Map.Entry<String, C0140a> entry3 : f12309k.entrySet()) {
                if (entry3.getKey().startsWith(str)) {
                    f12309k.remove(entry3.getKey());
                }
            }
            return;
        }
        for (Map.Entry<String, C0140a> entry4 : f12308j.entrySet()) {
            if (entry4.getKey().startsWith(str)) {
                f12308j.remove(entry4.getKey());
            }
        }
    }

    public static void b(int i10) {
        try {
            if (i10 == 94) {
                ConcurrentHashMap<String, C0140a> concurrentHashMap = f;
                if (concurrentHashMap != null) {
                    concurrentHashMap.clear();
                    return;
                }
                return;
            }
            if (i10 != 287) {
                ConcurrentHashMap<String, C0140a> concurrentHashMap2 = f12301b;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.clear();
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0140a> concurrentHashMap3 = f12305g;
            if (concurrentHashMap3 != null) {
                concurrentHashMap3.clear();
            }
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
        }
    }

    public static C0140a a(int i10, c cVar) {
        if (cVar == null) {
            return null;
        }
        try {
            String aa2 = cVar.aa();
            if (i10 != 94) {
                if (i10 != 287) {
                    ConcurrentHashMap<String, C0140a> concurrentHashMap = f12301b;
                    if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                        return f12301b.get(aa2);
                    }
                } else if (cVar.A()) {
                    ConcurrentHashMap<String, C0140a> concurrentHashMap2 = f12303d;
                    if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                        return f12303d.get(aa2);
                    }
                } else {
                    ConcurrentHashMap<String, C0140a> concurrentHashMap3 = f12305g;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return f12305g.get(aa2);
                    }
                }
            } else if (cVar.A()) {
                ConcurrentHashMap<String, C0140a> concurrentHashMap4 = f12302c;
                if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                    return f12302c.get(aa2);
                }
            } else {
                ConcurrentHashMap<String, C0140a> concurrentHashMap5 = f;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return f.get(aa2);
                }
            }
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static void b(int i10, String str, C0140a c0140a) {
        try {
            if (i10 == 94) {
                if (f == null) {
                    f = new ConcurrentHashMap<>();
                }
                f.put(str, c0140a);
            } else if (i10 != 287) {
                if (f12301b == null) {
                    f12301b = new ConcurrentHashMap<>();
                }
                f12301b.put(str, c0140a);
            } else {
                if (f12305g == null) {
                    f12305g = new ConcurrentHashMap<>();
                }
                f12305g.put(str, c0140a);
            }
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
        }
    }

    private static ConcurrentHashMap<String, C0140a> a(int i10, boolean z10) {
        if (i10 == 94) {
            return z10 ? f12302c : f;
        }
        if (i10 != 287) {
            return f12301b;
        }
        return z10 ? f12303d : f12305g;
    }

    public static void a(int i10) {
        try {
            if (i10 == 94) {
                ConcurrentHashMap<String, C0140a> concurrentHashMap = f12302c;
                if (concurrentHashMap != null) {
                    concurrentHashMap.clear();
                }
            } else {
                if (i10 != 287) {
                    return;
                }
                ConcurrentHashMap<String, C0140a> concurrentHashMap2 = f12303d;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.clear();
                }
            }
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
        }
    }

    public static void a(int i10, String str, C0140a c0140a) {
        try {
            if (i10 == 94) {
                if (f12302c == null) {
                    f12302c = new ConcurrentHashMap<>();
                }
                f12302c.put(str, c0140a);
            } else {
                if (i10 != 287) {
                    return;
                }
                if (f12303d == null) {
                    f12303d = new ConcurrentHashMap<>();
                }
                f12303d.put(str, c0140a);
            }
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
        }
    }
}
