package l0;

/* compiled from: TextDirectionHeuristicsCompat.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f32304a = new d(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final d f32305b = new d(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final d f32306c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f32307d;

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32308a = new a();

        @Override // l0.e.b
        public final int a(CharSequence charSequence, int i10) {
            int i11 = i10 + 0;
            int i12 = 2;
            for (int i13 = 0; i13 < i11 && i12 == 2; i13++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i13));
                d dVar = e.f32304a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i12 = 2;
                                break;
                        }
                    }
                    i12 = 0;
                }
                i12 = 1;
            }
            return i12;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    public interface b {
        int a(CharSequence charSequence, int i10);
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    public static abstract class c implements l0.d {

        /* renamed from: a, reason: collision with root package name */
        public final b f32309a;

        public c(a aVar) {
            this.f32309a = aVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i10) {
            if (charSequence != null && i10 >= 0 && charSequence.length() - i10 >= 0) {
                b bVar = this.f32309a;
                if (bVar == null) {
                    return a();
                }
                int a10 = bVar.a(charSequence, i10);
                if (a10 == 0) {
                    return true;
                }
                if (a10 != 1) {
                    return a();
                }
                return false;
            }
            throw new IllegalArgumentException();
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    public static class d extends c {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f32310b;

        public d(a aVar, boolean z10) {
            super(aVar);
            this.f32310b = z10;
        }

        @Override // l0.e.c
        public final boolean a() {
            return this.f32310b;
        }
    }

    static {
        a aVar = a.f32308a;
        f32306c = new d(aVar, false);
        f32307d = new d(aVar, true);
    }
}
