package com.anythink.core.api;

/* loaded from: classes.dex */
public interface ATBiddingListener {
    void onC2SBidResult(ATBiddingResult aTBiddingResult);

    void onC2SBiddingResultWithCache(ATBiddingResult aTBiddingResult, BaseAd baseAd);
}
