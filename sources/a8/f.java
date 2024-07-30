package a8;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DefaultHeartBeatController.java */
/* loaded from: classes2.dex */
public final class f implements h, i {

    /* renamed from: a, reason: collision with root package name */
    public final c8.a<l> f364a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f365b;

    /* renamed from: c, reason: collision with root package name */
    public final c8.a<k8.g> f366c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<g> f367d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f368e;

    public f() {
        throw null;
    }

    public f(final Context context, final String str, Set<g> set, c8.a<k8.g> aVar, Executor executor) {
        this.f364a = new c8.a() { // from class: a8.e
            @Override // c8.a
            public final Object get() {
                return new l(context, str);
            }
        };
        this.f367d = set;
        this.f368e = executor;
        this.f366c = aVar;
        this.f365b = context;
    }

    @Override // a8.h
    public final Task<String> a() {
        if (!j0.j.a(this.f365b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f368e, new Callable() { // from class: a8.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String byteArrayOutputStream;
                f fVar = f.this;
                synchronized (fVar) {
                    l lVar = fVar.f364a.get();
                    ArrayList c10 = lVar.c();
                    lVar.b();
                    JSONArray jSONArray = new JSONArray();
                    for (int i10 = 0; i10 < c10.size(); i10++) {
                        m mVar = (m) c10.get(i10);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("agent", mVar.b());
                        jSONObject.put("dates", new JSONArray((Collection) mVar.a()));
                        jSONArray.put(jSONObject);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("heartbeats", jSONArray);
                    jSONObject2.put("version", "2");
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        try {
                            gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                            gZIPOutputStream.close();
                            base64OutputStream.close();
                            byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                        } finally {
                        }
                    } finally {
                    }
                }
                return byteArrayOutputStream;
            }
        });
    }

    @Override // a8.i
    public final synchronized int b() {
        boolean g6;
        long currentTimeMillis = System.currentTimeMillis();
        l lVar = this.f364a.get();
        synchronized (lVar) {
            g6 = lVar.g(currentTimeMillis);
        }
        if (g6) {
            synchronized (lVar) {
                String d10 = lVar.d(System.currentTimeMillis());
                lVar.f369a.edit().putString("last-used-date", d10).commit();
                lVar.f(d10);
            }
            return 3;
        }
        return 1;
    }

    public final void c() {
        if (this.f367d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!j0.j.a(this.f365b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f368e, new Callable() { // from class: a8.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    f fVar = f.this;
                    synchronized (fVar) {
                        fVar.f364a.get().h(System.currentTimeMillis(), fVar.f366c.get().getUserAgent());
                    }
                    return null;
                }
            });
        }
    }
}
