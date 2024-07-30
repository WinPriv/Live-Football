package ka;

/* loaded from: classes2.dex */
public final class uh implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31983s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ vh f31984t;

    public uh(vh vhVar, String str) {
        this.f31984t = vhVar;
        this.f31983s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        int i10;
        String j10 = com.huawei.openalliance.ad.ppskit.utils.d0.j("yyyy-MM-dd");
        com.huawei.openalliance.ad.ppskit.handlers.l lVar = this.f31984t.f32034b;
        String str = this.f31983s;
        synchronized (lVar.f22585a) {
            string = lVar.G(str).getString("today_date", "");
        }
        if (!j10.equals(string)) {
            com.huawei.openalliance.ad.ppskit.handlers.l lVar2 = this.f31984t.f32034b;
            String str2 = this.f31983s;
            synchronized (lVar2.f22585a) {
                lVar2.G(str2).edit().putString("today_date", j10).commit();
            }
            com.huawei.openalliance.ad.ppskit.handlers.l lVar3 = this.f31984t.f32034b;
            String str3 = this.f31983s;
            synchronized (lVar3.f22585a) {
                lVar3.G(str3).edit().putInt("today_show_times", 0).commit();
            }
        }
        com.huawei.openalliance.ad.ppskit.handlers.l lVar4 = this.f31984t.f32034b;
        String str4 = this.f31983s;
        synchronized (lVar4.f22585a) {
            i10 = lVar4.G(str4).getInt("today_show_times", 0);
        }
        int i11 = i10 + 1;
        synchronized (lVar4.f22585a) {
            lVar4.G(str4).edit().putInt("today_show_times", i11).commit();
        }
    }
}
