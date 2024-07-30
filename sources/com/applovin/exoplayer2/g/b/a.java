package com.applovin.exoplayer2.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.k.o;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements a.InterfaceC0172a {

    /* renamed from: a, reason: collision with root package name */
    public final String f15105a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15106b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15107c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15108d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f15109e;

    /* renamed from: h, reason: collision with root package name */
    private int f15110h;
    private static final v f = new v.a().f(o.V).a();

    /* renamed from: g, reason: collision with root package name */
    private static final v f15104g = new v.a().f(o.ag).a();
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.g.b.a.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    };

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f15105a = str;
        this.f15106b = str2;
        this.f15107c = j10;
        this.f15108d = j11;
        this.f15109e = bArr;
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0172a
    public v a() {
        String str = this.f15105a;
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
                return f15104g;
            case 1:
            case 2:
                return f;
            default:
                return null;
        }
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0172a
    public byte[] b() {
        if (a() != null) {
            return this.f15109e;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f15107c == aVar.f15107c && this.f15108d == aVar.f15108d && ai.a((Object) this.f15105a, (Object) aVar.f15105a) && ai.a((Object) this.f15106b, (Object) aVar.f15106b) && Arrays.equals(this.f15109e, aVar.f15109e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        if (this.f15110h == 0) {
            String str = this.f15105a;
            int i11 = 0;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i10) * 31;
            String str2 = this.f15106b;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            long j10 = this.f15107c;
            int i13 = (((i12 + i11) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f15108d;
            this.f15110h = Arrays.hashCode(this.f15109e) + ((i13 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f15110h;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f15105a + ", id=" + this.f15108d + ", durationMs=" + this.f15107c + ", value=" + this.f15106b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15105a);
        parcel.writeString(this.f15106b);
        parcel.writeLong(this.f15107c);
        parcel.writeLong(this.f15108d);
        parcel.writeByteArray(this.f15109e);
    }

    public a(Parcel parcel) {
        this.f15105a = (String) ai.a(parcel.readString());
        this.f15106b = (String) ai.a(parcel.readString());
        this.f15107c = parcel.readLong();
        this.f15108d = parcel.readLong();
        this.f15109e = (byte[]) ai.a(parcel.createByteArray());
    }
}
