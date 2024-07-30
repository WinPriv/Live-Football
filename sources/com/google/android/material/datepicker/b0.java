package com.google.android.material.datepicker;

import android.view.View;
import java.util.Calendar;

/* compiled from: YearGridAdapter.java */
/* loaded from: classes2.dex */
public final class b0 implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f20678s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c0 f20679t;

    public b0(c0 c0Var, int i10) {
        this.f20679t = c0Var;
        this.f20678s = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c0 c0Var = this.f20679t;
        Month a10 = Month.a(this.f20678s, c0Var.f20684i.f20694x.f20660t);
        f<?> fVar = c0Var.f20684i;
        CalendarConstraints calendarConstraints = fVar.f20692v;
        Month month = calendarConstraints.f20644s;
        Calendar calendar = month.f20659s;
        Calendar calendar2 = a10.f20659s;
        if (calendar2.compareTo(calendar) < 0) {
            a10 = month;
        } else {
            Month month2 = calendarConstraints.f20645t;
            if (calendar2.compareTo(month2.f20659s) > 0) {
                a10 = month2;
            }
        }
        fVar.b(a10);
        fVar.c(1);
    }
}
