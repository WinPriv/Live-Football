package qa;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class l extends cb.e {

    /* renamed from: a, reason: collision with root package name */
    public final List<View> f34751a;

    public l(ArrayList arrayList) {
        this.f34751a = arrayList;
    }

    @Override // cb.e
    public final int a() {
        List<View> list = this.f34751a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
