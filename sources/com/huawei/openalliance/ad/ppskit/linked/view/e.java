package com.huawei.openalliance.ad.ppskit.linked.view;

import android.view.View;
import com.huawei.openalliance.ad.ppskit.linked.view.LinkedLandVideoView;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import ka.n7;
import ka.r8;

/* loaded from: classes2.dex */
public final class e implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f22703s;

    public e(d dVar) {
        this.f22703s = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d dVar = this.f22703s;
        r8 currentState = dVar.f22692v.getCurrentState();
        int i10 = d.f22685f0;
        n7.c("d", "onClick, currentState %s", currentState.toString());
        if (dVar.f22692v.D()) {
            LinkedLandVideoView.c cVar = (LinkedLandVideoView.c) dVar.Y;
            if (LinkedLandVideoView.this.E != null) {
                p2.a(new a(cVar), 5);
            }
        } else {
            ((LinkedLandVideoView.c) dVar.Y).a();
        }
        d.C(dVar);
    }
}
