package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public interface f extends OfferwallListener {
    void a(boolean z10, IronSourceError ironSourceError);

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    /* synthetic */ void onGetOfferwallCreditsFailed(IronSourceError ironSourceError);

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    /* synthetic */ boolean onOfferwallAdCredited(int i10, int i11, boolean z10);

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    /* synthetic */ void onOfferwallAvailable(boolean z10);

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    /* synthetic */ void onOfferwallClosed();

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    /* synthetic */ void onOfferwallOpened();

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    /* synthetic */ void onOfferwallShowFailed(IronSourceError ironSourceError);
}
