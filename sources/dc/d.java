package dc;

import com.onesignal.a4;
import com.onesignal.j3;
import com.onesignal.l3;
import com.onesignal.v3;
import com.onesignal.z3;
import org.json.JSONObject;

/* compiled from: OSOutcomeEventsV1Service.kt */
/* loaded from: classes2.dex */
public final class d extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j3 j3Var) {
        super(j3Var);
        zc.d.d(j3Var, "client");
    }

    @Override // dc.g
    public final void a(JSONObject jSONObject, l3 l3Var) {
        ((a4) this.f27604a).getClass();
        v3.b("outcomes/measure", jSONObject, new z3(l3Var));
    }
}
