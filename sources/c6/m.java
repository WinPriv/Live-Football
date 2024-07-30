package c6;

import android.net.Uri;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DataSpec.java */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f3376k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f3377a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3378b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3379c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f3380d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, String> f3381e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3382g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3383h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3384i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f3385j;

    static {
        k4.g0.a("goog.exo.datasource");
    }

    public m(Uri uri) {
        this(uri, 0L, -1L);
    }

    public final m a(long j10) {
        long j11 = this.f3382g;
        long j12 = -1;
        if (j11 != -1) {
            j12 = j11 - j10;
        }
        long j13 = j12;
        if (j10 == 0 && j11 == j13) {
            return this;
        }
        return new m(this.f3377a, this.f3378b, this.f3379c, this.f3380d, this.f3381e, this.f + j10, j13, this.f3383h, this.f3384i, this.f3385j);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f3379c;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    str = VersionInfo.GIT_BRANCH;
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str = "POST";
            }
        } else {
            str = "GET";
        }
        sb2.append(str);
        sb2.append(" ");
        sb2.append(this.f3377a);
        sb2.append(", ");
        sb2.append(this.f);
        sb2.append(", ");
        sb2.append(this.f3382g);
        sb2.append(", ");
        sb2.append(this.f3383h);
        sb2.append(", ");
        return com.ironsource.adapters.facebook.a.i(sb2, this.f3384i, "]");
    }

    public m(Uri uri, long j10, long j11) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j10, j11, null, 0, null);
    }

    public m(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        boolean z10 = true;
        d6.a.a(j10 + j11 >= 0);
        d6.a.a(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        d6.a.a(z10);
        this.f3377a = uri;
        this.f3378b = j10;
        this.f3379c = i10;
        this.f3380d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f3381e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j11;
        this.f3382g = j12;
        this.f3383h = str;
        this.f3384i = i11;
        this.f3385j = obj;
    }
}
