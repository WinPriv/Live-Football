package com.applovin.exoplayer2.g.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.common.a.n;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements a.InterfaceC0172a {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: com.applovin.exoplayer2.g.f.c.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, a.class.getClassLoader());
            return new c(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    };

    /* renamed from: a */
    public final List<a> f15194a;

    public c(List<a> list) {
        this.f15194a = list;
        com.applovin.exoplayer2.l.a.a(!a(list));
    }

    private static boolean a(List<a> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = list.get(0).f15197c;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (list.get(i10).f15196b < j10) {
                return true;
            }
            j10 = list.get(i10).f15197c;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            return this.f15194a.equals(((c) obj).f15194a);
        }
        return false;
    }

    public int hashCode() {
        return this.f15194a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f15194a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f15194a);
    }

    /* renamed from: com.applovin.exoplayer2.g.f.c$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, a.class.getClassLoader());
            return new c(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class a implements Parcelable {

        /* renamed from: b */
        public final long f15196b;

        /* renamed from: c */
        public final long f15197c;

        /* renamed from: d */
        public final int f15198d;

        /* renamed from: a */
        public static final Comparator<a> f15195a = new e(0);
        public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.g.f.c.a.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        };

        public a(long j10, long j11, int i10) {
            boolean z10;
            if (j10 < j11) {
                z10 = true;
            } else {
                z10 = false;
            }
            com.applovin.exoplayer2.l.a.a(z10);
            this.f15196b = j10;
            this.f15197c = j11;
            this.f15198d = i10;
        }

        public static /* synthetic */ int a(a aVar, a aVar2) {
            return n.a().a(aVar.f15196b, aVar2.f15196b).a(aVar.f15197c, aVar2.f15197c).a(aVar.f15198d, aVar2.f15198d).b();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f15196b == aVar.f15196b && this.f15197c == aVar.f15197c && this.f15198d == aVar.f15198d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.f15196b), Long.valueOf(this.f15197c), Integer.valueOf(this.f15198d));
        }

        public String toString() {
            return ai.a("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f15196b), Long.valueOf(this.f15197c), Integer.valueOf(this.f15198d));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f15196b);
            parcel.writeLong(this.f15197c);
            parcel.writeInt(this.f15198d);
        }

        /* renamed from: com.applovin.exoplayer2.g.f.c$a$1 */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }
    }
}
