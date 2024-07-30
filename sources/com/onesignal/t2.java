package com.onesignal;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* compiled from: OSSystemConditionController.java */
/* loaded from: classes2.dex */
public final class t2 extends FragmentManager.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f27091a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u2 f27092b;

    public t2(u2 u2Var, FragmentManager fragmentManager) {
        this.f27092b = u2Var;
        this.f27091a = fragmentManager;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public final void a(Fragment fragment) {
        if (fragment instanceof androidx.fragment.app.l) {
            this.f27091a.d0(this);
            this.f27092b.f27100a.b();
        }
    }
}
