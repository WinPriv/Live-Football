package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2274s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f2275t;

    public e(k kVar, ArrayList arrayList) {
        this.f2275t = kVar;
        this.f2274s = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f2274s;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            k kVar = this.f2275t;
            if (hasNext) {
                RecyclerView.c0 c0Var = (RecyclerView.c0) it.next();
                kVar.getClass();
                View view = c0Var.itemView;
                ViewPropertyAnimator animate = view.animate();
                kVar.o.add(c0Var);
                animate.alpha(1.0f).setDuration(kVar.f2145c).setListener(new g(view, animate, kVar, c0Var)).start();
            } else {
                arrayList.clear();
                kVar.f2302l.remove(arrayList);
                return;
            }
        }
    }
}
