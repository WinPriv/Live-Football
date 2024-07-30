package c6;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: AssetDataSource.java */
/* loaded from: classes2.dex */
public final class c extends f {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f3311e;
    public Uri f;

    /* renamed from: g, reason: collision with root package name */
    public InputStream f3312g;

    /* renamed from: h, reason: collision with root package name */
    public long f3313h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3314i;

    /* compiled from: AssetDataSource.java */
    /* loaded from: classes2.dex */
    public static final class a extends k {
        public a(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public c(Context context) {
        super(false);
        this.f3311e = context.getAssets();
    }

    @Override // c6.j
    public final void close() throws a {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.f3312g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        } finally {
            this.f3312g = null;
            if (this.f3314i) {
                this.f3314i = false;
                l();
            }
        }
    }

    @Override // c6.j
    public final long f(m mVar) throws a {
        int i10;
        try {
            Uri uri = mVar.f3377a;
            long j10 = mVar.f;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m(mVar);
            InputStream open = this.f3311e.open(path, 1);
            this.f3312g = open;
            if (open.skip(j10) >= j10) {
                long j11 = mVar.f3382g;
                if (j11 != -1) {
                    this.f3313h = j11;
                } else {
                    long available = this.f3312g.available();
                    this.f3313h = available;
                    if (available == 2147483647L) {
                        this.f3313h = -1L;
                    }
                }
                this.f3314i = true;
                n(mVar);
                return this.f3313h;
            }
            throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i10 = IronSourceConstants.IS_INSTANCE_OPENED;
            } else {
                i10 = 2000;
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
        long j10 = this.f3313h;
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
        InputStream inputStream = this.f3312g;
        int i12 = d6.g0.f27302a;
        int read = inputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f3313h;
        if (j11 != -1) {
            this.f3313h = j11 - read;
        }
        k(read);
        return read;
    }
}
