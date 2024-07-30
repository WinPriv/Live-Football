package com.huawei.openalliance.ad.ppskit.beans.vast;

import ma.a;

/* loaded from: classes2.dex */
public class VastIcon {
    private int height;

    @a
    private String htmlResource;

    @a
    private String iconIframRes;
    private String program;
    private StaticResource staticResource;
    private int width;
    private String xPos;
    private String yPos;

    public final void a(int i10) {
        this.height = i10;
    }

    public final void b(StaticResource staticResource) {
        this.staticResource = staticResource;
    }

    public final void c(String str) {
        this.program = str;
    }

    public final int d() {
        return this.height;
    }

    public final void e(int i10) {
        this.width = i10;
    }

    public final void f(String str) {
        this.xPos = str;
    }

    public final int g() {
        return this.width;
    }

    public final void h(String str) {
        this.yPos = str;
    }

    public final void i(String str) {
        this.iconIframRes = str;
    }

    public final void j(String str) {
        this.htmlResource = str;
    }

    public final StaticResource k() {
        return this.staticResource;
    }
}
