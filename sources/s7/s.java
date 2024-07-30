package s7;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class s implements c8.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35253a;

    @Override // c8.a
    public final Object get() {
        switch (this.f35253a) {
            case 0:
                return null;
            default:
                p<ScheduledExecutorService> pVar = ExecutorsRegistrar.f21263a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i10 = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i10 >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new t7.g(Executors.newFixedThreadPool(4, new t7.a("Firebase Background", 10, detectNetwork.penaltyLog().build())), ExecutorsRegistrar.f21266d.get());
        }
    }
}
