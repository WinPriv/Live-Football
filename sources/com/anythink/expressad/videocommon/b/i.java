package com.anythink.expressad.videocommon.b;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.w;
import com.anythink.expressad.videocommon.b.h;
import com.anythink.expressad.videocommon.b.j;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12368a = "ending_page_source";

    /* renamed from: b, reason: collision with root package name */
    public static final String f12369b = "ending_page_save_time";

    /* renamed from: c, reason: collision with root package name */
    private static final String f12370c = "H5DownLoadManager";
    private static volatile i f;

    /* renamed from: d, reason: collision with root package name */
    private CopyOnWriteArrayList<String> f12371d;

    /* renamed from: e, reason: collision with root package name */
    private ConcurrentMap<String, com.anythink.expressad.videocommon.b.d> f12372e;

    /* renamed from: g, reason: collision with root package name */
    private m f12373g;

    /* renamed from: h, reason: collision with root package name */
    private j f12374h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12375i = false;

    /* loaded from: classes.dex */
    public interface a {
        void a(String str);

        void a(String str, String str2);
    }

    /* loaded from: classes.dex */
    public interface b extends a {
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();

        void a(String str);

        void a(byte[] bArr, String str);
    }

    /* loaded from: classes.dex */
    public interface d extends a {
    }

    private i() {
        try {
            this.f12373g = m.a();
            this.f12374h = j.a.f12383a;
            this.f12371d = new CopyOnWriteArrayList<>();
            this.f12372e = new ConcurrentHashMap();
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.o.b(f12370c, th.getMessage(), th);
        }
    }

    private void c(final String str, final a aVar) {
        try {
            com.anythink.expressad.foundation.h.o.d(f12370c, "download url:".concat(String.valueOf(str)));
            if (this.f12371d.contains(str)) {
                return;
            }
            this.f12371d.add(str);
            h.a.f12367a.a(new com.anythink.expressad.foundation.g.g.a() { // from class: com.anythink.expressad.videocommon.b.i.1
                @Override // com.anythink.expressad.foundation.g.g.a
                public final void a() {
                    if (!TextUtils.isEmpty(i.this.f12374h.b(str))) {
                        i.this.f12371d.remove(str);
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.a(str);
                            return;
                        }
                        return;
                    }
                    g.a(str, new c() { // from class: com.anythink.expressad.videocommon.b.i.1.1
                        @Override // com.anythink.expressad.videocommon.b.i.c
                        public final void a() {
                        }

                        @Override // com.anythink.expressad.videocommon.b.i.c
                        public final void a(byte[] bArr, String str2) {
                            try {
                                i.this.f12371d.remove(str2);
                                if (bArr == null || bArr.length <= 0) {
                                    return;
                                }
                                if (i.this.f12374h.a(str2, bArr)) {
                                    a aVar3 = aVar;
                                    if (aVar3 != null) {
                                        aVar3.a(str2);
                                        return;
                                    }
                                    return;
                                }
                                a aVar4 = aVar;
                                if (aVar4 != null) {
                                    aVar4.a(str2, "save file failed");
                                }
                            } catch (Exception e10) {
                                if (com.anythink.expressad.a.f6552a) {
                                    e10.printStackTrace();
                                }
                                a aVar5 = aVar;
                                if (aVar5 != null) {
                                    aVar5.a(str2, e10.getMessage());
                                }
                            }
                        }

                        @Override // com.anythink.expressad.videocommon.b.i.c
                        public final void a(String str2) {
                            try {
                                i.this.f12371d.remove(str);
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                a aVar3 = aVar;
                                if (aVar3 != null) {
                                    aVar3.a(str, str2);
                                }
                            } catch (Exception e10) {
                                if (com.anythink.expressad.a.f6552a) {
                                    e10.printStackTrace();
                                }
                                AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                a aVar4 = aVar;
                                if (aVar4 != null) {
                                    aVar4.a(str, str2);
                                }
                            }
                        }
                    });
                }

                @Override // com.anythink.expressad.foundation.g.g.a
                public final void b() {
                }

                @Override // com.anythink.expressad.foundation.g.g.a
                public final void c() {
                }
            });
        } catch (Throwable th) {
            if (com.anythink.expressad.a.f6552a) {
                th.printStackTrace();
            }
        }
    }

    private String d(String str) {
        j jVar = this.f12374h;
        if (jVar != null) {
            return jVar.a(str);
        }
        return str;
    }

    private static String e(String str) {
        try {
            Object b10 = v.b(com.anythink.expressad.foundation.b.a.b().d(), f12368a.concat(String.valueOf(str)), "");
            if (b10 != null && (b10 instanceof String)) {
                String str2 = (String) b10;
                if (w.b(str2)) {
                    return str2;
                }
                return null;
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static long f(String str) {
        try {
            Object b10 = v.b(com.anythink.expressad.foundation.b.a.b().d(), f12369b.concat(String.valueOf(str)), 0L);
            if (b10 != null && (b10 instanceof Long)) {
                return ((Long) b10).longValue();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return 0L;
    }

    private static void g(String str) {
        try {
            v.a(com.anythink.expressad.foundation.b.a.b().d(), f12369b.concat(String.valueOf(str)), Long.valueOf(System.currentTimeMillis()));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void h(String str) {
        b(str, (a) null);
    }

    public static i a() {
        if (f == null) {
            synchronized (i.class) {
                if (f == null) {
                    f = new i();
                }
            }
        }
        return f;
    }

    private void b(String str, d dVar) {
        try {
            if (!TextUtils.isEmpty(this.f12373g.a(str))) {
                if (dVar != null) {
                    dVar.a(str);
                }
            } else {
                if (this.f12372e.containsKey(str)) {
                    com.anythink.expressad.videocommon.b.d dVar2 = this.f12372e.get(str);
                    if (dVar2 != null) {
                        dVar2.a(dVar);
                        return;
                    }
                    return;
                }
                com.anythink.expressad.videocommon.b.d dVar3 = new com.anythink.expressad.videocommon.b.d(this.f12372e, this.f12373g, dVar, str);
                this.f12372e.put(str, dVar3);
                g.a(str, dVar3);
            }
        } catch (Exception e10) {
            if (dVar != null) {
                dVar.a(str, "downloadzip failed");
            }
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
        }
    }

    public final String a(String str) {
        m mVar = this.f12373g;
        if (mVar != null) {
            return mVar.a(str);
        }
        return null;
    }

    public final String c(String str) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                Uri parse = Uri.parse(str);
                String path = parse.getPath();
                if (TextUtils.isEmpty(path) || !TextUtils.isEmpty(parse.getQueryParameter("urlDebug"))) {
                    return str;
                }
                if (path.toLowerCase().endsWith(".zip")) {
                    return a(str);
                }
                j jVar = this.f12374h;
                return jVar != null ? jVar.a(str) : str;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return str;
    }

    public final void a(String str, a aVar) {
        c(str, aVar);
    }

    private static void a(String str, String str2) {
        try {
            com.anythink.expressad.foundation.h.o.b(f12370c, "sourceContent:".concat(String.valueOf(str)));
            v.a(com.anythink.expressad.foundation.b.a.b().d(), f12368a.concat(String.valueOf(str2)), str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void b(String str, a aVar) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                String path = Uri.parse(str).getPath();
                if (!TextUtils.isEmpty(path)) {
                    if (path.toLowerCase().endsWith(".zip")) {
                        a(str, (d) aVar);
                        return;
                    } else {
                        c(str, aVar);
                        return;
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (aVar != null) {
            aVar.a(str, "The URL does not contain a path ");
        }
    }

    private void a(String str, d dVar) {
        try {
            if (!TextUtils.isEmpty(this.f12373g.a(str))) {
                if (dVar != null) {
                    dVar.a(str);
                }
            } else {
                if (this.f12372e.containsKey(str)) {
                    com.anythink.expressad.videocommon.b.d dVar2 = this.f12372e.get(str);
                    if (dVar2 != null) {
                        dVar2.a(dVar);
                        return;
                    }
                    return;
                }
                com.anythink.expressad.videocommon.b.d dVar3 = new com.anythink.expressad.videocommon.b.d(this.f12372e, this.f12373g, dVar, str);
                this.f12372e.put(str, dVar3);
                g.a(str, dVar3);
            }
        } catch (Exception e10) {
            if (dVar != null) {
                dVar.a(str, "downloadzip failed");
            }
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
        }
    }

    public final void b(String str) {
        c(str, null);
    }
}
