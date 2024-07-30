package com.huawei.openalliance.ad.ppskit.beans.metadata;

/* loaded from: classes2.dex */
public class Address {
    private String adminArea;
    private String country;
    private String fetureName;
    private String locale;
    private String locality;
    private String subAdminArea;
    private String subLocality;
    private String subThoroughfare;
    private String thoroughfare;

    public final void a(String str) {
        this.country = str;
    }

    public final void b(String str) {
        this.adminArea = str;
    }

    public final void c(String str) {
        this.locality = str;
    }

    public final void d(String str) {
        this.subLocality = str;
    }

    public final void e(String str) {
        this.subAdminArea = str;
    }

    public final void f(String str) {
        this.thoroughfare = str;
    }

    public final void g(String str) {
        this.subThoroughfare = str;
    }

    public final void h(String str) {
        this.fetureName = str;
    }

    public final void i(String str) {
        this.locale = str;
    }
}
