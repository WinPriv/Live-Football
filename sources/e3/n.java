package e3;

import java.util.Collections;
import java.util.List;

/* compiled from: ModelLoader.java */
/* loaded from: classes.dex */
public interface n<Model, Data> {

    /* compiled from: ModelLoader.java */
    /* loaded from: classes.dex */
    public static class a<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final y2.e f27703a;

        /* renamed from: b, reason: collision with root package name */
        public final List<y2.e> f27704b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f27705c;

        public a() {
            throw null;
        }

        public a(y2.e eVar, com.bumptech.glide.load.data.d<Data> dVar) {
            List<y2.e> emptyList = Collections.emptyList();
            androidx.activity.n.n0(eVar);
            this.f27703a = eVar;
            androidx.activity.n.n0(emptyList);
            this.f27704b = emptyList;
            androidx.activity.n.n0(dVar);
            this.f27705c = dVar;
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i10, int i11, y2.g gVar);
}
