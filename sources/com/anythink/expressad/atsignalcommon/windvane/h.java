package com.anythink.expressad.atsignalcommon.windvane;

import com.huawei.openalliance.ad.constant.bd;
import com.huawei.openalliance.ad.constant.be;

/* loaded from: classes.dex */
public enum h {
    JS("js", "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", be.V),
    JPEG("jpep", be.V),
    PNG("png", be.Z),
    WEBP("webp", "image/webp"),
    GIF(bd.V, be.B),
    HTM("htm", "text/html"),
    HTML("html", "text/html");


    /* renamed from: j, reason: collision with root package name */
    private String f7063j;

    /* renamed from: k, reason: collision with root package name */
    private String f7064k;

    h(String str, String str2) {
        this.f7063j = str;
        this.f7064k = str2;
    }

    public final String a() {
        return this.f7063j;
    }

    public final String b() {
        return this.f7064k;
    }

    private void a(String str) {
        this.f7063j = str;
    }

    private void b(String str) {
        this.f7064k = str;
    }
}
