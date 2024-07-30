package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f24334c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f24335d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f24336e;

    public a(b.InterfaceC0310b interfaceC0310b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0310b);
        this.f24334c = new HashSet<>(hashSet);
        this.f24335d = jSONObject;
        this.f24336e = j10;
    }
}
