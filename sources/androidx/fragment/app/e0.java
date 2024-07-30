package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import n0.c0;

/* compiled from: FragmentTransitionImpl.java */
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public abstract class e0 {
    public static void d(View view, List list) {
        boolean z10;
        boolean z11;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (list.get(i10) == view) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return;
        }
        WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
        if (c0.i.k(view) != null) {
            list.add(view);
        }
        for (int i11 = size; i11 < list.size(); i11++) {
            View view2 = (View) list.get(i11);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = viewGroup.getChildAt(i12);
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            if (list.get(i13) == childAt) {
                                z11 = true;
                                break;
                            }
                            i13++;
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                    if (!z11 && c0.i.k(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public static void g(View view, Rect rect) {
        WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
        if (!c0.g.b(view)) {
            return;
        }
        RectF rectF = new RectF();
        rectF.set(gl.Code, gl.Code, view.getWidth(), view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            view2.getMatrix().mapRect(rectF);
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
        view.getRootView().getLocationOnScreen(new int[2]);
        rectF.offset(r1[0], r1[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public static boolean h(List list) {
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }

    public static ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) arrayList.get(i10);
            WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
            arrayList2.add(c0.i.k(view));
            c0.i.v(view, null);
        }
        return arrayList2;
    }

    public static void q(ViewGroup viewGroup, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, q.b bVar) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) arrayList.get(i10);
            WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
            String k10 = c0.i.k(view);
            arrayList4.add(k10);
            if (k10 != null) {
                c0.i.v(view, null);
                String str = (String) bVar.getOrDefault(k10, null);
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i11))) {
                        c0.i.v((View) arrayList2.get(i11), k10);
                        break;
                    }
                    i11++;
                }
            }
        }
        n0.v.a(viewGroup, new d0(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void a(View view, Object obj);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    public abstract Object i(Object obj, Object obj2, Object obj3);

    public abstract Object j(Object obj, Object obj2, Object obj3);

    public abstract void l(Object obj, View view, ArrayList<View> arrayList);

    public abstract void m(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void n(View view, Object obj);

    public abstract void o(Object obj, Rect rect);

    public void p(Object obj, Runnable runnable) {
        runnable.run();
    }

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    public abstract void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object t(Object obj);
}
