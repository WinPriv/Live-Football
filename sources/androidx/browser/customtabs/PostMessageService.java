package androidx.browser.customtabs;

import a.c;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public class PostMessageService extends Service {

    /* renamed from: s, reason: collision with root package name */
    public final a f1297s = new a();

    /* loaded from: classes.dex */
    public class a extends c {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f1297s;
    }
}
