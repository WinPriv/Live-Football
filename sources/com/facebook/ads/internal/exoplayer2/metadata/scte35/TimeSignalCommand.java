package com.facebook.ads.internal.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.b;
import com.facebook.ads.redexgen.X.C0936Hh;
import com.facebook.ads.redexgen.X.DR;
import com.facebook.ads.redexgen.X.HV;

/* loaded from: assets/audience_network.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new DR();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j10, long j11) {
        this.A01 = j10;
        this.A00 = j11;
    }

    public /* synthetic */ TimeSignalCommand(long j10, long j11, DR dr) {
        this(j10, j11);
    }

    public static long A00(HV hv, long j10) {
        long A0E = hv.A0E();
        if ((128 & A0E) == 0) {
            return b.f7291b;
        }
        long ptsTime = 1 & A0E;
        long firstByte = hv.A0M();
        return (((ptsTime << 32) | firstByte) + j10) & 8589934591L;
    }

    public static TimeSignalCommand A01(HV hv, long j10, C0936Hh c0936Hh) {
        long A00 = A00(hv, j10);
        return new TimeSignalCommand(A00, c0936Hh.A07(A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
