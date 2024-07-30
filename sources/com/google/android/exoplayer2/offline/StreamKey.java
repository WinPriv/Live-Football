package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final int f20116s;

    /* renamed from: t, reason: collision with root package name */
    public final int f20117t;

    /* renamed from: u, reason: collision with root package name */
    public final int f20118u;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<StreamKey> {
        @Override // android.os.Parcelable.Creator
        public final StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StreamKey[] newArray(int i10) {
            return new StreamKey[i10];
        }
    }

    public StreamKey() {
        this.f20116s = -1;
        this.f20117t = -1;
        this.f20118u = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i10 = this.f20116s - streamKey2.f20116s;
        if (i10 == 0) {
            int i11 = this.f20117t - streamKey2.f20117t;
            if (i11 == 0) {
                return this.f20118u - streamKey2.f20118u;
            }
            return i11;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        if (this.f20116s == streamKey.f20116s && this.f20117t == streamKey.f20117t && this.f20118u == streamKey.f20118u) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f20116s * 31) + this.f20117t) * 31) + this.f20118u;
    }

    public final String toString() {
        return this.f20116s + "." + this.f20117t + "." + this.f20118u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20116s);
        parcel.writeInt(this.f20117t);
        parcel.writeInt(this.f20118u);
    }

    public StreamKey(Parcel parcel) {
        this.f20116s = parcel.readInt();
        this.f20117t = parcel.readInt();
        this.f20118u = parcel.readInt();
    }
}
