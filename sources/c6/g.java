package c6;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: ContentDataSource.java */
/* loaded from: classes2.dex */
public final class g extends f {

    /* renamed from: e, reason: collision with root package name */
    public final ContentResolver f3349e;
    public Uri f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f3350g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f3351h;

    /* renamed from: i, reason: collision with root package name */
    public long f3352i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3353j;

    /* compiled from: ContentDataSource.java */
    /* loaded from: classes2.dex */
    public static class a extends k {
        public a(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public g(Context context) {
        super(false);
        this.f3349e = context.getContentResolver();
    }

    @Override // c6.j
    public final void close() throws a {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f3351h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f3351h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f3350g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f3350g = null;
                        if (this.f3353j) {
                            this.f3353j = false;
                            l();
                        }
                    }
                } catch (IOException e10) {
                    throw new a(e10, 2000);
                }
            } catch (IOException e11) {
                throw new a(e11, 2000);
            }
        } catch (Throwable th) {
            this.f3351h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f3350g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f3350g = null;
                    if (this.f3353j) {
                        this.f3353j = false;
                        l();
                    }
                    throw th;
                } catch (IOException e12) {
                    throw new a(e12, 2000);
                }
            } finally {
                this.f3350g = null;
                if (this.f3353j) {
                    this.f3353j = false;
                    l();
                }
            }
        }
    }

    @Override // c6.j
    public final long f(m mVar) throws a {
        AssetFileDescriptor openAssetFileDescriptor;
        long min;
        int i10 = 2000;
        try {
            Uri uri = mVar.f3377a;
            this.f = uri;
            m(mVar);
            boolean equals = "content".equals(mVar.f3377a.getScheme());
            ContentResolver contentResolver = this.f3349e;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            }
            this.f3350g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f3351h = fileInputStream;
                long j10 = mVar.f;
                if (length != -1 && j10 > length) {
                    throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j10) - startOffset;
                if (skip == j10) {
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f3352i = -1L;
                        } else {
                            long position = size - channel.position();
                            this.f3352i = position;
                            if (position < 0) {
                                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        long j11 = length - skip;
                        this.f3352i = j11;
                        if (j11 < 0) {
                            throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    long j12 = mVar.f3382g;
                    if (j12 != -1) {
                        long j13 = this.f3352i;
                        if (j13 == -1) {
                            min = j12;
                        } else {
                            min = Math.min(j13, j12);
                        }
                        this.f3352i = min;
                    }
                    this.f3353j = true;
                    n(mVar);
                    if (j12 == -1) {
                        return this.f3352i;
                    }
                    return j12;
                }
                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            throw new a(new IOException("Could not open file descriptor for: " + uri), 2000);
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i10 = IronSourceConstants.IS_INSTANCE_OPENED;
            }
            throw new a(e11, i10);
        }
    }

    @Override // c6.j
    public final Uri getUri() {
        return this.f;
    }

    @Override // c6.h
    public final int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f3352i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.f3351h;
        int i12 = d6.g0.f27302a;
        int read = fileInputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f3352i;
        if (j11 != -1) {
            this.f3352i = j11 - read;
        }
        k(read);
        return read;
    }
}
