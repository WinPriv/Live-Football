package com.onesignal;

/* compiled from: OSInAppMessageRepository.java */
/* loaded from: classes2.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final p3 f26984a;

    /* renamed from: b, reason: collision with root package name */
    public final s1 f26985b;

    /* renamed from: c, reason: collision with root package name */
    public final c3 f26986c;

    /* renamed from: d, reason: collision with root package name */
    public int f26987d = 0;

    /* compiled from: OSInAppMessageRepository.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(String str);

        void onFailure(String str);
    }

    public q1(p3 p3Var, c3 c3Var, c3 c3Var2) {
        this.f26984a = p3Var;
        this.f26985b = c3Var;
        this.f26986c = c3Var2;
    }

    public static void a(q1 q1Var, String str, String str2) {
        q1Var.getClass();
        ((c3) q1Var.f26985b).c("Successful post for in-app message " + str + " request: " + str2);
    }

    public static void b(q1 q1Var, String str, int i10, String str2) {
        q1Var.getClass();
        StringBuilder sb2 = new StringBuilder("Encountered a ");
        sb2.append(i10);
        sb2.append(" error while attempting in-app message ");
        sb2.append(str);
        ((c3) q1Var.f26985b).d(a3.l.p(sb2, " request: ", str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        r7 = new org.json.JSONArray(r3);
        r3 = new java.util.HashSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        if (r8 >= r7.length()) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        r3.add(r7.getString(r8));
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        r0.add(new com.onesignal.b1(r2, r3, r9, new com.onesignal.h1(r4, r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        if (r1.moveToNext() != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        if (r1.isClosed() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
    
        if (r1.isClosed() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r1.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        r2 = r1.getString(r1.getColumnIndex("message_id"));
        r3 = r1.getString(r1.getColumnIndex("click_ids"));
        r4 = r1.getInt(r1.getColumnIndex("display_quantity"));
        r5 = r1.getLong(r1.getColumnIndex("last_display"));
        r8 = 0;
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
    
        if (r1.getInt(r1.getColumnIndex("displayed_in_session")) != 1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.ArrayList c() {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La8
            r0.<init>()     // Catch: java.lang.Throwable -> La8
            r1 = 0
            com.onesignal.p3 r2 = r11.f26984a     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            java.lang.String r3 = "in_app_message"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r2.i(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            if (r2 == 0) goto L82
        L19:
            java.lang.String r2 = "message_id"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            java.lang.String r3 = "click_ids"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            java.lang.String r4 = "display_quantity"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            int r4 = r1.getInt(r4)     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            java.lang.String r5 = "last_display"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            long r5 = r1.getLong(r5)     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            java.lang.String r7 = "displayed_in_session"
            int r7 = r1.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            int r7 = r1.getInt(r7)     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            r8 = 0
            r9 = 1
            if (r7 != r9) goto L50
            goto L51
        L50:
            r9 = r8
        L51:
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            r3.<init>()     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
        L5b:
            int r10 = r7.length()     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            if (r8 >= r10) goto L6f
            java.lang.String r10 = r7.getString(r8)     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            r3.add(r10)     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            int r8 = r8 + 1
            goto L5b
        L6b:
            r0 = move-exception
            goto L9c
        L6d:
            r2 = move-exception
            goto L89
        L6f:
            com.onesignal.b1 r7 = new com.onesignal.b1     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            com.onesignal.h1 r8 = new com.onesignal.h1     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            r8.<init>(r4, r5)     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            r7.<init>(r2, r3, r9, r8)     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            r0.add(r7)     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L6b org.json.JSONException -> L6d
            if (r2 != 0) goto L19
        L82:
            boolean r2 = r1.isClosed()     // Catch: java.lang.Throwable -> La8
            if (r2 != 0) goto L9a
            goto L97
        L89:
            java.lang.String r3 = "Generating JSONArray from iam click ids:JSON Failed."
            r4 = 3
            com.onesignal.e3.b(r4, r3, r2)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L9a
            boolean r2 = r1.isClosed()     // Catch: java.lang.Throwable -> La8
            if (r2 != 0) goto L9a
        L97:
            r1.close()     // Catch: java.lang.Throwable -> La8
        L9a:
            monitor-exit(r11)
            return r0
        L9c:
            if (r1 == 0) goto La7
            boolean r2 = r1.isClosed()     // Catch: java.lang.Throwable -> La8
            if (r2 != 0) goto La7
            r1.close()     // Catch: java.lang.Throwable -> La8
        La7:
            throw r0     // Catch: java.lang.Throwable -> La8
        La8:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.q1.c():java.util.ArrayList");
    }
}
