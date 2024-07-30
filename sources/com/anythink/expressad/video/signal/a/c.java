package com.anythink.expressad.video.signal.a;

import android.app.Activity;
import android.content.Context;
import com.anythink.expressad.out.p;
import com.anythink.expressad.video.signal.c;
import com.applovin.impl.sdk.utils.JsonUtils;

/* loaded from: classes.dex */
public class c implements com.anythink.expressad.video.signal.c {

    /* renamed from: d, reason: collision with root package name */
    protected static final String f11900d = "DefaultJSCommon";

    /* renamed from: n, reason: collision with root package name */
    protected String f11909n;
    protected com.anythink.expressad.videocommon.e.d o;

    /* renamed from: p, reason: collision with root package name */
    protected com.anythink.expressad.videocommon.c.c f11910p;

    /* renamed from: q, reason: collision with root package name */
    protected com.anythink.expressad.a.a f11911q;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f11901e = false;
    protected boolean f = false;

    /* renamed from: g, reason: collision with root package name */
    protected int f11902g = 0;

    /* renamed from: h, reason: collision with root package name */
    protected int f11903h = 0;

    /* renamed from: i, reason: collision with root package name */
    protected int f11904i = 0;

    /* renamed from: j, reason: collision with root package name */
    protected int f11905j = 0;

    /* renamed from: k, reason: collision with root package name */
    protected int f11906k = 0;

    /* renamed from: l, reason: collision with root package name */
    protected int f11907l = 1;

    /* renamed from: m, reason: collision with root package name */
    protected int f11908m = -1;

    /* renamed from: r, reason: collision with root package name */
    public c.a f11912r = new a();

    /* renamed from: s, reason: collision with root package name */
    protected int f11913s = 2;

    /* loaded from: classes.dex */
    public static class a implements c.a {
        @Override // com.anythink.expressad.out.p.c
        public final void a(int i10) {
            a3.l.u(i10, "onDownloadProgress,progress:", c.f11900d);
        }

        @Override // com.anythink.expressad.out.p.c
        public final void b(com.anythink.expressad.out.j jVar) {
            com.anythink.expressad.foundation.h.o.a(c.f11900d, "onDismissLoading,campaign:".concat(String.valueOf(jVar)));
        }

        @Override // com.anythink.expressad.out.p.c
        public final void c(com.anythink.expressad.out.j jVar) {
            com.anythink.expressad.foundation.h.o.a(c.f11900d, "onDownloadStart,campaign:".concat(String.valueOf(jVar)));
        }

        @Override // com.anythink.expressad.out.p.c
        public final void d(com.anythink.expressad.out.j jVar) {
            com.anythink.expressad.foundation.h.o.a(c.f11900d, "onDownloadFinish,campaign:".concat(String.valueOf(jVar)));
        }

        @Override // com.anythink.expressad.out.p.c
        public void b(com.anythink.expressad.out.j jVar, String str) {
            com.anythink.expressad.foundation.h.o.a(c.f11900d, "onFinishRedirection,campaign:" + jVar + ",url:" + str);
        }

        @Override // com.anythink.expressad.video.signal.c.a
        public void c() {
            com.anythink.expressad.foundation.h.o.a(c.f11900d, "videoLocationReady");
        }

        @Override // com.anythink.expressad.video.signal.c.a
        public void b() {
            com.anythink.expressad.foundation.h.o.a(c.f11900d, "onInitSuccess");
        }

        @Override // com.anythink.expressad.out.p.c
        public final boolean a() {
            com.anythink.expressad.foundation.h.o.a(c.f11900d, "onInterceptDefaultLoadingDialog");
            return false;
        }

        @Override // com.anythink.expressad.out.p.c
        public final void a(com.anythink.expressad.out.j jVar) {
            com.anythink.expressad.foundation.h.o.a(c.f11900d, "onShowLoading,campaign:".concat(String.valueOf(jVar)));
        }

        @Override // com.anythink.expressad.out.p.c
        public void a(com.anythink.expressad.foundation.d.c cVar, String str) {
            com.anythink.expressad.foundation.h.o.a(c.f11900d, "onStartRedirection,campaign:" + cVar + ",url:" + str);
        }

