package m;

import a.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: CustomTabsServiceConnection.java */
/* loaded from: classes.dex */
public abstract class k implements ServiceConnection {

    /* renamed from: s, reason: collision with root package name */
    public Context f32628s;

    /* compiled from: CustomTabsServiceConnection.java */
    /* loaded from: classes.dex */
    public class a extends h {
        public a(a.b bVar, ComponentName componentName) {
            super(bVar, componentName);
        }
    }

    public abstract void a(a aVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a.b c0002a;
        if (this.f32628s != null) {
            int i10 = b.a.f4a;
            if (iBinder == null) {
                c0002a = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                if (queryLocalInterface != null && (queryLocalInterface instanceof a.b)) {
                    c0002a = (a.b) queryLocalInterface;
                } else {
                    c0002a = new b.a.C0002a(iBinder);
                }
            }
            a(new a(c0002a, componentName));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
