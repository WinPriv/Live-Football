package ka;

import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class de implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ContentRecord f31100s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ce f31101t;

    public de(ce ceVar, ContentRecord contentRecord) {
        this.f31101t = ceVar;
        this.f31100s = contentRecord;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ContentRecord contentRecord = this.f31100s;
        contentRecord.r2(contentRecord.t() + 1);
        n7.c("ContentProcessor", "content : %s update DisplayCount to %s", contentRecord.h(), Integer.valueOf(contentRecord.t()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContentRecord.DISPLAY_COUNT);
        this.f31101t.f31052e.t(contentRecord, arrayList);
    }
}
