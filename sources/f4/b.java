package f4;

import f4.d;
import java.util.Set;

/* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* loaded from: classes.dex */
public final class b extends d.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f28065a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28066b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<d.b> f28067c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
    /* loaded from: classes.dex */
    public static final class a extends d.a.AbstractC0377a {

        /* renamed from: a, reason: collision with root package name */
        public Long f28068a;

        /* renamed from: b, reason: collision with root package name */
        public Long f28069b;

        /* renamed from: c, reason: collision with root package name */
        public Set<d.b> f28070c;

        public final b a() {
            String str;
            if (this.f28068a == null) {
                str = " delta";
            } else {
                str = "";
            }
            if (this.f28069b == null) {
                str = str.concat(" maxAllowedDelay");
            }
            if (this.f28070c == null) {
                str = com.ironsource.adapters.facebook.a.h(str, " flags");
            }
            if (str.isEmpty()) {
                return new b(this.f28068a.longValue(), this.f28069b.longValue(), this.f28070c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public b(long j10, long j11, Set set) {
        this.f28065a = j10;
        this.f28066b = j11;
        this.f28067c = set;
    }

    @Override // f4.d.a
    public final long a() {
        return this.f28065a;
    }

    @Override // f4.d.a
    public final Set<d.b> b() {
        return this.f28067c;
    }

    @Override // f4.d.a
    public final long c() {
        return this.f28066b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d.a)) {
            return false;
        }
        d.a aVar = (d.a) obj;
        if (this.f28065a == aVar.a() && this.f28066b == aVar.c() && this.f28067c.equals(aVar.b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f28065a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f28066b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f28067c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f28065a + ", maxAllowedDelay=" + this.f28066b + ", flags=" + this.f28067c + "}";
    }
}
