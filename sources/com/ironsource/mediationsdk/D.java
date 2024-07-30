package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.model.Placement;

/* loaded from: classes2.dex */
public interface D extends C {
    void a(Context context, boolean z10);

    @Override // com.ironsource.mediationsdk.C
    /* synthetic */ void a(IronSourceSegment ironSourceSegment);

    @Override // com.ironsource.mediationsdk.C
    /* synthetic */ void a(ImpressionDataListener impressionDataListener);

    void a(Placement placement);

    @Override // com.ironsource.mediationsdk.C
    /* synthetic */ void b();

    @Override // com.ironsource.mediationsdk.C
    /* synthetic */ void b(ImpressionDataListener impressionDataListener);

    boolean c();
}
