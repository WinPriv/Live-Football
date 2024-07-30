package com.applovin.exoplayer2.a;

import android.app.Activity;
import android.os.Handler;
import com.android.volley.Response;
import com.anythink.core.api.ATSDK;
import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.l.p;
import com.applovin.sdk.AppLovinSdk;
import com.ironsource.mediationsdk.IronSource;
import d6.o;
import h4.b;
import java.util.Objects;
import k4.e1;
import l4.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements p.b, p.a, b.a, o.a, o.b, Response.Listener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13017s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f13018t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f13019u;

    public /* synthetic */ y(int i10, Object obj, Object obj2) {
        this.f13017s = i10;
        this.f13018t = obj;
        this.f13019u = obj2;
    }

    @Override // d6.o.b
    public final void d(Object obj, d6.j jVar) {
        l4.b bVar = (l4.b) obj;
        bVar.c((e1) this.f13019u, new b.C0437b(jVar, ((l4.r) this.f13018t).f32432w));
    }

    @Override // h4.b.a
    public final Object execute() {
        f4.h hVar = (f4.h) this.f13018t;
        hVar.f28091c.p((Iterable) this.f13019u);
        return null;
    }

    @Override // com.applovin.exoplayer2.l.p.b
    public final void invoke(Object obj, com.applovin.exoplayer2.l.m mVar) {
        ((a) this.f13018t).a((an) this.f13019u, (b) obj, mVar);
    }

    @Override // com.android.volley.Response.Listener
    public final void onResponse(Object obj) {
        Activity activity = (Activity) this.f13018t;
        h9.a aVar = (h9.a) this.f13019u;
        i9.b bVar = (i9.b) new m8.i().b(i9.b.class, (String) obj);
        t8.l.f35590a = bVar;
        t8.l.f35591b = bVar.a();
        t8.l.f35592c = t8.l.f35590a.b();
        IronSource.init(activity, t8.l.f35591b.f(), new q.e());
        AppLovinSdk.getInstance(activity).setMediationProvider("Max");
        AppLovinSdk.initializeSdk(activity, new t8.j(activity));
        ATSDK.integrationChecking(activity);
        ATSDK.init(activity, t8.l.f35591b.o(), t8.l.f35591b.p());
        t8.a.d(activity);
        t8.a.b(activity);
        Handler handler = new Handler();
        Objects.requireNonNull(aVar);
        handler.postDelayed(new androidx.activity.g(aVar, 10), com.anythink.expressad.exoplayer.f.f7962a);
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        int i10 = this.f13017s;
        Object obj2 = this.f13019u;
        Object obj3 = this.f13018t;
        switch (i10) {
            case 1:
                ((b) obj).a((b.a) obj3, (ac) obj2);
                return;
            case 2:
                a.b((b.a) obj3, (com.applovin.exoplayer2.c.e) obj2, (b) obj);
                return;
            case 3:
            case 5:
            default:
                ((l4.b) obj).getClass();
                return;
            case 4:
                ((l4.b) obj).getClass();
                return;
            case 6:
                ((l4.b) obj).getClass();
                return;
            case 7:
                ((l4.b) obj).getClass();
                return;
        }
    }
}
