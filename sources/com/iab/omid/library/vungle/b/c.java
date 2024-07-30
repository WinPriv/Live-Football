package com.iab.omid.library.vungle.b;

import android.view.View;
import com.iab.omid.library.vungle.adsession.FriendlyObstructionPurpose;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.vungle.e.a f24495a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24496b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f24497c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24498d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f24495a = new com.iab.omid.library.vungle.e.a(view);
        this.f24496b = view.getClass().getCanonicalName();
        this.f24497c = friendlyObstructionPurpose;
        this.f24498d = str;
    }

    public com.iab.omid.library.vungle.e.a a() {
        return this.f24495a;
    }

    public String b() {
        return this.f24496b;
    }

    public FriendlyObstructionPurpose c() {
        return this.f24497c;
    }

    public String d() {
        return this.f24498d;
    }
}
