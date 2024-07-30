package com.huawei.openalliance.ad.constant;

import com.vungle.warren.model.Advertisement;

/* loaded from: classes2.dex */
public enum bw {
    HTTP("http://"),
    HTTPS("https://"),
    FILE(Advertisement.FILE_SCHEME),
    CONTENT("content://"),
    ASSET("asset://"),
    RES("res://");

    String S;

    bw(String str) {
        this.S = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.S;
    }
}
