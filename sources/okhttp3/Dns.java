package okhttp3;

import com.applovin.exoplayer2.b0;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public interface Dns {
    public static final Dns SYSTEM = new b0(25);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ List lambda$static$0(String str) throws UnknownHostException {
        if (str != null) {
            try {
                return Arrays.asList(InetAddress.getAllByName(str));
            } catch (NullPointerException e10) {
                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                unknownHostException.initCause(e10);
                throw unknownHostException;
            }
        }
        throw new UnknownHostException("hostname == null");
    }

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
