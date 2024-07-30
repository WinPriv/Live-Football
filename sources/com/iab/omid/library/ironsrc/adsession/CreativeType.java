package com.iab.omid.library.ironsrc.adsession;

import com.anythink.expressad.exoplayer.k.o;

/* loaded from: classes2.dex */
public enum CreativeType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO(o.f9069b);

    private final String creativeType;

    CreativeType(String str) {
        this.creativeType = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.creativeType;
    }
}
