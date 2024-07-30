package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public final class ic implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f31282s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ContentRecord f31283t;

    public ic(Context context, ContentRecord contentRecord) {
        this.f31282s = context;
        this.f31283t = contentRecord;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new com.huawei.openalliance.ad.ppskit.handlers.e0(this.f31282s).r(this.f31283t);
    }
}
