package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.anythink.expressad.atsignalcommon.base.BaseWebView;
import com.anythink.expressad.foundation.h.t;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class WindVaneWebView extends BaseWebView {

    /* renamed from: a, reason: collision with root package name */
    private Object f7034a;

    /* renamed from: b, reason: collision with root package name */
    private Object f7035b;

    /* renamed from: c, reason: collision with root package name */
    private String f7036c;

    /* renamed from: d, reason: collision with root package name */
    private e f7037d;
    protected o f;

    /* renamed from: g, reason: collision with root package name */
    protected d f7038g;

    /* renamed from: h, reason: collision with root package name */
    protected i f7039h;

    /* renamed from: i, reason: collision with root package name */
    private String f7040i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f7041j;

    /* renamed from: k, reason: collision with root package name */
    private float f7042k;

    /* renamed from: l, reason: collision with root package name */
    private float f7043l;

    public WindVaneWebView(Context context) {
        super(context);
        this.f7041j = false;
        this.f7042k = gl.Code;
        this.f7043l = gl.Code;
    }

    public static /* synthetic */ boolean a(WindVaneWebView windVaneWebView) {
        windVaneWebView.f7041j = true;
        return true;
    }

    public void clearWebView() {
        if (!this.f7041j) {
            loadUrl(com.anythink.core.common.res.d.f6477a);
        }
    }

    public String getCampaignId() {
        return this.f7036c;
    }

    public Object getJsObject(String str) {
        i iVar = this.f7039h;
        if (iVar == null) {
            return null;
        }
        return iVar.a(str);
    }

    public Object getMraidObject() {
        return this.f7035b;
    }

    public Object getObject() {
        return this.f7034a;
    }

    public String getRid() {
        return this.f7040i;
    }

    public d getSignalCommunication() {
        return this.f7038g;
    }

    public e getWebViewListener() {
        return this.f7037d;
    }

    public boolean isDestroyed() {
        return this.f7041j;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.anythink.expressad.atsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null && (bVar.b() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f7042k = motionEvent.getRawX();
                    this.f7043l = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f7042k;
                    float y = motionEvent.getY() - this.f7043l;
                    if ((rawX >= gl.Code || rawX * (-1.0f) <= 48.0f) && ((rawX <= gl.Code || rawX <= 48.0f) && ((y >= gl.Code || (-1.0f) * y <= 48.0f) && (y <= gl.Code || y <= 48.0f)))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void registerWindVanePlugin(Class cls) {
        if (this.f7039h == null) {
            return;
        }
        i.a(cls);
    }

    public void release() {
        try {
            removeAllViews();
            setDownloadListener(null);
            this.f7034a = null;
            if (t.j(getContext()) == 0) {
                this.f7041j = true;
                destroy();
            } else {
                com.anythink.core.common.b.n.a().a(new Runnable() { // from class: com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        WindVaneWebView.a(WindVaneWebView.this);
                        WindVaneWebView.this.destroy();
                    }
                }, r0 * 1000);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setApiManagerContext(Context context) {
        i iVar = this.f7039h;
        if (iVar != null) {
            iVar.a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        i iVar = this.f7039h;
        if (iVar != null) {
            iVar.a(obj);
        }
    }

    public void setCampaignId(String str) {
        this.f7036c = str;
    }

    public void setMraidObject(Object obj) {
        this.f7035b = obj;
    }

    public void setObject(Object obj) {
        this.f7034a = obj;
    }

    public void setRid(String str) {
        this.f7040i = str;
    }

    public void setSignalCommunication(d dVar) {
        this.f7038g = dVar;
        dVar.a(this);
    }

    public void setWebViewChromeClient(o oVar) {
        this.f = oVar;
        setWebChromeClient(oVar);
    }

    public void setWebViewListener(e eVar) {
        this.f7037d = eVar;
        o oVar = this.f;
        if (oVar != null) {
            oVar.a(eVar);
        }
        com.anythink.expressad.atsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null) {
            bVar.a(eVar);
        }
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }

    @Override // com.anythink.expressad.atsignalcommon.base.BaseWebView
    public final void a() {
        super.a();
        getSettings().setSavePassword(false);
        try {
            getSettings().setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        } catch (Throwable unused) {
            getSettings().setUserAgentString(com.anythink.core.common.k.d.i() + " WindVane/3.0.2");
        }
        if (this.f == null) {
            this.f = new o(this);
        }
        setWebViewChromeClient(this.f);
        p pVar = new p();
        this.mWebViewClient = pVar;
        setWebViewClient(pVar);
        if (this.f7038g == null) {
            d mVar = new m(this.f6966e);
            this.f7038g = mVar;
            setSignalCommunication(mVar);
        }
        this.f7039h = new i(this.f6966e, this);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7041j = false;
        this.f7042k = gl.Code;
        this.f7043l = gl.Code;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7041j = false;
        this.f7042k = gl.Code;
        this.f7043l = gl.Code;
    }
}
