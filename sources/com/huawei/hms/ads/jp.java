package com.huawei.hms.ads;

/* loaded from: classes2.dex */
public enum jp {
    BACK("back"),
    FORWARD("forward"),
    SAVE_PAGE("savePage"),
    REFRESH("refresh"),
    ADD_TO("addTo"),
    FIND_IN_PAGE("findInPage"),
    TRANSLATE("translate"),
    OPEN_IN_BROWSER("openInBrowser"),
    NONE("none");

    private String L;

    jp(String str) {
        this.L = str;
    }

    public String Code() {
        return this.L;
    }
}
