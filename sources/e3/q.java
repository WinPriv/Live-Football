package e3;

import com.bumptech.glide.load.data.d;
import e3.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: MultiModelLoader.java */
/* loaded from: classes.dex */
public final class q<Model, Data> implements n<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final List<n<Model, Data>> f27710a;

    /* renamed from: b, reason: collision with root package name */
    public final m0.d<List<Throwable>> f27711b;

    /* compiled from: MultiModelLoader.java */
    /* loaded from: classes.dex */
    public static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: s, reason: collision with root package name */
        public final List<com.bumptech.glide.load.data.d<Data>> f27712s;

        /* renamed from: t, reason: collision with root package name */
        public final m0.d<List<Throwable>> f27713t;

        /* renamed from: u, reason: collision with root package name */
        public int f27714u;

        /* renamed from: v, reason: collision with root package name */
        public com.bumptech.glide.j f27715v;

        /* renamed from: w, reason: collision with root package name */
        public d.a<? super Data> f27716w;

        /* renamed from: x, reason: collision with root package name */
        public List<Throwable> f27717x;
        public boolean y;

        public a(ArrayList arrayList, m0.d dVar) {
            this.f27713t = dVar;
            if (!arrayList.isEmpty()) {
                this.f27712s = arrayList;
                this.f27714u = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            return this.f27712s.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            List<Throwable> list = this.f27717x;
            if (list != null) {
                this.f27713t.a(list);
            }
            this.f27717x = null;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f27712s.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public final void c(Exception exc) {
            List<Throwable> list = this.f27717x;
            androidx.activity.n.n0(list);
            list.add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
            this.y = true;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f27712s.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final y2.a d() {
            return this.f27712s.get(0).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(com.bumptech.glide.j jVar, d.a<? super Data> aVar) {
            this.f27715v = jVar;
            this.f27716w = aVar;
            this.f27717x = this.f27713t.b();
            this.f27712s.get(this.f27714u).e(jVar, this);
            if (this.y) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public final void f(Data data) {
            if (data != null) {
                this.f27716w.f(data);
            } else {
                g();
            }
        }

        public final void g() {
            if (this.y) {
                return;
            }
            if (this.f27714u < this.f27712s.size() - 1) {
                this.f27714u++;
                e(this.f27715v, this.f27716w);
            } else {
                androidx.activity.n.n0(this.f27717x);
                this.f27716w.c(new a3.t("Fetch failed", new ArrayList(this.f27717x)));
            }
        }
    }

    public q(ArrayList arrayList, m0.d dVar) {
        this.f27710a = arrayList;
        this.f27711b = dVar;
    }

    @Override // e3.n
    public final boolean a(Model model) {
        Iterator<n<Model, Data>> it = this.f27710a.iterator();
        while (it.hasNext()) {
            if (it.next().a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // e3.n
    public final n.a<Data> b(Model model, int i10, int i11, y2.g gVar) {
        n.a<Data> b10;
        List<n<Model, Data>> list = this.f27710a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        y2.e eVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            n<Model, Data> nVar = list.get(i12);
            if (nVar.a(model) && (b10 = nVar.b(model, i10, i11, gVar)) != null) {
                arrayList.add(b10.f27705c);
                eVar = b10.f27703a;
            }
        }
        if (arrayList.isEmpty() || eVar == null) {
            return null;
        }
        return new n.a<>(eVar, new a(arrayList, this.f27711b));
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f27710a.toArray()) + '}';
    }
}
