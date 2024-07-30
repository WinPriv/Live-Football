package com.applovin.exoplayer2.a;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.l.p;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import d6.o;
import g4.o;
import h4.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements p.a, b.a, o.a, o.a, SuccessContinuation {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12975s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12976t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12977u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f12978v;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i10) {
        this.f12975s = i10;
        this.f12976t = obj;
        this.f12977u = obj2;
        this.f12978v = obj3;
    }

    @Override // g4.o.a
    public final Object apply(Object obj) {
        g4.o oVar = (g4.o) this.f12976t;
        String str = (String) this.f12977u;
        String str2 = (String) this.f12978v;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        w3.b bVar = g4.o.f28502x;
        oVar.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        g4.o.k(sQLiteDatabase.rawQuery(str2, null), new g4.m(oVar, 1));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    @Override // h4.b.a
    public final Object execute() {
        e4.a aVar = (e4.a) this.f12976t;
        z3.s sVar = (z3.s) this.f12977u;
        aVar.f27746d.C(sVar, (z3.n) this.f12978v);
        aVar.f27743a.a(sVar, 1);
        return null;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        int i10 = this.f12975s;
        Object obj2 = this.f12978v;
        Object obj3 = this.f12977u;
        Object obj4 = this.f12976t;
        switch (i10) {
            case 0:
                a.r((b.a) obj4, (com.applovin.exoplayer2.h.j) obj3, (com.applovin.exoplayer2.h.m) obj2, (b) obj);
                return;
            case 1:
                a.l((b.a) obj4, (com.applovin.exoplayer2.v) obj3, (com.applovin.exoplayer2.c.h) obj2, (b) obj);
                return;
            default:
                ((l4.b) obj).getClass();
                return;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        com.google.firebase.messaging.a aVar;
        String c10;
        String str;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f12976t;
        String str2 = (String) this.f12977u;
        a.C0239a c0239a = (a.C0239a) this.f12978v;
        String str3 = (String) obj;
        Context context = firebaseMessaging.f21284d;
        synchronized (FirebaseMessaging.class) {
            if (FirebaseMessaging.f21279n == null) {
                FirebaseMessaging.f21279n = new com.google.firebase.messaging.a(context);
            }
            aVar = FirebaseMessaging.f21279n;
        }
        n7.e eVar = firebaseMessaging.f21281a;
        eVar.a();
        if ("[DEFAULT]".equals(eVar.f33459b)) {
            c10 = "";
        } else {
            c10 = eVar.c();
        }
        i8.r rVar = firebaseMessaging.f21290k;
        synchronized (rVar) {
            if (rVar.f29295b == null) {
                rVar.d();
            }
            str = rVar.f29295b;
        }
        synchronized (aVar) {
            String a10 = a.C0239a.a(str3, str, System.currentTimeMillis());
            if (a10 != null) {
                SharedPreferences.Editor edit = aVar.f21297a.edit();
                edit.putString(c10 + "|T|" + str2 + "|*", a10);
                edit.commit();
            }
        }
        if (c0239a == null || !str3.equals(c0239a.f21299a)) {
            n7.e eVar2 = firebaseMessaging.f21281a;
            eVar2.a();
            if ("[DEFAULT]".equals(eVar2.f33459b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    eVar2.a();
                    sb2.append(eVar2.f33459b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY, str3);
                new i8.k(firebaseMessaging.f21284d).b(intent);
            }
        }
        return Tasks.forResult(str3);
    }
}
