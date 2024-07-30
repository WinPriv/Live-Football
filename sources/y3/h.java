package y3;

/* compiled from: AutoValue_LogResponse.java */
/* loaded from: classes.dex */
public final class h extends n {

    /* renamed from: a, reason: collision with root package name */
    public final long f36637a;

    public h(long j10) {
        this.f36637a = j10;
    }

    @Override // y3.n
    public final long b() {
        return this.f36637a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof n) && this.f36637a == ((n) obj).b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f36637a;
        return ((int) ((j10 >>> 32) ^ j10)) ^ 1000003;
    }

    public final String toString() {
        return a3.l.n(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f36637a, "}");
    }
}
