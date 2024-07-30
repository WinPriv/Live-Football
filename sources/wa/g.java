package wa;

import android.view.View;

/* loaded from: classes2.dex */
public final class g implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.huawei.openalliance.ad.ppskit.linked.view.d f36192s;

    public g(com.huawei.openalliance.ad.ppskit.linked.view.d dVar) {
        this.f36192s = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.huawei.openalliance.ad.ppskit.linked.view.d dVar = this.f36192s;
        View.OnClickListener onClickListener = dVar.X;
        if (onClickListener != null) {
            onClickListener.onClick(dVar.G);
        }
        dVar.H();
        dVar.F();
        dVar.f();
    }
}
