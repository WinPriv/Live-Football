package a4;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.transition.r;
import androidx.transition.t;
import com.huawei.openalliance.ad.constant.bj;
import com.huawei.openalliance.ad.ppskit.download.local.AppLocalDownloadTask;
import com.huawei.openalliance.ad.ppskit.download.local.base.LocalDownloadTask;
import com.onesignal.NotificationOpenedReceiver;
import com.onesignal.NotificationOpenedReceiverAndroid22AndOlder;
import com.onesignal.c3;
import com.onesignal.p3;
import com.onesignal.r3;
import java.util.ArrayList;
import java.util.Queue;
import ka.n7;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: CreationContextFactory_Factory.java */
/* loaded from: classes.dex */
public class j implements b4.b {

    /* renamed from: s, reason: collision with root package name */
    public Object f250s;

    /* renamed from: t, reason: collision with root package name */
    public Object f251t;

    /* renamed from: u, reason: collision with root package name */
    public Object f252u;

    public j(Context context, int i10) {
        if (i10 != 6) {
            this.f250s = context.getApplicationContext();
            return;
        }
        zc.d.d(context, bj.f.o);
        this.f252u = context;
        this.f250s = NotificationOpenedReceiver.class;
        this.f251t = NotificationOpenedReceiverAndroid22AndOlder.class;
    }

