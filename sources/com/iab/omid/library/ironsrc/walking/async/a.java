package com.iab.omid.library.ironsrc.walking.async;

import com.iab.omid.library.ironsrc.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f24452c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f24453d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f24454e;

    public a(b.InterfaceC0313b interfaceC0313b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0313b);
        this.f24452c = new HashSet<>(hashSet);
        this.f24453d = jSONObject;
        this.f24454e = j10;
    }
}
