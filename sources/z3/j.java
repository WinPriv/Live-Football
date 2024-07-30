package z3;

import java.util.Arrays;
import z3.s;

/* compiled from: AutoValue_TransportContext.java */
/* loaded from: classes.dex */
public final class j extends s {

    /* renamed from: a, reason: collision with root package name */
    public final String f36941a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f36942b;

    /* renamed from: c, reason: collision with root package name */
    public final w3.d f36943c;

    /* compiled from: AutoValue_TransportContext.java */
    /* loaded from: classes.dex */
    public static final class a extends s.a {

        /* renamed from: a, reason: collision with root package name */
        public String f36944a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f36945b;

        /* renamed from: c, reason: collision with root package name */
        public w3.d f36946c;

        public final j a() {
            String str;
            if (this.f36944a == null) {
                str = " backendName";
            } else {
                str = "";
            }
            if (this.f36946c == null) {
                str = str.concat(" priority");
            }
            if (str.isEmpty()) {
                return new j(this.f36944a, this.f36945b, this.f36946c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final a b(String str) {
            if (str != null) {
                this.f36944a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        public final a c(w3.d dVar) {
            if (dVar != null) {
                this.f36946c = dVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    public j(String str, byte[] bArr, w3.d dVar) {
        this.f36941a = str;
        this.f36942b = bArr;
        this.f36943c = dVar;
    }

    @Override // z3.s
    public final String b() {
        return this.f36941a;
    }

    @Override // z3.s
    public final byte[] c() {
        return this.f36942b;
    }

    @Override // z3.s
    public final w3.d d() {
        return this.f36943c;
    }

    public final boolean equals(Object obj) {
        byte[] c10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f36941a.equals(sVar.b())) {
            if (sVar instanceof j) {
                c10 = ((j) sVar).f36942b;
            } else {
                c10 = sVar.c();
            }
            if (Arrays.equals(this.f36942b, c10) && this.f36943c.equals(sVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f36941a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f36942b)) * 1000003) ^ this.f36943c.hashCode();
    }
}
