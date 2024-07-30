package com.anythink.basead.mraid;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.anythink.core.common.b.n;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.o;
import com.huawei.hms.ads.ep;
import com.huawei.openalliance.ad.constant.av;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private final String f4052a;

    /* renamed from: b, reason: collision with root package name */
    private String f4053b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4054c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f4055d;

    /* renamed from: e, reason: collision with root package name */
    private WindVaneWebView f4056e;
    private TextView f;

    /* renamed from: g, reason: collision with root package name */
    private b f4057g;

    /* renamed from: h, reason: collision with root package name */
    private IMraidJSBridge f4058h;

    /* renamed from: com.anythink.basead.mraid.c$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c.this.dismiss();
        }
    }

    /* renamed from: com.anythink.basead.mraid.c$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 extends com.anythink.expressad.atsignalcommon.a.b {
        public AnonymousClass2() {
        }

        @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            StringBuilder sb2 = new StringBuilder("javascript:");
            com.anythink.expressad.d.b.a.a();
            sb2.append(com.anythink.expressad.d.b.a.b());
            webView.evaluateJavascript(sb2.toString(), new ValueCallback<String>() { // from class: com.anythink.basead.mraid.c.2.1
                private static void a() {
                }

                @Override // android.webkit.ValueCallback
                public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                }
            });
            c.a(c.this);
        }
    }

    /* renamed from: com.anythink.basead.mraid.c$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements DialogInterface.OnDismissListener {
        public AnonymousClass3() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            c.this.f4056e.loadDataWithBaseURL(null, "", "text/html", com.anythink.expressad.foundation.g.a.bN, null);
            c.this.f4055d.removeView(c.this.f4056e);
            c.this.f4056e.release();
            c.this.f4056e = null;
            c.this.f4057g = null;
        }
    }

    public c(Context context, Bundle bundle, b bVar) {
        super(context);
        this.f4052a = "BannerExpandDialog";
        this.f4058h = new IMraidJSBridge() { // from class: com.anythink.basead.mraid.c.4
            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final void close() {
                c.this.dismiss();
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final com.anythink.expressad.foundation.d.c getMraidCampaign() {
                return null;
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final void open(String str) {
                try {
                    o.d("BannerExpandDialog", str);
                    if (c.this.f4057g != null) {
                        c.this.f4057g.open(str);
                    }
                } catch (Throwable th) {
                    o.b("BannerExpandDialog", av.ai, th);
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final void unload() {
                close();
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final void useCustomClose(boolean z10) {
                int i10;
                try {
                    TextView textView = c.this.f;
                    if (z10) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    textView.setVisibility(i10);
                } catch (Throwable th) {
                    o.b("BannerExpandDialog", "useCustomClose", th);
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final void expand(String str, boolean z10) {
            }
        };
        this.f4053b = bundle.getString("url");
        this.f4054c = bundle.getBoolean("shouldUseCustomClose");
        this.f4057g = bVar;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i10;
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f4055d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f4056e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f4055d.addView(this.f4056e);
        TextView textView = new TextView(getContext());
        this.f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f.setLayoutParams(layoutParams);
        TextView textView2 = this.f;
        if (this.f4054c) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        textView2.setVisibility(i10);
        this.f.setOnClickListener(new AnonymousClass1());
        this.f4055d.addView(this.f);
        setContentView(this.f4055d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.f4056e.setWebViewListener(new AnonymousClass2());
        this.f4056e.setObject(this.f4058h);
        this.f4056e.loadUrl(this.f4053b);
        setOnDismissListener(new AnonymousClass3());
    }

    private void b() {
        try {
            int i10 = n.a().g().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i10 == 2 ? "landscape" : i10 == 1 ? "portrait" : "undefined");
            jSONObject.put("locked", ep.Code);
            float e10 = k.e(n.a().g());
            float f = k.f(n.a().g());
            HashMap g6 = k.g(n.a().g());
            int intValue = ((Integer) g6.get(ContentRecord.WIDTH)).intValue();
            int intValue2 = ((Integer) g6.get(ContentRecord.HEIGHT)).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(CallMraidJS.f7000a, "Interstitial");
            hashMap.put("state", CallMraidJS.f7005g);
            hashMap.put(CallMraidJS.f7002c, ep.Code);
            hashMap.put(CallMraidJS.f7003d, jSONObject);
            this.f4056e.getLocationInWindow(new int[2]);
            CallMraidJS.getInstance().fireSetDefaultPosition(this.f4056e, r0[0], r0[1], r11.getWidth(), this.f4056e.getHeight());
            CallMraidJS.getInstance().fireSetCurrentPosition(this.f4056e, r0[0], r0[1], r5.getWidth(), this.f4056e.getHeight());
            CallMraidJS.getInstance().fireSetScreenSize(this.f4056e, e10, f);
            CallMraidJS.getInstance().fireSetMaxSize(this.f4056e, intValue, intValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(this.f4056e, hashMap);
            CallMraidJS.getInstance().fireReadyEvent(this.f4056e);
        } catch (Throwable th) {
            o.b("BannerExpandDialog", "notifyMraid", th);
        }
    }

    private void a() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f4055d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f4056e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f4055d.addView(this.f4056e);
        TextView textView = new TextView(getContext());
        this.f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f.setLayoutParams(layoutParams);
        this.f.setVisibility(this.f4054c ? 4 : 0);
        this.f.setOnClickListener(new AnonymousClass1());
        this.f4055d.addView(this.f);
        setContentView(this.f4055d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.f4056e.setWebViewListener(new AnonymousClass2());
        this.f4056e.setObject(this.f4058h);
        this.f4056e.loadUrl(this.f4053b);
        setOnDismissListener(new AnonymousClass3());
    }

    public static /* synthetic */ void a(c cVar) {
        try {
            int i10 = n.a().g().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i10 == 2 ? "landscape" : i10 == 1 ? "portrait" : "undefined");
            jSONObject.put("locked", ep.Code);
            float e10 = k.e(n.a().g());
            float f = k.f(n.a().g());
            HashMap g6 = k.g(n.a().g());
            int intValue = ((Integer) g6.get(ContentRecord.WIDTH)).intValue();
            int intValue2 = ((Integer) g6.get(ContentRecord.HEIGHT)).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(CallMraidJS.f7000a, "Interstitial");
            hashMap.put("state", CallMraidJS.f7005g);
            hashMap.put(CallMraidJS.f7002c, ep.Code);
            hashMap.put(CallMraidJS.f7003d, jSONObject);
            cVar.f4056e.getLocationInWindow(new int[2]);
            CallMraidJS.getInstance().fireSetDefaultPosition(cVar.f4056e, r1[0], r1[1], r11.getWidth(), cVar.f4056e.getHeight());
            CallMraidJS.getInstance().fireSetCurrentPosition(cVar.f4056e, r1[0], r1[1], r5.getWidth(), cVar.f4056e.getHeight());
            CallMraidJS.getInstance().fireSetScreenSize(cVar.f4056e, e10, f);
            CallMraidJS.getInstance().fireSetMaxSize(cVar.f4056e, intValue, intValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(cVar.f4056e, hashMap);
            CallMraidJS.getInstance().fireReadyEvent(cVar.f4056e);
        } catch (Throwable th) {
            o.b("BannerExpandDialog", "notifyMraid", th);
        }
    }
}
