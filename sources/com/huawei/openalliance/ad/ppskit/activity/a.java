package com.huawei.openalliance.ad.ppskit.activity;

import com.huawei.featurelayer.sharedfeature.xrkit.sdk.IArSceneView;
import com.huawei.openalliance.ad.ppskit.activity.PPSArActivity;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import ka.n7;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ContentRecord f22430s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ PPSArActivity.a f22431t;

    /* renamed from: com.huawei.openalliance.ad.ppskit.activity.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0289a implements Runnable {
        public RunnableC0289a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IArSceneView iArSceneView;
            IArSceneView iArSceneView2;
            a aVar = a.this;
            iArSceneView = PPSArActivity.this.B;
            if (iArSceneView != null) {
                n7.e("PPSArActivity", "sceneView resume");
                iArSceneView2 = PPSArActivity.this.B;
                iArSceneView2.resume();
            }
        }
    }

    public a(PPSArActivity.a aVar, ContentRecord contentRecord) {
        this.f22431t = aVar;
        this.f22430s = contentRecord;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n7.e("PPSArActivity", "copy files success");
        PPSArActivity.a aVar = this.f22431t;
        PPSArActivity pPSArActivity = PPSArActivity.this;
        pPSArActivity.y = this.f22430s;
        pPSArActivity.p(true);
        PPSArActivity.this.s(false);
        d2.a(new RunnableC0289a());
    }
}
