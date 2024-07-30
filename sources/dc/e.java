package dc;

import a4.j;
import com.onesignal.c3;
import com.onesignal.e3;
import com.onesignal.l3;
import com.onesignal.s1;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSOutcomeEventsV2Repository.kt */
/* loaded from: classes2.dex */
public final class e extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(s1 s1Var, j jVar, f fVar) {
        super(s1Var, jVar, fVar);
        zc.d.d(s1Var, "logger");
        zc.d.d(jVar, "outcomeEventsCache");
    }

    @Override // ec.c
    public final void c(String str, int i10, ec.b bVar, l3 l3Var) {
        zc.d.d(str, "appId");
        zc.d.d(bVar, "event");
        try {
            JSONObject put = bVar.a().put("app_id", str).put("device_type", i10);
            g gVar = this.f27607c;
            zc.d.c(put, "jsonObject");
            gVar.a(put, l3Var);
        } catch (JSONException e10) {
            ((c3) this.f27605a).getClass();
            e3.b(3, "Generating indirect outcome:JSON Failed.", e10);
        }
    }
}
