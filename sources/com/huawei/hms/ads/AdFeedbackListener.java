package com.huawei.hms.ads;

import com.huawei.hms.ads.annotation.AllApi;

@AllApi
/* loaded from: classes2.dex */
public interface AdFeedbackListener {
    void onAdDisliked();

    void onAdFeedbackShowFailed();

    void onAdLiked();
}
