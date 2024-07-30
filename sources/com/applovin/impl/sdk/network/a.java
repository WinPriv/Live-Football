package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.p;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.e.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f19076a;

    /* renamed from: b, reason: collision with root package name */
    private final c<JSONObject> f19077b;

    public a(String str, c<JSONObject> cVar, p pVar) {
        super(s.f.b("CommunicatorRequestTask:", str), pVar);
        this.f19076a = str;
        this.f19077b = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f.M().a((com.applovin.impl.sdk.e.a) new u<JSONObject>(this.f19077b, this.f, g()) { // from class: com.applovin.impl.sdk.network.a.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i10) {
                this.f.ab().a(a.this.f19076a, a.this.f19077b.a(), i10, jSONObject, null, true);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, JSONObject jSONObject) {
                this.f.ab().a(a.this.f19076a, a.this.f19077b.a(), i10, jSONObject, str, false);
            }
        });
    }
}
