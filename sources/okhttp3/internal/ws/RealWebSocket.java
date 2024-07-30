package okhttp3.internal.ws;

import a3.k;
import androidx.activity.g;
import e0.i;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.ws.WebSocketReader;
import okio.c;
import okio.d;
import okio.e;
import okio.q;
import okio.t;
import okio.y;

/* loaded from: classes2.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private static final List<Protocol> ONLY_HTTP1 = Collections.singletonList(Protocol.HTTP_1_1);
    private boolean awaitingPong;
    private Call call;
    private ScheduledFuture<?> cancelFuture;
    private boolean enqueuedClose;
    private ScheduledExecutorService executor;
    private boolean failed;
    private final String key;
    final WebSocketListener listener;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private WebSocketWriter writer;
    private final Runnable writerRunnable;
    private final ArrayDeque<e> pongQueue = new ArrayDeque<>();
    private final ArrayDeque<Object> messageAndCloseQueue = new ArrayDeque<>();
    private int receivedCloseCode = -1;

    /* renamed from: okhttp3.internal.ws.RealWebSocket$1 */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Callback {
        final /* synthetic */ Request val$request;

        public AnonymousClass1(Request request) {
            r2 = request;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            RealWebSocket.this.failWebSocket(iOException, null);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            Exchange exchange = Internal.instance.exchange(response);
            try {
                RealWebSocket.this.checkUpgradeSuccess(response, exchange);
                try {
                    RealWebSocket.this.initReaderAndWriter("OkHttp WebSocket " + r2.url().redact(), exchange.newWebSocketStreams());
                    RealWebSocket realWebSocket = RealWebSocket.this;
                    realWebSocket.listener.onOpen(realWebSocket, response);
                    RealWebSocket.this.loopReader();
                } catch (Exception e10) {
                    RealWebSocket.this.failWebSocket(e10, null);
                }
            } catch (IOException e11) {
                if (exchange != null) {
                    exchange.webSocketUpgradeFailed();
                }
                RealWebSocket.this.failWebSocket(e11, response);
                Util.closeQuietly(response);
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class CancelRunnable implements Runnable {
        public CancelRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RealWebSocket.this.cancel();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Close {
        final long cancelAfterCloseMillis;
        final int code;
        final e reason;

        public Close(int i10, e eVar, long j10) {
            this.code = i10;
            this.reason = eVar;
            this.cancelAfterCloseMillis = j10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Message {
        final e data;
        final int formatOpcode;

        public Message(int i10, e eVar) {
            this.formatOpcode = i10;
            this.data = eVar;
        }
    }

    /* loaded from: classes2.dex */
    public final class PingRunnable implements Runnable {
        public PingRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RealWebSocket.this.writePingFrame();
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class Streams implements Closeable {
        public final boolean client;
        public final c sink;
        public final d source;

        public Streams(boolean z10, d dVar, c cVar) {
            this.client = z10;
            this.source = dVar;
            this.sink = cVar;
        }
    }

    public RealWebSocket(Request request, WebSocketListener webSocketListener, Random random, long j10) {
        if ("GET".equals(request.method())) {
            this.originalRequest = request;
            this.listener = webSocketListener;
            this.random = random;
            this.pingIntervalMillis = j10;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.key = e.v(bArr).k();
            this.writerRunnable = new g(this, 11);
            return;
        }
        throw new IllegalArgumentException("Request must be GET: " + request.method());
    }

    public /* synthetic */ void lambda$new$0() {
        do {
            try {
            } catch (IOException e10) {
                failWebSocket(e10, null);
                return;
            }
        } while (writeOneFrame());
    }

    private void runWriter() {
        ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.writerRunnable);
        }
    }

    public void awaitTermination(int i10, TimeUnit timeUnit) throws InterruptedException {
        this.executor.awaitTermination(i10, timeUnit);
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        this.call.cancel();
    }

    public void checkUpgradeSuccess(Response response, @Nullable Exchange exchange) throws IOException {
        if (response.code() == 101) {
            String header = response.header("Connection");
            if ("Upgrade".equalsIgnoreCase(header)) {
                String header2 = response.header("Upgrade");
                if ("websocket".equalsIgnoreCase(header2)) {
                    String header3 = response.header("Sec-WebSocket-Accept");
                    String k10 = e.p(this.key + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").o("SHA-1").k();
                    if (k10.equals(header3)) {
                        if (exchange != null) {
                            return;
                        } else {
                            throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                        }
                    }
                    throw new ProtocolException(i.g("Expected 'Sec-WebSocket-Accept' header value '", k10, "' but was '", header3, "'"));
                }
                throw new ProtocolException(k.l("Expected 'Upgrade' header value 'websocket' but was '", header2, "'"));
            }
            throw new ProtocolException(k.l("Expected 'Connection' header value 'Upgrade' but was '", header, "'"));
        }
        throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + " " + response.message() + "'");
    }

    @Override // okhttp3.WebSocket
    public boolean close(int i10, String str) {
        return close(i10, str, CANCEL_AFTER_CLOSE_MILLIS);
    }

    public void connect(OkHttpClient okHttpClient) {
        OkHttpClient build = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        Request build2 = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").build();
        Call newWebSocketCall = Internal.instance.newWebSocketCall(build, build2);
        this.call = newWebSocketCall;
        newWebSocketCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket.1
            final /* synthetic */ Request val$request;

            public AnonymousClass1(Request build22) {
                r2 = build22;
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                RealWebSocket.this.failWebSocket(iOException, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                Exchange exchange = Internal.instance.exchange(response);
                try {
                    RealWebSocket.this.checkUpgradeSuccess(response, exchange);
                    try {
                        RealWebSocket.this.initReaderAndWriter("OkHttp WebSocket " + r2.url().redact(), exchange.newWebSocketStreams());
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        realWebSocket.listener.onOpen(realWebSocket, response);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e10) {
                        RealWebSocket.this.failWebSocket(e10, null);
                    }
                } catch (IOException e11) {
                    if (exchange != null) {
                        exchange.webSocketUpgradeFailed();
                    }
                    RealWebSocket.this.failWebSocket(e11, response);
                    Util.closeQuietly(response);
                }
            }
        });
    }

    public void failWebSocket(Exception exc, @Nullable Response response) {
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            Streams streams = this.streams;
            this.streams = null;
            ScheduledFuture<?> scheduledFuture = this.cancelFuture;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledExecutorService scheduledExecutorService = this.executor;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
            try {
                this.listener.onFailure(this, exc, response);
            } finally {
                Util.closeQuietly(streams);
            }
        }
    }

    public void initReaderAndWriter(String str, Streams streams) throws IOException {
        synchronized (this) {
            this.streams = streams;
            this.writer = new WebSocketWriter(streams.client, streams.sink, this.random);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(str, false));
            this.executor = scheduledThreadPoolExecutor;
            if (this.pingIntervalMillis != 0) {
                PingRunnable pingRunnable = new PingRunnable();
                long j10 = this.pingIntervalMillis;
                scheduledThreadPoolExecutor.scheduleAtFixedRate(pingRunnable, j10, j10, TimeUnit.MILLISECONDS);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
        }
        this.reader = new WebSocketReader(streams.client, streams.source, this);
    }

    public void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            this.reader.processNextFrame();
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int i10, String str) {
        Streams streams;
        if (i10 != -1) {
            synchronized (this) {
                if (this.receivedCloseCode == -1) {
                    this.receivedCloseCode = i10;
                    this.receivedCloseReason = str;
                    streams = null;
                    if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                        Streams streams2 = this.streams;
                        this.streams = null;
                        ScheduledFuture<?> scheduledFuture = this.cancelFuture;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        this.executor.shutdown();
                        streams = streams2;
                    }
                } else {
                    throw new IllegalStateException("already closed");
                }
            }
            try {
                this.listener.onClosing(this, i10, str);
                if (streams != null) {
                    this.listener.onClosed(this, i10, str);
                }
                return;
            } finally {
                Util.closeQuietly(streams);
            }
        }
        throw new IllegalArgumentException();
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(String str) throws IOException {
        this.listener.onMessage(this, str);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(e eVar) {
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(eVar);
            runWriter();
            this.receivedPingCount++;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(e eVar) {
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public synchronized boolean pong(e eVar) {
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(eVar);
            runWriter();
            return true;
        }
        return false;
    }

    public boolean processNextFrame() throws IOException {
        try {
            this.reader.processNextFrame();
            if (this.receivedCloseCode != -1) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            failWebSocket(e10, null);
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    public synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.WebSocket
    public Request request() {
        return this.originalRequest;
    }

    @Override // okhttp3.WebSocket
    public boolean send(String str) {
        if (str != null) {
            return send(e.p(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    public synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public void tearDown() throws InterruptedException {
        ScheduledFuture<?> scheduledFuture = this.cancelFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.executor.shutdown();
        this.executor.awaitTermination(10L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public boolean writeOneFrame() throws IOException {
        String str;
        int i10;
        Streams streams;
        synchronized (this) {
            if (this.failed) {
                return false;
            }
            WebSocketWriter webSocketWriter = this.writer;
            e poll = this.pongQueue.poll();
            Message message = 0;
            if (poll == null) {
                Object poll2 = this.messageAndCloseQueue.poll();
                if (poll2 instanceof Close) {
                    i10 = this.receivedCloseCode;
                    str = this.receivedCloseReason;
                    if (i10 != -1) {
                        streams = this.streams;
                        this.streams = null;
                        this.executor.shutdown();
                    } else {
                        this.cancelFuture = this.executor.schedule(new CancelRunnable(), ((Close) poll2).cancelAfterCloseMillis, TimeUnit.MILLISECONDS);
                        streams = null;
                    }
                } else {
                    if (poll2 == null) {
                        return false;
                    }
                    str = null;
                    i10 = -1;
                    streams = null;
                }
                message = poll2;
            } else {
                str = null;
                i10 = -1;
                streams = null;
            }
            try {
                if (poll != null) {
                    webSocketWriter.writePong(poll);
                } else if (message instanceof Message) {
                    e eVar = message.data;
                    y newMessageSink = webSocketWriter.newMessageSink(message.formatOpcode, eVar.A());
                    Logger logger = q.f33861a;
                    t tVar = new t(newMessageSink);
                    tVar.O(eVar);
                    tVar.close();
                    synchronized (this) {
                        this.queueSize -= eVar.A();
                    }
                } else if (message instanceof Close) {
                    Close close = (Close) message;
                    webSocketWriter.writeClose(close.code, close.reason);
                    if (streams != null) {
                        this.listener.onClosed(this, i10, str);
                    }
                } else {
                    throw new AssertionError();
                }
                Util.closeQuietly(streams);
                return true;
            } catch (Throwable th) {
                Util.closeQuietly(streams);
                throw th;
            }
        }
    }

    public void writePingFrame() {
        int i10;
        synchronized (this) {
            if (this.failed) {
                return;
            }
            WebSocketWriter webSocketWriter = this.writer;
            if (this.awaitingPong) {
                i10 = this.sentPingCount;
            } else {
                i10 = -1;
            }
            this.sentPingCount++;
            this.awaitingPong = true;
            if (i10 != -1) {
                failWebSocket(new SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (i10 - 1) + " successful ping/pongs)"), null);
                return;
            }
            try {
                webSocketWriter.writePing(e.f33834w);
            } catch (IOException e10) {
                failWebSocket(e10, null);
            }
        }
    }

    public synchronized boolean close(int i10, String str, long j10) {
        e eVar;
        WebSocketProtocol.validateCloseCode(i10);
        if (str != null) {
            eVar = e.p(str);
            if (eVar.f33835s.length > 123) {
                throw new IllegalArgumentException("reason.size() > 123: ".concat(str));
            }
        } else {
            eVar = null;
        }
        if (!this.failed && !this.enqueuedClose) {
            this.enqueuedClose = true;
            this.messageAndCloseQueue.add(new Close(i10, eVar, j10));
            runWriter();
            return true;
        }
        return false;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(e eVar) throws IOException {
        this.listener.onMessage(this, eVar);
    }

    @Override // okhttp3.WebSocket
    public boolean send(e eVar) {
        if (eVar != null) {
            return send(eVar, 2);
        }
        throw new NullPointerException("bytes == null");
    }

    private synchronized boolean send(e eVar, int i10) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + eVar.A() > MAX_QUEUE_SIZE) {
                close(1001, null);
                return false;
            }
            this.queueSize += eVar.A();
            this.messageAndCloseQueue.add(new Message(i10, eVar));
            runWriter();
            return true;
        }
        return false;
    }
}
