package com.anythink.expressad.exoplayer;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class g extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8018a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8019b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8020c = 2;

    /* renamed from: d, reason: collision with root package name */
    public final int f8021d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8022e;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    private g(int i10, String str, Throwable th, int i11) {
        super(str, th);
        this.f8021d = i10;
        this.f8022e = i11;
    }

    public static g a(Exception exc, int i10) {
        return new g(1, null, exc, i10);
    }

    private Exception b() {
        boolean z10 = true;
        if (this.f8021d != 1) {
            z10 = false;
        }
        com.anythink.expressad.exoplayer.k.a.b(z10);
        return (Exception) getCause();
    }

    private RuntimeException c() {
        boolean z10;
        if (this.f8021d == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.anythink.expressad.exoplayer.k.a.b(z10);
        return (RuntimeException) getCause();
    }

    public static g a(IOException iOException) {
        return new g(0, null, iOException, -1);
    }

    public static g a(RuntimeException runtimeException) {
        return new g(2, null, runtimeException, -1);
    }

    private IOException a() {
        com.anythink.expressad.exoplayer.k.a.b(this.f8021d == 0);
        return (IOException) getCause();
    }
}
