package com.huawei.openalliance.ad.ppskit.linked.view;

import androidx.activity.n;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.linked.view.LinkedLandVideoView;
import ka.j7;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LinkedLandVideoView.c f22680s;

    public a(LinkedLandVideoView.c cVar) {
        this.f22680s = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedLandVideoView.c cVar = this.f22680s;
        LinkedLandVideoView linkedLandVideoView = LinkedLandVideoView.this;
        j7 j7Var = linkedLandVideoView.E;
        n.J(j7Var.f31322v, (ContentRecord) j7Var.f32660t, "playBtnPause", linkedLandVideoView.P, System.currentTimeMillis(), (int) LinkedLandVideoView.this.Q, r0.K.getCurrentPosition());
    }
}
