package z3;

/* compiled from: AutoValue_SendRequest.java */
/* loaded from: classes.dex */
public final class i extends r {

    /* renamed from: a, reason: collision with root package name */
    public final s f36936a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36937b;

    /* renamed from: c, reason: collision with root package name */
    public final w3.c<?> f36938c;

    /* renamed from: d, reason: collision with root package name */
    public final com.applovin.exoplayer2.d.w f36939d;

    /* renamed from: e, reason: collision with root package name */
    public final w3.b f36940e;

    public i(s sVar, String str, w3.c cVar, com.applovin.exoplayer2.d.w wVar, w3.b bVar) {
        this.f36936a = sVar;
        this.f36937b = str;
        this.f36938c = cVar;
        this.f36939d = wVar;
        this.f36940e = bVar;
    }

    @Override // z3.r
    public final w3.b a() {
        return this.f36940e;
    }

    @Override // z3.r
    public final w3.c<?> b() {
        return this.f36938c;
    }

    @Override // z3.r
    public final com.applovin.exoplayer2.d.w c() {
        return this.f36939d;
    }

    @Override // z3.r
    public final s d() {
        return this.f36936a;
    }

    @Override // z3.r
    public final String e() {
        return this.f36937b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f36936a.equals(rVar.d()) && this.f36937b.equals(rVar.e()) && this.f36938c.equals(rVar.b()) && this.f36939d.equals(rVar.c()) && this.f36940e.equals(rVar.a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f36936a.hashCode() ^ 1000003) * 1000003) ^ this.f36937b.hashCode()) * 1000003) ^ this.f36938c.hashCode()) * 1000003) ^ this.f36939d.hashCode()) * 1000003) ^ this.f36940e.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.f36936a + ", transportName=" + this.f36937b + ", event=" + this.f36938c + ", transformer=" + this.f36939d + ", encoding=" + this.f36940e + "}";
    }
}
