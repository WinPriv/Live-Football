package com.iab.omid.library.ironsrc.adsession;

import com.anythink.expressad.foundation.g.a.f;

/* loaded from: classes2.dex */
public enum AdSessionContextType {
    HTML("html"),
    NATIVE(f.f9813a),
    JAVASCRIPT("javascript");

    private final String typeString;

    AdSessionContextType(String str) {
        this.typeString = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.typeString;
    }
}
