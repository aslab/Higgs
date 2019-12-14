/* Auto-generated by genmsg_java.py for file /opt/ros/diamondback/stacks/ros_comm/messages/rosgraph_msgs/msg/Log.msg */

package ros.pkg.rosgraph_msgs.msg;

import java.nio.ByteBuffer;

public class Log extends ros.communication.Message {
  static public final short DEBUG = 1;
  static public final short INFO = 2;
  static public final short WARN = 4;
  static public final short ERROR = 8;
  static public final short FATAL = 16;

  public ros.pkg.std_msgs.msg.Header header = new ros.pkg.std_msgs.msg.Header();
  public short level;
  public java.lang.String name = new java.lang.String();
  public java.lang.String msg = new java.lang.String();
  public java.lang.String file = new java.lang.String();
  public java.lang.String function = new java.lang.String();
  public long line;
  public java.util.ArrayList<java.lang.String> topics = new java.util.ArrayList<java.lang.String>();

  public Log() {
  }

  public static java.lang.String __s_getDataType() { return "rosgraph_msgs/Log"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "acffd30cd6b6de30f120938c17c593fb"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "##\n" +
"## Severity level constants\n" +
"##\n" +
"byte DEBUG=1 #debug level\n" +
"byte INFO=2  #general level\n" +
"byte WARN=4  #warning level\n" +
"byte ERROR=8 #error level\n" +
"byte FATAL=16 #fatal/critical level\n" +
"##\n" +
"## Fields\n" +
"##\n" +
"Header header\n" +
"byte level\n" +
"string name # name of the node\n" +
"string msg # message \n" +
"string file # file the message came from\n" +
"string function # function the message came from\n" +
"uint32 line # line the message came from\n" +
"string[] topics # topic names that the node publishes\n" +
"\n" +
"================================================================================\n" +
"MSG: std_msgs/Header\n" +
"# Standard metadata for higher-level stamped data types.\n" +
"# This is generally used to communicate timestamped data \n" +
"# in a particular coordinate frame.\n" +
"# \n" +
"# sequence ID: consecutively increasing ID \n" +
"uint32 seq\n" +
"#Two-integer timestamp that is expressed as:\n" +
"# * stamp.secs: seconds (stamp_secs) since epoch\n" +
"# * stamp.nsecs: nanoseconds since stamp_secs\n" +
"# time-handling sugar is provided by the client library\n" +
"time stamp\n" +
"#Frame this data is associated with\n" +
"# 0: no frame\n" +
"# 1: global frame\n" +
"string frame_id\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Log clone() {
    Log c = new Log();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += header.serializationLength();
    __l += 1; // level
    __l += 4 + name.length();
    __l += 4 + msg.length();
    __l += 4 + file.length();
    __l += 4 + function.length();
    __l += 4; // line
    __l += 4;
    for(java.lang.String val : topics) {
      __l += 4 + val.length();
    }
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    header.serialize(bb, seq);
    bb.put((byte)level);
    Serialization.writeString(bb, name);
    Serialization.writeString(bb, msg);
    Serialization.writeString(bb, file);
    Serialization.writeString(bb, function);
    bb.putInt((int)line);
    bb.putInt(topics.size());
    for(java.lang.String val : topics) {
      Serialization.writeString(bb, val);
    }
  }

  public void deserialize(ByteBuffer bb) {
    header.deserialize(bb);
    level = (short)(bb.get() & 0xff);
    name = Serialization.readString(bb);
    msg = Serialization.readString(bb);
    file = Serialization.readString(bb);
    function = Serialization.readString(bb);
    line = (long)(bb.getInt() & 0xffffffff);

    int __topics_len = bb.getInt();
    topics = new java.util.ArrayList<java.lang.String>(__topics_len);
    for(int __i=0; __i<__topics_len; __i++) {
      topics.add(Serialization.readString(bb));
    }
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Log))
      return false;
    Log other = (Log) o;
    return
      header.equals(other.header) &&
      level == other.level &&
      name.equals(other.name) &&
      msg.equals(other.msg) &&
      file.equals(other.file) &&
      function.equals(other.function) &&
      line == other.line &&
      topics.equals(other.topics) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.header == null ? 0 : this.header.hashCode());
    result = prime * result + this.level;
    result = prime * result + (this.name == null ? 0 : this.name.hashCode());
    result = prime * result + (this.msg == null ? 0 : this.msg.hashCode());
    result = prime * result + (this.file == null ? 0 : this.file.hashCode());
    result = prime * result + (this.function == null ? 0 : this.function.hashCode());
    result = prime * result + (int)(this.line ^ (this.line >>> 32));
    result = prime * result + (this.topics == null ? 0 : this.topics.hashCode());
    return result;
  }
} // class Log

