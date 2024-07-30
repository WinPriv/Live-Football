package com.vungle.warren.model.token;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import n8.b;

/* loaded from: classes2.dex */
public class Ccpa {
    public static final String OPTED_IN = "opted_in";
    public static final String OPTED_OUT = "opted_out";

    @b("status")
    public String status;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Status {
    }

    public Ccpa(String str) {
        this.status = str;
    }
}
