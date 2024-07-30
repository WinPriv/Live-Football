package com.anythink.core.api;

/* loaded from: classes.dex */
public class ATAdStatusInfo {
    private ATAdInfo mATTopAdInfo;
    private boolean mIsLoading;
    private boolean mIsReady;

    public ATAdStatusInfo(boolean z10, boolean z11, ATAdInfo aTAdInfo) {
        this.mIsLoading = z10;
        this.mIsReady = z11;
        this.mATTopAdInfo = aTAdInfo;
    }

    public ATAdInfo getATTopAdInfo() {
        return this.mATTopAdInfo;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public boolean isReady() {
        return this.mIsReady;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ATAdStatusInfo{isLoading=");
        sb2.append(this.mIsLoading);
        sb2.append(", isReady=");
        sb2.append(this.mIsReady);
        sb2.append(", topAdInfo=");
        Object obj = this.mATTopAdInfo;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append('}');
        return sb2.toString();
    }
}
