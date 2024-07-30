package com.anythink.expressad.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.video.bt.module.AnythinkBTContainer;
import com.anythink.expressad.video.module.AnythinkContainerView;
import com.anythink.expressad.video.module.AnythinkVideoView;
import com.anythink.expressad.video.signal.a.h;
import com.anythink.expressad.video.signal.a.j;
import com.anythink.expressad.video.signal.a.k;
import com.anythink.expressad.video.signal.a.l;
import com.anythink.expressad.video.signal.a.m;
import com.anythink.expressad.video.signal.a.n;
import com.anythink.expressad.video.signal.c;
import com.anythink.expressad.video.signal.e;
import com.anythink.expressad.video.signal.g;
import com.anythink.expressad.video.signal.i;
import java.util.List;

/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: h, reason: collision with root package name */
    private Activity f12276h;

    /* renamed from: i, reason: collision with root package name */
    private WebView f12277i;

    /* renamed from: j, reason: collision with root package name */
    private AnythinkVideoView f12278j;

    /* renamed from: k, reason: collision with root package name */
    private AnythinkContainerView f12279k;

    /* renamed from: l, reason: collision with root package name */
    private c f12280l;

    /* renamed from: m, reason: collision with root package name */
    private AnythinkBTContainer f12281m;

    /* renamed from: n, reason: collision with root package name */
    private List<c> f12282n;
    private c.a o;

    /* renamed from: p, reason: collision with root package name */
    private String f12283p;

    public b(Activity activity) {
        this.f12276h = activity;
    }

    public final void a(j jVar) {
        this.f12271b = jVar;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.a getActivityProxy() {
        WebView webView = this.f12277i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.f12270a == null) {
            this.f12270a = new h(webView);
        }
        return this.f12270a;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        Activity activity;
        AnythinkContainerView anythinkContainerView = this.f12279k;
        if (anythinkContainerView != null && (activity = this.f12276h) != null) {
            if (this.f == null) {
                this.f = new m(activity, anythinkContainerView);
            }
            return this.f;
        }
        return super.getIJSRewardVideoV1();
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.b getJSBTModule() {
        if (this.f12276h != null && this.f12281m != null) {
            if (this.f12275g == null) {
                this.f12275g = new com.anythink.expressad.video.signal.a.i(this.f12276h, this.f12281m);
            }
            return this.f12275g;
        }
        return super.getJSBTModule();
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.c getJSCommon() {
        com.anythink.expressad.foundation.d.c cVar;
        List<com.anythink.expressad.foundation.d.c> list;
        Activity activity = this.f12276h;
        if (activity != null && (cVar = this.f12280l) != null) {
            if (this.f12271b == null) {
                this.f12271b = new j(activity, cVar);
            }
            if (this.f12280l.k() == 5 && (list = this.f12282n) != null) {
                com.anythink.expressad.video.signal.c cVar2 = this.f12271b;
                if (cVar2 instanceof j) {
                    ((j) cVar2).a(list);
                }
            }
            this.f12271b.a(this.f12276h);
            this.f12271b.a(this.f12283p);
            this.f12271b.a(this.o);
            return this.f12271b;
        }
        return super.getJSCommon();
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public e getJSContainerModule() {
        AnythinkContainerView anythinkContainerView = this.f12279k;
        if (anythinkContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f12274e == null) {
            this.f12274e = new k(anythinkContainerView);
        }
        return this.f12274e;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        WebView webView = this.f12277i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f12273d == null) {
            this.f12273d = new l(webView);
        }
        return this.f12273d;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.j getJSVideoModule() {
        AnythinkVideoView anythinkVideoView = this.f12278j;
        if (anythinkVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.f12272c == null) {
            this.f12272c = new n(anythinkVideoView);
        }
        return this.f12272c;
    }

    public final void a(List<com.anythink.expressad.foundation.d.c> list) {
        this.f12282n = list;
    }

    public b(Activity activity, AnythinkBTContainer anythinkBTContainer, WebView webView) {
        this.f12276h = activity;
        this.f12281m = anythinkBTContainer;
        this.f12277i = webView;
    }

    private b(Activity activity, WebView webView, AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, com.anythink.expressad.foundation.d.c cVar) {
        this.f12276h = activity;
        this.f12277i = webView;
        this.f12278j = anythinkVideoView;
        this.f12279k = anythinkContainerView;
        this.f12280l = cVar;
    }

    public b(Activity activity, WebView webView, AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, com.anythink.expressad.foundation.d.c cVar, c.a aVar) {
        this.f12276h = activity;
        this.f12277i = webView;
        this.f12278j = anythinkVideoView;
        this.f12279k = anythinkContainerView;
        this.f12280l = cVar;
        this.o = aVar;
        this.f12283p = anythinkVideoView.getUnitId();
    }
}
