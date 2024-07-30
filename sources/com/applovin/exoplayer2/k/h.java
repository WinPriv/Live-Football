package com.applovin.exoplayer2.k;

import android.net.Uri;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class h extends e {

    /* renamed from: a, reason: collision with root package name */
    private l f16085a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f16086b;

    /* renamed from: c, reason: collision with root package name */
    private int f16087c;

    /* renamed from: d, reason: collision with root package name */
    private int f16088d;

    public h() {
        super(false);
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws IOException {
        b(lVar);
        this.f16085a = lVar;
        Uri uri = lVar.f16095a;
        String scheme = uri.getScheme();
        com.applovin.exoplayer2.l.a.a("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] a10 = ai.a(uri.getSchemeSpecificPart(), ",");
        if (a10.length == 2) {
            String str = a10[1];
            if (a10[0].contains(";base64")) {
                try {
                    this.f16086b = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    throw com.applovin.exoplayer2.ai.a("Error while parsing Base64 encoded string: " + str, e10);
                }
            } else {
                this.f16086b = ai.c(URLDecoder.decode(str, Charsets.US_ASCII.name()));
            }
            long j10 = lVar.f16100g;
            byte[] bArr = this.f16086b;
            if (j10 <= bArr.length) {
                int i10 = (int) j10;
                this.f16087c = i10;
                int length = bArr.length - i10;
                this.f16088d = length;
                long j11 = lVar.f16101h;
                if (j11 != -1) {
                    this.f16088d = (int) Math.min(length, j11);
                }
                c(lVar);
                long j12 = lVar.f16101h;
                return j12 != -1 ? j12 : this.f16088d;
            }
            this.f16086b = null;
            throw new j(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        throw com.applovin.exoplayer2.ai.a("Unexpected URI format: " + uri, null);
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() {
        if (this.f16086b != null) {
            this.f16086b = null;
            d();
        }
        this.f16085a = null;
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f16088d;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(ai.a(this.f16086b), this.f16087c, bArr, i10, min);
        this.f16087c += min;
        this.f16088d -= min;
        a(min);
        return min;
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        l lVar = this.f16085a;
        if (lVar != null) {
            return lVar.f16095a;
        }
        return null;
    }
}
