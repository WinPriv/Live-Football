package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hamkho.livefoot.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: YearGridAdapter.java */
/* loaded from: classes2.dex */
public final class c0 extends RecyclerView.g<a> {

    /* renamed from: i, reason: collision with root package name */
    public final f<?> f20684i;

    /* compiled from: YearGridAdapter.java */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.c0 {

        /* renamed from: b, reason: collision with root package name */
        public final TextView f20685b;

        public a(TextView textView) {
            super(textView);
            this.f20685b = textView;
        }
    }

    public c0(f<?> fVar) {
        this.f20684i = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemCount() {
        return this.f20684i.f20692v.f20649x;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(a aVar, int i10) {
        String format;
        com.google.android.material.datepicker.a aVar2;
        a aVar3 = aVar;
        f<?> fVar = this.f20684i;
        int i11 = fVar.f20692v.f20644s.f20661u + i10;
        aVar3.f20685b.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i11)));
        TextView textView = aVar3.f20685b;
        Context context = textView.getContext();
        if (a0.c().get(1) == i11) {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i11));
        } else {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i11));
        }
        textView.setContentDescription(format);
        b bVar = fVar.f20695z;
        Calendar c10 = a0.c();
        if (c10.get(1) == i11) {
            aVar2 = bVar.f;
        } else {
            aVar2 = bVar.f20674d;
        }
        Iterator<Long> it = fVar.f20691u.m().iterator();
        while (it.hasNext()) {
            c10.setTimeInMillis(it.next().longValue());
            if (c10.get(1) == i11) {
                aVar2 = bVar.f20675e;
            }
        }
        aVar2.b(textView);
        textView.setOnClickListener(new b0(this, i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
