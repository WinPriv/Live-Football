package com.huawei.openalliance.ad.views;

import com.huawei.hms.ads.fn;
import com.huawei.openalliance.ad.views.PlacementMediaView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class n implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PlacementMediaView f24150s;

    public n(PlacementMediaView placementMediaView) {
        this.f24150s = placementMediaView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PlacementMediaView placementMediaView = this.f24150s;
        if (placementMediaView.f24040m0) {
            boolean z10 = placementMediaView.f24041n0;
            CopyOnWriteArraySet copyOnWriteArraySet = placementMediaView.f24030c0;
            if (z10) {
                PlacementMediaView.a aVar = placementMediaView.f24043p0;
                aVar.removeMessages(1);
                aVar.sendEmptyMessage(1);
                if (!placementMediaView.f24036i0) {
                    placementMediaView.f24036i0 = true;
                    Iterator it = copyOnWriteArraySet.iterator();
                    while (it.hasNext()) {
                        ((fn) it.next()).Code(placementMediaView.f24039l0, placementMediaView.f24038k0, placementMediaView.f24031d0);
                    }
                }
                if (0 == placementMediaView.f24032e0) {
                    placementMediaView.f24032e0 = System.currentTimeMillis();
                }
                if (placementMediaView.f24034g0 != 0) {
                    placementMediaView.f24035h0 = (System.currentTimeMillis() - placementMediaView.f24034g0) + placementMediaView.f24035h0;
                    return;
                }
                return;
            }
            placementMediaView.f24036i0 = false;
            placementMediaView.f24037j0 = true;
            Iterator it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                ((fn) it2.next()).Code(placementMediaView.f24039l0, placementMediaView.f24038k0, 0, -1, -1);
            }
            return;
        }
        placementMediaView.f24042o0 = true;
    }
}
