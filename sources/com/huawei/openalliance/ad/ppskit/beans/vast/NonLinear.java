package com.huawei.openalliance.ad.ppskit.beans.vast;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import ma.a;

/* loaded from: classes2.dex */
public class NonLinear {
    private int height;

    @a
    private String htmlResource;

    @a
    private String iframeResource;

    @a
    private String nonLinearClickThrough;
    private String nonLinearId;
    private StaticResource staticResource;
    private List<Tracking> trackings = new ArrayList();
    private int width;

    public final void a(int i10) {
        this.height = i10;
    }

    public final void b(StaticResource staticResource) {
        this.staticResource = staticResource;
    }

    public final void c(String str) {
        if (TextUtils.isEmpty(str)) {
            str = a0.a.l0();
        }
        this.nonLinearId = str;
    }

    public final StaticResource d() {
        return this.staticResource;
    }

    public final void e(int i10) {
        this.width = i10;
    }

    public final void f(String str) {
        this.iframeResource = str;
    }

    public final void g(ArrayList arrayList) {
        this.trackings = arrayList;
    }

    public final void h(String str) {
        this.htmlResource = str;
    }

    public final void i(String str) {
        this.nonLinearClickThrough = str;
    }

    public final String j() {
        return this.nonLinearClickThrough;
    }
}
