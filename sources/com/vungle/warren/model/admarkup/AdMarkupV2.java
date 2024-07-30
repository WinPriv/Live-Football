package com.vungle.warren.model.admarkup;

import com.anythink.expressad.foundation.d.d;
import com.vungle.warren.model.Advertisement;
import m8.n;
import m8.q;
import m8.r;

/* loaded from: classes2.dex */
public class AdMarkupV2 extends AdMarkup {
    private final String advertisementJsonObject;
    private final String placementId;

    public AdMarkupV2(q qVar, String[] strArr) {
        this.impressions = strArr;
        n q10 = qVar.t(d.f9543h).q(0);
        this.placementId = q10.j().s("placement_reference_id").m();
        this.advertisementJsonObject = q10.j().toString();
    }

    public Advertisement getAdvertisement() {
        Advertisement advertisement = new Advertisement(r.b(this.advertisementJsonObject).j());
        advertisement.setPlacementId(this.placementId);
        advertisement.setHeaderBidding(true);
        return advertisement;
    }

    @Override // com.vungle.warren.model.admarkup.AdMarkup
    public String getEventId() {
        return getAdvertisement().getId();
    }

    @Override // com.vungle.warren.model.admarkup.AdMarkup
    public int getVersion() {
        return 2;
    }
}
