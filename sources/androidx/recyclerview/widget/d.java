package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2272s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f2273t;

    public d(k kVar, ArrayList arrayList) {
        this.f2273t = kVar;
        this.f2272s = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        ArrayList arrayList = this.f2272s;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            k kVar = this.f2273t;
            if (hasNext) {
                k.a aVar = (k.a) it.next();
                kVar.getClass();
                RecyclerView.c0 c0Var = aVar.f2308a;
                View view2 = null;
                if (c0Var == null) {
                    view = null;
                } else {
                    view = c0Var.itemView;
                }
                RecyclerView.c0 c0Var2 = aVar.f2309b;
                if (c0Var2 != null) {
                    view2 = c0Var2.itemView;
                }
                ArrayList<RecyclerView.c0> arrayList2 = kVar.f2307r;
                long j10 = kVar.f;
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(j10);
                    arrayList2.add(aVar.f2308a);
                    duration.translationX(aVar.f2312e - aVar.f2310c);
                    duration.translationY(aVar.f - aVar.f2311d);
                    duration.alpha(gl.Code).setListener(new i(kVar, aVar, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator animate = view2.animate();
                    arrayList2.add(aVar.f2309b);
                    animate.translationX(gl.Code).translationY(gl.Code).setDuration(j10).alpha(1.0f).setListener(new j(kVar, aVar, animate, view2)).start();
                }
            } else {
                arrayList.clear();
                kVar.f2304n.remove(arrayList);
                return;
            }
        }
    }
}
