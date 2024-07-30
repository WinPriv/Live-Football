package com.huawei.openalliance.ad.ppskit.views;

import android.text.TextUtils;
import android.view.View;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class k implements View.OnScrollChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PPSArView f23454a;

    public k(PPSArView pPSArView) {
        this.f23454a = pPSArView;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
        int size;
        int i14 = PPSArView.W;
        PPSArView pPSArView = this.f23454a;
        pPSArView.getClass();
        boolean z10 = true;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) {
            z10 = false;
        }
        if (!z10) {
            size = ((pPSArView.B.getmScreenWitdh() / 2) + i10) / pPSArView.B.getmChildViewWidth();
            pPSArView.R = size;
            pPSArView.Q = size;
            if (size == pPSArView.S) {
                return;
            }
        } else {
            pPSArView.R = ((pPSArView.B.getmScreenWitdh() / 2) + i10) / pPSArView.B.getmChildViewWidth();
            size = (pPSArView.O.size() - pPSArView.R) - 1;
            pPSArView.Q = size;
            if (size == pPSArView.S) {
                return;
            }
        }
        pPSArView.S = size;
        PPSArView.y(pPSArView, size);
    }
}
