package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.De, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0833De implements Runnable {
    public static byte[] A02;
    public static String[] A03 = {"ygrR2oCQuDV4", "DNKcGXijWm6BAbsHYB9tJVHVwOJf9ZE7", "LXio5gucrx5pRKqWpkHtzDtUlmJWag3t", "79sxQvyKDcGCor525oKKoplIPAz2exYS", "G4RdIjdfwRebxnJM9f1GRZk4OR8ZnwMf", "KNt7Wd51BXMZnN1lzx9YZQc0XvITGZGG", "KZ351c6FjYQvk7DZPBJOKLteXh4ScOon", "e5Lfk6CJXwKq"};
    public final /* synthetic */ C0841Dm A00;
    public final /* synthetic */ DownloadAction[] A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {56, 19, Ascii.VT, Ascii.DC2, Ascii.DLE, 19, Ascii.GS, Ascii.CAN, 49, Ascii.GS, Ascii.DC2, Ascii.GS, Ascii.ESC, Ascii.EM, Ascii.SO, 121, 76, 91, 90, 64, 90, 93, 64, 71, 78, 9, 72, 74, 93, 64, 70, 71, 90, 9, 79, 72, 64, 69, 76, 77, 7};
        if (A03[6].charAt(27) == 't') {
            throw new RuntimeException();
        }
        A03[3] = "P9OfQ9yL9WD45vqgxteLJEc4LCKor8r2";
        A02 = bArr;
    }

    static {
        A01();
    }

    public RunnableC0833De(C0841Dm c0841Dm, DownloadAction[] downloadActionArr) {
        this.A00 = c0841Dm;
        this.A01 = downloadActionArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DS ds;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            try {
                ds = this.A00.A09;
                ds.A02(this.A01);
            } catch (IOException e10) {
                Log.e(A00(0, 15, 80), A00(15, 26, 5), e10);
            }
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
            String[] strArr = A03;
            if (strArr[2].charAt(26) != strArr[1].charAt(26)) {
                throw new RuntimeException();
            }
            A03[5] = "LLc1NddejmN7rNF53s5OYYgeggfBVRnl";
        }
    }
}
