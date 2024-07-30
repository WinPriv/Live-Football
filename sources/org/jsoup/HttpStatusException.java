package org.jsoup;

import java.io.IOException;

/* loaded from: classes2.dex */
public class HttpStatusException extends IOException {

    /* renamed from: s, reason: collision with root package name */
    public final int f33888s;

    /* renamed from: t, reason: collision with root package name */
    public final String f33889t;

    public HttpStatusException(String str, int i10, String str2) {
        super(str + ". Status=" + i10 + ", URL=[" + str2 + "]");
        this.f33888s = i10;
        this.f33889t = str2;
    }

    public int getStatusCode() {
        return this.f33888s;
    }

    public String getUrl() {
        return this.f33889t;
    }
}
