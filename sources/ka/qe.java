package ka;

import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.List;

/* loaded from: classes2.dex */
public final class qe implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ContentRecord f31685s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List f31686t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ te f31687u;

    public qe(te teVar, ContentRecord contentRecord, List list) {
        this.f31687u = teVar;
        this.f31685s = contentRecord;
        this.f31686t = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31687u.b(this.f31685s, this.f31686t);
    }
}
