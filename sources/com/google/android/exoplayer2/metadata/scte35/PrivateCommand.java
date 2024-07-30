package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import d6.g0;

/* loaded from: classes2.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final long f20078s;

    /* renamed from: t, reason: collision with root package name */
    public final long f20079t;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f20080u;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<PrivateCommand> {
        @Override // android.os.Parcelable.Creator
        public final PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PrivateCommand[] newArray(int i10) {
            return new PrivateCommand[i10];
        }
    }

    public PrivateCommand(long j10, byte[] bArr, long j11) {
        this.f20078s = j11;
        this.f20079t = j10;
        this.f20080u = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f20078s);
        parcel.writeLong(this.f20079t);
        parcel.writeByteArray(this.f20080u);
    }

    public PrivateCommand(Parcel parcel) {
        this.f20078s = parcel.readLong();
        this.f20079t = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i10 = g0.f27302a;
        this.f20080u = createByteArray;
    }
}
