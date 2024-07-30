package com.google.android.material.datepicker;

import android.view.View;
import n0.q0;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes2.dex */
public final class o implements n0.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f20719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20720c;

    public o(int i10, View view, int i11) {
        this.f20718a = i10;
        this.f20719b = view;
        this.f20720c = i11;
    }

    @Override // n0.s
    public final q0 a(View view, q0 q0Var) {
        int i10 = q0Var.f33099a.f(7).f27900b;
        View view2 = this.f20719b;
        int i11 = this.f20718a;
        if (i11 >= 0) {
            view2.getLayoutParams().height = i11 + i10;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f20720c + i10, view2.getPaddingRight(), view2.getPaddingBottom());
        return q0Var;
    }
}
