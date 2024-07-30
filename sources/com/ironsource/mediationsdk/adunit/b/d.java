package com.ironsource.mediationsdk.adunit.b;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public g f25159a;

    /* renamed from: b, reason: collision with root package name */
    public h f25160b;

    /* renamed from: c, reason: collision with root package name */
    public i f25161c;

    /* renamed from: d, reason: collision with root package name */
    public e f25162d;

    /* renamed from: e, reason: collision with root package name */
    public com.ironsource.mediationsdk.adunit.b.a f25163e;
    public j f;

    /* renamed from: g, reason: collision with root package name */
    public final IronSource.AD_UNIT f25164g;

    /* renamed from: h, reason: collision with root package name */
    public final b f25165h;

    /* renamed from: i, reason: collision with root package name */
    public c f25166i;

    /* renamed from: j, reason: collision with root package name */
    public final com.ironsource.mediationsdk.a.b f25167j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f25168k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f25169l;

    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f25170a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25171b;

        public a(d dVar, int i10, int i11) {
            this.f25170a = i10;
            this.f25171b = i11;
        }

        public final int a(b bVar) {
            if (b.MEDIATION.equals(bVar)) {
                return this.f25170a;
            }
            return this.f25171b;
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        MEDIATION,
        PROVIDER
    }

    public d(IronSource.AD_UNIT ad_unit, b bVar, c cVar) {
        com.ironsource.mediationsdk.a.b d10;
        this.f25164g = ad_unit;
        this.f25165h = bVar;
        this.f25166i = cVar;
        if (!ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) && !ad_unit.equals(IronSource.AD_UNIT.OFFERWALL)) {
            d10 = com.ironsource.mediationsdk.a.d.d();
        } else {
            d10 = com.ironsource.mediationsdk.a.h.d();
        }
        this.f25167j = d10;
        HashMap hashMap = new HashMap();
        this.f25168k = hashMap;
        com.ironsource.mediationsdk.adunit.b.b bVar2 = com.ironsource.mediationsdk.adunit.b.b.INIT_STARTED;
        e0.i.j(this, IronSourceConstants.IS_MANAGER_INIT_STARTED, -1, hashMap, bVar2);
        com.ironsource.mediationsdk.adunit.b.b bVar3 = com.ironsource.mediationsdk.adunit.b.b.INIT_ENDED;
        e0.i.j(this, IronSourceConstants.IS_MANAGER_INIT_ENDED, -1, hashMap, bVar3);
        com.ironsource.mediationsdk.adunit.b.b bVar4 = com.ironsource.mediationsdk.adunit.b.b.SESSION_CAPPED;
        e0.i.j(this, -1, IronSourceConstants.IS_CAP_SESSION, hashMap, bVar4);
        com.ironsource.mediationsdk.adunit.b.b bVar5 = com.ironsource.mediationsdk.adunit.b.b.PLACEMENT_CAPPED;
        e0.i.j(this, IronSourceConstants.IS_CAP_PLACEMENT, -1, hashMap, bVar5);
        com.ironsource.mediationsdk.adunit.b.b bVar6 = com.ironsource.mediationsdk.adunit.b.b.AUCTION_REQUEST;
        e0.i.j(this, 2000, -1, hashMap, bVar6);
        com.ironsource.mediationsdk.adunit.b.b bVar7 = com.ironsource.mediationsdk.adunit.b.b.AUCTION_SUCCESS;
        e0.i.j(this, IronSourceConstants.IS_AUCTION_SUCCESS, -1, hashMap, bVar7);
        com.ironsource.mediationsdk.adunit.b.b bVar8 = com.ironsource.mediationsdk.adunit.b.b.AUCTION_FAILED;
        e0.i.j(this, IronSourceConstants.IS_AUCTION_FAILED, -1, hashMap, bVar8);
        com.ironsource.mediationsdk.adunit.b.b bVar9 = com.ironsource.mediationsdk.adunit.b.b.AUCTION_REQUEST_WATERFALL;
        e0.i.j(this, IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, -1, hashMap, bVar9);
        com.ironsource.mediationsdk.adunit.b.b bVar10 = com.ironsource.mediationsdk.adunit.b.b.AUCTION_RESULT_WATERFALL;
        e0.i.j(this, IronSourceConstants.IS_RESULT_WATERFALL, -1, hashMap, bVar10);
        com.ironsource.mediationsdk.adunit.b.b bVar11 = com.ironsource.mediationsdk.adunit.b.b.INIT_SUCCESS;
        e0.i.j(this, -1, -1, hashMap, bVar11);
        com.ironsource.mediationsdk.adunit.b.b bVar12 = com.ironsource.mediationsdk.adunit.b.b.INIT_FAILED;
        e0.i.j(this, -1, -1, hashMap, bVar12);
        e0.i.j(this, -1, IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, hashMap, com.ironsource.mediationsdk.adunit.b.b.SHOW_AD_SUCCESS);
        com.ironsource.mediationsdk.adunit.b.b bVar13 = com.ironsource.mediationsdk.adunit.b.b.AD_OPENED;
        e0.i.j(this, -1, IronSourceConstants.IS_INSTANCE_OPENED, hashMap, bVar13);
        com.ironsource.mediationsdk.adunit.b.b bVar14 = com.ironsource.mediationsdk.adunit.b.b.AD_CLOSED;
        e0.i.j(this, -1, IronSourceConstants.IS_INSTANCE_CLOSED, hashMap, bVar14);
        com.ironsource.mediationsdk.adunit.b.b bVar15 = com.ironsource.mediationsdk.adunit.b.b.AD_CLICKED;
        e0.i.j(this, -1, 2006, hashMap, bVar15);
        com.ironsource.mediationsdk.adunit.b.b bVar16 = com.ironsource.mediationsdk.adunit.b.b.LOAD_AD;
        e0.i.j(this, 2001, 2002, hashMap, bVar16);
        com.ironsource.mediationsdk.adunit.b.b bVar17 = com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_SUCCESS;
        e0.i.j(this, 2004, 2003, hashMap, bVar17);
        com.ironsource.mediationsdk.adunit.b.b bVar18 = com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED_WITH_REASON;
        e0.i.j(this, IronSourceConstants.IS_CALLBACK_LOAD_ERROR, IronSourceConstants.IS_INSTANCE_LOAD_FAILED, hashMap, bVar18);
        com.ironsource.mediationsdk.adunit.b.b bVar19 = com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_NO_FILL;
        e0.i.j(this, -1, IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL, hashMap, bVar19);
        com.ironsource.mediationsdk.adunit.b.b bVar20 = com.ironsource.mediationsdk.adunit.b.b.SHOW_AD;
        e0.i.j(this, 2100, IronSourceConstants.IS_INSTANCE_SHOW, hashMap, bVar20);
        com.ironsource.mediationsdk.adunit.b.b bVar21 = com.ironsource.mediationsdk.adunit.b.b.SHOW_AD_FAILED;
        e0.i.j(this, IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, IronSourceConstants.IS_INSTANCE_SHOW_FAILED, hashMap, bVar21);
        com.ironsource.mediationsdk.adunit.b.b bVar22 = com.ironsource.mediationsdk.adunit.b.b.AD_UNIT_CAPPED;
        e0.i.j(this, IronSourceConstants.IS_AD_UNIT_CAPPED, -1, hashMap, bVar22);
        com.ironsource.mediationsdk.adunit.b.b bVar23 = com.ironsource.mediationsdk.adunit.b.b.COLLECT_TOKEN;
        e0.i.j(this, IronSourceConstants.IS_COLLECT_TOKENS, IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN, hashMap, bVar23);
        com.ironsource.mediationsdk.adunit.b.b bVar24 = com.ironsource.mediationsdk.adunit.b.b.COLLECT_TOKENS_COMPLETED;
        e0.i.j(this, IronSourceConstants.IS_COLLECT_TOKENS_COMPLETED, -1, hashMap, bVar24);
        com.ironsource.mediationsdk.adunit.b.b bVar25 = com.ironsource.mediationsdk.adunit.b.b.COLLECT_TOKENS_FAILED;
        e0.i.j(this, IronSourceConstants.IS_COLLECT_TOKENS_FAILED, -1, hashMap, bVar25);
        com.ironsource.mediationsdk.adunit.b.b bVar26 = com.ironsource.mediationsdk.adunit.b.b.INSTANCE_COLLECT_TOKEN_SUCCESS;
        e0.i.j(this, IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, hashMap, bVar26);
        com.ironsource.mediationsdk.adunit.b.b bVar27 = com.ironsource.mediationsdk.adunit.b.b.INSTANCE_COLLECT_TOKEN_FAILED;
        e0.i.j(this, IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_FAILED, IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_FAILED, hashMap, bVar27);
        com.ironsource.mediationsdk.adunit.b.b bVar28 = com.ironsource.mediationsdk.adunit.b.b.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        e0.i.j(this, IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, hashMap, bVar28);
        com.ironsource.mediationsdk.adunit.b.b bVar29 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_NETWORK_ADAPTER_NOT_AVAILABLE;
        e0.i.j(this, IronSourceConstants.TROUBLESHOOTING_IS_NETWORK_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_IS_NETWORK_ADAPTER_NOT_AVAILABLE, hashMap, bVar29);
        com.ironsource.mediationsdk.adunit.b.b bVar30 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_AD_ADAPTER_NOT_AVAILABLE;
        e0.i.j(this, IronSourceConstants.TROUBLESHOOTING_IS_AD_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_IS_AD_ADAPTER_NOT_AVAILABLE, hashMap, bVar30);
        com.ironsource.mediationsdk.adunit.b.b bVar31 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        e0.i.j(this, IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING, hashMap, bVar31);
        com.ironsource.mediationsdk.adunit.b.b bVar32 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_BIDDING_DATA_MISSING;
        e0.i.j(this, IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING, hashMap, bVar32);
        com.ironsource.mediationsdk.adunit.b.b bVar33 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        e0.i.j(this, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS, hashMap, bVar33);
        com.ironsource.mediationsdk.adunit.b.b bVar34 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        e0.i.j(this, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED, hashMap, bVar34);
        com.ironsource.mediationsdk.adunit.b.b bVar35 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        e0.i.j(this, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS, hashMap, bVar35);
        com.ironsource.mediationsdk.adunit.b.b bVar36 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        e0.i.j(this, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED, hashMap, bVar36);
        com.ironsource.mediationsdk.adunit.b.b bVar37 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        e0.i.j(this, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS, hashMap, bVar37);
        com.ironsource.mediationsdk.adunit.b.b bVar38 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        e0.i.j(this, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED, hashMap, bVar38);
        com.ironsource.mediationsdk.adunit.b.b bVar39 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        e0.i.j(this, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED, hashMap, bVar39);
        com.ironsource.mediationsdk.adunit.b.b bVar40 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_CLOSED;
        e0.i.j(this, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED, hashMap, bVar40);
        com.ironsource.mediationsdk.adunit.b.b bVar41 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        e0.i.j(this, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT, hashMap, bVar41);
        com.ironsource.mediationsdk.adunit.b.b bVar42 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_INTERNAL_ERROR;
        e0.i.j(this, IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR, hashMap, bVar42);
        com.ironsource.mediationsdk.adunit.b.b bVar43 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_ADAPTER_BRIDGE_INTERNAL_ERROR;
        e0.i.j(this, IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR, hashMap, bVar43);
        com.ironsource.mediationsdk.adunit.b.b bVar44 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        e0.i.j(this, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, hashMap, bVar44);
        e0.i.j(this, IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, hashMap, com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR);
        com.ironsource.mediationsdk.adunit.b.b bVar45 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_NOTIFICATION_ERROR;
        hashMap.put(bVar45, new a(this, IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, -1));
        HashMap hashMap2 = new HashMap();
        this.f25169l = hashMap2;
        hashMap2.put(bVar2, new a(this, IronSourceConstants.RV_MANAGER_INIT_STARTED, -1));
        hashMap2.put(bVar3, new a(this, IronSourceConstants.RV_MANAGER_INIT_ENDED, -1));
        hashMap2.put(bVar4, new a(this, -1, IronSourceConstants.RV_CAP_SESSION));
        hashMap2.put(bVar5, new a(this, IronSourceConstants.RV_CAP_PLACEMENT, -1));
        hashMap2.put(bVar6, new a(this, 1300, -1));
        hashMap2.put(bVar7, new a(this, IronSourceConstants.RV_AUCTION_SUCCESS, -1));
        hashMap2.put(bVar8, new a(this, IronSourceConstants.RV_AUCTION_FAILED, -1));
        hashMap2.put(bVar9, new a(this, IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, -1));
        hashMap2.put(bVar10, new a(this, IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, -1));
        hashMap2.put(bVar11, new a(this, -1, -1));
        e0.i.j(this, -1, -1, hashMap2, bVar12);
        hashMap2.put(com.ironsource.mediationsdk.adunit.b.b.AD_VISIBLE, new a(this, -1, IronSourceConstants.RV_INSTANCE_VISIBLE));
        hashMap2.put(bVar13, new a(this, -1, 1005));
        e0.i.j(this, -1, IronSourceConstants.RV_INSTANCE_CLOSED, hashMap2, bVar14);
        e0.i.j(this, -1, IronSourceConstants.RV_INSTANCE_STARTED, hashMap2, com.ironsource.mediationsdk.adunit.b.b.AD_STARTED);
        hashMap2.put(com.ironsource.mediationsdk.adunit.b.b.AD_ENDED, new a(this, -1, IronSourceConstants.RV_INSTANCE_ENDED));
        e0.i.j(this, -1, 1006, hashMap2, bVar15);
        e0.i.j(this, -1, 1010, hashMap2, com.ironsource.mediationsdk.adunit.b.b.AD_REWARDED);
        e0.i.j(this, IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE, IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, hashMap2, com.ironsource.mediationsdk.adunit.b.b.AD_AVAILABILITY_CHANGED_TRUE);
        hashMap2.put(com.ironsource.mediationsdk.adunit.b.b.AD_AVAILABILITY_CHANGED_FALSE, new a(this, IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE));
        hashMap2.put(bVar16, new a(this, 1000, 1001));
        e0.i.j(this, 1003, 1002, hashMap2, bVar17);
        hashMap2.put(com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED, new a(this, -1, 1200));
        hashMap2.put(bVar18, new a(this, IronSourceConstants.RV_MEDIATION_LOAD_ERROR, IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        hashMap2.put(bVar19, new a(this, -1, IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL));
        e0.i.j(this, 1100, 1201, hashMap2, bVar20);
        hashMap2.put(com.ironsource.mediationsdk.adunit.b.b.SHOW_AD_CHANCE, new a(this, -1, IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        hashMap2.put(bVar21, new a(this, IronSourceConstants.RV_CALLBACK_SHOW_FAILED, 1202));
        hashMap2.put(bVar22, new a(this, IronSourceConstants.RV_AD_UNIT_CAPPED, -1));
        hashMap2.put(bVar23, new a(this, IronSourceConstants.RV_COLLECT_TOKENS, 1020));
        hashMap2.put(bVar24, new a(this, IronSourceConstants.RV_COLLECT_TOKENS_COMPLETED, -1));
        hashMap2.put(bVar25, new a(this, IronSourceConstants.RV_COLLECT_TOKENS_FAILED, -1));
        hashMap2.put(bVar26, new a(this, 1021, 1021));
        hashMap2.put(bVar27, new a(this, 1022, 1022));
        hashMap2.put(bVar28, new a(this, 1023, 1023));
        hashMap2.put(bVar29, new a(this, IronSourceConstants.TROUBLESHOOTING_RV_NETWORK_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_RV_NETWORK_ADAPTER_NOT_AVAILABLE));
        hashMap2.put(bVar30, new a(this, IronSourceConstants.TROUBLESHOOTING_RV_AD_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_RV_AD_ADAPTER_NOT_AVAILABLE));
        hashMap2.put(bVar31, new a(this, IronSourceConstants.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING));
        hashMap2.put(bVar32, new a(this, IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING));
        hashMap2.put(bVar33, new a(this, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS));
        hashMap2.put(bVar34, new a(this, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED));
        hashMap2.put(bVar35, new a(this, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS));
        hashMap2.put(bVar36, new a(this, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED));
        hashMap2.put(bVar37, new a(this, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS));
        hashMap2.put(bVar38, new a(this, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED));
        hashMap2.put(bVar39, new a(this, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED));
        hashMap2.put(bVar41, new a(this, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT));
        hashMap2.put(bVar40, new a(this, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED));
        hashMap2.put(bVar41, new a(this, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT));
        e0.i.j(this, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, hashMap2, bVar41);
        hashMap2.put(com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_LOAD_FAILED, new a(this, IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED));
        hashMap2.put(bVar42, new a(this, IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR));
        hashMap2.put(bVar43, new a(this, IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR));
        e0.i.j(this, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, hashMap2, bVar44);
        hashMap2.put(com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOTING_WATERFALL_OVERHEAD, new a(this, IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD));
        hashMap2.put(bVar45, new a(this, IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, -1));
        this.f25159a = new g(this);
        this.f25160b = new h(this);
        this.f25161c = new i(this);
        this.f25162d = new e(this);
        this.f25163e = new com.ironsource.mediationsdk.adunit.b.a(this);
        this.f = new j(this);
    }

    public final void a() {
        this.f25166i = null;
        this.f25161c = null;
        this.f25162d = null;
        this.f25159a = null;
        this.f25160b = null;
        this.f25163e = null;
        this.f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.ironsource.mediationsdk.adunit.b.b r6, java.util.HashMap r7, long r8) {
        /*
            r5 = this;
            com.ironsource.mediationsdk.IronSource$AD_UNIT r0 = r5.f25164g
            r1 = -1
            com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch: java.lang.Exception -> L36
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Exception -> L36
            com.ironsource.mediationsdk.adunit.b.d$b r3 = r5.f25165h
            if (r2 == 0) goto L1c
            java.util.HashMap r2 = r5.f25168k
            boolean r4 = r2.containsKey(r6)     // Catch: java.lang.Exception -> L36
            if (r4 == 0) goto L1c
            java.lang.Object r0 = r2.get(r6)     // Catch: java.lang.Exception -> L36
        L19:
            com.ironsource.mediationsdk.adunit.b.d$a r0 = (com.ironsource.mediationsdk.adunit.b.d.a) r0     // Catch: java.lang.Exception -> L36
            goto L31
        L1c:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch: java.lang.Exception -> L36
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Exception -> L36
            if (r0 == 0) goto L3a
            java.util.HashMap r0 = r5.f25169l
            boolean r2 = r0.containsKey(r6)     // Catch: java.lang.Exception -> L36
            if (r2 == 0) goto L3a
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Exception -> L36
            goto L19
        L31:
            int r0 = r0.a(r3)     // Catch: java.lang.Exception -> L36
            goto L3b
        L36:
            r0 = move-exception
            r0.printStackTrace()
        L3a:
            r0 = r1
        L3b:
            if (r1 != r0) goto L3e
            return
        L3e:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.ironsource.mediationsdk.adunit.b.c r2 = r5.f25166i
            if (r2 == 0) goto L4e
            java.util.Map r6 = r2.a(r6)
            r1.putAll(r6)
        L4e:
            if (r7 == 0) goto L59
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L59
            r1.putAll(r7)
        L59:
            com.ironsource.mediationsdk.a.c r6 = new com.ironsource.mediationsdk.a.c
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>(r1)
            r6.<init>(r0, r8, r7)
            com.ironsource.mediationsdk.a.b r7 = r5.f25167j
            r7.b(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.b.d.b(com.ironsource.mediationsdk.adunit.b.b, java.util.HashMap, long):void");
    }
}
