package m4;

import com.huawei.openalliance.ad.constant.ag;

/* compiled from: Ac4Util.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f32709a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, ag.f21998i, ag.f21998i, 2048};

    /* compiled from: Ac4Util.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f32710a;

        /* renamed from: b, reason: collision with root package name */
        public final int f32711b;

        /* renamed from: c, reason: collision with root package name */
        public final int f32712c;

        public a(int i10, int i11, int i12) {
            this.f32710a = i10;
            this.f32711b = i11;
            this.f32712c = i12;
        }
    }

    public static void a(int i10, d6.w wVar) {
        wVar.B(7);
        byte[] bArr = wVar.f27384a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & com.anythink.expressad.exoplayer.k.p.f9095b);
        bArr[5] = (byte) ((i10 >> 8) & com.anythink.expressad.exoplayer.k.p.f9095b);
        bArr[6] = (byte) (i10 & com.anythink.expressad.exoplayer.k.p.f9095b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r9.f() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r2 = r9.g(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r9.f() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r9.g(3) <= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r9.m(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r9.f() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r5 = 48000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        r9 = r9.g(4);
        r8 = m4.c.f32709a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r5 != 44100) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r9 != 13) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        r9 = r8[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        return new m4.c.a(r5, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r5 != 48000) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        if (r9 >= 14) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        r6 = r8[r9];
        r2 = r2 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        if (r2 == 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        if (r2 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        if (r2 == 3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        if (r2 == 4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (r9 == 3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        if (r9 == 8) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0084, code lost:
    
        if (r9 == 8) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0086, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0089, code lost:
    
        if (r9 == 3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008b, code lost:
    
        if (r9 != 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0091, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0055, code lost:
    
        r5 = 44100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r9.g(2) == 3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r9.g(2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static m4.c.a b(d6.v r9) {
        /*
            r0 = 16
            int r1 = r9.g(r0)
            int r0 = r9.g(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.g(r0)
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
            r1 = 2
            int r2 = r9.g(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.g(r1)
            boolean r2 = r9.f()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.g(r2)
            boolean r5 = r9.f()
            if (r5 == 0) goto L47
            int r5 = r9.g(r4)
            if (r5 <= 0) goto L47
            r9.m(r1)
        L47:
            boolean r5 = r9.f()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r7 = 44100(0xac44, float:6.1797E-41)
            if (r5 == 0) goto L55
            r5 = r6
            goto L56
        L55:
            r5 = r7
        L56:
            int r9 = r9.g(r3)
            int[] r8 = m4.c.f32709a
            if (r5 != r7) goto L65
            r7 = 13
            if (r9 != r7) goto L65
            r9 = r8[r9]
            goto L92
        L65:
            if (r5 != r6) goto L91
            r6 = 14
            if (r9 >= r6) goto L91
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L89
            r7 = 11
            if (r2 == r1) goto L84
            if (r2 == r4) goto L89
            if (r2 == r3) goto L7d
            goto L8f
        L7d:
            if (r9 == r4) goto L8d
            if (r9 == r8) goto L8d
            if (r9 != r7) goto L8f
            goto L8d
        L84:
            if (r9 == r8) goto L8d
            if (r9 != r7) goto L8f
            goto L8d
        L89:
            if (r9 == r4) goto L8d
            if (r9 != r8) goto L8f
        L8d:
            int r6 = r6 + 1
        L8f:
            r9 = r6
            goto L92
        L91:
            r9 = 0
        L92:
            m4.c$a r1 = new m4.c$a
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.c.b(d6.v):m4.c$a");
    }
}
