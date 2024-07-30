package c3;

import androidx.activity.n;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import t3.l;
import u3.a;
import u3.d;

/* compiled from: SafeKeyGenerator.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final t3.i<y2.e, String> f3252a = new t3.i<>(1000);

    /* renamed from: b, reason: collision with root package name */
    public final a.c f3253b = u3.a.a(10, new a());

    /* compiled from: SafeKeyGenerator.java */
    /* loaded from: classes.dex */
    public class a implements a.b<b> {
        @Override // u3.a.b
        public final b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* compiled from: SafeKeyGenerator.java */
    /* loaded from: classes.dex */
    public static final class b implements a.d {

        /* renamed from: s, reason: collision with root package name */
        public final MessageDigest f3254s;

        /* renamed from: t, reason: collision with root package name */
        public final d.a f3255t = new d.a();

        public b(MessageDigest messageDigest) {
            this.f3254s = messageDigest;
        }

        @Override // u3.a.d
        public final d.a b() {
            return this.f3255t;
        }
    }

    public final String a(y2.e eVar) {
        String a10;
        synchronized (this.f3252a) {
            a10 = this.f3252a.a(eVar);
        }
        if (a10 == null) {
            Object b10 = this.f3253b.b();
            n.n0(b10);
            b bVar = (b) b10;
            try {
                eVar.a(bVar.f3254s);
                byte[] digest = bVar.f3254s.digest();
                char[] cArr = l.f35430b;
                synchronized (cArr) {
                    for (int i10 = 0; i10 < digest.length; i10++) {
                        int i11 = digest[i10] & DefaultClassResolver.NAME;
                        int i12 = i10 * 2;
                        char[] cArr2 = l.f35429a;
                        cArr[i12] = cArr2[i11 >>> 4];
                        cArr[i12 + 1] = cArr2[i11 & 15];
                    }
                    a10 = new String(cArr);
                }
            } finally {
                this.f3253b.a(bVar);
            }
        }
        synchronized (this.f3252a) {
            this.f3252a.d(eVar, a10);
        }
        return a10;
    }
}
