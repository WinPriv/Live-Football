package n7;

import a3.l;

/* compiled from: AutoValue_StartupTime.java */
/* loaded from: classes2.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final long f33450a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33451b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33452c;

    public a(long j10, long j11, long j12) {
        this.f33450a = j10;
        this.f33451b = j11;
        this.f33452c = j12;
    }

    @Override // n7.h
    public final long a() {
        return this.f33451b;
    }

    @Override // n7.h
    public final long b() {
        return this.f33450a;
    }

    @Override // n7.h
    public final long c() {
        return this.f33452c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f33450a == hVar.b() && this.f33451b == hVar.a() && this.f33452c == hVar.c()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f33450a;
        long j11 = this.f33451b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f33452c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f33450a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f33451b);
        sb2.append(", uptimeMillis=");
        return l.n(sb2, this.f33452c, "}");
    }
}
