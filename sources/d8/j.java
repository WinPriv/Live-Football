package d8;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: Utils.java */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final long f27509b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f27510c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static j f27511d;

    /* renamed from: a, reason: collision with root package name */
    public final l3.d f27512a;

    public j(l3.d dVar) {
        this.f27512a = dVar;
    }

    public final boolean a(f8.a aVar) {
        if (TextUtils.isEmpty(aVar.f28151d)) {
            return true;
        }
        long j10 = aVar.f + aVar.f28153g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f27512a.getClass();
        if (j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f27509b) {
            return true;
        }
        return false;
    }
}
