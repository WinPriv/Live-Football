package com.anythink.expressad.exoplayer.d;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class o extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7722a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7723b = 2;

    /* renamed from: c, reason: collision with root package name */
    public final int f7724c;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    private o(int i10) {
        this.f7724c = i10;
    }

    public o(Exception exc) {
        super(exc);
        this.f7724c = 2;
    }
}
