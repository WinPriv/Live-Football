package ib;

import android.content.ContentResolver;
import android.content.Context;
import ka.n7;

/* loaded from: classes2.dex */
public final class w implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f29527s;

    public w(Context context) {
        this.f29527s = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ContentResolver contentResolver;
        try {
            n7.b("OaidSettingsUtil", "write NIL_UUID");
            Context context = this.f29527s;
            if (context == null || (contentResolver = context.getContentResolver()) == null) {
                return;
            }
            v.g(contentResolver, "00000000-0000-0000-0000-000000000000", Boolean.TRUE.toString());
        } catch (Throwable th) {
            e0.i.p(th, "exception happen ", "OaidSettingsUtil");
        }
    }
}
