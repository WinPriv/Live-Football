package androidx.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.i;
import com.hamkho.livefoot.R;
import java.util.ArrayList;

/* compiled from: Visibility.java */
/* loaded from: classes.dex */
public final class a0 extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2427b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2428c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f2429d;

    public a0(b0 b0Var, ViewGroup viewGroup, View view, View view2) {
        this.f2429d = b0Var;
        this.f2426a = viewGroup;
        this.f2427b = view;
        this.f2428c = view2;
    }

    @Override // androidx.transition.l, androidx.transition.i.d
    public final void a() {
        this.f2426a.getOverlay().remove(this.f2427b);
    }

    @Override // androidx.transition.i.d
    public final void c(i iVar) {
        this.f2428c.setTag(R.id.save_overlay_view, null);
        this.f2426a.getOverlay().remove(this.f2427b);
        iVar.v(this);
    }

    @Override // androidx.transition.l, androidx.transition.i.d
    public final void e() {
        View view = this.f2427b;
        if (view.getParent() == null) {
            this.f2426a.getOverlay().add(view);
            return;
        }
        b0 b0Var = this.f2429d;
        ArrayList<Animator> arrayList = b0Var.E;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                arrayList.get(size).cancel();
            }
        }
        ArrayList<i.d> arrayList2 = b0Var.I;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) b0Var.I.clone();
            int size2 = arrayList3.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((i.d) arrayList3.get(i10)).b();
            }
        }
    }
}
