package com.iab.omid.library.vungle.walking.a;

import com.iab.omid.library.vungle.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a extends b {

    /* renamed from: a, reason: collision with root package name */
    protected final HashSet<String> f24560a;

    /* renamed from: b, reason: collision with root package name */
    protected final JSONObject f24561b;

    /* renamed from: c, reason: collision with root package name */
    protected final long f24562c;

    public a(b.InterfaceC0316b interfaceC0316b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0316b);
        this.f24560a = new HashSet<>(hashSet);
        this.f24561b = jSONObject;
        this.f24562c = j10;
    }
}
