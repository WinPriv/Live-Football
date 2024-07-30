package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.sdk.g.d;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class p implements m {

    /* renamed from: s, reason: collision with root package name */
    public final com.ironsource.environment.e.a f26205s;

    /* renamed from: t, reason: collision with root package name */
    public final String f26206t;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.a.c f26207s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.g.c f26208t;

        public a(com.ironsource.sdk.j.a.c cVar, com.ironsource.sdk.g.c cVar2) {
            this.f26207s = cVar;
            this.f26208t = cVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26207s.b(this.f26208t.f26485b, p.this.f26206t);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.a.c f26210s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ JSONObject f26211t;

        public b(com.ironsource.sdk.j.a.c cVar, JSONObject jSONObject) {
            this.f26210s = cVar;
            this.f26211t = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26210s.c(this.f26211t.optString("demandSourceName"), p.this.f26206t);
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.e f26213s;

        public c(com.ironsource.sdk.j.e eVar) {
            this.f26213s = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26213s.onOfferwallInitFail(p.this.f26206t);
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.a.c f26215s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.g.c f26216t;

        public d(com.ironsource.sdk.j.a.c cVar, com.ironsource.sdk.g.c cVar2) {
            this.f26215s = cVar;
            this.f26216t = cVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26215s.c(this.f26216t.f26485b, p.this.f26206t);
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.a.b f26218s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Map f26219t;

        public e(com.ironsource.sdk.j.a.b bVar, Map map) {
            this.f26218s = bVar;
            this.f26219t = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26218s.d((String) this.f26219t.get("demandSourceName"), p.this.f26206t);
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.e f26221s;

        public f(com.ironsource.sdk.j.e eVar) {
            this.f26221s = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            p pVar = p.this;
            String str = pVar.f26206t;
            com.ironsource.sdk.j.e eVar = this.f26221s;
            eVar.onOWShowFail(str);
            eVar.onOfferwallInitFail(pVar.f26206t);
        }
    }

    /* loaded from: classes2.dex */
    public class g implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.e f26223s;

        public g(com.ironsource.sdk.j.e eVar) {
            this.f26223s = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26223s.onGetOWCreditsFailed(p.this.f26206t);
        }
    }

    /* loaded from: classes2.dex */
    public class h implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.a.d f26225s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.g.c f26226t;

        public h(com.ironsource.sdk.j.a.d dVar, com.ironsource.sdk.g.c cVar) {
            this.f26225s = dVar;
            this.f26226t = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26225s.a(d.e.RewardedVideo, this.f26226t.f26485b, p.this.f26206t);
        }
    }

    /* loaded from: classes2.dex */
    public class i implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.a.d f26228s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ JSONObject f26229t;

        public i(com.ironsource.sdk.j.a.d dVar, JSONObject jSONObject) {
            this.f26228s = dVar;
            this.f26229t = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26228s.a(this.f26229t.optString("demandSourceName"), p.this.f26206t);
        }
    }

    /* loaded from: classes2.dex */
    public class j implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.a.c f26231s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.g.c f26232t;

        public j(com.ironsource.sdk.j.a.c cVar, com.ironsource.sdk.g.c cVar2) {
            this.f26231s = cVar;
            this.f26232t = cVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26231s.a(d.e.Interstitial, this.f26232t.f26485b, p.this.f26206t);
        }
    }

    /* loaded from: classes2.dex */
    public class k implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.j.a.c f26234s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f26235t;

        public k(com.ironsource.sdk.j.a.c cVar, String str) {
            this.f26234s = cVar;
            this.f26235t = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26234s.b(this.f26235t, p.this.f26206t);
        }
    }

    public p(String str, com.ironsource.environment.e.a aVar) {
        this.f26206t = "";
        this.f26205s = aVar;
        this.f26206t = str;
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(Context context) {
    }

    public final void b(Runnable runnable) {
        com.ironsource.environment.e.a aVar = this.f26205s;
        if (aVar != null) {
            aVar.c(runnable);
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final d.c c() {
        return d.c.Native;
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar) {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(Context context) {
    }

    @Override // com.ironsource.sdk.controller.m
    public final boolean c(String str) {
        return false;
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.b bVar) {
        if (bVar != null) {
            b(new e(bVar, map));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        if (cVar2 != null) {
            b(new d(cVar2, cVar));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        if (cVar2 != null) {
            b(new a(cVar2, cVar));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, com.ironsource.sdk.j.a.c cVar) {
        if (cVar != null) {
            b(new k(cVar, str));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.b bVar) {
        if (bVar != null) {
            bVar.a(d.e.Banner, cVar.f26485b, this.f26206t);
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.c cVar2) {
        if (cVar2 != null) {
            b(new j(cVar2, cVar));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.d dVar) {
        if (dVar != null) {
            b(new h(dVar, cVar));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.j.e eVar) {
        if (eVar != null) {
            b(new g(eVar));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        if (eVar != null) {
            b(new c(eVar));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        if (eVar != null) {
            b(new f(eVar));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject, com.ironsource.sdk.j.a.c cVar) {
        if (cVar != null) {
            b(new b(cVar, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject, com.ironsource.sdk.j.a.d dVar) {
        if (dVar != null) {
            b(new i(dVar, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void d() {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void destroy() {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void e() {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void f() {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void g() {
    }
}
