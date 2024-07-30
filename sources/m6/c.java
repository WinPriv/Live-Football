package m6;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import o0.k;

/* compiled from: BottomSheetBehavior.java */
/* loaded from: classes2.dex */
public final class c implements k {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f32908s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f32909t;

    public c(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this.f32909t = bottomSheetBehavior;
        this.f32908s = i10;
    }

    @Override // o0.k
    public final boolean a(View view) {
        this.f32909t.C(this.f32908s);
        return true;
    }
}
