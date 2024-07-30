package com.huawei.openalliance.ad.views;

import android.view.View;

/* loaded from: classes2.dex */
public final class c0 implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a0 f24135s;

    public c0(a0 a0Var) {
        this.f24135s = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a0 a0Var = this.f24135s;
        gb.w.d(a0Var.f24116i);
        View view2 = a0Var.f24114g;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        if (a0Var.f24125s == 10) {
            a0Var.k();
        }
        VideoView videoView = a0Var.f24109a;
        if (videoView != null && !videoView.getCurrentState().a()) {
            a0Var.j();
        }
        a0Var.g(false);
    }
}
