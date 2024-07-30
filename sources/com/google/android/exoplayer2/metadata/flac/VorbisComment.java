package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.g0;
import e0.i;
import k4.o0;

@Deprecated
/* loaded from: classes2.dex */
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final String f20015s;

    /* renamed from: t, reason: collision with root package name */
    public final String f20016t;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<VorbisComment> {
        @Override // android.os.Parcelable.Creator
        public final VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VorbisComment[] newArray(int i10) {
            return new VorbisComment[i10];
        }
    }

    public VorbisComment(String str, String str2) {
        this.f20015s = str;
        this.f20016t = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        if (this.f20015s.equals(vorbisComment.f20015s) && this.f20016t.equals(vorbisComment.f20016t)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void h(o0.a aVar) {
        char c10;
        String str = this.f20015s;
        str.getClass();
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        String str2 = this.f20016t;
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 == 4) {
                            aVar.f30693b = str2;
                            return;
                        }
                        return;
                    }
                    aVar.f30695d = str2;
                    return;
                }
                aVar.f30697g = str2;
                return;
            }
            aVar.f30692a = str2;
            return;
        }
        aVar.f30694c = str2;
    }

    public final int hashCode() {
        return this.f20016t.hashCode() + i.b(this.f20015s, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    public final String toString() {
        return "VC: " + this.f20015s + ContainerUtils.KEY_VALUE_DELIMITER + this.f20016t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20015s);
        parcel.writeString(this.f20016t);
    }

    public VorbisComment(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = g0.f27302a;
        this.f20015s = readString;
        this.f20016t = parcel.readString();
    }
}
