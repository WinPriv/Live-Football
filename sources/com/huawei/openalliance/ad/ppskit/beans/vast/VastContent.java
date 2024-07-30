package com.huawei.openalliance.ad.ppskit.beans.vast;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class VastContent {
    private String adSystem;
    private String adSystemVersion;
    private String adTile;
    private String advertiser;
    private String description;

    /* renamed from: id, reason: collision with root package name */
    private String f22469id;
    private String version;
    private List<Impression> impressions = new ArrayList();
    private List<Creative> creatives = new ArrayList();
    private Boolean isWrapper = Boolean.FALSE;

    public final void a(Impression impression) {
        if (!this.impressions.contains(impression)) {
            this.impressions.add(impression);
        }
    }

    public final String b() {
        return this.f22469id;
    }

    public final void c(String str) {
        this.f22469id = str;
    }

    public final void d(ArrayList arrayList) {
        this.creatives = arrayList;
    }

    public final void e(String str) {
        this.adSystem = str;
    }

    public final void f(String str) {
        this.adSystemVersion = str;
    }

    public final String g() {
        return this.adTile;
    }

    public final void h(String str) {
        this.adTile = str;
    }

    public final String i() {
        return this.description;
    }

    public final void j(String str) {
        this.description = str;
    }

    public final List<Impression> k() {
        return this.impressions;
    }

    public final void l(String str) {
        this.advertiser = str;
    }

    public final List<Creative> m() {
        return this.creatives;
    }

    public final String n() {
        return this.advertiser;
    }

    public final Boolean o() {
        return this.isWrapper;
    }
}
