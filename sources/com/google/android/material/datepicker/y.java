package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SmoothCalendarLayoutManager.java */
/* loaded from: classes2.dex */
public class y extends LinearLayoutManager {
    public y(int i10) {
        super(i10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void z0(RecyclerView recyclerView, int i10) {
        x xVar = new x(recyclerView.getContext());
        xVar.f2188a = i10;
        A0(xVar);
    }
}
