package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final IronSource.AD_UNIT f25175a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25176b;

    /* renamed from: c, reason: collision with root package name */
    public final List<NetworkSettings> f25177c;

    /* renamed from: d, reason: collision with root package name */
    public final com.ironsource.mediationsdk.utils.c f25178d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25179e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25180g;

    /* renamed from: h, reason: collision with root package name */
    public final com.ironsource.mediationsdk.adunit.c.b.a f25181h;

    /* renamed from: i, reason: collision with root package name */
    public final int f25182i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f25183j;

    /* renamed from: k, reason: collision with root package name */
    public final long f25184k;

    public a(IronSource.AD_UNIT ad_unit, String str, List<NetworkSettings> list, com.ironsource.mediationsdk.utils.c cVar, int i10, int i11, int i12, int i13, com.ironsource.mediationsdk.adunit.c.b.a aVar, boolean z10, long j10) {
        this.f25175a = ad_unit;
        this.f25176b = str;
        this.f25177c = list;
        this.f25178d = cVar;
        this.f25179e = i10;
        this.f25180g = i11;
        this.f = i12;
        this.f25181h = aVar;
        this.f25182i = i13;
        this.f25183j = z10;
        this.f25184k = j10;
    }

    public final NetworkSettings a(String str) {
        for (NetworkSettings networkSettings : this.f25177c) {
            if (networkSettings.getProviderInstanceName().equals(str)) {
                return networkSettings;
            }
        }
        return null;
    }

    public final boolean a() {
        return this.f25178d.f > 0;
    }
}
