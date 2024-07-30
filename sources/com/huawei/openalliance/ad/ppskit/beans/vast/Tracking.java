package com.huawei.openalliance.ad.ppskit.beans.vast;

import ma.a;

/* loaded from: classes2.dex */
public class Tracking {
    private String event;

    @a
    private String url;

    public Tracking(String str, String str2) {
        this.url = str;
        this.event = str2;
    }

    public final String a() {
        return this.url;
    }
}
