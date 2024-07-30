package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import d6.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final List<Segment> f20072s;

    /* loaded from: classes2.dex */
    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR = new a();

        /* renamed from: s, reason: collision with root package name */
        public final long f20073s;

        /* renamed from: t, reason: collision with root package name */
        public final long f20074t;

        /* renamed from: u, reason: collision with root package name */
        public final int f20075u;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.Creator<Segment> {
            @Override // android.os.Parcelable.Creator
            public final Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Segment[] newArray(int i10) {
                return new Segment[i10];
            }
        }

        public Segment(long j10, long j11, int i10) {
            boolean z10;
            if (j10 < j11) {
                z10 = true;
            } else {
                z10 = false;
            }
            d6.a.a(z10);
            this.f20073s = j10;
            this.f20074t = j11;
            this.f20075u = i10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            if (this.f20073s == segment.f20073s && this.f20074t == segment.f20074t && this.f20075u == segment.f20075u) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f20073s), Long.valueOf(this.f20074t), Integer.valueOf(this.f20075u)});
        }

        public final String toString() {
            return g0.l("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f20073s), Long.valueOf(this.f20074t), Integer.valueOf(this.f20075u));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f20073s);
            parcel.writeLong(this.f20074t);
            parcel.writeInt(this.f20075u);
        }
    }

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<SlowMotionData> {
        @Override // android.os.Parcelable.Creator
        public final SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SlowMotionData[] newArray(int i10) {
            return new SlowMotionData[i10];
        }
    }

    public SlowMotionData(ArrayList arrayList) {
        this.f20072s = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((Segment) arrayList.get(0)).f20074t;
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((Segment) arrayList.get(i10)).f20073s < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = ((Segment) arrayList.get(i10)).f20074t;
                    i10++;
                }
            }
        }
        d6.a.a(!z10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SlowMotionData.class == obj.getClass()) {
            return this.f20072s.equals(((SlowMotionData) obj).f20072s);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20072s.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f20072s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f20072s);
    }
}
