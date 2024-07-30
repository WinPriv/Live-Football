package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import f1.d;
import f1.e;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: s, reason: collision with root package name */
    public int f2399s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap<Integer, String> f2400t = new HashMap<>();

    /* renamed from: u, reason: collision with root package name */
    public final a f2401u = new a();

    /* renamed from: v, reason: collision with root package name */
    public final b f2402v = new b();

    /* loaded from: classes.dex */
    public class a extends RemoteCallbackList<d> {
        public a() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(d dVar, Object obj) {
            MultiInstanceInvalidationService.this.f2400t.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* loaded from: classes.dex */
    public class b extends e {
        public b() {
        }

        public final void m(String[] strArr, int i10) {
            synchronized (MultiInstanceInvalidationService.this.f2401u) {
                String str = MultiInstanceInvalidationService.this.f2400t.get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f2401u.beginBroadcast();
                for (int i11 = 0; i11 < beginBroadcast; i11++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f2401u.getBroadcastCookie(i11)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f2400t.get(Integer.valueOf(intValue));
                        if (i10 != intValue && str.equals(str2)) {
                            try {
                                MultiInstanceInvalidationService.this.f2401u.getBroadcastItem(i11).b(strArr);
                            } catch (RemoteException e10) {
                                Log.w("ROOM", "Error invoking a remote callback", e10);
                            }
                        }
                    } finally {
                        MultiInstanceInvalidationService.this.f2401u.finishBroadcast();
                    }
                }
            }
        }

        public final int n(d dVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f2401u) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i10 = multiInstanceInvalidationService.f2399s + 1;
                multiInstanceInvalidationService.f2399s = i10;
                if (multiInstanceInvalidationService.f2401u.register(dVar, Integer.valueOf(i10))) {
                    MultiInstanceInvalidationService.this.f2400t.put(Integer.valueOf(i10), str);
                    return i10;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f2399s--;
                return 0;
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f2402v;
    }
}
