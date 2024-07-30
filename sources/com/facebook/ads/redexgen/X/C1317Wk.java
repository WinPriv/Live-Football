package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.Wk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1317Wk implements PV {
    public static byte[] A04;
    public static String[] A05 = {"YemVV2CAzinSYko79pvdFyiaYh6Ax0NW", "FtFCRkuseyQck6qipAKyAgz81MNc63Vq", "zQJLp3VKHBLQ3ByylDAuuS44tkTO3MMG", "42Yp5AyXW20j54q75pN0MZ83oMgNP5AR", "H6ih9Bh2z", "6YmusGfII7QcqEjcRVkg771Wm5bkMvFZ", "MrQdRQonl4dLBaJwcA8", "V6zsFfxQuHmo6VBO3CkkHMQL74uZQLm4"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C6B A02;
    public final /* synthetic */ C6C A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 94);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{Ascii.CAN, 3, 6, 3, 2, Ascii.SUB, 3, 62, 33, 44, 45, 39};
    }

    static {
        A01();
    }

    public C1317Wk(C6B c6b, C6C c6c, long j10, long j11) {
        this.A02 = c6b;
        this.A03 = c6c;
        this.A00 = j10;
        this.A01 = j11;
    }

    @Override // com.facebook.ads.redexgen.X.PV
    public final void AAS(boolean z10) {
        C7G c7g;
        BlockingQueue blockingQueue;
        C7G c7g2;
        Map map;
        C7G c7g3;
        c7g = this.A02.A01.A04;
        if (C6J.A06(c7g)) {
            C6I c6i = new C6I(this.A03.A06, this.A03.A07, A00(7, 5, 22), this.A03.A02, this.A03.A08);
            c7g2 = this.A02.A01.A04;
            C6J.A04(c7g2, c6i, z10);
            if (!z10) {
                c7g3 = this.A02.A01.A04;
                C6J.A05(c7g3, this.A03.A06, this.A03.A07, this.A03.A08, A00(7, 5, 22), this.A03.A02, 2112, null, Long.valueOf(this.A00), Long.valueOf(System.currentTimeMillis() - this.A01), null);
            }
            map = C6G.A0G;
            if (A05[1].charAt(13) == 'O') {
                throw new RuntimeException();
            }
            A05[1] = "tpujksKgYg5a3fdXCIDkrfoMaur1s0eW";
            map.put(c6i.A04, c6i);
        }
        try {
            blockingQueue = this.A02.A00;
            blockingQueue.put(true);
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.facebook.ads.redexgen.X.PV
    public final void AAe(@Nullable Throwable th) {
        C7G c7g;
        BlockingQueue blockingQueue;
        C7G c7g2;
        c7g = this.A02.A01.A04;
        if (C6J.A06(c7g)) {
            c7g2 = this.A02.A01.A04;
            String str = this.A03.A06;
            String str2 = this.A03.A07;
            String str3 = this.A03.A08;
            String str4 = this.A03.A02;
            String th2 = th != null ? th.toString() : A00(0, 7, 51);
            Long valueOf = Long.valueOf(System.currentTimeMillis() - this.A01);
            String[] strArr = A05;
            if (strArr[3].charAt(20) == strArr[0].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[2] = "AayJnSlXKOYoed0ZHJ3UlPrg44Go7inE";
            strArr2[7] = "t2uUu9WqhkybHrBNVhVVT1YnAGopOKs6";
            C6J.A05(c7g2, str, str2, str3, A00(7, 5, 22), str4, 2119, th2, null, valueOf, null);
        }
        try {
            blockingQueue = this.A02.A00;
            blockingQueue.put(false);
        } catch (InterruptedException unused) {
        }
    }
}
