package c6;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.URLDecoder;
import k4.z0;

/* compiled from: DataSchemeDataSource.java */
/* loaded from: classes2.dex */
public final class i extends f {

    /* renamed from: e, reason: collision with root package name */
    public m f3358e;
    public byte[] f;

    /* renamed from: g, reason: collision with root package name */
    public int f3359g;

    /* renamed from: h, reason: collision with root package name */
    public int f3360h;

    public i() {
        super(false);
    }

    @Override // c6.j
    public final void close() {
        if (this.f != null) {
            this.f = null;
            l();
        }
        this.f3358e = null;
    }

    @Override // c6.j
    public final long f(m mVar) throws IOException {
        m(mVar);
        this.f3358e = mVar;
        Uri uri = mVar.f3377a;
        String scheme = uri.getScheme();
        d6.a.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i10 = d6.g0.f27302a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    throw new z0(s.f.b("Error while parsing Base64 encoded string: ", str), e10, true, 0);
                }
            } else {
                this.f = d6.g0.C(URLDecoder.decode(str, i7.c.f29200a.name()));
            }
            byte[] bArr = this.f;
            long length = bArr.length;
            long j10 = mVar.f;
            if (j10 <= length) {
                int i11 = (int) j10;
                this.f3359g = i11;
                int length2 = bArr.length - i11;
                this.f3360h = length2;
                long j11 = mVar.f3382g;
                if (j11 != -1) {
                    this.f3360h = (int) Math.min(length2, j11);
                }
                n(mVar);
                if (j11 == -1) {
                    return this.f3360h;
                }
                return j11;
            }
            this.f = null;
            throw new k(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        throw new z0("Unexpected URI format: " + uri, null, true, 0);
    }

    @Override // c6.j
    public final Uri getUri() {
        m mVar = this.f3358e;
        if (mVar != null) {
            return mVar.f3377a;
        }
        return null;
    }

    @Override // c6.h
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f3360h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        byte[] bArr2 = this.f;
        int i13 = d6.g0.f27302a;
        System.arraycopy(bArr2, this.f3359g, bArr, i10, min);
        this.f3359g += min;
        this.f3360h -= min;
        k(min);
        return min;
    }
}
