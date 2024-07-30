package com.huawei.openalliance.ad.ppskit.beans.vast;

import com.huawei.openalliance.ad.ppskit.utils.y1;
import ma.a;

/* loaded from: classes2.dex */
public class Impression {

    /* renamed from: id, reason: collision with root package name */
    private String f22468id;

    @a
    private String url;

    public Impression(String str, String str2) {
        this.f22468id = str;
        this.url = str2;
    }

    public final String a() {
        return this.url;
    }

    public final String toString() {
        return "Impression{id='" + this.f22468id + "', url='" + y1.j(this.url) + "'}";
    }
}
