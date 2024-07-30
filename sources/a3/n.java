package a3;

/* compiled from: DiskCacheStrategy.java */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final b f154a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f155b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f156c;

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class a extends n {
        @Override // a3.n
        public final boolean a() {
            return true;
        }

        @Override // a3.n
        public final boolean b() {
            return true;
        }

        @Override // a3.n
        public final boolean c(y2.a aVar) {
            if (aVar == y2.a.REMOTE) {
                return true;
            }
            return false;
        }

        @Override // a3.n
        public final boolean d(boolean z10, y2.a aVar, y2.c cVar) {
            if (aVar != y2.a.RESOURCE_DISK_CACHE && aVar != y2.a.MEMORY_CACHE) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class b extends n {
        @Override // a3.n
        public final boolean a() {
            return false;
        }

        @Override // a3.n
        public final boolean b() {
            return false;
        }

        @Override // a3.n
        public final boolean c(y2.a aVar) {
            return false;
        }

        @Override // a3.n
        public final boolean d(boolean z10, y2.a aVar, y2.c cVar) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class c extends n {
        @Override // a3.n
        public final boolean a() {
            return true;
        }

        @Override // a3.n
        public final boolean b() {
            return false;
        }

        @Override // a3.n
        public final boolean c(y2.a aVar) {
            if (aVar != y2.a.DATA_DISK_CACHE && aVar != y2.a.MEMORY_CACHE) {
                return true;
            }
            return false;
        }

        @Override // a3.n
        public final boolean d(boolean z10, y2.a aVar, y2.c cVar) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class d extends n {
        @Override // a3.n
        public final boolean a() {
            return false;
        }

        @Override // a3.n
        public final boolean b() {
            return true;
        }

        @Override // a3.n
        public final boolean c(y2.a aVar) {
            return false;
        }

        @Override // a3.n
        public final boolean d(boolean z10, y2.a aVar, y2.c cVar) {
            if (aVar != y2.a.RESOURCE_DISK_CACHE && aVar != y2.a.MEMORY_CACHE) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class e extends n {
        @Override // a3.n
        public final boolean a() {
            return true;
        }

        @Override // a3.n
        public final boolean b() {
            return true;
        }

        @Override // a3.n
        public final boolean c(y2.a aVar) {
            if (aVar == y2.a.REMOTE) {
                return true;
            }
            return false;
        }

        @Override // a3.n
        public final boolean d(boolean z10, y2.a aVar, y2.c cVar) {
            if (((z10 && aVar == y2.a.DATA_DISK_CACHE) || aVar == y2.a.LOCAL) && cVar == y2.c.TRANSFORMED) {
                return true;
            }
            return false;
        }
    }

    static {
        new a();
        f154a = new b();
        f155b = new c();
        new d();
        f156c = new e();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(y2.a aVar);

    public abstract boolean d(boolean z10, y2.a aVar, y2.c cVar);
}
