package gb;

import android.content.Context;
import android.os.Looper;
import com.huawei.hms.ads.ex;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationServices;
import v9.Task;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final gb.c f28559a;

    /* renamed from: b, reason: collision with root package name */
    public final LocationRequest f28560b;

    /* renamed from: c, reason: collision with root package name */
    public final FusedLocationProviderClient f28561c;

    /* renamed from: d, reason: collision with root package name */
    public final f f28562d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f28563e = false;

    /* loaded from: classes2.dex */
    public class a implements v9.b {
        public a() {
        }

        @Override // v9.b
        public final void onFailure(Exception exc) {
            ex.Z("LocationUtils", "loc_tag requestLocationUpdates onFailure");
            i iVar = (i) d.this.f28562d;
            iVar.getClass();
            try {
                gb.e.g(2, iVar.f28588a);
            } catch (Throwable th) {
                ex.V("LocationUtils", "onLocationAcquireFailed ex: %s", th.getClass().getSimpleName());
            }
            d.this.f28563e = true;
        }
    }

    /* loaded from: classes2.dex */
    public class b implements v9.c<Void> {
        @Override // v9.c
        public final void onSuccess(Void r22) {
            ex.V("LocationUtils", "loc_tag requestLocationUpdates onSuccess");
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!d.this.f28563e) {
                d.this.b();
            }
        }
    }

    /* renamed from: gb.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0390d implements v9.b {
        public C0390d() {
        }

        @Override // v9.b
        public final void onFailure(Exception exc) {
            ex.Code("LocationUtils", "loc_tag removeLocationUpdates onFailure:%s", exc.getClass().getSimpleName());
            d.this.f28563e = false;
        }
    }

    /* loaded from: classes2.dex */
    public class e implements v9.c<Void> {
        public e() {
        }

        @Override // v9.c
        public final void onSuccess(Void r22) {
            ex.Code("LocationUtils", "loc_tag removeLocationUpdates onSuccess");
            d.this.f28563e = true;
        }
    }

    /* loaded from: classes2.dex */
    public interface f {
    }

    public d(Context context, i iVar) {
        if (context != null) {
            this.f28562d = iVar;
            this.f28561c = LocationServices.getFusedLocationProviderClient(context);
            LocationRequest locationRequest = new LocationRequest();
            this.f28560b = locationRequest;
            locationRequest.setPriority(100);
            locationRequest.setNumUpdates(1);
            locationRequest.setInterval(com.anythink.expressad.exoplayer.f.f7962a);
            this.f28559a = new gb.c();
        }
    }

    public final void a() {
        if (this.f28561c == null) {
            return;
        }
        this.f28563e = false;
        Task requestLocationUpdates = this.f28561c.requestLocationUpdates(this.f28560b, this.f28559a, Looper.getMainLooper());
        requestLocationUpdates.b(new b());
        requestLocationUpdates.a(new a());
        w.a(30000L, new c());
    }

    public final void b() {
        if (this.f28563e) {
            return;
        }
        try {
            Task removeLocationUpdates = this.f28561c.removeLocationUpdates(this.f28559a);
            removeLocationUpdates.b(new e());
            removeLocationUpdates.a(new C0390d());
        } catch (Throwable th) {
            e0.i.q(th, "loc_tag removeLocationUpdates encounter exception:", "LocationUtils");
        }
    }
}
