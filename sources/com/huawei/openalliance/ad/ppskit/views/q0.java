package com.huawei.openalliance.ad.ppskit.views;

import android.text.TextUtils;
import android.view.View;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.activity.ComplianceActivity;
import com.huawei.openalliance.ad.ppskit.activity.PPSRewardActivity;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import ka.n7;

/* loaded from: classes2.dex */
public final class q0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AdContentData f23530s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f23531t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f23532u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f23533v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ContentRecord f23534w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f23535x;
    public final /* synthetic */ boolean y = true;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ PPSRewardView f23536z;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AdContentData adContentData;
            AdContentData adContentData2;
            AdContentData adContentData3;
            q0 q0Var = q0.this;
            ua.b bVar = q0Var.f23536z.B;
            if (bVar != null && (adContentData = bVar.f35820b) != null) {
                boolean M = androidx.transition.n.M(adContentData.q());
                PPSRewardView pPSRewardView = q0Var.f23536z;
                if (M) {
                    ua.b bVar2 = pPSRewardView.B;
                    if (bVar2.f35835s == null && (adContentData3 = bVar2.f35820b) != null) {
                        String i10 = adContentData3.i();
                        if (!y1.h(i10)) {
                            bVar2.f35835s = i10;
                        }
                    }
                    String str = bVar2.f35835s;
                    if (TextUtils.isEmpty(str)) {
                        ua.b bVar3 = pPSRewardView.B;
                        if (bVar3.f35834r == null && (adContentData2 = bVar3.f35820b) != null) {
                            String h10 = adContentData2.h();
                            if (!y1.h(h10)) {
                                bVar3.f35834r = h10;
                            }
                        }
                        str = bVar3.f35834r;
                    }
                    com.huawei.openalliance.ad.ppskit.utils.d0.n(pPSRewardView.getContext(), str);
                    return;
                }
                ComplianceActivity.v(pPSRewardView.getContext(), view, pPSRewardView.B.f35820b);
                return;
            }
            n7.g("PPSRewardView", "AdInfo is null or contentData is null");
        }
    }

    public q0(PPSRewardView pPSRewardView, AdContentData adContentData, String str, int i10, boolean z10, ContentRecord contentRecord, String str2) {
        this.f23536z = pPSRewardView;
        this.f23530s = adContentData;
        this.f23531t = str;
        this.f23532u = i10;
        this.f23533v = z10;
        this.f23534w = contentRecord;
        this.f23535x = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdContentData adContentData;
        AdContentData adContentData2;
        String str = this.f23535x;
        ContentRecord contentRecord = this.f23534w;
        String str2 = this.f23531t;
        PPSRewardView pPSRewardView = this.f23536z;
        try {
            ua.b bVar = new ua.b(this.f23530s, str2);
            pPSRewardView.B = bVar;
            bVar.f35833q = this.f23532u;
            bVar.f35837u = this.f23533v;
            bVar.f35838v = contentRecord.L0();
            pPSRewardView.C = contentRecord;
            PPSRewardView.F(pPSRewardView, pPSRewardView.getContext(), contentRecord);
            VideoInfo a10 = pPSRewardView.B.a();
            pPSRewardView.L0 = a10;
            if (a10 == null) {
                n7.g("PPSRewardView", "there is no video");
                return;
            }
            pPSRewardView.getClass();
            n7.e("PPSRewardView", "register:" + pPSRewardView.B.f());
            PPSRewardView.G(pPSRewardView, str2, str);
            PPSRewardView.U(pPSRewardView);
            PPSRewardView.H(pPSRewardView, str2, this.y);
            PPSRewardView.M(pPSRewardView, str2, str);
            PPSRewardView.V(pPSRewardView);
            if (!pPSRewardView.f23265u0) {
                ua.b bVar2 = pPSRewardView.B;
                if (bVar2 != null) {
                    if (bVar2.f35835s == null && (adContentData2 = bVar2.f35820b) != null) {
                        String i10 = adContentData2.i();
                        if (!y1.h(i10)) {
                            bVar2.f35835s = i10;
                        }
                    }
                    String str3 = bVar2.f35835s;
                    ua.b bVar3 = pPSRewardView.B;
                    if (bVar3.f35836t == null && (adContentData = bVar3.f35820b) != null) {
                        String j10 = adContentData.j();
                        if (!y1.h(j10)) {
                            bVar3.f35836t = j10;
                        }
                    }
                    String str4 = bVar3.f35836t;
                    if (!TextUtils.isEmpty(str3)) {
                        if (TextUtils.isEmpty(str4)) {
                            pPSRewardView.W.setImageResource(R.drawable.hiad_ad_adchoice);
                        } else {
                            pPSRewardView.W.setAdChoiceIcon(str4);
                        }
                    }
                }
                pPSRewardView.W.setOnClickListener(new a());
            }
            va.d dVar = pPSRewardView.I0;
            if (dVar != null) {
                PPSRewardActivity.l(PPSRewardActivity.this, 1, -1, -1);
            }
            pPSRewardView.B.getClass();
        } catch (RuntimeException | Exception unused) {
            n7.i("PPSRewardView", "refresh ui error");
        }
    }
}
