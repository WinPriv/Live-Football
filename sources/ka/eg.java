package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.db.bean.EventRecord;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class eg extends zf {
    public static final ThreadPoolExecutor f = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ti("Normal-Event", 5));

    /* renamed from: e, reason: collision with root package name */
    public long f31144e;

    public eg(Context context, gi giVar) {
        super(context, giVar);
    }

    @Override // ka.zf
    public final Class<? extends EventRecord> a() {
        return EventRecord.class;
    }

    @Override // ka.zf
    public final void b(long j10) {
        synchronized (eg.class) {
            this.f31144e = j10;
        }
    }

    @Override // ka.zf
    public final ThreadPoolExecutor i() {
        return f;
    }

    @Override // ka.zf
    public final String l() {
        return "NormalEventReporter";
    }

    @Override // ka.zf
    public final long n() {
        long j10;
        synchronized (eg.class) {
            j10 = this.f31144e;
        }
        return j10;
    }
}
