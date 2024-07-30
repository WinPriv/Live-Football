package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public final class k5 extends i5 {

    /* loaded from: classes2.dex */
    public class a implements d7<String> {
        @Override // ka.d7
        public final void a(y6 y6Var) {
            if (y6Var.f32210b != -1) {
                n7.e("ConfirmDownloadAlertStrategy", "confirm reminder reject");
            }
        }
    }

    public k5(Context context) {
        super(context);
    }

    public final void a(String str, ContentRecord contentRecord) {
        androidx.activity.n.R(this.f31267a, str, contentRecord, new a());
    }
}
