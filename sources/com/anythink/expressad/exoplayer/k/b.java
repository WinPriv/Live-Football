package com.anythink.expressad.exoplayer.k;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9003a = "AtomicFile";

    /* renamed from: b, reason: collision with root package name */
    private final File f9004b;

    /* renamed from: c, reason: collision with root package name */
    private final File f9005c;

    /* loaded from: classes.dex */
    public static final class a extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        private final FileOutputStream f9010a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f9011b = false;

        public a(File file) {
            this.f9010a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f9011b) {
                return;
            }
            this.f9011b = true;
            flush();
            try {
                this.f9010a.getFD().sync();
            } catch (IOException e10) {
                Log.w(b.f9003a, "Failed to sync file descriptor:", e10);
            }
            this.f9010a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            this.f9010a.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i10) {
            this.f9010a.write(i10);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            this.f9010a.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i10, int i11) {
            this.f9010a.write(bArr, i10, i11);
        }
    }

    public b(File file) {
        this.f9004b = file;
        this.f9005c = new File(file.getPath() + ".bak");
    }

    private void d() {
        if (this.f9005c.exists()) {
            this.f9004b.delete();
            this.f9005c.renameTo(this.f9004b);
        }
    }

    public final void a() {
        this.f9004b.delete();
        this.f9005c.delete();
    }

    public final OutputStream b() {
        if (this.f9004b.exists()) {
            if (!this.f9005c.exists()) {
                if (!this.f9004b.renameTo(this.f9005c)) {
                    Log.w(f9003a, "Couldn't rename file " + this.f9004b + " to backup file " + this.f9005c);
                }
            } else {
                this.f9004b.delete();
            }
        }
        try {
            return new a(this.f9004b);
        } catch (FileNotFoundException e10) {
            if (this.f9004b.getParentFile().mkdirs()) {
                try {
                    return new a(this.f9004b);
                } catch (FileNotFoundException e11) {
                    throw new IOException("Couldn't create " + this.f9004b, e11);
                }
            }
            throw new IOException("Couldn't create directory " + this.f9004b, e10);
        }
    }

    public final InputStream c() {
        if (this.f9005c.exists()) {
            this.f9004b.delete();
            this.f9005c.renameTo(this.f9004b);
        }
        return new FileInputStream(this.f9004b);
    }

    public final void a(OutputStream outputStream) {
        outputStream.close();
        this.f9005c.delete();
    }
}
