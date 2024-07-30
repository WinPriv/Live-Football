package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import com.ironsource.lifecycle.d;

/* loaded from: classes2.dex */
public final class b extends Fragment {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f24710t = 0;

    /* renamed from: s, reason: collision with root package name */
    public d.e f24711s;

    /* loaded from: classes2.dex */
    public interface a {
        void a(Activity activity);

        void b(Activity activity);
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f24711s != null) {
            getActivity();
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f24711s = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        d.e eVar = this.f24711s;
        if (eVar != null) {
            eVar.b(getActivity());
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        d.e eVar = this.f24711s;
        if (eVar != null) {
            eVar.a(getActivity());
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
    }
}
