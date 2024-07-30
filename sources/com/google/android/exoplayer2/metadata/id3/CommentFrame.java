package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.g.b.e;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.g0;

/* loaded from: classes2.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new a();

    /* renamed from: t, reason: collision with root package name */
    public final String f20041t;

    /* renamed from: u, reason: collision with root package name */
    public final String f20042u;

    /* renamed from: v, reason: collision with root package name */
    public final String f20043v;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<CommentFrame> {
        @Override // android.os.Parcelable.Creator
        public final CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CommentFrame[] newArray(int i10) {
            return new CommentFrame[i10];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super(e.f8047a);
        this.f20041t = str;
        this.f20042u = str2;
        this.f20043v = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        if (g0.a(this.f20042u, commentFrame.f20042u) && g0.a(this.f20041t, commentFrame.f20041t) && g0.a(this.f20043v, commentFrame.f20043v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f20041t;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i10) * 31;
        String str2 = this.f20042u;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f20043v;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f20048s + ": language=" + this.f20041t + ", description=" + this.f20042u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20048s);
        parcel.writeString(this.f20041t);
        parcel.writeString(this.f20043v);
    }

    public CommentFrame(Parcel parcel) {
        super(e.f8047a);
        String readString = parcel.readString();
        int i10 = g0.f27302a;
        this.f20041t = readString;
        this.f20042u = parcel.readString();
        this.f20043v = parcel.readString();
    }
}
