package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.a4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1408a4<ModelType, StateType> {
    public final ModelType A02;
    public final StateType A03;
    public final String A04;

    @Nullable
    public List<InterfaceC1410a6<ModelType, StateType>> A01 = null;
    public C1407a3 A00 = C1407a3.A06;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a4 != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public C1408a4(ModelType model, StateType state, String str) {
        this.A02 = model;
        this.A03 = state;
        this.A04 = str;
    }

    public static /* synthetic */ C1407a3 A00(C1408a4 c1408a4) {
        return c1408a4.A00;
    }

    public static /* synthetic */ Object A01(C1408a4 c1408a4) {
        return c1408a4.A02;
    }

    public static /* synthetic */ Object A02(C1408a4 c1408a4) {
        return c1408a4.A03;
    }

    public static /* synthetic */ String A03(C1408a4 c1408a4) {
        return c1408a4.A04;
    }

    public static /* synthetic */ List A04(C1408a4 c1408a4) {
        return c1408a4.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a4 != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a6 != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final C1408a4<ModelType, StateType> A05(InterfaceC1410a6<ModelType, StateType> interfaceC1410a6) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        this.A01.add(interfaceC1410a6);
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a4 != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final C1407a3<ModelType, StateType> A06() {
        return new C1407a3<>(this);
    }
}
