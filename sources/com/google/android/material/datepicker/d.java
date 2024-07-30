package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class d implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f20686s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f20687t;

    public d(f fVar, u uVar) {
        this.f20687t = fVar;
        this.f20686s = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f fVar = this.f20687t;
        int N0 = ((LinearLayoutManager) fVar.B.getLayoutManager()).N0() - 1;
        if (N0 >= 0) {
            Calendar b10 = a0.b(this.f20686s.f20735i.f20644s.f20659s);
            b10.add(2, N0);
            fVar.b(new Month(b10));
        }
    }
}
