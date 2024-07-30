package com.anythink.expressad.mbbanner.a.d;

import a3.k;
import a3.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.core.common.b.n;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.m;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.y;
import com.anythink.expressad.mbbanner.a.c.e;
import com.anythink.expressad.mbbanner.view.ATBannerWebView;
import com.anythink.expressad.out.TemplateBannerView;
import com.anythink.expressad.out.i;
import com.anythink.expressad.out.p;
import com.anythink.expressad.videocommon.b.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private static String f10364c = "BannerShowManager";
    private float A;

    /* renamed from: a, reason: collision with root package name */
    com.anythink.expressad.a.a f10365a;

    /* renamed from: b, reason: collision with root package name */
    i f10366b;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.c.c f10367d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10368e;
    private com.anythink.expressad.foundation.d.c f;

    /* renamed from: g, reason: collision with root package name */
    private TemplateBannerView f10369g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f10370h;

    /* renamed from: i, reason: collision with root package name */
    private ATBannerWebView f10371i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f10372j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f10373k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f10374l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f10375m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f10376n;
    private boolean o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f10377p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f10378q;

    /* renamed from: r, reason: collision with root package name */
    private String f10379r;

    /* renamed from: s, reason: collision with root package name */
    private String f10380s;

    /* renamed from: t, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.c> f10381t;

    /* renamed from: u, reason: collision with root package name */
    private int f10382u;

    /* renamed from: w, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.a.c f10384w;

    /* renamed from: z, reason: collision with root package name */
    private float f10386z;

    /* renamed from: v, reason: collision with root package name */
    private long f10383v = 15000;

    /* renamed from: x, reason: collision with root package name */
    private Handler f10385x = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.mbbanner.a.d.c.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i10 = message.what;
        }
    };
    private com.anythink.expressad.foundation.g.g.a y = new com.anythink.expressad.foundation.g.g.a() { // from class: com.anythink.expressad.mbbanner.a.d.c.4
        @Override // com.anythink.expressad.foundation.g.g.a
        public final void a() {
            c.this.a(com.anythink.expressad.mbbanner.a.a.f10276n);
        }

        @Override // com.anythink.expressad.foundation.g.g.a
        public final void b() {
        }

        @Override // com.anythink.expressad.foundation.g.g.a
        public final void c() {
        }
    };
    private View.OnClickListener B = new View.OnClickListener() { // from class: com.anythink.expressad.mbbanner.a.d.c.5
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (c.this.f10378q) {
                c.b(c.this);
            }
        }
    };
    private com.anythink.expressad.mbbanner.a.c.a C = new com.anythink.expressad.mbbanner.a.c.a() { // from class: com.anythink.expressad.mbbanner.a.d.c.6
        @Override // com.anythink.expressad.mbbanner.a.c.a
        public final void a(int i10) {
            if (i10 == 2) {
                c.c(c.this);
            } else {
                c.this.l();
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.a
        public final void b() {
            c.b(c.this);
        }

        @Override // com.anythink.expressad.mbbanner.a.c.a
        public final void b(int i10) {
            if (i10 == 1) {
                c.this.h();
                c.b();
            } else {
                c.this.e();
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.a
        public final void a() {
            c.b(c.this);
        }

        @Override // com.anythink.expressad.mbbanner.a.c.a
        public final void a(com.anythink.expressad.foundation.d.c cVar) {
            c.this.a(cVar, false, "");
        }

        @Override // com.anythink.expressad.mbbanner.a.c.a
        public final void a(boolean z10) {
            if (c.this.f10367d != null) {
                c.this.f10377p = z10;
                if (z10) {
                    c.this.f10367d.b();
                } else {
                    c.this.f10367d.c();
                }
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.a
        public final void a(boolean z10, String str) {
            try {
                if (c.this.f10367d != null) {
                    if (TextUtils.isEmpty(str)) {
                        c.this.f10367d.a(c.this.f);
                        c.this.f10367d.a();
                    } else {
                        com.anythink.expressad.foundation.d.c b10 = com.anythink.expressad.foundation.d.c.b(com.anythink.expressad.foundation.d.c.a(c.this.f));
                        b10.p(str);
                        c.this.a(b10, z10, str);
                    }
                }
            } catch (Exception e10) {
                o.d(c.f10364c, e10.getMessage());
            }
        }
    };
    private com.anythink.expressad.atsignalcommon.a.b D = new com.anythink.expressad.atsignalcommon.a.b() { // from class: com.anythink.expressad.mbbanner.a.d.c.2
        @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
        public final void onPageFinished(WebView webView, String str) {
            c.l(c.this);
            o.d("WindVaneWebView", "BANNER onPageFinished");
            com.anythink.expressad.mbbanner.a.a.a.a(webView);
            c.n(c.this);
            if (c.this.f != null && !c.this.f.s()) {
                c.this.h();
                c.b();
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
        public final void onReceivedError(WebView webView, int i10, String str, String str2) {
            c.this.a(str);
            c.b();
        }
    };

    public c(TemplateBannerView templateBannerView, com.anythink.expressad.mbbanner.a.c.c cVar, String str, String str2, boolean z10, com.anythink.expressad.d.c cVar2) {
        this.f10368e = z10;
        this.f10369g = templateBannerView;
        this.f10379r = str2;
        this.f10380s = str;
        this.f10367d = new e(cVar, cVar2);
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ boolean l(c cVar) {
        cVar.f10375m = true;
        return true;
    }

    private void m() {
        ImageView imageView;
        if (this.f10368e && (imageView = this.f10372j) != null && imageView.getVisibility() == 0) {
            this.f10372j.setVisibility(8);
            this.f10372j.setOnClickListener(null);
            if (this.f10369g == null || this.f10372j.getParent() == null) {
                return;
            }
            this.f10369g.removeView(this.f10372j);
        }
    }

    private static void n() {
    }

    private boolean d() {
        String a10 = a(this.f);
        if (TextUtils.isEmpty(a10)) {
            return false;
        }
        if (this.f10369g != null) {
            if (this.f10371i == null) {
                ATBannerWebView aTBannerWebView = new ATBannerWebView(n.a().g());
                this.f10371i = aTBannerWebView;
                aTBannerWebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.f10371i.setWebViewClient(new com.anythink.expressad.mbbanner.view.a(this.f10379r, this.f10381t, this.C));
            }
            ImageView imageView = this.f10370h;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (this.f10371i.getVisibility() != 0) {
                this.f10371i.setVisibility(0);
            }
            if (this.f10371i.getParent() == null) {
                this.f10369g.addView(this.f10371i);
                d(this.f.H());
            }
            l();
            com.anythink.expressad.mbbanner.a.a.c cVar = new com.anythink.expressad.mbbanner.a.a.c(this.f10369g.getContext(), this.f10380s, this.f10379r);
            this.f10384w = cVar;
            cVar.a(this.f10381t);
            this.f10384w.a(this.C);
            this.f10384w.a(this.f10382u);
            this.f10371i.setWebViewListener(this.D);
            this.f10371i.setObject(this.f10384w);
            if (!a10.startsWith("file")) {
                this.f10371i.loadDataWithBaseURL(this.f.p(), a10, "text/html", com.anythink.expressad.foundation.g.a.bN, null);
                return true;
            }
            this.f10371i.loadUrl(a10);
            return true;
        }
        a(com.anythink.expressad.mbbanner.a.a.f10271i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void e() {
        if (this.f10369g != null) {
            ATBannerWebView aTBannerWebView = this.f10371i;
            if (aTBannerWebView != null && aTBannerWebView.getParent() != null) {
                this.f10369g.removeView(this.f10371i);
            }
            if (this.f10370h == null) {
                ImageView imageView = new ImageView(n.a().g());
                this.f10370h = imageView;
                imageView.setOnTouchListener(new View.OnTouchListener() { // from class: com.anythink.expressad.mbbanner.a.d.c.7
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        c.this.f10386z = motionEvent.getRawX();
                        c.this.A = motionEvent.getRawY();
                        o.d(c.f10364c, c.this.f10386z + "  " + c.this.A);
                        return false;
                    }
                });
                this.f10370h.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.mbbanner.a.d.c.8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        c.this.a(com.anythink.expressad.mbbanner.a.e.b.a(CommonJSBridgeImpUtils.buildClickJsonObject(c.this.f10386z, c.this.A), c.this.f), false, "");
                    }
                });
            }
            String be = this.f.be();
            if (!TextUtils.isEmpty(be)) {
                k.f().a(be, new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.mbbanner.a.d.c.9
                    @Override // com.anythink.expressad.foundation.g.d.c
                    public final void a(Bitmap bitmap, String str) {
                        if (c.this.f10370h != null) {
                            c.this.f10370h.setImageBitmap(bitmap);
                        }
                        c.l(c.this);
                        c.m(c.this);
                        c.this.l();
                        c.this.h();
                    }

                    @Override // com.anythink.expressad.foundation.g.d.c
                    public final void a(String str, String str2) {
                        c.this.a(com.anythink.expressad.mbbanner.a.a.f10272j);
                    }
                });
                return;
            } else {
                a(com.anythink.expressad.mbbanner.a.a.f10270h);
                return;
            }
        }
        a(com.anythink.expressad.mbbanner.a.a.f10271i);
    }

    private void f() {
        if (this.f10368e && this.f10372j == null) {
            ImageView imageView = new ImageView(n.a().g());
            this.f10372j = imageView;
            imageView.setBackgroundResource(com.anythink.expressad.foundation.h.i.a(n.a().g(), "anythink_banner_close", com.anythink.expressad.foundation.h.i.f10125c));
            this.f10372j.setVisibility(8);
            this.f10372j.setContentDescription("closeButton");
        }
    }

    private boolean g() {
        TemplateBannerView templateBannerView = this.f10369g;
        return (templateBannerView == null || y.a(templateBannerView) || this.f10377p) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        TemplateBannerView templateBannerView;
        if (this.f10375m && !this.f10376n && this.f10367d != null) {
            this.f10376n = true;
            this.f10385x.removeCallbacks(this.y);
            com.anythink.expressad.foundation.d.c cVar = this.f;
            if (cVar != null && !cVar.am()) {
                this.f.an();
                this.f10367d.a(this.f10381t);
            }
        }
        if (this.f10375m && this.f10373k && this.f10374l && this.f10376n && this.f != null && !i()) {
            TemplateBannerView templateBannerView2 = this.f10369g;
            boolean z10 = (templateBannerView2 == null || y.a(templateBannerView2) || this.f10377p) ? false : true;
            if (!z10 && (templateBannerView = this.f10369g) != null) {
                templateBannerView.postDelayed(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.d.c.10
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.h();
                    }
                }, 1000L);
            }
            if (this.o && z10) {
                o.d(f10364c, "onBannerWebViewShow && transInfoToMraid");
                int[] iArr = new int[2];
                this.f10369g.getLocationInWindow(iArr);
                com.anythink.expressad.mbbanner.a.a.a.a(this.f10371i, iArr[0], iArr[1]);
                com.anythink.expressad.mbbanner.a.a.a.a(this.f10371i, iArr[0], iArr[1], this.f10369g.getWidth(), this.f10369g.getHeight());
                this.o = false;
                if (!TextUtils.isEmpty(this.f.be())) {
                    k.f().c(this.f.be());
                }
            }
            o.d(f10364c, "showSuccessed:" + this.f.aZ());
            if (z10) {
                ImageView imageView = this.f10370h;
                if (imageView != null && imageView.getVisibility() == 0) {
                    com.anythink.expressad.foundation.d.c cVar2 = this.f;
                    if (cVar2 != null) {
                        if (cVar2 != null) {
                            c(cVar2, n.a().g(), this.f10379r);
                            b(cVar2, n.a().g(), this.f10379r);
                            a(cVar2, n.a().g(), this.f10379r);
                        }
                        this.f.c(true);
                        f.a(this.f10379r, this.f, f.f9817e);
                    }
                } else {
                    List<com.anythink.expressad.foundation.d.c> list = this.f10381t;
                    if (list != null && list.size() > 0) {
                        boolean z11 = false;
                        int i10 = 0;
                        for (int i11 = 0; i11 < this.f10381t.size(); i11++) {
                            if (!this.f10381t.get(i11).s() && (i11 == 0 || !this.f10381t.get(i11).V())) {
                                c(this.f10381t.get(i11), n.a().g(), this.f10379r);
                                this.f10381t.get(i11).c(true);
                                f.a(this.f10379r, this.f10381t.get(i11), f.f9817e);
                                i10 = i11;
                                z11 = true;
                            }
                        }
                        if (z11) {
                            b(this.f10381t.get(i10), n.a().g(), this.f10379r);
                            a(this.f10381t.get(i10), n.a().g(), this.f10379r);
                        }
                    }
                }
                this.f10378q = true;
                com.anythink.expressad.mbbanner.a.c.c cVar3 = this.f10367d;
                if (cVar3 != null) {
                    cVar3.a(this.f, false);
                }
                this.f10385x.sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            this.f.c(false);
        }
    }

    private synchronized boolean i() {
        boolean V;
        V = this.f.V();
        if (!V) {
            this.f.c(true);
        }
        return V;
    }

    private void j() {
        com.anythink.expressad.mbbanner.a.c.c cVar = this.f10367d;
        if (cVar != null) {
            cVar.d();
        }
    }

    private void k() {
        if (this.f10370h != null) {
            ATBannerWebView aTBannerWebView = this.f10371i;
            if (aTBannerWebView != null) {
                aTBannerWebView.setVisibility(8);
            }
            if (this.f10370h.getVisibility() != 0) {
                this.f10370h.setVisibility(0);
            }
            if (this.f10369g != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                this.f10370h.setScaleType(ImageView.ScaleType.FIT_XY);
                if (this.f10370h.getParent() == null) {
                    this.f10369g.addView(this.f10370h, layoutParams);
                }
                d(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        ImageView imageView;
        if (!this.f10368e || (imageView = this.f10372j) == null) {
            return;
        }
        if (imageView.getVisibility() != 0) {
            this.f10372j.setVisibility(0);
            this.f10372j.setOnClickListener(this.B);
        }
        if (this.f10372j.getParent() != null || this.f10369g == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(l.f(12.0f), l.f(12.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        this.f10369g.addView(this.f10372j, layoutParams);
    }

    public static /* synthetic */ boolean n(c cVar) {
        cVar.o = true;
        return true;
    }

    public final void c(boolean z10) {
        this.f10374l = z10;
        h();
    }

    public final void b(boolean z10) {
        this.f10373k = z10;
        h();
    }

    private static void c(com.anythink.expressad.foundation.d.c cVar, Context context, String str) {
        if (!TextUtils.isEmpty(cVar.ag())) {
            com.anythink.expressad.a.a.a(context, cVar, str, cVar.ag(), false, true, com.anythink.expressad.a.a.a.f6605i);
        }
        if (TextUtils.isEmpty(str) || cVar.L() == null || cVar.L().o() == null) {
            return;
        }
        com.anythink.expressad.a.a.a(context, cVar, str, cVar.L().o(), false);
    }

    private void b(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar != null) {
            c(cVar, n.a().g(), this.f10379r);
            b(cVar, n.a().g(), this.f10379r);
            a(cVar, n.a().g(), this.f10379r);
        }
    }

    public final void a(i iVar) {
        this.f10366b = iVar;
    }

    public static /* synthetic */ void m(c cVar) {
        if (cVar.f10370h != null) {
            ATBannerWebView aTBannerWebView = cVar.f10371i;
            if (aTBannerWebView != null) {
                aTBannerWebView.setVisibility(8);
            }
            if (cVar.f10370h.getVisibility() != 0) {
                cVar.f10370h.setVisibility(0);
            }
            if (cVar.f10369g != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                cVar.f10370h.setScaleType(ImageView.ScaleType.FIT_XY);
                if (cVar.f10370h.getParent() == null) {
                    cVar.f10369g.addView(cVar.f10370h, layoutParams);
                }
                cVar.d(true);
            }
        }
    }

    public final void a(boolean z10, int i10) {
        this.f10382u = i10;
        if (i10 == 0) {
            com.anythink.expressad.d.b.a();
            com.anythink.expressad.d.c c10 = com.anythink.expressad.d.b.c(com.anythink.expressad.foundation.b.a.b().e(), this.f10379r);
            if (c10 == null) {
                return;
            } else {
                z10 = c10.d() == 1;
            }
        }
        this.f10368e = z10;
    }

    private static void b(com.anythink.expressad.foundation.d.c cVar, Context context, String str) {
        if (cVar != null) {
            try {
                if (TextUtils.isEmpty(cVar.ai())) {
                    return;
                }
                com.anythink.expressad.a.a.a(context, cVar, str, cVar.ai(), false, true, com.anythink.expressad.a.a.a.f6606j);
            } catch (Throwable th) {
                o.d(f10364c, th.getMessage());
            }
        }
    }

    public static /* synthetic */ void c(c cVar) {
        ImageView imageView;
        if (cVar.f10368e && (imageView = cVar.f10372j) != null && imageView.getVisibility() == 0) {
            cVar.f10372j.setVisibility(8);
            cVar.f10372j.setOnClickListener(null);
            if (cVar.f10369g == null || cVar.f10372j.getParent() == null) {
                return;
            }
            cVar.f10369g.removeView(cVar.f10372j);
        }
    }

    public final void a(boolean z10) {
        this.f10368e = z10;
    }

    private static String a(com.anythink.expressad.foundation.d.c cVar) {
        String concat;
        File file;
        if (cVar == null) {
            return "";
        }
        String b10 = j.a().b(cVar.p());
        if (TextUtils.isEmpty(b10)) {
            b10 = cVar.q();
            if (cVar.ay()) {
                try {
                    file = new File(b10);
                } catch (Exception unused) {
                    File file2 = new File(b10);
                    if (file2.exists() && file2.isFile() && file2.canRead()) {
                        concat = "file:////".concat(String.valueOf(b10));
                    }
                }
                if (!file.exists()) {
                    return "";
                }
                concat = m.a(file);
                return concat;
            }
            File file3 = new File(b10);
            if (file3.exists() && file3.isFile() && file3.canRead()) {
                return "file:////".concat(String.valueOf(b10));
            }
        }
        return b10;
    }

    private com.anythink.expressad.foundation.d.c b(d dVar) {
        if (dVar != null) {
            ArrayList<com.anythink.expressad.foundation.d.c> arrayList = dVar.J;
            this.f10381t = arrayList;
            if (arrayList != null && arrayList.size() > 0) {
                return this.f10381t.get(0);
            }
        }
        return null;
    }

    public static /* synthetic */ void b(c cVar) {
        com.anythink.expressad.mbbanner.a.c.c cVar2 = cVar.f10367d;
        if (cVar2 != null) {
            cVar2.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f == null || i()) {
            return;
        }
        this.f10385x.removeCallbacks(this.y);
        com.anythink.expressad.mbbanner.a.c.c cVar = this.f10367d;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    private void d(boolean z10) {
        if (this.f10369g != null) {
            View b10 = com.anythink.expressad.foundation.f.b.a().b(this.f10379r);
            if (com.anythink.expressad.foundation.f.b.a().b() && z10 && b10 != null) {
                ViewGroup viewGroup = (ViewGroup) b10.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(b10);
                }
                b10.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) b10.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(com.anythink.expressad.foundation.f.b.f9756a, com.anythink.expressad.foundation.f.b.f9757b);
                }
                layoutParams.addRule(12);
                b10.setLayoutParams(layoutParams);
                this.f10369g.addView(b10);
            }
            com.anythink.expressad.foundation.f.b.a().a(this.f10379r, new com.anythink.expressad.foundation.f.a() { // from class: com.anythink.expressad.mbbanner.a.d.c.3
                @Override // com.anythink.expressad.foundation.f.a
                public final void a() {
                    String str;
                    c.this.f10369g.onPause();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (n.a().g() != null) {
                            jSONObject.put("status", 1);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        o.b(c.f10364c, th.getMessage(), th);
                        str = "";
                    }
                    String encodeToString = Base64.encodeToString(str.getBytes(), 2);
                    com.anythink.expressad.atsignalcommon.windvane.j.a();
                    com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) c.this.f10371i, AbsFeedBackForH5.f7027a, encodeToString);
                }

                @Override // com.anythink.expressad.foundation.f.a
                public final void b() {
                    String str;
                    c.this.f10369g.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (n.a().g() != null) {
                            jSONObject.put("status", 2);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        o.b(c.f10364c, th.getMessage(), th);
                        str = "";
                    }
                    String encodeToString = Base64.encodeToString(str.getBytes(), 2);
                    com.anythink.expressad.atsignalcommon.windvane.j.a();
                    com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) c.this.f10371i, AbsFeedBackForH5.f7027a, encodeToString);
                }

                @Override // com.anythink.expressad.foundation.f.a
                public final void c() {
                    String str;
                    c.this.f10369g.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (n.a().g() != null) {
                            jSONObject.put("status", 2);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        o.b(c.f10364c, th.getMessage(), th);
                        str = "";
                    }
                    String encodeToString = Base64.encodeToString(str.getBytes(), 2);
                    com.anythink.expressad.atsignalcommon.windvane.j.a();
                    com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) c.this.f10371i, AbsFeedBackForH5.f7027a, encodeToString);
                }
            });
            this.f.l(this.f10379r);
            com.anythink.expressad.foundation.f.b.a().a(this.f10379r, this.f);
        }
    }

    public final void a() {
        if (this.f10367d != null) {
            this.f10367d = null;
        }
        ATBannerWebView aTBannerWebView = this.f10371i;
        if (aTBannerWebView != null) {
            aTBannerWebView.setWebViewListener(null);
        }
        if (this.D != null) {
            this.D = null;
        }
        ImageView imageView = this.f10372j;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.f10370h;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        TemplateBannerView templateBannerView = this.f10369g;
        if (templateBannerView != null) {
            templateBannerView.removeAllViews();
        }
        ATBannerWebView aTBannerWebView2 = this.f10371i;
        if (aTBannerWebView2 != null) {
            aTBannerWebView2.release();
        }
        com.anythink.expressad.mbbanner.a.a.c cVar = this.f10384w;
        if (cVar != null) {
            cVar.a();
        }
        if (this.C != null) {
            this.C = null;
        }
        com.anythink.expressad.foundation.f.b.a().c(this.f10379r);
    }

    private static void a(com.anythink.expressad.foundation.d.c cVar, Context context, String str) {
        if (cVar != null) {
            try {
                List<String> e10 = cVar.e();
                if (e10 == null || e10.size() <= 0) {
                    return;
                }
                Iterator<String> it = e10.iterator();
                while (it.hasNext()) {
                    com.anythink.expressad.a.a.a(context, cVar, str, it.next(), true);
                }
            } catch (Throwable th) {
                o.d(f10364c, th.getMessage());
            }
        }
    }

    public final void a(com.anythink.expressad.foundation.d.c cVar, boolean z10, String str) {
        if (this.f10378q) {
            if (this.f10365a == null) {
                this.f10365a = new com.anythink.expressad.a.a(n.a().g(), this.f10379r);
            }
            this.f10365a.a(new p.e() { // from class: com.anythink.expressad.mbbanner.a.d.c.11
                @Override // com.anythink.expressad.out.p.c
                public final void a(int i10) {
                }

                @Override // com.anythink.expressad.out.p.c
                public final void b(com.anythink.expressad.out.j jVar) {
                }

                @Override // com.anythink.expressad.out.p.c
                public final void a(com.anythink.expressad.foundation.d.c cVar2, String str2) {
                }

                @Override // com.anythink.expressad.out.p.c
                public final void b(com.anythink.expressad.out.j jVar, String str2) {
                }

                @Override // com.anythink.expressad.out.p.c
                public final void a(com.anythink.expressad.out.j jVar) {
                }

                @Override // com.anythink.expressad.out.p.e
                public final void b() {
                    if (c.this.f10367d != null) {
                        c.this.f10367d.a();
                    }
                }

                @Override // com.anythink.expressad.out.p.c
                public final void a(com.anythink.expressad.out.j jVar, String str2) {
                }

                @Override // com.anythink.expressad.out.p.c
                public final boolean a() {
                    return false;
                }

                @Override // com.anythink.expressad.out.p.c
                public final void c(com.anythink.expressad.out.j jVar) {
                }

                @Override // com.anythink.expressad.out.p.c
                public final void d(com.anythink.expressad.out.j jVar) {
                }
            });
            cVar.l(this.f10379r);
            if (!this.f.W()) {
                this.f.X();
            }
            com.anythink.expressad.mbbanner.a.c.c cVar2 = this.f10367d;
            if (cVar2 != null) {
                cVar2.a(cVar);
            }
            if (z10) {
                TextUtils.isEmpty(str);
            }
        }
    }

    public final void a(int i10, int i11, int i12, int i13) {
        if (i10 == i12 && i11 == i13) {
            return;
        }
        ATBannerWebView aTBannerWebView = this.f10371i;
        o.d("BannerCallJS", "fireOnBannerViewSizeChange");
        try {
            CallMraidJS.getInstance().fireSizeChangeEvent(aTBannerWebView, i10, i11);
        } catch (Throwable th) {
            o.b("BannerCallJS", "fireOnBannerViewSizeChange", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.anythink.expressad.foundation.d.d r9) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.mbbanner.a.d.c.a(com.anythink.expressad.foundation.d.d):void");
    }
}
