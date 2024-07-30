package com.anythink.expressad.exoplayer.j;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class y implements h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8940a = "rawresource";

    /* renamed from: b, reason: collision with root package name */
    private final Resources f8941b;

    /* renamed from: c, reason: collision with root package name */
    private final aa<? super y> f8942c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f8943d;

    /* renamed from: e, reason: collision with root package name */
    private AssetFileDescriptor f8944e;
    private InputStream f;

    /* renamed from: g, reason: collision with root package name */
    private long f8945g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8946h;

    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(IOException iOException) {
            super(iOException);
        }
    }

    private y(Context context) {
        this(context, null);
    }

    private static Uri a(int i10) {
        return Uri.parse("rawresource:///".concat(String.valueOf(i10)));
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final void b() {
        this.f8943d = null;
        try {
            try {
                InputStream inputStream = this.f;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f8944e;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(e10);
                    }
                } finally {
                    this.f8944e = null;
                    if (this.f8946h) {
                        this.f8946h = false;
                        aa<? super y> aaVar = this.f8942c;
                        if (aaVar != null) {
                            aaVar.c();
                        }
                    }
                }
            } catch (IOException e11) {
                throw new a(e11);
            }
        } catch (Throwable th) {
            this.f = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f8944e;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f8944e = null;
                    if (this.f8946h) {
                        this.f8946h = false;
                        aa<? super y> aaVar2 = this.f8942c;
                        if (aaVar2 != null) {
                            aaVar2.c();
                        }
                    }
                    throw th;
                } catch (IOException e12) {
                    throw new a(e12);
                }
            } finally {
                this.f8944e = null;
                if (this.f8946h) {
                    this.f8946h = false;
                    aa<? super y> aaVar3 = this.f8942c;
                    if (aaVar3 != null) {
                        aaVar3.c();
                    }
                }
            }
        }
    }

    public y(Context context, aa<? super y> aaVar) {
        this.f8941b = context.getResources();
        this.f8942c = aaVar;
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final long a(k kVar) {
        try {
            Uri uri = kVar.f8815c;
            this.f8943d = uri;
            if (TextUtils.equals(f8940a, uri.getScheme())) {
                try {
                    this.f8944e = this.f8941b.openRawResourceFd(Integer.parseInt(this.f8943d.getLastPathSegment()));
                    FileInputStream fileInputStream = new FileInputStream(this.f8944e.getFileDescriptor());
                    this.f = fileInputStream;
                    fileInputStream.skip(this.f8944e.getStartOffset());
                    if (this.f.skip(kVar.f) >= kVar.f) {
                        long j10 = kVar.f8818g;
                        long j11 = -1;
                        if (j10 != -1) {
                            this.f8945g = j10;
                        } else {
                            long length = this.f8944e.getLength();
                            if (length != -1) {
                                j11 = length - kVar.f;
                            }
                            this.f8945g = j11;
                        }
                        this.f8946h = true;
                        aa<? super y> aaVar = this.f8942c;
                        if (aaVar != null) {
                            aaVar.b();
                        }
                        return this.f8945g;
                    }
                    throw new EOFException();
                } catch (NumberFormatException unused) {
                    throw new a("Resource identifier must be an integer.");
                }
            }
            throw new a("URI must use scheme rawresource");
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f8945g;
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
        int read = this.f.read(bArr, i10, i11);
        if (read == -1) {
            if (this.f8945g == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j11 = this.f8945g;
        if (j11 != -1) {
            this.f8945g = j11 - read;
        }
        aa<? super y> aaVar = this.f8942c;
        if (aaVar != null) {
            aaVar.a(read);
        }
        return read;
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final Uri a() {
        return this.f8943d;
    }
}
