package com.anythink.expressad.advanced.c;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.core.common.b.n;
import com.anythink.expressad.advanced.d.d;
import com.anythink.expressad.advanced.js.NativeAdvancedJSBridgeImpl;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.advanced.view.ATNativeAdvancedView;
import com.anythink.expressad.advanced.view.ATNativeAdvancedWebview;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.foundation.h.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.c f6829c;

    /* renamed from: d, reason: collision with root package name */
    private ATNativeAdvancedView f6830d;

    /* renamed from: e, reason: collision with root package name */
    private d f6831e;
    private com.anythink.expressad.a.a f;

    /* renamed from: g, reason: collision with root package name */
    private com.anythink.expressad.advanced.d.c f6832g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6833h;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f6835j;

    /* renamed from: k, reason: collision with root package name */
    private String f6836k;

    /* renamed from: l, reason: collision with root package name */
    private String f6837l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f6838m;

    /* renamed from: b, reason: collision with root package name */
    private String f6828b = "NativeAdvancedShowManager";

    /* renamed from: i, reason: collision with root package name */
    private int f6834i = -1;

    /* renamed from: n, reason: collision with root package name */
    private View.OnClickListener f6839n = new View.OnClickListener() { // from class: com.anythink.expressad.advanced.c.b.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (b.this.f6833h) {
                b.b(b.this);
            }
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public Handler f6827a = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.advanced.c.b.2
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 2 && b.this.f6829c != null && b.this.f6829c.ay() && b.this.f6830d != null) {
                b.this.f6830d.getAdvancedNativeWebview();
            }
        }
    };
    private com.anythink.expressad.advanced.d.a o = new com.anythink.expressad.advanced.d.a() { // from class: com.anythink.expressad.advanced.c.b.3
        @Override // com.anythink.expressad.advanced.d.a
        public final void a(int i10) {
            b.this.f6834i = i10;
            if (b.this.f6830d != null) {
                b.this.f6830d.changeCloseBtnState(i10);
            }
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void b() {
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void d() {
            b.b(b.this);
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void b(int i10) {
            o.d(b.this.f6828b, "resetCountdown".concat(String.valueOf(i10)));
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void a() {
            if (b.this.f6830d != null) {
                b.this.f6830d.setVisibility(8);
            }
            b.b(b.this);
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void a(com.anythink.expressad.foundation.d.c cVar) {
            b.this.a(cVar);
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void a(boolean z10) {
            if (b.this.f6831e != null) {
                b.this.f6838m = z10;
                if (z10) {
                    d unused = b.this.f6831e;
                } else {
                    d unused2 = b.this.f6831e;
                }
            }
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void a(String str) {
            try {
                if (b.this.f6831e != null) {
                    if (TextUtils.isEmpty(str)) {
                        b.this.f6831e.a(b.this.f6829c);
                        d unused = b.this.f6831e;
                    } else {
                        com.anythink.expressad.foundation.d.c b10 = com.anythink.expressad.foundation.d.c.b(com.anythink.expressad.foundation.d.c.a(b.this.f6829c));
                        b10.p(str);
                        b.this.a(b10);
                    }
                }
            } catch (Exception e10) {
                o.d(b.this.f6828b, e10.getMessage());
            }
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void c() {
        }
    };

    public b(Context context, String str, String str2) {
        this.f6836k = str2;
        this.f6837l = str;
        if (this.f6835j == null) {
            ImageView imageView = new ImageView(context);
            this.f6835j = imageView;
            imageView.setPadding(t.b(context, 2.0f), t.b(context, 2.0f), t.b(context, 2.0f), t.b(context, 2.0f));
            Context g6 = n.a().g();
            this.f6835j.setScaleType(ImageView.ScaleType.FIT_XY);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f6835j.getLayoutParams();
            this.f6835j.setLayoutParams(layoutParams == null ? new RelativeLayout.LayoutParams(t.b(g6, 29.0f), t.b(g6, 16.0f)) : layoutParams);
            this.f6835j.setImageResource(g6.getResources().getIdentifier("anythink_native_advanced_close_icon", i.f10125c, com.anythink.expressad.foundation.b.a.b().a()));
        }
    }

    private void g() {
        if (!this.f6829c.V()) {
            boolean z10 = true;
            this.f6829c.c(true);
            com.anythink.expressad.foundation.d.c cVar = this.f6829c;
            if (!cVar.s()) {
                Context g6 = n.a().g();
                String str = this.f6836k;
                com.anythink.expressad.foundation.b.a.b().b(g6);
                if (!TextUtils.isEmpty(cVar.ag())) {
                    com.anythink.expressad.a.a.a(g6, cVar, str, cVar.ag(), false, true, com.anythink.expressad.a.a.a.f6605i);
                }
                if (!TextUtils.isEmpty(str) && cVar.L() != null && cVar.L().o() != null) {
                    com.anythink.expressad.a.a.a(g6, cVar, str, cVar.L().o(), false);
                }
                cVar.c(true);
                f.a(this.f6836k, cVar, f.f9818g);
            } else {
                z10 = false;
            }
            if (z10) {
                b(cVar, n.a().g(), this.f6836k);
                a(cVar, n.a().g(), this.f6836k);
            }
            d dVar = this.f6831e;
            if (dVar != null) {
                dVar.a();
            }
        }
    }

    private void i() {
        d dVar = this.f6831e;
        if (dVar != null) {
            dVar.c();
            this.f6831e = null;
        }
    }

    public final com.anythink.expressad.advanced.d.a b() {
        return this.o;
    }

    private void b(com.anythink.expressad.foundation.d.c cVar) {
        boolean z10 = false;
        if (!cVar.s()) {
            Context g6 = n.a().g();
            String str = this.f6836k;
            com.anythink.expressad.foundation.b.a.b().b(g6);
            if (!TextUtils.isEmpty(cVar.ag())) {
                com.anythink.expressad.a.a.a(g6, cVar, str, cVar.ag(), false, true, com.anythink.expressad.a.a.a.f6605i);
            }
            if (!TextUtils.isEmpty(str) && cVar.L() != null && cVar.L().o() != null) {
                com.anythink.expressad.a.a.a(g6, cVar, str, cVar.L().o(), false);
            }
            z10 = true;
            cVar.c(true);
            f.a(this.f6836k, cVar, f.f9818g);
        }
        if (z10) {
            b(cVar, n.a().g(), this.f6836k);
            a(cVar, n.a().g(), this.f6836k);
        }
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

    private void f() {
        Context g6 = n.a().g();
        this.f6835j.setScaleType(ImageView.ScaleType.FIT_XY);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f6835j.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(t.b(g6, 29.0f), t.b(g6, 16.0f));
        }
        this.f6835j.setLayoutParams(layoutParams);
        this.f6835j.setImageResource(g6.getResources().getIdentifier("anythink_native_advanced_close_icon", i.f10125c, com.anythink.expressad.foundation.b.a.b().a()));
    }

    public final void d() {
        ATNativeAdvancedWebview advancedNativeWebview;
        if (this.f6830d == null || com.anythink.expressad.foundation.f.b.f9758c || (advancedNativeWebview = this.f6830d.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestroyed()) {
            return;
        }
        NativeAdvancedJsUtils.sendEventToH5(advancedNativeWebview, NativeAdvancedJsUtils.f6913b, "");
    }

    public final void e() {
        ATNativeAdvancedWebview advancedNativeWebview;
        ATNativeAdvancedView aTNativeAdvancedView = this.f6830d;
        if (aTNativeAdvancedView == null || (advancedNativeWebview = aTNativeAdvancedView.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestroyed()) {
            return;
        }
        j.a();
        j.a((WebView) advancedNativeWebview, NativeAdvancedJsUtils.f6912a, "");
    }

    public final void a(com.anythink.expressad.advanced.d.c cVar) {
        this.f6832g = cVar;
    }

    public final void a(d dVar) {
        this.f6831e = dVar;
    }

    public final String a() {
        com.anythink.expressad.foundation.d.c cVar = this.f6829c;
        return (cVar == null || cVar.Z() == null) ? "" : this.f6829c.Z();
    }

    public final void c() {
        if (this.f6831e != null) {
            this.f6831e = null;
        }
        if (this.o != null) {
            this.o = null;
        }
        if (this.f6839n != null) {
            this.f6839n = null;
        }
        ATNativeAdvancedView aTNativeAdvancedView = this.f6830d;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.destroy();
        }
        if (this.f6832g != null) {
            this.f6832g = null;
        }
        com.anythink.expressad.foundation.f.b.a().c(this.f6836k);
    }

    public final void a(final com.anythink.expressad.foundation.d.c cVar, final ATNativeAdvancedView aTNativeAdvancedView, boolean z10) {
        View b10;
        RelativeLayout.LayoutParams layoutParams;
        if (aTNativeAdvancedView == null) {
            return;
        }
        com.anythink.expressad.foundation.f.b.a().a(this.f6836k, new com.anythink.expressad.foundation.f.a() { // from class: com.anythink.expressad.advanced.c.b.4
            @Override // com.anythink.expressad.foundation.f.a
            public final void a() {
                String str;
                b.this.e();
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (n.a().g() != null) {
                        jSONObject.put("status", 1);
                    }
                    str = jSONObject.toString();
                } catch (Throwable th) {
                    o.b(b.this.f6828b, th.getMessage(), th);
                    str = "";
                }
                String encodeToString = Base64.encodeToString(str.getBytes(), 2);
                j.a();
                j.a((WebView) aTNativeAdvancedView.getAdvancedNativeWebview(), AbsFeedBackForH5.f7027a, encodeToString);
            }

            @Override // com.anythink.expressad.foundation.f.a
            public final void b() {
                String str;
                b.this.d();
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (n.a().g() != null) {
                        jSONObject.put("status", 2);
                    }
                    str = jSONObject.toString();
                } catch (Throwable th) {
                    o.b(b.this.f6828b, th.getMessage(), th);
                    str = "";
                }
                String encodeToString = Base64.encodeToString(str.getBytes(), 2);
                j.a();
                j.a((WebView) aTNativeAdvancedView.getAdvancedNativeWebview(), AbsFeedBackForH5.f7027a, encodeToString);
            }

            @Override // com.anythink.expressad.foundation.f.a
            public final void c() {
                String str;
                b.this.d();
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (n.a().g() != null) {
                        jSONObject.put("status", 2);
                    }
                    str = jSONObject.toString();
                } catch (Throwable th) {
                    o.b(b.this.f6828b, th.getMessage(), th);
                    str = "";
                }
                String encodeToString = Base64.encodeToString(str.getBytes(), 2);
                j.a();
                j.a((WebView) aTNativeAdvancedView.getAdvancedNativeWebview(), AbsFeedBackForH5.f7027a, encodeToString);
            }
        });
        if (cVar.H() && com.anythink.expressad.foundation.f.b.a().b() && (b10 = com.anythink.expressad.foundation.f.b.a().b(this.f6836k)) != null) {
            try {
                layoutParams = (RelativeLayout.LayoutParams) b10.getLayoutParams();
            } catch (Exception e10) {
                e10.printStackTrace();
                layoutParams = null;
            }
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(com.anythink.expressad.foundation.f.b.f9756a, com.anythink.expressad.foundation.f.b.f9757b);
            }
            layoutParams.addRule(12);
            ViewGroup viewGroup = (ViewGroup) b10.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(b10);
            }
            aTNativeAdvancedView.addView(b10, layoutParams);
        }
        this.f6833h = this.f6833h;
        this.f6829c = cVar;
        this.f6830d = aTNativeAdvancedView;
        NativeAdvancedJSBridgeImpl advancedNativeJSBridgeImpl = aTNativeAdvancedView.getAdvancedNativeJSBridgeImpl();
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = advancedNativeJSBridgeImpl;
        if (advancedNativeJSBridgeImpl == null) {
            NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl2 = new NativeAdvancedJSBridgeImpl(aTNativeAdvancedView.getContext(), this.f6837l, this.f6836k);
            ArrayList arrayList = new ArrayList();
            arrayList.add(cVar);
            nativeAdvancedJSBridgeImpl2.setCampaignList(arrayList);
            nativeAdvancedJSBridgeImpl = nativeAdvancedJSBridgeImpl2;
        }
        nativeAdvancedJSBridgeImpl.setAllowSkip(this.f6833h ? 1 : 0);
        nativeAdvancedJSBridgeImpl.setNativeAdvancedBridgeListener(this.o);
        aTNativeAdvancedView.setAdvancedNativeJSBridgeImpl(nativeAdvancedJSBridgeImpl);
        if (cVar.s() || !this.f6833h) {
            this.f6835j.setVisibility(8);
        }
        ImageView imageView = this.f6835j;
        if (imageView != null) {
            imageView.setOnClickListener(this.f6839n);
        }
        aTNativeAdvancedView.setCloseView(this.f6835j);
        boolean z11 = false;
        if (aTNativeAdvancedView.getVisibility() != 0) {
            aTNativeAdvancedView.setVisibility(0);
        }
        boolean a10 = y.a(aTNativeAdvancedView.getAdvancedNativeWebview());
        com.anythink.expressad.advanced.d.c cVar2 = this.f6832g;
        if (cVar2 == null || a10 || cVar2.c() == null || this.f6832g.c().getAlpha() < 0.5f || this.f6832g.c().getVisibility() != 0 || this.f6838m) {
            if (z10) {
                aTNativeAdvancedView.postDelayed(new Runnable() { // from class: com.anythink.expressad.advanced.c.b.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.a(cVar, aTNativeAdvancedView, false);
                    }
                }, 200L);
                return;
            }
            return;
        }
        aTNativeAdvancedView.show();
        com.anythink.expressad.foundation.b.a.b().b(aTNativeAdvancedView.getContext());
        cVar.l(this.f6836k);
        com.anythink.expressad.foundation.f.b.a().a(this.f6836k, cVar);
        com.anythink.expressad.foundation.d.c cVar3 = this.f6829c;
        if (cVar3 != null && cVar3.ay()) {
            aTNativeAdvancedView.getAdvancedNativeWebview();
            try {
                com.anythink.expressad.advanced.a.a.c(cVar.Z());
            } catch (Throwable th) {
                o.a("OMSDK", th.getMessage());
                com.anythink.expressad.foundation.d.c cVar4 = this.f6829c;
                if (cVar4 != null) {
                    cVar4.Z();
                    this.f6829c.aa();
                    this.f6829c.aZ();
                }
            }
        }
        if (!this.f6829c.V()) {
            this.f6829c.c(true);
            com.anythink.expressad.foundation.d.c cVar5 = this.f6829c;
            if (!cVar5.s()) {
                Context g6 = n.a().g();
                String str = this.f6836k;
                com.anythink.expressad.foundation.b.a.b().b(g6);
                if (!TextUtils.isEmpty(cVar5.ag())) {
                    com.anythink.expressad.a.a.a(g6, cVar5, str, cVar5.ag(), false, true, com.anythink.expressad.a.a.a.f6605i);
                }
                if (!TextUtils.isEmpty(str) && cVar5.L() != null && cVar5.L().o() != null) {
                    com.anythink.expressad.a.a.a(g6, cVar5, str, cVar5.L().o(), false);
                }
                cVar5.c(true);
                f.a(this.f6836k, cVar5, f.f9818g);
                z11 = true;
            }
            if (z11) {
                b(cVar5, n.a().g(), this.f6836k);
                a(cVar5, n.a().g(), this.f6836k);
            }
            d dVar = this.f6831e;
            if (dVar != null) {
                dVar.a();
            }
        }
        int i10 = this.f6834i;
        if (i10 != -1) {
            aTNativeAdvancedView.changeCloseBtnState(i10);
        }
        com.anythink.expressad.advanced.a.a.c(cVar.Z());
        this.f6827a.sendEmptyMessageDelayed(2, 1000L);
    }

    private void b(com.anythink.expressad.foundation.d.c cVar, Context context, String str) {
        if (cVar != null) {
            try {
                if (TextUtils.isEmpty(cVar.ai())) {
                    return;
                }
                com.anythink.expressad.a.a.a(context, cVar, str, cVar.ai(), false, true, com.anythink.expressad.a.a.a.f6606j);
            } catch (Throwable th) {
                o.d(this.f6828b, th.getMessage());
            }
        }
    }

    public static /* synthetic */ void b(b bVar) {
        d dVar = bVar.f6831e;
        if (dVar != null) {
            dVar.c();
            bVar.f6831e = null;
        }
    }

    private static void h() {
    }

    private static /* synthetic */ void j() {
    }

    public final void a(boolean z10) {
        this.f6833h = z10;
    }

    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        cVar.l(this.f6836k);
        d dVar = this.f6831e;
        if (dVar != null) {
            dVar.a(cVar);
        }
    }

    private void a(View view) {
        if (view != null) {
            view.setOnClickListener(this.f6839n);
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
                o.d(this.f6828b, th.getMessage());
            }
        }
    }
}
