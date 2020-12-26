// source: repository.proto
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
goog.exportSymbol('proto.maven.Repository', null, global);
goog.exportSymbol('proto.maven.Repository.RepoCase', null, global);
goog.exportSymbol('proto.maven.RepositoryList', null, global);
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
proto.maven.Repository = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, proto.maven.Repository.oneofGroups_);
};
goog.inherits(proto.maven.Repository, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.maven.Repository.displayName = 'proto.maven.Repository';
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
proto.maven.RepositoryList = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.maven.RepositoryList.repeatedFields_, null);
};
goog.inherits(proto.maven.RepositoryList, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.maven.RepositoryList.displayName = 'proto.maven.RepositoryList';
}

/**
 * Oneof group definitions for this message. Each group defines the field
 * numbers belonging to that group. When of these fields' value is set, all
 * other fields in the group are cleared. During deserialization, if multiple
 * fields are encountered for a group, only the last value seen will be kept.
 * @private {!Array<!Array<number>>}
 * @const
 */
proto.maven.Repository.oneofGroups_ = [[2]];

/**
 * @enum {number}
 */
proto.maven.Repository.RepoCase = {
  REPO_NOT_SET: 0,
  MAVEN: 2
};

/**
 * @return {proto.maven.Repository.RepoCase}
 */
proto.maven.Repository.prototype.getRepoCase = function() {
  return /** @type {proto.maven.Repository.RepoCase} */(jspb.Message.computeOneofCase(this, proto.maven.Repository.oneofGroups_[0]));
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
proto.maven.Repository.prototype.toObject = function(opt_includeInstance) {
  return proto.maven.Repository.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.maven.Repository} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.maven.Repository.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, ""),
    maven: (f = msg.getMaven()) && maven_pb.MavenRepository.toObject(includeInstance, f)
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
 * @return {!proto.maven.Repository}
 */
proto.maven.Repository.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.maven.Repository;
  return proto.maven.Repository.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.maven.Repository} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.maven.Repository}
 */
proto.maven.Repository.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = new maven_pb.MavenRepository;
      reader.readMessage(value,maven_pb.MavenRepository.deserializeBinaryFromReader);
      msg.setMaven(value);
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
proto.maven.Repository.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.maven.Repository.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.maven.Repository} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.maven.Repository.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getMaven();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      maven_pb.MavenRepository.serializeBinaryToWriter
    );
  }
};


/**
 * optional string id = 1;
 * @return {string}
 */
proto.maven.Repository.prototype.getId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.maven.Repository} returns this
 */
proto.maven.Repository.prototype.setId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional MavenRepository maven = 2;
 * @return {?proto.maven.MavenRepository}
 */
proto.maven.Repository.prototype.getMaven = function() {
  return /** @type{?proto.maven.MavenRepository} */ (
    jspb.Message.getWrapperField(this, maven_pb.MavenRepository, 2));
};


/**
 * @param {?proto.maven.MavenRepository|undefined} value
 * @return {!proto.maven.Repository} returns this
*/
proto.maven.Repository.prototype.setMaven = function(value) {
  return jspb.Message.setOneofWrapperField(this, 2, proto.maven.Repository.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.maven.Repository} returns this
 */
proto.maven.Repository.prototype.clearMaven = function() {
  return this.setMaven(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.maven.Repository.prototype.hasMaven = function() {
  return jspb.Message.getField(this, 2) != null;
};



/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.maven.RepositoryList.repeatedFields_ = [1];



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
proto.maven.RepositoryList.prototype.toObject = function(opt_includeInstance) {
  return proto.maven.RepositoryList.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.maven.RepositoryList} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.maven.RepositoryList.toObject = function(includeInstance, msg) {
  var f, obj = {
    repositoryList: jspb.Message.toObjectList(msg.getRepositoryList(),
    proto.maven.Repository.toObject, includeInstance)
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
 * @return {!proto.maven.RepositoryList}
 */
proto.maven.RepositoryList.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.maven.RepositoryList;
  return proto.maven.RepositoryList.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.maven.RepositoryList} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.maven.RepositoryList}
 */
proto.maven.RepositoryList.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.maven.Repository;
      reader.readMessage(value,proto.maven.Repository.deserializeBinaryFromReader);
      msg.addRepository(value);
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
proto.maven.RepositoryList.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.maven.RepositoryList.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.maven.RepositoryList} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.maven.RepositoryList.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRepositoryList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.maven.Repository.serializeBinaryToWriter
    );
  }
};


/**
 * repeated Repository repository = 1;
 * @return {!Array<!proto.maven.Repository>}
 */
proto.maven.RepositoryList.prototype.getRepositoryList = function() {
  return /** @type{!Array<!proto.maven.Repository>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.maven.Repository, 1));
};


/**
 * @param {!Array<!proto.maven.Repository>} value
 * @return {!proto.maven.RepositoryList} returns this
*/
proto.maven.RepositoryList.prototype.setRepositoryList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.maven.Repository=} opt_value
 * @param {number=} opt_index
 * @return {!proto.maven.Repository}
 */
proto.maven.RepositoryList.prototype.addRepository = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.maven.Repository, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.maven.RepositoryList} returns this
 */
proto.maven.RepositoryList.prototype.clearRepositoryList = function() {
  return this.setRepositoryList([]);
};


goog.object.extend(exports, proto.maven);
