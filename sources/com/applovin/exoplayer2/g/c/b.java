package com.applovin.exoplayer2.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ai;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import e0.i;

/* loaded from: classes.dex */
public final class b implements a.InterfaceC0172a {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.applovin.exoplayer2.g.c.b.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f15121a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15122b;

    public b(String str, String str2) {
        this.f15121a = str;
        this.f15122b = str2;
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0172a
    public void a(ac.a aVar) {
        String str = this.f15121a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                aVar.c(this.f15122b);
                return;
            case 1:
                aVar.a(this.f15122b);
                return;
            case 2:
                aVar.g(this.f15122b);
                return;
            case 3:
                aVar.d(this.f15122b);
                return;
            case 4:
                aVar.b(this.f15122b);
                return;
            default:
                return;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f15121a.equals(bVar.f15121a) && this.f15122b.equals(bVar.f15122b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f15122b.hashCode() + i.b(this.f15121a, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    public String toString() {
        return "VC: " + this.f15121a + ContainerUtils.KEY_VALUE_DELIMITER + this.f15122b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15121a);
        parcel.writeString(this.f15122b);
    }

    public b(Parcel parcel) {
        this.f15121a = (String) ai.a(parcel.readString());
        this.f15122b = (String) ai.a(parcel.readString());
    }
}
