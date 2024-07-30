package c6;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: FileDataSource.java */
/* loaded from: classes2.dex */
public final class u extends f {

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f3444e;
    public Uri f;

    /* renamed from: g, reason: collision with root package name */
    public long f3445g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3446h;

    /* compiled from: FileDataSource.java */
    /* loaded from: classes2.dex */
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th) {
            if ((th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: FileDataSource.java */
    /* loaded from: classes2.dex */
    public static class b extends k {
        public b(Exception exc, int i10) {
            super(exc, i10);
        }

        public b(String str, FileNotFoundException fileNotFoundException, int i10) {
            super(str, fileNotFoundException, i10);
        }
    }

    public u() {
        super(false);
    }

    @Override // c6.j
    public final void close() throws b {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f3444e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new b(e10, 2000);
            }
        } finally {
            this.f3444e = null;
            if (this.f3446h) {
                this.f3446h = false;
                l();
            }
        }
    }

    @Override // c6.j
    public final long f(m mVar) throws b {
        Uri uri = mVar.f3377a;
        long j10 = mVar.f;
        this.f = uri;
        m(mVar);
        int i10 = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f3444e = randomAccessFile;
            try {
                randomAccessFile.seek(j10);
                long j11 = mVar.f3382g;
                if (j11 == -1) {
                    j11 = this.f3444e.length() - j10;
                }
                this.f3445g = j11;
                if (j11 >= 0) {
                    this.f3446h = true;
                    n(mVar);
                    return this.f3445g;
                }
                throw new b(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            } catch (IOException e10) {
                throw new b(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (d6.g0.f27302a < 21 || !a.b(e11.getCause())) {
                    i10 = IronSourceConstants.IS_INSTANCE_OPENED;
                }
                throw new b(e11, i10);
            }
            throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e11, 1004);
        } catch (SecurityException e12) {
            throw new b(e12, 2006);
        } catch (RuntimeException e13) {
            throw new b(e13, 2000);
        }
    }

    @Override // c6.j
    public final Uri getUri() {
        return this.f;
    }

    @Override // c6.h
    public final int read(byte[] bArr, int i10, int i11) throws b {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f3445g;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f3444e;
            int i12 = d6.g0.f27302a;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (read > 0) {
                this.f3445g -= read;
                k(read);
            }
            return read;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }
}
