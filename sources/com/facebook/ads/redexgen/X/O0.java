package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: assets/audience_network.dex */
public final class O0 extends InputStream {
    public int A00;
    public long A01;
    public GQ A02;
    public final Uri A03;
    public final C1315Wi A04;
    public final GP A05;

    @Nullable
    public final String A06;

    public O0(C1315Wi c1315Wi, Uri uri, GP gp) throws IOException {
        this.A04 = c1315Wi;
        this.A05 = gp;
        this.A03 = uri;
        this.A06 = PW.A08(this.A04, this.A03);
        A00(0);
    }

    private void A00(int i10) throws IOException {
        GQ gq = this.A02;
        if (gq != null) {
            gq.close();
        }
        this.A02 = this.A05.A4E();
        this.A01 = (int) this.A02.ACq(new GU(this.A03, i10, -1L, this.A06));
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((int) this.A01) - this.A00;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b10 = new byte[1];
        return read(b10);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int read = this.A02.read(bArr, i10, i11);
        int read2 = this.A00;
        this.A00 = read2 + read;
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        long j11 = this.A01 - this.A00;
        if (j11 <= 0) {
            return 0L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        this.A00 = (int) (this.A00 + j10);
        A00(this.A00);
        return j10;
    }
}
