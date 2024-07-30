package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.g0;
import e0.i;

/* loaded from: classes2.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new a();

    /* renamed from: t, reason: collision with root package name */
    public final String f20061t;

    /* renamed from: u, reason: collision with root package name */
    public final String f20062u;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<UrlLinkFrame> {
        @Override // android.os.Parcelable.Creator
        public final UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UrlLinkFrame[] newArray(int i10) {
            return new UrlLinkFrame[i10];
        }
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f20061t = str2;
        this.f20062u = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        if (this.f20048s.equals(urlLinkFrame.f20048s) && g0.a(this.f20061t, urlLinkFrame.f20061t) && g0.a(this.f20062u, urlLinkFrame.f20062u)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int b10 = i.b(this.f20048s, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        int i11 = 0;
        String str = this.f20061t;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (b10 + i10) * 31;
        String str2 = this.f20062u;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f20048s + ": url=" + this.f20062u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20048s);
        parcel.writeString(this.f20061t);
        parcel.writeString(this.f20062u);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UrlLinkFrame(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = d6.g0.f27302a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f20061t = r0
            java.lang.String r3 = r3.readString()
            r2.f20062u = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.UrlLinkFrame.<init>(android.os.Parcel):void");
    }
}
