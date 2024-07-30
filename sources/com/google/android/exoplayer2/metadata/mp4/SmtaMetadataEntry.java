package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final float f20076s;

    /* renamed from: t, reason: collision with root package name */
    public final int f20077t;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<SmtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public final SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SmtaMetadataEntry[] newArray(int i10) {
            return new SmtaMetadataEntry[i10];
        }
    }

    public SmtaMetadataEntry(float f, int i10) {
        this.f20076s = f;
        this.f20077t = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        if (this.f20076s == smtaMetadataEntry.f20076s && this.f20077t == smtaMetadataEntry.f20077t) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f20076s).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f20077t;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f20076s + ", svcTemporalLayerCount=" + this.f20077t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f20076s);
        parcel.writeInt(this.f20077t);
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.f20076s = parcel.readFloat();
        this.f20077t = parcel.readInt();
    }
}
