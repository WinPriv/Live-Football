package com.anythink.expressad.exoplayer.j;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class r implements h {

    /* renamed from: a, reason: collision with root package name */
    private final aa<? super r> f8893a;

    /* renamed from: b, reason: collision with root package name */
    private RandomAccessFile f8894b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f8895c;

    /* renamed from: d, reason: collision with root package name */
    private long f8896d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8897e;

    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public r() {
        this(null);
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final long a(k kVar) {
        try {
            this.f8895c = kVar.f8815c;
            RandomAccessFile randomAccessFile = new RandomAccessFile(kVar.f8815c.getPath(), "r");
            this.f8894b = randomAccessFile;
            randomAccessFile.seek(kVar.f);
            long j10 = kVar.f8818g;
            if (j10 == -1) {
                j10 = this.f8894b.length() - kVar.f;
            }
            this.f8896d = j10;
            if (j10 >= 0) {
                this.f8897e = true;
                aa<? super r> aaVar = this.f8893a;
                if (aaVar != null) {
                    aaVar.b();
                }
                return this.f8896d;
            }
            throw new EOFException();
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final void b() {
        this.f8895c = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f8894b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new a(e10);
            }
        } finally {
            this.f8894b = null;
            if (this.f8897e) {
                this.f8897e = false;
                aa<? super r> aaVar = this.f8893a;
                if (aaVar != null) {
                    aaVar.c();
                }
            }
        }
    }

    public r(aa<? super r> aaVar) {
        this.f8893a = aaVar;
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f8896d;
        if (j10 == 0) {
            return -1;
        }
        try {
            int read = this.f8894b.read(bArr, i10, (int) Math.min(j10, i11));
            if (read > 0) {
                this.f8896d -= read;
                aa<? super r> aaVar = this.f8893a;
                if (aaVar != null) {
                    aaVar.a(read);
                }
            }
            return read;
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final Uri a() {
        return this.f8895c;
    }
}
