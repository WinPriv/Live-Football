package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.b;
import d6.w;

/* loaded from: classes2.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final long f20104s;

    /* renamed from: t, reason: collision with root package name */
    public final long f20105t;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<TimeSignalCommand> {
        @Override // android.os.Parcelable.Creator
        public final TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final TimeSignalCommand[] newArray(int i10) {
            return new TimeSignalCommand[i10];
        }
    }

    public TimeSignalCommand(long j10, long j11) {
        this.f20104s = j10;
        this.f20105t = j11;
    }

    public static long a(long j10, w wVar) {
        long t10 = wVar.t();
        if ((128 & t10) != 0) {
            return 8589934591L & ((((t10 & 1) << 32) | wVar.u()) + j10);
        }
        return b.f7291b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f20104s);
        parcel.writeLong(this.f20105t);
    }
}
