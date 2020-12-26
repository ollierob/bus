// source: deploy.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

var jspb = require('google-protobuf');
var goog = jspb;
var global = Function('return this')();

var maven_pb = require('./maven_pb.js');
goog.object.extend(proto, maven_pb);
var gitlab_pb = require('./gitlab_pb.js');
goog.object.extend(proto, gitlab_pb);
var jenkins_pb = require('./jenkins_pb.js');
goog.object.extend(proto, jenkins_pb);
goog.exportSymbol('proto.maven.DeployProjectOrFolder', null, global);
goog.exportSymbol('proto.maven.DeploySource', null, global);
goog.exportSymbol('proto.maven.DeploySource.SourceCase', null, global);
goog.exportSymbol('proto.maven.DeploySourceList', null, global);
goog.exportSymbol('proto.maven.DeployTarget', null, global);
goog.exportSymbol('proto.maven.MultiDeploySource', null, global);
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.maven.DeploySource = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, proto.maven.DeploySource.oneofGroups_);
};
goog.inherits(proto.maven.DeploySource, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.maven.DeploySource.displayName = 'proto.maven.DeploySource';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.maven.DeploySourceList = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.maven.DeploySourceList.repeatedFields_, null);
};
goog.inherits(proto.maven.DeploySourceList, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.maven.DeploySourceList.displayName = 'proto.maven.DeploySourceList';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.maven.MultiDeploySource = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.maven.MultiDeploySource.repeatedFields_, null);
};
goog.inherits(proto.maven.MultiDeploySource, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.maven.MultiDeploySource.displayName = 'proto.maven.MultiDeploySource';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.maven.DeployTarget = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.maven.DeployTarget, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.maven.DeployTarget.displayName = 'proto.maven.DeployTarget';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.maven.DeployProjectOrFolder = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.maven.DeployProjectOrFolder, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.maven.DeployProjectOrFolder.displayName = 'proto.maven.DeployProjectOrFolder';
}

/**
 * Oneof group definitions for this message. Each group defines the field
 * numbers belonging to that group. When of these fields' value is set, all
 * other fields in the group are cleared. During deserialization, if multiple
 * fields are encountered for a group, only the last value seen will be kept.
 * @private {!Array<!Array<number>>}
 * @const
 */
proto.maven.DeploySource.oneofGroups_ = [[1,2,3,4]];

/**
 * @enum {number}
 */
proto.maven.DeploySource.SourceCase = {
  SOURCE_NOT_SET: 0,
  MAVEN: 1,
  GITLAB: 2,
  JENKINS: 3,
  MULTI: 4
};

/**
 * @return {proto.maven.DeploySource.SourceCase}
 */
proto.maven.DeploySource.prototype.getSourceCase = function() {
  return /** @type {proto.maven.DeploySource.SourceCase} */(jspb.Message.computeOneofCase(this, proto.maven.DeploySource.oneofGroups_[0]));
};



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.maven.DeploySource.prototype.toObject = function(opt_includeInstance) {
  return proto.maven.DeploySource.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.maven.DeploySource} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.maven.DeploySource.toObject = function(includeInstance, msg) {
  var f, obj = {
    maven: (f = msg.getMaven()) && maven_pb.MavenDeploySource.toObject(includeInstance, f),
    gitlab: (f = msg.getGitlab()) && gitlab_pb.GitlabBuildSource.toObject(includeInstance, f),
    jenkins: (f = msg.getJenkins()) && jenkins_pb.JenkinsBuildSource.toObject(includeInstance, f),
    multi: (f = msg.getMulti()) && proto.maven.MultiDeploySource.toObject(includeInstance, f)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.maven.DeploySource}
 */
proto.maven.DeploySource.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.maven.DeploySource;
  return proto.maven.DeploySource.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.maven.DeploySource} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.maven.DeploySource}
 */
