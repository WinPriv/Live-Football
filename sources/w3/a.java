package w3;

/* compiled from: AutoValue_Event.java */
/* loaded from: classes.dex */
public final class a<T> extends c<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f36068a;

    /* renamed from: b, reason: collision with root package name */
    public final T f36069b;

    /* renamed from: c, reason: collision with root package name */
    public final d f36070c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(j8.b bVar) {
        d dVar = d.DEFAULT;
        this.f36068a = null;
        this.f36069b = bVar;
        this.f36070c = dVar;
    }

    @Override // w3.c
    public final Integer a() {
        return this.f36068a;
    }

    @Override // w3.c
    public final T b() {
        return this.f36069b;
    }

    @Override // w3.c
    public final d c() {
        return this.f36070c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f36068a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.f36069b.equals(cVar.b()) && this.f36070c.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.f36068a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ this.f36069b.hashCode()) * 1000003) ^ this.f36070c.hashCode();
    }

    public final String toString() {
        return "Event{code=" + this.f36068a + ", payload=" + this.f36069b + ", priority=" + this.f36070c + "}";
    }
}
