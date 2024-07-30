package com.ironsource.mediationsdk.model;

import java.util.Map;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, String> f25662a;

    public f() {
        this(vc.e.f36007s);
    }

    public final Map<String, String> a() {
        return this.f25662a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && zc.d.a(this.f25662a, ((f) obj).f25662a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25662a.hashCode();
    }

    public final String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.f25662a + ')';
    }

    public f(Map<String, String> map) {
        zc.d.d(map, "mediationTypes");
        this.f25662a = map;
    }
}
