package hd;

import com.esotericsoftware.kryo.util.DefaultClassResolver;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f28919a;

    /* renamed from: b, reason: collision with root package name */
    public int f28920b;

    /* renamed from: c, reason: collision with root package name */
    public int f28921c;

    /* renamed from: d, reason: collision with root package name */
    public int f28922d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f28923e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f28924g;

    /* renamed from: h, reason: collision with root package name */
    public h f28925h;

    /* renamed from: i, reason: collision with root package name */
    public l f28926i;

    /* renamed from: j, reason: collision with root package name */
    public f f28927j;

    /* renamed from: k, reason: collision with root package name */
    public l f28928k;

    public final l a() {
        h hVar = this.f28925h;
        if (hVar == null) {
            return this;
        }
        return hVar.f28895a;
    }

    public final void b(int i10, int i11) {
        if (this.f28923e == null) {
            this.f28923e = new int[6];
        }
        int i12 = this.f28922d;
        int[] iArr = this.f28923e;
        if (i12 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f28923e = iArr2;
        }
        int[] iArr3 = this.f28923e;
        int i13 = this.f28922d;
        int i14 = i13 + 1;
        iArr3[i13] = i10;
        this.f28922d = i14 + 1;
        iArr3[i14] = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        if (r4 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(hd.b r2, int r3, boolean r4) {
        /*
            r1 = this;
            int r0 = r1.f28919a
            r0 = r0 & 2
            if (r0 != 0) goto L17
            r0 = -1
            if (r4 == 0) goto L11
            int r3 = (-1) - r3
            int r4 = r2.f28833b
            r1.b(r3, r4)
            goto L1c
        L11:
            int r4 = r2.f28833b
            r1.b(r3, r4)
            goto L20
        L17:
            int r0 = r1.f28921c
            int r0 = r0 - r3
            if (r4 == 0) goto L20
        L1c:
            r2.g(r0)
            goto L23
        L20:
            r2.i(r0)
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.l.c(hd.b, int, boolean):void");
    }

    public final boolean d(int i10, byte[] bArr) {
        this.f28919a |= 2;
        this.f28921c = i10;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < this.f28922d) {
            int[] iArr = this.f28923e;
            int i12 = i11 + 1;
            int i13 = iArr[i11];
            int i14 = i12 + 1;
            int i15 = iArr[i12];
            if (i13 >= 0) {
                int i16 = i10 - i13;
                if (i16 < -32768 || i16 > 32767) {
                    int i17 = i15 - 1;
                    int i18 = bArr[i17] & DefaultClassResolver.NAME;
                    if (i18 <= 168) {
                        bArr[i17] = (byte) (i18 + 49);
                    } else {
                        bArr[i17] = (byte) (i18 + 20);
                    }
                    z10 = true;
                }
                bArr[i15] = (byte) (i16 >>> 8);
                bArr[i15 + 1] = (byte) i16;
            } else {
                int i19 = i13 + i10 + 1;
                int i20 = i15 + 1;
                bArr[i15] = (byte) (i19 >>> 24);
                int i21 = i20 + 1;
                bArr[i20] = (byte) (i19 >>> 16);
                bArr[i21] = (byte) (i19 >>> 8);
                bArr[i21 + 1] = (byte) i19;
            }
            i11 = i14;
        }
        return z10;
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(hd.l r10, long r11, int r13) {
        /*
            r9 = this;
            r0 = r9
        L1:
            if (r0 == 0) goto La0
            hd.l r1 = r0.f28928k
            r2 = 0
            r0.f28928k = r2
            r2 = 0
            r3 = 1
            if (r10 == 0) goto L52
            int r4 = r0.f28919a
            r5 = r4 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L13
            goto L68
        L13:
            r4 = r4 | 2048(0x800, float:2.87E-42)
            r0.f28919a = r4
            r5 = r4 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L84
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L3a
            int r4 = r10.f28919a
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L26
            goto L3a
        L26:
            r4 = r2
        L27:
            int[] r5 = r0.f28923e
            int r6 = r5.length
            if (r4 >= r6) goto L3a
            r5 = r5[r4]
            int[] r6 = r10.f28923e
            r6 = r6[r4]
            r5 = r5 & r6
            if (r5 == 0) goto L37
            r2 = r3
            goto L3a
        L37:
            int r4 = r4 + 1
            goto L27
        L3a:
            if (r2 != 0) goto L84
            hd.f r2 = new hd.f
            r2.<init>()
            int r3 = r0.f
            r2.f28880a = r3
            hd.f r3 = r10.f28927j
            hd.l r3 = r3.f28881b
            r2.f28881b = r3
            hd.f r3 = r0.f28927j
            r2.f28882c = r3
            r0.f28927j = r2
            goto L84
        L52:
            int r4 = r0.f28919a
            r5 = r4 & 1024(0x400, float:1.435E-42)
            r6 = 32
            if (r5 == 0) goto L66
            int[] r5 = r0.f28923e
            long r7 = r11 >>> r6
            int r7 = (int) r7
            r5 = r5[r7]
            int r7 = (int) r11
            r5 = r5 & r7
            if (r5 == 0) goto L66
            r2 = r3
        L66:
            if (r2 == 0) goto L6a
        L68:
            r0 = r1
            goto L1
        L6a:
            r2 = r4 & 1024(0x400, float:1.435E-42)
            if (r2 != 0) goto L79
            r2 = r4 | 1024(0x400, float:1.435E-42)
            r0.f28919a = r2
            int r2 = r13 / 32
            int r2 = r2 + r3
            int[] r2 = new int[r2]
            r0.f28923e = r2
        L79:
            int[] r2 = r0.f28923e
            long r3 = r11 >>> r6
            int r3 = (int) r3
            r4 = r2[r3]
            int r5 = (int) r11
            r4 = r4 | r5
            r2[r3] = r4
        L84:
            hd.f r2 = r0.f28927j
        L86:
            if (r2 == 0) goto L68
            int r3 = r0.f28919a
            r3 = r3 & 128(0x80, float:1.8E-43)
            if (r3 == 0) goto L94
            hd.f r3 = r0.f28927j
            hd.f r3 = r3.f28882c
            if (r2 == r3) goto L9d
        L94:
            hd.l r3 = r2.f28881b
            hd.l r4 = r3.f28928k
            if (r4 != 0) goto L9d
            r3.f28928k = r1
            r1 = r3
        L9d:
            hd.f r2 = r2.f28882c
            goto L86
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.l.e(hd.l, long, int):void");
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("L");
        stringBuffer.append(System.identityHashCode(this));
        return stringBuffer.toString();
    }
}
