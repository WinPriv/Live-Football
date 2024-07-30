package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;

/* loaded from: classes2.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final Calendar f20659s;

    /* renamed from: t, reason: collision with root package name */
    public final int f20660t;

    /* renamed from: u, reason: collision with root package name */
    public final int f20661u;

    /* renamed from: v, reason: collision with root package name */
    public final int f20662v;

    /* renamed from: w, reason: collision with root package name */
    public final int f20663w;

    /* renamed from: x, reason: collision with root package name */
    public final long f20664x;
    public String y;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        public final Month createFromParcel(Parcel parcel) {
            return Month.a(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Month[] newArray(int i10) {
            return new Month[i10];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b10 = a0.b(calendar);
        this.f20659s = b10;
        this.f20660t = b10.get(2);
        this.f20661u = b10.get(1);
        this.f20662v = b10.getMaximum(7);
        this.f20663w = b10.getActualMaximum(5);
        this.f20664x = b10.getTimeInMillis();
    }

    public static Month a(int i10, int i11) {
        Calendar d10 = a0.d(null);
        d10.set(1, i10);
        d10.set(2, i11);
        return new Month(d10);
    }

    public static Month c(long j10) {
        Calendar d10 = a0.d(null);
        d10.setTimeInMillis(j10);
        return new Month(d10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Month month) {
        return this.f20659s.compareTo(month.f20659s);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.f20660t == month.f20660t && this.f20661u == month.f20661u) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f20660t), Integer.valueOf(this.f20661u)});
    }

    public final String k() {
        if (this.y == null) {
            this.y = DateUtils.formatDateTime(null, this.f20659s.getTimeInMillis(), 8228);
        }
        return this.y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20661u);
        parcel.writeInt(this.f20660t);
    }
}
