package com.anythink.expressad.mbbanner.a.a;

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
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.o;
import com.huawei.hms.ads.ep;
import com.huawei.openalliance.ad.constant.av;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private final String f10278a;

    /* renamed from: b, reason: collision with root package name */
    private String f10279b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10280c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f10281d;

    /* renamed from: e, reason: collision with root package name */
    private WindVaneWebView f10282e;
    private TextView f;

    /* renamed from: g, reason: collision with root package name */
    private String f10283g;

    /* renamed from: h, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.c> f10284h;

    /* renamed from: i, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.c.a f10285i;

    /* renamed from: j, reason: collision with root package name */
    private IMraidJSBridge f10286j;

    /* renamed from: com.anythink.expressad.mbbanner.a.a.b$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.this.dismiss();
        }
    }

    /* renamed from: com.anythink.expressad.mbbanner.a.a.b$2, reason: invalid class name */
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
            webView.evaluateJavascript(sb2.toString(), new ValueCallback<String>() { // from class: com.anythink.expressad.mbbanner.a.a.b.2.1
                private static void a() {
                }

                @Override // android.webkit.ValueCallback
                public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                }
            });
            b.a(b.this);
        }
    }

    /* renamed from: com.anythink.expressad.mbbanner.a.a.b$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements DialogInterface.OnDismissListener {
        public AnonymousClass3() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            if (b.this.f10285i != null) {
                b.this.f10285i.a(false);
            }
            b.this.f10282e.loadDataWithBaseURL(null, "", "text/html", com.anythink.expressad.foundation.g.a.bN, null);
            b.this.f10281d.removeView(b.this.f10282e);
            b.this.f10282e.release();
            b.this.f10282e = null;
            b.this.f10285i = null;
        }
    }

    public b(Context context, Bundle bundle, com.anythink.expressad.mbbanner.a.c.a aVar) {
        super(context);
        this.f10278a = "BannerExpandDialog";
        this.f10286j = new IMraidJSBridge() { // from class: com.anythink.expressad.mbbanner.a.a.b.4
            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final void close() {
                b.this.dismiss();
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final com.anythink.expressad.foundation.d.c getMraidCampaign() {
                return null;
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final void open(String str) {
                try {
                    if (b.this.f10282e != null && System.currentTimeMillis() - b.this.f10282e.lastTouchTime > com.anythink.expressad.a.b.a.f6634c) {
                        com.anythink.expressad.foundation.d.c cVar = (com.anythink.expressad.foundation.d.c) b.this.f10284h.get(0);
                        b.this.f10282e.getUrl();
                        if (com.anythink.expressad.a.b.a.a(cVar)) {
                            return;
                        }
                    }
                    o.d("BannerExpandDialog", str);
                    if (b.this.f10284h.size() > 1) {
                        n.a().g().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (b.this.f10285i != null) {
                        b.this.f10285i.a(true, str);
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
                    TextView textView = b.this.f;
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
        this.f10279b = bundle.getString("url");
        this.f10280c = bundle.getBoolean("shouldUseCustomClose");
        this.f10285i = aVar;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i10;
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f10281d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f10282e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f10281d.addView(this.f10282e);
        TextView textView = new TextView(getContext());
        this.f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f.setLayoutParams(layoutParams);
        TextView textView2 = this.f;
        if (this.f10280c) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        textView2.setVisibility(i10);
        this.f.setOnClickListener(new AnonymousClass1());
        this.f10281d.addView(this.f);
        setContentView(this.f10281d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.f10282e.setWebViewListener(new AnonymousClass2());
        this.f10282e.setObject(this.f10286j);
        this.f10282e.loadUrl(this.f10279b);
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
            this.f10282e.getLocationInWindow(new int[2]);
            CallMraidJS.getInstance().fireSetDefaultPosition(this.f10282e, r0[0], r0[1], r11.getWidth(), this.f10282e.getHeight());
            CallMraidJS.getInstance().fireSetCurrentPosition(this.f10282e, r0[0], r0[1], r5.getWidth(), this.f10282e.getHeight());
            CallMraidJS.getInstance().fireSetScreenSize(this.f10282e, e10, f);
            CallMraidJS.getInstance().fireSetMaxSize(this.f10282e, intValue, intValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(this.f10282e, hashMap);
            CallMraidJS.getInstance().fireReadyEvent(this.f10282e);
        } catch (Throwable th) {
            o.b("BannerExpandDialog", "notifyMraid", th);
        }
    }

    private void a() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f10281d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f10282e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f10281d.addView(this.f10282e);
        TextView textView = new TextView(getContext());
        this.f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f.setLayoutParams(layoutParams);
        this.f.setVisibility(this.f10280c ? 4 : 0);
        this.f.setOnClickListener(new AnonymousClass1());
        this.f10281d.addView(this.f);
        setContentView(this.f10281d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.f10282e.setWebViewListener(new AnonymousClass2());
        this.f10282e.setObject(this.f10286j);
        this.f10282e.loadUrl(this.f10279b);
        setOnDismissListener(new AnonymousClass3());
    }

    public final void a(String str, List<com.anythink.expressad.foundation.d.c> list) {
        this.f10283g = str;
        this.f10284h = list;
    }

    public static /* synthetic */ void a(b bVar) {
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
            bVar.f10282e.getLocationInWindow(new int[2]);
            CallMraidJS.getInstance().fireSetDefaultPosition(bVar.f10282e, r1[0], r1[1], r11.getWidth(), bVar.f10282e.getHeight());
            CallMraidJS.getInstance().fireSetCurrentPosition(bVar.f10282e, r1[0], r1[1], r5.getWidth(), bVar.f10282e.getHeight());
            CallMraidJS.getInstance().fireSetScreenSize(bVar.f10282e, e10, f);
            CallMraidJS.getInstance().fireSetMaxSize(bVar.f10282e, intValue, intValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(bVar.f10282e, hashMap);
            CallMraidJS.getInstance().fireReadyEvent(bVar.f10282e);
        } catch (Throwable th) {
            o.b("BannerExpandDialog", "notifyMraid", th);
        }
    }
}
