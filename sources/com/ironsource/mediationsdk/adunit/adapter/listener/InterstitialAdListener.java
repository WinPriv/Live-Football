package com.ironsource.mediationsdk.adunit.adapter.listener;

import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;

/* loaded from: classes2.dex */
public interface InterstitialAdListener extends AdapterAdInteractionListener {
    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    /* synthetic */ void onAdClicked();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    /* synthetic */ void onAdClosed();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    /* synthetic */ void onAdEnded();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    /* synthetic */ void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String str);

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    /* synthetic */ void onAdLoadSuccess();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    /* synthetic */ void onAdOpened();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    /* synthetic */ void onAdShowFailed(int i10, String str);

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    /* synthetic */ void onAdShowSuccess();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    /* synthetic */ void onAdStarted();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    /* synthetic */ void onAdVisible();
}
