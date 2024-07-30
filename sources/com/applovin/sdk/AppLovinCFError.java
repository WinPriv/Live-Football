package com.applovin.sdk;

/* loaded from: classes.dex */
public interface AppLovinCFError {
    public static final int ERROR_CODE_FLOW_ALREADY_IN_PROGRESS = -200;
    public static final int ERROR_CODE_INVALID_INTEGRATION = -100;
    public static final int ERROR_CODE_NOT_IN_GDPR_REGION = -300;
    public static final int ERROR_CODE_UNSPECIFIED = -1;

    int getCode();

    String getMessage();
}
