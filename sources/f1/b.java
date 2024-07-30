package f1;

/* compiled from: EntityInsertionAdapter.java */
/* loaded from: classes.dex */
public abstract class b<T> extends l {
    public b(h hVar) {
        super(hVar);
    }

    public abstract void d(k1.e eVar, T t10);

    public final void e(T t10) {
        k1.e a10 = a();
        try {
            d(a10, t10);
            a10.f30302t.executeInsert();
        } finally {
            c(a10);
        }
    }
}
