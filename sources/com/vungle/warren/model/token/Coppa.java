package com.vungle.warren.model.token;

import com.vungle.warren.model.Cookie;
import n8.b;

/* loaded from: classes2.dex */
public class Coppa {

    @b(Cookie.COPPA_STATUS_KEY)
    private boolean isCoppa;

    public Coppa(boolean z10) {
        this.isCoppa = z10;
    }

    public boolean getIsCoppa() {
        return this.isCoppa;
    }
}
