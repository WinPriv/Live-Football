package wb;

import android.os.CountDownTimer;
import com.ironsource.sdk.controller.g;
import com.ironsource.sdk.utils.Logger;

/* loaded from: classes2.dex */
public final class c extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f36194a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar) {
        super(200000L, 1000L);
        this.f36194a = gVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        g gVar = this.f36194a;
        Logger.i(gVar.f26121s, "Recovered Controller | Global Controller Timer Finish");
        gVar.e("controller html - download timeout");
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
        Logger.i(this.f36194a.f26121s, "Recovered Controller | Global Controller Timer Tick " + j10);
    }
}
