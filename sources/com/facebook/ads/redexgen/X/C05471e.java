package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.Format;
import java.nio.ByteBuffer;
import java.util.Arrays;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.1e */
/* loaded from: assets/audience_network.dex */
public final class C05471e extends C3G implements HM {
    public static byte[] A0E;
    public static String[] A0F = {"aLXIjAOeq43kD47uUx47KIQfBztZ5JR6", "bYDvuG1CO7Q3NDumZhhBhB8jHe", "lzauC9VKCpzgBdv7KHug0xPju0EyyDRc", "zBmjWuq", "FwqFg", "FmVSMSIXQUSd0OcxsELVimAN3SmZwHxI", "I9K2sHUvqtNZm1Rj9xJMtQcmEPzsJytW", "SRtBuggTCbvw2MXSYfok3SEL95E53gc0"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaFormat A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final AE A0C;
    public final AK A0D;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0E = new byte[]{7, 5, Ascii.DLE, 102, Ascii.ESC, Ascii.CR, Ascii.VT, 102, 41, 41, 43, 102, 44, 45, 43, 65, 67, 86, 32, 105, 97, 97, 105, 98, 107, 32, 124, 111, 121, 32, 106, 107, 109, 97, 106, 107, 124, 54, 57, 51, 37, 56, 62, 51, 121, 36, 56, 49, 35, 32, 54, 37, 50, 121, 59, 50, 54, 57, 53, 54, 52, 60, 64, 84, 69, 72, 78, Ascii.SO, 83, 64, 86, Ascii.CAN, 19, Ascii.SUB, Ascii.NAK, Ascii.NAK, Ascii.RS, Ascii.ETB, 86, Ascii.CAN, Ascii.DC4, Ascii.SO, Ascii.NAK, Ascii.SI, 63, 50, 37, 56, 59, 35, 50, 76, 65, 86, 75, 85, 72, 80, 65, 95, 83, 74, Ascii.US, 91, 92, 66, 71, 70, Ascii.US, 65, 91, 72, 87, 70, 66, 70, 78, 48, 50, 41, 47, 50, 41, 52, 57, 121, 107, 103, 122, 102, 111, 39, 120, 107, 126, 111, 70, 84, 88, 70, 64, 91, 82, 5, Ascii.SUB, Ascii.CR, Ascii.DLE, Ascii.EM, 19, Ascii.VT, Ascii.SUB};
    }

