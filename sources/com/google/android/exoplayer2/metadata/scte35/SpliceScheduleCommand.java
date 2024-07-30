package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final List<c> f20091s;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<SpliceScheduleCommand> {
        @Override // android.os.Parcelable.Creator
        public final SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceScheduleCommand[] newArray(int i10) {
            return new SpliceScheduleCommand[i10];
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f20092a;

        /* renamed from: b, reason: collision with root package name */
        public final long f20093b;

        public b(int i10, long j10) {
            this.f20092a = i10;
            this.f20093b = j10;
        }
    }

    public SpliceScheduleCommand(ArrayList arrayList) {
        this.f20091s = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List<c> list = this.f20091s;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = list.get(i11);
            parcel.writeLong(cVar.f20094a);
            parcel.writeByte(cVar.f20095b ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f20096c ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f20097d ? (byte) 1 : (byte) 0);
            List<b> list2 = cVar.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                b bVar = list2.get(i12);
                parcel.writeInt(bVar.f20092a);
                parcel.writeLong(bVar.f20093b);
            }
            parcel.writeLong(cVar.f20098e);
            parcel.writeByte(cVar.f20099g ? (byte) 1 : (byte) 0);
            parcel.writeLong(cVar.f20100h);
            parcel.writeInt(cVar.f20101i);
            parcel.writeInt(cVar.f20102j);
            parcel.writeInt(cVar.f20103k);
        }
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new c(parcel));
        }
        this.f20091s = Collections.unmodifiableList(arrayList);
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f20094a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f20095b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f20096c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f20097d;

        /* renamed from: e, reason: collision with root package name */
        public final long f20098e;
        public final List<b> f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f20099g;

        /* renamed from: h, reason: collision with root package name */
        public final long f20100h;

        /* renamed from: i, reason: collision with root package name */
        public final int f20101i;

        /* renamed from: j, reason: collision with root package name */
        public final int f20102j;

        /* renamed from: k, reason: collision with root package name */
        public final int f20103k;

        public c(long j10, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f20094a = j10;
            this.f20095b = z10;
            this.f20096c = z11;
            this.f20097d = z12;
            this.f = Collections.unmodifiableList(arrayList);
            this.f20098e = j11;
            this.f20099g = z13;
            this.f20100h = j12;
            this.f20101i = i10;
            this.f20102j = i11;
            this.f20103k = i12;
        }

        public c(Parcel parcel) {
            this.f20094a = parcel.readLong();
            this.f20095b = parcel.readByte() == 1;
            this.f20096c = parcel.readByte() == 1;
            this.f20097d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(new b(parcel.readInt(), parcel.readLong()));
            }
            this.f = Collections.unmodifiableList(arrayList);
            this.f20098e = parcel.readLong();
            this.f20099g = parcel.readByte() == 1;
            this.f20100h = parcel.readLong();
            this.f20101i = parcel.readInt();
            this.f20102j = parcel.readInt();
            this.f20103k = parcel.readInt();
        }
    }
}
