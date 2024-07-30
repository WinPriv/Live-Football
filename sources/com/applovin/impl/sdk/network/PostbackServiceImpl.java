package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;

/* loaded from: classes.dex */
public class PostbackServiceImpl implements AppLovinPostbackService {

    /* renamed from: a, reason: collision with root package name */
    private final p f19075a;

    public PostbackServiceImpl(p pVar) {
        this.f19075a = pVar;
    }

    private boolean a(l lVar) {
        String str = lVar.c().get("event");
        if ("postinstall".equals(str)) {
            str = lVar.c().get("sub_event");
        }
        return EventServiceImpl.ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
    }

    @Override // com.applovin.sdk.AppLovinPostbackService
    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(l.b(this.f19075a).a(str).c(false).a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(l lVar, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(lVar, o.a.POSTBACKS, appLovinPostbackListener);
    }

    public String toString() {
        return "PostbackService{}";
    }

    public void dispatchPostbackRequest(l lVar, o.a aVar, AppLovinPostbackListener appLovinPostbackListener) {
        com.applovin.impl.sdk.e.g gVar = new com.applovin.impl.sdk.e.g(lVar, aVar, this.f19075a, appLovinPostbackListener);
        gVar.a(a(lVar));
        this.f19075a.M().a(gVar, aVar);
    }
}
