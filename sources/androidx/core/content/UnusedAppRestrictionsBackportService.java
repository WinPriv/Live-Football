package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import c0.c;

/* loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* renamed from: s, reason: collision with root package name */
    public final a f1574s = new a();

    /* loaded from: classes.dex */
    public class a extends c {
        public a() {
        }
    }

    public abstract void a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f1574s;
    }
}
