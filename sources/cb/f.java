package cb;

import android.database.DataSetObserver;
import com.huawei.openalliance.ad.ppskit.views.viewpager.PPSGalleryView;

/* loaded from: classes2.dex */
public final class f extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final PPSGalleryView f3480a;

    public f(PPSGalleryView pPSGalleryView) {
        this.f3480a = pPSGalleryView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f3480a.l();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f3480a.l();
    }
}
