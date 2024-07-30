package com.iab.omid.library.applovin.internal;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.applovin.weakreference.a f24271a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24272b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f24273c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24274d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f24271a = new com.iab.omid.library.applovin.weakreference.a(view);
        this.f24272b = view.getClass().getCanonicalName();
        this.f24273c = friendlyObstructionPurpose;
        this.f24274d = str;
    }

    public String a() {
        return this.f24274d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f24273c;
    }

    public com.iab.omid.library.applovin.weakreference.a c() {
        return this.f24271a;
    }

    public String d() {
        return this.f24272b;
    }
}
