package dd;

import androidx.activity.n;
import yc.l;
import zc.e;

/* compiled from: CoroutineDispatcher.kt */
/* loaded from: classes2.dex */
public abstract class a extends xc.a {

    /* renamed from: s, reason: collision with root package name */
    public static final C0362a f27608s = new C0362a();

    /* compiled from: CoroutineDispatcher.kt */
    /* renamed from: dd.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0362a extends xc.b<Object, a> {

        /* compiled from: CoroutineDispatcher.kt */
        /* renamed from: dd.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0363a extends e implements l<xc.c, a> {

            /* renamed from: s, reason: collision with root package name */
            public static final C0363a f27609s = new C0363a();

            @Override // yc.l
            public final a invoke(xc.c cVar) {
                xc.c cVar2 = cVar;
                if (cVar2 instanceof a) {
                    return (a) cVar2;
                }
                return null;
            }
        }

        public C0362a() {
            super(q.e.K, C0363a.f27609s);
        }
    }

    public a() {
        super(q.e.K);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + n.z0(this);
    }
}
