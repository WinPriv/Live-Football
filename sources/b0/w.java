package b0;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import c.a;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: NotificationManagerCompat.java */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static String f2767d;

    /* renamed from: g, reason: collision with root package name */
    public static c f2769g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2770a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f2771b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2766c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HashSet f2768e = new HashSet();
    public static final Object f = new Object();

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final String f2772a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2773b;

        /* renamed from: c, reason: collision with root package name */
        public final String f2774c = null;

        /* renamed from: d, reason: collision with root package name */
        public final Notification f2775d;

        public a(int i10, Notification notification, String str) {
            this.f2772a = str;
            this.f2773b = i10;
            this.f2775d = notification;
        }

        @Override // b0.w.d
        public final void a(c.a aVar) throws RemoteException {
            String str = this.f2774c;
            aVar.i(this.f2773b, this.f2775d, this.f2772a, str);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
            sb2.append(this.f2772a);
            sb2.append(", id:");
            sb2.append(this.f2773b);
            sb2.append(", tag:");
            return a3.l.p(sb2, this.f2774c, "]");
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final ComponentName f2776a;

        /* renamed from: b, reason: collision with root package name */
        public final IBinder f2777b;

        public b(ComponentName componentName, IBinder iBinder) {
            this.f2776a = componentName;
            this.f2777b = iBinder;
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class c implements Handler.Callback, ServiceConnection {

        /* renamed from: s, reason: collision with root package name */
        public final Context f2778s;

        /* renamed from: t, reason: collision with root package name */
        public final Handler f2779t;

        /* renamed from: u, reason: collision with root package name */
        public final HashMap f2780u = new HashMap();

        /* renamed from: v, reason: collision with root package name */
        public HashSet f2781v = new HashSet();

        /* compiled from: NotificationManagerCompat.java */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final ComponentName f2782a;

            /* renamed from: c, reason: collision with root package name */
            public c.a f2784c;

            /* renamed from: b, reason: collision with root package name */
            public boolean f2783b = false;

            /* renamed from: d, reason: collision with root package name */
            public final ArrayDeque<d> f2785d = new ArrayDeque<>();

            /* renamed from: e, reason: collision with root package name */
            public int f2786e = 0;

            public a(ComponentName componentName) {
                this.f2782a = componentName;
            }
        }

        public c(Context context) {
            this.f2778s = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            handlerThread.start();
            this.f2779t = new Handler(handlerThread.getLooper(), this);
        }

        public final void a(a aVar) {
            boolean z10;
            boolean isLoggable = Log.isLoggable("NotifManCompat", 3);
            ComponentName componentName = aVar.f2782a;
            ArrayDeque<d> arrayDeque = aVar.f2785d;
            if (isLoggable) {
                Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            if (aVar.f2783b) {
                z10 = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.f2778s;
                boolean bindService = context.bindService(component, this, 33);
                aVar.f2783b = bindService;
                if (bindService) {
                    aVar.f2786e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z10 = aVar.f2783b;
            }
            if (z10 && aVar.f2784c != null) {
                while (true) {
                    d peek = arrayDeque.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.a(aVar.f2784c);
                        arrayDeque.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + componentName);
                        }
                    } catch (RemoteException e10) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e10);
                    }
                }
                if (!arrayDeque.isEmpty()) {
                    b(aVar);
                    return;
                }
                return;
            }
            b(aVar);
        }

        public final void b(a aVar) {
            Handler handler = this.f2779t;
            ComponentName componentName = aVar.f2782a;
            if (handler.hasMessages(3, componentName)) {
                return;
            }
            int i10 = aVar.f2786e + 1;
            aVar.f2786e = i10;
            if (i10 > 6) {
                StringBuilder sb2 = new StringBuilder("Giving up on delivering ");
                ArrayDeque<d> arrayDeque = aVar.f2785d;
                sb2.append(arrayDeque.size());
                sb2.append(" tasks to ");
                sb2.append(componentName);
                sb2.append(" after ");
                sb2.append(aVar.f2786e);
                sb2.append(" retries");
                Log.w("NotifManCompat", sb2.toString());
                arrayDeque.clear();
                return;
            }
            int i11 = (1 << (i10 - 1)) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i11);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            HashSet hashSet;
            int i10 = message.what;
            c.a aVar = null;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return false;
                        }
                        a aVar2 = (a) this.f2780u.get((ComponentName) message.obj);
                        if (aVar2 != null) {
                            a(aVar2);
                        }
                        return true;
                    }
                    a aVar3 = (a) this.f2780u.get((ComponentName) message.obj);
                    if (aVar3 != null) {
                        if (aVar3.f2783b) {
                            this.f2778s.unbindService(this);
                            aVar3.f2783b = false;
                        }
                        aVar3.f2784c = null;
                    }
                    return true;
                }
                b bVar = (b) message.obj;
                ComponentName componentName = bVar.f2776a;
                IBinder iBinder = bVar.f2777b;
                a aVar4 = (a) this.f2780u.get(componentName);
                if (aVar4 != null) {
                    int i11 = a.AbstractBinderC0032a.f3193a;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                        if (queryLocalInterface != null && (queryLocalInterface instanceof c.a)) {
                            aVar = (c.a) queryLocalInterface;
                        } else {
                            aVar = new a.AbstractBinderC0032a.C0033a(iBinder);
                        }
                    }
                    aVar4.f2784c = aVar;
                    aVar4.f2786e = 0;
                    a(aVar4);
                }
                return true;
            }
            d dVar = (d) message.obj;
            String string = Settings.Secure.getString(this.f2778s.getContentResolver(), "enabled_notification_listeners");
            synchronized (w.f2766c) {
                if (string != null) {
                    try {
                        if (!string.equals(w.f2767d)) {
                            String[] split = string.split(com.huawei.openalliance.ad.constant.w.bE, -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            w.f2768e = hashSet2;
                            w.f2767d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = w.f2768e;
            }
            if (!hashSet.equals(this.f2781v)) {
                this.f2781v = hashSet;
                List<ResolveInfo> queryIntentServices = this.f2778s.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName2);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName3 = (ComponentName) it.next();
                    if (!this.f2780u.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                        }
                        this.f2780u.put(componentName3, new a(componentName3));
                    }
                }
                Iterator it2 = this.f2780u.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        a aVar5 = (a) entry.getValue();
                        if (aVar5.f2783b) {
                            this.f2778s.unbindService(this);
                            aVar5.f2783b = false;
                        }
                        aVar5.f2784c = null;
                        it2.remove();
                    }
                }
            }
            for (a aVar6 : this.f2780u.values()) {
                aVar6.f2785d.add(dVar);
                a(aVar6);
            }
            return true;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f2779t.obtainMessage(1, new b(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f2779t.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public interface d {
        void a(c.a aVar) throws RemoteException;
    }

    public w(Context context) {
        this.f2770a = context;
        this.f2771b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i10, Notification notification) {
        boolean z10;
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            z10 = true;
        } else {
            z10 = false;
        }
        NotificationManager notificationManager = this.f2771b;
        if (z10) {
            a aVar = new a(i10, notification, this.f2770a.getPackageName());
            synchronized (f) {
                if (f2769g == null) {
                    f2769g = new c(this.f2770a.getApplicationContext());
                }
                f2769g.f2779t.obtainMessage(0, aVar).sendToTarget();
            }
            notificationManager.cancel(null, i10);
            return;
        }
        notificationManager.notify(null, i10, notification);
    }
}
