package bc;

import a3.l;
import e0.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s.f;
import zc.d;

/* compiled from: OSInfluence.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public b f3185a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3186b;

    /* renamed from: c, reason: collision with root package name */
    public JSONArray f3187c;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r7 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        if (r5 != null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(java.lang.String r10) throws org.json.JSONException {
        /*
            r9 = this;
            java.lang.String r0 = "jsonString"
            zc.d.d(r10, r0)
            r9.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r10)
            java.lang.String r10 = "influence_channel"
            java.lang.String r10 = r0.getString(r10)
            java.lang.String r1 = "influence_type"
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r2 = "influence_ids"
            java.lang.String r0 = r0.getString(r2)
            r2 = 2
            r3 = 0
            r4 = 0
            if (r10 == 0) goto L42
            int[] r5 = s.f.d(r2)
            int r6 = r5.length
        L29:
            int r6 = r6 + (-1)
            if (r6 < 0) goto L3e
            r7 = r5[r6]
            if (r7 == 0) goto L3d
            java.lang.String r8 = a3.l.e(r7)
            boolean r8 = zc.d.a(r8, r10)
            if (r8 == 0) goto L3c
            goto L3f
        L3c:
            goto L29
        L3d:
            throw r4
        L3e:
            r7 = r3
        L3f:
            if (r7 == 0) goto L42
            r2 = r7
        L42:
            r9.f3186b = r2
            if (r1 == 0) goto L64
            bc.b[] r10 = bc.b.values()
            int r2 = r10.length
        L4b:
            int r2 = r2 + (-1)
            if (r2 < 0) goto L60
            r5 = r10[r2]
            java.lang.String r6 = r5.name()
            if (r6 != 0) goto L59
            r6 = r3
            goto L5d
        L59:
            boolean r6 = r6.equalsIgnoreCase(r1)
        L5d:
            if (r6 == 0) goto L4b
            goto L61
        L60:
            r5 = r4
        L61:
            if (r5 == 0) goto L64
            goto L66
        L64:
            bc.b r5 = bc.b.UNATTRIBUTED
        L66:
            r9.f3185a = r5
            java.lang.String r10 = "ids"
            zc.d.c(r0, r10)
            int r10 = r0.length()
            if (r10 != 0) goto L74
            r3 = 1
        L74:
            if (r3 == 0) goto L77
            goto L7c
        L77:
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>(r0)
        L7c:
            r9.f3187c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bc.a.<init>(java.lang.String):void");
    }

    public final String a() throws JSONException {
        String str;
        JSONObject put = new JSONObject().put("influence_channel", l.e(this.f3186b)).put("influence_type", this.f3185a.toString());
        JSONArray jSONArray = this.f3187c;
        if (jSONArray != null) {
            str = String.valueOf(jSONArray);
        } else {
            str = "";
        }
        String jSONObject = put.put("influence_ids", str).toString();
        d.c(jSONObject, "JSONObject()\n        .pu…e \"\")\n        .toString()");
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!d.a(a.class, obj.getClass()))) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f3186b == aVar.f3186b && this.f3185a == aVar.f3185a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3185a.hashCode() + (f.c(this.f3186b) * 31);
    }

    public final String toString() {
        return "SessionInfluence{influenceChannel=" + l.G(this.f3186b) + ", influenceType=" + this.f3185a + ", ids=" + this.f3187c + '}';
    }

    public a(int i10, b bVar, JSONArray jSONArray) {
        i.i(i10, "influenceChannel");
        d.d(bVar, "influenceType");
        this.f3186b = i10;
        this.f3185a = bVar;
        this.f3187c = jSONArray;
    }
}
