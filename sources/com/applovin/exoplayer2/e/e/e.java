package com.applovin.exoplayer2.e.e;

import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.l.y;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;

/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final y f14269a = new y(8);

    /* renamed from: b, reason: collision with root package name */
    private int f14270b;

    private long b(i iVar) throws IOException {
        int i10 = 0;
        iVar.d(this.f14269a.d(), 0, 1);
        int i11 = this.f14269a.d()[0] & DefaultClassResolver.NAME;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        iVar.d(this.f14269a.d(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f14269a.d()[i10] & DefaultClassResolver.NAME) + (i14 << 8);
        }
        this.f14270b = i13 + 1 + this.f14270b;
        return i14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.applovin.exoplayer2.e.i r14) throws java.io.IOException {
        /*
            r13 = this;
            long r0 = r14.d()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 1024(0x400, double:5.06E-321)
            if (r2 == 0) goto L12
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L11
            goto L12
        L11:
            r3 = r0
        L12:
            int r3 = (int) r3
            com.applovin.exoplayer2.l.y r4 = r13.f14269a
            byte[] r4 = r4.d()
            r5 = 0
            r6 = 4
            r14.d(r4, r5, r6)
            com.applovin.exoplayer2.l.y r4 = r13.f14269a
            long r7 = r4.o()
            r13.f14270b = r6
        L26:
            r9 = 440786851(0x1a45dfa3, double:2.1777764E-315)
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r6 = 1
            if (r4 == 0) goto L54
            int r4 = r13.f14270b
            int r4 = r4 + r6
            r13.f14270b = r4
            if (r4 != r3) goto L36
            return r5
        L36:
            com.applovin.exoplayer2.l.y r4 = r13.f14269a
            byte[] r4 = r4.d()
            r14.d(r4, r5, r6)
            r4 = 8
            long r6 = r7 << r4
            r8 = -256(0xffffffffffffff00, double:NaN)
            long r6 = r6 & r8
            com.applovin.exoplayer2.l.y r4 = r13.f14269a
            byte[] r4 = r4.d()
            r4 = r4[r5]
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r8 = (long) r4
            long r7 = r6 | r8
            goto L26
        L54:
            long r3 = r13.b(r14)
            int r7 = r13.f14270b
            long r7 = (long) r7
            r9 = -9223372036854775808
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 == 0) goto La1
            if (r2 == 0) goto L6a
            long r11 = r7 + r3
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L6a
            goto La1
        L6a:
            int r0 = r13.f14270b
            long r1 = (long) r0
            long r11 = r7 + r3
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 >= 0) goto L9b
            long r0 = r13.b(r14)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 != 0) goto L7c
            return r5
        L7c:
            long r0 = r13.b(r14)
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 < 0) goto L9a
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 <= 0) goto L8e
            goto L9a
        L8e:
            if (r2 == 0) goto L6a
            int r0 = (int) r0
            r14.c(r0)
            int r1 = r13.f14270b
            int r1 = r1 + r0
            r13.f14270b = r1
            goto L6a
        L9a:
            return r5
        L9b:
            long r0 = (long) r0
            int r14 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r14 != 0) goto La1
            r5 = r6
        La1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.e.e.a(com.applovin.exoplayer2.e.i):boolean");
    }
}
