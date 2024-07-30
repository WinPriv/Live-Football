package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.b;
import com.anythink.expressad.foundation.g.a;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.Format;
import com.huawei.openalliance.ad.constant.ag;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.3G, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C3G extends AbstractC0820Cr {
    public static byte[] A0d;
    public static String[] A0e = {"9OVkIR1fNYEoLuJhr4v44UGIqobat2iA", "rvjyAE4a8qg3Symxb7ylQnmZk1yEw18g", "yq3KpxRuPN0WZ8jbU7FQkuT3q90s4j9W", "QhWwoh5s4IWFZsopFlKjqr3qYdcDlMjY", "GXhQrMO3EYw7GpvgdmF2LLQyblaoRrya", "HarHLo3NfHHJ1sn22D42qgtNJjG4ySv5", "mWzZtnKFhVqOEEmQC7RHyJpmfpW8oE62", "x54zHbOQHTTVCgIECmCrfbqAOALLU5ir"};
    public static final byte[] A0f;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaCodec A06;
    public Format A07;
    public B7<C1288Vh> A08;
    public B7<C1288Vh> A09;
    public C0815Cm A0A;
    public ByteBuffer A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public ByteBuffer[] A0S;
    public ByteBuffer[] A0T;
    public C0771Ai A0U;
    public final MediaCodec.BufferInfo A0V;
    public final C9L A0W;
    public final C1294Vn A0X;
    public final C1294Vn A0Y;

    @Nullable
    public final B8<C1288Vh> A0Z;
    public final InterfaceC0821Cs A0a;
    public final List<Long> A0b;
    public final boolean A0c;

    public static String A0Z(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0d, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 20);
        }
        return new String(copyOfRange);
    }

    public static void A0j() {
        A0d = new byte[]{76, 64, 2, Ascii.NAK, Ascii.DC4, 64, Ascii.SO, Ascii.SI, 64, 19, 5, 3, Ascii.NAK, Ascii.DC2, 5, 64, 4, 5, 3, Ascii.SI, 4, 5, Ascii.DC2, 64, 1, Ascii.SYN, 1, 9, Ascii.FF, 1, 2, Ascii.FF, 5, 78, 64, 52, Ascii.DC2, Ascii.EM, 9, Ascii.SO, 7, 64, Ascii.DC4, Ascii.SI, 64, Ascii.DLE, Ascii.DC2, Ascii.SI, 3, 5, 5, 4, 64, Ascii.ETB, 9, Ascii.DC4, 8, 64, 118, 116, 116, 116, 116, 116, 117, 114, 115, 112, 118, 7, 116, 116, 6, 0, 5, 118, 113, 125, 116, 116, 116, 116, 116, 116, 117, 114, 124, 7, 1, 116, 2, 117, 119, 118, 116, 116, 116, 116, 116, 116, 117, 114, 113, 124, 124, 124, 112, 116, 0, 7, 1, 115, 117, 117, 124, 5, 116, 116, 116, 118, 2, 6, 2, 117, 7, 119, 117, 7, 119, 118, 115, 113, 0, 115, 124, 7, 0, Ascii.DC2, 4, Ascii.SI, 8, Ascii.SUB, 3, Ascii.GS, Ascii.SUB, 8, Ascii.SI, 117, 89, 85, 78, 91, 90, 34, Ascii.DC4, Ascii.VT, 70, Ascii.NAK, 3, Ascii.NAK, Ascii.NAK, Ascii.SI, 9, 8, 70, Ascii.DC4, 3, Ascii.ETB, 19, Ascii.SI, Ascii.DC4, 3, Ascii.NAK, 70, Ascii.NAK, 3, 5, 19, Ascii.DC4, 3, 70, 2, 3, 5, 9, 2, 3, Ascii.DC4, 70, 0, 9, Ascii.DC4, 70, 62, Ascii.SYN, Ascii.ETB, Ascii.SUB, Ascii.DC2, 83, 1, Ascii.SYN, 2, 6, Ascii.SUB, 1, Ascii.SYN, 0, 83, Ascii.DC2, 83, 55, 1, Ascii.RS, 32, Ascii.SYN, 0, 0, Ascii.SUB, Ascii.FS, Ascii.GS, 62, Ascii.DC2, Ascii.GS, Ascii.DC2, Ascii.DC4, Ascii.SYN, 1, 125, 85, 84, 89, 81, 115, 95, 84, 85, 83, 98, 85, 94, 84, 85, 66, 85, 66, 125, Ascii.DEL, 106, Ascii.FS, 119, 74, 75, 92, 93, 65, Ascii.FS, 83, 68, 81, Ascii.FS, 86, 87, 81, Ascii.ESC, Ascii.EM, Ascii.FF, 122, 17, 44, 45, 58, 59, 39, 122, 53, 34, 55, 122, 48, 49, 55, 122, 39, 49, 55, 33, 38, 49, 74, 72, 93, 43, 72, 81, 78, 43, 68, 80, 65, 76, 74, 43, 65, 64, 70, 74, 65, 64, 87, 43, 72, 85, 54, Ascii.DEL, 125, 104, Ascii.RS, 125, 100, 123, Ascii.RS, 102, 121, 116, 117, Ascii.DEL, Ascii.RS, 116, 117, 115, Ascii.DEL, 116, 117, 98, Ascii.RS, 113, 102, 115, 3, 1, Ascii.DC4, 98, 2, 58, 37, 40, 37, 45, 98, 36, 126, 122, 120, 98, 40, 41, 47, 35, 40, 41, 47, 45, 56, 78, 46, Ascii.SYN, 9, 4, 9, 1, 78, 8, 82, 86, 84, 78, 4, 5, 3, Ascii.SI, 4, 5, 78, 19, 5, 3, Ascii.NAK, Ascii.DC2, 5, 121, 123, 110, Ascii.CAN, 101, 115, 117, Ascii.CAN, 87, 64, 85, Ascii.CAN, 82, 83, 85, 72, 74, 95, 41, 84, 66, 68, 41, 102, 113, 100, 41, 99, 98, 100, 41, 116, 98, 100, 114, 117, 98, 45, 47, 58, 76, 3, Ascii.SO, Ascii.SO, Ascii.NAK, Ascii.VT, Ascii.FF, Ascii.FF, 7, Ascii.DLE, 76, Ascii.DC4, Ascii.VT, 6, 7, Ascii.CR, 76, 6, 7, 1, Ascii.CR, 6, 7, Ascii.DLE, 76, 3, Ascii.DC4, 1, 1, 3, Ascii.SYN, 96, 47, 35, 34, 33, 41, 39, 45, 96, 47, 56, 45, 96, 42, 43, 45, 33, 42, 43, 60, 96, 47, 57, 43, 61, 33, 35, 43, 63, 61, 40, 94, 17, Ascii.GS, Ascii.FS, Ascii.US, Ascii.ETB, Ascii.EM, 19, 94, 17, 6, 19, 94, Ascii.DC4, Ascii.NAK, 19, Ascii.US, Ascii.DC4, Ascii.NAK, 2, 94, 17, 7, Ascii.NAK, 3, Ascii.US, Ascii.GS, Ascii.NAK, 94, 3, Ascii.NAK, 19, 5, 2, Ascii.NAK, 121, 123, 110, Ascii.CAN, 81, 89, 89, 81, 90, 83, Ascii.CAN, 87, 87, 85, Ascii.CAN, 82, 83, 85, 89, 82, 83, 68, Ascii.RS, Ascii.FS, 9, Ascii.DEL, 54, 62, 62, 54, 61, 52, Ascii.DEL, 39, 62, 35, 51, 56, 34, Ascii.DEL, 53, 52, 50, 62, 53, 52, 35, 2, 0, Ascii.NAK, 99, 63, 38, 99, 59, 36, 41, 40, 34, Ascii.DC2, 41, 40, 46, 34, 41, 40, 63, 99, 44, 59, 46, 112, 110, Ascii.SO, 98, Ascii.SYN, Ascii.DC2, 19, 41, 55, 87, 59, 79, 72, 74, 106, 116, Ascii.DC4, 126, 1, 9, 9, 116, 106, 10, 109, Ascii.DLE, Ascii.ETB, Ascii.ETB, 79, 81, 49, 72, 41, 36, 41, 106, 97, 104, 103, 103, 108, 101, 36, 106, 102, 124, 103, 125, 63, 51, 50, 58, 53, 59, 41, 46, 57, Ascii.US, 51, 56, 57, 63, Ascii.SI, Ascii.RS, 9, Ascii.CR, Ascii.CAN, 9, 47, 3, 8, 9, Ascii.SI, 86, 96, 118, 101, 109, 106, 69, 106, 96, 66, 97, 97, 96, 83, 89, 90, 64, 91, 81, 80, 71, Ascii.CAN, Ascii.DC2, 17, Ascii.VT, Ascii.DLE, Ascii.SUB, Ascii.ESC, Ascii.FF, 33, Ascii.DC2, 10, Ascii.ESC, 5, Ascii.DLE, Ascii.CR, Ascii.ETB, Ascii.DC2, 7, Ascii.DLE, 43, 33, 113, 115, 115, 115, 45, 32, 44, 34, 45, 49, 3, 4, 17, 2, 4, 51, Ascii.US, Ascii.DC4, Ascii.NAK, 19, 113, 108, 105, 100, 117, 108, 100, 101, 123, 118, 102, 122};
    }

    public abstract int A1B(InterfaceC0821Cs interfaceC0821Cs, B8<C1288Vh> b82, Format format) throws C0824Cv;

    public abstract void A1N(C0815Cm c0815Cm, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws C0824Cv;

    public abstract boolean A1P(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10) throws AnonymousClass98;

    static {
        A0j();
        A0f = C0940Hl.A0h(A0Z(59, 76, 80));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C3G(int i10, InterfaceC0821Cs interfaceC0821Cs, @Nullable B8<C1288Vh> b82, boolean z10) {
        super(i10);
        H6.A04(C0940Hl.A02 >= 16);
        this.A0a = (InterfaceC0821Cs) H6.A01(interfaceC0821Cs);
        this.A0Z = b82;
        this.A0c = z10;
        this.A0X = new C1294Vn(0);
        this.A0Y = C1294Vn.A02();
        this.A0W = new C9L();
        this.A0b = new ArrayList();
        this.A0V = new MediaCodec.BufferInfo();
        this.A01 = 0;
        this.A02 = 0;
    }

    private int A0W(String str) {
        if (C0940Hl.A02 <= 25 && A0Z(263, 25, 64).equals(str)) {
            String str2 = C0940Hl.A06;
            if (A0e[5].charAt(22) != 'm') {
                String[] strArr = A0e;
                strArr[3] = "rXHSxRetqBcaMazmAuD1LrMN32rrN6yB";
                strArr[0] = "PYELojq5TDB6rkMOhN6BPW4xOGIFZ2Jw";
                if (str2.startsWith(A0Z(625, 7, 8)) || C0940Hl.A06.startsWith(A0Z(597, 7, 55)) || C0940Hl.A06.startsWith(A0Z(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED, 7, 110)) || C0940Hl.A06.startsWith(A0Z(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_SERVER_DATA, 7, 51))) {
                    return 2;
                }
            }
            throw new RuntimeException();
        }
        if (C0940Hl.A02 < 24) {
            if (A0Z(338, 22, 88).equals(str) || A0Z(360, 29, 116).equals(str)) {
                if (!A0Z(683, 8, 33).equals(C0940Hl.A03)) {
                    String str3 = C0940Hl.A03;
                    String A0Z = A0Z(691, 12, 106);
                    String[] strArr2 = A0e;
                    if (strArr2[1].charAt(9) != strArr2[6].charAt(9)) {
                        A0e[7] = "EJTrH92MD698cCrSnGocCFo99KF41O7G";
                        if (!A0Z.equals(str3)) {
                            if (!A0Z(ag.P, 7, 118).equals(C0940Hl.A03)) {
                                if (A0Z(732, 7, 17).equals(C0940Hl.A03)) {
                                    return 1;
                                }
                                return 0;
                            }
                            return 1;
                        }
                        return 1;
                    }
                    throw new RuntimeException();
                }
                return 1;
            }
            return 0;
        }
        return 0;
    }

    private final long A0X() {
        return 0L;
    }

    public static MediaCodec.CryptoInfo A0Y(C1294Vn c1294Vn, int i10) {
        MediaCodec.CryptoInfo A02 = c1294Vn.A02.A02();
        if (i10 == 0) {
            return A02;
        }
        if (A02.numBytesOfClearData == null) {
            String[] strArr = A0e;
            if (strArr[1].charAt(9) == strArr[6].charAt(9)) {
                throw new RuntimeException();
            }
            A0e[5] = "UbtyB27B24Biu3n6sBWjRVSN4hFFB4s1";
            A02.numBytesOfClearData = new int[1];
        }
        int[] iArr = A02.numBytesOfClearData;
        iArr[0] = iArr[0] + i10;
        return A02;
    }

    private ByteBuffer A0a(int i10) {
        if (C0940Hl.A02 >= 21) {
            return this.A06.getInputBuffer(i10);
        }
        return this.A0S[i10];
    }

    private ByteBuffer A0b(int i10) {
        if (C0940Hl.A02 >= 21) {
            return this.A06.getOutputBuffer(i10);
        }
        return this.A0T[i10];
    }

    private void A0c() {
        if (C0940Hl.A02 < 21) {
            this.A0S = this.A06.getInputBuffers();
            this.A0T = this.A06.getOutputBuffers();
        }
    }

    private void A0d() throws AnonymousClass98 {
        if (this.A02 == 2) {
            A1G();
            A1I();
        } else {
            this.A0N = true;
            A1H();
        }
    }

    private void A0e() {
        if (C0940Hl.A02 < 21) {
            this.A0T = this.A06.getOutputBuffers();
        }
    }

    private void A0f() throws AnonymousClass98 {
        MediaFormat outputFormat = this.A06.getOutputFormat();
        if (this.A00 != 0 && outputFormat.getInteger(A0Z(739, 5, 6)) == 32 && outputFormat.getInteger(A0Z(716, 6, 81)) == 32) {
            this.A0O = true;
            return;
        }
        if (this.A0I) {
            outputFormat.setInteger(A0Z(632, 13, 29), 1);
        }
        A1K(this.A06, outputFormat);
    }

    private void A0g() {
        if (C0940Hl.A02 < 21) {
            this.A0S = null;
            this.A0T = null;
        }
    }

    private void A0h() {
        this.A03 = -1;
        this.A0X.A01 = null;
    }

    private void A0i() {
        this.A04 = -1;
        this.A0B = null;
    }

    private void A0k(C0817Co c0817Co) throws AnonymousClass98 {
        throw AnonymousClass98.A01(c0817Co, A0y());
    }

    private boolean A0l() {
        if (A0Z(147, 6, 32).equals(C0940Hl.A05)) {
            if (!A0Z(139, 4, 90).equals(C0940Hl.A06)) {
                if (A0Z(135, 4, 82).equals(C0940Hl.A06)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00e3, code lost:
    
        if (r5 == r6.charAt(9)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00e5, code lost:
    
        com.facebook.ads.redexgen.X.C3G.A0e[7] = "0VatHXJ47YZXuQNTjh1Q4vWnAJchohqJ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00ec, code lost:
    
        if (r7 >= r8) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0111, code lost:
    
        r12.A01 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00ee, code lost:
    
        r12.A0X.A01.put(r12.A07.A0P.get(r7));
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0102, code lost:
    
        r6 = com.facebook.ads.redexgen.X.C3G.A0e;
        r6[3] = "zOhD8BhFeW0zpu1geu8qUgn88iwXK5ep";
        r6[0] = "60rX9qlLFkokv4JD1C8g9QKhync8N1Cu";
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x010e, code lost:
    
        if (r7 >= r8) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0113, code lost:
    
        r7 = r12.A0X.A01;
        r6 = com.facebook.ads.redexgen.X.C3G.A0e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0129, code lost:
    
        if (r6[1].charAt(9) == r6[6].charAt(9)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x012b, code lost:
    
        r6 = com.facebook.ads.redexgen.X.C3G.A0e;
        r6[1] = "39aArsNj3IDVPnG6lUIYrUviornu3auc";
        r6[6] = "ZVN5NvQX1lR02F2nkBpRehMiTRLfpSWC";
        r5 = r7.position();
        r6 = A10(r12.A0W, r12.A0X, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0145, code lost:
    
        r5 = r7.position();
        r6 = A10(r12.A0W, r12.A0X, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00b7, code lost:
    
        if (r7 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r7 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        r12.A0C = false;
        r12.A0X.A01.put(com.facebook.ads.redexgen.X.C3G.A0f);
        r12.A06.queueInputBuffer(r12.A03, 0, com.facebook.ads.redexgen.X.C3G.A0f.length, 0, 0);
        A0h();
        r12.A0J = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        if (r12.A0R == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        r6 = -4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (r6 != (-3)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0154, code lost:
    
        if (r6 != (-5)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0158, code lost:
    
        if (r12.A01 != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x015a, code lost:
    
        r12.A0X.A07();
        r12.A01 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0161, code lost:
    
        A1L(r12.A0W.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0168, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x016f, code lost:
    
        if (r12.A0X.A04() == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0173, code lost:
    
        if (r12.A01 != 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0175, code lost:
    
        r12.A0X.A07();
        r12.A01 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x017c, code lost:
    
        r12.A0M = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0180, code lost:
    
        if (r12.A0J != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0182, code lost:
    
        A0d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0185, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0188, code lost:
    
        if (r12.A0G == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x019c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x018b, code lost:
    
        r12.A0K = true;
        r12.A06.queueInputBuffer(r12.A03, 0, 0, 0, 4);
        A0h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x019d, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a6, code lost:
    
        throw com.facebook.ads.redexgen.X.AnonymousClass98.A01(r1, A0y());
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a9, code lost:
    
        if (r12.A0Q == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b1, code lost:
    
        if (r12.A0X.A05() != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b3, code lost:
    
        r12.A0X.A07();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ba, code lost:
    
        if (r12.A01 != 2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01bc, code lost:
    
        r12.A01 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01be, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01bf, code lost:
    
        r12.A0Q = false;
        r6 = r12.A0X.A0A();
        r12.A0R = A0w(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01cf, code lost:
    
        if (r12.A0R == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d4, code lost:
    
        if (r12.A0D == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d6, code lost:
    
        if (r6 != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d8, code lost:
    
        com.facebook.ads.redexgen.X.HR.A0A(r12.A0X.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e7, code lost:
    
        if (r12.A0X.A01.position() != 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e9, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ea, code lost:
    
        r12.A0D = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ec, code lost:
    
        r8 = r12.A0X.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f6, code lost:
    
        if (r12.A0X.A03() == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01f8, code lost:
    
        r12.A0b.add(java.lang.Long.valueOf(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0201, code lost:
    
        r12.A0X.A08();
        A1M(r12.A0X);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020b, code lost:
    
        if (r6 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0220, code lost:
    
        r12.A06.queueSecureInputBuffer(r12.A03, 0, A0Y(r12.A0X, r5), r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x022f, code lost:
    
        A0h();
        r12.A0J = true;
        r12.A01 = 0;
        r12.A0U.A04++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x023d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x020e, code lost:
    
        r12.A06.queueInputBuffer(r12.A03, 0, r12.A0X.A01.limit(), r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x023e, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0247, code lost:
    
        throw com.facebook.ads.redexgen.X.AnonymousClass98.A01(r1, A0y());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00c6, code lost:
    
        if (r12.A01 != 1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00c8, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00c9, code lost:
    
        r8 = r12.A07.A0P.size();
        r6 = com.facebook.ads.redexgen.X.C3G.A0e;
        r5 = r6[1];
        r6 = r6[6];
        r5 = r5.charAt(9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0m() throws com.facebook.ads.redexgen.X.AnonymousClass98 {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3G.A0m():boolean");
    }

    private boolean A0n() {
        return this.A04 >= 0;
    }

    private boolean A0o(long j10) {
        int size = this.A0b.size();
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = this.A0b.get(i10).longValue();
            String[] strArr = A0e;
            String str = strArr[1];
            String str2 = strArr[6];
            int i11 = str.charAt(9);
            int size2 = str2.charAt(9);
            if (i11 == size2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[4] = "ML5bMotUrNJfefR5zyFOe6FKAXdvvO6A";
            strArr2[2] = "SdeYytwJjEjJxI17XZFSuNmI9VlWoLpo";
            if (longValue == j10) {
                this.A0b.remove(i10);
                int i12 = A0e[5].charAt(22);
                if (i12 != 109) {
                    String[] strArr3 = A0e;
                    strArr3[4] = "PN0xo47Kt8nFjD42DkF1Rwv3kccfY0ZU";
                    strArr3[2] = "8XhLexKKIuuBUtz2cCFHUx77okN3o4VX";
                    return true;
                }
                String[] strArr4 = A0e;
                strArr4[1] = "MaO0vnTK96XnVNRleRSpONjFXCjP5Eov";
                strArr4[6] = "hUdEzwsPaliJglUJ7NraoDZ4Fn5DncmA";
                return false;
            }
        }
        return false;
    }

    private boolean A0p(long j10, long j11) throws AnonymousClass98 {
        boolean processedOutputBuffer;
        int dequeueOutputBuffer;
        if (!A0n()) {
            if (this.A0F && this.A0K) {
                try {
                    dequeueOutputBuffer = this.A06.dequeueOutputBuffer(this.A0V, A0X());
                } catch (IllegalStateException unused) {
                    A0d();
                    if (this.A0N) {
                        A1G();
                    }
                    return false;
                }
            } else {
                dequeueOutputBuffer = this.A06.dequeueOutputBuffer(this.A0V, A0X());
            }
            if (dequeueOutputBuffer >= 0) {
                if (this.A0O) {
                    this.A0O = false;
                    this.A06.releaseOutputBuffer(dequeueOutputBuffer, false);
                    return true;
                }
                int outputIndex = this.A0V.size;
                if (outputIndex == 0) {
                    int outputIndex2 = this.A0V.flags;
                    if ((outputIndex2 & 4) != 0) {
                        A0d();
                        return false;
                    }
                }
                this.A04 = dequeueOutputBuffer;
                this.A0B = A0b(dequeueOutputBuffer);
                ByteBuffer byteBuffer = this.A0B;
                if (byteBuffer != null) {
                    int outputIndex3 = this.A0V.offset;
                    byteBuffer.position(outputIndex3);
                    ByteBuffer byteBuffer2 = this.A0B;
                    int i10 = this.A0V.offset;
                    int outputIndex4 = this.A0V.size;
                    byteBuffer2.limit(i10 + outputIndex4);
                }
                this.A0P = A0o(this.A0V.presentationTimeUs);
            } else {
                if (dequeueOutputBuffer == -2) {
                    A0f();
                    return true;
                }
                if (dequeueOutputBuffer == -3) {
                    A0e();
                    return true;
                }
                if (this.A0G && (this.A0M || this.A02 == 2)) {
                    A0d();
                }
                return false;
            }
        }
        boolean z10 = this.A0F;
        String[] strArr = A0e;
        if (strArr[3].charAt(8) != strArr[0].charAt(8)) {
            String[] strArr2 = A0e;
            strArr2[3] = "H6QEdKrNS5VKUI2eiDzJYDiDaOSTSHZm";
            strArr2[0] = "qtM0JqIstAlLtY5WeeeWIRjDSmIhrDzd";
            if (z10 && this.A0K) {
                try {
                    processedOutputBuffer = A1P(j10, j11, this.A06, this.A0B, this.A04, this.A0V.flags, this.A0V.presentationTimeUs, this.A0P);
                } catch (IllegalStateException unused2) {
                    A0d();
                    boolean z11 = this.A0N;
                    String[] strArr3 = A0e;
                    if (strArr3[4].charAt(18) == strArr3[2].charAt(18)) {
                        String[] strArr4 = A0e;
                        strArr4[3] = "kLeAoHdKyNjlIY3W2lnlzypZ7jBCZpds";
                        strArr4[0] = "12vglqLCD0wnh38LM4o4LF1q7CPuStNa";
                        if (z11) {
                            A1G();
                        }
                        return false;
                    }
                }
            } else {
                processedOutputBuffer = A1P(j10, j11, this.A06, this.A0B, this.A04, this.A0V.flags, this.A0V.presentationTimeUs, this.A0P);
            }
            if (processedOutputBuffer) {
                A1J(this.A0V.presentationTimeUs);
                boolean processedOutputBuffer2 = (this.A0V.flags & 4) != 0;
                A0i();
                if (!processedOutputBuffer2) {
                    return true;
                }
                A0d();
            }
            return false;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r0.equals(r3) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0q(com.facebook.ads.redexgen.X.C0815Cm r4) {
        /*
            java.lang.String r3 = r4.A02
            int r1 = com.facebook.ads.redexgen.X.C0940Hl.A02
            r0 = 17
            if (r1 > r0) goto L28
            r2 = 573(0x23d, float:8.03E-43)
            r1 = 24
            r0 = 89
            java.lang.String r0 = A0Z(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L4e
            r2 = 426(0x1aa, float:5.97E-43)
            r1 = 31
            r0 = 118(0x76, float:1.65E-43)
            java.lang.String r0 = A0Z(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L4e
        L28:
            java.lang.String r3 = com.facebook.ads.redexgen.X.C0940Hl.A05
            r2 = 147(0x93, float:2.06E-43)
            r1 = 6
            r0 = 32
            java.lang.String r0 = A0Z(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L50
            java.lang.String r3 = com.facebook.ads.redexgen.X.C0940Hl.A06
            r2 = 143(0x8f, float:2.0E-43)
            r1 = 4
            r0 = 72
            java.lang.String r0 = A0Z(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L50
            boolean r0 = r4.A05
            if (r0 == 0) goto L50
        L4e:
            r0 = 1
        L4f:
            return r0
        L50:
            r0 = 0
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3G.A0q(com.facebook.ads.redexgen.X.Cm):boolean");
    }

    public static boolean A0r(String str) {
        if (C0940Hl.A02 > 23 || !A0Z(548, 25, 69).equals(str)) {
            if (C0940Hl.A02 <= 19) {
                if (A0Z(710, 6, 87).equals(C0940Hl.A03)) {
                    String[] strArr = A0e;
                    if (strArr[3].charAt(8) == strArr[0].charAt(8)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0e;
                    strArr2[1] = "95wFKgRrMS7zF0LnDUBUyEKLdOv2pw0Q";
                    strArr2[6] = "8UM2DR4qd3kvfN0lEIyvKJByOBGtF0J9";
                    if (A0Z(457, 31, 90).equals(str) || A0Z(488, 38, 100).equals(str)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0s(String str) {
        return C0940Hl.A02 == 21 && A0Z(IronSourceError.ERROR_CAPPED_PER_SESSION, 22, 34).equals(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (A0Z(com.anythink.expressad.video.dynview.a.a.f11399v, 22, 19).equals(r4) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0t(java.lang.String r4) {
        /*
            int r0 = com.facebook.ads.redexgen.X.C0940Hl.A02
            r1 = 18
            if (r0 < r1) goto L81
            int r0 = com.facebook.ads.redexgen.X.C0940Hl.A02
            if (r0 != r1) goto L4a
            r2 = 389(0x185, float:5.45E-43)
            r1 = 15
            r0 = 34
            java.lang.String r0 = A0Z(r2, r1, r0)
            boolean r3 = r0.equals(r4)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3G.A0e
            r0 = 3
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 8
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L85
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3G.A0e
            java.lang.String r1 = "meV5e9Kkfi1Cw7qLNaZXa1JKO1Lv4Z7w"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "iFBSwhWIKfzcqDOwhwOBewnG37AI8L0V"
            r0 = 6
            r2[r0] = r1
            if (r3 != 0) goto L81
            r2 = 404(0x194, float:5.66E-43)
            r1 = 22
            r0 = 19
            java.lang.String r0 = A0Z(r2, r1, r0)
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L81
        L4a:
            int r1 = com.facebook.ads.redexgen.X.C0940Hl.A02
            r0 = 19
            if (r1 != r0) goto L83
            java.lang.String r3 = com.facebook.ads.redexgen.X.C0940Hl.A06
            r2 = 611(0x263, float:8.56E-43)
            r1 = 7
            r0 = 45
            java.lang.String r0 = A0Z(r2, r1, r0)
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L83
            r2 = 245(0xf5, float:3.43E-43)
            r1 = 18
            r0 = 38
            java.lang.String r0 = A0Z(r2, r1, r0)
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L81
            r2 = 263(0x107, float:3.69E-43)
            r1 = 25
            r0 = 64
            java.lang.String r0 = A0Z(r2, r1, r0)
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L83
        L81:
            r0 = 1
        L82:
            return r0
        L83:
            r0 = 0
            goto L82
        L85:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3G.A0t(java.lang.String):boolean");
    }

    public static boolean A0u(String str, Format format) {
        return C0940Hl.A02 < 21 && format.A0P.isEmpty() && A0Z(313, 25, 36).equals(str);
    }

    public static boolean A0v(String str, Format format) {
        return C0940Hl.A02 <= 18 && format.A05 == 1 && A0Z(a.aW, 25, 17).equals(str);
    }

    private boolean A0w(boolean z10) throws AnonymousClass98 {
        if (this.A08 == null || (!z10 && this.A0c)) {
            return false;
        }
        int A7U = this.A08.A7U();
        if (A7U != 1) {
            return A7U != 4;
        }
        B5 A6W = this.A08.A6W();
        int drmSessionState = A0y();
        throw AnonymousClass98.A01(A6W, drmSessionState);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0820Cr
    public void A12() {
        this.A07 = null;
        try {
            A1G();
            try {
                if (this.A08 != null) {
                    this.A0Z.ADl(this.A08);
                }
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.ADl(this.A09);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.ADl(this.A09);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.A08 != null) {
                    this.A0Z.ADl(this.A08);
                }
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.ADl(this.A09);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.ADl(this.A09);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0820Cr
    public void A13() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0820Cr
    public void A14() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0820Cr
    public void A15(long j10, boolean z10) throws AnonymousClass98 {
        this.A0M = false;
        this.A0N = false;
        if (this.A06 != null) {
            A1F();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0820Cr
    public void A16(boolean z10) throws AnonymousClass98 {
        this.A0U = new C0771Ai();
    }

    public int A1A(MediaCodec mediaCodec, C0815Cm c0815Cm, Format format, Format format2) {
        return 0;
    }

    public final MediaCodec A1C() {
        return this.A06;
    }

    public final C0815Cm A1D() {
        return this.A0A;
    }

    public C0815Cm A1E(InterfaceC0821Cs interfaceC0821Cs, Format format, boolean z10) throws C0824Cv {
        return interfaceC0821Cs.A6L(format.A0O, z10);
    }

    public void A1F() throws AnonymousClass98 {
        this.A05 = b.f7291b;
        A0h();
        A0i();
        this.A0Q = true;
        this.A0R = false;
        this.A0P = false;
        this.A0b.clear();
        this.A0C = false;
        this.A0O = false;
        if (this.A0H || (this.A0E && this.A0K)) {
            A1G();
            A1I();
        } else {
            int i10 = this.A02;
            if (A0e[7].charAt(4) != 'H') {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[1] = "wbouPn2Ftm3cpLG8fvuyld6AKnPflzbx";
            strArr[6] = "bzy96m6ZRNxMDmYLQEfFnOCqhh49XGXp";
            if (i10 != 0) {
                A1G();
                A1I();
            } else {
                this.A06.flush();
                this.A0J = false;
            }
        }
        if (this.A0L && this.A07 != null) {
            this.A01 = 1;
        }
    }

    public void A1G() {
        this.A05 = b.f7291b;
        A0h();
        A0i();
        this.A0R = false;
        this.A0P = false;
        this.A0b.clear();
        A0g();
        this.A0A = null;
        this.A0L = false;
        this.A0J = false;
        this.A0D = false;
        this.A0H = false;
        this.A00 = 0;
        this.A0G = false;
        this.A0E = false;
        this.A0I = false;
        this.A0C = false;
        this.A0O = false;
        this.A0K = false;
        this.A01 = 0;
        this.A02 = 0;
        if (this.A06 != null) {
            this.A0U.A01++;
            try {
                this.A06.stop();
                try {
                    this.A06.release();
                    this.A06 = null;
                    B7<C1288Vh> b72 = this.A08;
                    if (b72 != null && this.A09 != b72) {
                        try {
                            this.A0Z.ADl(b72);
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    this.A06 = null;
                    B7<C1288Vh> b73 = this.A08;
                    if (b73 != null && this.A09 != b73) {
                        try {
                            this.A0Z.ADl(b73);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.A06.release();
                    this.A06 = null;
                    B7<C1288Vh> b74 = this.A08;
                    if (b74 != null && this.A09 != b74) {
                        try {
                            this.A0Z.ADl(b74);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.A06 = null;
                    B7<C1288Vh> b75 = this.A08;
                    if (b75 != null && this.A09 != b75) {
                        try {
                            this.A0Z.ADl(b75);
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    public void A1H() throws AnonymousClass98 {
    }

    public final void A1I() throws AnonymousClass98 {
        Format format;
        long j10;
        if (this.A06 != null || (format = this.A07) == null) {
            return;
        }
        this.A08 = this.A09;
        String str = format.A0O;
        MediaCrypto mediaCrypto = null;
        boolean z10 = false;
        B7<C1288Vh> b72 = this.A08;
        if (b72 != null) {
            C1288Vh A6v = b72.A6v();
            if (A0e[5].charAt(22) == 'm') {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[1] = "HTFGGBgFgI6ylI68q0FeBZ95y7T9Xgss";
            strArr[6] = "P6HI8GYxdJJ1MGo6JXYXPe6FB7j5p6fI";
            if (A6v == null) {
                if (this.A08.A6W() == null) {
                    return;
                }
            } else {
                mediaCrypto = A6v.A00();
                z10 = A6v.A01(str);
            }
            if (A0l()) {
                int A7U = this.A08.A7U();
                if (A7U == 1) {
                    throw AnonymousClass98.A01(this.A08.A6W(), A0y());
                }
                if (A0e[7].charAt(4) != 'H') {
                    if (A7U != 4) {
                        return;
                    }
                } else {
                    A0e[7] = "zdcyHT7sTCB3al7NiJFn52Vz5qRveBVU";
                    if (A7U != 4) {
                        return;
                    }
                }
            }
        }
        if (this.A0A == null) {
            try {
                this.A0A = A1E(this.A0a, this.A07, z10);
                if (this.A0A == null && z10) {
                    this.A0A = A1E(this.A0a, this.A07, false);
                    if (this.A0A != null) {
                        String A0Z = A0Z(227, 18, 36);
                        StringBuilder sb2 = new StringBuilder();
                        String mimeType = A0Z(153, 40, 114);
                        sb2.append(mimeType);
                        sb2.append(str);
                        String mimeType2 = A0Z(0, 58, 116);
                        sb2.append(mimeType2);
                        String mimeType3 = this.A0A.A02;
                        sb2.append(mimeType3);
                        String mimeType4 = A0Z(58, 1, 76);
                        sb2.append(mimeType4);
                        String mimeType5 = sb2.toString();
                        Log.w(A0Z, mimeType5);
                    }
                }
            } catch (C0824Cv e10) {
                A0k(new C0817Co(this.A07, e10, z10, -49998));
            }
            if (this.A0A == null) {
                A0k(new C0817Co(this.A07, (Throwable) null, z10, -49999));
            }
        }
        if (!A1Q(this.A0A)) {
            return;
        }
        String str2 = this.A0A.A02;
        this.A00 = A0W(str2);
        this.A0D = A0u(str2, this.A07);
        this.A0H = A0t(str2);
        this.A0G = A0q(this.A0A);
        this.A0E = A0r(str2);
        this.A0F = A0s(str2);
        this.A0I = A0v(str2, this.A07);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            StringBuilder sb3 = new StringBuilder();
            String mimeType6 = A0Z(659, 12, 120);
            sb3.append(mimeType6);
            sb3.append(str2);
            String mimeType7 = sb3.toString();
            C0937Hi.A02(mimeType7);
            this.A06 = MediaCodec.createByCodecName(str2);
            C0937Hi.A00();
            String mimeType8 = A0Z(645, 14, 72);
            C0937Hi.A02(mimeType8);
            A1N(this.A0A, this.A06, this.A07, mediaCrypto);
            C0937Hi.A00();
            String mimeType9 = A0Z(722, 10, 100);
            C0937Hi.A02(mimeType9);
            this.A06.start();
            C0937Hi.A00();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            A1O(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            A0c();
        } catch (Exception e11) {
            A0k(new C0817Co(this.A07, e11, z10, str2));
        }
        if (A7U() == 2) {
            j10 = SystemClock.elapsedRealtime() + 1000;
        } else {
            j10 = b.f7291b;
        }
        this.A05 = j10;
        A0h();
        A0i();
        this.A0Q = true;
        this.A0U.A00++;
    }

    public void A1J(long j10) {
    }

    public void A1K(MediaCodec mediaCodec, MediaFormat mediaFormat) throws AnonymousClass98 {
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bc, code lost:
    
        if (r0.A08 == r4.A08) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A1L(com.facebook.ads.internal.exoplayer2.Format r9) throws com.facebook.ads.redexgen.X.AnonymousClass98 {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3G.A1L(com.facebook.ads.internal.exoplayer2.Format):void");
    }

    public void A1M(C1294Vn c1294Vn) {
    }

    public void A1O(String str, long j10, long j11) {
    }

    public boolean A1Q(C0815Cm c0815Cm) {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public boolean A8P() {
        return this.A0N;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r3 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        r4 = r6.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
    
        if (com.facebook.ads.redexgen.X.C3G.A0e[7].charAt(4) == 'H') goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C3G.A0e;
        r2[4] = "x7dDRka8TdETs6VLaaF6zooftcMnhKq2";
        r2[2] = "EId5jOcDiZLe1q4ZwHFfLyVQFAikb5sI";
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r4 == com.anythink.expressad.exoplayer.b.f7291b) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() >= r6.A05) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C3G.A0e;
        r2[3] = "3vglA6G8yuA12iVw0aFHPuEKtU4GGV7V";
        r2[0] = "dEcUfU5Lns9loW0elZLaj7FKzckicWHS";
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
    
        if (r4 == com.anythink.expressad.exoplayer.b.f7291b) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        if (r3 == false) goto L14;
     */
    @Override // com.facebook.ads.redexgen.X.W1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A8Z() {
        /*
            r6 = this;
            com.facebook.ads.internal.exoplayer2.Format r0 = r6.A07
            if (r0 == 0) goto L8d
            boolean r3 = r6.A0R
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C3G.A0e
            r0 = 5
            r1 = r1[r0]
            r0 = 22
            char r1 = r1.charAt(r0)
            r0 = 109(0x6d, float:1.53E-43)
            if (r1 == r0) goto L8f
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3G.A0e
            java.lang.String r1 = "4HO9JQHKOwc6R3VWcS8R4aXAnHys3aci"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "eJ1ha0lSNb53SSfCNHliM2QVteujQRGV"
            r0 = 6
            r2[r0] = r1
            if (r3 != 0) goto L8d
            boolean r0 = r6.A18()
            if (r0 != 0) goto L79
            boolean r3 = r6.A0n()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3G.A0e
            r0 = 3
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 8
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L8a
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3G.A0e
            java.lang.String r1 = "OQSQFxnlZZo22DxvkKeXHq8FF7pzfl1u"
            r0 = 5
            r2[r0] = r1
            if (r3 != 0) goto L79
        L4a:
            long r4 = r6.A05
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C3G.A0e
            r0 = 7
            r1 = r1[r0]
            r0 = 4
            char r1 = r1.charAt(r0)
            r0 = 72
            if (r1 == r0) goto L7b
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3G.A0e
            java.lang.String r1 = "x7dDRka8TdETs6VLaaF6zooftcMnhKq2"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "EId5jOcDiZLe1q4ZwHFfLyVQFAikb5sI"
            r0 = 2
            r2[r0] = r1
            if (r3 == 0) goto L8d
        L6f:
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r1 = r6.A05
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L8d
        L79:
            r0 = 1
        L7a:
            return r0
        L7b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3G.A0e
            java.lang.String r1 = "3vglA6G8yuA12iVw0aFHPuEKtU4GGV7V"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "dEcUfU5Lns9loW0elZLaj7FKzckicWHS"
            r0 = 0
            r2[r0] = r1
            if (r3 == 0) goto L8d
            goto L6f
        L8a:
            if (r3 != 0) goto L79
            goto L4a
        L8d:
            r0 = 0
            goto L7a
        L8f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3G.A8Z():boolean");
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final void ADs(long j10, long j11) throws AnonymousClass98 {
        if (this.A0N) {
            A1H();
            return;
        }
        if (this.A07 == null) {
            this.A0Y.A07();
            int result = A10(this.A0W, this.A0Y, true);
            if (result == -5) {
                A1L(this.A0W.A00);
            } else {
                if (result == -4) {
                    H6.A04(this.A0Y.A04());
                    this.A0M = true;
                    A0d();
                    String[] strArr = A0e;
                    if (strArr[3].charAt(8) == strArr[0].charAt(8)) {
                        throw new RuntimeException();
                    }
                    A0e[7] = "aKhyH6I995l1LklLucgRLjJ4pFFWcDrl";
                    return;
                }
                return;
            }
        }
        A1I();
        if (this.A06 != null) {
            C0937Hi.A02(A0Z(671, 12, 16));
            do {
            } while (A0p(j10, j11));
            do {
            } while (A0m());
            C0937Hi.A00();
        } else {
            this.A0U.A07 += A0z(j10);
            this.A0Y.A07();
            int result2 = A10(this.A0W, this.A0Y, false);
            if (result2 == -5) {
                C9L c9l = this.A0W;
                if (A0e[7].charAt(4) != 'H') {
                    throw new RuntimeException();
                }
                A0e[7] = "H5HsHl4f2eN3vdaE4L0NqH64hfjdivD8";
                A1L(c9l.A00);
            } else if (result2 == -4) {
                H6.A04(this.A0Y.A04());
                this.A0M = true;
                A0d();
            }
        }
        this.A0U.A00();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07449g
    public final int AEy(Format format) throws AnonymousClass98 {
        try {
            return A1B(this.A0a, this.A0Z, format);
        } catch (C0824Cv e10) {
            throw AnonymousClass98.A01(e10, A0y());
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0820Cr, com.facebook.ads.redexgen.X.InterfaceC07449g
    public final int AF0() {
        return 8;
    }
}