proto.maven.DeploySource.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new maven_pb.MavenDeploySource;
      reader.readMessage(value,maven_pb.MavenDeploySource.deserializeBinaryFromReader);
      msg.setMaven(value);
      break;
    case 2:
      var value = new gitlab_pb.GitlabBuildSource;
      reader.readMessage(value,gitlab_pb.GitlabBuildSource.deserializeBinaryFromReader);
      msg.setGitlab(value);
      break;
    case 3:
      var value = new jenkins_pb.JenkinsBuildSource;
      reader.readMessage(value,jenkins_pb.JenkinsBuildSource.deserializeBinaryFromReader);
      msg.setJenkins(value);
      break;
    case 4:
      var value = new proto.maven.MultiDeploySource;
      reader.readMessage(value,proto.maven.MultiDeploySource.deserializeBinaryFromReader);
      msg.setMulti(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.maven.DeploySource.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.maven.DeploySource.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.maven.DeploySource} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.maven.DeploySource.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMaven();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      maven_pb.MavenDeploySource.serializeBinaryToWriter
    );
  }
  f = message.getGitlab();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      gitlab_pb.GitlabBuildSource.serializeBinaryToWriter
    );
  }
  f = message.getJenkins();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      jenkins_pb.JenkinsBuildSource.serializeBinaryToWriter
    );
  }
  f = message.getMulti();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.maven.MultiDeploySource.serializeBinaryToWriter
    );
  }
};


/**
 * optional MavenDeploySource maven = 1;
 * @return {?proto.maven.MavenDeploySource}
 */
proto.maven.DeploySource.prototype.getMaven = function() {
  return /** @type{?proto.maven.MavenDeploySource} */ (
    jspb.Message.getWrapperField(this, maven_pb.MavenDeploySource, 1));
};


