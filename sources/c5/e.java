package c5;

import android.content.Context;
import android.graphics.Path;
import androidx.transition.n;
import com.google.android.exoplayer2.metadata.Metadata;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.f;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ka.n7;
import s8.a;

/* compiled from: SimpleMetadataDecoder.java */
/* loaded from: classes2.dex */
public abstract class e implements a {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f3283s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f3284t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static a.C0479a f3285u;

    public static Object b(Callable callable, Object obj, long j10, TimeUnit timeUnit) {
        String str;
        if (callable == null) {
            return obj;
        }
        try {
            return p2.f22957a.get(6).submit(callable).get(j10, timeUnit);
        } catch (InterruptedException unused) {
            str = "call InterruptedException";
            n7.g(com.anythink.core.c.e.f4869a, str);
            return obj;
        } catch (ExecutionException unused2) {
            str = "call ExecutionException";
            n7.g(com.anythink.core.c.e.f4869a, str);
            return obj;
        } catch (TimeoutException unused3) {
            str = "call TimeoutException";
            n7.g(com.anythink.core.c.e.f4869a, str);
            return obj;
        }
    }

    public static Object e(Callable callable) {
        return b(callable, null, 1L, TimeUnit.SECONDS);
    }

    @Override // c5.a
    public Metadata a(c cVar) {
        boolean z10;
        ByteBuffer byteBuffer = cVar.f33322u;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.a(z10);
        if (cVar.g()) {
            return null;
        }
        return g(cVar, byteBuffer);
    }

    public abstract void c(Context context, ContentRecord contentRecord);

    public boolean d(Context context, ContentRecord contentRecord, AppDownloadTask appDownloadTask) {
        boolean z10;
        String str;
        int intValue;
        if (appDownloadTask.l0() == null ? !(appDownloadTask.k0() == null || appDownloadTask.k0().intValue() != 6) : appDownloadTask.l0().intValue() == 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            n7.b("DownloadChecker", "not api download");
            return true;
        }
        if (!d0.m(context)) {
            n7.b("DownloadChecker", "api control hms allowed");
            return true;
        }
        String s02 = appDownloadTask.s0();
        if (s02 == null) {
            ConcurrentHashMap<String, String> concurrentHashMap = f.f22842a;
            str = null;
        } else {
            str = f.f22842a.get(s02);
        }
        if (str == null) {
            n7.c("DownloadChecker", "cannot get control info by slotId %s", appDownloadTask.s0());
            return true;
        }
        Integer q10 = n.q(3, 1, str);
        if (q10 == null) {
            intValue = 0;
        } else {
            intValue = q10.intValue();
        }
        n7.c("DownloadChecker", "api control flag:%s", Integer.valueOf(intValue));
        if (intValue == 0) {
            return true;
        }
        if (intValue != 1) {
            if (intValue != 2) {
                n7.g("DownloadChecker", "invalid apiDownloadFlag value!");
            }
            return false;
        }
        c(context, contentRecord);
        return false;
    }

    public abstract Metadata g(c cVar, ByteBuffer byteBuffer);

    public abstract Path h(float f, float f10, float f11, float f12);
}
