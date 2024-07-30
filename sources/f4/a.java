package f4;

import f4.d;
import java.util.Map;

/* compiled from: AutoValue_SchedulerConfig.java */
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final i4.a f28063a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<w3.d, d.a> f28064b;

    public a(i4.a aVar, Map<w3.d, d.a> map) {
        if (aVar != null) {
            this.f28063a = aVar;
            if (map != null) {
                this.f28064b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    @Override // f4.d
    public final i4.a a() {
        return this.f28063a;
    }

    @Override // f4.d
    public final Map<w3.d, d.a> c() {
        return this.f28064b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f28063a.equals(dVar.a()) && this.f28064b.equals(dVar.c())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f28063a.hashCode() ^ 1000003) * 1000003) ^ this.f28064b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f28063a + ", values=" + this.f28064b + "}";
    }
}
