package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.db.bean.AdSampleRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class yd {

    /* renamed from: a, reason: collision with root package name */
    public final ContentRecord f32219a;

    /* renamed from: b, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.y f32220b;

    /* renamed from: c, reason: collision with root package name */
    public final ConfigSpHandler f32221c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f32222d;

    /* renamed from: e, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.d0 f32223e;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AdSampleRecord f32224s;

        public a(AdSampleRecord adSampleRecord) {
            this.f32224s = adSampleRecord;
        }

        @Override // java.lang.Runnable
        public final void run() {
            yd.this.d(this.f32224s);
        }
    }

    public yd(Context context) {
        com.huawei.openalliance.ad.ppskit.handlers.d0 d0Var;
        Context applicationContext = context.getApplicationContext();
        this.f32222d = applicationContext;
        this.f32220b = new com.huawei.openalliance.ad.ppskit.handlers.y(applicationContext);
        this.f32221c = ConfigSpHandler.b(applicationContext);
        synchronized (com.huawei.openalliance.ad.ppskit.handlers.d0.f22523c) {
            try {
                if (com.huawei.openalliance.ad.ppskit.handlers.d0.f22522b == null) {
                    com.huawei.openalliance.ad.ppskit.handlers.d0.f22522b = new com.huawei.openalliance.ad.ppskit.handlers.d0(applicationContext);
                }
                d0Var = com.huawei.openalliance.ad.ppskit.handlers.d0.f22522b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f32223e = d0Var;
    }

    public static boolean c(AdSampleRecord adSampleRecord, String str) {
        if (adSampleRecord != null) {
            return false;
        }
        n7.j("BfeProcessor", "fail to create %s sample record", str);
        return true;
    }

    public final void a(AdSampleRecord adSampleRecord) {
        if (adSampleRecord == null) {
            n7.b("BfeProcessor", "sample record is empty");
        } else {
            com.huawei.openalliance.ad.ppskit.utils.p2.a(new a(adSampleRecord), 21);
        }
    }

    public final void b(List list) {
        ArrayList arrayList;
        AdSampleRecord e10 = e("userclose");
        if (c(e10, "userclose")) {
            return;
        }
        if (!androidx.transition.n.M(list)) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.huawei.openalliance.ad.ppskit.utils.y1.n((String) it.next()));
            }
        } else {
            arrayList = null;
        }
        e10.F().e(arrayList);
        a(e10);
    }

    public final void d(AdSampleRecord adSampleRecord) {
        long j10;
        long j11;
        long j12;
        AdSampleRecord adSampleRecord2;
        com.huawei.openalliance.ad.ppskit.handlers.d0 d0Var = this.f32223e;
        d0Var.getClass();
        byte[] bArr = com.huawei.openalliance.ad.ppskit.handlers.d0.f22524d;
        synchronized (bArr) {
            j10 = d0Var.f22525a.getSharedPreferences("hiad_brain_config", 4).getLong("last_delete_time", 0L);
        }
        Calendar calendar = Calendar.getInstance();
        int i10 = 11;
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        if (timeInMillis - j10 >= 86400000) {
            n7.b("BfeProcessor", "deleteExpireSample");
            ConfigSpHandler configSpHandler = this.f32221c;
            synchronized (configSpHandler.f22478a) {
                Long s10 = com.huawei.openalliance.ad.ppskit.utils.y1.s(configSpHandler.D("valityOfBrainSample"));
                if (s10 != null && s10.longValue() > 0) {
                    j11 = s10.longValue() * 86400000;
                }
                j11 = 7776000000L;
            }
            com.huawei.openalliance.ad.ppskit.handlers.y yVar = this.f32220b;
            yVar.getClass();
            yVar.j(AdSampleRecord.class, 49, new String[]{String.valueOf(timeInMillis - j11)});
            com.huawei.openalliance.ad.ppskit.handlers.d0 d0Var2 = this.f32223e;
            d0Var2.getClass();
            synchronized (bArr) {
                d0Var2.f22525a.getSharedPreferences("hiad_brain_config", 4).edit().putLong("last_delete_time", timeInMillis).commit();
            }
            try {
                Context createDeviceProtectedStorageContext = this.f32222d.createDeviceProtectedStorageContext();
                long K = com.huawei.openalliance.ad.ppskit.utils.z1.K(createDeviceProtectedStorageContext);
                ConfigSpHandler configSpHandler2 = this.f32221c;
                synchronized (configSpHandler2.f22478a) {
                    Integer q10 = com.huawei.openalliance.ad.ppskit.utils.y1.q(configSpHandler2.D("maxDbSize"));
                    if (q10 != null && q10.intValue() > 0) {
                        j12 = q10.intValue() * com.huawei.openalliance.ad.constant.w.f22146c;
                    }
                    j12 = 209715200;
                }
                n7.c("BfeProcessor", "deleteOverLimit limitDbSize:%s", Long.valueOf(j12));
                int i11 = 7;
                while (K > j12) {
                    int i12 = i11 - 1;
                    if (i11 <= 0) {
                        break;
                    }
                    ArrayList h10 = this.f32220b.h(AdSampleRecord.class, new String[]{"time"}, 0, null, "time asc", "1");
                    if (androidx.transition.n.M(h10)) {
                        adSampleRecord2 = null;
                    } else {
                        adSampleRecord2 = (AdSampleRecord) h10.get(0);
                    }
                    if (adSampleRecord2 == null || adSampleRecord2.A() > timeInMillis) {
                        break;
                    }
                    long A = adSampleRecord2.A();
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(A);
                    calendar2.set(i10, 0);
                    calendar2.set(12, 0);
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                    long timeInMillis2 = calendar2.getTimeInMillis() + 86400000;
                    n7.c("BfeProcessor", "deleteOverLimit expireTime:%s", Long.valueOf(timeInMillis2));
                    com.huawei.openalliance.ad.ppskit.handlers.y yVar2 = this.f32220b;
                    yVar2.getClass();
                    yVar2.j(AdSampleRecord.class, 49, new String[]{String.valueOf(timeInMillis2)});
                    i11 = i12;
                    K = com.huawei.openalliance.ad.ppskit.utils.z1.K(createDeviceProtectedStorageContext);
                    i10 = 11;
                }
            } catch (Throwable th) {
                n7.f("BfeProcessor", "deleteOverLimit err: %s", th.getClass().getSimpleName());
            }
        }
        com.huawei.openalliance.ad.ppskit.handlers.y yVar3 = this.f32220b;
        yVar3.d(AdSampleRecord.class, adSampleRecord.l(yVar3.f22513b));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.openalliance.ad.ppskit.db.bean.AdSampleRecord e(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.yd.e(java.lang.String):com.huawei.openalliance.ad.ppskit.db.bean.AdSampleRecord");
    }

    public yd(Context context, ContentRecord contentRecord) {
        this(context);
        this.f32219a = contentRecord;
    }
}
