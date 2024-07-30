package e0;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import e0.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f27644s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f27645t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f27646u;

    public /* synthetic */ h(int i10, int i11, Object obj) {
        this.f27644s = i11;
        this.f27646u = obj;
        this.f27645t = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f27644s;
        int i11 = this.f27645t;
        Object obj = this.f27646u;
        switch (i10) {
            case 0:
                ((f.e) obj).c(i11);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.f20972n.get();
                if (view != null) {
                    sideSheetBehavior.t(view, i11, false);
                    return;
                }
                return;
        }
    }
}
