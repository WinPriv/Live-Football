package com.anythink.basead.c;

import a3.l;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    protected String f3743a;

    /* renamed from: b, reason: collision with root package name */
    protected String f3744b;

    public e(String str, String str2) {
        this.f3743a = str;
        this.f3744b = str2;
    }

    public final String a() {
        return this.f3743a;
    }

    public final String b() {
        return this.f3744b;
    }

    public final String c() {
        StringBuilder sb2 = new StringBuilder("code[ ");
        sb2.append(this.f3743a);
        sb2.append(" ],desc[ ");
        return l.p(sb2, this.f3744b, " ]");
    }
}
