package com.ironsource.a;

import a3.l;
import android.net.Uri;
import android.util.Log;
import com.ironsource.d.b;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f24585a;

    /* renamed from: b, reason: collision with root package name */
    public final com.ironsource.a.a f24586b;

    /* renamed from: c, reason: collision with root package name */
    public final d f24587c;

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f24588d;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f24589s;

        public a(String str) {
            this.f24589s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            try {
                com.ironsource.d.c cVar = new com.ironsource.d.c();
                com.ironsource.a.a aVar = bVar.f24586b;
                com.ironsource.a.a aVar2 = bVar.f24586b;
                ArrayList arrayList = new ArrayList(aVar.f);
                boolean equals = "POST".equals(aVar2.f24577c);
                String str = this.f24589s;
                if (equals) {
                    cVar = com.ironsource.d.b.a(aVar2.f24575a, str, arrayList);
                } else if ("GET".equals(aVar2.f24577c)) {
                    Uri build = Uri.parse(aVar2.f24575a).buildUpon().encodedQuery(str).build();
                    b.a.C0319a c0319a = new b.a.C0319a();
                    c0319a.f24607b = build.toString();
                    c0319a.f24609d = str;
                    c0319a.f24608c = "GET";
                    c0319a.a(arrayList);
                    cVar = com.ironsource.d.b.a(c0319a.a());
                }
                String str2 = "response status code: " + cVar.f24612a;
                if (aVar2.f24579e) {
                    Log.d("EventsTracker", str2);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public b(com.ironsource.a.a aVar, c cVar) {
        if (aVar != null) {
            d dVar = aVar.f24578d;
            if (dVar != null) {
                this.f24586b = aVar;
                this.f24585a = cVar;
                this.f24587c = dVar;
                this.f24588d = Executors.newSingleThreadExecutor();
                return;
            }
            throw new InvalidParameterException("Null formatter not supported ");
        }
        throw new InvalidParameterException("Null configuration not supported ");
    }

    public final void a(String str, Map<String, Object> map) {
        String format = String.format(Locale.ENGLISH, "%s %s", str, map.toString());
        com.ironsource.a.a aVar = this.f24586b;
        if (aVar.f24579e) {
            Log.d("EventsTracker", format);
        }
        if (!aVar.f24576b || str.isEmpty()) {
            return;
        }
        HashMap t10 = l.t("eventname", str);
        try {
            t10.putAll(this.f24585a.a());
        } catch (Exception unused) {
        }
        try {
            t10.putAll(map);
        } catch (Exception unused2) {
        }
        this.f24588d.submit(new a(this.f24587c.a(t10)));
    }
}
