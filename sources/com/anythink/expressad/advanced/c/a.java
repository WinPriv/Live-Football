package com.anythink.expressad.advanced.c;

import a3.k;
import a3.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.anythink.core.common.b.n;
import com.anythink.expressad.advanced.js.NativeAdvancedJSBridgeImpl;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.advanced.view.ATNativeAdvancedView;
import com.anythink.expressad.advanced.view.ATNativeAdvancedWebview;
import com.anythink.expressad.foundation.g.c.d;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.p;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.foundation.h.x;
import com.anythink.expressad.videocommon.b.e;
import com.anythink.expressad.videocommon.b.i;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f6773a = "NativeAdvancedLoadManager";

    /* renamed from: j, reason: collision with root package name */
    private static final int f6774j = 1;

    /* renamed from: k, reason: collision with root package name */
    private static final int f6775k = 2;

    /* renamed from: l, reason: collision with root package name */
    private static final int f6776l = 3;

    /* renamed from: m, reason: collision with root package name */
    private static final int f6777m = 4;

    /* renamed from: n, reason: collision with root package name */
    private static final int f6778n = 5;
    private int A;

    /* renamed from: b, reason: collision with root package name */
    private String f6779b;

    /* renamed from: c, reason: collision with root package name */
    private String f6780c;

    /* renamed from: d, reason: collision with root package name */
    private long f6781d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.expressad.advanced.b.a f6782e;

    /* renamed from: g, reason: collision with root package name */
    private ATNativeAdvancedView f6783g;

    /* renamed from: h, reason: collision with root package name */
    private com.anythink.expressad.d.c f6784h;

    /* renamed from: i, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.c f6785i;
    private int o;

    /* renamed from: p, reason: collision with root package name */
    private int f6786p;

    /* renamed from: q, reason: collision with root package name */
    private int f6787q;

    /* renamed from: r, reason: collision with root package name */
    private int f6788r;

    /* renamed from: s, reason: collision with root package name */
    private String f6789s;

    /* renamed from: t, reason: collision with root package name */
    private int f6790t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f6791u;

    /* renamed from: v, reason: collision with root package name */
    private volatile boolean f6792v;

    /* renamed from: w, reason: collision with root package name */
    private com.anythink.expressad.videocommon.d.b f6793w;

    /* renamed from: x, reason: collision with root package name */
    private i.d f6794x;
    private i.d y;

    /* renamed from: z, reason: collision with root package name */
    private String f6795z;
    private String B = "";
    private Handler C = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.advanced.c.a.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object obj;
            super.handleMessage(message);
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5 && (obj = message.obj) != null && (obj instanceof com.anythink.expressad.foundation.d.c)) {
                                if (a.this.f6783g != null) {
                                    a.this.f6783g.setVideoReady(true);
                                }
                                a aVar = a.this;
                                aVar.a((com.anythink.expressad.foundation.d.c) obj, aVar.f6790t);
                                return;
                            }
                            return;
                        }
                        Object obj2 = message.obj;
                        if (obj2 != null && (obj2 instanceof com.anythink.expressad.foundation.d.c)) {
                            if (a.this.f6783g != null) {
                                a.this.f6783g.setEndCardReady(true);
                            }
                            a aVar2 = a.this;
                            aVar2.a((com.anythink.expressad.foundation.d.c) obj2, aVar2.f6790t);
                            return;
                        }
                        return;
                    }
                    Object obj3 = message.obj;
                    if (obj3 != null && (obj3 instanceof com.anythink.expressad.foundation.d.c)) {
                        a aVar3 = a.this;
                        aVar3.a((com.anythink.expressad.foundation.d.c) obj3, aVar3.f6790t);
                        return;
                    }
                    return;
                }
                Object obj4 = message.obj;
                if (obj4 != null && (obj4 instanceof String)) {
                    a aVar4 = a.this;
                    String obj5 = obj4.toString();
                    String unused = a.this.f6789s;
                    aVar4.b(obj5, a.this.f6790t);
                    return;
                }
                return;
            }
            Object obj6 = message.obj;
            int i11 = message.arg1;
            if (obj6 != null && (obj6 instanceof com.anythink.expressad.foundation.d.c)) {
                com.anythink.expressad.foundation.d.c cVar = (com.anythink.expressad.foundation.d.c) obj6;
                a.a(a.this, i.a().c(cVar.c()), cVar, i11);
            }
        }
    };
    private Runnable D = new Runnable() { // from class: com.anythink.expressad.advanced.c.a.3
        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            String unused = aVar.f6789s;
            aVar.b("load timeout", a.this.f6790t);
        }
    };
    private Context f = n.a().g();

    /* renamed from: com.anythink.expressad.advanced.c.a$10, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass10 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ATNativeAdvancedWebview f6797a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f6798b;

        public AnonymousClass10(ATNativeAdvancedWebview aTNativeAdvancedWebview, String str) {
            this.f6797a = aTNativeAdvancedWebview;
            this.f6798b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f6797a.loadUrl(x.c(this.f6798b));
        }
    }

    /* renamed from: com.anythink.expressad.advanced.c.a$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass7 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.c f6816a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6817b = 2;

        public AnonymousClass7(com.anythink.expressad.foundation.d.c cVar) {
            this.f6816a = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            File file;
            final File file2;
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        file2 = new File(this.f6816a.d());
                        try {
                            if (!file2.exists()) {
                                String b10 = d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_HTML);
                                String a10 = p.a(x.a(this.f6816a.d()));
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
                                            sb2.append(this.f6816a.d());
                                            fileOutputStream2.write(sb2.toString().getBytes());
                                            fileOutputStream2.flush();
                                            fileOutputStream = fileOutputStream2;
                                        } catch (Exception e10) {
                                            e = e10;
                                            fileOutputStream = fileOutputStream2;
                                            e.printStackTrace();
                                            this.f6816a.j("");
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            file2 = file;
                                            if (!file2.exists()) {
                                            }
                                            o.a(a.f6773a, "渲染 HTML 失败： html file write failed");
                                            a aVar = a.this;
                                            String unused = aVar.f6789s;
                                            aVar.b("html file write failed", this.f6817b);
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
                        this.f6816a.b(file2.getAbsolutePath());
                        o.a(a.f6773a, "开始渲染 HTML： ");
                        n.a().a(new Runnable() { // from class: com.anythink.expressad.advanced.c.a.7.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar2 = a.this;
                                String str = "file:////" + file2.getAbsolutePath();
                                AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                                a.a(aVar2, str, anonymousClass7.f6816a, anonymousClass7.f6817b);
                            }
                        });
                    } else {
                        o.a(a.f6773a, "渲染 HTML 失败： html file write failed");
                        a aVar2 = a.this;
                        String unused2 = aVar2.f6789s;
                        aVar2.b("html file write failed", this.f6817b);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e14) {
                a aVar3 = a.this;
                String message = e14.getMessage();
                String unused3 = a.this.f6789s;
                aVar3.b(message, this.f6817b);
            }
        }
    }

    /* renamed from: com.anythink.expressad.advanced.c.a$9, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass9 extends com.anythink.expressad.atsignalcommon.a.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.c f6824a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6825b;

        public AnonymousClass9(com.anythink.expressad.foundation.d.c cVar, int i10) {
            this.f6824a = cVar;
            this.f6825b = i10;
        }

        @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            o.d("NativeAdvancedLoadManager", "onPageFinished");
            if (!this.f6824a.s()) {
                a.this.f6783g.setH5Ready(true);
                o.d("NativeAdvancedLoadManager", "=======onPageFinished OK");
                com.anythink.expressad.advanced.a.a.a(this.f6824a.Z());
                a.b(a.this, this.f6824a, this.f6825b);
            }
            NativeAdvancedJsUtils.fireOnJSBridgeConnected(webView);
        }

        @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
        public final void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            o.d("NativeAdvancedLoadManager", "onReceivedError： " + i10 + "  " + str + "  " + str2);
            a.this.b(str, this.f6825b);
        }

        @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            o.d("NativeAdvancedLoadManager", "onReceivedSslError: " + sslError.getPrimaryError());
            a.this.b("onReceivedSslError:" + sslError.getUrl(), this.f6825b);
        }

        @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
        public final void readyState(WebView webView, int i10) {
            super.readyState(webView, i10);
            o.d("NativeAdvancedLoadManager", "=========readyState: ".concat(String.valueOf(i10)));
            if (i10 == 1) {
                a.this.f6783g.setH5Ready(true);
                com.anythink.expressad.advanced.a.a.a(this.f6824a.Z());
                a.b(a.this, this.f6824a, this.f6825b);
                return;
            }
            a.this.b("readyState 2", this.f6825b);
        }
    }

    public a(String str, String str2) {
        this.f6780c = str;
        this.f6779b = str2;
    }

    private void c(com.anythink.expressad.foundation.d.c cVar) {
        k.f().a(cVar.y(), new AnonymousClass4(cVar));
    }

    private void e(com.anythink.expressad.foundation.d.c cVar) {
        k.f().a(cVar.be(), new AnonymousClass6(cVar));
    }

    private void f() {
        try {
            int i10 = this.A + 1;
            this.A = i10;
            com.anythink.expressad.d.c cVar = this.f6784h;
            if (cVar == null || i10 > cVar.t()) {
                o.b(f6773a, "onload 重置offset为0");
                this.A = 0;
            }
            o.b(f6773a, "onload 算出 下次的offset是:" + this.A);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void g() {
    }

    private void h() {
        this.A = 0;
    }

    private void i() {
        this.C.removeCallbacks(this.D);
    }

    private void b(int i10) {
        this.f6786p = i10;
    }

    private void g(com.anythink.expressad.foundation.d.c cVar) {
        this.f6794x = new AnonymousClass8(cVar);
        i.a().b(cVar.c(), (i.a) this.f6794x);
    }

    private void h(com.anythink.expressad.foundation.d.c cVar) {
        this.f6793w = new AnonymousClass2(cVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        e.a().a(this.f6779b, arrayList, com.anythink.expressad.foundation.g.a.aX, this.f6793w);
        if (!e.a().a(com.anythink.expressad.foundation.g.a.aX, this.f6779b, cVar.A())) {
            o.a(f6773a, " load Video");
            e.a().d(this.f6779b);
        } else {
            o.a(f6773a, " load Video isReady true");
            this.f6783g.setVideoReady(true);
            a(cVar, 2);
        }
    }

    private void d(com.anythink.expressad.foundation.d.c cVar) {
        this.y = new AnonymousClass5(cVar);
        i.a().b(cVar.I(), (i.a) this.y);
    }

    public final void a(com.anythink.expressad.d.c cVar) {
        this.f6784h = cVar;
    }

    public final void b() {
        if (this.f6782e != null) {
            this.f6782e = null;
        }
        b("LoadManager release", this.f6790t);
        if (this.f6793w != null) {
            this.f6793w = null;
        }
        if (this.f6794x != null) {
            this.f6794x = null;
        }
    }

    public final void a(ATNativeAdvancedView aTNativeAdvancedView) {
        this.f6783g = aTNativeAdvancedView;
    }

    /* renamed from: com.anythink.expressad.advanced.c.a$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements com.anythink.expressad.videocommon.d.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.c f6800a;

        public AnonymousClass2(com.anythink.expressad.foundation.d.c cVar) {
            this.f6800a = cVar;
        }

        @Override // com.anythink.expressad.videocommon.d.b
        public final void a(String str) {
            o.a(a.f6773a, "Video 下载成功： ".concat(String.valueOf(str)));
            Message obtain = Message.obtain();
            obtain.obj = this.f6800a;
            obtain.what = 5;
            a.this.C.sendMessage(obtain);
        }

        @Override // com.anythink.expressad.videocommon.d.b
        public final void a(String str, String str2) {
            o.a(a.f6773a, "Video 下载失败： ".concat(String.valueOf(str)));
            Message obtain = Message.obtain();
            obtain.obj = str;
            obtain.what = 2;
            a.this.C.sendMessage(obtain);
        }
    }

    public final void a(int i10) {
        this.o = i10;
    }

    /* renamed from: com.anythink.expressad.advanced.c.a$8, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass8 implements i.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.c f6821a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6822b = 2;

        public AnonymousClass8(com.anythink.expressad.foundation.d.c cVar) {
            this.f6821a = cVar;
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str) {
            o.a(a.f6773a, "zip 下载成功： ".concat(String.valueOf(str)));
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f6821a;
            obtain.arg1 = this.f6822b;
            a.this.C.sendMessage(obtain);
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str, String str2) {
            o.a(a.f6773a, "zip 下载失败： " + str2 + " " + str);
            Message obtain = Message.obtain();
            obtain.what = 2;
            obtain.obj = str;
            a.this.C.sendMessage(obtain);
        }
    }

    private int e() {
        return this.f6786p;
    }

    public final void a(int i10, int i11) {
        this.f6788r = i10;
        this.f6787q = i11;
    }

    /* renamed from: com.anythink.expressad.advanced.c.a$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements com.anythink.expressad.foundation.g.d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.c f6803a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6804b = 2;

        public AnonymousClass4(com.anythink.expressad.foundation.d.c cVar) {
            this.f6803a = cVar;
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            l.C(str, "giturl 下载成功： ", a.f6773a);
            if (a.this.C != null) {
                a.this.C.post(new Runnable() { // from class: com.anythink.expressad.advanced.c.a.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        a.this.a(anonymousClass4.f6803a, anonymousClass4.f6804b);
                    }
                });
            }
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
            l.C(str2, "gifurl 下载失败： ", a.f6773a);
            if (a.this.C != null) {
                a.this.C.post(new Runnable() { // from class: com.anythink.expressad.advanced.c.a.4.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        a.this.a(anonymousClass4.f6803a, anonymousClass4.f6804b);
                    }
                });
            }
        }
    }

    /* renamed from: com.anythink.expressad.advanced.c.a$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements com.anythink.expressad.foundation.g.d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.c f6811a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6812b = 2;

        public AnonymousClass6(com.anythink.expressad.foundation.d.c cVar) {
            this.f6811a = cVar;
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            l.C(str, "image 下载成功： ", a.f6773a);
            if (a.this.C != null) {
                a.this.C.post(new Runnable() { // from class: com.anythink.expressad.advanced.c.a.6.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                        a.this.a(anonymousClass6.f6811a, anonymousClass6.f6812b);
                    }
                });
            }
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
            l.C(str2, "image 下载失败： ", a.f6773a);
            if (a.this.C != null) {
                a.this.C.post(new Runnable() { // from class: com.anythink.expressad.advanced.c.a.6.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                        a.this.a(anonymousClass6.f6811a, anonymousClass6.f6812b);
                    }
                });
            }
        }
    }

    private void f(com.anythink.expressad.foundation.d.c cVar) {
        com.anythink.core.common.k.b.a.a().a(new AnonymousClass7(cVar));
    }

    public final com.anythink.expressad.foundation.d.c c() {
        return this.f6785i;
    }

    private void a(long j10) {
        this.C.postDelayed(this.D, j10);
    }

    private void c(String str, int i10) {
        b(str, i10);
    }

    public final String a() {
        return this.B;
    }

    public final void a(com.anythink.expressad.advanced.b.a aVar) {
        this.f6782e = aVar;
    }

    /* renamed from: com.anythink.expressad.advanced.c.a$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements i.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.c f6808a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6809b = 2;

        public AnonymousClass5(com.anythink.expressad.foundation.d.c cVar) {
            this.f6808a = cVar;
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str) {
            l.C(str, "endcard 下载成功： ", a.f6773a);
            if (a.this.C != null) {
                Message obtain = Message.obtain();
                obtain.what = 4;
                obtain.obj = this.f6808a;
                obtain.arg1 = this.f6809b;
                a.this.C.sendMessage(obtain);
            }
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str, String str2) {
            l.C(str2, "endcard 下载失败： ", a.f6773a);
            if (a.this.f6783g != null) {
                a.this.f6783g.setEndCardReady(false);
            }
            Message obtain = Message.obtain();
            obtain.what = 2;
            obtain.obj = str;
            a.this.C.sendMessage(obtain);
        }
    }

    private void a(com.anythink.expressad.foundation.d.c cVar) {
        this.f6785i = cVar;
        if (c.a(this.f6783g, cVar)) {
            a(cVar, 2);
            return;
        }
        ATNativeAdvancedView aTNativeAdvancedView = this.f6783g;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.clearResState();
        }
        if (!TextUtils.isEmpty(cVar.c())) {
            o.a(f6773a, "开始下载zip： " + cVar.c());
            this.f6794x = new AnonymousClass8(cVar);
            i.a().b(cVar.c(), (i.a) this.f6794x);
        }
        if (!TextUtils.isEmpty(cVar.d())) {
            o.a(f6773a, "开始下载HTML： " + cVar.d());
            com.anythink.core.common.k.b.a.a().a(new AnonymousClass7(cVar));
        }
        if (!TextUtils.isEmpty(cVar.S())) {
            o.a(f6773a, "开始下载Video： " + cVar.S());
            this.f6793w = new AnonymousClass2(cVar);
            ArrayList arrayList = new ArrayList();
            arrayList.add(cVar);
            e.a().a(this.f6779b, arrayList, com.anythink.expressad.foundation.g.a.aX, this.f6793w);
            if (!e.a().a(com.anythink.expressad.foundation.g.a.aX, this.f6779b, cVar.A())) {
                o.a(f6773a, " load Video");
                e.a().d(this.f6779b);
            } else {
                o.a(f6773a, " load Video isReady true");
                this.f6783g.setVideoReady(true);
                a(cVar, 2);
            }
        }
        if (!TextUtils.isEmpty(cVar.be())) {
            o.a(f6773a, "开始下载image： " + cVar.be());
            com.anythink.expressad.foundation.g.d.b.a(n.a().g()).a(cVar.be(), new AnonymousClass6(cVar));
        }
        if (!TextUtils.isEmpty(cVar.I())) {
            o.a(f6773a, "开始下载EndCard： " + cVar.I());
            this.y = new AnonymousClass5(cVar);
            i.a().b(cVar.I(), (i.a) this.y);
        }
        if (TextUtils.isEmpty(cVar.y())) {
            return;
        }
        o.a(f6773a, "开始下载gitUrl： " + cVar.y());
        com.anythink.expressad.foundation.g.d.b.a(n.a().g()).a(cVar.y(), new AnonymousClass4(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, int i10) {
        if (this.f6792v) {
            return;
        }
        i();
        l.B(str, "real failed: ", f6773a);
        this.f6792v = true;
        com.anythink.expressad.advanced.b.a aVar = this.f6782e;
        if (aVar != null) {
            aVar.a(str, i10);
        }
    }

    private void b(com.anythink.expressad.foundation.d.c cVar) {
        ATNativeAdvancedView aTNativeAdvancedView = this.f6783g;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.clearResState();
        }
        if (!TextUtils.isEmpty(cVar.c())) {
            o.a(f6773a, "开始下载zip： " + cVar.c());
            this.f6794x = new AnonymousClass8(cVar);
            i.a().b(cVar.c(), (i.a) this.f6794x);
        }
        if (!TextUtils.isEmpty(cVar.d())) {
            o.a(f6773a, "开始下载HTML： " + cVar.d());
            com.anythink.core.common.k.b.a.a().a(new AnonymousClass7(cVar));
        }
        if (!TextUtils.isEmpty(cVar.S())) {
            o.a(f6773a, "开始下载Video： " + cVar.S());
            this.f6793w = new AnonymousClass2(cVar);
            ArrayList arrayList = new ArrayList();
            arrayList.add(cVar);
            e.a().a(this.f6779b, arrayList, com.anythink.expressad.foundation.g.a.aX, this.f6793w);
            if (!e.a().a(com.anythink.expressad.foundation.g.a.aX, this.f6779b, cVar.A())) {
                o.a(f6773a, " load Video");
                e.a().d(this.f6779b);
            } else {
                o.a(f6773a, " load Video isReady true");
                this.f6783g.setVideoReady(true);
                a(cVar, 2);
            }
        }
        if (!TextUtils.isEmpty(cVar.be())) {
            o.a(f6773a, "开始下载image： " + cVar.be());
            com.anythink.expressad.foundation.g.d.b.a(n.a().g()).a(cVar.be(), new AnonymousClass6(cVar));
        }
        if (!TextUtils.isEmpty(cVar.I())) {
            o.a(f6773a, "开始下载EndCard： " + cVar.I());
            this.y = new AnonymousClass5(cVar);
            i.a().b(cVar.I(), (i.a) this.y);
        }
        if (TextUtils.isEmpty(cVar.y())) {
            return;
        }
        o.a(f6773a, "开始下载gitUrl： " + cVar.y());
        com.anythink.expressad.foundation.g.d.b.a(n.a().g()).a(cVar.y(), new AnonymousClass4(cVar));
    }

    private static void j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.anythink.expressad.foundation.d.c cVar, int i10) {
        if (!c.a(this.f6783g, cVar) || this.f6792v) {
            return;
        }
        i();
        this.f6792v = true;
        com.anythink.expressad.advanced.b.a aVar = this.f6782e;
        if (aVar != null) {
            aVar.a(cVar, i10);
        }
    }

    private void a(String str, int i10) {
        b(str, i10);
    }

    private void a(String str, com.anythink.expressad.foundation.d.c cVar, int i10) {
        ATNativeAdvancedView aTNativeAdvancedView = this.f6783g;
        if (aTNativeAdvancedView == null || aTNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = new NativeAdvancedJSBridgeImpl(this.f6783g.getContext(), this.f6780c, this.f6779b);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        nativeAdvancedJSBridgeImpl.setCampaignList(arrayList);
        nativeAdvancedJSBridgeImpl.setAllowSkip(this.o);
        nativeAdvancedJSBridgeImpl.setCountdownS(this.f6786p);
        this.f6783g.setAdvancedNativeJSBridgeImpl(nativeAdvancedJSBridgeImpl);
        System.currentTimeMillis();
        ATNativeAdvancedWebview advancedNativeWebview = this.f6783g.getAdvancedNativeWebview();
        if (advancedNativeWebview == null) {
            b("webview is null", i10);
            return;
        }
        if (advancedNativeWebview.isDestroyed()) {
            b("webview is destroyed", i10);
            return;
        }
        advancedNativeWebview.setWebViewListener(new AnonymousClass9(cVar, i10));
        if (!advancedNativeWebview.isDestroyed()) {
            l.B(str, "=======开始渲染: ", f6773a);
            Handler handler = this.C;
            if (handler != null) {
                handler.post(new AnonymousClass10(advancedNativeWebview, str));
                return;
            }
            return;
        }
        b("webview has destory", i10);
    }

    private void b(com.anythink.expressad.foundation.d.c cVar, int i10) {
        if (this.f6783g.isH5Ready()) {
            a(cVar, i10);
        }
    }

    private List<com.anythink.expressad.foundation.d.c> b(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar == null || dVar.J == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.anythink.expressad.foundation.d.c cVar = dVar.J.get(0);
        cVar.l(this.f6779b);
        this.f6795z = dVar.c();
        if (cVar.O() == 99) {
            return arrayList;
        }
        if (TextUtils.isEmpty(cVar.c()) && TextUtils.isEmpty(cVar.d())) {
            return arrayList;
        }
        if (t.a(cVar)) {
            cVar.i(t.a(this.f, cVar.ba()) ? 1 : 2);
        }
        if (cVar.ae() != 1 && t.a(this.f, cVar.ba())) {
            o.d(f6773a, "onload： " + cVar.bb() + " has been installed.");
            if (!t.a(cVar)) {
                return arrayList;
            }
            arrayList.add(cVar);
            return arrayList;
        }
        arrayList.add(cVar);
        return arrayList;
    }

    public static /* synthetic */ void b(a aVar, com.anythink.expressad.foundation.d.c cVar, int i10) {
        if (aVar.f6783g.isH5Ready()) {
            aVar.a(cVar, i10);
        }
    }

    public final String a(String str) {
        int k10;
        if (this.f6785i == null) {
            return "";
        }
        try {
            com.anythink.expressad.videocommon.b.c a10 = e.a().a(this.f6779b, this.f6785i.aZ() + this.f6785i.S() + this.f6785i.B());
            if (a10 == null || (k10 = a10.k()) != 5) {
                return str;
            }
            String e10 = a10.e();
            if (!new File(e10).exists()) {
                return str;
            }
            o.d(f6773a, "本地已下载完 拿本地播放地址：" + e10 + " state：" + k10);
            return e10;
        } catch (Exception e11) {
            e11.printStackTrace();
            return str;
        }
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        ArrayList arrayList;
        if (dVar == null || dVar.J == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            com.anythink.expressad.foundation.d.c cVar = dVar.J.get(0);
            cVar.l(this.f6779b);
            this.f6795z = dVar.c();
            if (cVar.O() != 99 && (!TextUtils.isEmpty(cVar.c()) || !TextUtils.isEmpty(cVar.d()))) {
                if (t.a(cVar)) {
                    cVar.i(t.a(this.f, cVar.ba()) ? 1 : 2);
                }
                if (cVar.ae() != 1 && t.a(this.f, cVar.ba())) {
                    o.d(f6773a, "onload： " + cVar.bb() + " has been installed.");
                    if (t.a(cVar)) {
                        arrayList.add(cVar);
                    }
                } else {
                    arrayList.add(cVar);
                }
            }
        }
        if (arrayList != null && arrayList.size() > 0) {
            try {
                int i10 = this.A + 1;
                this.A = i10;
                com.anythink.expressad.d.c cVar2 = this.f6784h;
                if (cVar2 == null || i10 > cVar2.t()) {
                    o.b(f6773a, "onload 重置offset为0");
                    this.A = 0;
                }
                o.b(f6773a, "onload 算出 下次的offset是:" + this.A);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            o.b(f6773a, "onload load成功 size:" + arrayList.size());
            com.anythink.expressad.foundation.d.c cVar3 = (com.anythink.expressad.foundation.d.c) arrayList.get(0);
            if (TextUtils.isEmpty(cVar3.c()) && (TextUtils.isEmpty(cVar3.d()) || !cVar3.d().contains("<MBTPLMARK>"))) {
                cVar3.a(false);
                cVar3.b(true);
            } else {
                cVar3.a(true);
                cVar3.b(false);
            }
            this.f6785i = cVar3;
            if (c.a(this.f6783g, cVar3)) {
                a(cVar3, 2);
                return;
            }
            ATNativeAdvancedView aTNativeAdvancedView = this.f6783g;
            if (aTNativeAdvancedView != null) {
                aTNativeAdvancedView.clearResState();
            }
            if (!TextUtils.isEmpty(cVar3.c())) {
                o.a(f6773a, "开始下载zip： " + cVar3.c());
                this.f6794x = new AnonymousClass8(cVar3);
                i.a().b(cVar3.c(), (i.a) this.f6794x);
            }
            if (!TextUtils.isEmpty(cVar3.d())) {
                o.a(f6773a, "开始下载HTML： " + cVar3.d());
                com.anythink.core.common.k.b.a.a().a(new AnonymousClass7(cVar3));
            }
            if (!TextUtils.isEmpty(cVar3.S())) {
                o.a(f6773a, "开始下载Video： " + cVar3.S());
                this.f6793w = new AnonymousClass2(cVar3);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(cVar3);
                e.a().a(this.f6779b, arrayList2, com.anythink.expressad.foundation.g.a.aX, this.f6793w);
                if (!e.a().a(com.anythink.expressad.foundation.g.a.aX, this.f6779b, cVar3.A())) {
                    o.a(f6773a, " load Video");
                    e.a().d(this.f6779b);
                } else {
                    o.a(f6773a, " load Video isReady true");
                    this.f6783g.setVideoReady(true);
                    a(cVar3, 2);
                }
            }
            if (!TextUtils.isEmpty(cVar3.be())) {
                o.a(f6773a, "开始下载image： " + cVar3.be());
                com.anythink.expressad.foundation.g.d.b.a(n.a().g()).a(cVar3.be(), new AnonymousClass6(cVar3));
            }
            if (!TextUtils.isEmpty(cVar3.I())) {
                o.a(f6773a, "开始下载EndCard： " + cVar3.I());
                this.y = new AnonymousClass5(cVar3);
                i.a().b(cVar3.I(), (i.a) this.y);
            }
            if (TextUtils.isEmpty(cVar3.y())) {
                return;
            }
            o.a(f6773a, "开始下载gitUrl： " + cVar3.y());
            com.anythink.expressad.foundation.g.d.b.a(n.a().g()).a(cVar3.y(), new AnonymousClass4(cVar3));
            return;
        }
        o.b(f6773a, "onload load失败 返回的compaign没有可以用的");
        b("invalid  campaign", 2);
    }

    public static /* synthetic */ void a(a aVar, String str, com.anythink.expressad.foundation.d.c cVar, int i10) {
        ATNativeAdvancedView aTNativeAdvancedView = aVar.f6783g;
        if (aTNativeAdvancedView == null || aTNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = new NativeAdvancedJSBridgeImpl(aVar.f6783g.getContext(), aVar.f6780c, aVar.f6779b);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        nativeAdvancedJSBridgeImpl.setCampaignList(arrayList);
        nativeAdvancedJSBridgeImpl.setAllowSkip(aVar.o);
        nativeAdvancedJSBridgeImpl.setCountdownS(aVar.f6786p);
        aVar.f6783g.setAdvancedNativeJSBridgeImpl(nativeAdvancedJSBridgeImpl);
        System.currentTimeMillis();
        ATNativeAdvancedWebview advancedNativeWebview = aVar.f6783g.getAdvancedNativeWebview();
        if (advancedNativeWebview == null) {
            aVar.b("webview is null", i10);
            return;
        }
        if (advancedNativeWebview.isDestroyed()) {
            aVar.b("webview is destroyed", i10);
            return;
        }
        advancedNativeWebview.setWebViewListener(new AnonymousClass9(cVar, i10));
        if (!advancedNativeWebview.isDestroyed()) {
            l.B(str, "=======开始渲染: ", f6773a);
            Handler handler = aVar.C;
            if (handler != null) {
                handler.post(new AnonymousClass10(advancedNativeWebview, str));
                return;
            }
            return;
        }
        aVar.b("webview has destory", i10);
    }
}
