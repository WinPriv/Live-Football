package com.anythink.expressad.splash.c;

import a3.l;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.b.n;
import com.anythink.core.common.k.a.f;
import com.anythink.core.common.k.u;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.splash.js.SplashJSBridgeImpl;
import com.anythink.expressad.splash.js.SplashJsUtils;
import com.anythink.expressad.splash.view.ATSplashView;
import com.anythink.expressad.splash.view.ATSplashWebview;
import com.anythink.expressad.widget.FeedBackButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.c f10977d;

    /* renamed from: e, reason: collision with root package name */
    private ATSplashView f10978e;
    private com.anythink.expressad.splash.d.d f;

    /* renamed from: g, reason: collision with root package name */
    private com.anythink.expressad.a.a f10979g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10980h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f10981i;

    /* renamed from: j, reason: collision with root package name */
    private View f10982j;

    /* renamed from: k, reason: collision with root package name */
    private String f10983k;

    /* renamed from: l, reason: collision with root package name */
    private String f10984l;

    /* renamed from: n, reason: collision with root package name */
    private String f10986n;
    private String o;

    /* renamed from: p, reason: collision with root package name */
    private String f10987p;

    /* renamed from: q, reason: collision with root package name */
    private String f10988q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f10989r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f10990s;

    /* renamed from: u, reason: collision with root package name */
    private Context f10992u;

    /* renamed from: c, reason: collision with root package name */
    private String f10976c = "SplashShowManager";

    /* renamed from: m, reason: collision with root package name */
    private int f10985m = 5;

    /* renamed from: t, reason: collision with root package name */
    private boolean f10991t = false;

    /* renamed from: v, reason: collision with root package name */
    private View.OnClickListener f10993v = new View.OnClickListener() { // from class: com.anythink.expressad.splash.c.d.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (d.this.f10980h) {
                d.b(d.this);
                d.a(d.this, -1);
            }
        }
    };

    /* renamed from: w, reason: collision with root package name */
    private f.b f10994w = new f.b();

    /* renamed from: a, reason: collision with root package name */
    public Handler f10974a = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.splash.c.d.2
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 == 2 && d.this.f10977d != null && d.this.f10977d.ay() && d.this.f10978e != null) {
                    d.this.f10978e.getSplashWebview();
                    return;
                }
                return;
            }
            if (d.this.f10991t) {
                return;
            }
            if (u.a(d.this.f10978e, d.this.f10994w)) {
                if (d.this.f10985m > 0) {
                    d.g(d.this);
                    d dVar = d.this;
                    d.a(dVar, dVar.f10985m);
                    d.this.f10974a.removeMessages(1);
                    sendEmptyMessageDelayed(1, 1000L);
                    return;
                }
                d.b(d.this);
                return;
            }
            d.this.f10974a.removeMessages(1);
            sendEmptyMessageDelayed(1, 1000L);
        }
    };

    /* renamed from: x, reason: collision with root package name */
    private com.anythink.expressad.splash.d.a f10995x = new com.anythink.expressad.splash.d.a() { // from class: com.anythink.expressad.splash.c.d.3
        @Override // com.anythink.expressad.splash.d.a
        public final void a(int i10) {
            if (d.this.f10978e != null) {
                d.this.f10978e.changeCloseBtnState(i10);
            }
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void b() {
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void c() {
            d.b(d.this);
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void b(int i10) {
            o.d(d.this.f10976c, "resetCountdown".concat(String.valueOf(i10)));
            d.this.f10985m = i10;
            d.this.f10974a.removeMessages(1);
            d.this.f10974a.sendEmptyMessageDelayed(1, 1000L);
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void a() {
            d.b(d.this);
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void a(com.anythink.expressad.foundation.d.c cVar) {
            d.this.a(cVar);
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void a(int i10, int i11) {
            if (i10 == 1) {
                d.this.f10974a.removeMessages(1);
            }
            if (i10 == 2) {
                d.this.f10985m = i11;
                d.this.f10974a.removeMessages(1);
                d.this.f10974a.sendEmptyMessageDelayed(1, 1000L);
            }
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void b(String str) {
            try {
                if (d.this.f != null) {
                    if (TextUtils.isEmpty(str)) {
                        d.this.f.a(d.this.f10977d);
                        return;
                    }
                    com.anythink.expressad.foundation.d.c b10 = com.anythink.expressad.foundation.d.c.b(com.anythink.expressad.foundation.d.c.a(d.this.f10977d));
                    b10.p(str);
                    d.this.a(b10);
                }
            } catch (Exception e10) {
                o.d(d.this.f10976c, e10.getMessage());
            }
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void a(String str) {
            d.a(d.this, str);
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void a(boolean z10) {
            if (z10) {
                d.this.f10974a.removeMessages(1);
            }
        }
    };

    /* renamed from: b, reason: collision with root package name */
    Rect f10975b = new Rect();

    /* renamed from: com.anythink.expressad.splash.c.d$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements com.anythink.expressad.foundation.f.a {
        public AnonymousClass6() {
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void a() {
            String str;
            d.this.e();
            try {
                JSONObject jSONObject = new JSONObject();
                if (n.a().g() != null) {
                    jSONObject.put("status", 1);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                o.b(d.this.f10976c, th.getMessage(), th);
                str = "";
            }
            String encodeToString = Base64.encodeToString(str.getBytes(), 2);
            j.a();
            j.a((WebView) d.this.f10978e.getSplashWebview(), AbsFeedBackForH5.f7027a, encodeToString);
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void b() {
            String str;
            d.this.d();
            try {
                JSONObject jSONObject = new JSONObject();
                if (n.a().g() != null) {
                    jSONObject.put("status", 2);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                o.b(d.this.f10976c, th.getMessage(), th);
                str = "";
            }
            String encodeToString = Base64.encodeToString(str.getBytes(), 2);
            j.a();
            j.a((WebView) d.this.f10978e.getSplashWebview(), AbsFeedBackForH5.f7027a, encodeToString);
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void c() {
            String str;
            d.this.d();
            try {
                JSONObject jSONObject = new JSONObject();
                if (n.a().g() != null) {
                    jSONObject.put("status", 2);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                o.b(d.this.f10976c, th.getMessage(), th);
                str = "";
            }
            String encodeToString = Base64.encodeToString(str.getBytes(), 2);
            j.a();
            j.a((WebView) d.this.f10978e.getSplashWebview(), AbsFeedBackForH5.f7027a, encodeToString);
        }
    }

    public d(Context context, String str, String str2) {
        this.f10986n = "点击跳过|";
        this.o = "点击跳过|";
        this.f10987p = "秒";
        this.f10988q = "秒后自动关闭";
        this.f10983k = str2;
        this.f10984l = str;
        this.f10992u = context;
        if (this.f10981i == null) {
            TextView textView = new TextView(context);
            this.f10981i = textView;
            textView.setGravity(1);
            this.f10981i.setTextIsSelectable(false);
            this.f10981i.setPadding(t.b(context, 5.0f), t.b(context, 5.0f), t.b(context, 5.0f), t.b(context, 5.0f));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f10981i.getLayoutParams();
            this.f10981i.setLayoutParams(layoutParams == null ? new RelativeLayout.LayoutParams(t.b(context, 100.0f), t.b(context, 50.0f)) : layoutParams);
            Context g6 = n.a().g();
            if (g6 != null) {
                String a10 = com.anythink.expressad.foundation.b.a.b().a();
                int identifier = g6.getResources().getIdentifier("anythink_splash_count_time_can_skip", i.f10128g, a10);
                int identifier2 = g6.getResources().getIdentifier("anythink_splash_count_time_can_skip_not", i.f10128g, a10);
                int identifier3 = g6.getResources().getIdentifier("anythink_splash_count_time_can_skip_s", i.f10128g, a10);
                this.o = g6.getResources().getString(identifier);
                String string = g6.getResources().getString(identifier2);
                this.f10988q = string;
                this.f10986n = string;
                this.f10987p = g6.getResources().getString(identifier3);
                this.f10981i.setBackgroundResource(g6.getResources().getIdentifier("anythink_splash_close_bg", i.f10125c, com.anythink.expressad.foundation.b.a.b().a()));
                this.f10981i.setTextColor(g6.getResources().getColor(g6.getResources().getIdentifier("anythink_splash_count_time_skip_text_color", i.f10126d, a10)));
            }
        }
    }

    public static /* synthetic */ int g(d dVar) {
        int i10 = dVar.f10985m;
        dVar.f10985m = i10 - 1;
        return i10;
    }

    private void l() {
        ATSplashWebview splashWebview;
        Handler handler;
        this.f10989r = true;
        if (this.f10985m > 0 && (handler = this.f10974a) != null) {
            handler.removeMessages(1);
        }
        ATSplashView aTSplashView = this.f10978e;
        if (aTSplashView != null && (splashWebview = aTSplashView.getSplashWebview()) != null && !splashWebview.isDestroyed()) {
            SplashJsUtils.sendEventToH5(splashWebview, "onInstallAlertShow", "");
        }
    }

    private void c(com.anythink.expressad.foundation.d.c cVar) {
        b(cVar, n.a().g(), this.f10983k);
        c(cVar, n.a().g(), this.f10983k);
        a(cVar, n.a().g(), this.f10983k);
        cVar.c(true);
        com.anythink.expressad.foundation.g.a.f.a(this.f10983k, cVar, com.anythink.expressad.foundation.g.a.f.f);
    }

    private void d(com.anythink.expressad.foundation.d.c cVar) {
        com.anythink.expressad.splash.d.d dVar = this.f;
        if (dVar != null) {
            dVar.a(cVar);
        }
    }

    private void f() {
        Context g6 = n.a().g();
        if (g6 != null) {
            String a10 = com.anythink.expressad.foundation.b.a.b().a();
            int identifier = g6.getResources().getIdentifier("anythink_splash_count_time_can_skip", i.f10128g, a10);
            int identifier2 = g6.getResources().getIdentifier("anythink_splash_count_time_can_skip_not", i.f10128g, a10);
            int identifier3 = g6.getResources().getIdentifier("anythink_splash_count_time_can_skip_s", i.f10128g, a10);
            this.o = g6.getResources().getString(identifier);
            String string = g6.getResources().getString(identifier2);
            this.f10988q = string;
            this.f10986n = string;
            this.f10987p = g6.getResources().getString(identifier3);
            this.f10981i.setBackgroundResource(g6.getResources().getIdentifier("anythink_splash_close_bg", i.f10125c, com.anythink.expressad.foundation.b.a.b().a()));
            this.f10981i.setTextColor(g6.getResources().getColor(g6.getResources().getIdentifier("anythink_splash_count_time_skip_text_color", i.f10126d, a10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void g() {
        if (this.f10977d != null && !this.f10990s) {
            boolean z10 = true;
            this.f10990s = true;
            if (this.f != null && this.f10978e != null) {
                Context context = this.f10992u;
                if (context != null && (context instanceof Activity) && ((Activity) context).isFinishing()) {
                    this.f.a("Activity is finishing");
                    return;
                }
                this.f.a();
            }
            if (!this.f10977d.V()) {
                if (!this.f10978e.isDynamicView()) {
                    com.anythink.expressad.foundation.d.c cVar = this.f10977d;
                    if (cVar.s()) {
                        z10 = false;
                    } else {
                        c(cVar, n.a().g(), this.f10983k);
                        cVar.c(true);
                        com.anythink.expressad.foundation.g.a.f.a(this.f10983k, cVar, com.anythink.expressad.foundation.g.a.f.f);
                    }
                    if (z10) {
                        b(cVar, n.a().g(), this.f10983k);
                        a(cVar, n.a().g(), this.f10983k);
                    }
                    return;
                }
                com.anythink.expressad.foundation.d.c cVar2 = this.f10977d;
                b(cVar2, n.a().g(), this.f10983k);
                c(cVar2, n.a().g(), this.f10983k);
                a(cVar2, n.a().g(), this.f10983k);
                cVar2.c(true);
                com.anythink.expressad.foundation.g.a.f.a(this.f10983k, cVar2, com.anythink.expressad.foundation.g.a.f.f);
            }
        }
    }

    private void h() {
        RelativeLayout.LayoutParams layoutParams;
        if (com.anythink.expressad.foundation.f.b.a().b() && !this.f10978e.isDynamicView()) {
            com.anythink.expressad.foundation.f.b.a().a(this.f10983k, new AnonymousClass6());
            FeedBackButton b10 = com.anythink.expressad.foundation.f.b.a().b(this.f10983k);
            if (b10 != null) {
                try {
                    layoutParams = (RelativeLayout.LayoutParams) b10.getLayoutParams();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    layoutParams = null;
                }
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(com.anythink.expressad.foundation.f.b.f9756a, com.anythink.expressad.foundation.f.b.f9757b);
                }
                layoutParams.topMargin = l.f(10.0f);
                layoutParams.leftMargin = l.f(10.0f);
                ViewGroup viewGroup = (ViewGroup) b10.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(b10);
                }
                this.f10978e.addView(b10, layoutParams);
            }
            this.f10977d.l(this.f10983k);
            com.anythink.expressad.foundation.f.b.a().a(this.f10983k, this.f10977d);
        }
    }

    private void i() {
        String str;
        if (this.f10980h) {
            str = this.o + this.f10985m + this.f10987p;
        } else {
            str = this.f10985m + this.f10988q;
        }
        this.f10981i.setText(str);
    }

    private void j() {
        try {
            this.f10991t = true;
            com.anythink.expressad.splash.d.d dVar = this.f;
            if (dVar != null) {
                dVar.b();
                this.f = null;
            }
            this.f10990s = false;
            ATSplashView aTSplashView = this.f10978e;
            if (aTSplashView != null) {
                aTSplashView.getSplashWebview();
            }
            Handler handler = this.f10974a;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable unused) {
        }
    }

    private void k() {
        ATSplashWebview splashWebview;
        Handler handler;
        this.f10989r = false;
        if (this.f10985m > 0 && (handler = this.f10974a) != null) {
            handler.removeMessages(1);
            this.f10974a.sendEmptyMessageDelayed(1, 1000L);
        }
        ATSplashView aTSplashView = this.f10978e;
        if (aTSplashView == null || (splashWebview = aTSplashView.getSplashWebview()) == null || splashWebview.isDestroyed()) {
            return;
        }
        SplashJsUtils.sendEventToH5(splashWebview, "onInstallAlertHide", "");
    }

    public final void a(com.anythink.expressad.splash.d.d dVar) {
        this.f = dVar;
    }

    public final String b() {
        com.anythink.expressad.foundation.d.c cVar = this.f10977d;
        return (cVar == null || cVar.Z() == null) ? "" : this.f10977d.Z();
    }

    public final void e() {
        Handler handler;
        if (this.f10985m > 0 && (handler = this.f10974a) != null) {
            handler.removeMessages(1);
        }
        ATSplashView aTSplashView = this.f10978e;
        if (aTSplashView != null) {
            aTSplashView.onPause();
            ATSplashWebview splashWebview = this.f10978e.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestroyed()) {
                return;
            }
            SplashJsUtils.sendEventToH5(splashWebview, SplashJsUtils.f11083a, "");
        }
    }

    public final void a(int i10) {
        this.f10985m = i10;
    }

    private void b(com.anythink.expressad.foundation.d.c cVar) {
        boolean z10;
        if (cVar.s()) {
            z10 = false;
        } else {
            c(cVar, n.a().g(), this.f10983k);
            z10 = true;
            cVar.c(true);
            com.anythink.expressad.foundation.g.a.f.a(this.f10983k, cVar, com.anythink.expressad.foundation.g.a.f.f);
        }
        if (z10) {
            b(cVar, n.a().g(), this.f10983k);
            a(cVar, n.a().g(), this.f10983k);
        }
    }

    public final void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this.f10993v);
        }
        this.f10982j = viewGroup;
    }

    public final void d() {
        Handler handler;
        if (this.f10989r || com.anythink.expressad.foundation.f.b.f9758c) {
            return;
        }
        if (this.f10985m > 0 && (handler = this.f10974a) != null) {
            handler.removeMessages(1);
            this.f10974a.sendEmptyMessageDelayed(1, 1000L);
        }
        ATSplashView aTSplashView = this.f10978e;
        if (aTSplashView != null) {
            aTSplashView.onResume();
            ATSplashWebview splashWebview = this.f10978e.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestroyed()) {
                return;
            }
            SplashJsUtils.sendEventToH5(splashWebview, SplashJsUtils.f11084b, "");
        }
    }

    public final com.anythink.expressad.splash.d.a a() {
        return this.f10995x;
    }

    private static void c(com.anythink.expressad.foundation.d.c cVar, Context context, String str) {
        com.anythink.expressad.foundation.b.a.b().b(context);
        if (!TextUtils.isEmpty(cVar.ag())) {
            com.anythink.expressad.a.a.a(context, cVar, str, cVar.ag(), false, true, com.anythink.expressad.a.a.a.f6605i);
        }
        if (TextUtils.isEmpty(str) || cVar.L() == null || cVar.L().o() == null) {
            return;
        }
        com.anythink.expressad.a.a.a(context, cVar, str, cVar.L().o(), false);
    }

    public final void a(com.anythink.expressad.foundation.d.c cVar, ATSplashView aTSplashView) {
        RelativeLayout.LayoutParams layoutParams;
        a(this.f10980h);
        this.f10977d = cVar;
        this.f10978e = aTSplashView;
        SplashJSBridgeImpl splashJSBridgeImpl = aTSplashView.getSplashJSBridgeImpl();
        SplashJSBridgeImpl splashJSBridgeImpl2 = splashJSBridgeImpl;
        if (splashJSBridgeImpl == null) {
            SplashJSBridgeImpl splashJSBridgeImpl3 = new SplashJSBridgeImpl(aTSplashView.getContext(), this.f10984l, this.f10983k);
            ArrayList arrayList = new ArrayList();
            arrayList.add(cVar);
            splashJSBridgeImpl3.setCampaignList(arrayList);
            splashJSBridgeImpl2 = splashJSBridgeImpl3;
        }
        splashJSBridgeImpl2.setCountdownS(this.f10985m);
        splashJSBridgeImpl2.setAllowSkip(this.f10980h ? 1 : 0);
        splashJSBridgeImpl2.setSplashBridgeListener(this.f10995x);
        aTSplashView.setSplashJSBridgeImpl(splashJSBridgeImpl2);
        boolean s10 = cVar.s();
        View view = this.f10982j;
        if (view == null) {
            if (s10) {
                this.f10981i.setVisibility(8);
            }
            i();
            b(this.f10981i);
            aTSplashView.setCloseView(this.f10981i);
        } else {
            if (s10) {
                view.setVisibility(8);
            }
            b(this.f10982j);
            aTSplashView.setCloseView(this.f10982j);
        }
        aTSplashView.show();
        com.anythink.expressad.foundation.d.c cVar2 = this.f10977d;
        if (cVar2 != null && cVar2.ay()) {
            aTSplashView.getSplashWebview();
        }
        aTSplashView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.anythink.expressad.splash.c.d.4
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
                n.a().a(new Runnable() { // from class: com.anythink.expressad.splash.c.d.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        d dVar = d.this;
                        if (d.a(dVar, dVar.f10978e)) {
                            d.this.g();
                        }
                    }
                }, 30L);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
            }
        });
        n.a().a(new Runnable() { // from class: com.anythink.expressad.splash.c.d.5
            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                if (d.a(dVar, dVar.f10978e)) {
                    d.this.g();
                }
            }
        }, 30L);
        b.a(this.f10977d.be());
        this.f10974a.removeMessages(1);
        this.f10974a.sendEmptyMessageDelayed(1, 1000L);
        this.f10974a.sendEmptyMessageDelayed(2, 1000L);
        if (!com.anythink.expressad.foundation.f.b.a().b() || this.f10978e.isDynamicView()) {
            return;
        }
        com.anythink.expressad.foundation.f.b.a().a(this.f10983k, new AnonymousClass6());
        FeedBackButton b10 = com.anythink.expressad.foundation.f.b.a().b(this.f10983k);
        if (b10 != null) {
            try {
                layoutParams = (RelativeLayout.LayoutParams) b10.getLayoutParams();
            } catch (Exception e10) {
                e10.printStackTrace();
                layoutParams = null;
            }
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(com.anythink.expressad.foundation.f.b.f9756a, com.anythink.expressad.foundation.f.b.f9757b);
            }
            layoutParams.topMargin = l.f(10.0f);
            layoutParams.leftMargin = l.f(10.0f);
            ViewGroup viewGroup = (ViewGroup) b10.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(b10);
            }
            this.f10978e.addView(b10, layoutParams);
        }
        this.f10977d.l(this.f10983k);
        com.anythink.expressad.foundation.f.b.a().a(this.f10983k, this.f10977d);
    }

    private void b(int i10) {
        ATSplashView aTSplashView = this.f10978e;
        if (aTSplashView != null) {
            aTSplashView.updateCountdown(i10);
            if (this.f10978e.getSplashJSBridgeImpl() != null) {
                this.f10978e.getSplashJSBridgeImpl().updateCountDown(i10);
            }
        }
        if (i10 < 0) {
            this.f10985m = i10;
        } else if (this.f10982j == null) {
            i();
        }
    }

    public final void c() {
        if (this.f != null) {
            this.f = null;
        }
        if (this.f10995x != null) {
            this.f10995x = null;
        }
        if (this.f10993v != null) {
            this.f10993v = null;
        }
        ATSplashView aTSplashView = this.f10978e;
        if (aTSplashView != null) {
            aTSplashView.destroy();
        }
        com.anythink.expressad.foundation.f.b.a().c(this.f10983k);
    }

    private void b(View view) {
        if (view != null) {
            view.setOnClickListener(this.f10993v);
        }
    }

    private void b(com.anythink.expressad.foundation.d.c cVar, Context context, String str) {
        if (cVar != null) {
            try {
                if (TextUtils.isEmpty(cVar.ai())) {
                    return;
                }
                com.anythink.expressad.a.a.a(context, cVar, str, cVar.ai(), false, true, com.anythink.expressad.a.a.a.f6606j);
            } catch (Throwable th) {
                o.d(this.f10976c, th.getMessage());
            }
        }
    }

    public static /* synthetic */ void b(d dVar) {
        try {
            dVar.f10991t = true;
            com.anythink.expressad.splash.d.d dVar2 = dVar.f;
            if (dVar2 != null) {
                dVar2.b();
                dVar.f = null;
            }
            dVar.f10990s = false;
            ATSplashView aTSplashView = dVar.f10978e;
            if (aTSplashView != null) {
                aTSplashView.getSplashWebview();
            }
            Handler handler = dVar.f10974a;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean a(View view) {
        return view != null && view.getVisibility() == 0 && view.getParent() != null && view.getWindowVisibility() == 0 && view.getGlobalVisibleRect(this.f10975b) && ((long) this.f10975b.height()) * ((long) this.f10975b.width()) > 0;
    }

    private void a(String str) {
        com.anythink.expressad.splash.d.d dVar = this.f;
        if (dVar != null) {
            dVar.a("web show failed:".concat(String.valueOf(str)));
        }
    }

    public final void a(boolean z10) {
        this.f10980h = z10;
        if (z10) {
            this.f10986n = this.o;
        } else {
            this.f10986n = this.f10988q;
        }
    }

    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar != null) {
            try {
                cVar.aA();
            } catch (Throwable th) {
                o.a(this.f10976c, th.getMessage());
            }
        }
        com.anythink.expressad.splash.d.d dVar = this.f;
        if (dVar != null) {
            dVar.a(cVar);
        }
    }

    private void a(com.anythink.expressad.foundation.d.c cVar, Context context, String str) {
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
                o.d(this.f10976c, th.getMessage());
            }
        }
    }

    public static /* synthetic */ void a(d dVar, int i10) {
        ATSplashView aTSplashView = dVar.f10978e;
        if (aTSplashView != null) {
            aTSplashView.updateCountdown(i10);
            if (dVar.f10978e.getSplashJSBridgeImpl() != null) {
                dVar.f10978e.getSplashJSBridgeImpl().updateCountDown(i10);
            }
        }
        if (i10 < 0) {
            dVar.f10985m = i10;
        } else if (dVar.f10982j == null) {
            dVar.i();
        }
    }

    public static /* synthetic */ void a(d dVar, String str) {
        com.anythink.expressad.splash.d.d dVar2 = dVar.f;
        if (dVar2 != null) {
            dVar2.a("web show failed:".concat(String.valueOf(str)));
        }
    }

    public static /* synthetic */ boolean a(d dVar, View view) {
        return view != null && view.getVisibility() == 0 && view.getParent() != null && view.getWindowVisibility() == 0 && view.getGlobalVisibleRect(dVar.f10975b) && ((long) dVar.f10975b.height()) * ((long) dVar.f10975b.width()) > 0;
    }
}
