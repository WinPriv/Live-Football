package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class SpliceNullCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceNullCommand> CREATOR = new a();

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<SpliceNullCommand> {
        @Override // android.os.Parcelable.Creator
        public final SpliceNullCommand createFromParcel(Parcel parcel) {
            return new SpliceNullCommand();
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceNullCommand[] newArray(int i10) {
            return new SpliceNullCommand[i10];
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
    }
}
