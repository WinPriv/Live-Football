package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import com.anythink.expressad.exoplayer.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class DQ {
    public static String[] A0B = {"s27kRN", "abG5pKADna", "w2jztrB", "I7geUVX8H5XW4NGFgS7QGYJa3", "W37aGUNVZO5G", "W3qhVhIXcY", "2nbP2bKsNJFzfOABHc993I7Qj", "6HcftuEFFeXx4hy"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List<DP> A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static DQ A02(HV hv) {
        long A0M = hv.A0M();
        boolean z10 = (hv.A0E() & 128) != 0;
        boolean z11 = false;
        boolean z12 = false;
        long j10 = b.f7291b;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z13 = false;
        long j11 = b.f7291b;
        if (!z10) {
            int A0E = hv.A0E();
            if (A0B[2].length() != 7) {
                throw new RuntimeException();
            }
            A0B[6] = "oYMFgXMCdR9ldlOsYeO";
            z11 = (A0E & 128) != 0;
            z12 = (A0E & 64) != 0;
            boolean z14 = (A0E & 32) != 0;
            if (z12) {
                j10 = hv.A0M();
            }
            if (!z12) {
                int A0E2 = hv.A0E();
                arrayList = new ArrayList(A0E2);
                for (int i13 = 0; i13 < A0E2; i13++) {
                    arrayList.add(new DP(hv.A0E(), hv.A0M(), null));
                }
            }
            if (z14) {
                long A0E3 = hv.A0E();
                z13 = (128 & A0E3) != 0;
                j11 = (1000 * (((1 & A0E3) << 32) | hv.A0M())) / 90;
            }
            i10 = hv.A0I();
            i11 = hv.A0E();
            i12 = hv.A0E();
        }
        return new DQ(A0M, z10, z11, z12, arrayList, j10, z13, j11, i10, i11, i12);
    }

    public DQ(long j10, boolean z10, boolean z11, boolean z12, List<DP> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
        this.A04 = j10;
        this.A0A = z10;
        this.A08 = z11;
        this.A09 = z12;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j11;
        this.A07 = z13;
        this.A03 = j12;
        this.A02 = i10;
        this.A00 = i11;
        this.A01 = i12;
    }

    public DQ(Parcel parcel) {
        DP A00;
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            A00 = DP.A00(parcel);
            arrayList.add(A00);
        }
        this.A06 = Collections.unmodifiableList(arrayList);
        this.A05 = parcel.readLong();
        int componentSpliceListLength = parcel.readByte();
        this.A07 = componentSpliceListLength == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListLength2 = parcel.readInt();
        this.A02 = componentSpliceListLength2;
        int componentSpliceListLength3 = parcel.readInt();
        this.A00 = componentSpliceListLength3;
        int componentSpliceListLength4 = parcel.readInt();
        this.A01 = componentSpliceListLength4;
    }

    public static DQ A00(Parcel parcel) {
        return new DQ(parcel);
    }

    public static /* synthetic */ DQ A01(Parcel parcel) {
        return A00(parcel);
    }

    public static /* synthetic */ DQ A03(HV hv) {
        return A02(hv);
    }

    public void A04(Parcel parcel) {
        parcel.writeLong(this.A04);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        int size = this.A06.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            this.A06.get(i10).A02(parcel);
        }
        parcel.writeLong(this.A05);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public static /* synthetic */ void A05(DQ dq, Parcel parcel) {
        dq.A04(parcel);
    }
}
