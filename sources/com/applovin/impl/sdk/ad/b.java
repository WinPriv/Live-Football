package com.applovin.impl.sdk.ad;

/* loaded from: classes.dex */
public enum b {
    UNKNOWN(0),
    APPLOVIN_PRIMARY_ZONE(1),
    APPLOVIN_CUSTOM_ZONE(2),
    APPLOVIN_MULTIZONE(3),
    REGULAR_AD_TOKEN(4),
    DECODED_AD_TOKEN_JSON(5);


    /* renamed from: g, reason: collision with root package name */
    private final int f18573g;

    b(int i10) {
        this.f18573g = i10;
    }

    public int a() {
        return this.f18573g;
    }

    public static b a(int i10) {
        if (i10 == 1) {
            return APPLOVIN_PRIMARY_ZONE;
        }
        if (i10 == 2) {
            return APPLOVIN_CUSTOM_ZONE;
        }
        if (i10 == 3) {
            return APPLOVIN_MULTIZONE;
        }
        if (i10 == 4) {
            return REGULAR_AD_TOKEN;
        }
        if (i10 == 5) {
            return DECODED_AD_TOKEN_JSON;
        }
        return UNKNOWN;
    }
}
