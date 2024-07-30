package com.huawei.openalliance.ad.ppskit.beans.vast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class LinearCreative {
    private int duration;
    private List<VastIcon> icons;
    private List<VastMediaFile> mediaFiles;
    private Map<String, List<Tracking>> trackingEvents;
    private VideoClicks videoClicks;

    public final int a() {
        return this.duration;
    }

    public final void b(int i10) {
        this.duration = i10;
    }

    public final void c(VideoClicks videoClicks) {
        this.videoClicks = videoClicks;
    }

    public final void d(ArrayList arrayList) {
        this.mediaFiles = arrayList;
    }

    public final void e(HashMap hashMap) {
        this.trackingEvents = hashMap;
    }

    public final List<VastMediaFile> f() {
        return this.mediaFiles;
    }

    public final void g(ArrayList arrayList) {
        this.icons = arrayList;
    }

    public final Map<String, List<Tracking>> h() {
        return this.trackingEvents;
    }

    public final List<VastIcon> i() {
        return this.icons;
    }

    public final VideoClicks j() {
        return this.videoClicks;
    }
}
