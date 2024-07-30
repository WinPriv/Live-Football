package com.huawei.hms.ads;

import com.iab.omid.library.huawei.adsession.AdEvents;
import com.iab.omid.library.huawei.adsession.AdSession;
import com.iab.omid.library.huawei.adsession.media.VastProperties;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class gr extends gs implements gw {
    private static final String Code = "DisplayEventAgent";
    private static boolean V = hb.Code(hb.f21700e);
    private final List<AdEvents> I = new ArrayList();

    @Override // com.huawei.hms.ads.gw
    public void Code(hl hlVar) {
        if (hlVar instanceof gp) {
            List<AdSession> V2 = ((gp) hlVar).V();
            if (V2.isEmpty()) {
                return;
            }
            for (AdSession adSession : V2) {
                if (adSession != null) {
                    this.I.add(AdEvents.createAdEvents(adSession));
                }
            }
        }
    }

    @Override // com.huawei.hms.ads.gs, com.huawei.hms.ads.hq
    public void D() {
        if (this.I.isEmpty()) {
            ex.I(Code, "impressionOccurred, mAdEventList isEmpty");
            return;
        }
        try {
            Iterator<AdEvents> it = this.I.iterator();
            while (it.hasNext()) {
                it.next().impressionOccurred();
            }
        } catch (IllegalStateException unused) {
            ex.V(Code, "impressionOccurred, fail");
        }
    }

    @Override // com.huawei.hms.ads.gs, com.huawei.hms.ads.hq
    public void L() {
        ex.V(Code, "load");
        if (this.I.isEmpty()) {
            ex.V(Code, "load, AdEventList isEmpty");
            return;
        }
        try {
            Iterator<AdEvents> it = this.I.iterator();
            while (it.hasNext()) {
                it.next().loaded();
            }
        } catch (IllegalStateException unused) {
            ex.V(Code, "loaded, fail");
        }
    }

    @Override // com.huawei.hms.ads.gw
    public void V() {
        this.I.clear();
    }

    @Override // com.huawei.hms.ads.gs, com.huawei.hms.ads.hq
    public void Code(hu huVar) {
        VastProperties C;
        ex.V(Code, "load vastPropertiesWrapper");
        if (huVar == null || !hu.Code() || (C = huVar.C()) == null) {
            return;
        }
        Code(C);
    }

    @Override // com.huawei.hms.ads.gs
    public void Code(VastProperties vastProperties) {
        if (this.I.isEmpty()) {
            return;
        }
        try {
            Iterator<AdEvents> it = this.I.iterator();
            while (it.hasNext()) {
                it.next().loaded(vastProperties);
            }
        } catch (IllegalStateException unused) {
            ex.V(Code, "loaded, fail");
        }
    }

    public static boolean Code() {
        return V;
    }
}
