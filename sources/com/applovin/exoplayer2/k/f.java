package com.applovin.exoplayer2.k;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.ApplicationMediaCapabilities;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f16080a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f16081b;

    /* renamed from: c, reason: collision with root package name */
    private AssetFileDescriptor f16082c;

    /* renamed from: d, reason: collision with root package name */
    private FileInputStream f16083d;

    /* renamed from: e, reason: collision with root package name */
    private long f16084e;
    private boolean f;

    /* loaded from: classes.dex */
    public static final class a {
        public static void a(Bundle bundle) {
            bundle.putParcelable("android.provider.extra.MEDIA_CAPABILITIES", new ApplicationMediaCapabilities.Builder().addSupportedVideoMimeType(com.anythink.expressad.exoplayer.k.o.f9075i).addSupportedHdrType("android.media.feature.hdr.dolby_vision").addSupportedHdrType("android.media.feature.hdr.hdr10").addSupportedHdrType("android.media.feature.hdr.hdr10_plus").addSupportedHdrType("android.media.feature.hdr.hlg").build());
        }
    }

    /* loaded from: classes.dex */
    public static class b extends j {
        public b(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public f(Context context) {
        super(false);
        this.f16080a = context.getContentResolver();
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws b {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri uri = lVar.f16095a;
            this.f16081b = uri;
            b(lVar);
            if ("content".equals(lVar.f16095a.getScheme())) {
                Bundle bundle = new Bundle();
                if (ai.f16274a >= 31) {
                    a.a(bundle);
                }
                openAssetFileDescriptor = this.f16080a.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.f16080a.openAssetFileDescriptor(uri, "r");
            }
            this.f16082c = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f16083d = fileInputStream;
                if (length != -1 && lVar.f16100g > length) {
                    throw new b(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(lVar.f16100g + startOffset) - startOffset;
                if (skip == lVar.f16100g) {
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f16084e = -1L;
                        } else {
                            long position = size - channel.position();
                            this.f16084e = position;
                            if (position < 0) {
                                throw new b(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        long j10 = length - skip;
                        this.f16084e = j10;
                        if (j10 < 0) {
                            throw new b(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    long j11 = lVar.f16101h;
                    if (j11 != -1) {
                        long j12 = this.f16084e;
                        if (j12 != -1) {
                            j11 = Math.min(j12, j11);
                        }
                        this.f16084e = j11;
                    }
                    this.f = true;
                    c(lVar);
                    long j13 = lVar.f16101h;
                    return j13 != -1 ? j13 : this.f16084e;
                }
                throw new b(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            throw new b(new IOException("Could not open file descriptor for: " + uri), 2000);
        } catch (b e10) {
            throw e10;
        } catch (IOException e11) {
            throw new b(e11, e11 instanceof FileNotFoundException ? IronSourceConstants.IS_INSTANCE_OPENED : 2000);
        }
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() throws b {
        this.f16081b = null;
        try {
            try {
                FileInputStream fileInputStream = this.f16083d;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f16083d = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f16082c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f16082c = null;
                        if (this.f) {
                            this.f = false;
                            d();
                        }
                    }
                } catch (IOException e10) {
                    throw new b(e10, 2000);
                }
            } catch (IOException e11) {
                throw new b(e11, 2000);
            }
        } catch (Throwable th) {
            this.f16083d = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f16082c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f16082c = null;
                    if (this.f) {
                        this.f = false;
                        d();
                    }
                    throw th;
                } catch (IOException e12) {
                    throw new b(e12, 2000);
                }
            } finally {
                this.f16082c = null;
                if (this.f) {
                    this.f = false;
                    d();
                }
            }
        }
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i10, int i11) throws b {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f16084e;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new b(e10, 2000);
            }
        }
        int read = ((FileInputStream) ai.a(this.f16083d)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f16084e;
        if (j11 != -1) {
            this.f16084e = j11 - read;
        }
        a(read);
        return read;
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        return this.f16081b;
    }
}