    public static void f(ArrayList arrayList, JSONArray jSONArray, int i10) {
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    String string = jSONArray.getString(i11);
                    zc.d.c(string, "influenceId");
                    arrayList.add(new ec.a(string, i10));
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public static void k(bc.b bVar, ec.e eVar, ec.e eVar2, String str, ec.d dVar) {
        int ordinal = bVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                eVar2.f27896b = new JSONArray(str);
                if (dVar != null) {
                    dVar.f27894b = eVar2;
                    return;
                }
                return;
            }
            return;
        }
        eVar.f27896b = new JSONArray(str);
        if (dVar != null) {
            dVar.f27893a = eVar;
        }
    }

    public static ec.d n(bc.b bVar, ec.e eVar, ec.e eVar2, String str) {
        ec.d dVar;
        int ordinal = bVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return null;
            }
            eVar2.f27895a = new JSONArray(str);
            dVar = new ec.d(null, eVar2);
        } else {
            eVar.f27895a = new JSONArray(str);
            dVar = new ec.d(eVar, null);
        }
        return dVar;
    }

    public final int a(hd.d dVar) {
        int i10 = 0;
        for (j jVar = this; jVar != null; jVar = (j) jVar.f252u) {
            dVar.x0((String) jVar.f250s);
            i10 += ((byte[]) jVar.f251t).length + 6;
        }
        return i10;
    }

    public final String b() {
        return (String) this.f250s;
    }

    public final void c(LocalDownloadTask localDownloadTask) {
        boolean z10;
        t tVar = (t) this.f252u;
        if (localDownloadTask == null) {
            tVar.getClass();
        } else {
            Queue queue = (Queue) tVar.f2495s;
            if (!queue.contains(localDownloadTask)) {
                z10 = queue.offer(localDownloadTask);
            } else {
                z10 = false;
            }
            n7.c("LocalDownloadQueue", " tasi is offe=%s", Boolean.valueOf(z10));
        }
        if (n7.d()) {
            n7.c("LocalDownloadManager", "addTask, task:%s, priority:%s", localDownloadTask.g(), Integer.valueOf(localDownloadTask.k()));
        }
    }

    public final void d(hd.d dVar, hd.b bVar) {
        for (j jVar = this; jVar != null; jVar = (j) jVar.f252u) {
            byte[] bArr = (byte[]) jVar.f251t;
            int length = bArr.length;
            bVar.i(dVar.x0((String) jVar.f250s));
            bVar.g(length);
            bVar.f(bArr, 0, length);
        }
    }

    public final int e() {
        int i10 = 0;
        for (j jVar = this; jVar != null; jVar = (j) jVar.f252u) {
            i10++;
        }
        return i10;
    }

    public final r g() {
        return (r) this.f251t;
    }

    @Override // tc.a
    public final Object get() {
        return new i((Context) ((tc.a) this.f250s).get(), (i4.a) ((tc.a) this.f251t).get(), (i4.a) ((tc.a) this.f252u).get());
    }

    public final LocalDownloadTask h(String str) {
        t tVar = (t) this.f252u;
        tVar.getClass();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        boolean d10 = n7.d();
        Object obj = tVar.f2495s;
        if (d10) {
            n7.c("LocalDownloadQueue", "findTask, workingQueue.size:%s", Integer.valueOf(((Queue) obj).size()));
        }
        Queue<LocalDownloadTask> queue = (Queue) obj;
        if (n7.d()) {
            n7.c("LocalDownloadQueue", "findTaskFromQueue, taskId:%s", str);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (LocalDownloadTask localDownloadTask : queue) {
            if (str.equals(localDownloadTask.g())) {
                return localDownloadTask;
            }
        }
        return null;
    }

    public final void i(LocalDownloadTask localDownloadTask) {
        boolean z10;
        if (localDownloadTask == null) {
            return;
        }
        Queue queue = (Queue) ((t) this.f252u).f2495s;
        if (queue.contains(localDownloadTask)) {
            queue.remove(localDownloadTask);
            z10 = true;
        } else {
            z10 = false;
        }
        n7.f("LocalDownloadManager", "deleteTask, succ:%s, taskId:%s", Boolean.valueOf(z10), localDownloadTask.g());
    }

    public final boolean j(AppLocalDownloadTask appLocalDownloadTask) {
        boolean z10;
        if (appLocalDownloadTask == null) {
            return false;
        }
        Queue queue = (Queue) ((t) this.f252u).f2495s;
        if (queue.contains(appLocalDownloadTask)) {
            queue.remove(appLocalDownloadTask);
            z10 = true;
        } else {
            z10 = false;
        }
        n7.e("LocalDownloadManager", "removeTask, succ:" + z10);
        if (z10) {
            if (n7.d()) {
                n7.c("LocalDownloadManager", "onDownloadDeleted, taskId:%s", appLocalDownloadTask.g());
            }
            ta.a aVar = (ta.a) this.f251t;
            if (aVar != null) {
                ((sa.a) aVar).onDownloadDeleted((LocalDownloadTask) appLocalDownloadTask);
            }
        }
        return true;
    }

    public final PendingIntent l(int i10, Intent intent) {
        zc.d.d(intent, "oneSignalIntent");
        return PendingIntent.getActivity((Context) this.f252u, i10, intent, 201326592);
    }

    public final Intent m(int i10) {
        Intent addFlags = new Intent((Context) this.f252u, (Class<?>) this.f250s).putExtra("androidNotificationId", i10).addFlags(603979776);
        zc.d.c(addFlags, "intent\n            .putE…Y_CLEAR_TOP\n            )");
        return addFlags;
    }

    public final boolean o() {
        Object obj = this.f252u;
        c3 c3Var = (c3) obj;
        ((c3) obj).getClass();
        String str = r3.f27010a;
        ((c3) this.f252u).getClass();
        c3Var.getClass();
        return r3.b(str, "PREFS_OS_OUTCOMES_V2", false);
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3) {
        this.f250s = obj;
        this.f251t = obj2;
        this.f252u = obj3;
    }

    public /* synthetic */ j(String str) {
        this.f250s = str;
    }

    public /* synthetic */ j(c3 c3Var, p3 p3Var, c3 c3Var2) {
        zc.d.d(c3Var, "logger");
        zc.d.d(p3Var, "dbHelper");
        zc.d.d(c3Var2, "preferences");
        this.f250s = c3Var;
        this.f251t = p3Var;
        this.f252u = c3Var2;
    }
}
