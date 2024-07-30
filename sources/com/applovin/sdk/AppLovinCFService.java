package com.applovin.sdk;

import android.app.Activity;

/* loaded from: classes.dex */
public interface AppLovinCFService {

    /* loaded from: classes.dex */
    public enum CFType {
        UNKNOWN,
        STANDARD,
        DETAILED
    }

    /* loaded from: classes.dex */
    public interface OnCFCompletionCallback {
        void onFlowCompleted(AppLovinCFError appLovinCFError);
    }

    CFType getCFType();

    void scf(Activity activity, OnCFCompletionCallback onCFCompletionCallback);
}
