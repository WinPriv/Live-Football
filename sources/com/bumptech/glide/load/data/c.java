package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: BufferedOutputStream.java */
/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: s, reason: collision with root package name */
    public final OutputStream f19759s;

    /* renamed from: t, reason: collision with root package name */
    public byte[] f19760t;

    /* renamed from: u, reason: collision with root package name */
    public final b3.b f19761u;

    /* renamed from: v, reason: collision with root package name */
    public int f19762v;

    public c(FileOutputStream fileOutputStream, b3.b bVar) {
        this.f19759s = fileOutputStream;
        this.f19761u = bVar;
        this.f19760t = (byte[]) bVar.c(byte[].class, com.anythink.expressad.exoplayer.b.aX);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OutputStream outputStream = this.f19759s;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.f19760t;
            if (bArr != null) {
                this.f19761u.put(bArr);
                this.f19760t = null;
            }
        } catch (Throwable th) {
            outputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i10 = this.f19762v;
        OutputStream outputStream = this.f19759s;
        if (i10 > 0) {
            outputStream.write(this.f19760t, 0, i10);
            this.f19762v = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        byte[] bArr = this.f19760t;
        int i11 = this.f19762v;
        int i12 = i11 + 1;
        this.f19762v = i12;
        bArr[i11] = (byte) i10;
        if (i12 != bArr.length || i12 <= 0) {
            return;
        }
        this.f19759s.write(bArr, 0, i12);
        this.f19762v = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f19762v;
            OutputStream outputStream = this.f19759s;
            if (i15 == 0 && i13 >= this.f19760t.length) {
                outputStream.write(bArr, i14, i13);
                return;
            }
            int min = Math.min(i13, this.f19760t.length - i15);
            System.arraycopy(bArr, i14, this.f19760t, this.f19762v, min);
            int i16 = this.f19762v + min;
            this.f19762v = i16;
            i12 += min;
            byte[] bArr2 = this.f19760t;
            if (i16 == bArr2.length && i16 > 0) {
                outputStream.write(bArr2, 0, i16);
                this.f19762v = 0;
            }
        } while (i12 < i11);
    }
}
