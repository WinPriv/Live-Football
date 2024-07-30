package com.anythink.expressad.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.anythink.expressad.atsignalcommon.a.a;
import com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.video.signal.a.j;
import com.anythink.expressad.videocommon.e.d;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AnythinkBTWebView extends BTBaseView implements IMraidJSBridge {

    /* renamed from: s, reason: collision with root package name */
    private static final String f11329s = "portrait";

    /* renamed from: t, reason: collision with root package name */
    private static final String f11330t = "landscape";
    private j A;
    private WebView B;

    /* renamed from: p, reason: collision with root package name */
    private String f11331p;

    /* renamed from: q, reason: collision with root package name */
    private String f11332q;

    /* renamed from: r, reason: collision with root package name */
    private String f11333r;

    /* renamed from: u, reason: collision with root package name */
    private boolean f11334u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f11335v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f11336w;

    /* renamed from: x, reason: collision with root package name */
    private d f11337x;
    private List<c> y;

    /* renamed from: z, reason: collision with root package name */
    private WindVaneWebView f11338z;

    public AnythinkBTWebView(Context context) {
        super(context);
        this.f11334u = false;
        this.f11336w = false;
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f11338z != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", BTBaseView.f11343n);
                jSONObject2.put("id", this.f11348d);
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                com.anythink.expressad.atsignalcommon.windvane.j.a();
                com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) this.f11338z, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.anythink.expressad.video.bt.a.c.a();
                com.anythink.expressad.video.bt.a.c.a((WebView) this.f11338z, "broadcast", this.f11348d);
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void close() {
        WebView webView = this.B;
        if (webView != null) {
            BTBaseView.a(webView, "onPlayerCloseBtnClicked", this.f11348d);
        }
    }

    public List<c> getCampaigns() {
        return this.y;
    }

    public String getFilePath() {
        return this.f11332q;
    }

    public String getFileURL() {
        return this.f11331p;
    }

    public String getHtml() {
        return this.f11333r;
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public c getMraidCampaign() {
        return this.f11346b;
    }

    public d getRewardUnitSetting() {
        return this.f11337x;
    }

    public WindVaneWebView getWebView() {
        return this.f11338z;
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void init(Context context) {
        int i10;
        WindVaneWebView windVaneWebView = new WindVaneWebView(context);
        this.f11338z = windVaneWebView;
        windVaneWebView.setBackgroundColor(0);
        this.f11338z.setVisibility(0);
        j jVar = new j(null, this.f11346b, this.y);
        this.A = jVar;
        jVar.a(this.f11347c);
        this.f11338z.setObject(this.A);
        this.f11338z.setMraidObject(this);
        this.f11338z.setWebViewListener(new a() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTWebView.1
            @Override // com.anythink.expressad.atsignalcommon.a.a, com.anythink.expressad.atsignalcommon.windvane.c
            public final void a(Object obj) {
                String str;
                super.a(obj);
                try {
                    String str2 = "";
                    if (AnythinkBTWebView.this.A == null) {
                        str = "";
                    } else {
                        str = AnythinkBTWebView.this.A.i();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        str2 = Base64.encodeToString(str.getBytes(), 2);
                        o.a("RVWindVaneWebView", "getEndScreenInfo success");
                    } else {
                        o.a("RVWindVaneWebView", "getEndScreenInfo failed");
                    }
                    com.anythink.expressad.atsignalcommon.windvane.j.a().a(obj, str2);
                } catch (Throwable th) {
                    o.a("RVWindVaneWebView", th.getMessage());
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.a.a, com.anythink.expressad.atsignalcommon.windvane.e
            public final void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (AnythinkBTWebView.this.B != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", AnythinkBTWebView.this.f11348d);
                        jSONObject.put("code", BTBaseView.f11343n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", AnythinkBTWebView.this.f11348d);
                        jSONObject2.put("result", 1);
                        jSONObject.put("data", jSONObject2);
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a(AnythinkBTWebView.this.B, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e10) {
                        com.anythink.expressad.video.bt.a.c.a();
                        com.anythink.expressad.video.bt.a.c.a(AnythinkBTWebView.this.B, e10.getMessage());
                        o.a("RVWindVaneWebView", e10.getMessage());
                    }
                }
                com.anythink.expressad.atsignalcommon.windvane.j.a();
                com.anythink.expressad.atsignalcommon.windvane.j.a(AnythinkBTWebView.this.f11338z);
            }

            @Override // com.anythink.expressad.atsignalcommon.a.a, com.anythink.expressad.atsignalcommon.windvane.e
            public final void onReceivedError(WebView webView, int i11, String str, String str2) {
                super.onReceivedError(webView, i11, str, str2);
                if (AnythinkBTWebView.this.B != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", AnythinkBTWebView.this.f11348d);
                        jSONObject.put("code", BTBaseView.f11343n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", AnythinkBTWebView.this.f11348d);
                        jSONObject2.put("result", 2);
                        jSONObject2.put("error", str);
                        jSONObject.put("data", jSONObject2);
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a(AnythinkBTWebView.this.B, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e10) {
                        com.anythink.expressad.video.bt.a.c.a();
                        com.anythink.expressad.video.bt.a.c.a(AnythinkBTWebView.this.B, e10.getMessage());
                        o.a("RVWindVaneWebView", e10.getMessage());
                    }
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.a.a, com.anythink.expressad.atsignalcommon.windvane.e
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                if (AnythinkBTWebView.this.B != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", AnythinkBTWebView.this.f11348d);
                        jSONObject.put("code", BTBaseView.f11343n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", AnythinkBTWebView.this.f11348d);
                        jSONObject2.put("result", 2);
                        jSONObject2.put("error", sslError.toString());
                        jSONObject.put("data", jSONObject2);
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a(AnythinkBTWebView.this.B, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e10) {
                        com.anythink.expressad.video.bt.a.c.a();
                        com.anythink.expressad.video.bt.a.c.a(AnythinkBTWebView.this.B, e10.getMessage());
                        o.a("RVWindVaneWebView", e10.getMessage());
                    }
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.a.a, com.anythink.expressad.atsignalcommon.windvane.e
            public final void readyState(WebView webView, int i11) {
                super.readyState(webView, i11);
            }
        });
        addView(this.f11338z, new FrameLayout.LayoutParams(-1, -1));
        setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTWebView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (AnythinkBTWebView.this.B != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f11343n);
                        jSONObject.put("id", AnythinkBTWebView.this.f11348d);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", String.valueOf(view.getX()));
                        jSONObject2.put("y", String.valueOf(view.getY()));
                        jSONObject.put("data", jSONObject2);
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a(AnythinkBTWebView.this.B, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception unused) {
                        com.anythink.expressad.video.bt.a.c.a();
                        com.anythink.expressad.video.bt.a.c.a(AnythinkBTWebView.this.B, "onClicked", AnythinkBTWebView.this.f11348d);
                    }
                }
            }
        });
        try {
            ImageView imageView = new ImageView(getContext());
            this.f11335v = imageView;
            imageView.setImageResource(findDrawable("anythink_reward_close"));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
            layoutParams.gravity = 8388661;
            layoutParams.setMargins(30, 30, 30, 30);
            this.f11335v.setLayoutParams(layoutParams);
            ImageView imageView2 = this.f11335v;
            if (this.f11334u) {
                i10 = 4;
            } else {
                i10 = 8;
            }
            imageView2.setVisibility(i10);
            c cVar = this.f11346b;
            if (cVar != null && cVar.H()) {
                this.f11335v.setVisibility(4);
            }
            this.f11335v.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTWebView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnythinkBTWebView.this.close();
                }
            });
            addView(this.f11335v);
        } catch (Throwable th) {
            o.a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void notifyEvent(String str) {
        WindVaneWebView windVaneWebView = this.f11338z;
        if (windVaneWebView != null) {
            BTBaseView.a(windVaneWebView, str, this.f11348d);
        }
    }

    public void onBackPressed() {
        if (this.f11338z != null) {
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.a((WebView) this.f11338z, "onSystemBackPressed", this.f11348d);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (this.f11338z != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (configuration.orientation == 2) {
                    jSONObject.put("orientation", f11330t);
                } else {
                    jSONObject.put("orientation", f11329s);
                }
                jSONObject.put("instanceId", this.f11348d);
                String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
                com.anythink.expressad.atsignalcommon.windvane.j.a();
                com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) this.f11338z, "orientation", encodeToString);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void onDestory() {
        if (this.f11336w) {
            return;
        }
        this.f11336w = true;
        try {
            if (this.f11338z != null) {
                com.anythink.expressad.video.bt.a.c.a();
                com.anythink.expressad.video.bt.a.c.a((WebView) this.f11338z, "onSystemDestory", this.f11348d);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTWebView.4
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (AnythinkBTWebView.this.f11338z != null) {
                            AnythinkBTWebView.this.f11338z.clearWebView();
                            AnythinkBTWebView.this.f11338z.release();
                        }
                        AnythinkBTWebView.this.f11331p = null;
                        AnythinkBTWebView.this.f11332q = null;
                        AnythinkBTWebView.this.f11333r = null;
                        if (AnythinkBTWebView.this.B != null) {
                            AnythinkBTWebView.this.B = null;
                        }
                    } catch (Throwable th) {
                        o.a(BTBaseView.TAG, th.getMessage());
                    }
                }
            }, 500L);
            setOnClickListener(null);
            removeAllViews();
        } catch (Throwable th) {
            o.a(BTBaseView.TAG, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void open(String str) {
        try {
            String ad2 = this.f11346b.ad();
            if (!TextUtils.isEmpty(str)) {
                this.f11346b.p(str);
                try {
                    getMraidCampaign();
                } catch (Throwable th) {
                    o.a(BTBaseView.TAG, th.getMessage());
                }
            }
            new com.anythink.expressad.a.a(getContext(), this.f11347c);
            this.f11346b.p(ad2);
        } catch (Throwable th2) {
            o.d(BTBaseView.TAG, th2.getMessage());
        }
    }

    public void preload() {
        if (!TextUtils.isEmpty(this.f11331p)) {
            this.f11338z.loadUrl(this.f11331p);
        } else if (!TextUtils.isEmpty(this.f11332q)) {
            this.f11338z.loadUrl(this.f11332q);
        } else if (!TextUtils.isEmpty(this.f11333r)) {
            this.f11338z.loadDataWithBaseURL("", this.f11333r, "text/html", "UTF-8", null);
        }
    }

    public void setCampaigns(List<c> list) {
        this.y = list;
    }

    public void setCreateWebView(WebView webView) {
        this.B = webView;
    }

    public void setFilePath(String str) {
        this.f11332q = str;
    }

    public void setFileURL(String str) {
        this.f11331p = str;
        if (!TextUtils.isEmpty(str)) {
            boolean contains = str.contains("play.google.com");
            setWebviewClickable(!contains);
            if (contains) {
                com.anythink.expressad.atsignalcommon.base.c cVar = new com.anythink.expressad.atsignalcommon.base.c();
                WindVaneWebView windVaneWebView = this.f11338z;
                if (windVaneWebView != null) {
                    windVaneWebView.setFilter(cVar);
                }
            }
        }
    }

    public void setHtml(String str) {
        this.f11333r = str;
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void setRewardUnitSetting(d dVar) {
        this.f11337x = dVar;
    }

    public void setWebViewRid(String str) {
        WindVaneWebView windVaneWebView = this.f11338z;
        if (windVaneWebView != null) {
            windVaneWebView.setRid(str);
        }
    }

    public void setWebviewClickable(boolean z10) {
        WindVaneWebView windVaneWebView = this.f11338z;
        if (windVaneWebView != null) {
            windVaneWebView.setClickable(z10);
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
            ImageView imageView = this.f11335v;
            if (z10) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            imageView.setVisibility(i10);
        } catch (Throwable th) {
            o.d(BTBaseView.TAG, th.getMessage());
        }
    }

    public boolean webviewGoBack() {
        WindVaneWebView windVaneWebView = this.f11338z;
        if (windVaneWebView != null && windVaneWebView.canGoBack()) {
            this.f11338z.goBack();
            return true;
        }
        return false;
    }

    public boolean webviewGoForward() {
        WindVaneWebView windVaneWebView = this.f11338z;
        if (windVaneWebView != null && windVaneWebView.canGoForward()) {
            this.f11338z.goForward();
            return true;
        }
        return false;
    }

    public void webviewLoad(int i10) {
        if (this.A == null) {
            this.A = new j(null, this.f11346b, this.y);
        }
        c cVar = this.f11346b;
        if (cVar != null) {
            this.A.a(cVar);
        } else {
            List<c> list = this.y;
            if (list != null && list.size() > 0) {
                this.A.a(this.y);
                if (this.y.size() == 1) {
                    this.A.a(this.y.get(0));
                }
            }
        }
        d dVar = this.f11337x;
        if (dVar != null) {
            this.A.a(dVar);
        }
        this.A.a(this.f11347c);
        this.A.c(this.f11348d);
        if (i10 == 1) {
            this.A.q();
        }
        WindVaneWebView windVaneWebView = this.f11338z;
        if (windVaneWebView != null) {
            windVaneWebView.setObject(this.A);
        }
        c cVar2 = this.f11346b;
        if (cVar2 != null && cVar2.H()) {
            this.f11335v.setVisibility(4);
        }
        preload();
    }

    public boolean webviewReload() {
        WindVaneWebView windVaneWebView = this.f11338z;
        if (windVaneWebView != null) {
            windVaneWebView.reload();
            return true;
        }
        return false;
    }

    private void b() {
        try {
            getMraidCampaign();
        } catch (Throwable th) {
            o.a(BTBaseView.TAG, th.getMessage());
        }
    }

    public AnythinkBTWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11334u = false;
        this.f11336w = false;
    }

    private void a(com.anythink.expressad.atsignalcommon.base.c cVar) {
        WindVaneWebView windVaneWebView = this.f11338z;
        if (windVaneWebView != null) {
            windVaneWebView.setFilter(cVar);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void expand(String str, boolean z10) {
    }
}
