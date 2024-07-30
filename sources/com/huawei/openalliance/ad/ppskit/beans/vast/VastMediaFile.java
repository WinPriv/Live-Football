package com.huawei.openalliance.ad.ppskit.beans.vast;

import ma.a;

/* loaded from: classes2.dex */
public class VastMediaFile {
    private String delivery;
    private int height;

    /* renamed from: id, reason: collision with root package name */
    private String f22470id;
    private String type;

    @a
    private String url;
    private int width;

    public final void a(int i10) {
        this.width = i10;
    }

    public final void b(String str) {
        this.f22470id = str;
    }

    public final void c(int i10) {
        this.height = i10;
    }

    public final void d(String str) {
        this.delivery = str;
    }

    public final String e() {
        return this.type;
    }

    public final void f(String str) {
        this.type = str;
    }

    public final int g() {
        return this.width;
    }

    public final void h(String str) {
        this.url = str;
    }

    public final int i() {
        return this.height;
    }

    public final String j() {
        return this.url;
    }
}
