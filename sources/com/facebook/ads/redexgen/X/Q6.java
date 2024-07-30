package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class Q6 {

    @Nullable
    public static InterfaceC1141Pm A00;
    public static byte[] A01;
    public static String[] A02 = {"b", "jWWIi2TrnHAAyoG5itvaKpzBpE6rwsKb", "4piz2zd6PBPCOA5LKuru6huyc0Gk9hmI", "ThWxRwfxtMClt6xxWNEGrvPqHoOGiBgN", "VC0ltrZe3ujZ5yBmE9F34w5pTHRf8GMT", "g0Z7XyqsbnnTrD4DkPgr08gcmreNHhpx", "VVYGWntGozQ2sTcwE1XxLnyTeGzWkyyX", "XVqTwdXEkxL4UUDwn3dakWK60VTsxJd5"};
    public static final Set<String> A03;
    public static final Set<String> A04;
    public static final AtomicBoolean A05;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{36, 101, 110, 8, 85, 68, Ascii.VT, 77, 77, 2, Ascii.DEL, 10, 123, 99, 73, 104, 8, 85, 98, Ascii.SI, 86, 84, 94, 81, 8, 82, 77, 74, 8, 111, 85, 73, 81, 7, 48, Ascii.DEL, 32, 7, 58, 38, 2, 63, 42, 33, 62, 34, 103, Ascii.ESC, 33, 42, 8, 36, 58, 62, 126, 37, Ascii.SUB, 36, 99, 53, Ascii.RS, 63, 113, 70, Ascii.CR, Ascii.DEL, 119, Ascii.RS, 59, 10, 123, 54, 3, Ascii.FF, 43, 35, 38, 123, 61, 63, 59, 54, 62, Ascii.SO, 10, 44, 53, Ascii.ETB, 0, 42, Ascii.SO, 114, 69, 107, 64, 81, 82, 74, 87, 78, 76, 75, 66, 5, 71, 64, 67, 74, 87, 64, 5, 76, 75, 76, 81, 4, 113, 115, 113, 96, Ascii.US, 72, 71, 115, 75, 77, 98, 79, 2, 93, 72, 124, 123, 77, 71, 80, 124, 97, Ascii.FS, 64, 89, 78, 100, Ascii.DC4, 35, 54, 62, 37, 39, 59, 54, 57, 50, 8, 58, 56, 51, 50, 8, 56, 57, 7, Ascii.FF, Ascii.GS, Ascii.RS, 6, Ascii.ESC, 2, 19, 8, 61, 85, 32, 53, 9, 53, Ascii.CR, 36, 94, 55, 82, 49, 49, 50, 3, 36, Ascii.ETB, 40, Ascii.NAK, 33, 47, 95, Ascii.VT, 1, 54, 90, 109};
    }

    static {
        A07();
        A03 = new HashSet();
        A04 = new HashSet();
        A03.add(A05(6, 29, 2));
        A04.add(A05(168, 29, 95));
        A04.add(A05(35, 29, 116));
        A04.add(A05(64, 29, 119));
        A04.add(A05(116, 29, 17));
        A05 = new AtomicBoolean();
    }

    public static InterfaceC1143Po A00(C7G c7g) {
        return A03(true, c7g);
    }

    public static InterfaceC1143Po A01(C7G c7g) {
        return A02(true, c7g);
    }

    public static InterfaceC1143Po A02(boolean z10, C7G c7g) {
        C1147Ps c1147Ps = new C1147Ps();
        C1150Pv A042 = A04(c7g);
        if (!A0B(c7g)) {
            c1147Ps.A02(A04);
            c1147Ps.A01(A03);
        }
        if (KO.A04()) {
            Map<String, String> A022 = KO.A02();
            String[] strArr = A02;
            if (strArr[2].charAt(7) == strArr[1].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "6CjO7LbqJIONUadrRHmx0RuGBypxStir";
            strArr2[3] = "VKsjD9ddp6JrHwn0FL0Df9QGs7RhJ4JT";
            A042.A08(A022);
        }
        AbstractC1145Pq A002 = AbstractC1145Pq.A00();
        C1147Ps networkModuleConfigurationBuilder = c1147Ps.A00(A042.A09());
        return A002.A01(networkModuleConfigurationBuilder.A03(z10).A04(c7g.A03().A8N()).A05(), c7g.A06(), LJ.A01());
    }

    public static InterfaceC1143Po A03(boolean z10, C7G c7g) {
        return AbstractC1145Pq.A00().A01(new C1147Ps().A03(z10).A00(A04(c7g).A09()).A04(c7g.A03().A8N()).A05(), c7g.A06(), LJ.A01());
    }

    public static C1150Pv A04(C7G c7g) {
        A08(c7g);
        C1150Pv c1150Pv = new C1150Pv();
        if (A0B(c7g) || KO.A04()) {
            c1150Pv.A02(360000).A04(120000);
        } else {
            c1150Pv.A02(ID.A08(c7g)).A04(ID.A0A(c7g));
        }
        c1150Pv.A03(ID.A09(c7g)).A05(ID.A0B(c7g)).A06(ID.A0C(c7g));
        synchronized (Q6.class) {
            if (A00 != null && (A00 instanceof InterfaceC1141Pm)) {
                c1150Pv.A07(A00);
            }
        }
        return c1150Pv;
    }

    public static void A06() {
        A05.set(true);
    }

    public static void A08(C7G c7g) {
        if (!A05.get()) {
            c7g.A06().A8u(A05(161, 7, 81), C06977l.A20, new C06987m(A05(93, 23, 29)));
        }
    }

    public static synchronized void A09(InterfaceC1141Pm interfaceC1141Pm) {
        synchronized (Q6.class) {
            A00 = interfaceC1141Pm;
        }
    }

    public static boolean A0A(C7G c7g) {
        int i10 = Build.VERSION.SDK_INT;
        String A052 = A05(145, 16, 111);
        if (i10 < 17) {
            return Settings.System.getInt(c7g.getContentResolver(), A052, 0) != 0;
        }
        int i11 = Settings.Global.getInt(c7g.getContentResolver(), A052, 0);
        if (A02[0].length() != 1) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "6SlcDzdssqL5L6jmaJN4q0YtRJ9ZiIN0";
        strArr[1] = "IhCDgNyX5tEXKuNPsF1SGphg5lyX1n5g";
        return i11 != 0;
    }

    public static boolean A0B(C7G c7g) {
        String A7j = c7g.A03().A7j();
        if (!TextUtils.isEmpty(A7j)) {
            String urlPrefix = A05(3, 3, 30);
            if (!A7j.endsWith(urlPrefix)) {
                String urlPrefix2 = A05(0, 3, 50);
                if (A7j.endsWith(urlPrefix2)) {
                }
            }
            return true;
        }
        return false;
    }
}
