package com.iab.omid.library.ironsrc.internal;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.weakreference.a f24389a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24390b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f24391c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24392d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f24389a = new com.iab.omid.library.ironsrc.weakreference.a(view);
        this.f24390b = view.getClass().getCanonicalName();
        this.f24391c = friendlyObstructionPurpose;
        this.f24392d = str;
    }

    public String a() {
        return this.f24392d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f24391c;
    }

    public com.iab.omid.library.ironsrc.weakreference.a c() {
        return this.f24389a;
    }

    public String d() {
        return this.f24390b;
    }
}
