package okhttp3;

import com.applovin.exoplayer2.a.l;
import java.io.IOException;
import javax.annotation.Nullable;

/* loaded from: classes2.dex */
public interface Authenticator {
    public static final Authenticator NONE = new l(27);

    static /* synthetic */ Request a(Route route, Response response) {
        return lambda$static$0(route, response);
    }

    static /* synthetic */ Request lambda$static$0(Route route, Response response) throws IOException {
        return null;
    }

    @Nullable
    Request authenticate(@Nullable Route route, Response response) throws IOException;
}
