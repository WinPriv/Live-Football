package com.anythink.expressad.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.anythink.expressad.a.c;
import com.anythink.expressad.a.f;
import com.anythink.expressad.a.g;
import com.anythink.expressad.foundation.g.g.a;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.s;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class h extends d implements a.b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6715a = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f6716i = 2;

    /* renamed from: j, reason: collision with root package name */
    private static final String f6717j = "302";

    /* renamed from: m, reason: collision with root package name */
    private e f6720m;

    /* renamed from: n, reason: collision with root package name */
    private c.b f6721n;

    /* renamed from: p, reason: collision with root package name */
    private boolean f6722p;

    /* renamed from: q, reason: collision with root package name */
    private Context f6723q;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.g.c f6724r;

    /* renamed from: s, reason: collision with root package name */
    private f.a f6725s;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6718k = false;

    /* renamed from: l, reason: collision with root package name */
    private long f6719l = 0;
    private boolean o = true;

    /* renamed from: t, reason: collision with root package name */
    private Handler f6726t = new Handler(Looper.getMainLooper());

    /* renamed from: u, reason: collision with root package name */
    private boolean f6727u = true;

    /* loaded from: classes.dex */
    public class a extends com.anythink.expressad.foundation.g.g.a {

        /* renamed from: h, reason: collision with root package name */
        private static final int f6729h = 10;
        private final Context f;

        /* renamed from: g, reason: collision with root package name */
        private String f6732g;

        /* renamed from: i, reason: collision with root package name */
        private String f6733i;

        /* renamed from: j, reason: collision with root package name */
        private String f6734j;

        /* renamed from: k, reason: collision with root package name */
        private String f6735k;

        /* renamed from: l, reason: collision with root package name */
        private com.anythink.expressad.c.b f6736l;

        /* renamed from: m, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.c f6737m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f6738n;
        private boolean o;

        /* renamed from: p, reason: collision with root package name */
        private int f6739p;

        /* renamed from: e, reason: collision with root package name */
        private final Semaphore f6731e = new Semaphore(0);

        /* renamed from: q, reason: collision with root package name */
        private g.a f6740q = new g.a() { // from class: com.anythink.expressad.a.h.a.1
            @Override // com.anythink.expressad.a.g.a
            public final boolean a(String str) {
                boolean a10 = a.this.a(str);
                a.a(a.this, false, true);
                if (a10) {
                    b();
                }
                return a10;
            }

            @Override // com.anythink.expressad.a.g.a
            public final boolean b(String str) {
                boolean a10 = a.this.a(str);
                a.a(a.this, false, true);
                if (a10) {
                    a.a(a.this, true, true);
                    b();
                }
                return a10;
            }

            @Override // com.anythink.expressad.a.g.a
            public final boolean a() {
                a.a(a.this, false, false);
                return false;
            }

            private void b() {
                synchronized (h.this) {
                    h.this.f6721n.a(true);
                    a.a(a.this);
                }
            }

            @Override // com.anythink.expressad.a.g.a
            public final void a(String str, String str2) {
                a.this.a(str);
                h.this.f6721n.c(str2);
                a.a(a.this, true, false);
                b();
            }

            @Override // com.anythink.expressad.a.g.a
            public final void a(String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    h.this.f6721n.b(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    h.this.f6721n.c(str3);
                }
                a.this.a(str);
                a.a(a.this, true, false);
                b();
            }
        };

        public a(Context context, String str, String str2, String str3, String str4, com.anythink.expressad.c.b bVar, com.anythink.expressad.foundation.d.c cVar, boolean z10, boolean z11, int i10) {
            this.f = context;
            this.f6732g = str;
            this.f6733i = str2;
            this.f6734j = str3;
            this.f6735k = str4;
            this.f6736l = bVar;
            this.f6737m = cVar;
            this.f6738n = z10;
            this.o = z11;
            this.f6739p = i10;
        }

        private static boolean a(int i10) {
            return i10 == 200;
        }

        private void d() {
            this.f6731e.acquireUninterruptibly();
        }

        private static boolean e(String str) {
            if (!TextUtils.isEmpty(str) && str.toLowerCase().contains("apk")) {
                return true;
            }
            return false;
        }

        private void h() {
            this.f6731e.release();
        }

        @Override // com.anythink.expressad.foundation.g.g.a
        public final void b() {
        }

        @Override // com.anythink.expressad.foundation.g.g.a
        public final void c() {
        }

        private static boolean b(int i10) {
            return i10 == 301 || i10 == 302 || i10 == 307;
        }

        private static boolean c(String str) {
            return str.startsWith("/");
        }

        private static boolean d(String str) {
            return s.a.a(str);
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x0205 A[EDGE_INSN: B:102:0x0205->B:63:0x0205 BREAK  A[LOOP:0: B:18:0x0051->B:59:0x01b1], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private com.anythink.expressad.a.c.b a(java.lang.String r16, boolean r17, boolean r18, com.anythink.expressad.foundation.d.c r19, int r20) {
            /*
                Method dump skipped, instructions count: 518
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.a.h.a.a(java.lang.String, boolean, boolean, com.anythink.expressad.foundation.d.c, int):com.anythink.expressad.a.c$b");
        }

        private static boolean b(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        private void a(boolean z10, boolean z11) {
            if (h.this.f6719l == 0) {
                h.this.f6719l = System.currentTimeMillis();
            } else {
                h.this.f6719l = System.currentTimeMillis();
            }
            if (!z10) {
                if (this.f6736l != null) {
                    int i10 = com.anythink.expressad.c.a.f7097a;
                }
            } else {
                if (z11) {
                    if (this.f6736l == null || h.this.f6718k) {
                        return;
                    }
                    h.f(h.this);
                    int i11 = com.anythink.expressad.c.a.f7097a;
                    return;
                }
                if (this.f6736l == null || h.this.f6718k) {
                    return;
                }
                h.f(h.this);
                int i12 = com.anythink.expressad.c.a.f7097a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(String str) {
            com.anythink.expressad.foundation.d.c cVar = this.f6737m;
            if (cVar != null) {
                cVar.Q();
            }
            if (s.a.a(str)) {
                h.this.f6721n.c(1);
                h.this.f6721n.e(str);
                h.this.f6721n.b(true);
                return true;
            }
            if (e(str)) {
                h.this.f6721n.c(3);
                h.this.f6721n.e(str);
                h.this.f6721n.b(true);
                return true;
            }
            h.this.f6721n.c(2);
            h.this.f6721n.e(str);
            return false;
        }

        @Override // com.anythink.expressad.foundation.g.g.a
        public final void a() {
            if (h.this.f6720m != null) {
                e unused = h.this.f6720m;
            }
            h.this.f6721n = new c.b();
            h.this.f6721n.e(this.f6732g);
            h.this.f6721n = a(this.f6732g, this.f6738n, this.o, this.f6737m, this.f6739p);
            if (!TextUtils.isEmpty(h.this.f6721n.e())) {
                h.this.f6721n.a(true);
            }
            if (h.this.o && h.this.f6721n.g()) {
                if (h.this.f6725s != null) {
                    h.this.f6721n.a(h.this.f6725s.f);
                }
                if (!e(h.this.f6721n.j()) && !s.a.a(h.this.f6721n.j()) && 200 == h.this.f6725s.f && !TextUtils.isEmpty(h.this.f6721n.f()) && !h.this.f6721n.f().contains(com.anythink.expressad.foundation.g.a.bU)) {
                    h.this.f6721n.b(2);
                    if (!TextUtils.isEmpty(h.this.f6721n.f())) {
                        Log.e(h.f6717j, "startWebViewHtmlParser");
                        new g(h.this.f6727u).a(this.f6733i, this.f6734j, this.f6735k, this.f, h.this.f6721n.j(), h.this.f6721n.f(), this.f6740q);
                        o.d(h.f6717j, "startWebViewHtmlParser");
                    } else {
                        o.a(h.f6717j, "startWebViewSpider");
                        try {
                            new g(h.this.f6727u).a(this.f6733i, this.f6734j, this.f6735k, this.f, h.this.f6721n.j(), this.f6740q);
                        } catch (Exception unused2) {
                            o.d("TAG", "webview spider start error");
                        }
                    }
                    this.f6731e.acquireUninterruptibly();
                    return;
                }
                if (this.f6736l != null) {
                    h.this.f6721n.j();
                }
                if (h.this.f6725s != null) {
                    h.this.f6721n.b(1);
                    h.this.f6721n.b(h.this.f6725s.f6683h);
                    h.this.f6721n.a(h.this.f6725s.f);
                    h.this.f6721n.a(h.this.f6725s.a());
                    h.this.f6721n.c(h.this.f6725s.f6682g);
                }
                a(h.this.f6721n.j());
            }
        }

        public static /* synthetic */ void a(a aVar, boolean z10, boolean z11) {
            if (h.this.f6719l == 0) {
                h.this.f6719l = System.currentTimeMillis();
            } else {
                h.this.f6719l = System.currentTimeMillis();
            }
            if (!z10) {
                if (aVar.f6736l != null) {
                    int i10 = com.anythink.expressad.c.a.f7097a;
                }
            } else {
                if (z11) {
                    if (aVar.f6736l == null || h.this.f6718k) {
                        return;
                    }
                    h.f(h.this);
                    int i11 = com.anythink.expressad.c.a.f7097a;
                    return;
                }
                if (aVar.f6736l == null || h.this.f6718k) {
                    return;
                }
                h.f(h.this);
                int i12 = com.anythink.expressad.c.a.f7097a;
            }
        }

        public static /* synthetic */ void a(a aVar) {
            aVar.f6731e.release();
        }
    }

    public h(Context context) {
        this.f6723q = context;
        this.f6724r = new com.anythink.expressad.foundation.g.g.c(context, 2);
    }

    public static /* synthetic */ boolean f(h hVar) {
        hVar.f6718k = true;
        return true;
    }

    @Override // com.anythink.expressad.a.d
    public final void b() {
        this.o = false;
    }

    private boolean a() {
        return this.o;
    }

    public final void a(String str, e eVar, boolean z10, String str2, String str3, String str4, com.anythink.expressad.c.b bVar, com.anythink.expressad.foundation.d.c cVar, boolean z11, boolean z12, int i10) {
        this.f6720m = eVar;
        this.f6722p = z10;
        this.f6724r.a(new a(this.f6723q, str, str2, str3, str4, bVar, cVar, z11, z12, i10), this);
    }

    @Override // com.anythink.expressad.foundation.g.g.a.b
    public final void a(a.EnumC0123a enumC0123a) {
        if (enumC0123a == a.EnumC0123a.FINISH && this.o) {
            this.f6726t.post(new Runnable() { // from class: com.anythink.expressad.a.h.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (h.this.f6720m != null) {
                        if (h.this.f6721n.g()) {
                            e unused = h.this.f6720m;
                            c.b unused2 = h.this.f6721n;
                        } else {
                            e unused3 = h.this.f6720m;
                            c.b unused4 = h.this.f6721n;
                            h.this.f6721n.h();
                        }
                    }
                }
            });
        }
    }
}
