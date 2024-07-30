package com.applovin.exoplayer2.e;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public interface x {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f14945a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f14946b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14947c;

        /* renamed from: d, reason: collision with root package name */
        public final int f14948d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f14945a = i10;
            this.f14946b = bArr;
            this.f14947c = i11;
            this.f14948d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f14945a == aVar.f14945a && this.f14947c == aVar.f14947c && this.f14948d == aVar.f14948d && Arrays.equals(this.f14946b, aVar.f14946b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((Arrays.hashCode(this.f14946b) + (this.f14945a * 31)) * 31) + this.f14947c) * 31) + this.f14948d;
        }
    }

    default int a(com.applovin.exoplayer2.k.g gVar, int i10, boolean z10) throws IOException {
        return a(gVar, i10, z10, 0);
    }

    int a(com.applovin.exoplayer2.k.g gVar, int i10, boolean z10, int i11) throws IOException;

    void a(long j10, int i10, int i11, int i12, a aVar);

    void a(com.applovin.exoplayer2.l.y yVar, int i10, int i11);

    void a(com.applovin.exoplayer2.v vVar);

    default void a(com.applovin.exoplayer2.l.y yVar, int i10) {
        a(yVar, i10, 0);
    }
}
