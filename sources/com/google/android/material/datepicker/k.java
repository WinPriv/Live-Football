package com.google.android.material.datepicker;

import android.view.View;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class k implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f20704s;

    public k(f fVar) {
        this.f20704s = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f fVar = this.f20704s;
        int i10 = fVar.y;
        if (i10 == 2) {
            fVar.c(1);
        } else if (i10 == 1) {
            fVar.c(2);
        }
    }
}
