package com.huawei.openalliance.ad.ppskit.beans.vast;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class VideoClicks {
    private ClickThrough clickThrough;
    private List<Tracking> videoTrackings;

    public final ClickThrough a() {
        return this.clickThrough;
    }

    public final void b(ClickThrough clickThrough) {
        this.clickThrough = clickThrough;
    }

    public final List<Tracking> c() {
        return this.videoTrackings;
    }

    public final void d(ArrayList arrayList) {
        this.videoTrackings = arrayList;
    }
}
