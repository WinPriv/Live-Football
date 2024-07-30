package i7;

import i7.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Splitter.java */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final i7.b f29209a;

    /* renamed from: b, reason: collision with root package name */
    public final b f29210b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29211c;

    /* compiled from: Splitter.java */
    /* loaded from: classes2.dex */
    public static abstract class a extends i7.a<String> {

        /* renamed from: u, reason: collision with root package name */
        public final CharSequence f29212u;

        /* renamed from: v, reason: collision with root package name */
        public final i7.b f29213v;
        public int y;

        /* renamed from: x, reason: collision with root package name */
        public int f29215x = 0;

        /* renamed from: w, reason: collision with root package name */
        public final boolean f29214w = false;

        public a(l lVar, CharSequence charSequence) {
            this.f29213v = lVar.f29209a;
            this.y = lVar.f29211c;
            this.f29212u = charSequence;
        }
    }

    /* compiled from: Splitter.java */
    /* loaded from: classes2.dex */
    public interface b {
    }

    public l(k kVar) {
        b.d dVar = b.d.f29199t;
        this.f29210b = kVar;
        this.f29209a = dVar;
        this.f29211c = Integer.MAX_VALUE;
    }

    public final List<String> a(CharSequence charSequence) {
        charSequence.getClass();
        k kVar = (k) this.f29210b;
        kVar.getClass();
        j jVar = new j(kVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (jVar.hasNext()) {
            arrayList.add(jVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
