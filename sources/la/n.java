package la;

import android.view.View;
import com.huawei.openalliance.ad.ppskit.activity.PPSActivity;

/* loaded from: classes2.dex */
public final class n implements View.OnScrollChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PPSActivity f32578a;

    public n(PPSActivity pPSActivity) {
        this.f32578a = pPSActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r4 == false) goto L19;
     */
    @Override // android.view.View.OnScrollChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScrollChange(android.view.View r3, int r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            int r3 = com.huawei.openalliance.ad.ppskit.activity.PPSActivity.f22351i0
            com.huawei.openalliance.ad.ppskit.activity.PPSActivity r3 = r2.f32578a
            r3.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r3.f22354e0
            long r4 = r4 - r6
            r6 = 500(0x1f4, double:2.47E-321)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r4 >= 0) goto L18
            r4 = r5
            goto L1f
        L18:
            long r0 = java.lang.System.currentTimeMillis()
            r3.f22354e0 = r0
            r4 = r6
        L1f:
            if (r4 != 0) goto L74
            boolean r4 = r3.k()
            if (r4 == 0) goto L42
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r4 = r3.f22362z
            java.lang.String r4 = r4.q0()
            r7 = 23
            java.lang.Integer r4 = androidx.transition.n.q(r7, r6, r4)
            if (r4 != 0) goto L36
            goto L3c
        L36:
            int r4 = r4.intValue()
            if (r4 != 0) goto L3e
        L3c:
            r4 = r5
            goto L3f
        L3e:
            r4 = r6
        L3f:
            if (r4 != 0) goto L42
            goto L43
        L42:
            r5 = r6
        L43:
            if (r5 != 0) goto L46
            goto L74
        L46:
            com.huawei.openalliance.ad.ppskit.views.PPSExpandButtonDetailView r4 = r3.G
            ka.jc r5 = r3.f22358u
            if (r4 == 0) goto L5e
            android.content.Context r4 = r3.f22359v
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r6 = r3.f22362z
            r5.getClass()
            boolean r4 = ka.jc.a(r4, r6)
            if (r4 == 0) goto L5e
            com.huawei.openalliance.ad.ppskit.views.PPSExpandButtonDetailView r4 = r3.G
            r4.g()
        L5e:
            com.huawei.openalliance.ad.ppskit.views.PPSAppDetailView r4 = r3.E
            if (r4 == 0) goto L74
            android.content.Context r4 = r3.f22359v
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r6 = r3.f22362z
            r5.getClass()
            boolean r4 = ka.jc.a(r4, r6)
            if (r4 != 0) goto L74
            com.huawei.openalliance.ad.ppskit.views.PPSAppDetailView r3 = r3.E
            r3.g()
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: la.n.onScrollChange(android.view.View, int, int, int, int):void");
    }
}
