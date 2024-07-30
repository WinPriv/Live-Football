package e3;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;

/* compiled from: GlideUrl.java */
/* loaded from: classes.dex */
public final class f implements y2.e {

    /* renamed from: b, reason: collision with root package name */
    public final g f27681b;

    /* renamed from: c, reason: collision with root package name */
    public final URL f27682c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27683d;

    /* renamed from: e, reason: collision with root package name */
    public String f27684e;
    public URL f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f27685g;

    /* renamed from: h, reason: collision with root package name */
    public int f27686h;

    public f(URL url) {
        i iVar = g.f27687a;
        androidx.activity.n.n0(url);
        this.f27682c = url;
        this.f27683d = null;
        androidx.activity.n.n0(iVar);
        this.f27681b = iVar;
    }

    @Override // y2.e
    public final void a(MessageDigest messageDigest) {
        if (this.f27685g == null) {
            this.f27685g = c().getBytes(y2.e.f36561a);
        }
        messageDigest.update(this.f27685g);
    }

    public final String c() {
        String str = this.f27683d;
        if (str == null) {
            URL url = this.f27682c;
            androidx.activity.n.n0(url);
            return url.toString();
        }
        return str;
    }

    public final URL d() throws MalformedURLException {
        if (this.f == null) {
            if (TextUtils.isEmpty(this.f27684e)) {
                String str = this.f27683d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f27682c;
                    androidx.activity.n.n0(url);
                    str = url.toString();
                }
                this.f27684e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f = new URL(this.f27684e);
        }
        return this.f;
    }

    @Override // y2.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!c().equals(fVar.c()) || !this.f27681b.equals(fVar.f27681b)) {
            return false;
        }
        return true;
    }

    @Override // y2.e
    public final int hashCode() {
        if (this.f27686h == 0) {
            int hashCode = c().hashCode();
            this.f27686h = hashCode;
            this.f27686h = this.f27681b.hashCode() + (hashCode * 31);
        }
        return this.f27686h;
    }

    public final String toString() {
        return c();
    }

    public f(String str) {
        i iVar = g.f27687a;
        this.f27682c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f27683d = str;
            androidx.activity.n.n0(iVar);
            this.f27681b = iVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
