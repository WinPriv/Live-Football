package com.anythink.core.api;

import com.anythink.core.api.ATAdConst;
import java.util.Map;

/* loaded from: classes.dex */
public interface ATBiddingNotice {
    public static final String ADN_ID = "adn_id";

    ATAdConst.CURRENCY getNoticePriceCurrency();

    void notifyBidDisplay(boolean z10, double d10);

    void notifyBidLoss(String str, double d10, Map<String, Object> map);

    void notifyBidWin(double d10);
}
