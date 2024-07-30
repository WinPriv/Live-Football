package com.iab.omid.library.ironsrc.adsession.media;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;

/* loaded from: classes2.dex */
public enum PlayerState {
    MINIMIZED("minimized"),
    COLLAPSED("collapsed"),
    NORMAL("normal"),
    EXPANDED(CallMraidJS.f7005g),
    FULLSCREEN("fullscreen");

    private final String playerState;

    PlayerState(String str) {
        this.playerState = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.playerState;
    }
}
