package com.huawei.openalliance.ad.ppskit.augreality.view;

import android.view.View;
import com.huawei.openalliance.ad.ppskit.views.PPSArView;
import com.huawei.openalliance.ad.ppskit.views.l;

/* loaded from: classes2.dex */
public final class a implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f22440s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ PPSArHorizontalScrollView f22441t;

    public a(PPSArHorizontalScrollView pPSArHorizontalScrollView, int i10) {
        this.f22441t = pPSArHorizontalScrollView;
        this.f22440s = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PPSArView pPSArView = ((l) this.f22441t.f22439x).f23459a;
        int i10 = pPSArView.F;
        int i11 = this.f22440s;
        if (i10 != i11) {
            pPSArView.F = i11;
            pPSArView.b();
        }
    }
}
