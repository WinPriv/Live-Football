package com.facebook.ads.redexgen.X;

import android.os.SystemClock;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1302Vv implements AO {
    public static byte[] A01;
    public final /* synthetic */ C1301Vu A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{44, 32, 114, 70, 87, 90, 92, 103, 65, 82, 80, 88, 67, 109, 100, 101, 120, 99, 100, 109, 42, 99, 103, 122, 101, 121, 121, 99, 104, 102, 115, 42, 102, 107, 120, 109, 111, 42, 107, Ascii.DEL, 110, 99, 101, 42, 102, 107, 126, 111, 100, 105, 115, 48, 42, 33, 2, 7, 0, Ascii.ESC, Ascii.GS, 7, 1, 82, 19, 7, Ascii.SYN, Ascii.ESC, Ascii.GS, 82, 6, Ascii.ESC, Ascii.US, Ascii.ETB, 1, 6, 19, Ascii.US, 2, 82, 90, Ascii.DC4, 0, 19, Ascii.US, Ascii.ETB, 82, 2, Ascii.GS, 1, Ascii.ESC, 6, Ascii.ESC, Ascii.GS, Ascii.FS, 82, Ascii.US, Ascii.ESC, 1, Ascii.US, 19, 6, 17, Ascii.SUB, 91, 72, 82, 88, 123, 126, 121, 98, 100, 126, 120, 43, 106, 126, 111, 98, 100, 43, Ascii.DEL, 98, 102, 110, 120, Ascii.DEL, 106, 102, 123, 43, 35, 120, 114, 120, Ascii.DEL, 110, 102, 43, 104, 103, 100, 104, 96, 43, 102, 98, 120, 102, 106, Ascii.DEL, 104, 99, 34, 49, 43};
    }

    public C1302Vv(C1301Vu c1301Vu) {
        this.A00 = c1301Vu;
    }

    public /* synthetic */ C1302Vv(C1301Vu c1301Vu, AR ar) {
        this(c1301Vu);
    }

    @Override // com.facebook.ads.redexgen.X.AO
    public final void AB5(long j10) {
        Log.w(A00(2, 10, 37), A00(12, 41, 28) + j10);
    }

    @Override // com.facebook.ads.redexgen.X.AO
    public final void ABp(long j10, long j11, long j12, long j13) {
        long A03;
        long A04;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A00(53, 52, 100));
        sb2.append(j10);
        String A00 = A00(0, 2, 22);
        sb2.append(A00);
        sb2.append(j11);
        sb2.append(A00);
        sb2.append(j12);
        sb2.append(A00);
        sb2.append(j13);
        sb2.append(A00);
        A03 = this.A00.A03();
        sb2.append(A03);
        sb2.append(A00);
        A04 = this.A00.A04();
        sb2.append(A04);
        String sb3 = sb2.toString();
        if (!C1301Vu.A0q) {
            String message = A00(2, 10, 37);
            Log.w(message, sb3);
            return;
        }
        throw new AU(sb3, null);
    }

    @Override // com.facebook.ads.redexgen.X.AO
    public final void ACO(long j10, long j11, long j12, long j13) {
        long A03;
        long A04;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A00(105, 50, 29));
        sb2.append(j10);
        String A00 = A00(0, 2, 22);
        sb2.append(A00);
        sb2.append(j11);
        sb2.append(A00);
        sb2.append(j12);
        sb2.append(A00);
        sb2.append(j13);
        sb2.append(A00);
        A03 = this.A00.A03();
        sb2.append(A03);
        sb2.append(A00);
        A04 = this.A00.A04();
        sb2.append(A04);
        String sb3 = sb2.toString();
        if (!C1301Vu.A0q) {
            String message = A00(2, 10, 37);
            Log.w(message, sb3);
            return;
        }
        throw new AU(sb3, null);
    }

    @Override // com.facebook.ads.redexgen.X.AO
    public final void ACW(int i10, long j10) {
        AI ai;
        long j11;
        AI ai2;
        ai = this.A00.A0R;
        if (ai != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j11 = this.A00.A0E;
            long j12 = elapsedRealtime - j11;
            ai2 = this.A00.A0R;
            ai2.ACX(i10, j10, j12);
        }
    }
}
