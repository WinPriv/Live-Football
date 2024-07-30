package com.vungle.warren.ui;

/* loaded from: classes2.dex */
public interface PresenterAdOpenCallback {

    /* loaded from: classes2.dex */
    public enum AdOpenType {
        DEFAULT,
        DEEP_LINK
    }

    void onAdOpenType(AdOpenType adOpenType);
}
