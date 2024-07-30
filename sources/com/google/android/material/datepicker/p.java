package com.google.android.material.datepicker;

import android.view.View;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes2.dex */
public final class p implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f20721s;

    public p(n nVar) {
        this.f20721s = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n nVar = this.f20721s;
        nVar.O.setEnabled(nVar.a().j());
        nVar.M.toggle();
        nVar.f(nVar.M);
        nVar.e();
    }
}
