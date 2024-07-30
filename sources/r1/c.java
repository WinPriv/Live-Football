package r1;

import android.net.Uri;
import java.util.HashSet;

/* compiled from: ContentUriTriggers.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f34810a = new HashSet();

    /* compiled from: ContentUriTriggers.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f34811a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f34812b;

        public a(Uri uri, boolean z10) {
            this.f34811a = uri;
            this.f34812b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f34812b == aVar.f34812b && this.f34811a.equals(aVar.f34811a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (this.f34811a.hashCode() * 31) + (this.f34812b ? 1 : 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            return this.f34810a.equals(((c) obj).f34810a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34810a.hashCode();
    }
}
