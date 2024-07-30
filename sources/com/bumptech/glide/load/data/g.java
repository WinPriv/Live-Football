package com.bumptech.glide.load.data;

import com.applovin.exoplayer2.common.base.Ascii;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ExifOrientationStream.java */
/* loaded from: classes.dex */
public final class g extends FilterInputStream {

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f19766u = {-1, -31, 0, Ascii.FS, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, Ascii.DC2, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: v, reason: collision with root package name */
    public static final int f19767v = 31;

    /* renamed from: s, reason: collision with root package name */
    public final byte f19768s;

    /* renamed from: t, reason: collision with root package name */
    public int f19769t;

    public g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 >= -1 && i10 <= 8) {
            this.f19768s = (byte) i10;
            return;
        }
        throw new IllegalArgumentException(a3.l.i("Cannot add invalid orientation: ", i10));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int read;
        int i10;
        int i11 = this.f19769t;
        if (i11 < 2 || i11 > (i10 = f19767v)) {
            read = super.read();
        } else if (i11 == i10) {
            read = this.f19768s;
        } else {
            read = f19766u[i11 - 2] & DefaultClassResolver.NAME;
        }
        if (read != -1) {
            this.f19769t++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long skip = super.skip(j10);
        if (skip > 0) {
            this.f19769t = (int) (this.f19769t + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13 = this.f19769t;
        int i14 = f19767v;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f19768s;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int min = Math.min(i14 - i13, i11);
            System.arraycopy(f19766u, this.f19769t - 2, bArr, i10, min);
            i12 = min;
        }
        if (i12 > 0) {
            this.f19769t += i12;
        }
        return i12;
    }
}
