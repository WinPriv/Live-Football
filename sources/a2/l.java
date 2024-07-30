package a2;

/* compiled from: WorkNameDao_Impl.java */
/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final f1.h f51a;

    /* renamed from: b, reason: collision with root package name */
    public final a f52b;

    /* compiled from: WorkNameDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends f1.b<j> {
        public a(f1.h hVar) {
            super(hVar);
        }

        @Override // f1.l
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // f1.b
        public final void d(k1.e eVar, j jVar) {
            j jVar2 = jVar;
            String str = jVar2.f49a;
            if (str == null) {
                eVar.e(1);
            } else {
                eVar.f(1, str);
            }
            String str2 = jVar2.f50b;
            if (str2 == null) {
                eVar.e(2);
            } else {
                eVar.f(2, str2);
            }
        }
    }

    public l(f1.h hVar) {
        this.f51a = hVar;
        this.f52b = new a(hVar);
    }
}
