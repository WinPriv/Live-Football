package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final Month f20644s;

    /* renamed from: t, reason: collision with root package name */
    public final Month f20645t;

    /* renamed from: u, reason: collision with root package name */
    public final DateValidator f20646u;

    /* renamed from: v, reason: collision with root package name */
    public final Month f20647v;

    /* renamed from: w, reason: collision with root package name */
    public final int f20648w;

    /* renamed from: x, reason: collision with root package name */
    public final int f20649x;
    public final int y;

    /* loaded from: classes2.dex */
    public interface DateValidator extends Parcelable {
        boolean b(long j10);
    }

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        public final CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CalendarConstraints[] newArray(int i10) {
            return new CalendarConstraints[i10];
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public static final long f = a0.a(Month.a(1900, 0).f20664x);

        /* renamed from: g, reason: collision with root package name */
        public static final long f20650g = a0.a(Month.a(2100, 11).f20664x);

        /* renamed from: a, reason: collision with root package name */
        public final long f20651a;

        /* renamed from: b, reason: collision with root package name */
        public final long f20652b;

        /* renamed from: c, reason: collision with root package name */
        public Long f20653c;

        /* renamed from: d, reason: collision with root package name */
        public final int f20654d;

        /* renamed from: e, reason: collision with root package name */
        public final DateValidator f20655e;

        public b(CalendarConstraints calendarConstraints) {
            this.f20651a = f;
            this.f20652b = f20650g;
            this.f20655e = new DateValidatorPointForward(Long.MIN_VALUE);
            this.f20651a = calendarConstraints.f20644s.f20664x;
            this.f20652b = calendarConstraints.f20645t.f20664x;
            this.f20653c = Long.valueOf(calendarConstraints.f20647v.f20664x);
            this.f20654d = calendarConstraints.f20648w;
            this.f20655e = calendarConstraints.f20646u;
        }
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f20644s = month;
        this.f20645t = month2;
        this.f20647v = month3;
        this.f20648w = i10;
        this.f20646u = dateValidator;
        Calendar calendar = month.f20659s;
        if (month3 != null && calendar.compareTo(month3.f20659s) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.f20659s.compareTo(month2.f20659s) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 >= 0 && i10 <= a0.d(null).getMaximum(7)) {
            if (calendar instanceof GregorianCalendar) {
                int i11 = month2.f20661u;
                int i12 = month.f20661u;
                this.y = (month2.f20660t - month.f20660t) + ((i11 - i12) * 12) + 1;
                this.f20649x = (i11 - i12) + 1;
                return;
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        if (this.f20644s.equals(calendarConstraints.f20644s) && this.f20645t.equals(calendarConstraints.f20645t) && m0.b.a(this.f20647v, calendarConstraints.f20647v) && this.f20648w == calendarConstraints.f20648w && this.f20646u.equals(calendarConstraints.f20646u)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20644s, this.f20645t, this.f20647v, Integer.valueOf(this.f20648w), this.f20646u});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f20644s, 0);
        parcel.writeParcelable(this.f20645t, 0);
        parcel.writeParcelable(this.f20647v, 0);
        parcel.writeParcelable(this.f20646u, 0);
        parcel.writeInt(this.f20648w);
    }
}
