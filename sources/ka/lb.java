package ka;

import com.iab.omid.library.huawei.adsession.AdSessionConfiguration;

/* loaded from: classes2.dex */
public final class lb {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f31416b = jb.a(com.huawei.hms.ads.hb.f21701g);

    /* renamed from: a, reason: collision with root package name */
    public final AdSessionConfiguration f31417a;

    public lb(nb nbVar, qb qbVar) {
        boolean z10 = pb.f31645t;
        qb qbVar2 = qb.NATIVE;
        this.f31417a = null;
        if (nb.k() && pb.p() && qb.k()) {
            this.f31417a = AdSessionConfiguration.createAdSessionConfiguration(nb.a(nbVar), pb.k(), qb.a(qbVar2), qb.a(qbVar), false);
        }
    }

    public static boolean a() {
        return f31416b;
    }

    public final AdSessionConfiguration b() {
        return this.f31417a;
    }
}
