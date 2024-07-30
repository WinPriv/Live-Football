package com.ironsource.sdk.controller;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f26188a;

    /* renamed from: b, reason: collision with root package name */
    public final com.ironsource.sdk.h.b f26189b;

    /* loaded from: classes2.dex */
    public class a implements com.ironsource.sdk.k.f {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ o f26190s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ n f26191t;

        public a(h hVar, o oVar, n nVar) {
            this.f26190s = oVar;
            this.f26191t = nVar;
        }

        @Override // com.ironsource.sdk.k.f
        public final void a(com.ironsource.sdk.h.c cVar) {
            try {
                o oVar = this.f26190s;
                n nVar = this.f26191t;
                oVar.a(nVar, h.a(nVar, cVar.a()));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.ironsource.sdk.k.f
        public final void a(com.ironsource.sdk.h.c cVar, com.ironsource.sdk.g.e eVar) {
            JSONObject jSONObject;
            try {
                o oVar = this.f26190s;
                n nVar = this.f26191t;
                try {
                    jSONObject = nVar.a().put("errMsg", eVar.f26515a);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    jSONObject = new JSONObject();
                }
                oVar.b(nVar, jSONObject);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public h(String str, com.ironsource.sdk.h.b bVar) {
        this.f26188a = str;
        this.f26189b = bVar;
    }

    public static JSONObject a(n nVar, JSONObject jSONObject) {
        try {
            return nVar.a().put("result", jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.ironsource.sdk.h.b.1.<init>(com.ironsource.sdk.h.b, com.ironsource.sdk.k.f):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public final void b(org.json.JSONObject r14, com.ironsource.sdk.controller.x.d.a r15) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.h.b(org.json.JSONObject, com.ironsource.sdk.controller.x$d$a):void");
    }
}
