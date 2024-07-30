package com.applovin.exoplayer2.e.e;

import com.applovin.exoplayer2.e.i;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;

/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final long[] f14271a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f14272b = new byte[8];

    /* renamed from: c, reason: collision with root package name */
    private int f14273c;

    /* renamed from: d, reason: collision with root package name */
    private int f14274d;

    public void a() {
        this.f14273c = 0;
        this.f14274d = 0;
    }

    public int b() {
        return this.f14274d;
    }

    public long a(i iVar, boolean z10, boolean z11, int i10) throws IOException {
        if (this.f14273c == 0) {
            if (!iVar.a(this.f14272b, 0, 1, z10)) {
                return -1L;
            }
            int a10 = a(this.f14272b[0] & DefaultClassResolver.NAME);
            this.f14274d = a10;
            if (a10 != -1) {
                this.f14273c = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i11 = this.f14274d;
        if (i11 > i10) {
            this.f14273c = 0;
            return -2L;
        }
        if (i11 != 1) {
            iVar.b(this.f14272b, 1, i11 - 1);
        }
        this.f14273c = 0;
        return a(this.f14272b, this.f14274d, z11);
    }

    public static int a(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = f14271a;
            if (i11 >= jArr.length) {
                return -1;
            }
            if ((jArr[i11] & i10) != 0) {
                return i11 + 1;
            }
            i11++;
        }
    }

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~f14271a[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }
}
