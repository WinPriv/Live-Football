package y2;

import a3.l;
import android.text.TextUtils;
import java.security.MessageDigest;

/* compiled from: Option.java */
/* loaded from: classes.dex */
public final class f<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final a f36562e = new a();

    /* renamed from: a, reason: collision with root package name */
    public final T f36563a;

    /* renamed from: b, reason: collision with root package name */
    public final b<T> f36564b;

    /* renamed from: c, reason: collision with root package name */
    public final String f36565c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f36566d;

    /* compiled from: Option.java */
    /* loaded from: classes.dex */
    public interface b<T> {
        void a(byte[] bArr, T t10, MessageDigest messageDigest);
    }

    public f(String str, T t10, b<T> bVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f36565c = str;
            this.f36563a = t10;
            this.f36564b = bVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static f a(Object obj, String str) {
        return new f(str, obj, f36562e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f36565c.equals(((f) obj).f36565c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36565c.hashCode();
    }

    public final String toString() {
        return l.p(new StringBuilder("Option{key='"), this.f36565c, "'}");
    }

    /* compiled from: Option.java */
    /* loaded from: classes.dex */
    public class a implements b<Object> {
        @Override // y2.f.b
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
