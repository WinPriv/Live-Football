package a2;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WorkProgressDao_Impl.java */
/* loaded from: classes.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    public final f1.h f53a;

    /* renamed from: b, reason: collision with root package name */
    public final a f54b;

    /* renamed from: c, reason: collision with root package name */
    public final b f55c;

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends f1.l {
        public a(f1.h hVar) {
            super(hVar);
        }

        @Override // f1.l
        public final String b() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    public class b extends f1.l {
        public b(f1.h hVar) {
            super(hVar);
        }

        @Override // f1.l
        public final String b() {
            return "DELETE FROM WorkProgress";
        }
    }

    public n(f1.h hVar) {
        this.f53a = hVar;
        new AtomicBoolean(false);
        this.f54b = new a(hVar);
        this.f55c = new b(hVar);
    }
}
