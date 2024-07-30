package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.b;
import com.anythink.expressad.exoplayer.f;

/* loaded from: assets/audience_network.dex */
public final class AN {
    public static String[] A06 = {"W1h", "J3B5KCEbjjwmRuC3OBjGZe6Vqq", "m9qFzMc74R8svEUC9gqMjQn", "jgNIoR8qAkaEc7us150M5yTFbz", "3ys", "w1u", "bbeJnzocKvEAyVfPIveapdYFC3HTaXea", "5a1"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;

    @Nullable
    public final AL A05;

    public AN(AudioTrack audioTrack) {
        if (C0940Hl.A02 >= 19) {
            this.A05 = new AL(audioTrack);
            A05();
        } else {
            this.A05 = null;
            A00(3);
        }
    }

    private void A00(int i10) {
        this.A00 = i10;
        if (i10 == 0) {
            this.A03 = 0L;
            this.A01 = -1L;
            this.A02 = System.nanoTime() / 1000;
            this.A04 = f.f7962a;
            return;
        }
        if (i10 == 1) {
            this.A04 = f.f7962a;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.A04 = 10000000L;
        } else {
            if (i10 == 4) {
                this.A04 = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final long A01() {
        AL al = this.A05;
        if (al != null) {
            return al.A00();
        }
        return -1L;
    }

    public final long A02() {
        AL al = this.A05;
        return al != null ? al.A01() : b.f7291b;
    }

    public final void A03() {
        if (this.A00 == 4) {
            A05();
        }
    }

    public final void A04() {
        A00(4);
    }

    public final void A05() {
        if (this.A05 != null) {
            A00(0);
        }
    }

    public final boolean A06() {
        int i10 = this.A00;
        return i10 == 1 || i10 == 2;
    }

    public final boolean A07() {
        return this.A00 == 2;
    }

    public final boolean A08(long j10) {
        AL al = this.A05;
        if (al == null || j10 - this.A03 < this.A04) {
            return false;
        }
        this.A03 = j10;
        boolean A02 = al.A02();
        int i10 = this.A00;
        if (i10 == 0) {
            if (!A02) {
                if (j10 - this.A02 > 500000) {
                    A00(3);
                    return A02;
                }
                return A02;
            }
            long A01 = this.A05.A01();
            long timestampPositionFrames = this.A02;
            if (A01 >= timestampPositionFrames) {
                this.A01 = this.A05.A00();
                String[] strArr = A06;
                if (strArr[1].length() != strArr[3].length()) {
                    A00(1);
                    return A02;
                }
                String[] strArr2 = A06;
                strArr2[5] = "X7O";
                strArr2[4] = "dhv";
                A00(1);
                return A02;
            }
            return false;
        }
        if (i10 == 1) {
            if (A02) {
                long A00 = this.A05.A00();
                long timestampPositionFrames2 = this.A01;
                if (A00 > timestampPositionFrames2) {
                    A00(2);
                    return A02;
                }
                return A02;
            }
            A05();
            return A02;
        }
        if (i10 == 2) {
            if (!A02) {
                A05();
                return A02;
            }
            return A02;
        }
        if (i10 == 3) {
            if (A02) {
                A05();
                return A02;
            }
            return A02;
        }
        String[] strArr3 = A06;
        if (strArr3[0].length() != strArr3[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr4 = A06;
        strArr4[5] = "KBr";
        strArr4[4] = "FWj";
        if (i10 != 4) {
            throw new IllegalStateException();
        }
        return A02;
    }
}
