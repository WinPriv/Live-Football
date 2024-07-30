package com.ironsource.mediationsdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ironsource.mediationsdk.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1422k {

    /* renamed from: a, reason: collision with root package name */
    public final String f25543a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25544b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25545c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f25546d;

    /* renamed from: e, reason: collision with root package name */
    public List<String> f25547e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public String f25548g;

    /* renamed from: h, reason: collision with root package name */
    public ISBannerSize f25549h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25550i;

    public C1422k(String str) {
        zc.d.d(str, "adUnit");
        this.f25543a = str;
        this.f25546d = new HashMap();
        this.f25547e = new ArrayList();
        this.f = -1;
        this.f25548g = "";
    }

    public final String a() {
        return this.f25548g;
    }

    public final void b(String str) {
        zc.d.d(str, "<set-?>");
        this.f25548g = str;
    }

    public final void c(boolean z10) {
        this.f25550i = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1422k) && zc.d.a(this.f25543a, ((C1422k) obj).f25543a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25543a.hashCode();
    }

    public final String toString() {
        return "AuctionParams(adUnit=" + this.f25543a + ')';
    }

    public final void a(ISBannerSize iSBannerSize) {
        this.f25549h = iSBannerSize;
    }

    public final void b(boolean z10) {
        this.f25545c = z10;
    }

    public final void a(String str) {
        zc.d.d(str, "<set-?>");
    }

    public final void a(List<String> list) {
        zc.d.d(list, "<set-?>");
        this.f25547e = list;
    }

    public final void a(boolean z10) {
        this.f25544b = true;
    }
}