    static {
        A06();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C05471e(Context context, InterfaceC0821Cs interfaceC0821Cs, @Nullable B8<C1288Vh> b82, boolean z10, @Nullable Handler handler, @Nullable AF af, @Nullable A0 a02, A7... a7Arr) {
        this(context, interfaceC0821Cs, b82, z10, handler, af, new C1301Vu(a02, a7Arr));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C05471e(Context context, InterfaceC0821Cs interfaceC0821Cs, @Nullable B8<C1288Vh> b82, boolean z10, @Nullable Handler handler, @Nullable AF af, AK ak) {
        super(1, interfaceC0821Cs, b82, z10);
        this.A0B = context.getApplicationContext();
        this.A0D = ak;
        this.A0C = new AE(handler, af);
        ak.AET(new C1299Vs(this));
    }

    private int A00(C0815Cm c0815Cm, Format format) {
        PackageManager packageManager;
        if (C0940Hl.A02 < 24) {
            if (A04(15, 22, 30).equals(c0815Cm.A02)) {
                boolean z10 = true;
                if (C0940Hl.A02 == 23 && (packageManager = this.A0B.getPackageManager()) != null) {
                    boolean needsRawDecoderWorkaround = packageManager.hasSystemFeature(A04(37, 25, 71));
                    if (needsRawDecoderWorkaround) {
                        z10 = false;
                    }
                }
                if (z10) {
                    return -1;
                }
            }
        }
        return format.A09;
    }

    private final int A01(C0815Cm c0815Cm, Format format, Format[] formatArr) {
        int maxInputSize = A00(c0815Cm, format);
        return maxInputSize;
    }

    @SuppressLint({"InlinedApi"})
    private final MediaFormat A02(Format format, String str, int i10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A04(113, 4, 59), str);
        mediaFormat.setInteger(A04(71, 13, 107), format.A05);
        mediaFormat.setInteger(A04(125, 11, 26), format.A0C);
        C0827Cy.A06(mediaFormat, format.A0P);
        C0827Cy.A04(mediaFormat, A04(99, 14, 34), i10);
        if (C0940Hl.A02 >= 23) {
            mediaFormat.setInteger(A04(117, 8, 80), 0);
        }
        return mediaFormat;
    }

    private void A05() {
        long A6E = this.A0D.A6E(A8P());
        if (A6E != Long.MIN_VALUE) {
            if (!this.A08) {
                long newCurrentPositionUs = this.A05;
                A6E = Math.max(newCurrentPositionUs, A6E);
            }
            this.A05 = A6E;
            this.A08 = false;
        }
    }

    public static boolean A08(String str) {
        if (C0940Hl.A02 < 24 && A04(0, 15, 88).equals(str)) {
            if (A04(136, 7, 37).equals(C0940Hl.A05) && (C0940Hl.A03.startsWith(A04(143, 8, 111)) || C0940Hl.A03.startsWith(A04(84, 7, 71)) || C0940Hl.A03.startsWith(A04(91, 8, 52)))) {
                return true;
            }
        }
        return false;
    }

    private final boolean A09(String str) {
        int A00 = HO.A00(str);
        if (A00 != 0) {
            boolean A8O = this.A0D.A8O(A00);
            if (A0F[5].charAt(2) != 'V') {
                throw new RuntimeException();
            }
            A0F[1] = "OP";
            if (A8O) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.AbstractC0820Cr
    public final void A12() {
        try {
            this.A0D.ADf();
            try {
                super.A12();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.A12();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.AbstractC0820Cr
    public final void A13() {
        super.A13();
        this.A0D.AD7();
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.AbstractC0820Cr
    public final void A14() {
        A05();
        this.A0D.pause();
        super.A14();
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.AbstractC0820Cr
    public final void A15(long j10, boolean z10) throws AnonymousClass98 {
        super.A15(j10, z10);
        this.A0D.reset();
        this.A05 = j10;
        this.A07 = true;
        this.A08 = true;
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.AbstractC0820Cr
    public final void A16(boolean z10) throws AnonymousClass98 {
        super.A16(z10);
        this.A0C.A05(this.A0U);
        int i10 = A11().A00;
        if (i10 != 0) {
            this.A0D.A5A(i10);
        } else {
            this.A0D.A4o();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final int A1A(MediaCodec mediaCodec, C0815Cm c0815Cm, Format format, Format format2) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cf, code lost:
    
        if (r7 != (-1)) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d7, code lost:
    
        if (r4.A0G(r17.A0C) == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00db, code lost:
    
        if (r17.A05 == (-1)) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e3, code lost:
    
        if (r4.A0F(r17.A05) == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fa, code lost:
    
        if (r7 != (-1)) goto L119;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ec  */
    @Override // com.facebook.ads.redexgen.X.C3G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A1B(com.facebook.ads.redexgen.X.InterfaceC0821Cs r15, com.facebook.ads.redexgen.X.B8<com.facebook.ads.redexgen.X.C1288Vh> r16, com.facebook.ads.internal.exoplayer2.Format r17) throws com.facebook.ads.redexgen.X.C0824Cv {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C05471e.A1B(com.facebook.ads.redexgen.X.Cs, com.facebook.ads.redexgen.X.B8, com.facebook.ads.internal.exoplayer2.Format):int");
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final C0815Cm A1E(InterfaceC0821Cs interfaceC0821Cs, Format format, boolean z10) throws C0824Cv {
        C0815Cm passthroughDecoderInfo;
        if (A09(format.A0O) && (passthroughDecoderInfo = interfaceC0821Cs.A77()) != null) {
            return passthroughDecoderInfo;
        }
        return super.A1E(interfaceC0821Cs, format, z10);
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1H() throws AnonymousClass98 {
        try {
            this.A0D.AD8();
        } catch (AJ e10) {
            throw AnonymousClass98.A01(e10, A0y());
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:12:0x0043 */
    @Override // com.facebook.ads.redexgen.X.C3G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1K(android.media.MediaCodec r11, android.media.MediaFormat r12) throws com.facebook.ads.redexgen.X.AnonymousClass98 {
        /*
            r10 = this;
            android.media.MediaFormat r3 = r10.A06
            if (r3 == 0) goto L4a
            r2 = 113(0x71, float:1.58E-43)
            r1 = 4
            r0 = 59
            java.lang.String r0 = A04(r2, r1, r0)
            java.lang.String r0 = r3.getString(r0)
            int r3 = com.facebook.ads.redexgen.X.HO.A00(r0)
            android.media.MediaFormat r12 = r10.A06
        L17:
            r2 = 71
            r1 = 13
            r0 = 107(0x6b, float:1.5E-43)
            java.lang.String r0 = A04(r2, r1, r0)
            int r4 = r12.getInteger(r0)
            r2 = 125(0x7d, float:1.75E-43)
            r1 = 11
            r0 = 26
            java.lang.String r0 = A04(r2, r1, r0)
            int r5 = r12.getInteger(r0)
            boolean r0 = r10.A09
            if (r0 == 0) goto L4d
            r1 = 6
            if (r4 != r1) goto L4d
            int r0 = r10.A00
            if (r0 >= r1) goto L4d
            int[] r7 = new int[r0]
            r1 = 0
        L41:
            int r0 = r10.A00
            if (r1 >= r0) goto L4e
            r7[r1] = r1
            int r1 = r1 + 1
            goto L41
        L4a:
            int r3 = r10.A04
            goto L17
        L4d:
            r7 = 0
        L4e:
            com.facebook.ads.redexgen.X.AK r2 = r10.A0D     // Catch: com.facebook.ads.redexgen.X.AG -> L59
            r6 = 0
            int r8 = r10.A02     // Catch: com.facebook.ads.redexgen.X.AG -> L59
            int r9 = r10.A03     // Catch: com.facebook.ads.redexgen.X.AG -> L59
            r2.A46(r3, r4, r5, r6, r7, r8, r9)     // Catch: com.facebook.ads.redexgen.X.AG -> L59
            return
        L59:
            r1 = move-exception
            int r0 = r10.A0y()
            com.facebook.ads.redexgen.X.98 r0 = com.facebook.ads.redexgen.X.AnonymousClass98.A01(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C05471e.A1K(android.media.MediaCodec, android.media.MediaFormat):void");
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1L(Format format) throws AnonymousClass98 {
        int i10;
        super.A1L(format);
        this.A0C.A03(format);
        if (A04(62, 9, 49).equals(format.A0O)) {
            i10 = format.A0A;
        } else {
            i10 = 2;
        }
        this.A04 = i10;
        this.A00 = format.A05;
        this.A02 = format.A06;
        this.A03 = format.A07;
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1M(C1294Vn c1294Vn) {
        if (this.A07 && !c1294Vn.A03()) {
            if (Math.abs(c1294Vn.A00 - this.A05) > 500000) {
                this.A05 = c1294Vn.A00;
            }
            this.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1N(C0815Cm c0815Cm, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.A01 = A01(c0815Cm, format, A19());
        this.A09 = A08(c0815Cm.A02);
        this.A0A = c0815Cm.A04;
        MediaFormat A02 = A02(format, c0815Cm.A01 == null ? A04(62, 9, 49) : c0815Cm.A01, this.A01);
        mediaCodec.configure(A02, (Surface) null, mediaCrypto, 0);
        if (this.A0A) {
            this.A06 = A02;
            MediaFormat mediaFormat = this.A06;
            String str = format.A0O;
            String codecMimeType = A04(113, 4, 59);
            mediaFormat.setString(codecMimeType, str);
            return;
        }
        this.A06 = null;
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1O(String str, long j10, long j11) {
        this.A0C.A06(str, j10, j11);
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final boolean A1P(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10) throws AnonymousClass98 {
        if (this.A0A && (i11 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i10, false);
            return true;
        }
        if (z10) {
            mediaCodec.releaseOutputBuffer(i10, false);
            this.A0U.A08++;
            this.A0D.A7w();
            return true;
        }
        try {
            if (!this.A0D.A7t(byteBuffer, j12)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i10, false);
            this.A0U.A06++;
            return true;
        } catch (AH | AJ e10) {
            throw AnonymousClass98.A01(e10, A0y());
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0820Cr, com.facebook.ads.redexgen.X.W1
    public final HM A6u() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final C9T A7C() {
        return this.A0D.A7C();
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final long A7F() {
        if (A7U() == 2) {
            A05();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0820Cr, com.facebook.ads.redexgen.X.InterfaceC07419d
    public final void A7x(int i10, Object obj) throws AnonymousClass98 {
        if (i10 != 2) {
            if (i10 != 3) {
                super.A7x(i10, obj);
                return;
            } else {
                this.A0D.AEM((C07629z) obj);
                return;
            }
        }
        AK ak = this.A0D;
        if (A0F[7].charAt(17) == 'P') {
            throw new RuntimeException();
        }
        A0F[4] = "awvXiH99cLu1HaadjiPENScqQYAeI";
        ak.setVolume(((Float) obj).floatValue());
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.W1
    public final boolean A8P() {
        return super.A8P() && this.A0D.A8P();
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.W1
    public final boolean A8Z() {
        return this.A0D.A81() || super.A8Z();
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final C9T AEX(C9T c9t) {
        return this.A0D.AEX(c9t);
    }
}
