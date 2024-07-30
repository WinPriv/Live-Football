package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.lang.Thread;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.89, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass89 {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"qrNp1wG", "4f9SKAEMWw8LBpPH9ClfYFaSVVluVAOE", "62aVnpwn360RV3u8SEcmxFYidJmBvefX", "Gce9ySP9MgoEln4cNVrEo5sJO8CSkBrv", "GAv6eBsy68sSiadtgyjEU9blJSusD372", "OMedkGV5dbFzDsS0dZcen", "wlEAAxVLaYYUt0VSnPi", "2B4l1t7rFez9Iyb0KdS6JKEUq9HBo8Fu"};
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;
    public static final AtomicBoolean A06;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[1].charAt(3) == 'A') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[4] = "IDfTBPjSyvL4biEe7dLkbKSavqcQmadb";
            strArr[2] = "Oy3yacq1X2KDRnpIDSUXWs28RTZJmhMt";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 60);
            i13++;
        }
    }

    public static void A03() {
        A02 = new byte[]{-59, -56, -58, -8, -55, -53, -55, -10, -66, -70, -71, -19, -36, -31, -35, -26, -37, -35, -58, -35, -20, -17, -25, -22, -29, -62, -77, -70, -113, -40, -35, -40, -29, -40, -48, -37, -40, -23, -48, -29, -40, -34, -35, -113, -30, -29, -48, -31, -29, -44, -45, -60, -43, -36, -111, -24, -46, -28, -111, -46, -35, -29, -42, -46, -43, -22, -111, -38, -33, -38, -27, -38, -46, -35, -38, -21, -42, -43, -110, -111, -60, -36, -38, -31, -31, -38, -33, -40, -97, -62, -40, -34, -119, -51, -40, -41, -112, -35, -119, -52, -54, -43, -43, -119, -86, -34, -51, -46, -50, -41, -52, -50, -73, -50, -35, -32, -40, -37, -44, -86, -51, -36, -105, -46, -41, -46, -35, -46, -54, -43, -46, -29, -50, -111, -110, -105, -119, -68, -40, -42, -50, -119, -49, -34, -41, -52, -35, -46, -40, -41, -54, -43, -46, -35, -30, -119, -42, -54, -30, -119, -41, -40, -35, -119, -32, -40, -37, -44, -119, -39, -37, -40, -39, -50, -37, -43, -30, -105, -66, -51, -58, -31, -33, -24, -33, -20, -29, -35, -9, -4, -9, 2, -9, -17, -6, -9, 8, -13, 5, 10, 5, Ascii.DLE, 5, -3, 8, 5, Ascii.SYN, 1, -60, -59, -68, 10, Ascii.VT, Ascii.DLE, -68, -1, -3, 8, 8, 1, 0, -54};
    }

    static {
        A03();
        A06 = new AtomicBoolean();
        A04 = new AtomicBoolean();
        A05 = new AtomicBoolean();
    }

    public static InterfaceC0988Jk A00() {
        return new WT();
    }

    public static K0 A01(C1315Wi c1315Wi) {
        return new WS(c1315Wi);
    }

    public static void A04(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        L8.A01.execute(new WU(initListener, initResult));
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A06(C1315Wi c1315Wi) {
        if (IF.A0P(c1315Wi) && !A05.getAndSet(true)) {
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = new C06887b(Thread.getDefaultUncaughtExceptionHandler(), c1315Wi, new WQ());
                Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
            } catch (Exception e10) {
                c1315Wi.A06().A8u(A02(181, 7, 62), C06977l.A1X, new C06987m(e10));
            }
        }
    }

    public static void A07(C1315Wi c1315Wi) {
        A0G(c1315Wi, null, null, 3);
    }

    public static void A08(C1315Wi c1315Wi) {
        A0G(c1315Wi, null, null, 3);
    }

    public static void A09(C1315Wi c1315Wi) {
        if (ID.A1d(c1315Wi)) {
            A0E(c1315Wi, 0);
        }
        if (ID.A1k(c1315Wi)) {
            A0B(c1315Wi);
        }
    }

    public static void A0A(C1315Wi c1315Wi) {
        if (ID.A1e(c1315Wi)) {
            A0F(c1315Wi, null, 3);
        }
    }

    public static void A0B(C1315Wi c1315Wi) {
        LJ.A06.execute(new WV(c1315Wi));
    }

    public static void A0C(C1315Wi c1315Wi) {
        C06917f.A0C(c1315Wi, new WP(c1315Wi), new WZ(), BuildConfigApi.isDebug());
        c1315Wi.A08();
    }

    public static void A0E(C1315Wi c1315Wi, int i10) {
        C7F.A01(c1315Wi);
        if (A04.getAndSet(true)) {
            return;
        }
        if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isDebuggerOn()) {
            JH.A02();
        }
        A06(c1315Wi);
        C1000Jx.A00(ID.A0m(c1315Wi), BuildConfigApi.isDebug(), A00(), A01(c1315Wi));
        AnonymousClass61.A03(ID.A03(c1315Wi));
        Q6.A09(new WR(c1315Wi));
        if (i10 == 3) {
            Log.e(A02(8, 17, 60), A02(89, 89, 45));
            c1315Wi.A06().A9D(A02(178, 3, 33), C06977l.A0R, new C06987m(A02(198, 24, 96)));
        }
        ActivityUtils.A04(c1315Wi, AudienceNetworkActivity.class);
        LJ.A05(c1315Wi);
        C0957Ie.A05(c1315Wi);
        C05370u.A01(c1315Wi);
        if (ID.A0w(c1315Wi)) {
            C06424y.A00(c1315Wi);
        }
        if (ID.A1K(c1315Wi)) {
            WH.A02().A7L(c1315Wi);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A0F(C1315Wi c1315Wi, @Nullable AudienceNetworkAds.InitListener initListener, int i10) {
        C7F.A01(c1315Wi);
        boolean z10 = false;
        synchronized (AnonymousClass89.class) {
            boolean execute = A00;
            if (!execute) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        boolean execute2 = A01;
                        if (!execute2) {
                            A01 = true;
                            z10 = true;
                        }
                    }
                }
                A00 = true;
                z10 = true;
            }
        }
        if (z10) {
            A0E(c1315Wi, i10);
            LJ.A08.execute(new WW(c1315Wi, initListener));
        } else {
            if (i10 != 1) {
                return;
            }
            String A022 = A02(51, 38, 53);
            if (initListener != null) {
                A04(initListener, new AnonymousClass88(true, A022));
            } else {
                Log.w(A02(8, 17, 60), A022);
            }
        }
    }

    public static void A0G(C1315Wi c1315Wi, @Nullable MultithreadedBundleWrapper multithreadedBundleWrapper, @Nullable AudienceNetworkAds.InitListener initListener, int i10) {
        JH.A05(A02(188, 10, 82), A02(25, 26, 51), A02(0, 8, 87));
        Q6.A06();
        A0F(c1315Wi, initListener, i10);
    }

    public static synchronized boolean A0H() {
        boolean z10;
        synchronized (AnonymousClass89.class) {
            z10 = A00;
        }
        return z10;
    }
}
