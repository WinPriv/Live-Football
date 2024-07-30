package com.facebook.ads.redexgen.X;

import com.anythink.expressad.exoplayer.b;

/* renamed from: com.facebook.ads.redexgen.X.Hh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0936Hh {
    public static String[] A03 = {"65cMlekakVUIMLtYd2qVn8RcZ0adnk1M", "UjyIGuEYWfjJHNBaVK1tpUnDezxozlQO", "8TtcshNmMrpBHoTy3Jx7PSsI4WaoiE", "opOgbEamfowehMTo5e", "TsJIn0", "EhVZCkSBDk6mMyTg5zdzmerfhGbFv5ld", "Eri8EAzeqOX6dLYscfL5OJU1HmdTNDem", "nefT9Ttk6cyPRqOW12bbBLbtHnReAUgq"};
    public long A00;
    public long A01;
    public volatile long A02 = b.f7291b;

    public C0936Hh(long j10) {
        A02(j10);
    }

    public static long A00(long j10) {
        return (1000000 * j10) / 90000;
    }

    public static long A01(long j10) {
        return (90000 * j10) / 1000000;
    }

    private final synchronized void A02(long j10) {
        H6.A04(this.A02 == b.f7291b);
        this.A00 = j10;
    }

    public final long A03() {
        return this.A00;
    }

    public final long A04() {
        if (this.A02 != b.f7291b) {
            long j10 = this.A02;
            String[] strArr = A03;
            if (strArr[1].charAt(3) == strArr[7].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "a2e4BTQtBTIbtdID7RtsbeiIoOOOiE5j";
            strArr2[7] = "T6brmwdtMhRZgX81oiPgAK3x7yaW2pG8";
            return this.A01 + j10;
        }
        long j11 = this.A00;
        String[] strArr3 = A03;
        if (strArr3[6].charAt(9) == strArr3[0].charAt(9)) {
            throw new RuntimeException();
        }
        A03[4] = "vWaoyi";
        return j11 != Long.MAX_VALUE ? j11 : b.f7291b;
    }

    public final long A05() {
        if (this.A00 == Long.MAX_VALUE) {
            return 0L;
        }
        long j10 = this.A02;
        if (A03[4].length() != 6) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[1] = "iob8LfiWSdIXeaYrhNgyOnbM2i0L2mJ3";
        strArr[7] = "rhCREaYiIoksCalrOiAV4Z6SpW6PjrFh";
        return j10 == b.f7291b ? b.f7291b : this.A01;
    }

    public final long A06(long j10) {
        if (j10 == b.f7291b) {
            return b.f7291b;
        }
        if (this.A02 != b.f7291b) {
            this.A02 = j10;
        } else {
            long j11 = this.A00;
            if (j11 != Long.MAX_VALUE) {
                this.A01 = j11 - j10;
            }
            synchronized (this) {
                this.A02 = j10;
                notifyAll();
            }
        }
        return this.A01 + j10;
    }

    public final long A07(long j10) {
        if (j10 == b.f7291b) {
            return b.f7291b;
        }
        if (this.A02 != b.f7291b) {
            long A01 = A01(this.A02);
            long closestWrapCount = (4294967296L + A01) / 8589934592L;
            long j11 = ((closestWrapCount - 1) * 8589934592L) + j10;
            long j12 = (8589934592L * closestWrapCount) + j10;
            long lastPts = j11 - A01;
            long abs = Math.abs(lastPts);
            long lastPts2 = j12 - A01;
            if (abs >= Math.abs(lastPts2)) {
                j11 = j12;
            }
            j10 = j11;
        }
        long lastPts3 = A00(j10);
        return A06(lastPts3);
    }

    public final void A08() {
        this.A02 = b.f7291b;
    }
}