/**
 * @param {?proto.maven.MavenDeploySource|undefined} value
 * @return {!proto.maven.DeploySource} returns this
*/
proto.maven.DeploySource.prototype.setMaven = function(value) {
  return jspb.Message.setOneofWrapperField(this, 1, proto.maven.DeploySource.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.maven.DeploySource} returns this
 */
proto.maven.DeploySource.prototype.clearMaven = function() {
  return this.setMaven(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.maven.DeploySource.prototype.hasMaven = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional GitlabBuildSource gitlab = 2;
 * @return {?proto.maven.GitlabBuildSource}
 */
proto.maven.DeploySource.prototype.getGitlab = function() {
  return /** @type{?proto.maven.GitlabBuildSource} */ (
    jspb.Message.getWrapperField(this, gitlab_pb.GitlabBuildSource, 2));
};


/**
 * @param {?proto.maven.GitlabBuildSource|undefined} value
 * @return {!proto.maven.DeploySource} returns this
*/
proto.maven.DeploySource.prototype.setGitlab = function(value) {
  return jspb.Message.setOneofWrapperField(this, 2, proto.maven.DeploySource.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.maven.DeploySource} returns this
 */
proto.maven.DeploySource.prototype.clearGitlab = function() {
  return this.setGitlab(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.maven.DeploySource.prototype.hasGitlab = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional JenkinsBuildSource jenkins = 3;
 * @return {?proto.maven.JenkinsBuildSource}
 */
proto.maven.DeploySource.prototype.getJenkins = function() {
  return /** @type{?proto.maven.JenkinsBuildSource} */ (
    jspb.Message.getWrapperField(this, jenkins_pb.JenkinsBuildSource, 3));
};


/**
 * @param {?proto.maven.JenkinsBuildSource|undefined} value
 * @return {!proto.maven.DeploySource} returns this
*/
proto.maven.DeploySource.prototype.setJenkins = function(value) {
  return jspb.Message.setOneofWrapperField(this, 3, proto.maven.DeploySource.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.maven.DeploySource} returns this
 */
proto.maven.DeploySource.prototype.clearJenkins = function() {
  return this.setJenkins(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.maven.DeploySource.prototype.hasJenkins = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional MultiDeploySource multi = 4;
 * @return {?proto.maven.MultiDeploySource}
 */
proto.maven.DeploySource.prototype.getMulti = function() {
  return /** @type{?proto.maven.MultiDeploySource} */ (
    jspb.Message.getWrapperField(this, proto.maven.MultiDeploySource, 4));
};


/**
 * @param {?proto.maven.MultiDeploySource|undefined} value
 * @return {!proto.maven.DeploySource} returns this
*/
proto.maven.DeploySource.prototype.setMulti = function(value) {
  return jspb.Message.setOneofWrapperField(this, 4, proto.maven.DeploySource.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.maven.DeploySource} returns this
 */
proto.maven.DeploySource.prototype.clearMulti = function() {
  return this.setMulti(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.maven.DeploySource.prototype.hasMulti = function() {
  return jspb.Message.getField(this, 4) != null;
};



/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.maven.DeploySourceList.repeatedFields_ = [1];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.maven.DeploySourceList.prototype.toObject = function(opt_includeInstance) {
  return proto.maven.DeploySourceList.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.maven.DeploySourceList} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.maven.DeploySourceList.toObject = function(includeInstance, msg) {
  var f, obj = {
    sourceList: jspb.Message.toObjectList(msg.getSourceList(),
    proto.maven.DeploySource.toObject, includeInstance)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.maven.DeploySourceList}
 */
proto.maven.DeploySourceList.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.maven.DeploySourceList;
  return proto.maven.DeploySourceList.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.maven.DeploySourceList} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.maven.DeploySourceList}
 */
proto.maven.DeploySourceList.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.maven.DeploySource;
      reader.readMessage(value,proto.maven.DeploySource.deserializeBinaryFromReader);
      msg.addSource(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.maven.DeploySourceList.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.maven.DeploySourceList.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.maven.DeploySourceList} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.maven.DeploySourceList.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSourceList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.maven.DeploySource.serializeBinaryToWriter
    );
  }
};


/**
 * repeated DeploySource source = 1;
 * @return {!Array<!proto.maven.DeploySource>}
 */
proto.maven.DeploySourceList.prototype.getSourceList = function() {
  return /** @type{!Array<!proto.maven.DeploySource>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.maven.DeploySource, 1));
};


/**
 * @param {!Array<!proto.maven.DeploySource>} value
 * @return {!proto.maven.DeploySourceList} returns this
*/
proto.maven.DeploySourceList.prototype.setSourceList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.maven.DeploySource=} opt_value
 * @param {number=} opt_index
 * @return {!proto.maven.DeploySource}
 */
proto.maven.DeploySourceList.prototype.addSource = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.maven.DeploySource, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.maven.DeploySourceList} returns this
 */
proto.maven.DeploySourceList.prototype.clearSourceList = function() {
  return this.setSourceList([]);
};



/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.maven.MultiDeploySource.repeatedFields_ = [2];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.maven.MultiDeploySource.prototype.toObject = function(opt_includeInstance) {
  return proto.maven.MultiDeploySource.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.maven.MultiDeploySource} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.maven.MultiDeploySource.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, ""),
    sourceList: jspb.Message.toObjectList(msg.getSourceList(),
    proto.maven.DeploySource.toObject, includeInstance)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.maven.MultiDeploySource}
 */
proto.maven.MultiDeploySource.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.maven.MultiDeploySource;
  return proto.maven.MultiDeploySource.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.maven.MultiDeploySource} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.maven.MultiDeploySource}
 */
proto.maven.MultiDeploySource.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setId(value);
      break;
    case 2:
      var value = new proto.maven.DeploySource;
      reader.readMessage(value,proto.maven.DeploySource.deserializeBinaryFromReader);
      msg.addSource(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.maven.MultiDeploySource.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.maven.MultiDeploySource.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.maven.MultiDeploySource} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.maven.MultiDeploySource.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getSourceList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.maven.DeploySource.serializeBinaryToWriter
    );
  }
};


/**
 * optional string id = 1;
 * @return {string}
 */
proto.maven.MultiDeploySource.prototype.getId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.maven.MultiDeploySource} returns this
 */
proto.maven.MultiDeploySource.prototype.setId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated DeploySource source = 2;
 * @return {!Array<!proto.maven.DeploySource>}
 */
proto.maven.MultiDeploySource.prototype.getSourceList = function() {
  return /** @type{!Array<!proto.maven.DeploySource>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.maven.DeploySource, 2));
};


/**
 * @param {!Array<!proto.maven.DeploySource>} value
 * @return {!proto.maven.MultiDeploySource} returns this
*/
proto.maven.MultiDeploySource.prototype.setSourceList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.maven.DeploySource=} opt_value
 * @param {number=} opt_index
 * @return {!proto.maven.DeploySource}
 */
proto.maven.MultiDeploySource.prototype.addSource = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.maven.DeploySource, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.maven.MultiDeploySource} returns this
 */
proto.maven.MultiDeploySource.prototype.clearSourceList = function() {
  return this.setSourceList([]);
};





