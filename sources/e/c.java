package e;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import com.huawei.openalliance.ad.constant.bj;
import zc.d;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class c extends a<Intent, ActivityResult> {
    @Override // e.a
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        Intent intent = (Intent) obj;
        d.d(componentActivity, bj.f.o);
        d.d(intent, "input");
        return intent;
    }

    @Override // e.a
    public final ActivityResult c(int i10, Intent intent) {
        return new ActivityResult(i10, intent);
    }
}
