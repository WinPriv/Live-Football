package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.f;
import java.util.Iterator;

/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes2.dex */
public final class t implements AdapterView.OnItemClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f20733s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f20734t;

    public t(u uVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f20734t = uVar;
        this.f20733s = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        boolean z10;
        MaterialCalendarGridView materialCalendarGridView = this.f20733s;
        if (i10 >= materialCalendarGridView.getAdapter().a() && i10 <= (r2.a() + r2.f20727s.f20663w) - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f.d dVar = this.f20734t.f20738l;
            long longValue = materialCalendarGridView.getAdapter().getItem(i10).longValue();
            f fVar = f.this;
            if (fVar.f20692v.f20646u.b(longValue)) {
                fVar.f20691u.d();
                Iterator it = fVar.f20742s.iterator();
                while (it.hasNext()) {
                    ((v) it.next()).a(fVar.f20691u.P());
                }
                fVar.B.getAdapter().notifyDataSetChanged();
                RecyclerView recyclerView = fVar.A;
                if (recyclerView != null) {
                    recyclerView.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }
}
