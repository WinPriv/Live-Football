package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.HashSet;

/* compiled from: RequestManagerFragment.java */
@Deprecated
/* loaded from: classes.dex */
public final class m extends Fragment {

    /* renamed from: s, reason: collision with root package name */
    public final com.bumptech.glide.manager.a f19792s;

    /* renamed from: t, reason: collision with root package name */
    public final a f19793t;

    /* renamed from: u, reason: collision with root package name */
    public final HashSet f19794u;

    /* renamed from: v, reason: collision with root package name */
    public com.bumptech.glide.o f19795v;

    /* renamed from: w, reason: collision with root package name */
    public m f19796w;

    /* renamed from: x, reason: collision with root package name */
    public Fragment f19797x;

    /* compiled from: RequestManagerFragment.java */
    /* loaded from: classes.dex */
    public class a implements o {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + m.this + "}";
        }
    }

    public m() {
        com.bumptech.glide.manager.a aVar = new com.bumptech.glide.manager.a();
        this.f19793t = new a();
        this.f19794u = new HashSet();
        this.f19792s = aVar;
    }

    public final void a(Activity activity) {
        m mVar = this.f19796w;
        if (mVar != null) {
            mVar.f19794u.remove(this);
            this.f19796w = null;
        }
        n nVar = com.bumptech.glide.b.b(activity).f19721w;
        nVar.getClass();
        m e10 = nVar.e(activity.getFragmentManager());
        this.f19796w = e10;
        if (!equals(e10)) {
            this.f19796w.f19794u.add(this);
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f19792s.a();
        m mVar = this.f19796w;
        if (mVar != null) {
            mVar.f19794u.remove(this);
            this.f19796w = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        m mVar = this.f19796w;
        if (mVar != null) {
            mVar.f19794u.remove(this);
            this.f19796w = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f19792s.b();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f19792s.c();
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f19797x;
        }
        sb2.append(parentFragment);
        sb2.append("}");
        return sb2.toString();
    }
}
