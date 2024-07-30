package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.y;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();
    public final CharSequence A;
    public final int B;
    public final CharSequence C;
    public final ArrayList<String> D;
    public final ArrayList<String> E;
    public final boolean F;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f1677s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList<String> f1678t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f1679u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f1680v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1681w;

    /* renamed from: x, reason: collision with root package name */
    public final String f1682x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public final int f1683z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<BackStackState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackState[] newArray(int i10) {
            return new BackStackState[i10];
        }
    }

    public BackStackState(androidx.fragment.app.a aVar) {
        int size = aVar.f1890a.size();
        this.f1677s = new int[size * 5];
        if (aVar.f1895g) {
            this.f1678t = new ArrayList<>(size);
            this.f1679u = new int[size];
            this.f1680v = new int[size];
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                y.a aVar2 = aVar.f1890a.get(i10);
                int i12 = i11 + 1;
                this.f1677s[i11] = aVar2.f1903a;
                ArrayList<String> arrayList = this.f1678t;
                Fragment fragment = aVar2.f1904b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f1677s;
                int i13 = i12 + 1;
                iArr[i12] = aVar2.f1905c;
                int i14 = i13 + 1;
                iArr[i13] = aVar2.f1906d;
                int i15 = i14 + 1;
                iArr[i14] = aVar2.f1907e;
                iArr[i15] = aVar2.f;
                this.f1679u[i10] = aVar2.f1908g.ordinal();
                this.f1680v[i10] = aVar2.f1909h.ordinal();
                i10++;
                i11 = i15 + 1;
            }
            this.f1681w = aVar.f;
            this.f1682x = aVar.f1896h;
            this.y = aVar.f1778r;
            this.f1683z = aVar.f1897i;
            this.A = aVar.f1898j;
            this.B = aVar.f1899k;
            this.C = aVar.f1900l;
            this.D = aVar.f1901m;
            this.E = aVar.f1902n;
            this.F = aVar.o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f1677s);
        parcel.writeStringList(this.f1678t);
        parcel.writeIntArray(this.f1679u);
        parcel.writeIntArray(this.f1680v);
        parcel.writeInt(this.f1681w);
        parcel.writeString(this.f1682x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.f1683z);
        TextUtils.writeToParcel(this.A, parcel, 0);
        parcel.writeInt(this.B);
        TextUtils.writeToParcel(this.C, parcel, 0);
        parcel.writeStringList(this.D);
        parcel.writeStringList(this.E);
        parcel.writeInt(this.F ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f1677s = parcel.createIntArray();
        this.f1678t = parcel.createStringArrayList();
        this.f1679u = parcel.createIntArray();
        this.f1680v = parcel.createIntArray();
        this.f1681w = parcel.readInt();
        this.f1682x = parcel.readString();
        this.y = parcel.readInt();
        this.f1683z = parcel.readInt();
        this.A = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.B = parcel.readInt();
        this.C = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.D = parcel.createStringArrayList();
        this.E = parcel.createStringArrayList();
        this.F = parcel.readInt() != 0;
    }
}
