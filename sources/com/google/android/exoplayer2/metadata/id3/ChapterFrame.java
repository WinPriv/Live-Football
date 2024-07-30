package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.g.b.c;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.g0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new a();

    /* renamed from: t, reason: collision with root package name */
    public final String f20031t;

    /* renamed from: u, reason: collision with root package name */
    public final int f20032u;

    /* renamed from: v, reason: collision with root package name */
    public final int f20033v;

    /* renamed from: w, reason: collision with root package name */
    public final long f20034w;

    /* renamed from: x, reason: collision with root package name */
    public final long f20035x;
    public final Id3Frame[] y;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<ChapterFrame> {
        @Override // android.os.Parcelable.Creator
        public final ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ChapterFrame[] newArray(int i10) {
            return new ChapterFrame[i10];
        }
    }

    public ChapterFrame(String str, int i10, int i11, long j10, long j11, Id3Frame[] id3FrameArr) {
        super(c.f8036a);
        this.f20031t = str;
        this.f20032u = i10;
        this.f20033v = i11;
        this.f20034w = j10;
        this.f20035x = j11;
        this.y = id3FrameArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        if (this.f20032u == chapterFrame.f20032u && this.f20033v == chapterFrame.f20033v && this.f20034w == chapterFrame.f20034w && this.f20035x == chapterFrame.f20035x && g0.a(this.f20031t, chapterFrame.f20031t) && Arrays.equals(this.y, chapterFrame.y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f20032u) * 31) + this.f20033v) * 31) + ((int) this.f20034w)) * 31) + ((int) this.f20035x)) * 31;
        String str = this.f20031t;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20031t);
        parcel.writeInt(this.f20032u);
        parcel.writeInt(this.f20033v);
        parcel.writeLong(this.f20034w);
        parcel.writeLong(this.f20035x);
        Id3Frame[] id3FrameArr = this.y;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super(c.f8036a);
        String readString = parcel.readString();
        int i10 = g0.f27302a;
        this.f20031t = readString;
        this.f20032u = parcel.readInt();
        this.f20033v = parcel.readInt();
        this.f20034w = parcel.readLong();
        this.f20035x = parcel.readLong();
        int readInt = parcel.readInt();
        this.y = new Id3Frame[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.y[i11] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
