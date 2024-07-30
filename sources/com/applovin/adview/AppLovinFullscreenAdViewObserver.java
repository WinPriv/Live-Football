package com.applovin.adview;

import androidx.lifecycle.i;
import androidx.lifecycle.l;
import androidx.lifecycle.s;
import com.applovin.impl.adview.activity.b.a;
import com.applovin.impl.sdk.p;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinFullscreenAdViewObserver implements l {

    /* renamed from: a, reason: collision with root package name */
    private final p f12885a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f12886b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    private a f12887c;

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.impl.adview.p f12888d;

    public AppLovinFullscreenAdViewObserver(i iVar, com.applovin.impl.adview.p pVar, p pVar2) {
        this.f12888d = pVar;
        this.f12885a = pVar2;
        iVar.a(this);
    }

    @s(i.b.ON_DESTROY)
    public void onDestroy() {
        com.applovin.impl.adview.p pVar = this.f12888d;
        if (pVar != null) {
            pVar.a();
            this.f12888d = null;
        }
        a aVar = this.f12887c;
        if (aVar != null) {
            aVar.h();
            this.f12887c.k();
            this.f12887c = null;
        }
    }

    @s(i.b.ON_PAUSE)
    public void onPause() {
        a aVar = this.f12887c;
        if (aVar != null) {
            aVar.g();
            this.f12887c.e();
        }
    }

    @s(i.b.ON_RESUME)
    public void onResume() {
        a aVar;
        if (!this.f12886b.getAndSet(false) && (aVar = this.f12887c) != null) {
            aVar.f();
            this.f12887c.a(0L);
        }
    }

    @s(i.b.ON_STOP)
    public void onStop() {
        a aVar = this.f12887c;
        if (aVar != null) {
            aVar.j();
        }
    }

    public void setPresenter(a aVar) {
        this.f12887c = aVar;
    }
}
