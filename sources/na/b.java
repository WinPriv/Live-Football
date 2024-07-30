package na;

import android.content.Context;
import android.view.View;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import ka.ii;
import ka.n7;

/* loaded from: classes2.dex */
public final class b implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f33481s;

    public b(d dVar) {
        this.f33481s = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d dVar = this.f33481s;
        if (dVar.f33488g) {
            dVar.f33488g = false;
            n7.e("HorizontalScrollViewAdapter", "onClick");
            Context context = dVar.f33483a;
            ContentRecord contentRecord = dVar.f33485c;
            ii N = a0.a.N(context, contentRecord, dVar.f33486d, false);
            dVar.f.u(contentRecord, contentRecord.h1(), "arAdClick");
            if (!N.a()) {
                n7.g("HorizontalScrollViewAdapter", "ENTER DETAIL FAILED");
            }
            d2.b(new c(dVar), 500L);
        }
    }
}
