package ka;

/* loaded from: classes2.dex */
public final class p7 {

    /* renamed from: d, reason: collision with root package name */
    public static final r7 f31640d;

    /* renamed from: b, reason: collision with root package name */
    public String f31642b;

    /* renamed from: a, reason: collision with root package name */
    public int f31641a = 4;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31643c = false;

    static {
        r7 r7Var = new r7();
        r7Var.f2858a = new t7(new m7());
        f31640d = r7Var;
    }

    public final boolean a(int i10) {
        if (this.f31643c && i10 >= this.f31641a) {
            return true;
        }
        return false;
    }

    public final void b(int i10, String str, String str2) {
        if (a(i10)) {
            String b10 = s.f.b("HiAdKit.", str);
            u7 u7Var = new u7(this.f31642b, i10, b10);
            u7Var.f31932g.append((Object) str2);
            f31640d.b(u7Var, i10, b10);
        }
    }
}
