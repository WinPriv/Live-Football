package com.iab.omid.library.vungle.walking;

import com.iab.omid.library.vungle.walking.a.b;
import com.iab.omid.library.vungle.walking.a.d;
import com.iab.omid.library.vungle.walking.a.e;
import com.iab.omid.library.vungle.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b implements b.InterfaceC0316b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f24569a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.vungle.walking.a.c f24570b;

    public b(com.iab.omid.library.vungle.walking.a.c cVar) {
        this.f24570b = cVar;
    }

    public void a() {
        this.f24570b.b(new d(this));
    }

    @Override // com.iab.omid.library.vungle.walking.a.b.InterfaceC0316b
    public JSONObject b() {
        return this.f24569a;
    }

    @Override // com.iab.omid.library.vungle.walking.a.b.InterfaceC0316b
    public void a(JSONObject jSONObject) {
        this.f24569a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24570b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24570b.b(new f(this, hashSet, jSONObject, j10));
    }
}
