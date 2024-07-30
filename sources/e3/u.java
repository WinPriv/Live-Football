package e3;

import com.bumptech.glide.load.data.d;
import e3.n;

/* compiled from: UnitModelLoader.java */
/* loaded from: classes.dex */
public final class u<Model> implements n<Model, Model> {

    /* renamed from: a, reason: collision with root package name */
    public static final u<?> f27733a = new u<>();

    /* compiled from: UnitModelLoader.java */
    /* loaded from: classes.dex */
    public static class a<Model> implements o<Model, Model> {

        /* renamed from: a, reason: collision with root package name */
        public static final a<?> f27734a = new a<>();

        @Deprecated
        public a() {
        }

        @Override // e3.o
        public final n<Model, Model> a(r rVar) {
            return u.f27733a;
        }
    }

    @Deprecated
    public u() {
    }

    @Override // e3.n
    public final boolean a(Model model) {
        return true;
    }

    @Override // e3.n
    public final n.a<Model> b(Model model, int i10, int i11, y2.g gVar) {
        return new n.a<>(new s3.d(model), new b(model));
    }

    /* compiled from: UnitModelLoader.java */
    /* loaded from: classes.dex */
    public static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* renamed from: s, reason: collision with root package name */
        public final Model f27735s;

        public b(Model model) {
            this.f27735s = model;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Model> a() {
            return (Class<Model>) this.f27735s.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public final y2.a d() {
            return y2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(com.bumptech.glide.j jVar, d.a<? super Model> aVar) {
            aVar.f(this.f27735s);
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
