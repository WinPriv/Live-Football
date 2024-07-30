package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.d.a.b;
import com.ironsource.mediationsdk.ae;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class f<Smash extends b<?>> extends d<Smash, BaseAdInteractionAdapter<?, AdapterAdRewardListener>> implements com.ironsource.mediationsdk.adunit.c.a.c {
    public f(a aVar, Set<ImpressionDataListener> set, IronSourceSegment ironSourceSegment) {
        super(aVar, set, ironSourceSegment);
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.c
    public final void a(b<?> bVar, Placement placement) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c(bVar.m()));
        AdInfo a10 = this.f25197a.a(bVar.o());
        tb.a aVar = this.f25214t;
        if (aVar.f35593a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ae.a().a(placement, a10);
            return;
        }
        ironLog.warning("ad unit not supported - " + aVar.f35593a);
    }
}
