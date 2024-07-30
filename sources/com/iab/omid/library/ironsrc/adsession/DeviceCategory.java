package com.iab.omid.library.ironsrc.adsession;

/* loaded from: classes2.dex */
public enum DeviceCategory {
    CTV("ctv"),
    MOBILE("mobile"),
    OTHER("other");

    private final String deviceCategory;

    DeviceCategory(String str) {
        this.deviceCategory = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.deviceCategory;
    }
}
