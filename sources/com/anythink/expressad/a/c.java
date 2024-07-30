package com.anythink.expressad.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.anythink.expressad.foundation.g.g.a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f6637i = true;

    /* renamed from: l, reason: collision with root package name */
    private int f6641l;
    private com.anythink.expressad.foundation.g.g.c o;

    /* renamed from: p, reason: collision with root package name */
    private h f6644p;

    /* renamed from: j, reason: collision with root package name */
    private int f6639j = 0;

    /* renamed from: k, reason: collision with root package name */
    private String f6640k = null;

    /* renamed from: a, reason: collision with root package name */
    b f6638a = null;

    /* renamed from: m, reason: collision with root package name */
    private e f6642m = null;

    /* renamed from: n, reason: collision with root package name */
    private boolean f6643n = true;

    /* renamed from: q, reason: collision with root package name */
    private Handler f6645q = new Handler(Looper.getMainLooper());

    /* renamed from: com.anythink.expressad.a.c$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements a.b {
        private AnonymousClass1() {
        }

        @Override // com.anythink.expressad.foundation.g.g.a.b
        public final void a(a.EnumC0123a enumC0123a) {
            if (enumC0123a != a.EnumC0123a.FINISH || !c.this.f6643n) {
                return;
            }
            c.this.f6645q.post(new Runnable() { // from class: com.anythink.expressad.a.c.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (c.this.f6642m != null) {
                        if (c.this.f6638a.g()) {
                            e unused = c.this.f6642m;
                        } else {
                            e unused2 = c.this.f6642m;
                            c.this.f6638a.h();
                        }
                    }
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public class a extends com.anythink.expressad.foundation.g.g.a {
        private a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00de A[Catch: Exception -> 0x01f9, TryCatch #3 {Exception -> 0x01f9, blocks: (B:3:0x0003, B:7:0x0017, B:9:0x0020, B:20:0x008c, B:21:0x00c2, B:30:0x00de, B:32:0x00e4, B:34:0x00ec, B:37:0x00f5, B:38:0x0104, B:57:0x00fd, B:58:0x010c, B:59:0x0114, B:71:0x011a, B:61:0x0122, B:69:0x012e, B:63:0x013b, B:65:0x0151, B:82:0x00b8, B:77:0x00be, B:92:0x0159, B:93:0x015c, B:39:0x015d, B:41:0x016f, B:44:0x0182, B:46:0x0192, B:47:0x01ea, B:50:0x01ac, B:52:0x01b4, B:54:0x01c5, B:55:0x01be, B:56:0x01d1), top: B:2:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x016f A[Catch: Exception -> 0x01f9, TryCatch #3 {Exception -> 0x01f9, blocks: (B:3:0x0003, B:7:0x0017, B:9:0x0020, B:20:0x008c, B:21:0x00c2, B:30:0x00de, B:32:0x00e4, B:34:0x00ec, B:37:0x00f5, B:38:0x0104, B:57:0x00fd, B:58:0x010c, B:59:0x0114, B:71:0x011a, B:61:0x0122, B:69:0x012e, B:63:0x013b, B:65:0x0151, B:82:0x00b8, B:77:0x00be, B:92:0x0159, B:93:0x015c, B:39:0x015d, B:41:0x016f, B:44:0x0182, B:46:0x0192, B:47:0x01ea, B:50:0x01ac, B:52:0x01b4, B:54:0x01c5, B:55:0x01be, B:56:0x01d1), top: B:2:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0192 A[Catch: Exception -> 0x01f9, TryCatch #3 {Exception -> 0x01f9, blocks: (B:3:0x0003, B:7:0x0017, B:9:0x0020, B:20:0x008c, B:21:0x00c2, B:30:0x00de, B:32:0x00e4, B:34:0x00ec, B:37:0x00f5, B:38:0x0104, B:57:0x00fd, B:58:0x010c, B:59:0x0114, B:71:0x011a, B:61:0x0122, B:69:0x012e, B:63:0x013b, B:65:0x0151, B:82:0x00b8, B:77:0x00be, B:92:0x0159, B:93:0x015c, B:39:0x015d, B:41:0x016f, B:44:0x0182, B:46:0x0192, B:47:0x01ea, B:50:0x01ac, B:52:0x01b4, B:54:0x01c5, B:55:0x01be, B:56:0x01d1), top: B:2:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01ac A[Catch: Exception -> 0x01f9, TryCatch #3 {Exception -> 0x01f9, blocks: (B:3:0x0003, B:7:0x0017, B:9:0x0020, B:20:0x008c, B:21:0x00c2, B:30:0x00de, B:32:0x00e4, B:34:0x00ec, B:37:0x00f5, B:38:0x0104, B:57:0x00fd, B:58:0x010c, B:59:0x0114, B:71:0x011a, B:61:0x0122, B:69:0x012e, B:63:0x013b, B:65:0x0151, B:82:0x00b8, B:77:0x00be, B:92:0x0159, B:93:0x015c, B:39:0x015d, B:41:0x016f, B:44:0x0182, B:46:0x0192, B:47:0x01ea, B:50:0x01ac, B:52:0x01b4, B:54:0x01c5, B:55:0x01be, B:56:0x01d1), top: B:2:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x010c A[Catch: Exception -> 0x01f9, TryCatch #3 {Exception -> 0x01f9, blocks: (B:3:0x0003, B:7:0x0017, B:9:0x0020, B:20:0x008c, B:21:0x00c2, B:30:0x00de, B:32:0x00e4, B:34:0x00ec, B:37:0x00f5, B:38:0x0104, B:57:0x00fd, B:58:0x010c, B:59:0x0114, B:71:0x011a, B:61:0x0122, B:69:0x012e, B:63:0x013b, B:65:0x0151, B:82:0x00b8, B:77:0x00be, B:92:0x0159, B:93:0x015c, B:39:0x015d, B:41:0x016f, B:44:0x0182, B:46:0x0192, B:47:0x01ea, B:50:0x01ac, B:52:0x01b4, B:54:0x01c5, B:55:0x01be, B:56:0x01d1), top: B:2:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0122 A[Catch: Exception -> 0x01f9, TryCatch #3 {Exception -> 0x01f9, blocks: (B:3:0x0003, B:7:0x0017, B:9:0x0020, B:20:0x008c, B:21:0x00c2, B:30:0x00de, B:32:0x00e4, B:34:0x00ec, B:37:0x00f5, B:38:0x0104, B:57:0x00fd, B:58:0x010c, B:59:0x0114, B:71:0x011a, B:61:0x0122, B:69:0x012e, B:63:0x013b, B:65:0x0151, B:82:0x00b8, B:77:0x00be, B:92:0x0159, B:93:0x015c, B:39:0x015d, B:41:0x016f, B:44:0x0182, B:46:0x0192, B:47:0x01ea, B:50:0x01ac, B:52:0x01b4, B:54:0x01c5, B:55:0x01be, B:56:0x01d1), top: B:2:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x011a A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00a4 A[EDGE_INSN: B:79:0x00a4->B:80:0x00a4 BREAK  A[LOOP:0: B:5:0x000d->B:65:0x0151], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0159 A[Catch: Exception -> 0x01f9, TryCatch #3 {Exception -> 0x01f9, blocks: (B:3:0x0003, B:7:0x0017, B:9:0x0020, B:20:0x008c, B:21:0x00c2, B:30:0x00de, B:32:0x00e4, B:34:0x00ec, B:37:0x00f5, B:38:0x0104, B:57:0x00fd, B:58:0x010c, B:59:0x0114, B:71:0x011a, B:61:0x0122, B:69:0x012e, B:63:0x013b, B:65:0x0151, B:82:0x00b8, B:77:0x00be, B:92:0x0159, B:93:0x015c, B:39:0x015d, B:41:0x016f, B:44:0x0182, B:46:0x0192, B:47:0x01ea, B:50:0x01ac, B:52:0x01b4, B:54:0x01c5, B:55:0x01be, B:56:0x01d1), top: B:2:0x0003 }] */
        @Override // com.anythink.expressad.foundation.g.g.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                Method dump skipped, instructions count: 539
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.a.c.a.a():void");
        }

        private /* synthetic */ a(c cVar, byte b10) {
            this();
        }

        @Override // com.anythink.expressad.foundation.g.g.a
        public final void b() {
        }

        @Override // com.anythink.expressad.foundation.g.g.a
        public final void c() {
        }
    }

    /* loaded from: classes.dex */
    public static class b implements com.anythink.expressad.e.b, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public static final int f6649a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f6650b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f6651c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f6652d = 4;

        /* renamed from: e, reason: collision with root package name */
        private static final long f6653e = 1;
        private boolean f;

        /* renamed from: g, reason: collision with root package name */
        private String f6654g;

        /* renamed from: h, reason: collision with root package name */
        private int f6655h;

        /* renamed from: i, reason: collision with root package name */
        private String f6656i;

        /* renamed from: j, reason: collision with root package name */
        private String f6657j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f6658k;

        /* renamed from: l, reason: collision with root package name */
        private String f6659l;

        /* renamed from: m, reason: collision with root package name */
        private String f6660m;

        /* renamed from: n, reason: collision with root package name */
        private String f6661n;
        private int o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f6662p;

        /* renamed from: q, reason: collision with root package name */
        private int f6663q;

        private boolean l() {
            return this.f6662p;
        }

        private String m() {
            return this.f6657j;
        }

        public final int a() {
            return this.f6663q;
        }

        public final void b() {
            this.f6662p = true;
        }

        public final int c() {
            return this.o;
        }

        public final String d() {
            return this.f6661n;
        }

        public final String e() {
            return this.f6660m;
        }

        public final String f() {
            return this.f6659l;
        }

        public final boolean g() {
            return this.f;
        }

        public final String h() {
            return this.f6654g;
        }

        public final int i() {
            return this.f6655h;
        }

        public final String j() {
            return this.f6656i;
        }

        public final boolean k() {
            return this.f6658k;
        }

        private void f(String str) {
            this.f6657j = str;
        }

        public final void a(int i10) {
            this.f6663q = i10;
        }

        public final void b(int i10) {
            this.o = i10;
        }

        public final void c(String str) {
            this.f6659l = str;
        }

        public final void d(String str) {
            this.f6654g = str;
        }

        public final void e(String str) {
            this.f6656i = str;
        }

        public final void a(String str) {
            this.f6661n = str;
        }

        public final void b(String str) {
            this.f6660m = str;
        }

        public final void c(int i10) {
            this.f6655h = i10;
        }

        public final void a(boolean z10) {
            this.f = z10;
        }

        public final void b(boolean z10) {
            this.f6658k = z10;
        }
    }

    public c(Context context) {
        this.o = new com.anythink.expressad.foundation.g.g.c(context, 2);
        this.f6644p = new h(context);
    }

    public static /* synthetic */ int d(c cVar) {
        int i10 = cVar.f6639j;
        cVar.f6639j = i10 + 1;
        return i10;
    }

    @Override // com.anythink.expressad.a.d
    public final void b() {
        this.f6643n = false;
    }

    public final boolean a() {
        return this.f6643n;
    }

    public final void a(String str, String str2, com.anythink.expressad.foundation.d.c cVar, e eVar, String str3, boolean z10, boolean z11, int i10) {
        String str4;
        this.f6640k = str3;
        this.f6642m = eVar;
        this.f6638a = null;
        this.f6641l = i10;
        if (cVar != null) {
            r1 = "5".equals(cVar.ab()) || "6".equals(cVar.ab());
            str4 = cVar.aZ();
        } else {
            str4 = "";
        }
        this.f6644p.a(str3, eVar, r1, str, str4, str2, null, cVar, z10, z11, i10);
    }

    private void a(String str, String str2, com.anythink.expressad.foundation.d.c cVar, e eVar, com.anythink.expressad.c.b bVar) {
        this.f6640k = new String(cVar.ad());
        this.f6642m = eVar;
        this.f6638a = null;
        this.f6644p.a(cVar.ad(), eVar, "5".equals(cVar.ab()) || "6".equals(cVar.ab()), str, cVar.aZ(), str2, bVar, cVar, true, false, com.anythink.expressad.a.a.a.f6608l);
    }

    private void a(String str, String str2, com.anythink.expressad.foundation.d.c cVar, e eVar) {
        this.f6640k = new String(cVar.ad());
        this.f6642m = eVar;
        this.f6638a = null;
        this.f6644p.a(cVar.ad(), eVar, "5".equals(cVar.ab()) || "6".equals(cVar.ab()), str, cVar.aZ(), str2, null, cVar, true, false, com.anythink.expressad.a.a.a.f6608l);
    }
}
