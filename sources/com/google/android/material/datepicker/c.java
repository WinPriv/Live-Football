package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: DaysOfWeekAdapter.java */
/* loaded from: classes2.dex */
public final class c extends BaseAdapter {

    /* renamed from: v, reason: collision with root package name */
    public static final int f20680v;

    /* renamed from: s, reason: collision with root package name */
    public final Calendar f20681s;

    /* renamed from: t, reason: collision with root package name */
    public final int f20682t;

    /* renamed from: u, reason: collision with root package name */
    public final int f20683u;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 26) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        f20680v = i10;
    }

    public c() {
        Calendar d10 = a0.d(null);
        this.f20681s = d10;
        this.f20682t = d10.getMaximum(7);
        this.f20683u = d10.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f20682t;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        int i11 = this.f20682t;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.f20683u;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i11 = i10 + this.f20683u;
        int i12 = this.f20682t;
        if (i11 > i12) {
            i11 -= i12;
        }
        Calendar calendar = this.f20681s;
        calendar.set(7, i11);
        textView.setText(calendar.getDisplayName(7, f20680v, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public c(int i10) {
        Calendar d10 = a0.d(null);
        this.f20681s = d10;
        this.f20682t = d10.getMaximum(7);
        this.f20683u = i10;
    }
}
