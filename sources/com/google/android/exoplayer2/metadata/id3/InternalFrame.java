package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.g.b.i;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.g0;

/* loaded from: classes2.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new a();

    /* renamed from: t, reason: collision with root package name */
    public final String f20049t;

    /* renamed from: u, reason: collision with root package name */
    public final String f20050u;

    /* renamed from: v, reason: collision with root package name */
    public final String f20051v;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<InternalFrame> {
        @Override // android.os.Parcelable.Creator
        public final InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final InternalFrame[] newArray(int i10) {
            return new InternalFrame[i10];
        }
    }

    public InternalFrame(String str, String str2, String str3) {
        super(i.f8075a);
        this.f20049t = str;
        this.f20050u = str2;
        this.f20051v = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        if (g0.a(this.f20050u, internalFrame.f20050u) && g0.a(this.f20049t, internalFrame.f20049t) && g0.a(this.f20051v, internalFrame.f20051v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f20049t;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i10) * 31;
        String str2 = this.f20050u;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f20051v;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f20048s + ": domain=" + this.f20049t + ", description=" + this.f20050u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20048s);
        parcel.writeString(this.f20049t);
        parcel.writeString(this.f20051v);
    }

    public InternalFrame(Parcel parcel) {
        super(i.f8075a);
        String readString = parcel.readString();
        int i10 = g0.f27302a;
        this.f20049t = readString;
        this.f20050u = parcel.readString();
        this.f20051v = parcel.readString();
    }
}
