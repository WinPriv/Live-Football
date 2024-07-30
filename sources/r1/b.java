package r1;

/* compiled from: Constraints.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: i, reason: collision with root package name */
    public static final b f34800i = new b(new a());

    /* renamed from: a, reason: collision with root package name */
    public i f34801a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f34802b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f34803c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f34804d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f34805e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public long f34806g;

    /* renamed from: h, reason: collision with root package name */
    public c f34807h;

    /* compiled from: Constraints.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public i f34808a = i.NOT_REQUIRED;

        /* renamed from: b, reason: collision with root package name */
        public final c f34809b = new c();
    }

    public b() {
        this.f34801a = i.NOT_REQUIRED;
        this.f = -1L;
        this.f34806g = -1L;
        this.f34807h = new c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f34802b != bVar.f34802b || this.f34803c != bVar.f34803c || this.f34804d != bVar.f34804d || this.f34805e != bVar.f34805e || this.f != bVar.f || this.f34806g != bVar.f34806g || this.f34801a != bVar.f34801a) {
            return false;
        }
        return this.f34807h.equals(bVar.f34807h);
    }

    public final int hashCode() {
        int hashCode = ((((((((this.f34801a.hashCode() * 31) + (this.f34802b ? 1 : 0)) * 31) + (this.f34803c ? 1 : 0)) * 31) + (this.f34804d ? 1 : 0)) * 31) + (this.f34805e ? 1 : 0)) * 31;
        long j10 = this.f;
        int i10 = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f34806g;
        return this.f34807h.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }

    public b(a aVar) {
        this.f34801a = i.NOT_REQUIRED;
        this.f = -1L;
        this.f34806g = -1L;
        new c();
        this.f34802b = false;
        this.f34803c = false;
        this.f34801a = aVar.f34808a;
        this.f34804d = false;
        this.f34805e = false;
        this.f34807h = aVar.f34809b;
        this.f = -1L;
        this.f34806g = -1L;
    }

    public b(b bVar) {
        this.f34801a = i.NOT_REQUIRED;
        this.f = -1L;
        this.f34806g = -1L;
        this.f34807h = new c();
        this.f34802b = bVar.f34802b;
        this.f34803c = bVar.f34803c;
        this.f34801a = bVar.f34801a;
        this.f34804d = bVar.f34804d;
        this.f34805e = bVar.f34805e;
        this.f34807h = bVar.f34807h;
    }
}
