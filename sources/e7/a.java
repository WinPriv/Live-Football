package e7;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: RightSheetDelegate.java */
/* loaded from: classes2.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f27849a;

    public a(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f27849a = sideSheetBehavior;
    }

    public final int a() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f27849a;
        return Math.max(0, sideSheetBehavior.f20971m - sideSheetBehavior.f20970l);
    }
}
