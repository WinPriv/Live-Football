package o1;

import a3.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* compiled from: VersionedParcelParcel.java */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f33542d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f33543e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f33544g;

    /* renamed from: h, reason: collision with root package name */
    public final String f33545h;

    /* renamed from: i, reason: collision with root package name */
    public int f33546i;

    /* renamed from: j, reason: collision with root package name */
    public int f33547j;

    /* renamed from: k, reason: collision with root package name */
    public int f33548k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new q.b(), new q.b(), new q.b());
    }

    @Override // o1.a
    public final b a() {
        Parcel parcel = this.f33543e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f33547j;
        if (i10 == this.f) {
            i10 = this.f33544g;
        }
        return new b(parcel, dataPosition, i10, l.p(new StringBuilder(), this.f33545h, "  "), this.f33539a, this.f33540b, this.f33541c);
    }

    @Override // o1.a
    public final boolean e() {
        if (this.f33543e.readInt() != 0) {
            return true;
        }
        return false;
    }

    @Override // o1.a
    public final byte[] f() {
        Parcel parcel = this.f33543e;
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // o1.a
    public final CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f33543e);
    }

    @Override // o1.a
    public final boolean h(int i10) {
        while (this.f33547j < this.f33544g) {
            int i11 = this.f33548k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f33547j;
            Parcel parcel = this.f33543e;
            parcel.setDataPosition(i12);
            int readInt = parcel.readInt();
            this.f33548k = parcel.readInt();
            this.f33547j += readInt;
        }
        if (this.f33548k == i10) {
            return true;
        }
        return false;
    }

    @Override // o1.a
    public final int i() {
        return this.f33543e.readInt();
    }

    @Override // o1.a
    public final <T extends Parcelable> T k() {
        return (T) this.f33543e.readParcelable(b.class.getClassLoader());
    }

    @Override // o1.a
    public final String m() {
        return this.f33543e.readString();
    }

    @Override // o1.a
    public final void o(int i10) {
        x();
        this.f33546i = i10;
        this.f33542d.put(i10, this.f33543e.dataPosition());
        s(0);
        s(i10);
    }

    @Override // o1.a
    public final void p(boolean z10) {
        this.f33543e.writeInt(z10 ? 1 : 0);
    }

    @Override // o1.a
    public final void q(byte[] bArr) {
        Parcel parcel = this.f33543e;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        } else {
            parcel.writeInt(-1);
        }
    }

    @Override // o1.a
    public final void r(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f33543e, 0);
    }

    @Override // o1.a
    public final void s(int i10) {
        this.f33543e.writeInt(i10);
    }

    @Override // o1.a
    public final void u(Parcelable parcelable) {
        this.f33543e.writeParcelable(parcelable, 0);
    }

    @Override // o1.a
    public final void v(String str) {
        this.f33543e.writeString(str);
    }

    public final void x() {
        int i10 = this.f33546i;
        if (i10 >= 0) {
            int i11 = this.f33542d.get(i10);
            Parcel parcel = this.f33543e;
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(dataPosition - i11);
            parcel.setDataPosition(dataPosition);
        }
    }

    public b(Parcel parcel, int i10, int i11, String str, q.b<String, Method> bVar, q.b<String, Method> bVar2, q.b<String, Class> bVar3) {
        super(bVar, bVar2, bVar3);
        this.f33542d = new SparseIntArray();
        this.f33546i = -1;
        this.f33548k = -1;
        this.f33543e = parcel;
        this.f = i10;
        this.f33544g = i11;
        this.f33547j = i10;
        this.f33545h = str;
    }
}
