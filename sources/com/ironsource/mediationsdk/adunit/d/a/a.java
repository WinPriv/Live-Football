package com.ironsource.mediationsdk.adunit.d.a;

import com.huawei.hms.ads.ep;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.adunit.c.a.a;
import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;

/* loaded from: classes2.dex */
public abstract class a<Listener extends com.ironsource.mediationsdk.adunit.c.a.a> extends c<Listener> implements AdapterAdInteractionListener {
    public BaseAdInteractionAdapter<?, AdapterAdInteractionListener> o;

    /* JADX WARN: Multi-variable type inference failed */
    public a(com.ironsource.mediationsdk.adunit.d.a aVar, BaseAdInteractionAdapter<?, ?> baseAdInteractionAdapter, com.ironsource.mediationsdk.model.a aVar2, Listener listener) {
        super(aVar, baseAdInteractionAdapter, aVar2, listener);
        this.o = baseAdInteractionAdapter;
    }

    public final void a(Placement placement) {
        int i10;
        IronLog.INTERNAL.verbose(d("placementName = " + placement.getPlacementName()));
        try {
            this.f = placement;
            c(c.a.SHOWING);
            this.f25243d.f25163e.a(q());
            this.o.showAd(this.f25248j, this);
        } catch (Throwable th) {
            String str = "showAd - exception = " + th.getLocalizedMessage();
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error(d(str));
            c(c.a.FAILED);
            d dVar = this.f25243d;
            if (dVar != null) {
                dVar.f.m(str);
            }
            IronSource.AD_UNIT ad_unit = this.f25240a.f25231a;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                i10 = IronSourceError.ERROR_IS_SHOW_EXCEPTION;
            } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                i10 = IronSourceError.ERROR_RV_SHOW_EXCEPTION;
            } else {
                ironLog.warning("ad unit not supported - " + ad_unit);
                i10 = IronSourceError.ERROR_CODE_GENERIC;
            }
            onAdShowFailed(i10, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.d.a.c
    public final void c() {
        super.c();
        BaseAdInteractionAdapter<?, AdapterAdInteractionListener> baseAdInteractionAdapter = this.o;
        if (baseAdInteractionAdapter != null) {
            try {
                baseAdInteractionAdapter.releaseMemory();
            } catch (Exception e10) {
                String format = String.format("releaseMemory - exception = ", e10);
                IronLog.INTERNAL.verbose(d(format));
                d dVar = this.f25243d;
                if (dVar != null) {
                    dVar.f.m(format);
                }
            }
            this.o = null;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        String str;
        IronLog.INTERNAL.verbose(d(""));
        synchronized (this.f25252n) {
            if (this.f25244e == c.a.SHOWING) {
                c(c.a.NONE);
                if (this.f25243d != null) {
                    String str2 = "";
                    if (this.f25240a.f25231a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                        String c10 = ((com.ironsource.mediationsdk.adunit.c.a.a) this.f25241b).c();
                        StringBuilder sb2 = new StringBuilder("otherInstanceAvailable = ");
                        if (c10.length() > 0) {
                            str = "true|".concat(c10);
                        } else {
                            str = ep.V;
                        }
                        sb2.append(str);
                        str2 = sb2.toString();
                    }
                    this.f25243d.f25163e.a(q(), str2);
                }
                ((com.ironsource.mediationsdk.adunit.c.a.a) this.f25241b).c(this);
                return;
            }
            d dVar = this.f25243d;
            if (dVar != null) {
                dVar.f.k("unexpected closed for " + m());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        IronLog.INTERNAL.verbose(d(""));
        d dVar = this.f25243d;
        if (dVar != null) {
            dVar.f25163e.f(q());
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.f25241b).e(this);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdOpened() {
        IronLog.INTERNAL.verbose(d(""));
        d dVar = this.f25243d;
        if (dVar != null) {
            dVar.f25163e.c(q());
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.f25241b).b((a<?>) this);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowFailed(int i10, String str) {
        IronLog.INTERNAL.verbose(d("error = " + i10 + ", " + str));
        if (this.f25244e == c.a.SHOWING) {
            c(c.a.FAILED);
            d dVar = this.f25243d;
            if (dVar != null) {
                dVar.f25163e.a(q(), i10, str, "");
            }
            ((com.ironsource.mediationsdk.adunit.c.a.a) this.f25241b).a(new IronSourceError(i10, str), (a<?>) this);
            return;
        }
        d dVar2 = this.f25243d;
        if (dVar2 != null) {
            dVar2.f.j(String.format("unexpected show failed for %s, error - %d, %s", m(), Integer.valueOf(i10), str));
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowSuccess() {
        IronLog.INTERNAL.verbose(d(""));
        d dVar = this.f25243d;
        if (dVar != null) {
            dVar.f25163e.b(q());
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.f25241b).a((a<?>) this);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        IronLog.INTERNAL.verbose(d(""));
        d dVar = this.f25243d;
        if (dVar != null) {
            dVar.f25163e.e(q());
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.f25241b).d(this);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        IronLog.INTERNAL.verbose(d(""));
        d dVar = this.f25243d;
        if (dVar != null) {
            dVar.f25163e.g(q());
        }
    }

    public final void a(boolean z10) {
        d dVar = this.f25243d;
        if (dVar != null) {
            dVar.f25163e.a(z10);
        }
    }

    public final boolean a() {
        if (this.f25248j != null) {
            try {
                return i() ? this.f25244e == c.a.LOADED && this.o.isAdAvailable(this.f25248j) : this.o.isAdAvailable(this.f25248j);
            } catch (Throwable th) {
                String str = "isReadyToShow - exception = " + th.getLocalizedMessage();
                IronLog.INTERNAL.error(d(str));
                d dVar = this.f25243d;
                if (dVar != null) {
                    dVar.f.m(str);
                }
            }
        }
        return false;
    }
}
