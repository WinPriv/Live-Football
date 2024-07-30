package i8;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: TopicsSubscriber.java */
/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: i, reason: collision with root package name */
    public static final long f29248i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f29249j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f29250a;

    /* renamed from: b, reason: collision with root package name */
    public final r f29251b;

    /* renamed from: c, reason: collision with root package name */
    public final o f29252c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f29253d;
    public final ScheduledExecutorService f;

    /* renamed from: h, reason: collision with root package name */
    public final b0 f29256h;

    /* renamed from: e, reason: collision with root package name */
    public final q.b f29254e = new q.b();

    /* renamed from: g, reason: collision with root package name */
    public boolean f29255g = false;

    public d0(FirebaseMessaging firebaseMessaging, r rVar, b0 b0Var, o oVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f29253d = firebaseMessaging;
        this.f29251b = rVar;
        this.f29256h = b0Var;
        this.f29252c = oVar;
        this.f29250a = context;
        this.f = scheduledExecutorService;
    }

    public static <T> void a(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e11);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e12) {
            e = e12;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public static boolean d() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    public final void b(String str) throws IOException {
        String a10 = this.f29253d.a();
        o oVar = this.f29252c;
        oVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(oVar.a(oVar.c(a10, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String a10 = this.f29253d.a();
        o oVar = this.f29252c;
        oVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString(com.anythink.expressad.d.a.b.az, "1");
        a(oVar.a(oVar.c(a10, "/topics/" + str, bundle)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x000e, code lost:
    
        if (d() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0010, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0018, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0087 A[Catch: IOException -> 0x00a3, TryCatch #2 {IOException -> 0x00a3, blocks: (B:8:0x0023, B:17:0x004f, B:19:0x0055, B:66:0x006b, B:68:0x0074, B:69:0x0087, B:71:0x0090, B:72:0x0032, B:75:0x003c), top: B:7:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.d0.e():boolean");
    }

    public final void f(long j10) {
        this.f.schedule(new e0(this, this.f29250a, this.f29251b, Math.min(Math.max(30L, 2 * j10), f29248i)), j10, TimeUnit.SECONDS);
        synchronized (this) {
            this.f29255g = true;
        }
    }
}
