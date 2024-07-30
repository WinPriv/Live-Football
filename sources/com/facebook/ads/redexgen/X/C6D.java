package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.facebook.ads.redexgen.X.6D, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C6D implements Callable<Boolean> {
    public static byte[] A02;
    public static String[] A03 = {"4L70rbdc", "PBHhMXx0npnpwTY", "91GJPzFmEyeOW3DYeKz29HPCrWXW0gNC", "umTRidE45okZulrVlJrHIV8", "kRbho3HgdeG0CdJ8rA209tRImftPXEnI", "60YY30c8MY", "ZuHjaYDngPTOcLYvMZdLe8TI8ruUn8GD", "lL0vcWHD5F"};
    public final C6C A00;
    public final /* synthetic */ C6G A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{114, 126, 109, 116, 106, 111, 43, 52, 57, 56, 50};
        if (A03[1].length() != 15) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[7] = "XFV0lH04tD";
        strArr[5] = "8rdCtS3Igw";
    }

    static {
        A02();
    }

    public C6D(C6G c6g, C6C c6c) {
        this.A01 = c6g;
        this.A00 = c6c;
    }

    private final Boolean A00() {
        String A01;
        C7G c7g;
        C7G c7g2;
        AnonymousClass00 A032;
        Map map;
        if (C0990Jm.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            if (this.A00.A04) {
                A01 = A01(0, 6, 63);
            } else {
                A01 = A01(6, 5, 125);
            }
            String str = this.A00.A08;
            String creativeType = this.A00.A07;
            AnonymousClass06 anonymousClass06 = new AnonymousClass06(str, creativeType, this.A00.A06, A01, this.A00.A02, this.A00.A05);
            anonymousClass06.A04 = this.A00.A03;
            anonymousClass06.A02 = this.A00.A01;
            anonymousClass06.A05 = this.A00.A04;
            c7g = this.A01.A04;
            if (C6J.A06(c7g)) {
                map = C6G.A0F;
                map.put(this.A00.A08, anonymousClass06);
            }
            c7g2 = this.A01.A04;
            A032 = C6G.A03(c7g2.A00());
            return Boolean.valueOf(A032.AE0(anonymousClass06) != null);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        if (C0990Jm.A02(this)) {
            return null;
        }
        try {
            return A00();
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
            return null;
        }
    }
}
