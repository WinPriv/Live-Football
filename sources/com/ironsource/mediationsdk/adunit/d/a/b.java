package com.ironsource.mediationsdk.adunit.d.a;

import com.ironsource.mediationsdk.L;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.adunit.c.a.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.f;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class b<Listener extends com.ironsource.mediationsdk.adunit.c.a.c> extends a<Listener> implements AdapterAdRewardListener {

    /* renamed from: p, reason: collision with root package name */
    public f f25239p;

    public b(com.ironsource.mediationsdk.adunit.d.a aVar, BaseAdInteractionAdapter<?, AdapterAdRewardListener> baseAdInteractionAdapter, com.ironsource.mediationsdk.model.a aVar2, Listener listener) {
        super(aVar, baseAdInteractionAdapter, aVar2, listener);
    }

    @Override // com.ironsource.mediationsdk.adunit.d.a.a, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        this.f25239p = new f();
        super.onAdClosed();
    }

    @Override // com.ironsource.mediationsdk.adunit.d.a.a, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdOpened() {
        this.f25239p = null;
        super.onAdOpened();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        if (this.f != null) {
            IronLog.INTERNAL.verbose(d("placement name = " + q()));
            if (this.f25243d != null) {
                HashMap hashMap = new HashMap();
                if (L.a().f24862n != null) {
                    for (String str : L.a().f24862n.keySet()) {
                        hashMap.put(s.f.b("custom_", str), L.a().f24862n.get(str));
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                this.f25243d.f25163e.a(q(), this.f.getRewardName(), this.f.getRewardAmount(), currentTimeMillis, IronSourceUtils.getTransId(currentTimeMillis, k()), f.a(this.f25239p), hashMap, L.a().f24861m);
            }
            ((com.ironsource.mediationsdk.adunit.c.a.c) this.f25241b).a((b<?>) this, this.f);
            return;
        }
        IronLog.INTERNAL.verbose(d("placement is null "));
        d dVar = this.f25243d;
        if (dVar != null) {
            dVar.f.m("mCurrentPlacement is null");
        }
    }
}
