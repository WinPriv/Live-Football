package v4;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;

/* compiled from: VarintReader.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f35981d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f35982a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f35983b;

    /* renamed from: c, reason: collision with root package name */
    public int f35984c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~f35981d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    public final long b(p4.e eVar, boolean z10, boolean z11, int i10) throws IOException {
        int i11;
        int i12 = this.f35983b;
        byte[] bArr = this.f35982a;
        if (i12 == 0) {
            if (!eVar.a(bArr, 0, 1, z10)) {
                return -1L;
            }
            int i13 = bArr[0] & DefaultClassResolver.NAME;
            int i14 = 0;
            while (true) {
                if (i14 < 8) {
                    if ((f35981d[i14] & i13) != 0) {
                        i11 = i14 + 1;
                        break;
                    }
                    i14++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            this.f35984c = i11;
            if (i11 != -1) {
                this.f35983b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i15 = this.f35984c;
        if (i15 > i10) {
            this.f35983b = 0;
            return -2L;
        }
        if (i15 != 1) {
            eVar.a(bArr, 1, i15 - 1, false);
        }
        this.f35983b = 0;
        return a(bArr, this.f35984c, z11);
    }
}
