package y3;

import java.util.Arrays;
import y3.l;

/* compiled from: AutoValue_LogEvent.java */
/* loaded from: classes.dex */
public final class f extends l {

    /* renamed from: a, reason: collision with root package name */
    public final long f36619a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f36620b;

    /* renamed from: c, reason: collision with root package name */
    public final long f36621c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f36622d;

    /* renamed from: e, reason: collision with root package name */
    public final String f36623e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final o f36624g;

    /* compiled from: AutoValue_LogEvent.java */
    /* loaded from: classes.dex */
    public static final class a extends l.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f36625a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f36626b;

        /* renamed from: c, reason: collision with root package name */
        public Long f36627c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f36628d;

        /* renamed from: e, reason: collision with root package name */
        public String f36629e;
        public Long f;

        /* renamed from: g, reason: collision with root package name */
        public o f36630g;
    }

    public f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f36619a = j10;
        this.f36620b = num;
        this.f36621c = j11;
        this.f36622d = bArr;
        this.f36623e = str;
        this.f = j12;
        this.f36624g = oVar;
    }

    @Override // y3.l
    public final Integer a() {
        return this.f36620b;
    }

    @Override // y3.l
    public final long b() {
        return this.f36619a;
    }

    @Override // y3.l
    public final long c() {
        return this.f36621c;
    }

    @Override // y3.l
    public final o d() {
        return this.f36624g;
    }

    @Override // y3.l
    public final byte[] e() {
        return this.f36622d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        byte[] e10;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f36619a == lVar.b() && ((num = this.f36620b) != null ? num.equals(lVar.a()) : lVar.a() == null) && this.f36621c == lVar.c()) {
            if (lVar instanceof f) {
                e10 = ((f) lVar).f36622d;
            } else {
                e10 = lVar.e();
            }
            if (Arrays.equals(this.f36622d, e10) && ((str = this.f36623e) != null ? str.equals(lVar.f()) : lVar.f() == null) && this.f == lVar.g()) {
                o oVar = this.f36624g;
                if (oVar == null) {
                    if (lVar.d() == null) {
                        return true;
                    }
                } else if (oVar.equals(lVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // y3.l
    public final String f() {
        return this.f36623e;
    }

    @Override // y3.l
    public final long g() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j10 = this.f36619a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        int i11 = 0;
        Integer num = this.f36620b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = (i10 ^ hashCode) * 1000003;
        long j11 = this.f36621c;
        int hashCode3 = (((i12 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f36622d)) * 1000003;
        String str = this.f36623e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i13 = (hashCode3 ^ hashCode2) * 1000003;
        long j12 = this.f;
        int i14 = (i13 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        o oVar = this.f36624g;
        if (oVar != null) {
            i11 = oVar.hashCode();
        }
        return i14 ^ i11;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f36619a + ", eventCode=" + this.f36620b + ", eventUptimeMs=" + this.f36621c + ", sourceExtension=" + Arrays.toString(this.f36622d) + ", sourceExtensionJsonProto3=" + this.f36623e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.f36624g + "}";
    }
}
