package ka;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.EventMonitorRecord;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class l9 {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f31412c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public static l9 f31413d;

    /* renamed from: a, reason: collision with root package name */
    public int f31414a;

    /* renamed from: b, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.s f31415b;

    public l9(Context context) {
        this.f31415b = new com.huawei.openalliance.ad.ppskit.handlers.s(context);
    }

    public static l9 a(Context context, String str) {
        int i10;
        l9 l9Var;
        synchronized (f31412c) {
            if (f31413d == null) {
                f31413d = new l9(context);
            }
            l9 l9Var2 = f31413d;
            Integer q10 = androidx.transition.n.q(8, 0, com.huawei.openalliance.ad.ppskit.handlers.l.d(context).J(str));
            if (q10 != null) {
                i10 = q10.intValue();
            } else {
                i10 = 1;
            }
            l9Var2.f31414a = i10 * 100;
            l9Var = f31413d;
        }
        return l9Var;
    }

    public final synchronized boolean b(int i10, String str) {
        EventMonitorRecord eventMonitorRecord;
        boolean z10 = false;
        if (!TextUtils.isEmpty(str) && this.f31414a > 0) {
            com.huawei.openalliance.ad.ppskit.handlers.s sVar = this.f31415b;
            sVar.getClass();
            ArrayList h10 = sVar.h(EventMonitorRecord.class, null, 43, new String[]{str}, null, null);
            if (!androidx.transition.n.M(h10)) {
                eventMonitorRecord = (EventMonitorRecord) h10.get(0);
            } else {
                eventMonitorRecord = null;
            }
            if (eventMonitorRecord == null) {
                EventMonitorRecord eventMonitorRecord2 = new EventMonitorRecord();
                eventMonitorRecord2.z(System.currentTimeMillis());
                eventMonitorRecord2.a(i10);
                eventMonitorRecord2.A(str);
                this.f31415b.p(eventMonitorRecord2, this.f31414a);
            } else {
                com.huawei.openalliance.ad.ppskit.handlers.s sVar2 = this.f31415b;
                String d10 = eventMonitorRecord.d();
                long currentTimeMillis = System.currentTimeMillis();
                sVar2.getClass();
                ContentValues contentValues = new ContentValues();
                contentValues.put(EventMonitorRecord.ADD_TIME, Long.valueOf(currentTimeMillis));
                sVar2.l(EventMonitorRecord.class, contentValues, 47, new String[]{d10});
                z10 = true;
            }
            return z10;
        }
        return false;
    }
}
