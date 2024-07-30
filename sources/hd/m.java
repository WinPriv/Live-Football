package hd;

/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f28929a = 327680;

    /* renamed from: b, reason: collision with root package name */
    public m f28930b = null;

    public abstract void a(int i10);

    public abstract void b(Object obj);

    public abstract void c(int i10, int i11);

    public final void d(int i10, String str, String str2, String str3) {
        boolean z10;
        if (this.f28929a >= 327680) {
            if (i10 == 185) {
                z10 = true;
            } else {
                z10 = false;
            }
            e(i10, str, str2, str3, z10);
            return;
        }
        m mVar = this.f28930b;
        if (mVar != null) {
            mVar.d(i10, str, str2, str3);
        }
    }

    public abstract void e(int i10, String str, String str2, String str3, boolean z10);

    public abstract void f(int i10, String str);

    public abstract void g(int i10, int i11);
}
