package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.8g, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07188g {

    @VisibleForTesting
    public static int A03;
    public static byte[] A04;

    @Nullable
    public C07178f A00;
    public boolean A01;
    public final File A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 93);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{Ascii.ESC, 54, 62, 65, 58, 57, -11, 73, 68, -11, 57, 58, 65, 58, 73, 58, -11, 59, 62, 65, 58, -11, -4, -6, 72, -63, -28, -25, -32, -101, -94, -96, -18, -94, -101, -28, -18, -101, -23, -22, -17, -101, -36, -101, -19, -32, -36, -33, -36, -35, -25, -32, -101, -31, -28, -25, -32, Ascii.CAN, 61, 69, 48, 59, 56, 51, -17, 53, 52, 67, 50, 55, -17, 66, 67, 48, 65, 67, -17, 56, 61, 51, 52, 71, 9, -17, -12, 51, -66, -47, -49, -37, -34, -48, -116, -46, -43, -40, -47, -116, -51, -40, -34, -47, -51, -48, -27, -116, -48, -43, -33, -36, -37, -33, -47, -48};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized int A05() throws IOException {
        return A00().A00;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized C8X A06(int i10, byte[] bArr, int i11, int[] iArr, int i12) throws IOException {
        C07178f A00 = A00();
        boolean z10 = false;
        int i13 = 1;
        if (i10 < 0) {
            throw new IOException(String.format(Locale.US, A01(57, 29, 114), Integer.valueOf(i10)));
        }
        int i14 = i10;
        int i15 = 0;
        long j10 = -1;
        while (true) {
            if (i14 >= A00.A00) {
                break;
            }
            if ((i14 - i10) + i12 >= iArr.length) {
                z10 = true;
                break;
            }
            long j11 = A00.A03[i14];
            long j12 = (i14 == A00.A00 - i13 ? A00.A01 : A00.A03[i14 + 1]) - j11;
            if (j10 == -1) {
                j10 = j11;
            }
            if (((int) j12) + i15 + i11 > bArr.length) {
                z10 = true;
                break;
            }
            i15 += (int) j12;
            iArr[(i14 - i10) + i12] = (int) j12;
            i14++;
            i13 = 1;
        }
        if (i14 <= i10) {
            return new C8X(z10 ? C8W.A03 : C8W.A04, i10, i10, 0);
        }
        A00.A02.seek(j10);
        A00.A02.read(bArr, i11, i15);
        return new C8X(C8W.A02, i10, i14, i15);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized boolean A09(byte[] bArr) throws IOException {
        C07178f A00 = A00();
        if (A05() == A03) {
            return false;
        }
        A03(A00.A00, A00.A01);
        A04(A00.A01, bArr);
        A00.A02.getFD().sync();
        A00.A00++;
        A00.A01 += bArr.length;
        return true;
    }

    static {
        A02();
        A03 = 1000;
    }

    public C07188g(File file) throws IOException {
        this.A02 = file;
        if (!file.exists()) {
            this.A00 = C07178f.A03(file);
        } else if (!file.isFile()) {
            throw new IOException(String.format(Locale.US, A01(25, 32, 30), file.getCanonicalPath()));
        }
    }

    private C07178f A00() throws IOException {
        if (!this.A01) {
            if (this.A00 == null) {
                this.A00 = C07178f.A04(this.A02);
            }
            return this.A00;
        }
        throw new IOException(A01(86, 28, 15));
    }

    private void A03(int i10, long j10) throws IOException {
        this.A00.A03[i10] = j10;
        this.A00.A02.seek(C07178f.A02(i10));
        this.A00.A02.writeLong(j10);
    }

    private void A04(long j10, byte[] bArr) throws IOException {
        this.A00.A02.seek(j10);
        this.A00.A02.write(bArr);
    }

    public final synchronized void A07() throws IOException {
        this.A01 = true;
        if (this.A00 == null) {
            return;
        }
        RandomAccessFile randomAccessFile = this.A00.A02;
        this.A00 = null;
        randomAccessFile.close();
    }

    public final synchronized void A08() throws IOException {
        if (!this.A01) {
            A07();
            if (!this.A02.delete()) {
                throw new IOException(String.format(Locale.US, A01(0, 25, 120), this.A02.getCanonicalPath()));
            }
        } else {
            throw new IOException(A01(86, 28, 15));
        }
    }
}
