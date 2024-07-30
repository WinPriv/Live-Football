package com.anythink.expressad.video.signal.factory;

import com.anythink.expressad.video.signal.a.d;
import com.anythink.expressad.video.signal.a.f;
import com.anythink.expressad.video.signal.c;
import com.anythink.expressad.video.signal.e;
import com.anythink.expressad.video.signal.g;
import com.anythink.expressad.video.signal.i;
import com.anythink.expressad.video.signal.j;

/* loaded from: classes.dex */
public class a implements IJSFactory {

    /* renamed from: a, reason: collision with root package name */
    protected com.anythink.expressad.video.signal.a f12270a;

    /* renamed from: b, reason: collision with root package name */
    protected c f12271b;

    /* renamed from: c, reason: collision with root package name */
    protected j f12272c;

    /* renamed from: d, reason: collision with root package name */
    protected g f12273d;

    /* renamed from: e, reason: collision with root package name */
    protected e f12274e;
    protected i f;

    /* renamed from: g, reason: collision with root package name */
    protected com.anythink.expressad.video.signal.b f12275g;

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.a getActivityProxy() {
        if (this.f12270a == null) {
            this.f12270a = new com.anythink.expressad.video.signal.a.a();
        }
        return this.f12270a;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        if (this.f == null) {
            this.f = new f();
        }
        return this.f;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.b getJSBTModule() {
        if (this.f12275g == null) {
            this.f12275g = new com.anythink.expressad.video.signal.a.b();
        }
        return this.f12275g;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public c getJSCommon() {
        if (this.f12271b == null) {
            this.f12271b = new com.anythink.expressad.video.signal.a.c();
        }
        return this.f12271b;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public e getJSContainerModule() {
        if (this.f12274e == null) {
            this.f12274e = new d();
        }
        return this.f12274e;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        if (this.f12273d == null) {
            this.f12273d = new com.anythink.expressad.video.signal.a.e();
        }
        return this.f12273d;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        if (this.f12272c == null) {
            this.f12272c = new com.anythink.expressad.video.signal.a.g();
        }
        return this.f12272c;
    }
}
