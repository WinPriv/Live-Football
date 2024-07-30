package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.g.b.d;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.g0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new a();

    /* renamed from: t, reason: collision with root package name */
    public final String f20036t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f20037u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f20038v;

    /* renamed from: w, reason: collision with root package name */
    public final String[] f20039w;

    /* renamed from: x, reason: collision with root package name */
    public final Id3Frame[] f20040x;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<ChapterTocFrame> {
        @Override // android.os.Parcelable.Creator
        public final ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ChapterTocFrame[] newArray(int i10) {
            return new ChapterTocFrame[i10];
        }
    }

    public ChapterTocFrame(String str, boolean z10, boolean z11, String[] strArr, Id3Frame[] id3FrameArr) {
        super(d.f8042a);
        this.f20036t = str;
        this.f20037u = z10;
        this.f20038v = z11;
        this.f20039w = strArr;
        this.f20040x = id3FrameArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        if (this.f20037u == chapterTocFrame.f20037u && this.f20038v == chapterTocFrame.f20038v && g0.a(this.f20036t, chapterTocFrame.f20036t) && Arrays.equals(this.f20039w, chapterTocFrame.f20039w) && Arrays.equals(this.f20040x, chapterTocFrame.f20040x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (this.f20037u ? 1 : 0)) * 31) + (this.f20038v ? 1 : 0)) * 31;
        String str = this.f20036t;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20036t);
        parcel.writeByte(this.f20037u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f20038v ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f20039w);
        Id3Frame[] id3FrameArr = this.f20040x;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super(d.f8042a);
        String readString = parcel.readString();
        int i10 = g0.f27302a;
        this.f20036t = readString;
        this.f20037u = parcel.readByte() != 0;
        this.f20038v = parcel.readByte() != 0;
        this.f20039w = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f20040x = new Id3Frame[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f20040x[i11] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
