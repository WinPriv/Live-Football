package com.applovin.impl.b.a;

import android.net.Uri;
import com.applovin.impl.sdk.y;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private boolean f17264a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f17265b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f17266c;

    /* renamed from: d, reason: collision with root package name */
    private List<Uri> f17267d;
    private boolean f;

    /* renamed from: g, reason: collision with root package name */
    private List<Uri> f17269g;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17271i;

    /* renamed from: e, reason: collision with root package name */
    private final Object f17268e = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final Object f17270h = new Object();

    public c(boolean z10, Uri uri, Uri uri2, List<Uri> list, boolean z11, List<Uri> list2, boolean z12) {
        this.f17264a = z10;
        this.f17265b = uri;
        this.f17266c = uri2;
        this.f17267d = list;
        this.f = z11;
        this.f17269g = list2;
        this.f17271i = z12;
        if (z10) {
            y.f("ConsentFlowSettings", "Creating with initial values: isEnabled=" + z10 + ",\n\tprivacyPolicyUri=" + uri + ",\n\ttermsOfServiceUri=" + uri2 + ",\n\tadvertisingPartnerUris=" + list + ",\n\tshouldIncludeDefaultAdvertisingPartnerUris=" + z11 + ",\n\tanalyticsPartnerUris=" + list2 + ",\n\tshouldIncludeDefaultAnalyticsPartnerUris=" + z12);
        }
    }

    public boolean a() {
        return this.f17264a;
    }

    public Uri b() {
        return this.f17265b;
    }

    public Uri c() {
        return this.f17266c;
    }

    public List<Uri> d() {
        ArrayList arrayList;
        synchronized (this.f17268e) {
            arrayList = new ArrayList(this.f17267d);
        }
        return arrayList;
    }

    public boolean e() {
        return this.f;
    }

    public List<Uri> f() {
        ArrayList arrayList;
        synchronized (this.f17270h) {
            arrayList = new ArrayList(this.f17269g);
        }
        return arrayList;
    }

    public boolean g() {
        return this.f17271i;
    }

    public String toString() {
        return "ConsentFlowSettings{isEnabled=" + this.f17264a + ", privacyPolicyUri=" + this.f17265b + ", termsOfServiceUri=" + this.f17266c + ", advertisingPartnerUris=" + this.f17267d + ", analyticsPartnerUris=" + this.f17269g + '}';
    }
}
