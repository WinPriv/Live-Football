package com.applovin.exoplayer2.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import c4.c;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.l.p;
import com.huawei.openalliance.ad.constant.av;
import d6.o;
import g4.o;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import z3.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements p.a, o.a, o.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12935s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12936t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12937u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f12938v;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i10) {
        this.f12935s = i10;
        this.f12936t = obj;
        this.f12937u = obj2;
        this.f12938v = obj3;
    }

    @Override // g4.o.a
    public final Object apply(Object obj) {
        boolean z10;
        long insert;
        boolean z11;
        byte[] bArr;
        boolean z12;
        w3.b bVar;
        w3.b bVar2;
        int i10 = this.f12935s;
        Object obj2 = this.f12938v;
        Object obj3 = this.f12937u;
        Object obj4 = this.f12936t;
        switch (i10) {
            case 3:
                g4.o oVar = (g4.o) obj4;
                List list = (List) obj3;
                z3.s sVar = (z3.s) obj2;
                Cursor cursor = (Cursor) obj;
                w3.b bVar3 = g4.o.f28502x;
                oVar.getClass();
                while (cursor.moveToNext()) {
                    long j10 = cursor.getLong(0);
                    if (cursor.getInt(7) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    h.a aVar = new h.a();
                    aVar.f = new HashMap();
                    aVar.d(cursor.getString(1));
                    aVar.f36934d = Long.valueOf(cursor.getLong(2));
                    aVar.f36935e = Long.valueOf(cursor.getLong(3));
                    if (z12) {
                        String string = cursor.getString(4);
                        if (string == null) {
                            bVar2 = g4.o.f28502x;
                        } else {
                            bVar2 = new w3.b(string);
                        }
                        aVar.c(new z3.m(bVar2, cursor.getBlob(5)));
                    } else {
                        String string2 = cursor.getString(4);
                        if (string2 == null) {
                            bVar = g4.o.f28502x;
                        } else {
                            bVar = new w3.b(string2);
                        }
                        aVar.c(new z3.m(bVar, (byte[]) g4.o.k(oVar.f().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new com.applovin.exoplayer2.a0(14))));
                    }
                    if (!cursor.isNull(6)) {
                        aVar.f36932b = Integer.valueOf(cursor.getInt(6));
                    }
                    list.add(new g4.b(j10, sVar, aVar.b()));
                }
                return null;
            default:
                g4.o oVar2 = (g4.o) obj4;
                z3.n nVar = (z3.n) obj3;
                z3.s sVar2 = (z3.s) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                w3.b bVar4 = g4.o.f28502x;
                long simpleQueryForLong = oVar2.f().compileStatement("PRAGMA page_size").simpleQueryForLong() * oVar2.f().compileStatement("PRAGMA page_count").simpleQueryForLong();
                g4.e eVar = oVar2.f28506v;
                if (simpleQueryForLong >= eVar.e()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    oVar2.c(1L, c.a.CACHE_FULL, nVar.g());
                    return -1L;
                }
                Long g6 = g4.o.g(sQLiteDatabase, sVar2);
                if (g6 != null) {
                    insert = g6.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", sVar2.b());
                    contentValues.put("priority", Integer.valueOf(j4.a.a(sVar2.d())));
                    contentValues.put("next_request_ms", (Integer) 0);
                    if (sVar2.c() != null) {
                        contentValues.put(av.K, Base64.encodeToString(sVar2.c(), 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int d10 = eVar.d();
                byte[] bArr2 = nVar.d().f36954b;
                if (bArr2.length <= d10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", nVar.g());
                contentValues2.put("timestamp_ms", Long.valueOf(nVar.e()));
                contentValues2.put("uptime_ms", Long.valueOf(nVar.h()));
                contentValues2.put("payload_encoding", nVar.d().f36953a.f36071a);
                contentValues2.put("code", nVar.c());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put(CallMraidJS.f7009k, Boolean.valueOf(z11));
                if (z11) {
                    bArr = bArr2;
                } else {
                    bArr = new byte[0];
                }
                contentValues2.put("payload", bArr);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z11) {
                    int ceil = (int) Math.ceil(bArr2.length / d10);
                    for (int i11 = 1; i11 <= ceil; i11++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i11 - 1) * d10, Math.min(i11 * d10, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i11));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(nVar.b()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
        }
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        int i10 = this.f12935s;
        Object obj2 = this.f12938v;
        Object obj3 = this.f12937u;
        Object obj4 = this.f12936t;
        switch (i10) {
            case 0:
                ((b) obj).a((b.a) obj4, (ad) obj3, (com.applovin.exoplayer2.j.h) obj2);
                return;
            case 1:
                a.b((b.a) obj4, (com.applovin.exoplayer2.v) obj3, (com.applovin.exoplayer2.c.h) obj2, (b) obj);
                return;
            case 2:
                ((b) obj).b((b.a) obj4, (com.applovin.exoplayer2.h.j) obj3, (com.applovin.exoplayer2.h.m) obj2);
                return;
            default:
                ((l4.b) obj).getClass();
                return;
        }
    }
}
