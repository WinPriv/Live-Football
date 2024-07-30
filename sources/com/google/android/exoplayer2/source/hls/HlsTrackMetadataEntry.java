package com.google.android.exoplayer2.source.hls;

import a3.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final String f20202s;

    /* renamed from: t, reason: collision with root package name */
    public final String f20203t;

    /* renamed from: u, reason: collision with root package name */
    public final List<VariantInfo> f20204u;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<HlsTrackMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public final HlsTrackMetadataEntry createFromParcel(Parcel parcel) {
            return new HlsTrackMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final HlsTrackMetadataEntry[] newArray(int i10) {
            return new HlsTrackMetadataEntry[i10];
        }
    }

    public HlsTrackMetadataEntry(String str, String str2, List<VariantInfo> list) {
        this.f20202s = str;
        this.f20203t = str2;
        this.f20204u = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HlsTrackMetadataEntry.class != obj.getClass()) {
            return false;
        }
        HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) obj;
        if (TextUtils.equals(this.f20202s, hlsTrackMetadataEntry.f20202s) && TextUtils.equals(this.f20203t, hlsTrackMetadataEntry.f20203t) && this.f20204u.equals(hlsTrackMetadataEntry.f20204u)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f20202s;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f20203t;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return this.f20204u.hashCode() + ((i12 + i11) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f20202s;
        if (str2 != null) {
            str = l.p(l.s(" [", str2, ", "), this.f20203t, "]");
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20202s);
        parcel.writeString(this.f20203t);
        List<VariantInfo> list = this.f20204u;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable(list.get(i11), 0);
        }
    }

    public HlsTrackMetadataEntry(Parcel parcel) {
        this.f20202s = parcel.readString();
        this.f20203t = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add((VariantInfo) parcel.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.f20204u = Collections.unmodifiableList(arrayList);
    }

    /* loaded from: classes2.dex */
    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = new a();

        /* renamed from: s, reason: collision with root package name */
        public final int f20205s;

        /* renamed from: t, reason: collision with root package name */
        public final int f20206t;

        /* renamed from: u, reason: collision with root package name */
        public final String f20207u;

        /* renamed from: v, reason: collision with root package name */
        public final String f20208v;

        /* renamed from: w, reason: collision with root package name */
        public final String f20209w;

        /* renamed from: x, reason: collision with root package name */
        public final String f20210x;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.Creator<VariantInfo> {
            @Override // android.os.Parcelable.Creator
            public final VariantInfo createFromParcel(Parcel parcel) {
                return new VariantInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final VariantInfo[] newArray(int i10) {
                return new VariantInfo[i10];
            }
        }

        public VariantInfo(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f20205s = i10;
            this.f20206t = i11;
            this.f20207u = str;
            this.f20208v = str2;
            this.f20209w = str3;
            this.f20210x = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || VariantInfo.class != obj.getClass()) {
                return false;
            }
            VariantInfo variantInfo = (VariantInfo) obj;
            if (this.f20205s == variantInfo.f20205s && this.f20206t == variantInfo.f20206t && TextUtils.equals(this.f20207u, variantInfo.f20207u) && TextUtils.equals(this.f20208v, variantInfo.f20208v) && TextUtils.equals(this.f20209w, variantInfo.f20209w) && TextUtils.equals(this.f20210x, variantInfo.f20210x)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i10;
            int i11;
            int i12;
            int i13 = ((this.f20205s * 31) + this.f20206t) * 31;
            int i14 = 0;
            String str = this.f20207u;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i15 = (i13 + i10) * 31;
            String str2 = this.f20208v;
            if (str2 != null) {
                i11 = str2.hashCode();
            } else {
                i11 = 0;
            }
            int i16 = (i15 + i11) * 31;
            String str3 = this.f20209w;
            if (str3 != null) {
                i12 = str3.hashCode();
            } else {
                i12 = 0;
            }
            int i17 = (i16 + i12) * 31;
            String str4 = this.f20210x;
            if (str4 != null) {
                i14 = str4.hashCode();
            }
            return i17 + i14;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f20205s);
            parcel.writeInt(this.f20206t);
            parcel.writeString(this.f20207u);
            parcel.writeString(this.f20208v);
            parcel.writeString(this.f20209w);
            parcel.writeString(this.f20210x);
        }

        public VariantInfo(Parcel parcel) {
            this.f20205s = parcel.readInt();
            this.f20206t = parcel.readInt();
            this.f20207u = parcel.readString();
            this.f20208v = parcel.readString();
            this.f20209w = parcel.readString();
            this.f20210x = parcel.readString();
        }
    }
}
