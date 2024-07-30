package com.google.android.material.datepicker;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: MonthAdapter.java */
/* loaded from: classes2.dex */
public final class s extends BaseAdapter {
    public static final int y = a0.d(null).getMaximum(4);

    /* renamed from: z, reason: collision with root package name */
    public static final int f20726z = (a0.d(null).getMaximum(7) + a0.d(null).getMaximum(5)) - 1;

    /* renamed from: s, reason: collision with root package name */
    public final Month f20727s;

    /* renamed from: t, reason: collision with root package name */
    public final DateSelector<?> f20728t;

    /* renamed from: u, reason: collision with root package name */
    public Collection<Long> f20729u;

    /* renamed from: v, reason: collision with root package name */
    public b f20730v;

    /* renamed from: w, reason: collision with root package name */
    public final CalendarConstraints f20731w;

    /* renamed from: x, reason: collision with root package name */
    public final DayViewDecorator f20732x;

    public s(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f20727s = month;
        this.f20728t = dateSelector;
        this.f20731w = calendarConstraints;
        this.f20732x = dayViewDecorator;
        this.f20729u = dateSelector.m();
    }

    public final int a() {
        int i10 = this.f20731w.f20648w;
        Month month = this.f20727s;
        Calendar calendar = month.f20659s;
        int i11 = calendar.get(7);
        if (i10 <= 0) {
            i10 = calendar.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        if (i12 < 0) {
            return i12 + month.f20662v;
        }
        return i12;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i10) {
        if (i10 >= a()) {
            int a10 = a();
            Month month = this.f20727s;
            if (i10 <= (a10 + month.f20663w) - 1) {
                int a11 = (i10 - a()) + 1;
                Calendar b10 = a0.b(month.f20659s);
                b10.set(5, a11);
                return Long.valueOf(b10.getTimeInMillis());
            }
            return null;
        }
        return null;
    }

    public final void c(TextView textView, long j10, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String format;
        a aVar;
        boolean z14;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z15 = true;
        if (a0.c().getTimeInMillis() == j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        DateSelector<?> dateSelector = this.f20728t;
        Iterator<m0.c<Long, Long>> it = dateSelector.f().iterator();
        while (true) {
            if (it.hasNext()) {
                Long l10 = it.next().f32635a;
                if (l10 != null && l10.longValue() == j10) {
                    z11 = true;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        Iterator<m0.c<Long, Long>> it2 = dateSelector.f().iterator();
        while (true) {
            if (it2.hasNext()) {
                Long l11 = it2.next().f32636b;
                if (l11 != null && l11.longValue() == j10) {
                    z12 = true;
                    break;
                }
            } else {
                z12 = false;
                break;
            }
        }
        Calendar c10 = a0.c();
        Calendar d10 = a0.d(null);
        d10.setTimeInMillis(j10);
        if (c10.get(1) == d10.get(1)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", Locale.getDefault());
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            format = instanceForSkeleton.format(new Date(j10));
        } else {
            DateFormat instanceForSkeleton2 = DateFormat.getInstanceForSkeleton("yMMMEd", Locale.getDefault());
            instanceForSkeleton2.setTimeZone(TimeZone.getTimeZone("UTC"));
            format = instanceForSkeleton2.format(new Date(j10));
        }
        if (z10) {
            format = String.format(context.getString(R.string.mtrl_picker_today_description), format);
        }
        if (z11) {
            format = String.format(context.getString(R.string.mtrl_picker_start_date_description), format);
        } else if (z12) {
            format = String.format(context.getString(R.string.mtrl_picker_end_date_description), format);
        }
        textView.setContentDescription(format);
        if (this.f20731w.f20646u.b(j10)) {
            textView.setEnabled(true);
            Iterator<Long> it3 = dateSelector.m().iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (a0.a(j10) == a0.a(it3.next().longValue())) {
                        z14 = true;
                        break;
                    }
                } else {
                    z14 = false;
                    break;
                }
            }
            textView.setSelected(z14);
            if (z14) {
                aVar = this.f20730v.f20672b;
            } else {
                if (a0.c().getTimeInMillis() != j10) {
                    z15 = false;
                }
                if (z15) {
                    aVar = this.f20730v.f20673c;
                } else {
                    aVar = this.f20730v.f20671a;
                }
            }
        } else {
            textView.setEnabled(false);
            aVar = this.f20730v.f20676g;
        }
        if (this.f20732x != null && i10 != -1) {
            int i11 = this.f20727s.f20661u;
            aVar.b(textView);
            textView.setCompoundDrawables(null, null, null, null);
            textView.setContentDescription(format);
            return;
        }
        aVar.b(textView);
    }

    public final void d(MaterialCalendarGridView materialCalendarGridView, long j10) {
        Month c10 = Month.c(j10);
        Month month = this.f20727s;
        if (c10.equals(month)) {
            Calendar b10 = a0.b(month.f20659s);
            b10.setTimeInMillis(j10);
            int i10 = b10.get(5);
            c((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.getAdapter().a() + (i10 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j10, i10);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f20726z;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10 / this.f20727s.f20662v;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            com.google.android.material.datepicker.b r1 = r5.f20730v
            if (r1 != 0) goto Lf
            com.google.android.material.datepicker.b r1 = new com.google.android.material.datepicker.b
            r1.<init>(r0)
            r5.f20730v = r1
        Lf:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L27
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131558737(0x7f0d0151, float:1.8742798E38)
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r7 = r5.a()
            int r7 = r6 - r7
            if (r7 < 0) goto L5d
            com.google.android.material.datepicker.Month r8 = r5.f20727s
            int r2 = r8.f20663w
            if (r7 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L66
        L5d:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L66:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L6d
            goto L74
        L6d:
            long r1 = r6.longValue()
            r5.c(r0, r1, r7)
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.s.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
