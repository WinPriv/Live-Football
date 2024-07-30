package z3;

import java.util.Map;
import z3.n;

/* compiled from: AutoValue_EventInternal.java */
/* loaded from: classes.dex */
public final class h extends n {

    /* renamed from: a, reason: collision with root package name */
    public final String f36926a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f36927b;

    /* renamed from: c, reason: collision with root package name */
    public final m f36928c;

    /* renamed from: d, reason: collision with root package name */
    public final long f36929d;

    /* renamed from: e, reason: collision with root package name */
    public final long f36930e;
    public final Map<String, String> f;

    /* compiled from: AutoValue_EventInternal.java */
    /* loaded from: classes.dex */
    public static final class a extends n.a {

        /* renamed from: a, reason: collision with root package name */
        public String f36931a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f36932b;

        /* renamed from: c, reason: collision with root package name */
        public m f36933c;

        /* renamed from: d, reason: collision with root package name */
        public Long f36934d;

        /* renamed from: e, reason: collision with root package name */
        public Long f36935e;
        public Map<String, String> f;

        public final h b() {
            String str;
            if (this.f36931a == null) {
                str = " transportName";
            } else {
                str = "";
            }
            if (this.f36933c == null) {
                str = str.concat(" encodedPayload");
            }
            if (this.f36934d == null) {
                str = com.ironsource.adapters.facebook.a.h(str, " eventMillis");
            }
            if (this.f36935e == null) {
                str = com.ironsource.adapters.facebook.a.h(str, " uptimeMillis");
            }
            if (this.f == null) {
                str = com.ironsource.adapters.facebook.a.h(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new h(this.f36931a, this.f36932b, this.f36933c, this.f36934d.longValue(), this.f36935e.longValue(), this.f);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final a c(m mVar) {
            if (mVar != null) {
                this.f36933c = mVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        public final a d(String str) {
            if (str != null) {
                this.f36931a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    public h(String str, Integer num, m mVar, long j10, long j11, Map map) {
        this.f36926a = str;
        this.f36927b = num;
        this.f36928c = mVar;
        this.f36929d = j10;
        this.f36930e = j11;
        this.f = map;
    }

    @Override // z3.n
    public final Map<String, String> b() {
        return this.f;
    }

    @Override // z3.n
    public final Integer c() {
        return this.f36927b;
    }

    @Override // z3.n
    public final m d() {
        return this.f36928c;
    }

    @Override // z3.n
    public final long e() {
        return this.f36929d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f36926a.equals(nVar.g()) && ((num = this.f36927b) != null ? num.equals(nVar.c()) : nVar.c() == null) && this.f36928c.equals(nVar.d()) && this.f36929d == nVar.e() && this.f36930e == nVar.h() && this.f.equals(nVar.b())) {
            return true;
        }
        return false;
    }

    @Override // z3.n
    public final String g() {
        return this.f36926a;
    }

    @Override // z3.n
    public final long h() {
        return this.f36930e;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f36926a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f36927b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f36928c.hashCode()) * 1000003;
        long j10 = this.f36929d;
        int i10 = (hashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f36930e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f36926a + ", code=" + this.f36927b + ", encodedPayload=" + this.f36928c + ", eventMillis=" + this.f36929d + ", uptimeMillis=" + this.f36930e + ", autoMetadata=" + this.f + "}";
    }
}
