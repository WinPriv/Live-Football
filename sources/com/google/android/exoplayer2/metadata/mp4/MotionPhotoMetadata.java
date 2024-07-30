package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.n;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final long f20067s;

    /* renamed from: t, reason: collision with root package name */
    public final long f20068t;

    /* renamed from: u, reason: collision with root package name */
    public final long f20069u;

    /* renamed from: v, reason: collision with root package name */
    public final long f20070v;

    /* renamed from: w, reason: collision with root package name */
    public final long f20071w;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<MotionPhotoMetadata> {
        @Override // android.os.Parcelable.Creator
        public final MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MotionPhotoMetadata[] newArray(int i10) {
            return new MotionPhotoMetadata[i10];
        }
    }

    public MotionPhotoMetadata(long j10, long j11, long j12, long j13, long j14) {
        this.f20067s = j10;
        this.f20068t = j11;
        this.f20069u = j12;
        this.f20070v = j13;
        this.f20071w = j14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        if (this.f20067s == motionPhotoMetadata.f20067s && this.f20068t == motionPhotoMetadata.f20068t && this.f20069u == motionPhotoMetadata.f20069u && this.f20070v == motionPhotoMetadata.f20070v && this.f20071w == motionPhotoMetadata.f20071w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return n.A0(this.f20071w) + ((n.A0(this.f20070v) + ((n.A0(this.f20069u) + ((n.A0(this.f20068t) + ((n.A0(this.f20067s) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f20067s + ", photoSize=" + this.f20068t + ", photoPresentationTimestampUs=" + this.f20069u + ", videoStartPosition=" + this.f20070v + ", videoSize=" + this.f20071w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f20067s);
        parcel.writeLong(this.f20068t);
        parcel.writeLong(this.f20069u);
        parcel.writeLong(this.f20070v);
        parcel.writeLong(this.f20071w);
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.f20067s = parcel.readLong();
        this.f20068t = parcel.readLong();
        this.f20069u = parcel.readLong();
        this.f20070v = parcel.readLong();
        this.f20071w = parcel.readLong();
    }
}
