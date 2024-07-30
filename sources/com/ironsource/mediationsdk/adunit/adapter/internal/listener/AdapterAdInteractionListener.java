package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;

/* loaded from: classes2.dex */
public interface AdapterAdInteractionListener extends AdapterAdListener {
    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    /* synthetic */ void onAdClicked();

    void onAdClosed();

    void onAdEnded();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    /* synthetic */ void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String str);

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    /* synthetic */ void onAdLoadSuccess();

    void onAdOpened();

    void onAdShowFailed(int i10, String str);

    void onAdShowSuccess();

    void onAdStarted();

    void onAdVisible();
}
