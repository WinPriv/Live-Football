package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.HashSet;

/* compiled from: SupportRequestManagerFragment.java */
/* loaded from: classes.dex */
public class s extends Fragment {

    /* renamed from: s, reason: collision with root package name */
    public final com.bumptech.glide.manager.a f19822s;

    /* renamed from: t, reason: collision with root package name */
    public final a f19823t;

    /* renamed from: u, reason: collision with root package name */
    public final HashSet f19824u;

    /* renamed from: v, reason: collision with root package name */
    public s f19825v;

    /* renamed from: w, reason: collision with root package name */
    public com.bumptech.glide.o f19826w;

    /* renamed from: x, reason: collision with root package name */
    public Fragment f19827x;

    /* compiled from: SupportRequestManagerFragment.java */
    /* loaded from: classes.dex */
    public class a implements o {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + s.this + "}";
        }
    }

    public s() {
        com.bumptech.glide.manager.a aVar = new com.bumptech.glide.manager.a();
        this.f19823t = new a();
        this.f19824u = new HashSet();
        this.f19822s = aVar;
    }

    public final void a(Context context, FragmentManager fragmentManager) {
        s sVar = this.f19825v;
        if (sVar != null) {
            sVar.f19824u.remove(this);
            this.f19825v = null;
        }
        s f = com.bumptech.glide.b.b(context).f19721w.f(fragmentManager);
        this.f19825v = f;
        if (!equals(f)) {
            this.f19825v.f19824u.add(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment fragment = this;
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                a(getContext(), fragmentManager);
            } catch (IllegalStateException e10) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e10);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f19822s.a();
        s sVar = this.f19825v;
        if (sVar != null) {
            sVar.f19824u.remove(this);
            this.f19825v = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f19827x = null;
        s sVar = this.f19825v;
        if (sVar != null) {
            sVar.f19824u.remove(this);
            this.f19825v = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f19822s.b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f19822s.c();
    }

    @Override // androidx.fragment.app.Fragment
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f19827x;
        }
        sb2.append(parentFragment);
        sb2.append("}");
        return sb2.toString();
    }
}
