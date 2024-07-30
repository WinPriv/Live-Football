package com.iab.omid.library.vungle.adsession.media;

import com.vungle.warren.model.Advertisement;

/* loaded from: classes2.dex */
public enum Position {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL(Advertisement.KEY_POSTROLL),
    STANDALONE("standalone");

    private final String position;

    Position(String str) {
        this.position = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.position;
    }
}
