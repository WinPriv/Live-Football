package com.applovin.mediation.nativeAds.adPlacer;

import com.applovin.impl.sdk.y;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* renamed from: a, reason: collision with root package name */
    private final String f19671a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Integer> f19672b = new TreeSet();

    /* renamed from: c, reason: collision with root package name */
    private int f19673c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f19674d = 256;

    /* renamed from: e, reason: collision with root package name */
    private int f19675e = 4;

    public MaxAdPlacerSettings(String str) {
        this.f19671a = str;
    }

    public void addFixedPosition(int i10) {
        this.f19672b.add(Integer.valueOf(i10));
    }

    public String getAdUnitId() {
        return this.f19671a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f19672b;
    }

    public int getMaxAdCount() {
        return this.f19674d;
    }

    public int getMaxPreloadedAdCount() {
        return this.f19675e;
    }

    public int getRepeatingInterval() {
        return this.f19673c;
    }

    public boolean hasValidPositioning() {
        if (this.f19672b.isEmpty() && !isRepeatingEnabled()) {
            return false;
        }
        return true;
    }

    public boolean isRepeatingEnabled() {
        if (this.f19673c >= 2) {
            return true;
        }
        return false;
    }

    public void resetFixedPositions() {
        this.f19672b.clear();
    }

    public void setMaxAdCount(int i10) {
        this.f19674d = i10;
    }

    public void setMaxPreloadedAdCount(int i10) {
        this.f19675e = i10;
    }

    public void setRepeatingInterval(int i10) {
        if (i10 >= 2) {
            this.f19673c = i10;
            y.f("MaxAdPlacerSettings", "Repeating interval set to " + i10);
            return;
        }
        this.f19673c = 0;
        y.h("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i10 + ", which is less than minimum value of 2");
    }

    public String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.f19671a + "', fixedPositions=" + this.f19672b + ", repeatingInterval=" + this.f19673c + ", maxAdCount=" + this.f19674d + ", maxPreloadedAdCount=" + this.f19675e + '}';
    }
}
