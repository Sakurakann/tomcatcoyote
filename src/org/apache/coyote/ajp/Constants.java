package org.apache.coyote.ajp;

import java.util.Hashtable;
import org.apache.tomcat.util.buf.ByteChunk;

public final class Constants {
  public static final String Package = "org.apache.coyote.ajp";
  public static final int DEFAULT_CONNECTION_LINGER = -1;
  public static final int DEFAULT_CONNECTION_TIMEOUT = -1;
  public static final int DEFAULT_CONNECTION_UPLOAD_TIMEOUT = 300000;
  public static final int DEFAULT_SERVER_SOCKET_TIMEOUT = 0;
  public static final boolean DEFAULT_TCP_NO_DELAY = true;
  public static final byte JK_AJP13_FORWARD_REQUEST = 2;
  public static final byte JK_AJP13_SHUTDOWN = 7;
  public static final byte JK_AJP13_PING_REQUEST = 8;
  public static final byte JK_AJP13_CPING_REQUEST = 10;
  public static final byte JK_AJP13_SEND_BODY_CHUNK = 3;
  public static final byte JK_AJP13_SEND_HEADERS = 4;
  public static final byte JK_AJP13_END_RESPONSE = 5;
  public static final byte JK_AJP13_GET_BODY_CHUNK = 6;
  public static final byte JK_AJP13_CPONG_REPLY = 9;
  public static final int SC_RESP_CONTENT_TYPE = 40961;
  public static final int SC_RESP_CONTENT_LANGUAGE = 40962;
  public static final int SC_RESP_CONTENT_LENGTH = 40963;
  public static final int SC_RESP_DATE = 40964;
  public static final int SC_RESP_LAST_MODIFIED = 40965;
  public static final int SC_RESP_LOCATION = 40966;
  public static final int SC_RESP_SET_COOKIE = 40967;
  public static final int SC_RESP_SET_COOKIE2 = 40968;
  public static final int SC_RESP_SERVLET_ENGINE = 40969;
  public static final int SC_RESP_STATUS = 40970;
  public static final int SC_RESP_WWW_AUTHENTICATE = 40971;
  public static final int SC_RESP_AJP13_MAX = 11;
  public static final byte SC_A_CONTEXT = 1;
  public static final byte SC_A_SERVLET_PATH = 2;
  public static final byte SC_A_REMOTE_USER = 3;
  public static final byte SC_A_AUTH_TYPE = 4;
  public static final byte SC_A_QUERY_STRING = 5;
  public static final byte SC_A_JVM_ROUTE = 6;
  public static final byte SC_A_SSL_CERT = 7;
  public static final byte SC_A_SSL_CIPHER = 8;
  public static final byte SC_A_SSL_SESSION = 9;
  public static final byte SC_A_SSL_KEYSIZE = 11;
  public static final byte SC_A_SECRET = 12;
  public static final byte SC_A_STORED_METHOD = 13;
  public static final byte SC_A_REQ_ATTRIBUTE = 10;
  public static final String SC_A_REQ_LOCAL_ADDR = "AJP_LOCAL_ADDR";
  public static final String SC_A_REQ_REMOTE_PORT = "AJP_REMOTE_PORT";
  public static final byte SC_A_ARE_DONE = -1;
  public static final int MAX_PACKET_SIZE = 8192;
  public static final int H_SIZE = 4;
  public static final int READ_HEAD_LEN = 6;
  public static final int SEND_HEAD_LEN = 8;
  public static final int MAX_READ_SIZE = 8186;
  public static final int MAX_SEND_SIZE = 8184;
  public static final String[] methodTransArray = new String[]{"OPTIONS", "GET", "HEAD", "POST", "PUT", "DELETE", "TRACE", "PROPFIND", "PROPPATCH", "MKCOL", "COPY", "MOVE", "LOCK", "UNLOCK", "ACL", "REPORT", "VERSION-CONTROL", "CHECKIN", "CHECKOUT", "UNCHECKOUT", "SEARCH", "MKWORKSPACE", "UPDATE", "LABEL", "MERGE", "BASELINE-CONTROL", "MKACTIVITY"};
  public static final int SC_M_JK_STORED = -1;
  public static final int SC_REQ_ACCEPT = 1;
  public static final int SC_REQ_ACCEPT_CHARSET = 2;
  public static final int SC_REQ_ACCEPT_ENCODING = 3;
  public static final int SC_REQ_ACCEPT_LANGUAGE = 4;
  public static final int SC_REQ_AUTHORIZATION = 5;
  public static final int SC_REQ_CONNECTION = 6;
  public static final int SC_REQ_CONTENT_TYPE = 7;
  public static final int SC_REQ_CONTENT_LENGTH = 8;
  public static final int SC_REQ_COOKIE = 9;
  public static final int SC_REQ_COOKIE2 = 10;
  public static final int SC_REQ_HOST = 11;
  public static final int SC_REQ_PRAGMA = 12;
  public static final int SC_REQ_REFERER = 13;
  public static final int SC_REQ_USER_AGENT = 14;
  public static final byte SC_A_SSL_KEY_SIZE = 11;
  public static final String[] headerTransArray = new String[]{"accept", "accept-charset", "accept-encoding", "accept-language", "authorization", "connection", "content-type", "content-length", "cookie", "cookie2", "host", "pragma", "referer", "user-agent"};
  public static final String[] responseTransArray = new String[]{"Content-Type", "Content-Language", "Content-Length", "Date", "Last-Modified", "Location", "Set-Cookie", "Set-Cookie2", "Servlet-Engine", "Status", "WWW-Authenticate"};
  private static final Hashtable<String, Integer> responseTransHash = new Hashtable(20);
  public static final String CRLF = "\r\n";
  public static final byte[] SERVER_BYTES;
  public static final byte CR = 13;
  public static final byte LF = 10;
  public static final byte SP = 32;
  public static final byte HT = 9;
  public static final byte COLON = 58;
  public static final byte A = 65;
  public static final byte a = 97;
  public static final byte Z = 90;
  public static final byte QUESTION = 63;
  public static final byte LC_OFFSET = -32;
  public static final int DEFAULT_HTTP_HEADER_BUFFER_SIZE = 49152;
  public static final byte[] CRLF_BYTES;
  public static final byte[] COLON_BYTES;
  public static final String CONNECTION = "Connection";
  public static final String CLOSE = "close";
  public static final byte[] CLOSE_BYTES;
  public static final String KEEPALIVE = "keep-alive";
  public static final byte[] KEEPALIVE_BYTES;
  public static final String CHUNKED = "chunked";
  public static final byte[] ACK_BYTES;
  public static final String TRANSFERENCODING = "Transfer-Encoding";
  public static final byte[] _200_BYTES;
  public static final byte[] _400_BYTES;
  public static final byte[] _404_BYTES;
  public static final int IDENTITY_FILTER = 0;
  public static final int CHUNKED_FILTER = 1;
  public static final int VOID_FILTER = 2;
  public static final int GZIP_FILTER = 3;
  public static final int BUFFERED_FILTER = 3;
  public static final String HTTP_10 = "HTTP/1.0";
  public static final String HTTP_11 = "HTTP/1.1";
  public static final byte[] HTTP_11_BYTES;
  public static final String GET = "GET";
  public static final String HEAD = "HEAD";
  public static final String POST = "POST";

  public Constants() {
  }

  public static final int getResponseAjpIndex(String header) {
    Integer i = (Integer)responseTransHash.get(header);
    return i == null ? 0 : i.intValue();
  }

  static {
    try {
      for(int i = 0; i < 11; ++i) {
        responseTransHash.put(responseTransArray[i], new Integer('ꀁ' + i));
      }
    } catch (Exception var1) {
      ;
    }

    SERVER_BYTES = ByteChunk.convertToBytes("unknown\r\n");
    CRLF_BYTES = ByteChunk.convertToBytes("\r\n");
    COLON_BYTES = ByteChunk.convertToBytes(": ");
    CLOSE_BYTES = ByteChunk.convertToBytes("close");
    KEEPALIVE_BYTES = ByteChunk.convertToBytes("keep-alive");
    ACK_BYTES = ByteChunk.convertToBytes("HTTP/1.1 100 Continue\r\n\r\n");
    _200_BYTES = ByteChunk.convertToBytes("200");
    _400_BYTES = ByteChunk.convertToBytes("400");
    _404_BYTES = ByteChunk.convertToBytes("404");
    HTTP_11_BYTES = ByteChunk.convertToBytes("HTTP/1.1");
  }
}
