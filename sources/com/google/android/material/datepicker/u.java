package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.f;
import com.hamkho.livefoot.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.WeakHashMap;
import n0.l0;

/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes2.dex */
public final class u extends RecyclerView.g<a> {

    /* renamed from: i, reason: collision with root package name */
    public final CalendarConstraints f20735i;

    /* renamed from: j, reason: collision with root package name */
    public final DateSelector<?> f20736j;

    /* renamed from: k, reason: collision with root package name */
    public final DayViewDecorator f20737k;

    /* renamed from: l, reason: collision with root package name */
    public final f.d f20738l;

    /* renamed from: m, reason: collision with root package name */
    public final int f20739m;

    /* compiled from: MonthsPagerAdapter.java */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.c0 {

        /* renamed from: b, reason: collision with root package name */
        public final TextView f20740b;

        /* renamed from: c, reason: collision with root package name */
        public final MaterialCalendarGridView f20741c;

        public a(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f20740b = textView;
            WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
            new n0.b0().e(textView, Boolean.TRUE);
            this.f20741c = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z10) {
                textView.setVisibility(8);
            }
        }
    }

    public u(ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, f.c cVar) {
        int i10;
        Calendar calendar = calendarConstraints.f20644s.f20659s;
        Month month = calendarConstraints.f20647v;
        if (calendar.compareTo(month.f20659s) <= 0) {
            if (month.f20659s.compareTo(calendarConstraints.f20645t.f20659s) <= 0) {
                int i11 = s.y;
                int i12 = f.G;
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i11;
                if (n.c(contextThemeWrapper)) {
                    i10 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i10 = 0;
                }
                this.f20739m = dimensionPixelSize + i10;
                this.f20735i = calendarConstraints;
                this.f20736j = dateSelector;
                this.f20737k = dayViewDecorator;
                this.f20738l = cVar;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemCount() {
        return this.f20735i.y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final long getItemId(int i10) {
        Calendar b10 = a0.b(this.f20735i.f20644s.f20659s);
        b10.add(2, i10);
        return new Month(b10).f20659s.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(a aVar, int i10) {
        a aVar2 = aVar;
        CalendarConstraints calendarConstraints = this.f20735i;
        Calendar b10 = a0.b(calendarConstraints.f20644s.f20659s);
        b10.add(2, i10);
        Month month = new Month(b10);
        aVar2.f20740b.setText(month.k());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar2.f20741c.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() != null && month.equals(materialCalendarGridView.getAdapter().f20727s)) {
            materialCalendarGridView.invalidate();
            s adapter = materialCalendarGridView.getAdapter();
            Iterator<Long> it = adapter.f20729u.iterator();
            while (it.hasNext()) {
                adapter.d(materialCalendarGridView, it.next().longValue());
            }
            DateSelector<?> dateSelector = adapter.f20728t;
            if (dateSelector != null) {
                Iterator<Long> it2 = dateSelector.m().iterator();
                while (it2.hasNext()) {
                    adapter.d(materialCalendarGridView, it2.next().longValue());
                }
                adapter.f20729u = dateSelector.m();
            }
        } else {
            s sVar = new s(month, this.f20736j, calendarConstraints, this.f20737k);
            materialCalendarGridView.setNumColumns(month.f20662v);
            materialCalendarGridView.setAdapter((ListAdapter) sVar);
        }
        materialCalendarGridView.setOnItemClickListener(new t(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (n.c(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f20739m));
            return new a(linearLayout, true);
        }
        return new a(linearLayout, false);
    }
}
