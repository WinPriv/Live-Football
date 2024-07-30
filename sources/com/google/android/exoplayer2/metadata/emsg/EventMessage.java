package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.k.o;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.g0;
import java.util.Arrays;
import k4.i0;

/* loaded from: classes2.dex */
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR;
    public static final i0 y;

    /* renamed from: z, reason: collision with root package name */
    public static final i0 f20001z;

    /* renamed from: s, reason: collision with root package name */
    public final String f20002s;

    /* renamed from: t, reason: collision with root package name */
    public final String f20003t;

    /* renamed from: u, reason: collision with root package name */
    public final long f20004u;

    /* renamed from: v, reason: collision with root package name */
    public final long f20005v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f20006w;

    /* renamed from: x, reason: collision with root package name */
    public int f20007x;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<EventMessage> {
        @Override // android.os.Parcelable.Creator
        public final EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EventMessage[] newArray(int i10) {
            return new EventMessage[i10];
        }
    }

    static {
        i0.a aVar = new i0.a();
        aVar.f30534k = o.V;
        y = aVar.a();
        i0.a aVar2 = new i0.a();
        aVar2.f30534k = o.ag;
        f20001z = aVar2.a();
        CREATOR = new a();
    }

    public EventMessage(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f20002s = str;
        this.f20003t = str2;
        this.f20004u = j10;
        this.f20005v = j11;
        this.f20006w = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final byte[] S() {
        if (g() != null) {
            return this.f20006w;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        if (this.f20004u == eventMessage.f20004u && this.f20005v == eventMessage.f20005v && g0.a(this.f20002s, eventMessage.f20002s) && g0.a(this.f20003t, eventMessage.f20003t) && Arrays.equals(this.f20006w, eventMessage.f20006w)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final i0 g() {
        String str = this.f20002s;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return f20001z;
            case 1:
            case 2:
                return y;
            default:
                return null;
        }
    }

    public final int hashCode() {
        int i10;
        if (this.f20007x == 0) {
            int i11 = 0;
            String str = this.f20002s;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i10) * 31;
            String str2 = this.f20003t;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            int i13 = (i12 + i11) * 31;
            long j10 = this.f20004u;
            int i14 = (i13 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f20005v;
            this.f20007x = Arrays.hashCode(this.f20006w) + ((i14 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f20007x;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f20002s + ", id=" + this.f20005v + ", durationMs=" + this.f20004u + ", value=" + this.f20003t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20002s);
        parcel.writeString(this.f20003t);
        parcel.writeLong(this.f20004u);
        parcel.writeLong(this.f20005v);
        parcel.writeByteArray(this.f20006w);
    }

    public EventMessage(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = g0.f27302a;
        this.f20002s = readString;
        this.f20003t = parcel.readString();
        this.f20004u = parcel.readLong();
        this.f20005v = parcel.readLong();
        this.f20006w = parcel.createByteArray();
    }
}
