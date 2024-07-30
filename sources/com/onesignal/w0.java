package com.onesignal;

/* compiled from: OSInAppMessageController.java */
/* loaded from: classes2.dex */
public final class w0 extends g {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v0 f27178s;

    public w0(v0 v0Var) {
        this.f27178s = v0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r3.moveToFirst() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        r4 = r3.getString(r3.getColumnIndex("message_id"));
        r5 = r3.getString(r3.getColumnIndex("click_ids"));
        r2.add(r4);
        r4 = new org.json.JSONArray(r5);
        r5 = new java.util.HashSet();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r6 >= r4.length()) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        r5.add(r4.getString(r6));
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        r11.addAll(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        if (r3.moveToNext() != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        if (r3.isClosed() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b3, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b1, code lost:
    
        if (r3.isClosed() == false) goto L39;
     */
    @Override // com.onesignal.g, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.w0.run():void");
    }
}
