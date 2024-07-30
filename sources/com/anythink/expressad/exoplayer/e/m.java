package com.anythink.expressad.exoplayer.e;

import com.anythink.expressad.exoplayer.k.s;
import java.util.Arrays;

/* loaded from: classes.dex */
public interface m {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7958a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f7959b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7960c;

        /* renamed from: d, reason: collision with root package name */
        public final int f7961d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f7958a = i10;
            this.f7959b = bArr;
            this.f7960c = i11;
            this.f7961d = i12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f7958a == aVar.f7958a && this.f7960c == aVar.f7960c && this.f7961d == aVar.f7961d && Arrays.equals(this.f7959b, aVar.f7959b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f7959b) + (this.f7958a * 31)) * 31) + this.f7960c) * 31) + this.f7961d;
        }
    }

    int a(f fVar, int i10, boolean z10);

    void a(long j10, int i10, int i11, int i12, a aVar);

    void a(s sVar, int i10);

    void a(com.anythink.expressad.exoplayer.m mVar);
}
