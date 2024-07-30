package com.vungle.warren.model.admarkup;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class AdMarkup implements Serializable {
    String[] impressions = new String[0];

    public abstract String getEventId();

    public String[] getImpressions() {
        return this.impressions;
    }

    public abstract int getVersion();
}
