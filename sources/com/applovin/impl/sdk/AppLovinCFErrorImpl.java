package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinCFError;

/* loaded from: classes.dex */
public class AppLovinCFErrorImpl implements AppLovinCFError {

    /* renamed from: a, reason: collision with root package name */
    private int f18438a;

    /* renamed from: b, reason: collision with root package name */
    private String f18439b;

    public AppLovinCFErrorImpl(int i10, String str) {
        this.f18438a = i10;
        this.f18439b = str;
    }

    @Override // com.applovin.sdk.AppLovinCFError
    public int getCode() {
        return this.f18438a;
    }

    @Override // com.applovin.sdk.AppLovinCFError
    public String getMessage() {
        return this.f18439b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppLovinConsentFlowErrorImpl{code=");
        sb2.append(this.f18438a);
        sb2.append(", message='");
        return a3.l.p(sb2, this.f18439b, "'}");
    }
}
