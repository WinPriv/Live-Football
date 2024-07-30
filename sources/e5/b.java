package e5;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: EventMessageEncoder.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f27750a;

    /* renamed from: b, reason: collision with root package name */
    public final DataOutputStream f27751b;

    public b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f27750a = byteArrayOutputStream;
        this.f27751b = new DataOutputStream(byteArrayOutputStream);
    }

    public final byte[] a(EventMessage eventMessage) {
        ByteArrayOutputStream byteArrayOutputStream = this.f27750a;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = this.f27751b;
        try {
            dataOutputStream.writeBytes(eventMessage.f20002s);
            dataOutputStream.writeByte(0);
            String str = eventMessage.f20003t;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(eventMessage.f20004u);
            dataOutputStream.writeLong(eventMessage.f20005v);
            dataOutputStream.write(eventMessage.f20006w);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
