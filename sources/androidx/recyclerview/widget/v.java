package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* loaded from: classes.dex */
public final class v extends n0.a {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f2383d;

    /* renamed from: e, reason: collision with root package name */
    public final a f2384e;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    /* loaded from: classes.dex */
    public static class a extends n0.a {

        /* renamed from: d, reason: collision with root package name */
        public final v f2385d;

        /* renamed from: e, reason: collision with root package name */
        public final WeakHashMap f2386e = new WeakHashMap();

        public a(v vVar) {
            this.f2385d = vVar;
        }

        @Override // n0.a
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            n0.a aVar = (n0.a) this.f2386e.get(view);
            if (aVar != null) {
                return aVar.a(view, accessibilityEvent);
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // n0.a
        public final o0.h b(View view) {
            n0.a aVar = (n0.a) this.f2386e.get(view);
            if (aVar != null) {
                return aVar.b(view);
            }
            return super.b(view);
        }

        @Override // n0.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            n0.a aVar = (n0.a) this.f2386e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        @Override // n0.a
        public final void d(View view, o0.g gVar) {
            v vVar = this.f2385d;
            boolean hasPendingAdapterUpdates = vVar.f2383d.hasPendingAdapterUpdates();
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f33521a;
            View.AccessibilityDelegate accessibilityDelegate = this.f33037a;
            if (!hasPendingAdapterUpdates) {
                RecyclerView recyclerView = vVar.f2383d;
                if (recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().V(view, gVar);
                    n0.a aVar = (n0.a) this.f2386e.get(view);
                    if (aVar != null) {
                        aVar.d(view, gVar);
                        return;
                    } else {
                        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                        return;
                    }
                }
            }
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }

        @Override // n0.a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            n0.a aVar = (n0.a) this.f2386e.get(view);
            if (aVar != null) {
                aVar.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        @Override // n0.a
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            n0.a aVar = (n0.a) this.f2386e.get(viewGroup);
            if (aVar != null) {
                return aVar.f(viewGroup, view, accessibilityEvent);
            }
            return super.f(viewGroup, view, accessibilityEvent);
        }

        @Override // n0.a
        public final boolean g(View view, int i10, Bundle bundle) {
            v vVar = this.f2385d;
            if (!vVar.f2383d.hasPendingAdapterUpdates()) {
                RecyclerView recyclerView = vVar.f2383d;
                if (recyclerView.getLayoutManager() != null) {
                    n0.a aVar = (n0.a) this.f2386e.get(view);
                    if (aVar != null) {
                        if (aVar.g(view, i10, bundle)) {
                            return true;
                        }
                    } else if (super.g(view, i10, bundle)) {
                        return true;
                    }
                    RecyclerView.v vVar2 = recyclerView.getLayoutManager().f2152b.mRecycler;
                    return false;
                }
            }
            return super.g(view, i10, bundle);
        }

        @Override // n0.a
        public final void h(View view, int i10) {
            n0.a aVar = (n0.a) this.f2386e.get(view);
            if (aVar != null) {
                aVar.h(view, i10);
            } else {
                super.h(view, i10);
            }
        }

        @Override // n0.a
        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            n0.a aVar = (n0.a) this.f2386e.get(view);
            if (aVar != null) {
                aVar.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public v(RecyclerView recyclerView) {
        this.f2383d = recyclerView;
        a aVar = this.f2384e;
        if (aVar != null) {
            this.f2384e = aVar;
        } else {
            this.f2384e = new a(this);
        }
    }

    @Override // n0.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.f2383d.hasPendingAdapterUpdates()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().T(accessibilityEvent);
            }
        }
    }

    @Override // n0.a
    public final void d(View view, o0.g gVar) {
        this.f33037a.onInitializeAccessibilityNodeInfo(view, gVar.f33521a);
        RecyclerView recyclerView = this.f2383d;
        if (!recyclerView.hasPendingAdapterUpdates() && recyclerView.getLayoutManager() != null) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f2152b;
            layoutManager.U(recyclerView2.mRecycler, recyclerView2.mState, gVar);
        }
    }

    @Override // n0.a
    public final boolean g(View view, int i10, Bundle bundle) {
        if (super.g(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f2383d;
        if (!recyclerView.hasPendingAdapterUpdates() && recyclerView.getLayoutManager() != null) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f2152b;
            return layoutManager.h0(recyclerView2.mRecycler, recyclerView2.mState, i10, bundle);
        }
        return false;
    }
}
