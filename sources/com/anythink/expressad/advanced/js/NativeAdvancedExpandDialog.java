package com.anythink.expressad.advanced.js;

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
import com.anythink.expressad.advanced.d.a;
import com.anythink.expressad.atsignalcommon.a.b;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.o;
import com.huawei.hms.ads.ep;
import com.huawei.openalliance.ad.constant.av;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NativeAdvancedExpandDialog extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private final String f6889a;

    /* renamed from: b, reason: collision with root package name */
    private String f6890b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6891c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f6892d;

    /* renamed from: e, reason: collision with root package name */
    private WindVaneWebView f6893e;
    private TextView f;

    /* renamed from: g, reason: collision with root package name */
    private String f6894g;

    /* renamed from: h, reason: collision with root package name */
    private List<c> f6895h;

    /* renamed from: i, reason: collision with root package name */
    private a f6896i;

    /* renamed from: j, reason: collision with root package name */
    private IMraidJSBridge f6897j;

    /* renamed from: com.anythink.expressad.advanced.js.NativeAdvancedExpandDialog$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NativeAdvancedExpandDialog.this.dismiss();
        }
    }

    /* renamed from: com.anythink.expressad.advanced.js.NativeAdvancedExpandDialog$2, reason: invalid class name */
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
            webView.evaluateJavascript(sb2.toString(), new ValueCallback<String>() { // from class: com.anythink.expressad.advanced.js.NativeAdvancedExpandDialog.2.1
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str2) {
                }
            });
            NativeAdvancedExpandDialog.a(NativeAdvancedExpandDialog.this);
        }
    }

    /* renamed from: com.anythink.expressad.advanced.js.NativeAdvancedExpandDialog$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements DialogInterface.OnDismissListener {
        public AnonymousClass3() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (NativeAdvancedExpandDialog.this.f6896i != null) {
                NativeAdvancedExpandDialog.this.f6896i.a(false);
            }
            NativeAdvancedExpandDialog.this.f6893e.loadDataWithBaseURL(null, "", "text/html", com.anythink.expressad.foundation.g.a.bN, null);
            NativeAdvancedExpandDialog.this.f6892d.removeView(NativeAdvancedExpandDialog.this.f6893e);
            NativeAdvancedExpandDialog.this.f6893e.release();
            NativeAdvancedExpandDialog.this.f6893e = null;
            NativeAdvancedExpandDialog.this.f6896i = null;
        }
    }

    public NativeAdvancedExpandDialog(Context context, Bundle bundle, a aVar) {
        super(context);
        this.f6889a = "NativeAdvancedExpandDialog";
        this.f6897j = new IMraidJSBridge() { // from class: com.anythink.expressad.advanced.js.NativeAdvancedExpandDialog.4
            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public void close() {
                NativeAdvancedExpandDialog.this.dismiss();
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public c getMraidCampaign() {
                return null;
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public void open(String str) {
                try {
                    if (NativeAdvancedExpandDialog.this.f6893e != null && System.currentTimeMillis() - NativeAdvancedExpandDialog.this.f6893e.lastTouchTime > com.anythink.expressad.a.b.a.f6634c) {
                        c cVar = (c) NativeAdvancedExpandDialog.this.f6895h.get(0);
                        NativeAdvancedExpandDialog.this.f6893e.getUrl();
                        if (com.anythink.expressad.a.b.a.a(cVar)) {
                            return;
                        }
                    }
                    o.d("NativeAdvancedExpandDialog", str);
                    if (NativeAdvancedExpandDialog.this.f6895h.size() > 1) {
                        n.a().g().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (NativeAdvancedExpandDialog.this.f6896i != null) {
                        NativeAdvancedExpandDialog.this.f6896i.a(str);
                    }
                } catch (Throwable th) {
                    o.b("NativeAdvancedExpandDialog", av.ai, th);
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
                    TextView textView = NativeAdvancedExpandDialog.this.f;
                    if (z10) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    textView.setVisibility(i10);
                } catch (Throwable th) {
                    o.b("NativeAdvancedExpandDialog", "useCustomClose", th);
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public void expand(String str, boolean z10) {
            }
        };
        if (bundle != null) {
            this.f6890b = bundle.getString("url");
            this.f6891c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f6896i = aVar;
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
        this.f6892d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f6893e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f6892d.addView(this.f6893e);
        TextView textView = new TextView(getContext());
        this.f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f.setLayoutParams(layoutParams);
        TextView textView2 = this.f;
        if (this.f6891c) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        textView2.setVisibility(i10);
        this.f.setOnClickListener(new AnonymousClass1());
        this.f6892d.addView(this.f);
        setContentView(this.f6892d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.f6893e.setWebViewListener(new AnonymousClass2());
        this.f6893e.setObject(this.f6897j);
        this.f6893e.loadUrl(this.f6890b);
        setOnDismissListener(new AnonymousClass3());
    }

    public void setCampaignList(String str, List<c> list) {
        this.f6894g = str;
        this.f6895h = list;
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
            hashMap.put(CallMraidJS.f7000a, CallMraidJS.f7009k);
            hashMap.put("state", CallMraidJS.f7005g);
            hashMap.put(CallMraidJS.f7002c, ep.Code);
            hashMap.put(CallMraidJS.f7003d, jSONObject);
            this.f6893e.getLocationInWindow(new int[2]);
            CallMraidJS.getInstance().fireSetDefaultPosition(this.f6893e, r0[0], r0[1], r11.getWidth(), this.f6893e.getHeight());
            CallMraidJS.getInstance().fireSetCurrentPosition(this.f6893e, r0[0], r0[1], r5.getWidth(), this.f6893e.getHeight());
            CallMraidJS.getInstance().fireSetScreenSize(this.f6893e, e10, f);
            CallMraidJS.getInstance().fireSetMaxSize(this.f6893e, intValue, intValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(this.f6893e, hashMap);
            CallMraidJS.getInstance().fireReadyEvent(this.f6893e);
        } catch (Throwable th) {
            o.b("NativeAdvancedExpandDialog", "notifyMraid", th);
        }
    }

    private void a() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f6892d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f6893e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f6892d.addView(this.f6893e);
        TextView textView = new TextView(getContext());
        this.f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f.setLayoutParams(layoutParams);
        this.f.setVisibility(this.f6891c ? 4 : 0);
        this.f.setOnClickListener(new AnonymousClass1());
        this.f6892d.addView(this.f);
        setContentView(this.f6892d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.f6893e.setWebViewListener(new AnonymousClass2());
        this.f6893e.setObject(this.f6897j);
        this.f6893e.loadUrl(this.f6890b);
        setOnDismissListener(new AnonymousClass3());
    }

    public static /* synthetic */ void a(NativeAdvancedExpandDialog nativeAdvancedExpandDialog) {
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
            hashMap.put(CallMraidJS.f7000a, CallMraidJS.f7009k);
            hashMap.put("state", CallMraidJS.f7005g);
            hashMap.put(CallMraidJS.f7002c, ep.Code);
            hashMap.put(CallMraidJS.f7003d, jSONObject);
            nativeAdvancedExpandDialog.f6893e.getLocationInWindow(new int[2]);
            CallMraidJS.getInstance().fireSetDefaultPosition(nativeAdvancedExpandDialog.f6893e, r1[0], r1[1], r11.getWidth(), nativeAdvancedExpandDialog.f6893e.getHeight());
            CallMraidJS.getInstance().fireSetCurrentPosition(nativeAdvancedExpandDialog.f6893e, r1[0], r1[1], r5.getWidth(), nativeAdvancedExpandDialog.f6893e.getHeight());
            CallMraidJS.getInstance().fireSetScreenSize(nativeAdvancedExpandDialog.f6893e, e10, f);
            CallMraidJS.getInstance().fireSetMaxSize(nativeAdvancedExpandDialog.f6893e, intValue, intValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(nativeAdvancedExpandDialog.f6893e, hashMap);
            CallMraidJS.getInstance().fireReadyEvent(nativeAdvancedExpandDialog.f6893e);
        } catch (Throwable th) {
            o.b("NativeAdvancedExpandDialog", "notifyMraid", th);
        }
    }
}
