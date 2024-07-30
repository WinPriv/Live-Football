package ka;

import java.net.Socket;
import ka.u8;

/* loaded from: classes2.dex */
public final class v8 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Socket f31994s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u8 f31995t;

    public v8(u8 u8Var, Socket socket) {
        this.f31995t = u8Var;
        this.f31994s = socket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Socket socket = this.f31994s;
        u8 u8Var = this.f31995t;
        u8Var.getClass();
        try {
            c9 c9Var = new c9(x8.a(socket.getInputStream()), u8Var.f31933a, u8Var.f31934b);
            c9Var.f31035d = u8Var.f31938g;
            c9Var.f31037g = new u8.b(u8Var);
            c9Var.a(socket);
        } catch (Throwable th) {
            if (n7.d()) {
                n7.a();
            }
            n7.j("CreativeHttpServer", "process socket failed, %s", th.getClass().getSimpleName());
        }
    }
}
