package n5;

import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.e0;

/* compiled from: RangedUri.java */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f33395a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33396b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33397c;

    /* renamed from: d, reason: collision with root package name */
    public int f33398d;

    public i(String str, long j10, long j11) {
        this.f33397c = str == null ? "" : str;
        this.f33395a = j10;
        this.f33396b = j11;
    }

    public final i a(i iVar, String str) {
        String c10 = e0.c(str, this.f33397c);
        if (iVar != null && c10.equals(e0.c(str, iVar.f33397c))) {
            long j10 = this.f33396b;
            long j11 = -1;
            long j12 = iVar.f33396b;
            if (j10 != -1) {
                long j13 = this.f33395a;
                if (j13 + j10 == iVar.f33395a) {
                    if (j12 != -1) {
                        j11 = j10 + j12;
                    }
                    return new i(c10, j13, j11);
                }
            }
            if (j12 != -1) {
                long j14 = iVar.f33395a;
                if (j14 + j12 == this.f33395a) {
                    if (j10 != -1) {
                        j11 = j12 + j10;
                    }
                    return new i(c10, j14, j11);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f33395a == iVar.f33395a && this.f33396b == iVar.f33396b && this.f33397c.equals(iVar.f33397c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f33398d == 0) {
            this.f33398d = this.f33397c.hashCode() + ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ((int) this.f33395a)) * 31) + ((int) this.f33396b)) * 31);
        }
        return this.f33398d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f33397c);
        sb2.append(", start=");
        sb2.append(this.f33395a);
        sb2.append(", length=");
        return a3.l.n(sb2, this.f33396b, ")");
    }
}