if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.maven.DeployTarget.prototype.toObject = function(opt_includeInstance) {
  return proto.maven.DeployTarget.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.maven.DeployTarget} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.maven.DeployTarget.toObject = function(includeInstance, msg) {
  var f, obj = {

  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.maven.DeployTarget}
 */
proto.maven.DeployTarget.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.maven.DeployTarget;
  return proto.maven.DeployTarget.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.maven.DeployTarget} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.maven.DeployTarget}
 */
proto.maven.DeployTarget.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.maven.DeployTarget.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.maven.DeployTarget.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.maven.DeployTarget} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.maven.DeployTarget.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
};





if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.maven.DeployProjectOrFolder.prototype.toObject = function(opt_includeInstance) {
  return proto.maven.DeployProjectOrFolder.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.maven.DeployProjectOrFolder} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.maven.DeployProjectOrFolder.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, ""),
    name: jspb.Message.getFieldWithDefault(msg, 2, ""),
    source: (f = msg.getSource()) && proto.maven.DeploySource.toObject(includeInstance, f),
    target: (f = msg.getTarget()) && proto.maven.DeployTarget.toObject(includeInstance, f)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.maven.DeployProjectOrFolder}
 */
proto.maven.DeployProjectOrFolder.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.maven.DeployProjectOrFolder;
  return proto.maven.DeployProjectOrFolder.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.maven.DeployProjectOrFolder} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.maven.DeployProjectOrFolder}
 */
proto.maven.DeployProjectOrFolder.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 3:
      var value = new proto.maven.DeploySource;
      reader.readMessage(value,proto.maven.DeploySource.deserializeBinaryFromReader);
      msg.setSource(value);
      break;
    case 4:
      var value = new proto.maven.DeployTarget;
      reader.readMessage(value,proto.maven.DeployTarget.deserializeBinaryFromReader);
      msg.setTarget(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.maven.DeployProjectOrFolder.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.maven.DeployProjectOrFolder.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.maven.DeployProjectOrFolder} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.maven.DeployProjectOrFolder.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getSource();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.maven.DeploySource.serializeBinaryToWriter
    );
  }
  f = message.getTarget();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.maven.DeployTarget.serializeBinaryToWriter
    );
  }
};


/**
 * optional string id = 1;
 * @return {string}
 */
proto.maven.DeployProjectOrFolder.prototype.getId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.maven.DeployProjectOrFolder} returns this
 */
proto.maven.DeployProjectOrFolder.prototype.setId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string name = 2;
 * @return {string}
 */
proto.maven.DeployProjectOrFolder.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.maven.DeployProjectOrFolder} returns this
 */
proto.maven.DeployProjectOrFolder.prototype.setName = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional DeploySource source = 3;
 * @return {?proto.maven.DeploySource}
 */
proto.maven.DeployProjectOrFolder.prototype.getSource = function() {
  return /** @type{?proto.maven.DeploySource} */ (
    jspb.Message.getWrapperField(this, proto.maven.DeploySource, 3));
};


/**
 * @param {?proto.maven.DeploySource|undefined} value
 * @return {!proto.maven.DeployProjectOrFolder} returns this
*/
proto.maven.DeployProjectOrFolder.prototype.setSource = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.maven.DeployProjectOrFolder} returns this
 */
proto.maven.DeployProjectOrFolder.prototype.clearSource = function() {
  return this.setSource(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.maven.DeployProjectOrFolder.prototype.hasSource = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional DeployTarget target = 4;
 * @return {?proto.maven.DeployTarget}
 */
proto.maven.DeployProjectOrFolder.prototype.getTarget = function() {
  return /** @type{?proto.maven.DeployTarget} */ (
    jspb.Message.getWrapperField(this, proto.maven.DeployTarget, 4));
};


/**
 * @param {?proto.maven.DeployTarget|undefined} value
 * @return {!proto.maven.DeployProjectOrFolder} returns this
*/
proto.maven.DeployProjectOrFolder.prototype.setTarget = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.maven.DeployProjectOrFolder} returns this
 */
proto.maven.DeployProjectOrFolder.prototype.clearTarget = function() {
  return this.setTarget(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.maven.DeployProjectOrFolder.prototype.hasTarget = function() {
  return jspb.Message.getField(this, 4) != null;
};


goog.object.extend(exports, proto.maven);
