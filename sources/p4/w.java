package p4;

import java.io.IOException;
import java.util.Arrays;
import k4.i0;

/* compiled from: TrackOutput.java */
/* loaded from: classes2.dex */
public interface w {

    /* compiled from: TrackOutput.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f34357a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f34358b;

        /* renamed from: c, reason: collision with root package name */
        public final int f34359c;

        /* renamed from: d, reason: collision with root package name */
        public final int f34360d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f34357a = i10;
            this.f34358b = bArr;
            this.f34359c = i11;
            this.f34360d = i12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f34357a == aVar.f34357a && this.f34359c == aVar.f34359c && this.f34360d == aVar.f34360d && Arrays.equals(this.f34358b, aVar.f34358b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f34358b) + (this.f34357a * 31)) * 31) + this.f34359c) * 31) + this.f34360d;
        }
    }

    default int a(c6.h hVar, int i10, boolean z10) throws IOException {
        return d(hVar, i10, z10);
    }

    void b(i0 i0Var);

    void c(long j10, int i10, int i11, int i12, a aVar);

    int d(c6.h hVar, int i10, boolean z10) throws IOException;

    void e(int i10, d6.w wVar);

    default void f(int i10, d6.w wVar) {
        e(i10, wVar);
    }
}
