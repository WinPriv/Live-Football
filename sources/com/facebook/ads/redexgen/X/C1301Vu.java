package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.facebook.ads.redexgen.X.Vu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1301Vu implements AK {
    public static boolean A0p;
    public static boolean A0q;
    public static byte[] A0r;
    public static String[] A0s = {"5Nyv0guRYVcKSAuezGPcUxg9vJAOBGI4", "vvUbbcGamjazB6O7sNKlV2Due1EGN4h1", "bCdq7Y65nqLa7O1PpyZ9UmfFfim1tIKH", "XSMaSGyqY735xp0uf5mX1ioiT5AfU73", "LbuXdG3g6wlkS0wgubrQcd1EFcxL1vaW", "BfdFnDj7fdcaZnnCNK5XWBslzsEwyMTC", "82TROEAjyC6M053XP3PwF3IgkAnZSWb8", "TH4S9e3rxD8emXavfeipeAwkF3kWLOvQ"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public AudioTrack A0M;

    @Nullable
    public AudioTrack A0N;

    @Nullable
    public C9T A0O;
    public C9T A0P;
    public C07629z A0Q;

    @Nullable
    public AI A0R;

    @Nullable
    public ByteBuffer A0S;

    @Nullable
    public ByteBuffer A0T;

    @Nullable
    public ByteBuffer A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public byte[] A0c;
    public A7[] A0d;
    public ByteBuffer[] A0e;
    public final ConditionVariable A0f;

    @Nullable
    public final A0 A0g;
    public final AQ A0h;
    public final C1304Vx A0i;
    public final AT A0j;
    public final C1295Vo A0k;
    public final ArrayDeque<AV> A0l;
    public final boolean A0m;
    public final A7[] A0n;
    public final A7[] A0o;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private AudioTrack A0F(int i10) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
    }

    public static String A0I(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0r, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 75);
        }
        return new String(copyOfRange);
    }

    public static void A0O() {
        A0r = new byte[]{68, 72, Ascii.SI, 7, Ascii.FS, 72, 94, 106, 123, 118, 112, 75, 109, 126, 124, 116, 78, 99, 121, 105, 101, 100, 126, 99, 100, Ascii.DEL, 99, 126, 115, 42, 110, 111, 126, 111, 105, 126, 111, 110, 42, 81, 111, 114, 122, 111, 105, 126, 111, 110, 42, Ascii.SO, Ascii.SYN, 9, 4, 9, 1, 8, 63, 41, 63, 46, 46, 51, 52, 61, 122, 41, 46, 59, 54, 54, 63, 62, 122, 59, 47, 62, 51, 53, 122, 46, 40, 59, 57, 49, 102, 93, 86, 75, 67, 86, 80, 71, 86, 87, 19, 82, 70, 87, 90, 92, 19, 86, 93, 80, 92, 87, 90, 93, 84, 9, 19, 96, 91, 70, 64, 69, 69, 90, 71, 65, 80, 81, Ascii.NAK, 86, 93, 84, 91, 91, 80, 89, Ascii.NAK, 86, 90, 64, 91, 65, Ascii.SI, Ascii.NAK, 101, 10, 3, Ascii.US, Ascii.CAN, 9, Ascii.RS, 59, 40, 58, 40};
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f8, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fa, code lost:
    
        r1 = r11.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fc, code lost:
    
        if (r1 == r5) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ff, code lost:
    
        if (r1 != 6) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0207, code lost:
    
        if (r1 != 7) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0209, code lost:
    
        r11.A02 = 49152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x020f, code lost:
    
        r11.A02 = 294912;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0201, code lost:
    
        r11.A02 = com.anythink.expressad.exoplayer.j.a.b.f8708a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0215, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0177, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0163, code lost:
    
        if (r9 <= 23) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ef, code lost:
    
        if (r9 <= 23) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0100, code lost:
    
        if (A0I(139, 6, 39).equals(com.facebook.ads.redexgen.X.C0940Hl.A03) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0111, code lost:
    
        if (A0I(49, 6, 11).equals(com.facebook.ads.redexgen.X.C0940Hl.A05) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0114, code lost:
    
        if (r13 == 3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0116, code lost:
    
        if (r13 == r5) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0119, code lost:
    
        if (r13 == 7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0150, code lost:
    
        r6 = com.facebook.ads.redexgen.X.AnonymousClass92.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0153, code lost:
    
        r6 = 252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011f, code lost:
    
        if (com.facebook.ads.redexgen.X.C0940Hl.A02 > 25) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0130, code lost:
    
        if (A0I(145, 4, 22).equals(com.facebook.ads.redexgen.X.C0940Hl.A03) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0134, code lost:
    
        if (r11.A0X != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0136, code lost:
    
        r4 = true;
        r2 = com.facebook.ads.redexgen.X.C1301Vu.A0s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0148, code lost:
    
        if (r2[5].charAt(2) == r2[2].charAt(2)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014f, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0166, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C1301Vu.A0s;
        r2[6] = "lyxpn71WQn9dckKW56P9nO6T9wnpMgEk";
        r2[0] = "LnPBCXPfIDTyG7NKycPeENmI65ZDVhzG";
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0172, code lost:
    
        if (r13 != 1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0174, code lost:
    
        r6 = 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0178, code lost:
    
        if (r10 != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017e, code lost:
    
        if (A0U() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0182, code lost:
    
        if (r11.A08 != r8) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0184, code lost:
    
        r9 = r11.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0191, code lost:
    
        if (com.facebook.ads.redexgen.X.C1301Vu.A0s[3].length() == 31) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0198, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0199, code lost:
    
        com.facebook.ads.redexgen.X.C1301Vu.A0s[7] = "QJheChQOtEbeash7G8AcHOsRzFDcTJZ5";
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a0, code lost:
    
        if (r9 != r14) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a4, code lost:
    
        if (r11.A07 != r6) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a7, code lost:
    
        reset();
        r11.A0Z = r7;
        r11.A0A = r14;
        r11.A07 = r6;
        r11.A08 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b4, code lost:
    
        if (r11.A0X == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b6, code lost:
    
        r0 = com.facebook.ads.redexgen.X.C0940Hl.A05(r11.A08, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bc, code lost:
    
        r11.A09 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01be, code lost:
    
        if (r15 == 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c0, code lost:
    
        r11.A02 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c5, code lost:
    
        if (r11.A0X == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c7, code lost:
    
        r2 = android.media.AudioTrack.getMinBufferSize(r14, r6, r11.A08);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ce, code lost:
    
        if (r2 == (-2)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d0, code lost:
    
        com.facebook.ads.redexgen.X.H6.A04(r4);
        r11.A02 = com.facebook.ads.redexgen.X.C0940Hl.A06(r2 * 4, ((int) A07(250000)) * r11.A09, (int) java.lang.Math.max(r2, A07(750000) * r11.A09));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:?, code lost:
    
        return;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    @Override // com.facebook.ads.redexgen.X.AK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A46(int r12, int r13, int r14, int r15, @androidx.annotation.Nullable int[] r16, int r17, int r18) throws com.facebook.ads.redexgen.X.AG {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1301Vu.A46(int, int, int, int, int[], int, int):void");
    }

    static {
        A0O();
        A0p = false;
        A0q = false;
    }

    public C1301Vu(@Nullable A0 a02, AT at, boolean z10) {
        this.A0g = a02;
        this.A0j = (AT) H6.A01(at);
        this.A0m = z10;
        this.A0f = new ConditionVariable(true);
        this.A0h = new AQ(new C1302Vv(this, null));
        this.A0i = new C1304Vx();
        this.A0k = new C1295Vo();
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C1298Vr(), this.A0i, this.A0k);
        Collections.addAll(arrayList, at.A5j());
        this.A0o = (A7[]) arrayList.toArray(new A7[arrayList.size()]);
        this.A0n = new A7[]{new C1300Vt()};
        this.A00 = 1.0f;
        this.A0D = 0;
        this.A0Q = C07629z.A04;
        this.A01 = 0;
        this.A0P = C9T.A04;
        this.A04 = -1;
        this.A0d = new A7[0];
        this.A0e = new ByteBuffer[0];
        this.A0l = new ArrayDeque<>();
    }

    public C1301Vu(@Nullable A0 a02, A7[] a7Arr) {
        this(a02, a7Arr, false);
    }

    public C1301Vu(@Nullable A0 a02, A7[] a7Arr, boolean z10) {
        this(a02, new C1303Vw(a7Arr), z10);
    }

    public static int A00(int i10, ByteBuffer byteBuffer) {
        if (i10 == 7 || i10 == 8) {
            return AX.A00(byteBuffer);
        }
        if (i10 == 5) {
            return C07599w.A00();
        }
        if (i10 == 6) {
            return C07599w.A03(byteBuffer);
        }
        if (i10 == 14) {
            int A02 = C07599w.A02(byteBuffer);
            if (A02 == -1) {
                return 0;
            }
            int A04 = C07599w.A04(byteBuffer, A02);
            String[] strArr = A0s;
            String str = strArr[5];
            String str2 = strArr[2];
            int charAt = str.charAt(2);
            int syncframeOffset = str2.charAt(2);
            if (charAt != syncframeOffset) {
                throw new RuntimeException();
            }
            A0s[3] = "Dqt88CMr8vwwAc3fZIJcRVt2XyhD8Cl";
            int syncframeOffset2 = A04 * 16;
            return syncframeOffset2;
        }
        throw new IllegalStateException(A0I(84, 27, 120) + i10);
    }

    @TargetApi(21)
    public static int A01(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    @TargetApi(21)
    private int A02(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (this.A0S == null) {
            this.A0S = ByteBuffer.allocate(16);
            this.A0S.order(ByteOrder.BIG_ENDIAN);
            this.A0S.putInt(1431633921);
        }
        if (this.A03 == 0) {
            this.A0S.putInt(4, i10);
            this.A0S.putLong(8, 1000 * j10);
            this.A0S.position(0);
            this.A03 = i10;
        }
        int result = this.A0S.remaining();
        if (result > 0) {
            int avSyncHeaderBytesRemaining = audioTrack.write(this.A0S, result, 1);
            if (avSyncHeaderBytesRemaining < 0) {
                this.A03 = 0;
                return avSyncHeaderBytesRemaining;
            }
            if (avSyncHeaderBytesRemaining < result) {
                return 0;
            }
        }
        int A01 = A01(audioTrack, byteBuffer, i10);
        String[] strArr = A0s;
        String str = strArr[4];
        String str2 = strArr[1];
        int charAt = str.charAt(9);
        int avSyncHeaderBytesRemaining2 = str2.charAt(9);
        if (charAt == avSyncHeaderBytesRemaining2) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[5] = "EGdI4VK4aN1uiBzzsuaeFo7lQ03tB7Gh";
        strArr2[2] = "vodoofn0TiYpLi76FRuwTlDh379TFVaK";
        if (A01 < 0) {
            this.A03 = 0;
            return A01;
        }
        int avSyncHeaderBytesRemaining3 = this.A03;
        this.A03 = avSyncHeaderBytesRemaining3 - A01;
        return A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A03() {
        return this.A0X ? this.A0J / this.A0B : this.A0I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A04() {
        return this.A0X ? this.A0L / this.A09 : this.A0K;
    }

    private long A05(long j10) {
        return A08(this.A0j.A7T()) + j10;
    }

    private long A06(long j10) {
        AV av = null;
        while (!this.A0l.isEmpty()) {
            AV checkpoint = this.A0l.getFirst();
            if (j10 < AV.A00(checkpoint)) {
                break;
            }
            av = this.A0l.remove();
        }
        if (av != null) {
            this.A0P = AV.A02(av);
            this.A0G = AV.A00(av);
            this.A0F = AV.A01(av) - this.A0H;
        }
        if (this.A0P.A01 == 1.0f) {
            return (this.A0F + j10) - this.A0G;
        }
        if (this.A0l.isEmpty()) {
            return this.A0F + this.A0j.A6w(j10 - this.A0G);
        }
        return this.A0F + C0940Hl.A0C(j10 - this.A0G, this.A0P.A01);
    }

    private long A07(long j10) {
        return (this.A0A * j10) / 1000000;
    }

    private long A08(long j10) {
        return (1000000 * j10) / this.A0A;
    }

    private long A09(long j10) {
        return (1000000 * j10) / this.A06;
    }

    @TargetApi(21)
    private AudioTrack A0D() {
        AudioAttributes A00;
        if (this.A0b) {
            A00 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            A00 = this.A0Q.A00();
        }
        AudioFormat build = new AudioFormat.Builder().setChannelMask(this.A07).setEncoding(this.A08).setSampleRate(this.A0A).build();
        int audioSessionId = this.A01;
        if (audioSessionId == 0) {
            audioSessionId = 0;
        }
        return new AudioTrack(A00, build, this.A02, 1, audioSessionId);
    }

    private AudioTrack A0E() throws AH {
        AudioTrack audioTrack;
        if (C0940Hl.A02 >= 21) {
            audioTrack = A0D();
        } else {
            int A03 = C0940Hl.A03(this.A0Q.A03);
            int i10 = this.A01;
            String[] strArr = A0s;
            String str = strArr[4];
            String str2 = strArr[1];
            int state = str.charAt(9);
            int streamType = str2.charAt(9);
            if (state == streamType) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[4] = "uEqtixTroQ47jvhgXsjygxp317gkhCVZ";
            strArr2[1] = "MeWTB72qJhBmjPGmSmxXQDSK14yx53vJ";
            if (i10 == 0) {
                audioTrack = new AudioTrack(A03, this.A0A, this.A07, this.A08, this.A02, 1);
            } else {
                audioTrack = new AudioTrack(A03, this.A0A, this.A07, this.A08, this.A02, 1, i10);
            }
        }
        int state2 = audioTrack.getState();
        if (state2 == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new AH(state2, this.A0A, this.A07, this.A02);
    }

    private void A0J() {
        int i10 = 0;
        while (true) {
            A7[] a7Arr = this.A0d;
            int i11 = a7Arr.length;
            if (i10 < i11) {
                A7 a72 = a7Arr[i10];
                a72.flush();
                this.A0e[i10] = a72.A71();
                i10++;
            } else {
                return;
            }
        }
    }

    private void A0K() throws AH {
        C9T c9t;
        this.A0f.block();
        this.A0M = A0E();
        int audioSessionId = this.A0M.getAudioSessionId();
        if (A0p && C0940Hl.A02 < 21) {
            AudioTrack audioTrack = this.A0N;
            if (audioTrack != null) {
                int audioSessionId2 = audioTrack.getAudioSessionId();
                String[] strArr = A0s;
                String str = strArr[4];
                String str2 = strArr[1];
                int charAt = str.charAt(9);
                int audioSessionId3 = str2.charAt(9);
                if (charAt == audioSessionId3) {
                    throw new RuntimeException();
                }
                A0s[7] = "BXErtyYgJXamt9yde7CeLqS26Q9j6Dt3";
                if (audioSessionId != audioSessionId2) {
                    A0L();
                }
            }
            if (this.A0N == null) {
                this.A0N = A0F(audioSessionId);
            }
        }
        int audioSessionId4 = this.A01;
        if (audioSessionId4 != audioSessionId) {
            this.A01 = audioSessionId;
            AI ai = this.A0R;
            if (ai != null) {
                ai.AA2(audioSessionId);
            }
        }
        if (this.A0V) {
            c9t = this.A0j.A3Q(this.A0P);
        } else {
            c9t = C9T.A04;
        }
        this.A0P = c9t;
        A0N();
        AQ aq = this.A0h;
        AudioTrack audioTrack2 = this.A0M;
        int i10 = this.A08;
        int i11 = this.A09;
        int audioSessionId5 = this.A02;
        aq.A0G(audioTrack2, i10, i11, audioSessionId5);
        A0M();
    }

    private void A0L() {
        if (this.A0N == null) {
            return;
        }
        AudioTrack audioTrack = this.A0N;
        this.A0N = null;
        new AS(this, audioTrack).start();
    }

    private void A0M() {
        if (!A0U()) {
            return;
        }
        if (C0940Hl.A02 >= 21) {
            AudioTrack audioTrack = this.A0M;
            float f = this.A00;
            if (A0s[3].length() != 31) {
                throw new RuntimeException();
            }
            A0s[7] = "8NL9PZoDB9Ch1WQJQaXfXaVAIVHPoweZ";
            A0Q(audioTrack, f);
            return;
        }
        A0R(this.A0M, this.A00);
    }

    private void A0N() {
        ArrayList arrayList = new ArrayList();
        for (A7 a72 : A0V()) {
            if (a72.A8L()) {
                arrayList.add(a72);
            } else {
                a72.flush();
            }
        }
        int size = arrayList.size();
        A7[] a7Arr = new A7[size];
        int count = A0s[3].length();
        if (count != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A0s;
        strArr[5] = "YRdEguSYP1wOqJMzR8T0sEbN9ru3F1GF";
        strArr[2] = "jCd7Ib2fALhdhS4xedSLoMHgXMVbMQ2Z";
        this.A0d = (A7[]) arrayList.toArray(a7Arr);
        this.A0e = new ByteBuffer[size];
        A0J();
    }

    private void A0P(long j10) throws AJ {
        ByteBuffer input;
        int length = this.A0d.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                int count = i10 - 1;
                input = this.A0e[count];
            } else {
                input = this.A0T;
                if (input == null) {
                    input = A7.A00;
                }
            }
            if (i10 == length) {
                A0S(input, j10);
            } else {
                A7 a72 = this.A0d[i10];
                a72.ADO(input);
                ByteBuffer A71 = a72.A71();
                this.A0e[i10] = A71;
                if (A71.hasRemaining()) {
                    i10++;
                }
            }
            if (input.hasRemaining()) {
                return;
            } else {
                i10--;
            }
        }
    }

    @TargetApi(21)
    public static void A0Q(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    public static void A0R(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c4, code lost:
    
        if (r0 < r2) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0S(java.nio.ByteBuffer r12, long r13) throws com.facebook.ads.redexgen.X.AJ {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1301Vu.A0S(java.nio.ByteBuffer, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (r5 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        A0S(r5, com.anythink.expressad.exoplayer.b.f7291b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        if (r9.A0U == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        r9.A04 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
    
        if (r5 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0T() throws com.facebook.ads.redexgen.X.AJ {
        /*
            r9 = this;
            r5 = 0
            int r0 = r9.A04
            r6 = -1
            r8 = 0
            if (r0 != r6) goto Lf
            boolean r0 = r9.A0Z
            if (r0 == 0) goto L54
            r0 = 0
        Lc:
            r9.A04 = r0
            r5 = 1
        Lf:
            int r4 = r9.A04
            com.facebook.ads.redexgen.X.A7[] r1 = r9.A0d
            int r0 = r1.length
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 1
            if (r4 >= r0) goto L5e
            r0 = r1[r4]
            if (r5 == 0) goto L23
            r0.ADN()
        L23:
            r9.A0P(r2)
            boolean r3 = r0.A8P()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1301Vu.A0s
            r0 = 4
            r1 = r2[r0]
            r0 = 1
            r2 = r2[r0]
            r0 = 9
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L58
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1301Vu.A0s
            java.lang.String r1 = "2xZTToEoCwsl8MeSQ9EIUdCBiuq4j6Lb"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "WXli42TSAlQlgSv7suJf6xw7W0hHNYE8"
            r0 = 1
            r2[r0] = r1
            if (r3 != 0) goto L4d
            return r8
        L4d:
            r5 = 1
            int r0 = r9.A04
            int r0 = r0 + r7
            r9.A04 = r0
            goto Lf
        L54:
            com.facebook.ads.redexgen.X.A7[] r0 = r9.A0d
            int r0 = r0.length
            goto Lc
        L58:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L5e:
            java.nio.ByteBuffer r5 = r9.A0U
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1301Vu.A0s
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 31
            if (r1 == r0) goto L77
            if (r5 == 0) goto L86
        L6f:
            r9.A0S(r5, r2)
            java.nio.ByteBuffer r0 = r9.A0U
            if (r0 == 0) goto L86
            return r8
        L77:
            java.lang.String[] r4 = com.facebook.ads.redexgen.X.C1301Vu.A0s
            java.lang.String r1 = "9QdkqYSTFHb7WYiPiRp7Y6nS2TP2i0It"
            r0 = 5
            r4[r0] = r1
            java.lang.String r1 = "gIdgEUZyaZheDXAdPlxJ5YfvFSsVsGnk"
            r0 = 2
            r4[r0] = r1
            if (r5 == 0) goto L86
            goto L6f
        L86:
            r9.A04 = r6
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1301Vu.A0T():boolean");
    }

    private boolean A0U() {
        return this.A0M != null;
    }

    private A7[] A0V() {
        if (this.A0a) {
            return this.A0n;
        }
        return this.A0o;
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final void A4o() {
        if (this.A0b) {
            this.A0b = false;
            this.A01 = 0;
            reset();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final void A5A(int i10) {
        H6.A04(C0940Hl.A02 >= 21);
        if (!this.A0b || this.A01 != i10) {
            this.A0b = true;
            this.A01 = i10;
            reset();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final long A6E(boolean z10) {
        if (!A0U() || this.A0D == 0) {
            return Long.MIN_VALUE;
        }
        long A0C = this.A0h.A0C(z10);
        long positionUs = A04();
        return this.A0H + A05(A06(Math.min(A0C, A08(positionUs))));
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final C9T A7C() {
        return this.A0P;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0117, code lost:
    
        if (r12 == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0119, code lost:
    
        r19.A0H = java.lang.Math.max(0L, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012a, code lost:
    
        if (com.facebook.ads.redexgen.X.C1301Vu.A0s[3].length() == 31) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0131, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c8, code lost:
    
        r4 = com.facebook.ads.redexgen.X.C1301Vu.A0s;
        r4[5] = "k8d1uoKGcn9oqEPcbfqEuDtWZEluvqcv";
        r4[2] = "0FdbLpGzKjPPYkWO7EHSmW7ecHxpzOIE";
        r19.A0D = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005d, code lost:
    
        if (r19.A0X == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005f, code lost:
    
        r19.A0J += r20.remaining();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0069, code lost:
    
        r19.A0T = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0083, code lost:
    
        r4 = r19.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0091, code lost:
    
        if (com.facebook.ads.redexgen.X.C1301Vu.A0s[7].charAt(5) == 'v') goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0093, code lost:
    
        com.facebook.ads.redexgen.X.C1301Vu.A0s[7] = "RMIgxhGSPUjaAJeGU8ndpU4l5tEpmaGN";
        r19.A0I = r4 + r19.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013c, code lost:
    
        r4 = r19.A0H + A09(A03());
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014a, code lost:
    
        if (r19.A0D != 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014c, code lost:
    
        r15 = java.lang.Math.abs(r4 - r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0161, code lost:
    
        if (com.facebook.ads.redexgen.X.C1301Vu.A0s[7].charAt(5) == 'v') goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0163, code lost:
    
        r9 = com.facebook.ads.redexgen.X.C1301Vu.A0s;
        r9[5] = "Mjd2F7C7kiLCVUTRblLdSlwSo04If9jH";
        r9[2] = "SFdTDB39f2uDBeT9Tbwwt5W5QdPlKJfQ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0171, code lost:
    
        if (r15 <= 200000) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0173, code lost:
    
        android.util.Log.e(r10, A0I(16, 33, 65) + r4 + A0I(0, 6, 35) + r21 + A0I(138, 1, 115));
        r19.A0D = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01bc, code lost:
    
        com.facebook.ads.redexgen.X.C1301Vu.A0s[7] = "vGS91cAAG7hMw0xriamqCYCKlpI1kVhb";
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c5, code lost:
    
        if (r15 <= 200000) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ab, code lost:
    
        r13 = r19.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b8, code lost:
    
        if (com.facebook.ads.redexgen.X.C1301Vu.A0s[3].length() == 31) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d8, code lost:
    
        r9 = com.facebook.ads.redexgen.X.C1301Vu.A0s;
        r9[6] = "1n9GuuRZsd3tbftYhBPGe0z5aHsix9eq";
        r9[0] = "CrYGxTKVQxqkoEEYRaPu1U1mUEDoOHWT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e4, code lost:
    
        if (r13 != 2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01e6, code lost:
    
        r19.A0H += r21 - r4;
        r19.A0D = 1;
        r2 = r19.A0R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f1, code lost:
    
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f3, code lost:
    
        r2.ABn();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0139, code lost:
    
        if (r12 == 0) goto L56;
     */
    @Override // com.facebook.ads.redexgen.X.AK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A7t(java.nio.ByteBuffer r20, long r21) throws com.facebook.ads.redexgen.X.AH, com.facebook.ads.redexgen.X.AJ {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1301Vu.A7t(java.nio.ByteBuffer, long):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final void A7w() {
        if (this.A0D == 1) {
            this.A0D = 2;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final boolean A81() {
        return A0U() && this.A0h.A0J(A04());
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final boolean A8O(int i10) {
        if (C0940Hl.A0c(i10)) {
            return i10 != 4 || C0940Hl.A02 >= 21;
        }
        A0 a02 = this.A0g;
        return a02 != null && a02.A04(i10);
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final boolean A8P() {
        return !A0U() || (this.A0W && !A81());
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final void AD7() {
        this.A0Y = true;
        if (A0U()) {
            this.A0h.A0E();
            AudioTrack audioTrack = this.A0M;
            if (A0s[3].length() != 31) {
                throw new RuntimeException();
            }
            A0s[3] = "NrYH7da7InJYZ7DcifiCDIWgHy9XttZ";
            audioTrack.play();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final void AD8() throws AJ {
        if (this.A0W) {
            return;
        }
        boolean A0U = A0U();
        String[] strArr = A0s;
        if (strArr[6].charAt(18) != strArr[0].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[6] = "potoNIjJr8c5PhhOHWP3V8xbrUltb98O";
        strArr2[0] = "s7h49TBBG9Upv5zOzLPi805BwVxtpEdY";
        if (A0U && A0T()) {
            this.A0h.A0F(A04());
            this.A0M.stop();
            this.A03 = 0;
            this.A0W = true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final void ADf() {
        reset();
        A0L();
        for (A7 a72 : this.A0o) {
            a72.reset();
            if (A0s[3].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0s;
            strArr[5] = "qwdTDv5zTd3QZESqVqPfOIKdJj7Lz8kg";
            strArr[2] = "LbdTDWALSGuogzF76GUONHDiI7JL2ED4";
        }
        for (A7 a73 : this.A0n) {
            a73.reset();
        }
        this.A01 = 0;
        this.A0Y = false;
        if (A0s[7].charAt(5) != 'v') {
            A0s[3] = "7yJp0zMcRreZgWUPzTirOlbpECU1qPL";
            return;
        }
        String[] strArr2 = A0s;
        strArr2[5] = "IJdzF7l1OUCqcHSZRNfx63TpictB3CeC";
        strArr2[2] = "IidC6PogfV1YW6p29FProDWayU60rDbu";
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final void AEM(C07629z c07629z) {
        if (this.A0Q.equals(c07629z)) {
            return;
        }
        this.A0Q = c07629z;
        if (this.A0b) {
            return;
        }
        reset();
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final void AET(AI ai) {
        this.A0R = ai;
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final C9T AEX(C9T c9t) {
        if (A0U() && !this.A0V) {
            this.A0P = C9T.A04;
            return this.A0P;
        }
        C9T lastSetPlaybackParameters = this.A0O;
        if (lastSetPlaybackParameters == null) {
            if (!this.A0l.isEmpty()) {
                lastSetPlaybackParameters = AV.A02(this.A0l.getLast());
            } else {
                lastSetPlaybackParameters = this.A0P;
            }
        }
        if (!c9t.equals(lastSetPlaybackParameters)) {
            if (A0U()) {
                this.A0O = c9t;
            } else {
                this.A0P = this.A0j.A3Q(c9t);
            }
        }
        return this.A0P;
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final void pause() {
        this.A0Y = false;
        if (A0U() && this.A0h.A0I()) {
            this.A0M.pause();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final void reset() {
        if (A0U()) {
            this.A0J = 0L;
            this.A0I = 0L;
            this.A0L = 0L;
            this.A0K = 0L;
            this.A05 = 0;
            C9T c9t = this.A0O;
            if (c9t != null) {
                this.A0P = c9t;
                this.A0O = null;
            } else if (!this.A0l.isEmpty()) {
                ArrayDeque<AV> arrayDeque = this.A0l;
                if (A0s[7].charAt(5) == 'v') {
                    throw new RuntimeException();
                }
                A0s[7] = "7Zd0LJuJ8v1AsDIGeh9Ten8e10sO09Lx";
                this.A0P = AV.A02(arrayDeque.getLast());
            }
            this.A0l.clear();
            this.A0F = 0L;
            this.A0G = 0L;
            this.A0T = null;
            this.A0U = null;
            A0J();
            this.A0W = false;
            this.A04 = -1;
            this.A0S = null;
            this.A03 = 0;
            this.A0D = 0;
            if (this.A0h.A0H()) {
                this.A0M.pause();
            }
            AudioTrack audioTrack = this.A0M;
            this.A0M = null;
            this.A0h.A0D();
            this.A0f.close();
            new AR(this, audioTrack).start();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final void setVolume(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            A0M();
        }
    }
}
