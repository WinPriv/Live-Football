package f4;

import com.google.auto.value.AutoValue;
import java.util.Map;
import java.util.Set;

/* compiled from: SchedulerConfig.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class d {

    /* compiled from: SchedulerConfig.java */
    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class a {

        /* compiled from: SchedulerConfig.java */
        @AutoValue.Builder
        /* renamed from: f4.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static abstract class AbstractC0377a {
        }

        public abstract long a();

        public abstract Set<b> b();

        public abstract long c();
    }

    /* compiled from: SchedulerConfig.java */
    /* loaded from: classes.dex */
    public enum b {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public abstract i4.a a();

    public final long b(w3.d dVar, long j10, int i10) {
        long j11;
        long a10 = j10 - a().a();
        a aVar = c().get(dVar);
        long a11 = aVar.a();
        int i11 = i10 - 1;
        if (a11 > 1) {
            j11 = a11;
        } else {
            j11 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * a11 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j11 * i11))), a10), aVar.c());
    }

    public abstract Map<w3.d, a> c();
}
