package org.jsoup;

import java.io.IOException;

/* loaded from: classes2.dex */
public class UnsupportedMimeTypeException extends IOException {

    /* renamed from: s, reason: collision with root package name */
    public final String f33890s;

    /* renamed from: t, reason: collision with root package name */
    public final String f33891t;

    public UnsupportedMimeTypeException(String str, String str2, String str3) {
        super(str);
        this.f33890s = str2;
        this.f33891t = str3;
    }

    public String getMimeType() {
        return this.f33890s;
    }

    public String getUrl() {
        return this.f33891t;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + ". Mimetype=" + this.f33890s + ", URL=" + this.f33891t;
    }
}
