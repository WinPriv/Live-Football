package com.anythink.expressad.splash.c;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.anythink.core.common.b.n;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.p;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.foundation.h.x;
import com.anythink.expressad.splash.a.b;
import com.anythink.expressad.splash.c.a;
import com.anythink.expressad.splash.c.e;
import com.anythink.expressad.splash.view.ATSplashView;
import com.anythink.expressad.videocommon.b.i;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private static String f10930c = "SplashLoadManager";

    /* renamed from: l, reason: collision with root package name */
    private static final int f10931l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final int f10932m = 2;

    /* renamed from: n, reason: collision with root package name */
    private static final int f10933n = 3;
    private int B;

    /* renamed from: b, reason: collision with root package name */
    com.anythink.expressad.foundation.d.c f10935b;

    /* renamed from: d, reason: collision with root package name */
    private String f10936d;

    /* renamed from: e, reason: collision with root package name */
    private String f10937e;
    private long f;

    /* renamed from: g, reason: collision with root package name */
    private long f10938g;

    /* renamed from: h, reason: collision with root package name */
    private com.anythink.expressad.splash.b.c f10939h;

    /* renamed from: j, reason: collision with root package name */
    private ATSplashView f10941j;

    /* renamed from: k, reason: collision with root package name */
    private com.anythink.expressad.d.c f10942k;
    private boolean o;

    /* renamed from: p, reason: collision with root package name */
    private int f10943p;

    /* renamed from: q, reason: collision with root package name */
    private int f10944q;

    /* renamed from: r, reason: collision with root package name */
    private int f10945r;

    /* renamed from: s, reason: collision with root package name */
    private String f10946s;

    /* renamed from: t, reason: collision with root package name */
    private int f10947t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f10948u;

    /* renamed from: v, reason: collision with root package name */
    private volatile boolean f10949v;

    /* renamed from: w, reason: collision with root package name */
    private com.anythink.expressad.videocommon.d.b f10950w;

    /* renamed from: x, reason: collision with root package name */
    private i.d f10951x;
    private String y;

    /* renamed from: z, reason: collision with root package name */
    private int f10952z;
    private String A = "";
    private Handler C = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.splash.c.c.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Object obj = message.obj;
                        if (obj instanceof com.anythink.expressad.foundation.d.c) {
                            c cVar = c.this;
                            cVar.b((com.anythink.expressad.foundation.d.c) obj, cVar.f10947t);
                            return;
                        }
                        return;
                    }
                    return;
                }
                Object obj2 = message.obj;
                if (obj2 instanceof String) {
                    c cVar2 = c.this;
                    String obj3 = obj2.toString();
                    String unused = c.this.f10946s;
                    int unused2 = c.this.f10947t;
                    cVar2.a(obj3);
                    return;
                }
                return;
            }
            Object obj4 = message.obj;
            int i11 = message.arg1;
            if (obj4 instanceof com.anythink.expressad.foundation.d.c) {
                com.anythink.expressad.foundation.d.c cVar3 = (com.anythink.expressad.foundation.d.c) obj4;
                c.a(c.this, i.a().c(cVar3.c()), cVar3, i11);
            }
        }
    };
    private Runnable D = new Runnable() { // from class: com.anythink.expressad.splash.c.c.2
        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            String unused = cVar.f10946s;
            int unused2 = c.this.f10947t;
            cVar.a("load timeout");
        }
    };

    /* renamed from: a, reason: collision with root package name */
    boolean f10934a = false;

    /* renamed from: i, reason: collision with root package name */
    private Context f10940i = n.a().g();

    /* renamed from: com.anythink.expressad.splash.c.c$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.c f10958a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10959b;

        public AnonymousClass4(com.anythink.expressad.foundation.d.c cVar, int i10) {
            this.f10958a = cVar;
            this.f10959b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            File file;
            final File file2;
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        file2 = new File(this.f10958a.d());
                        try {
                            if (!file2.exists()) {
                                String b10 = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_HTML);
                                String a10 = p.a(x.a(this.f10958a.d()));
                                if (TextUtils.isEmpty(a10)) {
                                    a10 = String.valueOf(System.currentTimeMillis());
                                }
                                file = new File(b10, a10.concat(".html"));
                                try {
                                    if (!file.exists()) {
                                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                        try {
                                            StringBuilder sb2 = new StringBuilder("<script>");
                                            com.anythink.expressad.d.b.a.a();
                                            sb2.append(com.anythink.expressad.d.b.a.b());
                                            sb2.append("</script>");
                                            sb2.append(this.f10958a.d());
                                            fileOutputStream2.write(sb2.toString().getBytes());
                                            fileOutputStream2.flush();
                                            fileOutputStream = fileOutputStream2;
                                        } catch (Exception e10) {
                                            e = e10;
                                            fileOutputStream = fileOutputStream2;
                                            e.printStackTrace();
                                            this.f10958a.j("");
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            file2 = file;
                                            if (!file2.exists()) {
                                            }
                                            c cVar = c.this;
                                            String unused = cVar.f10946s;
                                            cVar.a("html file write failed");
                                        } catch (Throwable th) {
                                            th = th;
                                            fileOutputStream = fileOutputStream2;
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    file2 = file;
                                } catch (Exception e11) {
                                    e = e11;
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                        } catch (Exception e12) {
                            e = e12;
                            file = file2;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        file = null;
                    }
                    if (!file2.exists() && file2.isFile() && file2.canRead()) {
                        this.f10958a.b(file2.getAbsolutePath());
                        n.a().a(new Runnable() { // from class: com.anythink.expressad.splash.c.c.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                c cVar2 = c.this;
                                String str = "file:////" + file2.getAbsolutePath();
                                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                c.a(cVar2, str, anonymousClass4.f10958a, anonymousClass4.f10959b);
                            }
                        });
                    } else {
                        c cVar2 = c.this;
                        String unused2 = cVar2.f10946s;
                        cVar2.a("html file write failed");
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e14) {
                c cVar3 = c.this;
                String message = e14.getMessage();
                String unused3 = c.this.f10946s;
                cVar3.a(message);
            }
        }
    }

    public c(String str, String str2, long j10) {
        this.f10937e = str;
        this.f10936d = str2;
        this.f10938g = j10;
    }

    private boolean e() {
        return this.o;
    }

    private int f() {
        return this.f10943p;
    }

    private void g() {
        try {
            int i10 = this.f10952z + 1;
            this.f10952z = i10;
            com.anythink.expressad.d.c cVar = this.f10942k;
            if (cVar == null || i10 > cVar.t()) {
                o.b(f10930c, "onload 重置offset为0");
                this.f10952z = 0;
            }
            o.b(f10930c, "onload 算出 下次的offset是:" + this.f10952z);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void h() {
    }

    private static void i() {
    }

    private void j() {
        this.f10952z = 0;
    }

    private void l() {
        this.C.removeCallbacks(this.D);
    }

    /* renamed from: com.anythink.expressad.splash.c.c$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass7 implements e.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.c f10969a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10970b;

        public AnonymousClass7(com.anythink.expressad.foundation.d.c cVar, int i10) {
            this.f10969a = cVar;
            this.f10970b = i10;
        }

        @Override // com.anythink.expressad.splash.c.e.b
        public final void a() {
            if (this.f10969a.s()) {
                return;
            }
            c.c(c.this, this.f10969a, this.f10970b);
        }

        @Override // com.anythink.expressad.splash.c.e.b
        public final void a(String str) {
            c.this.a(str);
        }

        @Override // com.anythink.expressad.splash.c.e.b
        public final void a(int i10) {
            if (i10 == 1) {
                c.c(c.this, this.f10969a, this.f10970b);
            } else {
                c.this.a("readyState 2");
            }
        }
    }

    private void e(com.anythink.expressad.foundation.d.c cVar, int i10) {
        com.anythink.core.common.k.b.a.a().a(new AnonymousClass4(cVar, i10));
    }

    private void f(com.anythink.expressad.foundation.d.c cVar, int i10) {
        if (cVar.j()) {
            return;
        }
        this.f10951x = new AnonymousClass5(cVar, i10);
        i.a().b(cVar.c(), (i.a) this.f10951x);
    }

    private void h(com.anythink.expressad.foundation.d.c cVar, int i10) {
        if (this.f10941j.isH5Ready()) {
            return;
        }
        this.f10941j.setH5Ready(true);
        b(cVar, i10);
    }

    private void i(com.anythink.expressad.foundation.d.c cVar, int i10) {
        this.f10950w = new AnonymousClass8(cVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        com.anythink.expressad.videocommon.b.e.a().a(this.f10936d, arrayList, com.anythink.expressad.foundation.g.a.aV, this.f10950w);
        if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.aV, this.f10936d, cVar.A())) {
            com.anythink.expressad.videocommon.b.e.a().d(this.f10936d);
        } else {
            this.f10941j.setVideoReady(true);
            b(cVar, i10);
        }
    }

    public final void b(boolean z10) {
        this.o = z10;
    }

    public final com.anythink.expressad.foundation.d.c c() {
        return this.f10935b;
    }

    private void c(com.anythink.expressad.foundation.d.c cVar, int i10) {
        this.f10941j.clearResState();
        if (!TextUtils.isEmpty(cVar.c()) && !cVar.j()) {
            this.f10951x = new AnonymousClass5(cVar, i10);
            i.a().b(cVar.c(), (i.a) this.f10951x);
        }
        if (cVar.j()) {
            return;
        }
        if (!TextUtils.isEmpty(cVar.d())) {
            com.anythink.core.common.k.b.a.a().a(new AnonymousClass4(cVar, i10));
        }
        if (!TextUtils.isEmpty(cVar.S())) {
            this.f10950w = new AnonymousClass8(cVar);
            ArrayList arrayList = new ArrayList();
            arrayList.add(cVar);
            com.anythink.expressad.videocommon.b.e.a().a(this.f10936d, arrayList, com.anythink.expressad.foundation.g.a.aV, this.f10950w);
            if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.aV, this.f10936d, cVar.A())) {
                com.anythink.expressad.videocommon.b.e.a().d(this.f10936d);
            } else {
                this.f10941j.setVideoReady(true);
                b(cVar, i10);
            }
        }
        if (TextUtils.isEmpty(cVar.be())) {
            return;
        }
        d(cVar, i10);
    }

    private void d(final com.anythink.expressad.foundation.d.c cVar, final int i10) {
        b.a(this.f10941j, cVar, new com.anythink.expressad.splash.view.a() { // from class: com.anythink.expressad.splash.c.c.3
            @Override // com.anythink.expressad.splash.view.a
            public final void a() {
                if (cVar.j() && c.this.f10941j != null) {
                    c.this.f10941j.setImageReady(true);
                    c.b(c.this, cVar, i10);
                }
                c.this.b(cVar, i10);
            }

            @Override // com.anythink.expressad.splash.view.a
            public final void b() {
                if (cVar.j() && c.this.f10941j != null) {
                    c.this.f10941j.setImageReady(false);
                    c cVar2 = c.this;
                    String unused = cVar2.f10946s;
                    cVar2.a("Image resource load faile");
                }
            }
        });
    }

    public final void b(int i10) {
        this.f10943p = i10;
    }

    /* renamed from: com.anythink.expressad.splash.c.c$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements com.anythink.expressad.splash.b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.c f10966a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10967b;

        public AnonymousClass6(com.anythink.expressad.foundation.d.c cVar, int i10) {
            this.f10966a = cVar;
            this.f10967b = i10;
        }

        @Override // com.anythink.expressad.splash.b.a
        public final void a(View view) {
            if (c.this.f10941j != null) {
                c.this.f10941j.setDynamicView(true);
                c.this.f10941j.setSplashNativeView(view);
                c.this.b(this.f10966a, this.f10967b);
            }
        }

        @Override // com.anythink.expressad.splash.b.a
        public final void a(String str) {
            c cVar = c.this;
            String unused = cVar.f10946s;
            cVar.a(str);
        }
    }

    public final void a(int i10) {
        this.B = i10;
    }

    public final void b() {
        if (this.f10939h != null) {
            this.f10939h = null;
        }
        if (this.f10950w != null) {
            this.f10950w = null;
        }
        if (this.f10951x != null) {
            this.f10951x = null;
        }
    }

    /* renamed from: com.anythink.expressad.splash.c.c$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements i.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.c f10963a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10964b;

        public AnonymousClass5(com.anythink.expressad.foundation.d.c cVar, int i10) {
            this.f10963a = cVar;
            this.f10964b = i10;
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f10963a;
            obtain.arg1 = this.f10964b;
            c.this.C.sendMessage(obtain);
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str, String str2) {
            c cVar = c.this;
            String unused = cVar.f10946s;
            cVar.a(str);
            Message obtain = Message.obtain();
            obtain.what = 2;
            obtain.obj = str;
            c.this.C.sendMessage(obtain);
        }
    }

    public final void a(boolean z10) {
        this.f10934a = z10;
    }

    /* renamed from: com.anythink.expressad.splash.c.c$8, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass8 implements com.anythink.expressad.videocommon.d.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.c f10972a;

        public AnonymousClass8(com.anythink.expressad.foundation.d.c cVar) {
            this.f10972a = cVar;
        }

        @Override // com.anythink.expressad.videocommon.d.b
        public final void a(String str) {
            c.this.f10941j.setVideoReady(true);
            o.a(c.f10930c, "========VIDEO SUC");
            Message obtain = Message.obtain();
            obtain.obj = this.f10972a;
            obtain.what = 3;
            c.this.C.sendMessage(obtain);
        }

        @Override // com.anythink.expressad.videocommon.d.b
        public final void a(String str, String str2) {
            c.this.f10941j.setVideoReady(false);
            o.a(c.f10930c, "========VIDEO FAI");
            Message obtain = Message.obtain();
            obtain.obj = str;
            obtain.what = 2;
            c.this.C.sendMessage(obtain);
        }
    }

    public final void a(com.anythink.expressad.d.c cVar) {
        this.f10942k = cVar;
    }

    private void g(com.anythink.expressad.foundation.d.c cVar, int i10) {
        if (cVar.j()) {
            b.a aVar = new b.a();
            aVar.b(this.f10936d).a(this.f10937e).a(this.o).a(cVar).a(this.f10943p).h(this.B);
            try {
                if (!TextUtils.isEmpty(cVar.c())) {
                    Uri parse = Uri.parse(cVar.c());
                    String queryParameter = parse.getQueryParameter("hdbtn");
                    String queryParameter2 = parse.getQueryParameter(com.anythink.expressad.video.dynview.a.a.Q);
                    String queryParameter3 = parse.getQueryParameter("hdinfo");
                    String queryParameter4 = parse.getQueryParameter("shake_show");
                    String queryParameter5 = parse.getQueryParameter("shake_strength");
                    String queryParameter6 = parse.getQueryParameter("shake_time");
                    String queryParameter7 = parse.getQueryParameter("n_logo");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        aVar.b(Integer.parseInt(queryParameter));
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        aVar.c(Integer.parseInt(queryParameter2));
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        aVar.d(Integer.parseInt(queryParameter3));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        aVar.e(Integer.parseInt(queryParameter4));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        aVar.f(Integer.parseInt(queryParameter5));
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        aVar.g(Integer.parseInt(queryParameter6));
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        aVar.i(Integer.parseInt(queryParameter7) == 0 ? 0 : 1);
                    }
                }
            } catch (Throwable th) {
                o.d(f10930c, th.getMessage());
            }
            a.C0132a.a();
            a.a(this.f10941j, new com.anythink.expressad.splash.a.b(aVar), new AnonymousClass6(cVar, i10));
        }
    }

    public final void a(ATSplashView aTSplashView) {
        this.f10941j = aTSplashView;
    }

    public final void a(int i10, int i11) {
        this.f10945r = i10;
        this.f10944q = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.anythink.expressad.foundation.d.c cVar, int i10) {
        if (!b.a(this.f10941j, cVar) || this.f10949v) {
            return;
        }
        l();
        this.f10935b = cVar;
        this.f10949v = true;
        com.anythink.expressad.splash.b.c cVar2 = this.f10939h;
        if (cVar2 != null) {
            cVar2.a(cVar, i10);
        }
    }

    public final String a() {
        return this.A;
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        ArrayList arrayList;
        this.f10949v = false;
        this.f10946s = "";
        this.f10947t = 2;
        if (dVar == null || dVar.J == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            com.anythink.expressad.foundation.d.c cVar = dVar.J.get(0);
            cVar.l(this.f10936d);
            this.y = dVar.c();
            if (cVar.O() != 99 && (!TextUtils.isEmpty(cVar.c()) || !TextUtils.isEmpty(cVar.d()))) {
                if (t.a(cVar)) {
                    cVar.i(t.a(this.f10940i, cVar.ba()) ? 1 : 2);
                }
                if (cVar.ae() != 1 && t.a(this.f10940i, cVar.ba())) {
                    if (t.a(cVar)) {
                        arrayList.add(cVar);
                    }
                } else {
                    arrayList.add(cVar);
                }
            }
        }
        if (arrayList != null && arrayList.size() > 0) {
            g();
            o.b(f10930c, "onload load成功 size:" + arrayList.size());
            com.anythink.expressad.foundation.d.c cVar2 = (com.anythink.expressad.foundation.d.c) arrayList.get(0);
            if (TextUtils.isEmpty(cVar2.c()) && (TextUtils.isEmpty(cVar2.d()) || !cVar2.d().contains("<MBTPLMARK>"))) {
                cVar2.a(false);
                cVar2.b(true);
            } else {
                cVar2.a(true);
                cVar2.b(false);
            }
            ATSplashView aTSplashView = this.f10941j;
            if (aTSplashView != null) {
                aTSplashView.setDynamicView(false);
            }
            if (cVar2.j()) {
                d(cVar2, 2);
            }
            if (b.a(this.f10941j, cVar2)) {
                b(cVar2, 2);
                return;
            }
            this.f10941j.clearResState();
            if (!TextUtils.isEmpty(cVar2.c()) && !cVar2.j()) {
                this.f10951x = new AnonymousClass5(cVar2, 2);
                i.a().b(cVar2.c(), (i.a) this.f10951x);
            }
            if (cVar2.j()) {
                return;
            }
            if (!TextUtils.isEmpty(cVar2.d())) {
                com.anythink.core.common.k.b.a.a().a(new AnonymousClass4(cVar2, 2));
            }
            if (!TextUtils.isEmpty(cVar2.S())) {
                this.f10950w = new AnonymousClass8(cVar2);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(cVar2);
                com.anythink.expressad.videocommon.b.e.a().a(this.f10936d, arrayList2, com.anythink.expressad.foundation.g.a.aV, this.f10950w);
                if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.aV, this.f10936d, cVar2.A())) {
                    com.anythink.expressad.videocommon.b.e.a().d(this.f10936d);
                } else {
                    this.f10941j.setVideoReady(true);
                    b(cVar2, 2);
                }
            }
            if (TextUtils.isEmpty(cVar2.be())) {
                return;
            }
            d(cVar2, 2);
            return;
        }
        o.b(f10930c, "onload load失败 返回的compaign没有可以用的");
        a("invalid  campaign");
    }

    private void b(String str) {
        if (this.f10949v) {
            return;
        }
        l();
        o.d(f10930c, "real failed ");
        this.f10949v = true;
        com.anythink.expressad.splash.b.c cVar = this.f10939h;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    private List<com.anythink.expressad.foundation.d.c> b(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar == null || dVar.J == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.anythink.expressad.foundation.d.c cVar = dVar.J.get(0);
        cVar.l(this.f10936d);
        this.y = dVar.c();
        if (cVar.O() == 99) {
            return arrayList;
        }
        if (TextUtils.isEmpty(cVar.c()) && TextUtils.isEmpty(cVar.d())) {
            return arrayList;
        }
        if (t.a(cVar)) {
            cVar.i(t.a(this.f10940i, cVar.ba()) ? 1 : 2);
        }
        if (cVar.ae() != 1 && t.a(this.f10940i, cVar.ba())) {
            if (!t.a(cVar)) {
                return arrayList;
            }
            arrayList.add(cVar);
            return arrayList;
        }
        arrayList.add(cVar);
        return arrayList;
    }

    private void c(String str) {
        a(str);
    }

    public static /* synthetic */ void c(c cVar, com.anythink.expressad.foundation.d.c cVar2, int i10) {
        if (cVar.f10941j.isH5Ready()) {
            return;
        }
        cVar.f10941j.setH5Ready(true);
        cVar.b(cVar2, i10);
    }

    private static void k() {
    }

    public static /* synthetic */ void b(c cVar, com.anythink.expressad.foundation.d.c cVar2, int i10) {
        if (cVar2.j()) {
            b.a aVar = new b.a();
            aVar.b(cVar.f10936d).a(cVar.f10937e).a(cVar.o).a(cVar2).a(cVar.f10943p).h(cVar.B);
            try {
                if (!TextUtils.isEmpty(cVar2.c())) {
                    Uri parse = Uri.parse(cVar2.c());
                    String queryParameter = parse.getQueryParameter("hdbtn");
                    String queryParameter2 = parse.getQueryParameter(com.anythink.expressad.video.dynview.a.a.Q);
                    String queryParameter3 = parse.getQueryParameter("hdinfo");
                    String queryParameter4 = parse.getQueryParameter("shake_show");
                    String queryParameter5 = parse.getQueryParameter("shake_strength");
                    String queryParameter6 = parse.getQueryParameter("shake_time");
                    String queryParameter7 = parse.getQueryParameter("n_logo");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        aVar.b(Integer.parseInt(queryParameter));
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        aVar.c(Integer.parseInt(queryParameter2));
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        aVar.d(Integer.parseInt(queryParameter3));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        aVar.e(Integer.parseInt(queryParameter4));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        aVar.f(Integer.parseInt(queryParameter5));
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        aVar.g(Integer.parseInt(queryParameter6));
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        aVar.i(Integer.parseInt(queryParameter7) == 0 ? 0 : 1);
                    }
                }
            } catch (Throwable th) {
                o.d(f10930c, th.getMessage());
            }
            a.C0132a.a();
            a.a(cVar.f10941j, new com.anythink.expressad.splash.a.b(aVar), new AnonymousClass6(cVar2, i10));
        }
    }

    private void a(long j10) {
        this.C.postDelayed(this.D, j10);
    }

    public final void a(com.anythink.expressad.splash.b.c cVar) {
        this.f10939h = cVar;
    }

    private void a(com.anythink.expressad.foundation.d.c cVar, int i10) {
        ATSplashView aTSplashView = this.f10941j;
        if (aTSplashView != null) {
            aTSplashView.setDynamicView(false);
        }
        if (cVar.j()) {
            d(cVar, i10);
        }
        if (b.a(this.f10941j, cVar)) {
            b(cVar, i10);
            return;
        }
        this.f10941j.clearResState();
        if (!TextUtils.isEmpty(cVar.c()) && !cVar.j()) {
            this.f10951x = new AnonymousClass5(cVar, i10);
            i.a().b(cVar.c(), (i.a) this.f10951x);
        }
        if (cVar.j()) {
            return;
        }
        if (!TextUtils.isEmpty(cVar.d())) {
            com.anythink.core.common.k.b.a.a().a(new AnonymousClass4(cVar, i10));
        }
        if (!TextUtils.isEmpty(cVar.S())) {
            this.f10950w = new AnonymousClass8(cVar);
            ArrayList arrayList = new ArrayList();
            arrayList.add(cVar);
            com.anythink.expressad.videocommon.b.e.a().a(this.f10936d, arrayList, com.anythink.expressad.foundation.g.a.aV, this.f10950w);
            if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.aV, this.f10936d, cVar.A())) {
                com.anythink.expressad.videocommon.b.e.a().d(this.f10936d);
            } else {
                this.f10941j.setVideoReady(true);
                b(cVar, i10);
            }
        }
        if (TextUtils.isEmpty(cVar.be())) {
            return;
        }
        d(cVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f10948u) {
            this.f10948u = false;
        } else {
            b(str);
        }
    }

    private void a(String str, com.anythink.expressad.foundation.d.c cVar, int i10) {
        e.c cVar2 = new e.c();
        cVar2.c(this.f10936d);
        cVar2.b(this.f10937e);
        cVar2.a(cVar);
        cVar2.a(str);
        cVar2.b(this.o);
        cVar2.a(this.f10943p);
        cVar2.a(this.f10934a);
        e.a.a().a(this.f10941j, cVar2, new AnonymousClass7(cVar, i10));
    }

    private void a(com.anythink.expressad.foundation.d.d dVar, int i10) {
        ArrayList arrayList;
        if (dVar == null || dVar.J == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            com.anythink.expressad.foundation.d.c cVar = dVar.J.get(0);
            cVar.l(this.f10936d);
            this.y = dVar.c();
            if (cVar.O() != 99 && (!TextUtils.isEmpty(cVar.c()) || !TextUtils.isEmpty(cVar.d()))) {
                if (t.a(cVar)) {
                    cVar.i(t.a(this.f10940i, cVar.ba()) ? 1 : 2);
                }
                if (cVar.ae() != 1 && t.a(this.f10940i, cVar.ba())) {
                    if (t.a(cVar)) {
                        arrayList.add(cVar);
                    }
                } else {
                    arrayList.add(cVar);
                }
            }
        }
        if (arrayList != null && arrayList.size() > 0) {
            g();
            o.b(f10930c, "onload load成功 size:" + arrayList.size());
            com.anythink.expressad.foundation.d.c cVar2 = (com.anythink.expressad.foundation.d.c) arrayList.get(0);
            if (TextUtils.isEmpty(cVar2.c()) && (TextUtils.isEmpty(cVar2.d()) || !cVar2.d().contains("<MBTPLMARK>"))) {
                cVar2.a(false);
                cVar2.b(true);
            } else {
                cVar2.a(true);
                cVar2.b(false);
            }
            ATSplashView aTSplashView = this.f10941j;
            if (aTSplashView != null) {
                aTSplashView.setDynamicView(false);
            }
            if (cVar2.j()) {
                d(cVar2, i10);
            }
            if (b.a(this.f10941j, cVar2)) {
                b(cVar2, i10);
                return;
            }
            this.f10941j.clearResState();
            if (!TextUtils.isEmpty(cVar2.c()) && !cVar2.j()) {
                this.f10951x = new AnonymousClass5(cVar2, i10);
                i.a().b(cVar2.c(), (i.a) this.f10951x);
            }
            if (cVar2.j()) {
                return;
            }
            if (!TextUtils.isEmpty(cVar2.d())) {
                com.anythink.core.common.k.b.a.a().a(new AnonymousClass4(cVar2, i10));
            }
            if (!TextUtils.isEmpty(cVar2.S())) {
                this.f10950w = new AnonymousClass8(cVar2);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(cVar2);
                com.anythink.expressad.videocommon.b.e.a().a(this.f10936d, arrayList2, com.anythink.expressad.foundation.g.a.aV, this.f10950w);
                if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.aV, this.f10936d, cVar2.A())) {
                    com.anythink.expressad.videocommon.b.e.a().d(this.f10936d);
                } else {
                    this.f10941j.setVideoReady(true);
                    b(cVar2, i10);
                }
            }
            if (TextUtils.isEmpty(cVar2.be())) {
                return;
            }
            d(cVar2, i10);
            return;
        }
        o.b(f10930c, "onload load失败 返回的compaign没有可以用的");
        a("invalid  campaign");
    }

    public static /* synthetic */ void a(c cVar, String str, com.anythink.expressad.foundation.d.c cVar2, int i10) {
        e.c cVar3 = new e.c();
        cVar3.c(cVar.f10936d);
        cVar3.b(cVar.f10937e);
        cVar3.a(cVar2);
        cVar3.a(str);
        cVar3.b(cVar.o);
        cVar3.a(cVar.f10943p);
        cVar3.a(cVar.f10934a);
        e.a.a().a(cVar.f10941j, cVar3, new AnonymousClass7(cVar2, i10));
    }
}
