package com.huawei.openalliance.ad.views;

import android.view.View;
import android.widget.Toast;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.jy;
import com.huawei.hms.ads.nativead.R;
import com.huawei.openalliance.ad.views.a0;

/* loaded from: classes2.dex */
public final class f0 implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a0 f24141s;

    public f0(a0 a0Var) {
        this.f24141s = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jy jyVar;
        a0 a0Var = this.f24141s;
        a0.d dVar = a0Var.o;
        if (dVar != null && (jyVar = NativeVideoView.this.f23734s0) != null) {
            jyVar.Code(5, false);
        }
        if (a0Var.f24125s == 10) {
            int i10 = a0.f24108v;
            ex.Code("a0", "linkedVideoMode is " + a0Var.f24125s);
            a0Var.k();
            return;
        }
        if (a0Var.f24109a != null) {
            gb.w.d(a0Var.f24116i);
            boolean o = a0Var.f24109a.o();
            String str = a0Var.f24115h;
            if (o) {
                gb.w.d(str);
                a0Var.f24109a.L();
                return;
            }
            if (!a0.a.v(a0Var.f24109a.getContext())) {
                Toast.makeText(a0Var.f24109a.getContext(), R.string.hiad_network_no_available, 0).show();
                return;
            }
            if (!a0Var.f24123q && a0Var.f24122p != 1 && !a0.a.s(a0Var.f24109a.getContext())) {
                ex.V("a0", "non wifi, show alert");
                a0Var.f24109a.L();
                View view2 = a0Var.f24114g;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                a0Var.e(false, false);
                return;
            }
            a0Var.g(false);
            gb.w.d(str);
            gb.w.c(a0Var.f24127u, str, com.anythink.expressad.video.module.a.a.m.ag);
        }
    }
}
