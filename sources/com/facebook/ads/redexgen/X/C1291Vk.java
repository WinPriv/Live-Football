package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.NotProvisionedException;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.redexgen.X.B9;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@TargetApi(18)
/* renamed from: com.facebook.ads.redexgen.X.Vk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1291Vk<T extends B9> implements B7<T> {
    public static byte[] A0K;
    public static String[] A0L = {"ygnbftuzQ623Ar", "0dBxCv", "0mS6EqtDw1IrcjMleAT8IB1AlC6o9dAz", "RvmLzAjUPGIONaTchxcxVzTcBBQZgw7Y", "nJTfBRZW6rn0", "sj1G7dKmGRmO2HqivExl", "qBp8iQwY5MoBhJy8uyiyd2Hnkft4tubm", "GRqzAUhZ8aAEJGz"};
    public int A00;
    public int A01;
    public HandlerThread A02;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/Vk<TT;>.PostRequestHandler; */
    public HandlerC0776An A03;
    public B5 A04;
    public T A05;
    public Object A06;
    public Object A07;
    public byte[] A08;
    public byte[] A09;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/Vk<TT;>.PostResponseHandler; */
    public final HandlerC0777Ao A0A;
    public final BJ A0B;
    public final UUID A0C;
    public final int A0D;
    public final int A0E;
    public final InterfaceC0778Ap<T> A0F;
    public final C0784Av A0G;
    public final DrmInitData.SchemeData A0H;
    public final BF<T> A0I;
    public final HashMap<String, String> A0J;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private long A01() {
        if (!AnonymousClass92.A05.equals(this.A0C)) {
            return Long.MAX_VALUE;
        }
        Pair<Long, Long> A01 = BN.A01(this);
        return Math.min(((Long) A01.first).longValue(), ((Long) A01.second).longValue());
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 108);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0K = new byte[]{38, 71, 72, 67, 87, 78, 86, 38, 84, 79, 53, 71, 85, 85, 75, 81, 80, -51, -5, -10, -37, -18, -6, -2, -18, -4, -3, -47, -22, -9, -19, -11, -18, -5, -55, -10, -10, -13, -10, -92, -8, -10, -3, -19, -14, -21, -92, -8, -13, -92, -10, -23, -9, -8, -13, -10, -23, -92, -37, -19, -24, -23, -6, -19, -14, -23, -92, -17, -23, -3, -9, -78, -23, 0, 0, 6, 3, 8, -1, -70, 6, 3, -3, -1, 8, Ascii.CR, -1, -70, 2, -5, Ascii.CR, -70, -1, Ascii.DC2, 10, 3, Ascii.FF, -1, -2, -70, 9, Ascii.FF, -70, 17, 3, 6, 6, -70, -1, Ascii.DC2, 10, 3, Ascii.FF, -1, -70, Ascii.CR, 9, 9, 8, -56, -70, -20, -1, 7, -5, 3, 8, 3, 8, 1, -70, Ascii.CR, -1, -3, 9, 8, -2, Ascii.CR, -44, -70};
    }

    static {
        A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ap != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession$ProvisioningManager<T extends com.facebook.ads.redexgen.X.B9> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BF != com.facebook.ads.internal.exoplayer2.drm.ExoMediaDrm<T extends com.facebook.ads.redexgen.X.B9> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    public C1291Vk(UUID uuid, BF<T> bf, InterfaceC0778Ap<T> interfaceC0778Ap, @Nullable DrmInitData.SchemeData schemeData, int i10, @Nullable byte[] bArr, HashMap<String, String> hashMap, BJ bj, Looper looper, C0784Av c0784Av, int i11) {
        this.A0C = uuid;
        this.A0F = interfaceC0778Ap;
        this.A0I = bf;
        this.A0E = i10;
        this.A08 = bArr;
        this.A0H = bArr != null ? null : schemeData;
        this.A0J = hashMap;
        this.A0B = bj;
        this.A0D = i11;
        this.A0G = c0784Av;
        this.A01 = 2;
        this.A0A = new HandlerC0777Ao(this, looper);
        this.A02 = new HandlerThread(A02(17, 17, 29));
        this.A02.start();
        this.A03 = new HandlerC0776An(this, this.A02.getLooper());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    private void A03() {
        if (this.A01 == 4) {
            this.A01 = 3;
            A08(new BI());
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    private void A05(int i10, boolean z10) {
        byte[] bArr = i10 == 3 ? this.A08 : this.A09;
        byte[] bArr2 = null;
        String str = null;
        String mimeType = null;
        DrmInitData.SchemeData schemeData = this.A0H;
        if (schemeData != null) {
            bArr2 = schemeData.A04;
            str = this.A0H.A02;
            mimeType = this.A0H.A01;
        }
        try {
            this.A06 = Pair.create(this.A0I.getKeyRequest(bArr, bArr2, str, i10, this.A0J), mimeType);
            this.A03.A02(1, this.A06, z10);
        } catch (Exception e10) {
            A09(e10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    private void A08(Exception exc) {
        this.A04 = new B5(exc);
        this.A0G.A04(exc);
        if (this.A01 != 4) {
            this.A01 = 1;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    private void A09(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.A0F.ADJ(this);
        } else {
            A08(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r4 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        r1 = r5.A0I;
        r0 = r5.A09;
        r2 = r1.provideKeyResponse(r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r5.A0E == 2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r5.A0E != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        r0 = r5.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        r5.A01 = 4;
        r5.A0G.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r2.length == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        r5.A08 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        r1 = r5.A0I;
        r0 = r5.A08;
        r1.provideKeyResponse(r0, r7);
        r5.A0G.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004f, code lost:
    
        if (r4 == 3) goto L20;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0A(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.A06
            if (r6 != r0) goto L23
            boolean r3 = r5.A0D()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1291Vk.A0L
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 19
            if (r1 == r0) goto L88
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1291Vk.A0L
            java.lang.String r1 = "Dj52Xz5E9G6B"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "yQtL6VAJC1YqjW"
            r0 = 0
            r2[r0] = r1
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            r0 = 0
            r5.A06 = r0
            boolean r0 = r7 instanceof java.lang.Exception
            if (r0 == 0) goto L31
            java.lang.Exception r7 = (java.lang.Exception) r7
            r5.A09(r7)
            return
        L31:
            byte[] r7 = (byte[]) r7     // Catch: java.lang.Exception -> L83
            int r4 = r5.A0E     // Catch: java.lang.Exception -> L83
            r3 = 3
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1291Vk.A0L
            r0 = 3
            r1 = r1[r0]
            r0 = 22
            char r1 = r1.charAt(r0)
            r0 = 89
            if (r1 == r0) goto L4f
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1291Vk.A0L
            java.lang.String r1 = "2X8HJVAZNrszLj0VXzfxBiDDerG65NXA"
            r0 = 2
            r2[r0] = r1
            if (r4 != r3) goto L5e
            goto L51
        L4f:
            if (r4 != r3) goto L5e
        L51:
            com.facebook.ads.redexgen.X.BF<T extends com.facebook.ads.redexgen.X.B9> r1 = r5.A0I     // Catch: java.lang.Exception -> L83
            byte[] r0 = r5.A08     // Catch: java.lang.Exception -> L83
            r1.provideKeyResponse(r0, r7)     // Catch: java.lang.Exception -> L83
            com.facebook.ads.redexgen.X.Av r0 = r5.A0G     // Catch: java.lang.Exception -> L83
            r0.A01()     // Catch: java.lang.Exception -> L83
            goto L87
        L5e:
            com.facebook.ads.redexgen.X.BF<T extends com.facebook.ads.redexgen.X.B9> r1 = r5.A0I     // Catch: java.lang.Exception -> L83
            byte[] r0 = r5.A09     // Catch: java.lang.Exception -> L83
            byte[] r2 = r1.provideKeyResponse(r0, r7)     // Catch: java.lang.Exception -> L83
            int r1 = r5.A0E     // Catch: java.lang.Exception -> L83
            r0 = 2
            if (r1 == r0) goto L73
            int r0 = r5.A0E     // Catch: java.lang.Exception -> L83
            if (r0 != 0) goto L7a
            byte[] r0 = r5.A08     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L7a
        L73:
            if (r2 == 0) goto L7a
            int r0 = r2.length     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L7a
            r5.A08 = r2     // Catch: java.lang.Exception -> L83
        L7a:
            r0 = 4
            r5.A01 = r0     // Catch: java.lang.Exception -> L83
            com.facebook.ads.redexgen.X.Av r0 = r5.A0G     // Catch: java.lang.Exception -> L83
            r0.A00()     // Catch: java.lang.Exception -> L83
            goto L87
        L83:
            r0 = move-exception
            r5.A09(r0)
        L87:
            return
        L88:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1291Vk.A0A(java.lang.Object, java.lang.Object):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    public void A0B(Object obj, Object obj2) {
        if (obj == this.A07) {
            if (this.A01 != 2 && !A0D()) {
                return;
            }
            this.A07 = null;
            if (obj2 instanceof Exception) {
                this.A0F.ABv((Exception) obj2);
                return;
            }
            try {
                this.A0I.provideProvisionResponse((byte[]) obj2);
                this.A0F.ABu();
            } catch (Exception e10) {
                InterfaceC0778Ap<T> interfaceC0778Ap = this.A0F;
                String[] strArr = A0L;
                if (strArr[4].length() == strArr[0].length()) {
                    Exception e11 = new RuntimeException();
                    throw e11;
                }
                A0L[2] = "a4sDA20kWFGOKzGfRWeaug5eKqIpzvIQ";
                interfaceC0778Ap.ABv(e10);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    private void A0C(boolean z10) {
        int i10 = this.A0E;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3 || !A0E()) {
                    return;
                }
                A05(3, z10);
                return;
            }
            byte[] bArr = this.A08;
            if (A0L[5].length() == 7) {
                throw new RuntimeException();
            }
            A0L[3] = "nvqtgBbI1rUZtdpDbdJLT2qwzjn5A3EQ";
            if (bArr == null) {
                A05(2, z10);
                return;
            } else {
                if (!A0E()) {
                    return;
                }
                A05(2, z10);
                return;
            }
        }
        if (this.A08 == null) {
            A05(1, z10);
            return;
        }
        if (this.A01 != 4 && !A0E()) {
            return;
        }
        long licenseDurationRemainingSec = A01();
        if (this.A0E != 0 || licenseDurationRemainingSec > 60) {
            if (licenseDurationRemainingSec <= 0) {
                A08(new BI());
                return;
            } else {
                this.A01 = 4;
                this.A0G.A02();
                return;
            }
        }
        String str = A02(72, 68, 46) + licenseDurationRemainingSec;
        A05(2, z10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    private boolean A0D() {
        int i10 = this.A01;
        return i10 == 3 || i10 == 4;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    private boolean A0E() {
        try {
            this.A0I.restoreKeys(this.A09, this.A08);
            return true;
        } catch (Exception e10) {
            Log.e(A02(0, 17, 118), A02(34, 38, 24), e10);
            A08(e10);
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    private boolean A0F(boolean z10) {
        if (A0D()) {
            return true;
        }
        try {
            this.A09 = this.A0I.openSession();
            this.A05 = this.A0I.createMediaCrypto(this.A09);
            this.A01 = 3;
            return true;
        } catch (NotProvisionedException e10) {
            if (z10) {
                this.A0F.ADJ(this);
                return false;
            }
            A08(e10);
            return false;
        } catch (Exception e11) {
            A08(e11);
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    public final void A0G() {
        int i10 = this.A00 + 1;
        this.A00 = i10;
        if (i10 == 1 && this.A01 != 1 && A0F(true)) {
            A0C(true);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    public final void A0H() {
        if (A0F(false)) {
            A0C(true);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    public final void A0I() {
        this.A07 = this.A0I.getProvisionRequest();
        this.A03.A02(0, this.A07, true);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    public final void A0J(int i10) {
        if (A0D()) {
            String[] strArr = A0L;
            if (strArr[4].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A0L[3] = "lZu3kopIqXcrfR3er40TopUaCPNEg1WS";
            if (i10 == 1) {
                this.A01 = 3;
                this.A0F.ADJ(this);
            } else if (i10 == 2) {
                A0C(false);
            } else {
                if (i10 != 3) {
                    return;
                }
                A03();
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    public final void A0K(Exception exc) {
        A08(exc);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    public final boolean A0L() {
        int i10 = this.A00 - 1;
        this.A00 = i10;
        if (i10 != 0) {
            return false;
        }
        this.A01 = 0;
        this.A0A.removeCallbacksAndMessages(null);
        this.A03.removeCallbacksAndMessages(null);
        this.A03 = null;
        this.A02.quit();
        this.A02 = null;
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A07 = null;
        byte[] bArr = this.A09;
        if (bArr != null) {
            this.A0I.closeSession(bArr);
            this.A09 = null;
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    public final boolean A0M(byte[] bArr) {
        DrmInitData.SchemeData schemeData = this.A0H;
        return Arrays.equals(schemeData != null ? schemeData.A04 : null, bArr);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    public final boolean A0N(byte[] bArr) {
        return Arrays.equals(this.A09, bArr);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    @Override // com.facebook.ads.redexgen.X.B7
    public final B5 A6W() {
        if (this.A01 == 1) {
            return this.A04;
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    @Override // com.facebook.ads.redexgen.X.B7
    public final T A6v() {
        return this.A05;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    @Override // com.facebook.ads.redexgen.X.B7
    public final int A7U() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    @Override // com.facebook.ads.redexgen.X.B7
    public final Map<String, String> ADM() {
        byte[] bArr = this.A09;
        if (bArr == null) {
            return null;
        }
        BF<T> bf = this.A0I;
        if (A0L[5].length() == 7) {
            throw new RuntimeException();
        }
        A0L[7] = "lzhfD5NgGZX1H2DfqRAO4AgkK";
        return bf.queryKeyStatus(bArr);
    }
}
