package ka;

import com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.n1;

/* loaded from: classes2.dex */
public final class vc implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f32001s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ng f32002t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f32003u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AdContentRsp f32004v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f32005w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f32006x;
    public final /* synthetic */ ad y;

    public vc(ad adVar, boolean z10, n1.a aVar, String str, AdContentRsp adContentRsp, int i10, long j10) {
        this.y = adVar;
        this.f32001s = z10;
        this.f32002t = aVar;
        this.f32003u = str;
        this.f32004v = adContentRsp;
        this.f32005w = i10;
        this.f32006x = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList b10;
        int i10;
        AdContentRsp adContentRsp = this.f32004v;
        String str = this.f32003u;
        ng ngVar = this.f32002t;
        int i11 = this.f32005w;
        boolean z10 = this.f32001s;
        if (z10) {
            b10 = ngVar.a(str, adContentRsp, i11);
            i10 = 1;
        } else {
            b10 = ngVar.b(str, adContentRsp, i11);
            i10 = 0;
        }
        uc ucVar = new uc(this.y.f30934a, b10, z10, i11);
        ucVar.f31050c = i11;
        long j10 = this.f32006x;
        n7.e("ARContentProcessor", "deal Ar contents start, adtype is " + ucVar.f31050c);
        List<ContentRecord> list = ucVar.f31048a;
        if (androidx.transition.n.M(list)) {
            n7.g("ARContentProcessor", "deal Ar contents, content records is empty");
            return;
        }
        byte[] h10 = com.huawei.openalliance.ad.ppskit.utils.u1.h(ucVar.f31054h);
        Iterator<ContentRecord> it = list.iterator();
        while (it.hasNext()) {
            ucVar.j(it.next(), j10, h10, i10);
        }
    }
}
