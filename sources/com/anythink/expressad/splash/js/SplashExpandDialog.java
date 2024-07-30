package com.anythink.expressad.splash.js;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.anythink.core.common.b.n;
import com.anythink.expressad.atsignalcommon.a.b;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.splash.d.a;
import com.huawei.hms.ads.ep;
import com.huawei.openalliance.ad.constant.av;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SplashExpandDialog extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private final String f11057a;

    /* renamed from: b, reason: collision with root package name */
    private String f11058b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11059c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f11060d;

    /* renamed from: e, reason: collision with root package name */
    private WindVaneWebView f11061e;
    private TextView f;

    /* renamed from: g, reason: collision with root package name */
    private String f11062g;

    /* renamed from: h, reason: collision with root package name */
    private List<c> f11063h;

    /* renamed from: i, reason: collision with root package name */
    private a f11064i;

    /* renamed from: j, reason: collision with root package name */
    private IMraidJSBridge f11065j;

    /* renamed from: com.anythink.expressad.splash.js.SplashExpandDialog$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SplashExpandDialog.this.dismiss();
        }
    }

    /* renamed from: com.anythink.expressad.splash.js.SplashExpandDialog$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 extends b {
        public AnonymousClass2() {
        }

        @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            StringBuilder sb2 = new StringBuilder("javascript:");
            com.anythink.expressad.d.b.a.a();
            sb2.append(com.anythink.expressad.d.b.a.b());
            webView.evaluateJavascript(sb2.toString(), new ValueCallback<String>() { // from class: com.anythink.expressad.splash.js.SplashExpandDialog.2.1
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str2) {
                }
            });
            SplashExpandDialog.a(SplashExpandDialog.this);
        }
    }

    /* renamed from: com.anythink.expressad.splash.js.SplashExpandDialog$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements DialogInterface.OnDismissListener {
        public AnonymousClass3() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (SplashExpandDialog.this.f11064i != null) {
                SplashExpandDialog.this.f11064i.a(false);
                SplashExpandDialog.this.f11064i.c();
            }
            SplashExpandDialog.this.f11061e.loadDataWithBaseURL(null, "", "text/html", com.anythink.expressad.foundation.g.a.bN, null);
            SplashExpandDialog.this.f11060d.removeView(SplashExpandDialog.this.f11061e);
            SplashExpandDialog.this.f11061e.release();
            SplashExpandDialog.this.f11061e = null;
            SplashExpandDialog.this.f11064i = null;
        }
    }

    public SplashExpandDialog(Context context, Bundle bundle, a aVar) {
        super(context);
        this.f11057a = "SplashExpandDialog";
        this.f11065j = new IMraidJSBridge() { // from class: com.anythink.expressad.splash.js.SplashExpandDialog.4
            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public void close() {
                SplashExpandDialog.this.dismiss();
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public c getMraidCampaign() {
                return null;
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public void open(String str) {
                try {
                    if (SplashExpandDialog.this.f11061e != null && System.currentTimeMillis() - SplashExpandDialog.this.f11061e.lastTouchTime > com.anythink.expressad.a.b.a.f6634c) {
                        c cVar = (c) SplashExpandDialog.this.f11063h.get(0);
                        SplashExpandDialog.this.f11061e.getUrl();
                        if (com.anythink.expressad.a.b.a.a(cVar)) {
                            return;
                        }
                    }
                    o.d("SplashExpandDialog", str);
                    if (SplashExpandDialog.this.f11063h.size() > 1) {
                        n.a().g().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (SplashExpandDialog.this.f11064i != null) {
                        SplashExpandDialog.this.f11064i.b(str);
                    }
                } catch (Throwable th) {
                    o.b("SplashExpandDialog", av.ai, th);
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public void unload() {
                close();
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public void useCustomClose(boolean z10) {
                int i10;
                try {
                    TextView textView = SplashExpandDialog.this.f;
                    if (z10) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    textView.setVisibility(i10);
                } catch (Throwable th) {
                    o.b("SplashExpandDialog", "useCustomClose", th);
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public void expand(String str, boolean z10) {
            }
        };
        if (bundle != null) {
            this.f11058b = bundle.getString("url");
            this.f11059c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f11064i = aVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i10;
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f11060d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f11061e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f11060d.addView(this.f11061e);
        TextView textView = new TextView(getContext());
        this.f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f.setLayoutParams(layoutParams);
        TextView textView2 = this.f;
        if (this.f11059c) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        textView2.setVisibility(i10);
        this.f.setOnClickListener(new AnonymousClass1());
        this.f11060d.addView(this.f);
        setContentView(this.f11060d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.f11061e.setWebViewListener(new AnonymousClass2());
        this.f11061e.setObject(this.f11065j);
        this.f11061e.loadUrl(this.f11058b);
        setOnDismissListener(new AnonymousClass3());
    }

    public void setCampaignList(String str, List<c> list) {
        this.f11062g = str;
        this.f11063h = list;
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
            this.f11061e.getLocationInWindow(new int[2]);
            CallMraidJS.getInstance().fireSetDefaultPosition(this.f11061e, r0[0], r0[1], r11.getWidth(), this.f11061e.getHeight());
            CallMraidJS.getInstance().fireSetCurrentPosition(this.f11061e, r0[0], r0[1], r5.getWidth(), this.f11061e.getHeight());
            CallMraidJS.getInstance().fireSetScreenSize(this.f11061e, e10, f);
            CallMraidJS.getInstance().fireSetMaxSize(this.f11061e, intValue, intValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(this.f11061e, hashMap);
            CallMraidJS.getInstance().fireReadyEvent(this.f11061e);
        } catch (Throwable th) {
            o.b("SplashExpandDialog", "notifyMraid", th);
        }
    }

    private void a() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f11060d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f11061e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f11060d.addView(this.f11061e);
        TextView textView = new TextView(getContext());
        this.f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f.setLayoutParams(layoutParams);
        this.f.setVisibility(this.f11059c ? 4 : 0);
        this.f.setOnClickListener(new AnonymousClass1());
        this.f11060d.addView(this.f);
        setContentView(this.f11060d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.f11061e.setWebViewListener(new AnonymousClass2());
        this.f11061e.setObject(this.f11065j);
        this.f11061e.loadUrl(this.f11058b);
        setOnDismissListener(new AnonymousClass3());
    }

    public static /* synthetic */ void a(SplashExpandDialog splashExpandDialog) {
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
            splashExpandDialog.f11061e.getLocationInWindow(new int[2]);
            CallMraidJS.getInstance().fireSetDefaultPosition(splashExpandDialog.f11061e, r1[0], r1[1], r11.getWidth(), splashExpandDialog.f11061e.getHeight());
            CallMraidJS.getInstance().fireSetCurrentPosition(splashExpandDialog.f11061e, r1[0], r1[1], r5.getWidth(), splashExpandDialog.f11061e.getHeight());
            CallMraidJS.getInstance().fireSetScreenSize(splashExpandDialog.f11061e, e10, f);
            CallMraidJS.getInstance().fireSetMaxSize(splashExpandDialog.f11061e, intValue, intValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(splashExpandDialog.f11061e, hashMap);
            CallMraidJS.getInstance().fireReadyEvent(splashExpandDialog.f11061e);
        } catch (Throwable th) {
            o.b("SplashExpandDialog", "notifyMraid", th);
        }
    }
}
