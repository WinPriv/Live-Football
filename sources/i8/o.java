package i8;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: GmsRpc.java */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final n7.e f29286a;

    /* renamed from: b, reason: collision with root package name */
    public final r f29287b;

    /* renamed from: c, reason: collision with root package name */
    public final Rpc f29288c;

    /* renamed from: d, reason: collision with root package name */
    public final c8.a<k8.g> f29289d;

    /* renamed from: e, reason: collision with root package name */
    public final c8.a<a8.i> f29290e;
    public final d8.c f;

    public o(n7.e eVar, r rVar, c8.a<k8.g> aVar, c8.a<a8.i> aVar2, d8.c cVar) {
        eVar.a();
        Rpc rpc = new Rpc(eVar.f33458a);
        this.f29286a = eVar;
        this.f29287b = rVar;
        this.f29288c = rpc;
        this.f29289d = aVar;
        this.f29290e = aVar2;
        this.f = cVar;
    }

    public final Task<String> a(Task<Bundle> task) {
        return task.continueWith(new Executor() { // from class: i8.n
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new com.applovin.exoplayer2.a.x(this, 10));
    }

    public final void b(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        int i10;
        String str3;
        String str4;
        String str5;
        int b10;
        PackageInfo b11;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        n7.e eVar = this.f29286a;
        eVar.a();
        bundle.putString("gmp_app_id", eVar.f33460c.f33470b);
        r rVar = this.f29287b;
        synchronized (rVar) {
            if (rVar.f29297d == 0 && (b11 = rVar.b("com.google.android.gms")) != null) {
                rVar.f29297d = b11.versionCode;
            }
            i10 = rVar.f29297d;
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        r rVar2 = this.f29287b;
        synchronized (rVar2) {
            if (rVar2.f29295b == null) {
                rVar2.d();
            }
            str3 = rVar2.f29295b;
        }
        bundle.putString("app_ver", str3);
        r rVar3 = this.f29287b;
        synchronized (rVar3) {
            if (rVar3.f29296c == null) {
                rVar3.d();
            }
            str4 = rVar3.f29296c;
        }
        bundle.putString("app_ver_name", str4);
        n7.e eVar2 = this.f29286a;
        eVar2.a();
        try {
            str5 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(eVar2.f33459b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str5 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str5);
        try {
            String a10 = ((d8.g) Tasks.await(this.f.a())).a();
            if (!TextUtils.isEmpty(a10)) {
                bundle.putString("Goog-Firebase-Installations-Auth", a10);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString("appid", (String) Tasks.await(this.f.getId()));
        bundle.putString("cliv", "fcm-23.2.1");
        a8.i iVar = this.f29290e.get();
        k8.g gVar = this.f29289d.get();
        if (iVar != null && gVar != null && (b10 = iVar.b()) != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(s.f.c(b10)));
            bundle.putString("Firebase-Client", gVar.getUserAgent());
        }
    }

    public final Task<Bundle> c(String str, String str2, Bundle bundle) {
        try {
            b(str, str2, bundle);
            return this.f29288c.send(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return Tasks.forException(e10);
        }
    }
}
