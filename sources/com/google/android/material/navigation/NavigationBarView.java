package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.n;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.m0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.internal.k;
import com.hamkho.livefoot.R;
import d7.g;
import d7.j;
import g0.a;
import i.f;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import n0.c0;
import n0.l0;
import z6.c;

/* loaded from: classes2.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f20925x = 0;

    /* renamed from: s, reason: collision with root package name */
    public final x6.b f20926s;

    /* renamed from: t, reason: collision with root package name */
    public final NavigationBarMenuView f20927t;

    /* renamed from: u, reason: collision with root package name */
    public final NavigationBarPresenter f20928u;

    /* renamed from: v, reason: collision with root package name */
    public f f20929v;

    /* renamed from: w, reason: collision with root package name */
    public b f20930w;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public Bundle f20931u;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f1595s, i10);
            parcel.writeBundle(this.f20931u);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f20931u = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* loaded from: classes2.dex */
    public interface a {
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(MenuItem menuItem);
    }

    public NavigationBarView(Context context, AttributeSet attributeSet) {
        super(g7.a.a(context, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView), attributeSet, R.attr.bottomNavigationStyle);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f20928u = navigationBarPresenter;
        Context context2 = getContext();
        m0 e10 = k.e(context2, attributeSet, n.f502n0, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, 10, 9);
        x6.b bVar = new x6.b(context2, getClass(), getMaxItemCount());
        this.f20926s = bVar;
        BottomNavigationMenuView bottomNavigationMenuView = new BottomNavigationMenuView(context2);
        this.f20927t = bottomNavigationMenuView;
        navigationBarPresenter.f20920s = bottomNavigationMenuView;
        navigationBarPresenter.f20922u = 1;
        bottomNavigationMenuView.setPresenter(navigationBarPresenter);
        bVar.b(navigationBarPresenter, bVar.f816a);
        getContext();
        navigationBarPresenter.f20920s.U = bVar;
        if (e10.l(5)) {
            bottomNavigationMenuView.setIconTintList(e10.b(5));
        } else {
            bottomNavigationMenuView.setIconTintList(bottomNavigationMenuView.c());
        }
        setItemIconSize(e10.d(4, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (e10.l(10)) {
            setItemTextAppearanceInactive(e10.i(10, 0));
        }
        if (e10.l(9)) {
            setItemTextAppearanceActive(e10.i(9, 0));
        }
        if (e10.l(11)) {
            setItemTextColor(e10.b(11));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            g gVar = new g();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                gVar.k(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            gVar.i(context2);
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.d.q(this, gVar);
        }
        if (e10.l(7)) {
            setItemPaddingTop(e10.d(7, 0));
        }
        if (e10.l(6)) {
            setItemPaddingBottom(e10.d(6, 0));
        }
        if (e10.l(1)) {
            setElevation(e10.d(1, 0));
        }
        a.b.h(getBackground().mutate(), c.b(context2, e10, 0));
        setLabelVisibilityMode(e10.f1206b.getInteger(12, -1));
        int i10 = e10.i(3, 0);
        if (i10 != 0) {
            bottomNavigationMenuView.setItemBackgroundRes(i10);
        } else {
            setItemRippleColor(c.b(context2, e10, 8));
        }
        int i11 = e10.i(2, 0);
        if (i11 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(i11, n.f501m0);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(c.a(context2, obtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(new j(j.a(context2, obtainStyledAttributes.getResourceId(4, 0), 0, new d7.a(0))));
            obtainStyledAttributes.recycle();
        }
        if (e10.l(13)) {
            int i12 = e10.i(13, 0);
            navigationBarPresenter.f20921t = true;
            getMenuInflater().inflate(i12, bVar);
            navigationBarPresenter.f20921t = false;
            navigationBarPresenter.c(true);
        }
        e10.n();
        addView(bottomNavigationMenuView);
        bVar.f820e = new com.google.android.material.navigation.a((BottomNavigationView) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.f20929v == null) {
            this.f20929v = new f(getContext());
        }
        return this.f20929v;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f20927t.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f20927t.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f20927t.getItemActiveIndicatorMarginHorizontal();
    }

    public j getItemActiveIndicatorShapeAppearance() {
        return this.f20927t.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f20927t.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f20927t.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f20927t.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f20927t.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f20927t.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f20927t.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f20927t.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f20927t.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f20927t.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f20927t.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f20927t.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f20927t.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f20926s;
    }

    public androidx.appcompat.view.menu.n getMenuView() {
        return this.f20927t;
    }

    public NavigationBarPresenter getPresenter() {
        return this.f20928u;
    }

    public int getSelectedItemId() {
        return this.f20927t.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n.K0(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1595s);
        Bundle bundle = savedState.f20931u;
        x6.b bVar = this.f20926s;
        bVar.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference<m>> copyOnWriteArrayList = bVar.f834u;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator<WeakReference<m>> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference<m> next = it.next();
                    m mVar = next.get();
                    if (mVar == null) {
                        copyOnWriteArrayList.remove(next);
                    } else {
                        int id2 = mVar.getId();
                        if (id2 > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                            mVar.h(parcelable2);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable k10;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f20931u = bundle;
        CopyOnWriteArrayList<WeakReference<m>> copyOnWriteArrayList = this.f20926s.f834u;
        if (!copyOnWriteArrayList.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator<WeakReference<m>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    int id2 = mVar.getId();
                    if (id2 > 0 && (k10 = mVar.k()) != null) {
                        sparseArray.put(id2, k10);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return savedState;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        n.J0(this, f);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f20927t.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f20927t.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f20927t.setItemActiveIndicatorHeight(i10);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f20927t.setItemActiveIndicatorMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorShapeAppearance(j jVar) {
        this.f20927t.setItemActiveIndicatorShapeAppearance(jVar);
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f20927t.setItemActiveIndicatorWidth(i10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f20927t.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i10) {
        this.f20927t.setItemBackgroundRes(i10);
    }

    public void setItemIconSize(int i10) {
        this.f20927t.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f20927t.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i10) {
        this.f20927t.setItemPaddingBottom(i10);
    }

    public void setItemPaddingTop(int i10) {
        this.f20927t.setItemPaddingTop(i10);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f20927t.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f20927t.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f20927t.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f20927t.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i10) {
        NavigationBarMenuView navigationBarMenuView = this.f20927t;
        if (navigationBarMenuView.getLabelVisibilityMode() != i10) {
            navigationBarMenuView.setLabelVisibilityMode(i10);
            this.f20928u.c(false);
        }
    }

    public void setOnItemSelectedListener(b bVar) {
        this.f20930w = bVar;
    }

    public void setSelectedItemId(int i10) {
        x6.b bVar = this.f20926s;
        MenuItem findItem = bVar.findItem(i10);
        if (findItem != null && !bVar.q(findItem, this.f20928u, 0)) {
            findItem.setChecked(true);
        }
    }

    public void setOnItemReselectedListener(a aVar) {
    }
}
