package com.applovin.exoplayer2.k;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class s extends e {

    /* renamed from: a, reason: collision with root package name */
    private RandomAccessFile f16184a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f16185b;

    /* renamed from: c, reason: collision with root package name */
    private long f16186c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16187d;

    /* loaded from: classes.dex */
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th) {
            if ((th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends j {
        public b(Throwable th, int i10) {
            super(th, i10);
        }

        public b(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    public s() {
        super(false);
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws b {
        Uri uri = lVar.f16095a;
        this.f16185b = uri;
        b(lVar);
        RandomAccessFile a10 = a(uri);
        this.f16184a = a10;
        try {
            a10.seek(lVar.f16100g);
            long j10 = lVar.f16101h;
            if (j10 == -1) {
                j10 = this.f16184a.length() - lVar.f16100g;
            }
            this.f16186c = j10;
            if (j10 >= 0) {
                this.f16187d = true;
                c(lVar);
                return this.f16186c;
            }
            throw new b(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() throws b {
        this.f16185b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f16184a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new b(e10, 2000);
            }
        } finally {
            this.f16184a = null;
            if (this.f16187d) {
                this.f16187d = false;
                d();
            }
        }
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i10, int i11) throws b {
        if (i11 == 0) {
            return 0;
        }
        if (this.f16186c == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) ai.a(this.f16184a)).read(bArr, i10, (int) Math.min(this.f16186c, i11));
            if (read > 0) {
                this.f16186c -= read;
                a(read);
            }
            return read;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        return this.f16185b;
    }

    private static RandomAccessFile a(Uri uri) throws b {
        try {
            return new RandomAccessFile((String) com.applovin.exoplayer2.l.a.b(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b(e10, (ai.f16274a < 21 || !a.b(e10.getCause())) ? IronSourceConstants.IS_INSTANCE_OPENED : 2006);
            }
            throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
        } catch (SecurityException e11) {
            throw new b(e11, 2006);
        } catch (RuntimeException e12) {
            throw new b(e12, 2000);
        }
    }
}
