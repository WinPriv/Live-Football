package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.b;
import java.util.Arrays;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.Hz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0952Hz {
    public static byte[] A0C;
    public static String[] A0D = {"i0Plrx2Nq5R", "0KClt8Z9EM", "nQMuIj2OsVJHQqYmqvawjMpASRVzc92c", "WLkeStMKuRlseW4hkxDKryqccASBMssv", "75mbZl2wj9Oc7L4cfBN0ornHxJ7x4bV4", "cDdFi4obBr6Dm4LziWqhdJNE9f6gL2cC", "Y", "1LOEfBfCv2OZoty488nnb7WvOOH1XlhR"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final WindowManager A09;
    public final C0950Hx A0A;
    public final ChoreographerFrameCallbackC0951Hy A0B;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{109, 96, 122, 121, 101, 104, 112, 120, 102, 97, 107, 96, 120};
    }

    static {
        A04();
    }

    public C0952Hz() {
        this(null);
    }

    public C0952Hz(@Nullable Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.A09 = (WindowManager) context.getSystemService(A02(7, 6, 115));
        } else {
            this.A09 = null;
        }
        if (this.A09 != null) {
            this.A0A = C0940Hl.A02 >= 17 ? A01(context) : null;
            this.A0B = ChoreographerFrameCallbackC0951Hy.A00();
        } else {
            this.A0A = null;
            this.A0B = null;
        }
        this.A06 = b.f7291b;
        this.A07 = b.f7291b;
    }

    public static long A00(long j10, long j11, long j12) {
        long j13;
        long vsyncCount = j12 * ((j10 - j11) / j12);
        long j14 = j11 + vsyncCount;
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            j13 = j14;
            j14 += j12;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    @TargetApi(17)
    private C0950Hx A01(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(A02(0, 7, 117));
        if (displayManager == null) {
            return null;
        }
        return new C0950Hx(this, displayManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        Display defaultDisplay = this.A09.getDefaultDisplay();
        if (defaultDisplay != null) {
            double refreshRate = 1.0E9d / defaultDisplay.getRefreshRate();
            String[] strArr = A0D;
            if (strArr[1].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0D[0] = "cQjBVfAMAaWJXkNWf";
            this.A06 = (long) refreshRate;
            this.A07 = (this.A06 * 80) / 100;
        }
    }

    private boolean A06(long j10, long j11) {
        long j12 = j10 - this.A04;
        long elapsedFrameTimeNs = this.A05;
        return Math.abs((j11 - elapsedFrameTimeNs) - j12) > 20000000;
    }

    public final long A07(long j10, long j11) {
        long j12 = 1000 * j10;
        long j13 = j12;
        long j14 = j11;
        if (this.A08) {
            if (j10 != this.A02) {
                this.A01++;
                this.A00 = this.A03;
            }
            long j15 = this.A01;
            if (j15 >= 6) {
                long j16 = this.A00 + ((j12 - this.A04) / j15);
                if (!A06(j16, j11)) {
                    j14 = (this.A05 + j16) - this.A04;
                    j13 = j16;
                } else {
                    this.A08 = false;
                }
            } else if (A06(j12, j11)) {
                this.A08 = false;
            }
        }
        if (!this.A08) {
            this.A04 = j12;
            this.A05 = j11;
            this.A01 = 0L;
            this.A08 = true;
        }
        this.A02 = j10;
        this.A03 = j13;
        ChoreographerFrameCallbackC0951Hy choreographerFrameCallbackC0951Hy = this.A0B;
        if (choreographerFrameCallbackC0951Hy == null || this.A06 == b.f7291b) {
            return j14;
        }
        long j17 = choreographerFrameCallbackC0951Hy.A04;
        if (j17 == b.f7291b) {
            return j14;
        }
        return A00(j14, j17, this.A06) - this.A07;
    }

    public final void A08() {
        if (this.A09 != null) {
            C0950Hx c0950Hx = this.A0A;
            if (c0950Hx != null) {
                c0950Hx.A01();
            }
            this.A0B.A07();
        }
    }

    public final void A09() {
        this.A08 = false;
        if (this.A09 != null) {
            this.A0B.A06();
            C0950Hx c0950Hx = this.A0A;
            if (c0950Hx != null) {
                c0950Hx.A00();
            }
            A03();
        }
    }
}
