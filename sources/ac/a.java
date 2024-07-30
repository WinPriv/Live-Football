package ac;

import com.onesignal.c3;
import com.onesignal.e3;
import com.onesignal.r3;
import com.onesignal.s1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSChannelTracker.kt */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public bc.b f401a;

    /* renamed from: b, reason: collision with root package name */
    public JSONArray f402b;

    /* renamed from: c, reason: collision with root package name */
    public String f403c;

    /* renamed from: d, reason: collision with root package name */
    public final c f404d;

    /* renamed from: e, reason: collision with root package name */
    public final s1 f405e;
    public final l3.d f;

    public a(c cVar, c3 c3Var, l3.d dVar) {
        this.f404d = cVar;
        this.f405e = c3Var;
        this.f = dVar;
    }

    public abstract void a(JSONObject jSONObject, bc.a aVar);

    public abstract void b();

    public abstract int c();

    public abstract int d();

    public final bc.a e() {
        boolean z10;
        int d10 = d();
        bc.b bVar = bc.b.DISABLED;
        bc.a aVar = new bc.a(d10, bVar, null);
        if (this.f401a == null) {
            k();
        }
        bc.b bVar2 = this.f401a;
        if (bVar2 != null) {
            bVar = bVar2;
        }
        boolean p10 = bVar.p();
        c cVar = this.f404d;
        if (p10) {
            cVar.f406a.getClass();
            if (r3.b(r3.f27010a, "PREFS_OS_DIRECT_ENABLED", false)) {
                aVar.f3187c = new JSONArray().put(this.f403c);
                aVar.f3185a = bc.b.DIRECT;
            }
        } else {
            bc.b bVar3 = bc.b.INDIRECT;
            if (bVar == bVar3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                cVar.f406a.getClass();
                if (r3.b(r3.f27010a, "PREFS_OS_INDIRECT_ENABLED", false)) {
                    aVar.f3187c = this.f402b;
                    aVar.f3185a = bVar3;
                }
            } else {
                cVar.f406a.getClass();
                if (r3.b(r3.f27010a, "PREFS_OS_UNATTRIBUTED_ENABLED", false)) {
                    aVar.f3185a = bc.b.UNATTRIBUTED;
                }
            }
        }
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!zc.d.a(getClass(), obj.getClass()))) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f401a == aVar.f401a && zc.d.a(aVar.f(), f())) {
            return true;
        }
        return false;
    }

    public abstract String f();

    public abstract int g();

    public abstract JSONArray h() throws JSONException;

    public final int hashCode() {
        int i10;
        bc.b bVar = this.f401a;
        if (bVar != null) {
            i10 = bVar.hashCode();
        } else {
            i10 = 0;
        }
        return f().hashCode() + (i10 * 31);
    }

    public abstract JSONArray i(String str);

    public final JSONArray j() {
        s1 s1Var = this.f405e;
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray h10 = h();
            ((c3) s1Var).c("OneSignal ChannelTracker getLastReceivedIds lastChannelObjectReceived: " + h10);
            long g6 = ((long) (g() * 60)) * 1000;
            this.f.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            int length = h10.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = h10.getJSONObject(i10);
                if (currentTimeMillis - jSONObject.getLong("time") <= g6) {
                    jSONArray.put(jSONObject.getString(f()));
                }
            }
        } catch (JSONException e10) {
            ((c3) s1Var).getClass();
            e3.b(3, "Generating tracker getLastReceivedIds JSONObject ", e10);
        }
        return jSONArray;
    }

    public abstract void k();

    public final void l() {
        bc.b bVar;
        this.f403c = null;
        JSONArray j10 = j();
        this.f402b = j10;
        if (j10.length() > 0) {
            bVar = bc.b.INDIRECT;
        } else {
            bVar = bc.b.UNATTRIBUTED;
        }
        this.f401a = bVar;
        b();
        ((c3) this.f405e).c("OneSignal OSChannelTracker resetAndInitInfluence: " + f() + " finish with influenceType: " + this.f401a);
    }

    public abstract void m(JSONArray jSONArray);

    public final void n(String str) {
        boolean z10;
        String str2 = "OneSignal OSChannelTracker for: " + f() + " saveLastId: " + str;
        c3 c3Var = (c3) this.f405e;
        c3Var.c(str2);
        if (str != null) {
            if (str.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                JSONArray i10 = i(str);
                c3Var.c("OneSignal OSChannelTracker for: " + f() + " saveLastId with lastChannelObjectsReceived: " + i10);
                try {
                    l3.d dVar = this.f;
                    JSONObject put = new JSONObject().put(f(), str);
                    dVar.getClass();
                    i10.put(put.put("time", System.currentTimeMillis()));
                    if (i10.length() > c()) {
                        JSONArray jSONArray = new JSONArray();
                        int length = i10.length();
                        for (int length2 = i10.length() - c(); length2 < length; length2++) {
                            try {
                                jSONArray.put(i10.get(length2));
                            } catch (JSONException e10) {
                                c3Var.getClass();
                                e3.b(3, "Generating tracker lastChannelObjectsReceived get JSONObject ", e10);
                            }
                        }
                        i10 = jSONArray;
                    }
                    c3Var.c("OneSignal OSChannelTracker for: " + f() + " with channelObjectToSave: " + i10);
                    m(i10);
                } catch (JSONException e11) {
                    c3Var.getClass();
                    e3.b(3, "Generating tracker newInfluenceId JSONObject ", e11);
                }
            }
        }
    }

    public final String toString() {
        return "OSChannelTracker{tag=" + f() + ", influenceType=" + this.f401a + ", indirectIds=" + this.f402b + ", directId=" + this.f403c + '}';
    }
}
