package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.anythink.expressad.exoplayer.b;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class AQ {
    public static byte[] A0P;
    public static String[] A0Q = {"2OZtSKqBdCORReWjwkUHUNaFdmP57qD6", "wxnNTeBLYydyQqASc88t", "NZCt4jZqJZROeAh1myX6H7SaBhvHRhTJ", "W", "cvmaUkh2yailCvlRg0", "9zfhSGNjdoCRl8j9ORTvg70vvPJm", "N6Pae7kbdU7K2JDJ7pHsGdlVXSdZHDtL", "MG3JHDBNbYnrrwGYpH7tUB1vkoKXKxdT"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public AudioTrack A0H;
    public AN A0I;
    public Method A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final AO A0N;
    public final long[] A0O;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0P, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 82);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0P = new byte[]{119, 117, 100, 92, 113, 100, 117, 126, 115, 105};
    }

    static {
        A06();
    }

    public AQ(AO ao) {
        this.A0N = (AO) H6.A01(ao);
        if (C0940Hl.A02 >= 18) {
            try {
                this.A0J = AudioTrack.class.getMethod(A03(0, 10, 66), (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.A0O = new long[10];
    }

    private long A00() {
        if (this.A0G != b.f7291b) {
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            if (A0Q[6].charAt(23) == 'U') {
                throw new RuntimeException();
            }
            A0Q[3] = "4";
            long j10 = (this.A03 * (elapsedRealtime - this.A0G)) / 1000000;
            long framesSinceStop = this.A06;
            long elapsedTimeSinceStopUs = this.A0F;
            return Math.min(framesSinceStop, elapsedTimeSinceStopUs + j10);
        }
        int playState = this.A0H.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        int state = this.A0H.getPlaybackHeadPosition();
        long j11 = 4294967295L & state;
        if (this.A0M) {
            if (playState == 2 && j11 == 0) {
                this.A0C = this.A0A;
            }
            j11 += this.A0C;
        }
        if (C0940Hl.A02 <= 28) {
            if (j11 == 0) {
                long j12 = this.A0A;
                if (A0Q[2].charAt(13) == 'g') {
                    throw new RuntimeException();
                }
                A0Q[7] = "Jf7te8MTt0xB0AnyTHSRJJahUuQs4RIN";
                if (j12 > 0 && playState == 3) {
                    if (this.A07 == b.f7291b) {
                        this.A07 = SystemClock.elapsedRealtime();
                    }
                    return this.A0A;
                }
            }
            this.A07 = b.f7291b;
        }
        if (this.A0A > j11) {
            this.A0D++;
        }
        this.A0A = j11;
        return (this.A0D << 32) + j11;
    }

    private long A01() {
        return A02(A00());
    }

    private long A02(long j10) {
        return (1000000 * j10) / this.A03;
    }

    private void A04() {
        long systemTimeUs = A01();
        if (systemTimeUs == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        long playbackPositionUs = this.A09;
        if (nanoTime - playbackPositionUs >= 30000) {
            long[] jArr = this.A0O;
            int i10 = this.A01;
            long playbackPositionUs2 = systemTimeUs - nanoTime;
            jArr[i10] = playbackPositionUs2;
            this.A01 = (i10 + 1) % 10;
            int i11 = this.A04;
            if (i11 < 10) {
                int i12 = i11 + 1;
                if (A0Q[7].charAt(25) == 'h') {
                    throw new RuntimeException();
                }
                A0Q[7] = "0ZtCyKtQlXFIE9UJw5KWgAyqZz9KpR2W";
                this.A04 = i12;
            }
            this.A09 = nanoTime;
            this.A0E = 0L;
            int i13 = 0;
            while (true) {
                int i14 = this.A04;
                if (i13 >= i14) {
                    break;
                }
                long playbackPositionUs3 = i14;
                this.A0E += this.A0O[i13] / playbackPositionUs3;
                i13++;
            }
        }
        boolean z10 = this.A0M;
        if (A0Q[3].length() == 1) {
            A0Q[7] = "QKSLI2et0ddSkJpCy6yOqBE4Y3BrEDug";
            if (z10) {
                return;
            }
        } else if (z10) {
            return;
        }
        A08(nanoTime, systemTimeUs);
        A07(nanoTime);
    }

    private void A05() {
        this.A0E = 0L;
        this.A04 = 0;
        this.A01 = 0;
        this.A09 = 0L;
    }

    private void A07(long j10) {
        Method method;
        if (this.A0L && (method = this.A0J) != null && j10 - this.A08 >= 500000) {
            try {
                this.A0B = (((Integer) method.invoke(this.A0H, (Object[]) null)).intValue() * 1000) - this.A05;
                this.A0B = Math.max(this.A0B, 0L);
                if (this.A0B > 5000000) {
                    this.A0N.AB5(this.A0B);
                    this.A0B = 0L;
                }
            } catch (Exception unused) {
                this.A0J = null;
            }
            this.A08 = j10;
        }
    }

    private void A08(long j10, long audioTimestampSystemTimeUs) {
        if (!this.A0I.A08(j10)) {
            return;
        }
        long A02 = this.A0I.A02();
        long A01 = this.A0I.A01();
        if (Math.abs(A02 - j10) > 5000000) {
            this.A0N.ACO(A01, A02, j10, audioTimestampSystemTimeUs);
            this.A0I.A04();
        } else if (Math.abs(A02(A01) - audioTimestampSystemTimeUs) > 5000000) {
            this.A0N.ABp(A01, A02, j10, audioTimestampSystemTimeUs);
            this.A0I.A04();
        } else {
            this.A0I.A03();
        }
    }

    private boolean A09() {
        return this.A0M && this.A0H.getPlayState() == 2 && A00() == 0;
    }

    public static boolean A0A(int i10) {
        return C0940Hl.A02 < 23 && (i10 == 5 || i10 == 6);
    }

    public final int A0B(long j10) {
        int bytesPending = (int) (j10 - (A00() * this.A02));
        return this.A00 - bytesPending;
    }

    public final long A0C(boolean z10) {
        long systemTimeUs;
        if (this.A0H.getPlayState() == 3) {
            A04();
        }
        long nanoTime = System.nanoTime();
        if (A0Q[7].charAt(25) == 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A0Q;
        strArr[5] = "wFaGh6b5RiCG631f3S8Lg8JJUGkJ";
        strArr[1] = "CitVBV12pOqWvHiAj7sv";
        long j10 = nanoTime / 1000;
        if (this.A0I.A06()) {
            long systemTimeUs2 = this.A0I.A01();
            long timestampPositionFrames = A02(systemTimeUs2);
            if (!this.A0I.A07()) {
                return timestampPositionFrames;
            }
            long systemTimeUs3 = this.A0I.A02();
            return timestampPositionFrames + (j10 - systemTimeUs3);
        }
        if (this.A04 == 0) {
            systemTimeUs = A01();
        } else {
            long systemTimeUs4 = this.A0E;
            systemTimeUs = systemTimeUs4 + j10;
        }
        if (!z10) {
            long positionUs = this.A0B;
            return systemTimeUs - positionUs;
        }
        return systemTimeUs;
    }

    public final void A0D() {
        A05();
        this.A0H = null;
        this.A0I = null;
    }

    public final void A0E() {
        this.A0I.A05();
    }

    public final void A0F(long j10) {
        this.A0F = A00();
        this.A0G = SystemClock.elapsedRealtime() * 1000;
        this.A06 = j10;
    }

    public final void A0G(AudioTrack audioTrack, int i10, int i11, int i12) {
        this.A0H = audioTrack;
        this.A02 = i11;
        this.A00 = i12;
        this.A0I = new AN(audioTrack);
        this.A03 = audioTrack.getSampleRate();
        this.A0M = A0A(i10);
        this.A0L = C0940Hl.A0c(i10);
        this.A05 = this.A0L ? A02(i12 / i11) : -9223372036854775807L;
        this.A0A = 0L;
        this.A0D = 0L;
        this.A0C = 0L;
        this.A0K = false;
        this.A0G = b.f7291b;
        this.A07 = b.f7291b;
        this.A0B = 0L;
    }

    public final boolean A0H() {
        return this.A0H.getPlayState() == 3;
    }

    public final boolean A0I() {
        A05();
        if (this.A0G == b.f7291b) {
            this.A0I.A05();
            String[] strArr = A0Q;
            if (strArr[5].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Q;
            strArr2[5] = "GAvEeTbbpJy4dkpTDH1oMJCt3ihg";
            strArr2[1] = "Fc6P1TrRc3WwbWBQIjag";
            return true;
        }
        return false;
    }

    public final boolean A0J(long j10) {
        return j10 > A00() || A09();
    }

    public final boolean A0K(long j10) {
        if (this.A07 != b.f7291b) {
            if (A0Q[3].length() != 1) {
                throw new RuntimeException();
            }
            A0Q[2] = "WkbNChvAjAmG4HStnLH3XRlXL7LoLVfn";
            if (j10 > 0 && SystemClock.elapsedRealtime() - this.A07 >= 200) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0L(long j10) {
        AO ao;
        int playState = this.A0H.getPlayState();
        if (this.A0M) {
            if (playState == 2) {
                this.A0K = false;
                return false;
            }
            if (playState == 1 && A00() == 0) {
                return false;
            }
        }
        boolean hadData = this.A0K;
        this.A0K = A0J(j10);
        if (hadData && !this.A0K && playState != 1 && (ao = this.A0N) != null) {
            ao.ACW(this.A00, AnonymousClass92.A01(this.A05));
        }
        return true;
    }
}
