package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public ArrayList<FragmentState> f1760s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList<String> f1761t;

    /* renamed from: u, reason: collision with root package name */
    public BackStackState[] f1762u;

    /* renamed from: v, reason: collision with root package name */
    public int f1763v;

    /* renamed from: w, reason: collision with root package name */
    public String f1764w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList<String> f1765x;
    public final ArrayList<Bundle> y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f1766z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentManagerState[] newArray(int i10) {
            return new FragmentManagerState[i10];
        }
    }

    public FragmentManagerState() {
        this.f1764w = null;
        this.f1765x = new ArrayList<>();
        this.y = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f1760s);
        parcel.writeStringList(this.f1761t);
        parcel.writeTypedArray(this.f1762u, i10);
        parcel.writeInt(this.f1763v);
        parcel.writeString(this.f1764w);
        parcel.writeStringList(this.f1765x);
        parcel.writeTypedList(this.y);
        parcel.writeTypedList(this.f1766z);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f1764w = null;
        this.f1765x = new ArrayList<>();
        this.y = new ArrayList<>();
        this.f1760s = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f1761t = parcel.createStringArrayList();
        this.f1762u = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f1763v = parcel.readInt();
        this.f1764w = parcel.readString();
        this.f1765x = parcel.createStringArrayList();
        this.y = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f1766z = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
