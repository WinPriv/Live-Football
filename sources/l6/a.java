package l6;

import android.view.View;
import com.google.android.material.internal.n;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import n0.q0;

/* compiled from: BottomNavigationView.java */
/* loaded from: classes2.dex */
public final class a implements n.b {
    @Override // com.google.android.material.internal.n.b
    public final q0 a(View view, q0 q0Var, n.c cVar) {
        int i10;
        cVar.f20890d = q0Var.a() + cVar.f20890d;
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        boolean z10 = true;
        if (c0.e.d(view) != 1) {
            z10 = false;
        }
        int b10 = q0Var.b();
        int c10 = q0Var.c();
        int i11 = cVar.f20887a;
        if (z10) {
            i10 = c10;
        } else {
            i10 = b10;
        }
        int i12 = i11 + i10;
        cVar.f20887a = i12;
        int i13 = cVar.f20889c;
        if (!z10) {
            b10 = c10;
        }
        int i14 = i13 + b10;
        cVar.f20889c = i14;
        c0.e.k(view, i12, cVar.f20888b, i14, cVar.f20890d);
        return q0Var;
    }
}
