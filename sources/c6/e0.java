package c6;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: RawResourceDataSource.java */
/* loaded from: classes2.dex */
public final class e0 extends f {

    /* renamed from: e, reason: collision with root package name */
    public final Resources f3328e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public Uri f3329g;

    /* renamed from: h, reason: collision with root package name */
    public AssetFileDescriptor f3330h;

    /* renamed from: i, reason: collision with root package name */
    public FileInputStream f3331i;

    /* renamed from: j, reason: collision with root package name */
    public long f3332j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3333k;

    /* compiled from: RawResourceDataSource.java */
    /* loaded from: classes2.dex */
    public static class a extends k {
        public a(String str, Exception exc, int i10) {
            super(str, exc, i10);
        }
    }

    public e0(Context context) {
        super(false);
        this.f3328e = context.getResources();
        this.f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // c6.j
    public final void close() throws a {
        this.f3329g = null;
        try {
            try {
                FileInputStream fileInputStream = this.f3331i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f3331i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f3330h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(null, e10, 2000);
                    }
                } finally {
                    this.f3330h = null;
                    if (this.f3333k) {
                        this.f3333k = false;
                        l();
                    }
                }
            } catch (IOException e11) {
                throw new a(null, e11, 2000);
            }
        } catch (Throwable th) {
            this.f3331i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f3330h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f3330h = null;
                    if (this.f3333k) {
                        this.f3333k = false;
                        l();
                    }
                    throw th;
                } catch (IOException e12) {
                    throw new a(null, e12, 2000);
                }
            } finally {
                this.f3330h = null;
                if (this.f3333k) {
                    this.f3333k = false;
                    l();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (r3.matches("\\d+") != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0149  */
    @Override // c6.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f(c6.m r17) throws c6.e0.a {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.e0.f(c6.m):long");
    }

    @Override // c6.j
    public final Uri getUri() {
        return this.f3329g;
    }

    @Override // c6.h
    public final int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f3332j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(null, e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.f3331i;
        int i12 = d6.g0.f27302a;
        int read = fileInputStream.read(bArr, i10, i11);
        if (read == -1) {
            if (this.f3332j == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f3332j;
        if (j11 != -1) {
            this.f3332j = j11 - read;
        }
        k(read);
        return read;
    }
}
