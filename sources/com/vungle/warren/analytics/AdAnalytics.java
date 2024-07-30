package com.vungle.warren.analytics;

import m8.q;

/* loaded from: classes2.dex */
public interface AdAnalytics {
    String[] ping(String[] strArr);

    String[] retryUnsent();

    void ri(q qVar);

    void saveVungleUrls(String[] strArr);
}
