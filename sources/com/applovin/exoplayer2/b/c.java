package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.v;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.huawei.openalliance.ad.constant.ag;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f13348a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, ag.f21998i, ag.f21998i, 2048};

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f13349a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13350b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13351c;

        /* renamed from: d, reason: collision with root package name */
        public final int f13352d;

        /* renamed from: e, reason: collision with root package name */
        public final int f13353e;

        private a(int i10, int i11, int i12, int i13, int i14) {
            this.f13349a = i10;
            this.f13351c = i11;
            this.f13350b = i12;
            this.f13352d = i13;
            this.f13353e = i14;
        }
    }

    public static com.applovin.exoplayer2.v a(com.applovin.exoplayer2.l.y yVar, String str, String str2, com.applovin.exoplayer2.d.e eVar) {
        yVar.e(1);
        return new v.a().a(str).f("audio/ac4").k(2).l(((yVar.h() & 32) >> 5) == 1 ? 48000 : 44100).a(eVar).c(str2).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        if (r11 != 11) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
    
        if (r11 != 11) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008a, code lost:
    
        if (r11 != 8) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.applovin.exoplayer2.b.c.a a(com.applovin.exoplayer2.l.x r11) {
        /*
            r0 = 16
            int r1 = r11.c(r0)
            int r0 = r11.c(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.c(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.c(r0)
            r2 = 3
            if (r1 != r2) goto L2f
            int r4 = a(r11, r0)
            int r1 = r1 + r4
        L2f:
            r5 = r1
            r1 = 10
            int r1 = r11.c(r1)
            boolean r4 = r11.e()
            if (r4 == 0) goto L45
            int r4 = r11.c(r2)
            if (r4 <= 0) goto L45
            r11.b(r0)
        L45:
            boolean r4 = r11.e()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r7 = 44100(0xac44, float:6.1797E-41)
            if (r4 == 0) goto L53
            r9 = r6
            goto L54
        L53:
            r9 = r7
        L54:
            int r11 = r11.c(r3)
            if (r9 != r7) goto L63
            r4 = 13
            if (r11 != r4) goto L63
            int[] r0 = com.applovin.exoplayer2.b.c.f13348a
            r11 = r0[r11]
            goto L93
        L63:
            if (r9 != r6) goto L92
            int[] r4 = com.applovin.exoplayer2.b.c.f13348a
            int r6 = r4.length
            if (r11 >= r6) goto L92
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 8
            r7 = 1
            if (r1 == r7) goto L88
            r7 = 11
            if (r1 == r0) goto L83
            if (r1 == r2) goto L88
            if (r1 == r3) goto L7c
            goto L8d
        L7c:
            if (r11 == r2) goto L8f
            if (r11 == r6) goto L8f
            if (r11 != r7) goto L8d
            goto L8f
        L83:
            if (r11 == r6) goto L8f
            if (r11 != r7) goto L8d
            goto L8f
        L88:
            if (r11 == r2) goto L8f
            if (r11 != r6) goto L8d
            goto L8f
        L8d:
            r11 = r4
            goto L93
        L8f:
            int r4 = r4 + 1
            goto L8d
        L92:
            r11 = 0
        L93:
            com.applovin.exoplayer2.b.c$a r0 = new com.applovin.exoplayer2.b.c$a
            r6 = 2
            r10 = 0
            r4 = r0
            r7 = r9
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.b.c.a(com.applovin.exoplayer2.l.x):com.applovin.exoplayer2.b.c$a");
    }

    public static int a(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & DefaultClassResolver.NAME) << 8) | (bArr[3] & DefaultClassResolver.NAME);
        if (i12 == 65535) {
            i12 = ((bArr[4] & DefaultClassResolver.NAME) << 16) | ((bArr[5] & DefaultClassResolver.NAME) << 8) | (bArr[6] & DefaultClassResolver.NAME);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }

    public static int a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return a(new com.applovin.exoplayer2.l.x(bArr)).f13353e;
    }

    public static void a(int i10, com.applovin.exoplayer2.l.y yVar) {
        yVar.a(7);
        byte[] d10 = yVar.d();
        d10[0] = -84;
        d10[1] = 64;
        d10[2] = -1;
        d10[3] = -1;
        d10[4] = (byte) ((i10 >> 16) & com.anythink.expressad.exoplayer.k.p.f9095b);
        d10[5] = (byte) ((i10 >> 8) & com.anythink.expressad.exoplayer.k.p.f9095b);
        d10[6] = (byte) (i10 & com.anythink.expressad.exoplayer.k.p.f9095b);
    }

    private static int a(com.applovin.exoplayer2.l.x xVar, int i10) {
        int i11 = 0;
        while (true) {
            int c10 = xVar.c(i10) + i11;
            if (!xVar.e()) {
                return c10;
            }
            i11 = (c10 + 1) << i10;
        }
    }
}
