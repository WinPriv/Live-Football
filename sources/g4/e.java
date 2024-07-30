package g4;

import com.google.auto.value.AutoValue;

/* compiled from: EventStoreConfig.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f28486a;

    static {
        String str;
        Long l10 = 10485760L;
        Integer num = 200;
        Integer num2 = 10000;
        Long l11 = 604800000L;
        Integer num3 = 81920;
        if (l10 == null) {
            str = " maxStorageSizeInBytes";
        } else {
            str = "";
        }
        if (num == null) {
            str = str.concat(" loadBatchSize");
        }
        if (num2 == null) {
            str = com.ironsource.adapters.facebook.a.h(str, " criticalSectionEnterTimeoutMs");
        }
        if (l11 == null) {
            str = com.ironsource.adapters.facebook.a.h(str, " eventCleanUpAge");
        }
        if (num3 == null) {
            str = com.ironsource.adapters.facebook.a.h(str, " maxBlobByteSizePerRow");
        }
        if (str.isEmpty()) {
            f28486a = new a(l10.longValue(), num.intValue(), num2.intValue(), l11.longValue(), num3.intValue());
            return;
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}
