package t5;

import d6.w;
import java.util.List;
import r5.f;

/* compiled from: DvbDecoder.java */
/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: m, reason: collision with root package name */
    public final b f35460m;

    public a(List<byte[]> list) {
        w wVar = new w(list.get(0));
        this.f35460m = new b(wVar.y(), wVar.y());
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // r5.f
    public final r5.g g(byte[] r31, int r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.a.g(byte[], int, boolean):r5.g");
    }
}
