package com.facebook.ads.internal.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.DO;
import com.facebook.ads.redexgen.X.DQ;
import com.facebook.ads.redexgen.X.HV;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static String[] A01 = {"it7lS", "DDMagQqfA6bdQNmcbGVHnHFBEyEyV1CV", "yj1Kd0vDyL1u2mFRENQtUt5M23mLahBX", "Jtl9O", "DzPPQsDVYOU8bWKOfUnj4CDUSnJ2WnBZ", "jfx4iKnVrCrKgyd9K0RyokJ5bMLL728G", "aEdAaZwrqc10hFo35SyTbuIH90C1HKve", "av2CnTBgmmUyqozc6FxJU9F0Qf7BUN36"};
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new DO();
    public final List<DQ> A00;

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(DQ.A01(parcel));
        }
        this.A00 = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, DO r22) {
        this(parcel);
    }

    public SpliceScheduleCommand(List<DQ> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    public static SpliceScheduleCommand A00(HV hv) {
        int A0E = hv.A0E();
        ArrayList arrayList = new ArrayList(A0E);
        for (int i10 = 0; i10 < A0E; i10++) {
            arrayList.add(DQ.A03(hv));
            if (A01[1].charAt(15) == 'W') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "d2FIwqylvh7iXAJnxNkaidieKhP3pOaB";
            strArr[4] = "dE1dCXJBgr8GZeSYP1l3R34BwUsmGXNG";
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int size = this.A00.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            DQ.A05(this.A00.get(i11), parcel);
        }
    }
}
