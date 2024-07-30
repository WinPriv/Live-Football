package com.huawei.openalliance.ad.ppskit.beans.vast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ma.a;

/* loaded from: classes2.dex */
public class NonLinearAds {

    @a
    private String nonLinearClickThrough;
    private List<NonLinear> nonLinears;
    private Map<String, List<Tracking>> trackingEvents;

    public final void a(ArrayList arrayList) {
        this.nonLinears = arrayList;
    }

    public final void b(HashMap hashMap) {
        this.trackingEvents = hashMap;
    }

    public final Map<String, List<Tracking>> c() {
        return this.trackingEvents;
    }

    public final List<NonLinear> d() {
        return this.nonLinears;
    }
}
