package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.db.bean.EventRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ImpEventRecord;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class dg extends zf {
    public static final ThreadPoolExecutor f = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ti("Imp-Event", 5));

    /* renamed from: e, reason: collision with root package name */
    public long f31105e;

    public dg(Context context, gi giVar) {
        super(context, giVar);
    }

    @Override // ka.zf
    public final Class<? extends EventRecord> a() {
        return ImpEventRecord.class;
    }

    @Override // ka.zf
    public final void b(long j10) {
        synchronized (dg.class) {
            this.f31105e = j10;
        }
    }

    @Override // ka.zf
    public final ThreadPoolExecutor i() {
        return f;
    }

    @Override // ka.zf
    public final String l() {
        return "ImpEventReporter";
    }

    @Override // ka.zf
    public final long n() {
        long j10;
        synchronized (dg.class) {
            j10 = this.f31105e;
        }
        return j10;
    }
}
