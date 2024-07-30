package com.huawei.openalliance.ad.inter.data;

import com.huawei.openalliance.ad.annotations.DataKeep;

@DataKeep
/* loaded from: classes2.dex */
public class JSFeedbackInfo extends FeedbackInfo {
    private String idStr;

    public JSFeedbackInfo(FeedbackInfo feedbackInfo) {
        m(feedbackInfo.p());
        l(feedbackInfo.q());
        Code(feedbackInfo.k());
        this.idStr = String.valueOf(feedbackInfo.p());
    }
}
