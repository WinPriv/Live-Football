package com.vungle.warren.model;

import android.text.TextUtils;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.utility.TimeoutProvider;
import java.util.concurrent.TimeUnit;
import m8.q;

/* loaded from: classes2.dex */
public class GdprCookie {
    public static String CONSENT_MESSAGE_VERSION = "consent_message_version";
    public static String CONSENT_SOURCE = "consent_source";
    public static String CONSENT_STATUS = "consent_status";
    public static String NO_INTERACTION = "no_interaction";
    public static String TIMESTAMP = "timestamp";
    public static String UNKNOWN = "unknown";
    private final Cookie cookie;
    private Repository repository;

    public GdprCookie(Repository repository, TimeoutProvider timeoutProvider) {
        this.repository = repository;
        Cookie cookie = (Cookie) repository.load(Cookie.CONSENT_COOKIE, Cookie.class).get(timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS);
        this.cookie = cookie == null ? createDefaultCookie() : cookie;
    }

    private Cookie createDefaultCookie() {
        Cookie cookie = new Cookie(Cookie.CONSENT_COOKIE);
        cookie.putValue(CONSENT_MESSAGE_VERSION, "");
        cookie.putValue(CONSENT_STATUS, UNKNOWN);
        cookie.putValue(CONSENT_SOURCE, NO_INTERACTION);
        cookie.putValue(TIMESTAMP, 0L);
        return cookie;
    }

    public String getConsentStatus() {
        Cookie cookie = this.cookie;
        if (cookie != null) {
            return cookie.getString(CONSENT_STATUS);
        }
        return "unknown";
    }

    public Cookie getCookie() {
        return this.cookie;
    }

    public String getMessageVersion() {
        Cookie cookie = this.cookie;
        if (cookie != null) {
            return cookie.getString(CONSENT_MESSAGE_VERSION);
        }
        return "";
    }

    public String getSource() {
        Cookie cookie = this.cookie;
        if (cookie != null) {
            return cookie.getString(CONSENT_SOURCE);
        }
        return NO_INTERACTION;
    }

    public Long getTimeStamp() {
        long j10;
        Cookie cookie = this.cookie;
        if (cookie != null) {
            j10 = cookie.getLong(TIMESTAMP).longValue();
        } else {
            j10 = 0;
        }
        return Long.valueOf(j10);
    }

    public void save(q qVar) throws DatabaseHelper.DBException {
        boolean z10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (this.repository == null) {
            return;
        }
        if (JsonUtil.hasNonNull(qVar, "is_country_data_protected") && qVar.s("is_country_data_protected").e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str6 = "";
        if (!JsonUtil.hasNonNull(qVar, "consent_title")) {
            str = "";
        } else {
            str = qVar.s("consent_title").m();
        }
        if (!JsonUtil.hasNonNull(qVar, "consent_message")) {
            str2 = "";
        } else {
            str2 = qVar.s("consent_message").m();
        }
        if (!JsonUtil.hasNonNull(qVar, "consent_message_version")) {
            str3 = "";
        } else {
            str3 = qVar.s("consent_message_version").m();
        }
        if (!JsonUtil.hasNonNull(qVar, "button_accept")) {
            str4 = "";
        } else {
            str4 = qVar.s("button_accept").m();
        }
        if (!JsonUtil.hasNonNull(qVar, "button_deny")) {
            str5 = "";
        } else {
            str5 = qVar.s("button_deny").m();
        }
        this.cookie.putValue("is_country_data_protected", Boolean.valueOf(z10));
        Cookie cookie = this.cookie;
        if (TextUtils.isEmpty(str)) {
            str = "Targeted Ads";
        }
        cookie.putValue("consent_title", str);
        Cookie cookie2 = this.cookie;
        if (TextUtils.isEmpty(str2)) {
            str2 = "To receive more relevant ad content based on your interactions with our ads, click \"I Consent\" below. Either way, you will see the same amount of ads.";
        }
        cookie2.putValue("consent_message", str2);
        if (!"publisher".equalsIgnoreCase(this.cookie.getString(CONSENT_SOURCE))) {
            Cookie cookie3 = this.cookie;
            String str7 = CONSENT_MESSAGE_VERSION;
            if (!TextUtils.isEmpty(str3)) {
                str6 = str3;
            }
            cookie3.putValue(str7, str6);
        }
        Cookie cookie4 = this.cookie;
        if (TextUtils.isEmpty(str4)) {
            str4 = "I Consent";
        }
        cookie4.putValue("button_accept", str4);
        Cookie cookie5 = this.cookie;
        if (TextUtils.isEmpty(str5)) {
            str5 = "I Do Not Consent";
        }
        cookie5.putValue("button_deny", str5);
        this.repository.save(this.cookie);
    }

    public GdprCookie(Cookie cookie) {
        this.cookie = cookie;
    }
}
