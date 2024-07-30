package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new a();
    public final boolean A;
    public final long B;
    public final int C;
    public final int D;
    public final int E;

    /* renamed from: s, reason: collision with root package name */
    public final long f20081s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f20082t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f20083u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f20084v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f20085w;

    /* renamed from: x, reason: collision with root package name */
    public final long f20086x;
    public final long y;

    /* renamed from: z, reason: collision with root package name */
    public final List<b> f20087z;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<SpliceInsertCommand> {
        @Override // android.os.Parcelable.Creator
        public final SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceInsertCommand[] newArray(int i10) {
            return new SpliceInsertCommand[i10];
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f20088a;

        /* renamed from: b, reason: collision with root package name */
        public final long f20089b;

        /* renamed from: c, reason: collision with root package name */
        public final long f20090c;

        public b(int i10, long j10, long j11) {
            this.f20088a = i10;
            this.f20089b = j10;
            this.f20090c = j11;
        }
    }

    public SpliceInsertCommand(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f20081s = j10;
        this.f20082t = z10;
        this.f20083u = z11;
        this.f20084v = z12;
        this.f20085w = z13;
        this.f20086x = j11;
        this.y = j12;
        this.f20087z = Collections.unmodifiableList(list);
        this.A = z14;
        this.B = j13;
        this.C = i10;
        this.D = i11;
        this.E = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f20081s);
        parcel.writeByte(this.f20082t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f20083u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f20084v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f20085w ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f20086x);
        parcel.writeLong(this.y);
        List<b> list = this.f20087z;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = list.get(i11);
            parcel.writeInt(bVar.f20088a);
            parcel.writeLong(bVar.f20089b);
            parcel.writeLong(bVar.f20090c);
        }
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.f20081s = parcel.readLong();
        this.f20082t = parcel.readByte() == 1;
        this.f20083u = parcel.readByte() == 1;
        this.f20084v = parcel.readByte() == 1;
        this.f20085w = parcel.readByte() == 1;
        this.f20086x = parcel.readLong();
        this.y = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new b(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f20087z = Collections.unmodifiableList(arrayList);
        this.A = parcel.readByte() == 1;
        this.B = parcel.readLong();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = parcel.readInt();
    }
}
