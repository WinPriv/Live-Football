package com.iab.omid.library.applovin.walking;

import com.iab.omid.library.applovin.walking.async.b;
import com.iab.omid.library.applovin.walking.async.d;
import com.iab.omid.library.applovin.walking.async.e;
import com.iab.omid.library.applovin.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b implements b.InterfaceC0310b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f24343a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.walking.async.c f24344b;

    public b(com.iab.omid.library.applovin.walking.async.c cVar) {
        this.f24344b = cVar;
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0310b
    public JSONObject a() {
        return this.f24343a;
    }

    public void b() {
        this.f24344b.b(new d(this));
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0310b
    public void a(JSONObject jSONObject) {
        this.f24343a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24344b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24344b.b(new e(this, hashSet, jSONObject, j10));
    }
}
