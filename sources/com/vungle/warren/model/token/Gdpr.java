package com.vungle.warren.model.token;

import com.huawei.openalliance.ad.constant.av;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import n8.b;

/* loaded from: classes2.dex */
public class Gdpr {
    public static final String OPTED_IN = "opted_in";
    public static final String OPTED_OUT = "opted_out";
    public static final String OPTED_OUT_BY_TIMEOUT = "opted_out_by_timeout";
    public static final String UNKNOWN = "unknown";

    @b("message_version")
    private String messageVersion;

    @b(av.aq)
    private String source;

    @b("status")
    private String status;

    @b("timestamp")
    private Long timestamp;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Status {
    }

    public Gdpr(String str, String str2, String str3, Long l10) {
        this.status = str;
        this.source = str2;
        this.messageVersion = str3;
        this.timestamp = l10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Gdpr gdpr = (Gdpr) obj;
        if (this.status.equals(gdpr.status) && this.source.equals(gdpr.source) && this.messageVersion.equals(gdpr.messageVersion) && this.timestamp.equals(gdpr.timestamp)) {
            return true;
        }
        return false;
    }

    public String getMessageVersion() {
        return this.messageVersion;
    }

    public String getSource() {
        return this.source;
    }

    public String getStatus() {
        return this.status;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }
}
