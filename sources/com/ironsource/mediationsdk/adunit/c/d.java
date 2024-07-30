package com.ironsource.mediationsdk.adunit.c;

import android.content.Context;
import com.huawei.openalliance.ad.constant.w;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C1420h;
import com.ironsource.mediationsdk.C1421j;
import com.ironsource.mediationsdk.F;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.adunit.c.e;
import com.ironsource.mediationsdk.adunit.d.a.a;
import com.ironsource.mediationsdk.ae;
import com.ironsource.mediationsdk.c.b;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.k;
import com.ironsource.mediationsdk.utils.o;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class d<Smash extends com.ironsource.mediationsdk.adunit.d.a.a<?>, Adapter extends BaseAdInteractionAdapter<?, ? extends AdapterAdInteractionListener>> extends e<Smash, Adapter> implements com.ironsource.mediationsdk.adunit.c.a.a {
    public d(a aVar, Set<ImpressionDataListener> set, IronSourceSegment ironSourceSegment) {
        super(aVar, set, ironSourceSegment);
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.a
    public final void a(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c(aVar.m()));
        AdInfo a10 = this.f25197a.a(aVar.o());
        tb.a aVar2 = this.f25214t;
        IronSource.AD_UNIT ad_unit = aVar2.f35593a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            F.a().d(a10);
        } else if (ad_unit != IronSource.AD_UNIT.REWARDED_VIDEO) {
            ironLog.warning("ad unit not supported - " + aVar2.f35593a);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.a
    public final void b(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c(aVar.m()));
        com.ironsource.mediationsdk.adunit.e.a<Smash> aVar2 = this.f25197a;
        aVar2.a(aVar);
        this.f25207l.a(aVar);
        if (this.f25207l.b(aVar)) {
            ironLog.verbose(c(aVar.k() + " was session capped"));
            aVar.g();
            IronSourceUtils.sendAutomationLog(aVar.k() + " was session capped");
        }
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        String m10 = m();
        a aVar3 = this.o;
        k.b(applicationContext, m10, aVar3.f25175a);
        boolean a10 = k.a(ContextProvider.getInstance().getApplicationContext(), m(), aVar3.f25175a);
        com.ironsource.mediationsdk.adunit.b.d dVar = this.f25213s;
        if (a10) {
            ironLog.verbose(c("placement " + m() + " is capped"));
            dVar.f25163e.h(m());
        }
        o.a().a(aVar3.f25175a);
        if (aVar3.a()) {
            b bVar = this.f25198b.get(aVar.k());
            if (bVar != null) {
                aVar2.a(aVar2.f25261b, bVar.b(m()));
                C1420h.a(bVar, aVar.l(), this.f25204i, m());
                this.f25199c.put(aVar.k(), C1421j.a.ISAuctionPerformanceShowedSuccessfully);
                ImpressionData b10 = bVar.b(m());
                if (b10 != null) {
                    for (ImpressionDataListener impressionDataListener : this.B) {
                        IronLog.CALLBACK.info(c("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + b10));
                        impressionDataListener.onImpressionSuccess(b10);
                    }
                }
            } else {
                String k10 = aVar.k();
                String b11 = s.f.b("showing instance missing from waterfall - ", k10);
                ironLog.verbose(c(b11));
                dVar.f.a(1011, b11, k10);
            }
        }
        AdInfo a11 = aVar2.a(aVar.o());
        tb.a aVar4 = this.f25214t;
        IronSource.AD_UNIT ad_unit = aVar4.f35593a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            F.a().b(a11);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ae.a().a(a11);
        } else {
            IronLog.INTERNAL.warning("ad unit not supported - " + aVar4.f35593a);
        }
        if (aVar3.f25181h.b()) {
            i(false, false);
        }
        c cVar = this.f25211q;
        com.ironsource.mediationsdk.adunit.c.b.a aVar5 = cVar.f25193a;
        if (aVar5.f25185a == a.EnumC0328a.AUTOMATIC_LOAD_WHILE_SHOW) {
            cVar.b(aVar5.f25186b);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.a
    public final String c() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f25210p == e.a.READY_TO_SHOW) {
            Iterator it = this.f25197a.a().iterator();
            while (it.hasNext()) {
                com.ironsource.mediationsdk.adunit.d.a.a aVar = (com.ironsource.mediationsdk.adunit.d.a.a) it.next();
                if (aVar.e()) {
                    sb2.append(aVar.k() + w.aG);
                }
            }
        }
        return sb2.toString();
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.a
    public final void d(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c(aVar.m()));
        tb.a aVar2 = this.f25214t;
        if (aVar2.f35593a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ae.a().b();
            return;
        }
        ironLog.warning("ad unit not supported - " + aVar2.f35593a);
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.a
    public final void e(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c(aVar.m()));
        tb.a aVar2 = this.f25214t;
        if (aVar2.f35593a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ae.a().c();
            return;
        }
        ironLog.warning("ad unit not supported - " + aVar2.f35593a);
    }

    public final void s(String str, IronSourceError ironSourceError) {
        this.f25213s.f25163e.a(m(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), str);
        this.f25211q.b();
        com.ironsource.mediationsdk.adunit.e.a<Smash> aVar = this.f25197a;
        AdInfo a10 = aVar.a(aVar.f25261b);
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        IronSource.AD_UNIT ad_unit2 = this.f25214t.f35593a;
        if (ad_unit2 == ad_unit) {
            F.a().a(ironSourceError, a10);
        } else if (ad_unit2 == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ae.a().a(ironSourceError, a10);
        } else {
            IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit2);
        }
        if (this.o.f25181h.b()) {
            i(false, false);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.a
    public final void a(IronSourceError ironSourceError, com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        b bVar;
        if (this.o.a() && (bVar = this.f25198b.get(aVar.k())) != null) {
            com.ironsource.mediationsdk.adunit.e.a<Smash> aVar2 = this.f25197a;
            aVar2.a(aVar2.f25261b, bVar.b(m()));
        }
        IronLog.INTERNAL.verbose(c(aVar.m() + " - error = " + ironSourceError));
        this.f25199c.put(aVar.k(), C1421j.a.ISAuctionPerformanceFailedToShow);
        g(e.a.READY_TO_LOAD);
        s("", ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.a
    public final void c(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c(aVar.m()));
        if (this.f25210p == e.a.SHOWING) {
            g(e.a.READY_TO_LOAD);
        }
        c cVar = this.f25211q;
        com.ironsource.mediationsdk.adunit.c.b.a aVar2 = cVar.f25193a;
        if (aVar2.f25185a == a.EnumC0328a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            cVar.b(aVar2.f25186b);
        }
        AdInfo a10 = this.f25197a.a(aVar.o());
        tb.a aVar3 = this.f25214t;
        IronSource.AD_UNIT ad_unit = aVar3.f35593a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            F.a().c(a10);
        } else {
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                ae.a().b(a10);
                return;
            }
            ironLog.warning("ad unit not supported - " + aVar3.f35593a);
        }
    }

    public final void a(Placement placement) {
        com.ironsource.mediationsdk.adunit.d.a.a aVar;
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c("state = " + this.f25210p));
        synchronized (this.f25217w) {
            this.f25205j = placement;
            this.f25213s.f25163e.a(m());
            e.a aVar2 = this.f25210p;
            e.a aVar3 = e.a.SHOWING;
            int i10 = IronSourceError.ERROR_CODE_GENERIC;
            aVar = null;
            if (aVar2 == aVar3) {
                IronSource.AD_UNIT ad_unit = this.o.f25175a;
                if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                    i10 = IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW;
                } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    i10 = 1022;
                } else {
                    ironLog.warning("ad unit not supported - " + ad_unit);
                }
                ironSourceError = new IronSourceError(i10, "can't show ad while an ad is already showing");
            } else if (aVar2 != e.a.READY_TO_SHOW) {
                ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "show called while no ads are available");
            } else if (placement == null) {
                IronSource.AD_UNIT ad_unit2 = this.o.f25175a;
                if (ad_unit2 == IronSource.AD_UNIT.INTERSTITIAL) {
                    i10 = 1020;
                } else if (ad_unit2 == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    i10 = 1021;
                } else {
                    ironLog.warning("ad unit not supported - " + ad_unit2);
                }
                ironSourceError = new IronSourceError(i10, "empty default placement");
            } else if (k.a(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName(), this.o.f25175a)) {
                ironSourceError = new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, "placement " + placement.getPlacementName() + " is capped");
            } else {
                ironSourceError = null;
            }
            if (ironSourceError != null) {
                IronLog.API.error(c(ironSourceError.getErrorMessage()));
                s("", ironSourceError);
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                Iterator it = this.f25197a.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.ironsource.mediationsdk.adunit.d.a.a aVar4 = (com.ironsource.mediationsdk.adunit.d.a.a) it.next();
                    if (aVar4.a()) {
                        g(e.a.SHOWING);
                        aVar4.a(true);
                        aVar = aVar4;
                        break;
                    }
                    if (aVar4.h() != null) {
                        stringBuffer.append(aVar4.k() + w.bE + aVar4.h() + ",");
                    }
                    aVar4.a(false);
                    IronLog.INTERNAL.verbose(c(aVar4.m() + " - not ready to show"));
                }
                if (aVar == null) {
                    s(stringBuffer.toString(), ErrorBuilder.buildNoAdsToShowError(this.o.f25175a.toString()));
                }
            }
        }
        if (aVar != null) {
            Placement placement2 = this.f25205j;
            if (this.o.f25181h.b()) {
                this.f25212r.a();
            }
            aVar.a(placement2);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.c.e
    public final boolean b() {
        boolean z10;
        synchronized (this.f25217w) {
            z10 = this.f25210p == e.a.READY_TO_SHOW;
        }
        if (!z10) {
            return false;
        }
        if (this.f25206k && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) {
            return false;
        }
        Iterator it = this.f25197a.a().iterator();
        while (it.hasNext()) {
            if (((com.ironsource.mediationsdk.adunit.d.a.a) it.next()).a()) {
                return true;
            }
        }
        return false;
    }
}
