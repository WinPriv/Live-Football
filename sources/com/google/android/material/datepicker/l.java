package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class l implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f20705s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f20706t;

    public l(f fVar, u uVar) {
        this.f20706t = fVar;
        this.f20705s = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f fVar = this.f20706t;
        int M0 = ((LinearLayoutManager) fVar.B.getLayoutManager()).M0() + 1;
        if (M0 < fVar.B.getAdapter().getItemCount()) {
            Calendar b10 = a0.b(this.f20705s.f20735i.f20644s.f20659s);
            b10.add(2, M0);
            fVar.b(new Month(b10));
        }
    }
}