        @Override // com.anythink.expressad.out.p.c
        public void a(com.anythink.expressad.out.j jVar, String str) {
            com.anythink.expressad.foundation.h.o.a(c.f11900d, "onFinishRedirection,campaign:" + jVar + ",url:" + str);
        }

        @Override // com.anythink.expressad.video.signal.c.a
        public void a(com.anythink.expressad.foundation.d.c cVar, boolean z10) {
            com.anythink.expressad.foundation.h.o.a(c.f11900d, "onStartInstall");
        }

        @Override // com.anythink.expressad.video.signal.c.a
        public void a(int i10, String str) {
            com.anythink.expressad.foundation.h.o.a(c.f11900d, "onH5Error,code:" + i10 + "，msg:" + str);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private com.anythink.expressad.video.signal.c f11914a;

        /* renamed from: b, reason: collision with root package name */
        private c.a f11915b;

        public b(com.anythink.expressad.video.signal.c cVar, c.a aVar) {
            this.f11914a = cVar;
            this.f11915b = aVar;
        }

        @Override // com.anythink.expressad.out.p.c
        public final boolean a() {
            c.a aVar = this.f11915b;
            return aVar != null && aVar.a();
        }

        @Override // com.anythink.expressad.out.p.c
        public final void b(com.anythink.expressad.out.j jVar) {
            c.a aVar = this.f11915b;
            if (aVar != null) {
                aVar.b(jVar);
            }
        }

        @Override // com.anythink.expressad.out.p.c
        public final void c(com.anythink.expressad.out.j jVar) {
            c.a aVar = this.f11915b;
            if (aVar != null) {
                aVar.c(jVar);
            }
        }

        @Override // com.anythink.expressad.out.p.c
        public final void d(com.anythink.expressad.out.j jVar) {
            c.a aVar = this.f11915b;
            if (aVar != null) {
                aVar.d(jVar);
            }
        }

        @Override // com.anythink.expressad.out.p.c
        public final void a(com.anythink.expressad.out.j jVar) {
            c.a aVar = this.f11915b;
            if (aVar != null) {
                aVar.a(jVar);
            }
        }

        @Override // com.anythink.expressad.out.p.c
        public final void b(com.anythink.expressad.out.j jVar, String str) {
            c.a aVar = this.f11915b;
            if (aVar != null) {
                aVar.b(jVar, str);
            }
            com.anythink.expressad.video.signal.c cVar = this.f11914a;
            if (cVar != null) {
                cVar.j();
            }
        }

        @Override // com.anythink.expressad.video.signal.c.a
        public final void c() {
            c.a aVar = this.f11915b;
            if (aVar != null) {
                aVar.c();
            }
        }

        @Override // com.anythink.expressad.out.p.c
        public final void a(com.anythink.expressad.foundation.d.c cVar, String str) {
            c.a aVar = this.f11915b;
            if (aVar != null) {
                aVar.a(cVar, str);
            }
        }

        @Override // com.anythink.expressad.out.p.c
        public final void a(com.anythink.expressad.out.j jVar, String str) {
            c.a aVar = this.f11915b;
            if (aVar != null) {
                aVar.a(jVar, str);
            }
            com.anythink.expressad.video.signal.c cVar = this.f11914a;
            if (cVar != null) {
                cVar.j();
            }
        }

        @Override // com.anythink.expressad.video.signal.c.a
        public final void b() {
            c.a aVar = this.f11915b;
            if (aVar != null) {
                aVar.b();
            }
        }

        @Override // com.anythink.expressad.out.p.c
        public final void a(int i10) {
            c.a aVar = this.f11915b;
            if (aVar != null) {
                aVar.a(i10);
            }
        }

        @Override // com.anythink.expressad.video.signal.c.a
        public final void a(com.anythink.expressad.foundation.d.c cVar, boolean z10) {
            c.a aVar = this.f11915b;
            if (aVar != null) {
                aVar.a(cVar, z10);
            }
        }

        @Override // com.anythink.expressad.video.signal.c.a
        public final void a(int i10, String str) {
            c.a aVar = this.f11915b;
            if (aVar != null) {
                aVar.a(i10, str);
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void a(String str) {
        a3.l.C(str, "setUnitId:", f11900d);
        this.f11909n = str;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void b(int i10) {
        this.f11903h = i10;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void c(int i10) {
        this.f11902g = i10;
    }

    @Override // com.anythink.expressad.video.signal.d
    public void click(int i10, String str) {
        com.anythink.expressad.foundation.h.o.a(f11900d, "click:type" + i10 + ",pt:" + str);
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void d(int i10) {
        this.f11904i = i10;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void e(int i10) {
        this.f11905j = i10;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void f(int i10) {
        this.f11906k = i10;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final boolean g() {
        return this.f11901e;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void h() {
        this.f11901e = true;
    }

    @Override // com.anythink.expressad.video.signal.d
    public void handlerH5Exception(int i10, String str) {
        com.anythink.expressad.foundation.h.o.a(f11900d, "handlerH5Exception,code=" + i10 + ",msg:" + str);
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void i(int i10) {
        a3.l.u(i10, "setAlertDialogRole ", f11900d);
        this.f11907l = i10;
    }

    @Override // com.anythink.expressad.video.signal.c
    public void j() {
        com.anythink.expressad.foundation.h.o.a(f11900d, "finish");
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void k() {
        com.anythink.expressad.foundation.h.o.a(f11900d, "release");
        com.anythink.expressad.a.a aVar = this.f11911q;
        if (aVar != null) {
            aVar.a();
            this.f11911q.a((p.c) null);
            this.f11911q.b();
        }
    }

    @Override // com.anythink.expressad.video.signal.c
    public final int m() {
        return this.f11908m;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final int n() {
        com.anythink.expressad.foundation.h.o.a(f11900d, "getAlertDialogRole " + this.f11907l);
        return this.f11907l;
    }

    @Override // com.anythink.expressad.video.signal.c
    public String o() {
        com.anythink.expressad.foundation.h.o.a(f11900d, "getNotchArea");
        return null;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final int b() {
        if (this.f11903h == 0 && this.f) {
            this.f11903h = 1;
        }
        return this.f11903h;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final int c() {
        if (this.f11902g == 0 && this.f) {
            this.f11902g = 1;
        }
        return this.f11902g;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final int d() {
        if (this.f11904i == 0 && this.f) {
            this.f11904i = 1;
        }
        return this.f11904i;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final int e() {
        return this.f11905j;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final int f() {
        return this.f11906k;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void g(int i10) {
        this.f11908m = i10;
    }

    @Override // com.anythink.expressad.video.signal.c
    public String h(int i10) {
        com.anythink.expressad.foundation.h.o.a(f11900d, "getSDKInfo");
        return JsonUtils.EMPTY_JSON;
    }

    private void a(com.anythink.expressad.videocommon.c.c cVar) {
        this.f11910p = cVar;
    }

    @Override // com.anythink.expressad.video.signal.c
    public void b(String str) {
        com.anythink.expressad.foundation.h.o.a(f11900d, "setNotchArea");
    }

    @Override // com.anythink.expressad.video.signal.c
    public String i() {
        com.anythink.expressad.foundation.h.o.a(f11900d, "init");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void a(int i10) {
        this.f11913s = i10;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final boolean a() {
        return this.f;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void a(boolean z10) {
        com.anythink.expressad.foundation.h.o.a(f11900d, "setIsShowingTransparent:".concat(String.valueOf(z10)));
        this.f = z10;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void a(c.a aVar) {
        com.anythink.expressad.foundation.h.o.a(f11900d, "setTrackingListener:".concat(String.valueOf(aVar)));
        this.f11912r = aVar;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void a(com.anythink.expressad.videocommon.e.d dVar) {
        com.anythink.expressad.foundation.h.o.a(f11900d, "setSetting:".concat(String.valueOf(dVar)));
        this.o = dVar;
    }

    @Override // com.anythink.expressad.video.signal.c
    public void a(int i10, String str) {
        com.anythink.expressad.foundation.h.o.a(f11900d, "statistics,type:" + i10 + ",json:" + str);
    }

    @Override // com.anythink.expressad.video.signal.c
    public void a(Activity activity) {
        com.anythink.expressad.foundation.h.o.a(f11900d, "setActivity ");
    }

    @Override // com.anythink.expressad.video.signal.c
    public void a(Context context) {
        com.anythink.expressad.foundation.h.o.a(f11900d, "setViewContext ");
    }

    @Override // com.anythink.expressad.video.signal.c
    public void l() {
    }
}
