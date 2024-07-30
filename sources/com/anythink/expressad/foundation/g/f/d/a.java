package com.anythink.expressad.foundation.g.f.d;

import android.text.TextUtils;
import com.anythink.expressad.foundation.g.f.i;
import com.anythink.expressad.foundation.g.f.k;
import com.anythink.expressad.foundation.h.o;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public class a extends i<Void> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f9942c = "a";

    /* renamed from: d, reason: collision with root package name */
    private File f9943d;

    /* renamed from: e, reason: collision with root package name */
    private File f9944e;

    public a(File file, String str) {
        super(str);
        this.f9943d = file;
        this.f9944e = new File(file + ".tmp");
    }

    @Override // com.anythink.expressad.foundation.g.f.i
    public final k<Void> a(com.anythink.expressad.foundation.g.f.f.c cVar) {
        if (!f()) {
            if (this.f9944e.canRead() && this.f9944e.length() > 0) {
                if (this.f9944e.renameTo(this.f9943d)) {
                    return k.a(null, cVar);
                }
                return k.a(new com.anythink.expressad.foundation.g.f.a.a(4, cVar));
            }
            return k.a(new com.anythink.expressad.foundation.g.f.a.a(4, cVar));
        }
        return k.a(new com.anythink.expressad.foundation.g.f.a.a(-2, cVar));
    }

    @Override // com.anythink.expressad.foundation.g.f.i
    public final int j() {
        return 1;
    }

    @Override // com.anythink.expressad.foundation.g.f.i
    public final byte[] a(com.anythink.expressad.foundation.g.f.f.b bVar, com.anythink.expressad.foundation.g.f.c cVar) {
        InputStream gZIPInputStream;
        String a10 = com.anythink.expressad.foundation.g.f.g.e.a(bVar.b(), "Content-Length");
        long j10 = 0;
        long longValue = !TextUtils.isEmpty(a10) ? Long.valueOf(a10).longValue() : 0L;
        if (longValue <= 0) {
            o.b(f9942c, "Response doesn't present Content-Length!");
        }
        InputStream inputStream = null;
        if (longValue > 0 && this.f9943d.length() == longValue) {
            this.f9943d.renameTo(this.f9944e);
            cVar.a(this, longValue, longValue);
            return null;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.f9944e.getAbsolutePath(), "rw");
        randomAccessFile.setLength(0L);
        try {
            InputStream c10 = bVar.c();
            try {
                gZIPInputStream = (!com.anythink.expressad.foundation.g.f.g.e.b(bVar.b()) || (c10 instanceof GZIPInputStream)) ? c10 : new GZIPInputStream(c10);
            } catch (Throwable th) {
                th = th;
                inputStream = c10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr = new byte[6144];
            try {
                do {
                    int read = gZIPInputStream.read(bArr);
                    if (read != -1) {
                        randomAccessFile.write(bArr, 0, read);
                        j10 += read;
                        cVar.a(this, longValue, j10);
                    }
                    break;
                } while (!f());
                break;
                gZIPInputStream.close();
            } catch (Exception e10) {
                o.d(f9942c, e10.getMessage());
            }
            cVar.b(this);
            randomAccessFile.close();
            return null;
        } catch (Throwable th3) {
            inputStream = gZIPInputStream;
            th = th3;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e11) {
                    o.d(f9942c, e11.getMessage());
                }
            }
            randomAccessFile.close();
            throw th;
        }
    }
}
