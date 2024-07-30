package com.vungle.warren.model.token;

import com.vungle.warren.model.Cookie;
import n8.b;

/* loaded from: classes2.dex */
public class Consent {

    @b("ccpa")
    private Ccpa ccpa;

    @b(Cookie.COPPA_KEY)
    private Coppa coppa;

    @b("gdpr")
    private Gdpr gdpr;

    public Consent(Ccpa ccpa, Gdpr gdpr, Coppa coppa) {
        this.ccpa = ccpa;
        this.gdpr = gdpr;
        this.coppa = coppa;
    }

    public Ccpa getCcpa() {
        return this.ccpa;
    }

    public Coppa getCoppa() {
        return this.coppa;
    }

    public Gdpr getGdpr() {
        return this.gdpr;
    }
}
