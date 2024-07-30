package com.anythink.expressad.exoplayer.j;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f8796a;

    /* renamed from: b, reason: collision with root package name */
    private final aa<? super e> f8797b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f8798c;

    /* renamed from: d, reason: collision with root package name */
    private AssetFileDescriptor f8799d;

    /* renamed from: e, reason: collision with root package name */
    private FileInputStream f8800e;
    private long f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8801g;

    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    private e(Context context) {
        this(context, null);
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final long a(k kVar) {
        try {
            Uri uri = kVar.f8815c;
            this.f8798c = uri;
            AssetFileDescriptor openAssetFileDescriptor = this.f8796a.openAssetFileDescriptor(uri, "r");
            this.f8799d = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                this.f8800e = new FileInputStream(this.f8799d.getFileDescriptor());
                long startOffset = this.f8799d.getStartOffset();
                long skip = this.f8800e.skip(kVar.f + startOffset) - startOffset;
                if (skip == kVar.f) {
                    long j10 = kVar.f8818g;
                    long j11 = -1;
                    if (j10 != -1) {
                        this.f = j10;
                    } else {
                        long length = this.f8799d.getLength();
                        if (length == -1) {
                            FileChannel channel = this.f8800e.getChannel();
                            long size = channel.size();
                            if (size != 0) {
                                j11 = size - channel.position();
                            }
                            this.f = j11;
                        } else {
                            this.f = length - skip;
                        }
                    }
                    this.f8801g = true;
                    aa<? super e> aaVar = this.f8797b;
                    if (aaVar != null) {
                        aaVar.b();
                    }
                    return this.f;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException("Could not open file descriptor for: " + this.f8798c);
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final void b() {
        this.f8798c = null;
        try {
            try {
                FileInputStream fileInputStream = this.f8800e;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f8800e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f8799d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(e10);
                    }
                } finally {
                    this.f8799d = null;
                    if (this.f8801g) {
                        this.f8801g = false;
                        aa<? super e> aaVar = this.f8797b;
                        if (aaVar != null) {
                            aaVar.c();
                        }
                    }
                }
            } catch (IOException e11) {
                throw new a(e11);
            }
        } catch (Throwable th) {
            this.f8800e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f8799d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f8799d = null;
                    if (this.f8801g) {
                        this.f8801g = false;
                        aa<? super e> aaVar2 = this.f8797b;
                        if (aaVar2 != null) {
                            aaVar2.c();
                        }
                    }
                    throw th;
                } catch (IOException e12) {
                    throw new a(e12);
                }
            } finally {
                this.f8799d = null;
                if (this.f8801g) {
                    this.f8801g = false;
                    aa<? super e> aaVar3 = this.f8797b;
                    if (aaVar3 != null) {
                        aaVar3.c();
                    }
                }
            }
        }
    }

    public e(Context context, aa<? super e> aaVar) {
        this.f8796a = context.getContentResolver();
        this.f8797b = aaVar;
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f;
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
        int read = this.f8800e.read(bArr, i10, i11);
        if (read == -1) {
            if (this.f == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j11 = this.f;
        if (j11 != -1) {
            this.f = j11 - read;
        }
        aa<? super e> aaVar = this.f8797b;
        if (aaVar != null) {
            aaVar.a(read);
        }
        return read;
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final Uri a() {
        return this.f8798c;
    }
}
