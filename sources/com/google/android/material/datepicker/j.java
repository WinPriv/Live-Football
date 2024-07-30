package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class j extends RecyclerView.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f20701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f20702b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f20703c;

    public j(f fVar, u uVar, MaterialButton materialButton) {
        this.f20703c = fVar;
        this.f20701a = uVar;
        this.f20702b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            recyclerView.announceForAccessibility(this.f20702b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int N0;
        f fVar = this.f20703c;
        if (i10 < 0) {
            N0 = ((LinearLayoutManager) fVar.B.getLayoutManager()).M0();
        } else {
            N0 = ((LinearLayoutManager) fVar.B.getLayoutManager()).N0();
        }
        u uVar = this.f20701a;
        Calendar b10 = a0.b(uVar.f20735i.f20644s.f20659s);
        b10.add(2, N0);
        fVar.f20694x = new Month(b10);
        Calendar b11 = a0.b(uVar.f20735i.f20644s.f20659s);
        b11.add(2, N0);
        this.f20702b.setText(new Month(b11).k());
    }
}
