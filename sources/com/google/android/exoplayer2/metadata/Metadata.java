package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.n;
import com.anythink.expressad.exoplayer.b;
import java.util.Arrays;
import java.util.List;
import k4.i0;
import k4.o0;

/* loaded from: classes2.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final Entry[] f19997s;

    /* renamed from: t, reason: collision with root package name */
    public final long f19998t;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<Metadata> {
        @Override // android.os.Parcelable.Creator
        public final Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Metadata[] newArray(int i10) {
            return new Metadata[i10];
        }
    }

    public Metadata() {
        throw null;
    }

    public Metadata(Entry... entryArr) {
        this(b.f7291b, entryArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        if (Arrays.equals(this.f19997s, metadata.f19997s) && this.f19998t == metadata.f19998t) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return n.A0(this.f19998t) + (Arrays.hashCode(this.f19997s) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f19997s));
        long j10 = this.f19998t;
        if (j10 == b.f7291b) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Entry[] entryArr = this.f19997s;
        parcel.writeInt(entryArr.length);
        for (Entry entry : entryArr) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.f19998t);
    }

    public Metadata(long j10, Entry... entryArr) {
        this.f19998t = j10;
        this.f19997s = entryArr;
    }

    public Metadata(List<? extends Entry> list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Parcel parcel) {
        this.f19997s = new Entry[parcel.readInt()];
        int i10 = 0;
        while (true) {
            Entry[] entryArr = this.f19997s;
            if (i10 < entryArr.length) {
                entryArr[i10] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i10++;
            } else {
                this.f19998t = parcel.readLong();
                return;
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface Entry extends Parcelable {
        default byte[] S() {
            return null;
        }

        default i0 g() {
            return null;
        }

        default void h(o0.a aVar) {
        }
    }
}
