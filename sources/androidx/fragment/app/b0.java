package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentTransitionCompat21.java */
/* loaded from: classes.dex */
public final class b0 extends e0 {

    /* compiled from: FragmentTransitionCompat21.java */
    /* loaded from: classes.dex */
    public class c extends Transition.EpicenterCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f1791a;

        public c(Rect rect) {
            this.f1791a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public final Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f1791a;
            if (rect != null && !rect.isEmpty()) {
                return rect;
            }
            return null;
        }
    }

    public static boolean u(Transition transition) {
        if (e0.h(transition.getTargetIds()) && e0.h(transition.getTargetNames()) && e0.h(transition.getTargetTypes())) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.e0
    public final void a(View view, Object obj) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.e0
    public final void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                b(transitionSet.getTransitionAt(i10), arrayList);
                i10++;
            }
            return;
        }
        if (!u(transition) && e0.h(transition.getTargets())) {
            int size = arrayList.size();
            while (i10 < size) {
                transition.addTarget(arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.e0
    public final void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.e0
    public final boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.e0
    public final Object f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.e0
    public final Object i(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // androidx.fragment.app.e0
    public final Object j(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.e0
    public final void l(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new a(view, arrayList));
    }

    @Override // androidx.fragment.app.e0
    public final void m(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new b(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.e0
    public final void n(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            e0.g(view, rect);
            ((Transition) obj).setEpicenterCallback(new a0(rect));
        }
    }

    @Override // androidx.fragment.app.e0
    public final void o(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new c(rect));
        }
    }

    @Override // androidx.fragment.app.e0
    public final void p(Object obj, Runnable runnable) {
        ((Transition) obj).addListener(new c0(runnable));
    }

    @Override // androidx.fragment.app.e0
    public final void r(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e0.d(arrayList.get(i10), targets);
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.e0
    public final void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            v(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.e0
    public final Object t(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public final void v(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        int size;
        Transition transition = (Transition) obj;
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                v(transitionSet.getTransitionAt(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (!u(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                size = 0;
            } else {
                size = arrayList2.size();
            }
            while (i10 < size) {
                transition.addTarget(arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* loaded from: classes.dex */
    public class a implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f1783a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f1784b;

        public a(View view, ArrayList arrayList) {
            this.f1783a = view;
            this.f1784b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f1783a.setVisibility(8);
            ArrayList arrayList = this.f1784b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) arrayList.get(i10)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* loaded from: classes.dex */
    public class b implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f1785a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f1786b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f1787c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f1788d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f1789e;
        public final /* synthetic */ ArrayList f;

        public b(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f1785a = obj;
            this.f1786b = arrayList;
            this.f1787c = obj2;
            this.f1788d = arrayList2;
            this.f1789e = obj3;
            this.f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            b0 b0Var = b0.this;
            Object obj = this.f1785a;
            if (obj != null) {
                b0Var.v(obj, this.f1786b, null);
            }
            Object obj2 = this.f1787c;
            if (obj2 != null) {
                b0Var.v(obj2, this.f1788d, null);
            }
            Object obj3 = this.f1789e;
            if (obj3 != null) {
                b0Var.v(obj3, this.f, null);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }
    }
}
