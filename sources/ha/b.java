package ha;

import android.content.Context;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f28791a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28792b = "unbindTask" + hashCode();

    /* renamed from: c, reason: collision with root package name */
    public int f28793c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final String f28794d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f28795e;

    /* loaded from: classes2.dex */
    public interface a {
    }

    public b(Context context, String str, i iVar) {
        this.f28795e = context.getApplicationContext();
        this.f28794d = str;
        this.f28791a = iVar;
    }

    public final String a() {
        return "Monitor_" + this.f28794d;
    }
}
