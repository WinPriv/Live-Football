package u8;

import android.content.Intent;
import com.hamkho.livefoot.Activities.MainActivity;
import com.hamkho.livefoot.Activities.SoccerLive.LiveMainHolder;

/* compiled from: MainActivity.java */
/* loaded from: classes2.dex */
public final class c implements h9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f35793a;

    public c(MainActivity mainActivity) {
        this.f35793a = mainActivity;
    }

    @Override // h9.b
    public final void a() {
        MainActivity mainActivity = this.f35793a;
        mainActivity.startActivity(new Intent(mainActivity, (Class<?>) LiveMainHolder.class));
    }
}
