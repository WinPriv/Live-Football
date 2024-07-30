package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.openalliance.ad.constant.w;
import d6.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final String f20106s;

    /* renamed from: t, reason: collision with root package name */
    public final Uri f20107t;

    /* renamed from: u, reason: collision with root package name */
    public final String f20108u;

    /* renamed from: v, reason: collision with root package name */
    public final List<StreamKey> f20109v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f20110w;

    /* renamed from: x, reason: collision with root package name */
    public final String f20111x;
    public final byte[] y;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<DownloadRequest> {
        @Override // android.os.Parcelable.Creator
        public final DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DownloadRequest[] newArray(int i10) {
            return new DownloadRequest[i10];
        }
    }

    public DownloadRequest(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = g0.f27302a;
        this.f20106s = readString;
        this.f20107t = Uri.parse(parcel.readString());
        this.f20108u = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f20109v = Collections.unmodifiableList(arrayList);
        this.f20110w = parcel.createByteArray();
        this.f20111x = parcel.readString();
        this.y = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        if (!this.f20106s.equals(downloadRequest.f20106s) || !this.f20107t.equals(downloadRequest.f20107t) || !g0.a(this.f20108u, downloadRequest.f20108u) || !this.f20109v.equals(downloadRequest.f20109v) || !Arrays.equals(this.f20110w, downloadRequest.f20110w) || !g0.a(this.f20111x, downloadRequest.f20111x) || !Arrays.equals(this.y, downloadRequest.y)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f20107t.hashCode() + (this.f20106s.hashCode() * 31 * 31)) * 31;
        int i11 = 0;
        String str = this.f20108u;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = (Arrays.hashCode(this.f20110w) + ((this.f20109v.hashCode() + ((hashCode + i10) * 31)) * 31)) * 31;
        String str2 = this.f20111x;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Arrays.hashCode(this.y) + ((hashCode2 + i11) * 31);
    }

    public final String toString() {
        return this.f20108u + w.bE + this.f20106s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20106s);
        parcel.writeString(this.f20107t.toString());
        parcel.writeString(this.f20108u);
        List<StreamKey> list = this.f20109v;
        parcel.writeInt(list.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            parcel.writeParcelable(list.get(i11), 0);
        }
        parcel.writeByteArray(this.f20110w);
        parcel.writeString(this.f20111x);
        parcel.writeByteArray(this.y);
    }
}
