package com.vungle.warren.ui;

import com.huawei.openalliance.ad.constant.av;
import com.vungle.warren.model.Placement;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.utility.ActivityManager;

/* loaded from: classes2.dex */
public class PresenterAppLeftCallback implements ActivityManager.LeftApplicationCallback {
    private final AdContract.AdvertisementPresenter.EventListener bus;
    private final Placement placement;

    public PresenterAppLeftCallback(AdContract.AdvertisementPresenter.EventListener eventListener, Placement placement) {
        this.bus = eventListener;
        this.placement = placement;
    }

    @Override // com.vungle.warren.utility.ActivityManager.LeftApplicationCallback
    public void onLeftApplication() {
        String id2;
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            Placement placement = this.placement;
            if (placement == null) {
                id2 = null;
            } else {
                id2 = placement.getId();
            }
            eventListener.onNext(av.ai, "adLeftApplication", id2);
        }
    }
}
