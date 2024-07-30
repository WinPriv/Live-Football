package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.r;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.ParcelableSparseArray;

/* loaded from: classes2.dex */
public final class NavigationBarPresenter implements m {

    /* renamed from: s, reason: collision with root package name */
    public NavigationBarMenuView f20920s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f20921t = false;

    /* renamed from: u, reason: collision with root package name */
    public int f20922u;

    /* loaded from: classes2.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: s, reason: collision with root package name */
        public int f20923s;

        /* renamed from: t, reason: collision with root package name */
        public ParcelableSparseArray f20924t;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f20923s = parcel.readInt();
            this.f20924t = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f20923s);
            parcel.writeParcelable(this.f20924t, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final void c(boolean z10) {
        androidx.transition.a aVar;
        if (this.f20921t) {
            return;
        }
        if (z10) {
            this.f20920s.a();
            return;
        }
        NavigationBarMenuView navigationBarMenuView = this.f20920s;
        h hVar = navigationBarMenuView.U;
        if (hVar != null && navigationBarMenuView.f20917x != null) {
            int size = hVar.size();
            if (size != navigationBarMenuView.f20917x.length) {
                navigationBarMenuView.a();
                return;
            }
            int i10 = navigationBarMenuView.y;
            for (int i11 = 0; i11 < size; i11++) {
                MenuItem item = navigationBarMenuView.U.getItem(i11);
                if (item.isChecked()) {
                    navigationBarMenuView.y = item.getItemId();
                    navigationBarMenuView.f20918z = i11;
                }
            }
            if (i10 != navigationBarMenuView.y && (aVar = navigationBarMenuView.f20912s) != null) {
                androidx.transition.m.a(navigationBarMenuView, aVar);
            }
            boolean f = NavigationBarMenuView.f(navigationBarMenuView.f20916w, navigationBarMenuView.U.l().size());
            for (int i12 = 0; i12 < size; i12++) {
                navigationBarMenuView.T.f20921t = true;
                navigationBarMenuView.f20917x[i12].setLabelVisibilityMode(navigationBarMenuView.f20916w);
                navigationBarMenuView.f20917x[i12].setShifting(f);
                navigationBarMenuView.f20917x[i12].c((j) navigationBarMenuView.U.getItem(i12));
                navigationBarMenuView.T.f20921t = false;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean f(j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void g(Context context, h hVar) {
        this.f20920s.U = hVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public final int getId() {
        return this.f20922u;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void h(Parcelable parcelable) {
        SparseArray<com.google.android.material.badge.a> sparseArray;
        if (parcelable instanceof SavedState) {
            NavigationBarMenuView navigationBarMenuView = this.f20920s;
            SavedState savedState = (SavedState) parcelable;
            int i10 = savedState.f20923s;
            int size = navigationBarMenuView.U.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                MenuItem item = navigationBarMenuView.U.getItem(i11);
                if (i10 == item.getItemId()) {
                    navigationBarMenuView.y = i10;
                    navigationBarMenuView.f20918z = i11;
                    item.setChecked(true);
                    break;
                }
                i11++;
            }
            Context context = this.f20920s.getContext();
            ParcelableSparseArray parcelableSparseArray = savedState.f20924t;
            SparseArray sparseArray2 = new SparseArray(parcelableSparseArray.size());
            for (int i12 = 0; i12 < parcelableSparseArray.size(); i12++) {
                int keyAt = parcelableSparseArray.keyAt(i12);
                BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i12);
                if (state != null) {
                    sparseArray2.put(keyAt, new com.google.android.material.badge.a(context, state));
                } else {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
            }
            NavigationBarMenuView navigationBarMenuView2 = this.f20920s;
            navigationBarMenuView2.getClass();
            int i13 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                sparseArray = navigationBarMenuView2.J;
                if (i13 >= size2) {
                    break;
                }
                int keyAt2 = sparseArray2.keyAt(i13);
                if (sparseArray.indexOfKey(keyAt2) < 0) {
                    sparseArray.append(keyAt2, (com.google.android.material.badge.a) sparseArray2.get(keyAt2));
                }
                i13++;
            }
            NavigationBarItemView[] navigationBarItemViewArr = navigationBarMenuView2.f20917x;
            if (navigationBarItemViewArr != null) {
                for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                    navigationBarItemView.setBadge(sparseArray.get(navigationBarItemView.getId()));
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean j(r rVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public final Parcelable k() {
        SavedState savedState = new SavedState();
        savedState.f20923s = this.f20920s.getSelectedItemId();
        SparseArray<com.google.android.material.badge.a> badgeDrawables = this.f20920s.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i10 = 0; i10 < badgeDrawables.size(); i10++) {
            int keyAt = badgeDrawables.keyAt(i10);
            com.google.android.material.badge.a valueAt = badgeDrawables.valueAt(i10);
            if (valueAt != null) {
                parcelableSparseArray.put(keyAt, valueAt.f20486w.f20470a);
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        savedState.f20924t = parcelableSparseArray;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean l(j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void b(h hVar, boolean z10) {
    }
}
