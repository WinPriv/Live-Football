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
public final class c implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2270s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f2271t;

    public c(k kVar, ArrayList arrayList) {
        this.f2271t = kVar;
        this.f2270s = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f2270s;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            k kVar = this.f2271t;
            if (hasNext) {
                k.b bVar = (k.b) it.next();
                RecyclerView.c0 c0Var = bVar.f2313a;
                kVar.getClass();
                View view = c0Var.itemView;
                int i10 = bVar.f2316d - bVar.f2314b;
                int i11 = bVar.f2317e - bVar.f2315c;
                if (i10 != 0) {
                    view.animate().translationX(gl.Code);
                }
                if (i11 != 0) {
                    view.animate().translationY(gl.Code);
                }
                ViewPropertyAnimator animate = view.animate();
                kVar.f2305p.add(c0Var);
                animate.setDuration(kVar.f2147e).setListener(new h(kVar, c0Var, i10, view, i11, animate)).start();
            } else {
                arrayList.clear();
                kVar.f2303m.remove(arrayList);
                return;
            }
        }
    }
}
