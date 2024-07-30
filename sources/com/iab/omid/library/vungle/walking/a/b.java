package com.iab.omid.library.vungle.walking.a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    private a f24563a;

    /* renamed from: d, reason: collision with root package name */
    protected final InterfaceC0316b f24564d;

    /* loaded from: classes2.dex */
    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.vungle.walking.a.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0316b {
        void a(JSONObject jSONObject);

        JSONObject b();
    }

    public b(InterfaceC0316b interfaceC0316b) {
        this.f24564d = interfaceC0316b;
    }

    public void a(a aVar) {
        this.f24563a = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f24563a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
