package com.anythink.expressad.foundation.g.f.c;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f9916a;

    /* renamed from: b, reason: collision with root package name */
    private InputStream f9917b;

    /* renamed from: c, reason: collision with root package name */
    private File f9918c;

    /* renamed from: d, reason: collision with root package name */
    private long f9919d;

    /* renamed from: e, reason: collision with root package name */
    private String f9920e;
    private String f;

    /* renamed from: g, reason: collision with root package name */
    private String f9921g;

    private b(String str, byte[] bArr, long j10, String str2, String str3) {
        this.f9921g = "application/octet-stream";
        this.f9920e = str;
        this.f = str2;
        this.f9916a = bArr;
        this.f9919d = j10;
        if (str3 != null) {
            this.f9921g = str3;
        }
    }

    public final long a() {
        return this.f9919d;
    }

    public final File b() {
        return this.f9918c;
    }

    public final InputStream c() {
        return this.f9917b;
    }

    public final byte[] d() {
        return this.f9916a;
    }

    public final String e() {
        return this.f9920e;
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.f9921g;
    }

    private void a(String str) {
        this.f9920e = str;
    }

    private void b(String str) {
        this.f = str;
    }

    private void c(String str) {
        this.f9921g = str;
    }

    public b(String str, File file, String str2, String str3) {
        this.f9921g = "application/octet-stream";
        this.f9920e = str;
        this.f = str2;
        try {
            this.f9917b = new FileInputStream(file);
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
        }
        this.f9919d = file.length();
        if (str3 != null) {
            this.f9921g = str3;
        }
        this.f9918c = file;
    }

    private b(InputStream inputStream, int i10, String str, String str2, String str3) {
        this.f9920e = str;
        this.f = str2;
        this.f9917b = inputStream;
        this.f9919d = i10;
        this.f9921g = str3;
    }
}
