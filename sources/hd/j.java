package hd;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public l f28906a;

    /* renamed from: b, reason: collision with root package name */
    public l f28907b;

    /* renamed from: c, reason: collision with root package name */
    public l f28908c;

    /* renamed from: d, reason: collision with root package name */
    public String f28909d;

    /* renamed from: e, reason: collision with root package name */
    public int f28910e;
    public j f;

    public static j a(j jVar, l lVar, l lVar2) {
        int i10;
        if (jVar == null) {
            return null;
        }
        j a10 = a(jVar.f, lVar, lVar2);
        jVar.f = a10;
        int i11 = jVar.f28906a.f28921c;
        l lVar3 = jVar.f28907b;
        int i12 = lVar3.f28921c;
        int i13 = lVar.f28921c;
        if (lVar2 == null) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = lVar2.f28921c;
        }
        if (i13 < i12 && i10 > i11) {
            if (i13 <= i11) {
                if (i10 >= i12) {
                    return a10;
                }
                jVar.f28906a = lVar2;
                return jVar;
            }
            if (i10 >= i12) {
                jVar.f28907b = lVar;
                return jVar;
            }
            j jVar2 = new j();
            jVar2.f28906a = lVar2;
            jVar2.f28907b = lVar3;
            jVar2.f28908c = jVar.f28908c;
            jVar2.f28909d = jVar.f28909d;
            jVar2.f28910e = jVar.f28910e;
            jVar2.f = a10;
            jVar.f28907b = lVar;
            jVar.f = jVar2;
            return jVar;
        }
        return jVar;
    }
}
