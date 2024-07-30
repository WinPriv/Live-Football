package com.ironsource.mediationsdk.adunit.adapter.internal;

import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public interface AdapterBidderInterface {
    void collectBiddingData(JSONObject jSONObject, BiddingDataCallback biddingDataCallback);

    Map<String, Object> getBiddingData(JSONObject jSONObject);
}
