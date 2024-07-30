package com.applovin.exoplayer2;

import java.io.IOException;

/* loaded from: classes.dex */
public class ai extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13184a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13185b;

    public ai(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.f13184a = z10;
        this.f13185b = i10;
    }

    public static ai a(String str, Throwable th) {
        return new ai(str, th, true, 0);
    }

    public static ai b(String str, Throwable th) {
        return new ai(str, th, true, 1);
    }

    public static ai a(String str) {
        return new ai(str, null, false, 1);
    }
}
