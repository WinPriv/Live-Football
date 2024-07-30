package com.facebook.ads.redexgen.X;

import com.anythink.expressad.exoplayer.k.p;
import com.huawei.openalliance.ad.constant.ag;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ac, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0765Ac {
    public static String[] A0M = {"ohCL8W0", "KQz7BMIeF4Z94D8gT8Jgt17pY9ay2sPb", "WHqc", "zdEVbBlbYLVxAkbZHAQvOg0x6UERU0KV", "RqBqTDSsJG3NS", "FmAwfgCi2dLCVzfY4ysR6r9BF", "Bq6occebnHk", "mWE0rLrmKK4IIqcH7c7itMEBPX65A8Us"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public C0765Ac(int i10, int i11, float f, float f10, int i12) {
        this.A0H = i10;
        this.A0G = i11;
        this.A0F = f;
        this.A0D = f10;
        this.A0E = i10 / i12;
        this.A0K = i10 / ag.f21998i;
        this.A0I = i10 / 65;
        this.A0J = this.A0I * 2;
        int i13 = this.A0J;
        this.A0L = new short[i13];
        this.A0A = new short[i13 * i11];
        this.A0B = new short[i13 * i11];
        this.A0C = new short[i13 * i11];
    }

    private int A00(int i10) {
        int min = Math.min(this.A0J, this.A09);
        A0D(this.A0A, i10, min);
        int frameCount = this.A09;
        this.A09 = frameCount - min;
        return min;
    }

    private int A01(short[] sArr, int i10) {
        int retPeriod;
        int period;
        int i11 = this.A0H;
        int minP = i11 > 4000 ? i11 / 4000 : 1;
        int skip = this.A0G;
        if (skip == 1 && minP == 1) {
            int i12 = this.A0K;
            int skip2 = this.A0I;
            retPeriod = A04(sArr, i10, i12, skip2);
        } else {
            A0E(sArr, i10, minP);
            short[] sArr2 = this.A0L;
            int i13 = this.A0K / minP;
            int skip3 = this.A0I;
            retPeriod = A04(sArr2, 0, i13, skip3 / minP);
            if (minP != 1) {
                int i14 = retPeriod * minP;
                int skip4 = minP * 4;
                int maxP = i14 - skip4;
                int minP2 = (minP * 4) + i14;
                int skip5 = this.A0K;
                if (maxP < skip5) {
                    maxP = this.A0K;
                }
                int skip6 = this.A0I;
                if (minP2 > skip6) {
                    minP2 = this.A0I;
                }
                int i15 = this.A0G;
                int period2 = A0M[2].length();
                if (period2 != 4) {
                    throw new RuntimeException();
                }
                String[] strArr = A0M;
                strArr[7] = "JAo85nDeN7hM6ugSVwGhvUnreF2qbK1o";
                strArr[1] = "l4YUjJfL7ivyphsQmVZd9dZE6KXUcfPo";
                if (i15 == 1) {
                    retPeriod = A04(sArr, i10, maxP, minP2);
                } else {
                    A0E(sArr, i10, 1);
                    int period3 = A0M[2].length();
                    if (period3 != 4) {
                        retPeriod = A04(this.A0L, 0, maxP, minP2);
                    } else {
                        String[] strArr2 = A0M;
                        strArr2[6] = "Av8EYvFT4XF";
                        strArr2[5] = "OBBgqqBYNHA95X1QZrayaR0nl";
                        retPeriod = A04(this.A0L, 0, maxP, minP2);
                    }
                }
            }
        }
        int period4 = this.A02;
        int skip7 = this.A01;
        if (A0F(period4, skip7)) {
            period = this.A08;
        } else {
            period = retPeriod;
        }
        int skip8 = this.A02;
        this.A07 = skip8;
        this.A08 = retPeriod;
        return period;
    }

    private int A02(short[] sArr, int i10, float f, int i11) {
        int i12;
        if (f < 0.5f) {
            i12 = (int) ((i11 * f) / (1.0f - f));
        } else {
            this.A09 = (int) ((i11 * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i12 = i11;
        }
        int newFrameCount = i11 + i12;
        this.A0B = A0G(this.A0B, this.A05, newFrameCount);
        int i13 = this.A0G;
        short[] sArr2 = this.A0B;
        int newFrameCount2 = this.A05;
        System.arraycopy(sArr, i10 * i13, sArr2, newFrameCount2 * i13, i13 * i11);
        A0C(i12, this.A0G, this.A0B, this.A05 + i11, sArr, i10 + i11, sArr, i10);
        int newFrameCount3 = this.A05;
        this.A05 = newFrameCount3 + i11 + i12;
        return i12;
    }

    private int A03(short[] sArr, int i10, float f, int i11) {
        int newFrameCount;
        if (f >= 2.0f) {
            newFrameCount = (int) (i11 / (f - 1.0f));
        } else {
            this.A09 = (int) ((i11 * (2.0f - f)) / (f - 1.0f));
            newFrameCount = i11;
        }
        short[] sArr2 = this.A0B;
        int newFrameCount2 = this.A05;
        this.A0B = A0G(sArr2, newFrameCount2, newFrameCount);
        A0C(newFrameCount, this.A0G, this.A0B, this.A05, sArr, i10, sArr, i10 + i11);
        int newFrameCount3 = this.A05;
        this.A05 = newFrameCount3 + newFrameCount;
        return newFrameCount;
    }

    private int A04(short[] sArr, int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = p.f9095b;
        int period = 1;
        int maxDiff = 0;
        int bestPeriod = this.A0G;
        int i15 = i10 * bestPeriod;
        while (i11 <= i12) {
            int diff = 0;
            for (int minDiff = 0; minDiff < i11; minDiff++) {
                int bestPeriod2 = i15 + minDiff;
                short s10 = sArr[bestPeriod2];
                int bestPeriod3 = i15 + i11;
                int worstPeriod = s10 - sArr[bestPeriod3 + minDiff];
                int bestPeriod4 = Math.abs(worstPeriod);
                diff += bestPeriod4;
            }
            int worstPeriod2 = diff * i13;
            int bestPeriod5 = period * i11;
            if (worstPeriod2 < bestPeriod5) {
                period = diff;
                i13 = i11;
            }
            int worstPeriod3 = diff * i14;
            int bestPeriod6 = maxDiff * i11;
            if (worstPeriod3 > bestPeriod6) {
                maxDiff = diff;
                i14 = i11;
            }
            i11++;
        }
        this.A02 = period / i13;
        this.A01 = maxDiff / i14;
        return i13;
    }

    private short A05(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[this.A0G + i10];
        int rightPosition = this.A03 * i11;
        int i13 = this.A04;
        int i14 = i13 * i12;
        int position = (i13 + 1) * i12;
        int i15 = position - rightPosition;
        int position2 = position - i14;
        short left = (short) (((i15 * s10) + ((position2 - i15) * s11)) / position2);
        return left;
    }

    private void A06() {
        int i10 = this.A05;
        float f = this.A0F;
        float f10 = this.A0D;
        float f11 = f / f10;
        float f12 = this.A0E * f10;
        if (f11 > 1.00001d || f11 < 0.99999d) {
            A07(f11);
        } else {
            A0D(this.A0A, 0, this.A00);
            this.A00 = 0;
        }
        if (f12 != 1.0f) {
            A08(f12, i10);
        }
    }

    private void A07(float f) {
        int frameCount;
        if (this.A00 < this.A0J) {
            return;
        }
        int i10 = this.A00;
        int i11 = 0;
        do {
            int frameCount2 = this.A09;
            if (frameCount2 > 0) {
                int frameCount3 = A00(i11);
                i11 += frameCount3;
            } else {
                int A01 = A01(this.A0A, i11);
                if (f > 1.0d) {
                    int frameCount4 = A03(this.A0A, i11, f, A01);
                    i11 += frameCount4 + A01;
                } else {
                    int frameCount5 = A02(this.A0A, i11, f, A01);
                    i11 += frameCount5;
                }
            }
            frameCount = this.A0J;
        } while (frameCount + i11 <= i10);
        A0B(i11);
    }

    private void A08(float f, int i10) {
        int i11;
        int oldSampleRate;
        if (this.A05 == i10) {
            return;
        }
        int i12 = (int) (this.A0H / f);
        int i13 = this.A0H;
        while (true) {
            if (i12 > 16384 || i13 > 16384) {
                i12 /= 2;
                int oldSampleRate2 = A0M[0].length();
                if (oldSampleRate2 != 7) {
                    break;
                }
                A0M[0] = "V4vENqc";
                i13 /= 2;
            } else {
                A09(i10);
                int i14 = 0;
                while (true) {
                    int i15 = this.A06;
                    int i16 = i15 - 1;
                    String[] strArr = A0M;
                    String str = strArr[7];
                    String str2 = strArr[1];
                    int oldSampleRate3 = str.charAt(13);
                    int newSampleRate = str2.charAt(13);
                    if (oldSampleRate3 == newSampleRate) {
                        break;
                    }
                    String[] strArr2 = A0M;
                    strArr2[7] = "S0FZlq4hqR1MtwM4zltGGLcwqbHHLsP7";
                    strArr2[1] = "aAsnKYirvcv97dya3O8NjUmjHgDgPMP0";
                    if (i14 < i16) {
                        while (true) {
                            i11 = this.A04;
                            int position = i11 + 1;
                            int position2 = position * i12;
                            oldSampleRate = this.A03;
                            int newSampleRate2 = oldSampleRate * i13;
                            if (position2 <= newSampleRate2) {
                                break;
                            }
                            short[] sArr = this.A0B;
                            int newSampleRate3 = this.A05;
                            this.A0B = A0G(sArr, newSampleRate3, 1);
                            int i17 = 0;
                            while (true) {
                                int i18 = this.A0G;
                                if (i17 < i18) {
                                    short[] sArr2 = this.A0B;
                                    int oldSampleRate4 = this.A05;
                                    sArr2[(oldSampleRate4 * i18) + i17] = A05(this.A0C, (i18 * i14) + i17, i13, i12);
                                    i17++;
                                }
                            }
                            int newSampleRate4 = this.A03;
                            this.A03 = newSampleRate4 + 1;
                            int newSampleRate5 = this.A05;
                            this.A05 = newSampleRate5 + 1;
                        }
                        int newSampleRate6 = i11 + 1;
                        this.A04 = newSampleRate6;
                        int newSampleRate7 = this.A04;
                        if (newSampleRate7 == i13) {
                            this.A04 = 0;
                            H6.A04(oldSampleRate == i12);
                            this.A03 = 0;
                        }
                        i14++;
                    } else {
                        A0A(i15 - 1);
                        return;
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    private void A09(int i10) {
        int i11 = this.A05 - i10;
        short[] sArr = this.A0C;
        int frameCount = this.A06;
        this.A0C = A0G(sArr, frameCount, i11);
        short[] sArr2 = this.A0B;
        int i12 = this.A0G;
        short[] sArr3 = this.A0C;
        int frameCount2 = this.A06;
        System.arraycopy(sArr2, i10 * i12, sArr3, frameCount2 * i12, i12 * i11);
        this.A05 = i10;
        int frameCount3 = this.A06;
        this.A06 = frameCount3 + i11;
    }

    private void A0A(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.A0C;
        int i11 = this.A0G;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.A06 - i10) * i11);
        this.A06 -= i10;
    }

    private void A0B(int i10) {
        int i11 = this.A00 - i10;
        short[] sArr = this.A0A;
        int i12 = this.A0G;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.A00 = i11;
    }

    public static void A0C(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int t10 = (i14 * i11) + i15;
            int d10 = (i13 * i11) + i15;
            for (int u2 = 0; u2 < i10; u2++) {
                int i17 = i10 - u2;
                int o = sArr2[d10] * i17;
                int i18 = sArr3[t10] * u2;
                sArr[i16] = (short) ((o + i18) / i10);
                i16 += i11;
                d10 += i11;
                t10 += i11;
            }
        }
    }

    private void A0D(short[] sArr, int i10, int i11) {
        this.A0B = A0G(this.A0B, this.A05, i11);
        int i12 = this.A0G;
        System.arraycopy(sArr, i10 * i12, this.A0B, this.A05 * i12, i12 * i11);
        this.A05 += i11;
    }

    private void A0E(short[] sArr, int i10, int i11) {
        int i12 = this.A0J / i11;
        int frameCount = this.A0G;
        int j10 = frameCount * i11;
        int i13 = i10 * frameCount;
        for (int value = 0; value < i12; value++) {
            int samplesPerValue = 0;
            for (int i14 = 0; i14 < j10; i14++) {
                samplesPerValue += sArr[(value * j10) + i13 + i14];
            }
            this.A0L[value] = (short) (samplesPerValue / j10);
        }
    }

    private boolean A0F(int i10, int i11) {
        if (i10 == 0 || this.A08 == 0 || i11 > i10 * 3 || i10 * 2 <= this.A07 * 3) {
            return false;
        }
        return true;
    }

    private short[] A0G(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.A0G;
        int currentCapacityFrames = length / i12;
        if (i10 + i11 <= currentCapacityFrames) {
            return sArr;
        }
        return Arrays.copyOf(sArr, i12 * (((currentCapacityFrames * 3) / 2) + i11));
    }

    public final int A0H() {
        return this.A05;
    }

    public final void A0I() {
        this.A00 = 0;
        this.A05 = 0;
        this.A06 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A09 = 0;
        this.A08 = 0;
        this.A07 = 0;
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0J() {
        int i10 = this.A00;
        float f = this.A0F;
        float f10 = this.A0D;
        float r10 = f / f10;
        float f11 = this.A0E * f10;
        int i11 = this.A05;
        float s10 = i10;
        int remainingFrameCount = this.A06;
        int i12 = i11 + ((int) ((((s10 / r10) + remainingFrameCount) / f11) + 0.5f));
        short[] sArr = this.A0A;
        int i13 = this.A00;
        int remainingFrameCount2 = this.A0J;
        this.A0A = A0G(sArr, i13, (remainingFrameCount2 * 2) + i10);
        int i14 = 0;
        while (true) {
            int expectedOutputFrames = this.A0J;
            int remainingFrameCount3 = expectedOutputFrames * 2;
            int i15 = this.A0G;
            if (i14 < remainingFrameCount3 * i15) {
                short[] sArr2 = this.A0A;
                String[] strArr = A0M;
                String str = strArr[7];
                String str2 = strArr[1];
                int charAt = str.charAt(13);
                int remainingFrameCount4 = str2.charAt(13);
                if (charAt == remainingFrameCount4) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0M;
                strArr2[6] = "8uqTwc5xmM3";
                strArr2[5] = "8QSOBZmBR7CYVXHwBaCnC4p1f";
                sArr2[(i15 * i10) + i14] = 0;
                i14++;
            } else {
                int remainingFrameCount5 = expectedOutputFrames * 2;
                this.A00 += remainingFrameCount5;
                A06();
                int remainingFrameCount6 = this.A05;
                if (remainingFrameCount6 > i12) {
                    this.A05 = i12;
                }
                this.A00 = 0;
                this.A09 = 0;
                this.A06 = 0;
                return;
            }
        }
    }

    public final void A0K(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.A0G, this.A05);
        short[] sArr = this.A0B;
        int framesToRead = this.A0G;
        shortBuffer.put(sArr, 0, framesToRead * min);
        int framesToRead2 = this.A05;
        this.A05 = framesToRead2 - min;
        short[] sArr2 = this.A0B;
        int i10 = this.A0G;
        int framesToRead3 = this.A05;
        System.arraycopy(sArr2, min * i10, sArr2, 0, framesToRead3 * i10);
    }

    public final void A0L(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int framesToWrite = this.A0G;
        int i10 = remaining / framesToWrite;
        this.A0A = A0G(this.A0A, this.A00, i10);
        short[] sArr = this.A0A;
        int bytesToWrite = this.A00;
        shortBuffer.get(sArr, bytesToWrite * this.A0G, ((framesToWrite * i10) * 2) / 2);
        this.A00 += i10;
        A06();
    }
}
