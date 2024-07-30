package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.hamkho.livefoot.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* compiled from: TransitionManager.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.transition.a f2478a = new androidx.transition.a();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<WeakReference<q.b<ViewGroup, ArrayList<i>>>> f2479b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList<ViewGroup> f2480c = new ArrayList<>();

    public static void a(ViewGroup viewGroup, i iVar) {
        ArrayList<ViewGroup> arrayList = f2480c;
        if (!arrayList.contains(viewGroup)) {
            WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
            if (c0.g.c(viewGroup)) {
                arrayList.add(viewGroup);
                if (iVar == null) {
                    iVar = f2478a;
                }
                i clone = iVar.clone();
                ArrayList<i> orDefault = b().getOrDefault(viewGroup, null);
                if (orDefault != null && orDefault.size() > 0) {
                    Iterator<i> it = orDefault.iterator();
                    while (it.hasNext()) {
                        it.next().u(viewGroup);
                    }
                }
                if (clone != null) {
                    clone.h(viewGroup, true);
                }
                if (((h) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                    viewGroup.setTag(R.id.transition_current_scene, null);
                    if (clone != null) {
                        a aVar = new a(viewGroup, clone);
                        viewGroup.addOnAttachStateChangeListener(aVar);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    public static q.b<ViewGroup, ArrayList<i>> b() {
        q.b<ViewGroup, ArrayList<i>> bVar;
        ThreadLocal<WeakReference<q.b<ViewGroup, ArrayList<i>>>> threadLocal = f2479b;
        WeakReference<q.b<ViewGroup, ArrayList<i>>> weakReference = threadLocal.get();
        if (weakReference != null && (bVar = weakReference.get()) != null) {
            return bVar;
        }
        q.b<ViewGroup, ArrayList<i>> bVar2 = new q.b<>();
        threadLocal.set(new WeakReference<>(bVar2));
        return bVar2;
    }

    /* compiled from: TransitionManager.java */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: s, reason: collision with root package name */
        public final i f2481s;

        /* renamed from: t, reason: collision with root package name */
        public final ViewGroup f2482t;

        /* compiled from: TransitionManager.java */
        /* renamed from: androidx.transition.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0022a extends l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q.b f2483a;

            public C0022a(q.b bVar) {
                this.f2483a = bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.transition.i.d
            public final void c(i iVar) {
                ((ArrayList) this.f2483a.getOrDefault(a.this.f2482t, null)).remove(iVar);
                iVar.v(this);
            }
        }

        public a(ViewGroup viewGroup, i iVar) {
            this.f2481s = iVar;
            this.f2482t = viewGroup;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x01e3 A[EDGE_INSN: B:122:0x01e3->B:123:0x01e3 BREAK  A[LOOP:1: B:17:0x0087->B:29:0x01da], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:126:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x020b  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x0237  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean onPreDraw() {
            /*
                Method dump skipped, instructions count: 701
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.m.a.onPreDraw():boolean");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f2482t;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            m.f2480c.remove(viewGroup);
            ArrayList<i> orDefault = m.b().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<i> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().x(viewGroup);
                }
            }
            this.f2481s.i(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
