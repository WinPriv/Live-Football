package androidx.viewpager2.widget;

import android.content.Context;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import g4.t;
import j2.k;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FakeDrag.java */
/* loaded from: classes.dex */
public final class d implements b4.b {

    /* renamed from: s, reason: collision with root package name */
    public final Object f2569s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f2570t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f2571u;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3) {
        this.f2569s = obj;
        this.f2570t = obj2;
        this.f2571u = obj3;
    }

    @Override // tc.a
    public final Object get() {
        return new t((Context) ((tc.a) this.f2569s).get(), (String) ((tc.a) this.f2570t).get(), ((Integer) ((tc.a) this.f2571u).get()).intValue());
    }

    public d(List list) {
        this.f2571u = list;
        this.f2569s = new ArrayList(list.size());
        this.f2570t = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((List) this.f2569s).add(new k((List) ((n2.f) list.get(i10)).f33243b.f35738t));
            ((List) this.f2570t).add(((n2.f) list.get(i10)).f33244c.a());
        }
    }

    public /* synthetic */ d(NestedScrollView nestedScrollView, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout) {
        this.f2569s = nestedScrollView;
        this.f2571u = recyclerView;
        this.f2570t = shimmerFrameLayout;
    }
}
