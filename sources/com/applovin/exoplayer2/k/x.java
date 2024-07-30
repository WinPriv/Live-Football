package com.applovin.exoplayer2.k;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class x extends e {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f16221a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16222b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f16223c;

    /* renamed from: d, reason: collision with root package name */
    private AssetFileDescriptor f16224d;

    /* renamed from: e, reason: collision with root package name */
    private InputStream f16225e;
    private long f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16226g;

    /* loaded from: classes.dex */
    public static class a extends j {
        public a(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    public x(Context context) {
        super(false);
        this.f16221a = context.getResources();
        this.f16222b = context.getPackageName();
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws a {
        int parseInt;
        Uri uri = lVar.f16095a;
        this.f16223c = uri;
        if (!TextUtils.equals(com.anythink.expressad.exoplayer.j.y.f8940a, uri.getScheme()) && (!TextUtils.equals("android.resource", uri.getScheme()) || uri.getPathSegments().size() != 1 || !((String) com.applovin.exoplayer2.l.a.b(uri.getLastPathSegment())).matches("\\d+"))) {
            if (TextUtils.equals("android.resource", uri.getScheme())) {
                String str = (String) com.applovin.exoplayer2.l.a.b(uri.getPath());
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                String host = uri.getHost();
                parseInt = this.f16221a.getIdentifier(a3.l.p(new StringBuilder(), TextUtils.isEmpty(host) ? "" : com.ironsource.adapters.facebook.a.h(host, com.huawei.openalliance.ad.constant.w.bE), str), "raw", this.f16222b);
                if (parseInt == 0) {
                    throw new a("Resource not found.", null, IronSourceConstants.IS_INSTANCE_OPENED);
                }
            } else {
                throw new a("URI must either use scheme rawresource or android.resource", null, 1004);
            }
        } else {
            try {
                parseInt = Integer.parseInt((String) com.applovin.exoplayer2.l.a.b(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", null, 1004);
            }
        }
        b(lVar);
        try {
            AssetFileDescriptor openRawResourceFd = this.f16221a.openRawResourceFd(parseInt);
            this.f16224d = openRawResourceFd;
            if (openRawResourceFd != null) {
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                this.f16225e = fileInputStream;
                if (length != -1) {
                    try {
                        if (lVar.f16100g > length) {
                            throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    } catch (a e10) {
                        throw e10;
                    } catch (IOException e11) {
                        throw new a(null, e11, 2000);
                    }
                }
                long startOffset = openRawResourceFd.getStartOffset();
                long skip = fileInputStream.skip(lVar.f16100g + startOffset) - startOffset;
                if (skip == lVar.f16100g) {
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.f = -1L;
                        } else {
                            long size = channel.size() - channel.position();
                            this.f = size;
                            if (size < 0) {
                                throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        long j10 = length - skip;
                        this.f = j10;
                        if (j10 < 0) {
                            throw new j(AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    long j11 = lVar.f16101h;
                    if (j11 != -1) {
                        long j12 = this.f;
                        if (j12 != -1) {
                            j11 = Math.min(j12, j11);
                        }
                        this.f = j11;
                    }
                    this.f16226g = true;
                    c(lVar);
                    long j13 = lVar.f16101h;
                    return j13 != -1 ? j13 : this.f;
                }
                throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            throw new a("Resource is compressed: " + uri, null, 2000);
        } catch (Resources.NotFoundException e12) {
            throw new a(null, e12, IronSourceConstants.IS_INSTANCE_OPENED);
        }
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() throws a {
        this.f16223c = null;
        try {
            try {
                InputStream inputStream = this.f16225e;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f16225e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f16224d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f16224d = null;
                        if (this.f16226g) {
                            this.f16226g = false;
                            d();
                        }
                    }
                } catch (IOException e10) {
                    throw new a(null, e10, 2000);
                }
            } catch (IOException e11) {
                throw new a(null, e11, 2000);
            }
        } catch (Throwable th) {
            this.f16225e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f16224d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f16224d = null;
                    if (this.f16226g) {
                        this.f16226g = false;
                        d();
                    }
                    throw th;
                } catch (IOException e12) {
                    throw new a(null, e12, 2000);
                }
            } finally {
                this.f16224d = null;
                if (this.f16226g) {
                    this.f16226g = false;
                    d();
                }
            }
        }
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i10, int i11) throws a {
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
                throw new a(null, e10, 2000);
            }
        }
        int read = ((InputStream) ai.a(this.f16225e)).read(bArr, i10, i11);
        if (read == -1) {
            if (this.f == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f;
        if (j11 != -1) {
            this.f = j11 - read;
        }
        a(read);
        return read;
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        return this.f16223c;
    }
}
