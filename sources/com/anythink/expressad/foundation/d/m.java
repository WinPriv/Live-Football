package com.anythink.expressad.foundation.d;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class m implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f9652a;

    /* renamed from: b, reason: collision with root package name */
    private String f9653b;

    /* renamed from: c, reason: collision with root package name */
    private int f9654c;

    private m(String str, String str2, int i10) {
        this.f9653b = str;
        this.f9652a = str2;
        this.f9654c = i10;
    }

    private String a() {
        return this.f9652a;
    }

    private String b() {
        return this.f9653b;
    }

    private void a(String str) {
        this.f9652a = str;
    }

    private void b(String str) {
        this.f9653b = str;
    }
}
