package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.huawei.hms.ads.gl;

/* compiled from: SimpleItemAnimator.java */
/* loaded from: classes.dex */
public abstract class x extends RecyclerView.l {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2387g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean a(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f2148a;
        int i13 = cVar.f2149b;
        if (c0Var2.shouldIgnore()) {
            int i14 = cVar.f2148a;
            i11 = cVar.f2149b;
            i10 = i14;
        } else {
            i10 = cVar2.f2148a;
            i11 = cVar2.f2149b;
        }
        k kVar = (k) this;
        if (c0Var == c0Var2) {
            return kVar.g(c0Var, i12, i13, i10, i11);
        }
        float translationX = c0Var.itemView.getTranslationX();
        float translationY = c0Var.itemView.getTranslationY();
        float alpha = c0Var.itemView.getAlpha();
        kVar.l(c0Var);
        c0Var.itemView.setTranslationX(translationX);
        c0Var.itemView.setTranslationY(translationY);
        c0Var.itemView.setAlpha(alpha);
        kVar.l(c0Var2);
        c0Var2.itemView.setTranslationX(-((int) ((i10 - i12) - translationX)));
        c0Var2.itemView.setTranslationY(-((int) ((i11 - i13) - translationY)));
        c0Var2.itemView.setAlpha(gl.Code);
        kVar.f2301k.add(new k.a(c0Var, c0Var2, i12, i13, i10, i11));
        return true;
    }

    public abstract boolean g(RecyclerView.c0 c0Var, int i10, int i11, int i12, int i13);
}
