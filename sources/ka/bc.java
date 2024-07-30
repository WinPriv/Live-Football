package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;

/* loaded from: classes2.dex */
public final class bc {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f30983b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public static bc f30984c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f30985a;

    public bc(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f30985a = applicationContext;
        ConfigSpHandler.b(applicationContext);
    }
}
