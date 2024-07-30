package com.anythink.expressad.exoplayer.j;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f8791a;

    /* renamed from: b, reason: collision with root package name */
    private final aa<? super c> f8792b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f8793c;

    /* renamed from: d, reason: collision with root package name */
    private InputStream f8794d;

    /* renamed from: e, reason: collision with root package name */
    private long f8795e;
    private boolean f;

    /* loaded from: classes.dex */
    public static final class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    private c(Context context) {
        this(context, null);
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final long a(k kVar) {
        try {
            Uri uri = kVar.f8815c;
            this.f8793c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream open = this.f8791a.open(path, 1);
            this.f8794d = open;
            if (open.skip(kVar.f) >= kVar.f) {
                long j10 = kVar.f8818g;
                if (j10 != -1) {
                    this.f8795e = j10;
                } else {
                    long available = this.f8794d.available();
                    this.f8795e = available;
                    if (available == 2147483647L) {
                        this.f8795e = -1L;
                    }
                }
                this.f = true;
                aa<? super c> aaVar = this.f8792b;
                if (aaVar != null) {
                    aaVar.b();
                }
                return this.f8795e;
            }
            throw new EOFException();
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final void b() {
        this.f8793c = null;
        try {
            try {
                InputStream inputStream = this.f8794d;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new a(e10);
            }
        } finally {
            this.f8794d = null;
            if (this.f) {
                this.f = false;
                aa<? super c> aaVar = this.f8792b;
                if (aaVar != null) {
                    aaVar.c();
                }
            }
        }
    }

    public c(Context context, aa<? super c> aaVar) {
        this.f8791a = context.getAssets();
        this.f8792b = aaVar;
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f8795e;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(e10);
            }
        }
        int read = this.f8794d.read(bArr, i10, i11);
        if (read == -1) {
            if (this.f8795e == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j11 = this.f8795e;
        if (j11 != -1) {
            this.f8795e = j11 - read;
        }
        aa<? super c> aaVar = this.f8792b;
        if (aaVar != null) {
            aaVar.a(read);
        }
        return read;
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final Uri a() {
        return this.f8793c;
    }
}
