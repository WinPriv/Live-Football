package s3;

import androidx.activity.n;
import java.security.MessageDigest;
import y2.e;

/* compiled from: ObjectKey.java */
/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: b, reason: collision with root package name */
    public final Object f35120b;

    public d(Object obj) {
        n.n0(obj);
        this.f35120b = obj;
    }

    @Override // y2.e
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.f35120b.toString().getBytes(e.f36561a));
    }

    @Override // y2.e
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f35120b.equals(((d) obj).f35120b);
        }
        return false;
    }

    @Override // y2.e
    public final int hashCode() {
        return this.f35120b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f35120b + '}';
    }
}
