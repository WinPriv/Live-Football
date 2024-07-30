package com.google.android.material.navigation;

import android.view.MenuItem;
import androidx.appcompat.view.menu.h;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

/* compiled from: NavigationBarView.java */
/* loaded from: classes2.dex */
public final class a implements h.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ NavigationBarView f20934s;

    public a(BottomNavigationView bottomNavigationView) {
        this.f20934s = bottomNavigationView;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public final boolean a(h hVar, MenuItem menuItem) {
        int i10 = NavigationBarView.f20925x;
        NavigationBarView navigationBarView = this.f20934s;
        navigationBarView.getClass();
        NavigationBarView.b bVar = navigationBarView.f20930w;
        if (bVar != null) {
            bVar.a(menuItem);
            return false;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public final void b(h hVar) {
    }
}
