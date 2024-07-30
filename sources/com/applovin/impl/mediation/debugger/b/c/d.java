package com.applovin.impl.mediation.debugger.b.c;

import android.content.Context;
import com.applovin.impl.sdk.utils.h;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f17995a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17996b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f17997c;

    public d(String str, String str2, Context context) {
        this.f17995a = str.replace("android.permission.", "");
        this.f17996b = str2;
        this.f17997c = h.a(str, context);
    }

    public String a() {
        return this.f17995a;
    }

    public String b() {
        return this.f17996b;
    }

    public boolean c() {
        return this.f17997c;
    }
}
