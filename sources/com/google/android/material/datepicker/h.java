package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class h extends RecyclerView.n {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f20697a = a0.d(null);

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f20698b = a0.d(null);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f20699c;

    public h(f fVar) {
        this.f20699c = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        Long l10;
        int i10;
        int width;
        if ((recyclerView.getAdapter() instanceof c0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            c0 c0Var = (c0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            f fVar = this.f20699c;
            for (m0.c<Long, Long> cVar : fVar.f20691u.f()) {
                Long l11 = cVar.f32635a;
                if (l11 != null && (l10 = cVar.f32636b) != null) {
                    long longValue = l11.longValue();
                    Calendar calendar = this.f20697a;
                    calendar.setTimeInMillis(longValue);
                    long longValue2 = l10.longValue();
                    Calendar calendar2 = this.f20698b;
                    calendar2.setTimeInMillis(longValue2);
                    int i11 = calendar.get(1) - c0Var.f20684i.f20692v.f20644s.f20661u;
                    int i12 = calendar2.get(1) - c0Var.f20684i.f20692v.f20644s.f20661u;
                    View q10 = gridLayoutManager.q(i11);
                    View q11 = gridLayoutManager.q(i12);
                    int i13 = gridLayoutManager.F;
                    int i14 = i11 / i13;
                    int i15 = i12 / i13;
                    for (int i16 = i14; i16 <= i15; i16++) {
                        View q12 = gridLayoutManager.q(gridLayoutManager.F * i16);
                        if (q12 != null) {
                            int top = q12.getTop() + fVar.f20695z.f20674d.f20665a.top;
                            int bottom = q12.getBottom() - fVar.f20695z.f20674d.f20665a.bottom;
                            if (i16 == i14) {
                                i10 = (q10.getWidth() / 2) + q10.getLeft();
                            } else {
                                i10 = 0;
                            }
                            if (i16 == i15) {
                                width = (q11.getWidth() / 2) + q11.getLeft();
                            } else {
                                width = recyclerView.getWidth();
                            }
                            canvas.drawRect(i10, top, width, bottom, fVar.f20695z.f20677h);
                        }
                    }
                }
            }
        }
    }
}
