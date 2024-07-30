package dc;

import a3.l;
import a4.j;
import android.content.ContentValues;
import com.onesignal.c3;
import com.onesignal.o3;
import com.onesignal.p3;
import com.onesignal.r3;
import com.onesignal.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;

/* compiled from: OSOutcomeEventsRepository.kt */
/* loaded from: classes2.dex */
public abstract class b implements ec.c {

    /* renamed from: a, reason: collision with root package name */
    public final s1 f27605a;

    /* renamed from: b, reason: collision with root package name */
    public final j f27606b;

    /* renamed from: c, reason: collision with root package name */
    public final g f27607c;

    public b(s1 s1Var, j jVar, a aVar) {
        zc.d.d(s1Var, "logger");
        zc.d.d(jVar, "outcomeEventsCache");
        this.f27605a = s1Var;
        this.f27606b = jVar;
        this.f27607c = aVar;
    }

    @Override // ec.c
    public final void a(ec.b bVar) {
        ec.e eVar;
        zc.d.d(bVar, "eventParams");
        j jVar = this.f27606b;
        synchronized (jVar) {
            ((c3) ((s1) jVar.f250s)).c("OneSignal saveUniqueOutcomeEventParams: " + bVar);
            String str = bVar.f27889a;
            ArrayList arrayList = new ArrayList();
            ec.d dVar = bVar.f27890b;
            ec.e eVar2 = null;
            if (dVar != null) {
                eVar = dVar.f27893a;
            } else {
                eVar = null;
            }
            if (dVar != null) {
                eVar2 = dVar.f27894b;
            }
            if (eVar != null) {
                JSONArray jSONArray = eVar.f27896b;
                JSONArray jSONArray2 = eVar.f27895a;
                j.f(arrayList, jSONArray, 1);
                j.f(arrayList, jSONArray2, 2);
            }
            if (eVar2 != null) {
                JSONArray jSONArray3 = eVar2.f27896b;
                JSONArray jSONArray4 = eVar2.f27895a;
                j.f(arrayList, jSONArray3, 1);
                j.f(arrayList, jSONArray4, 2);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ec.a aVar = (ec.a) it.next();
                ContentValues contentValues = new ContentValues();
                contentValues.put("channel_influence_id", aVar.f27887a);
                contentValues.put("channel_type", l.e(aVar.f27888b));
                contentValues.put("name", str);
                ((p3) ((o3) jVar.f251t)).f("cached_unique_outcome", contentValues);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r3.moveToFirst() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r4 = bc.b.a.a(r3.getString(r3.getColumnIndex("notification_influence_type")));
        r5 = bc.b.a.a(r3.getString(r3.getColumnIndex("iam_influence_type")));
        r6 = r3.getString(r3.getColumnIndex("notification_ids"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (r6 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        r7 = r3.getString(r3.getColumnIndex("iam_ids"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r7 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r10 = r3.getString(r3.getColumnIndex("name"));
        r12 = r3.getFloat(r3.getColumnIndex("weight"));
        r13 = r3.getLong(r3.getColumnIndex("timestamp"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        r8 = new ec.e(0);
        r11 = new ec.e(0);
        r4 = a4.j.n(r4, r8, r11, r6);
        a4.j.k(r5, r8, r11, r7, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r4 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
    
        zc.d.c(r10, "name");
        r1.add(new ec.b(r10, r11, r12, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        r4 = new ec.d(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        ((com.onesignal.c3) ((com.onesignal.s1) r0.f250s)).getClass();
        com.onesignal.e3.b(3, "Generating JSONArray from notifications ids outcome:JSON Failed.", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
    
        r7 = com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord.XRINFOLIST_NULL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0049, code lost:
    
        r6 = com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord.XRINFOLIST_NULL;
     */
    @Override // ec.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b() {
        /*
            r15 = this;
            a4.j r0 = r15.f27606b
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld4
            r1.<init>()     // Catch: java.lang.Throwable -> Ld4
            r2 = 0
            java.lang.Object r3 = r0.f251t     // Catch: java.lang.Throwable -> Lc7
            com.onesignal.o3 r3 = (com.onesignal.o3) r3     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r5 = "outcome"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r3
            com.onesignal.p3 r4 = (com.onesignal.p3) r4     // Catch: java.lang.Throwable -> Lc7
            android.database.Cursor r3 = r4.i(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lc7
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> Lc4
            if (r4 == 0) goto Lb9
        L20:
            java.lang.String r4 = "notification_influence_type"
            int r4 = r3.getColumnIndex(r4)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> Lc4
            bc.b r4 = bc.b.a.a(r4)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r5 = "iam_influence_type"
            int r5 = r3.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> Lc4
            bc.b r5 = bc.b.a.a(r5)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r6 = "notification_ids"
            int r6 = r3.getColumnIndex(r6)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r6 = r3.getString(r6)     // Catch: java.lang.Throwable -> Lc4
            if (r6 == 0) goto L49
            goto L4b
        L49:
            java.lang.String r6 = "[]"
        L4b:
            java.lang.String r7 = "iam_ids"
            int r7 = r3.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r7 = r3.getString(r7)     // Catch: java.lang.Throwable -> Lc4
            if (r7 == 0) goto L58
            goto L5a
        L58:
            java.lang.String r7 = "[]"
        L5a:
            java.lang.String r8 = "name"
            int r8 = r3.getColumnIndex(r8)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r10 = r3.getString(r8)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r8 = "weight"
            int r8 = r3.getColumnIndex(r8)     // Catch: java.lang.Throwable -> Lc4
            float r12 = r3.getFloat(r8)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r8 = "timestamp"
            int r8 = r3.getColumnIndex(r8)     // Catch: java.lang.Throwable -> Lc4
            long r13 = r3.getLong(r8)     // Catch: java.lang.Throwable -> Lc4
            ec.e r8 = new ec.e     // Catch: org.json.JSONException -> La3 java.lang.Throwable -> Lc4
            r9 = 0
            r8.<init>(r9)     // Catch: org.json.JSONException -> La3 java.lang.Throwable -> Lc4
            ec.e r11 = new ec.e     // Catch: org.json.JSONException -> La3 java.lang.Throwable -> Lc4
            r11.<init>(r9)     // Catch: org.json.JSONException -> La3 java.lang.Throwable -> Lc4
            ec.d r4 = a4.j.n(r4, r8, r11, r6)     // Catch: org.json.JSONException -> La3 java.lang.Throwable -> Lc4
            a4.j.k(r5, r8, r11, r7, r4)     // Catch: org.json.JSONException -> La3 java.lang.Throwable -> Lc4
            if (r4 == 0) goto L8e
        L8c:
            r11 = r4
            goto L94
        L8e:
            ec.d r4 = new ec.d     // Catch: org.json.JSONException -> La3 java.lang.Throwable -> Lc4
            r4.<init>(r2, r2)     // Catch: org.json.JSONException -> La3 java.lang.Throwable -> Lc4
            goto L8c
        L94:
            ec.b r4 = new ec.b     // Catch: org.json.JSONException -> La3 java.lang.Throwable -> Lc4
            java.lang.String r5 = "name"
            zc.d.c(r10, r5)     // Catch: org.json.JSONException -> La3 java.lang.Throwable -> Lc4
            r9 = r4
            r9.<init>(r10, r11, r12, r13)     // Catch: org.json.JSONException -> La3 java.lang.Throwable -> Lc4
            r1.add(r4)     // Catch: org.json.JSONException -> La3 java.lang.Throwable -> Lc4
            goto Lb3
        La3:
            r4 = move-exception
            java.lang.Object r5 = r0.f250s     // Catch: java.lang.Throwable -> Lc4
            com.onesignal.s1 r5 = (com.onesignal.s1) r5     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r6 = "Generating JSONArray from notifications ids outcome:JSON Failed."
            com.onesignal.c3 r5 = (com.onesignal.c3) r5     // Catch: java.lang.Throwable -> Lc4
            r5.getClass()     // Catch: java.lang.Throwable -> Lc4
            r5 = 3
            com.onesignal.e3.b(r5, r6, r4)     // Catch: java.lang.Throwable -> Lc4
        Lb3:
            boolean r4 = r3.moveToNext()     // Catch: java.lang.Throwable -> Lc4
            if (r4 != 0) goto L20
        Lb9:
            boolean r2 = r3.isClosed()     // Catch: java.lang.Throwable -> Ld4
            if (r2 != 0) goto Lc2
            r3.close()     // Catch: java.lang.Throwable -> Ld4
        Lc2:
            monitor-exit(r0)
            return r1
        Lc4:
            r1 = move-exception
            r2 = r3
            goto Lc8
        Lc7:
            r1 = move-exception
        Lc8:
            if (r2 == 0) goto Ld3
            boolean r3 = r2.isClosed()     // Catch: java.lang.Throwable -> Ld4
            if (r3 != 0) goto Ld3
            r2.close()     // Catch: java.lang.Throwable -> Ld4
        Ld3:
            throw r1     // Catch: java.lang.Throwable -> Ld4
        Ld4:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dc.b.b():java.util.ArrayList");
    }

    @Override // ec.c
    public final void d(Set<String> set) {
        zc.d.d(set, "unattributedUniqueOutcomeEvents");
        ((c3) this.f27605a).c("OneSignal save unattributedUniqueOutcomeEvents: " + set);
        c3 c3Var = (c3) this.f27606b.f252u;
        c3Var.getClass();
        String str = r3.f27010a;
        c3Var.getClass();
        r3.h(set, str, "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT");
    }

    @Override // ec.c
    public final void e() {
        j jVar = this.f27606b;
        synchronized (jVar) {
            StringBuilder sb2 = new StringBuilder("NOT EXISTS(SELECT NULL FROM notification n WHERE n.notification_id = channel_influence_id AND channel_type = \"");
            Locale locale = Locale.ROOT;
            zc.d.c(locale, "Locale.ROOT");
            String lowerCase = "notification".toLowerCase(locale);
            zc.d.c(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            sb2.append(lowerCase);
            sb2.append("\")");
            ((p3) ((o3) jVar.f251t)).b("cached_unique_outcome", sb2.toString(), null);
        }
    }

    @Override // ec.c
    public final Set<String> f() {
        ((c3) this.f27606b.f252u).getClass();
        Set<String> g6 = r3.g("PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", null);
        ((c3) this.f27605a).c("OneSignal getUnattributedUniqueOutcomeEventsSentByChannel: " + g6);
        return g6;
    }

    @Override // ec.c
    public final void g(ec.b bVar) {
        bc.b bVar2;
        ec.e eVar;
        ec.e eVar2;
        bc.b bVar3;
        zc.d.d(bVar, "event");
        j jVar = this.f27606b;
        synchronized (jVar) {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            bc.b bVar4 = bc.b.UNATTRIBUTED;
            ec.d dVar = bVar.f27890b;
            if (dVar != null && (eVar2 = dVar.f27893a) != null) {
                JSONArray jSONArray3 = eVar2.f27895a;
                if (jSONArray3 != null && jSONArray3.length() > 0) {
                    bVar3 = bc.b.DIRECT;
                } else {
                    jSONArray3 = jSONArray;
                    bVar3 = bVar4;
                }
                JSONArray jSONArray4 = eVar2.f27896b;
                if (jSONArray4 != null && jSONArray4.length() > 0) {
                    bVar4 = bc.b.DIRECT;
                    jSONArray2 = jSONArray4;
                }
                bVar2 = bVar4;
                bVar4 = bVar3;
                jSONArray = jSONArray3;
            } else {
                bVar2 = bVar4;
            }
            ec.d dVar2 = bVar.f27890b;
            if (dVar2 != null && (eVar = dVar2.f27894b) != null) {
                JSONArray jSONArray5 = eVar.f27895a;
                if (jSONArray5 != null && jSONArray5.length() > 0) {
                    bVar4 = bc.b.INDIRECT;
                    jSONArray = jSONArray5;
                }
                JSONArray jSONArray6 = eVar.f27896b;
                if (jSONArray6 != null && jSONArray6.length() > 0) {
                    bVar2 = bc.b.INDIRECT;
                    jSONArray2 = jSONArray6;
                }
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("notification_ids", jSONArray.toString());
            contentValues.put("iam_ids", jSONArray2.toString());
            String obj = bVar4.toString();
            if (obj != null) {
                String lowerCase = obj.toLowerCase();
                zc.d.c(lowerCase, "(this as java.lang.String).toLowerCase()");
                contentValues.put("notification_influence_type", lowerCase);
                String obj2 = bVar2.toString();
                if (obj2 != null) {
                    String lowerCase2 = obj2.toLowerCase();
                    zc.d.c(lowerCase2, "(this as java.lang.String).toLowerCase()");
                    contentValues.put("iam_influence_type", lowerCase2);
                    contentValues.put("name", bVar.f27889a);
                    contentValues.put("weight", Float.valueOf(bVar.f27891c));
                    contentValues.put("timestamp", Long.valueOf(bVar.f27892d));
                    ((p3) ((o3) jVar.f251t)).f("outcome", contentValues);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
    }

    @Override // ec.c
    public final void h(ec.b bVar) {
        zc.d.d(bVar, "outcomeEvent");
        j jVar = this.f27606b;
        synchronized (jVar) {
            ((p3) ((o3) jVar.f251t)).b("outcome", "timestamp = ?", new String[]{String.valueOf(bVar.f27892d)});
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        if (r4.isClosed() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a2, code lost:
    
        if (r4.isClosed() == false) goto L32;
     */
    @Override // ec.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList i(java.lang.String r22, java.util.ArrayList r23) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            java.lang.String r2 = "name"
            zc.d.d(r0, r2)
            a4.j r2 = r1.f27606b
            monitor-enter(r2)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lca
            r3.<init>()     // Catch: java.lang.Throwable -> Lca
            r4 = 0
            java.util.Iterator r5 = r23.iterator()     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
        L16:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            if (r6 == 0) goto L8d
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            bc.a r6 = (bc.a) r6     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            r7.<init>()     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            org.json.JSONArray r8 = r6.f3187c     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            if (r8 == 0) goto L16
            int r9 = r8.length()     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            r10 = 0
            r11 = r10
        L31:
            if (r11 >= r9) goto L76
            java.lang.String r12 = r8.getString(r11)     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            int r13 = r6.f3186b     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            java.lang.String[] r15 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            java.lang.String r17 = "channel_influence_id = ? AND channel_type = ? AND name = ?"
            r14 = 3
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            r14[r10] = r12     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            java.lang.String r13 = a3.l.e(r13)     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            r16 = 1
            r14[r16] = r13     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            r13 = 2
            r14[r13] = r0     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            java.lang.Object r13 = r2.f251t     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            com.onesignal.o3 r13 = (com.onesignal.o3) r13     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            java.lang.String r16 = "cached_unique_outcome"
            r19 = 0
            java.lang.String r20 = "1"
            com.onesignal.p3 r13 = (com.onesignal.p3) r13     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            r18 = r14
            r14 = r13
            r13 = r15
            r15 = r16
            r16 = r13
            android.database.Cursor r4 = r14.j(r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            java.lang.String r13 = "cursor"
            zc.d.c(r4, r13)     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            int r13 = r4.getCount()     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            if (r13 != 0) goto L73
            r7.put(r12)     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
        L73:
            int r11 = r11 + 1
            goto L31
        L76:
            int r8 = r7.length()     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            if (r8 <= 0) goto L16
            bc.a r8 = new bc.a     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            bc.b r9 = r6.f3185a     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            org.json.JSONArray r10 = r6.f3187c     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            int r6 = r6.f3186b     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            r8.<init>(r6, r9, r10)     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            r8.f3187c = r7     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            r3.add(r8)     // Catch: java.lang.Throwable -> L96 org.json.JSONException -> L98
            goto L16
        L8d:
            if (r4 == 0) goto La7
            boolean r0 = r4.isClosed()     // Catch: java.lang.Throwable -> Lca
            if (r0 != 0) goto La7
            goto La4
        L96:
            r0 = move-exception
            goto Lbe
        L98:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L96
            if (r4 == 0) goto La7
            boolean r0 = r4.isClosed()     // Catch: java.lang.Throwable -> Lca
            if (r0 != 0) goto La7
        La4:
            r4.close()     // Catch: java.lang.Throwable -> Lca
        La7:
            monitor-exit(r2)
            com.onesignal.s1 r0 = r1.f27605a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "OneSignal getNotCachedUniqueOutcome influences: "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.onesignal.c3 r0 = (com.onesignal.c3) r0
            r0.c(r2)
            return r3
        Lbe:
            if (r4 == 0) goto Lc9
            boolean r3 = r4.isClosed()     // Catch: java.lang.Throwable -> Lca
            if (r3 != 0) goto Lc9
            r4.close()     // Catch: java.lang.Throwable -> Lca
        Lc9:
            throw r0     // Catch: java.lang.Throwable -> Lca
        Lca:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dc.b.i(java.lang.String, java.util.ArrayList):java.util.ArrayList");
    }
}
