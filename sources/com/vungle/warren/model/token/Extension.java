package com.vungle.warren.model.token;

import n8.b;

/* loaded from: classes2.dex */
public class Extension {

    @b("is_sideload_enabled")
    private Boolean isSideloadEnabled;

    @b("sd_card_available")
    private Boolean sdCardAvailable;

    @b("sound_enabled")
    private Boolean soundEnabled;

    public Extension(Boolean bool, Boolean bool2, Boolean bool3) {
        this.isSideloadEnabled = bool;
        this.sdCardAvailable = bool2;
        this.soundEnabled = bool3;
    }
}
