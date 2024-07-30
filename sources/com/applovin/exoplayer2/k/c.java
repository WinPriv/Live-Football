package com.applovin.exoplayer2.k;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f16067a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f16068b;

    /* renamed from: c, reason: collision with root package name */
    private InputStream f16069c;

    /* renamed from: d, reason: collision with root package name */
    private long f16070d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16071e;

    /* loaded from: classes.dex */
    public static final class a extends j {
        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public c(Context context) {
        super(false);
        this.f16067a = context.getAssets();
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws a {
        try {
            Uri uri = lVar.f16095a;
            this.f16068b = uri;
            String str = (String) com.applovin.exoplayer2.l.a.b(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            b(lVar);
            InputStream open = this.f16067a.open(str, 1);
            this.f16069c = open;
            if (open.skip(lVar.f16100g) >= lVar.f16100g) {
                long j10 = lVar.f16101h;
                if (j10 != -1) {
                    this.f16070d = j10;
                } else {
                    long available = this.f16069c.available();
                    this.f16070d = available;
                    if (available == 2147483647L) {
                        this.f16070d = -1L;
                    }
                }
                this.f16071e = true;
                c(lVar);
                return this.f16070d;
            }
            throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? IronSourceConstants.IS_INSTANCE_OPENED : 2000);
        }
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() throws a {
        this.f16068b = null;
        try {
            try {
                InputStream inputStream = this.f16069c;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        } finally {
            this.f16069c = null;
            if (this.f16071e) {
                this.f16071e = false;
                d();
            }
        }
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f16070d;
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
        int read = ((InputStream) ai.a(this.f16069c)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f16070d;
        if (j11 != -1) {
            this.f16070d = j11 - read;
        }
        a(read);
        return read;
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        return this.f16068b;
    }
}
