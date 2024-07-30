package com.huawei.openalliance.ad.views;

import android.view.View;

/* loaded from: classes2.dex */
public final class b0 implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a0 f24132s;

    public b0(a0 a0Var) {
        this.f24132s = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a0 a0Var = this.f24132s;
        View.OnClickListener onClickListener = a0Var.f24121n;
        if (onClickListener != null) {
            onClickListener.onClick(a0Var.f24113e);
        }
    }
}
