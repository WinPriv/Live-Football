package com.applovin.sdk;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Locale;
import s.f;

/* loaded from: classes.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;

    /* renamed from: a, reason: collision with root package name */
    private final String f19688a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19689b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19690c;
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, "BANNER");
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, "LEADER");
    public static final AppLovinAdSize MREC = new AppLovinAdSize(300, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, "MREC");
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, "INTER");
    public static final AppLovinAdSize CROSS_PROMO = new AppLovinAdSize(-1, -1, "XPROMO");
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, "NATIVE");

    private AppLovinAdSize(int i10, int i11, String str) {
        this.f19689b = i10;
        this.f19690c = i11;
        this.f19688a = str;
    }

    public static AppLovinAdSize fromString(String str) {
        if ("BANNER".equalsIgnoreCase(str)) {
            return BANNER;
        }
        if ("MREC".equalsIgnoreCase(str)) {
            return MREC;
        }
        if ("LEADER".equalsIgnoreCase(str)) {
            return LEADER;
        }
        if (!"INTERSTITIAL".equalsIgnoreCase(str) && !"INTER".equalsIgnoreCase(str)) {
            if ("XPROMO".equalsIgnoreCase(str)) {
                return CROSS_PROMO;
            }
            if ("NATIVE".equalsIgnoreCase(str)) {
                return NATIVE;
            }
            throw new IllegalArgumentException(f.b("Unknown Ad Size: ", str));
        }
        return INTERSTITIAL;
    }

    public int getHeight() {
        return this.f19690c;
    }

    public String getLabel() {
        return this.f19688a.toUpperCase(Locale.ENGLISH);
    }

    public int getWidth() {
        return this.f19689b;
    }

    public String toString() {
        return getLabel();
    }
}
