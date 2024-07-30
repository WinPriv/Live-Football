package com.huawei.hms.ads;

import android.content.Context;
import android.view.View;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.inter.data.AdContentData;

/* loaded from: classes2.dex */
public interface ka extends gb, gk {
    Integer Code(AdContentData adContentData);

    void Code(int i10);

    void Code(int i10, int i11, String str, boolean z10, Integer num);

    void Code(int i10, boolean z10);

    void Code(View view);

    void Code(kc kcVar, Integer num);

    void Code(ko koVar);

    void Code(AdContentData adContentData, int i10);

    void I(int i10);

    kc V(int i10);

    void V();

    AdSlotParam getAdSlotParam();

    int getAdType();

    int getAudioFocusType();

    Context getContext();
}
