package com.anythink.core.api;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.e.l;

/* loaded from: classes.dex */
public class ATBiddingResult extends l {
    private ATBiddingResult(boolean z10, double d10, String str, ATBiddingNotice aTBiddingNotice, String str2, ATAdConst.CURRENCY currency) {
        super(z10, d10, str, aTBiddingNotice, str2, currency);
    }

    public static ATBiddingResult fail(String str) {
        return new ATBiddingResult(false, 0.0d, null, null, str, ATAdConst.CURRENCY.USD);
    }

    public static ATBiddingResult success(double d10, String str, ATBiddingNotice aTBiddingNotice) {
        return new ATBiddingResult(true, d10, str, aTBiddingNotice, null, ATAdConst.CURRENCY.USD);
    }

    public static ATBiddingResult success(double d10, String str, ATBiddingNotice aTBiddingNotice, ATAdConst.CURRENCY currency) {
        return new ATBiddingResult(true, d10, str, aTBiddingNotice, null, currency);
    }
}
