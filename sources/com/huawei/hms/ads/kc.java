package com.huawei.hms.ads;

import android.view.View;
import com.huawei.openalliance.ad.inter.data.AdContentData;

/* loaded from: classes2.dex */
public interface kc extends gb, gk, km {
    void B();

    boolean C();

    void Code(int i10);

    void Code(int i10, int i11);

    void Code(View view, Integer num);

    void Code(ha haVar);

    void D();

    void F();

    void I(int i10);

    void V();

    void Z();

    fs getAdMediator();

    void setAdContent(AdContentData adContentData);

    void setAdMediator(fs fsVar);

    void setAudioFocusType(int i10);

    void setDisplayDuration(int i10);
}
